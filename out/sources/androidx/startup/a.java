package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import db.b;
import db.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f13495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f13496e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f13499c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<Class<? extends db.a<?>>> f13498b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f13497a = new HashMap();

    a(Context context) {
        this.f13499c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends db.a<?>> cls, Set<Class<?>> set) {
        T t15;
        if (eb.a.h()) {
            try {
                eb.a.c(cls.getSimpleName());
            } catch (Throwable th4) {
                eb.a.f();
                throw th4;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f13497a.containsKey(cls)) {
            t15 = (T) this.f13497a.get(cls);
        } else {
            set.add(cls);
            try {
                db.a<?> aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends db.a<?>>> listA = aVarNewInstance.a();
                if (!listA.isEmpty()) {
                    for (Class<? extends db.a<?>> cls2 : listA) {
                        if (!this.f13497a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t15 = (T) aVarNewInstance.b(this.f13499c);
                set.remove(cls);
                this.f13497a.put(cls, t15);
            } catch (Throwable th5) {
                throw new c(th5);
            }
        }
        eb.a.f();
        return t15;
    }

    public static a e(Context context) {
        if (f13495d == null) {
            synchronized (f13496e) {
                try {
                    if (f13495d == null) {
                        f13495d = new a(context);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return f13495d;
    }

    void a(Bundle bundle) {
        String string = this.f13499c.getString(b.f40600a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (db.a.class.isAssignableFrom(cls)) {
                            this.f13498b.add((Class<? extends db.a<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends db.a<?>>> it = this.f13498b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e15) {
                throw new c(e15);
            }
        }
    }

    void b(Class<? extends InitializationProvider> cls) {
        try {
            try {
                eb.a.c("Startup");
                a(this.f13499c.getPackageManager().getProviderInfo(new ComponentName(this.f13499c, cls), 128).metaData);
                eb.a.f();
            } catch (PackageManager.NameNotFoundException e15) {
                throw new c(e15);
            }
        } catch (Throwable th4) {
            eb.a.f();
            throw th4;
        }
    }

    <T> T c(Class<? extends db.a<?>> cls) {
        T t15;
        synchronized (f13496e) {
            try {
                t15 = (T) this.f13497a.get(cls);
                if (t15 == null) {
                    t15 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t15;
    }

    public <T> T f(Class<? extends db.a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends db.a<?>> cls) {
        return this.f13498b.contains(cls);
    }
}
