package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteQuery extends SQLiteProgram {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CancellationSignal f135509j;

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.f135509j = cancellationSignal;
    }

    int J(CursorWindow cursorWindow, int i15, int i16, boolean z15) {
        b();
        try {
            try {
                cursorWindow.b();
                try {
                    try {
                        int iH = E().h(H(), u(), cursorWindow, i15, i16, z15, y(), this.f135509j);
                        cursorWindow.m();
                        m();
                        return iH;
                    } catch (SQLiteDatabaseCorruptException e15) {
                        e = e15;
                        SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
                        I(sQLiteDatabaseCorruptException);
                        throw sQLiteDatabaseCorruptException;
                    } catch (SQLiteException e16) {
                        e = e16;
                        SQLiteException sQLiteException = e;
                        Logger.b("SQLiteQuery", "exception: " + sQLiteException.getMessage() + "; query: " + H());
                        throw sQLiteException;
                    }
                } catch (SQLiteDatabaseCorruptException e17) {
                    e = e17;
                } catch (SQLiteException e18) {
                    e = e18;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    cursorWindow.m();
                    throw th5;
                }
            } catch (Throwable th6) {
                m();
                throw th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public String toString() {
        return "SQLiteQuery: " + H();
    }
}
