package st1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lst1/c;", "viewModel", "Loq/i0;", "o", "(Lst1/c;Lm2/r;I)V", "Lst1/c$a;", "screenData", "g", "(Lst1/c$a;Lm2/r;I)V", "Lst1/c$a$c;", "l", "(Lst1/c$a$c;Lm2/r;I)V", "Lst1/c$a$b;", "i", "(Lst1/c$a$b;Lm2/r;I)V", "documentrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void g(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1259247226);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1259247226, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.passportslist.DocumentRestrictionPassportsListContent (DocumentRestrictionPassportsListScreen.kt:32)");
            }
            if (fr.t.c(aVar, c.a.C4753a.f184203a)) {
                rVarH.X(-1044189237);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof c.a.PassportsList) {
                rVarH.X(-1044187362);
                l((c.a.PassportsList) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.NoPassports)) {
                    rVarH.X(-1044190569);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1044183970);
                i((c.a.NoPassports) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: st1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.h(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c.a aVar, int i15, p076m2.r rVar, int i16) {
        g(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final c.a.NoPassports noPassports, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1974097382);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noPassports) : rVarH.G(noPassports) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1974097382, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.passportslist.DocumentRestrictionPassportsListEmptyScreen (DocumentRestrictionPassportsListScreen.kt:67)");
            }
            rVar2 = rVarH;
            i50.s.r(noPassports.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1822899897, true, new er.q() { // from class: st1.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.j(noPassports, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: st1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(noPassports, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.NoPassports noPassports, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1822899897, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.passportslist.DocumentRestrictionPassportsListEmptyScreen.<anonymous> (DocumentRestrictionPassportsListScreen.kt:69)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(noPassports.a(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 k(c.a.NoPassports noPassports, int i15, p076m2.r rVar, int i16) {
        i(noPassports, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final c.a.PassportsList passportsList, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(2018741332);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(passportsList) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2018741332, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.passportslist.DocumentRestrictionPassportsListInitialized (DocumentRestrictionPassportsListScreen.kt:41)");
            }
            rVar2 = rVarH;
            i50.s.r(passportsList.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1290636353, true, new er.q() { // from class: st1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.m(passportsList, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: st1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.n(passportsList, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.a.PassportsList passportsList, d3 d3Var, p076m2.r rVar, int i15) {
        int i16 = (i15 & 6) == 0 ? i15 | (rVar.W(d3Var) ? 4 : 2) : i15;
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1290636353, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.passportslist.DocumentRestrictionPassportsListInitialized.<anonymous> (DocumentRestrictionPassportsListScreen.kt:43)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(w0.i.d(companion, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, passportsList.getHeader(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.X(-1389951853);
            int i18 = 0;
            for (Object obj : passportsList.b()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    pq.v.x();
                }
                h0.v((n50.k) obj, null, rVar, 0, 2);
                if (i18 != pq.v.p(passportsList.b())) {
                    rVar.X(1416648318);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                } else {
                    rVar.X(1413913622);
                }
                rVar.R();
                i18 = i19;
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
    public static final i0 n(c.a.PassportsList passportsList, int i15, p076m2.r rVar, int i16) {
        l(passportsList, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-290680951);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-290680951, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.passportslist.DocumentRestrictionPassportsListScreen (DocumentRestrictionPassportsListScreen.kt:26)");
            }
            g(p(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: st1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.q(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a p(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c cVar, int i15, p076m2.r rVar, int i16) {
        o(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
