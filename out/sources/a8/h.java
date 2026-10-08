package a8;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class h implements a2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ak.n0<String> f4467u = ak.n0.M("file", "content", "data", "android.resource", "rawresource", "asset");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.e0.c f4468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t7.e0.b f4469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k8.f f4470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f4472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f4473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f4474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f4475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f4476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f4477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f4478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f4479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f4480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f4481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f4482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f4483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ak.p0<String, Integer> f4484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ConcurrentHashMap<b8.e2, b> f4485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f4486t;

    private final class a implements k8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<k8.a, b8.e2> f4487a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b8.e2 f4488b;

        public a(b8.e2 e2Var) {
            this.f4488b = e2Var;
        }

        private void f(k8.a aVar) {
            b bVar = (b) h.this.f4485s.get((b8.e2) zj.p.q(this.f4487a.remove(aVar)));
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // k8.b
        public synchronized k8.a a() {
            k8.a aVarA;
            aVarA = h.this.f4470d.a();
            this.f4487a.put(aVarA, this.f4488b);
            b bVar = (b) h.this.f4485s.get(this.f4488b);
            if (bVar != null) {
                bVar.c();
            }
            return aVarA;
        }

        @Override // k8.b
        public synchronized void b() {
            h.this.f4470d.b();
        }

        @Override // k8.b
        public synchronized void c(k8.b.a aVar) {
            h.this.f4470d.c(aVar);
            while (aVar != null) {
                f(aVar.a());
                aVar = aVar.next();
            }
        }

        @Override // k8.b
        public synchronized void d(k8.a aVar) {
            h.this.f4470d.d(aVar);
            f(aVar);
        }

        @Override // k8.b
        public synchronized int e() {
            return h.this.f4470d.e();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4490a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4493d;

        public synchronized void a() {
            this.f4493d--;
        }

        public synchronized int b() {
            return this.f4493d;
        }

        public synchronized void c() {
            this.f4493d++;
        }
    }

    public h() {
        this(new k8.f(true, PKIFailureInfo.notAuthorized), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, -1, false, true, 0, false);
    }

    private static int A(int i15, boolean z15) {
        switch (i15) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return z15 ? 19660800 : 131072000;
            case 3:
                return PKIFailureInfo.unsupportedVersion;
            case 4:
                return 26214400;
            case 5:
            case 6:
                return PKIFailureInfo.unsupportedVersion;
            default:
                throw new IllegalArgumentException();
        }
    }

    private long B(boolean z15) {
        return z15 ? this.f4474h : this.f4473g;
    }

    private long C(boolean z15) {
        return z15 ? this.f4472f : this.f4471e;
    }

    private int D(b8.e2 e2Var) {
        return ((b) zj.p.q(this.f4485s.get(e2Var))).f4492c;
    }

    private int E(b8.e2 e2Var) {
        Integer num = this.f4484r.get(e2Var.f17363a);
        return (num == null || num.intValue() == -1) ? this.f4479m : num.intValue();
    }

    private int F(b8.e2 e2Var) {
        return ((b) zj.p.q(this.f4485s.get(e2Var))).b() * this.f4470d.e();
    }

    private boolean G(a2.a aVar) {
        t7.s.h hVar = aVar.f4222b.n(aVar.f4222b.h(aVar.f4223c.f81468a, this.f4469c).f188138c, this.f4468b).f188155c.f188433b;
        if (hVar == null) {
            return false;
        }
        String scheme = hVar.f188528a.getScheme();
        return TextUtils.isEmpty(scheme) || f4467u.contains(scheme);
    }

    private boolean H(boolean z15) {
        return z15 ? this.f4481o : this.f4480n;
    }

    private void I(b8.e2 e2Var) {
        b bVar = this.f4485s.get(e2Var);
        if (bVar != null) {
            int i15 = bVar.f4490a - 1;
            bVar.f4490a = i15;
            if (i15 == 0) {
                this.f4485s.remove(e2Var);
                K();
            }
        }
    }

    private void J(b8.e2 e2Var) {
        b bVar = (b) zj.p.q(this.f4485s.get(e2Var));
        int iE = E(e2Var);
        if (iE == -1) {
            iE = 13107200;
        }
        bVar.f4492c = iE;
        bVar.f4491b = false;
    }

    private void K() {
        if (this.f4485s.isEmpty()) {
            this.f4470d.f();
        } else {
            this.f4470d.g(x());
        }
    }

    private static void u(int i15, int i16, String str, String str2) {
        zj.p.m(i15 >= i16, "%s cannot be less than %s", str, str2);
    }

    private long y(boolean z15) {
        return z15 ? this.f4478l : this.f4477k;
    }

    private long z(boolean z15) {
        return z15 ? this.f4476j : this.f4475i;
    }

    @Override // a8.a2
    public boolean d(b8.e2 e2Var, t7.e0 e0Var, h8.c0.b bVar, long j15) {
        Iterator<b> it = this.f4485s.values().iterator();
        while (it.hasNext()) {
            if (it.next().f4491b) {
                return false;
            }
        }
        return true;
    }

    @Override // a8.a2
    public boolean h(a2.a aVar) {
        b8.e2 e2Var = aVar.f4221a;
        b bVar = (b) zj.p.q(this.f4485s.get(e2Var));
        boolean z15 = F(e2Var) >= D(e2Var);
        if (e2Var.equals(b8.e2.f17362d)) {
            return !z15;
        }
        boolean zG = G(aVar);
        long jC = C(zG);
        long jB = B(zG);
        float f15 = aVar.f4226f;
        if (f15 > 1.0f) {
            jC = Math.min(w7.o0.b0(jC, f15), jB);
        }
        long jMax = Math.max(jC, 500000L);
        long j15 = aVar.f4225e;
        if (j15 < jMax) {
            boolean z16 = H(zG) || !z15;
            bVar.f4491b = z16;
            if (!z16 && aVar.f4225e < 500000) {
                w7.t.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j15 >= jB || z15) {
            bVar.f4491b = false;
        }
        return bVar.f4491b;
    }

    @Override // a8.a2
    public boolean i(a2.a aVar) {
        boolean zG = G(aVar);
        long jH0 = w7.o0.h0(aVar.f4225e, aVar.f4226f);
        long jY = aVar.f4228h ? y(zG) : z(zG);
        long j15 = aVar.f4229i;
        if (j15 != -9223372036854775807L) {
            jY = Math.min(j15 / 2, jY);
        }
        if (jY <= 0 || jH0 >= jY) {
            return true;
        }
        return !H(zG) && F(aVar.f4221a) >= D(aVar.f4221a);
    }

    @Override // a8.a2
    public long j(b8.e2 e2Var) {
        return this.f4482p;
    }

    @Override // a8.a2
    public k8.b k(b8.e2 e2Var) {
        return new a(e2Var);
    }

    @Override // a8.a2
    public void n(b8.e2 e2Var) {
        I(e2Var);
    }

    @Override // a8.a2
    public void o(b8.e2 e2Var) {
        long id5 = Thread.currentThread().getId();
        long j15 = this.f4486t;
        zj.p.x(j15 == -1 || j15 == id5, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f4486t = id5;
        b bVar = this.f4485s.get(e2Var);
        if (bVar == null) {
            this.f4485s.put(e2Var, new b());
        } else {
            bVar.f4490a++;
        }
        J(e2Var);
    }

    @Override // a8.a2
    public boolean p(b8.e2 e2Var) {
        return this.f4483q;
    }

    @Override // a8.a2
    public void q(a2.a aVar, h8.j1 j1Var, j8.r[] rVarArr) {
        int iE = E(aVar.f4221a);
        b bVar = (b) zj.p.q(this.f4485s.get(aVar.f4221a));
        if (iE == -1) {
            iE = v(aVar, rVarArr);
        }
        bVar.f4492c = iE;
        K();
    }

    @Override // a8.a2
    public void r(b8.e2 e2Var) {
        I(e2Var);
        if (this.f4485s.isEmpty()) {
            this.f4486t = -1L;
        }
    }

    protected int v(a2.a aVar, j8.r[] rVarArr) {
        int iW = w(rVarArr);
        if (iW != -1) {
            return iW;
        }
        boolean zG = G(aVar);
        int iA = 0;
        for (j8.r rVar : rVarArr) {
            if (rVar != null) {
                iA += A(rVar.i().f188179c, zG);
            }
        }
        return w7.o0.o(iA, 13107200, 210239488);
    }

    @Deprecated
    protected int w(j8.r[] rVarArr) {
        return -1;
    }

    int x() {
        Iterator<b> it = this.f4485s.values().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            i15 += it.next().f4492c;
        }
        return i15;
    }

    protected h(k8.f fVar, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, boolean z15, boolean z16, int i29, boolean z17, Map<String, Integer> map) {
        u(i19, 0, "bufferForPlaybackMs", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
        u(i25, 0, "bufferForPlaybackForLocalPlaybackMs", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
        u(i26, 0, "bufferForPlaybackAfterRebufferMs", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
        u(i27, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
        u(i15, i19, "minBufferMs", "bufferForPlaybackMs");
        u(i16, i25, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        u(i15, i26, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        u(i16, i27, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        u(i17, i15, "maxBufferMs", "minBufferMs");
        u(i18, i16, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        u(i29, 0, "backBufferDurationMs", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
        this.f4468b = new t7.e0.c();
        this.f4469c = new t7.e0.b();
        this.f4470d = fVar;
        this.f4471e = w7.o0.J0(i15);
        this.f4472f = w7.o0.J0(i16);
        this.f4473g = w7.o0.J0(i17);
        this.f4474h = w7.o0.J0(i18);
        this.f4475i = w7.o0.J0(i19);
        this.f4476j = w7.o0.J0(i25);
        this.f4477k = w7.o0.J0(i26);
        this.f4478l = w7.o0.J0(i27);
        this.f4479m = i28;
        this.f4480n = z15;
        this.f4481o = z16;
        this.f4482p = w7.o0.J0(i29);
        this.f4483q = z17;
        this.f4485s = new ConcurrentHashMap<>();
        this.f4484r = ak.p0.d(map);
        this.f4486t = -1L;
    }

    protected h(k8.f fVar, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, boolean z15, boolean z16, int i29, boolean z17) {
        this(fVar, i15, i16, i17, i18, i19, i25, i26, i27, i28, z15, z16, i29, z17, ak.p0.m());
    }
}
