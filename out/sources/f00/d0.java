package f00;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p136y9.g1;
import z9.p0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf00/s;", "destinationNavigator", "Lzx/a;", "startDestination", "Lkotlin/Function1;", "Ly9/d1;", "Loq/i0;", "builder", "j", "(Lf00/s;Lzx/a;Ler/l;Lm2/r;I)V", "navigation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {
    public static final void j(final s sVar, final zx.a aVar, final er.l<? super d1, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        boolean z15;
        p076m2.r rVarH = rVar.h(2065960972);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(sVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2065960972, i16, -1, "pl.gov.coi.common.navigation.NavigationHost (NavigationHost.kt:15)");
            }
            g0 type = sVar.getType();
            if (type instanceof g0.Animated) {
                rVarH.X(1113610593);
                g1 navController = sVar.getNavController();
                String route = aVar.getRoute();
                boolean zG = rVarH.G(sVar);
                Object objE = rVarH.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: f00.u
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d0.k(sVar, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                er.l lVar2 = (er.l) objE;
                boolean zG2 = rVarH.G(sVar);
                Object objE2 = rVarH.E();
                if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.l() { // from class: f00.v
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d0.l(sVar, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                er.l lVar3 = (er.l) objE2;
                boolean zG3 = rVarH.G(sVar);
                Object objE3 = rVarH.E();
                if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                    objE3 = new er.l() { // from class: f00.w
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d0.m(sVar, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                er.l lVar4 = (er.l) objE3;
                boolean zG4 = rVarH.G(sVar);
                Object objE4 = rVarH.E();
                if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
                    objE4 = new er.l() { // from class: f00.x
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d0.n(sVar, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                er.l lVar5 = (er.l) objE4;
                z15 = (i16 & 896) == 256;
                Object objE5 = rVarH.E();
                if (z15 || objE5 == p076m2.r.INSTANCE.a()) {
                    objE5 = new er.l() { // from class: f00.y
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d0.o(lVar, (d1) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                p0.q(navController, route, null, null, null, lVar2, lVar3, lVar4, lVar5, null, (er.l) objE5, rVarH, 0, 0, 540);
                rVarH = rVarH;
                rVarH.R();
            } else {
                if (!(type instanceof g0.Dialog)) {
                    rVarH.X(1113608764);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1113626585);
                g1 navController2 = sVar.getNavController();
                String route2 = aVar.getRoute();
                Object objE6 = rVarH.E();
                p076m2.r.Companion companion = p076m2.r.INSTANCE;
                if (objE6 == companion.a()) {
                    objE6 = new er.l() { // from class: f00.z
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d0.p((p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE6);
                }
                er.l lVar6 = (er.l) objE6;
                Object objE7 = rVarH.E();
                if (objE7 == companion.a()) {
                    objE7 = new er.l() { // from class: f00.a0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d0.q((p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                er.l lVar7 = (er.l) objE7;
                z15 = (i16 & 896) == 256;
                Object objE8 = rVarH.E();
                if (z15 || objE8 == companion.a()) {
                    objE8 = new er.l() { // from class: f00.b0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d0.r(lVar, (d1) obj);
                        }
                    };
                    rVarH.v(objE8);
                }
                p0.q(navController2, route2, null, null, null, lVar6, lVar7, null, null, null, (er.l) objE8, rVarH, 1769472, 0, 924);
                rVarH = rVarH;
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f00.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.s(sVar, aVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.c0 k(s sVar, p114t0.h hVar) {
        return ((g0.Animated) sVar.getType()).getEnterTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.e0 l(s sVar, p114t0.h hVar) {
        return ((g0.Animated) sVar.getType()).getExitTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.c0 m(s sVar, p114t0.h hVar) {
        return ((g0.Animated) sVar.getType()).getPopEnterTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.e0 n(s sVar, p114t0.h hVar) {
        return ((g0.Animated) sVar.getType()).getPopExitTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(er.l lVar, d1 d1Var) {
        lVar.b(d1Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.c0 p(p114t0.h hVar) {
        return p114t0.a0.o(u0.m.l(0, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.e0 q(p114t0.h hVar) {
        return p114t0.a0.q(u0.m.l(0, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(er.l lVar, d1 d1Var) {
        lVar.b(d1Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(s sVar, zx.a aVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        j(sVar, aVar, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
