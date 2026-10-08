package p088nul;

import CON.s0;
import er.p;
import ha.d;
import ia.g;
import m7.j;
import m7.k;
import m7.l;
import oq.i0;
import p008Nul.x;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.m;
import p076m2.r;
import p076m2.r0;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "enabled", "Lkotlin/Function0;", "Loq/i0;", "onBack", "g", "(ZLer/a;Lm2/r;II)V", "activity-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nul/q0$a", "Lm7/l;", "Loq/i0;", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f138867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f138868b;

        public a(k kVar, t0 t0Var) {
            this.f138867a = kVar;
            this.f138868b = t0Var;
        }

        @Override // m7.l
        public void a() {
            this.f138868b.h(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nul/q0$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f138869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f138870b;

        public b(x xVar, t0 t0Var) {
            this.f138869a = xVar;
            this.f138870b = t0Var;
        }

        @Override // p076m2.r0
        public void j() {
            this.f138869a.b(this.f138870b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nul/q0$c", "Lm7/l;", "Loq/i0;", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f138871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f138872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f138873c;

        public c(k kVar, x xVar, t0 t0Var) {
            this.f138871a = kVar;
            this.f138872b = xVar;
            this.f138873c = t0Var;
        }

        @Override // m7.l
        public void a() {
            this.f138872b.b(this.f138873c);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void g(boolean z15, final er.a<i0> aVar, r rVar, final int i15, final int i16) {
        int i17;
        final boolean z16;
        r rVarH = rVar.h(-361453782);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            z16 = i18 != 0 ? true : z15;
            if (t.k()) {
                t.o(-361453782, i17, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:107)");
            }
            Object objC = g.f90558a.c(rVarH, g.f90560c);
            if (objC == null) {
                rVarH.X(535274673);
                objC = w0.f138887a.c(rVarH, 6);
                rVarH.R();
            } else {
                rVarH.X(535271790);
                rVarH.R();
            }
            if (objC == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean zW = rVarH.W(objC);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                d dVar = objC instanceof d ? (d) objC : null;
                ha.c cVarD = dVar != null ? dVar.d() : null;
                s0 s0Var = objC instanceof s0 ? (s0) objC : null;
                objE = new x(cVarD, s0Var != null ? s0Var.o() : null);
                rVarH.v(objE);
            }
            final x xVar = (x) objE;
            long jB = m.b(rVarH, 0);
            boolean zW2 = rVarH.W(xVar) | rVarH.d(jB);
            Object objE2 = rVarH.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new t0(new BackHandlerInfo(objC, jB));
                rVarH.v(objE2);
            }
            final t0 t0Var = (t0) objE2;
            if (CON.a.isOnBackPressedLifecycleOrderMaintained) {
                rVarH.X(-585307852);
                boolean zG = rVarH.G(t0Var) | ((i17 & 112) == 32);
                Object objE3 = rVarH.E();
                if (zG || objE3 == r.INSTANCE.a()) {
                    objE3 = new er.a() { // from class: nul.k0
                        @Override // er.a
                        public final Object a() {
                            return q0.h(t0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                }
                Function0.g((er.a) objE3, rVarH, 0);
                Boolean boolValueOf = Boolean.valueOf(z16);
                int i19 = i17 & 14;
                boolean zG2 = rVarH.G(t0Var) | (i19 == 4);
                Object objE4 = rVarH.E();
                if (zG2 || objE4 == r.INSTANCE.a()) {
                    objE4 = new er.l() { // from class: nul.l0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return q0.i(t0Var, z16, (k) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                j.m(boolValueOf, t0Var, null, (er.l) objE4, rVarH, i19, 4);
                boolean zG3 = rVarH.G(xVar) | rVarH.G(t0Var);
                Object objE5 = rVarH.E();
                if (zG3 || objE5 == r.INSTANCE.a()) {
                    objE5 = new er.l() { // from class: nul.m0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return q0.j(xVar, t0Var, (p076m2.s0) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                Function0.b(xVar, t0Var, (er.l) objE5, rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(-584634160);
                boolean zG4 = rVarH.G(t0Var) | ((i17 & 14) == 4) | ((i17 & 112) == 32);
                Object objE6 = rVarH.E();
                if (zG4 || objE6 == r.INSTANCE.a()) {
                    objE6 = new er.a() { // from class: nul.n0
                        @Override // er.a
                        public final Object a() {
                            return q0.k(t0Var, z16, aVar);
                        }
                    };
                    rVarH.v(objE6);
                }
                Function0.g((er.a) objE6, rVarH, 0);
                boolean zG5 = rVarH.G(xVar) | rVarH.G(t0Var);
                Object objE7 = rVarH.E();
                if (zG5 || objE7 == r.INSTANCE.a()) {
                    objE7 = new er.l() { // from class: nul.o0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return q0.l(xVar, t0Var, (k) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                j.m(xVar, t0Var, null, (er.l) objE7, rVarH, 0, 4);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            z16 = z15;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: nul.p0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q0.m(z16, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(t0 t0Var, er.a aVar) {
        t0Var.k(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l i(t0 t0Var, boolean z15, k kVar) {
        t0Var.h(z15);
        return new a(kVar, t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 j(x xVar, t0 t0Var, p076m2.s0 s0Var) {
        xVar.a(t0Var);
        return new b(xVar, t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(t0 t0Var, boolean z15, er.a aVar) {
        t0Var.h(z15);
        t0Var.k(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l l(x xVar, t0 t0Var, k kVar) {
        xVar.a(t0Var);
        return new c(kVar, xVar, t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(boolean z15, er.a aVar, int i15, int i16, r rVar, int i17) {
        g(z15, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
