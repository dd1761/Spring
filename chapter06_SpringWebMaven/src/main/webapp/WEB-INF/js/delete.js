$('#searchId').focusout(function(){
	if($('#searchId').val() == '') {
		$('#resultDiv').text('삭제할 아이디를 입력해주세요');
	}
	else {
		$.ajax({
			type: 'post',
			url: '/chapter06_SpringWebMaven/user/isExistId',
			data: 'id=' + $('#searchId').val(),
			dataType: 'text', // 서버로부터 받는 데이터 형, text, json, xml
			success: function(data){
				//아이디가 있으면 "exist", 아이디가 없으면 "non_exist"
				if(data == 'exist') {
					$('#resultDiv').text('삭제가능아이디입니다.');
					$('#resultDiv').css('color', 'red');
					
					
				}
				else if(data == 'non_exist') {
					$('#resultDiv').text('없는 아이디 입니다.');
					$('#resultDiv').css('color', 'blue');
				}
				
			},
			error: function(err){
				console.log(err)
			}
		});
	}
	
	$('#deleteBtn').click(function(){
		$.ajax({
			type:'post',
			url: '/chapter06_SpringWebMaven/user/delete',
			data: 'id=' + $('#searchId').val(),
			success: function(data){
				alert('삭제하였습니다.');
				location.href='/chapter06_SpringWebMaven/user/list';
			}, //success
			error: function(err){
				console.log(err);
			}
		}); //ajax
	});
});