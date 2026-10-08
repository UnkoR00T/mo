package io.sentry.cache;

import io.sentry.b7;
import io.sentry.q7;
import io.sentry.t1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f94722a = Charset.forName("UTF-8");

    static void a(q7 q7Var, String str, String str2) {
        File fileB = b(q7Var, str);
        if (fileB == null) {
            q7Var.getLogger().c(b7.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        q7Var.getLogger().c(b7.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        q7Var.getLogger().c(b7.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    static File b(q7 q7Var, String str) {
        String cacheDirPath = q7Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    static <T, R> T c(q7 q7Var, String str, String str2, Class<T> cls, t1<R> t1Var) {
        File fileB = b(q7Var, str);
        if (fileB == null) {
            q7Var.getLogger().c(b7.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f94722a));
                try {
                    T t15 = t1Var == null ? (T) q7Var.getSerializer().c(bufferedReader, cls) : (T) q7Var.getSerializer().e(bufferedReader, cls, t1Var);
                    bufferedReader.close();
                    return t15;
                } catch (Throwable th4) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                q7Var.getLogger().a(b7.ERROR, th6, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            q7Var.getLogger().c(b7.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    static <T> void d(q7 q7Var, T t15, String str, String str2) {
        File fileB = b(q7Var, str);
        if (fileB == null) {
            q7Var.getLogger().c(b7.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f94722a));
                try {
                    q7Var.getSerializer().a(t15, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (Throwable th8) {
            q7Var.getLogger().a(b7.ERROR, th8, "Error persisting entity: %s", str2);
        }
    }
}
