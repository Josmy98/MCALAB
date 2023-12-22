<?php
	include('connect.php');
	if($_POST){
		$bookno=$_POST["bookno"];
		$booktitle=$_POST["booktitle"];
		$author=$_POST["author"];
		$edition=$_POST["edition"];
		$publisher=$_POST["publisher"];
		
		$sql = "INSERT INTO library (bookno,booktitle,author,edition,publisher) VALUES ('$bookno', '$booktitle', '$author','$edition','$publisher')";
	
	if (mysqli_query($conn, $sql)) {
	?>
  <script>
  	alert("Data Inserted");
  </script>
  	<?php
	} else {
	  echo "Error: " . $sql . "<br>" . mysqli_error($conn);
	}
	
}
?>
<html>
	<head>
		<title>Book Registration</title>
	</head>
	<body>
		<form method="post">
			<label for="bookno">Book No:</label>
			<input type="bookno" id="bookno" name="bookno"><br>
			<label for="booktitle">Book Title:</label>
			<input type="text" id="booktitle" name="booktitle"><br>
			<label for="author">Author:</label>
			<input type="text" id="author" name="author"><br>
			<label for="edition">Edition:</label>
			<input type="text" id="edition" name="edition"><br>
			<label for="publisher">Publisher:</label>
			<input type="text" id="publisher" name="publisher"><br>
			<input type="submit" id="submit" name="submit"><br>
		</form>
	</body>
</html>
