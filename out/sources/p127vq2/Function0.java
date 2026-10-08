package p127vq2;

import er.a;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import iy.b0;
import mu.g;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import wq2.SetupData;
import wq2.e;
import wq2.q;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: vq2.t0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "onPassportInvalidationSuccess", "Liy/b0;", "passportNumber", "n", "(Ler/a;Ler/a;Liy/b0;Lm2/r;I)V", "passportinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(a aVar, a aVar2, b0 b0Var, int i15, r rVar, int i16) {
        n(aVar, aVar2, b0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final a<i0> aVar, final a<i0> aVar2, final b0 b0Var, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-932270596);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(b0Var) : rVarH.G(b0Var) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-932270596, i16, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent (PassportInvalidationNavContent.kt:22)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            f0 f0Var = f0.f207936a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 896) == 256 || ((i16 & 512) != 0 && rVarH.G(b0Var))) | ((i16 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: vq2.g0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.o(b0Var, aVar, aVar2, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, f0Var, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: vq2.k0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.A(aVar, aVar2, b0Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 o(final b0 b0Var, final a aVar, final a aVar2, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, f0.f207936a, null, m.b(-1644583107, true, new er.r() { // from class: vq2.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p(b0Var, aVar, aVar2, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d0.f207918a, null, m.b(-931374042, true, new er.r() { // from class: vq2.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.u(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, c0.f207916a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(-158332091, true, new er.r() { // from class: vq2.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.x(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final b0 b0Var, final a aVar, final a aVar2, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1644583107, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent.<anonymous>.<anonymous>.<anonymous> (PassportInvalidationNavContent.kt:30)");
        }
        f00.r.o(wVar, q0.c(q.class), new SetupData(b0Var), m.d(-646788436, true, new er.q() { // from class: vq2.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q(aVar, aVar2, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), m.d(513436727, true, new er.q() { // from class: vq2.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.s(b0Var, (q) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 27648 | (b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final a aVar, final a aVar2, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-646788436, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportInvalidationNavContent.kt:36)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r(aVar, aVar2, sVar, (e.c) obj);
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
    public static final i0 r(a aVar, a aVar2, s sVar, e.c cVar) {
        if (fr.t.c(cVar, e.c.C5684c.f214411a)) {
            aVar.a();
        } else if (fr.t.c(cVar, e.c.b.f214410a)) {
            aVar2.a();
        } else if (cVar instanceof e.c.Error) {
            s.l(sVar, d0.f207918a, ((e.c.Error) cVar).getErrorData(), null, 4, null);
        } else {
            if (!(cVar instanceof e.c.ShowDialog)) {
                throw new oq.p();
            }
            s.l(sVar, c0.f207916a, ((e.c.ShowDialog) cVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final b0 b0Var, final q qVar, r rVar, int i15) {
        if (t.k()) {
            t.o(513436727, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportInvalidationNavContent.kt:52)");
        }
        wq2.m.d(qVar, m.d(-475769387, true, new p() { // from class: vq2.s0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.t(qVar, b0Var, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, (i15 & 14) | 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(q qVar, b0 b0Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-475769387, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportInvalidationNavContent.kt:53)");
            }
            b0.v(qVar, qVar, b0Var, rVar, b0.f97726c << 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-931374042, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent.<anonymous>.<anonymous>.<anonymous> (PassportInvalidationNavContent.kt:64)");
        }
        d0 d0Var = d0.f207918a;
        f00.r.r(wVar, d0Var, sVar.g(d0Var), m.d(-943833499, true, new er.q() { // from class: vq2.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.v(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-943833499, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportInvalidationNavContent.kt:68)");
        }
        b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.w(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-158332091, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent.<anonymous>.<anonymous>.<anonymous> (PassportInvalidationNavContent.kt:81)");
        }
        c0 c0Var = c0.f207916a;
        f00.r.r(wVar, c0Var, sVar.g(c0Var), m.d(1320564890, true, new er.q() { // from class: vq2.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.y(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1320564890, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.PassportInvalidationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportInvalidationNavContent.kt:85)");
        }
        b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.z(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }
}
