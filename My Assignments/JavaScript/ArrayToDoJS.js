var todos = [];
var input = prompt("What would you like to do");

function add(){
var newTodos = prompt("Enter new todo");
		todos.push(newTodos);	
}

function list()
{
			todos.forEach (function(toDoitem, index)
		{
			console.log("**********")

			console.log(index + ": " + toDoitem)
						
		});
}
	
function deleteArray(){
	var deletedIndex = prompt("Enter index to be deleted");
	todos.splice(deletedIndex,1);

}
while (input !== "quit")
{
	if(input === "add")
	{
		add()
	}
	else if (input === "list"){
		list()
	}	
	else if (input === "delete"){
		deleteArray()
	}

	input = prompt("What would you like to do");
}
 console.log("You quit the app");



