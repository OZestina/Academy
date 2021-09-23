$.ajax({

  //이 안에 들어갈 key-value는 하기 링크 참고
  //https://api.jquery.com/jquery.ajax/
  
})


$(function() {
	$('#b1').click(function(){
		wordValue = $('#word').val() 
		$.ajax({
			url: "test.jsp",
			data: {
				word: wordValue
			},
			success: function(result){	//호출에 성공했으면
				//alert("test.jsp 호출성공")
				alert(result)
				$('#d1').append(result+"<br>")
			},
			error: function() {
				alert("test.jsp 호출실패")
			}
		})
	})
}
