$(document).ready(function() {
    $.getJSON('http://localhost:8080/university', function(data) {
        console.log(data);
        var line = '';
        $.each(data, function() {
            line += "<option value=" + this['id'] + ">" + this['name'] + "</option>";
        })
        $("#university_list").html(line);
        console.log(line);
    });
});

function createStudent() {
	console.log("creating student");
    $.ajax({
        url: 'http://localhost:8080/student/',
        dataType: 'json',
        type: 'post',
        contentType: 'application/json',
        data: JSON.stringify({
            "name": $('#name').val(),
            "surname": $('#surname').val(),
            "email": $('#email').val()
        }),
        success: function() {
            console.log("User created");
        }
    })
}