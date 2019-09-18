function check(){
    var num1= document.getElementById("Username").value
    var num2=document.getElementById("Password").value
    var errorMessage1=document.getElementById("errorMessage1")
    var errorMessage2=document.getElementById("errorMessage2")
   
    if(userName.length==0){
        errorMessage1.innerHTML = "<font color=red></font>User name is Mandatory</font>"
        return false
    }
    else{
        errorMessage1.innerHTML = ""
         aDiv.innerHTML = ""
    }
    if(Password.length==0){
        errorMessage2.innerHTML = "<font color=red>Please enter the Password</font>"
        return false
    }
    else{
        errorMessage2.innerHTML = ""
         aDiv.innerHTML = ""
    }
    if(pasasword.length<6||password.length>12)
    {
        errorMessage2.innerHTML = "<font color=red>Password should be in between 6 and 12 characters</font>"
        return false
    }
     if(password.charAt(0)!="A"){
        errorMessageNumber2.innerHTML = "<font color=red>Password must start with A</font>"
        return false
    }
    else{
    errorMessageNumber1.innerHTML = ""
    aDiv.innerHTML = ""  
        
    }
    else{
        a=parseInt(num1)+parseInt(num2)
        errorMessageNumber1.innerHTML = ""
    errorMessageNumber2.innerHTML = ""
    aDiv.innerHTML = "<font color=green>Sum is :"+result;
    }
}