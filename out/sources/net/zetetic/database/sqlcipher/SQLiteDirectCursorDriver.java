package net.zetetic.database.sqlcipher;

import android.database.Cursor;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f135482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f135483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f135484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CancellationSignal f135485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SQLiteQuery f135486e;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.f135482a = sQLiteDatabase;
        this.f135483b = str2;
        this.f135484c = str;
        this.f135485d = cancellationSignal;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public Cursor a(SQLiteDatabase.CursorFactory cursorFactory, String[] strArr) {
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.f135482a, this.f135484c, this.f135485d);
        try {
            sQLiteQuery.r(strArr);
            Cursor sQLiteCursor = cursorFactory == null ? new SQLiteCursor(this, this.f135483b, sQLiteQuery) : cursorFactory.a(this.f135482a, this, this.f135483b, sQLiteQuery);
            this.f135486e = sQLiteQuery;
            return sQLiteCursor;
        } catch (RuntimeException e15) {
            sQLiteQuery.close();
            throw e15;
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorClosed() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorDeactivated() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorRequeried(Cursor cursor) {
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.f135484c;
    }
}
