package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class get_005fhelp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/top.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("  <html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-5.2.2-dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\t<title></title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            @font-face {\n");
      out.write("            font-family: naturebeauty;\n");
      out.write("            src: url('fonts/NatureBeautyPersonalUse-9Y2DK.ttf');\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("            background:url(\"images/bg1.jpg\");\n");
      out.write("            background-size: 100% 100%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            header\n");
      out.write("            {\n");
      out.write("            background-image: url(\"images/mainimage4.jpg\");\n");
      out.write("            background-size: 100% 100%;\n");
      out.write("            color: yellow;\n");
      out.write("            height: 300px;\n");
      out.write("            }\n");
      out.write("            header span\n");
      out.write("            {\n");
      out.write("            margin: 10px;\n");
      out.write("            color: blue;\n");
      out.write("            font-family:naturebeauty;\n");
      out.write("            letter-spacing: -10px;\n");
      out.write("            font-size: 60px;\n");
      out.write("            }\n");
      out.write("            footer\n");
      out.write("                {\n");
      out.write("        \tbackground-color: black;\n");
      out.write("        \theight: 400px;\n");
      out.write("        \twidth:100% ;\n");
      out.write("                }\n");
      out.write("            .col-sm-4\n");
      out.write("               {\n");
      out.write("               color: gray;\n");
      out.write("               font-size: 20px;   \n");
      out.write("               }\n");
      out.write("            #dd1\n");
      out.write("               {\n");
      out.write("               font-size: 20px;\n");
      out.write("               color: gray;\n");
      out.write("               }\n");
      out.write("        </style>\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("     <header>\n");
      out.write("        <h1 style=\"font-size: 50px;\"><span style=\"font-size: 60px;\">AM</span>Restaurant </h1><br>\n");
      out.write("      \n");
      out.write("        <p style=\"font-size:25px; color: white; margin-top:-40px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>Legendary taste of Chidambaram</i></p>\n");
      out.write("        \n");
      out.write("       ");

        if(session.getAttribute("username")==null)
            {
            
      out.write("\n");
      out.write("            <a href=\"login.jsp\" style=\"position: absolute;right: 250px;top: 55px;text-decoration: none;color: yellow; font-size: 25px\">Login</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");

        }
        else
            {
            
      out.write("\n");
      out.write("            <p align=\"right\">\n");
      out.write("                <a href=\"index.jsp\" style=\"position: absolute;right: 550px;top: 55px;text-decoration: none;color: yellow; font-size: 25px\">Log out</a> \n");
      out.write("                <a href=\"mycart.jsp\" style=\"position: absolute;right: 350px;top: 55px;text-decoration: none;color: yellow;font-size: 25px\">Bucket List</a>\n");
      out.write("                <a href=\"myorders.jsp\" style=\"position: absolute;right: 200px;top: 55px;text-decoration: none;color: yellow;font-size: 25px\">Myorders</a>\n");
      out.write("                <a href=\"index1.jsp\" style=\"position: absolute;right: 100px;top: 55px;text-decoration: none;color: yellow;font-size: 25px\">Home</a>\n");
      out.write("            </p>\n");
      out.write("       ");

       }
        
      out.write("\n");
      out.write("       \n");
      out.write("    </header>\n");
      out.write("    ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\t<title></title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("    <h1 align=\"center\">HOW CAN WE HELP YOU?</h1><br><br>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t<h2>NEED TO TALK?</h2>\n");
      out.write("\t\t\t<p><input type=\"button\" name=\"b1\" value=\"044-787898\" style=\"height: 40px; width: 150px; border-radius: 50px;\"></p>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t<h2>MAIL US</h2>\n");
      out.write("\t\t\t<p><input type=\"button\" name=\"b2\" value=\"amrestaurant@gmail.com\" style=\"height: 40px; width: 200px; border-radius: 50px;\"></p>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t<h2>CONTACT US</h2>\n");
      out.write("\t\t\t<p>12,North Main Street,<br>\n");
      out.write("\t\t\tChidambaram,<br>\n");
      out.write("\t\t\tTamilnadu-608001.</p>\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</div><br>\n");
      out.write("<p align=\"center\"><a href=\"home1,2\" style=\"font-size:30px;\"> <--back to home</a></p>\n");
      out.write("\n");
      out.write("<footer style=\"clear:both\">\n");
      out.write("        \n");
      out.write("    \t<div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h3>AM Restaurast</h3>\n");
      out.write("      <p>12,North main street,<br>\n");
      out.write("        Chidambaram,<br>\n");
      out.write("        Tamilnadu-608001.\n");
      out.write("      </p>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h3>Get in Touch</h3>\n");
      out.write("      <p>+91&nbsp;&nbsp;6369667840<br>\n");
      out.write("        <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;8682040572<br>\n");
      out.write("        amrestaurant@gmail.com<br></p>\n");
      out.write("        <a href=\"#facebook\"><img src=\"images/f.jpg\" style=\"width:30px; height:30px;\"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("         <a href=\"#linkedin\"> <img src=\"images/in.jpg\" style=\"width:30px; height:30px;\"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("          <a href=\"#twitter\"><img src=\"images/t.jpg\" style=\"width:30px; height:30px;\"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h3>Support:</h3>        \n");
      out.write("      <p id=\"p1\"><a href=\"get_help.jsp\" style=\"color:gray;\">Get help</a><br>\n");
      out.write("          <a href=\"feedback.jsp\" style=\"color:gray;\">Feedback</a><br>\n");
      out.write("          <a href=\"careers.jsp\" style=\"color:gray;\">Careers</a><br>\n");
      out.write("          <a href=\"faq.jsp\" style=\"color:gray;\">FAQ's</a><br>\n");
      out.write("          <a href=\"terms_condition.jsp\" style=\"color:gray;\">Term and condition</a> <br>\n");
      out.write("        <a href=\"privacy_policy.jsp\" style=\"color:gray;\">Privacy policy</a><br></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div id=\"dd1\">\n");
      out.write("  Places we deliver to:<br>\n");
      out.write("            <p>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Chidambaram | Annamalai Nagar | Ammapettai | Vallampadugai\n");
      out.write("                Kolidam | Vandigate | Mutlur | Kille  <br>  \n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pichavaram | Bhuvanagiri | Parangipettai | Puduchathiram \n");
      out.write("                Kumaratchi | Kattumanarkoil |  Veeranam | Puthur<br>\n");
      out.write("            </p></div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \t<p align=\"center\" style=\"font-size:20px; color:gray;\">All rights reserved@2022 Am Restaurant</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
