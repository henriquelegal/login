let time1,time2,gols1,gols2,resposta

time1=prompt("Digite o nome do time 1")
time2=prompt("Digite o nome do time 2")
gols1=parseFloat(prompt("Digite o numero de gols do time 1"))
gols2=parseFloat(prompt("Digite o numero de gols do time 2"))

if(gols1>gols2){
    placar="O "+time1+" ganhou de "+gols1+"X"+gols2+"do "+time2
} else if(gols2<gols1){
    placar="O "+time2+" ganhou de "+gols2+"X"+gols1+"do "+time1
}
