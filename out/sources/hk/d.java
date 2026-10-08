package hk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes4.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f85156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f85157b;

    public d(byte[] bArr, int i15) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f85156a = a.e(bArr);
        this.f85157b = i15;
    }

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int iRemaining = byteBuffer2.remaining();
        int i15 = iRemaining / 64;
        int i16 = i15 + 1;
        for (int i17 = 0; i17 < i16; i17++) {
            ByteBuffer byteBufferA = a(bArr, this.f85157b + i17);
            if (i17 == i15) {
                tk.f.c(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                tk.f.c(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    ByteBuffer a(byte[] bArr, int i15) {
        int[] iArrB = b(a.e(bArr), i15);
        int[] iArr = (int[]) iArrB.clone();
        a.d(iArr);
        for (int i16 = 0; i16 < iArrB.length; i16++) {
            iArrB[i16] = iArrB[i16] + iArr[i16];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    abstract int[] b(int[] iArr, int i15);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    abstract int e();
}
