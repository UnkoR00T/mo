package bs;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends u implements j, qs.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeVariable<?> f21236a;

    public f0(TypeVariable<?> typeVariable) {
        this.f21236a = typeVariable;
    }

    @Override // qs.d
    public boolean F() {
        return false;
    }

    @Override // qs.d
    public /* bridge */ /* synthetic */ qs.a H(zs.c cVar) {
        return H(cVar);
    }

    @Override // qs.y
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<s> getUpperBounds() {
        Type[] bounds = this.f21236a.getBounds();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new s(type));
        }
        s sVar = (s) pq.v.R0(arrayList);
        return fr.t.c(sVar != null ? sVar.T() : null, Object.class) ? pq.v.n() : arrayList;
    }

    @Override // bs.j
    public AnnotatedElement b() {
        TypeVariable<?> typeVariable = this.f21236a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f0) && fr.t.c(this.f21236a, ((f0) obj).f21236a);
    }

    @Override // qs.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // qs.t
    public zs.f getName() {
        return zs.f.l(this.f21236a.getName());
    }

    public int hashCode() {
        return this.f21236a.hashCode();
    }

    public String toString() {
        return f0.class.getName() + ": " + this.f21236a;
    }

    @Override // bs.j, qs.d
    public g H(zs.c cVar) {
        Annotation[] declaredAnnotations;
        AnnotatedElement annotatedElementB = b();
        if (annotatedElementB == null || (declaredAnnotations = annotatedElementB.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }

    @Override // bs.j, qs.d
    public List<g> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<g> listB;
        AnnotatedElement annotatedElementB = b();
        return (annotatedElementB == null || (declaredAnnotations = annotatedElementB.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? pq.v.n() : listB;
    }
}
