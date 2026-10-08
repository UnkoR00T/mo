package tm3;

import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lok3/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "d2", "(Lok3/a;Ler/a;Lm2/r;I)V", "C0", "(Ler/a;Lm2/r;I)V", "vehicleregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c3 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190835a;

        static {
            int[] iArr = new int[nk3.a.values().length];
            try {
                iArr[nk3.a.FIRST_REGISTRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nk3.a.RE_REGISTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nk3.a.TRANSFER_REGISTRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f190835a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A1(f00.s sVar, im3.a aVar) {
        if (fr.t.c(aVar, im3.a.C2207a.f93446a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, im3.a.b.f93447a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.n.f190972c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-672185301, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:603)");
        }
        f00.r.n(wVar, fr.q0.c(ql3.l.class), y2.m.d(-360881603, true, new er.q() { // from class: tm3.a2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.C1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.O(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void C0(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1575710947);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1575710947, i16, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent (VehicleRegistrationNavContent.kt:110)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final cl3.j jVar = (cl3.j) q7.d.c(fr.q0.c(cl3.j.class), y0VarC, null, j7.a.a(y0VarC, rVarH, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
            xw.b<cl3.d> bVarY1 = jVar.Y1();
            int i17 = i16 & 14;
            boolean z15 = i17 == 4;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: tm3.t0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c3.D0(aVar, (cl3.d) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.f0.b(bVarY1, (er.l) objE, rVarH, xw.b.f221619c);
            z.y yVar = z.y.f190983c;
            boolean zG = rVarH.G(jVar) | (i17 == 4) | rVarH.G(sVarJ);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: tm3.u0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c3.E0(jVar, aVar, sVarJ, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f00.d0.j(sVarJ, yVar, (er.l) objE2, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: tm3.v0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c3.c2(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-360881603, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:607)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.z2
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.D1(sVar, (ql3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D0(er.a aVar, cl3.d dVar) {
        if (!fr.t.c(dVar, cl3.d.a.f28172a)) {
            throw new oq.p();
        }
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D1(f00.s sVar, ql3.a aVar) {
        if (fr.t.c(aVar, ql3.a.C4212a.f167292a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, ql3.a.b.f167293a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.t.f190978c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(final cl3.j jVar, final er.a aVar, final f00.s sVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, z.y.f190983c, null, y2.m.b(980516644, true, new er.r() { // from class: tm3.x0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.F0(jVar, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.x.f190982c, null, y2.m.b(-1898835699, true, new er.r() { // from class: tm3.j1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.I0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.v.f190980c, null, y2.m.b(1359121196, true, new er.r() { // from class: tm3.p1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.p1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.w.f190981c, null, y2.m.b(322110795, true, new er.r() { // from class: tm3.q1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.H1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.s.f190977c, null, y2.m.b(-714899606, true, new er.r() { // from class: tm3.r1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.K1(jVar, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.j.f190968c, null, y2.m.b(-1751910007, true, new er.r() { // from class: tm3.t1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.N1(jVar, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.i.f190967c, null, y2.m.b(1506046888, true, new er.r() { // from class: tm3.u1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.Q1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.r.f190976c, null, y2.m.b(469036487, true, new er.r() { // from class: tm3.v1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.T1(jVar, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.q.f190975c, null, y2.m.b(-567973914, true, new er.r() { // from class: tm3.w1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.W1(jVar, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.l.f190970c, null, y2.m.b(-1604984315, true, new er.r() { // from class: tm3.x1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.Z1(jVar, sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.b.f190960c, null, y2.m.b(226429965, true, new er.r() { // from class: tm3.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.L0(jVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.f.f190964c, null, y2.m.b(-810580436, true, new er.r() { // from class: tm3.z0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.O0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.k.f190969c, null, y2.m.b(-1847590837, true, new er.r() { // from class: tm3.a1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.R0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.d.f190962c, null, y2.m.b(1410366058, true, new er.r() { // from class: tm3.b1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.U0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.p.f190974c, null, y2.m.b(373355657, true, new er.r() { // from class: tm3.c1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.X0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.h.f190966c, null, y2.m.b(-663654744, true, new er.r() { // from class: tm3.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.a1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.a.f190959c, null, y2.m.b(-1700665145, true, new er.r() { // from class: tm3.e1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.d1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.e.f190963c, null, y2.m.b(1557291750, true, new er.r() { // from class: tm3.f1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.g1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.g.f190965c, null, y2.m.b(520281349, true, new er.r() { // from class: tm3.g1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.j1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.o.f190973c, null, y2.m.b(-516729052, true, new er.r() { // from class: tm3.i1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.m1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.m.f190971c, null, y2.m.b(-1856121394, true, new er.r() { // from class: tm3.k1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.s1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.c.f190961c, null, y2.m.b(1401835501, true, new er.r() { // from class: tm3.l1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.v1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.u.f190979c, null, y2.m.b(364825100, true, new er.r() { // from class: tm3.m1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.y1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.n.f190972c, null, y2.m.b(-672185301, true, new er.r() { // from class: tm3.n1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.B1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z.t.f190978c, null, y2.m.b(-1709195702, true, new er.r() { // from class: tm3.o1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c3.E1(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E1(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1709195702, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:622)");
        }
        f00.r.n(wVar, fr.q0.c(em3.l.class), y2.m.d(-1397892004, true, new er.q() { // from class: tm3.b2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.F1(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.J(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(cl3.j jVar, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(980516644, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:128)");
        }
        f00.r.o(wVar, fr.q0.c(qm3.s.class), jVar.getContract(), y2.m.d(-1286734445, true, new er.q() { // from class: tm3.e2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.G0(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.P(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F1(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1397892004, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:626)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.G1(sVar, aVar, (em3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G0(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1286734445, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:133)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.H0(aVar, sVar, (qm3.c) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G1(f00.s sVar, er.a aVar, em3.a aVar2) {
        if (fr.t.c(aVar2, em3.a.C1230a.f51997a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar2, em3.a.b.f51998a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(er.a aVar, f00.s sVar, qm3.c cVar) {
        if (fr.t.c(cVar, qm3.c.a.f167346a)) {
            aVar.a();
        } else {
            if (!(cVar instanceof qm3.c.Next)) {
                throw new oq.p();
            }
            int i15 = a.f190835a[((qm3.c.Next) cVar).getRegistrationType().ordinal()];
            if (i15 == 1) {
                f00.s.m(sVar, z.x.f190982c, null, 2, null);
            } else {
                if (i15 != 2 && i15 != 3) {
                    throw new oq.p();
                }
                f00.s.m(sVar, z.v.f190980c, null, 2, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(322110795, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:194)");
        }
        f00.r.n(wVar, fr.q0.c(mm3.l.class), y2.m.d(-499131143, true, new er.q() { // from class: tm3.u2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.I1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.U(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1898835699, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:156)");
        }
        f00.r.n(wVar, fr.q0.c(om3.m.class), y2.m.d(1574889659, true, new er.q() { // from class: tm3.c2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.J0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.L(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-499131143, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:198)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.d2
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.J1(sVar, (mm3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1574889659, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:160)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.K0(sVar, (om3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J1(f00.s sVar, mm3.a aVar) {
        if (fr.t.c(aVar, mm3.a.C3137a.f127144a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, mm3.a.b.f127145a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.s.f190977c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K0(f00.s sVar, om3.a aVar) {
        if (fr.t.c(aVar, om3.a.C3656a.f146787a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, om3.a.b.f146788a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.v.f190980c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K1(cl3.j jVar, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-714899606, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:213)");
        }
        f00.r.o(wVar, fr.q0.c(bm3.r.class), jVar.getContract(), y2.m.d(-1994777063, true, new er.q() { // from class: tm3.p2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.L1(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.N(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(cl3.j jVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(226429965, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:351)");
        }
        f00.r.o(wVar, fr.q0.c(rk3.r.class), jVar.getContract(), y2.m.d(-795065538, true, new er.q() { // from class: tm3.n2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.M0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.z(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L1(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1994777063, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:218)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.M1(sVar, aVar, (bm3.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-795065538, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:356)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.N0(sVar, (rk3.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M1(f00.s sVar, er.a aVar, bm3.a.b bVar) {
        if (fr.t.c(bVar, bm3.a.b.C0527a.f20242a)) {
            sVar.c();
        } else if (fr.t.c(bVar, bm3.a.b.C0528b.f20243a)) {
            aVar.a();
        } else if (fr.t.c(bVar, bm3.a.b.d.f20245a)) {
            f00.s.m(sVar, z.y.f190983c, null, 2, null);
        } else {
            if (!fr.t.c(bVar, bm3.a.b.c.f20244a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.j.f190968c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0(f00.s sVar, rk3.a.b bVar) {
        if (fr.t.c(bVar, rk3.a.b.C4457a.f174699a)) {
            sVar.c();
        } else if (fr.t.c(bVar, rk3.a.b.c.f174701a)) {
            f00.s.m(sVar, z.k.f190969c, null, 2, null);
        } else {
            if (!(bVar instanceof rk3.a.b.EdorAuth)) {
                throw new oq.p();
            }
            f00.s.l(sVar, z.f.f190964c, ((rk3.a.b.EdorAuth) bVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N1(cl3.j jVar, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1751910007, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:237)");
        }
        f00.r.o(wVar, fr.q0.c(gl3.n.class), jVar.getContract(), y2.m.d(1263179832, true, new er.q() { // from class: tm3.m2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.O1(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.I(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-810580436, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:377)");
        }
        z.f fVar2 = z.f.f190964c;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), y2.m.d(-201149327, true, new er.q() { // from class: tm3.z1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.P0(sVar, (mv3.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O1(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1263179832, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:242)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.P1(sVar, aVar, (gl3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(final f00.s sVar, mv3.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-201149327, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:382)");
        }
        xw.b<mv3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.Q0(sVar, (mv3.c.a) obj);
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
    public static final oq.i0 P1(f00.s sVar, er.a aVar, gl3.a aVar2) {
        if (fr.t.c(aVar2, gl3.a.C1691a.f73656a)) {
            sVar.c();
        } else if (fr.t.c(aVar2, gl3.a.b.f73657a)) {
            aVar.a();
        } else {
            if (!fr.t.c(aVar2, gl3.a.c.f73658a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.i.f190967c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(f00.s sVar, mv3.c.a aVar) {
        if (!fr.t.c(aVar, mv3.c.a.C3193a.f128686a) && !fr.t.c(aVar, mv3.c.a.b.f128687a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1506046888, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:260)");
        }
        f00.r.n(wVar, fr.q0.c(el3.l.class), y2.m.d(684804950, true, new er.q() { // from class: tm3.y2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.R1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.E(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1847590837, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:394)");
        }
        f00.r.n(wVar, fr.q0.c(jl3.l.class), y2.m.d(-1536287139, true, new er.q() { // from class: tm3.l2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.S0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.M(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(684804950, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:264)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.s1
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.S1(sVar, (el3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1536287139, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:398)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.T0(sVar, (jl3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S1(f00.s sVar, el3.a aVar) {
        if (fr.t.c(aVar, el3.a.C1225a.f51877a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, el3.a.b.f51878a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.r.f190976c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T0(f00.s sVar, jl3.a aVar) {
        if (fr.t.c(aVar, jl3.a.C2464a.f103665a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, jl3.a.b.f103666a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.d.f190962c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T1(cl3.j jVar, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(469036487, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:279)");
        }
        f00.r.o(wVar, fr.q0.c(yl3.r.class), jVar.getContract(), y2.m.d(-810840970, true, new er.q() { // from class: tm3.y1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.U1(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.G(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1410366058, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:413)");
        }
        f00.r.n(wVar, fr.q0.c(yk3.l.class), y2.m.d(1721669756, true, new er.q() { // from class: tm3.x2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.V0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.H(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U1(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-810840970, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:284)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.V1(sVar, aVar, (yl3.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1721669756, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:417)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.o2
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.W0(sVar, (yk3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V1(f00.s sVar, er.a aVar, yl3.a.b bVar) {
        if (fr.t.c(bVar, yl3.a.b.C6116a.f227800a)) {
            sVar.c();
        } else if (fr.t.c(bVar, yl3.a.b.C6117b.f227801a)) {
            aVar.a();
        } else if (fr.t.c(bVar, yl3.a.b.d.f227803a)) {
            f00.s.m(sVar, z.y.f190983c, null, 2, null);
        } else {
            if (!fr.t.c(bVar, yl3.a.b.c.f227802a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.q.f190975c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W0(f00.s sVar, yk3.a aVar) {
        if (fr.t.c(aVar, yk3.a.C6102a.f227584a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, yk3.a.b.f227585a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.p.f190974c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W1(cl3.j jVar, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-567973914, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:303)");
        }
        f00.r.o(wVar, fr.q0.c(vl3.r.class), jVar.getContract(), y2.m.d(-1847851371, true, new er.q() { // from class: tm3.j2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.X1(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.K(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(373355657, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:432)");
        }
        f00.r.n(wVar, fr.q0.c(ul3.m.class), y2.m.d(684659355, true, new er.q() { // from class: tm3.h2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.Y0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.V(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X1(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1847851371, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:308)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.Y1(sVar, aVar, (vl3.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(684659355, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:436)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.a3
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.Z0(sVar, (ul3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y1(f00.s sVar, er.a aVar, vl3.c.a aVar2) {
        if (fr.t.c(aVar2, vl3.c.a.C5436a.f207347a)) {
            sVar.c();
        } else if (fr.t.c(aVar2, vl3.c.a.b.f207348a)) {
            aVar.a();
        } else if (fr.t.c(aVar2, vl3.c.a.d.f207350a)) {
            f00.s.m(sVar, z.y.f190983c, null, 2, null);
        } else {
            if (!fr.t.c(aVar2, vl3.c.a.C5437c.f207349a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.l.f190970c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z0(f00.s sVar, ul3.a aVar) {
        if (fr.t.c(aVar, ul3.a.C5182a.f198969a)) {
            sVar.c();
        } else if (fr.t.c(aVar, ul3.a.c.f198971a)) {
            f00.s.m(sVar, z.a.f190959c, null, 2, null);
        } else {
            if (!fr.t.c(aVar, ul3.a.b.f198970a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.h.f190966c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z1(cl3.j jVar, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1604984315, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:327)");
        }
        f00.r.o(wVar, fr.q0.c(ll3.r.class), jVar.getContract(), y2.m.d(1410105524, true, new er.q() { // from class: tm3.s2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.a2(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.y(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-663654744, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:454)");
        }
        f00.r.n(wVar, fr.q0.c(al3.l.class), y2.m.d(-352351046, true, new er.q() { // from class: tm3.i2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.b1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.A(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a2(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1410105524, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:332)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.b2(sVar, aVar, (ll3.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-352351046, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:458)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.c1(sVar, (al3.c) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(f00.s sVar, er.a aVar, ll3.c.a aVar2) {
        if (fr.t.c(aVar2, ll3.c.a.C2885a.f118765a)) {
            sVar.c();
        } else if (fr.t.c(aVar2, ll3.c.a.b.f118766a)) {
            aVar.a();
        } else if (fr.t.c(aVar2, ll3.c.a.d.f118768a)) {
            f00.s.m(sVar, z.y.f190983c, null, 2, null);
        } else {
            if (!fr.t.c(aVar2, ll3.c.a.C2886c.f118767a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.b.f190960c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c1(f00.s sVar, al3.c cVar) {
        if (!fr.t.c(cVar, al3.c.a.f7727a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(er.a aVar, int i15, p076m2.r rVar, int i16) {
        C0(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1700665145, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:470)");
        }
        f00.r.n(wVar, fr.q0.c(pk3.l.class), y2.m.d(-1389361447, true, new er.q() { // from class: tm3.w2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.e1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.F(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    public static final void d2(final ok3.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(477181529);
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
                p076m2.t.o(477181529, i16, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.VehicleRegistrationNavContent (VehicleRegistrationNavContent.kt:96)");
            }
            p076m2.d0.c(ok3.c.c().d(aVar), y2.m.d(-680683111, true, new er.p() { // from class: tm3.r0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c3.e2(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: tm3.s0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c3.f2(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1389361447, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:474)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.f1(sVar, (pk3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-680683111, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.VehicleRegistrationNavContent.<anonymous> (VehicleRegistrationNavContent.kt:100)");
            }
            C0(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f1(f00.s sVar, pk3.a aVar) {
        if (fr.t.c(aVar, pk3.a.C3922a.f158040a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, pk3.a.b.f158041a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.e.f190963c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(ok3.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        d2(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1557291750, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:489)");
        }
        f00.r.n(wVar, fr.q0.c(wk3.l.class), y2.m.d(1868595448, true, new er.q() { // from class: tm3.r2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.h1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.Q(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1868595448, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:493)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.b3
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.i1(sVar, (wk3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i1(f00.s sVar, wk3.a aVar) {
        if (fr.t.c(aVar, wk3.a.C5658a.f213927a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, wk3.a.b.f213928a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.g.f190965c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(520281349, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:508)");
        }
        f00.r.n(wVar, fr.q0.c(wk3.w.class), y2.m.d(831585047, true, new er.q() { // from class: tm3.k2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.k1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.S(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(831585047, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:512)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.l1(sVar, (wk3.p) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l1(f00.s sVar, wk3.p pVar) {
        if (fr.t.c(pVar, wk3.p.a.f213965a)) {
            sVar.c();
        } else {
            if (!fr.t.c(pVar, wk3.p.b.f213966a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.o.f190973c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-516729052, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:527)");
        }
        f00.r.n(wVar, fr.q0.c(sl3.l.class), y2.m.d(-205425354, true, new er.q() { // from class: tm3.f2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.n1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.D(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-205425354, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:531)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.o1(sVar, (sl3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o1(f00.s sVar, sl3.a aVar) {
        if (fr.t.c(aVar, sl3.a.C4699a.f182329a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, sl3.a.b.f182330a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.m.f190971c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1359121196, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:175)");
        }
        f00.r.n(wVar, fr.q0.c(km3.l.class), y2.m.d(537879258, true, new er.q() { // from class: tm3.v2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.q1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.R(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(537879258, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:179)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.r1(sVar, (km3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r1(f00.s sVar, km3.a aVar) {
        if (fr.t.c(aVar, km3.a.C2696a.f111422a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, km3.a.b.f111423a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.w.f190981c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1856121394, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:546)");
        }
        f00.r.n(wVar, fr.q0.c(ol3.l.class), y2.m.d(-1544817696, true, new er.q() { // from class: tm3.q2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.t1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.C(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1544817696, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:550)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.u1(sVar, (ol3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u1(f00.s sVar, ol3.a aVar) {
        if (fr.t.c(aVar, ol3.a.C3649a.f146697a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, ol3.a.b.f146698a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.c.f190961c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1401835501, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:565)");
        }
        f00.r.n(wVar, fr.q0.c(uk3.l.class), y2.m.d(1713139199, true, new er.q() { // from class: tm3.t2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.w1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.T(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1713139199, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:569)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.x1(sVar, (uk3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x1(f00.s sVar, uk3.a aVar) {
        if (fr.t.c(aVar, uk3.a.C5178a.f198916a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, uk3.a.b.f198917a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, z.u.f190979c, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(364825100, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:584)");
        }
        f00.r.n(wVar, fr.q0.c(im3.l.class), y2.m.d(676128798, true, new er.q() { // from class: tm3.g2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c3.z1(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y.f190927a.B(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z1(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(676128798, i15, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.navigation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleRegistrationNavContent.kt:588)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: tm3.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return c3.A1(sVar, (im3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
