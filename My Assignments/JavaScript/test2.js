function isFiveDigits(val){
   return (/^\d{5}$/).test(val);
}
/*

  (/^[A-Z][a-z]*$/)

*/

function divide(val1, val2){
  var a = parseInt(val1);
  var b = parseInt(val2);
  try{
    var c = a/b;
    alert(a+'/'+b+'='+c);
  }
  catch(e){
    alert('denominator cannot be zero');
  }
}