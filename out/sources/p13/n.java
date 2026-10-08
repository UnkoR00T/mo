package p13;

import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import n3.Shadow;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.SpanStyle;
import q4.TextStyle;
import q4.j0;
import t40.InfoRowListData;
import x4.LocaleList;
import y60.MediaPlayerComponentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lp13/j;", "viewModel", "Loq/i0;", "d", "(Lp13/j;Lm2/r;I)V", "Lp13/j$a;", "screenData", "g", "(Lp13/j$a;Lm2/r;I)V", "safetyguide_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void d(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-225116576);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-225116576, i16, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.alerts.SafetyGuideAlertsScreen (SafetyGuideAlertsScreen.kt:28)");
            }
            j.Data dataE = e(m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7));
            int i17 = BaseScaffoldData.f89350g | InfoRowListData.f187643b | c30.b.f22944i;
            int i18 = MediaPlayerComponentData.f224389j;
            g(dataE, rVarH, i17 | i18 | i18);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p13.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.f(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.Data e(f6<j.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(j jVar, int i15, p076m2.r rVar, int i16) {
        d(jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final j.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(279120861);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(279120861, i16, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.alerts.SafetyGuideAlertsScreenContent (SafetyGuideAlertsScreen.kt:34)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(157120586, true, new er.q() { // from class: p13.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.h(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p13.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.i(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(j.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(157120586, i16, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.alerts.SafetyGuideAlertsScreenContent.<anonymous> (SafetyGuideAlertsScreen.kt:38)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label headerData = data.getHeaderData();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, headerData, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, data.getDescriptionData(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, data.getThreatsSectionTitleData(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            s40.g.c(data.getThreatsInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            c30.e.c(null, data.getRsoAlertData(), rVar, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, data.getAlertsSectionTitleData(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            TextStyle textStyleA = aVar.f(rVar, i17).a();
            long jB = aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            rVar.X(-1122003559);
            q4.e.b bVar = new q4.e.b(0, 1, null);
            TextStyle textStyleA2 = aVar.f(rVar, i17).a();
            Color.Companion companion3 = Color.INSTANCE;
            int iO = bVar.o(new SpanStyle(companion3.h(), textStyleA2.n(), textStyleA2.q(), (u4.y) null, (u4.z) null, textStyleA2.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65496, (fr.k) null));
            try {
                bVar.f(data.getAlarmAnnouncementTitlePart1().getText());
                bVar.l(iO);
                TextStyle textStyleB = aVar.f(rVar, i17).b();
                int iO2 = bVar.o(new SpanStyle(companion3.h(), textStyleB.n(), textStyleB.q(), (u4.y) null, (u4.z) null, textStyleB.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65496, (fr.k) null));
                try {
                    Label.Companion companion4 = Label.INSTANCE;
                    bVar.f(companion4.d().getText());
                    bVar.f(data.getAlarmAnnouncementTitlePart2().getText());
                    bVar.l(iO2);
                    q4.e eVarP = bVar.p();
                    rVar.R();
                    j70.h.g(null, null, null, null, eVarP, jB, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, null, null, false, false, null, rVar, 0, 0, 0, 33030095);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing400()), rVar, 0);
                    j70.h.g(null, null, data.getAlarmAnnouncementDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, true, null, rVar, 0, 0, 3072, 24641499);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
                    MediaPlayerComponentData alarmAnnouncementMediaPlayerComponentData = data.getAlarmAnnouncementMediaPlayerComponentData();
                    int i18 = MediaPlayerComponentData.f224389j;
                    y60.p.m(alarmAnnouncementMediaPlayerComponentData, rVar, i18);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
                    TextStyle textStyleA3 = aVar.f(rVar, i17).a();
                    long jB2 = aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                    rVar.X(-1121967655);
                    q4.e.b bVar2 = new q4.e.b(0, 1, null);
                    TextStyle textStyleA4 = aVar.f(rVar, i17).a();
                    int iO3 = bVar2.o(new SpanStyle(companion3.h(), textStyleA4.n(), textStyleA4.q(), (u4.y) null, (u4.z) null, textStyleA4.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65496, (fr.k) null));
                    try {
                        bVar2.f(data.getAlarmCancellationTitlePart1().getText());
                        bVar2.l(iO3);
                        TextStyle textStyleB2 = aVar.f(rVar, i17).b();
                        int iO4 = bVar2.o(new SpanStyle(companion3.h(), textStyleB2.n(), textStyleB2.q(), (u4.y) null, (u4.z) null, textStyleB2.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65496, (fr.k) null));
                        try {
                            bVar2.f(companion4.d().getText());
                            bVar2.f(data.getAlarmCancellationTitlePart2().getText());
                            bVar2.l(iO4);
                            q4.e eVarP2 = bVar2.p();
                            rVar.R();
                            j70.h.g(null, null, null, null, eVarP2, jB2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA3, null, null, false, false, null, rVar, 0, 0, 0, 33030095);
                            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing400()), rVar, 0);
                            j70.h.g(null, null, data.getAlarmCancellationDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, true, null, rVar, 0, 0, 3072, 24641499);
                            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
                            y60.p.m(data.getAlarmCancellationMediaPlayerComponentData(), rVar, i18);
                            rVar.x();
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                        } catch (Throwable th4) {
                            bVar2.l(iO4);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        bVar2.l(iO3);
                        throw th5;
                    }
                } catch (Throwable th6) {
                    bVar.l(iO2);
                    throw th6;
                }
            } catch (Throwable th7) {
                bVar.l(iO);
                throw th7;
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(j.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
