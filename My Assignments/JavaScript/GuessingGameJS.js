var guessedNumber = Number(prompt("Guess the number"));

finalValue = 5;

if (guessedNumber === finalValue)
{
	alert("Your guess is correct !!!");
}

else if (guessedNumber < finalValue)
{
	alert("Value too low")
}

else
{
	alert("Value too high")
}