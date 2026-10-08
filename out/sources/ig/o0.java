package ig;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class o0 implements vh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f92249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f92251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f92252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f92253e;

    o0(e eVar, int i15, b bVar, long j15, long j16, String str, String str2) {
        this.f92249a = eVar;
        this.f92250b = i15;
        this.f92251c = bVar;
        this.f92252d = j15;
        this.f92253e = j16;
    }

    static o0 b(e eVar, int i15, b bVar) {
        boolean zR;
        if (!eVar.v()) {
            return null;
        }
        jg.u uVarA = jg.t.b().a();
        if (uVarA == null) {
            zR = true;
        } else {
            if (!uVarA.p()) {
                return null;
            }
            zR = uVarA.r();
            e0 e0VarR = eVar.r(bVar);
            if (e0VarR != null) {
                if (!(e0VarR.t() instanceof jg.c)) {
                    return null;
                }
                jg.c cVar = (jg.c) e0VarR.t();
                if (cVar.G() && !cVar.c()) {
                    jg.f fVarC = c(e0VarR, cVar, i15);
                    if (fVarC == null) {
                        return null;
                    }
                    e0VarR.G();
                    zR = fVarC.u();
                }
            }
        }
        return new o0(eVar, i15, bVar, zR ? System.currentTimeMillis() : 0L, zR ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static jg.f c(e0 e0Var, jg.c cVar, int i15) {
        int[] iArrM;
        int[] iArrP;
        jg.f fVarE = cVar.E();
        if (fVarE == null || !fVarE.r() || ((iArrM = fVarE.m()) != null ? !com.google.android.gms.common.util.b.a(iArrM, i15) : !((iArrP = fVarE.p()) == null || !com.google.android.gms.common.util.b.a(iArrP, i15))) || e0Var.F() >= fVarE.h()) {
            return null;
        }
        return fVarE;
    }

    @Override // vh.f
    public final void a(vh.l lVar) {
        e0 e0VarR;
        int iU;
        int i15;
        int i16;
        int iP;
        int iM;
        int i17;
        long j15;
        long j16;
        int iElapsedRealtime;
        e eVar = this.f92249a;
        if (eVar.v()) {
            jg.u uVarA = jg.t.b().a();
            if ((uVarA == null || uVarA.p()) && (e0VarR = eVar.r(this.f92251c)) != null && (e0VarR.t() instanceof jg.c)) {
                jg.c cVar = (jg.c) e0VarR.t();
                long j17 = this.f92252d;
                boolean zR = j17 > 0;
                int iW = cVar.w();
                if (uVarA != null) {
                    zR &= uVarA.r();
                    int iH = uVarA.h();
                    int iM2 = uVarA.m();
                    iU = uVarA.u();
                    if (cVar.G() && !cVar.c()) {
                        jg.f fVarC = c(e0VarR, cVar, this.f92250b);
                        if (fVarC == null) {
                            return;
                        }
                        boolean z15 = fVarC.u() && j17 > 0;
                        iM2 = fVarC.h();
                        zR = z15;
                    }
                    i16 = iH;
                    i15 = iM2;
                } else {
                    j17 = j17;
                    iU = 0;
                    i15 = 100;
                    i16 = 5000;
                }
                if (lVar.q()) {
                    i17 = 0;
                    iM = 0;
                } else if (lVar.o()) {
                    iM = -1;
                    i17 = 100;
                } else {
                    Exception excL = lVar.l();
                    if (excL instanceof hg.b) {
                        Status statusA = ((hg.b) excL).a();
                        iP = statusA.p();
                        gg.a aVarH = statusA.h();
                        if (aVarH != null) {
                            iM = aVarH.m();
                        }
                        i17 = iP;
                    } else {
                        iP = 101;
                    }
                    iM = -1;
                    i17 = iP;
                }
                if (zR) {
                    long j18 = this.f92253e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    j15 = j17;
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j18);
                    j16 = jCurrentTimeMillis;
                } else {
                    j15 = 0;
                    j16 = 0;
                    iElapsedRealtime = -1;
                }
                eVar.A(new jg.q(this.f92250b, i17, iM, j15, j16, null, null, iW, iElapsedRealtime), iU, i16, i15);
            }
        }
    }
}
