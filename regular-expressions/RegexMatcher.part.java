Pattern pattern = Pattern.compile("[0-9]+"); 
Matcher matcher = pattern.matcher("Our 123 string");

if (matcher.find()) {
    System.out.println("There are digits.");
}

if (matcher.matches()) {
    System.out.println("There are only digits.");
}
