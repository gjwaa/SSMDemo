$(function (){
    $("#regis").click(function (){

        $.post({
            url:"/opt?action=regis",
            data: {
                "acc":$("#acc").val(),
                "pwd":$("#pwd").val()
            },
            dataType:"text",
            success:function (data){
                if (data=="ok"){
                    alert("aaaaaaaa")
                }
            }
        })
    })
})