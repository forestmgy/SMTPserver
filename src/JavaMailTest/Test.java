package JavaMailTest;

import java.io.IOException;

public class Test {


    public static void main(String[] args) throws IOException {
        AcceptMailFromServer mail1 = new AcceptMailFromServer();
       if(mail1.acceptMail()){
           Mail mail = new Mail();

           mail.setSmtpServer("smtp.163.com");
           mail.setFromMail("buptmgy@163.com");

           for (String mail2 : mail1.destination) {

            mail.addToMail(mail2);
        }

           mail.setUserName("buptmgy@163.com");

           mail.setPassword("XYISISARAYHYLNUX");

           mail.setSubject(mail1.subject);

           mail.setContent(mail1.content);


           mail.setShowLog(true);

           mail.send();


           System.out.println("程序结束");
       }
    }
}
