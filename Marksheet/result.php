<?php

if(isset($_POST['result']))
{
    $name = $_POST['name'];
    $fathername = $_POST['fathername'];
    $Math = $_POST['Math'];
    $English = $_POST['English'];
    $urdu = $_POST['urdu'];
    $Islamiat = $_POST['Islamiat'];
    $Physics = $_POST['Physics'];

    $obtained_marks = $Math + $English + $urdu + $Islamiat + $Physics;
    $percentage = $obtained_marks * 100 / 500;
    

    if($percentage >= 80)
    {
        $grade = "Your Grade is A-1";
    }elseif($percentage >= 70)
    {
        $grade = "Your Grade is A"; 
    }elseif($percentage >= 60)
    {
        $grade = "Your Grade is B"; 
    }elseif($percentage >= 50)
    {
        $grade = "Your Grade is C"; 
    }elseif($percentage >= 40)
    {
        $grade = "Your Grade is D"; 
    }else{
        $grade = "You are Fail"; 
    }
    
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <table>
            <thread>
                <tr>
                    <th>Your Name</th>
                    <th>Your Father Name</th>
                    <th>Your Obtained Marks</th>
                    <th>Your Percentage</th>
                    <th>Your Grade</th>
                </tr>
            </thread>
            <tbody>
                <tr>
                    <td> <?php echo $name ?> </td>
                    <td> <?php echo $fathername ?> </td>
                    <td> <?php echo $obtained_marks ?> </td>
                    <td> <?php echo $percentage . "%" ?> </td>
                    <td> <?php echo $grade ?> </td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>