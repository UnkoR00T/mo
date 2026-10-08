package sd4;

import p071kotlin.Metadata;
import p097os2.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsd4/uh;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "e2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lgx/d;", "M0", "Lgx/d;", "f2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class uh extends fa {
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final uh uhVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1150609068, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.PensionerCardFeatureFragment.GetContent.<anonymous> (PensionerCardFeatureFragment.kt:25)");
            }
            boolean zG = rVar.G(uhVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sd4.th
                    @Override // er.l
                    public final Object b(Object obj) {
                        return uh.c2(this.f180874a, (p097os2.p) obj);
                    }
                };
                rVar.v(objE);
            }
            Function1.n((er.l) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(uh uhVar, p097os2.p pVar) {
        if (pVar instanceof os2.p.a) {
            uhVar.e2().c("TAG_PENSIONER_CARD");
        } else if (pVar instanceof os2.p.c) {
            uhVar.f2().c(jr3.a.C2485a.f104604a);
        } else if (pVar instanceof os2.p.b) {
            uhVar.f2().c(wn3.o.f214223a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(uh uhVar, int i15, p076m2.r rVar, int i16) {
        uhVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-343575296);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-343575296, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.PensionerCardFeatureFragment.GetContent (PensionerCardFeatureFragment.kt:23)");
            }
            mc4.d.d(false, y2.m.d(-1150609068, true, new er.p() { // from class: sd4.rh
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return uh.b2(this.f180838a, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sd4.sh
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return uh.d2(this.f180854a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final rh2.a e2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d f2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
