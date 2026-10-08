package w7;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f210787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f210788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f210789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f210790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f210791e;

    public v() {
        this(16);
    }

    private void c() {
        long[] jArr = this.f210790d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i15 = this.f210787a;
        int i16 = length2 - i15;
        System.arraycopy(jArr, i15, jArr2, 0, i16);
        System.arraycopy(this.f210790d, 0, jArr2, i16, i15);
        this.f210787a = 0;
        this.f210788b = this.f210789c - 1;
        this.f210790d = jArr2;
        this.f210791e = jArr2.length - 1;
    }

    public void a(long j15) {
        if (this.f210789c == this.f210790d.length) {
            c();
        }
        int i15 = (this.f210788b + 1) & this.f210791e;
        this.f210788b = i15;
        this.f210790d[i15] = j15;
        this.f210789c++;
    }

    public void b() {
        this.f210787a = 0;
        this.f210788b = -1;
        this.f210789c = 0;
    }

    public long d() {
        if (this.f210789c != 0) {
            return this.f210790d[this.f210787a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f210789c == 0;
    }

    public long f() {
        int i15 = this.f210789c;
        if (i15 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f210790d;
        int i16 = this.f210787a;
        long j15 = jArr[i16];
        this.f210787a = this.f210791e & (i16 + 1);
        this.f210789c = i15 - 1;
        return j15;
    }

    public v(int i15) {
        zj.p.d(i15 >= 0 && i15 <= 1073741824);
        i15 = i15 == 0 ? 1 : i15;
        i15 = Integer.bitCount(i15) != 1 ? Integer.highestOneBit(i15 - 1) << 1 : i15;
        this.f210787a = 0;
        this.f210788b = -1;
        this.f210789c = 0;
        long[] jArr = new long[i15];
        this.f210790d = jArr;
        this.f210791e = jArr.length - 1;
    }
}
