package i53;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Li53/c;", "viewModel", "Loq/i0;", "p", "(Li53/c;Lm2/r;I)V", "Li53/c$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "h", "(Li53/c$a;Li70/p;Ler/a;Lm2/r;II)V", "Li53/c$a$a;", "k", "(Li53/c$a$a;Li70/p;Ler/a;Lm2/r;II)V", "snackBarVisibilityState", "settings_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, c.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((c) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void h(final c.a aVar, i70.p pVar, er.a<i0> aVar2, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final i70.p pVar2;
        final er.a<i0> aVar3;
        p076m2.r rVarH = rVar.h(1228643389);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= ((i16 & 2) == 0 && rVarH.G(pVar)) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) == 0 || rVarH.Q()) {
                if ((i16 & 2) != 0) {
                    pVar = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i18 != 0) {
                    Object objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: i53.d
                            @Override // er.a
                            public final Object a() {
                                return k.i();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar2 = (er.a) objE;
                }
            } else {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            }
            pVar2 = pVar;
            aVar3 = aVar2;
            rVarH.y();
            if (t.k()) {
                t.o(1228643389, i17, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometriclogin.BiometricLoginContent (BiometricLoginScreen.kt:49)");
            }
            if (!(aVar instanceof c.a.Initialized)) {
                rVarH.X(-389704067);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(-389700382);
            k((c.a.Initialized) aVar, pVar2, aVar3, rVarH, i17 & 1022, 0);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            pVar2 = pVar;
            aVar3 = aVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i53.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(aVar, pVar2, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a aVar, i70.p pVar, er.a aVar2, int i15, int i16, p076m2.r rVar, int i17) {
        h(aVar, pVar, aVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c A[PHI: r2 r3
      0x007c: PHI (r2v16 int) = (r2v9 int), (r2v6 int), (r2v17 int) binds: [B:50:0x0087, B:44:0x0078, B:45:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r3v13 i70.p) = (r3v5 i70.p), (r3v2 i70.p), (r3v2 i70.p) binds: [B:50:0x0087, B:44:0x0078, B:45:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void k(final c.a.Initialized initialized, i70.p pVar, er.a<i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        i70.p pVar2;
        er.a<i0> aVar2;
        boolean z15;
        final i70.p pVar3;
        final er.a<i0> aVar3;
        d5 d5VarM;
        Object objE;
        i70.p pVar4;
        er.a<i0> aVar4;
        Object objE2;
        p076m2.r rVarH = rVar.h(-934138630);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                pVar2 = pVar;
                int i18 = rVarH.G(pVar2) ? 32 : 16;
                i17 |= i18;
            } else {
                pVar2 = pVar;
            }
            i17 |= i18;
        } else {
            pVar2 = pVar;
        }
        int i19 = i16 & 4;
        if (i19 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if ((i16 & 2) != 0) {
                        pVar2 = i70.p.a.f89857a;
                        i17 &= -113;
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.a() { // from class: i53.f
                                @Override // er.a
                                public final Object a() {
                                    return k.l();
                                }
                            };
                            rVarH.v(objE);
                        }
                        pVar4 = pVar2;
                        aVar4 = (er.a) objE;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-934138630, i17, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometriclogin.BiometricLoginDisplayScreen (BiometricLoginScreen.kt:65)");
                    }
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new al();
                        rVarH.v(objE2);
                    }
                    final al alVar = (al) objE2;
                    i70.m.d(alVar, pVar4, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
                    final i70.p pVar5 = pVar4;
                    er.a<i0> aVar5 = aVar4;
                    i50.s.r(initialized.getBaseScaffoldData(), null, y2.m.d(380342340, true, new er.p() { // from class: i53.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return k.m(alVar, pVar5, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(494833069, true, new er.q() { // from class: i53.h
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
                    rVarH = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    pVar3 = pVar5;
                    aVar3 = aVar5;
                } else {
                    rVarH.O();
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                    }
                }
                aVar4 = aVar2;
                pVar4 = pVar2;
                rVarH.y();
                if (t.k()) {
                    t.o(-934138630, i17, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometriclogin.BiometricLoginDisplayScreen (BiometricLoginScreen.kt:65)");
                }
                objE2 = rVarH.E();
                if (objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new al();
                    rVarH.v(objE2);
                }
                final al alVar2 = (al) objE2;
                i70.m.d(alVar2, pVar4, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
                final i70.p pVar6 = pVar4;
                er.a<i0> aVar6 = aVar4;
                i50.s.r(initialized.getBaseScaffoldData(), null, y2.m.d(380342340, true, new er.p() { // from class: i53.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.m(alVar2, pVar6, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(494833069, true, new er.q() { // from class: i53.h
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return k.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
                pVar3 = pVar6;
                aVar3 = aVar6;
            } else {
                rVarH.O();
                pVar3 = pVar2;
                aVar3 = aVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i53.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.o(initialized, pVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        aVar2 = aVar;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if ((i16 & 2) != 0) {
                    pVar2 = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: i53.f
                            @Override // er.a
                            public final Object a() {
                                return k.l();
                            }
                        };
                        rVarH.v(objE);
                    }
                    pVar4 = pVar2;
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                    pVar4 = pVar2;
                }
            } else {
                if ((i16 & 2) != 0) {
                    pVar2 = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: i53.f
                            @Override // er.a
                            public final Object a() {
                                return k.l();
                            }
                        };
                        rVarH.v(objE);
                    }
                    pVar4 = pVar2;
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                    pVar4 = pVar2;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-934138630, i17, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometriclogin.BiometricLoginDisplayScreen (BiometricLoginScreen.kt:65)");
            }
            objE2 = rVarH.E();
            if (objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new al();
                rVarH.v(objE2);
            }
            final al alVar3 = (al) objE2;
            i70.m.d(alVar3, pVar4, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
            final i70.p pVar7 = pVar4;
            er.a<i0> aVar7 = aVar4;
            i50.s.r(initialized.getBaseScaffoldData(), null, y2.m.d(380342340, true, new er.p() { // from class: i53.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.m(alVar3, pVar7, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(494833069, true, new er.q() { // from class: i53.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            rVarH = rVarH;
            if (t.k()) {
                t.n();
            }
            pVar3 = pVar7;
            aVar3 = aVar7;
        } else {
            rVarH.O();
            pVar3 = pVar2;
            aVar3 = aVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i53.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(initialized, pVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(380342340, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometriclogin.BiometricLoginDisplayScreen.<anonymous> (BiometricLoginScreen.kt:75)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(494833069, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometriclogin.BiometricLoginDisplayScreen.<anonymous> (BiometricLoginScreen.kt:78)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(androidx.compose.foundation.layout.d.d(w0.i.d(companion, aVar.a(rVar, i17).getBase().a(), null, 2, null), 0.0f, 1, null), d3Var), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), 0.0f, 8, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            h0.v(initialized.getDisableBiometricLoginCard(), null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getEditPinCardSection(), null, null, rVar, 0, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c.a.Initialized initialized, i70.p pVar, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        k(initialized, pVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void p(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-497011654);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-497011654, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.biometriclogin.BiometricLoginScreen (BiometricLoginScreen.kt:28)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            oz.l.b(cVar.a(), rVarH, 0);
            c.a aVarQ = q(f6VarC);
            i70.p pVarR = r(f6VarB);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(cVar))) {
                z15 = true;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(cVar);
                rVarH.v(objE);
            }
            h(aVarQ, pVarR, (er.a) ((mr.g) objE), rVarH, 0, 0);
            rVar2 = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i53.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.s(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a q(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p r(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
