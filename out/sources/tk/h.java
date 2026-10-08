package tk;

import fk.t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements fk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f190571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f190572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f190573c;

    public h(l lVar, t tVar, int i15) {
        this.f190571a = lVar;
        this.f190572b = tVar;
        this.f190573c = i15;
    }

    @Override // fk.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrEncrypt = this.f190571a.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(bArrEncrypt, this.f190572b.b(f.a(bArr2, bArrEncrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // fk.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i15 = this.f190573c;
        if (length < i15) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i15);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f190573c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f190572b.a(bArrCopyOfRange2, f.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f190571a.a(bArrCopyOfRange);
    }
}
