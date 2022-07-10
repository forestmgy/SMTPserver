package JavaMailTest;

import org.apache.commons.codec.binary.Base64;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
public class AcceptMailFromServer {


    public String subject;
    private boolean showLog;
      List<String> destination = new ArrayList<String>();//用一个String类型的List将收件人信息保存
        String encode_content="";
        String content;



    public boolean acceptMail(){
        ServerSocket serverSocket=null;
        Socket socket = null;
        InputStream in = null;
        BufferedOutputStream bos = null;
        OutputStream out = null;
        try {
            serverSocket = new ServerSocket(25);
            socket = serverSocket.accept();
            in = socket.getInputStream();//一个输入流

            out = socket.getOutputStream();//创建输出流
//            bos = new BufferedOutputStream(new FileOutputStream("copy.txt"));
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = in.read(buffer)) != -1) {
//                bos.write(buffer, 0, len);
//             bos.flush();//清空缓存区，将缓冲区中的数据强制写出
//            }
            System.out.println("New connection accepted " +
                    socket.getInetAddress() + ":" +socket.getPort());//没有抛异常的话连接建立成功
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            //关闭资源
//            if (bos != null) {
//                try {
//                    bos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (in != null) {
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (socket != null) {
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (serverSocket != null) {
//                try {
//                    serverSocket.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


        BufferedReaderProxy reader = new BufferedReaderProxy(new InputStreamReader(in), showLog);

         PrintWriterProxy  writer = new PrintWriterProxy(out, showLog);
         String line = null;
        writer.println("220 163.com Anti-spam GT for Coremail System (163com[20111010])");//这是网易邮箱的特定就绪信息
//不同邮箱状态信息不同
        reader.showResponse1();//EHLO
        writer.println("250 OK");
        reader.showResponse1();//MAIL FROM
        writer.println("250 OK");
        while(( (line =reader.showResponse1()).contains("@"))){//RCPT TO + DATA
//            System.out.println(line);//对着呢
            int pos_1 = line .indexOf("<");
            int pos_2 = line .indexOf(">");
            String des = line .substring(pos_1+1, pos_2);
            destination.add(des);
            writer.println("250 OK");
        }
//        reader.showResponse2();//RCPT TO
//        writer.println("250 OK");
//        reader.showResponse1();//DATA
        writer.println("354 Start Mail. End with CRLF.CRLF\\r\\n");//以下都是网易邮箱传过来的信息 比如mailfrom  rcpt to等信息
        reader.showResponse1();//说实话我也不知道为什么会传这么多信息，不过如果邮件主题和正文都是英文并且信息比较少的话，这些showresponse就够用
//Date
        reader.showResponse1();//From: "buptmgy@163.com" <buptmgy@163.com>
        while(( (line =reader.showResponse1()).contains("@")));
//        reader.showResponse1();//To: 1624695190 <1624695190@qq.com>
        subject = line.substring(9);
        reader.showResponse1();//Subject: test

        reader.showResponse1();//X-Priority: 3
        reader.showResponse1();//X-GUID: 5FEB67CB-A5CB-4108-9AF7-726BC0AC9BA5
        reader.showResponse1();//X-Has-Attach: no
        reader.showResponse1();//X-Mailer: Foxmail 7.2.22.194[cn]
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();//Content-Transfer-Encoding: base64
        reader.showResponse1();//空行
        while((line = reader.showResponse1()).length()>0){
            encode_content+=line;
        }
//        reader.showResponse1();//正文
//        reader.showResponse1();//
        reader.showResponse1();//------=_001_NextPart688738057818_=----
        reader.showResponse1();
        //附件
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        //附件
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();
        reader.showResponse1();//发了一个"."
        writer.println("250 OK , completed\\r\\n");//当最后发过来一个"." 邮件内容结束
        reader.showResponse1();//
        writer.println("221 Service Closing transmission\\r\\n");  // 同意 然后连接释放

//        for (String mail : destination) {
//
//            System.out.println(mail + "; ");
//
//        }
//        System.out.println(encode_content);
        content = new String(Base64.decodeBase64(encode_content));
//        System.out.println(content);

        return true;
    }



    static class PrintWriterProxy extends PrintWriter {//一个内部类 用来传信息与打印信息

        private boolean showRequest;


        public PrintWriterProxy(OutputStream out, boolean showRequest) {

            super(out, true);

            this.showRequest = showRequest;

        }


        @Override

        public void println() {

            if (showRequest)

                System.out.println();

            super.println();

        }


        public void print(String s) {

            if (showRequest)

                System.out.print(s);

            super.print(s);

        }

    }


    static class BufferedReaderProxy extends BufferedReader {//这是一个内部类

        private boolean showResponse = true;


        public BufferedReaderProxy(Reader in, boolean showResponse) {//构造器

            super(in);

            this.showResponse = showResponse;

        }

//        public void showResponse1() {//其实应该做一些异常处理但是我不太会。。。
//                try {
//                    String line = readLine();//用line接收反馈
//                    System.out.println(line);//打印反馈信息
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//
//        }

        public void showResponse2() {//用showresponse2来接受 RCPT TO 和TO的信息

            String line1 = "@";

            while (line1.contains("@")){
                try {
//                    destination.add("RC");
                    line1 = readLine();//用line接收反馈
                    if(!(line1.contains("@")))
                        break;
                    System.out.println(line1);//打印反馈信息
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

        }


        public String showResponse1(){
            String line = null ;
            try {
                 line = readLine();//用line接收反馈
                System.out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        }
    }



}
