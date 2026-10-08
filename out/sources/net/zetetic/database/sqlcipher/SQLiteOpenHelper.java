package net.zetetic.database.sqlcipher;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SQLiteOpenHelper implements za.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f135490m = "SQLiteOpenHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f135491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f135492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SQLiteDatabase.CursorFactory f135493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f135494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f135495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SQLiteDatabase f135496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f135497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f135498h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f135499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final DatabaseErrorHandler f135500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SQLiteDatabaseHook f135501l;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i15) {
        this(context, str, cursorFactory, i15, null);
    }

    private static byte[] b(String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(CharBuffer.wrap(str));
        byte[] bArr = new byte[byteBufferEncode.limit()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    private SQLiteDatabase h(boolean z15) {
        SQLiteDatabase sQLiteDatabase = this.f135496f;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.f135496f = null;
            } else if (!z15 || !this.f135496f.O()) {
                return this.f135496f;
            }
        }
        if (this.f135498h) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabaseD0 = this.f135496f;
        try {
            this.f135498h = true;
            if (sQLiteDatabaseD0 == null) {
                String path = this.f135492b;
                if (path == null) {
                    sQLiteDatabaseD0 = SQLiteDatabase.u(null);
                } else {
                    try {
                        if (!path.startsWith("file:")) {
                            path = this.f135491a.getDatabasePath(path).getPath();
                        }
                        String str = path;
                        File file = new File(new File(str).getParent());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        sQLiteDatabaseD0 = SQLiteDatabase.d0(str, this.f135497g, this.f135493c, this.f135499j ? 805306368 : 268435456, this.f135500k, this.f135501l);
                    } catch (SQLiteException e15) {
                        if (z15) {
                            throw e15;
                        }
                        Logger.c(f135490m, "Couldn't open " + this.f135492b + " for writing (will try read-only):", e15);
                        sQLiteDatabaseD0 = SQLiteDatabase.d0(this.f135491a.getDatabasePath(this.f135492b).getPath(), this.f135497g, this.f135493c, 1, this.f135500k, this.f135501l);
                    }
                }
            } else if (z15 && sQLiteDatabaseD0.O()) {
                sQLiteDatabaseD0.H0();
            }
            u(sQLiteDatabaseD0);
            int iL = sQLiteDatabaseD0.L();
            if (iL != this.f135494d) {
                if (sQLiteDatabaseD0.O()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabaseD0.L() + " to " + this.f135494d + ": " + this.f135492b);
                }
                if (iL > 0 && iL < this.f135495e) {
                    File file2 = new File(sQLiteDatabaseD0.W());
                    r(sQLiteDatabaseD0);
                    sQLiteDatabaseD0.close();
                    if (SQLiteDatabase.C(file2)) {
                        this.f135498h = false;
                        SQLiteDatabase sQLiteDatabaseH = h(z15);
                        this.f135498h = false;
                        if (sQLiteDatabaseD0 != this.f135496f) {
                            sQLiteDatabaseD0.close();
                        }
                        return sQLiteDatabaseH;
                    }
                    throw new IllegalStateException("Unable to delete obsolete database " + this.f135492b + " with version " + iL);
                }
                sQLiteDatabaseD0.q0();
                try {
                    if (iL == 0) {
                        y(sQLiteDatabaseD0);
                    } else {
                        int i15 = this.f135494d;
                        if (iL > i15) {
                            C(sQLiteDatabaseD0, iL, i15);
                        } else {
                            H(sQLiteDatabaseD0, iL, i15);
                        }
                    }
                    sQLiteDatabaseD0.O0(this.f135494d);
                    sQLiteDatabaseD0.X0();
                    sQLiteDatabaseD0.r1();
                } catch (Throwable th4) {
                    sQLiteDatabaseD0.r1();
                    throw th4;
                }
            }
            E(sQLiteDatabaseD0);
            if (sQLiteDatabaseD0.O()) {
                Logger.h(f135490m, "Opened " + this.f135492b + " in read-only mode");
            }
            this.f135496f = sQLiteDatabaseD0;
            this.f135498h = false;
            return sQLiteDatabaseD0;
        } catch (Throwable th5) {
            this.f135498h = false;
            if (sQLiteDatabaseD0 == null || sQLiteDatabaseD0 == this.f135496f) {
                throw th5;
            }
            sQLiteDatabaseD0.close();
            throw th5;
        }
    }

    public void C(SQLiteDatabase sQLiteDatabase, int i15, int i16) {
        throw new SQLiteException("Can't downgrade database from version " + i15 + " to " + i16);
    }

    public void E(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void H(SQLiteDatabase sQLiteDatabase, int i15, int i16);

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f135498h) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.f135496f;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f135496f.close();
            this.f135496f = null;
        }
    }

    @Override // za.d
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.f135492b;
    }

    @Override // za.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public SQLiteDatabase c3() {
        SQLiteDatabase sQLiteDatabaseH;
        synchronized (this) {
            sQLiteDatabaseH = h(false);
        }
        return sQLiteDatabaseH;
    }

    @Override // za.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public SQLiteDatabase g3() {
        SQLiteDatabase sQLiteDatabaseH;
        synchronized (this) {
            sQLiteDatabaseH = h(true);
        }
        return sQLiteDatabaseH;
    }

    public void r(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean z15) {
        synchronized (this) {
            try {
                if (this.f135499j != z15) {
                    SQLiteDatabase sQLiteDatabase = this.f135496f;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.f135496f.O()) {
                        if (z15) {
                            this.f135496f.W0();
                        } else {
                            this.f135496f.B0();
                        }
                    }
                    this.f135499j = z15;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void u(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void y(SQLiteDatabase sQLiteDatabase);

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i15, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, cursorFactory, i15, 0, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i15, int i16, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, new byte[0], cursorFactory, i15, i16, databaseErrorHandler, (SQLiteDatabaseHook) null, false);
    }

    public SQLiteOpenHelper(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i15, int i16, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z15) {
        this(context, str, b(str2), cursorFactory, i15, i16, databaseErrorHandler, sQLiteDatabaseHook, z15);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i15, int i16, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z15) {
        if (i15 >= 1) {
            this.f135491a = context;
            this.f135492b = str;
            this.f135497g = bArr;
            this.f135493c = cursorFactory;
            this.f135494d = i15;
            this.f135500k = databaseErrorHandler;
            this.f135501l = sQLiteDatabaseHook;
            this.f135499j = z15;
            this.f135495e = Math.max(0, i16);
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was " + i15);
    }
}
