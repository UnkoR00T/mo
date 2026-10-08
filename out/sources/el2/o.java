package el2;

import er.p;
import er.q;
import f00.f0;
import f00.s;
import fr.q0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p136y9.d1;
import p136y9.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfl2/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "k", "(Lfl2/a;Ler/a;Lm2/r;I)V", "n", "(Ler/a;Lm2/r;I)V", "myikp_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    public static final void k(final fl2.a aVar, final er.a<i0> aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1320897275);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1320897275, i16, -1, "pl.gov.coi.mobywatel.feature.myikp.presentation.MyIkpNavContent (MyIkpNavContent.kt:21)");
            }
            d0.c(fl2.c.c().d(aVar), y2.m.d(1201347013, true, new p() { // from class: el2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.l(aVar2, (r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new p() { // from class: el2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.m(aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1201347013, i15, -1, "pl.gov.coi.mobywatel.feature.myikp.presentation.MyIkpNavContent.<anonymous> (MyIkpNavContent.kt:25)");
            }
            n(aVar, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(fl2.a aVar, er.a aVar2, int i15, r rVar, int i16) {
        k(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void n(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1119256134);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1119256134, i16, -1, "pl.gov.coi.mobywatel.feature.myikp.presentation.MyIkpNavGraph (MyIkpNavContent.kt:32)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            c cVar = c.f51856a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: el2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.o(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, cVar, (er.l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: el2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.v(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final er.a aVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, c.f51856a, null, y2.m.b(-361031417, true, new er.r() { // from class: el2.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.p(aVar, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.f51858a, null, y2.m.b(-1392055440, true, new er.r() { // from class: el2.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.s(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final er.a aVar, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-361031417, i15, -1, "pl.gov.coi.mobywatel.feature.myikp.presentation.MyIkpNavGraph.<anonymous>.<anonymous>.<anonymous> (MyIkpNavContent.kt:39)");
        }
        f00.r.n(wVar, q0.c(gl2.m.class), y2.m.d(1218118453, true, new q() { // from class: el2.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return o.q(aVar, sVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f51854a.b(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final er.a aVar, final s sVar, zx.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1218118453, i15, -1, "pl.gov.coi.mobywatel.feature.myikp.presentation.MyIkpNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyIkpNavContent.kt:42)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: el2.e
                @Override // er.l
                public final Object b(Object obj) {
                    return o.r(aVar, sVar, (gl2.a.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(er.a aVar, s sVar, gl2.a.d dVar) {
        if (fr.t.c(dVar, gl2.a.d.C1687a.f73577a)) {
            aVar.a();
        } else {
            if (!(dVar instanceof gl2.a.d.HandleGenericError)) {
                throw new oq.p();
            }
            s.l(sVar, d.f51858a, ((gl2.a.d.HandleGenericError) dVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1392055440, i15, -1, "pl.gov.coi.mobywatel.feature.myikp.presentation.MyIkpNavGraph.<anonymous>.<anonymous>.<anonymous> (MyIkpNavContent.kt:57)");
        }
        d dVar = d.f51858a;
        f00.r.r(wVar, dVar, sVar.g(dVar), y2.m.d(2088266799, true, new q() { // from class: el2.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return o.t(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2088266799, i15, -1, "pl.gov.coi.mobywatel.feature.myikp.presentation.MyIkpNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyIkpNavContent.kt:63)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: el2.f
                @Override // er.l
                public final Object b(Object obj) {
                    return o.u(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(er.a aVar, int i15, r rVar, int i16) {
        n(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
