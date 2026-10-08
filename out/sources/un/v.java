package un;

import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public class v {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws sn.h {
        try {
            Cipher cipherA = i.a("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
            cipherA.init(3, rSAPublicKey, new SecureRandom());
            return cipherA.wrap(secretKey);
        } catch (InvalidKeyException e15) {
            throw new sn.h("RSA block size exception: The RSA key is too short, try a longer one", e15);
        } catch (Exception e16) {
            throw new sn.h(e16.getMessage(), e16);
        }
    }
}
