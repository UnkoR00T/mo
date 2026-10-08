package js;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n0<T> implements l0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<zs.c, T> f104715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.f f104716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.h<zs.c, T> f104717d;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(Map<zs.c, ? extends T> map) {
        this.f104715b = map;
        rt.f fVar = new rt.f("Java nullability annotation states");
        this.f104716c = fVar;
        this.f104717d = fVar.a(new m0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(n0 n0Var, zs.c cVar) {
        return zs.e.a(cVar, n0Var.f104715b);
    }

    @Override // js.l0
    public T a(zs.c cVar) {
        return this.f104717d.b(cVar);
    }
}
