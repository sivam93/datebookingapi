/**
 * 
 * 
 */
$(document).ready(function () {

	$("#login-screen").click(function () {
       console.log([,,,,].join())
		var sample = "";
		var username = $("#userName").val();
		var password = $("#Password").val()
		var message = document.getElementById('error-nwl');
		var users = "userName";
		var pass = "passWord";
		
		var arr = {
			"userName": username,
			"passWord": password
		}
		var myJSON = JSON.stringify(arr);
		
		$.ajax({
			type: 'POST',
			url: '/authenticate',
			data: myJSON,
			contentType: "application/json",
			dataType: 'text'
		}).done(
			function (data) {
				var datehash = Number(data);
				navigate(datehash);
			}
		);

		function navigate(data) {
			if (data === 0) {
				message.innerHTML = "password/username is invalid"
				return "invalid";
			} else {
				sessionStorage.setItem("dateHash", data);
				window.location.href = 'datebooking.html';
			}
		}
	});
});