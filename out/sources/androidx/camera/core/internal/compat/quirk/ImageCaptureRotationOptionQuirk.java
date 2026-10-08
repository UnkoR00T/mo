package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import v.c3;
import v.n1;
import v.p1;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk implements c3 {
    private static boolean c() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean d() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean f() {
        return d() || c();
    }

    public boolean e(p1.a<?> aVar) {
        return aVar != n1.f202707i;
    }
}
