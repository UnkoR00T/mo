package gf2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import st3.AddressFormData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgf2/h1;", "sharedViewModel", "Lkotlin/Function0;", "Loq/i0;", "onBackToWelcomePage", "onClose", "J", "(Lgf2/h1;Ler/a;Ler/a;Lm2/r;I)V", "internetaccess_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a1 {
    public static final void J(final h1 h1Var, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-789075650);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(h1Var) : rVarH.G(h1Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-789075650, i16, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent (InternetAccessSharedNavContent.kt:35)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            c.g gVar = c.g.f72571a;
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(h1Var))) | ((i16 & 896) == 256) | ((i16 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: gf2.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return a1.K(h1Var, aVar2, aVar, sVarJ, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, gVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gf2.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a1.s0(h1Var, aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final h1 h1Var, final er.a aVar, final er.a aVar2, final f00.s sVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, c.g.f72571a, null, y2.m.b(1374385693, true, new er.r() { // from class: gf2.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.L(h1Var, aVar, aVar2, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.d.f72565a, null, y2.m.b(1886170196, true, new er.r() { // from class: gf2.t0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.P(sVar, h1Var, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.b.f72561a, null, y2.m.b(1328186133, true, new er.r() { // from class: gf2.u0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.e.f72567a, null, y2.m.b(770202070, true, new er.r() { // from class: gf2.v0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.W(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.a.f72559a, null, y2.m.b(212218007, true, new er.r() { // from class: gf2.w0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.Z(h1Var, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.h.f72573a, null, y2.m.b(-345766056, true, new er.r() { // from class: gf2.x0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.d0(h1Var, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.C1661c.f72563a, null, y2.m.b(-903750119, true, new er.r() { // from class: gf2.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.h0(h1Var, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.f.f72569a, null, y2.m.b(-1461734182, true, new er.r() { // from class: gf2.z0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.l0(h1Var, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, a.f72552a, new f00.g0.Dialog(null, 1, null), y2.m.b(-2019718245, true, new er.r() { // from class: gf2.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return a1.p0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final h1 h1Var, final er.a aVar, final er.a aVar2, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1374385693, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:44)");
        }
        boolean zG = rVar.G(h1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.M(h1Var, (pf2.a0.a) obj);
                }
            };
            rVar.v(objE);
        }
        pf2.a0 a0Var = (pf2.a0) q7.d.c(fr.q0.c(pf2.a0.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<pf2.a.f> bVarY1 = a0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.G(sVar) | rVar.G(h1Var);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: gf2.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.N(aVar, aVar2, sVar, h1Var, (pf2.a.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        pf2.p.n(a0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pf2.a0 M(h1 h1Var, pf2.a0.a aVar) {
        return aVar.a(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final er.a aVar, er.a aVar2, f00.s sVar, h1 h1Var, pf2.a.f fVar) {
        if (fr.t.c(fVar, pf2.a.f.b.f157156a)) {
            aVar.a();
        } else if (fr.t.c(fVar, pf2.a.f.C3889a.f157155a)) {
            aVar2.a();
        } else if (fVar instanceof pf2.a.f.EnterAddress) {
            f00.s.l(sVar, c.d.f72565a, ((pf2.a.f.EnterAddress) fVar).getAddressForm(), null, 4, null);
        } else {
            if (!fr.t.c(fVar, pf2.a.f.c.f157157a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, a.f72552a, h1Var.p7(new er.a() { // from class: gf2.m0
                @Override // er.a
                public final Object a() {
                    return a1.O(aVar);
                }
            }), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(final f00.s sVar, final h1 h1Var, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1886170196, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:67)");
        }
        c.d dVar = c.d.f72565a;
        AddressFormData addressFormData = (AddressFormData) sVar.g(dVar);
        f00.r.r(wVar, dVar, addressFormData != null ? AddressFormData.b(addressFormData, null, false, null, null, null, null, h1Var.o(), 63, null) : null, y2.m.d(-1717215003, true, new er.q() { // from class: gf2.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return a1.Q(sVar, h1Var, aVar, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, final h1 h1Var, final er.a aVar, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1717215003, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:73)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(h1Var) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.R(sVar, h1Var, aVar, (st3.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(f00.s sVar, h1 h1Var, final er.a aVar, st3.f.a aVar2) {
        if (aVar2 instanceof st3.f.a.Close) {
            f00.s.l(sVar, a.f72552a, h1Var.p7(new er.a() { // from class: gf2.s0
                @Override // er.a
                public final Object a() {
                    return a1.S(aVar);
                }
            }), null, 4, null);
        } else if (aVar2 instanceof st3.f.a.Back) {
            sVar.c();
        } else if (aVar2 instanceof st3.f.a.GoToNextScreen) {
            h1Var.D7(((st3.f.a.GoToNextScreen) aVar2).getResult());
            f00.s.m(sVar, c.a.f72559a, null, 2, null);
        } else if (aVar2 instanceof st3.f.a.GoToSearch) {
            f00.s.l(sVar, c.b.f72561a, ((st3.f.a.GoToSearch) aVar2).getModel(), null, 4, null);
        } else {
            if (!(aVar2 instanceof st3.f.a.GoToError)) {
                throw new oq.p();
            }
            f00.s.l(sVar, c.e.f72567a, ((st3.f.a.GoToError) aVar2).getErrorData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1328186133, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:106)");
        }
        c.b bVar = c.b.f72561a;
        f00.r.r(wVar, bVar, sVar.g(bVar), y2.m.d(-1786750846, true, new er.q() { // from class: gf2.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return a1.U(sVar, (tt3.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, tt3.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1786750846, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:112)");
        }
        xw.b<tt3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.V(sVar, (tt3.d.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(f00.s sVar, tt3.d.a aVar) {
        if (!fr.t.c(aVar, tt3.d.a.C5021a.f192310a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(770202070, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:122)");
        }
        c.e eVar = c.e.f72567a;
        f00.r.r(wVar, eVar, sVar.g(eVar), y2.m.d(-696508041, true, new er.q() { // from class: gf2.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return a1.X(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-696508041, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:128)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.Y(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final h1 h1Var, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(212218007, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:138)");
        }
        boolean zG = rVar.G(h1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.t
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.a0(h1Var, (hf2.r.a) obj);
                }
            };
            rVar.v(objE);
        }
        hf2.r rVar2 = (hf2.r) q7.d.c(fr.q0.c(hf2.r.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<hf2.a.f> bVarY1 = rVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar) | rVar.G(h1Var);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: gf2.u
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.b0(sVar, aVar, h1Var, (hf2.a.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        hf2.j.f(rVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hf2.r a0(h1 h1Var, hf2.r.a aVar) {
        return aVar.a(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(f00.s sVar, final er.a aVar, h1 h1Var, hf2.a.f fVar) {
        if (fVar instanceof hf2.a.f.BackToEnterAddress) {
            c.d dVar = c.d.f72565a;
            sVar.j(dVar, ((hf2.a.f.BackToEnterAddress) fVar).getAddressForm(), dVar);
        } else if (fr.t.c(fVar, hf2.a.f.b.f84159a)) {
            aVar.a();
        } else if (fr.t.c(fVar, hf2.a.f.d.f84161a)) {
            f00.s.l(sVar, a.f72552a, h1Var.p7(new er.a() { // from class: gf2.i0
                @Override // er.a
                public final Object a() {
                    return a1.c0(aVar);
                }
            }), null, 4, null);
        } else if (fr.t.c(fVar, hf2.a.f.c.f84160a)) {
            sVar.k(c.h.f72573a, c.a.f72559a);
        } else {
            if (!fr.t.c(fVar, hf2.a.f.e.f84162a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, c.h.f72573a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final h1 h1Var, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-345766056, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:168)");
        }
        boolean zG = rVar.G(h1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.e0(h1Var, (sf2.v.a) obj);
                }
            };
            rVar.v(objE);
        }
        sf2.v vVar = (sf2.v) q7.d.c(fr.q0.c(sf2.v.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<sf2.c.f> bVarY1 = vVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(h1Var);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: gf2.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.f0(aVar, sVar, h1Var, (sf2.c.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        sf2.o.o(vVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sf2.v e0(h1 h1Var, sf2.v.a aVar) {
        return aVar.a(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final er.a aVar, f00.s sVar, h1 h1Var, sf2.c.f fVar) {
        if (fr.t.c(fVar, sf2.c.f.b.f181230a)) {
            aVar.a();
        } else if (fr.t.c(fVar, sf2.c.f.a.f181229a)) {
            sVar.c();
        } else if (fr.t.c(fVar, sf2.c.f.d.f181232a)) {
            f00.s.m(sVar, c.C1661c.f72563a, null, 2, null);
        } else {
            if (!fr.t.c(fVar, sf2.c.f.C4658c.f181231a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, a.f72552a, h1Var.p7(new er.a() { // from class: gf2.r0
                @Override // er.a
                public final Object a() {
                    return a1.g0(aVar);
                }
            }), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(final h1 h1Var, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-903750119, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:190)");
        }
        boolean zG = rVar.G(h1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.v
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.i0(h1Var, (kf2.w.a) obj);
                }
            };
            rVar.v(objE);
        }
        kf2.w wVar2 = (kf2.w) q7.d.c(fr.q0.c(kf2.w.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<kf2.c> bVarY1 = wVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.G(h1Var) | rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: gf2.w
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.j0(sVar, h1Var, aVar, (kf2.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        kf2.q.k(wVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kf2.w i0(h1 h1Var, kf2.w.a aVar) {
        return aVar.a(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(f00.s sVar, h1 h1Var, final er.a aVar, kf2.c cVar) {
        if (fr.t.c(cVar, kf2.c.a.f110569a)) {
            sVar.c();
        } else if (fr.t.c(cVar, kf2.c.C2652c.f110571a)) {
            f00.s.m(sVar, c.f.f72569a, null, 2, null);
        } else {
            if (!fr.t.c(cVar, kf2.c.b.f110570a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, a.f72552a, h1Var.p7(new er.a() { // from class: gf2.k0
                @Override // er.a
                public final Object a() {
                    return a1.k0(aVar);
                }
            }), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final h1 h1Var, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1461734182, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:211)");
        }
        boolean zG = rVar.G(h1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.y
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.m0(h1Var, (mf2.h0.a) obj);
                }
            };
            rVar.v(objE);
        }
        mf2.h0 h0Var = (mf2.h0) q7.d.c(fr.q0.c(mf2.h0.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<mf2.c.f> bVarY1 = h0Var.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar) | rVar.G(h1Var);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: gf2.z
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.n0(sVar, aVar, h1Var, (mf2.c.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        mf2.x.t(h0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf2.h0 m0(h1 h1Var, mf2.h0.a aVar) {
        return aVar.a(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(f00.s sVar, final er.a aVar, h1 h1Var, mf2.c.f fVar) {
        if (fr.t.c(fVar, mf2.c.f.a.f126144a)) {
            sVar.c();
        } else if (fr.t.c(fVar, mf2.c.f.b.f126145a)) {
            aVar.a();
        } else {
            if (!fr.t.c(fVar, mf2.c.f.C3099c.f126146a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, a.f72552a, h1Var.p7(new er.a() { // from class: gf2.o0
                @Override // er.a
                public final Object a() {
                    return a1.o0(aVar);
                }
            }), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2019718245, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:233)");
        }
        a aVar = a.f72552a;
        f00.r.r(wVar, aVar, sVar.g(aVar), y2.m.d(-1514209562, true, new er.q() { // from class: gf2.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return a1.q0(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1514209562, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.InternetAccessSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternetAccessSharedNavContent.kt:237)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: gf2.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return a1.r0(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(h1 h1Var, er.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        J(h1Var, aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
