package um;

import android.os.SystemClock;
import ch.b3;
import ch.c3;
import ch.ce;
import ch.ck;
import ch.de;
import ch.e3;
import ch.f1;
import ch.je;
import ch.mf;
import ch.mk;
import ch.nk;
import ch.pk;
import ch.qk;
import ch.we;
import ch.xe;
import ch.yd;
import ch.ye;
import ch.ze;
import java.util.Iterator;
import java.util.List;
import jg.s;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends pm.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final wm.d f199037j = wm.d.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static boolean f199038k = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rm.b f199039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f199040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nk f199041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pk f199042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wm.a f199043h = new wm.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f199044i;

    public k(pm.i iVar, rm.b bVar, l lVar, nk nkVar) {
        s.m(iVar, "MlKitContext can not be null");
        s.m(bVar, "BarcodeScannerOptions can not be null");
        this.f199039d = bVar;
        this.f199040e = lVar;
        this.f199041f = nkVar;
        this.f199042g = pk.a(iVar.b());
    }

    private final void m(final xe xeVar, long j15, final vm.a aVar, List list) {
        final f1 f1Var = new f1();
        final f1 f1Var2 = new f1();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sm.a aVar2 = (sm.a) it.next();
                f1Var.e(b.a(aVar2.c()));
                f1Var2.e(b.b(aVar2.f()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j15;
        this.f199041f.f(new mk() { // from class: um.i
            @Override // ch.mk
            public final ck zza() {
                return this.f199030a.j(jElapsedRealtime, xeVar, f1Var, f1Var2, aVar);
            }
        }, ye.ON_DEVICE_BARCODE_DETECT);
        c3 c3Var = new c3();
        c3Var.e(xeVar);
        c3Var.f(Boolean.valueOf(f199038k));
        c3Var.g(b.c(this.f199039d));
        c3Var.c(f1Var.g());
        c3Var.d(f1Var2.g());
        final e3 e3VarH = c3Var.h();
        final j jVar = new j(this);
        final nk nkVar = this.f199041f;
        final ye yeVar = ye.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        pm.g.d().execute(new Runnable() { // from class: ch.lk
            @Override // java.lang.Runnable
            public final void run() {
                nkVar.h(yeVar, e3VarH, jElapsedRealtime, jVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f199042g.c(true != this.f199044i ? 24301 : 24302, xeVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // pm.k
    public final synchronized void b() {
        this.f199044i = this.f199040e.a();
    }

    @Override // pm.k
    public final synchronized void d() {
        try {
            this.f199040e.zzb();
            f199038k = true;
            ze zeVar = new ze();
            we weVar = this.f199044i ? we.TYPE_THICK : we.TYPE_THIN;
            nk nkVar = this.f199041f;
            zeVar.e(weVar);
            mf mfVar = new mf();
            mfVar.i(b.c(this.f199039d));
            zeVar.g(mfVar.j());
            nkVar.d(qk.a(zeVar), ye.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    final /* synthetic */ ck j(long j15, xe xeVar, f1 f1Var, f1 f1Var2, vm.a aVar) {
        de deVar;
        mf mfVar = new mf();
        je jeVar = new je();
        jeVar.c(Long.valueOf(j15));
        jeVar.d(xeVar);
        jeVar.e(Boolean.valueOf(f199038k));
        Boolean bool = Boolean.TRUE;
        jeVar.a(bool);
        jeVar.b(bool);
        mfVar.h(jeVar.f());
        mfVar.i(b.c(this.f199039d));
        mfVar.e(f1Var.g());
        mfVar.f(f1Var2.g());
        int iH = aVar.h();
        int iD = f199037j.d(aVar);
        ce ceVar = new ce();
        if (iH == -1) {
            deVar = de.BITMAP;
        } else if (iH == 35) {
            deVar = de.YUV_420_888;
        } else if (iH == 842094169) {
            deVar = de.YV12;
        } else if (iH != 16) {
            deVar = iH != 17 ? de.UNKNOWN_FORMAT : de.NV21;
        } else {
            deVar = de.NV16;
        }
        ceVar.a(deVar);
        ceVar.b(Integer.valueOf(iD));
        mfVar.g(ceVar.d());
        ze zeVar = new ze();
        zeVar.e(this.f199044i ? we.TYPE_THICK : we.TYPE_THIN);
        zeVar.g(mfVar.j());
        return qk.a(zeVar);
    }

    final /* synthetic */ ck k(e3 e3Var, int i15, yd ydVar) {
        ze zeVar = new ze();
        zeVar.e(this.f199044i ? we.TYPE_THICK : we.TYPE_THIN);
        b3 b3Var = new b3();
        b3Var.a(Integer.valueOf(i15));
        b3Var.c(e3Var);
        b3Var.b(ydVar);
        zeVar.d(b3Var.e());
        return qk.a(zeVar);
    }

    @Override // pm.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(vm.a aVar) throws Throwable {
        k kVar;
        vm.a aVar2;
        try {
            try {
                wm.a aVar3 = this.f199043h;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                aVar3.a(aVar);
                try {
                    List listB = this.f199040e.b(aVar);
                    kVar = this;
                    aVar2 = aVar;
                    try {
                        kVar.m(xe.NO_ERROR, jElapsedRealtime, aVar2, listB);
                        f199038k = false;
                        return listB;
                    } catch (lm.a e15) {
                        e = e15;
                        lm.a aVar4 = e;
                        kVar.m(aVar4.a() == 14 ? xe.MODEL_NOT_DOWNLOADED : xe.UNKNOWN_ERROR, jElapsedRealtime, aVar2, null);
                        throw aVar4;
                    }
                } catch (lm.a e16) {
                    e = e16;
                    kVar = this;
                    aVar2 = aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
