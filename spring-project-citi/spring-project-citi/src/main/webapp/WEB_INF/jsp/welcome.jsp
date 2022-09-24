<html>
<head>
<title>Welcome</title>
<style type="text/css">
  <%@include file="style.css" %>
</style>
<!--  
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css">

<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
-->
<style>

table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>
</head>
<body>
<form method="post" action="welcome">
<div class="menu-wrap">
    <input type="checkbox" class="toggler">
    <div class="hamburger"><div></div></div>
    <div class="menu">
      <div>
        <div>
          <ul>
            <li><a href="welcome.jsp" rel="noreferrer">Home</a></li>
            <li><input value="My portfolio" type="submit" name="Auto" class="MyPort"/></li>
            
          </ul>
        </div>
      </div>
    </div>
  </div>
  <!-- 
	<nav class="navbar navbar-expand-lg bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="welcome.jsp">Welcome ${userId}</a>
			<input value="My portfolio" type="submit" name="Auto"/>
				
		</div>
		
	</nav>
-->
<header class="showcase">
    <div class="container showcase-inner">


      <h1>SECTOR BASED TRADE RECOMMENDATION SYSTEM</h1>
      <p>
        Recommender systems that can suggest the user when to buy and sell stocks can be of immense help to those who wish to trade in stocks.
        Recommender systems capable of discovering patterns in stock price movements and generating stock recommendations based on the patterns thus discovered can significantly supplement the decision-making process of a stock trader.
        
      </p>
	<div id="load"></div>
		<input type="submit" name="Auto" value="Automobile and Auto Components" id="auto1" class="buttons"/> 
		<input type="submit" name="Auto" value="Fast Moving Consumer Goods" id="fast1" class="buttons"/> 
		<input type="submit" name="Auto" value="Financial Services" id="finance1" class="buttons"/> 
		<input type="submit" name="Auto" value="Healthcare" id="health1" class="buttons"/> 
		<input type="submit" name="Auto" value="Information Technology" id="it1" class="buttons"/>
	
	</div>

  </header>
</form>
<script type="text/javascript">
	document.onreadystatechange = function () {
	    var state = document.readyState
	    if (state == 'complete') {
	           document.getElementById('interactive');
	           document.getElementById('load').style.visibility="hidden";
	    }
	  }
	
	</script>
</body>
</html>