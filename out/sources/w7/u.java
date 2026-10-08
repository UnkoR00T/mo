package w7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f210782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f210783b;

    public u(int i15) {
        this.f210783b = new long[i15];
    }

    public void a(long j15) {
        int i15 = this.f210782a;
        long[] jArr = this.f210783b;
        if (i15 == jArr.length) {
            this.f210783b = Arrays.copyOf(jArr, i15 * 2);
        }
        long[] jArr2 = this.f210783b;
        int i16 = this.f210782a;
        this.f210782a = i16 + 1;
        jArr2[i16] = j15;
    }

    public void b(long[] jArr) {
        int length = this.f210782a + jArr.length;
        long[] jArr2 = this.f210783b;
        if (length > jArr2.length) {
            this.f210783b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f210783b, this.f210782a, jArr.length);
        this.f210782a = length;
    }

    public long c(int i15) {
        if (i15 >= 0 && i15 < this.f210782a) {
            return this.f210783b[i15];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i15 + ", size is " + this.f210782a);
    }

    public int d() {
        return this.f210782a;
    }
}
