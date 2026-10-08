package eh;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class qd {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static p0 f50975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final r0 f50976l = r0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pd f50979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pm.n f50980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vh.l f50981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vh.l f50982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f50983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f50984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f50985i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f50986j = new HashMap();

    public qd(Context context, final pm.n nVar, pd pdVar, String str) {
        this.f50977a = context.getPackageName();
        this.f50978b = pm.c.a(context);
        this.f50980d = nVar;
        this.f50979c = pdVar;
        ce.a();
        this.f50983g = str;
        this.f50981e = pm.g.a().b(new Callable() { // from class: eh.id
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f50677a.b();
            }
        });
        pm.g gVarA = pm.g.a();
        nVar.getClass();
        this.f50982f = gVarA.b(new Callable() { // from class: eh.jd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        r0 r0Var = f50976l;
        this.f50984h = r0Var.containsKey(str) ? DynamiteModule.c(context, (String) r0Var.get(str)) : -1;
    }

    static long a(List list, double d15) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d15 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized p0 i() {
        try {
            p0 p0Var = f50975k;
            if (p0Var != null) {
                return p0Var;
            }
            e6.h hVarA = e6.e.a(Resources.getSystem().getConfiguration());
            m0 m0Var = new m0();
            for (int i15 = 0; i15 < hVarA.g(); i15++) {
                m0Var.c(pm.c.b(hVarA.c(i15)));
            }
            p0 p0VarD = m0Var.d();
            f50975k = p0VarD;
            return p0VarD;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private final String j() {
        return this.f50981e.q() ? (String) this.f50981e.m() : jg.p.a().b(this.f50983g);
    }

    private final boolean k(da daVar, long j15, long j16) {
        return this.f50985i.get(daVar) == null || j15 - ((Long) this.f50985i.get(daVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String b() {
        return jg.p.a().b(this.f50983g);
    }

    final /* synthetic */ void c(ed edVar, da daVar, String str) {
        edVar.a(daVar);
        String strC = edVar.c();
        fc fcVar = new fc();
        fcVar.b(this.f50977a);
        fcVar.c(this.f50978b);
        fcVar.h(i());
        fcVar.g(Boolean.TRUE);
        fcVar.l(strC);
        fcVar.j(str);
        fcVar.i(this.f50982f.q() ? (String) this.f50982f.m() : this.f50980d.a());
        fcVar.d(10);
        fcVar.k(Integer.valueOf(this.f50984h));
        edVar.b(fcVar);
        this.f50979c.a(edVar);
    }

    public final void d(ed edVar, da daVar) {
        e(edVar, daVar, j());
    }

    public final void e(final ed edVar, final da daVar, final String str) {
        pm.g.d().execute(new Runnable() { // from class: eh.kd
            @Override // java.lang.Runnable
            public final void run() {
                this.f50749a.c(edVar, daVar, str);
            }
        });
    }

    public final void f(od odVar, da daVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(daVar, jElapsedRealtime, 30L)) {
            this.f50985i.put(daVar, Long.valueOf(jElapsedRealtime));
            e(odVar.zza(), daVar, j());
        }
    }

    final /* synthetic */ void g(da daVar, ym.h hVar) {
        u0 u0Var = (u0) this.f50986j.get(daVar);
        if (u0Var != null) {
            for (Object obj : u0Var.c()) {
                ArrayList arrayList = new ArrayList(u0Var.a(obj));
                Collections.sort(arrayList);
                c9 c9Var = new c9();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c9Var.a(Long.valueOf(jLongValue / ((long) arrayList.size())));
                c9Var.c(Long.valueOf(a(arrayList, 100.0d)));
                c9Var.f(Long.valueOf(a(arrayList, 75.0d)));
                c9Var.d(Long.valueOf(a(arrayList, 50.0d)));
                c9Var.b(Long.valueOf(a(arrayList, 25.0d)));
                c9Var.e(Long.valueOf(a(arrayList, 0.0d)));
                e(hVar.a(obj, arrayList.size(), c9Var.g()), daVar, j());
            }
            this.f50986j.remove(daVar);
        }
    }

    final /* synthetic */ void h(final da daVar, Object obj, long j15, final ym.h hVar) {
        if (!this.f50986j.containsKey(daVar)) {
            this.f50986j.put(daVar, t.t());
        }
        ((u0) this.f50986j.get(daVar)).d(obj, Long.valueOf(j15));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(daVar, jElapsedRealtime, 30L)) {
            this.f50985i.put(daVar, Long.valueOf(jElapsedRealtime));
            final byte[] bArr = null;
            pm.g.d().execute(new Runnable(daVar, hVar, bArr) { // from class: eh.md

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ da f50823b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ym.h f50824c;

                @Override // java.lang.Runnable
                public final void run() {
                    this.f50822a.g(this.f50823b, this.f50824c);
                }
            });
        }
    }
}
