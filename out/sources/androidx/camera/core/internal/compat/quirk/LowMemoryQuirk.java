package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f9270b = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean c() {
        return f9270b.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
