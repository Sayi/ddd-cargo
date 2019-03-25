// global variable


function getParameterByName(name, url) {
    if (!url) url = window.location.href;
    name = name.replace(/[\[\]]/g, '\\$&');
    var regex = new RegExp('[?&]' + name + '(=([^&#]*)|&|#|$)'),
        results = regex.exec(url);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, ' '));
}

function getLocation(func) {
    var xmlhttp = new XMLHttpRequest();
    var url = "/routing/location";
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
    xmlhttp.onreadystatechange = function () {
        func(xmlhttp);
    }
}

function getCarrier(func) {
    var xmlhttp = new XMLHttpRequest();
    var url = "/routing/carrier";
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
    xmlhttp.onreadystatechange = function () {
        func(xmlhttp);
    }
}

function getCargo(cargoId, func) {
    var xmlhttp = new XMLHttpRequest();
    var url = "/cargo/" + cargoId;
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
    xmlhttp.onreadystatechange = function () {
        func(xmlhttp);
    }
}

function getCargoEvent(cargoId, func) {
    var xmlhttp = new XMLHttpRequest();
    var url = "/track/" + cargoId;
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
    xmlhttp.onreadystatechange = function () {
        func(xmlhttp);
    }
}


