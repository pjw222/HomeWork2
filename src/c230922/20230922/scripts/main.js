let comScore = 0;
let userScore = 0;
let isComputerTurn = true;
let shotleft=15;

function onComputerShoot(){
    if(!isComputerTurn) return;

    let shootType = Math.random() < 0.5 ? 2 : 3;

    if(shootType === 2){
        if(Math.random()<0.5){
            
            showText("태웅이가 2점슛 성공")
            updateComputerScore(2);
        }
        else{
            showText("태웅이가 2점슛 실패")
        }
        if(Math.random()<0.33){
            
            showText("태웅이가 3점슛 성공")
            updateComputerScore(3);
        }
        else{
           
            showText("태웅이가 3점슛 실패")
        }
    }
    isComputerTurn=false;
     disableComputerButtons(true);
     disableUserButtons(false);
}  
function showText(str){
    const textElem = document.getElementById("text");
    textElem.innerHTML = str;
}
function onUserShoot(shootType)
{
    if(isComputerTurn) return;
    const textElem = document.getElementById("text");
    if(shootType === 2){
        if(Math.random()<0.5){
            showText("백호가 2점슛 성공");
            updateUserScore(2);
        }
        else{
            showText("백호가 2점슛 실패");
        }
    }
    else{
        if(Math.random()<0.33){
            showText("백호가 3점슛 성공");
            updateUserScore(3);
        }
        else{
            showText("백호가 3점슛 실패");
        }
    }
    isComputerTurn = true;
    disableComputerButtons(false);
    disableUserButtons(true);

    shotleft--;

    const shotLeftElem = document.getElementById("shots-left");
    shotLeftElem.innerHTML = shotleft;

    if(shotleft===0){
        if(userScore>comScore) textElem.innerHTML="승리";
        else if(userScore<comScore) textElem.innerHTML="패배";
        else textElem.innerHTML="비김";
        disableComputerButtons(true);
        disableUserButtons(true);
    }
}
function updateComputerScore(score){
    comScore += score;
    const comScoreElem =document.getElementById("computer-score")
    comScoreElem.innerHTML = comScore;
}
function updateUserScore(score){
    userScore += score;
    const userScoreElem =document.getElementById("user-score")
    userScoreElem.innerHTML = userScore;
}
function disableComputerButtons(flag){
    const computerButton=document.getElementsByClassName("btn-computer");
    for (let index = 0; index < computerButton.length; index++) {
        computerButton[index].disabled = flag;
        
    }
}
function disableUserButtons(flag){
    const userButton=document.getElementsByClassName("btn-user");
    for (let index = 0; index < userButton.length; index++) {
        userButton[index].disabled = flag;
        
    }
}