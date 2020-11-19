window.onload = function(){
let luck=["大吉","吉","中吉","小吉","末吉","凶","大凶"];
let colors=["赤","青","黄","緑","白","黒","金","銀","紫","桃"];
let message,random_luck,random_color;
let btn=document.getElementById("btn");
let output=document.getElementById("output");

btn.onclick=function(){
    random_luck=luck[ Math.floor(Math.random()*luck.length) ];
    random_color=colors[Math.floor(Math.random()*colors.length)];

    message = "<h2>"+ random_luck+"</h2>";
    message +="<p>ラッキーカラーは" + random_color +"</p>";
    output.innerHTML=message;
}
}