package m30;

import d1.a3;
import d1.e0;
import d1.i0;
import d1.r3;
import l3.d0;
import l3.g0;
import mx.Label;
import n30.CardListAccessibilityData;
import n30.CardListData;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.h0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import t70.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "index", "Ln50/k;", "singleCardData", "Ln30/b;", "data", "Ll3/d0;", "focusRequester", "Loq/i0;", "b", "(ILn50/k;Ln30/b;Ll3/d0;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0190  */
    /* JADX WARN: Code duplicated, block: B:65:0x019c  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01db  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0234  */
    /* JADX WARN: Code duplicated, block: B:83:0x023c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0278  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:93:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02df  */
    public static final void b(final int i15, final n50.k kVar, final CardListData cardListData, d0 d0Var, r rVar, final int i16, final int i17) {
        int i18;
        d0 d0Var2;
        boolean z15;
        final d0 d0Var3;
        d5 d5VarM;
        d0 d0Var4;
        Object objE;
        f3.m.Companion companion;
        k70.a aVar;
        int i19;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        f3.m mVarA;
        n50.k kVarG;
        CardListAccessibilityData cardListAccessibilityData;
        Label additionalContext;
        r rVarH = rVar.h(1471955194);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= (i16 & 64) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.W(cardListData) ? 256 : 128;
        }
        int i25 = i17 & 8;
        if (i25 == 0) {
            if ((i16 & 3072) == 0) {
                d0Var2 = d0Var;
                i18 |= rVarH.W(d0Var2) ? 2048 : 1024;
            }
            if ((i18 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i25 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                if (t.k()) {
                    t.o(1471955194, i18, -1, "pl.gov.coi.common.ui.ds.cardlist.CardListContent (CardListContent.kt:29)");
                }
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = b1.k.a();
                    rVarH.v(objE);
                }
                b1.l lVar = (b1.l) objE;
                f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
                companion = f3.m.INSTANCE;
                aVar = k70.a.f108864a;
                i19 = k70.a.f108865b;
                f3.m mVarA2 = k3.f.a(s.u(companion, f6VarA, aVar.b(rVarH, i19).getSpacing200(), c5.h.n(c5.h.n(aVar.b(rVarH, i19).getSpacing25() * 2) + aVar.b(rVarH, i19).getStrokeWidth())), aVar.e(rVarH, i19).getRadius200());
                d1.i iVar = d1.i.f39152a;
                d1.i.n nVarK = iVar.k();
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarA2);
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
                int i26 = i18;
                n6.i(rVarC, w0VarA, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                i0 i0Var = i0.f39176a;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing25()), rVarH, 0);
                f3.m mVarA3 = k3.f.a(companion, aVar.e(rVarH, i19).getRadius200());
                w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarA3);
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
                n6.i(rVarC2, w0VarA2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                if (d0Var4 != null || (mVarA = g0.a(companion, d0Var4)) == null) {
                    mVarA = companion;
                }
                if (kVar instanceof CustomSingleCardData) {
                    kVarG = CustomSingleCardData.g((CustomSingleCardData) kVar, null, null, null, false, cardListData.getSingleCardState(), null, false, null, 239, null);
                } else {
                    if (kVar instanceof DefaultSingleCardData) {
                        throw new oq.p();
                    }
                    kVarG = DefaultSingleCardData.g((DefaultSingleCardData) kVar, null, null, false, cardListData.getSingleCardState(), null, false, null, null, null, null, null, null, 4087, null);
                }
                n50.k kVar2 = kVarG;
                float spacing25 = aVar.b(rVarH, i19).getSpacing25();
                cardListAccessibilityData = cardListData.getCardListAccessibilityData();
                if (cardListAccessibilityData != null) {
                    additionalContext = cardListAccessibilityData.getAdditionalContext();
                } else {
                    additionalContext = null;
                }
                d0 d0Var5 = d0Var4;
                h0.M(mVarA, kVar2, lVar, Integer.valueOf(i15), spacing25, additionalContext, rVarH, ((i26 << 9) & 7168) | MLKEMEngine.KyberPolyBytes, 0);
                rVarH = rVarH;
                rVarH.x();
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing25()), rVarH, 0);
                if (i15 < v.p(cardListData.d())) {
                    rVarH.X(-1857115748);
                    vb.h(a3.r(companion, aVar.b(rVarH, i19).getSpacing200(), 0.0f, aVar.b(rVarH, i19).getSpacing200(), 0.0f, 10, null), aVar.b(rVarH, i19).getStrokeWidth(), aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVarH, 0, 0);
                } else {
                    rVarH.X(-1859692034);
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                d0Var3 = d0Var5;
            } else {
                rVarH.O();
                d0Var3 = d0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: m30.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.c(i15, kVar, cardListData, d0Var3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        d0Var2 = d0Var;
        if ((i18 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            if (i25 != 0) {
                d0Var4 = null;
            } else {
                d0Var4 = d0Var2;
            }
            if (t.k()) {
                t.o(1471955194, i18, -1, "pl.gov.coi.common.ui.ds.cardlist.CardListContent (CardListContent.kt:29)");
            }
            objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = b1.k.a();
                rVarH.v(objE);
            }
            b1.l lVar2 = (b1.l) objE;
            f6<Boolean> f6VarA2 = b1.f.a(lVar2, rVarH, 6);
            companion = f3.m.INSTANCE;
            aVar = k70.a.f108864a;
            i19 = k70.a.f108865b;
            f3.m mVarA4 = k3.f.a(s.u(companion, f6VarA2, aVar.b(rVarH, i19).getSpacing200(), c5.h.n(c5.h.n(aVar.b(rVarH, i19).getSpacing25() * 2) + aVar.b(rVarH, i19).getStrokeWidth())), aVar.e(rVarH, i19).getRadius200());
            d1.i iVar2 = d1.i.f39152a;
            d1.i.n nVarK2 = iVar2.k();
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarA3 = e0.a(nVarK2, companion4.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarA4);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            int i27 = i18;
            n6.i(rVarC3, w0VarA3, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            i0 i0Var2 = i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing25()), rVarH, 0);
            f3.m mVarA5 = k3.f.a(companion, aVar.e(rVarH, i19).getRadius200());
            w0 w0VarA4 = e0.a(iVar2.k(), companion4.k(), rVarH, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarA5);
            aVarB2 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarA4, companion5.d());
            n6.i(rVarC4, e0VarT4, companion5.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
            n6.g(rVarC4, companion5.a());
            n6.i(rVarC4, mVarE4, companion5.e());
            if (d0Var4 != null) {
                mVarA = companion;
            } else {
                mVarA = companion;
            }
            if (kVar instanceof CustomSingleCardData) {
                kVarG = CustomSingleCardData.g((CustomSingleCardData) kVar, null, null, null, false, cardListData.getSingleCardState(), null, false, null, 239, null);
            } else {
                if (kVar instanceof DefaultSingleCardData) {
                    throw new oq.p();
                }
                kVarG = DefaultSingleCardData.g((DefaultSingleCardData) kVar, null, null, false, cardListData.getSingleCardState(), null, false, null, null, null, null, null, null, 4087, null);
            }
            n50.k kVar3 = kVarG;
            float spacing26 = aVar.b(rVarH, i19).getSpacing25();
            cardListAccessibilityData = cardListData.getCardListAccessibilityData();
            if (cardListAccessibilityData != null) {
                additionalContext = cardListAccessibilityData.getAdditionalContext();
            } else {
                additionalContext = null;
            }
            d0 d0Var6 = d0Var4;
            h0.M(mVarA, kVar3, lVar2, Integer.valueOf(i15), spacing26, additionalContext, rVarH, ((i27 << 9) & 7168) | MLKEMEngine.KyberPolyBytes, 0);
            rVarH = rVarH;
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing25()), rVarH, 0);
            if (i15 < v.p(cardListData.d())) {
                rVarH.X(-1857115748);
                vb.h(a3.r(companion, aVar.b(rVarH, i19).getSpacing200(), 0.0f, aVar.b(rVarH, i19).getSpacing200(), 0.0f, 10, null), aVar.b(rVarH, i19).getStrokeWidth(), aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVarH, 0, 0);
            } else {
                rVarH.X(-1859692034);
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            d0Var3 = d0Var6;
        } else {
            rVarH.O();
            d0Var3 = d0Var2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m30.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.c(i15, kVar, cardListData, d0Var3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(int i15, n50.k kVar, CardListData cardListData, d0 d0Var, int i16, int i17, r rVar, int i18) {
        b(i15, kVar, cardListData, d0Var, rVar, g4.a(i16 | 1), i17);
        return oq.i0.f148189a;
    }
}
