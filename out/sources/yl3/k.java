package yl3;

import d1.a3;
import d1.d3;
import d1.e0;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lyl3/g;", "viewModel", "Loq/i0;", "g", "(Lyl3/g;Lm2/r;I)V", "Lyl3/g$a$c;", "data", "d", "(Lyl3/g$a$c;Lm2/r;I)V", "Lyl3/g$a;", "state", "vehicleregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void d(final g.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1616851171);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1616851171, i16, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.form.registrationplatestype.RegistrationPlatesTypeContent (RegistrationPlatesTypeScreen.kt:37)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(158329936, true, new er.q() { // from class: yl3.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.e(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yl3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.f(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(g.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(158329936, i16, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.form.registrationplatestype.RegistrationPlatesTypeContent.<anonymous> (RegistrationPlatesTypeScreen.kt:39)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(f3.m.INSTANCE, d3Var), null, rVar, 0, 1), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            w0 w0VarA = e0.a(iVar.r(aVar.b(rVar, i17).getSpacing200()), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            j70.h.g(null, null, initialized.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).m(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            m30.i.d(initialized.getCards(), null, null, rVar, 0, 6);
            c30.b alertData = initialized.getAlertData();
            if (alertData == null) {
                rVar.X(1992815041);
            } else {
                rVar.X(1992815042);
                c30.e.c(null, alertData, rVar, c30.b.f22944i << 3, 1);
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        d(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-758825598);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-758825598, i16, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.form.registrationplatestype.RegistrationPlatesTypeScreen (RegistrationPlatesTypeScreen.kt:25)");
            }
            g.a aVarH = h(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarH, g.a.b.f227813a)) {
                rVarH.X(913048307);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarH instanceof g.a.Error) {
                rVarH.X(913051114);
                ((g.a.Error) aVarH).getVmsAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof g.a.Initialized)) {
                    rVarH.X(913045672);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(913053356);
                d((g.a.Initialized) aVarH, rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yl3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a h(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(g gVar, int i15, p076m2.r rVar, int i16) {
        g(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
