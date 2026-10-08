package net.zetetic.database.sqlcipher;

/* JADX INFO: loaded from: classes3.dex */
public class SupportOpenHelperFactory implements za.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f135533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteDatabaseHook f135534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f135535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f135536d;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    @Override // za.d.c
    public za.d a(za.d.b bVar) {
        int i15 = this.f135536d;
        return i15 == -1 ? io.sentry.android.sqlite.d.m(new SupportHelper(bVar, this.f135533a, this.f135534b, this.f135535c)) : io.sentry.android.sqlite.d.m(new SupportHelper(bVar, this.f135533a, this.f135534b, this.f135535c, i15));
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z15) {
        this(bArr, sQLiteDatabaseHook, z15, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z15, int i15) {
        this.f135533a = bArr;
        this.f135534b = sQLiteDatabaseHook;
        this.f135535c = z15;
        this.f135536d = i15;
    }
}
