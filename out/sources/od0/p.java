package od0;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lod0/j;", "viewModel", "Loq/i0;", "l", "(Lod0/j;Lm2/r;I)V", "Lod0/j$a$c;", "data", "i", "(Lod0/j$a$c;Lm2/r;I)V", "Lod0/j$a$a;", "f", "(Lod0/j$a$a;Lm2/r;I)V", "Lod0/j$a;", "screenState", "schoolcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {
    private static final void f(final j.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2133291195);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2133291195, i16, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.screen.ErrorScreen (SchoolCardScreen.kt:50)");
            }
            error.getError().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: od0.l
                    @Override // er.a
                    public final Object a() {
                        return p.g();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: od0.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.h(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(j.a.Error error, int i15, p076m2.r rVar, int i16) {
        f(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void i(final j.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(249816546);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(249816546, i16, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.screen.SchoolCardInitializedContent (SchoolCardScreen.kt:33)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1575528789, true, new er.q() { // from class: od0.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.j(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: od0.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.k(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(j.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1575528789, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.screen.SchoolCardInitializedContent.<anonymous> (SchoolCardScreen.kt:37)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            o20.i.m(initialized.getScreenData(), rVar, BaseDocumentData.f140741h);
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
    public static final oq.i0 k(j.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        i(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-579086983);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-579086983, i16, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.screen.SchoolCardScreen (SchoolCardScreen.kt:20)");
            }
            j.a aVarM = m(m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarM, j.a.b.f144934a)) {
                rVarH.X(1843164586);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarM instanceof j.a.Initialized) {
                rVarH.X(1843166722);
                i((j.a.Initialized) aVarM, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarM instanceof j.a.Error)) {
                    rVarH.X(1843162267);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1843169393);
                f((j.a.Error) aVarM, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: od0.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.n(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a m(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(j jVar, int i15, p076m2.r rVar, int i16) {
        l(jVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
