package q50;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import d1.a3;
import d1.e0;
import d1.h0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import er.q;
import f3.m;
import mx.Label;
import n3.y2;
import n4.i0;
import n4.v;
import p036e4.w0;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import t70.s;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lq50/a;", "data", "Loq/i0;", "e", "(Lq50/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "getSTATISTIC_CARD_MINIMUM_HEIGHT", "()F", "STATISTIC_CARD_MINIMUM_HEIGHT", "b", "getSTATISTIC_CARD_MINIMUM_LABEL_HEIGHT", "STATISTIC_CARD_MINIMUM_LABEL_HEIGHT", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f164790a = c5.h.n(132);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f164791b = c5.h.n(36);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StatisticCardData f164792a;

        a(StatisticCardData statisticCardData) {
            this.f164792a = statisticCardData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long jD;
            rVar.X(178730190);
            if (t.k()) {
                t.o(178730190, i15, -1, "pl.gov.coi.common.ui.ds.statisticcard.StatisticCard.<anonymous>.<anonymous>.<anonymous> (StatisticCard.kt:96)");
            }
            i staticCardVariant = this.f164792a.getStaticCardVariant();
            if (staticCardVariant instanceof i.DefaultContainer) {
                rVar.X(-38975175);
                jD = ((i.DefaultContainer) this.f164792a.getStaticCardVariant()).a().B(rVar, 0).m20unboximpl();
                rVar.R();
            } else {
                if (!fr.t.c(staticCardVariant, i.b.f164798a)) {
                    rVar.X(-38978579);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-38972393);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().d();
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jD;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StatisticCardData f164793a;

        b(StatisticCardData statisticCardData) {
            this.f164793a = statisticCardData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long jM20unboximpl;
            rVar.X(524188006);
            if (t.k()) {
                t.o(524188006, i15, -1, "pl.gov.coi.common.ui.ds.statisticcard.StatisticCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticCard.kt:141)");
            }
            i staticCardVariant = this.f164793a.getStaticCardVariant();
            if (fr.t.c(staticCardVariant, i.b.f164798a)) {
                rVar.X(1233504271);
                jM20unboximpl = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().d();
                rVar.R();
            } else {
                if (!(staticCardVariant instanceof i.DefaultContainer)) {
                    rVar.X(1233500943);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(1233507249);
                jM20unboximpl = this.f164793a.getTrailingSection().c().B(rVar, 0).m20unboximpl();
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jM20unboximpl;
        }
    }

    public static final void e(final StatisticCardData statisticCardData, r rVar, final int i15) {
        int i16;
        r rVar2;
        long primary;
        r rVarH = rVar.h(1135293309);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(statisticCardData) : rVarH.G(statisticCardData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1135293309, i16, -1, "pl.gov.coi.common.ui.ds.statisticcard.StatisticCard (StatisticCard.kt:44)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            l lVar = (l) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = s.I();
                rVarH.v(objE2);
            }
            final cx.a aVar = (cx.a) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            m mVarL = m.INSTANCE;
            m mVarK = androidx.compose.foundation.layout.d.k(androidx.compose.foundation.layout.d.h(mVarL, 0.0f, 1, null), f164790a, 0.0f, 2, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarA = k3.f.a(mVarK, aVar2.e(rVarH, i17).getRadius200());
            if (statisticCardData.c() != null) {
                rVarH.X(-1344053176);
                r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
                n4.l lVarJ = n4.l.j(n4.l.INSTANCE.a());
                boolean zG = rVarH.G(aVar) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(statisticCardData)));
                Object objE3 = rVarH.E();
                if (zG || objE3 == companion.a()) {
                    objE3 = new er.a() { // from class: q50.b
                        @Override // er.a
                        public final Object a() {
                            return f.f(aVar, statisticCardData);
                        }
                    };
                    rVarH.v(objE3);
                }
                mVarL = androidx.compose.foundation.b.l(mVarL, lVar, r1VarE, false, null, lVarJ, (er.a) objE3, 12, null);
                rVarH.R();
            } else {
                rVarH.X(-1343772409);
                rVarH.R();
            }
            m mVarU = mVarA.u(mVarL);
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new er.l() { // from class: q50.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.g((i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarW = s.w(v.c(mVarU, true, (er.l) objE4), f6VarA, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 4, null);
            y2 radius200 = aVar2.e(rVarH, i17).getRadius200();
            y1 y1Var = y1.f58315a;
            i staticCardVariant = statisticCardData.getStaticCardVariant();
            if (staticCardVariant instanceof i.DefaultContainer) {
                rVarH.X(95214245);
                primary = aVar2.a(rVarH, i17).getSurface().a();
                rVarH.R();
            } else {
                if (!fr.t.c(staticCardVariant, i.b.f164798a)) {
                    rVarH.X(95210982);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(95216740);
                primary = aVar2.a(rVarH, i17).getBase().getPrimary();
                rVarH.R();
            }
            int i18 = y1.f58316b;
            rVar2 = rVarH;
            c2.c(mVarW, radius200, y1Var.b(primary, 0L, 0L, 0L, rVarH, i18 << 12, 14), y1Var.c(aVar2.c(rVarH, i17).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i18 << 18, 62), null, y2.m.d(-1910813237, true, new q() { // from class: q50.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.h(statisticCardData, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, 196608, 16);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: q50.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(statisticCardData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(cx.a aVar, StatisticCardData statisticCardData) {
        cx.a.a(aVar, 0L, statisticCardData.c(), 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(i0 i0Var) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(StatisticCardData statisticCardData, h0 h0Var, r rVar, int i15) {
        long jD;
        long jD2;
        String str;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1910813237, i15, -1, "pl.gov.coi.common.ui.ds.statisticcard.StatisticCard.<anonymous> (StatisticCard.kt:86)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            m mVarN = a3.n(mVarF, aVar.b(rVar, i16).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            int iconResId = statisticCardData.getIconResId();
            d40.i.f fVar = d40.i.f.f39709e;
            d40.h.f(null, new d40.b.C0864b(null, iconResId, fVar, new a(statisticCardData), null, null, 33, null), false, rVar, 0, 5);
            m mVarK = androidx.compose.foundation.layout.d.k(a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing50(), 0.0f, 0.0f, 13, null), f164791b, 0.0f, 2, null);
            Label label = statisticCardData.getLabel();
            TextStyle textStyleD = aVar.f(rVar, i16).d();
            i staticCardVariant = statisticCardData.getStaticCardVariant();
            if (staticCardVariant instanceof i.DefaultContainer) {
                rVar.X(154376799);
                jD = aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVar.R();
            } else {
                if (!fr.t.c(staticCardVariant, i.b.f164798a)) {
                    rVar.X(154373480);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(154379422);
                jD = aVar.a(rVar, i16).getBase().d();
                rVar.R();
            }
            j70.h.g(mVarK, null, label, null, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            r3.a(h0.b(i0Var, companion, 1.0f, false, 2, null), rVar, 0);
            m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarB = m3.b(iVar.j(), companion2.i(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            m mVarE2 = f3.j.e(rVar, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            m mVarK2 = androidx.compose.foundation.layout.d.k(p3.c(q3.f39261a, companion, 1.0f, false, 2, null), aVar.b(rVar, i16).getSpacing400(), 0.0f, 2, null);
            Label title = statisticCardData.getTitle();
            TextStyle textStyleM = aVar.f(rVar, i16).m();
            i staticCardVariant2 = statisticCardData.getStaticCardVariant();
            if (staticCardVariant2 instanceof i.DefaultContainer) {
                rVar.X(1663161563);
                jD2 = aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                rVar.R();
            } else {
                if (!fr.t.c(staticCardVariant2, i.b.f164798a)) {
                    rVar.X(1663158186);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(1663164250);
                jD2 = aVar.a(rVar, i16).getBase().d();
                rVar.R();
            }
            j70.h.g(mVarK2, null, title, null, null, jD2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM, null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            TrailingSection trailingSection = statisticCardData.getTrailingSection();
            if (trailingSection == null) {
                rVar.X(18573231);
            } else {
                rVar.X(18573232);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
                m mVarR = a3.r(companion, aVar.b(rVar, i16).getSpacing50(), 0.0f, 0.0f, 0.0f, 14, null);
                String trailingSectionTestTag = trailingSection.getTrailingSectionTestTag();
                if (trailingSectionTestTag != null) {
                    str = trailingSectionTestTag + "Icon";
                } else {
                    str = null;
                }
                d40.h.f(mVarR, new d40.b.C0864b(str, trailingSection.getIconResId(), fVar, new b(statisticCardData), trailingSection.getContentDescription(), null, 32, null), false, rVar, 0, 4);
                oq.i0 i0Var2 = oq.i0.f148189a;
            }
            rVar.R();
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(StatisticCardData statisticCardData, int i15, r rVar, int i16) {
        e(statisticCardData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
