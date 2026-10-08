package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class b20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f31725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31726b = 0;

    static {
        e10 e10VarK = f10.K();
        e10VarK.A(-62135596800L);
        e10VarK.D(0);
        e10 e10VarK2 = f10.K();
        e10VarK2.A(253402300799L);
        e10VarK2.D(999999999);
        e10 e10VarK3 = f10.K();
        e10VarK3.A(0L);
        e10VarK3.D(0);
        f31725a = new a20();
        b("now");
        b("getEpochSecond");
        b("getNano");
    }

    public static String a(f10 f10Var) {
        String str;
        long jI = f10Var.I();
        int iJ = f10Var.J();
        if (jI < -62135596800L || jI > 253402300799L || iJ < 0 || iJ >= 1000000000) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(jI).length() + 135 + String.valueOf(iJ).length() + 37);
            sb5.append("Timestamp is not valid. See proto definition for valid values. Seconds (");
            sb5.append(jI);
            sb5.append(") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (");
            sb5.append(iJ);
            sb5.append(") must be in range [0, +999,999,999].");
            throw new IllegalArgumentException(sb5.toString());
        }
        long jI2 = f10Var.I();
        int iJ2 = f10Var.J();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(((SimpleDateFormat) f31725a.get()).format(new Date(jI2 * 1000)));
        if (iJ2 != 0) {
            sb6.append(".");
            if (iJ2 % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iJ2 / 1000000));
            } else {
                str = iJ2 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iJ2 / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iJ2));
            }
            sb6.append(str);
        }
        sb6.append("Z");
        return sb6.toString();
    }

    private static Method b(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
