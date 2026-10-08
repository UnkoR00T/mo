package c8;

import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ak.u0<Integer> f24466a;

    static {
        f24466a = Build.VERSION.SDK_INT < 32 ? ak.u0.L(12, 252, 6396, 4) : ak.u0.Q(12, 252, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }

    private static int a(List<Integer> list) {
        for (Integer num : list) {
            int iIntValue = num.intValue();
            if (f24466a.contains(num)) {
                return iIntValue;
            }
        }
        return 0;
    }

    public static int b(b bVar) {
        int iA = a(bVar.j());
        if (iA != 0) {
            return iA;
        }
        int iA2 = a(bVar.k());
        if (iA2 != 0) {
            return iA2;
        }
        return 12;
    }
}
