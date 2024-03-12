package clase.taller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Hash {
    public static String sha1(String valor) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest msdDigest = MessageDigest.getInstance("SHA1");
        msdDigest.update(valor.getBytes("UTF-8"), 0, valor.length());
        valor = DatatypeConverter.printHexBinary(msdDigest.digest());
        return valor;
      }

      public static String sha256(String valor) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest msdDigest = MessageDigest.getInstance("SHA-256");
        msdDigest.update(valor.getBytes("UTF-8"), 0, valor.length());
        valor = DatatypeConverter.printHexBinary(msdDigest.digest());
        return valor;
      }
}
