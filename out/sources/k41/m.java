package k41;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n41.ChildDataScreenModel;
import n50.SingleCardConfig;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q4.TextStyle;
import u50.v0;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lk41/d;", "viewModel", "Loq/i0;", "q", "(Lk41/d;Lm2/r;I)V", "Lk41/d$a;", "data", "i", "(Lk41/d$a;Lm2/r;I)V", "state", "childbirthregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void i(final d.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1629412245);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1629412245, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.childdata.ChildDataContent (ChildDataScreen.kt:50)");
            }
            i50.s.r(data.getBaseScaffoldData(), y2.m.d(887786634, true, new er.p() { // from class: k41.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.j(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-413070206, true, new er.q() { // from class: k41.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.l(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean zG = rVarH.G(data);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: k41.h
                    @Override // er.a
                    public final Object a() {
                        return m.o(data);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: k41.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.p(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(d.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(887786634, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.childdata.ChildDataContent.<anonymous> (ChildDataScreen.kt:54)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: k41.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.k((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarN, false, (er.l) objE, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(data.getNextButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(d.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        TextStyle textStyleJ;
        float f15;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        SingleCardConfig singleCardConfig;
        p076m2.r rVar2 = rVar;
        int i19 = 2;
        int i25 = (i15 & 6) == 0 ? i15 | (rVar2.W(d3Var) ? 4 : 2) : i15;
        int i26 = 1;
        int i27 = 0;
        if (rVar2.r((i25 & 19) != 18, i25 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-413070206, i25, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.childdata.ChildDataContent.<anonymous> (ChildDataScreen.kt:65)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar2.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: k41.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.m((n4.i0) obj);
                    }
                };
                rVar2.v(objE);
            }
            SingleCardConfig singleCardConfig2 = null;
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            float f16 = 0.0f;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar2, 0, 1), rVar2, 0);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVar2, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c30.e.c(null, data.getAlertData(), rVar2, c30.b.f22944i << 3, 1);
            k70.a aVar = k70.a.f108864a;
            int i28 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i28).getSpacing300()), rVar2, 0);
            w0 w0VarA2 = d1.e0.a(iVar.r(aVar.b(rVar2, i28).getSpacing200()), companion2.k(), rVar2, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, companion);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            rVar2.X(409868584);
            List<ChildDataScreenModel.InterfaceC3259a> listA = data.getChildDataScreenModel().a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            for (final ChildDataScreenModel.InterfaceC3259a interfaceC3259a : listA) {
                if (interfaceC3259a instanceof ChildDataScreenModel.InterfaceC3259a.Folded) {
                    rVar2.X(1942716775);
                    f3.m.Companion companion4 = f3.m.INSTANCE;
                    w0 w0VarA3 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, i27);
                    int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, i27));
                    p076m2.e0 e0VarT4 = rVar2.t();
                    f3.m mVarE4 = f3.j.e(rVar2, companion4);
                    androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB4 = companion5.b();
                    if (rVar2.l() == null) {
                        p076m2.m.d();
                    }
                    rVar2.K();
                    if (rVar2.getInserting()) {
                        rVar2.H(aVarB4);
                    } else {
                        rVar2.u();
                    }
                    p076m2.r rVarC4 = n6.c(rVar2);
                    n6.i(rVarC4, w0VarA3, companion5.d());
                    n6.i(rVarC4, e0VarT4, companion5.f());
                    n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
                    n6.g(rVarC4, companion5.a());
                    n6.i(rVarC4, mVarE4, companion5.e());
                    d1.i0 i0Var2 = d1.i0.f39176a;
                    n50.h0.v(((ChildDataScreenModel.InterfaceC3259a.Folded) interfaceC3259a).getExpandSingleCardData(), singleCardConfig2, rVar2, i27, i19);
                    rVar2.x();
                    rVar2.R();
                    arrayList = arrayList2;
                    i18 = i19;
                    f15 = f16;
                    singleCardConfig = singleCardConfig2;
                    i17 = i26;
                    i16 = i27;
                } else {
                    if (!(interfaceC3259a instanceof ChildDataScreenModel.InterfaceC3259a.Expanded)) {
                        rVar2.X(1942715696);
                        rVar2.R();
                        throw new oq.p();
                    }
                    rVar2.X(1942723525);
                    f3.m.Companion companion6 = f3.m.INSTANCE;
                    d1.i iVar2 = d1.i.f39152a;
                    d1.i.n nVarK = iVar2.k();
                    f3.c.Companion companion7 = f3.c.INSTANCE;
                    w0 w0VarA4 = d1.e0.a(nVarK, companion7.k(), rVar2, i27);
                    int iHashCode5 = Long.hashCode(p076m2.m.b(rVar2, i27));
                    p076m2.e0 e0VarT5 = rVar2.t();
                    f3.m mVarE5 = f3.j.e(rVar2, companion6);
                    androidx.compose.ui.node.c.Companion companion8 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB5 = companion8.b();
                    if (rVar2.l() == null) {
                        p076m2.m.d();
                    }
                    rVar2.K();
                    if (rVar2.getInserting()) {
                        rVar2.H(aVarB5);
                    } else {
                        rVar2.u();
                    }
                    p076m2.r rVarC5 = n6.c(rVar2);
                    n6.i(rVarC5, w0VarA4, companion8.d());
                    n6.i(rVarC5, e0VarT5, companion8.f());
                    n6.i(rVarC5, Integer.valueOf(iHashCode5), companion8.c());
                    n6.g(rVarC5, companion8.a());
                    n6.i(rVarC5, mVarE5, companion8.e());
                    d1.i0 i0Var3 = d1.i0.f39176a;
                    f3.m mVarH = androidx.compose.foundation.layout.d.h(companion6, f16, i26, singleCardConfig2);
                    w0 w0VarB = m3.b(iVar2.j(), companion7.l(), rVar2, 0);
                    int iHashCode6 = Long.hashCode(p076m2.m.b(rVar2, 0));
                    p076m2.e0 e0VarT6 = rVar2.t();
                    f3.m mVarE6 = f3.j.e(rVar2, mVarH);
                    er.a<androidx.compose.ui.node.c> aVarB6 = companion8.b();
                    if (rVar2.l() == null) {
                        p076m2.m.d();
                    }
                    rVar2.K();
                    if (rVar2.getInserting()) {
                        rVar2.H(aVarB6);
                    } else {
                        rVar2.u();
                    }
                    p076m2.r rVarC6 = n6.c(rVar2);
                    n6.i(rVarC6, w0VarB, companion8.d());
                    n6.i(rVarC6, e0VarT6, companion8.f());
                    n6.i(rVarC6, Integer.valueOf(iHashCode6), companion8.c());
                    n6.g(rVarC6, companion8.a());
                    n6.i(rVarC6, mVarE6, companion8.e());
                    f3.m mVarC = p3.c(q3.f39261a, companion6, 1.0f, false, 2, null);
                    ChildDataScreenModel.InterfaceC3259a.Expanded expanded = (ChildDataScreenModel.InterfaceC3259a.Expanded) interfaceC3259a;
                    Label title = expanded.getTitle();
                    int i29 = expanded.getCloseSectionButtonData() == null ? i26 : 0;
                    if (i29 == i26) {
                        rVar2.X(-176052199);
                        textStyleJ = k70.a.f108864a.f(rVar2, k70.a.f108865b).i();
                        rVar2.R();
                    } else {
                        if (i29 != 0) {
                            rVar2.X(-176055149);
                            rVar2.R();
                            throw new oq.p();
                        }
                        rVar2.X(-176050056);
                        textStyleJ = k70.a.f108864a.f(rVar2, k70.a.f108865b).j();
                        rVar2.R();
                    }
                    TextStyle textStyle = textStyleJ;
                    k70.a aVar2 = k70.a.f108864a;
                    int i35 = k70.a.f108865b;
                    f15 = f16;
                    arrayList = arrayList2;
                    j70.h.g(mVarC, null, title, null, null, aVar2.a(rVar2, i35).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, null, null, false, false, null, rVar, 0, 0, 0, 33030106);
                    rVar2 = rVar;
                    if (expanded.getCloseSectionButtonData() == null) {
                        rVar2.X(-1162411304);
                    } else {
                        rVar2.X(-1162411303);
                        j30.f.e(null, expanded.getCloseSectionButtonData(), false, rVar2, ButtonTextData.f99099f << 3, 5);
                        oq.i0 i0Var4 = oq.i0.f148189a;
                    }
                    rVar2.R();
                    rVar2.x();
                    i16 = 0;
                    r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar2.b(rVar2, i35).getSpacing200()), rVar2, 0);
                    i17 = 1;
                    x30.c.c(null, 0.0f, y2.m.d(-998017235, true, new er.p() { // from class: k41.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return m.n(interfaceC3259a, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                    r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar2.b(rVar2, i35).getSpacing200()), rVar2, 0);
                    i18 = 2;
                    singleCardConfig = null;
                    n50.h0.v(expanded.getNationalitySingleCardData(), null, rVar2, 0, 2);
                    rVar2.x();
                    rVar2.R();
                }
                ArrayList arrayList3 = arrayList;
                arrayList3.add(oq.i0.f148189a);
                singleCardConfig2 = singleCardConfig;
                i26 = i17;
                i27 = i16;
                f16 = f15;
                i19 = i18;
                arrayList2 = arrayList3;
            }
            rVar2.R();
            rVar2.x();
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(ChildDataScreenModel.InterfaceC3259a interfaceC3259a, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-998017235, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.childdata.ChildDataContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildDataScreen.kt:109)");
            }
            d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(fVarR, f3.c.INSTANCE.k(), rVar, 0);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            ChildDataScreenModel.InterfaceC3259a.Expanded expanded = (ChildDataScreenModel.InterfaceC3259a.Expanded) interfaceC3259a;
            v50.c nameInputData = expanded.getNameInputData();
            int i16 = v50.c.f203957t;
            v0.g(nameInputData, null, rVar, i16, 2);
            v0.g(expanded.getSecondNameInputData(), null, rVar, i16, 2);
            v0.g(expanded.getSurnameInputData(), null, rVar, i16, 2);
            v40.i.h(expanded.getBirthDateInputData(), rVar, InputDateTimeData.f203769m);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(d.Data data) {
        data.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(d.Data data, int i15, p076m2.r rVar, int i16) {
        i(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-220723676);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-220723676, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.childdata.ChildDataScreen (ChildDataScreen.kt:39)");
            }
            i(r(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: k41.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data r(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(d dVar, int i15, p076m2.r rVar, int i16) {
        q(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
