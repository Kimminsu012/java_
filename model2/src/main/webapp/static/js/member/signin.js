/**
 * 
 */
 
 
 
$(function(){
	var preUrl = document.referrer;
	$("#cmd").val(preUrl);
});
 
 
function login(){
	if( $("#email").val() == ''){
		alert("이메일을 입력 하세요.")
		$("#email").focus();
	}else if( $("#pin").val() == ''){
		alert("비밀번호를 입력 하세요.")
		$("#pin").focus();
	}else{
		$("#signFm").submit();
	}
	
}

