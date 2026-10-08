package fh;

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
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class xj {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static m0 f63718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final o0 f63719l = o0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mj f63722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pm.n f63723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vh.l f63724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vh.l f63725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f63726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f63727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f63728i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f63729j = new HashMap();

    public xj(Context context, final pm.n nVar, mj mjVar, String str) {
        this.f63720a = context.getPackageName();
        this.f63721b = pm.c.a(context);
        this.f63723d = nVar;
        this.f63722c = mjVar;
        jk.a();
        this.f63726g = str;
        this.f63724e = pm.g.a().b(new Callable() { // from class: fh.sj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f63528a.b();
            }
        });
        pm.g gVarA = pm.g.a();
        Objects.requireNonNull(nVar);
        this.f63725f = gVarA.b(new Callable() { // from class: fh.tj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        o0 o0Var = f63719l;
        this.f63727h = o0Var.containsKey(str) ? DynamiteModule.c(context, (String) o0Var.get(str)) : -1;
    }

    static long a(List list, double d15) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d15 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized m0 i() {
        try {
            m0 m0Var = f63718k;
            if (m0Var != null) {
                return m0Var;
            }
            e6.h hVarA = e6.e.a(Resources.getSystem().getConfiguration());
            j0 j0Var = new j0();
            for (int i15 = 0; i15 < hVarA.g(); i15++) {
                j0Var.a(pm.c.b(hVarA.c(i15)));
            }
            m0 m0VarB = j0Var.b();
            f63718k = m0VarB;
            return m0VarB;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private final String j() {
        if (this.f63724e.q()) {
            return (String) this.f63724e.m();
        }
        return jg.p.a().b(this.f63726g);
    }

    private final boolean k(je jeVar, long j15, long j16) {
        return this.f63728i.get(jeVar) == null || j15 - ((Long) this.f63728i.get(jeVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String b() {
        return jg.p.a().b(this.f63726g);
    }

    final /* synthetic */ void c(lj ljVar, je jeVar, String str) {
        ljVar.b(jeVar);
        String strC = ljVar.c();
        ki kiVar = new ki();
        kiVar.b(this.f63720a);
        kiVar.c(this.f63721b);
        kiVar.h(i());
        kiVar.g(Boolean.TRUE);
        kiVar.l(strC);
        kiVar.j(str);
        kiVar.i(this.f63725f.q() ? (String) this.f63725f.m() : this.f63723d.a());
        kiVar.d(10);
        kiVar.k(Integer.valueOf(this.f63727h));
        ljVar.a(kiVar);
        this.f63722c.a(ljVar);
    }

    public final void d(lj ljVar, je jeVar) {
        e(ljVar, jeVar, j());
    }

    public final void e(final lj ljVar, final je jeVar, final String str) {
        pm.g.d().execute(new Runnable() { // from class: fh.qj
            @Override // java.lang.Runnable
            public final void run() {
                this.f63475a.c(ljVar, jeVar, str);
            }
        });
    }

    public final void f(wj wjVar, je jeVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(jeVar, jElapsedRealtime, 30L)) {
            this.f63728i.put(jeVar, Long.valueOf(jElapsedRealtime));
            e(wjVar.zza(), jeVar, j());
        }
    }

    final /* synthetic */ void g(je jeVar, an.v vVar) {
        r0 r0Var = (r0) this.f63729j.get(jeVar);
        if (r0Var != null) {
            for (Object obj : r0Var.B()) {
                ArrayList arrayList = new ArrayList(r0Var.a(obj));
                Collections.sort(arrayList);
                hd hdVar = new hd();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                hdVar.a(Long.valueOf(jLongValue / ((long) arrayList.size())));
                hdVar.c(Long.valueOf(a(arrayList, 100.0d)));
                hdVar.f(Long.valueOf(a(arrayList, 75.0d)));
                hdVar.d(Long.valueOf(a(arrayList, 50.0d)));
                hdVar.b(Long.valueOf(a(arrayList, 25.0d)));
                hdVar.e(Long.valueOf(a(arrayList, 0.0d)));
                e(vVar.a(obj, arrayList.size(), hdVar.g()), jeVar, j());
            }
            this.f63729j.remove(jeVar);
        }
    }

    final /* synthetic */ void h(final je jeVar, Object obj, long j15, final an.v vVar) {
        if (!this.f63729j.containsKey(jeVar)) {
            this.f63729j.put(jeVar, p.p());
        }
        ((r0) this.f63729j.get(jeVar)).c(obj, Long.valueOf(j15));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(jeVar, jElapsedRealtime, 30L)) {
            this.f63728i.put(jeVar, Long.valueOf(jElapsedRealtime));
            pm.g.d().execute(new Runnable() { // from class: fh.rj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63501a.g(jeVar, vVar);
                }
            });
        }
    }
}
