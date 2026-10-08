package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<String, Class<?>> f95128h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f95129a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f95130b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f95131c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f95132d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f95133e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f95134f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b4 f95135g = null;

    static {
        HashMap map = new HashMap();
        f95128h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    private boolean j(Object obj, Class<?> cls) {
        Class<?> cls2 = f95128h.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public void a(List<b> list) {
        if (list != null) {
            this.f95130b.addAll(list);
        }
    }

    public void b() {
        g1 g1VarA = this.f95131c.a();
        try {
            Iterator<Map.Entry<String, Object>> it = this.f95129a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                    it.remove();
                }
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public Object c(String str) {
        g1 g1VarA = this.f95131c.a();
        try {
            Object obj = this.f95129a.get(str);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return obj;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public <T> T d(String str, Class<T> cls) {
        g1 g1VarA = this.f95131c.a();
        try {
            T t15 = (T) this.f95129a.get(str);
            if (cls.isInstance(t15)) {
                if (g1VarA != null) {
                    g1VarA.close();
                    return t15;
                }
            } else {
                if (!j(t15, cls)) {
                    if (g1VarA != null) {
                        g1VarA.close();
                    }
                    return null;
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            }
            return t15;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public List<b> e() {
        return new ArrayList(this.f95130b);
    }

    public b4 f() {
        return this.f95135g;
    }

    public b g() {
        return this.f95132d;
    }

    public b h() {
        return this.f95134f;
    }

    public b i() {
        return this.f95133e;
    }

    public void k(String str, Object obj) {
        g1 g1VarA = this.f95131c.a();
        try {
            this.f95129a.put(str, obj);
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public void l(b4 b4Var) {
        this.f95135g = b4Var;
    }

    public void m(b bVar) {
        this.f95132d = bVar;
    }

    public void n(b bVar) {
        this.f95134f = bVar;
    }

    public void o(b bVar) {
        this.f95133e = bVar;
    }
}
