function isEven(num){
	if(num % 2 === 0)
		return true
	else
		return false

}


function factorial(num){
	var result = 1;
	for ( var i=1; i<=num; i++){
		result = result * i;
	}
	return result;
}

function kebabToSnakeCase(string){
	var replacedString = string.replace(/-/g, "_");
	return replacedString;
}