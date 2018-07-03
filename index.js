$('.aba').click(function(){
  $('.aba-selecionada').removeClass('aba-selecionada');
  $(this).addClass('aba-selecionada');
  var left = '0px';
  if($(this).hasClass('aba01')){
    left = '205px';
  }else if($(this).hasClass('aba02')){
    left = '435px';
  }else if($(this).hasClass('aba03')){
    left = '655px';
  }
  
  
  $('.caminhao-abas').css('opacity','0.5');
  $('.caminhao-abas').animate({
    'left':left
  },500,function(){
    $('.caminhao-abas').css('opacity','0.2');
  });
});

$(document).on('mousemove',function(e){
  if($(e.target).hasClass('aba-selecionada')){
    $('.bolinha').show();
    $('.bolinha').css('top',e.offsetY);
    $('.bolinha').css('left',e.offsetX + 70);
  }else{
    if(!$(e.target).hasClass('caminhao-abas')){
      $('.bolinha').hide();
    }
  }
});

$('button').on('click',function(){
    $('#divId').show(); // aparece o div
    window.open(seulink,'_blank'); // abre nova janela
});

function Mudarestado(el) {
        var display = document.getElementById(el).style.display;
        if(display == "none")
            document.getElementById(el).style.display = 'block';
        else
            document.getElementById(el).style.display = 'none';
    }