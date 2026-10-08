package bs;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends u implements qs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotation f21237a;

    public g(Annotation annotation) {
        this.f21237a = annotation;
    }

    @Override // qs.a
    public boolean K() {
        return false;
    }

    public final Annotation T() {
        return this.f21237a;
    }

    @Override // qs.a
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public q c() {
        return new q(dr.a.b(dr.a.a(this.f21237a)));
    }

    @Override // qs.a
    public Collection<qs.b> e() {
        Method[] declaredMethods = dr.a.b(dr.a.a(this.f21237a)).getDeclaredMethods();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(h.f21242b.a(method.invoke(this.f21237a, null), zs.f.l(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f21237a == ((g) obj).f21237a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f21237a);
    }

    @Override // qs.a
    public zs.b i() {
        return f.e(dr.a.b(dr.a.a(this.f21237a)));
    }

    @Override // qs.a
    public boolean j() {
        return false;
    }

    public String toString() {
        return g.class.getName() + ": " + this.f21237a;
    }
}
