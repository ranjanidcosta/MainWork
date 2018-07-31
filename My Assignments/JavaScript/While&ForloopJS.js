/* WHILE LOOP START
 var num1 = -11
while (num1 < 19)
{
	console.log("The number1 is: " + num1);
	num1++;
}

var num2 = 11
while (num2  < 40)
	{
		if(num2 % 2 === 0)
		{
			console.log("The number2 is: " + num2);
		}
	num2++;
}

var num3 = 301
while (num3  < 333)
	{
		if(num3 % 2 !== 0)
		{
			console.log("The number3 is: " + num3);
		}
	num3++;
}


var num4 = 6
while (num4  < 50)
	{
		if((num4 % 5 === 0) && (num4 % 3 === 0 ))
		{
			console.log("The number4 is: " + num4);
		}
	num4++;
}

WHILE LOOP ENDS */

//FOR LOOP START

for (var num1= -10; num1 < 19; num1++){
	console.log("num1 " + num1);
}

for(var num2= 10; num2<40; num2+=2){
	console.log("num2 " + num2);
}

for(var num3=301; num3<333; num3+=2){
	console.log("num3 " + num3);
}

for(var num4 = 5; num4 <50;num4++){
	if ((num4 %5 === 0)&&(num4%3===0)){
		console.log("num4 "+ num4);
	}

}

//FOR LOOP ENDS 


