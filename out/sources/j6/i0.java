package j6;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<VelocityTracker, j0> f99689a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i15) {
            return velocityTracker.getAxisVelocity(i15);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f99689a.containsKey(velocityTracker)) {
                f99689a.put(velocityTracker, new j0());
            }
            f99689a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i15) {
        c(velocityTracker, i15, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i15, float f15) {
        velocityTracker.computeCurrentVelocity(i15, f15);
        j0 j0VarE = e(velocityTracker);
        if (j0VarE != null) {
            j0VarE.c(i15, f15);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i15) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i15);
        }
        if (i15 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i15 == 1) {
            return velocityTracker.getYVelocity();
        }
        j0 j0VarE = e(velocityTracker);
        if (j0VarE != null) {
            return j0VarE.d(i15);
        }
        return 0.0f;
    }

    private static j0 e(VelocityTracker velocityTracker) {
        return f99689a.get(velocityTracker);
    }
}
