package p130wv2;

import cw3.c;
import dw2.n;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import gx.b;
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
import y2.m;
import yx2.SetupData;
import yx2.h;
import zx.d;

/* JADX INFO: renamed from: wv2.p0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Lgx/b;", "navigateToGlobalEvent", "Llv2/a;", "applicationOwner", "J", "(Ler/a;Ler/l;Llv2/a;Lm2/r;I)V", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void J(final a<i0> aVar, final l<? super b, i0> lVar, final lv2.a aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-539780987);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.c(aVar2.ordinal()) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-539780987, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent (NavContent.kt:42)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            c1 c1Var = c1.f215364a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 896) == 256) | rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: wv2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.K(aVar2, aVar, sVarJ, lVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, c1Var, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: wv2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.s0(aVar, lVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 K(final lv2.a aVar, final a aVar2, final s sVar, final l lVar, d1 d1Var) {
        f00.r.u(d1Var, c1.f215364a, null, m.b(1946703524, true, new er.r() { // from class: wv2.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.L(aVar, aVar2, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u0.f215442a, null, m.b(-2047078373, true, new er.r() { // from class: wv2.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.O(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s0.f215436a, null, m.b(-1924174436, true, new er.r() { // from class: wv2.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.U(sVar, aVar2, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d1.f215367a, null, m.b(-1801270499, true, new er.r() { // from class: wv2.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.X(sVar, aVar2, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a1.f215345a, null, m.b(-1678366562, true, new er.r() { // from class: wv2.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.a0(sVar, aVar2, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, w0.f215448a, null, m.b(-1555462625, true, new er.r() { // from class: wv2.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r0.f215433a, null, m.b(-1432558688, true, new er.r() { // from class: wv2.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z0.f215469a, null, m.b(-1309654751, true, new er.r() { // from class: wv2.t
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.j0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, y0.f215466a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(-1186750814, true, new er.r() { // from class: wv2.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.m0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, t0.f215439a, null, m.b(-1063846877, true, new er.r() { // from class: wv2.v
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, v0.f215445a, null, m.b(-370592485, true, new er.r() { // from class: wv2.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.R(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final lv2.a aVar, final a aVar2, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1946703524, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:52)");
        }
        f00.r.o(wVar, q0.c(ly2.s.class), aVar, m.d(925208021, true, new q() { // from class: wv2.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.M(aVar2, sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f215370a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(final a aVar, final s sVar, final lv2.a aVar2, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(925208021, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:57)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.c(aVar2.ordinal());
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.N(aVar, sVar, aVar2, (ly2.a.e) obj);
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
    public static final i0 N(a aVar, s sVar, lv2.a aVar2, ly2.a.e eVar) {
        if (fr.t.c(eVar, ly2.a.e.c.f121484a)) {
            aVar.a();
        } else if (eVar instanceof ly2.a.e.d) {
            s.l(sVar, u0.f215442a, aVar2, null, 4, null);
        } else if (eVar instanceof ly2.a.e.EdorAuth) {
            s.l(sVar, s0.f215436a, ((ly2.a.e.EdorAuth) eVar).getData(), null, 4, null);
        } else if (eVar instanceof ly2.a.e.GoToWizard) {
            ly2.a.e.GoToWizard goToWizard = (ly2.a.e.GoToWizard) eVar;
            s.l(sVar, d1.f215367a, new SetupData(aVar2, goToWizard.getIsIdentityPhotoFeatureEnabled(), goToWizard.getUserEdorAddress()), null, 4, null);
        } else {
            if (!fr.t.c(eVar, ly2.a.e.C2974a.f121482a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2047078373, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:92)");
        }
        f00.r.o(wVar, q0.c(n.class), sVar.g(u0.f215442a), m.d(-156745972, true, new q() { // from class: wv2.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.P(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f215370a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-156745972, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:97)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Q(sVar, (dw2.b) obj);
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
    public static final i0 Q(s sVar, dw2.b bVar) {
        if (!fr.t.c(bVar, dw2.b.a.f44948a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-370592485, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:317)");
        }
        v0 v0Var = v0.f215445a;
        f00.r.r(wVar, v0Var, sVar.g(v0Var), m.d(704965862, true, new q() { // from class: wv2.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.S(sVar, (c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(final s sVar, c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(704965862, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:324)");
        }
        xw.b<c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.r
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.T(sVar, (c.a) obj);
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
    public static final i0 T(s sVar, c.a aVar) {
        if (!fr.t.c(aVar, c.a.C0819a.f38374a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1924174436, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:110)");
        }
        s0 s0Var = s0.f215436a;
        f00.r.r(wVar, s0Var, sVar.g(s0Var), m.d(-376430943, true, new q() { // from class: wv2.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.V(sVar, aVar, (mv3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(final s sVar, final a aVar, mv3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-376430943, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:117)");
        }
        xw.b<mv3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.W(sVar, aVar, (mv3.c.a) obj);
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
    public static final i0 W(s sVar, a aVar, mv3.c.a aVar2) {
        if (fr.t.c(aVar2, mv3.c.a.C3193a.f128686a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar2, mv3.c.a.b.f128687a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1801270499, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:130)");
        }
        f00.r.o(wVar, q0.c(h.class), sVar.g(d1.f215367a), m.d(89061902, true, new q() { // from class: wv2.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.Y(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f215370a.i(), rVar, ((i15 >> 3) & 14) | 27648 | (b0.f97726c << 6));
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(89061902, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:135)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Z(sVar, aVar, (yx2.a.j) obj);
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
    public static final i0 Z(s sVar, a aVar, yx2.a.j jVar) {
        if (jVar instanceof yx2.a.j.b) {
            sVar.c();
        } else if (jVar instanceof yx2.a.j.C6191a) {
            aVar.a();
        } else if (jVar instanceof yx2.a.j.GoToSearch) {
            s.l(sVar, z0.f215469a, ((yx2.a.j.GoToSearch) jVar).getAddressSearchData(), null, 4, null);
        } else if (jVar instanceof yx2.a.j.ShowDialog) {
            s.l(sVar, y0.f215466a, ((yx2.a.j.ShowDialog) jVar).getDialogData(), null, 4, null);
        } else if (jVar instanceof yx2.a.j.GoToSuccess) {
            s.l(sVar, a1.f215345a, ((yx2.a.j.GoToSuccess) jVar).getApplicationOwnerWithAge(), null, 4, null);
        } else if (jVar instanceof yx2.a.j.ShowImagePreview) {
            s.l(sVar, w0.f215448a, ((yx2.a.j.ShowImagePreview) jVar).getData(), null, 4, null);
        } else if (jVar instanceof yx2.a.j.GoToCustomError) {
            s.l(sVar, r0.f215433a, ((yx2.a.j.GoToCustomError) jVar).getData(), null, 4, null);
        } else if (jVar instanceof yx2.a.j.GoToError) {
            s.l(sVar, t0.f215439a, ((yx2.a.j.GoToError) jVar).getErrorData(), null, 4, null);
        } else if (jVar instanceof yx2.a.j.GoToEdorAuth) {
            s.l(sVar, s0.f215436a, ((yx2.a.j.GoToEdorAuth) jVar).getData(), null, 4, null);
        } else {
            if (!(jVar instanceof yx2.a.j.GoToIdentityPhoto)) {
                throw new oq.p();
            }
            s.l(sVar, v0.f215445a, ((yx2.a.j.GoToIdentityPhoto) jVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(final s sVar, final a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1678366562, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:203)");
        }
        f00.r.o(wVar, q0.c(jy2.r.class), sVar.g(a1.f215345a), m.d(211965839, true, new q() { // from class: wv2.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.b0(aVar, lVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f215370a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(final a aVar, final l lVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(211965839, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:208)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.c0(aVar, lVar, sVar, (jy2.d) obj);
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
    public static final i0 c0(a aVar, l lVar, s sVar, jy2.d dVar) {
        if (fr.t.c(dVar, jy2.d.a.f106485a)) {
            aVar.a();
        } else if (dVar instanceof jy2.d.c) {
            lVar.b(e11.a.C1060a.f46819a);
        } else {
            if (!(dVar instanceof jy2.d.Dialog)) {
                throw new oq.p();
            }
            s.l(sVar, y0.f215466a, ((jy2.d.Dialog) dVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1555462625, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:226)");
        }
        w0 w0Var = w0.f215448a;
        f00.r.r(wVar, w0Var, sVar.g(w0Var), m.d(990721509, true, new q() { // from class: wv2.h0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.e0(sVar, (dx3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(final s sVar, dx3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(990721509, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:233)");
        }
        xw.b<dx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.f0(sVar, (dx3.c.a) obj);
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
    public static final i0 f0(s sVar, dx3.c.a aVar) {
        if (!fr.t.c(aVar, dx3.c.a.C1047a.f45490a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1432558688, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:245)");
        }
        f00.r.o(wVar, q0.c(xv2.n.class), sVar.g(r0.f215433a), m.d(457773713, true, new q() { // from class: wv2.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.h0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f215370a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(457773713, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:252)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i0(sVar, (xv2.c) obj);
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
    public static final i0 i0(s sVar, xv2.c cVar) {
        if (!fr.t.c(cVar, xv2.c.a.f221579a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1309654751, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:263)");
        }
        z0 z0Var = z0.f215469a;
        f00.r.r(wVar, z0Var, sVar.g(z0Var), m.d(1896343118, true, new q() { // from class: wv2.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.k0(sVar, (tt3.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(final s sVar, tt3.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1896343118, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:268)");
        }
        xw.b<tt3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l0(sVar, (tt3.d.a) obj);
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
    public static final i0 l0(s sVar, tt3.d.a aVar) {
        if (!fr.t.c(aVar, tt3.d.a.C5021a.f192310a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1186750814, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:281)");
        }
        y0 y0Var = y0.f215466a;
        f00.r.r(wVar, y0Var, sVar.g(y0Var), m.d(-1400726483, true, new q() { // from class: wv2.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.n0(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1400726483, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:288)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.g
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.o0(sVar, (cb4.f.a) obj);
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
    public static final i0 o0(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1063846877, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:298)");
        }
        t0 t0Var = t0.f215439a;
        f00.r.r(wVar, t0Var, sVar.g(t0Var), m.d(1540108932, true, new q() { // from class: wv2.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.q0(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1540108932, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:305)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: wv2.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.r0(sVar, (hb4.b.a) obj);
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
    public static final i0 r0(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(a aVar, l lVar, lv2.a aVar2, int i15, r rVar, int i16) {
        J(aVar, lVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
