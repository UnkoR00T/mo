package un;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public class q {
    public static byte[] a(String str, SecretKey secretKey, byte[] bArr, Provider provider) throws sn.h {
        Mac macC = c(str, secretKey, provider);
        macC.update(bArr);
        return macC.doFinal();
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, Provider provider) {
        return a(secretKey.getAlgorithm(), secretKey, bArr, provider);
    }

    public static Mac c(String str, SecretKey secretKey, Provider provider) throws sn.h {
        try {
            Mac mac = provider != null ? Mac.getInstance(str, provider) : Mac.getInstance(str);
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e15) {
            throw new sn.h("Invalid HMAC key: " + e15.getMessage(), e15);
        } catch (NoSuchAlgorithmException e16) {
            throw new sn.h("Unsupported HMAC algorithm: " + e16.getMessage(), e16);
        }
    }
}
