var app = (() => {
    let init = () => {
        login_form()
    }

    let login_form = () => {

        let wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML = '<form action="/action_page.php">'
            + '  아이디:<br>'
            + '  <input type="text" name="loginid">'
            + '  <br>'
            + '  비밀번호:<br>'
            + '  <input type="password" name="loginpasswd">'
            + '  <br><br>'
            + '  <input type="button" value="로그인">'
            + '  <input id="sign" type="button" value="회원가입">'
            + '</form>';


        let btn = document.querySelector('#sign');

        btn.addEventListener('click', () => {
            signup_form();
        });
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