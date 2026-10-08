package g42;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.l;
import er.p;
import er.q;
import f1.q0;
import h30.ButtonData;
import i50.BaseScaffoldData;
import i50.s;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n4.f0;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import y2.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Li50/a;", "scaffoldData", "", "paymentTitle", "additionalTitle", "Landroidx/compose/ui/graphics/Color;", "additionalTitleColor", "Ln50/g;", "topCardData", "Ln30/b;", "contentData", "", "Lh30/a;", "buttonsData", "transactionsButtonData", "Loq/i0;", "h", "(Li50/a;Ljava/lang/String;Ljava/lang/String;JLn50/g;Ln30/b;Ljava/util/List;Ln50/g;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void h(final BaseScaffoldData baseScaffoldData, final String str, final String str2, final long j15, final DefaultSingleCardData defaultSingleCardData, final CardListData cardListData, final List<ButtonData> list, final DefaultSingleCardData defaultSingleCardData2, r rVar, final int i15) {
        int i16;
        DefaultSingleCardData defaultSingleCardData3;
        r rVar2;
        r rVarH = rVar.h(2142691620);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(baseScaffoldData) : rVarH.G(baseScaffoldData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(str) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(str2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.d(j15) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            defaultSingleCardData3 = defaultSingleCardData;
            i16 |= rVarH.W(defaultSingleCardData3) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            defaultSingleCardData3 = defaultSingleCardData;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.W(cardListData) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(list) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.W(defaultSingleCardData2) ? 8388608 : 4194304;
        }
        if (rVarH.r((4793491 & i16) != 4793490, i16 & 1)) {
            if (t.k()) {
                t.o(2142691620, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.common.DetailsScreen (DetailsScreen.kt:52)");
            }
            final DefaultSingleCardData defaultSingleCardData4 = defaultSingleCardData3;
            rVar2 = rVarH;
            s.r(baseScaffoldData, m.d(-668377265, true, new p() { // from class: g42.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(list, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(-1310266793, true, new q() { // from class: g42.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.j(str, str2, j15, defaultSingleCardData4, cardListData, defaultSingleCardData2, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48 | (i16 & 14), 196608, 32764);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: g42.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(baseScaffoldData, str, str2, j15, defaultSingleCardData, cardListData, list, defaultSingleCardData2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(List list, r rVar, int i15) {
        r rVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-668377265, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.common.DetailsScreen.<anonymous> (DetailsScreen.kt:56)");
            }
            if (list.isEmpty()) {
                rVar2 = rVar;
                rVar2.X(-161342189);
            } else {
                rVar.X(-158659294);
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                f3.m mVarQ = a3.q(androidx.compose.foundation.layout.d.h(w0.i.d(companion, aVar.a(rVar, i16).getBase().a(), null, 2, null), 0.0f, 1, null), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200());
                w0 w0VarA = e0.a(d1.i.f39152a.d(), f3.c.INSTANCE.k(), rVar, 6);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarQ);
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
                rVar.X(-1343265528);
                int i17 = 0;
                for (Object obj : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        v.x();
                    }
                    ButtonData buttonData = (ButtonData) obj;
                    if (i17 != 0) {
                        rVar.X(134984581);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), rVar, 0);
                    } else {
                        rVar.X(-113634625);
                    }
                    rVar.R();
                    h30.q.p(buttonData, false, null, rVar, 0, 6);
                    i17 = i18;
                }
                rVar2 = rVar;
                rVar2.R();
                rVar2.x();
            }
            rVar2.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final String str, final String str2, final long j15, final DefaultSingleCardData defaultSingleCardData, final CardListData cardListData, final DefaultSingleCardData defaultSingleCardData2, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1310266793, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.common.DetailsScreen.<anonymous> (DetailsScreen.kt:77)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(androidx.compose.foundation.layout.d.f(w0.i.d(companion, aVar.a(rVar, i17).getBase().a(), null, 2, null), 0.0f, 1, null), d3Var), aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zW = rVar.W(str) | rVar.W(str2) | rVar.d(j15) | rVar.W(defaultSingleCardData) | rVar.W(cardListData) | rVar.W(defaultSingleCardData2);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                l lVar = new l() { // from class: g42.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.k(str, str2, j15, defaultSingleCardData, cardListData, defaultSingleCardData2, (q0) obj);
                    }
                };
                rVar.v(lVar);
                objE = lVar;
            }
            f1.d.c(mVarR, null, d3VarI, false, null, null, null, false, null, (l) objE, rVar, 0, 506);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final String str, final String str2, final long j15, final DefaultSingleCardData defaultSingleCardData, final CardListData cardListData, final DefaultSingleCardData defaultSingleCardData2, q0 q0Var) {
        q0.c(q0Var, null, null, m.b(-1743334494, true, new q() { // from class: g42.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i.l(str, str2, j15, (f1.e) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        q0.c(q0Var, null, null, m.b(1601485515, true, new q() { // from class: g42.g
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i.n(defaultSingleCardData, cardListData, defaultSingleCardData2, (f1.e) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(String str, String str2, long j15, f1.e eVar, r rVar, int i15) {
        f3.m.Companion companion;
        k70.a aVar;
        int i16;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1743334494, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.common.DetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailsScreen.kt:92)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: g42.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.m((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(companion2, false, (l) objE, 1, null);
            Label labelB = mx.b.b(str, "paymentTitle");
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(mVarD, null, labelB, null, null, aVar2.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            r rVar2 = rVar;
            if (str2 == null) {
                rVar2.X(-933064713);
                rVar2.R();
                aVar = aVar2;
                companion = companion2;
                i16 = i17;
            } else {
                rVar2.X(-933064712);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i17).getSpacing100()), rVar2, 0);
                companion = companion2;
                j70.h.g(null, null, mx.b.b(str2, ""), null, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i17).c(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                rVar2.R();
                aVar = aVar2;
                i16 = i17;
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i16).getSpacing300()), rVar2, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n4.i0 i0Var) {
        f0.t(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(DefaultSingleCardData defaultSingleCardData, CardListData cardListData, DefaultSingleCardData defaultSingleCardData2, f1.e eVar, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1601485515, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.common.DetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailsScreen.kt:113)");
            }
            if (defaultSingleCardData == null) {
                rVar.X(1358281422);
            } else {
                rVar.X(1358281423);
                h0.v(defaultSingleCardData, null, rVar, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            }
            rVar.R();
            m30.i.d(cardListData, null, null, rVar, 0, 6);
            if (defaultSingleCardData2 == null) {
                rVar.X(1358547433);
            } else {
                rVar.X(1358547434);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                h0.v(defaultSingleCardData2, null, rVar, 0, 2);
            }
            rVar.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(BaseScaffoldData baseScaffoldData, String str, String str2, long j15, DefaultSingleCardData defaultSingleCardData, CardListData cardListData, List list, DefaultSingleCardData defaultSingleCardData2, int i15, r rVar, int i16) {
        h(baseScaffoldData, str, str2, j15, defaultSingleCardData, cardListData, list, defaultSingleCardData2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
