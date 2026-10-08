package io.sentry.android.core;

import android.content.Context;
import io.sentry.g8;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f94054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f94055b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final io.sentry.util.a f94056c = new io.sentry.util.a();

    public static String a(Context context) {
        io.sentry.g1 g1VarA = f94056c.a();
        try {
            if (f94054a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String strC = c(file);
                        f94054a = strC;
                        if (g1VarA != null) {
                            g1VarA.close();
                        }
                        return strC;
                    }
                    f94054a = b(file);
                } catch (Throwable th4) {
                    throw new RuntimeException(th4);
                }
            }
            String str = f94054a;
            if (g1VarA != null) {
                g1VarA.close();
            }
            return str;
        } catch (Throwable th5) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    static String b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f94055b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th4) {
            try {
                randomAccessFile.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    static String c(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strA = g8.a();
            fileOutputStream.write(strA.getBytes(f94055b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strA;
        } catch (Throwable th4) {
            try {
                fileOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }
}
