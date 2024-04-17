
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
        <link rel="stylesheet" href="signup.css">
    </head>
    <body>
      <div class="container">
        <div class="image-container">
            <img src="assets/Elements/image.png" alt="Image">
        </div>
        
        <div class="form-container">
            <div class="form-wrapper">
                <form id="signup-form" class="signup-form">
                    <h1>Sign Up</h1>
                    <span>Already have an account <a href="##">Sign in</a></span>
                    
                        <div class="infield">
                          <label></label>
                           <input type="FirstName" placeholder="FirstName" name="FirstName"/> 
                        </div>
                    <div class="infield">
                        <label></label>
                        <input type="LastName" placeholder="LastName" name="LastName"/>
                        
                    </div>
                <div class="infield">
                    <label></label>
                    <input type="email" placeholder="Email Address" name="email"/>
                    
                </div>
                <div class="infield">
                    <label></label>
                    <input type="password" placeholder="Password" />
                    
                </div>
                <div class="infield-checkbox">
                    
                    <input type="checkbox" placeholder=" " name="checkbox">
                    
                </div>
             
                  
                <div class="infield-signup">
                    <button>Sign Up</button>
                    
                </div>
             
                
            </form>
                    

              
            </div>

        </div>
    </table>
    </div>
    <script src="script.js"></script>
    </body>
</html>
