package yk;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.c2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f227482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<T> f227483b;

    private static class b implements c<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f227484a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    c2.g("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f227484a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                c2.g("ComponentDiscovery", this.f227484a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                c2.g("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // yk.f.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                c2.g("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f227484a = cls;
        }
    }

    interface c<T> {
        List<String> a(T t15);
    }

    f(T t15, c<T> cVar) {
        this.f227482a = t15;
        this.f227483b = cVar;
    }

    public static f<Context> c(Context context, Class<? extends Service> cls) {
        return new f<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            c2.g("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e15) {
            throw new v(String.format("Could not instantiate %s.", str), e15);
        } catch (InstantiationException e16) {
            throw new v(String.format("Could not instantiate %s.", str), e16);
        } catch (NoSuchMethodException e17) {
            throw new v(String.format("Could not instantiate %s", str), e17);
        } catch (InvocationTargetException e18) {
            throw new v(String.format("Could not instantiate %s", str), e18);
        }
    }

    public List<kl.b<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f227483b.a(this.f227482a)) {
            arrayList.add(new kl.b() { // from class: yk.e
                @Override // kl.b
                public final Object get() {
                    return f.d(str);
                }
            });
        }
        return arrayList;
    }
}
