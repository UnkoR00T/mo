package un;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public class w {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, int i15, Provider provider) throws sn.h {
        MGF1ParameterSpec mGF1ParameterSpec;
        String str;
        String str2;
        if (256 == i15) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            str = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            str2 = XMSSKeyParameters.SHA_256;
        } else if (384 == i15) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            str = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
            str2 = "SHA-384";
        } else {
            if (512 != i15) {
                throw new sn.h("Unsupported SHA-2 bit size: " + i15);
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            str = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
            str2 = XMSSKeyParameters.SHA_512;
        }
        try {
            AlgorithmParameters algorithmParametersA = e.a("OAEP", provider);
            algorithmParametersA.init(new OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Cipher cipherA = i.a(str, provider);
            cipherA.init(3, rSAPublicKey, algorithmParametersA);
            return cipherA.wrap(secretKey);
        } catch (InvalidKeyException e15) {
            throw new sn.h("Encryption failed due to invalid RSA key for SHA-" + i15 + ": The RSA key may be too short, use a longer key", e15);
        } catch (Exception e16) {
            throw new sn.h(e16.getMessage(), e16);
        }
    }
}
