package yr;

import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 extends w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f228948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected rt.j<ft.g<?>> f228949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected er.a<rt.j<ft.g<?>>> f228950h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(vr.m mVar, wr.h hVar, zs.f fVar, st.t0 t0Var, boolean z15, h1 h1Var) {
        super(mVar, hVar, fVar, t0Var, h1Var);
        if (mVar == null) {
            m0(0);
        }
        if (hVar == null) {
            m0(1);
        }
        if (fVar == null) {
            m0(2);
        }
        if (h1Var == null) {
            m0(3);
        }
        this.f228948f = z15;
    }

    private static /* synthetic */ void m0(int i15) {
        Object[] objArr = new Object[3];
        if (i15 == 1) {
            objArr[0] = "annotations";
        } else if (i15 == 2) {
            objArr[0] = "name";
        } else if (i15 == 3) {
            objArr[0] = "source";
        } else if (i15 == 4 || i15 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i15 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i15 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // vr.u1
    public boolean Q() {
        return this.f228948f;
    }

    public void Q0(rt.j<ft.g<?>> jVar, er.a<rt.j<ft.g<?>>> aVar) {
        if (aVar == null) {
            m0(5);
        }
        this.f228950h = aVar;
        if (jVar == null) {
            jVar = aVar.a();
        }
        this.f228949g = jVar;
    }

    public void R0(er.a<rt.j<ft.g<?>>> aVar) {
        if (aVar == null) {
            m0(4);
        }
        Q0(null, aVar);
    }

    @Override // vr.u1
    public ft.g<?> s0() {
        rt.j<ft.g<?>> jVar = this.f228949g;
        if (jVar != null) {
            return jVar.a();
        }
        return null;
    }
}
