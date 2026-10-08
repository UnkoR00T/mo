package sd4;

import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lsd4/t3;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "e2", "()Lrh2/a;", "setNavigator", "(Lrh2/a;)V", "navigator", "M0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t3 extends n8 {

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int N0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a navigator;

    /* JADX INFO: renamed from: sd4.t3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/t3$a;", "", "<init>", "()V", "Lmm1/a;", "type", "Lsd4/t3;", "a", "(Lmm1/a;)Lsd4/t3;", "", "TAG", "Ljava/lang/String;", "TYPE", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final t3 a(mm1.a type) {
            t3 t3Var = new t3();
            t3Var.F1(e6.c.a(oq.y.a("DEPENDENT_ID_SUSPENSION_TYPE", type.name())));
            return t3Var;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(mm1.a aVar, final t3 t3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(315183063, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.DependentIdSuspensionFeatureFragment.GetContent.<anonymous>.<anonymous> (DependentIdSuspensionFeatureFragment.kt:25)");
            }
            boolean zG = rVar.G(t3Var);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.s3
                    @Override // er.a
                    public final Object a() {
                        return t3.c2(this.f180849a);
                    }
                };
                rVar.v(objE);
            }
            um1.k1.d0(aVar, (er.a) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(t3 t3Var) {
        t3Var.e2().c("DEPENDENT_ID_SUSPENSION_TAG");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(t3 t3Var, int i15, p076m2.r rVar, int i16) {
        t3Var.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        String string;
        p076m2.r rVarH = rVar.h(138644608);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(138644608, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.DependentIdSuspensionFeatureFragment.GetContent (DependentIdSuspensionFeatureFragment.kt:19)");
            }
            Bundle bundleV = v();
            final mm1.a aVarA = (bundleV == null || (string = bundleV.getString("DEPENDENT_ID_SUSPENSION_TYPE")) == null) ? null : mm1.a.INSTANCE.a(string);
            if (aVarA == null) {
                rVarH.X(-1396924235);
            } else {
                rVarH.X(-1396924234);
                mc4.d.d(false, y2.m.d(315183063, true, new er.p() { // from class: sd4.q3
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t3.b2(aVarA, this, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 48, 1);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sd4.r3
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t3.d2(this.f180831a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final rh2.a e2() {
        rh2.a aVar = this.navigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
