package j93;

import d1.a3;
import d1.d3;
import d1.e0;
import i50.BaseScaffoldData;
import i93.SecurityAlertScreenModel;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lj93/g;", "viewModel", "Loq/i0;", "j", "(Lj93/g;Lm2/r;I)V", "Lj93/g$a$b;", "data", "m", "(Lj93/g$a$b;Lm2/r;I)V", "Lj93/g$a$a;", "g", "(Lj93/g$a$a;Lm2/r;I)V", "Lj93/g$a;", "threatdetection_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    private static final void g(final g.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(60621079);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(60621079, i16, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.alert.ErrorScreen (SecurityAlertScreen.kt:90)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: j93.h
                    @Override // er.a
                    public final Object a() {
                        return n.h();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: j93.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.i(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(g.a.Error error, int i15, p076m2.r rVar, int i16) {
        g(error, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1090254215);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1090254215, i16, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.alert.SecurityAlertScreen (SecurityAlertScreen.kt:28)");
            }
            g.a aVarK = k(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarK instanceof g.a.Initialized) {
                rVarH.X(-237712809);
                m((g.a.Initialized) aVarK, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarK instanceof g.a.Error)) {
                    rVarH.X(-237715241);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-237709820);
                g((g.a.Error) aVarK, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: j93.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a k(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(g gVar, int i15, p076m2.r rVar, int i16) {
        j(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final g.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1185378967);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1185378967, i16, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.alert.SecurityAlertScreenInitialized (SecurityAlertScreen.kt:40)");
            }
            i50.s.r(initialized.getModel().getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(572102986, true, new er.q() { // from class: j93.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: j93.k
                    @Override // er.a
                    public final Object a() {
                        return n.o(initialized);
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
            d5VarM.a(new er.p() { // from class: j93.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(g.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(572102986, i15, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.alert.SecurityAlertScreenInitialized.<anonymous> (SecurityAlertScreen.kt:44)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            IconPageData<SecurityAlertScreenModel.ContentData, IconPageBottomContentData> iconPageDataB = initialized.getModel().b();
            d dVar = d.f100469a;
            q40.i.b(iconPageDataB, dVar.e(), dVar.d(), rVar, 432, 0);
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
    public static final i0 o(g.a.Initialized initialized) {
        initialized.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(g.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        m(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
