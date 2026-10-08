package pe;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import io.sentry.android.core.c2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f157071a;

    public d(Context context) {
        this.f157071a = context;
    }

    private ApplicationInfo a() {
        return this.f157071a.getPackageManager().getApplicationInfo(this.f157071a.getPackageName(), 128);
    }

    private static b c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e15) {
                d(cls, e15);
            } catch (InstantiationException e16) {
                d(cls, e16);
            } catch (NoSuchMethodException e17) {
                d(cls, e17);
            } catch (InvocationTargetException e18) {
                d(cls, e18);
            }
            if (objNewInstance instanceof b) {
                return (b) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e19) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e19);
        }
    }

    private static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<b> b() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoA = a();
            if (applicationInfoA != null && applicationInfoA.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfoA.metaData);
                }
                for (String str : applicationInfoA.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoA.metaData.get(str))) {
                        arrayList.add(c(str));
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e15) {
            if (Log.isLoggable("ManifestParser", 6)) {
                c2.f("ManifestParser", "Failed to parse glide modules", e15);
            }
            return arrayList;
        }
    }
}
