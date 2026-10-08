package lw1;

import androidx.p016lifecycle.y0;
import cb4.DialogData;
import fr.q0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;
import pw1.ChangePinData;
import px1.ResetPinNavData;
import py1.ResetPinData;
import wv3.FaqScreenData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lox1/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Lhx1/a;", "globalEvent", "Lkotlin/Function1;", "Lgx/b;", "navigateToGlobalDestination", "G", "(Lox1/a;Ler/a;Lhx1/a;Ler/l;Lm2/r;I)V", "J", "(Ler/a;Lhx1/a;Ler/l;Lm2/r;I)V", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h0 {
    public static final void G(final ox1.a aVar, final er.a<oq.i0> aVar2, final hx1.a aVar3, final er.l<? super gx.b, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2140796432);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(lVar) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2140796432, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavContent (EIdServicesNavContent.kt:40)");
            }
            p076m2.d0.c(ox1.c.c().d(aVar), y2.m.d(435951952, true, new er.p() { // from class: lw1.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.H(aVar2, aVar3, lVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lw1.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.I(aVar, aVar2, aVar3, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(er.a aVar, hx1.a aVar2, er.l lVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(435951952, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavContent.<anonymous> (EIdServicesNavContent.kt:44)");
            }
            J(aVar, aVar2, lVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(ox1.a aVar, er.a aVar2, hx1.a aVar3, er.l lVar, int i15, p076m2.r rVar, int i16) {
        G(aVar, aVar2, aVar3, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void J(final er.a<oq.i0> aVar, final hx1.a aVar2, final er.l<? super gx.b, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        zx.a aVar3;
        p076m2.r rVarH = rVar.h(1743533283);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1743533283, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph (EIdServicesNavContent.kt:57)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            if (fr.t.c(aVar2, hx1.a.b.f86824a)) {
                aVar3 = a.f.f120635a;
            } else if (fr.t.c(aVar2, hx1.a.c.f86825a)) {
                aVar3 = a.e.f120633a;
            } else {
                if (!fr.t.c(aVar2, hx1.a.C2034a.f86823a) && !fr.t.c(aVar2, hx1.a.d.f86826a)) {
                    throw new oq.p();
                }
                aVar3 = a.f.f120635a;
            }
            boolean zG = ((i16 & 14) == 4) | rVarH.G(aVar2) | rVarH.G(sVarJ) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: lw1.b0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.K(sVarJ, aVar, aVar2, lVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, aVar3, (er.l) objE, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lw1.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.n0(aVar, aVar2, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 K(final f00.s sVar, final er.a aVar, final hx1.a aVar2, final er.l lVar, d1 d1Var) {
        f00.r.u(d1Var, a.f.f120635a, null, y2.m.b(472379074, true, new er.r() { // from class: lw1.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.L(aVar2, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        qx1.n.n(d1Var, sVar, aVar, new er.l() { // from class: lw1.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.N(lVar, (gx.b) obj);
            }
        }, new er.l() { // from class: lw1.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.S(sVar, (FaqScreenData) obj);
            }
        }, new er.l() { // from class: lw1.c
            @Override // er.l
            public final Object b(Object obj) {
                return h0.T(sVar, (DialogData) obj);
            }
        }, new er.l() { // from class: lw1.d
            @Override // er.l
            public final Object b(Object obj) {
                return h0.U(sVar, (ResetPinNavData) obj);
            }
        });
        f00.r.u(d1Var, a.e.f120633a, null, y2.m.b(1406769657, true, new er.r() { // from class: lw1.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.V(lVar, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.k.f120651a, null, y2.m.b(-675781702, true, new er.r() { // from class: lw1.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.Z(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.b.f120624a, null, y2.m.b(1536634235, true, new er.r() { // from class: lw1.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.d0(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.i.f120644a, null, y2.m.b(-545917124, true, new er.r() { // from class: lw1.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.h0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, a.c.f120626a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(1666498813, true, new er.r() { // from class: lw1.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.k0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, a.h.f120642a, null, y2.m.b(-416052546, true, new er.r() { // from class: lw1.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.O(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(hx1.a aVar, final er.a aVar2, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        ww1.a aVar3;
        if (p076m2.t.k()) {
            p076m2.t.o(472379074, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:69)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        uw1.q qVar = (uw1.q) q7.d.c(q0.c(uw1.q.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        if (fr.t.c(aVar, hx1.a.b.f86824a)) {
            aVar3 = ww1.a.DOCUMENT_SIGNING;
        } else if (fr.t.c(aVar, hx1.a.C2034a.f86823a)) {
            aVar3 = ww1.a.PIN_CHANGE;
        } else {
            aVar3 = fr.t.c(aVar, hx1.a.d.f86826a) ? ww1.a.ELECTRONIC_LAYER_SETTINGS : null;
        }
        if (aVar3 != null) {
            qVar.F9(aVar3);
        }
        xw.b<uw1.a.g> bVarY1 = qVar.Y1();
        boolean zW = rVar.W(aVar2) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lw1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.M(aVar2, sVar, (uw1.a.g) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        uw1.h.e(qVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(er.a aVar, f00.s sVar, uw1.a.g gVar) {
        if (fr.t.c(gVar, uw1.a.g.C5245a.f201879a)) {
            aVar.a();
        } else if (gVar instanceof uw1.a.g.GoToFaq) {
            f00.s.l(sVar, a.i.f120644a, ((uw1.a.g.GoToFaq) gVar).getModel(), null, 4, null);
        } else if (fr.t.c(gVar, uw1.a.g.e.f201883a)) {
            sVar.k(a.l.f.f120659b, a.f.f120635a);
        } else if (fr.t.c(gVar, uw1.a.g.d.f201882a)) {
            f00.s.l(sVar, a.b.f120624a, new ChangePinData(iy.b0.INSTANCE.a(), yw1.a.AUTHORIZATION, null, a.AbstractC2944a.C2945a.f120620b, true), null, 4, null);
        } else {
            if (!fr.t.c(gVar, uw1.a.g.b.f201880a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, a.h.f120642a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(er.l lVar, gx.b bVar) {
        lVar.b(bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-416052546, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:261)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        dy1.z zVar = (dy1.z) q7.d.c(q0.c(dy1.z.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lw1.w
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.P(sVar, (FaqScreenData) obj);
                }
            };
            rVar.v(objE);
        }
        er.l lVar = (er.l) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: lw1.y
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.Q(sVar, (ChangePinData) obj);
                }
            };
            rVar.v(objE2);
        }
        er.l lVar2 = (er.l) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new er.l() { // from class: lw1.z
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.R(sVar, (ResetPinData) obj);
                }
            };
            rVar.v(objE3);
        }
        dy1.r.r(zVar, lVar, lVar2, (er.l) objE3, aVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(f00.s sVar, FaqScreenData faqScreenData) {
        f00.s.l(sVar, a.i.f120644a, faqScreenData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(f00.s sVar, ChangePinData changePinData) {
        f00.s.l(sVar, a.b.f120624a, changePinData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(f00.s sVar, ResetPinData resetPinData) {
        f00.s.l(sVar, a.k.f120651a, resetPinData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(f00.s sVar, FaqScreenData faqScreenData) {
        f00.s.l(sVar, a.i.f120644a, faqScreenData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(f00.s sVar, DialogData dialogData) {
        f00.s.l(sVar, a.c.f120626a, dialogData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(f00.s sVar, ResetPinNavData resetPinNavData) {
        a.l.d dVar;
        boolean popDestination = resetPinNavData.getPopDestination();
        if (popDestination) {
            dVar = a.l.d.f120657b;
        } else {
            if (popDestination) {
                throw new oq.p();
            }
            dVar = null;
        }
        sVar.j(a.k.f120651a, resetPinNavData.getResetPinData(), dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(final er.l lVar, final f00.s sVar, er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1406769657, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:143)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        xx1.z zVar = (xx1.z) q7.d.c(q0.c(xx1.z.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        boolean zW = rVar.W(lVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lw1.s
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.W(lVar, (gx.b) obj);
                }
            };
            rVar.v(objE);
        }
        er.l lVar2 = (er.l) objE;
        boolean zG = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: lw1.t
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.X(sVar, (FaqScreenData) obj);
                }
            };
            rVar.v(objE2);
        }
        er.l lVar3 = (er.l) objE2;
        boolean zG2 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG2 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new er.l() { // from class: lw1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.Y(sVar, (DialogData) obj);
                }
            };
            rVar.v(objE3);
        }
        xx1.r.r(zVar, lVar2, lVar3, (er.l) objE3, aVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(er.l lVar, gx.b bVar) {
        lVar.b(bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(f00.s sVar, FaqScreenData faqScreenData) {
        f00.s.l(sVar, a.i.f120644a, faqScreenData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(f00.s sVar, DialogData dialogData) {
        f00.s.l(sVar, a.c.f120626a, dialogData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-675781702, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:165)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        my1.a0 a0Var = (my1.a0) q7.d.c(q0.c(my1.a0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        ResetPinData resetPinData = (ResetPinData) sVar.g(a.k.f120651a);
        if (resetPinData != null) {
            a0Var.Z(resetPinData.getCan());
            a0Var.l9(resetPinData.getCertificateType());
            a0Var.n4(resetPinData.getFirstScreenInFlow());
            a0Var.m9(resetPinData.getEntryDestination());
        }
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.p() { // from class: lw1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.a0(aVar, sVar, (a) obj, (py1.c) obj2);
                }
            };
            rVar.v(objE);
        }
        er.p pVar = (er.p) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: lw1.k
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.b0(sVar, (DialogData) obj);
                }
            };
            rVar.v(objE2);
        }
        er.l lVar = (er.l) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new er.a() { // from class: lw1.l
                @Override // er.a
                public final Object a() {
                    return h0.c0(sVar);
                }
            };
            rVar.v(objE3);
        }
        my1.o.o(a0Var, pVar, lVar, (er.a) objE3, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(er.a aVar, f00.s sVar, a aVar2, py1.c cVar) {
        if (aVar2 != null) {
            f00.s.i(sVar, aVar2, cVar, null, 4, null);
        } else {
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(f00.s sVar, DialogData dialogData) {
        f00.s.l(sVar, a.c.f120626a, dialogData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(f00.s sVar) {
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1536634235, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:197)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final mw1.f0 f0Var = (mw1.f0) q7.d.c(q0.c(mw1.f0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        ChangePinData changePinData = (ChangePinData) sVar.g(a.b.f120624a);
        if (changePinData != null) {
            f0Var.Z(changePinData.getCan());
            f0Var.l9(changePinData.getCertificateType());
            f0Var.n4(changePinData.getFirstScreenInFlow());
            f0Var.m9(changePinData.getEntryDestination());
            f0Var.n9(changePinData.getResetPinAvailable());
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lw1.n
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.e0(sVar, (DialogData) obj);
                }
            };
            rVar.v(objE);
        }
        er.l lVar = (er.l) objE;
        boolean zW = rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: lw1.o
                @Override // er.a
                public final Object a() {
                    return h0.f0(aVar);
                }
            };
            rVar.v(objE2);
        }
        er.a aVar2 = (er.a) objE2;
        boolean zG2 = rVar.G(f0Var) | rVar.G(sVar) | rVar.W(aVar);
        Object objE3 = rVar.E();
        if (zG2 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new er.a() { // from class: lw1.p
                @Override // er.a
                public final Object a() {
                    return h0.g0(f0Var, aVar, sVar);
                }
            };
            rVar.v(objE3);
        }
        mw1.s.s(f0Var, lVar, aVar2, (er.a) objE3, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(f00.s sVar, DialogData dialogData) {
        f00.s.l(sVar, a.c.f120626a, dialogData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(mw1.f0 f0Var, er.a aVar, f00.s sVar) {
        if (f0Var.z2().getEntryDestination() != null) {
            sVar.c();
        } else {
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-545917124, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:229)");
        }
        a.i iVar = a.i.f120644a;
        f00.r.r(wVar, iVar, sVar.g(iVar), y2.m.d(-595356209, true, new er.q() { // from class: lw1.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.i0(sVar, (wv3.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, wv3.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-595356209, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:234)");
        }
        xw.b<wv3.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lw1.m
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.j0(sVar, (wv3.b.a) obj);
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
    public static final oq.i0 j0(f00.s sVar, wv3.b.a aVar) {
        if (!fr.t.c(aVar, wv3.b.a.C5724a.f215471a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1666498813, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:247)");
        }
        a.c cVar = a.c.f120626a;
        f00.r.r(wVar, cVar, sVar.g(cVar), y2.m.d(347841864, true, new er.q() { // from class: lw1.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.l0(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(347841864, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.EIdServicesNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EIdServicesNavContent.kt:251)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: lw1.b
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.m0(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 m0(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(er.a aVar, hx1.a aVar2, er.l lVar, int i15, p076m2.r rVar, int i16) {
        J(aVar, aVar2, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
