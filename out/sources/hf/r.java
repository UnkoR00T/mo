package hf;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f84113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bf.e f84114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jf.d f84115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f84116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f84117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kf.b f84118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lf.a f84119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final lf.a f84120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final jf.c f84121i;

    public r(Context context, bf.e eVar, jf.d dVar, x xVar, Executor executor, kf.b bVar, lf.a aVar, lf.a aVar2, jf.c cVar) {
        this.f84113a = context;
        this.f84114b = eVar;
        this.f84115c = dVar;
        this.f84116d = xVar;
        this.f84117e = executor;
        this.f84118f = bVar;
        this.f84119g = aVar;
        this.f84120h = aVar2;
        this.f84121i = cVar;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, af.o oVar, long j15) {
        rVar.f84115c.f2(iterable);
        rVar.f84115c.Z0(oVar, rVar.f84119g.a() + j15);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f84121i.h();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f84115c.w0(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, af.o oVar, int i15) {
        rVar.f84116d.a(oVar, i15 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, af.o oVar, long j15) {
        rVar.f84115c.Z0(oVar, rVar.f84119g.a() + j15);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            rVar.f84121i.b(((Integer) entry.getValue()).intValue(), df.c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final af.o oVar, final int i15, Runnable runnable) {
        rVar.getClass();
        try {
            kf.b bVar = rVar.f84118f;
            final jf.d dVar = rVar.f84115c;
            Objects.requireNonNull(dVar);
            bVar.m(new kf.b.a() { // from class: hf.i
                @Override // kf.b.a
                public final Object B() {
                    return Integer.valueOf(dVar.s0());
                }
            });
            if (rVar.k()) {
                rVar.l(oVar, i15);
            } else {
                rVar.f84118f.m(new kf.b.a() { // from class: hf.j
                    @Override // kf.b.a
                    public final Object B() {
                        return r.f(this.f84094a, oVar, i15);
                    }
                });
            }
        } catch (kf.a unused) {
            rVar.f84116d.a(oVar, i15 + 1);
        } finally {
            runnable.run();
        }
    }

    public af.i j(bf.m mVar) {
        kf.b bVar = this.f84118f;
        final jf.c cVar = this.f84121i;
        Objects.requireNonNull(cVar);
        return mVar.a(af.i.a().i(this.f84119g.a()).l(this.f84120h.a()).k("GDT_CLIENT_METRICS").h(new af.h(ye.c.b("proto"), ((df.a) bVar.m(new kf.b.a() { // from class: hf.h
            @Override // kf.b.a
            public final Object B() {
                return cVar.p();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f84113a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public bf.g l(final af.o oVar, int i15) {
        bf.g gVarB;
        bf.m mVar = this.f84114b.get(oVar.b());
        bf.g gVarE = bf.g.e(0L);
        final long j15 = 0;
        while (((Boolean) this.f84118f.m(new kf.b.a() { // from class: hf.k
            @Override // kf.b.a
            public final Object B() {
                return Boolean.valueOf(this.f84097a.f84115c.z0(oVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f84118f.m(new kf.b.a() { // from class: hf.l
                @Override // kf.b.a
                public final Object B() {
                    return this.f84099a.f84115c.x3(oVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVar == null) {
                ef.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                gVarB = bf.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jf.k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(mVar));
                }
                gVarB = mVar.b(bf.f.a().b(arrayList).c(oVar.c()).a());
            }
            gVarE = gVarB;
            if (gVarE.c() == bf.g.a.TRANSIENT_ERROR) {
                final af.o oVar2 = oVar;
                this.f84118f.m(new kf.b.a() { // from class: hf.m
                    @Override // kf.b.a
                    public final Object B() {
                        return r.b(this.f84101a, iterable, oVar2, j15);
                    }
                });
                this.f84116d.b(oVar2, i15 + 1, true);
                return gVarE;
            }
            af.o oVar3 = oVar;
            this.f84118f.m(new kf.b.a() { // from class: hf.n
                @Override // kf.b.a
                public final Object B() {
                    return r.e(this.f84105a, iterable);
                }
            });
            if (gVarE.c() == bf.g.a.OK) {
                long jMax = Math.max(j15, gVarE.b());
                if (oVar3.e()) {
                    this.f84118f.m(new kf.b.a() { // from class: hf.o
                        @Override // kf.b.a
                        public final Object B() {
                            return r.c(this.f84107a);
                        }
                    });
                }
                j15 = jMax;
            } else if (gVarE.c() == bf.g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String strK = ((jf.k) it4.next()).b().k();
                    if (map.containsKey(strK)) {
                        map.put(strK, Integer.valueOf(((Integer) map.get(strK)).intValue() + 1));
                    } else {
                        map.put(strK, 1);
                    }
                }
                this.f84118f.m(new kf.b.a() { // from class: hf.p
                    @Override // kf.b.a
                    public final Object B() {
                        return r.h(this.f84108a, map);
                    }
                });
            }
            oVar = oVar3;
        }
        final af.o oVar4 = oVar;
        this.f84118f.m(new kf.b.a() { // from class: hf.q
            @Override // kf.b.a
            public final Object B() {
                return r.g(this.f84110a, oVar4, j15);
            }
        });
        return gVarE;
    }

    public void m(final af.o oVar, final int i15, final Runnable runnable) {
        this.f84117e.execute(new Runnable() { // from class: hf.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f84088a, oVar, i15, runnable);
            }
        });
    }
}
