package un;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f199291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn.a f199292b = new wn.a();

    public k(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The JCA hash algorithm must not be null");
        }
        this.f199291a = str;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return io.e.b(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int b(int i15, int i16) {
        return ((i16 + i15) - 1) / i15;
    }

    public static byte[] e(io.c cVar) {
        return f(cVar != null ? cVar.a() : null);
    }

    public static byte[] f(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return io.e.b(io.i.a(bArr.length), bArr);
    }

    public static byte[] g(int i15) {
        return io.i.a(i15);
    }

    public static byte[] h() {
        return new byte[0];
    }

    private MessageDigest j() throws sn.h {
        Provider providerA = i().a();
        try {
            return providerA == null ? MessageDigest.getInstance(this.f199291a) : MessageDigest.getInstance(this.f199291a, providerA);
        } catch (NoSuchAlgorithmException e15) {
            throw new sn.h("Couldn't get message digest for KDF: " + e15.getMessage(), e15);
        }
    }

    public SecretKey c(SecretKey secretKey, int i15, byte[] bArr) throws sn.h {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest messageDigestJ = j();
        for (int i16 = 1; i16 <= b(io.e.c(messageDigestJ.getDigestLength()), i15); i16++) {
            messageDigestJ.update(io.i.a(i16));
            messageDigestJ.update(secretKey.getEncoded());
            if (bArr != null) {
                messageDigestJ.update(bArr);
            }
            try {
                byteArrayOutputStream.write(messageDigestJ.digest());
            } catch (IOException e15) {
                throw new sn.h("Couldn't write derived key: " + e15.getMessage(), e15);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int iA = io.e.a(i15);
        return byteArray.length == iA ? new SecretKeySpec(byteArray, "AES") : new SecretKeySpec(io.e.e(byteArray, 0, iA), "AES");
    }

    public SecretKey d(SecretKey secretKey, int i15, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return c(secretKey, i15, a(bArr, bArr2, bArr3, bArr4, bArr5));
    }

    public wn.a i() {
        return this.f199292b;
    }
}
