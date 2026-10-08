package l0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f113945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f113946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f113947c;

    public e(Context context) {
        this.f113945a = context;
        if (Build.VERSION.SDK_INT >= 35) {
            this.f113947c = new c(context);
        }
        this.f113946b = b();
    }

    private f b() {
        String string;
        try {
            ServiceInfo[] serviceInfoArr = this.f113945a.getPackageManager().getPackageInfo(this.f113945a.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return null;
            }
            String str = null;
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                    if (str != null) {
                        throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                    }
                    str = string;
                }
            }
            if (str == null) {
                return null;
            }
            return c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private f c(String str) {
        try {
            return (f) Class.forName(str).getConstructor(Context.class).newInstance(this.f113945a);
        } catch (Exception e15) {
            throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e15);
        }
    }

    public d a(String str) {
        ArrayList arrayList = new ArrayList();
        f fVar = this.f113946b;
        if (fVar != null) {
            arrayList.add(fVar.a(str));
        }
        f fVar2 = this.f113947c;
        if (fVar2 != null) {
            try {
                arrayList.add(fVar2.a(str));
            } catch (UnsupportedOperationException unused) {
            }
        }
        return new a(arrayList);
    }
}
