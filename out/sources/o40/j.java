package o40;

import d1.e0;
import d1.i0;
import d1.r3;
import d1.x;
import er.l;
import f3.m;
import java.io.IOException;
import mx.Label;
import n3.b2;
import n3.l0;
import n4.g0;
import n4.v;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i1;
import w0.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lo40/a;", "data", "Loq/i0;", "i", "(Lo40/a;Lm2/r;I)V", "Lo40/a$a;", "k", "(Lo40/a$a;Lm2/r;I)V", "Lo40/a$b;", "", "invisibleToUser", "m", "(Lo40/a$b;ZLm2/r;II)V", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lj70/a;", "accessibilityReadMode", "t", "(Lmx/a;Lj70/a;Lm2/r;I)V", "r", "(Lmx/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void i(final a aVar, r rVar, final int i15) throws XmlPullParserException, IOException {
        int i16;
        r rVarH = rVar.h(1905814671);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1905814671, i16, -1, "pl.gov.coi.common.ui.ds.header.Header (Header.kt:35)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarD = w0.i.d(mVarH, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarD);
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
            i0 i0Var = i0.f39176a;
            if (aVar instanceof a.Icon) {
                rVarH.X(-1768337609);
                k((a.Icon) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof a.Image)) {
                    rVarH.X(-1768338844);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(-1768335688);
                m((a.Image) aVar, false, rVarH, i16 & 14, 2);
                rVarH.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            t(aVar.getTitle(), aVar.getAccessibilityReadMode(), rVarH, 0);
            Label message = aVar.getMessage();
            if (message == null) {
                rVarH.X(1016412863);
            } else {
                rVarH.X(1016412864);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
                r(message, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: o40.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.j(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(a aVar, int i15, r rVar, int i16) throws XmlPullParserException, IOException {
        i(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final a.Icon icon, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1448485321);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(icon) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1448485321, i16, -1, "pl.gov.coi.common.ui.ds.header.HeaderIconContent (Header.kt:59)");
            }
            d40.h.f(null, icon.getIconData(), false, rVarH, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o40.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(icon, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(a.Icon icon, int i15, r rVar, int i16) {
        k(icon, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code duplicated, block: B:87:0x023f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0244  */
    /* JADX WARN: Code duplicated, block: B:90:0x0258  */
    /* JADX WARN: Code duplicated, block: B:92:0x025c  */
    /* JADX WARN: Code duplicated, block: B:94:0x027a  */
    /* JADX WARN: Code duplicated, block: B:95:0x027f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0287  */
    /* JADX WARN: Code duplicated, block: B:99:0x0293  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.compose.ui.graphics.painter.a] */
    /* JADX WARN: Type inference failed for: r9v18 */
    private static final void m(final a.Image image, boolean z15, r rVar, final int i15, final int i16) throws XmlPullParserException, IOException {
        int i17;
        final boolean z16;
        int i18;
        boolean z17;
        r rVar2;
        d5 d5VarM;
        boolean z18;
        m.Companion companion;
        Object objE;
        r.Companion companion2;
        Label contentDescription;
        String text;
        String str;
        r rVar3;
        m mVarO;
        er.a<androidx.compose.ui.node.c> aVarB;
        final long jM20unboximpl;
        m mVarA;
        boolean z19;
        boolean zD;
        Object objE2;
        a.Image.InterfaceC3511b resource;
        Label contentDescription2;
        String text2;
        Integer placeHolder;
        ?? r15;
        Label contentDescription3;
        String text3;
        Label contentDescription4;
        String text4;
        Object objE3;
        r rVarH = rVar.h(1887197675);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(image) : rVarH.G(image) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            i18 = i17;
            if ((i18 & 19) != 18) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i18 & 1)) {
                if (i19 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (t.k()) {
                    t.o(1887197675, i18, -1, "pl.gov.coi.common.ui.ds.header.HeaderImageContent (Header.kt:67)");
                }
                companion = m.INSTANCE;
                objE = rVarH.E();
                companion2 = r.INSTANCE;
                if (objE == companion2.a()) {
                    objE = new l() { // from class: o40.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.n((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarD = v.d(companion, false, (l) objE, 1, null);
                if (z18) {
                    rVarH.X(384243792);
                    objE3 = rVarH.E();
                    if (objE3 == companion2.a()) {
                        objE3 = new l() { // from class: o40.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.o((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    mVarO = v.d(companion, false, (l) objE3, 1, null);
                    rVarH.R();
                    rVar3 = rVarH;
                    str = null;
                } else {
                    rVarH.X(384321943);
                    contentDescription = image.getContentDescription();
                    if (contentDescription != null) {
                        text = contentDescription.getText();
                    } else {
                        text = null;
                    }
                    str = null;
                    rVar3 = rVarH;
                    mVarO = t70.i.O(companion, text, false, null, rVar3, 6, 6);
                    rVar3.R();
                }
                m mVarU = mVarD.u(mVarO);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar3, 0));
                p076m2.e0 e0VarT = rVar3.t();
                m mVarE = f3.j.e(rVar3, mVarU);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
                if (rVar3.l() == null) {
                    p076m2.m.d();
                }
                rVar3.K();
                if (rVar3.getInserting()) {
                    rVar3.H(aVarB);
                } else {
                    rVar3.u();
                }
                r rVarC = n6.c(rVar3);
                n6.i(rVarC, w0VarI, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                x xVar = x.f39368a;
                jM20unboximpl = image.c().B(rVar3, 0).m20unboximpl();
                m mVarT = androidx.compose.foundation.layout.d.t(companion, image.getBackgroundSize().getDimension());
                if (image.getBackgroundShape() instanceof a.Image.InterfaceC3508a.C3510b) {
                    rVar3.X(1733057100);
                    mVarA = k3.f.a(companion, ((a.Image.InterfaceC3508a.C3510b) image.getBackgroundShape()).a().B(rVar3, 0));
                    rVar3.R();
                } else {
                    rVar3.X(1733130415);
                    rVar3.R();
                    mVarA = companion;
                }
                m mVarU2 = mVarT.u(mVarA);
                if ((i18 & 14) != 4 || ((i18 & 8) != 0 && rVar3.G(image))) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zD = z19 | rVar3.d(jM20unboximpl);
                objE2 = rVar3.E();
                if (zD || objE2 == companion2.a()) {
                    objE2 = new l() { // from class: o40.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.p(image, jM20unboximpl, (p3.f) obj);
                        }
                    };
                    rVar3.v(objE2);
                }
                z.b(mVarU2, (l) objE2, rVar3, 0);
                resource = image.getResource();
                if (resource instanceof a.Image.InterfaceC3511b.C3512a) {
                    rVar3.X(1733616433);
                    p036e4.l lVarE = p036e4.l.INSTANCE.e();
                    m mVarT2 = androidx.compose.foundation.layout.d.t(companion, image.getIconSize().getDimension());
                    b2 b2VarC = l0.c(((a.Image.InterfaceC3511b.C3512a) resource).a());
                    contentDescription4 = image.getContentDescription();
                    if (contentDescription4 != null) {
                        text4 = contentDescription4.getText();
                    } else {
                        text4 = str;
                    }
                    r rVar4 = rVar3;
                    i1.g(b2VarC, text4, mVarT2, null, lVarE, 0.0f, null, 0, rVar4, 24576, 232);
                    rVar2 = rVar4;
                    rVar2.R();
                } else if (resource instanceof a.Image.InterfaceC3511b.C3513b) {
                    rVar3.X(1733887931);
                    p036e4.l lVarA = p036e4.l.INSTANCE.a();
                    m mVarT3 = androidx.compose.foundation.layout.d.t(companion, image.getIconSize().getDimension());
                    t3.d dVarB = l4.g.b(t3.d.INSTANCE, ((a.Image.InterfaceC3511b.C3513b) resource).a(), rVar3, 6);
                    contentDescription3 = image.getContentDescription();
                    if (contentDescription3 != null) {
                        text3 = contentDescription3.getText();
                    } else {
                        text3 = str;
                    }
                    r rVar5 = rVar3;
                    i1.d(dVarB, text3, mVarT3, null, lVarA, 0.0f, null, rVar5, 24576, 104);
                    rVar2 = rVar5;
                    rVar2.R();
                } else {
                    if (resource instanceof a.Image.InterfaceC3511b.Url) {
                        rVar3.X(-1745194165);
                        rVar3.R();
                        throw new p();
                    }
                    rVar3.X(1734176355);
                    m mVarT4 = androidx.compose.foundation.layout.d.t(companion, image.getIconSize().getDimension());
                    a.Image.InterfaceC3511b.Url url = (a.Image.InterfaceC3511b.Url) resource;
                    String url2 = url.getUrl();
                    contentDescription2 = image.getContentDescription();
                    if (contentDescription2 != null) {
                        text2 = contentDescription2.getText();
                    } else {
                        text2 = str;
                    }
                    placeHolder = url.getPlaceHolder();
                    if (placeHolder == null) {
                        rVar3.X(1734373080);
                        rVar3.R();
                        r15 = str;
                    } else {
                        rVar3.X(1734373081);
                        androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(placeHolder.intValue(), rVar3, 0);
                        rVar3.R();
                        r15 = aVarC;
                    }
                    r rVar6 = rVar3;
                    coil3.compose.d.b(url2, text2, mVarT4, r15, null, null, null, null, null, null, null, 0.0f, null, 0, false, rVar6, androidx.compose.ui.graphics.painter.a.f9956g << 9, 0, 32752);
                    rVar2 = rVar6;
                    rVar2.R();
                }
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
                z16 = z18;
            } else {
                rVar2 = rVarH;
                rVar2.O();
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: o40.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.q(image, z16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        i18 = i17;
        if ((i18 & 19) != 18) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i18 & 1)) {
            if (i19 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (t.k()) {
                t.o(1887197675, i18, -1, "pl.gov.coi.common.ui.ds.header.HeaderImageContent (Header.kt:67)");
            }
            companion = m.INSTANCE;
            objE = rVarH.E();
            companion2 = r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new l() { // from class: o40.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.n((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD2 = v.d(companion, false, (l) objE, 1, null);
            if (z18) {
                rVarH.X(384243792);
                objE3 = rVarH.E();
                if (objE3 == companion2.a()) {
                    objE3 = new l() { // from class: o40.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.o((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                mVarO = v.d(companion, false, (l) objE3, 1, null);
                rVarH.R();
                rVar3 = rVarH;
                str = null;
            } else {
                rVarH.X(384321943);
                contentDescription = image.getContentDescription();
                if (contentDescription != null) {
                    text = contentDescription.getText();
                } else {
                    text = null;
                }
                str = null;
                rVar3 = rVarH;
                mVarO = t70.i.O(companion, text, false, null, rVar3, 6, 6);
                rVar3.R();
            }
            m mVarU3 = mVarD2.u(mVarO);
            w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar3, 0));
            p076m2.e0 e0VarT2 = rVar3.t();
            m mVarE2 = f3.j.e(rVar3, mVarU3);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion4.b();
            if (rVar3.l() == null) {
                p076m2.m.d();
            }
            rVar3.K();
            if (rVar3.getInserting()) {
                rVar3.H(aVarB);
            } else {
                rVar3.u();
            }
            r rVarC2 = n6.c(rVar3);
            n6.i(rVarC2, w0VarI2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            x xVar2 = x.f39368a;
            jM20unboximpl = image.c().B(rVar3, 0).m20unboximpl();
            m mVarT5 = androidx.compose.foundation.layout.d.t(companion, image.getBackgroundSize().getDimension());
            if (image.getBackgroundShape() instanceof a.Image.InterfaceC3508a.C3510b) {
                rVar3.X(1733057100);
                mVarA = k3.f.a(companion, ((a.Image.InterfaceC3508a.C3510b) image.getBackgroundShape()).a().B(rVar3, 0));
                rVar3.R();
            } else {
                rVar3.X(1733130415);
                rVar3.R();
                mVarA = companion;
            }
            m mVarU4 = mVarT5.u(mVarA);
            if ((i18 & 14) != 4) {
                z19 = true;
            } else {
                z19 = true;
            }
            zD = z19 | rVar3.d(jM20unboximpl);
            objE2 = rVar3.E();
            if (zD) {
                objE2 = new l() { // from class: o40.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.p(image, jM20unboximpl, (p3.f) obj);
                    }
                };
                rVar3.v(objE2);
            } else {
                objE2 = new l() { // from class: o40.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.p(image, jM20unboximpl, (p3.f) obj);
                    }
                };
                rVar3.v(objE2);
            }
            z.b(mVarU4, (l) objE2, rVar3, 0);
            resource = image.getResource();
            if (resource instanceof a.Image.InterfaceC3511b.C3512a) {
                rVar3.X(1733616433);
                p036e4.l lVarE2 = p036e4.l.INSTANCE.e();
                m mVarT6 = androidx.compose.foundation.layout.d.t(companion, image.getIconSize().getDimension());
                b2 b2VarC2 = l0.c(((a.Image.InterfaceC3511b.C3512a) resource).a());
                contentDescription4 = image.getContentDescription();
                if (contentDescription4 != null) {
                    text4 = contentDescription4.getText();
                } else {
                    text4 = str;
                }
                r rVar7 = rVar3;
                i1.g(b2VarC2, text4, mVarT6, null, lVarE2, 0.0f, null, 0, rVar7, 24576, 232);
                rVar2 = rVar7;
                rVar2.R();
            } else if (resource instanceof a.Image.InterfaceC3511b.C3513b) {
                rVar3.X(1733887931);
                p036e4.l lVarA2 = p036e4.l.INSTANCE.a();
                m mVarT7 = androidx.compose.foundation.layout.d.t(companion, image.getIconSize().getDimension());
                t3.d dVarB2 = l4.g.b(t3.d.INSTANCE, ((a.Image.InterfaceC3511b.C3513b) resource).a(), rVar3, 6);
                contentDescription3 = image.getContentDescription();
                if (contentDescription3 != null) {
                    text3 = contentDescription3.getText();
                } else {
                    text3 = str;
                }
                r rVar8 = rVar3;
                i1.d(dVarB2, text3, mVarT7, null, lVarA2, 0.0f, null, rVar8, 24576, 104);
                rVar2 = rVar8;
                rVar2.R();
            } else {
                if (resource instanceof a.Image.InterfaceC3511b.Url) {
                    rVar3.X(-1745194165);
                    rVar3.R();
                    throw new p();
                }
                rVar3.X(1734176355);
                m mVarT8 = androidx.compose.foundation.layout.d.t(companion, image.getIconSize().getDimension());
                a.Image.InterfaceC3511b.Url url3 = (a.Image.InterfaceC3511b.Url) resource;
                String url4 = url3.getUrl();
                contentDescription2 = image.getContentDescription();
                if (contentDescription2 != null) {
                    text2 = contentDescription2.getText();
                } else {
                    text2 = str;
                }
                placeHolder = url3.getPlaceHolder();
                if (placeHolder == null) {
                    rVar3.X(1734373080);
                    rVar3.R();
                    r15 = str;
                } else {
                    rVar3.X(1734373081);
                    androidx.compose.ui.graphics.painter.a aVarC2 = l4.c.c(placeHolder.intValue(), rVar3, 0);
                    rVar3.R();
                    r15 = aVarC2;
                }
                r rVar9 = rVar3;
                coil3.compose.d.b(url4, text2, mVarT8, r15, null, null, null, null, null, null, null, 0.0f, null, 0, false, rVar9, androidx.compose.ui.graphics.painter.a.f9956g << 9, 0, 32752);
                rVar2 = rVar9;
                rVar2.R();
            }
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            z16 = z18;
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o40.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.q(image, z16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(n4.i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(a.Image image, long j15, p3.f fVar) {
        a.Image.InterfaceC3508a backgroundShape = image.getBackgroundShape();
        if (fr.t.c(backgroundShape, a.Image.InterfaceC3508a.C3509a.f142250a)) {
            p3.f.x2(fVar, j15, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        } else {
            if (!(backgroundShape instanceof a.Image.InterfaceC3508a.C3510b) && !fr.t.c(backgroundShape, a.Image.InterfaceC3508a.c.f142252a)) {
                throw new p();
            }
            p3.f.w2(fVar, j15, 0L, 0L, 0L, null, 0.0f, null, 0, 254, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(a.Image image, boolean z15, int i15, int i16, r rVar, int i17) throws XmlPullParserException, IOException {
        m(image, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void r(final Label label, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(2026535707);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2026535707, i16, -1, "pl.gov.coi.common.ui.ds.header.HeaderMessage (Header.kt:142)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030107);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o40.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.s(label, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Label label, int i15, r rVar, int i16) {
        r(label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final Label label, final j70.a aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-892369777);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.c(aVar.ordinal()) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-892369777, i16, -1, "pl.gov.coi.common.ui.ds.header.HeaderTitle (Header.kt:132)");
            }
            rVar2 = rVarH;
            j70.h.g(androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVarH, k70.a.f108865b).g(), null, null, false, false, aVar, rVar2, ((i16 << 6) & 896) | 6, 0, (i16 << 9) & 57344, 16252922);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o40.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.u(label, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(Label label, j70.a aVar, int i15, r rVar, int i16) {
        t(label, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
