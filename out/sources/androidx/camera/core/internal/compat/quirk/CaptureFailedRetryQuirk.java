package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Pair<String, String>> f9265b = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    static boolean d() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f9265b.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    public int c() {
        return 1;
    }
}
