package y;

import o.e1;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static int a(int i15, int i16, boolean z15) {
        int i17 = z15 ? ((i16 - i15) + 360) % 360 : (i16 + i15) % 360;
        if (e1.j("CameraOrientationUtil")) {
            e1.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i15), Integer.valueOf(i16), Boolean.valueOf(z15), Integer.valueOf(i17)));
        }
        return i17;
    }

    public static int b(int i15) {
        if (i15 == 0) {
            return 0;
        }
        if (i15 == 1) {
            return 90;
        }
        if (i15 == 2) {
            return 180;
        }
        if (i15 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i15);
    }
}
