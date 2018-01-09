function check()
{
var productID=document.getElementById("pro").value;
var productName=document.getElementById("proname").value;
var productPrice=document.getElementById("proprc").value;
var productQnty=document.getElementById("proqunty").value;

document.getElementById("p").innerHTML=productID;
document.getElementById("p2").innerHTML=productName;
document.getElementById("p3").innerHTML=productPrice;
document.getElementById("p4").innerHTML=productQnty;


}