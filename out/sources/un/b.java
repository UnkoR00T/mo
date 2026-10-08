package un;

import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    private static Cipher a(SecretKey secretKey, boolean z15, byte[] bArr, Provider provider) throws sn.h {
        try {
            Cipher cipherA = i.a("AES/CBC/PKCS5Padding", provider);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z15) {
                cipherA.init(1, secretKeySpec, ivParameterSpec);
                return cipherA;
            }
            cipherA.init(2, secretKeySpec, ivParameterSpec);
            return cipherA;
        } catch (Exception e15) {
            throw new sn.h(e15.getMessage(), e15);
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws sn.h {
        try {
            return a(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e15) {
            throw new sn.h(e15.getMessage(), e15);
        }
    }

    public static g c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) throws sn.h {
        j jVar = new j(secretKey);
        byte[] bArrB = b(jVar.a(), bArr, bArr2, provider);
        byte[] bArrC = a.c(bArr3);
        return new g(bArrB, Arrays.copyOf(q.b(jVar.b(), ByteBuffer.allocate(bArr3.length + bArr.length + bArrB.length + bArrC.length).put(bArr3).put(bArr).put(bArrB).put(bArrC).array(), provider2), jVar.c()));
    }

    public static g d(sn.n nVar, SecretKey secretKey, io.c cVar, byte[] bArr, byte[] bArr2, Provider provider, Provider provider2) throws sn.h {
        byte[] bArrA = nVar.d("epu") instanceof String ? new io.c((String) nVar.d("epu")).a() : null;
        byte[] bArrA2 = nVar.d("epv") instanceof String ? new io.c((String) nVar.d("epv")).a() : null;
        byte[] bArrB = b(s.a(secretKey, nVar.B(), bArrA, bArrA2), bArr, bArr2, provider);
        return new g(bArrB, q.b(s.b(secretKey, nVar.B(), bArrA, bArrA2), (nVar.h() + "." + cVar + "." + io.c.h(bArr) + "." + io.c.h(bArrB)).getBytes(io.m.f93605a), provider2));
    }

    public static byte[] e(SecureRandom secureRandom) {
        byte[] bArr = new byte[io.e.a(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
