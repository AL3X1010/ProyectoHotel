/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpq;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class EnviadorMail {

    final String miCorreo = "allanponce1991@gmail.com";
//final String miContraseña = "password";
    final String servidorSMTP = "smtp.gmail.com";
    final String puertoEnvio = "465"; //465,587
    String mailReceptor = null;
    String asunto = null;
    String cuerpo = null;

    public EnviadorMail(String mailReceptor, String asunto, String cuerpo) {
        this.mailReceptor = mailReceptor;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        Properties props = new Properties();
        props.put("mail.smtp.user", miCorreo);
        props.put("mail.smtp.host", servidorSMTP);
        props.put("mail.smtp.port", puertoEnvio);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", puertoEnvio);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        SecurityManager security = System.getSecurityManager();
        try {
            Authenticator auth = new autentificadorSMTP();
            Session session = Session.getInstance(props, auth);
//session.setDebug(true);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(cuerpo);
            msg.setSubject(asunto);
            msg.setFrom(new InternetAddress(miCorreo));
            msg.addRecipient(Message.RecipientType.TO,
                                            new InternetAddress(mailReceptor)
                                            );
            Transport.send(msg);
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }
}
