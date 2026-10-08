package sd4;

import p071kotlin.Metadata;
import p089o13.Function0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsd4/oj;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "e2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Ln13/c;", "M0", "Ln13/c;", "f2", "()Ln13/c;", "setGetEmergencyBackpackDataUC", "(Ln13/c;)V", "getEmergencyBackpackDataUC", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class oj extends ma {
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public n13.c getEmergencyBackpackDataUC;

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final oj ojVar, s13.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(72754420, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.SafetyGuideFeatureFragment.GetContent.<anonymous> (SafetyGuideFeatureFragment.kt:35)");
            }
            boolean zG = rVar.G(ojVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.nj
                    @Override // er.a
                    public final Object a() {
                        return oj.c2(this.f180766a);
                    }
                };
                rVar.v(objE);
            }
            Function0.y((er.a) objE, aVar, ojVar.f2(), rVar, n13.c.f130698b << 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(oj ojVar) {
        ojVar.e2().c("SafetyGuideFragment");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(oj ojVar, int i15, p076m2.r rVar, int i16) {
        ojVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        p076m2.r rVarH = rVar.h(-1125566816);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1125566816, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.SafetyGuideFeatureFragment.GetContent (SafetyGuideFeatureFragment.kt:26)");
            }
            boolean zA = w0.h0.a(rVarH, 0);
            boolean zA2 = rVarH.a(zA);
            Object objE = rVarH.E();
            if (zA2 || objE == p076m2.r.INSTANCE.a()) {
                if (zA) {
                    obj = s13.d.f177466a;
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    obj = s13.e.f177468a;
                }
                objE = obj;
                rVarH.v(objE);
            }
            final s13.a aVar = (s13.a) objE;
            mc4.d.d(false, y2.m.d(72754420, true, new er.p() { // from class: sd4.lj
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return oj.b2(this.f180729a, aVar, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.mj
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return oj.d2(this.f180749a, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
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

    public final n13.c f2() {
        n13.c cVar = this.getEmergencyBackpackDataUC;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }
}
