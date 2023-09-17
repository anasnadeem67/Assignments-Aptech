<?php


?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<form action="result.php" method="post">
    <div class="div1"> 
        <div class="div3">
        <h1>Student Details</h1>
        <label>Name:<label><br>
        <input type="text" name="name" placeholder="Name" required>
        <br>
        <label>father name:<label><br>
        <input type="text" name="fathername" placeholder="Father Name" required>
        </div>
    </div>
    <div class="div2">
        <div class="div4">
    <h1>Subject Marks</h1>
        <label>Math:<label><br>
        <input type="text" name="Math" required>
        <br>
        <label>English:<label><br>
        <input type="text" name="English" required>
        <br>
        <label>urdu:<label><br>
        <input type="text" name="urdu" required>
        <br>
        <label>Islamiat:<label><br>
        <input type="text" name="Islamiat" required>
        <br>
        <label>Physics:<label><br>
        <input type="text" name="Physics" required>
        <br>
        <input type="submit" name="result" class="submit">
       </div>
    </div>

    
        

</form>
</body>
</html>