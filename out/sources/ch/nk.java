package ch;

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
public final class nk {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static i1 f26187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final k1 f26188l = k1.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dk f26191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pm.n f26192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vh.l f26193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vh.l f26194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f26197i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f26198j = new HashMap();

    public nk(Context context, final pm.n nVar, dk dkVar, String str) {
        this.f26189a = context.getPackageName();
        this.f26190b = pm.c.a(context);
        this.f26192d = nVar;
        this.f26191c = dkVar;
        al.a();
        this.f26195g = str;
        this.f26193e = pm.g.a().b(new Callable() { // from class: ch.jk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25980a.b();
            }
        });
        pm.g gVarA = pm.g.a();
        Objects.requireNonNull(nVar);
        this.f26194f = gVarA.b(new Callable() { // from class: ch.kk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        k1 k1Var = f26188l;
        this.f26196h = k1Var.containsKey(str) ? DynamiteModule.c(context, (String) k1Var.get(str)) : -1;
    }

    static long a(List list, double d15) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d15 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized i1 i() {
        try {
            i1 i1Var = f26187k;
            if (i1Var != null) {
                return i1Var;
            }
            e6.h hVarA = e6.e.a(Resources.getSystem().getConfiguration());
            f1 f1Var = new f1();
            for (int i15 = 0; i15 < hVarA.g(); i15++) {
                f1Var.e(pm.c.b(hVarA.c(i15)));
            }
            i1 i1VarG = f1Var.g();
            f26187k = i1VarG;
            return i1VarG;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private final String j() {
        if (this.f26193e.q()) {
            return (String) this.f26193e.m();
        }
        return jg.p.a().b(this.f26195g);
    }

    private final boolean k(ye yeVar, long j15, long j16) {
        return this.f26197i.get(yeVar) == null || j15 - ((Long) this.f26197i.get(yeVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String b() {
        return jg.p.a().b(this.f26195g);
    }

    final /* synthetic */ void c(ck ckVar, ye yeVar, String str) {
        ckVar.f(yeVar);
        String strC = ckVar.c();
        yi yiVar = new yi();
        yiVar.b(this.f26189a);
        yiVar.c(this.f26190b);
        yiVar.h(i());
        yiVar.g(Boolean.TRUE);
        yiVar.l(strC);
        yiVar.j(str);
        yiVar.i(this.f26194f.q() ? (String) this.f26194f.m() : this.f26192d.a());
        yiVar.d(10);
        yiVar.k(Integer.valueOf(this.f26196h));
        ckVar.e(yiVar);
        this.f26191c.a(ckVar);
    }

    public final void d(ck ckVar, ye yeVar) {
        e(ckVar, yeVar, j());
    }

    public final void e(final ck ckVar, final ye yeVar, final String str) {
        pm.g.d().execute(new Runnable() { // from class: ch.hk
            @Override // java.lang.Runnable
            public final void run() {
                this.f25931a.c(ckVar, yeVar, str);
            }
        });
    }

    public final void f(mk mkVar, ye yeVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(yeVar, jElapsedRealtime, 30L)) {
            this.f26197i.put(yeVar, Long.valueOf(jElapsedRealtime));
            e(mkVar.zza(), yeVar, j());
        }
    }

    final /* synthetic */ void g(ye yeVar, um.j jVar) {
        n1 n1Var = (n1) this.f26198j.get(yeVar);
        if (n1Var != null) {
            for (Object obj : n1Var.K()) {
                ArrayList arrayList = new ArrayList(n1Var.d(obj));
                Collections.sort(arrayList);
                wd wdVar = new wd();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                wdVar.a(Long.valueOf(jLongValue / ((long) arrayList.size())));
                wdVar.c(Long.valueOf(a(arrayList, 100.0d)));
                wdVar.f(Long.valueOf(a(arrayList, 75.0d)));
                wdVar.d(Long.valueOf(a(arrayList, 50.0d)));
                wdVar.b(Long.valueOf(a(arrayList, 25.0d)));
                wdVar.e(Long.valueOf(a(arrayList, 0.0d)));
                e(jVar.a(obj, arrayList.size(), wdVar.g()), yeVar, j());
            }
            this.f26198j.remove(yeVar);
        }
    }

    final /* synthetic */ void h(final ye yeVar, Object obj, long j15, final um.j jVar) {
        if (!this.f26198j.containsKey(yeVar)) {
            this.f26198j.put(yeVar, l0.n());
        }
        ((n1) this.f26198j.get(yeVar)).L(obj, Long.valueOf(j15));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(yeVar, jElapsedRealtime, 30L)) {
            this.f26197i.put(yeVar, Long.valueOf(jElapsedRealtime));
            pm.g.d().execute(new Runnable() { // from class: ch.ik
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25956a.g(yeVar, jVar);
                }
            });
        }
    }
}
