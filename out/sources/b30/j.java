package b30;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.h0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import er.q;
import java.io.IOException;
import mx.Label;
import n3.b2;
import n3.l0;
import n3.n1;
import n3.y2;
import n4.f0;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p046f2.c2;
import p046f2.vb;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p114t0.n;
import pq.v;
import t70.s;
import w0.i1;
import w0.r1;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lb30/a;", "data", "Loq/i0;", "g", "(Lb30/a;Lm2/r;I)V", "Lb30/c;", "l", "(Lb30/c;Lm2/r;I)V", "j", "(Lm2/r;I)V", "Lc5/h;", "a", "F", "MIN_ACCORDION_ROW_HEIGHT", "", "expanded", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f16361a = c5.h.n(48);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16362a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(134958168);
            if (t.k()) {
                t.o(134958168, i15, -1, "pl.gov.coi.common.ui.ds.accordion.AccordionSingle.<anonymous>.<anonymous>.<anonymous> (Accordion.kt:180)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void g(final AccordionData accordionData, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-794320371);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(accordionData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-794320371, i16, -1, "pl.gov.coi.common.ui.ds.accordion.Accordion (Accordion.kt:58)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            y2 radius200 = aVar.e(rVarH, i17).getRadius200();
            y1 y1Var = y1.f58315a;
            float level0 = aVar.c(rVarH, i17).getLevel0();
            int i18 = y1.f58316b;
            c2.c(null, radius200, y1Var.b(aVar.a(rVarH, i17).getSurface().a(), 0L, 0L, 0L, rVarH, i18 << 12, 14), y1Var.c(level0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i18 << 18, 62), null, m.d(788666459, true, new q() { // from class: b30.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.h(accordionData, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 17);
            rVar2 = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b30.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(accordionData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(AccordionData accordionData, h0 h0Var, r rVar, int i15) throws XmlPullParserException, IOException {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(788666459, i15, -1, "pl.gov.coi.common.ui.ds.accordion.Accordion.<anonymous> (Accordion.kt:68)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar.X(1732538338);
            int i16 = 0;
            for (Object obj : accordionData.a()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                l((AccordionElement) obj, rVar, 0);
                if (i16 != accordionData.a().size() - 1) {
                    rVar.X(629584536);
                    j(rVar, 0);
                } else {
                    rVar.X(626568608);
                }
                rVar.R();
                i16 = i17;
            }
            rVar.R();
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
    public static final i0 i(AccordionData accordionData, int i15, r rVar, int i16) {
        g(accordionData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void j(r rVar, final int i15) {
        r rVarH = rVar.h(-1202706904);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(-1202706904, i15, -1, "pl.gov.coi.common.ui.ds.accordion.AccordionDivider (Accordion.kt:203)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            vb.h(a3.p(companion, aVar.b(rVarH, i16).getSpacing200(), 0.0f, 2, null), aVar.b(rVarH, i16).getStrokeWidth(), aVar.a(rVarH, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVarH, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b30.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(int i15, r rVar, int i16) {
        j(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final AccordionElement accordionElement, r rVar, final int i15) throws XmlPullParserException, IOException {
        int i16;
        float zero;
        f3.m.Companion companion;
        Object obj;
        boolean z15;
        Color colorM0boximpl;
        n1 n1Var;
        float zero2;
        r rVarH = rVar.h(352884375);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(accordionElement) : rVarH.G(accordionElement) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(352884375, i16, -1, "pl.gov.coi.common.ui.ds.accordion.AccordionSingle (Accordion.kt:84)");
            }
            Object objE = rVarH.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE == companion2.a()) {
                objE = c6.e(Boolean.valueOf(accordionElement.getInitialExpanded()), null, 2, null);
                rVarH.v(objE);
            }
            final p076m2.a3 a3Var = (p076m2.a3) objE;
            final String text = m(a3Var) ? c70.a.f23835a.a().c().getText() : c70.a.f23835a.a().A0().getText();
            Object objE2 = rVarH.E();
            if (objE2 == companion2.a()) {
                objE2 = b1.k.a();
                rVarH.v(objE2);
            }
            b1.l lVar = (b1.l) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            d1.i iVar = d1.i.f39152a;
            d1.i.f fVarE = iVar.e();
            f3.m.Companion companion3 = f3.m.INSTANCE;
            f3.m mVarB = n.b(androidx.compose.foundation.layout.d.h(companion3, 0.0f, 1, null), u0.m.l(0, 0, u0.i0.f(), 3, null), null, 2, null);
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(fVarE, companion4.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion5.b();
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
            n6.i(rVarC, w0VarA, companion5.d());
            n6.i(rVarC, e0VarT, companion5.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion5.c());
            n6.g(rVarC, companion5.a());
            n6.i(rVarC, mVarE, companion5.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.c.InterfaceC1317c interfaceC1317cI = companion4.i();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarB2 = s.B(companion3, f6VarA, aVar.e(rVarH, i17).getRadius200(), rVarH, 6);
            r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
            boolean z16 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(accordionElement));
            Object objE3 = rVarH.E();
            if (z16 || objE3 == companion2.a()) {
                objE3 = new er.a() { // from class: b30.f
                    @Override // er.a
                    public final Object a() {
                        return j.o(accordionElement, a3Var);
                    }
                };
                rVarH.v(objE3);
            }
            f3.m mVarL = androidx.compose.foundation.b.l(mVarB2, lVar, r1VarE, false, null, null, (er.a) objE3, 28, null);
            float spacing200 = aVar.b(rVarH, i17).getSpacing200();
            float spacing201 = aVar.b(rVarH, i17).getSpacing200();
            float spacing202 = aVar.b(rVarH, i17).getSpacing200();
            if (m(a3Var)) {
                rVarH.X(1657540803);
                zero = aVar.b(rVarH, i17).getZero();
                rVarH.R();
            } else {
                rVarH.X(1657479485);
                zero = aVar.b(rVarH, i17).getSpacing200();
                rVarH.R();
            }
            f3.m mVarK = androidx.compose.foundation.layout.d.k(a3.q(mVarL, spacing201, spacing200, spacing202, zero), f16361a, 0.0f, 2, null);
            boolean zW = rVarH.W(text);
            Object objE4 = rVarH.E();
            if (zW || objE4 == companion2.a()) {
                objE4 = new er.l() { // from class: b30.g
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j.p(text, (n4.i0) obj2);
                    }
                };
                rVarH.v(objE4);
            }
            f3.m mVarD = n4.v.d(mVarK, false, (er.l) objE4, 1, null);
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarD);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion5.b();
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
            n6.i(rVarC2, w0VarB, companion5.d());
            n6.i(rVarC2, e0VarT2, companion5.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
            n6.g(rVarC2, companion5.a());
            n6.i(rVarC2, mVarE2, companion5.e());
            q3 q3Var = q3.f39261a;
            Resource leadingResource = accordionElement.getLeadingResource();
            if (leadingResource == null) {
                rVarH.X(-970141045);
                rVarH.R();
                a3Var = a3Var;
                companion = companion3;
                obj = null;
                z15 = false;
            } else {
                rVarH.X(-970141044);
                Resource.a content = leadingResource.getContent();
                if (content instanceof Resource.a.DrawableResource) {
                    rVarH.X(2124784560);
                    p036e4.l lVarA = p036e4.l.INSTANCE.a();
                    t3.d dVarB = l4.g.b(t3.d.INSTANCE, ((Resource.a.DrawableResource) leadingResource.getContent()).getResId(), rVarH, 6);
                    Label contentDescription = leadingResource.getContentDescription();
                    String text2 = contentDescription != null ? contentDescription.getText() : null;
                    p<r, Integer, Color> pVarB = ((Resource.a.DrawableResource) leadingResource.getContent()).b();
                    if (pVarB == null) {
                        rVarH.X(2125051593);
                        rVarH.R();
                        colorM0boximpl = null;
                    } else {
                        rVarH.X(761286712);
                        long jM20unboximpl = pVarB.B(rVarH, 0).m20unboximpl();
                        rVarH.R();
                        colorM0boximpl = Color.m0boximpl(jM20unboximpl);
                    }
                    if (colorM0boximpl == null) {
                        rVarH.X(2125064768);
                        rVarH.R();
                        n1Var = null;
                    } else {
                        rVarH.X(2125064769);
                        long jM20unboximpl2 = colorM0boximpl.m20unboximpl();
                        boolean zD = rVarH.d(jM20unboximpl2);
                        Object objE5 = rVarH.E();
                        if (zD || objE5 == companion2.a()) {
                            objE5 = n1.Companion.b(n1.INSTANCE, jM20unboximpl2, 0, 2, null);
                            rVarH.v(objE5);
                        }
                        rVarH.R();
                        n1Var = (n1) objE5;
                    }
                    i1.d(dVarB, text2, null, null, lVarA, 0.0f, n1Var, rVarH, 24576, 44);
                    rVarH = rVarH;
                    rVarH.R();
                    companion = companion3;
                    obj = null;
                } else {
                    if (!(content instanceof Resource.a.BitmapResource)) {
                        rVarH.X(761275994);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(2125247576);
                    p036e4.l lVarA2 = p036e4.l.INSTANCE.a();
                    f3.m mVarT = ((Resource.a.BitmapResource) leadingResource.getContent()).getIconSize() != null ? androidx.compose.foundation.layout.d.t(companion3, ((Resource.a.BitmapResource) leadingResource.getContent()).getIconSize().getDimension()) : companion3;
                    b2 b2VarC = l0.c(((Resource.a.BitmapResource) leadingResource.getContent()).getBitmap());
                    Label contentDescription2 = leadingResource.getContentDescription();
                    companion = companion3;
                    obj = null;
                    i1.g(b2VarC, contentDescription2 != null ? contentDescription2.getText() : null, mVarT, null, lVarA2, 0.0f, null, 0, rVarH, 24576, 232);
                    rVarH = rVarH;
                    rVarH.R();
                }
                z15 = false;
                r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                i0 i0Var2 = i0.f148189a;
                rVarH.R();
            }
            r rVar2 = rVarH;
            j70.h.g(p3.c(q3Var, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, obj), 1.0f, false, 2, null), null, accordionElement.getHeader(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030106);
            rVarH = rVar2;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            d40.h.f(null, new d40.b.C0864b(null, m(a3Var) ? jz.a.W : jz.a.X, d40.i.f.f39709e, a.f16362a, Label.INSTANCE.c(), null, 33, null), false, rVarH, 0, 5);
            rVarH.x();
            if (m(a3Var)) {
                rVarH.X(1659622701);
                if (accordionElement.getAddContentPadding()) {
                    rVarH.X(1659721529);
                    zero2 = aVar.b(rVarH, i17).getSpacing200();
                    rVarH.R();
                } else {
                    rVarH.X(1659786815);
                    zero2 = aVar.b(rVarH, i17).getZero();
                    rVarH.R();
                }
                f3.m mVarN = a3.n(companion, zero2);
                w0 w0VarI = d1.r.i(companion4.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, mVarN);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
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
                n6.i(rVarC3, w0VarI, companion5.d());
                n6.i(rVarC3, e0VarT3, companion5.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
                n6.g(rVarC3, companion5.a());
                n6.i(rVarC3, mVarE3, companion5.e());
                x xVar = x.f39368a;
                accordionElement.getContent().a(rVarH, 0);
                rVarH.x();
            } else {
                rVarH.X(1653077237);
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b30.h
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return j.q(accordionElement, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean m(p076m2.a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void n(p076m2.a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(AccordionElement accordionElement, p076m2.a3 a3Var) {
        n(a3Var, !m(a3Var));
        accordionElement.h().b(Boolean.valueOf(m(a3Var)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(String str, n4.i0 i0Var) {
        f0.x0(i0Var, str);
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(AccordionElement accordionElement, int i15, r rVar, int i16) throws XmlPullParserException, IOException {
        l(accordionElement, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
