package sd4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lsd4/w5;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "e2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "M0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w5 extends w8 {
    public static final int N0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(vy1.a aVar, final w5 w5Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1802026100, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.ElectoralRegisterFeatureFragment.GetContent.<anonymous> (ElectoralRegisterFeatureFragment.kt:30)");
            }
            boolean zG = rVar.G(w5Var);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.v5
                    @Override // er.a
                    public final Object a() {
                        return w5.c2(this.f180900a);
                    }
                };
                rVar.v(objE);
            }
            uy1.d0.t(aVar, (er.a) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(w5 w5Var) {
        w5Var.e2().c("TAG_ELECTORAL_REGISTER");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(w5 w5Var, int i15, p076m2.r rVar, int i16) {
        w5Var.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        p076m2.r rVarH = rVar.h(-755848160);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-755848160, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.ElectoralRegisterFeatureFragment.GetContent (ElectoralRegisterFeatureFragment.kt:21)");
            }
            boolean zA = w0.h0.a(rVarH, 0);
            boolean zA2 = rVarH.a(zA);
            Object objE = rVarH.E();
            if (zA2 || objE == p076m2.r.INSTANCE.a()) {
                if (zA) {
                    obj = vy1.d.f208705a;
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    obj = vy1.e.f208707a;
                }
                objE = obj;
                rVarH.v(objE);
            }
            final vy1.a aVar = (vy1.a) objE;
            mc4.d.d(false, y2.m.d(1802026100, true, new er.p() { // from class: sd4.t5
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return w5.b2(aVar, this, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.u5
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return w5.d2(this.f180881a, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
}
