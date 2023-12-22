<?php
include('connect.php');
?>
<html>
	<head>
		<title>Search</title>
	</head>
	<body>
		<form method="post">
			<label for="search">Search:</label>
			<input type="text" id="search" name="search"><br>
			<input type="submit" name="submit" value="Search"><br>
			
			<?php
				if($_POST){
					$search=$_POST["search"];
	
					$selectqry="select * from library where title like '%$search%'";
					
					$row=$conn->query($selectqry);
					while($data=$row->fetch_assoc())
					{
						echo "Book No : ".$data["bookno"]."<br>"; 
						echo "Book Title : ".$data["booktitle"]."<br>"; 
						echo "Author : ".$data["author"]."<br>"; 
						echo "Edition : ".$data["edition"]."<br>";
						echo "Publisher : ".$data["publisher"]."<br><br>";
					}
				}
			?>
		</form>
	</body>
</html>
