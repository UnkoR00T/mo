package tk;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kk.b.EnumC2684b f190533d = kk.b.EnumC2684b.f111286b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f190534e = new C4977a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f190535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f190536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f190537c;

    /* JADX INFO: renamed from: tk.a$a, reason: collision with other inner class name */
    class C4977a extends ThreadLocal<Cipher> {
        C4977a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f190574b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public a(byte[] bArr, int i15) throws GeneralSecurityException {
        if (!f190533d.b()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f190535a = new SecretKeySpec(bArr, "AES");
        int blockSize = f190534e.get().getBlockSize();
        this.f190537c = blockSize;
        if (i15 < 12 || i15 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f190536b = i15;
    }

    private void b(byte[] bArr, int i15, int i16, byte[] bArr2, int i17, byte[] bArr3, boolean z15) throws GeneralSecurityException {
        Cipher cipher = f190534e.get();
        byte[] bArr4 = new byte[this.f190537c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f190536b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z15) {
            cipher.init(1, this.f190535a, ivParameterSpec);
        } else {
            cipher.init(2, this.f190535a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i15, i16, bArr2, i17) != i16) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // tk.l
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i15 = this.f190536b;
        if (length < i15) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, 0, bArr2, 0, i15);
        int length2 = bArr.length;
        int i16 = this.f190536b;
        byte[] bArr3 = new byte[length2 - i16];
        b(bArr, i16, bArr.length - i16, bArr3, 0, bArr2, false);
        return bArr3;
    }

    @Override // tk.l
    public byte[] encrypt(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i15 = this.f190536b;
        if (length > Integer.MAX_VALUE - i15) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f190536b));
        }
        byte[] bArr2 = new byte[bArr.length + i15];
        byte[] bArrC = p.c(i15);
        System.arraycopy(bArrC, 0, bArr2, 0, this.f190536b);
        b(bArr, 0, bArr.length, bArr2, this.f190536b, bArrC, true);
        return bArr2;
    }
}
