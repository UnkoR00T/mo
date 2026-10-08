package eq3;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p088nul.q0;
import x40.LinkData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Leq3/c;", "viewModel", "Loq/i0;", "g", "(Leq3/c;Lm2/r;I)V", "Leq3/c$a$b;", "data", "d", "(Leq3/c$a$b;Lm2/r;I)V", "Leq3/c$a;", "state", "voteidea_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    private static final void d(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1629546888);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1629546888, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.voteidearoundsinfo.VoteIdeaRoundsInfoContent (VoteIdeaRoundsInfoScreen.kt:36)");
            }
            s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1651647115, true, new er.q() { // from class: eq3.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.e(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, initialized.b(), rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: eq3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1651647115, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.voteidearoundsinfo.VoteIdeaRoundsInfoContent.<anonymous> (VoteIdeaRoundsInfoScreen.kt:41)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
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
            Label headerTitle = initialized.getHeaderTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, headerTitle, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, initialized.getHeaderDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            k70.a aVar2 = aVar;
            int i18 = i17;
            f3.m.Companion companion3 = companion;
            boolean z15 = false;
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i18).getSpacing300()), rVar2, 0);
            if (initialized.getCurrentRoundsDescription() == null) {
                rVar2.X(111215503);
            } else {
                rVar2.X(111215504);
                j70.h.g(null, null, initialized.getCurrentRoundsTitle(), null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
                j70.h.g(null, null, initialized.getCurrentRoundsDescription(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                aVar2 = aVar2;
                i18 = i18;
                companion3 = companion3;
                z15 = false;
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i18).getSpacing300()), rVar2, 0);
            }
            rVar2.R();
            AccordionData voteIdeaAccordionData = initialized.getVoteIdeaAccordionData();
            if (voteIdeaAccordionData == null) {
                rVar2.X(111793033);
            } else {
                rVar2.X(111793034);
                j70.h.g(null, null, initialized.getVoteIdeaRoundsAccordionTitle(), null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                aVar2 = aVar2;
                i18 = i18;
                companion3 = companion3;
                z15 = false;
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
                b30.j.g(voteIdeaAccordionData, rVar2, AccordionData.f16343b);
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i18).getSpacing300()), rVar2, 0);
            }
            rVar2.R();
            k70.a aVar3 = aVar2;
            int i19 = i18;
            f3.m.Companion companion4 = companion3;
            j70.h.g(null, null, initialized.getWhatNextTitle(), null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar, i19).getSpacing200()), rVar, 0);
            j70.h.g(null, null, initialized.getWhatNextDescription(), null, null, aVar3.a(rVar, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar, i19).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar, i19).getSpacing200()), rVar, 0);
            j70.h.g(null, null, initialized.getGoToWebsiteDescription(), null, null, aVar3.a(rVar, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar, i19).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar, i19).getSpacing100()), rVar, 0);
            x40.h.g(initialized.getGoToWebsiteLinkData(), rVar, LinkData.f216731g);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        d(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1966629167);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1966629167, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.voteidearoundsinfo.VoteIdeaRoundsInfoScreen (VoteIdeaRoundsInfoScreen.kt:25)");
            }
            c.a aVarH = h(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarH, c.a.C1246a.f52822a)) {
                rVarH.X(145025971);
                rVarH.R();
            } else {
                if (!(aVarH instanceof c.a.Initialized)) {
                    rVarH.X(145023745);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(145027957);
                d((c.a.Initialized) aVarH, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: eq3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a h(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c cVar, int i15, p076m2.r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
