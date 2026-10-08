package j6;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    static class b {
        static boolean a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static class c {
        static int a(ViewConfiguration viewConfiguration, int i15, int i16, int i17) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i15, i16, i17);
        }

        static int b(ViewConfiguration viewConfiguration, int i15, int i16, int i17) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i15, i16, i17);
        }
    }

    private static int a(Resources resources, int i15, i6.j<Integer> jVar, int i16) {
        int dimensionPixelSize;
        if (i15 != -1) {
            return (i15 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i15)) < 0) ? i16 : dimensionPixelSize;
        }
        return jVar.get().intValue();
    }

    private static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int c(Resources resources, int i15, int i16) {
        if (i15 == 4194304 && i16 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int d(Resources resources, int i15, int i16) {
        if (i15 == 4194304 && i16 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, final ViewConfiguration viewConfiguration, int i15, int i16, int i17) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i15, i16, i17);
        }
        if (!i(i15, i16, i17)) {
            return PKIFailureInfo.systemUnavail;
        }
        Resources resources = context.getResources();
        int iC = c(resources, i17, i16);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iC, new i6.j() { // from class: j6.m0
            @Override // i6.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, PKIFailureInfo.systemUnavail);
    }

    public static int g(Context context, final ViewConfiguration viewConfiguration, int i15, int i16, int i17) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i15, i16, i17);
        }
        if (!i(i15, i16, i17)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iD = d(resources, i17, i16);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new i6.j() { // from class: j6.n0
            @Override // i6.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    private static boolean i(int i15, int i16, int i17) {
        InputDevice device = InputDevice.getDevice(i15);
        return (device == null || device.getMotionRange(i16, i17) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iB = b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iB != 0 && resources.getBoolean(iB);
    }
}
