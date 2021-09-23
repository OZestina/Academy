$.ajax({

  //이 안에 들어갈 key-value는 하기 링크 참고
  //https://api.jquery.com/jquery.ajax/
  
})


$('#b3').click(function(){
		userValue = $('#user').val()
		$.ajax({
			url: "test3.jsp",
			data: {
				user: userValue
			},
			success: function(result){	//호출에 성공했으면
				$('#d1').append(result+"<br>")
			},
			error: function() {
				alert("test3.jsp 호출실패")
			}
		})
	})
