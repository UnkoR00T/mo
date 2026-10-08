package jp;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f104305c = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Class<? extends n>> f104306a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<? extends g>, Class<? extends n>> f104307b = new HashMap();

    private o() {
        c("Standard", s.class, r.class);
        c("Adobe.PubSec", k.class, i.class);
    }

    private n a(Class<? extends n> cls, Class<?>[] clsArr, Object[] objArr) {
        try {
            return cls.getDeclaredConstructor(clsArr).newInstance(objArr);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException(e15);
        } catch (InstantiationException e16) {
            throw new RuntimeException(e16);
        } catch (NoSuchMethodException e17) {
            throw new RuntimeException(e17);
        } catch (InvocationTargetException e18) {
            throw new RuntimeException(e18);
        }
    }

    public n b(String str) {
        Class<? extends n> cls = this.f104306a.get(str);
        if (cls == null) {
            return null;
        }
        return a(cls, new Class[0], new Object[0]);
    }

    public void c(String str, Class<? extends n> cls, Class<? extends g> cls2) {
        if (this.f104306a.containsKey(str)) {
            throw new IllegalStateException("The security handler name is already registered");
        }
        this.f104306a.put(str, cls);
        this.f104307b.put(cls2, cls);
    }
}
