var app = {
    $wrapper: $wrapper = document.querySelector('#wrapper'),
    init: init,
    mypage: mypage
};

var customer = {
    mypage: mypage,
    login_f: login_f,
    signup_f: signup_f,
    join: join,
    count: count
};


function init() {
    $wrapper.innerHTML = customer.login_f();

    let signbtn = document.querySelector('#sign');
    signbtn.addEventListener('click', () => {
        alert('회원가입 버튼 클릭');
        $wrapper.innerHTML = customer.signup_f();
        document.getElementById('signup').addEventListener('click', () => {

            customer.join();
        });
    });

    let loginbtn = document.querySelector('#login');
    loginbtn.addEventListener('click', () => {
        alert('로그인버튼 클릭');
        id = document.getElementById('customerId');
        pass = document.getElementById('password');

        let xhr = new XMLHttpRequest();
        xhr.open('GET', 'customers/' + id.value + '/' + pass.value, true);
        xhr.setRequestHeader('Content-type', 'application/json;charset=utf-8;')
        xhr.onload = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                if (xhr.responseText) {
                    $wrapper.innerHTML = app.mypage();
                } else {
                    // id.value = "";
                    // pass.value = "";
                    alert('아이디와 비밀번호를 확인');
                    $wrapper.innerHTML = app.login_f();

                }
            }
        };
        xhr.send();
    });
}
function join() {
    let xhr = new XMLHttpRequest();
    let data = {
        customerId: document.getElementById('customerId').value,
        customerName: document.getElementById('customerName').value,
        password: document.getElementById('password').value
    }
    xhr.open('POST', 'customers', true);
    xhr.setRequestHeader('Content-type', 'application/json;charset=UTF-8');

    xhr.onload = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let d = JSON.parse(xhr.responseText);
            alert('결과'+d)
            
            if (d.result ==='SUCCESS') {
                alert('회원가입 성공' + d.result);
                app.init();
            } else {
                alert('회원가입 실패')
            }
            // 로그인 폼이 들어옴

        } else {
            alert('AJAX 실패');
        }
    };

    xhr.send(JSON.stringify(data));
}
function count() {
    let xhr = new XMLHttpRequest();
    xhr.open('get', '/count', true);
    console.log(xhr);
    xhr.onreadystatechange = () => {
        console.log(xhr.readyState);
        if (xhr.readyState == 4 && xhr.status === 200) {
            alert('성공');
            let wrapper = document.querySelector('#wrapper');
            wrapper.innerHTML = '총 고객수 : <h1>' + xhr.responseText + '</h1>';
        }
    }
    xhr.send();
}

function login() {
    let xhr = new XMLHttpRequest();
    method = 'get';
    url = 'login';
    xhr.open(method, url, true);
    xhr.onreadystatechange = () => {
        console.log(xhr.readyState);
        if (xhr.readyState == 4 && xhr.status === 200) {
            alert('성공');
            let wrapper = document.querySelector('#wrapper');
            wrapper.innerHTML = '총 고객수 : <h1>' + xhr.responseText + '</h1>';
        }
    }
    xhr.send();
}



function mypage() {
    return '<h1>마이페이지</h1>';
};


function btn(name) {
    return '<input id="'+name+'" type="text" name="'+name+'">'
}
function login_f() {
    return '<form action="/action_page.php">'
        + '  아이디:<br>'
        + '  <input id="customerId" type="text" name="customerId">'
        + '  <br>'
        + '  비밀번호:<br>'
        + '  <input id="password" type="password" name="password">'
        + '  <br><br>'
        + '  <input id="login" type="button" value="로그인">'
        + '  <input id="sign" type="button" value="회원가입">'
        + '</form>';
};

function signup_f() {
    return '<form action="/action_page.php">'
        + '  아이디:<br>'
        + '  <input type="text" id="customerId" name="userid">'
        + '  <br>'
        + '  비밀번호:<br>'
        + '  <input type="password" id="password" name="userpasswd">'
        + '  <br>'
        + '  이름:<br>'
        + '  <input type="text" id="customerName" name="username">'
        + '  <br>'
        + '  <input id="signup" type="button" value="회원가입">'
        + '  <input type="reset" value="취소">'
        + '</form>';

};