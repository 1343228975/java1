package ch13.utils;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;

public class MailUtils {
    public static void sendMail(String email, String emailMsg)
            throws AddressException, MessagingException {
        // 1.创建Properties对象，并设置邮件服务器的基本信息
        Properties props = new Properties();
        // 1.1 设置邮件传输协议SMTP
        props.setProperty("mail.transport.protocol", "SMTP");
        // 1.2 设置SMTP服务器地址，此处设置的是QQ邮箱的SMTP服务器地址，如果是其他类型邮箱需要对应修改
        props.setProperty("mail.host", "smtp.qq.com");
        // 1.3 设置SMTP服务器是否需要用户验证，需要验证设置为true
        props.setProperty("mail.smtp.auth", "true");
        // 1.4 创建验证器

    }
}