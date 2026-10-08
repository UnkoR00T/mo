package net.zetetic.database.sqlcipher;

/* JADX INFO: loaded from: classes3.dex */
public class SupportHelper implements za.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SQLiteOpenHelper f135530a;

    public SupportHelper(za.d.b bVar, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z15) {
        this(bVar, bArr, sQLiteDatabaseHook, z15, 0);
    }

    @Override // za.d
    public za.c c3() {
        return this.f135530a.c3();
    }

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f135530a.close();
    }

    @Override // za.d
    public za.c g3() {
        return this.f135530a.g3();
    }

    @Override // za.d
    public String getDatabaseName() {
        return this.f135530a.getDatabaseName();
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean z15) {
        this.f135530a.setWriteAheadLoggingEnabled(z15);
    }

    public SupportHelper(final za.d.b bVar, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z15, int i15) {
        this.f135530a = new SQLiteOpenHelper(bVar.context, bVar.name, bArr, null, bVar.callback.version, i15, null, sQLiteDatabaseHook, z15) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void C(SQLiteDatabase sQLiteDatabase, int i16, int i17) {
                bVar.callback.e(sQLiteDatabase, i16, i17);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void E(SQLiteDatabase sQLiteDatabase) {
                bVar.callback.f(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void H(SQLiteDatabase sQLiteDatabase, int i16, int i17) {
                bVar.callback.g(sQLiteDatabase, i16, i17);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void u(SQLiteDatabase sQLiteDatabase) {
                bVar.callback.b(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void y(SQLiteDatabase sQLiteDatabase) {
                bVar.callback.d(sQLiteDatabase);
            }
        };
    }
}
