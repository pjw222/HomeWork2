
// let title = document.getElementById("main-title");
// console.log(title);

// let sp = document.getElementsByTagName("span");
// console.log(sp);

// let spClass = document.getElementsByClassName("span-class");
// console.log(spClass);

let getName = document.querySelectorAll(".Name");
console.log(getName[0]);

let getLi = document.querySelector(".m1");

console.log(getLi);

getLi.innerHTML = "변경";
getLi.className = "m2";

/*
 브라우저 렌더링 과정
 DOM(도큐먼트 오브젝트 모델)
 BOM(브라우저 오브젝트 모델)
 웹브라우저 동작원리를 알수있게된다.

 var, let, const  차이 알아두면 좋음 프론트에 관심이 생기면
 함수, 레벨.. 스코프 영역에 관한 것 공부 변수들의 생명주기

*/