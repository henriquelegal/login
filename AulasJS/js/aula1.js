let nome, nota1, nota2, media,resposta;
nome=prompt("digite o seu nome")
nota1=parseFloat(prompt("digite o sua primeira nota"));
nota2=parseFloat(prompt("digite o sua segunda nota"));
media=(nota1+nota2)/2;

if(media>=7){
    resposta="Aprovado"
}else{
    resposta="Reprovado"
}
alert(`${nome}, sua media e ${media.toFixed(1)}` +` voce esta ${resposta}`)