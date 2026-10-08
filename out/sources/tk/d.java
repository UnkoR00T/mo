package tk;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements fk.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kk.b.EnumC2684b f190547c = kk.b.EnumC2684b.f111285a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Collection<Integer> f190548d = Arrays.asList(64);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f190549e = new byte[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f190550f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f190551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f190552b;

    public d(byte[] bArr) throws GeneralSecurityException {
        if (!f190547c.b()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f190548d.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f190552b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f190551a = new m(bArrCopyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    private byte[] c(byte[]... bArr) throws GeneralSecurityException {
        if (bArr.length == 0) {
            return this.f190551a.a(f190550f, 16);
        }
        byte[] bArrA = this.f190551a.a(f190549e, 16);
        for (int i15 = 0; i15 < bArr.length - 1; i15++) {
            byte[] bArr2 = bArr[i15];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = f.e(pk.a.b(bArrA), this.f190551a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f190551a.a(bArr3.length >= 16 ? f.f(bArr3, bArrA) : f.e(pk.a.a(bArr3), pk.a.b(bArrA)), 16);
    }

    @Override // fk.e
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipherA = i.f190574b.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipherA.init(1, new SecretKeySpec(this.f190552b, "AES"), new IvParameterSpec(bArr3));
        return f.a(bArrC, cipherA.doFinal(bArr));
    }

    @Override // fk.e
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipherA = i.f190574b.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipherA.init(2, new SecretKeySpec(this.f190552b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipherA.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && q.b()) {
            bArrDoFinal = new byte[0];
        }
        if (f.b(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
