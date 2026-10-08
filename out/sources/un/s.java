package un;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f199302a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f199303b = {0, 0, 0, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f199304c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f199305d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey a(SecretKey secretKey, sn.f fVar, byte[] bArr, byte[] bArr2) throws sn.h {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f199302a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(io.i.a(length / 2));
            byteArrayOutputStream.write(fVar.toString().getBytes(io.m.f93605a));
            if (bArr != null) {
                byteArrayOutputStream.write(io.i.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f199303b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(io.i.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f199303b);
            }
            byteArrayOutputStream.write(f199304c);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray());
                int length2 = bArrDigest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArrDigest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e15) {
                throw new sn.h(e15.getMessage(), e15);
            }
        } catch (IOException e16) {
            throw new sn.h(e16.getMessage(), e16);
        }
    }

    public static SecretKey b(SecretKey secretKey, sn.f fVar, byte[] bArr, byte[] bArr2) throws sn.h {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f199302a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(io.i.a(length));
            byteArrayOutputStream.write(fVar.toString().getBytes(io.m.f93605a));
            if (bArr != null) {
                byteArrayOutputStream.write(io.i.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f199303b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(io.i.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f199303b);
            }
            byteArrayOutputStream.write(f199305d);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e15) {
                throw new sn.h(e15.getMessage(), e15);
            }
        } catch (IOException e16) {
            throw new sn.h(e16.getMessage(), e16);
        }
    }
}
