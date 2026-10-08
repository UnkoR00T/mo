package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.IOException;
import jg.s;
import xg.r;
import xg.u;
import xg.v;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f29060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f29061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f29062c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f29060a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f29060a = Application.getProcessName();
            } else {
                int iMyPid = f29061b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f29061b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb5.append("/proc/");
                        sb5.append(iMyPid);
                        sb5.append("/cmdline");
                        String string = sb5.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new io.sentry.instrumentation.file.m(string));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                s.l(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedReader2 = bufferedReader;
                                i.a(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th5;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    i.a(bufferedReader);
                }
                f29060a = strTrim;
            }
        }
        return f29060a;
    }

    public static boolean b() {
        Boolean boolValueOf = f29062c;
        if (boolValueOf == null) {
            if (j.e()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = xg.s.a(Process.class, "isIsolated", new r[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new v(u.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f29062c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
