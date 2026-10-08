package ik;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tk.i;
import tk.p;
import tk.q;
import tk.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements fk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f93178b = new C2198a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f93179a;

    /* JADX INFO: renamed from: ik.a$a, reason: collision with other inner class name */
    class C2198a extends ThreadLocal<Cipher> {
        C2198a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f190574b.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public a(byte[] bArr) throws InvalidAlgorithmParameterException {
        r.a(bArr.length);
        this.f93179a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec c(byte[] bArr, int i15, int i16) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i15, i16);
        } catch (ClassNotFoundException unused) {
            if (q.b()) {
                return new IvParameterSpec(bArr, i15, i16);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // fk.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrC = p.c(12);
        System.arraycopy(bArrC, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecB = b(bArrC);
        ThreadLocal<Cipher> threadLocal = f93178b;
        threadLocal.get().init(1, this.f93179a, algorithmParameterSpecB);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        int iDoFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    @Override // fk.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 0, 12);
        ThreadLocal<Cipher> threadLocal = f93178b;
        threadLocal.get().init(2, this.f93179a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
    }
}
