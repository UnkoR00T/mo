package androidx.p016lifecycle;

import fu.r;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/lifecycle/x;", "", "<init>", "()V", "object", "Landroidx/lifecycle/n;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/n;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/g;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/g;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "d", "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "className", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f12852a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, List<Constructor<? extends g>>> classToAdapters = new HashMap();

    private x() {
    }

    private final g a(Constructor<? extends g> constructor, Object object) {
        try {
            return constructor.newInstance(object);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException(e15);
        } catch (InstantiationException e16) {
            throw new RuntimeException(e16);
        } catch (InvocationTargetException e17) {
            throw new RuntimeException(e17);
        }
    }

    private final Constructor<? extends g> b(Class<?> klass) {
        try {
            Package r15 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            String name = r15 != null ? r15.getName() : "";
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Constructor declaredConstructor = Class.forName(strC).getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e15) {
            throw new RuntimeException(e15);
        }
    }

    public static final String c(String className) {
        return r.P(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> klass) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(klass);
        map.put(klass, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> klass) {
        return klass != null && p.class.isAssignableFrom(klass);
    }

    public static final n f(Object object) {
        boolean z15 = object instanceof n;
        boolean z16 = object instanceof DefaultLifecycleObserver;
        if (z15 && z16) {
            return new e((DefaultLifecycleObserver) object, (n) object);
        }
        if (z16) {
            return new e((DefaultLifecycleObserver) object, null);
        }
        if (z15) {
            return (n) object;
        }
        Class<?> cls = object.getClass();
        x xVar = f12852a;
        if (xVar.d(cls) != 2) {
            return new f0(object);
        }
        List<Constructor<? extends g>> list = classToAdapters.get(cls);
        if (list.size() == 1) {
            return new s0(xVar.a(list.get(0), object));
        }
        int size = list.size();
        g[] gVarArr = new g[size];
        for (int i15 = 0; i15 < size; i15++) {
            gVarArr[i15] = f12852a.a(list.get(i15), object);
        }
        return new d(gVarArr);
    }

    private final int g(Class<?> klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends g> constructorB = b(klass);
        if (constructorB != null) {
            classToAdapters.put(klass, v.e(constructorB));
            return 2;
        }
        if (c.f12723c.d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (!e(superclass)) {
            arrayList = null;
        } else {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(classToAdapters.get(superclass));
        }
        for (Class<?> cls : klass.getInterfaces()) {
            if (e(cls)) {
                if (d(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(classToAdapters.get(cls));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }
}
