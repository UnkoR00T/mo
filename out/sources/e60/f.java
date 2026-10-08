package e60;

import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a3;
import d1.e0;
import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.l;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
import n3.o1;
import n4.v;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Le60/a;", "footerData", "Lf3/m;", "modifier", "Loq/i0;", "e", "(Le60/a;Lf3/m;Lm2/r;II)V", "g", "(Lf3/m;Le60/a;Lm2/r;II)V", "j", "Lc5/h;", "a", "F", "FOOTER_BACKGROUND_RADIUS", "Landroidx/compose/ui/graphics/Color;", "b", "J", "FOOTER_BACKGROUND_COLOR", "c", "FOOTER_SPACER_COLOR", "d", "FOOTER_SPACER_WIDTH", "FOOTER_SPACER_HEIGHT", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f47662a = h.n(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f47663b = Color.INSTANCE.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f47664c = o1.d(4288981682L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f47665d = h.n((float) 0.5d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f47666e = h.n(20);

    public static final void e(final FooterData footerData, final m mVar, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(-1972662681);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(footerData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.W(mVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = m.INSTANCE;
            }
            if (t.k()) {
                t.o(-1972662681, i17, -1, "pl.gov.coi.common.ui.footer.Footer (Footer.kt:41)");
            }
            if (footerData.getIsKPOVisible()) {
                rVarH.X(443689534);
                g(mVar, footerData, rVarH, ((i17 >> 3) & 14) | ((i17 << 3) & 112), 0);
                rVarH.R();
            } else {
                rVarH.X(443787835);
                j(mVar, footerData, rVarH, ((i17 >> 3) & 14) | ((i17 << 3) & 112), 0);
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
            d5VarM.a(new p() { // from class: e60.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.f(footerData, mVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(FooterData footerData, m mVar, int i15, int i16, r rVar, int i17) {
        e(footerData, mVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void g(m mVar, final FooterData footerData, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final m mVar3;
        r rVarH = rVar.h(505332135);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(footerData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar4 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(505332135, i17, -1, "pl.gov.coi.common.ui.footer.FooterWithKPOLogos (Footer.kt:59)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null);
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.b bVarG = companion.g();
            i iVar = i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), bVarG, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarH);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: e60.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.h((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD = w0.i.d(k3.f.a(androidx.compose.foundation.layout.d.h(v.d(mVar4, false, (l) objE, 1, null), 0.0f, 1, null), l1.h.f(f47662a)), f47663b, null, 2, null);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            m mVarN = a3.n(mVarD, aVar.b(rVarH, i19).getSpacing100());
            w0 w0VarI = d1.r.i(companion.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            x xVar = x.f39368a;
            m mVarH2 = androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null);
            w0 w0VarB = m3.b(iVar.i(), companion.i(), rVarH, 54);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarH2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarB, companion2.d());
            n6.i(rVarC3, e0VarT3, companion2.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion2.c());
            n6.g(rVarC3, companion2.a());
            n6.i(rVarC3, mVarE3, companion2.e());
            q3 q3Var = q3.f39261a;
            androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(c20.b.f22718t, rVarH, 0);
            Label kpoLogoDescription = footerData.getKpoLogoDescription();
            String text = kpoLogoDescription != null ? kpoLogoDescription.getText() : null;
            int i25 = androidx.compose.ui.graphics.painter.a.f9956g;
            i1.c(aVarC, text, null, null, null, 0.0f, null, rVarH, i25, 124);
            m.Companion companion3 = m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar.b(rVarH, i19).getSpacing100()), rVarH, 0);
            androidx.compose.ui.graphics.painter.a aVarC2 = l4.c.c(c20.b.A, rVarH, 0);
            Label rpLogoDescription = footerData.getRpLogoDescription();
            m mVar5 = mVar4;
            i1.c(aVarC2, rpLogoDescription != null ? rpLogoDescription.getText() : null, null, null, null, 0.0f, null, rVarH, i25, 124);
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar.b(rVarH, i19).getSpacing100()), rVarH, 0);
            androidx.compose.ui.graphics.painter.a aVarC3 = l4.c.c(c20.b.f22733y, rVarH, 0);
            Label nextGenEULogoDescription = footerData.getNextGenEULogoDescription();
            i1.c(aVarC3, nextGenEULogoDescription != null ? nextGenEULogoDescription.getText() : null, null, null, null, 0.0f, null, rVarH, i25, 124);
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar.b(rVarH, i19).getSpacing150()), rVarH, 0);
            r3.a(w0.i.d(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(companion3, f47665d), f47666e), f47664c, null, 2, null), rVarH, 6);
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar.b(rVarH, i19).getSpacing150()), rVarH, 0);
            androidx.compose.ui.graphics.painter.a aVarC4 = l4.c.c(c20.b.f22724v, rVarH, 0);
            Label mcLogoDescription = footerData.getMcLogoDescription();
            i1.c(aVarC4, mcLogoDescription != null ? mcLogoDescription.getText() : null, null, null, null, 0.0f, null, rVarH, i25, 124);
            rVarH.x();
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVarH, i19).getSpacing100()), rVarH, 0);
            mVar3 = mVar5;
            j70.h.g(null, null, footerData.getAppVersionLabel(), null, null, aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).f(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e60.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(mVar3, footerData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(m mVar, FooterData footerData, int i15, int i16, r rVar, int i17) {
        g(mVar, footerData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void j(m mVar, final FooterData footerData, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final m mVar3;
        r rVarH = rVar.h(953383479);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(footerData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar4 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(953383479, i17, -1, "pl.gov.coi.common.ui.footer.FooterWithoutKPOLogos (Footer.kt:121)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.i(mVar4, h.n(50)), 0.0f, 1, null);
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion.i();
            i iVar = i.f39152a;
            w0 w0VarB = m3.b(iVar.h(), interfaceC1317cI, rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarH);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            f3.c.InterfaceC1317c interfaceC1317cI2 = companion.i();
            m.Companion companion3 = m.INSTANCE;
            w0 w0VarB2 = m3.b(iVar.j(), interfaceC1317cI2, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, companion3);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(c20.b.f22712r, rVarH, 0);
            Label coiLogoDescription = footerData.getCoiLogoDescription();
            String text = coiLogoDescription != null ? coiLogoDescription.getText() : null;
            int i19 = androidx.compose.ui.graphics.painter.a.f9956g;
            String text2 = null;
            i1.c(aVarC, text, null, null, null, 0.0f, null, rVarH, i19, 124);
            k70.a aVar = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar.b(rVarH, i25).getSpacing100()), rVarH, 0);
            androidx.compose.ui.graphics.painter.a aVarC2 = l4.c.c(c20.b.f22721u, rVarH, 0);
            Label mcLogoDescription = footerData.getMcLogoDescription();
            if (mcLogoDescription != null) {
                text2 = mcLogoDescription.getText();
            }
            i1.c(aVarC2, text2, null, null, null, 0.0f, null, rVarH, i19, 124);
            rVarH.x();
            mVar3 = mVar4;
            j70.h.g(null, null, footerData.getAppVersionLabel(), null, null, aVar.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).f(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e60.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.k(mVar3, footerData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(m mVar, FooterData footerData, int i15, int i16, r rVar, int i17) {
        j(mVar, footerData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
