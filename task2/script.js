
function check()
{
var Tid=document.getElementById("tid").value;
var pn=document.getElementById("pn").value;
var pprice=document.getElementById("pp").value;
var pq=document.getElementById("pq").value;
var cn=document.getElementById("cn").value;
var dob=document.getElementById("dob").value;
var cc=document.getElementById("cc").value;
var st=document.getElementById("st").value;
var cco=document.getElementById("cco").value;

if(Tid=="" || pn=="" || pprice=="" || pq=="" ||cn=="" ||dob=="" ||cc=="" ||st=="" ||cco=="")
{
	alert("Fill all the block ");
}
else
{
	document.write("<fieldset style='background:lightblue'><legend><h1>Display Page</h1></legend><center>");
	var totalamnt=pprice*pq;
	if(cco=="India")
	{
		if(totalamnt>=10000)
		{
			var dis= (totalamnt*10)/100;
			var totl=totalamnt-dis;
			document.write("CustomerName :"+cn);
			document.write("<br>ProductName :"+pn+"<br>TotalAmount :"+totalamnt+"<br>TotalAmount after discount :"+totl);
		}
		else
		{
			
			document.write("CustomerName :"+cn+"<br>");
			document.write("ProductName :"+pn+"<br>TotalAmount :"+totalamnt);
		}
	}
	else
	{
		if(totalamnt>=10000){
		var dis= (totalamnt*5)/100;
				var totl=totalamnt-dis;
			document.write("CustomerName :"+cn+"<br>");
			document.write("ProductName :"+pn+"<br>TotalAmount :"+totalamnt+"<br>TotalAmount after discount :"+totl);
		}
		else{
			document.write("CustomerName :"+cn+"<br>");
			document.write("ProductName :"+pn+"<br>TotalAmount :"+totalmnt);
		}
	}
	document.write("</center></fieldset>");
}
}