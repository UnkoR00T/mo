package net.zetetic.database.sqlcipher;

import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteDebug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f135474a = Logger.f("SQLiteLog", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f135475b = Logger.f("SQLiteStatements", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f135476c = Logger.f("SQLiteTime", 2);

    public static class DbStats {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f135477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f135478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f135479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f135480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f135481e;

        public DbStats(String str, long j15, long j16, int i15, int i16, int i17, int i18) {
            this.f135477a = str;
            this.f135478b = j16 / 1024;
            this.f135479c = (j15 * j16) / 1024;
            this.f135480d = i15;
            this.f135481e = i16 + "/" + i17 + "/" + i18;
        }
    }

    public static class PagerStats {
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    private SQLiteDebug() {
    }

    private static native void nativeGetPagerStats(PagerStats pagerStats);
}
