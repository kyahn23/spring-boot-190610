alert('자바스크립트 연결 성공!!');

var wrapper = document.querySelector('#wrapper');
wrapper.innerHTML = '<h1>SPA 시작</h1>'
+'<div id="del">삭제할 내용</div>'
+'<button id="btn">지워버리자</button>'
+'<button id="btn2">추가하자</button>';


var btn = document.querySelector('#btn');
var btn2 = document.querySelector('#btn2');
// var temp = document.querySelector('#del');
btn.addEventListener('click',function(){
    document.querySelector('#del').innerHTML = "";
    // temp.innerHTML = "";
});
btn2.addEventListener('click',function(){
    var addtext = document.createTextNode('새로추가됨');
    document.querySelector('#del').appendChild(addtext);
})