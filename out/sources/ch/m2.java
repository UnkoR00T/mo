package ch;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class m2 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f26150a = 0;

    m2() {
    }

    final long b() {
        return this.f26150a;
    }

    @Override // java.io.OutputStream
    public final void write(int i15) {
        this.f26150a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f26150a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i15, int i16) {
        int length;
        int i17;
        if (i15 >= 0 && i15 <= (length = bArr.length) && i16 >= 0 && (i17 = i15 + i16) <= length && i17 >= 0) {
            this.f26150a += (long) i16;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
