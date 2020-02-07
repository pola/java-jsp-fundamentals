<%

// we might have a cookie with a full name
String savedFullName = null;

Cookie[] cookies = request.getCookies();

if (cookies != null) {
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("name")) {
            savedFullName = cookie.getValue();
            break;
        }
    }
}

if (savedFullName != null) {
    out.write("Hello " + savedFullName + "!");
}

%>