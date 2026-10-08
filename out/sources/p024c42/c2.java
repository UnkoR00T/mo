package p024c42;

import a62.SetupData;
import cb4.DialogData;
import d42.PaymentCardsSetupData;
import d42.o0;
import e62.PaymentsYourCardsSetupData;
import er.l;
import er.q;
import f00.f0;
import f00.s;
import fr.q0;
import hb4.b;
import i42.a0;
import l42.PaymentsDeleteCardsSetupData;
import mu.g;
import n42.PaymentsDetailsSetupData;
import n42.r0;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p42.n;
import qx3.MakePaymentInitialData;
import qx3.c;
import r42.PaymentsInstallmentsSetupData;
import r42.a;
import u42.MakePaymentsNavParams;
import u42.PaymentResultDestinationData;
import v42.PaymentsReminderSetupData;
import y2.m;
import y42.PaymentResultSetupData;
import y42.v;
import z52.PaymentsTransactionDetailsSetupData;
import zx.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\f\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf42/a;", "colorScheme", "Lkotlin/Function1;", "Lf00/s;", "Loq/i0;", "navGraphReady", "Lc42/e3;", "paymentsEntryPointData", "Lkotlin/Function0;", "navResult", "f0", "(Lf42/a;Ler/l;Lc42/e3;Ler/a;Lm2/r;I)V", "i0", "(Ler/l;Lc42/e3;Ler/a;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(s sVar, DialogData dialogData) {
        s.l(sVar, m2.f23246a, dialogData, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C0(s sVar, MakePaymentInitialData makePaymentInitialData) {
        sVar.j(e2.f23165a, makePaymentInitialData, x2.f23353a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D0(s sVar) {
        j2 j2Var = j2.f23221a;
        sVar.k(j2Var, j2Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(804601378, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:534)");
        }
        f2 f2Var = f2.f23177a;
        f00.r.r(wVar, f2Var, sVar.g(f2Var), m.d(1525237921, true, new q() { // from class: c42.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.F0(sVar, (b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F0(final s sVar, b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1525237921, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:538)");
        }
        xw.b<b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.t1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.G0(sVar, (b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G0(s sVar, b.a aVar) {
        if (!fr.t.c(aVar, b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2022880995, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:548)");
        }
        m2 m2Var = m2.f23246a;
        f00.r.r(wVar, m2Var, sVar.g(m2Var), m.d(-198150408, true, new q() { // from class: c42.f1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.I0(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I0(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-198150408, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:554)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.v1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.J0(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J0(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1053806684, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:564)");
        }
        e2 e2Var = e2.f23165a;
        final MakePaymentInitialData makePaymentInitialData = (MakePaymentInitialData) sVar.g(e2Var);
        f00.r.r(wVar, e2Var, makePaymentInitialData, m.d(1360413843, true, new q() { // from class: c42.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.L0(makePaymentInitialData, sVar, (c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L0(final MakePaymentInitialData makePaymentInitialData, final s sVar, c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1360413843, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:569)");
        }
        xw.b<c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(makePaymentInitialData) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.w1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.M0(makePaymentInitialData, sVar, (c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M0(MakePaymentInitialData makePaymentInitialData, s sVar, c.a aVar) {
        if (fr.t.c(aVar, c.a.C4279a.f169322a)) {
            Object data = makePaymentInitialData != null ? makePaymentInitialData.getData() : null;
            MakePaymentsNavParams makePaymentsNavParams = data instanceof MakePaymentsNavParams ? (MakePaymentsNavParams) data : null;
            if ((makePaymentsNavParams != null ? makePaymentsNavParams.getEntryPointData() : null) instanceof e3.c) {
                j2 j2Var = j2.f23221a;
                sVar.k(j2Var, j2Var);
            } else {
                sVar.c();
            }
        } else if (fr.t.c(aVar, c.a.b.f169323a)) {
            Object data2 = makePaymentInitialData != null ? makePaymentInitialData.getData() : null;
            MakePaymentsNavParams makePaymentsNavParams2 = data2 instanceof MakePaymentsNavParams ? (MakePaymentsNavParams) data2 : null;
            if ((makePaymentsNavParams2 != null ? makePaymentsNavParams2.getEntryPointData() : null) instanceof e3.Details) {
                sVar.c();
            } else {
                j2 j2Var2 = j2.f23221a;
                sVar.k(j2Var2, j2Var2);
            }
        } else {
            if (!(aVar instanceof c.a.ProcessCompleted)) {
                throw new p();
            }
            Object data3 = makePaymentInitialData != null ? makePaymentInitialData.getData() : null;
            MakePaymentsNavParams makePaymentsNavParams3 = data3 instanceof MakePaymentsNavParams ? (MakePaymentsNavParams) data3 : null;
            if ((makePaymentsNavParams3 != null ? makePaymentsNavParams3.getEntryPointData() : null) instanceof e3.Details) {
                l2 l2Var = l2.f23238a;
                sVar.j(l2Var, new PaymentsDetailsSetupData(new PaymentResultDestinationData(makePaymentInitialData.getSourcePaymentId(), true)), l2Var);
            } else {
                j2 j2Var3 = j2.f23221a;
                sVar.k(j2Var3, j2Var3);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(291466975, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:170)");
        }
        f00.r.o(wVar, q0.c(r42.t.class), sVar.g(g2.f23187a), m.d(2087642384, true, new q() { // from class: c42.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.O0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2087642384, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:174)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.s1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.P0(sVar, (a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P0(s sVar, a.e eVar) {
        if (fr.t.c(eVar, a.e.C4364a.f171680a)) {
            sVar.c();
        } else if (eVar instanceof a.e.ToError) {
            s.l(sVar, f2.f23177a, ((a.e.ToError) eVar).getErrorData(), null, 4, null);
        } else {
            if (!(eVar instanceof a.e.ToPaymentReminderSummary)) {
                throw new p();
            }
            s.l(sVar, p2.f23281a, new PaymentsReminderSetupData(((a.e.ToPaymentReminderSummary) eVar).getPaymentReminderSummaryDestinationParams()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1509746592, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:197)");
        }
        f00.r.o(wVar, q0.c(v42.s.class), sVar.g(p2.f23281a), m.d(-989045295, true, new q() { // from class: c42.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.R0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-989045295, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:201)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.S0(sVar, (v42.a.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S0(s sVar, v42.a.d dVar) {
        if (fr.t.c(dVar, v42.a.d.C5309a.f203853a)) {
            sVar.c();
        } else if (dVar instanceof v42.a.d.Error) {
            s.l(sVar, f2.f23177a, ((v42.a.d.Error) dVar).getErrorData(), null, 4, null);
        } else {
            if (!(dVar instanceof v42.a.d.ToMakePayment)) {
                throw new p();
            }
            s.l(sVar, e2.f23165a, ((v42.a.d.ToMakePayment) dVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1566941087, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:221)");
        }
        f00.r.o(wVar, q0.c(o0.class), sVar.g(i2.f23211a), m.d(229234322, true, new q() { // from class: c42.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.U0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(229234322, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:227)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.r1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.V0(sVar, (d42.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V0(s sVar, d42.a.f fVar) {
        if (fr.t.c(fVar, d42.a.f.C0867a.f39739a)) {
            sVar.c();
        } else if (fVar instanceof d42.a.f.ToDeleteCards) {
            s.l(sVar, k2.f23229a, new PaymentsDeleteCardsSetupData(((d42.a.f.ToDeleteCards) fVar).getDeleteCardsRequiredData()), null, 4, null);
        } else {
            if (!(fVar instanceof d42.a.f.GoToResult)) {
                throw new p();
            }
            s.l(sVar, h2.f23197a, new PaymentResultSetupData(((d42.a.f.GoToResult) fVar).getPaymentResultState()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-348661470, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:252)");
        }
        f00.r.o(wVar, q0.c(e62.s.class), sVar.g(q2.f23289a), m.d(1447513939, true, new q() { // from class: c42.l0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.X0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.x(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1447513939, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:258)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.g1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.Y0(sVar, (e62.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y0(s sVar, e62.a.f fVar) {
        if (fr.t.c(fVar, e62.a.f.C1102a.f47734a)) {
            sVar.c();
        } else if (fr.t.c(fVar, e62.a.f.c.f47736a)) {
            s.m(sVar, d2.f23151a, null, 2, null);
        } else if (fVar instanceof e62.a.f.Error) {
            s.l(sVar, f2.f23177a, ((e62.a.f.Error) fVar).getErrorData(), null, 4, null);
        } else {
            if (!(fVar instanceof e62.a.f.ToDeleteCards)) {
                throw new p();
            }
            s.l(sVar, k2.f23229a, new PaymentsDeleteCardsSetupData(((e62.a.f.ToDeleteCards) fVar).getDeleteCardsRequiredData()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(869618147, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:284)");
        }
        f00.r.o(wVar, q0.c(l42.s.class), sVar.g(k2.f23229a), m.d(-1629173740, true, new q() { // from class: c42.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.a1(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a1(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1629173740, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:290)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.u1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.b1(sVar, (l42.a.g) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b1(s sVar, l42.a.g gVar) {
        if (fr.t.c(gVar, l42.a.g.C2797a.f115874a)) {
            sVar.c();
        } else if (gVar instanceof l42.a.g.Error) {
            s.l(sVar, f2.f23177a, ((l42.a.g.Error) gVar).getErrorData(), null, 4, null);
        } else if (gVar instanceof l42.a.g.YourCards) {
            q2 q2Var = q2.f23289a;
            sVar.j(q2Var, new PaymentsYourCardsSetupData(((l42.a.g.YourCards) gVar).getReturnResult()), q2Var);
        } else {
            if (!(gVar instanceof l42.a.g.PaymentCards)) {
                throw new p();
            }
            i2 i2Var = i2.f23211a;
            sVar.j(i2Var, new PaymentCardsSetupData(((l42.a.g.PaymentCards) gVar).getPaymentCardsNavParams()), i2Var);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c1(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2087897764, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:321)");
        }
        f00.r.n(wVar, q0.c(f62.r.class), m.d(-1831684426, true, new q() { // from class: c42.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.d1(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.o(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d1(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1831684426, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:324)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.k1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.e1(sVar, (f62.c.InterfaceC1334c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e1(s sVar, f62.c.InterfaceC1334c interfaceC1334c) {
        if (fr.t.c(interfaceC1334c, f62.c.InterfaceC1334c.a.f59422a)) {
            sVar.c();
        } else if (interfaceC1334c instanceof f62.c.InterfaceC1334c.GoToYourCards) {
            s.l(sVar, q2.f23289a, new PaymentsYourCardsSetupData(((f62.c.InterfaceC1334c.GoToYourCards) interfaceC1334c).getAddCardReturnResult()), null, 4, null);
        } else {
            if (!(interfaceC1334c instanceof f62.c.InterfaceC1334c.Error)) {
                throw new p();
            }
            s.l(sVar, f2.f23177a, ((f62.c.InterfaceC1334c.Error) interfaceC1334c).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    public static final void f0(final f42.a aVar, final l<? super s, i0> lVar, final e3 e3Var, final er.a<i0> aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-805973735);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(e3Var) : rVarH.G(e3Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar2) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(-805973735, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavContent (EpaymentsNavContent.kt:67)");
            }
            d0.c(f42.c.c().d(aVar), m.d(1283490905, true, new er.p() { // from class: c42.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c2.g0(lVar, e3Var, aVar2, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c42.i0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c2.h0(aVar, lVar, e3Var, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f1(final s sVar, final e3 e3Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-988789915, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:346)");
        }
        f00.r.o(wVar, q0.c(v.class), sVar.g(h2.f23197a), m.d(807385494, true, new q() { // from class: c42.x0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.g1(sVar, e3Var, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(l lVar, e3 e3Var, er.a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1283490905, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavContent.<anonymous> (EpaymentsNavContent.kt:71)");
            }
            i0(lVar, e3Var, aVar, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g1(final s sVar, final e3 e3Var, final er.a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(807385494, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:352)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(e3Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.h1(sVar, e3Var, aVar, (y42.d.h) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(f42.a aVar, l lVar, e3 e3Var, er.a aVar2, int i15, r rVar, int i16) {
        f0(aVar, lVar, e3Var, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h1(s sVar, e3 e3Var, er.a aVar, y42.d.h hVar) {
        if (hVar instanceof y42.d.h.GoToDetailsAndRefresh) {
            l2 l2Var = l2.f23238a;
            sVar.j(l2Var, new PaymentsDetailsSetupData(new PaymentResultDestinationData(((y42.d.h.GoToDetailsAndRefresh) hVar).getPaymentId(), true)), l2Var);
        } else if (hVar instanceof y42.d.h.HandleGenericError) {
            s.l(sVar, f2.f23177a, ((y42.d.h.HandleGenericError) hVar).getErrorData(), null, 4, null);
        } else {
            if (!fr.t.c(hVar, y42.d.h.a.f224044a)) {
                throw new p();
            }
            if (e3Var instanceof e3.Details) {
                aVar.a();
            } else {
                j2 j2Var = j2.f23221a;
                sVar.k(j2Var, j2Var);
            }
        }
        return i0.f148189a;
    }

    private static final void i0(final l<? super s, i0> lVar, final e3 e3Var, final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1546127112);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(e3Var) : rVarH.G(e3Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(1546127112, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph (EpaymentsNavContent.kt:84)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            n2 n2Var = n2.f23268a;
            boolean zG = ((i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(e3Var))) | rVarH.G(sVarJ) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: c42.t0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c2.j0(e3Var, sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, n2Var, (l) objE, rVarH, s.f54562e | 48);
            lVar.b(sVarJ);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c42.e1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c2.l1(lVar, e3Var, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i1(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(229489702, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:385)");
        }
        f00.r.o(wVar, q0.c(a62.s.class), sVar.g(d3.f23153a), m.d(2025665111, true, new q() { // from class: c42.d1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.j1(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.z(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(final e3 e3Var, final s sVar, final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, n2.f23268a, null, m.b(1094152679, true, new er.r() { // from class: c42.p1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.k0(e3Var, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l2.f23238a, null, m.b(-926812642, true, new er.r() { // from class: c42.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.n0(sVar, e3Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g2.f23187a, null, m.b(291466975, true, new er.r() { // from class: c42.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.N0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p2.f23281a, null, m.b(1509746592, true, new er.r() { // from class: c42.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.Q0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i2.f23211a, null, m.b(-1566941087, true, new er.r() { // from class: c42.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.T0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q2.f23289a, null, m.b(-348661470, true, new er.r() { // from class: c42.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.W0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k2.f23229a, null, m.b(869618147, true, new er.r() { // from class: c42.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.Z0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d2.f23151a, null, m.b(2087897764, true, new er.r() { // from class: c42.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.c1(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h2.f23197a, null, m.b(-988789915, true, new er.r() { // from class: c42.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.f1(sVar, e3Var, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d3.f23153a, null, m.b(229489702, true, new er.r() { // from class: c42.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.i1(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c3.f23145a, null, m.b(226450206, true, new er.r() { // from class: c42.x1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.q0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j2.f23221a, null, m.b(1444729823, true, new er.r() { // from class: c42.y1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.t0(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o2.f23275a, null, m.b(-1631957856, true, new er.r() { // from class: c42.z1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.w0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x2.f23353a, null, m.b(-413678239, true, new er.r() { // from class: c42.a2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.z0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f2.f23177a, null, m.b(804601378, true, new er.r() { // from class: c42.b2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.E0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m2.f23246a, null, m.b(2022880995, true, new er.r() { // from class: c42.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.H0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e2.f23165a, null, m.b(-1053806684, true, new er.r() { // from class: c42.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c2.K0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j1(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2025665111, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:391)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.o1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.k1(sVar, (a62.c.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(e3 e3Var, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1094152679, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:91)");
        }
        f00.r.o(wVar, q0.c(o42.f.class), e3Var, m.d(291553368, true, new q() { // from class: c42.w0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.l0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k1(s sVar, a62.c.d dVar) {
        if (fr.t.c(dVar, a62.c.d.a.f3875a)) {
            sVar.c();
        } else if (dVar instanceof a62.c.d.Error) {
            s.l(sVar, f2.f23177a, ((a62.c.d.Error) dVar).getErrorData(), null, 4, null);
        } else {
            if (!(dVar instanceof a62.c.d.ToTransactionDetails)) {
                throw new p();
            }
            s.l(sVar, c3.f23145a, new PaymentsTransactionDetailsSetupData(((a62.c.d.ToTransactionDetails) dVar).getTransactionDetailsNavParams()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(291553368, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:95)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.m1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.m0(sVar, (o42.a.InterfaceC3518a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l1(l lVar, e3 e3Var, er.a aVar, int i15, r rVar, int i16) {
        i0(lVar, e3Var, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(s sVar, o42.a.InterfaceC3518a interfaceC3518a) {
        if (interfaceC3518a instanceof o42.a.InterfaceC3518a.ToPaymentDetails) {
            sVar.j(l2.f23238a, new PaymentsDetailsSetupData(((o42.a.InterfaceC3518a.ToPaymentDetails) interfaceC3518a).getPaymentResultDestinationData()), n2.f23268a);
        } else {
            if (!fr.t.c(interfaceC3518a, o42.a.InterfaceC3518a.b.f142332a)) {
                throw new p();
            }
            sVar.k(j2.f23221a, n2.f23268a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, final e3 e3Var, final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-926812642, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:117)");
        }
        f00.r.o(wVar, q0.c(r0.class), sVar.g(l2.f23238a), m.d(869362767, true, new q() { // from class: c42.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.o0(e3Var, aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.w(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o0(final e3 e3Var, final er.a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(869362767, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:121)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(e3Var) | rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.p0(e3Var, aVar, sVar, (n42.a.l) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(e3 e3Var, er.a aVar, s sVar, n42.a.l lVar) {
        if (lVar instanceof n42.a.l.b) {
            if (e3Var instanceof e3.Details) {
                aVar.a();
            } else {
                j2 j2Var = j2.f23221a;
                sVar.k(j2Var, j2Var);
            }
        } else if (lVar instanceof n42.a.l.GoToInstallmentsPayment) {
            s.l(sVar, g2.f23187a, new PaymentsInstallmentsSetupData(((n42.a.l.GoToInstallmentsPayment) lVar).getInstallmentsPaymentData()), null, 4, null);
        } else if (lVar instanceof n42.a.l.ToPaymentReminderSummary) {
            s.l(sVar, p2.f23281a, new PaymentsReminderSetupData(((n42.a.l.ToPaymentReminderSummary) lVar).getPaymentReminderSummaryDestinationParams()), null, 4, null);
        } else if (lVar instanceof n42.a.l.ToMakePayments) {
            s.l(sVar, e2.f23165a, ((n42.a.l.ToMakePayments) lVar).getData(), null, 4, null);
        } else if (lVar instanceof n42.a.l.ToTransactions) {
            s.l(sVar, d3.f23153a, new SetupData(((n42.a.l.ToTransactions) lVar).getPaymentId()), null, 4, null);
        } else {
            if (!fr.t.c(lVar, n42.a.l.C3262a.f131403a)) {
                throw new p();
            }
            if (e3Var instanceof e3.Details) {
                aVar.a();
            } else {
                sVar.c();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(226450206, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:413)");
        }
        f00.r.o(wVar, q0.c(z52.p.class), sVar.g(c3.f23145a), m.d(73313037, true, new q() { // from class: c42.s0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.r0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.s(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(73313037, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:419)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.s0(sVar, (z52.a.h) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(s sVar, z52.a.h hVar) {
        if (fr.t.c(hVar, z52.a.h.C6261a.f232946a)) {
            sVar.c();
        } else {
            if (!(hVar instanceof z52.a.h.Error)) {
                throw new p();
            }
            s.l(sVar, f2.f23177a, ((z52.a.h.Error) hVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(final er.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1444729823, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:434)");
        }
        f00.r.n(wVar, q0.c(a0.class), m.d(196766221, true, new q() { // from class: c42.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.u0(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.u(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u0(final er.a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(196766221, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:437)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.l1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.v0(aVar, sVar, (i42.c.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(er.a aVar, s sVar, i42.c.e eVar) {
        if (fr.t.c(eVar, i42.c.e.a.f89146a)) {
            aVar.a();
        } else if (eVar instanceof i42.c.e.d) {
            s.m(sVar, o2.f23275a, null, 2, null);
        } else if (fr.t.c(eVar, i42.c.e.C2101e.f89150a)) {
            s.l(sVar, q2.f23289a, new PaymentsYourCardsSetupData(null), null, 4, null);
        } else if (fr.t.c(eVar, i42.c.e.f.f89151a)) {
            s.m(sVar, x2.f23353a, null, 2, null);
        } else if (eVar instanceof i42.c.e.Error) {
            s.l(sVar, f2.f23177a, ((i42.c.e.Error) eVar).getErrorData(), null, 4, null);
        } else {
            if (!(eVar instanceof i42.c.e.NavigateToDetails)) {
                throw new p();
            }
            s.l(sVar, l2.f23238a, new PaymentsDetailsSetupData(new PaymentResultDestinationData(((i42.c.e.NavigateToDetails) eVar).getPaymentId(), false)), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1631957856, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:478)");
        }
        f00.r.n(wVar, q0.c(n.class), m.d(1415045838, true, new q() { // from class: c42.y0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c2.x0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), n.f23250a.y(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1415045838, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:481)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.q1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.y0(sVar, (p42.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(s sVar, p42.a.c cVar) {
        if (fr.t.c(cVar, p42.a.c.C3754a.f152919a)) {
            sVar.c();
        } else if (cVar instanceof p42.a.c.Error) {
            s.l(sVar, f2.f23177a, ((p42.a.c.Error) cVar).getErrorData(), null, 4, null);
        } else {
            if (!(cVar instanceof p42.a.c.NavigateToDetails)) {
                throw new p();
            }
            s.l(sVar, l2.f23238a, new PaymentsDetailsSetupData(new PaymentResultDestinationData(((p42.a.c.NavigateToDetails) cVar).getPaymentId(), false)), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-413678239, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.EpaymentsNavGraph.<anonymous>.<anonymous>.<anonymous> (EpaymentsNavContent.kt:507)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.A0(sVar, (DialogData) obj);
                }
            };
            rVar.v(objE);
        }
        l lVar = (l) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: c42.a1
                @Override // er.a
                public final Object a() {
                    return c2.B0(sVar);
                }
            };
            rVar.v(objE2);
        }
        er.a aVar = (er.a) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: c42.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return c2.C0(sVar, (MakePaymentInitialData) obj);
                }
            };
            rVar.v(objE3);
        }
        l lVar2 = (l) objE3;
        boolean zG4 = rVar.G(sVar);
        Object objE4 = rVar.E();
        if (zG4 || objE4 == r.INSTANCE.a()) {
            objE4 = new er.a() { // from class: c42.c1
                @Override // er.a
                public final Object a() {
                    return c2.D0(sVar);
                }
            };
            rVar.v(objE4);
        }
        Function1.H(lVar, aVar, lVar2, (er.a) objE4, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
