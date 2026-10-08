package q11;

import d1.a3;
import d1.m3;
import d1.q3;
import d1.r3;
import h30.ButtonData;
import java.util.Iterator;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p036e4.w0;
import p046f2.ad;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import s11.CertificateInfotipCardModel;
import s11.CertificatesScreenInfotipModel;
import w0.f3;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Ls11/e;", "model", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "j", "(Ls11/e;Ler/a;Lm2/r;I)V", "Ls11/b;", "certificateInfotipCardModel", "e", "(Ls11/b;Lm2/r;I)V", "", "iconResId", "Lmx/a;", AnnotatedPrivateKey.LABEL, "h", "(ILmx/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "TITLE_ICON_BACKGROUND_SIZE", "b", "CERTIFICATE_INFO_CARD_BADGE_SIZE", "certificates_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f163698a = c5.h.n(96);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f163699b = c5.h.n(64);

    public static final void e(final CertificateInfotipCardModel certificateInfotipCardModel, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(876766851);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(certificateInfotipCardModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(876766851, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificateInfoCard (CertificatesBottomSheetContent.kt:130)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            c2.c(mVarH, l1.h.f(aVar.b(rVarH, i17).getSpacing150()), y1.f58315a.b(aVar.a(rVarH, i17).getSurface().a(), 0L, 0L, 0L, rVar2, y1.f58316b << 12, 14), null, w0.x.a(aVar.b(rVarH, i17).getStrokeWidth(), aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a()), y2.m.d(351545461, true, new er.q() { // from class: q11.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.f(certificateInfotipCardModel, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, 196614, 8);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q11.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.g(certificateInfotipCardModel, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(CertificateInfotipCardModel certificateInfotipCardModel, d1.h0 h0Var, p076m2.r rVar, int i15) {
        f3.m.Companion companion;
        int i16;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(351545461, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificateInfoCard.<anonymous> (CertificatesBottomSheetContent.kt:142)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarO = a3.o(companion2, aVar.b(rVar, i17).getSpacing300(), aVar.b(rVar, i17).getSpacing400());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarO);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            w0 w0VarB = m3.b(iVar.h(), companion3.i(), rVar, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarH);
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
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            q3 q3Var = q3.f39261a;
            j70.h.g(null, null, certificateInfotipCardModel.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            k70.a aVar2 = aVar;
            f3.m mVarD = w0.i.d(k3.f.a(androidx.compose.foundation.layout.d.t(companion2, f163699b), l1.h.i()), aVar2.a(rVar2, i17).getBase().getSecondary(), null, 2, null);
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarD);
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
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarI, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            ad.d(l4.c.c(certificateInfotipCardModel.getIconResId(), rVar2, 0), null, d1.x.f39368a.d(androidx.compose.foundation.layout.d.t(companion2, aVar2.b(rVar2, i17).getSpacing400()), companion3.e()), aVar2.a(rVar2, i17).getBase().getPrimary(), rVar2, androidx.compose.ui.graphics.painter.a.f9956g | 48, 0);
            rVar2.x();
            rVar2.x();
            Label subtitle = certificateInfotipCardModel.getSubtitle();
            if (subtitle == null) {
                rVar2.X(1828520455);
                rVar2.R();
                companion = companion2;
                i16 = i17;
            } else {
                rVar2.X(1828520456);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i17).getSpacing200()), rVar2, 0);
                companion = companion2;
                j70.h.g(null, null, subtitle, null, null, aVar2.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar2.R();
                aVar2 = aVar2;
                i16 = i17;
            }
            f3.m.Companion companion5 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar2.b(rVar2, i16).getSpacing400()), rVar2, 0);
            w0 w0VarA2 = d1.e0.a(iVar.r(aVar2.b(rVar2, i16).getSpacing300()), companion3.k(), rVar2, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT4 = rVar2.t();
            f3.m mVarE4 = f3.j.e(rVar2, companion5);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB4);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC4 = n6.c(rVar2);
            n6.i(rVarC4, w0VarA2, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            rVar2.X(162304901);
            Iterator<T> it = certificateInfotipCardModel.a().iterator();
            while (it.hasNext()) {
                oq.r rVar3 = (oq.r) it.next();
                h(((Number) rVar3.c()).intValue(), (Label) rVar3.d(), rVar2, 0);
            }
            rVar2.R();
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(CertificateInfotipCardModel certificateInfotipCardModel, int i15, p076m2.r rVar, int i16) {
        e(certificateInfotipCardModel, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void h(final int i15, final Label label, p076m2.r rVar, final int i16) {
        int i17;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(534037629);
        if ((i16 & 6) == 0) {
            i17 = i16 | (rVarH.c(i15) ? 4 : 2);
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.W(label) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(534037629, i17, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificateInfoCardLabel (CertificatesBottomSheetContent.kt:202)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarH);
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            ad.d(l4.c.c(i15, rVarH, i17 & 14), null, androidx.compose.foundation.layout.d.t(companion, aVar.b(rVarH, i18).getSpacing300()), aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 0);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).b(), null, null, false, false, null, rVar2, (i17 << 3) & 896, 0, 0, 33030107);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q11.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(i15, label, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(int i15, Label label, int i16, p076m2.r rVar, int i17) {
        h(i15, label, rVar, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }

    public static final void j(final CertificatesScreenInfotipModel certificatesScreenInfotipModel, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(477559242);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(certificatesScreenInfotipModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(477559242, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificatesBottomSheetContent (CertificatesBottomSheetContent.kt:51)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarC = androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.d.h(w0.i.d(companion, aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null), 0.0f, 1, null), 0.95f);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarC);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarS = t70.i.S(a3.p(androidx.compose.foundation.layout.d.h(d1.h0.b(d1.i0.f39176a, companion, 680.0f, false, 2, null), 0.0f, 1, null), aVar2.b(rVarH, i17).getSpacing250(), 0.0f, 2, null), new f3(0), rVarH, 0, 0);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.g(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            f3.m mVarD = w0.i.d(k3.f.a(androidx.compose.foundation.layout.d.t(companion, f163698a), l1.h.i()), aVar2.a(rVarH, i17).getBase().getSecondary(), null, 2, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarD);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            ad.d(l4.c.c(certificatesScreenInfotipModel.getMainIconResId(), rVarH, 0), null, d1.x.f39368a.d(androidx.compose.foundation.layout.d.t(companion, aVar2.b(rVarH, i17).getSpacing600()), companion2.e()), aVar2.a(rVarH, i17).getBase().getPrimary(), rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 0);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, certificatesScreenInfotipModel.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(a3.p(companion, aVar2.b(rVarH, i17).getSpacing400(), 0.0f, 2, null), null, certificatesScreenInfotipModel.getSubtitle(), null, null, aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026010);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing600()), rVarH, 0);
            w0 w0VarA3 = d1.e0.a(iVar.r(aVar2.b(rVarH, i17).getSpacing200()), companion2.k(), rVarH, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, companion);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB4);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarA3, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            rVarH.X(-686118943);
            Iterator<T> it = certificatesScreenInfotipModel.a().iterator();
            while (it.hasNext()) {
                e((CertificateInfotipCardModel) it.next(), rVarH, 0);
            }
            rVarH.R();
            rVarH.x();
            rVarH.x();
            f3.m.Companion companion4 = f3.m.INSTANCE;
            k70.a aVar3 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarQ = a3.q(companion4, aVar3.b(rVarH, i18).getSpacing250(), aVar3.b(rVarH, i18).getSpacing250(), aVar3.b(rVarH, i18).getSpacing250(), aVar3.b(rVarH, i18).getSpacing300());
            w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT5 = rVarH.t();
            f3.m mVarE5 = f3.j.e(rVarH, mVarQ);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB5 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB5);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC5 = n6.c(rVarH);
            n6.i(rVarC5, w0VarI2, companion5.d());
            n6.i(rVarC5, e0VarT5, companion5.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion5.c());
            n6.g(rVarC5, companion5.a());
            n6.i(rVarC5, mVarE5, companion5.e());
            d1.x xVar = d1.x.f39368a;
            rVarH = rVarH;
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(certificatesScreenInfotipModel.getCloseButtonText(), null, 2, null), k30.d.a.f107773a, null, aVar, 35, null), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q11.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(certificatesScreenInfotipModel, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(CertificatesScreenInfotipModel certificatesScreenInfotipModel, er.a aVar, int i15, p076m2.r rVar, int i16) {
        j(certificatesScreenInfotipModel, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
