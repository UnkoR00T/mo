package qr;

import fr.q0;
import fr.t;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import pq.g0;
import pq.v;
import pr.i3;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0016\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"", "Ljava/lang/Class;", "expectedType", "q", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "index", "", "name", "expectedJvmType", "", "p", "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Void;", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "g", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final <T> T g(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        oq.k kVarA = oq.l.a(new b(map));
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new d(cls, map, oq.l.a(new c(cls, map)), kVarA, list));
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(v.y(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    private static final <T> boolean i(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zEquals;
        boolean z15;
        mr.c cVarA;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (t.c((annotation == null || (cVarA = dr.a.a(annotation)) == null) ? null : dr.a.b(cVarA), cls)) {
            List<Method> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z15 = true;
            } else {
                for (Method method : list2) {
                    Object obj2 = map.get(method.getName());
                    Object objInvoke = method.invoke(obj, null);
                    if (obj2 instanceof boolean[]) {
                        zEquals = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        zEquals = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        zEquals = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        zEquals = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        zEquals = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        zEquals = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        zEquals = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        zEquals = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else {
                        zEquals = obj2 instanceof Object[] ? Arrays.equals((Object[]) obj2, (Object[]) objInvoke) : t.c(obj2, objInvoke);
                    }
                    if (!zEquals) {
                        z15 = false;
                    }
                }
                z15 = true;
            }
            if (z15) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Map map) {
        int iHashCode;
        int iHashCode2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) value);
            } else {
                iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
            }
            iHashCode2 += iHashCode ^ (str.hashCode() * CertificateBody.profileType);
        }
        return iHashCode2;
    }

    private static final int k(oq.k<Integer> kVar) {
        return kVar.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Class cls, Map map) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        sb5.append('@');
        sb5.append(cls.getCanonicalName());
        g0.s0(map.entrySet(), sb5, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : e.f168164a);
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        String string;
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
        } else {
            string = value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
        }
        return str + '=' + string;
    }

    private static final String n(oq.k<String> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Class cls, Map map, oq.k kVar, oq.k kVar2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(kVar2));
                }
            } else if (name.equals("toString")) {
                return n(kVar);
            }
        }
        if (t.c(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, pq.n.X0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Method is not supported: ");
        sb5.append(method);
        sb5.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb5.append(pq.n.n1(objArr));
        sb5.append(')');
        throw new i3(sb5.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void p(int i15, String str, Class<?> cls) {
        mr.c cVarC;
        String strC;
        if (t.c(cls, Class.class)) {
            cVarC = q0.c(mr.c.class);
        } else {
            cVarC = (cls.isArray() && t.c(cls.getComponentType(), Class.class)) ? q0.c(mr.c[].class) : dr.a.e(cls);
        }
        if (t.c(cVarC.C(), q0.c(Object[].class).C())) {
            strC = cVarC.C() + '<' + dr.a.e(dr.a.b(cVarC).getComponentType()).C() + '>';
        } else {
            strC = cVarC.C();
        }
        throw new IllegalArgumentException("Argument #" + i15 + ' ' + str + " is not of the required type " + strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof mr.c) {
            obj = dr.a.b((mr.c) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof mr.c[]) {
                mr.c[] cVarArr = (mr.c[]) obj;
                ArrayList arrayList = new ArrayList(cVarArr.length);
                for (mr.c cVar : cVarArr) {
                    arrayList.add(dr.a.b(cVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
