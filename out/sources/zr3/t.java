package zr3;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lzr3/p;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "innerNavContent", "d", "(Lzr3/p;Ler/p;Lm2/r;I)V", "Lzr3/p$a;", "screenData", "g", "(Lzr3/p$a;Ler/p;Lm2/r;II)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    public static final void d(final p pVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1731988806);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1731988806, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.NewVisitWizardScreen (NewVisitWizardScreen.kt:26)");
            }
            f6 f6VarC = m7.b.c(pVar.getState(), null, null, null, rVarH, 0, 7);
            g(e(f6VarC), pVar2, rVarH, (i16 & 112) | BaseScaffoldData.f89350g, 0);
            q0.g(false, e(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zr3.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.f(pVar, pVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.Data e(f6<p.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(p pVar, er.p pVar2, int i15, p076m2.r rVar, int i16) {
        d(pVar, pVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void g(final p.Data data, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.p<? super p076m2.r, ? super Integer, oq.i0> pVar2;
        boolean z15;
        p076m2.r rVar2;
        final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar3;
        d5 d5VarM;
        final er.p<? super p076m2.r, ? super Integer, oq.i0> pVarC;
        p076m2.r rVarH = rVar.h(-1464266953);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                pVar2 = pVar;
                i17 |= rVarH.G(pVar2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    pVarC = c.f236516a.c();
                } else {
                    pVarC = pVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1464266953, i17, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.NewVisitWizardScreenContent (NewVisitWizardScreen.kt:42)");
                }
                pVar3 = pVarC;
                rVar2 = rVarH;
                i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1009039702, true, new er.q() { // from class: zr3.r
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return t.h(pVarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar3 = pVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: zr3.s
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.i(data, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        pVar2 = pVar;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                pVarC = c.f236516a.c();
            } else {
                pVarC = pVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1464266953, i17, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.NewVisitWizardScreenContent (NewVisitWizardScreen.kt:42)");
            }
            pVar3 = pVarC;
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1009039702, true, new er.q() { // from class: zr3.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.h(pVarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
            pVar3 = pVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zr3.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.i(data, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(er.p pVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1009039702, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.NewVisitWizardScreenContent.<anonymous> (NewVisitWizardScreen.kt:47)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(p.Data data, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        g(data, pVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
