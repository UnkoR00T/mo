package e30;

import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a2;
import d1.a3;
import d1.c2;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.l;
import er.p;
import f3.j;
import f3.m;
import i30.g;
import k3.f;
import mx.Label;
import n4.f0;
import n4.i0;
import n4.v;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import w0.i;
import w0.i1;
import w0.o;
import w0.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Le30/b;", "data", "Loq/i0;", "c", "(Lf3/m;Le30/b;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void c(m mVar, final BannerData bannerData, r rVar, final int i15, final int i16) {
        final m mVar2;
        int i17;
        int i18;
        k70.a aVar;
        Object obj;
        m mVar3;
        float f15;
        r rVarH = rVar.h(-496726696);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = i15 | (rVarH.W(mVar2) ? 4 : 2);
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(bannerData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar4 = i19 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-496726696, i17, -1, "pl.gov.coi.common.ui.ds.banner.Banner (Banner.kt:49)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.k(mVar4, h.n(96), 0.0f, 2, null), 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            m mVarD = i.d(o.g(f.a(mVarH, aVar2.e(rVarH, i25).getRadius200()), x.a(aVar2.b(rVarH, i25).getStrokeWidth(), aVar2.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g()), aVar2.e(rVarH, i25).getRadius200()), aVar2.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null);
            boolean zG = rVarH.G(bannerData);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: e30.c
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e.d(bannerData, (i0) obj2);
                    }
                };
                rVarH.v(objE);
            }
            m mVarC = v.c(mVarD, true, (l) objE);
            f3.c.Companion companion = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarC);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            Integer backgroundImageId = bannerData.getBackgroundImageId();
            if (backgroundImageId == null) {
                rVarH.X(1616362443);
                rVarH.R();
                mVar3 = mVar4;
                aVar = aVar2;
                f15 = 0.0f;
                obj = null;
                i18 = i25;
            } else {
                rVarH.X(1616362444);
                i18 = i25;
                aVar = aVar2;
                obj = null;
                mVar3 = mVar4;
                f15 = 0.0f;
                i1.c(l4.c.c(backgroundImageId.intValue(), rVarH, 0), null, xVar.d(a2.a(androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null), c2.Max), companion.b()), null, p036e4.l.INSTANCE.b(), 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 24624, 104);
                oq.i0 i0Var = oq.i0.f148189a;
                rVarH.R();
            }
            m.Companion companion3 = m.INSTANCE;
            float f16 = 88;
            float f17 = 120;
            i1.c(l4.c.c(bannerData.getAssetId(), rVarH, 0), null, a3.r(androidx.compose.foundation.layout.d.z(androidx.compose.foundation.layout.d.j(o.g(xVar.d(companion3, companion.c()), x.a(h.n(0), Color.INSTANCE.g()), aVar.e(rVarH, i18).getRadius200()), h.n(f16), h.n(f17)), h.n(f16), h.n(f17)), 0.0f, aVar.b(rVarH, i18).getSpacing100(), aVar.b(rVarH, i18).getSpacing400(), 0.0f, 9, null), null, p036e4.l.INSTANCE.e(), 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 24624, 104);
            m mVarN = a3.n(androidx.compose.foundation.layout.d.h(companion3, f15, 1, obj), aVar.b(rVarH, i18).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), companion.l(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
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
            n6.i(rVarC2, w0VarB, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            m mVarC2 = p3.c(q3.f39261a, companion3, 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(iVar.k(), companion.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarC2);
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
            n6.i(rVarC3, w0VarA, companion2.d());
            n6.i(rVarC3, e0VarT3, companion2.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion2.c());
            n6.g(rVarC3, companion2.a());
            n6.i(rVarC3, mVarE3, companion2.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            String str = bannerData.getTestTag() + "TitleText";
            Label title = bannerData.getTitle();
            TextStyle textStyleA = aVar.f(rVarH, i18).a();
            b5.v.Companion companion4 = b5.v.INSTANCE;
            k70.a aVar3 = aVar;
            int i26 = i18;
            j70.h.g(null, str, title, null, null, aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, companion4.b(), false, 0, 0, null, textStyleA, null, null, false, false, null, rVarH, 0, 24576, 0, 33013721);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVarH, i26).getSpacing50()), rVarH, 0);
            j70.h.g(null, bannerData.getTestTag() + "BodyText", bannerData.getBodyText(), null, null, aVar3.a(rVarH, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, companion4.b(), false, 2, 0, null, aVar3.f(rVarH, i26).d(), null, null, false, false, null, rVarH, 0, 1597440, 0, 32948185);
            rVarH = rVarH;
            a bannerButtonData = bannerData.getBannerButtonData();
            if (bannerButtonData == null) {
                rVarH.X(769304333);
            } else {
                rVarH.X(769304334);
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVarH, i26).getSpacing100()), rVarH, 0);
                if (bannerButtonData instanceof a.Link) {
                    rVarH.X(-1483782983);
                    x40.h.g(((a.Link) bannerButtonData).getData(), rVarH, 0);
                    rVarH.R();
                } else {
                    if (bannerButtonData instanceof a.ButtonText) {
                        rVarH.X(-1483780193);
                        j30.f.e(null, ((a.ButtonText) bannerButtonData).getData(), false, rVarH, 0, 5);
                    } else {
                        rVarH.X(1242676369);
                    }
                    rVarH.R();
                }
                oq.i0 i0Var3 = oq.i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar3.b(rVarH, i26).getSpacing700()), rVarH, 0);
            g.f(bannerData.getCloseButtonData(), false, false, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar3;
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e30.d
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return e.e(mVar2, bannerData, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(BannerData bannerData, i0 i0Var) {
        f0.c0(i0Var, bannerData.getContentDescription().getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(m mVar, BannerData bannerData, int i15, int i16, r rVar, int i17) {
        c(mVar, bannerData, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
