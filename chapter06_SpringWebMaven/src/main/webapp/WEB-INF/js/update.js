$(function(){
	$('#updateDiv').hide();
	
	$('#searchIdBtn').click(function(){
		$('#resultDiv').empty();
		if($('#searchId').val() == '') {
			$('#resultDiv').text('아이디를 입력해주세요');
		}
		else {
			$.ajax({
				type: 'post',
				url: '/chapter06_SpringWebMaven/user/getUser',
				data: 'id=' + $('#searchId').val(),
				//dataType: 'json', //아이디가 있으면 UserDTO가 JSON으로 바뀌어서 들어온다.
				//아이디가 없으면 JSON으로 오지 못한다.
				//데이터를 받지 못하면 에러가 생기는데 데이터타입을 정의하지 않으면 스프링이 알아서 데이터를 받는다.
				//그래서 dataType를 생략한다.
				success: function(data){
					console.log(JSON.stringify(data));
					
					if(data == '') {
						$('#updateDiv').hide();
						$('#resultDiv').text('찾는 아이디가 없습니다.');
						$('#resultDiv').css('color', 'red').css('font-weight', 'bold');
					}
					else {
						$('#updateDiv').show();
						$('#name').val(data.name);
						$('#id').val(data.id);
						$('#pwd').val(data.pwd);
						$('#resetBtn').prop('type','button');
						
						$('#resetBtn').click(function(){
							$('#name').val(data.name);
							$('#id').val(data.id);
							$('#pwd').val(data.pwd);
						});
					}
				},
				error: function(err){
					console.log(err);
				}
			});	//ajax
		} //else
	}); //#searchIdBtn.click
	
	$('#updateBtn').click(function(){
		if($('#name').val() == '') {
			$('#nameDiv').text('이름을 입력해주세요');
		}
		else if($('#pwd').val() == '') {
			$('#pwdDiv').text('비밀번호를 입력해주세요');
		}
		else {
			$.ajax({
				type: 'post',
				url: '/chapter06_SpringWebMaven/user/updateUser',
				data: $('#updateForm').serialize(),
				success: function(data){
					alert('업데이트 되었습니다.');
					location.href='/chapter06_SpringWebMaven/user/list';
				},
				error: function(err){
					console.log(err);
				}
				
			});
		}
	});
	

	
});

