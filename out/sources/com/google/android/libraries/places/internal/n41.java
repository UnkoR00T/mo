package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DropBoxManager f33032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LinkedHashMap f33033b = new m41(16, 0.75f, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f33034c;

    public static synchronized void a(Context context) {
        if (f33032a == null) {
            f33032a = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
            f33034c = "com.google.android.libraries.places";
        }
    }

    public static synchronized void b(Throwable th4) {
        try {
            long id5 = Thread.currentThread().getId();
            int iHashCode = th4.hashCode();
            Integer num = (Integer) f33033b.get(Long.valueOf(id5));
            if (num == null || num.intValue() != iHashCode) {
                DropBoxManager dropBoxManager = f33032a;
                if (dropBoxManager != null && dropBoxManager.isTagEnabled("system_app_crash")) {
                    DropBoxManager dropBoxManager2 = f33032a;
                    StringBuilder sb5 = new StringBuilder();
                    String str = f33034c;
                    List<String> listH = zj.t.e('.').h("5.2.0");
                    long j15 = -1;
                    if (listH.size() == 3) {
                        long j16 = 0;
                        for (int i15 = 0; i15 < listH.size(); i15++) {
                            try {
                                j16 = (j16 * 100) + ((long) Integer.parseInt(listH.get(i15)));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        j15 = j16;
                    }
                    sb5.append(String.format("Package: %s v%d (%s)\n", str, Long.valueOf(j15), "5.2.0"));
                    sb5.append(String.format("Build: %s\n", Build.FINGERPRINT));
                    sb5.append("\n");
                    sb5.append(Log.getStackTraceString(th4));
                    dropBoxManager2.addText("system_app_crash", sb5.toString());
                    f33033b.put(Long.valueOf(id5), Integer.valueOf(iHashCode));
                }
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }
}
