package a32;

import c32.DescriptionSectionData;
import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j50.f0;
import k40.EmptyStateData;
import mx.Label;
import oq.i0;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"La32/c;", "viewModel", "Loq/i0;", "p", "(La32/c;Lm2/r;I)V", "Lc32/a;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lc32/b;", "descriptionSectionData", "l", "(Lc32/a;Lc32/b;Lm2/r;I)V", "data", "n", "(Lc32/b;Lm2/r;I)V", "Lk40/a;", "j", "(Lk40/a;Lm2/r;I)V", "h", "La32/c$a;", "state", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void h(final DescriptionSectionData descriptionSectionData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-354984950);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(descriptionSectionData) : rVarH.G(descriptionSectionData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-354984950, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.searchrecipient.DescriptionSection (SearchRecipientScreen.kt:112)");
            }
            Label descriptionLabel = descriptionSectionData.getDescriptionLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, descriptionLabel, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            ButtonTextData advanceSearchButton = descriptionSectionData.getAdvanceSearchButton();
            if (advanceSearchButton == null) {
                rVarH.X(-1146920246);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(-1146920245);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
                j30.f.e(null, advanceSearchButton, false, rVarH, ButtonTextData.f99099f << 3, 5);
                rVar2 = rVarH;
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a32.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(descriptionSectionData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(DescriptionSectionData descriptionSectionData, int i15, p076m2.r rVar, int i16) {
        h(descriptionSectionData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final EmptyStateData emptyStateData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(270006697);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(emptyStateData) : rVarH.G(emptyStateData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(270006697, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.searchrecipient.EmptyStateSection (SearchRecipientScreen.kt:100)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing500());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            k40.d.c(null, emptyStateData, rVarH, (EmptyStateData.f108236d << 3) | ((i16 << 3) & 112), 1);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a32.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(emptyStateData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(EmptyStateData emptyStateData, int i15, p076m2.r rVar, int i16) {
        j(emptyStateData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final c32.a aVar, final DescriptionSectionData descriptionSectionData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1209172868);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(descriptionSectionData) : rVarH.G(descriptionSectionData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1209172868, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.searchrecipient.SearchBarActiveContent (SearchRecipientScreen.kt:71)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(companion, aVar2.b(rVarH, i17).getSpacing200(), aVar2.b(rVarH, i17).getSpacing100(), aVar2.b(rVarH, i17).getSpacing200(), aVar2.b(rVarH, i17).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarQ);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (aVar instanceof c32.a.Empty) {
                rVarH.X(48074564);
                j(((c32.a.Empty) aVar).getData(), rVarH, EmptyStateData.f108236d);
                rVarH.R();
            } else if (aVar instanceof c32.a.C0609a) {
                rVarH.X(48077099);
                h(descriptionSectionData, rVarH, ButtonTextData.f99099f | ((i16 >> 3) & 14));
                rVarH.R();
            } else {
                if (!(aVar instanceof c32.a.Recipients)) {
                    rVarH.X(48073148);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(48079807);
                m30.m.d(((c32.a.Recipients) aVar).getData(), null, rVarH, 0, 2);
                rVarH.R();
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a32.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.m(aVar, descriptionSectionData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c32.a aVar, DescriptionSectionData descriptionSectionData, int i15, p076m2.r rVar, int i16) {
        l(aVar, descriptionSectionData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void n(final DescriptionSectionData descriptionSectionData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-669580855);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(descriptionSectionData) : rVarH.G(descriptionSectionData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-669580855, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.searchrecipient.SearchInactiveContent (SearchRecipientScreen.kt:92)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
            h(descriptionSectionData, rVarH, ButtonTextData.f99099f | (i16 & 14));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a32.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(descriptionSectionData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(DescriptionSectionData descriptionSectionData, int i15, p076m2.r rVar, int i16) {
        n(descriptionSectionData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-621800591);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-621800591, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.searchrecipient.SearchRecipientScreen (SearchRecipientScreen.kt:33)");
            }
            final f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            i50.s.r(q(f6VarC).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(64326622, true, new er.q() { // from class: a32.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.r(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: a32.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.t(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data q(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(64326622, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.searchrecipient.SearchRecipientScreen.<anonymous> (SearchRecipientScreen.kt:39)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            if (q(f6Var).getSearchState().getIsActive()) {
                rVar.X(799182930);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
                rVar.R();
            } else {
                rVar.X(799238668);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            }
            f3.m mVarP = a3.p(mVarL, spacing200, 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            f0.A(null, q(f6Var).getSearchState(), y2.m.d(1921957298, true, new er.p() { // from class: a32.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.s(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (q(f6Var).getSearchState().getIsActive()) {
                rVar.X(1141607118);
            } else {
                rVar.X(1144099394);
                n(q(f6Var).getDescriptionSectionData(), rVar, ButtonTextData.f99099f);
            }
            rVar.R();
            rVar.x();
            q0.g(false, q(f6Var).d(), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1921957298, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.searchrecipient.SearchRecipientScreen.<anonymous>.<anonymous>.<anonymous> (SearchRecipientScreen.kt:54)");
            }
            l(q(f6Var).getContentType(), q(f6Var).getDescriptionSectionData(), rVar, ButtonTextData.f99099f << 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
