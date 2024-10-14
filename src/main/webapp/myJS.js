window.onload = customize;

function customize() {
    window.document.getElementById('div3').style.display = 'none';
}

// Function to convert text to uppercase
function convertNumber() {
    window.document.getElementById('div3').style.display = 'none';
    var inputText = document.getElementById('t1').value;
    var q_str = 'type=uppercase&value=' + encodeURIComponent(inputText); // Ensure text is encoded
    doAjax('TC_servlet', q_str, 'convertNumber_back', 'post', 0);
}

// Callback function for uppercase conversion
function convertNumber_back(result) {
    if (result.substring(0, 5) === 'error') {
        window.document.getElementById('div3').style.display = 'block';
        window.document.getElementById('div3').innerHTML = "<p style='color:red;'><b>" + result.substring(6) + "</b></p>";
    } else {
        window.document.getElementById('t2').value = "" + result; // Set the result in the upper case field
    }
}

// Function to convert text to lowercase
function convertPrice() {
    window.document.getElementById('div3').style.display = 'none';
    var inputText = document.getElementById('t3').value;
    var q_str = 'type=lowercase&value=' + encodeURIComponent(inputText); // Ensure text is encoded
    doAjax('TC_servlet', q_str, 'convertPrice_back', 'post', 0);
}

// Callback function for lowercase conversion
function convertPrice_back(result) {
    if (result.substring(0, 5) === 'error') {
        window.document.getElementById('div3').style.display = 'block';
        window.document.getElementById('div3').innerHTML = "<p style='color:red;'><b>" + result.substring(6) + "</b></p>";
    } else {
        window.document.getElementById('t4').value = "" + result; // Set the result in the lower case field
    }
}