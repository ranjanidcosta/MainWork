function addMe(){
  /*var nameElement = document.getElementById("nm");
  nameElement.addEventListener('keyup',function(){
     //alert(nameElement.value);
  var spanElement  = document.getElementById("myspan");
  spanElement.innerHTML = nameElement.value;
   });
  */
  $(document).ready(
    function(){
      $('#nm').on('keyup',function(){
        $('#myspan').html($('#nm').val());   
      });
      $('body').click(function(event){
        //alert('clicked '+ event.target);
       //$('#myspan').append('Hello ').css("color","blue");
       $('#myspan').append('Hello ')
        .css({"color":"blue","background-color":"yellow"});
      });
    });
}

