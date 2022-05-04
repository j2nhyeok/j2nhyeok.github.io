// window.addEventListener('DOMContentloaded', function(){
// document.querySelector('.header').style.display ='none';
// })

$(function(){
    $('.main_slider').slick({
        arrows: false,  //버튼 삭제
        autoplay: true, //슬라이드 자동으로 만들기
        autoplaySpeed: 1000, //자동 슬라이드 속도 조절
        vertical: true, //밑에서 위로 슬라이드 방향 조절
        dots: true,  //dots만들기
        
    });
    $('.mopen').on('click', function(){
        $('.gnb').toggleClass('on')
    })
})

