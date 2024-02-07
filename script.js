function opensignupPopup() {
    var signupPopup = document.getElementById('signup');
    signupPopup.style.display = 'block';
}

function opensigninPopup() {
    var signinPopup = document.getElementById('signin');
    signinPopup.style.display = 'block';
}

window.onclick = function(event) {
    var signupPopup = document.getElementById('signup');
    var signinPopup = document.getElementById('signin');

    // Close signup popup if clicked outside
    if (event.target === signupPopup) {
        signupPopup.style.display = 'none';
    }

    // Close signin popup if clicked outside
    if (event.target === signinPopup) {
        signinPopup.style.display = 'none';
    }
};

function navigateToPage() {
    // Use relative path or provide the correct path to upload.html
    window.location.href = "upload.html";
}

