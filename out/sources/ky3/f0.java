package ky3;

import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.Iterator;
import ly3.OneClickPaymentBottomSheetData;
import mx.Label;
import n3.a2;
import n3.z1;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lky3/j;", "viewModel", "Loq/i0;", "w", "(Lky3/j;Lm2/r;I)V", "Lky3/j$a;", "screenData", "z", "(Lky3/j$a;Lm2/r;I)V", "Lky3/j$a$a;", "m", "(Lky3/j$a$a;Lm2/r;I)V", "t", "Lky3/j$a$b;", "B", "(Lky3/j$a$b;Lm2/r;I)V", "Lly3/a;", "data", "r", "(Lly3/a;Lm2/r;I)V", "makepayment_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(j.a aVar, int i15, p076m2.r rVar, int i16) {
        z(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void B(final j.a.Confirmation confirmation, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(252828213);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(confirmation) : rVarH.G(confirmation) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(252828213, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.PaymentConfirmationScreen (OneClickPaymentScreen.kt:182)");
            }
            rVar2 = rVarH;
            i50.s.r(confirmation.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2146114206, true, new er.q() { // from class: ky3.b0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f0.C(confirmation, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ky3.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.E(confirmation, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(j.a.Confirmation confirmation, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2146114206, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.PaymentConfirmationScreen.<anonymous> (OneClickPaymentScreen.kt:184)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(t70.i.S(a3.l(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), null, rVar, 0, 1), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
                objE = new er.l() { // from class: ky3.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f0.D(f6VarC, (a2) obj);
                    }
                };
                rVar.v(objE);
            }
            w0.i1.c(l4.c.c(px3.a.f163115e, rVar, 0), null, z1.c(mVarI, (er.l) objE), null, null, 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
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
    public static final oq.i0 D(f6 f6Var, a2 a2Var) {
        a2Var.C(((Number) f6Var.getValue()).floatValue());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(j.a.Confirmation confirmation, int i15, p076m2.r rVar, int i16) {
        B(confirmation, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final j.a.Aliases aliases, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1496746154);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aliases) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1496746154, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentAliasesDisplayed (OneClickPaymentScreen.kt:75)");
            }
            g30.t.f(aliases.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-190819087, true, new er.p() { // from class: ky3.d0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.n(aliases, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(571062224, true, new er.p() { // from class: ky3.e0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.o(aliases, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            boolean zG = rVarH.G(aliases);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ky3.u
                    @Override // er.a
                    public final Object a() {
                        return f0.p(aliases);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ky3.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.q(aliases, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(j.a.Aliases aliases, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-190819087, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentAliasesDisplayed.<anonymous> (OneClickPaymentScreen.kt:78)");
            }
            r(aliases.getBottomSheetContentData(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(j.a.Aliases aliases, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(571062224, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentAliasesDisplayed.<anonymous> (OneClickPaymentScreen.kt:79)");
            }
            t(aliases, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(j.a.Aliases aliases) {
        aliases.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(j.a.Aliases aliases, int i15, p076m2.r rVar, int i16) {
        m(aliases, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final OneClickPaymentBottomSheetData oneClickPaymentBottomSheetData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-717121675);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(oneClickPaymentBottomSheetData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-717121675, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentBottomSheet (OneClickPaymentScreen.kt:228)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, oneClickPaymentBottomSheetData.getWhyCanYouPayWithoutBlikTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, oneClickPaymentBottomSheetData.getWhyCanYouPayWithoutBlikDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, oneClickPaymentBottomSheetData.getHowToTurnOffPaymentsWithoutBlikTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, oneClickPaymentBottomSheetData.getHowToTurnOffPaymentsWithoutBlikDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ky3.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.s(oneClickPaymentBottomSheetData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(OneClickPaymentBottomSheetData oneClickPaymentBottomSheetData, int i15, p076m2.r rVar, int i16) {
        r(oneClickPaymentBottomSheetData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(final j.a.Aliases aliases, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1127120918);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aliases) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1127120918, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentInnerContent (OneClickPaymentScreen.kt:87)");
            }
            rVar2 = rVarH;
            i50.s.r(aliases.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1920136227, true, new er.q() { // from class: ky3.x
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f0.u(aliases, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ky3.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.v(aliases, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(j.a.Aliases aliases, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1920136227, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentInnerContent.<anonymous> (OneClickPaymentScreen.kt:89)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarL = a3.l(a3.q(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200()), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            f3.m mVarR = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing200(), 7, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.g(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
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
            if (aliases.getOneClickPaymentAlertInfoData() == null) {
                rVar.X(-1634023435);
            } else {
                rVar.X(-1634023434);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing150()), rVar, 0);
                c30.e.c(null, aliases.getOneClickPaymentAlertInfoData(), rVar, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                oq.i0 i0Var = oq.i0.f148189a;
            }
            rVar.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            w0.i1.c(l4.c.c(px3.a.f163111a, rVar, 0), null, androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(companion, c5.h.n(142)), c5.h.n(68)), null, p036e4.l.INSTANCE.b(), 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 25008, 104);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing500()), rVar, 0);
            Label screenDescriptionHeader = aliases.getScreenDescriptionHeader();
            TextStyle textStyleI = aVar.f(rVar, i17).i();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            j70.h.g(null, null, screenDescriptionHeader, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleI, null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, aliases.getScreenDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing500()), rVar, 0);
            rVar.X(1471357038);
            Iterator<T> it = aliases.a().iterator();
            while (it.hasNext()) {
                n50.h0.v((DefaultSingleCardData) it.next(), null, rVar, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            }
            rVar.R();
            rVar.x();
            f3.m.Companion companion5 = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.C(companion5, null, false, 3, null), 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarR2 = a3.r(mVarH, 0.0f, aVar2.b(rVar, i18).getSpacing250(), 0.0f, 0.0f, 13, null);
            p036e4.w0 w0VarA3 = d1.e0.a(d1.i.f39152a.d(), f3.c.INSTANCE.k(), rVar, 6);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarR2);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB3 = companion6.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarA3, companion6.d());
            n6.i(rVarC3, e0VarT3, companion6.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion6.c());
            n6.g(rVarC3, companion6.a());
            n6.i(rVarC3, mVarE3, companion6.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(aliases.getPayWithOneClickButtonTitle(), null, 2, null), k30.d.a.f107773a, null, aliases.h(), 35, null), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar2.b(rVar, i18).getSpacing100()), rVar, 0);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(aliases.getPayWithBlikButtonTitle(), null, 2, null), new k30.d.Secondary(null, 1, null), null, aliases.f(), 35, null), false, null, rVar, 0, 6);
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
    public static final oq.i0 v(j.a.Aliases aliases, int i15, p076m2.r rVar, int i16) {
        t(aliases, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void w(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(106819227);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(106819227, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentScreen (OneClickPaymentScreen.kt:58)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(jVar.getLifecycleConnector(), rVarH, 0);
            z(x(f6VarC), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ky3.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.y(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a x(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(j jVar, int i15, p076m2.r rVar, int i16) {
        w(jVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final j.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1932473282);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1932473282, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentScreenContent (OneClickPaymentScreen.kt:65)");
            }
            if (aVar instanceof j.a.Initial) {
                rVarH.X(-1680947313);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof j.a.Aliases) {
                rVarH.X(-1680945130);
                m((j.a.Aliases) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof j.a.Confirmation) {
                rVarH.X(-1680941584);
                B((j.a.Confirmation) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof j.a.Error)) {
                    rVarH.X(-1680949161);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1680937850);
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
            d5VarM.a(new er.p() { // from class: ky3.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.A(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
