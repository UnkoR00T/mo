package bx1;

import cx1.NfcScreenModel;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import er.q;
import f3.j;
import f3.m;
import i50.BaseScaffoldData;
import i50.s;
import jd.n;
import lw1.i0;
import mx.Label;
import n4.f0;
import n4.v;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.l;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import q4.TextStyle;
import w0.i1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0004\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lcx1/a;", "data", "Loq/i0;", "k", "(Lcx1/a;Lm2/r;I)V", "", "areAnimationsEnabled", "i", "(ZLm2/r;I)V", "p", "Lc5/h;", "a", "F", "ANIMATION_WIDTH", "b", "ANIMATION_HEIGHT", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f21920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f21921b;

    static {
        float f15 = 226;
        f21920a = c5.h.n(f15);
        f21921b = c5.h.n(f15);
    }

    private static final void i(final boolean z15, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-307001749);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-307001749, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.nfc.Image (NfcScreen.kt:93)");
            }
            if (z15) {
                rVarH.X(-1903633809);
                jd.e.b(jd.r.q(n.e.a(n.e.b(i0.f120692a)), null, null, null, null, null, rVarH, 0, 62).getValue(), androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(m.INSTANCE, f21920a), f21921b), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, l.INSTANCE.d(), false, false, null, false, null, rVarH, 1572912, 1572864, 0, 4128700);
                rVarH = rVarH;
                rVarH.R();
            } else {
                if (z15) {
                    rVarH.X(1324064727);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(-1903265808);
                i1.c(l4.c.c(c20.b.E, rVarH, 0), null, androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(m.INSTANCE, f21920a), f21921b), null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 432, 120);
                rVarH = rVarH;
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bx1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(boolean z15, int i15, r rVar, int i16) {
        i(z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final NfcScreenModel nfcScreenModel, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-2072735114);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nfcScreenModel) : rVarH.G(nfcScreenModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-2072735114, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.nfc.NfcInfoScreenContent (NfcScreen.kt:43)");
            }
            rVar2 = rVarH;
            s.r(nfcScreenModel.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1926614237, true, new q() { // from class: bx1.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.l(nfcScreenModel, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bx1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(nfcScreenModel, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(final NfcScreenModel nfcScreenModel, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1926614237, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.nfc.NfcInfoScreenContent.<anonymous> (NfcScreen.kt:45)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarL = a3.l(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarL);
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
            f3.c.b bVarG = companion2.g();
            m mVarB = h0.b(i0Var, a3.p(t70.i.S(companion, null, rVar, 6, 1), aVar.b(rVar, i17).getSpacing500(), 0.0f, 2, null), 1.0f, false, 2, null);
            Object objE = rVar.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE == companion4.a()) {
                objE = new er.l() { // from class: bx1.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.m((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarD = v.d(mVarB, false, (er.l) objE, 1, null);
            w0 w0VarA2 = e0.a(iVar.k(), bVarG, rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            m mVarE2 = j.e(rVar, mVarD);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing500()), rVar, 0);
            i(nfcScreenModel.getAreAnimationsEnabled(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            Label title = nfcScreenModel.getTitle();
            Label title2 = nfcScreenModel.getTitle();
            TextStyle textStyleI = aVar.f(rVar, i17).i();
            b5.j.Companion companion5 = b5.j.INSTANCE;
            j70.h.g(null, null, title, title2, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion5.a()), 0L, 0, false, 0, 0, null, textStyleI, null, Float.valueOf(0.0f), true, false, null, rVar, 0, 0, 432, 26734579);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, nfcScreenModel.getDescription(), nfcScreenModel.getDescription(), null, aVar.a(rVar, i17).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion5.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, Float.valueOf(1.0f), true, false, null, rVar, 0, 0, 432, 26734547);
            rVar.x();
            rVar.x();
            boolean zG = rVar.G(nfcScreenModel);
            Object objE2 = rVar.E();
            if (zG || objE2 == companion4.a()) {
                objE2 = new er.a() { // from class: bx1.f
                    @Override // er.a
                    public final Object a() {
                        return i.n(nfcScreenModel);
                    }
                };
                rVar.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVar, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        f0.I0(i0Var, -1.0f);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(NfcScreenModel nfcScreenModel) {
        nfcScreenModel.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(NfcScreenModel nfcScreenModel, int i15, r rVar, int i16) {
        k(nfcScreenModel, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final NfcScreenModel nfcScreenModel, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1146563847);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nfcScreenModel) : rVarH.G(nfcScreenModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1146563847, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.nfc.NfcScanningScreenContent (NfcScreen.kt:119)");
            }
            rVar2 = rVarH;
            s.r(nfcScreenModel.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(974411046, true, new q() { // from class: bx1.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.q(nfcScreenModel, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bx1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.s(nfcScreenModel, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(final NfcScreenModel nfcScreenModel, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(974411046, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.nfc.NfcScanningScreenContent.<anonymous> (NfcScreen.kt:121)");
            }
            f3.c.b bVarG = f3.c.INSTANCE.g();
            m.Companion companion = m.INSTANCE;
            m mVarS = t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarP = a3.p(mVarS, aVar.b(rVar, i17).getSpacing500(), 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), bVarG, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarP);
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
            x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            Label title = nfcScreenModel.getTitle();
            Label title2 = nfcScreenModel.getTitle();
            TextStyle textStyleI = aVar.f(rVar, i17).i();
            b5.j.Companion companion3 = b5.j.INSTANCE;
            j70.h.g(null, null, title, title2, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, textStyleI, null, Float.valueOf(-1.0f), true, false, null, rVar, 0, 0, MLKEMEngine.KyberPolyBytes, 26734579);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, nfcScreenModel.getDescription(), nfcScreenModel.getDescription(), null, aVar.a(rVar, i17).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, true, false, null, rVar, 0, 0, MLKEMEngine.KyberPolyBytes, 28831699);
            r rVar2 = rVar;
            if (nfcScreenModel.getProgress() == null) {
                rVar2.X(-642932093);
            } else {
                rVar2.X(-642932092);
                j70.h.g(null, null, nfcScreenModel.getProgress(), null, null, aVar.a(rVar2, i17).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
                rVar2 = rVar;
            }
            rVar2.R();
            rVar2.x();
            boolean zG = rVar2.G(nfcScreenModel);
            Object objE = rVar2.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: bx1.g
                    @Override // er.a
                    public final Object a() {
                        return i.r(nfcScreenModel);
                    }
                };
                rVar2.v(objE);
            }
            q0.g(false, (er.a) objE, rVar2, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(NfcScreenModel nfcScreenModel) {
        nfcScreenModel.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(NfcScreenModel nfcScreenModel, int i15, r rVar, int i16) {
        p(nfcScreenModel, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
