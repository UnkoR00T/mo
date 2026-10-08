package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import za.g;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteStatement extends SQLiteProgram implements g {
    SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }

    @Override // za.g
    public void B() {
        b();
        try {
            try {
                E().f(H(), u(), y(), null);
                m();
            } catch (SQLiteDatabaseCorruptException e15) {
                I(e15);
                throw e15;
            }
        } catch (Throwable th4) {
            m();
            throw th4;
        }
    }

    @Override // za.g
    public int I0() {
        b();
        try {
            try {
                int iG = E().g(H(), u(), y(), null);
                m();
                return iG;
            } catch (SQLiteDatabaseCorruptException e15) {
                I(e15);
                throw e15;
            }
        } catch (Throwable th4) {
            m();
            throw th4;
        }
    }

    public long J() {
        b();
        try {
            try {
                long jI = E().i(H(), u(), y(), null);
                m();
                return jI;
            } catch (SQLiteDatabaseCorruptException e15) {
                I(e15);
                throw e15;
            }
        } catch (Throwable th4) {
            m();
            throw th4;
        }
    }

    public String toString() {
        return "SQLiteProgram: " + H();
    }
}
