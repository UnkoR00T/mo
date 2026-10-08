package g0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class z0 {
    public static String a(int i15) {
        ArrayList arrayList = new ArrayList();
        if ((i15 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i15 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i15 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static int b(int i15) {
        int i16 = 0;
        while (i15 != 0) {
            i16 += i15 & 1;
            i15 >>= 1;
        }
        return i16;
    }

    public static boolean c(int i15, int i16) {
        return (i15 & i16) == i16;
    }
}
