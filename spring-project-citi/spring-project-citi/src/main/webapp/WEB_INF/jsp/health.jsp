<html>
<head>
<title>Healthcare</title>
<style type="text/css">
  <%@include file="style.css" %>
</style>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css">

<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>
<form method="post" action="welcome">
	<div class="menu-wrap">
    <input type="checkbox" class="toggler" />
    <div class="hamburger"><div></div></div>
    <div class="menu">
      <div>
        <div>
          <ul>
            <li><a href="welcome">Home</a></li>
            <li><input type="submit" name="Auto" value="Automobile and Auto Components" id="auto1" class="buttons" onclick="showLoader()"/></li>
            <li><input type="submit" name="Auto" value="Fast Moving Consumer Goods" id="fast1" class="buttons"/></li>
		<li><input type="submit" name="Auto" value="Financial Services" id="finance1" class="buttons"/></li>
		<li><input type="submit" name="Auto" value="Healthcare" id="health1" class="buttons"/></li>
		<li><input type="submit" name="Auto" value="Information Technology" id="it1" class="buttons"/></li>
            <li><input value="My portfolio" type="submit" name="Auto" class="navbuttons"/></li>
            <li><input value="Log out" type="submit" name="Auto" class="navBtn"/></li>
  

          </ul>
        </div>
      </div>
    </div>
  </div>
 </form>
  <header class="showcase">
    <div class="container showcase-inner">
	

	
	<div class="stockSectorData">
	<h5>${sector}</h5>
	<form method="post" action="health">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Current price</th>
				<th scope="col">Average change(2 weeks)(INR)</th>
				<th scope="col">volume</th>
				<th scope="col">Quantity</th>
				<th scope="col">Save Stock</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				
				<th scope="row">${name}</th>
				<td>${price}</td>
				<td>${dividend}</td>
				<td>${volume}</td>
				<td>
				<input type="text" class="form-control" name="quant16"
						placeholder="Enter Quantity" />
</td>
				<td><input name="SavingStock4" value="Save 1st stock" type="submit"></td>
				
			</tr>
			
			  
			<tr>
				<th scope="row">${name1}</th>
				<td>${price1}</td>
				<td>${dividend1}</td>
				<td>${volume1}</td>
				<td><input type="text" class="form-control" name="quant17"
						placeholder="Enter Quantity" /></td>
				<td><input name="SavingStock4" value="Save 2nd stock" type="submit"></td>
			</tr>
			
	 		<tr>
				<th scope="row">${name2}</th>
				<td>${price2}</td>
				<td>${dividend2}</td>
				<td>${volume2}</td>
				<td><input type="text" class="form-control" name="quant18"
						placeholder="Enter Quantity" /></td>
				<td><input name="SavingStock4" value="Save 3rd stock" type="submit"/></td>
			</tr>
			<tr>
				<th scope="row">${name3}</th>
				<td>${price3}</td>
				<td>${dividend3}</td>
				<td>${volume3}</td>
				<td><input type="text" class="form-control" name="quant19"
						placeholder="Enter Quantity" /></td>
				<td><input name="SavingStock4" value="Save 4th stock" type="submit"/></td>
			</tr>
			<tr>
				<th scope="row">${name4}</th>
				<td>${price4}</td>
				<td>${dividend4}</td>
				<td>${volume4}</td>
				<td><input type="text" class="form-control" name="quant20"
						placeholder="Enter Quantity" /></td>
				<td><input name="SavingStock4" value="Save 5th stock" type="submit"/></td>
			</tr>
		
		</tbody>
	</table>
	</form>
	
	</div>
	</div>
	</header>
	<script type="text/javascript">
	
	
	</script>
</body>
</html>