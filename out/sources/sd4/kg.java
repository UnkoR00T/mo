package sd4;

import p050fp2.Function0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lsd4/kg;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "e2", "()Lrh2/a;", "setNavigator", "(Lrh2/a;)V", "navigator", "M0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kg extends z9 {

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int N0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a navigator;

    /* JADX INFO: renamed from: sd4.kg$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsd4/kg$a;", "", "<init>", "()V", "Lsd4/kg;", "a", "()Lsd4/kg;", "", "TAG", "Ljava/lang/String;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final kg a() {
            return new kg();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final kg kgVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1164443788, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.PassportAgreementFeatureFragment.GetContent.<anonymous> (PassportAgreementFeatureFragment.kt:19)");
            }
            boolean zG = rVar.G(kgVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.jg
                    @Override // er.a
                    public final Object a() {
                        return kg.c2(this.f180685a);
                    }
                };
                rVar.v(objE);
            }
            Function0.X((er.a) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(kg kgVar) {
        kgVar.e2().c("PASSPORT_AGREEMENT_TAG");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(kg kgVar, int i15, p076m2.r rVar, int i16) {
        kgVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(572649248);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(572649248, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.PassportAgreementFeatureFragment.GetContent (PassportAgreementFeatureFragment.kt:17)");
            }
            mc4.d.d(false, y2.m.d(-1164443788, true, new er.p() { // from class: sd4.hg
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return kg.b2(this.f180651a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.ig
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return kg.d2(this.f180667a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
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
