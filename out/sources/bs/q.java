package bs;

import fr.u0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import vr.w1;
import vr.x1;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends u implements j, a0, qs.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f21256a;

    static final /* synthetic */ class a extends fr.q implements er.l<Member, Boolean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f21257j = new a();

        a() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Boolean b(Member member) {
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    static final /* synthetic */ class b extends fr.q implements er.l<Constructor<?>, t> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f21258j = new b();

        b() {
            super(1, t.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final t b(Constructor<?> constructor) {
            return new t(constructor);
        }
    }

    static final /* synthetic */ class c extends fr.q implements er.l<Member, Boolean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c f21259j = new c();

        c() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Boolean b(Member member) {
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    static final /* synthetic */ class d extends fr.q implements er.l<Field, w> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f21260j = new d();

        d() {
            super(1, w.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final w b(Field field) {
            return new w(field);
        }
    }

    static final /* synthetic */ class e extends fr.q implements er.l<Method, z> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final e f21261j = new e();

        e() {
            super(1, z.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final z b(Method method) {
            return new z(method);
        }
    }

    public q(Class<?> cls) {
        this.f21256a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T(Class cls) {
        return cls.getSimpleName().length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zs.f U(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!zs.f.o(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return zs.f.l(simpleName);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        return (qVar.x() && qVar.f0(method)) ? false : true;
    }

    private final boolean f0(Method method) {
        String name = method.getName();
        if (fr.t.c(name, "values")) {
            return method.getParameterTypes().length == 0;
        }
        if (fr.t.c(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // qs.g
    public boolean A() {
        Boolean boolF = bs.b.f21214a.f(this.f21256a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

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

    @Override // qs.g
    public boolean N() {
        return this.f21256a.isInterface();
    }

    @Override // qs.g
    public qs.d0 O() {
        return null;
    }

    @Override // qs.g
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public List<t> p() {
        return eu.k.P(eu.k.H(eu.k.y(pq.n.a0(this.f21256a.getDeclaredConstructors()), a.f21257j), b.f21258j));
    }

    @Override // bs.j
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Class<?> b() {
        return this.f21256a;
    }

    @Override // qs.g
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public List<w> z() {
        return eu.k.P(eu.k.H(eu.k.y(pq.n.a0(this.f21256a.getDeclaredFields()), c.f21259j), d.f21260j));
    }

    @Override // qs.g
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public List<zs.f> D() {
        return eu.k.P(eu.k.J(eu.k.y(pq.n.a0(this.f21256a.getDeclaredClasses()), n.f21253a), o.f21254a));
    }

    @Override // qs.g
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public List<z> E() {
        return eu.k.P(eu.k.H(eu.k.x(pq.n.a0(this.f21256a.getDeclaredMethods()), new p(this)), e.f21261j));
    }

    @Override // qs.g
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public q r() {
        Class<?> declaringClass = this.f21256a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && fr.t.c(this.f21256a, ((q) obj).f21256a);
    }

    @Override // qs.g
    public zs.c g() {
        return f.e(this.f21256a).a();
    }

    @Override // qs.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // bs.a0
    public int getModifiers() {
        return this.f21256a.getModifiers();
    }

    @Override // qs.t
    public zs.f getName() {
        return this.f21256a.isAnonymousClass() ? zs.f.l(fu.r.k1(this.f21256a.getName(), ".", null, 2, null)) : zs.f.l(this.f21256a.getSimpleName());
    }

    @Override // qs.z
    public List<f0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f21256a.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
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
        return this.f21256a.hashCode();
    }

    @Override // qs.s
    public boolean k() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // qs.g
    public Collection<qs.j> q() {
        if (fr.t.c(this.f21256a, Object.class)) {
            return pq.v.n();
        }
        u0 u0Var = new u0(2);
        Type genericSuperclass = this.f21256a.getGenericSuperclass();
        u0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        u0Var.b(this.f21256a.getGenericInterfaces());
        List listQ = pq.v.q(u0Var.d(new Type[u0Var.c()]));
        ArrayList arrayList = new ArrayList(pq.v.y(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((Type) it.next()));
        }
        return arrayList;
    }

    @Override // qs.g
    public Collection<qs.w> s() {
        Object[] objArrD = bs.b.f21214a.d(this.f21256a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new d0(obj));
        }
        return arrayList;
    }

    @Override // qs.g
    public boolean t() {
        return this.f21256a.isAnnotation();
    }

    public String toString() {
        return q.class.getName() + ": " + this.f21256a;
    }

    @Override // qs.g
    public boolean u() {
        Boolean boolE = bs.b.f21214a.e(this.f21256a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // qs.g
    public boolean v() {
        return false;
    }

    @Override // qs.g
    public boolean x() {
        return this.f21256a.isEnum();
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
