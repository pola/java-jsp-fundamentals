import java.io.RandomAccessFile;

class RAF
{
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("file.txt", "r");

        raf.seek(0);

        byte[] bytes = new byte[(int) raf.length()];
        raf.read(bytes);

        raf.close();

        String content = new String(bytes);

        System.out.println(content);

        System.out.println(System.getProperty("user.dir"));
    }
}