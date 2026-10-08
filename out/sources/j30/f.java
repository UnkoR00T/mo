package j30;

import androidx.compose.ui.platform.g1;
import b1.k;
import b1.l;
import d1.i;
import d1.m3;
import d1.q3;
import f3.j;
import f3.m;
import j70.h;
import l3.o;
import n4.f0;
import n4.i0;
import n4.v;
import oq.p;
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
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf3/m;", "modifier", "Lj30/a;", "data", "", "shouldClearFocusOnTap", "Loq/i0;", "e", "(Lf3/m;Lj30/a;ZLm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    /* JADX WARN: Code duplicated, block: B:102:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:105:0x021e  */
    /* JADX WARN: Code duplicated, block: B:108:0x022a  */
    /* JADX WARN: Code duplicated, block: B:109:0x022e  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    /* JADX WARN: Code duplicated, block: B:84:0x017c  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c6  */
    public static final void e(m mVar, final ButtonTextData buttonTextData, boolean z15, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        boolean z16;
        boolean z17;
        final boolean z18;
        d5 d5VarM;
        m mVar3;
        final boolean z19;
        final o oVar;
        Object objE;
        r.Companion companion;
        final cx.a aVar;
        k30.b buttonState;
        k30.b.c cVar;
        long jD;
        Object objE2;
        boolean z25;
        int i18;
        boolean z26;
        Object objE3;
        boolean z27;
        boolean zG;
        Object objE4;
        er.a<androidx.compose.ui.node.c> aVarB;
        r rVarH = rVar.h(-1563462974);
        int i19 = i16 & 1;
        if (i19 != 0) {
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
            i17 |= (i15 & 64) == 0 ? rVarH.W(buttonTextData) : rVarH.G(buttonTextData) ? 32 : 16;
        }
        int i25 = i16 & 4;
        if (i25 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i19 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i25 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(-1563462974, i17, -1, "pl.gov.coi.common.ui.ds.button.buttontext.ButtonText (ButtonText.kt:31)");
                }
                oVar = (o) rVarH.N(g1.g());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = s.I();
                    rVarH.v(objE);
                }
                aVar = (cx.a) objE;
                buttonState = buttonTextData.getButtonState();
                cVar = k30.b.c.f107768a;
                if (fr.t.c(buttonState, cVar)) {
                    rVarH.X(750645641);
                    jD = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getPrimary();
                    rVarH.R();
                } else if (fr.t.c(buttonState, k30.b.a.f107766a)) {
                    rVarH.X(750647662);
                    jD = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                    rVarH.R();
                } else {
                    if (fr.t.c(buttonState, k30.b.C2562b.f107767a)) {
                        rVarH.X(750643482);
                        rVarH.R();
                        throw new p();
                    }
                    rVarH.X(750649740);
                    jD = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                    rVarH.R();
                }
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = k.a();
                    rVarH.v(objE2);
                }
                l lVar = (l) objE2;
                f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
                if (!fr.t.c(buttonTextData.getButtonState(), cVar) || fr.t.c(buttonTextData.getButtonState(), k30.b.a.f107766a)) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
                k70.a aVar2 = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                m mVarK = androidx.compose.foundation.layout.d.k(mVar3, aVar2.b(rVarH, i26).getSpacing250(), 0.0f, 2, null);
                i18 = i17 & 112;
                if (i18 != 32 || ((i17 & 64) != 0 && rVarH.G(buttonTextData))) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objE3 = rVarH.E();
                if (z26 || objE3 == companion.a()) {
                    objE3 = new er.l() { // from class: j30.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.f(buttonTextData, (i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                m mVar4 = mVar3;
                m mVarW = s.w(v.d(mVarK, false, (er.l) objE3, 1, null), f6VarA, aVar2.b(rVarH, i26).getSpacing25(), 0.0f, 4, null);
                r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
                boolean zG2 = rVarH.G(aVar);
                if (i18 != 32 || ((i17 & 64) != 0 && rVarH.G(buttonTextData))) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zG = zG2 | z27 | ((i17 & 896) == 256) | rVarH.G(oVar);
                objE4 = rVarH.E();
                if (zG || objE4 == companion.a()) {
                    objE4 = new er.a() { // from class: j30.c
                        @Override // er.a
                        public final Object a() {
                            return f.g(aVar, buttonTextData, z19, oVar);
                        }
                    };
                    rVarH.v(objE4);
                }
                m mVarL = androidx.compose.foundation.b.l(mVarW, lVar, r1VarE, z25, null, null, (er.a) objE4, 24, null);
                w0 w0VarB = m3.b(i.f39152a.j(), interfaceC1317cI, rVarH, 48);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarL);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion2.b();
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
                boolean z28 = z19;
                h.g(null, null, buttonTextData.getLabel(), null, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i26).c(), null, null, false, true, null, rVarH, 0, 0, 3072, 24641499);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                z18 = z28;
                mVar2 = mVar4;
            } else {
                rVarH.O();
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar5 = mVar2;
                d5VarM.a(new er.p() { // from class: j30.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(mVar5, buttonTextData, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i17 & 147) != 146) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i19 != 0) {
                mVar3 = m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (i25 != 0) {
                z19 = true;
            } else {
                z19 = z16;
            }
            if (t.k()) {
                t.o(-1563462974, i17, -1, "pl.gov.coi.common.ui.ds.button.buttontext.ButtonText (ButtonText.kt:31)");
            }
            oVar = (o) rVarH.N(g1.g());
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            aVar = (cx.a) objE;
            buttonState = buttonTextData.getButtonState();
            cVar = k30.b.c.f107768a;
            if (fr.t.c(buttonState, cVar)) {
                rVarH.X(750645641);
                jD = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getPrimary();
                rVarH.R();
            } else if (fr.t.c(buttonState, k30.b.a.f107766a)) {
                rVarH.X(750647662);
                jD = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else {
                if (fr.t.c(buttonState, k30.b.C2562b.f107767a)) {
                    rVarH.X(750643482);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(750649740);
                jD = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                rVarH.R();
            }
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = k.a();
                rVarH.v(objE2);
            }
            l lVar2 = (l) objE2;
            f6<Boolean> f6VarA2 = b1.f.a(lVar2, rVarH, 6);
            if (fr.t.c(buttonTextData.getButtonState(), cVar)) {
                z25 = true;
            } else {
                z25 = true;
            }
            f3.c.InterfaceC1317c interfaceC1317cI2 = f3.c.INSTANCE.i();
            k70.a aVar3 = k70.a.f108864a;
            int i27 = k70.a.f108865b;
            m mVarK2 = androidx.compose.foundation.layout.d.k(mVar3, aVar3.b(rVarH, i27).getSpacing250(), 0.0f, 2, null);
            i18 = i17 & 112;
            if (i18 != 32) {
                z26 = true;
            } else {
                z26 = true;
            }
            objE3 = rVarH.E();
            if (z26) {
                objE3 = new er.l() { // from class: j30.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.f(buttonTextData, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.l() { // from class: j30.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.f(buttonTextData, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            m mVar6 = mVar3;
            m mVarW2 = s.w(v.d(mVarK2, false, (er.l) objE3, 1, null), f6VarA2, aVar3.b(rVarH, i27).getSpacing25(), 0.0f, 4, null);
            r1 r1VarE2 = s.E(0.0f, rVarH, 0, 1);
            boolean zG3 = rVarH.G(aVar);
            if (i18 != 32) {
                z27 = true;
            } else {
                z27 = true;
            }
            zG = zG3 | z27 | ((i17 & 896) == 256) | rVarH.G(oVar);
            objE4 = rVarH.E();
            if (zG) {
                objE4 = new er.a() { // from class: j30.c
                    @Override // er.a
                    public final Object a() {
                        return f.g(aVar, buttonTextData, z19, oVar);
                    }
                };
                rVarH.v(objE4);
            } else {
                objE4 = new er.a() { // from class: j30.c
                    @Override // er.a
                    public final Object a() {
                        return f.g(aVar, buttonTextData, z19, oVar);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarL2 = androidx.compose.foundation.b.l(mVarW2, lVar2, r1VarE2, z25, null, null, (er.a) objE4, 24, null);
            w0 w0VarB2 = m3.b(i.f39152a.j(), interfaceC1317cI2, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarL2);
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
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var2 = q3.f39261a;
            boolean z29 = z19;
            h.g(null, null, buttonTextData.getLabel(), null, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i27).c(), null, null, false, true, null, rVarH, 0, 0, 3072, 24641499);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            z18 = z29;
            mVar2 = mVar6;
        } else {
            rVarH.O();
            z18 = z16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar7 = mVar2;
            d5VarM.a(new er.p() { // from class: j30.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(mVar7, buttonTextData, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(ButtonTextData buttonTextData, i0 i0Var) {
        String testTag = buttonTextData.getTestTag();
        if (testTag == null) {
            testTag = "button" + buttonTextData.getLabel().getTag();
        }
        f0.y0(i0Var, testTag);
        f0.r0(i0Var, n4.l.INSTANCE.a());
        f0.c0(i0Var, (buttonTextData.getContentDescription() != null ? buttonTextData.getContentDescription() : buttonTextData.getLabel()).getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(cx.a aVar, final ButtonTextData buttonTextData, final boolean z15, final o oVar) {
        cx.a.a(aVar, 0L, new er.a() { // from class: j30.e
            @Override // er.a
            public final Object a() {
                return f.h(buttonTextData, z15, oVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(ButtonTextData buttonTextData, boolean z15, o oVar) {
        buttonTextData.d().a();
        if (z15) {
            oVar.B(true);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(m mVar, ButtonTextData buttonTextData, boolean z15, int i15, int i16, r rVar, int i17) {
        e(mVar, buttonTextData, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
