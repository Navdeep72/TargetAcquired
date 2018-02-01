<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<title>This is a ${name} page</title>
<style>
div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 0.5em;
    color: white;
    background-color: #66CCFF;
    clear: left;
    text-align: center;
}

nav {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
   
nav ul a {
    text-decoration: none;
}

article {
    margin-left: auto;
    margin-right: auto;
    width: 500px;
    padding: 1em;
    overflow: hidden;
    text-align: justify;
}

.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #111;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: #f1f1f1;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
</head>
<body>

<div class="container">

<header>
   <h1>Target Acquired</h1>
   
   <div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="home">Home page</a>
  <a href="form">Registration</a>
  <a href="town.html">Login</a>
</div>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; </span>

<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script>

</header>


<article>
<div class="w3-card-4">
	<div class="w3-container w3-teal">
  		<h2>Enter Username and Password</h2>
	</div>
	
	<form class="w3-container" method="post" action="/person/new">
		<label class="w3-text-teal">User Name:</label>
		<input class="w3-input w3-border w3-light-grey "type="text" name="userName" /><br />
		
		<label class="w3-text-teal">Password:</label>
		<input class="w3-input w3-border w3-light-grey "type="password" name="password" /><br />
		
		<button class="w3-btn w3-blue" type="submit">
			Log In
		</button>
	</form>
</div>
</article>

<footer>Copyright &copy; AlphaMales.com</footer>

</div>

</body>
</html>