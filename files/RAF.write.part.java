
String content = "Hello world!"

RandomAccessFile r = new RandomAccessFile("f.txt",
                     "rw");

r.seek(0);
r.write(content.getBytes());

r.close();