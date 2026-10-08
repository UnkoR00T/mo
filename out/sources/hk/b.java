package hk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tk.q;
import tk.r;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kk.b.EnumC2684b f85152c = kk.b.EnumC2684b.f111286b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f85153d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f85154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f85155b;

    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return tk.i.f190574b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public b(byte[] bArr, boolean z15) throws GeneralSecurityException {
        if (!f85152c.b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f85154a = new SecretKeySpec(bArr, "AES");
        this.f85155b = z15;
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i15, int i16) {
        return (!q.b() || q.a() > 19) ? new GCMParameterSpec(128, bArr, i15, i16) : new IvParameterSpec(bArr, i15, i16);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z15 = this.f85155b;
        if (bArr2.length < (z15 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z15 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr);
        ThreadLocal<Cipher> threadLocal = f85153d;
        threadLocal.get().init(2, this.f85154a, algorithmParameterSpecC);
        if (bArr3 != null && bArr3.length != 0) {
            threadLocal.get().updateAAD(bArr3);
        }
        boolean z16 = this.f85155b;
        return threadLocal.get().doFinal(bArr2, z16 ? 12 : 0, z16 ? bArr2.length - 12 : bArr2.length);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z15 = this.f85155b;
        byte[] bArr4 = new byte[z15 ? bArr2.length + 28 : bArr2.length + 16];
        if (z15) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr);
        ThreadLocal<Cipher> threadLocal = f85153d;
        threadLocal.get().init(1, this.f85154a, algorithmParameterSpecC);
        if (bArr3 != null && bArr3.length != 0) {
            threadLocal.get().updateAAD(bArr3);
        }
        int iDoFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, this.f85155b ? 12 : 0);
        if (iDoFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr2.length)));
    }
}
