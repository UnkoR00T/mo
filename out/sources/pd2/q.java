package pd2;

import f00.f0;
import f00.s;
import fr.q0;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p136y9.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lod2/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "n", "(Lod2/a;Ler/a;Lm2/r;I)V", "q", "(Ler/a;Lm2/r;I)V", "idverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(s sVar, hb4.b.a aVar) {
        if (!t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(er.a aVar, int i15, p076m2.r rVar, int i16) {
        q(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final od2.a aVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-249573765);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-249573765, i16, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavContent (IdVerificationNavContent.kt:24)");
            }
            d0.c(od2.c.c().d(aVar), y2.m.d(2067681723, true, new er.p() { // from class: pd2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.o(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: pd2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.p(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2067681723, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavContent.<anonymous> (IdVerificationNavContent.kt:28)");
            }
            q(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(od2.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        n(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void q(final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1039510358);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1039510358, i16, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavGraph (IdVerificationNavContent.kt:35)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            r.c cVar = r.c.f157037c;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: pd2.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.r(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, cVar, (er.l) objE, rVarH, s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pd2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.B(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final er.a aVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, r.c.f157037c, null, y2.m.b(-1790585173, true, new er.r() { // from class: pd2.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.s(aVar, sVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.b.f157036c, null, y2.m.b(1405719124, true, new er.r() { // from class: pd2.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.v(sVar, aVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.a.f157035c, null, y2.m.b(1271136435, true, new er.r() { // from class: pd2.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.y(sVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final er.a aVar, final s sVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1790585173, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (IdVerificationNavContent.kt:45)");
        }
        f00.r.n(wVar, q0.c(sd2.l.class), y2.m.d(1683140185, true, new er.q() { // from class: pd2.g
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.t(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f157007a.d(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final er.a aVar, final s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1683140185, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdVerificationNavContent.kt:49)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: pd2.d
                @Override // er.l
                public final Object b(Object obj) {
                    return q.u(aVar, sVar, (sd2.a.InterfaceC4647a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(er.a aVar, s sVar, sd2.a.InterfaceC4647a interfaceC4647a) {
        if (t.c(interfaceC4647a, sd2.a.InterfaceC4647a.C4648a.f180385a)) {
            aVar.a();
        } else if (interfaceC4647a instanceof sd2.a.InterfaceC4647a.Error) {
            s.l(sVar, r.a.f157035c, ((sd2.a.InterfaceC4647a.Error) interfaceC4647a).getData(), null, 4, null);
        } else {
            if (!(interfaceC4647a instanceof sd2.a.InterfaceC4647a.Next)) {
                throw new oq.p();
            }
            s.l(sVar, r.b.f157036c, ((sd2.a.InterfaceC4647a.Next) interfaceC4647a).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(final s sVar, final er.a aVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1405719124, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (IdVerificationNavContent.kt:70)");
        }
        f00.r.o(wVar, q0.c(qd2.l.class), sVar.g(r.b.f157036c), y2.m.d(-195870397, true, new er.q() { // from class: pd2.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.w(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f157007a.c(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-195870397, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdVerificationNavContent.kt:75)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: pd2.h
                @Override // er.l
                public final Object b(Object obj) {
                    return q.x(sVar, aVar, (qd2.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(s sVar, er.a aVar, qd2.a aVar2) {
        if (t.c(aVar2, qd2.a.C4156a.f166099a)) {
            sVar.c();
        } else {
            if (!t.c(aVar2, qd2.a.b.f166100a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final s sVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1271136435, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavGraph.<anonymous>.<anonymous>.<anonymous> (IdVerificationNavContent.kt:89)");
        }
        r.a aVar = r.a.f157035c;
        f00.r.r(wVar, aVar, sVar.g(aVar), y2.m.d(1909324338, true, new er.q() { // from class: pd2.e
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.z(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1909324338, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.navigation.IdVerificationNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdVerificationNavContent.kt:94)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: pd2.i
                @Override // er.l
                public final Object b(Object obj) {
                    return q.A(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
