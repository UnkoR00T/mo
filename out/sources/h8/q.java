package h8;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f81666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y7.f.a f81667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l9.s.a f81668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c0.a f81669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f81670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k8.j f81671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f81672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f81673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f81674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f81675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f81676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f81677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f81678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f81679p;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o8.u f81680a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private y7.f.a f81683d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private l9.s.a f81685f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f81687h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private k8.e f81688i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private d8.w f81689j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private k8.j f81690k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private zj.w<l8.a> f81691l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Integer, zj.w<c0.a>> f81681b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<Integer, c0.a> f81682c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f81684e = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f81686g = 3;

        public a(o8.u uVar, l9.s.a aVar) {
            this.f81680a = uVar;
            this.f81685f = aVar;
        }

        public static /* synthetic */ c0.a c(a aVar, y7.f.a aVar2) {
            aVar.getClass();
            return new u0.b(aVar2, aVar.f81680a).n(aVar.f81687h);
        }

        private zj.w<c0.a> h(int i15) {
            zj.w<c0.a> wVar;
            zj.w<c0.a> wVar2;
            zj.w<c0.a> wVar3 = this.f81681b.get(Integer.valueOf(i15));
            if (wVar3 != null) {
                return wVar3;
            }
            final y7.f.a aVar = (y7.f.a) zj.p.q(this.f81683d);
            if (i15 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(c0.a.class);
                wVar = new zj.w() { // from class: h8.l
                    @Override // zj.w
                    public final Object get() {
                        return q.q(clsAsSubclass, aVar);
                    }
                };
            } else {
                if (i15 != 1) {
                    if (i15 == 2) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(c0.a.class);
                        wVar = new zj.w() { // from class: h8.n
                            @Override // zj.w
                            public final Object get() {
                                return q.q(clsAsSubclass2, aVar);
                            }
                        };
                    } else if (i15 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(c0.a.class);
                        wVar2 = new zj.w() { // from class: h8.o
                            @Override // zj.w
                            public final Object get() {
                                return q.p(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i15 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i15);
                        }
                        wVar2 = new zj.w() { // from class: h8.p
                            @Override // zj.w
                            public final Object get() {
                                return q.a.c(this.f81663a, aVar);
                            }
                        };
                    }
                    this.f81681b.put(Integer.valueOf(i15), wVar2);
                    return wVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(c0.a.class);
                wVar = new zj.w() { // from class: h8.m
                    @Override // zj.w
                    public final Object get() {
                        return q.q(clsAsSubclass4, aVar);
                    }
                };
            }
            wVar2 = wVar;
            this.f81681b.put(Integer.valueOf(i15), wVar2);
            return wVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(int i15) {
            o8.u uVar = this.f81680a;
            if (uVar instanceof o8.m) {
                ((o8.m) uVar).n(i15);
            }
        }

        public c0.a g(int i15) {
            c0.a aVar = this.f81682c.get(Integer.valueOf(i15));
            if (aVar != null) {
                return aVar;
            }
            c0.a aVar2 = h(i15).get();
            k8.e eVar = this.f81688i;
            if (eVar != null) {
                aVar2.h(eVar);
            }
            d8.w wVar = this.f81689j;
            if (wVar != null) {
                aVar2.c(wVar);
            }
            k8.j jVar = this.f81690k;
            if (jVar != null) {
                aVar2.e(jVar);
            }
            zj.w<l8.a> wVar2 = this.f81691l;
            if (wVar2 != null) {
                aVar2.g(wVar2);
            }
            aVar2.a(this.f81685f);
            aVar2.f(this.f81684e);
            aVar2.b(this.f81686g);
            this.f81682c.put(Integer.valueOf(i15), aVar2);
            return aVar2;
        }

        public void i(k8.e eVar) {
            this.f81688i = eVar;
            Iterator<c0.a> it = this.f81682c.values().iterator();
            while (it.hasNext()) {
                it.next().h(eVar);
            }
        }

        public void j(int i15) {
            this.f81686g = i15;
            this.f81680a.b(i15);
        }

        public void k(y7.f.a aVar) {
            if (aVar != this.f81683d) {
                this.f81683d = aVar;
                this.f81681b.clear();
                this.f81682c.clear();
            }
        }

        public void l(zj.w<l8.a> wVar) {
            this.f81691l = wVar;
            Iterator<c0.a> it = this.f81682c.values().iterator();
            while (it.hasNext()) {
                it.next().g(wVar);
            }
        }

        public void m(d8.w wVar) {
            this.f81689j = wVar;
            Iterator<c0.a> it = this.f81682c.values().iterator();
            while (it.hasNext()) {
                it.next().c(wVar);
            }
        }

        public void o(int i15) {
            o8.u uVar = this.f81680a;
            if (uVar instanceof o8.m) {
                ((o8.m) uVar).o(i15);
            }
        }

        public void p(k8.j jVar) {
            this.f81690k = jVar;
            Iterator<c0.a> it = this.f81682c.values().iterator();
            while (it.hasNext()) {
                it.next().e(jVar);
            }
        }

        public void q(boolean z15) {
            this.f81684e = z15;
            this.f81680a.c(z15);
            Iterator<c0.a> it = this.f81682c.values().iterator();
            while (it.hasNext()) {
                it.next().f(z15);
            }
        }

        public void r(l9.s.a aVar) {
            this.f81685f = aVar;
            this.f81680a.a(aVar);
            Iterator<c0.a> it = this.f81682c.values().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements o8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t7.p f81692a;

        public b(t7.p pVar) {
            this.f81692a = pVar;
        }

        @Override // o8.p
        public void a(long j15, long j16) {
        }

        @Override // o8.p
        public void b() {
        }

        @Override // o8.p
        public boolean c(o8.q qVar) {
            return true;
        }

        @Override // o8.p
        public void d(o8.r rVar) {
            o8.s0 s0VarV = rVar.v(0, 3);
            rVar.f(new o8.l0.b(-9223372036854775807L));
            rVar.s();
            s0VarV.e(this.f81692a.b().A0("text/x-unknown").V(this.f81692a.f188381p).Q());
        }

        @Override // o8.p
        public int g(o8.q qVar, o8.k0 k0Var) {
            return qVar.b(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }
    }

    public q(Context context, o8.u uVar) {
        this(new y7.k.a(context), uVar);
    }

    public static /* synthetic */ o8.p[] i(q qVar, t7.p pVar) {
        return new o8.p[]{qVar.f81668e.a(pVar) ? new l9.o(qVar.f81668e.b(pVar), null) : new b(pVar)};
    }

    private static c0 n(t7.s sVar, c0 c0Var, boolean z15) {
        t7.s.d dVar = sVar.f188437f;
        return (dVar.f188463b == 0 && dVar.f188465d == Long.MIN_VALUE && !dVar.f188467f) ? c0Var : new e.b(c0Var).p(sVar.f188437f.f188463b).n(sVar.f188437f.f188465d).m(!sVar.f188437f.f188468g).j(sVar.f188437f.f188466e).o(sVar.f188437f.f188467f).k(sVar.f188437f.f188469h).l(z15).i();
    }

    private c0 o(t7.s sVar, c0 c0Var) {
        zj.p.q(sVar.f188433b);
        sVar.f188433b.getClass();
        return c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c0.a p(Class<? extends c0.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e15) {
            throw new IllegalStateException(e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c0.a q(Class<? extends c0.a> cls, y7.f.a aVar) {
        try {
            return cls.getConstructor(y7.f.a.class).newInstance(aVar);
        } catch (Exception e15) {
            throw new IllegalStateException(e15);
        }
    }

    @Override // h8.c0.a
    public c0 d(t7.s sVar) {
        zj.p.q(sVar.f188433b);
        String scheme = sVar.f188433b.f188528a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((c0.a) zj.p.q(this.f81669f)).d(sVar);
        }
        if (Objects.equals(sVar.f188433b.f188529b, "application/x-image-uri")) {
            return new u.b(w7.o0.J0(sVar.f188433b.f188536i), (s) zj.p.q(this.f81670g)).d(sVar);
        }
        t7.s.h hVar = sVar.f188433b;
        int iS0 = w7.o0.s0(hVar.f188528a, hVar.f188529b);
        if (sVar.f188433b.f188536i != -9223372036854775807L) {
            this.f81666c.o(1);
            this.f81666c.n(1);
        }
        try {
            c0.a aVarG = this.f81666c.g(iS0);
            t7.s.g.a aVarA = sVar.f188435d.a();
            if (sVar.f188435d.f188510a == -9223372036854775807L) {
                aVarA.k(this.f81672i);
            }
            if (sVar.f188435d.f188513d == -3.4028235E38f) {
                aVarA.j(this.f81675l);
            }
            if (sVar.f188435d.f188514e == -3.4028235E38f) {
                aVarA.h(this.f81676m);
            }
            if (sVar.f188435d.f188511b == -9223372036854775807L) {
                aVarA.i(this.f81673j);
            }
            if (sVar.f188435d.f188512c == -9223372036854775807L) {
                aVarA.g(this.f81674k);
            }
            t7.s.g gVarF = aVarA.f();
            if (!gVarF.equals(sVar.f188435d)) {
                sVar = sVar.a().b(gVarF).a();
            }
            c0 c0VarD = aVarG.d(sVar);
            ak.n0<t7.s.k> n0Var = ((t7.s.h) w7.o0.h(sVar.f188433b)).f188533f;
            if (!n0Var.isEmpty()) {
                c0[] c0VarArr = new c0[n0Var.size() + 1];
                c0VarArr[0] = c0VarD;
                for (int i15 = 0; i15 < n0Var.size(); i15++) {
                    if (this.f81677n) {
                        final t7.p pVarQ = new t7.p.b().A0(n0Var.get(i15).f188555b).o0(n0Var.get(i15).f188556c).C0(n0Var.get(i15).f188557d).y0(n0Var.get(i15).f188558e).m0(n0Var.get(i15).f188559f).k0(n0Var.get(i15).f188560g).Q();
                        u0.b bVar = new u0.b(this.f81667d, new o8.u() { // from class: h8.k
                            @Override // o8.u
                            public final o8.p[] f() {
                                return q.i(this.f81619b, pVarQ);
                            }
                        });
                        if (this.f81668e.a(pVarQ)) {
                            pVarQ = pVarQ.b().A0("application/x-media3-cues").V(pVarQ.f188381p).Z(this.f81668e.c(pVarQ)).Q();
                        }
                        u0.b bVarN = bVar.k(0, pVarQ).n(this.f81678o);
                        k8.j jVar = this.f81671h;
                        if (jVar != null) {
                            bVarN.e(jVar);
                        }
                        c0VarArr[i15 + 1] = bVarN.d(t7.s.b(n0Var.get(i15).f188554a.toString()));
                    } else {
                        e1.b bVar2 = new e1.b(this.f81667d);
                        k8.j jVar2 = this.f81671h;
                        if (jVar2 != null) {
                            bVar2.b(jVar2);
                        }
                        c0VarArr[i15 + 1] = bVar2.a(n0Var.get(i15), -9223372036854775807L);
                    }
                }
                c0VarD = new n0(c0VarArr);
            }
            return o(sVar, n(sVar, c0VarD, this.f81679p));
        } catch (ClassNotFoundException e15) {
            throw new IllegalStateException(e15);
        }
    }

    @Override // h8.c0.a
    public c0.a g(zj.w<l8.a> wVar) {
        this.f81666c.l(wVar);
        return this;
    }

    @Override // h8.c0.a
    @Deprecated
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public q f(boolean z15) {
        this.f81677n = z15;
        this.f81666c.q(z15);
        return this;
    }

    @Override // h8.c0.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public q b(int i15) {
        this.f81666c.j(i15);
        return this;
    }

    @Override // h8.c0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public q h(k8.e eVar) {
        this.f81666c.i((k8.e) zj.p.q(eVar));
        return this;
    }

    @Override // h8.c0.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public q c(d8.w wVar) {
        this.f81666c.m((d8.w) zj.p.r(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // h8.c0.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public q e(k8.j jVar) {
        this.f81671h = (k8.j) zj.p.r(jVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f81666c.p(jVar);
        return this;
    }

    @Override // h8.c0.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public q a(l9.s.a aVar) {
        this.f81668e = (l9.s.a) zj.p.q(aVar);
        this.f81666c.r(aVar);
        return this;
    }

    public q(y7.f.a aVar, o8.u uVar) {
        this(aVar, uVar, new l9.h());
    }

    public q(y7.f.a aVar, o8.u uVar, l9.s.a aVar2) {
        this.f81667d = aVar;
        this.f81668e = aVar2;
        a aVar3 = new a(uVar, aVar2);
        this.f81666c = aVar3;
        aVar3.k(aVar);
        this.f81672i = -9223372036854775807L;
        this.f81673j = -9223372036854775807L;
        this.f81674k = -9223372036854775807L;
        this.f81675l = -3.4028235E38f;
        this.f81676m = -3.4028235E38f;
        this.f81677n = true;
    }
}
