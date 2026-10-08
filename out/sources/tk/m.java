package tk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements rk.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kk.b.EnumC2684b f190585d = kk.b.EnumC2684b.f111285a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f190586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f190587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f190588c;

    public m(byte[] bArr) throws GeneralSecurityException {
        r.a(bArr.length);
        this.f190586a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() throws GeneralSecurityException {
        Cipher cipherC = c();
        cipherC.init(1, this.f190586a);
        byte[] bArrB = pk.a.b(cipherC.doFinal(new byte[16]));
        this.f190587b = bArrB;
        this.f190588c = pk.a.b(bArrB);
    }

    private static Cipher c() throws GeneralSecurityException {
        if (f190585d.b()) {
            return i.f190574b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // rk.a
    public byte[] a(byte[] bArr, int i15) throws GeneralSecurityException {
        if (i15 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherC = c();
        cipherC.init(1, this.f190586a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        byte[] bArrD = iMax * 16 == bArr.length ? f.d(bArr, (iMax - 1) * 16, this.f190587b, 0, 16) : f.e(pk.a.a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.f190588c);
        byte[] bArrDoFinal = new byte[16];
        for (int i16 = 0; i16 < iMax - 1; i16++) {
            bArrDoFinal = cipherC.doFinal(f.d(bArrDoFinal, 0, bArr, i16 * 16, 16));
        }
        return Arrays.copyOf(cipherC.doFinal(f.e(bArrD, bArrDoFinal)), i15);
    }
}
