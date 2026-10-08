package zx3;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import n3.a2;
import n3.z1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.i1;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lzx3/j;", "viewModel", "Loq/i0;", "u", "(Lzx3/j;Lm2/r;I)V", "Lzx3/j$a;", "screenData", "x", "(Lzx3/j$a;Lm2/r;I)V", "Lzx3/j$a$a;", "k", "(Lzx3/j$a$a;Lm2/r;I)V", "Lzx3/j$a$b;", "q", "(Lzx3/j$a$b;Lm2/r;I)V", "state", "makepayment_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {
    public static final void k(final j.a.Blik blik, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(197089458);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(blik) : rVarH.G(blik) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(197089458, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.blik.PaymentBlikCodeScreen (PaymentBlikScreen.kt:74)");
            }
            rVar2 = rVarH;
            i50.s.r(blik.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(431869349, true, new er.q() { // from class: zx3.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.l(blik, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: zx3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.p(blik, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(final j.a.Blik blik, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(431869349, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.blik.PaymentBlikCodeScreen.<anonymous> (PaymentBlikScreen.kt:78)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(a3.l(w0.i.d(mVarB, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            f3.c.b bVarG = companion2.g();
            boolean zG = rVar.G(blik);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: zx3.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.m(blik, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarQ, null, null, false, null, bVarG, null, false, null, (er.l) objE, rVar, 196608, 478);
            f3.m mVarN = a3.n(w0.i.d(companion, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200());
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarN);
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
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            h30.q.p(blik.getPayButtonData(), false, null, rVar, 0, 6);
            rVar.x();
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
    public static final oq.i0 m(final j.a.Blik blik, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(-1256468742, true, new er.q() { // from class: zx3.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return u.n(blik, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(final j.a.Blik blik, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1256468742, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.blik.PaymentBlikCodeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentBlikScreen.kt:94)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            i1.c(l4.c.c(px3.a.f163111a, rVar, 0), null, androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(companion, c5.h.n(142)), c5.h.n(68)), null, p036e4.l.INSTANCE.b(), 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 25008, 104);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing500()), rVar, 0);
            j70.h.g(null, null, blik.getScreenDescription(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing400()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(-1644115911, true, new er.p() { // from class: zx3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.o(blik, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(j.a.Blik blik, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1644115911, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.blik.PaymentBlikCodeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentBlikScreen.kt:113)");
            }
            u50.v0.g(blik.getBlikTextInputData(), null, rVar, v50.c.f203957t, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(j.a.Blik blik, int i15, p076m2.r rVar, int i16) {
        k(blik, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final j.a.Confirmation confirmation, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1600387827);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(confirmation) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1600387827, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.blik.PaymentBlikConfirmationScreen (PaymentBlikScreen.kt:133)");
            }
            rVar2 = rVarH;
            i50.s.r(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), confirmation.b()), Label.INSTANCE.c(), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(993536486, true, new er.q() { // from class: zx3.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.r(confirmation, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: zx3.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.t(confirmation, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(j.a.Confirmation confirmation, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(993536486, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.blik.PaymentBlikConfirmationScreen.<anonymous> (PaymentBlikScreen.kt:145)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(mVarS, aVar.b(rVar, i17).getSpacing200());
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
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
            final f6<Float> f6VarC = u0.x0.c(u0.x0.g("rockingTransition", rVar, 6, 0), -5.0f, 5.0f, u0.m.e(u0.m.l(1000, 0, u0.i0.e(), 2, null), u0.i1.Reverse, 0L, 4, null), "transitionAngle", rVar, u0.s0.f193856f | 24960 | (u0.q0.f193832d << 9), 0);
            f3.m mVarI = androidx.compose.foundation.layout.d.i(companion, c5.h.n(223));
            boolean zW = rVar.W(f6VarC);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: zx3.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.s(f6VarC, (a2) obj);
                    }
                };
                rVar.v(objE);
            }
            i1.c(l4.c.c(px3.a.f163115e, rVar, 0), null, z1.c(mVarI, (er.l) objE), null, null, 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, confirmation.getScreenTitleText(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33026043);
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
    public static final oq.i0 s(f6 f6Var, a2 a2Var) {
        a2Var.C(((Number) f6Var.getValue()).floatValue());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(j.a.Confirmation confirmation, int i15, p076m2.r rVar, int i16) {
        q(confirmation, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(349814407);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(349814407, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.blik.PaymentBlikScreen (PaymentBlikScreen.kt:54)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(jVar.getLifecycleConnector(), rVarH, 0);
            x(v(f6VarC), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zx3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.w(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a v(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(j jVar, int i15, p076m2.r rVar, int i16) {
        u(jVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final j.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(842431428);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(842431428, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.blik.PaymentBlikScreenContent (PaymentBlikScreen.kt:64)");
            }
            if (fr.t.c(aVar, j.a.c.f238452a)) {
                rVarH.X(2122754965);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof j.a.Blik) {
                rVarH.X(2122756850);
                k((j.a.Blik) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof j.a.Confirmation) {
                rVarH.X(2122759898);
                q((j.a.Confirmation) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof j.a.Error)) {
                    rVarH.X(2122753429);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2122763564);
                ((j.a.Error) aVar).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zx3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.y(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(j.a aVar, int i15, p076m2.r rVar, int i16) {
        x(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
