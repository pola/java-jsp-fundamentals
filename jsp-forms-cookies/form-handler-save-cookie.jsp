<%

// [...]

if (ageInt < 13 || ageInt > 19) {
    out.print("You're not a teenager.");
} else {
    out.print("You are a teenager.");
}

// create a cookie
Cookie c = new Cookie("fullname", fullName);

// ask the browser to save it for seven days
c.setMaxAge(60 * 60 * 24 * 7);

// make the cookie part of the web server's response
response.addCookie(c);

%>