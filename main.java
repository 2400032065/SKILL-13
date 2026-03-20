<!DOCTYPE html>
<html>
<head>
<title>Deployment Demo</title>
<style>
body {
font-family: Arial; text-align: center;
background-color: #f4f4f4;
}
.box {
margin: 50px auto; padding: 20px; width: 400px; background: white;
box-shadow: 0px 0px 10px gray;
}
button {
padding: 10px 20px; background: green; color: white;
 
border: none; cursor: pointer;
}
</style>
</head>
<body>

<div class="box">
<h2>Full Stack Deployment</h2>
<p id="status">Click to check backend status</p>
<button onclick="checkAPI()">Check API</button>
</div>

<script>
function checkAPI() { fetch("http://localhost:8080/students")
.then(res => { if(res.ok) {
document.getElementById("status").innerHTML = "✅ Backend Connected Successfully";
} else {
document.getElementById("status").innerHTML = "❌ Backend Error";
}
})
.catch(() => {
document.getElementById("status").innerHTML = "❌ Server Not Running";
});
}
</script>

</body>
</html>
