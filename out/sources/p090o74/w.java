package p090o74;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.i;
import d1.r3;
import er.q;
import f3.c;
import f3.j;
import i50.BaseScaffoldData;
import i50.s;
import j70.h;
import k70.a;
import m7.b;
import mx.Label;
import oq.i0;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lo74/d;", "viewModel", "Loq/i0;", "e", "(Lo74/d;Lm2/r;I)V", "Lo74/d$a$a;", "data", "h", "(Lo74/d$a$a;Lm2/r;I)V", "Lo74/d$a;", "state", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    public static final void e(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(10634326);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(10634326, i16, -1, "pl.gov.coi.shared.feature.defaultnotificationdetails.presentation.NotificationDetailsScreen (NotificationDetailsScreen.kt:25)");
            }
            d.a aVarF = f(b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarF instanceof d.a.DetailsDisplayed)) {
                rVarH.X(1629657394);
                rVarH.R();
                throw new p();
            }
            rVarH.X(1629660118);
            h((d.a.DetailsDisplayed) aVarF, rVarH, 0);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o74.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.g(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a f(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(d dVar, int i15, r rVar, int i16) {
        e(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final d.a.DetailsDisplayed detailsDisplayed, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-451139614);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(detailsDisplayed) : rVarH.G(detailsDisplayed) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-451139614, i16, -1, "pl.gov.coi.shared.feature.defaultnotificationdetails.presentation.NotificationDetailsScreenDataDisplayed (NotificationDetailsScreen.kt:37)");
            }
            rVar2 = rVarH;
            s.r(detailsDisplayed.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(4087637, true, new q() { // from class: o74.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.i(detailsDisplayed, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: o74.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.k(detailsDisplayed, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final d.a.DetailsDisplayed detailsDisplayed, d3 d3Var, r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(4087637, i16, -1, "pl.gov.coi.shared.feature.defaultnotificationdetails.presentation.NotificationDetailsScreenDataDisplayed.<anonymous> (NotificationDetailsScreen.kt:39)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarF = d.f(companion2, 0.0f, 1, null);
            a aVar = a.f108864a;
            int i18 = a.f108865b;
            f3.m mVarL = a3.l(a3.p(mVarF, aVar.b(rVar, i18).getSpacing200(), 0.0f, 2, null), d3Var);
            i iVar = i.f39152a;
            i.n nVarK = iVar.k();
            c.Companion companion3 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarR = a3.r(h0.b(d1.i0.f39176a, t70.i.S(companion2, null, rVar, 6, 1), 1.0f, false, 2, null), 0.0f, aVar.b(rVar, i18).getSpacing100(), 0.0f, aVar.b(rVar, i18).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = j.e(rVar, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            h.g(null, null, detailsDisplayed.getMessageDate(), null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(d.i(companion2, aVar.b(rVar, i18).getSpacing300()), rVar, 0);
            h.g(null, null, detailsDisplayed.getMessageTitle(), null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(d.i(companion2, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            h.g(null, null, detailsDisplayed.getMessageText(), null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r rVar2 = rVar;
            Label messagePrivateText = detailsDisplayed.getMessagePrivateText();
            if (messagePrivateText == null) {
                rVar2.X(-1337233393);
                rVar2.R();
                companion = companion2;
                i17 = i18;
            } else {
                rVar2.X(-1337233392);
                r3.a(d.i(companion2, aVar.b(rVar2, i18).getSpacing200()), rVar2, 0);
                companion = companion2;
                i17 = i18;
                h.g(null, null, messagePrivateText, null, null, aVar.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                i0 i0Var = i0.f148189a;
                rVar2.R();
            }
            rVar2.x();
            int i19 = i17;
            f3.m mVarR2 = a3.r(companion, 0.0f, aVar.b(rVar2, i19).getSpacing200(), 0.0f, aVar.b(rVar2, i19).getSpacing200(), 5, null);
            w0 w0VarA3 = e0.a(iVar.k(), companion3.k(), rVar2, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = j.e(rVar2, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarA3, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            h30.q.p(detailsDisplayed.getCloseButton(), false, null, rVar2, 0, 6);
            rVar2.x();
            rVar2.x();
            boolean zG = rVar2.G(detailsDisplayed);
            Object objE = rVar2.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: o74.u
                    @Override // er.a
                    public final Object a() {
                        return w.j(detailsDisplayed);
                    }
                };
                rVar2.v(objE);
            }
            q0.g(false, (er.a) objE, rVar2, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d.a.DetailsDisplayed detailsDisplayed) {
        detailsDisplayed.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d.a.DetailsDisplayed detailsDisplayed, int i15, r rVar, int i16) {
        h(detailsDisplayed, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
