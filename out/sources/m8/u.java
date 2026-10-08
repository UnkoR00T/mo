package m8;

import android.content.Context;
import android.view.Surface;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f124442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f124443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f124444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f124445d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f124448g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f124451j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f124454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f124455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f124456o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f124446e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f124447f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f124449h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f124450i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f124452k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private w7.h f124453l = w7.h.f210683a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f124457p = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f124458a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f124459b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f124458a = -9223372036854775807L;
            this.f124459b = -9223372036854775807L;
        }

        public long f() {
            return this.f124458a;
        }

        public long g() {
            return this.f124459b;
        }
    }

    public interface b {
        boolean D(long j15, long j16);

        boolean H(long j15, long j16, long j17, boolean z15, boolean z16);

        boolean O(long j15, long j16, boolean z15);
    }

    public u(Context context, b bVar, long j15) {
        this.f124442a = bVar;
        this.f124444c = j15;
        this.f124443b = new w(context);
    }

    private long b(long j15, long j16, long j17) {
        long j18 = (long) ((j17 - j15) / ((double) this.f124452k));
        return this.f124445d ? j18 - (o0.J0(this.f124453l.b()) - j16) : j18;
    }

    private void f(int i15) {
        this.f124446e = Math.min(this.f124446e, i15);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[RETURN] */
    private boolean q(long j15, long j16, long j17) {
        if (this.f124450i != -9223372036854775807L && !this.f124451j) {
            return false;
        }
        int i15 = this.f124446e;
        if (i15 == 0) {
            return this.f124445d;
        }
        if (i15 == 1) {
            return true;
        }
        if (i15 == 2) {
            return j15 >= j17;
        }
        if (i15 != 3) {
            throw new IllegalStateException();
        }
        long jJ0 = o0.J0(this.f124453l.b()) - this.f124448g;
        if (this.f124445d) {
            if (!this.f124456o) {
                long j18 = this.f124447f;
                if (j18 != -9223372036854775807L && j18 != j15) {
                    if (this.f124442a.D(j16, jJ0)) {
                        return true;
                    }
                }
            } else if (this.f124442a.D(j16, jJ0)) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (this.f124446e == 0) {
            this.f124446e = 1;
        }
    }

    public int c(long j15, long j16, long j17, long j18, boolean z15, boolean z16, a aVar) {
        aVar.h();
        if (this.f124445d && this.f124447f == -9223372036854775807L) {
            this.f124447f = j16;
        }
        if (this.f124449h != j15) {
            this.f124443b.f(j15);
            this.f124449h = j15;
        }
        aVar.f124458a = b(j16, j17, j15);
        if (z15 && !z16) {
            return 3;
        }
        if (!this.f124454m && this.f124457p) {
            if (this.f124442a.H(aVar.f124458a, j16, j17, z16, true)) {
                return 4;
            }
            if (this.f124445d && aVar.f124458a < 30000) {
                return 3;
            }
            this.f124455n = true;
            return 5;
        }
        if (!this.f124457p) {
            this.f124455n = true;
        }
        if (q(j16, aVar.f124458a, j18)) {
            return 0;
        }
        if (!this.f124445d || j16 == this.f124447f) {
            return 5;
        }
        long jC = this.f124453l.c();
        aVar.f124459b = this.f124443b.a((aVar.f124458a * 1000) + jC, j15);
        aVar.f124458a = (aVar.f124459b - jC) / 1000;
        boolean z17 = (this.f124450i == -9223372036854775807L || this.f124451j) ? false : true;
        if (this.f124442a.H(aVar.f124458a, j16, j17, z16, z17)) {
            return 4;
        }
        if (this.f124442a.O(aVar.f124458a, j17, z16)) {
            return z17 ? 3 : 2;
        }
        return aVar.f124458a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z15) {
        if (z15 && (this.f124446e == 3 || (this.f124455n && (!this.f124454m || !this.f124457p)))) {
            this.f124450i = -9223372036854775807L;
            return true;
        }
        if (this.f124450i == -9223372036854775807L) {
            return false;
        }
        if (this.f124453l.b() < this.f124450i) {
            return true;
        }
        this.f124450i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z15) {
        this.f124451j = z15;
        this.f124450i = this.f124444c > 0 ? this.f124453l.b() + this.f124444c : -9223372036854775807L;
    }

    public boolean g() {
        boolean z15 = this.f124446e != 3;
        this.f124446e = 3;
        this.f124448g = o0.J0(this.f124453l.b());
        return z15;
    }

    public void h() {
        this.f124445d = true;
        this.f124448g = o0.J0(this.f124453l.b());
        this.f124443b.i();
    }

    public void i() {
        this.f124445d = false;
        this.f124450i = -9223372036854775807L;
        this.f124443b.j();
    }

    public void j(int i15) {
        if (i15 == 0) {
            this.f124446e = 1;
        } else if (i15 == 1) {
            this.f124446e = 0;
        } else {
            if (i15 != 2) {
                throw new IllegalStateException();
            }
            f(2);
        }
        this.f124443b.h();
    }

    public void k() {
        this.f124443b.h();
        this.f124449h = -9223372036854775807L;
        this.f124447f = -9223372036854775807L;
        f(1);
        this.f124450i = -9223372036854775807L;
        this.f124455n = false;
    }

    public void l(int i15) {
        this.f124443b.m(i15);
    }

    public void m(w7.h hVar) {
        this.f124453l = hVar;
    }

    public void n(float f15) {
        this.f124443b.e(f15);
    }

    public void o(Surface surface) {
        this.f124454m = surface != null;
        this.f124455n = false;
        this.f124443b.k(surface);
        f(1);
    }

    public void p(float f15) {
        zj.p.d(f15 > 0.0f);
        if (f15 == this.f124452k) {
            return;
        }
        this.f124452k = f15;
        this.f124443b.g(f15);
    }
}
