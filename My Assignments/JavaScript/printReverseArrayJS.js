var array = [1,2,3,4];

function arrayReverse(arr){
	for ( var i = arr.length - 1; i >= 0; i--){
		console.log(arr[i]);
	}

}

arrayReverse(array);


var array1 = ["1","1","1","1"]

function isUniform(arr){
	var first = arr[0];
	arr.forEach(function(element){
		if(element !== first){
			return false;
		}
	});
	return true;

}

isUniform(array1);
