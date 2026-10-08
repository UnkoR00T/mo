package net.zetetic.database.sqlcipher;

import android.os.StatFs;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteGlobal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f135487a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f135488b = 4096;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f135489c = 10;

    private SQLiteGlobal() {
    }

    public static String a() {
        return "delete";
    }

    public static int b() {
        synchronized (f135487a) {
            try {
                if (f135488b == 0) {
                    f135488b = new StatFs("/data").getBlockSize();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return PKIFailureInfo.certConfirmed;
    }

    public static String c() {
        return "normal";
    }

    public static int d() {
        return 10000;
    }

    public static int e() {
        return Math.max(1, 1000);
    }

    public static int f() {
        return f135489c;
    }

    public static String g() {
        return "normal";
    }

    private static native int nativeReleaseMemory();
}
