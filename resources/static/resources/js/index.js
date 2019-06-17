var app = (() => {
    let init = () => {
        login_form()
    }

    let login_form = () => {

        let wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML = '<form action="/action_page.php">'
            + '  아이디:<br>'
            + '  <input id="customerId" type="text" name="customerId">'
            + '  <br>'
            + '  비밀번호:<br>'
            + '  <input id="password" type="password" name="password">'
            + '  <br><br>'
            + '  <input id="login" type="button" value="로그인">'
            + '  <input id="sign" type="button" value="회원가입">'
            + '</form>';


        let signbtn = document.querySelector('#sign');
        signbtn.addEventListener('click', () => {
            signup_form();
        });

        let loginbtn = document.querySelector('#login');
        loginbtn.addEventListener('click', () => {
            alert('로그인버튼 클릭');
            id = document.getElementById('customerId');
            pass = document.getElementById('password');
            let xhr = new XMLHttpRequest(),
                method = 'GET',
                url = 'login/' + id.value + '/' + pass.value;
            xhr.open(method, url, true);
            xhr.onreadystatechange = () => {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    let d = xhr.responseText;
                    if (d === 'SUCCESS') {
                        alert('ajax 성공 ' + xhr.responseText);
                        let wrapper = document.querySelector('#wrapper');
                        wrapper.innerHTML = '<h1>마이페이지</h1>'
                            + '  <hr>';
                    } else {
                        id.value = "";
                        pass.value = "";
                        alert('아이디와 비밀번호를 확인');

                    }
                }
            };
            xhr.send();

        });
    }

    let count = () => {
        let xhr = new XMLHttpRequest();
        method = 'get';
        url = 'count';
        xhr.open(method, url, true);
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

    let login = () => {
        let xhr = new XMLHttpRequest();
        method = 'get';
        url = 'login';
        xhr.open(method, url, true);
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


    let signup_form = () => {
        let wrapper = document.querySelector('#wrapper');

        wrapper.innerHTML = '<form action="/action_page.php">'
            + '  아이디:<br>'
            + '  <input type="text" name="userid">'
            + '  <br>'
            + '  비밀번호:<br>'
            + '  <input type="password" name="userpasswd">'
            + '  <br>'
            + '  이름:<br>'
            + '  <input type="text" name="username">'
            + '  <br>'
            + '  생년월일:<br>'
            + '  <input type="date" name="bdate">'
            + '  <br>'
            + '  전화번호:<br>'
            + '  <input type="tel" name="phone">'
            + '  <br><br>'
            + '  <input id="signup" type="button" value="회원가입">'
            + '  <input type="reset" value="취소">'
            + '</form>';

        let btn2 = document.querySelector("#signup");
        btn2.addEventListener('click', () => {
            login_form();
        });
    }

    return {
        init: init
    };
})();