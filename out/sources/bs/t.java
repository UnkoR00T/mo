package bs;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends y implements qs.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Constructor<?> f21265a;

    public t(Constructor<?> constructor) {
        this.f21265a = constructor;
    }

    @Override // bs.y
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Constructor<?> U() {
        return this.f21265a;
    }

    @Override // qs.z
    public List<f0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = U().getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }

    @Override // qs.k
    public List<qs.b0> l() {
        Type[] genericParameterTypes = U().getGenericParameterTypes();
        if (genericParameterTypes.length == 0) {
            return pq.v.n();
        }
        Class<?> declaringClass = U().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) pq.n.v(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = U().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                parameterAnnotations = (Annotation[][]) pq.n.v(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            return V(genericParameterTypes, parameterAnnotations, U().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + U());
    }
}
