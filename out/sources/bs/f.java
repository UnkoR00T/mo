package bs;

import fr.q0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pq.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<mr.c<? extends Object>> f21232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f21233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f21234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Class<? extends oq.e<?>>, Integer> f21235d;

    static {
        int i15 = 0;
        List<mr.c<? extends Object>> listQ = pq.v.q(q0.c(Boolean.TYPE), q0.c(Byte.TYPE), q0.c(Character.TYPE), q0.c(Double.TYPE), q0.c(Float.TYPE), q0.c(Integer.TYPE), q0.c(Long.TYPE), q0.c(Short.TYPE));
        f21232a = listQ;
        List<mr.c<? extends Object>> list = listQ;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            mr.c cVar = (mr.c) it.next();
            arrayList.add(oq.y.a(dr.a.c(cVar), dr.a.d(cVar)));
        }
        f21233b = v0.s(arrayList);
        List<mr.c<? extends Object>> list2 = f21232a;
        ArrayList arrayList2 = new ArrayList(pq.v.y(list2, 10));
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            mr.c cVar2 = (mr.c) it4.next();
            arrayList2.add(oq.y.a(dr.a.d(cVar2), dr.a.c(cVar2)));
        }
        f21234c = v0.s(arrayList2);
        List listQ2 = pq.v.q(er.a.class, er.l.class, er.p.class, er.q.class, er.r.class, er.s.class, er.t.class, er.u.class, er.v.class, er.w.class, er.b.class, er.c.class, er.d.class, er.e.class, er.f.class, er.g.class, er.h.class, er.i.class, er.j.class, er.k.class, er.m.class, er.n.class, er.o.class);
        ArrayList arrayList3 = new ArrayList(pq.v.y(listQ2, 10));
        for (Object obj : listQ2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            arrayList3.add(oq.y.a((Class) obj, Integer.valueOf(i15)));
            i15 = i16;
        }
        f21235d = v0.s(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eu.h b(ParameterizedType parameterizedType) {
        return pq.n.a0(parameterizedType.getActualTypeArguments());
    }

    public static final zs.b e(Class<?> cls) {
        zs.b bVarE;
        zs.b bVarD;
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return (declaringClass == null || (bVarE = e(declaringClass)) == null || (bVarD = bVarE.d(zs.f.l(cls.getSimpleName()))) == null) ? zs.b.f236634d.c(new zs.c(cls.getName())) : bVarD;
        }
        zs.c cVar = new zs.c(cls.getName());
        return new zs.b(cVar.d(), zs.c.f236638c.a(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String f(Class<?> cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return fu.r.O(cls.getName(), '.', '/', false, 4, null);
            }
            return 'L' + fu.r.O(cls.getName(), '.', '/', false, 4, null) + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return ip.a.f96138c;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return ip.a.f96137b;
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class<?> cls) {
        return f21235d.get(cls);
    }

    public static final List<Type> h(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return pq.v.n();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return parameterizedType.getOwnerType() == null ? pq.n.n1(parameterizedType.getActualTypeArguments()) : eu.k.P(eu.k.C(eu.k.o(type, d.f21228a), e.f21230a));
    }

    public static final Class<?> i(Class<?> cls) {
        return f21233b.get(cls);
    }

    public static final ClassLoader j(Class<?> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public static final Class<?> k(Class<?> cls) {
        return f21234c.get(cls);
    }

    public static final boolean l(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
