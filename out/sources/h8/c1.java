package h8;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends t7.e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f81473r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final t7.s f81474s = new t7.s.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f81475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f81476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f81477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f81478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f81479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f81480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f81481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f81482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f81483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f81484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f81485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t7.s f81486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final t7.s.g f81487q;

    public c1(long j15, boolean z15, boolean z16, boolean z17, Object obj, t7.s sVar) {
        this(j15, j15, 0L, 0L, z15, z16, z17, obj, sVar);
    }

    @Override // t7.e0
    public int b(Object obj) {
        return f81473r.equals(obj) ? 0 : -1;
    }

    @Override // t7.e0
    public t7.e0.b g(int i15, t7.e0.b bVar, boolean z15) {
        zj.p.o(i15, 1);
        return bVar.t(null, z15 ? f81473r : null, 0, this.f81478h, -this.f81480j);
    }

    @Override // t7.e0
    public int i() {
        return 1;
    }

    @Override // t7.e0
    public Object m(int i15) {
        zj.p.o(i15, 1);
        return f81473r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t7.e0
    public t7.e0.c o(int i15, t7.e0.c cVar, long j15) {
        long j16;
        zj.p.o(i15, 1);
        long j17 = this.f81481k;
        boolean z15 = this.f81483m;
        if (!z15 || this.f81484n || j15 == 0) {
            j16 = j17;
        } else {
            long j18 = this.f81479i;
            if (j18 != -9223372036854775807L) {
                j17 += j15;
                if (j17 <= j18) {
                    j16 = j17;
                }
            }
            j16 = -9223372036854775807L;
        }
        return cVar.g(t7.e0.c.f188143q, this.f81486p, this.f81485o, this.f81475e, this.f81476f, this.f81477g, this.f81482l, z15, this.f81487q, j16, this.f81479i, 0, 0, this.f81480j);
    }

    @Override // t7.e0
    public int p() {
        return 1;
    }

    public c1(long j15, long j16, long j17, long j18, boolean z15, boolean z16, boolean z17, Object obj, t7.s sVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j15, j16, j17, j18, z15, z16, false, obj, sVar, z17 ? sVar.f188435d : null);
    }

    public c1(long j15, long j16, long j17, long j18, long j19, long j25, long j26, boolean z15, boolean z16, boolean z17, Object obj, t7.s sVar, t7.s.g gVar) {
        this.f81475e = j15;
        this.f81476f = j16;
        this.f81477g = j17;
        this.f81478h = j18;
        this.f81479i = j19;
        this.f81480j = j25;
        this.f81481k = j26;
        this.f81482l = z15;
        this.f81483m = z16;
        this.f81484n = z17;
        this.f81485o = obj;
        this.f81486p = (t7.s) zj.p.q(sVar);
        this.f81487q = gVar;
    }
}
