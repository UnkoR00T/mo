package tk;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements fk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kk.b.EnumC2684b f190538e = kk.b.EnumC2684b.f111285a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f190539f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f190540g = new C4978b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f190541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f190542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f190543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f190544d;

    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f190574b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    /* JADX INFO: renamed from: tk.b$b, reason: collision with other inner class name */
    class C4978b extends ThreadLocal<Cipher> {
        C4978b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f190574b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public b(byte[] bArr, int i15) throws GeneralSecurityException {
        if (!f190538e.b()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i15 != 12 && i15 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f190544d = i15;
        r.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f190543c = secretKeySpec;
        Cipher cipher = f190539f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.f190541a = bArrB;
        this.f190542b = b(bArrB);
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i15 = 0;
        while (i15 < 15) {
            int i16 = i15 + 1;
            bArr2[i15] = (byte) (((bArr[i15] << 1) ^ ((bArr[i16] & 255) >>> 7)) & GF2Field.MASK);
            i15 = i16;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private byte[] c(Cipher cipher, int i15, byte[] bArr, int i16, int i17) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i15;
        if (i17 == 0) {
            return cipher.doFinal(e(bArr2, this.f190541a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i18 = 0;
        while (i17 - i18 > 16) {
            for (int i19 = 0; i19 < 16; i19++) {
                bArrDoFinal[i19] = (byte) (bArrDoFinal[i19] ^ bArr[(i16 + i18) + i19]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i18 += 16;
        }
        return cipher.doFinal(e(bArrDoFinal, d(Arrays.copyOfRange(bArr, i18 + i16, i16 + i17))));
    }

    private byte[] d(byte[] bArr) {
        if (bArr.length == 16) {
            return e(bArr, this.f190541a);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f190542b, 16);
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArrCopyOf[i15] = (byte) (bArrCopyOf[i15] ^ bArr[i15]);
        }
        bArrCopyOf[bArr.length] = (byte) (bArrCopyOf[bArr.length] ^ 128);
        return bArrCopyOf;
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i15 = 0; i15 < length; i15++) {
            bArr3[i15] = (byte) (bArr[i15] ^ bArr2[i15]);
        }
        return bArr3;
    }

    @Override // fk.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i15 = this.f190544d;
        if (length > 2147483631 - i15) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i15 + 16];
        byte[] bArrC = p.c(i15);
        System.arraycopy(bArrC, 0, bArr3, 0, this.f190544d);
        Cipher cipher = f190539f.get();
        cipher.init(1, this.f190543c);
        byte[] bArrC2 = c(cipher, 0, bArrC, 0, bArrC.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrC3 = c(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f190540g.get();
        cipher2.init(1, this.f190543c, new IvParameterSpec(bArrC2));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f190544d);
        byte[] bArrC4 = c(cipher, 2, bArr3, this.f190544d, bArr.length);
        int length2 = bArr.length + this.f190544d;
        for (int i16 = 0; i16 < 16; i16++) {
            bArr3[length2 + i16] = (byte) ((bArrC3[i16] ^ bArrC2[i16]) ^ bArrC4[i16]);
        }
        return bArr3;
    }

    @Override // fk.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.f190544d) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = f190539f.get();
        cipher.init(1, this.f190543c);
        byte[] bArrC = c(cipher, 0, bArr, 0, this.f190544d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrC2 = c(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrC3 = c(cipher, 2, bArr, this.f190544d, length);
        int length2 = bArr.length - 16;
        byte b15 = 0;
        for (int i15 = 0; i15 < 16; i15++) {
            b15 = (byte) (b15 | (((bArr[length2 + i15] ^ bArrC2[i15]) ^ bArrC[i15]) ^ bArrC3[i15]));
        }
        if (b15 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = f190540g.get();
        cipher2.init(1, this.f190543c, new IvParameterSpec(bArrC));
        return cipher2.doFinal(bArr, this.f190544d, length);
    }
}
