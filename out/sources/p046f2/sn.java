package p046f2;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.node.c;
import androidx.compose.ui.platform.g1;
import c5.h;
import c5.i;
import d1.a3;
import d1.d3;
import d1.x;
import er.a;
import er.p;
import er.q;
import f3.j;
import f3.m;
import h2.g3;
import h2.h1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.f0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÙ\u0001\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "textField", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "placeholder", "leading", "trailing", "prefix", "suffix", "", "singleLine", "Lf2/tn;", "labelPosition", "Lh2/h1;", "labelProgress", "placeholderAlpha", "affixAlpha", "container", "supporting", "Ld1/d3;", "paddingValues", "c", "(Lf3/m;Ler/p;Ler/p;Ler/q;Ler/p;Ler/p;Ler/p;Ler/p;ZLf2/tn;Lh2/h1;Lh2/h1;Lh2/h1;Ler/p;Ler/p;Ld1/d3;Lm2/r;II)V", "Lc5/h;", "a", "F", "f", "()F", "TextFieldWithLabelVerticalPadding", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f57758a = h.n(8);

    public static final void c(final m mVar, p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, q<? super m, ? super r, ? super Integer, i0> qVar, final p<? super r, ? super Integer, i0> pVar3, final p<? super r, ? super Integer, i0> pVar4, final p<? super r, ? super Integer, i0> pVar5, final p<? super r, ? super Integer, i0> pVar6, final boolean z15, tn tnVar, h1 h1Var, final h1 h1Var2, final h1 h1Var3, final p<? super r, ? super Integer, i0> pVar7, p<? super r, ? super Integer, i0> pVar8, d3 d3Var, r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        p<? super r, ? super Integer, i0> pVar9;
        q<? super m, ? super r, ? super Integer, i0> qVar2;
        final tn tnVar2;
        p<? super r, ? super Integer, i0> pVar10;
        d3 d3Var2;
        Object hoVar;
        int i19;
        float f15;
        final h1 h1Var4 = h1Var;
        r rVarH = rVar.h(-1552532491);
        if ((i15 & 6) == 0) {
            i17 = i15 | (rVarH.W(mVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(pVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(qVar) ? 2048 : 1024;
        }
        int i25 = i15 & 24576;
        int i26 = PKIFailureInfo.certRevoked;
        if (i25 == 0) {
            i17 |= rVarH.G(pVar3) ? 16384 : 8192;
        }
        int i27 = i15 & 196608;
        int i28 = PKIFailureInfo.notAuthorized;
        if (i27 == 0) {
            i17 |= rVarH.G(pVar4) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= rVarH.G(pVar5) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= rVarH.G(pVar6) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.a(z15) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= rVarH.W(tnVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i29 = i17;
        if ((i16 & 6) == 0) {
            i18 = i16 | ((i16 & 8) == 0 ? rVarH.W(h1Var4) : rVarH.G(h1Var4) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= (i16 & 64) == 0 ? rVarH.W(h1Var2) : rVarH.G(h1Var2) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= (i16 & 512) == 0 ? rVarH.W(h1Var3) : rVarH.G(h1Var3) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= rVarH.G(pVar7) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            if (rVarH.G(pVar8)) {
                i26 = 16384;
            }
            i18 |= i26;
        }
        if ((i16 & 196608) == 0) {
            if (rVarH.W(d3Var)) {
                i28 = PKIFailureInfo.unsupportedVersion;
            }
            i18 |= i28;
        }
        int i35 = i18;
        if (rVarH.r(((i29 & 306783379) == 306783378 && (74899 & i35) == 74898) ? false : true, i29 & 1)) {
            if (t.k()) {
                t.o(-1552532491, i29, i35, "androidx.compose.material3.TextFieldLayout (TextField.kt:674)");
            }
            float fX0 = g3.x0(rVarH, 0);
            int i36 = i35 & 14;
            boolean zB = ((458752 & i35) == 131072) | ((234881024 & i29) == 67108864) | ((1879048192 & i29) == 536870912) | (i36 == 4 || ((i35 & 8) != 0 && rVarH.W(h1Var4))) | ((i35 & 112) == 32 || ((i35 & 64) != 0 && rVarH.W(h1Var2))) | ((i35 & 896) == 256 || ((i35 & 512) != 0 && rVarH.W(h1Var3))) | rVarH.b(fX0);
            Object objE = rVarH.E();
            if (zB || objE == r.INSTANCE.a()) {
                d3Var2 = d3Var;
                i19 = i29;
                hoVar = new ho(z15, tnVar, h1Var4, h1Var2, h1Var3, d3Var2, fX0, null);
                tnVar2 = tnVar;
                h1Var4 = h1Var4;
                rVarH.v(hoVar);
            } else {
                tnVar2 = tnVar;
                d3Var2 = d3Var;
                hoVar = objE;
                i19 = i29;
            }
            ho hoVar2 = (ho) hoVar;
            c5.t tVar = (c5.t) rVarH.N(g1.l());
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVar);
            c.Companion companion = c.INSTANCE;
            a<c> aVarB = companion.b();
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
            n6.i(rVarC, hoVar2, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            pVar7.B(rVarH, Integer.valueOf((i35 >> 9) & 14));
            if (pVar3 != null) {
                rVarH.X(993153366);
                m mVarI = hd.i(f0.b(m.INSTANCE, "Leading"));
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                m mVarE2 = j.e(rVarH, mVarI);
                a<c> aVarB2 = companion.b();
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
                n6.i(rVarC2, w0VarI, companion.d());
                n6.i(rVarC2, e0VarT2, companion.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion.c());
                n6.g(rVarC2, companion.a());
                n6.i(rVarC2, mVarE2, companion.e());
                x xVar = x.f39368a;
                pVar3.B(rVarH, Integer.valueOf((i19 >> 12) & 14));
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(993399382);
                rVarH.R();
            }
            if (pVar4 != null) {
                rVarH.X(993442100);
                m mVarI2 = hd.i(f0.b(m.INSTANCE, "Trailing"));
                w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT3 = rVarH.t();
                m mVarE3 = j.e(rVarH, mVarI2);
                a<c> aVarB3 = companion.b();
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
                n6.i(rVarC3, w0VarI2, companion.d());
                n6.i(rVarC3, e0VarT3, companion.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion.c());
                n6.g(rVarC3, companion.a());
                n6.i(rVarC3, mVarE3, companion.e());
                x xVar2 = x.f39368a;
                pVar4.B(rVarH, Integer.valueOf((i19 >> 15) & 14));
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(993690038);
                rVarH.R();
            }
            float fK = a3.k(d3Var2, tVar);
            float fJ = a3.j(d3Var2, tVar);
            float fA0 = g3.A0(rVarH, 0);
            if (pVar3 != null) {
                fK = h.n(lr.m.d(h.n(fK - fA0), h.n(0)));
            }
            float fN = fK;
            if (pVar4 != null) {
                fJ = h.n(lr.m.d(h.n(fJ - fA0), h.n(0)));
            }
            if (pVar5 != null) {
                rVarH.X(994466433);
                m mVarR = a3.r(d.C(d.k(f0.b(m.INSTANCE, "Prefix"), g3.l0(), 0.0f, 2, null), null, false, 3, null), fN, 0.0f, g3.n0(), 0.0f, 10, null);
                w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT4 = rVarH.t();
                m mVarE4 = j.e(rVarH, mVarR);
                a<c> aVarB4 = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB4);
                } else {
                    rVarH.u();
                }
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI3, companion.d());
                n6.i(rVarC4, e0VarT4, companion.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion.c());
                n6.g(rVarC4, companion.a());
                n6.i(rVarC4, mVarE4, companion.e());
                x xVar3 = x.f39368a;
                pVar5.B(rVarH, Integer.valueOf((i19 >> 18) & 14));
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(994794134);
                rVarH.R();
            }
            if (pVar6 != null) {
                rVarH.X(994837379);
                float f16 = fJ;
                m mVarR2 = a3.r(d.C(d.k(f0.b(m.INSTANCE, "Suffix"), g3.l0(), 0.0f, 2, null), null, false, 3, null), g3.n0(), 0.0f, f16, 0.0f, 10, null);
                f15 = f16;
                w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT5 = rVarH.t();
                m mVarE5 = j.e(rVarH, mVarR2);
                a<c> aVarB5 = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB5);
                } else {
                    rVarH.u();
                }
                r rVarC5 = n6.c(rVarH);
                n6.i(rVarC5, w0VarI4, companion.d());
                n6.i(rVarC5, e0VarT5, companion.f());
                n6.i(rVarC5, Integer.valueOf(iHashCode5), companion.c());
                n6.g(rVarC5, companion.a());
                n6.i(rVarC5, mVarE5, companion.e());
                x xVar4 = x.f39368a;
                pVar6.B(rVarH, Integer.valueOf((i19 >> 21) & 14));
                rVarH.x();
                rVarH.R();
            } else {
                f15 = fJ;
                rVarH.X(995163158);
                rVarH.R();
            }
            m mVarR3 = tnVar2 instanceof tn.a ? a3.r(m.INSTANCE, g3.h0(), 0.0f, g3.h0(), g3.g0(), 2, null) : a3.r(m.INSTANCE, fN, 0.0f, f15, 0.0f, 10, null);
            if (pVar2 != null) {
                fN = fN;
                rVarH.X(995662971);
                m mVarB = f0.b(m.INSTANCE, "Label");
                boolean z16 = i36 == 4 || ((i35 & 8) != 0 && rVarH.G(h1Var4));
                Object objE2 = rVarH.E();
                if (z16 || objE2 == r.INSTANCE.a()) {
                    objE2 = new a() { // from class: f2.qn
                        @Override // er.a
                        public final Object a() {
                            return sn.d(h1Var4);
                        }
                    };
                    rVarH.v(objE2);
                }
                m mVarU = d.C(g3.B0(mVarB, (a) objE2), null, false, 3, null).u(mVarR3);
                w0 w0VarI5 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT6 = rVarH.t();
                m mVarE6 = j.e(rVarH, mVarU);
                a<c> aVarB6 = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB6);
                } else {
                    rVarH.u();
                }
                r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarI5, companion.d());
                n6.i(rVarC6, e0VarT6, companion.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion.c());
                n6.g(rVarC6, companion.a());
                n6.i(rVarC6, mVarE6, companion.e());
                x xVar5 = x.f39368a;
                pVar2.B(rVarH, Integer.valueOf((i19 >> 6) & 14));
                rVarH.x();
                rVarH.R();
            } else {
                fN = fN;
                rVarH.X(996057942);
                rVarH.R();
            }
            m.Companion companion2 = m.INSTANCE;
            m mVarC = d.C(d.k(companion2, g3.l0(), 0.0f, 2, null), null, false, 3, null);
            if (pVar5 != null) {
                fN = h.n(0);
            }
            m mVarR4 = a3.r(mVarC, fN, 0.0f, pVar6 == null ? f15 : h.n(0), 0.0f, 10, null);
            if (qVar != null) {
                rVarH.X(996427927);
                qVar2 = qVar;
                qVar2.w(f0.b(companion2, "Hint").u(mVarR4), rVarH, Integer.valueOf((i19 >> 6) & 112));
                rVarH.R();
            } else {
                qVar2 = qVar;
                rVarH.X(996519222);
                rVarH.R();
            }
            m mVarU2 = f0.b(companion2, "TextField").u(mVarR4);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI6 = d1.r.i(companion3.o(), true);
            int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT7 = rVarH.t();
            m mVarE7 = j.e(rVarH, mVarU2);
            a<c> aVarB7 = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB7);
            } else {
                rVarH.u();
            }
            r rVarC7 = n6.c(rVarH);
            n6.i(rVarC7, w0VarI6, companion.d());
            n6.i(rVarC7, e0VarT7, companion.f());
            n6.i(rVarC7, Integer.valueOf(iHashCode7), companion.c());
            n6.g(rVarC7, companion.a());
            n6.i(rVarC7, mVarE7, companion.e());
            x xVar6 = x.f39368a;
            pVar9 = pVar;
            pVar9.B(rVarH, Integer.valueOf((i19 >> 3) & 14));
            rVarH.x();
            if (pVar8 != null) {
                rVarH.X(996767873);
                m mVarL = a3.l(d.C(d.k(f0.b(companion2, "Supporting"), g3.k0(), 0.0f, 2, null), null, false, 3, null), pn.A(pn.f57316a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                w0 w0VarI7 = d1.r.i(companion3.o(), false);
                int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT8 = rVarH.t();
                m mVarE8 = j.e(rVarH, mVarL);
                a<c> aVarB8 = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB8);
                } else {
                    rVarH.u();
                }
                r rVarC8 = n6.c(rVarH);
                n6.i(rVarC8, w0VarI7, companion.d());
                n6.i(rVarC8, e0VarT8, companion.f());
                n6.i(rVarC8, Integer.valueOf(iHashCode8), companion.c());
                n6.g(rVarC8, companion.a());
                n6.i(rVarC8, mVarE8, companion.e());
                pVar10 = pVar8;
                pVar10.B(rVarH, Integer.valueOf((i35 >> 12) & 14));
                rVarH.x();
                rVarH.R();
            } else {
                pVar10 = pVar8;
                rVarH.X(997157078);
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            pVar9 = pVar;
            qVar2 = qVar;
            tnVar2 = tnVar;
            pVar10 = pVar8;
            d3Var2 = d3Var;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final p<? super r, ? super Integer, i0> pVar11 = pVar9;
            final q<? super m, ? super r, ? super Integer, i0> qVar3 = qVar2;
            final d3 d3Var3 = d3Var2;
            final p<? super r, ? super Integer, i0> pVar12 = pVar10;
            d5VarM.a(new p() { // from class: f2.rn
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return sn.e(mVar, pVar11, pVar2, qVar3, pVar3, pVar4, pVar5, pVar6, z15, tnVar2, h1Var4, h1Var2, h1Var3, pVar7, pVar12, d3Var3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h d(h1 h1Var) {
        return h.j(i.b(g3.l0(), g3.j0(), h1Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(m mVar, p pVar, p pVar2, q qVar, p pVar3, p pVar4, p pVar5, p pVar6, boolean z15, tn tnVar, h1 h1Var, h1 h1Var2, h1 h1Var3, p pVar7, p pVar8, d3 d3Var, int i15, int i16, r rVar, int i17) {
        c(mVar, pVar, pVar2, qVar, pVar3, pVar4, pVar5, pVar6, z15, tnVar, h1Var, h1Var2, h1Var3, pVar7, pVar8, d3Var, rVar, g4.a(i15 | 1), g4.a(i16));
        return i0.f148189a;
    }

    public static final float f() {
        return f57758a;
    }
}
