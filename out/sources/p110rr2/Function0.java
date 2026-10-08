package p110rr2;

import er.a;
import er.l;
import er.p;
import er.q;
import f00.f0;
import f00.s;
import fr.q0;
import iy.b0;
import mu.g;
import oq.i0;
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
import tr2.c;
import xw.b;
import y2.m;
import yr2.PassportPickupStatusData;
import zx.d;

/* JADX INFO: renamed from: rr2.o, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "Ltr2/a;", "colorScheme", "j", "(Ler/a;Ltr2/a;Lm2/r;I)V", "passportpickup_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void j(final a<i0> aVar, final tr2.a aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1178042389);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1178042389, i16, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.PassportPickupNavContent (PassportPickupNavContent.kt:23)");
            }
            d0.c(c.c().d(aVar2), m.d(906659029, true, new p() { // from class: rr2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, (r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new p() { // from class: rr2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.s(aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(906659029, i15, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.PassportPickupNavContent.<anonymous> (PassportPickupNavContent.kt:25)");
            }
            final s sVarJ = f00.r.J(null, rVar, 0, 1);
            d dVar = d.f175546a;
            boolean zW = rVar.W(aVar) | rVar.G(sVarJ);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: rr2.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.l(aVar, sVarJ, (d1) obj);
                    }
                };
                rVar.v(objE);
            }
            f00.d0.j(sVarJ, dVar, (l) objE, rVar, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final a aVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, d.f175546a, null, m.b(-15667148, true, new er.r() { // from class: rr2.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.m(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e.f175548a, null, m.b(1210009835, true, new er.r() { // from class: rr2.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-15667148, i15, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.PassportPickupNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportPickupNavContent.kt:31)");
        }
        f00.r.n(wVar, q0.c(ur2.p.class), m.d(1398837190, true, new q() { // from class: rr2.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.n(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f175543a.c(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1398837190, i15, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.PassportPickupNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportPickupNavContent.kt:34)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: rr2.g
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.o(aVar, sVar, (ur2.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(a aVar, s sVar, ur2.a aVar2) {
        if (fr.t.c(aVar2, ur2.a.C5214a.f200405a)) {
            aVar.a();
        } else {
            if (!(aVar2 instanceof ur2.a.Next)) {
                throw new oq.p();
            }
            s.l(sVar, e.f175548a, new PassportPickupStatusData(((ur2.a.Next) aVar2).getApplicationNumber()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1210009835, i15, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.PassportPickupNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportPickupNavContent.kt:48)");
        }
        f00.r.o(wVar, q0.c(wr2.p.class), sVar.g(e.f175548a), m.d(1685075612, true, new q() { // from class: rr2.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f175543a.d(), rVar, ((i15 >> 3) & 14) | 27648 | (b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1685075612, i15, -1, "pl.gov.coi.mobywatel.feature.passportpickup.presentation.PassportPickupNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportPickupNavContent.kt:52)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: rr2.f
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r(sVar, (wr2.c.InterfaceC5694c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(s sVar, wr2.c.InterfaceC5694c interfaceC5694c) {
        if (fr.t.c(interfaceC5694c, wr2.c.InterfaceC5694c.a.f214630a)) {
            sVar.c();
        } else {
            if (!fr.t.c(interfaceC5694c, wr2.c.InterfaceC5694c.b.f214631a)) {
                throw new oq.p();
            }
            d dVar = d.f175546a;
            sVar.k(dVar, dVar);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(a aVar, tr2.a aVar2, int i15, r rVar, int i16) {
        j(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
