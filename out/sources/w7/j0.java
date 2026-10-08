package w7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f210695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f210696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f210697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f210698d;

    public j0() {
        this(10);
    }

    private void b(long j15, V v15) {
        int i15 = this.f210697c;
        int i16 = this.f210698d;
        V[] vArr = this.f210696b;
        int length = (i15 + i16) % vArr.length;
        this.f210695a[length] = j15;
        vArr[length] = v15;
        this.f210698d = i16 + 1;
    }

    private void d(long j15) {
        int i15 = this.f210698d;
        if (i15 > 0) {
            if (j15 <= this.f210695a[((this.f210697c + i15) - 1) % this.f210696b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f210696b.length;
        if (this.f210698d < length) {
            return;
        }
        int i15 = length * 2;
        long[] jArr = new long[i15];
        V[] vArr = (V[]) f(i15);
        int i16 = this.f210697c;
        int i17 = length - i16;
        System.arraycopy(this.f210695a, i16, jArr, 0, i17);
        System.arraycopy(this.f210696b, this.f210697c, vArr, 0, i17);
        int i18 = this.f210697c;
        if (i18 > 0) {
            System.arraycopy(this.f210695a, 0, jArr, i17, i18);
            System.arraycopy(this.f210696b, 0, vArr, i17, this.f210697c);
        }
        this.f210695a = jArr;
        this.f210696b = vArr;
        this.f210697c = 0;
    }

    private static <V> V[] f(int i15) {
        return (V[]) new Object[i15];
    }

    private V g(long j15, boolean z15) {
        V vJ = null;
        long j16 = Long.MAX_VALUE;
        while (this.f210698d > 0) {
            long j17 = j15 - this.f210695a[this.f210697c];
            if (j17 < 0 && (z15 || (-j17) >= j16)) {
                break;
            }
            vJ = j();
            j16 = j17;
        }
        return vJ;
    }

    private V j() {
        zj.p.w(this.f210698d > 0);
        V[] vArr = this.f210696b;
        int i15 = this.f210697c;
        V v15 = vArr[i15];
        vArr[i15] = null;
        this.f210697c = (i15 + 1) % vArr.length;
        this.f210698d--;
        return v15;
    }

    public synchronized void a(long j15, V v15) {
        d(j15);
        e();
        b(j15, v15);
    }

    public synchronized void c() {
        this.f210697c = 0;
        this.f210698d = 0;
        Arrays.fill(this.f210696b, (Object) null);
    }

    public synchronized V h() {
        return this.f210698d == 0 ? null : j();
    }

    public synchronized V i(long j15) {
        return g(j15, true);
    }

    public synchronized int k() {
        return this.f210698d;
    }

    public j0(int i15) {
        this.f210695a = new long[i15];
        this.f210696b = (V[]) f(i15);
    }
}
