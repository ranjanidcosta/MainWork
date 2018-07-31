var lis = document.querySelectorAll("li");

for(var i = 0; i <lis.length; i++)
{
	lis[i].addEventListener("mouseover", function(){
		this.classList.add("colorSelected");
	});

	lis[i].addEventListener("mouseout", function(){
		this.classList.remove("colorSelected");
	});

	lis[i].addEventListener("click", function(){
		this.classList.add("done");
	});
}
