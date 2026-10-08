package p088nul;

import CON.BackEventCompat;
import CON.s0;
import android.annotation.SuppressLint;
import er.p;
import ha.d;
import ju.p0;
import m7.k;
import m7.l;
import mu.g;
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
import tq.e;
import tq.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lmu/g;", "LCON/b;", "Ltq/e;", "Loq/i0;", "", "onBack", "g", "(ZLer/p;Lm2/r;II)V", "activity-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e1 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nul/e1$a", "Lm7/l;", "Loq/i0;", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f138843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f138844b;

        public a(k kVar, u0 u0Var) {
            this.f138843a = kVar;
            this.f138844b = u0Var;
        }

        @Override // m7.l
        public void a() {
            this.f138844b.h(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nul/e1$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f138845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f138846b;

        public b(x xVar, u0 u0Var) {
            this.f138845a = xVar;
            this.f138846b = u0Var;
        }

        @Override // p076m2.r0
        public void j() {
            this.f138845a.b(this.f138846b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nul/e1$c", "Lm7/l;", "Loq/i0;", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f138847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f138848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0 f138849c;

        public c(k kVar, x xVar, u0 u0Var) {
            this.f138847a = kVar;
            this.f138848b = xVar;
            this.f138849c = u0Var;
        }

        @Override // m7.l
        public void a() {
            this.f138848b.b(this.f138849c);
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
    @SuppressLint({"RememberReturnType"})
    public static final void g(boolean z15, final p<g<BackEventCompat>, ? super e<i0>, ? extends Object> pVar, r rVar, final int i15, final int i16) {
        boolean z16;
        int i17;
        final boolean z17;
        r rVarH = rVar.h(-642000585);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            z16 = z15;
        } else if ((i15 & 6) == 0) {
            z16 = z15;
            i17 = (rVarH.a(z16) ? 4 : 2) | i15;
        } else {
            z16 = z15;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            z17 = i18 != 0 ? true : z16;
            if (t.k()) {
                t.o(-642000585, i17, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:118)");
            }
            Object objC = ia.g.f90558a.c(rVarH, ia.g.f90560c);
            if (objC == null) {
                rVarH.X(1512740606);
                objC = w0.f138887a.c(rVarH, 6);
                rVarH.R();
            } else {
                rVarH.X(1512737723);
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
            Object objE2 = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = Function0.i(j.f191408a, rVarH);
                rVarH.v(objE2);
            }
            p0 p0Var = (p0) objE2;
            long jB = m.b(rVarH, 0);
            boolean zW2 = rVarH.W(xVar) | rVarH.d(jB);
            Object objE3 = rVarH.E();
            if (zW2 || objE3 == companion.a()) {
                objE3 = new u0(p0Var, new PredictiveBackHandlerInfo(objC, jB));
                rVarH.v(objE3);
            }
            final u0 u0Var = (u0) objE3;
            if (CON.a.isOnBackPressedLifecycleOrderMaintained) {
                rVarH.X(-348514256);
                boolean zG = rVarH.G(u0Var) | rVarH.G(pVar);
                Object objE4 = rVarH.E();
                if (zG || objE4 == companion.a()) {
                    objE4 = new er.a() { // from class: nul.y0
                        @Override // er.a
                        public final Object a() {
                            return e1.h(u0Var, pVar);
                        }
                    };
                    rVarH.v(objE4);
                }
                Function0.g((er.a) objE4, rVarH, 0);
                Boolean boolValueOf = Boolean.valueOf(z17);
                int i19 = i17 & 14;
                boolean zG2 = rVarH.G(u0Var) | (i19 == 4);
                Object objE5 = rVarH.E();
                if (zG2 || objE5 == companion.a()) {
                    objE5 = new er.l() { // from class: nul.z0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return e1.i(u0Var, z17, (k) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                m7.j.m(boolValueOf, u0Var, null, (er.l) objE5, rVarH, i19, 4);
                boolean zG3 = rVarH.G(xVar) | rVarH.G(u0Var);
                Object objE6 = rVarH.E();
                if (zG3 || objE6 == companion.a()) {
                    objE6 = new er.l() { // from class: nul.a1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return e1.j(xVar, u0Var, (p076m2.s0) obj);
                        }
                    };
                    rVarH.v(objE6);
                }
                Function0.b(xVar, u0Var, (er.l) objE6, rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(-347849492);
                boolean zG4 = rVarH.G(u0Var) | ((i17 & 14) == 4) | rVarH.G(pVar);
                Object objE7 = rVarH.E();
                if (zG4 || objE7 == companion.a()) {
                    objE7 = new er.a() { // from class: nul.b1
                        @Override // er.a
                        public final Object a() {
                            return e1.k(u0Var, z17, pVar);
                        }
                    };
                    rVarH.v(objE7);
                }
                Function0.g((er.a) objE7, rVarH, 0);
                boolean zG5 = rVarH.G(xVar) | rVarH.G(u0Var);
                Object objE8 = rVarH.E();
                if (zG5 || objE8 == companion.a()) {
                    objE8 = new er.l() { // from class: nul.c1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return e1.l(xVar, u0Var, (k) obj);
                        }
                    };
                    rVarH.v(objE8);
                }
                m7.j.m(xVar, u0Var, null, (er.l) objE8, rVarH, 0, 4);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            z17 = z16;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: nul.d1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e1.m(z17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(u0 u0Var, p pVar) {
        u0Var.l(pVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l i(u0 u0Var, boolean z15, k kVar) {
        u0Var.h(z15);
        return new a(kVar, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 j(x xVar, u0 u0Var, p076m2.s0 s0Var) {
        xVar.a(u0Var);
        return new b(xVar, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(u0 u0Var, boolean z15, p pVar) {
        u0Var.h(z15);
        u0Var.l(pVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l l(x xVar, u0 u0Var, k kVar) {
        xVar.a(u0Var);
        return new c(kVar, xVar, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(boolean z15, p pVar, int i15, int i16, r rVar, int i17) {
        g(z15, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
