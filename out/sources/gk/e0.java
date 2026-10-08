package gk;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements fk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f73319c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sk.a0 f73320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fk.a f73321b;

    public e0(sk.a0 a0Var, fk.a aVar) {
        this.f73320a = a0Var;
        this.f73321b = aVar;
    }

    private byte[] b(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // fk.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = fk.x.j(this.f73320a).toByteArray();
        return b(this.f73321b.a(byteArray, f73319c), ((fk.a) fk.x.f(this.f73320a.b0(), byteArray, fk.a.class)).a(bArr, bArr2));
    }

    @Override // fk.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i15 = byteBufferWrap.getInt();
            if (i15 <= 0 || i15 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i15];
            byteBufferWrap.get(bArr3, 0, i15);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((fk.a) fk.x.f(this.f73320a.b0(), this.f73321b.decrypt(bArr3, f73319c), fk.a.class)).decrypt(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e15) {
            e = e15;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e16) {
            e = e16;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e17) {
            e = e17;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
