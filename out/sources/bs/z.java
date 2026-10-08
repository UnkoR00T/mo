package bs;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends y implements qs.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f21269a;

    public z(Method method) {
        this.f21269a = method;
    }

    @Override // qs.r
    public boolean Q() {
        return n() != null;
    }

    @Override // bs.y
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Method U() {
        return this.f21269a;
    }

    @Override // qs.r
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public e0 f() {
        return e0.f21231a.a(U().getGenericReturnType());
    }

    @Override // qs.z
    public List<f0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = U().getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }

    @Override // qs.r
    public List<qs.b0> l() {
        return V(U().getGenericParameterTypes(), U().getParameterAnnotations(), U().isVarArgs());
    }

    @Override // qs.r
    public qs.b n() {
        Object defaultValue = U().getDefaultValue();
        if (defaultValue != null) {
            return h.f21242b.a(defaultValue, null);
        }
        return null;
    }
}
