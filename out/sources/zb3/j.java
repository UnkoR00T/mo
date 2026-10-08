package zb3;

import d1.a3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import er.l;
import er.p;
import f3.m;
import h30.ButtonData;
import h30.q;
import j30.ButtonTextData;
import java.util.Map;
import mx.Label;
import n4.v;
import n50.h0;
import n50.k;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p114t0.n;
import pq.v0;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lf3/m;", "modifier", "Lyb3/l$a$a$a;", "data", "", "Lga3/b;", "Lj1/a;", "requesterMap", "Loq/i0;", "r", "(Lf3/m;Lyb3/l$a$a$a;Ljava/util/Map;Lm2/r;II)V", "Lmx/a;", "header", "Lj30/a;", "buttonTextData", "o", "(Lf3/m;Lmx/a;Lj30/a;Lm2/r;II)V", "Lv40/a;", "inputDateTimeData", "inputRequester", "Ln50/k;", "singleCardData", "l", "(Lf3/m;Lv40/a;Lj1/a;Ln50/k;Lm2/r;II)V", "Lh30/a;", "buttonData", "j", "(Lf3/m;Lh30/a;Lm2/r;II)V", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    private static final void j(m mVar, final ButtonData buttonData, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final m mVar3;
        r rVarH = rVar.h(-1684806001);
        int i18 = i16 & 1;
        if (i18 != 0) {
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
            i17 |= rVarH.W(buttonData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar4 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-1684806001, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.components.AddNextButton (Stage.kt:135)");
            }
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            m mVarR = a3.r(mVar4, 0.0f, aVar.b(rVarH, i19).getSpacing300(), 0.0f, 0.0f, 13, null);
            mVar3 = mVar4;
            w0 w0VarB = m3.b(d1.i.f39152a.r(aVar.b(rVarH, i19).getSpacing200()), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            m.Companion companion2 = m.INSTANCE;
            vb.h(p3.c(q3Var, companion2, 1.0f, false, 2, null), aVar.b(rVarH, i19).getStrokeWidth(), aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVarH, 0, 0);
            q.p(buttonData, false, null, rVarH, (i17 >> 3) & 14, 6);
            vb.h(p3.c(q3Var, companion2, 1.0f, false, 2, null), aVar.b(rVarH, i19).getStrokeWidth(), aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVarH, 0, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: zb3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(mVar3, buttonData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(m mVar, ButtonData buttonData, int i15, int i16, r rVar, int i17) {
        j(mVar, buttonData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void l(m mVar, final InputDateTimeData inputDateTimeData, final j1.a aVar, final k kVar, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final m mVar3;
        r rVarH = rVar.h(-225452324);
        int i18 = i16 & 1;
        if (i18 != 0) {
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
            i17 |= (i15 & 64) == 0 ? rVarH.W(inputDateTimeData) : rVarH.G(inputDateTimeData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(kVar) ? 2048 : 1024;
        }
        int i19 = i17;
        if (rVarH.r((i19 & 1171) != 1170, i19 & 1)) {
            mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-225452324, i19, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.components.Content (Stage.kt:106)");
            }
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: zb3.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.m((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD = v.d(mVar3, false, (l) objE, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            m mVarR = a3.r(w0.i.d(k3.f.a(mVarD, aVar2.e(rVarH, i25).getRadius200()), aVar2.a(rVarH, i25).getSurface().a(), null, 2, null), 0.0f, aVar2.b(rVarH, i25).getSpacing200(), 0.0f, 0.0f, 13, null);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarR);
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
            d1.i0 i0Var = d1.i0.f39176a;
            m.Companion companion3 = m.INSTANCE;
            m mVarB = j1.e.b(a3.p(companion3, aVar2.b(rVarH, i25).getSpacing200(), 0.0f, 2, null), aVar);
            w0 w0VarI = d1.r.i(companion.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVarB);
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
            n6.i(rVarC2, w0VarI, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            x xVar = x.f39368a;
            v40.i.h(inputDateTimeData, rVarH, InputDateTimeData.f203769m | ((i19 >> 3) & 14));
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVarH, i25).getSpacing200()), rVarH, 0);
            vb.h(a3.p(companion3, aVar2.b(rVarH, i25).getSpacing200(), 0.0f, 2, null), aVar2.b(rVarH, i25).getStrokeWidth(), aVar2.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVarH, 0, 0);
            h0.v(kVar, null, rVarH, (i19 >> 9) & 14, 2);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: zb3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.n(mVar3, inputDateTimeData, aVar, kVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(m mVar, InputDateTimeData inputDateTimeData, j1.a aVar, k kVar, int i15, int i16, r rVar, int i17) {
        l(mVar, inputDateTimeData, aVar, kVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void o(m mVar, final Label label, final ButtonTextData buttonTextData, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final m mVar3;
        r rVarH = rVar.h(1475342919);
        int i18 = i16 & 1;
        if (i18 != 0) {
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
            i17 |= rVarH.W(label) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= (i15 & 512) == 0 ? rVarH.W(buttonTextData) : rVarH.G(buttonTextData) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(1475342919, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.components.Header (Stage.kt:85)");
            }
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVar3);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            j70.h.g(p3.c(q3Var, m.INSTANCE, 1.0f, false, 2, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVarH, k70.a.f108865b).j(), null, null, false, false, null, rVarH, (i17 << 3) & 896, 0, 0, 33030138);
            rVarH = rVarH;
            p114t0.k.f(q3Var, buttonTextData != null, null, null, null, null, y2.m.d(791689091, true, new er.q() { // from class: zb3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.p(buttonTextData, (p114t0.l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 1572870, 30);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: zb3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.q(mVar3, label, buttonTextData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(ButtonTextData buttonTextData, p114t0.l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(791689091, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.components.Header.<anonymous>.<anonymous> (Stage.kt:95)");
        }
        if (buttonTextData == null) {
            rVar.X(1544306711);
            rVar.R();
        } else {
            rVar.X(1544306712);
            j30.f.e(null, buttonTextData, false, rVar, ButtonTextData.f99099f << 3, 5);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(m mVar, Label label, ButtonTextData buttonTextData, int i15, int i16, r rVar, int i17) {
        o(mVar, label, buttonTextData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void r(m mVar, final yb3.l.a.Initialized.StageData stageData, final Map<ga3.b, ? extends j1.a> map, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final m mVar3;
        r rVarH = rVar.h(-2104278315);
        int i18 = i16 & 1;
        if (i18 != 0) {
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
            i17 |= rVarH.G(stageData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(map) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-2104278315, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.components.Stage (Stage.kt:41)");
            }
            m mVarB = n.b(mVar3, null, null, 3, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarB);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o(null, stageData.getHeader(), stageData.getRemoveButton(), rVarH, ButtonTextData.f99099f << 6, 1);
            l(a3.r(m.INSTANCE, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 0.0f, 0.0f, 13, null), stageData.getInput(), (j1.a) v0.j(map, ga3.b.DATE), stageData.getPlaceData().getCard(), rVarH, InputDateTimeData.f203769m << 3, 0);
            p114t0.k.e(i0Var, stageData.getPlaceData().getErrorLabel() != null, null, null, null, null, y2.m.d(-539381725, true, new er.q() { // from class: zb3.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.s(stageData, map, (p114t0.l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 1572870, 30);
            p114t0.k.e(i0Var, stageData.getHelperText() != null, null, null, null, null, y2.m.d(-1143433510, true, new er.q() { // from class: zb3.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.t(stageData, (p114t0.l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 1572870, 30);
            p114t0.k.e(i0Var, stageData.getAddNextButton() != null, null, null, null, null, y2.m.d(1455510427, true, new er.q() { // from class: zb3.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.u(stageData, (p114t0.l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 1572870, 30);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: zb3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.v(mVar3, stageData, map, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(yb3.l.a.Initialized.StageData stageData, Map map, p114t0.l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-539381725, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.components.Stage.<anonymous>.<anonymous> (Stage.kt:54)");
        }
        Label errorLabel = stageData.getPlaceData().getErrorLabel();
        if (errorLabel == null) {
            rVar.X(-1248271862);
            rVar.R();
        } else {
            rVar.X(-1248271861);
            m mVarB = j1.e.b(a3.r(m.INSTANCE, 0.0f, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100(), 0.0f, 0.0f, 13, null), (j1.a) v0.j(map, ga3.b.PLACE));
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, mVarB);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            l40.d.d(null, errorLabel, false, rVar, 0, 5);
            rVar.x();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(yb3.l.a.Initialized.StageData stageData, p114t0.l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1143433510, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.components.Stage.<anonymous>.<anonymous> (Stage.kt:65)");
        }
        Label helperText = stageData.getHelperText();
        if (helperText == null) {
            rVar.X(-642038508);
            rVar.R();
        } else {
            rVar.X(-642038507);
            m.Companion companion = m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing100(), 0.0f, 0.0f, 13, null), null, helperText, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(yb3.l.a.Initialized.StageData stageData, p114t0.l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1455510427, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.components.Stage.<anonymous>.<anonymous> (Stage.kt:75)");
        }
        ButtonData addNextButton = stageData.getAddNextButton();
        if (addNextButton == null) {
            rVar.X(-878660022);
        } else {
            rVar.X(-878660021);
            j(null, addNextButton, rVar, 0, 1);
        }
        rVar.R();
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(m mVar, yb3.l.a.Initialized.StageData stageData, Map map, int i15, int i16, r rVar, int i17) {
        r(mVar, stageData, map, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
