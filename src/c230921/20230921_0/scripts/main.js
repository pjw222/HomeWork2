// var num = 1;
// var str ="abcd";
// console.log(num);

// dddd = 1234;
// console.log(dddd);

// let number = 1;
// number = 2;

// console.log("변수 numaber",number);

// const MAXNUMBER = 1;
// console.log(MAXNUMBER);

// let value = prompt("입력해라");
// console.log(value);
// alert(1);

// const number = 1;
// const number2 = 2;

// console.log(5 === "5");
// // == : 데이터를 비교하는데 형변환해서 값을 매기고 true false 를 반환
// // === : 데이터 를 비교할때 형변환을 제외하고 값을 매기고 true false 를 반환

let score = 10;

let b = 100;

if(score == 10)
{
    let a = 50;
    if (a == 50)
    {
        a = 10;
        b = 200;
        console.log(a);
        console.log(b);
    }
}

//원시 타입
//숫자 타입, 문자열, 불리언, unedfind, null
//객체 타입
//객체, 함수, 배열...

//if, for, switch, while...

for (let i = 0; i < 5; i++) {
    for (let j = 0; j <= i; j++) {
        document.write("* &nbsp");
    }
    window.document.write("<br>");
}

// 1. 함수 선언문
function sum(x,y) {
    return x + y ;
};
// 2. 함수 표현식
let res = function sum(x,y) {
    return x + y;
};
// 3. Function 생성자 함수
let res1 = new Function("x", "y", "return x+y");

// 4. 화살표 함수
let res3 = (x,y) => x + y
// 상황에따라서 화살표 함수를 쓰거나 선언문이나 표현식을 쓴다.

