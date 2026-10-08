package io.sentry.android.core.internal.util;

import io.sentry.g1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f93993c = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f93994a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Integer> f93995b = new ArrayList();

    private k() {
    }

    public static k a() {
        return f93993c;
    }

    String b() {
        return "/sys/devices/system/cpu";
    }

    public List<Integer> c() {
        g1 g1VarA = this.f93994a.a();
        try {
            if (!this.f93995b.isEmpty()) {
                List<Integer> list = this.f93995b;
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(b()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                    if (file2.exists() && file2.canRead()) {
                        try {
                            String strC = io.sentry.util.h.c(file2);
                            if (strC != null) {
                                this.f93995b.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                            }
                        } catch (IOException | NumberFormatException unused) {
                        }
                    }
                }
            }
            List<Integer> list2 = this.f93995b;
            if (g1VarA != null) {
                g1VarA.close();
            }
            return list2;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }
}
