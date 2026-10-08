package uz2;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import c5.h;
import d1.a3;
import d1.r3;
import d1.x;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
import n3.l0;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.i;
import w0.i1;
import w0.r1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Luz2/a;", "data", "Lf3/m;", "modifier", "", "alpha", "Loq/i0;", "e", "(Luz2/a;Lf3/m;FLm2/r;II)V", "Lc5/h;", "a", "F", "maxContentBoxHeight", "qualifiedsignature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f202466a = h.n(124);

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x020f  */
    /* JADX WARN: Code duplicated, block: B:75:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f  */
    /* JADX WARN: Code duplicated, block: B:79:0x027f  */
    /* JADX WARN: Code duplicated, block: B:82:0x028b  */
    /* JADX WARN: Code duplicated, block: B:83:0x028f  */
    /* JADX WARN: Code duplicated, block: B:86:0x038f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0397  */
    /* JADX WARN: Code duplicated, block: B:91:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void e(final QualifiedSignatureProviderData qualifiedSignatureProviderData, m mVar, float f15, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        float f16;
        int i19;
        boolean z15;
        r rVar2;
        final m mVar3;
        final float f17;
        d5 d5VarM;
        m mVar4;
        float f18;
        Object objE;
        r.Companion companion;
        boolean zG;
        Object objE2;
        boolean zG2;
        Object objE3;
        er.a<androidx.compose.ui.node.c> aVarB;
        Object objE4;
        er.a<androidx.compose.ui.node.c> aVarB2;
        er.a<androidx.compose.ui.node.c> aVarB3;
        r rVarH = rVar.h(1072603977);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(qualifiedSignatureProviderData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    f16 = f15;
                    if (rVarH.b(f16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i17 & 147) != 146) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i25 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f16;
                    }
                    if (t.k()) {
                        t.o(1072603977, i17, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.providerlist.component.QualifiedSignatureProvider (QualifiedSignatureProvider.kt:54)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = k.a();
                        rVarH.v(objE);
                    }
                    l lVar = (l) objE;
                    f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
                    r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
                    m mVarK = androidx.compose.foundation.layout.d.k(androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null), 0.0f, f202466a, 1, null);
                    zG = rVarH.G(qualifiedSignatureProviderData);
                    objE2 = rVarH.E();
                    if (zG || objE2 == companion.a()) {
                        objE2 = new er.l() { // from class: uz2.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.f(qualifiedSignatureProviderData, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    m mVarC = v.c(mVarK, true, (er.l) objE2);
                    k70.a aVar = k70.a.f108864a;
                    int i26 = k70.a.f108865b;
                    float f19 = f18;
                    m mVarA = k3.f.a(s.u(i.c(mVarC, Color.m9copywmQWz5c$default(aVar.a(rVarH, i26).getSurface().a(), f18, 0.0f, 0.0f, 0.0f, 14, null), l1.h.f(aVar.b(rVarH, i26).getSpacing200())), f6VarA, aVar.b(rVarH, i26).getSpacing200(), aVar.b(rVarH, i26).getStrokeWidth()), aVar.e(rVarH, i26).getRadius200());
                    zG2 = rVarH.G(qualifiedSignatureProviderData);
                    objE3 = rVarH.E();
                    if (zG2 || objE3 == companion.a()) {
                        objE3 = new er.a() { // from class: uz2.c
                            @Override // er.a
                            public final Object a() {
                                return f.g(qualifiedSignatureProviderData);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    m mVarL = androidx.compose.foundation.b.l(mVarA, lVar, r1VarE, false, null, null, (er.a) objE3, 28, null);
                    f3.c.Companion companion2 = f3.c.INSTANCE;
                    w0 w0VarI = d1.r.i(companion2.o(), false);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT = rVarH.t();
                    m mVarE = j.e(rVarH, mVarL);
                    androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion3.b();
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
                    n6.i(rVarC, w0VarI, companion3.d());
                    n6.i(rVarC, e0VarT, companion3.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                    n6.g(rVarC, companion3.a());
                    n6.i(rVarC, mVarE, companion3.e());
                    x xVar = x.f39368a;
                    m.Companion companion4 = m.INSTANCE;
                    m mVarN = a3.n(companion4, aVar.b(rVarH, i26).getSpacing200());
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new er.l() { // from class: uz2.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.h((i0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    m mVarD = v.d(mVarN, false, (er.l) objE4, 1, null);
                    w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion2.k(), rVarH, 48);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT2 = rVarH.t();
                    m mVarE2 = j.e(rVarH, mVarD);
                    aVarB2 = companion3.b();
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
                    n6.i(rVarC2, w0VarA, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE2, companion3.e());
                    m mVarA2 = d1.i0.f39176a.a(androidx.compose.foundation.layout.d.h(companion4, 0.0f, 1, null), 1.0f, false);
                    w0 w0VarI2 = d1.r.i(companion2.o(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT3 = rVarH.t();
                    m mVarE3 = j.e(rVarH, mVarA2);
                    aVarB3 = companion3.b();
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
                    n6.i(rVarC3, w0VarI2, companion3.d());
                    n6.i(rVarC3, e0VarT3, companion3.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                    n6.g(rVarC3, companion3.a());
                    n6.i(rVarC3, mVarE3, companion3.e());
                    m mVar5 = mVar4;
                    i1.g(l0.c(qualifiedSignatureProviderData.getIcon()), "", xVar.d(androidx.compose.foundation.layout.d.f(companion4, 0.0f, 1, null), companion2.e()), null, p036e4.l.INSTANCE.f(), 0.0f, null, 0, rVarH, 24624, 232);
                    rVarH.x();
                    r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar.b(rVarH, i26).getSpacing50()), rVarH, 0);
                    rVar2 = rVarH;
                    j70.h.g(androidx.compose.foundation.layout.d.h(companion4, 0.0f, 1, null), null, qualifiedSignatureProviderData.getTitle(), null, null, aVar.a(rVarH, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i26).h(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
                    j70.h.g(androidx.compose.foundation.layout.d.h(companion4, 0.0f, 1, null), null, qualifiedSignatureProviderData.getSubtitle(), null, null, aVar.a(rVar2, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i26).f(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
                    rVar2.x();
                    rVar2.x();
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    f17 = f19;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    f17 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: uz2.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.i(qualifiedSignatureProviderData, mVar3, f17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            f16 = f15;
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i25 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = f16;
                }
                if (t.k()) {
                    t.o(1072603977, i17, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.providerlist.component.QualifiedSignatureProvider (QualifiedSignatureProvider.kt:54)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                l lVar2 = (l) objE;
                f6<Boolean> f6VarA2 = b1.f.a(lVar2, rVarH, 6);
                r1 r1VarE2 = s.E(0.0f, rVarH, 0, 1);
                m mVarK2 = androidx.compose.foundation.layout.d.k(androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null), 0.0f, f202466a, 1, null);
                zG = rVarH.G(qualifiedSignatureProviderData);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new er.l() { // from class: uz2.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.f(qualifiedSignatureProviderData, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: uz2.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.f(qualifiedSignatureProviderData, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                m mVarC2 = v.c(mVarK2, true, (er.l) objE2);
                k70.a aVar2 = k70.a.f108864a;
                int i27 = k70.a.f108865b;
                float f110 = f18;
                m mVarA3 = k3.f.a(s.u(i.c(mVarC2, Color.m9copywmQWz5c$default(aVar2.a(rVarH, i27).getSurface().a(), f18, 0.0f, 0.0f, 0.0f, 14, null), l1.h.f(aVar2.b(rVarH, i27).getSpacing200())), f6VarA2, aVar2.b(rVarH, i27).getSpacing200(), aVar2.b(rVarH, i27).getStrokeWidth()), aVar2.e(rVarH, i27).getRadius200());
                zG2 = rVarH.G(qualifiedSignatureProviderData);
                objE3 = rVarH.E();
                if (zG2) {
                    objE3 = new er.a() { // from class: uz2.c
                        @Override // er.a
                        public final Object a() {
                            return f.g(qualifiedSignatureProviderData);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: uz2.c
                        @Override // er.a
                        public final Object a() {
                            return f.g(qualifiedSignatureProviderData);
                        }
                    };
                    rVarH.v(objE3);
                }
                m mVarL2 = androidx.compose.foundation.b.l(mVarA3, lVar2, r1VarE2, false, null, null, (er.a) objE3, 28, null);
                f3.c.Companion companion5 = f3.c.INSTANCE;
                w0 w0VarI3 = d1.r.i(companion5.o(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT4 = rVarH.t();
                m mVarE4 = j.e(rVarH, mVarL2);
                androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion6.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI3, companion6.d());
                n6.i(rVarC4, e0VarT4, companion6.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion6.c());
                n6.g(rVarC4, companion6.a());
                n6.i(rVarC4, mVarE4, companion6.e());
                x xVar2 = x.f39368a;
                m.Companion companion7 = m.INSTANCE;
                m mVarN2 = a3.n(companion7, aVar2.b(rVarH, i27).getSpacing200());
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new er.l() { // from class: uz2.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.h((i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                m mVarD2 = v.d(mVarN2, false, (er.l) objE4, 1, null);
                w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), companion5.k(), rVarH, 48);
                int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT5 = rVarH.t();
                m mVarE5 = j.e(rVarH, mVarD2);
                aVarB2 = companion6.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC5 = n6.c(rVarH);
                n6.i(rVarC5, w0VarA2, companion6.d());
                n6.i(rVarC5, e0VarT5, companion6.f());
                n6.i(rVarC5, Integer.valueOf(iHashCode5), companion6.c());
                n6.g(rVarC5, companion6.a());
                n6.i(rVarC5, mVarE5, companion6.e());
                m mVarA4 = d1.i0.f39176a.a(androidx.compose.foundation.layout.d.h(companion7, 0.0f, 1, null), 1.0f, false);
                w0 w0VarI4 = d1.r.i(companion5.o(), false);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT6 = rVarH.t();
                m mVarE6 = j.e(rVarH, mVarA4);
                aVarB3 = companion6.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB3);
                } else {
                    rVarH.u();
                }
                r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarI4, companion6.d());
                n6.i(rVarC6, e0VarT6, companion6.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion6.c());
                n6.g(rVarC6, companion6.a());
                n6.i(rVarC6, mVarE6, companion6.e());
                m mVar6 = mVar4;
                i1.g(l0.c(qualifiedSignatureProviderData.getIcon()), "", xVar2.d(androidx.compose.foundation.layout.d.f(companion7, 0.0f, 1, null), companion5.e()), null, p036e4.l.INSTANCE.f(), 0.0f, null, 0, rVarH, 24624, 232);
                rVarH.x();
                r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar2.b(rVarH, i27).getSpacing50()), rVarH, 0);
                rVar2 = rVarH;
                j70.h.g(androidx.compose.foundation.layout.d.h(companion7, 0.0f, 1, null), null, qualifiedSignatureProviderData.getTitle(), null, null, aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i27).h(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
                j70.h.g(androidx.compose.foundation.layout.d.h(companion7, 0.0f, 1, null), null, qualifiedSignatureProviderData.getSubtitle(), null, null, aVar2.a(rVar2, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i27).f(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
                rVar2.x();
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar6;
                f17 = f110;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                f17 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: uz2.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(qualifiedSignatureProviderData, mVar3, f17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                f16 = f15;
                if (rVarH.b(f16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i25 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = f16;
                }
                if (t.k()) {
                    t.o(1072603977, i17, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.providerlist.component.QualifiedSignatureProvider (QualifiedSignatureProvider.kt:54)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                l lVar3 = (l) objE;
                f6<Boolean> f6VarA3 = b1.f.a(lVar3, rVarH, 6);
                r1 r1VarE3 = s.E(0.0f, rVarH, 0, 1);
                m mVarK3 = androidx.compose.foundation.layout.d.k(androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null), 0.0f, f202466a, 1, null);
                zG = rVarH.G(qualifiedSignatureProviderData);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new er.l() { // from class: uz2.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.f(qualifiedSignatureProviderData, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: uz2.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.f(qualifiedSignatureProviderData, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                m mVarC3 = v.c(mVarK3, true, (er.l) objE2);
                k70.a aVar3 = k70.a.f108864a;
                int i28 = k70.a.f108865b;
                float f111 = f18;
                m mVarA5 = k3.f.a(s.u(i.c(mVarC3, Color.m9copywmQWz5c$default(aVar3.a(rVarH, i28).getSurface().a(), f18, 0.0f, 0.0f, 0.0f, 14, null), l1.h.f(aVar3.b(rVarH, i28).getSpacing200())), f6VarA3, aVar3.b(rVarH, i28).getSpacing200(), aVar3.b(rVarH, i28).getStrokeWidth()), aVar3.e(rVarH, i28).getRadius200());
                zG2 = rVarH.G(qualifiedSignatureProviderData);
                objE3 = rVarH.E();
                if (zG2) {
                    objE3 = new er.a() { // from class: uz2.c
                        @Override // er.a
                        public final Object a() {
                            return f.g(qualifiedSignatureProviderData);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: uz2.c
                        @Override // er.a
                        public final Object a() {
                            return f.g(qualifiedSignatureProviderData);
                        }
                    };
                    rVarH.v(objE3);
                }
                m mVarL3 = androidx.compose.foundation.b.l(mVarA5, lVar3, r1VarE3, false, null, null, (er.a) objE3, 28, null);
                f3.c.Companion companion8 = f3.c.INSTANCE;
                w0 w0VarI5 = d1.r.i(companion8.o(), false);
                int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT7 = rVarH.t();
                m mVarE7 = j.e(rVarH, mVarL3);
                androidx.compose.ui.node.c.Companion companion9 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion9.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC7 = n6.c(rVarH);
                n6.i(rVarC7, w0VarI5, companion9.d());
                n6.i(rVarC7, e0VarT7, companion9.f());
                n6.i(rVarC7, Integer.valueOf(iHashCode7), companion9.c());
                n6.g(rVarC7, companion9.a());
                n6.i(rVarC7, mVarE7, companion9.e());
                x xVar3 = x.f39368a;
                m.Companion companion10 = m.INSTANCE;
                m mVarN3 = a3.n(companion10, aVar3.b(rVarH, i28).getSpacing200());
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new er.l() { // from class: uz2.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.h((i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                m mVarD3 = v.d(mVarN3, false, (er.l) objE4, 1, null);
                w0 w0VarA3 = d1.e0.a(d1.i.f39152a.k(), companion8.k(), rVarH, 48);
                int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT8 = rVarH.t();
                m mVarE8 = j.e(rVarH, mVarD3);
                aVarB2 = companion9.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC8 = n6.c(rVarH);
                n6.i(rVarC8, w0VarA3, companion9.d());
                n6.i(rVarC8, e0VarT8, companion9.f());
                n6.i(rVarC8, Integer.valueOf(iHashCode8), companion9.c());
                n6.g(rVarC8, companion9.a());
                n6.i(rVarC8, mVarE8, companion9.e());
                m mVarA6 = d1.i0.f39176a.a(androidx.compose.foundation.layout.d.h(companion10, 0.0f, 1, null), 1.0f, false);
                w0 w0VarI6 = d1.r.i(companion8.o(), false);
                int iHashCode9 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT9 = rVarH.t();
                m mVarE9 = j.e(rVarH, mVarA6);
                aVarB3 = companion9.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB3);
                } else {
                    rVarH.u();
                }
                r rVarC9 = n6.c(rVarH);
                n6.i(rVarC9, w0VarI6, companion9.d());
                n6.i(rVarC9, e0VarT9, companion9.f());
                n6.i(rVarC9, Integer.valueOf(iHashCode9), companion9.c());
                n6.g(rVarC9, companion9.a());
                n6.i(rVarC9, mVarE9, companion9.e());
                m mVar7 = mVar4;
                i1.g(l0.c(qualifiedSignatureProviderData.getIcon()), "", xVar3.d(androidx.compose.foundation.layout.d.f(companion10, 0.0f, 1, null), companion8.e()), null, p036e4.l.INSTANCE.f(), 0.0f, null, 0, rVarH, 24624, 232);
                rVarH.x();
                r3.a(androidx.compose.foundation.layout.d.i(companion10, aVar3.b(rVarH, i28).getSpacing50()), rVarH, 0);
                rVar2 = rVarH;
                j70.h.g(androidx.compose.foundation.layout.d.h(companion10, 0.0f, 1, null), null, qualifiedSignatureProviderData.getTitle(), null, null, aVar3.a(rVarH, i28).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i28).h(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
                j70.h.g(androidx.compose.foundation.layout.d.h(companion10, 0.0f, 1, null), null, qualifiedSignatureProviderData.getSubtitle(), null, null, aVar3.a(rVar2, i28).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i28).f(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
                rVar2.x();
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar7;
                f17 = f111;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                f17 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: uz2.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(qualifiedSignatureProviderData, mVar3, f17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        f16 = f15;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i25 != 0) {
                mVar4 = m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                f18 = 1.0f;
            } else {
                f18 = f16;
            }
            if (t.k()) {
                t.o(1072603977, i17, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.providerlist.component.QualifiedSignatureProvider (QualifiedSignatureProvider.kt:54)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            l lVar4 = (l) objE;
            f6<Boolean> f6VarA4 = b1.f.a(lVar4, rVarH, 6);
            r1 r1VarE4 = s.E(0.0f, rVarH, 0, 1);
            m mVarK4 = androidx.compose.foundation.layout.d.k(androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null), 0.0f, f202466a, 1, null);
            zG = rVarH.G(qualifiedSignatureProviderData);
            objE2 = rVarH.E();
            if (zG) {
                objE2 = new er.l() { // from class: uz2.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.f(qualifiedSignatureProviderData, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new er.l() { // from class: uz2.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.f(qualifiedSignatureProviderData, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarC4 = v.c(mVarK4, true, (er.l) objE2);
            k70.a aVar4 = k70.a.f108864a;
            int i29 = k70.a.f108865b;
            float f112 = f18;
            m mVarA7 = k3.f.a(s.u(i.c(mVarC4, Color.m9copywmQWz5c$default(aVar4.a(rVarH, i29).getSurface().a(), f18, 0.0f, 0.0f, 0.0f, 14, null), l1.h.f(aVar4.b(rVarH, i29).getSpacing200())), f6VarA4, aVar4.b(rVarH, i29).getSpacing200(), aVar4.b(rVarH, i29).getStrokeWidth()), aVar4.e(rVarH, i29).getRadius200());
            zG2 = rVarH.G(qualifiedSignatureProviderData);
            objE3 = rVarH.E();
            if (zG2) {
                objE3 = new er.a() { // from class: uz2.c
                    @Override // er.a
                    public final Object a() {
                        return f.g(qualifiedSignatureProviderData);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.a() { // from class: uz2.c
                    @Override // er.a
                    public final Object a() {
                        return f.g(qualifiedSignatureProviderData);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarL4 = androidx.compose.foundation.b.l(mVarA7, lVar4, r1VarE4, false, null, null, (er.a) objE3, 28, null);
            f3.c.Companion companion11 = f3.c.INSTANCE;
            w0 w0VarI7 = d1.r.i(companion11.o(), false);
            int iHashCode10 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT10 = rVarH.t();
            m mVarE10 = j.e(rVarH, mVarL4);
            androidx.compose.ui.node.c.Companion companion12 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion12.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC10 = n6.c(rVarH);
            n6.i(rVarC10, w0VarI7, companion12.d());
            n6.i(rVarC10, e0VarT10, companion12.f());
            n6.i(rVarC10, Integer.valueOf(iHashCode10), companion12.c());
            n6.g(rVarC10, companion12.a());
            n6.i(rVarC10, mVarE10, companion12.e());
            x xVar4 = x.f39368a;
            m.Companion companion13 = m.INSTANCE;
            m mVarN4 = a3.n(companion13, aVar4.b(rVarH, i29).getSpacing200());
            objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new er.l() { // from class: uz2.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.h((i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarD4 = v.d(mVarN4, false, (er.l) objE4, 1, null);
            w0 w0VarA4 = d1.e0.a(d1.i.f39152a.k(), companion11.k(), rVarH, 48);
            int iHashCode11 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT11 = rVarH.t();
            m mVarE11 = j.e(rVarH, mVarD4);
            aVarB2 = companion12.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC11 = n6.c(rVarH);
            n6.i(rVarC11, w0VarA4, companion12.d());
            n6.i(rVarC11, e0VarT11, companion12.f());
            n6.i(rVarC11, Integer.valueOf(iHashCode11), companion12.c());
            n6.g(rVarC11, companion12.a());
            n6.i(rVarC11, mVarE11, companion12.e());
            m mVarA8 = d1.i0.f39176a.a(androidx.compose.foundation.layout.d.h(companion13, 0.0f, 1, null), 1.0f, false);
            w0 w0VarI8 = d1.r.i(companion11.o(), false);
            int iHashCode12 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT12 = rVarH.t();
            m mVarE12 = j.e(rVarH, mVarA8);
            aVarB3 = companion12.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC12 = n6.c(rVarH);
            n6.i(rVarC12, w0VarI8, companion12.d());
            n6.i(rVarC12, e0VarT12, companion12.f());
            n6.i(rVarC12, Integer.valueOf(iHashCode12), companion12.c());
            n6.g(rVarC12, companion12.a());
            n6.i(rVarC12, mVarE12, companion12.e());
            m mVar8 = mVar4;
            i1.g(l0.c(qualifiedSignatureProviderData.getIcon()), "", xVar4.d(androidx.compose.foundation.layout.d.f(companion13, 0.0f, 1, null), companion11.e()), null, p036e4.l.INSTANCE.f(), 0.0f, null, 0, rVarH, 24624, 232);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion13, aVar4.b(rVarH, i29).getSpacing50()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion13, 0.0f, 1, null), null, qualifiedSignatureProviderData.getTitle(), null, null, aVar4.a(rVarH, i29).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVarH, i29).h(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
            j70.h.g(androidx.compose.foundation.layout.d.h(companion13, 0.0f, 1, null), null, qualifiedSignatureProviderData.getSubtitle(), null, null, aVar4.a(rVar2, i29).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar2, i29).f(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar8;
            f17 = f112;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            f17 = f16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: uz2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(qualifiedSignatureProviderData, mVar3, f17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(QualifiedSignatureProviderData qualifiedSignatureProviderData, i0 i0Var) {
        String text;
        f0.r0(i0Var, n4.l.INSTANCE.a());
        g0.a(i0Var, true);
        String testTag = qualifiedSignatureProviderData.getTestTag();
        if (testTag == null) {
            testTag = qualifiedSignatureProviderData.getTitle().getTag();
        }
        f0.y0(i0Var, testTag);
        Label contentDescription = qualifiedSignatureProviderData.getContentDescription();
        if (contentDescription == null || (text = contentDescription.getText()) == null) {
            text = "";
        }
        f0.c0(i0Var, text);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(QualifiedSignatureProviderData qualifiedSignatureProviderData) {
        qualifiedSignatureProviderData.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(QualifiedSignatureProviderData qualifiedSignatureProviderData, m mVar, float f15, int i15, int i16, r rVar, int i17) {
        e(qualifiedSignatureProviderData, mVar, f15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
