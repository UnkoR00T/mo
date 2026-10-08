package un;

import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public class t {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws sn.h {
        try {
            Cipher cipherA = i.a("RSA/ECB/PKCS1Padding", provider);
            cipherA.init(1, rSAPublicKey);
            return cipherA.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e15) {
            throw new sn.h("RSA block size exception: The RSA key is too short, use a longer one", e15);
        } catch (Exception e16) {
            throw new sn.h("Couldn't encrypt Content Encryption Key (CEK): " + e16.getMessage(), e16);
        }
    }
}
