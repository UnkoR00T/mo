package j6;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:24:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:0x002e  */
    static int a(int i15) {
        if (i15 == -1) {
            return -1;
        }
        int i16 = Build.VERSION.SDK_INT;
        int i17 = 6;
        if (i16 < 34) {
            switch (i15) {
                case 21:
                case 23:
                case 26:
                    i15 = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i15 = 4;
                    break;
                case 25:
                    i15 = 0;
                    break;
            }
        }
        if (i16 >= 30) {
            i17 = i15;
        } else if (i15 == 12) {
            i17 = 1;
        } else if (i15 != 13) {
            if (i15 == 16) {
                i17 = 1;
            } else if (i15 != 17) {
                i17 = i15;
            } else {
                i17 = 0;
            }
        }
        if (i16 >= 27 || !(i17 == 7 || i17 == 8 || i17 == 9)) {
            return i17;
        }
        return -1;
    }
}
