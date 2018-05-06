$(document).ready(function () {
  $('.navList ul li').click(function () {
    $(this).removeClass('normal').addClass('current').siblings().removeClass('current').addClass('normal');
    var hAddress = $(this).children().attr('name');
    $('#contetWrap').attr('src',hAddress);
   /* SetCwinHeight()*/
  })
 var minHeight = $(window).height()-36;
    $('.navList').height(minHeight);
})
/*function SetCwinHeight(){
     var iframeid=document.getElementById("contetWrap"); //iframe id
     if (document.getElementById)     {
        if (iframeid && !window.opera)
         {
             if (iframeid.contentDocument && iframeid.contentDocument.body.offsetHeight){
                 iframeid.height = iframeid.contentDocument.body.offsetHeight;
             }
             else if(iframeid.Document && iframeid.Document.body.scrollHeight)
             {
                 iframeid.height = iframeid.Document.body.scrollHeight;
            }
        }
     }
     var winHeight = $('#contetWrap').height();
     $('.navList').height(winHeight);
 }*/

/*$(window).resize(function (){
  var winHeight = $(window).height();
  $('.navList').height(winHeight-36);
  $('#contetWrap').height(winHeight-36);
});*/
