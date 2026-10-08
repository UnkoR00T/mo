package a8;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class v2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final h8.c0.b f4648u = new h8.c0.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7.e0 f4649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h8.c0.b f4650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f4654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h8.j1 f4656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j8.y f4657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<t7.v> f4658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h8.c0.b f4659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t7.z f4663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f4664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f4665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f4666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f4667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f4668t;

    public v2(t7.e0 e0Var, h8.c0.b bVar, long j15, long j16, int i15, w wVar, boolean z15, h8.j1 j1Var, j8.y yVar, List<t7.v> list, h8.c0.b bVar2, boolean z16, int i16, int i17, t7.z zVar, long j17, long j18, long j19, long j25, boolean z17) {
        this.f4649a = e0Var;
        this.f4650b = bVar;
        this.f4651c = j15;
        this.f4652d = j16;
        this.f4653e = i15;
        this.f4654f = wVar;
        this.f4655g = z15;
        this.f4656h = j1Var;
        this.f4657i = yVar;
        this.f4658j = list;
        this.f4659k = bVar2;
        this.f4660l = z16;
        this.f4661m = i16;
        this.f4662n = i17;
        this.f4663o = zVar;
        this.f4665q = j17;
        this.f4666r = j18;
        this.f4667s = j19;
        this.f4668t = j25;
        this.f4664p = z17;
    }

    public static v2 k(j8.y yVar) {
        t7.e0 e0Var = t7.e0.f188127a;
        h8.c0.b bVar = f4648u;
        return new v2(e0Var, bVar, -9223372036854775807L, 0L, 1, null, false, h8.j1.f81614d, yVar, ak.n0.C(), bVar, false, 1, 0, t7.z.f188660d, 0L, 0L, 0L, 0L, false);
    }

    public static h8.c0.b l() {
        return f4648u;
    }

    public v2 a() {
        return new v2(this.f4649a, this.f4650b, this.f4651c, this.f4652d, this.f4653e, this.f4654f, this.f4655g, this.f4656h, this.f4657i, this.f4658j, this.f4659k, this.f4660l, this.f4661m, this.f4662n, this.f4663o, this.f4665q, this.f4666r, m(), SystemClock.elapsedRealtime(), this.f4664p);
    }

    public v2 b(boolean z15) {
        return new v2(this.f4649a, this.f4650b, this.f4651c, this.f4652d, this.f4653e, this.f4654f, z15, this.f4656h, this.f4657i, this.f4658j, this.f4659k, this.f4660l, this.f4661m, this.f4662n, this.f4663o, this.f4665q, this.f4666r, this.f4667s, this.f4668t, this.f4664p);
    }

    public v2 c(h8.c0.b bVar) {
        return new v2(this.f4649a, this.f4650b, this.f4651c, this.f4652d, this.f4653e, this.f4654f, this.f4655g, this.f4656h, this.f4657i, this.f4658j, bVar, this.f4660l, this.f4661m, this.f4662n, this.f4663o, this.f4665q, this.f4666r, this.f4667s, this.f4668t, this.f4664p);
    }

    public v2 d(h8.c0.b bVar, long j15, long j16, long j17, long j18, h8.j1 j1Var, j8.y yVar, List<t7.v> list) {
        return new v2(this.f4649a, bVar, j16, j17, this.f4653e, this.f4654f, this.f4655g, j1Var, yVar, list, this.f4659k, this.f4660l, this.f4661m, this.f4662n, this.f4663o, this.f4665q, j18, j15, SystemClock.elapsedRealtime(), this.f4664p);
    }

    public v2 e(boolean z15, int i15, int i16) {
        return new v2(this.f4649a, this.f4650b, this.f4651c, this.f4652d, this.f4653e, this.f4654f, this.f4655g, this.f4656h, this.f4657i, this.f4658j, this.f4659k, z15, i15, i16, this.f4663o, this.f4665q, this.f4666r, this.f4667s, this.f4668t, this.f4664p);
    }

    public v2 f(w wVar) {
        return new v2(this.f4649a, this.f4650b, this.f4651c, this.f4652d, this.f4653e, wVar, this.f4655g, this.f4656h, this.f4657i, this.f4658j, this.f4659k, this.f4660l, this.f4661m, this.f4662n, this.f4663o, this.f4665q, this.f4666r, this.f4667s, this.f4668t, this.f4664p);
    }

    public v2 g(t7.z zVar) {
        return new v2(this.f4649a, this.f4650b, this.f4651c, this.f4652d, this.f4653e, this.f4654f, this.f4655g, this.f4656h, this.f4657i, this.f4658j, this.f4659k, this.f4660l, this.f4661m, this.f4662n, zVar, this.f4665q, this.f4666r, this.f4667s, this.f4668t, this.f4664p);
    }

    public v2 h(int i15) {
        return new v2(this.f4649a, this.f4650b, this.f4651c, this.f4652d, i15, this.f4654f, this.f4655g, this.f4656h, this.f4657i, this.f4658j, this.f4659k, this.f4660l, this.f4661m, this.f4662n, this.f4663o, this.f4665q, this.f4666r, this.f4667s, this.f4668t, this.f4664p);
    }

    public v2 i(boolean z15) {
        return new v2(this.f4649a, this.f4650b, this.f4651c, this.f4652d, this.f4653e, this.f4654f, this.f4655g, this.f4656h, this.f4657i, this.f4658j, this.f4659k, this.f4660l, this.f4661m, this.f4662n, this.f4663o, this.f4665q, this.f4666r, this.f4667s, this.f4668t, z15);
    }

    public v2 j(t7.e0 e0Var) {
        return new v2(e0Var, this.f4650b, this.f4651c, this.f4652d, this.f4653e, this.f4654f, this.f4655g, this.f4656h, this.f4657i, this.f4658j, this.f4659k, this.f4660l, this.f4661m, this.f4662n, this.f4663o, this.f4665q, this.f4666r, this.f4667s, this.f4668t, this.f4664p);
    }

    public long m() {
        long j15;
        long j16;
        if (!n()) {
            return this.f4667s;
        }
        do {
            j15 = this.f4668t;
            j16 = this.f4667s;
        } while (j15 != this.f4668t);
        return w7.o0.J0(w7.o0.g1(j16) + ((long) ((SystemClock.elapsedRealtime() - j15) * this.f4663o.f188663a)));
    }

    public boolean n() {
        return this.f4653e == 3 && this.f4660l && this.f4662n == 0;
    }

    public void o(long j15) {
        this.f4667s = j15;
        this.f4668t = SystemClock.elapsedRealtime();
    }
}
