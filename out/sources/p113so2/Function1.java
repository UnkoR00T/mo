package p113so2;

import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import mu.g;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import vo2.c;
import vo2.n;
import xo2.u;
import xw.b;
import y2.m;
import zo2.SetupData;
import zx.d;

/* JADX INFO: renamed from: so2.v, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lso2/c0;", "Loq/i0;", "navResult", "Lso2/b0;", "entryPoint", "Lto2/a;", "onboardingSetPasswordDataMapper", "r", "(Ler/l;Lso2/b0;Lto2/a;Lm2/r;I)V", "onboarding_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: so2.v$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"so2/v$a", "Lvy3/a;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "route", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements vy3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String route = y.f183297a.getRoute();

        a() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getRoute() {
            return this.route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2081712378, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:86)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: so2.l
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.B(sVar, (c) obj);
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
    public static final i0 B(s sVar, c cVar) {
        if (cVar instanceof c.a) {
            sVar.c();
        } else {
            if (!(cVar instanceof c.b)) {
                throw new p();
            }
            s.m(sVar, z.f183299a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(to2.a aVar, final b0 b0Var, final s sVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1088790455, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:103)");
        }
        a aVar2 = new a();
        i0 i0Var = i0.f148189a;
        f00.r.r(wVar, aVar2, aVar.b(i0Var), m.d(1732144267, true, new q() { // from class: so2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.D(b0Var, sVar, lVar, (vy3.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3072);
        if (t.k()) {
            t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(final b0 b0Var, final s sVar, final l lVar, vy3.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1732144267, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:109)");
        }
        b<vy3.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(b0Var) | rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: so2.j
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.E(b0Var, sVar, lVar, (vy3.b.a) obj);
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
    public static final i0 E(b0 b0Var, s sVar, l lVar, vy3.b.a aVar) {
        if (fr.t.c(aVar, vy3.b.a.C5487a.f208709a)) {
            if (b0Var instanceof b0.ClearActivation) {
                sVar.c();
            } else {
                if (!(b0Var instanceof b0.ResetPassword)) {
                    throw new p();
                }
                ((b0.ResetPassword) b0Var).a().a();
            }
        } else if (!fr.t.c(aVar, vy3.b.a.C5488b.f208710a)) {
            if (!(aVar instanceof vy3.b.a.PasswordSet)) {
                throw new p();
            }
            lVar.b(c0.b.f183252a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-515213418, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:125)");
        }
        f00.r.n(wVar, q0.c(u.class), m.d(-994752828, true, new q() { // from class: so2.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.G(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f183254a.f(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-994752828, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:128)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: so2.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.H(sVar, (xo2.c) obj);
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
    public static final i0 H(s sVar, xo2.c cVar) {
        if (cVar instanceof xo2.c.a) {
            sVar.c();
        } else {
            if (!(cVar instanceof xo2.c.b)) {
                throw new p();
            }
            s.m(sVar, y.f183297a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(l lVar, b0 b0Var, to2.a aVar, int i15, r rVar, int i16) {
        r(lVar, b0Var, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final l<? super c0, i0> lVar, final b0 b0Var, final to2.a aVar, r rVar, final int i15) {
        int i16;
        zx.a aVar2;
        r rVarH = rVar.h(2035147087);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(b0Var) : rVarH.G(b0Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(2035147087, i16, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent (NavContent.kt:29)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            if (b0Var instanceof b0.ClearActivation) {
                aVar2 = a0.f183247a;
            } else {
                if (!(b0Var instanceof b0.ResetPassword)) {
                    throw new p();
                }
                aVar2 = y.f183297a;
            }
            boolean zG = ((i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(b0Var))) | ((i16 & 14) == 4) | rVarH.G(sVarJ) | rVarH.G(aVar);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: so2.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.s(b0Var, lVar, sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, aVar2, (l) objE, rVarH, s.f54562e);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: so2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.I(lVar, b0Var, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 s(final b0 b0Var, final l lVar, final s sVar, final to2.a aVar, d1 d1Var) {
        f00.r.u(d1Var, a0.f183247a, null, m.b(-1009161776, true, new er.r() { // from class: so2.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.t(b0Var, lVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, x.f183295a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(1830905, true, new er.r() { // from class: so2.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.w(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, w.f183293a, null, m.b(-1602172968, true, new er.r() { // from class: so2.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.z(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y.f183297a, null, m.b(1088790455, true, new er.r() { // from class: so2.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.C(aVar, b0Var, sVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.f183299a, null, m.b(-515213418, true, new er.r() { // from class: so2.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.F(sVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(b0 b0Var, final l lVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1009161776, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:40)");
        }
        mr.c cVarC = q0.c(zo2.w.class);
        b0.ClearActivation clearActivation = b0Var instanceof b0.ClearActivation ? (b0.ClearActivation) b0Var : null;
        f00.r.o(wVar, cVarC, new SetupData(clearActivation != null ? clearActivation.getShowDialog() : false), m.d(-2145093121, true, new q() { // from class: so2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.u(lVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f183254a.e(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final l lVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2145093121, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:46)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: so2.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.v(lVar, sVar, (zo2.c.h) obj);
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
    public static final i0 v(l lVar, s sVar, zo2.c.h hVar) {
        if (hVar instanceof zo2.c.h.a) {
            lVar.b(c0.a.f183251a);
        } else if (hVar instanceof zo2.c.h.b) {
            s.m(sVar, w.f183293a, null, 2, null);
        } else if (fr.t.c(hVar, zo2.c.h.C6371c.f235792a)) {
            lVar.b(c0.c.f183253a);
        } else {
            if (!(hVar instanceof zo2.c.h.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, x.f183295a, ((zo2.c.h.ShowDialog) hVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1830905, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:69)");
        }
        x xVar = x.f183295a;
        f00.r.r(wVar, xVar, sVar.g(xVar), m.d(-134111858, true, new q() { // from class: so2.g
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.x(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-134111858, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:73)");
        }
        b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: so2.k
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.y(sVar, (cb4.f.a) obj);
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
    public static final i0 y(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1602172968, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:83)");
        }
        f00.r.n(wVar, q0.c(n.class), m.d(-2081712378, true, new q() { // from class: so2.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.A(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d.f183254a.d(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
