package m30;

import d1.x;
import l1.RoundedCornerShape;
import n30.CardListAccessibilityData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln30/a;", "cardListAccessibilityData", "Lkotlin/Function0;", "Loq/i0;", "content", "c", "(Ln30/a;Ler/p;Lm2/r;II)V", "", "index", "lastIndex", "e", "(IILer/p;Lm2/r;I)V", "Ll1/g;", "g", "(IILm2/r;I)Ll1/g;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void c(CardListAccessibilityData cardListAccessibilityData, final er.p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        final CardListAccessibilityData cardListAccessibilityData2;
        int i17;
        f3.m mVarR;
        r rVarH = rVar.h(-1922445246);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            cardListAccessibilityData2 = cardListAccessibilityData;
        } else if ((i15 & 6) == 0) {
            cardListAccessibilityData2 = cardListAccessibilityData;
            i17 = (rVarH.W(cardListAccessibilityData2) ? 4 : 2) | i15;
        } else {
            cardListAccessibilityData2 = cardListAccessibilityData;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                cardListAccessibilityData2 = null;
            }
            if (t.k()) {
                t.o(-1922445246, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.CardListContainer (CardListContainer.kt:17)");
            }
            f3.m mVar = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            CardListAccessibilityData cardListAccessibilityData3 = cardListAccessibilityData2;
            f3.m mVarC = w0.i.c(mVarH, aVar.a(rVarH, i19).getSurface().a(), l1.h.f(aVar.b(rVarH, i19).getSpacing200()));
            f3.c.Companion companion = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarC);
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
            x xVar = x.f39368a;
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null);
            if (cardListAccessibilityData3 != null && cardListAccessibilityData3.getReadListInfo() != null && (mVarR = t70.i.r(mVar, -1)) != null) {
                mVar = mVarR;
            }
            f3.m mVarU = mVarH2.u(mVar);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarU);
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
            n6.i(rVarC2, w0VarA, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            pVar.B(rVarH, Integer.valueOf((i17 >> 3) & 14));
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            cardListAccessibilityData2 = cardListAccessibilityData3;
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m30.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.d(cardListAccessibilityData2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(CardListAccessibilityData cardListAccessibilityData, er.p pVar, int i15, int i16, r rVar, int i17) {
        c(cardListAccessibilityData, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void e(final int i15, final int i16, final er.p<? super r, ? super Integer, i0> pVar, r rVar, final int i17) {
        int i18;
        r rVarH = rVar.h(1874309843);
        if ((i17 & 6) == 0) {
            i18 = (rVarH.c(i15) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i18 |= rVarH.c(i16) ? 32 : 16;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i18 & 147) != 146, i18 & 1)) {
            if (t.k()) {
                t.o(1874309843, i18, -1, "pl.gov.coi.common.ui.ds.cardlist.CardListContainerSegment (CardListContainer.kt:45)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarC = w0.i.c(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getSurface().a(), g(i15, i16, rVarH, i18 & 126));
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarH);
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
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            pVar.B(rVarH, Integer.valueOf((i18 >> 6) & 14));
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m30.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.f(i15, i16, pVar, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(int i15, int i16, er.p pVar, int i17, r rVar, int i18) {
        e(i15, i16, pVar, rVar, g4.a(i17 | 1));
        return i0.f148189a;
    }

    private static final RoundedCornerShape g(int i15, int i16, r rVar, int i17) {
        RoundedCornerShape roundedCornerShapeF;
        if (t.k()) {
            t.o(-1452627324, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.getShape (CardListContainer.kt:67)");
        }
        if (i16 == 0) {
            rVar.X(869977961);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            roundedCornerShapeF = l1.h.g(aVar.b(rVar, i18).getSpacing200(), aVar.b(rVar, i18).getSpacing200(), aVar.b(rVar, i18).getSpacing200(), aVar.b(rVar, i18).getSpacing200());
            rVar.R();
        } else if (i15 == 0) {
            rVar.X(-110476233);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            roundedCornerShapeF = l1.h.h(aVar2.b(rVar, i19).getSpacing200(), aVar2.b(rVar, i19).getSpacing200(), 0.0f, 0.0f, 12, null);
            rVar.R();
        } else if (i15 == i16) {
            rVar.X(870344133);
            k70.a aVar3 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            roundedCornerShapeF = l1.h.h(0.0f, 0.0f, aVar3.b(rVar, i25).getSpacing200(), aVar3.b(rVar, i25).getSpacing200(), 3, null);
            rVar.R();
        } else {
            rVar.X(-110467536);
            roundedCornerShapeF = l1.h.f(k70.a.f108864a.b(rVar, k70.a.f108865b).getZero());
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return roundedCornerShapeF;
    }
}
