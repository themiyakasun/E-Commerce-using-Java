function loadContent(page, clickedButton) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            document.getElementById("page-content").innerHTML = this.responseText;
            
            var links = document.querySelectorAll('#side-link');
            links.forEach(function(link) {
                link.classList.remove('active');
            });
            if (clickedButton.classList.contains("process-element")) {
                clickedButton.classList.add("active");
                var prevButton = clickedButton.previousElementSibling;
                while (prevButton) {
                    prevButton.classList.remove("active");
                    prevButton = prevButton.previousElementSibling;
                }
            }
            
        }
    };
    
    xhttp.open("GET", page, true);
    xhttp.send();
};

