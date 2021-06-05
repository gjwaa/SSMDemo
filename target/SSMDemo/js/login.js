function changeImg() {
    $("#verifyImg").attr("src", "${ctx}/verify?" + Math.random());
}

function checkFrom() {
    var acc = $("[name='acc']").val();
    var pwd = $("[name='pwd']").val();
    var verify = $("[name='verify']").val();
    if (acc == "" || pwd == "" || verify == "") {
        return false;
    } else {
        return true;
    }
}

$(function (){
    $("#login").click(function (){

        var res = checkFrom()
        if (res==true){
            $.post({
                url:"/opt?action=login",
                data:{
                    "acc":$("[name='acc']").val(),
                    "pwd":$("[name='pwd']").val(),
                    "verify":$("[name='verify']").val()
                },
                dataType:"text",
                success:function (data){
                    if (data=="loginTrue"){
                        alert("登陆成功");
                        $(location).attr('href', '/jsp/index.jsp');
                    }else {
                        alert("登陆失败");
                        $(location).attr('href', '/jsp/login.jsp');
                    }
                }
            })
        }else {
            alert("字段不能为空");
        }


    })






})

