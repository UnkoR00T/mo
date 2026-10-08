package ym;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import eh.ba;
import eh.ca;
import eh.da;
import eh.e9;
import eh.ea;
import eh.ed;
import eh.n2;
import eh.o2;
import eh.o9;
import eh.od;
import eh.p9;
import eh.q2;
import eh.qd;
import eh.sd;
import eh.t9;
import eh.td;
import eh.ua;
import eh.wa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.s;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends pm.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final AtomicBoolean f227897j = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final wm.d f227898k = wm.d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xm.e f227899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qd f227900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sd f227901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f227902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f227903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final wm.a f227904i = new wm.a();

    public i(qd qdVar, xm.e eVar, c cVar) {
        s.m(eVar, "FaceDetectorOptions can not be null");
        this.f227899d = eVar;
        this.f227900e = qdVar;
        this.f227902g = cVar;
        this.f227901f = sd.a(pm.i.c().b());
    }

    static void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((xm.a) it.next()).n(-1);
        }
    }

    private final synchronized void n(final ca caVar, long j15, final vm.a aVar, final int i15, final int i16) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j15;
        this.f227900e.f(new od() { // from class: ym.g
            @Override // eh.od
            public final ed zza() {
                return this.f227890a.j(jElapsedRealtime, caVar, i15, i16, aVar);
            }
        }, da.ON_DEVICE_FACE_DETECT);
        o2 o2Var = new o2();
        o2Var.c(caVar);
        o2Var.d(Boolean.valueOf(f227897j.get()));
        o2Var.a(Integer.valueOf(i15));
        o2Var.e(Integer.valueOf(i16));
        o2Var.b(k.a(this.f227899d));
        final q2 q2VarF = o2Var.f();
        final h hVar = new h(this);
        final qd qdVar = this.f227900e;
        final da daVar = da.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        pm.g.d().execute(new Runnable(daVar, q2VarF, jElapsedRealtime, hVar, bArr) { // from class: eh.ld

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ da f50780b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f50781c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f50782d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ym.h f50783e;

            @Override // java.lang.Runnable
            public final void run() {
                this.f50779a.h(this.f50780b, this.f50781c, this.f50782d, this.f50783e);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f227901f.c(true != this.f227903h ? 24303 : 24304, caVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // pm.k
    public final synchronized void b() {
        this.f227903h = this.f227902g.c();
    }

    @Override // pm.k
    public final synchronized void d() {
        try {
            this.f227902g.zzb();
            f227897j.set(true);
            qd qdVar = this.f227900e;
            ea eaVar = new ea();
            eaVar.e(this.f227903h ? ba.TYPE_THICK : ba.TYPE_THIN);
            qdVar.d(td.e(eaVar), da.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    final /* synthetic */ ed j(long j15, ca caVar, int i15, int i16, vm.a aVar) {
        p9 p9Var;
        ua uaVar = new ua();
        t9 t9Var = new t9();
        t9Var.c(Long.valueOf(j15));
        t9Var.d(caVar);
        t9Var.e(Boolean.valueOf(f227897j.get()));
        Boolean bool = Boolean.TRUE;
        t9Var.a(bool);
        t9Var.b(bool);
        uaVar.g(t9Var.f());
        uaVar.e(k.a(this.f227899d));
        uaVar.d(Integer.valueOf(i15));
        uaVar.h(Integer.valueOf(i16));
        wm.d dVar = f227898k;
        int iC = dVar.c(aVar);
        int iD = dVar.d(aVar);
        o9 o9Var = new o9();
        if (iC == -1) {
            p9Var = p9.BITMAP;
        } else if (iC == 35) {
            p9Var = p9.YUV_420_888;
        } else if (iC == 842094169) {
            p9Var = p9.YV12;
        } else if (iC != 16) {
            p9Var = iC != 17 ? p9.UNKNOWN_FORMAT : p9.NV21;
        } else {
            p9Var = p9.NV16;
        }
        o9Var.a(p9Var);
        o9Var.b(Integer.valueOf(iD));
        uaVar.f(o9Var.d());
        wa waVarI = uaVar.i();
        ea eaVar = new ea();
        eaVar.e(this.f227903h ? ba.TYPE_THICK : ba.TYPE_THIN);
        eaVar.g(waVarI);
        return td.e(eaVar);
    }

    final /* synthetic */ ed k(q2 q2Var, int i15, e9 e9Var) {
        ea eaVar = new ea();
        eaVar.e(this.f227903h ? ba.TYPE_THICK : ba.TYPE_THIN);
        n2 n2Var = new n2();
        n2Var.a(Integer.valueOf(i15));
        n2Var.c(q2Var);
        n2Var.b(e9Var);
        eaVar.d(n2Var.e());
        return td.e(eaVar);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108 A[Catch: all -> 0x002b, a -> 0x002e, TryCatch #0 {a -> 0x002e, blocks: (B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x0102, B:50:0x0118, B:49:0x0112, B:45:0x0108, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:34:0x00d9, B:36:0x00e4, B:39:0x00f1, B:41:0x00fa), top: B:62:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112 A[Catch: all -> 0x002b, a -> 0x002e, TryCatch #0 {a -> 0x002e, blocks: (B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x0102, B:50:0x0118, B:49:0x0112, B:45:0x0108, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:34:0x00d9, B:36:0x00e4, B:39:0x00f1, B:41:0x00fa), top: B:62:0x000e, outer: #1 }] */
    @Override // pm.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(vm.a aVar) {
        List list;
        List arrayList;
        List list2;
        List list3;
        int size;
        int size2;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f227904i.a(aVar);
            try {
                Pair pairB = this.f227902g.b(aVar);
                List<xm.a> list4 = (List) pairB.first;
                List<xm.a> list5 = (List) pairB.second;
                if (list4 == null && list5 == null) {
                    throw new lm.a("No detector is enabled", 13);
                }
                if (list4 == null) {
                    list3 = (List) s.l(list5);
                } else {
                    if (list5 == null) {
                        list3 = (List) s.l(list4);
                    } else {
                        HashSet hashSet = new HashSet();
                        for (xm.a aVar2 : list5) {
                            boolean z15 = false;
                            for (xm.a aVar3 : list4) {
                                if (aVar2.c() == null || aVar3.c() == null) {
                                    list2 = list5;
                                } else {
                                    Rect rectC = aVar2.c();
                                    Rect rectC2 = aVar3.c();
                                    if (rectC.intersect(rectC2)) {
                                        list2 = list5;
                                        double dMin = (Math.min(rectC.right, rectC2.right) - Math.max(rectC.left, rectC2.left)) * (Math.min(rectC.bottom, rectC2.bottom) - Math.max(rectC.top, rectC2.top));
                                        if (dMin / ((((double) ((rectC.right - rectC.left) * (rectC.bottom - rectC.top))) + ((double) ((rectC2.right - rectC2.left) * (rectC2.bottom - rectC2.top)))) - dMin) > 0.6d) {
                                            aVar3.m(aVar2.l());
                                            z15 = true;
                                        }
                                    } else {
                                        list2 = list5;
                                    }
                                }
                                hashSet.add(aVar3);
                                list5 = list2;
                            }
                            List list6 = list5;
                            if (!z15) {
                                hashSet.add(aVar2);
                            }
                            list5 = list6;
                        }
                        list = list5;
                        arrayList = new ArrayList(hashSet);
                    }
                    ca caVar = ca.NO_ERROR;
                    if (list == null) {
                        size = 0;
                    } else {
                        size = list.size();
                    }
                    if (list4 == 0) {
                        size2 = 0;
                    } else {
                        size2 = list4.size();
                    }
                    n(caVar, jElapsedRealtime, aVar, size, size2);
                    f227897j.set(false);
                }
                list = list5;
                arrayList = list3;
                ca caVar2 = ca.NO_ERROR;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                if (list4 == 0) {
                    size2 = 0;
                } else {
                    size2 = list4.size();
                }
                n(caVar2, jElapsedRealtime, aVar, size, size2);
                f227897j.set(false);
            } catch (lm.a e15) {
                n(e15.a() == 14 ? ca.MODEL_NOT_DOWNLOADED : ca.UNKNOWN_ERROR, jElapsedRealtime, aVar, 0, 0);
                throw e15;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return arrayList;
    }
}
