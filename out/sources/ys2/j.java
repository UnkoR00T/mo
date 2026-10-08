package ys2;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import i50.s;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lys2/e;", "viewModel", "Loq/i0;", "e", "(Lys2/e;Lm2/r;I)V", "Lys2/e$a;", "screenData", "h", "(Lys2/e$a;Lm2/r;I)V", "Lys2/e$a$b;", "j", "(Lys2/e$a$b;Lm2/r;I)V", "data", "peselrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void e(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1201683037);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1201683037, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.checksdetails.PeselRestrictionHistoryChecksDetailsScreen (PeselRestrictionHistoryChecksDetailsScreen.kt:27)");
            }
            h(f(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ys2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.g(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a f(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(e eVar, int i15, p076m2.r rVar, int i16) {
        e(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1314547840);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1314547840, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.checksdetails.PeselRestrictionHistoryChecksDetailsScreenContent (PeselRestrictionHistoryChecksDetailsScreen.kt:33)");
            }
            if (fr.t.c(aVar, e.a.C6153a.f229232a)) {
                rVarH.X(-560085628);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.Initialized)) {
                    rVarH.X(-560086693);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-560084587);
                j((e.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ys2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e.a aVar, int i15, p076m2.r rVar, int i16) {
        h(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-459649676);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-459649676, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.checksdetails.PeselRestrictionHistoryChecksDetailsScreenDisplayed (PeselRestrictionHistoryChecksDetailsScreen.kt:41)");
            }
            rVar2 = rVarH;
            s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1394983213, true, new er.q() { // from class: ys2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.k(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ys2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        k70.a aVar;
        int i17;
        f3.m.Companion companion;
        boolean z15;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1394983213, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.checksdetails.PeselRestrictionHistoryChecksDetailsScreenDisplayed.<anonymous>.<anonymous> (PeselRestrictionHistoryChecksDetailsScreen.kt:43)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), null, rVar2, 6, 1);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarL = a3.l(a3.q(w0.i.d(mVarS, aVar2.a(rVar2, i18).getBase().a(), null, 2, null), aVar2.b(rVar2, i18).getSpacing200(), aVar2.b(rVar2, i18).getSpacing100(), aVar2.b(rVar2, i18).getSpacing200(), aVar2.b(rVar2, i18).getSpacing200()), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarL);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (initialized.getInstitutionNameLabel() == null) {
                rVar2.X(260830019);
                rVar2.R();
                companion = companion2;
                i17 = i18;
                aVar = aVar2;
                z15 = false;
            } else {
                rVar2.X(260830020);
                j70.h.g(null, null, initialized.getInstitutionNameLabel(), null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                aVar = aVar2;
                i17 = i18;
                companion = companion2;
                z15 = false;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
                rVar2.R();
            }
            k70.a aVar3 = aVar;
            int i19 = i17;
            f3.m.Companion companion4 = companion;
            j70.h.g(null, null, initialized.getVerifiedAtDateLabel(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar, i19).getSpacing300()), rVar, 0);
            m30.i.d(initialized.getAdditionalData(), null, null, rVar, 0, 6);
            AccordionData timelineAccordionData = initialized.getTimelineAccordionData();
            if (timelineAccordionData == null) {
                rVar.X(261401721);
            } else {
                rVar.X(261401722);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar, i19).getSpacing200()), rVar, 0);
                b30.j.g(timelineAccordionData, rVar, AccordionData.f16343b);
            }
            rVar.R();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
