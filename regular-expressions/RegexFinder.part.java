Pattern pattern = Pattern.compile("...your regex here..."); 
Matcher matcher = pattern.matcher(neuromancer);

while (matcher.find()) {
    System.out.println(matcher.group());
}
