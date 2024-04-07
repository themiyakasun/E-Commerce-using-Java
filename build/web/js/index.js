window.openMobileNav = function() {
    var mobileNav = document.getElementById("mobile-nav");
    mobileNav.classList.add("active");
};
window.closeMobileNav = function() {
    var mobileNav = document.getElementById("mobile-nav");
    mobileNav.classList.remove("active");
};

window.toggleSearch = function(){
    var searchWrapper = document.getElementById("search-wrapper");
    searchWrapper.classList.toggle("active");
};