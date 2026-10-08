package v;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f3 implements p105prN.o2<Context, d3> {

    public static class a extends Service {
        private a() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    private static d3 b(Context context, Bundle bundle) {
        boolean z15 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrC = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrC2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        o.e1.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        o.e1.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z15);
        o.e1.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrC));
        o.e1.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrC2));
        return new d3.b().d(z15).c(e(strArrC)).b(e(strArrC2)).a();
    }

    private static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i15 = bundle.getInt(str, -1);
        if (i15 == -1) {
            o.e1.o("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i15);
        } catch (Resources.NotFoundException e15) {
            o.e1.p("QuirkSettingsLoader", "Quirk class names resource not found: " + i15, e15);
            return new String[0];
        }
    }

    private static Class<? extends c3> d(String str) {
        try {
            Class cls = Class.forName(str);
            if (c3.class.isAssignableFrom(cls)) {
                return cls;
            }
            o.e1.o("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e15) {
            o.e1.p("QuirkSettingsLoader", "Class not found: " + str, e15);
            return null;
        }
    }

    private static Set<Class<? extends c3>> e(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends c3> clsD = d(str);
            if (clsD != null) {
                hashSet.add(clsD);
            }
        }
        return hashSet;
    }

    @Override // p105prN.o2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d3 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            o.e1.o("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            o.e1.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
