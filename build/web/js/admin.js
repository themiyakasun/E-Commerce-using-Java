function addCategory(){
    var formData = $("#categoryForm").serialize();
    
    $.ajax({
        type: "POST",
        url: contextPath + "/AddCategoryServlet",
        data: formData,
        success: function(response) {
            $("#loadingIndicator").hide();
            alert(response);
        }
    });
    return false;
}

$(document).ready(function() {
    function fetchCategories() {
    $.ajax({
        url: contextPath + '/CategoriesServlet',
        type: 'GET',
        dataType: 'json',
        success: function(categories) {
            var tbody = $('#categoriesTableBody');
            tbody.empty(); 
            
            if (categories.length === 0) {
                tbody.append('<tr><td colspan="5" class="text-center">No categories available</td></tr>');
            } else {
                $.each(categories, function(index, category) {
                    var row = $('<tr>').addClass('category-row').attr('data-cat-id', category.catId);
                    row.append($('<td>').addClass('cat-id').text(category.catId));
                    row.append($('<td>').addClass('cat-name').text(category.catName));
                    row.append($('<td>').addClass('cat-slug').text(category.catSlug));
                    row.append($('<td>').addClass('cat-order').text(category.catOrder));
                    row.append($('<td>').addClass('action').html(
                        '<div class="d-flex align-items-center gap-3 fs-6">' +
                        '<button class="text-warning edit-info" data-bs-toggle="tooltip" data-bs-placement="bottom" title="Edit info" aria-label="Edit" onclick="editCategory(' + category.catId + ')"><img src="../assets/icons/edit.png"/></button>' +
                        '<button class="text-danger delete-category" data-bs-toggle="tooltip" data-bs-placement="bottom" title="Delete" aria-label="Delete" onclick="deleteCategory(' + category.catId + ')"><img src="../assets/icons/trash.png"/></button>' +
                        '</div>'
                    ));
                    tbody.append(row);
                });
            }
        },
        error: function() {
            alert('Error fetching categories.');
        }
    });
}
    fetchCategories();
});

var editMode = false;

function switchMode(catId) {
    editMode = !editMode;
    var buttonText = editMode ? "Edit Category" : "Add Category";
    var onClickFunction = editMode ? "updateCategory()" : "addCategory()";
    $("#catBtn").text(buttonText).attr("onclick", onClickFunction);
}

function editCategory(catId) {
    $.ajax({
        url: contextPath + '/GetCategoryServlet',
        type: 'GET',
        data: { catId: catId },
        dataType: 'json',
        success: function(category) {
            console.log(category);
            var catId = category[0].catId;
            var catName = category[0].catName;
            var catSlug = category[0].catSlug;
            $('#catId').val(catId);
            $('#catName').val(catName);
            $('#catSlug').val(catSlug);
            switchMode(catId);
        },
        error: function() {
            alert('Error fetching category data.');
        }
    });
}


function updateCategory(){
    var formData = $("#categoryForm").serialize();
    
    $.ajax({
        type: "POST",
        url: contextPath + "/UpdateCategoryServlet",
        data: formData,
        success: function(response) {
            $("#loadingIndicator").hide();
            alert(response);
        }
    });
    return false;
}


function deleteCategory(catId){
    $.ajax({
        url: contextPath + '/RemoveCategoryServlet',
        type: 'POST',
        data: {catId: catId},
        success: function(response){
            alert(response);
            location.reload();
            
        },
        error: function(){
            alert("Error Deleting category");
        }
    })
}

