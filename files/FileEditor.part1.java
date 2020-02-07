class FileEditor
{
    public static void main(String[] args) {
        System.out.println("Working in: " + System.getProperty("user.dir"));

        for (String a : args) {
            System.out.println(a);
        }
    }
}