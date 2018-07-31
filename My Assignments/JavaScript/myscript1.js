// javascript closure
// resolves counter dilemma
var add3 = (function(){
  // self invoking function, runs only once
  var counterHidden = 0; // sets to zero only once
  return function() {return counterHidden+=1;}
  //add3 becomes a function. it can access private variable
})();
function myFunction3(){
  document.getElementById('demo3').innerHTML=add3();
}

// The global variable is accessed by all
counterGlobal=0;
function add1(){
   return counterGlobal++;
}
function add2(){
   return counterGlobal++;
}

function myFunction1(){
  document.getElementById('demo1').innerHTML=add1();
}


function myFunction2(){
  document.getElementById('demo2').innerHTML=add2();
}
