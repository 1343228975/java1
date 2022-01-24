var name;
var phone;
var email;


var nameMsg;
var phoneMsg;
var emailMsg;

window.onload = function() {   // 页面加载之后, 获取页面中的对象
    nameObj = document.getElementById("name");
    phoneObj = document.getElementById("phone");
    emailObj = document.getElementById("email");


    emailMsg = document.getElementById("emailMsg");
    nameMsg = document.getElementById("nameMsg");
    phoneMsg = document.getElementById("phoneMsg");

};

function checkForm() {       // 验证整个表单
    var bemail = checkEmail();
    var bname = checkname();
    var bphone = checkphone();

    return bemail&&bname&&bphone ;  // return false后, 事件将被取消
}

function checkEmail() {          // 验证邮箱
    var regex = /^[\w-]+@([\w-]+\.)+[a-zA-Z]{2,4}$/;
    var value =emailObj.value;
    var msg = "";
    if (!value)
        msg = "邮箱必须填写：";
    else if (!regex.test(value))
        msg = "邮箱格式不合法";
    emailMsg.innerHTML = msg;
    emailObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
    return msg == "";

}

function checkname() {    // 验证用户名

    var msg = "";                 // 最后的提示消息, 默认为空

    return msg == "";              // 如果提示消息为空则代表没出错, 返回true
}

function checkphone() {    // 验证密码
  ;         // 任意字符, 6到16位

    var msg = "";

    return msg == "";
}

