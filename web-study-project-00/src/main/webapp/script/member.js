function loginCheck() {
    if (document.frm.userid.value.length == 0) {
        alert("아이디를 입력하세요");
        document.frm.userid.focus();
        return false;
    }
    if (document.frm.pass.value.length == 0) {
        alert("비밀번호를 입력하세요");
        document.frm.pass.focus();
        return false;
    }
    return true;
}

function idCheck() {
    let userid = document.frm.userid.value;

    if (userid === "") {
        alert("아이디를 입력하세요!");
        document.frm.userid.focus();
        return;
    }

    // 새창 안 띄우고 같은 페이지에서 결과 표시
    location.href = "MemberServlet?command=idCheck&userid=" + userid;
}


function joinCheck() {
    if (document.frm.name.value.length == 0) {
        alert("이름을 입력하세요");
        document.frm.name.focus();
        return false;
    }

    if (document.frm.userid.value.length == 0) {
        alert("아이디를 입력하세요");
        document.frm.userid.focus();
        return false;
    }

    if (document.frm.userid.value.length < 3) {
        alert("아이디는 3글자 이상이어야 합니다.");
        document.frm.userid.focus();
        return false;
    }

    if (document.frm.pass.value.length == 0) {
        alert("비밀번호를 입력하세요");
        document.frm.pass.focus();
        return false;
    }

    return true;
}
