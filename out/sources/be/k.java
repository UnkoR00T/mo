package be;

import android.util.Log;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class k implements m, de.h.a, p.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f18727i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f18728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f18729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final de.h f18730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f18731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f18732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f18733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f18734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final be.a f18735h;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h.e f18736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i6.f<h<?>> f18737b = we.a.d(150, new C0473a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18738c;

        /* JADX INFO: renamed from: be.k$a$a, reason: collision with other inner class name */
        class C0473a implements we.a.d<h<?>> {
            C0473a() {
            }

            @Override // we.a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f18736a, aVar.f18737b);
            }
        }

        a(h.e eVar) {
            this.f18736a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, zd.f fVar, int i15, int i16, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, zd.l<?>> map, boolean z15, boolean z16, boolean z17, zd.h hVar, h.b<R> bVar) {
            h hVar2 = (h) ve.k.d(this.f18737b.z());
            int i17 = this.f18738c;
            this.f18738c = i17 + 1;
            return hVar2.v(dVar, obj, nVar, fVar, i15, i16, cls, cls2, gVar, jVar, map, z15, z16, z17, hVar, bVar, i17);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ee.a f18740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ee.a f18741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ee.a f18742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ee.a f18743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final m f18744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final p.a f18745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final i6.f<l<?>> f18746g = we.a.d(150, new a());

        class a implements we.a.d<l<?>> {
            a() {
            }

            @Override // we.a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.f18740a, bVar.f18741b, bVar.f18742c, bVar.f18743d, bVar.f18744e, bVar.f18745f, bVar.f18746g);
            }
        }

        b(ee.a aVar, ee.a aVar2, ee.a aVar3, ee.a aVar4, m mVar, p.a aVar5) {
            this.f18740a = aVar;
            this.f18741b = aVar2;
            this.f18742c = aVar3;
            this.f18743d = aVar4;
            this.f18744e = mVar;
            this.f18745f = aVar5;
        }

        <R> l<R> a(zd.f fVar, boolean z15, boolean z16, boolean z17, boolean z18) {
            return ((l) ve.k.d(this.f18746g.z())).l(fVar, z15, z16, z17, z18);
        }
    }

    private static class c implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final de.a.InterfaceC0916a f18748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile de.a f18749b;

        c(de.a.InterfaceC0916a interfaceC0916a) {
            this.f18748a = interfaceC0916a;
        }

        @Override // be.h.e
        public de.a a() {
            if (this.f18749b == null) {
                synchronized (this) {
                    try {
                        if (this.f18749b == null) {
                            this.f18749b = this.f18748a.build();
                        }
                        if (this.f18749b == null) {
                            this.f18749b = new de.b();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            return this.f18749b;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l<?> f18750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final re.h f18751b;

        d(re.h hVar, l<?> lVar) {
            this.f18751b = hVar;
            this.f18750a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f18750a.r(this.f18751b);
            }
        }
    }

    public k(de.h hVar, de.a.InterfaceC0916a interfaceC0916a, ee.a aVar, ee.a aVar2, ee.a aVar3, ee.a aVar4, boolean z15) {
        this(hVar, interfaceC0916a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z15);
    }

    private p<?> e(zd.f fVar) {
        v<?> vVarC = this.f18730c.c(fVar);
        if (vVarC == null) {
            return null;
        }
        return vVarC instanceof p ? (p) vVarC : new p<>(vVarC, true, true, fVar, this);
    }

    private p<?> g(zd.f fVar) {
        p<?> pVarE = this.f18735h.e(fVar);
        if (pVarE != null) {
            pVarE.a();
        }
        return pVarE;
    }

    private p<?> h(zd.f fVar) {
        p<?> pVarE = e(fVar);
        if (pVarE != null) {
            pVarE.a();
            this.f18735h.a(fVar, pVarE);
        }
        return pVarE;
    }

    private p<?> i(n nVar, boolean z15, long j15) {
        if (!z15) {
            return null;
        }
        p<?> pVarG = g(nVar);
        if (pVarG != null) {
            if (f18727i) {
                j("Loaded resource from active resources", j15, nVar);
            }
            return pVarG;
        }
        p<?> pVarH = h(nVar);
        if (pVarH == null) {
            return null;
        }
        if (f18727i) {
            j("Loaded resource from cache", j15, nVar);
        }
        return pVarH;
    }

    private static void j(String str, long j15, zd.f fVar) {
        ve.g.a(j15);
        Objects.toString(fVar);
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, zd.f fVar, int i15, int i16, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, zd.l<?>> map, boolean z15, boolean z16, zd.h hVar, boolean z17, boolean z18, boolean z19, boolean z25, re.h hVar2, Executor executor, n nVar, long j15) {
        l<?> lVarA = this.f18728a.a(nVar, z25);
        if (lVarA != null) {
            lVarA.a(hVar2, executor);
            if (f18727i) {
                j("Added to existing load", j15, nVar);
            }
            return new d(hVar2, lVarA);
        }
        l<R> lVarA2 = this.f18731d.a(nVar, z17, z18, z19, z25);
        h<R> hVarA = this.f18734g.a(dVar, obj, nVar, fVar, i15, i16, cls, cls2, gVar, jVar, map, z15, z16, z25, hVar, lVarA2);
        this.f18728a.c(nVar, lVarA2);
        lVarA2.a(hVar2, executor);
        lVarA2.s(hVarA);
        if (f18727i) {
            j("Started new load", j15, nVar);
        }
        return new d(hVar2, lVarA2);
    }

    @Override // be.p.a
    public void a(zd.f fVar, p<?> pVar) {
        this.f18735h.d(fVar);
        if (pVar.e()) {
            this.f18730c.e(fVar, pVar);
        } else {
            this.f18732e.a(pVar, false);
        }
    }

    @Override // be.m
    public synchronized void b(l<?> lVar, zd.f fVar, p<?> pVar) {
        if (pVar != null) {
            try {
                if (pVar.e()) {
                    this.f18735h.a(fVar, pVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f18728a.d(fVar, lVar);
    }

    @Override // be.m
    public synchronized void c(l<?> lVar, zd.f fVar) {
        this.f18728a.d(fVar, lVar);
    }

    @Override // de.h.a
    public void d(v<?> vVar) {
        this.f18732e.a(vVar, true);
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, zd.f fVar, int i15, int i16, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, zd.l<?>> map, boolean z15, boolean z16, zd.h hVar, boolean z17, boolean z18, boolean z19, boolean z25, re.h hVar2, Executor executor) {
        long jB = f18727i ? ve.g.b() : 0L;
        n nVarA = this.f18729b.a(obj, fVar, i15, i16, map, cls, cls2, hVar);
        synchronized (this) {
            try {
                p<?> pVarI = i(nVarA, z17, jB);
                if (pVarI == null) {
                    return l(dVar, obj, fVar, i15, i16, cls, cls2, gVar, jVar, map, z15, z16, hVar, z17, z18, z19, z25, hVar2, executor, nVarA, jB);
                }
                hVar2.c(pVarI, zd.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void k(v<?> vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).f();
    }

    k(de.h hVar, de.a.InterfaceC0916a interfaceC0916a, ee.a aVar, ee.a aVar2, ee.a aVar3, ee.a aVar4, s sVar, o oVar, be.a aVar5, b bVar, a aVar6, y yVar, boolean z15) {
        this.f18730c = hVar;
        c cVar = new c(interfaceC0916a);
        this.f18733f = cVar;
        be.a aVar7 = aVar5 == null ? new be.a(z15) : aVar5;
        this.f18735h = aVar7;
        aVar7.f(this);
        this.f18729b = oVar == null ? new o() : oVar;
        this.f18728a = sVar == null ? new s() : sVar;
        this.f18731d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f18734g = aVar6 == null ? new a(cVar) : aVar6;
        this.f18732e = yVar == null ? new y() : yVar;
        hVar.d(this);
    }
}
