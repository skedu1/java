<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fibonacci and Prime</title>
    </head>
    <body>
        
        <h4>Fibonacci Series:</h4>
        <% 
        int a=0, b=1, c, i;
        out.println(a +" &nbsp;&nbsp;" +b +" &nbsp;&nbsp;");
        for(i=1; i<=10; i++){
            c=a+b;
            out.println(c+" &nbsp; &nbsp;");
            a=b;
            b=c;
        }
        
        %>
        
        
        <h4>Prime Numbers :</h4>
        <%
         int pn=2,count=1;
         boolean isprime;
         while(count<=10){
             isprime=true;
             for(i=2;i<pn/2;i++){
                 if(pn%i==0){
                     isprime=false;
                     break;
                 }
             }
             
             if(isprime){
                 out.println(pn+"&nbsp; &nbsp;");
                 count++;
          }
           pn++;
           
         }
        %>
        
    </body>
</html>