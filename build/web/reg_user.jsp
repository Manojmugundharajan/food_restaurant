<%@ include file="top.jsp" %>

<%
String cname = request.getParameter("t1");
String uid = request.getParameter("t2");
String pwd = request.getParameter("p1");
String addr = request.getParameter("t3");
String city = request.getParameter("t4");
String dist = request.getParameter("t5");
String contact = request.getParameter("t6");
String mail = request.getParameter("t7");

        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
        Statement st = con.createStatement();
        String sid = session.getId();
       // String uid = session.getAttribute("username")+"";
         
        PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?,?,?,?)");
        ps.setString(1,cname);
        ps.setString(2,uid);
        ps.setString(3,pwd);
        ps.setString(4,pwd);
        ps.setString(5,addr);
        ps.setString(6,city);
        ps.setString(7,dist);
        ps.setString(8,contact);
        ps.executeUpdate();
        con.close();
        session.setAttribute("username",uid);
        
        response.sendRedirect("index1.jsp");
        
        }
        catch(Exception ee)
        {
        //    out.println(ee.getMessage());
            response.sendRedirect("register.jsp");
        
        }
%> 

