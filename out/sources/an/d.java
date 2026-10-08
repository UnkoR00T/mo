package an;

import android.os.SystemClock;
import fh.ak;
import fh.he;
import fh.ie;
import fh.jd;
import fh.je;
import fh.ke;
import fh.lj;
import fh.od;
import fh.pd;
import fh.ph;
import fh.rh;
import fh.t3;
import fh.th;
import fh.u3;
import fh.vd;
import fh.w3;
import fh.wj;
import fh.xj;
import fh.zj;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class d extends pm.f<zm.a, vm.a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static boolean f7905i = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f7907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xj f7908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zj f7909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zm.d f7910g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final wm.d f7906j = wm.d.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final pm.o f7904h = new pm.o();

    d(xj xjVar, q qVar, zm.d dVar) {
        super((dVar.h() == 8 || dVar.h() == 7) ? new pm.o() : f7904h);
        this.f7908e = xjVar;
        this.f7907d = qVar;
        this.f7909f = zj.a(pm.i.c().b());
        this.f7910g = dVar;
    }

    private final void m(final ie ieVar, long j15, final vm.a aVar) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j15;
        this.f7908e.f(new wj() { // from class: an.u
            @Override // fh.wj
            public final lj zza() {
                return this.f7931a.j(jElapsedRealtime, ieVar, aVar);
            }
        }, je.ON_DEVICE_TEXT_DETECT);
        u3 u3Var = new u3();
        u3Var.a(ieVar);
        u3Var.b(Boolean.valueOf(f7905i));
        th thVar = new th();
        thVar.a(a.a(this.f7910g.h()));
        u3Var.c(thVar.c());
        final w3 w3VarD = u3Var.d();
        final v vVar = new v(this);
        final je jeVar = je.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor executorD = pm.g.d();
        final xj xjVar = this.f7908e;
        executorD.execute(new Runnable() { // from class: fh.vj
            @Override // java.lang.Runnable
            public final void run() {
                xjVar.h(jeVar, w3VarD, jElapsedRealtime, vVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f7909f.c(this.f7910g.d(), ieVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // pm.k
    public final synchronized void b() {
        this.f7907d.zzb();
    }

    @Override // pm.k
    public final synchronized void d() {
        f7905i = true;
        this.f7907d.a();
    }

    final /* synthetic */ lj j(long j15, ie ieVar, vm.a aVar) {
        pd pdVar;
        ph phVar = new ph();
        vd vdVar = new vd();
        vdVar.c(Long.valueOf(j15));
        vdVar.d(ieVar);
        vdVar.e(Boolean.valueOf(f7905i));
        Boolean bool = Boolean.TRUE;
        vdVar.a(bool);
        vdVar.b(bool);
        phVar.d(vdVar.f());
        wm.d dVar = f7906j;
        int iC = dVar.c(aVar);
        int iD = dVar.d(aVar);
        od odVar = new od();
        if (iC == -1) {
            pdVar = pd.BITMAP;
        } else if (iC == 35) {
            pdVar = pd.YUV_420_888;
        } else if (iC == 842094169) {
            pdVar = pd.YV12;
        } else if (iC != 16) {
            pdVar = iC != 17 ? pd.UNKNOWN_FORMAT : pd.NV21;
        } else {
            pdVar = pd.NV16;
        }
        odVar.a(pdVar);
        odVar.b(Integer.valueOf(iD));
        phVar.c(odVar.d());
        th thVar = new th();
        thVar.a(a.a(this.f7910g.h()));
        phVar.e(thVar.c());
        rh rhVarF = phVar.f();
        ke keVar = new ke();
        keVar.e(this.f7910g.c() ? he.TYPE_THICK : he.TYPE_THIN);
        keVar.h(rhVarF);
        return ak.e(keVar);
    }

    final /* synthetic */ lj k(w3 w3Var, int i15, jd jdVar) {
        ke keVar = new ke();
        keVar.e(this.f7910g.c() ? he.TYPE_THICK : he.TYPE_THIN);
        t3 t3Var = new t3();
        t3Var.a(Integer.valueOf(i15));
        t3Var.c(w3Var);
        t3Var.b(jdVar);
        keVar.d(t3Var.e());
        return ak.e(keVar);
    }

    @Override // pm.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized zm.a i(vm.a aVar) {
        zm.a aVarB;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            aVarB = this.f7907d.b(aVar);
            m(ie.NO_ERROR, jElapsedRealtime, aVar);
            f7905i = false;
        } catch (lm.a e15) {
            m(e15.a() == 14 ? ie.MODEL_NOT_DOWNLOADED : ie.UNKNOWN_ERROR, jElapsedRealtime, aVar);
            throw e15;
        }
        return aVarB;
    }
}
