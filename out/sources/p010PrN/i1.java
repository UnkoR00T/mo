package p010PrN;

import android.os.Build;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
class i1 {
    static String a(int i15) {
        if (i15 == 15) {
            return "BIOMETRIC_STRONG";
        }
        if (i15 == 255) {
            return "BIOMETRIC_WEAK";
        }
        if (i15 == 32768) {
            return "DEVICE_CREDENTIAL";
        }
        if (i15 != 32783) {
            return i15 != 33023 ? String.valueOf(i15) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
        }
        return "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
    }

    static int b(m1.d dVar, m1.c cVar) {
        if (dVar.a() != 0) {
            return dVar.a();
        }
        int i15 = cVar != null ? 15 : GF2Field.MASK;
        return dVar.g() ? 32768 | i15 : i15;
    }

    static boolean c(int i15) {
        return (i15 & 32768) != 0;
    }

    static boolean d(int i15) {
        return (i15 & 32767) != 0;
    }

    static boolean e(int i15) {
        if (i15 != 15 && i15 != 255) {
            if (i15 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i15 != 32783) {
                return i15 == 33023 || i15 == 0;
            }
            int i16 = Build.VERSION.SDK_INT;
            return i16 < 28 || i16 > 29;
        }
        return true;
    }

    static boolean f(int i15) {
        return (i15 & GF2Field.MASK) == 255;
    }
}
