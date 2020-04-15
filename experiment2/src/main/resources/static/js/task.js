$(document).ready(function() {
    $('button#btn').click(function(){
        $.ajax({
            url: "http://localhost:8080/task/"+$(" input[ type='text' ] ").val(),
            type:"get",
            dataType:"json",
            success:function (data) {
                var str="";
                for(var i=0;i<data.length;i++)
                {
                    str+="<tr><td>"+data[i].id+"</td><td>"+data[i].introduce+"</td></tr>"
                }
                $('tbody').html(str);
                console.log(data)
            }
        })
    });
});
