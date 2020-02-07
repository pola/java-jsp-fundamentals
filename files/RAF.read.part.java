RandomAccessFile r = new RandomAccessFile("f.txt",
                     "r");

r.seek(0);

byte[] bytes = new byte[(int) r.length()];
r.read(bytes);

r.close();

String content = new String(bytes);