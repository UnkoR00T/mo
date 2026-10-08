package v23;

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
import p088nul.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lv23/d;", "viewModel", "Loq/i0;", "h", "(Lv23/d;Lm2/r;I)V", "Lv23/d$b$a;", "data", "e", "(Lv23/d$b$a;Lm2/r;I)V", "Lv23/d$b;", "state", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void e(final d.b.Displayed displayed, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-51387669);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(displayed) : rVarH.G(displayed) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-51387669, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.attachments.AttachmentsContent (AttachmentsScreen.kt:38)");
            }
            rVar2 = rVarH;
            i50.s.r(displayed.getBaseScaffoldData(), t.f203405a.b(), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-658239010, true, new er.q() { // from class: v23.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.f(displayed, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v23.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.g(displayed, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(d.b.Displayed displayed, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-658239010, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.attachments.AttachmentsContent.<anonymous> (AttachmentsScreen.kt:43)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            m30.i.d(displayed.getFiles(), null, null, rVar, 0, 6);
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
    public static final i0 g(d.b.Displayed displayed, int i15, p076m2.r rVar, int i16) {
        e(displayed, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-8113851);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-8113851, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.attachments.AttachmentsScreen (AttachmentsScreen.kt:24)");
            }
            final f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            d.b bVarI = i(f6VarC);
            if (bVarI instanceof d.b.Empty) {
                rVarH.X(792530070);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(bVarI instanceof d.b.Displayed)) {
                    rVarH.X(792528014);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(792532164);
                e((d.b.Displayed) bVarI, rVarH, 0);
                rVarH.R();
            }
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: v23.f
                    @Override // er.a
                    public final Object a() {
                        return j.j(f6VarC);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v23.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.b i(f6<? extends d.b> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f6 f6Var) {
        i(f6Var).a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d dVar, int i15, p076m2.r rVar, int i16) {
        h(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
