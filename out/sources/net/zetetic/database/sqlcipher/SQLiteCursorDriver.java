package net.zetetic.database.sqlcipher;

import android.database.Cursor;

/* JADX INFO: loaded from: classes3.dex */
public interface SQLiteCursorDriver {
    Cursor a(SQLiteDatabase.CursorFactory cursorFactory, String[] strArr);

    void cursorClosed();

    void cursorDeactivated();

    void cursorRequeried(Cursor cursor);
}
