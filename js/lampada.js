
document.getElementById("lampada").addEventListener("lampadaacesa", lampadaEmCima) ;
document.getElementById("lampada").addEventListener("lampadaapagada",lampaEmAbaixo);

function lampadaEmCima(){
    let elemento = document.getElementById("lampada");

    elemento.style.cursor = "hand";
    elemento.style.backgroundColor = "cyan";
    elemento.innerHTML = "lampadaacesa";
}

function lampaEmAbaixo(){

    let elemento = document.getElementById("lampada");

    elemento.style.backgroundColor = "purple";
    elemento.innerHTML = "lampadaapagada";
}