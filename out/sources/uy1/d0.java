package uy1;

import f00.f0;
import fr.q0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvy1/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "t", "(Lvy1/a;Ler/a;Lm2/r;I)V", "w", "(Ler/a;Lm2/r;I)V", "electoralregister_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(er.a aVar, f00.s sVar, yy1.a.e eVar) {
        if (fr.t.c(eVar, yy1.a.e.C6198a.f230660a)) {
            aVar.a();
        } else if (eVar instanceof yy1.a.e.ToErrorScreen) {
            f00.s.l(sVar, j.f202257a, ((yy1.a.e.ToErrorScreen) eVar).getErrorData(), null, 4, null);
        } else if (eVar instanceof yy1.a.e.ToCitizenDataDetailsScreen) {
            f00.s.l(sVar, g.f202251a, ((yy1.a.e.ToCitizenDataDetailsScreen) eVar).getDataDetails(), null, 4, null);
        } else {
            if (!(eVar instanceof yy1.a.e.ToElectionEventDetailsScreen)) {
                throw new oq.p();
            }
            f00.s.l(sVar, f.f202249a, ((yy1.a.e.ToElectionEventDetailsScreen) eVar).getEventDetails(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2063295958, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:79)");
        }
        f00.r.o(wVar, q0.c(wy1.v.class), sVar.g(f.f202249a), y2.m.d(783418501, true, new er.q() { // from class: uy1.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d0.C(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f202244a.e(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(783418501, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:85)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: uy1.w
                @Override // er.l
                public final Object b(Object obj) {
                    return d0.D(sVar, (wy1.c) obj);
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
    public static final i0 D(f00.s sVar, wy1.c cVar) {
        if (!fr.t.c(cVar, wy1.c.a.f215896a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1026285557, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:96)");
        }
        f00.r.o(wVar, q0.c(az1.k.class), sVar.g(g.f202251a), y2.m.d(-253591900, true, new er.q() { // from class: uy1.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d0.F(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f202244a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-253591900, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:102)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: uy1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return d0.G(sVar, (az1.q) obj);
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
    public static final i0 G(f00.s sVar, az1.q qVar) {
        if (fr.t.c(qVar, az1.q.a.f15453a)) {
            sVar.c();
        } else {
            if (!fr.t.c(qVar, az1.q.b.f15454a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, h.f202253a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-10724844, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:117)");
        }
        f00.r.n(wVar, q0.c(cz1.l.class), y2.m.d(-831966782, true, new er.q() { // from class: uy1.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d0.I(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f202244a.f(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-831966782, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:120)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: uy1.k
                @Override // er.l
                public final Object b(Object obj) {
                    return d0.J(sVar, (cz1.b) obj);
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
    public static final i0 J(f00.s sVar, cz1.b bVar) {
        if (!fr.t.c(bVar, cz1.b.a.f38777a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1047735245, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:131)");
        }
        j jVar = j.f202257a;
        f00.r.r(wVar, jVar, sVar.g(jVar), y2.m.d(7676274, true, new er.q() { // from class: uy1.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d0.L(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(7676274, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:137)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: uy1.x
                @Override // er.l
                public final Object b(Object obj) {
                    return d0.M(sVar, (hb4.b.a) obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(er.a aVar, int i15, p076m2.r rVar, int i16) {
        w(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(final vy1.a aVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(14156741);
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
                p076m2.t.o(14156741, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavContent (ElectoralRegisterNavContent.kt:30)");
            }
            p076m2.d0.c(vy1.c.c().d(aVar), y2.m.d(-1165367163, true, new er.p() { // from class: uy1.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.u(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: uy1.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.v(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1165367163, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavContent.<anonymous> (ElectoralRegisterNavContent.kt:34)");
            }
            w(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(vy1.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        t(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void w(final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1242875308);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1242875308, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph (ElectoralRegisterNavContent.kt:41)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            i iVar = i.f202255a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: uy1.a0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.x(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, iVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uy1.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.N(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final er.a aVar, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, i.f202255a, null, y2.m.b(647681005, true, new er.r() { // from class: uy1.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d0.y(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f202249a, null, y2.m.b(2063295958, true, new er.r() { // from class: uy1.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d0.B(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f202251a, null, y2.m.b(1026285557, true, new er.r() { // from class: uy1.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d0.E(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f202253a, null, y2.m.b(-10724844, true, new er.r() { // from class: uy1.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d0.H(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f202257a, null, y2.m.b(-1047735245, true, new er.r() { // from class: uy1.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d0.K(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(647681005, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:49)");
        }
        f00.r.n(wVar, q0.c(yy1.b0.class), y2.m.d(280346395, true, new er.q() { // from class: uy1.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d0.z(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), e.f202244a.h(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(280346395, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.ElectoralRegisterNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterNavContent.kt:52)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: uy1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return d0.A(aVar, sVar, (yy1.a.e) obj);
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
}
