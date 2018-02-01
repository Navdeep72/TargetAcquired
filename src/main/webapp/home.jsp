<html>
<head>
	<meta charset="UTF-8">
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
    width: 800px;
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
  <a href="login">Login</a>
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
  <h1>Tokyo</h1>
  <p>Tokyo, officially Tokyo Metropolis, is the capital city of Japan and one of its 47 prefectures.</p>
  <p>The Greater Tokyo Area is the most populous metropolitan area in the world. It is the seat of the Emperor of Japan and the Japanese 
  government. Tokyo is in the Kanto region on the southeastern side of the main island Honshu and includes the Izu Islands and Ogasawara Islands.
  Formerly known as Edo, it has been the de facto seat of government since 1603 when Shogun Tokugawa Ieyasu made the city his headquarters. It 
  officially became the capital after Emperor Meiji moved his seat to the city from the old capital of Kyoto in 1868; at that time Edo was renamed 
  Tokyo. Tokyo Metropolis was formed in 1943 from the merger of the former Tokyo Prefecture and the city of Tokyo.<p>
</article>

<footer>Copyright &copy; AlphaMales.com</footer>
</div>

</body>
</html>