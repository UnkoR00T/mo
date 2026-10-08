package nt1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lnt1/e;", "viewModel", "Loq/i0;", "q", "(Lnt1/e;Lm2/r;I)V", "Lnt1/e$a;", "screenData", "h", "(Lnt1/e$a;Lm2/r;I)V", "Lnt1/e$a$c;", "j", "(Lnt1/e$a$c;Lm2/r;I)V", "Lnt1/e$a$d;", "n", "(Lnt1/e$a$d;Lm2/r;I)V", "documentrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    private static final void h(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1981461441);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1981461441, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.drivinglicence.DocumentRestrictionDrivingLicenceDetailsContent (DocumentRestrictionDrivingLicenceDetailsScreen.kt:34)");
            }
            if (fr.t.c(aVar, e.a.b.f138323a)) {
                rVarH.X(1513936338);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof e.a.Error) {
                rVarH.X(1513938217);
                ((e.a.Error) aVar).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof e.a.Initialized) {
                rVarH.X(1513939437);
                j((e.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.NoDrivingLicence)) {
                    rVarH.X(1513935370);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1513942930);
                n((e.a.NoDrivingLicence) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: nt1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.i(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e.a aVar, int i15, p076m2.r rVar, int i16) {
        h(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void j(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1676366756);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1676366756, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.drivinglicence.DocumentRestrictionDrivingLicenceDetailsInitialized (DocumentRestrictionDrivingLicenceDetailsScreen.kt:44)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(1773597455, true, new er.p() { // from class: nt1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-901915625, true, new er.q() { // from class: nt1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.l(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: nt1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.m(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1773597455, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.drivinglicence.DocumentRestrictionDrivingLicenceDetailsInitialized.<anonymous> (DocumentRestrictionDrivingLicenceDetailsScreen.kt:48)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
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
            h30.q.p(initialized.getNextButtonData(), false, null, rVar, 0, 6);
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
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final i0 l(e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        ?? r15;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-901915625, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.drivinglicence.DocumentRestrictionDrivingLicenceDetailsInitialized.<anonymous> (DocumentRestrictionDrivingLicenceDetailsScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), rVar, 0);
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
            Label header = initialized.getHeader();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, header, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, initialized.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            m30.i.d(initialized.getAppRestrictionCardListData(), null, null, rVar2, 0, 6);
            if (initialized.getBankRestrictionsCardListData() == null) {
                rVar2.X(-90236457);
                rVar2.R();
                r15 = 0;
            } else {
                rVar2.X(-90236456);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, initialized.getBankRestrictionsHeader(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                r15 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(initialized.getBankRestrictionsCardListData(), null, null, rVar2, 0, 6);
                rVar2.R();
            }
            rVar2.x();
            q0.g(r15, initialized.h(), rVar2, r15, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final e.a.NoDrivingLicence noDrivingLicence, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1010874084);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noDrivingLicence) : rVarH.G(noDrivingLicence) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1010874084, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.drivinglicence.DocumentRestrictionDrivingLicenceDetailsNoDrivingLicence (DocumentRestrictionDrivingLicenceDetailsScreen.kt:88)");
            }
            rVar2 = rVarH;
            i50.s.r(noDrivingLicence.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1296309711, true, new er.q() { // from class: nt1.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.o(noDrivingLicence, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: nt1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.p(noDrivingLicence, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(e.a.NoDrivingLicence noDrivingLicence, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1296309711, i15, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.drivinglicence.DocumentRestrictionDrivingLicenceDetailsNoDrivingLicence.<anonymous> (DocumentRestrictionDrivingLicenceDetailsScreen.kt:90)");
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
            q40.i.b(noDrivingLicence.a(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 p(e.a.NoDrivingLicence noDrivingLicence, int i15, p076m2.r rVar, int i16) {
        n(noDrivingLicence, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1920225298);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1920225298, i16, -1, "pl.gov.coi.mobywatel.feature.documentrestriction.presentation.drivinglicence.DocumentRestrictionDrivingLicenceDetailsScreen (DocumentRestrictionDrivingLicenceDetailsScreen.kt:28)");
            }
            h(r(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nt1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a r(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(e eVar, int i15, p076m2.r rVar, int i16) {
        q(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
