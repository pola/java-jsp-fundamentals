<%
String fullName = request.getParameter("fullname");
String age = request.getParameter("age");

int ageInt = Integer.parseInt(age);

out.print("Hello " + fullName + "<br />");

if (ageInt < 13 || ageInt > 19) {
    out.print("You're not a teenager.");
} else {
    out.print("You are a teenager.");
}

%>