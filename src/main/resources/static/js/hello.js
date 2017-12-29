$(document).ready(
		function() {
			$.getJSON('http://localhost:8080/student', function(data) {

			});
			console.log("test");

			$.get("http://localhost:8080/student/", function(data) {
				console.log(data);
				// $('.student_id').append(data.id);
				var line = '';
				var output = "<ul>";
				$.each(data, function() {
					line += "<b>" + this['id'] + "</b>" + " " + this['name']
							+ " " + this['surname'] + " University:"
							+ this.university['name'] + " "
							+ this.university['city'] + "<br/>";
				})
				console.log(line);
				//deleteStudent(2);
				$('span').html(line);
			});

		});

function deleteStudent(id) {
	console.log("te");
	$.ajax({
		url : 'http://localhost:8080/student/' + id,
		type : 'DELETE'
	});
}

