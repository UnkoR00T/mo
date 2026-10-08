package mr;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmr/p;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "(Lmr/p;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "Lmr/r;", "arguments", "e", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "h", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "f", "(Lmr/p;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lmr/p;)V", "javaType", "g", "(Lmr/r;)Ljava/lang/reflect/Type;", "(Lmr/r;)V", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127921a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127921a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<Class<?>, Class<?>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f127922j = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Class<?> b(Class<?> cls) {
            return cls.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(p pVar, boolean z15) {
        e eVarD = pVar.d();
        TypeVariable<?> typeVariable = null;
        if (eVarD instanceof q) {
            if (!(eVarD instanceof fr.v)) {
                return new t((q) eVarD);
            }
            fr.v vVar = (fr.v) eVarD;
            GenericDeclaration genericDeclarationA = vVar.a();
            if (genericDeclarationA == null) {
                throw new UnsupportedOperationException("javaType is not supported for this type: " + pVar);
            }
            boolean z16 = false;
            for (TypeVariable<?> typeVariable2 : genericDeclarationA.getTypeParameters()) {
                if (fr.t.c(typeVariable2.getName(), vVar.getName())) {
                    if (z16) {
                        throw new IllegalArgumentException("Array contains more than one matching element.");
                    }
                    z16 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z16) {
                return typeVariable;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        if (!(eVarD instanceof c)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + pVar);
        }
        c cVar = (c) eVarD;
        Class clsC = z15 ? dr.a.c(cVar) : dr.a.b(cVar);
        List<r> listE = pVar.e();
        if (listE.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listE);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        r rVar = (r) pq.v.R0(listE);
        if (rVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + pVar);
        }
        s variance = rVar.getVariance();
        p type = rVar.getType();
        int i15 = variance == null ? -1 : a.f127921a[variance.ordinal()];
        if (i15 == -1 || i15 == 1) {
            return clsC;
        }
        if (i15 != 2 && i15 != 3) {
            throw new oq.p();
        }
        Type typeD = d(type, false, 1, null);
        return typeD instanceof Class ? clsC : new mr.a(typeD);
    }

    static /* synthetic */ Type d(p pVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return c(pVar, z15);
    }

    private static final Type e(Class<?> cls, List<r> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<r> list2 = list;
            ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((r) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<r> list3 = list;
            ArrayList arrayList2 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList2.add(g((r) it4.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List<r> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(pq.v.y(listSubList, 10));
        Iterator<T> it5 = listSubList.iterator();
        while (it5.hasNext()) {
            arrayList3.add(g((r) it5.next()));
        }
        return new u(cls, typeE, arrayList3);
    }

    public static final Type f(p pVar) {
        Type typeA;
        return (!(pVar instanceof fr.u) || (typeA = ((fr.u) pVar).a()) == null) ? d(pVar, false, 1, null) : typeA;
    }

    private static final Type g(r rVar) {
        s sVarD = rVar.d();
        if (sVarD == null) {
            return w.f127923c.a();
        }
        p pVarC = rVar.c();
        int i15 = a.f127921a[sVarD.ordinal()];
        if (i15 == 1) {
            return new w(null, c(pVarC, true));
        }
        if (i15 == 2) {
            return c(pVarC, true);
        }
        if (i15 == 3) {
            return new w(c(pVarC, true), null);
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        eu.h hVarO = eu.k.o(type, b.f127922j);
        return ((Class) eu.k.G(hVarO)).getName() + fu.r.L("[]", eu.k.v(hVarO));
    }
}
