package sd4;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.Function0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsd4/tm;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "h2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lrh2/a;", "M0", "Lrh2/a;", "g2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class tm extends ya {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: sd4.tm$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/tm$a;", "", "<init>", "()V", "Leo2/a;", "data", "Lsd4/tm;", "a", "(Leo2/a;)Lsd4/tm;", "", "TAG_TP_CONFIRMATION", "Ljava/lang/String;", "CONFIRMATION_DATA_KEY", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final tm a(eo2.a data) {
            tm tmVar = new tm();
            Bundle bundle = new Bundle();
            if (data != null) {
                bundle.putSerializable("CONFIRMATION_DATA_KEY", data);
            }
            tmVar.F1(bundle);
            return tmVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(final tm tmVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(614185120, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.TrustedProfileConfirmationFeatureFragment.GetContent.<anonymous> (TrustedProfileConfirmationFeatureFragment.kt:27)");
            }
            Bundle bundleV = tmVar.v();
            oq.i0 i0Var = null;
            Serializable serializable = bundleV != null ? bundleV.getSerializable("CONFIRMATION_DATA_KEY") : null;
            eo2.a aVar = serializable instanceof eo2.a ? (eo2.a) serializable : null;
            if (aVar == null) {
                rVar.X(628345769);
                rVar.R();
            } else {
                rVar.X(628345770);
                kotlin.a.C0011a c0011a = kotlin.a.C0011a.f1230a;
                boolean zG = rVar.G(tmVar);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: sd4.rm
                        @Override // er.a
                        public final Object a() {
                            return tm.d2(this.f180846a);
                        }
                    };
                    rVar.v(objE);
                }
                er.a aVar2 = (er.a) objE;
                boolean zG2 = rVar.G(tmVar);
                Object objE2 = rVar.E();
                if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.l() { // from class: sd4.sm
                        @Override // er.l
                        public final Object b(Object obj) {
                            return tm.e2(this.f180863a, (gx.b) obj);
                        }
                    };
                    rVar.v(objE2);
                }
                Function0.i(aVar2, c0011a, aVar, (er.l) objE2, rVar, kotlin.a.C0011a.f1232c << 3);
                rVar.R();
                i0Var = oq.i0.f148189a;
            }
            if (i0Var == null) {
                tmVar.g2().c("TrustedProfileConfirmationFragment");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(tm tmVar) {
        tmVar.g2().c("TrustedProfileConfirmationFragment");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(tm tmVar, gx.b bVar) {
        tmVar.h2().c(bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(tm tmVar, int i15, p076m2.r rVar, int i16) {
        tmVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1537316172);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1537316172, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.TrustedProfileConfirmationFeatureFragment.GetContent (TrustedProfileConfirmationFeatureFragment.kt:25)");
            }
            mc4.d.d(false, y2.m.d(614185120, true, new er.p() { // from class: sd4.pm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return tm.c2(this.f180803a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.qm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return tm.f2(this.f180824a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final rh2.a g2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d h2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
