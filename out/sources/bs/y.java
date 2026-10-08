package bs;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import vr.w1;
import vr.x1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends u implements j, a0, qs.q {
    @Override // qs.s
    public boolean C() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // qs.d
    public boolean F() {
        return false;
    }

    @Override // qs.s
    public boolean G() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // qs.d
    public /* bridge */ /* synthetic */ qs.a H(zs.c cVar) {
        return H(cVar);
    }

    @Override // qs.q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public q S() {
        return new q(U().getDeclaringClass());
    }

    public abstract Member U();

    protected final List<qs.b0> V(Type[] typeArr, Annotation[][] annotationArr, boolean z15) {
        String str;
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> listB = c.f21221a.b(U());
        int size = listB != null ? listB.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i15 = 0;
        while (i15 < length) {
            e0 e0VarA = e0.f21231a.a(typeArr[i15]);
            if (listB != null) {
                str = (String) pq.v.o0(listB, i15 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i15 + '+' + size + " (name=" + getName() + " type=" + e0VarA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new g0(e0VarA, annotationArr[i15], str, z15 && i15 == pq.n.v0(typeArr)));
            i15++;
        }
        return arrayList;
    }

    @Override // bs.j
    public AnnotatedElement b() {
        return (AnnotatedElement) U();
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && fr.t.c(U(), ((y) obj).U());
    }

    @Override // qs.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // bs.a0
    public int getModifiers() {
        return U().getModifiers();
    }

    @Override // qs.t
    public zs.f getName() {
        zs.f fVarL;
        String name = U().getName();
        return (name == null || (fVarL = zs.f.l(name)) == null) ? zs.h.f236656b : fVarL;
    }

    @Override // qs.s
    public x1 h() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return w1.h.f208104c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return w1.e.f208101c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? zr.c.f236403c : zr.b.f236402c;
        }
        return zr.a.f236401c;
    }

    public int hashCode() {
        return U().hashCode();
    }

    @Override // qs.s
    public boolean k() {
        return Modifier.isStatic(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + U();
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
