package net.zetetic.database;

import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private void b(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Logger.b("DefaultDatabaseErrorHandler", "deleting the database file: " + str);
        try {
            SQLiteDatabase.C(new File(str));
        } catch (Exception e15) {
            Logger.h("DefaultDatabaseErrorHandler", "delete failed: " + e15.getMessage());
        }
    }

    @Override // net.zetetic.database.DatabaseErrorHandler
    public void a(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException) {
        Logger.b("DefaultDatabaseErrorHandler", "Corruption reported by sqlite on database: " + sQLiteDatabase.W());
        if (SQLiteDatabase.M()) {
            return;
        }
        if (!sQLiteDatabase.isOpen()) {
            b(sQLiteDatabase.W());
            return;
        }
        List<Pair<String, String>> listX0 = null;
        try {
            try {
                listX0 = sQLiteDatabase.x0();
            } catch (SQLiteException unused) {
            }
            try {
                sQLiteDatabase.close();
            } catch (SQLiteException unused2) {
            }
        } finally {
            if (listX0 != null) {
                Iterator<Pair<String, String>> it = listX0.iterator();
                while (it.hasNext()) {
                    b((String) it.next().second);
                }
            } else {
                b(sQLiteDatabase.W());
            }
        }
    }
}
