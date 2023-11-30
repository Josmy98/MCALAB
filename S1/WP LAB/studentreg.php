
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration</title>
</head>
<body>
<form method="POST">
<div class="container">
    <h2>Student Registration</h2>
    <form action="" method="post">
        First Name: <input type="text" name="firstname" required><br><br>
        Last Name: <input type="text" name="lastname" required><br><br>
        Course:
        <select name="course"><option value="MCA">MCA</option>
        <option value="BCA">BCA</option>
        <option value="BBA">BBA</option>
        <option value="BSW">BSW</option>
        <option value="BCOM">BCOM</option></select>
        Year:<input type="text" name="year" required><br><br>
        Email: <input type="email" name="email" required><br><br>
        Password: <input type="password" name="password" required><br><br>

        <input type="submit" value="Register">
 
</div>
    </form>
</body>

</html>

<?php
$servername = "localhost";
 $username = "root";
 $password = "";
 $database = "josmy";
 $conn = new mysqli($servername,$username,$password, $database);
if($conn->connect_error) {
die("connection failed:".$conn->connect_error);
}
if($_POST) {
    $firstname = $_POST["firstname"];
    $lastname = $_POST["lastname"];
    $course = $_POST["course"];   
    $year = $_POST["year"];
    $email = $_POST["email"];
    $password = $_POST["password"];

   $sql = "INSERT INTO student(firstname,lastname,course,year,email,password) VALUES ('$firstname',
            '$lastname','$course','$year','$email','$password')";

   if ($conn->query($sql) === TRUE) {
         
   echo "Registration successful.  " ;
        } else {
       echo "invalid data is entered";
  }
$conn->close(); 
}
?>

