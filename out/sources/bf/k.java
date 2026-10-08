package bf;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import io.sentry.android.core.c2;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f19111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, m> f19112c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f19113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f19114b = null;

        a(Context context) {
            this.f19113a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                c2.g("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map<String, String> c() {
            if (this.f19114b == null) {
                this.f19114b = a(this.f19113a);
            }
            return this.f19114b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    c2.g("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                c2.g("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                c2.g("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e15) {
                c2.h("BackendRegistry", String.format("Class %s is not found.", str2), e15);
                return null;
            } catch (IllegalAccessException e16) {
                c2.h("BackendRegistry", String.format("Could not instantiate %s.", str2), e16);
                return null;
            } catch (InstantiationException e17) {
                c2.h("BackendRegistry", String.format("Could not instantiate %s.", str2), e17);
                return null;
            } catch (NoSuchMethodException e18) {
                c2.h("BackendRegistry", String.format("Could not instantiate %s", str2), e18);
                return null;
            } catch (InvocationTargetException e19) {
                c2.h("BackendRegistry", String.format("Could not instantiate %s", str2), e19);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // bf.e
    public synchronized m get(String str) {
        if (this.f19112c.containsKey(str)) {
            return this.f19112c.get(str);
        }
        d dVarB = this.f19110a.b(str);
        if (dVarB == null) {
            return null;
        }
        m mVarCreate = dVarB.create(this.f19111b.a(str));
        this.f19112c.put(str, mVarCreate);
        return mVarCreate;
    }

    k(a aVar, i iVar) {
        this.f19112c = new HashMap();
        this.f19110a = aVar;
        this.f19111b = iVar;
    }
}
