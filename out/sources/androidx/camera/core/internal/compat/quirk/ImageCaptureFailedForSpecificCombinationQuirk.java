package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import o.j2;
import o.m1;
import o.t0;
import v.c3;
import v.w3;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f9266b = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    private static boolean c() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean d() {
        return "google".equalsIgnoreCase(Build.BRAND) && f9266b.contains(Build.MODEL.toLowerCase());
    }

    private boolean e(Collection<j2> collection) {
        if (collection.size() != 3) {
            return false;
        }
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (j2 j2Var : collection) {
            if (j2Var instanceof m1) {
                z15 = true;
            } else if (j2Var instanceof t0) {
                z17 = true;
            } else if (j2Var.l().h(w3.L)) {
                z16 = j2Var.l().W() == x3.b.VIDEO_CAPTURE;
            }
        }
        return z15 && z16 && z17;
    }

    static boolean f() {
        return c() || d();
    }

    private boolean h(String str, Collection<j2> collection) {
        return str.equals("1") && e(collection);
    }

    private boolean i(String str, Collection<j2> collection) {
        return str.equals("1") && e(collection);
    }

    public boolean g(String str, Collection<j2> collection) {
        if (c()) {
            return h(str, collection);
        }
        if (d()) {
            return i(str, collection);
        }
        return false;
    }
}
