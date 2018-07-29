const toggler = document.querySelectorAll(".toggler");
const formRegister = document.querySelector(".form-register");
const formLogIn = document.querySelector(".form-login");
[].forEach.call(toggler, function(e){
	e.addEventListener("click", function(){
		if(formRegister.classList.contains("form--disabled")){
			formRegister.classList.remove("form--disabled");
			formLogIn.classList.add("form--disabled");
		} else{
			formLogIn.classList.remove("form--disabled");
			formRegister.classList.add("form--disabled");
			
		}
	})
});

