package net.zetetic.database.sqlcipher;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteDatabaseConfiguration {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f135464j = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f135467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f135468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Locale f135469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f135470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f135471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SQLiteDatabaseHook f135472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<SQLiteCustomFunction> f135473i;

    public SQLiteDatabaseConfiguration(String str, int i15) {
        this(str, i15, null, null);
    }

    private static String b(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf >= 0) {
            str = (String) str.subSequence(0, iIndexOf);
        }
        return str.indexOf(64) == -1 ? str : f135464j.matcher(str).replaceAll("XX@YY");
    }

    public boolean a() {
        return this.f135465a.equalsIgnoreCase(":memory:");
    }

    public void c(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        }
        if (!this.f135465a.equals(sQLiteDatabaseConfiguration.f135465a)) {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.f135467c = sQLiteDatabaseConfiguration.f135467c;
        this.f135468d = sQLiteDatabaseConfiguration.f135468d;
        this.f135469e = sQLiteDatabaseConfiguration.f135469e;
        this.f135470f = sQLiteDatabaseConfiguration.f135470f;
        this.f135471g = sQLiteDatabaseConfiguration.f135471g;
        this.f135472h = sQLiteDatabaseConfiguration.f135472h;
        this.f135473i.clear();
        this.f135473i.addAll(sQLiteDatabaseConfiguration.f135473i);
    }

    public SQLiteDatabaseConfiguration(String str, int i15, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.f135473i = new ArrayList<>();
        if (str == null) {
            throw new IllegalArgumentException("path must not be null.");
        }
        this.f135465a = str;
        this.f135466b = b(str);
        this.f135467c = i15;
        this.f135471g = bArr;
        this.f135472h = sQLiteDatabaseHook;
        this.f135468d = 25;
        this.f135469e = Locale.getDefault();
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f135473i = new ArrayList<>();
        if (sQLiteDatabaseConfiguration != null) {
            this.f135465a = sQLiteDatabaseConfiguration.f135465a;
            this.f135466b = sQLiteDatabaseConfiguration.f135466b;
            c(sQLiteDatabaseConfiguration);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }
}
