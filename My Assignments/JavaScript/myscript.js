function printSquares() {
       document.write("<h2>Squares 1 to 10:</h2>");
       for(i=1;i<=10;i++) {
         document.write(i + "<sup>2</sup> = "+ i*i+"<br>");
       }
}
function joinEm(delim) {
   //alert(delim);
   //alert(arguments);
   var result="";
   for(i=1;i<arguments.length;i++){
      result+=arguments[i] + delim;
   }
   result = result.substring(0,result.length-1);
   //alert(result);
   document.write('<h2>'+result+'</h2>');
   today = new Date();
   document.write('<br>'+today+'<br>');
      document.write('Day: '+today.getDate()+'<br>');
      document.write('Time: '+today.getTime()+'<br>');
      document.write('Year: '+today.getFullYear()+'<br>');
      document.write('Week day: '+today.getDay()+'<br>');
      document.write('Hour: '+today.getHours()+'<br>');
   setTimeout(function(){alert('Time over');}, 5000);
   input = prompt("what's it?","enter value");
   alert(input);
}
function check(){
   //alert(frm.txt.value);
   if(isNaN(frm.txt.value)) {
     alert('age should be a number');
   }
}
function display(){
  //alert('display called');
colorArray = new Array("red","blue","green","pink","yellow","orange");
var copy=[]; // copy.push(colorArray[i]);
colorArray.forEach(function(item){copy.push(item);});
var elem = document.getElementById("mydiv");
//alert(elem);
elem.innerHTML = "<h3>array length: "+colorArray.length+" </h3>";
joinedArray = colorArray.join("-");
elem.innerHTML += joinedArray+"<br>";
newCopy = copy.join(":");
elem.innerHTML += newCopy+"<br>";
sliced = colorArray.slice(1,4);
elem.innerHTML += sliced+"<br>";
concArray = colorArray.concat(sliced);
elem.innerHTML += concArray+"<br>";
revArray = concArray.reverse();
elem.innerHTML += revArray+"<br>";
sortArray = revArray.sort();
elem.innerHTML += sortArray+"<br>";
numArray = new Array(23,45,'zd',12,78,35,'ar');
//ASCII used for chars
elem.innerHTML += numArray.sort()+"<br>";
}

function openWin(){
   win2 = window.open("","");
   if(win2 != null){
      win2.document.write("<html>");
      win2.document.write("<body>");
      win2.document.write("<h1>This is a new window</h1>");
      win2.document.write("</body>");
      win2.document.write("</html>");
   }
}

