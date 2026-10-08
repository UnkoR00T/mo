package net.zetetic.database.sqlcipher;

import java.util.HashMap;
import java.util.Map;
import net.zetetic.database.AbstractWindowedCursor;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class SQLiteCursor extends AbstractWindowedCursor {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f135441v = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f135442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String[] f135443n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SQLiteQuery f135444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SQLiteCursorDriver f135445q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f135446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f135447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map<String, Integer> f135448t;

    @Deprecated
    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    private void C() {
        u(null);
    }

    private void E(int i15) {
        y(H().W());
        try {
            if (this.f135446r != -1) {
                this.f135444p.J(this.f135353l, DatabaseUtils.a(i15, this.f135447s), i15, false);
                return;
            }
            this.f135446r = this.f135444p.J(this.f135353l, DatabaseUtils.a(i15, 0), i15, true);
            this.f135447s = this.f135353l.J();
            if (Logger.f("SQLiteCursor", 3)) {
                Logger.a("SQLiteCursor", "received count(*) from native_fill_window: " + this.f135446r);
            }
        } catch (RuntimeException e15) {
            C();
            throw e15;
        }
    }

    private void y(String str) {
        int i15 = CursorWindow.f135354f;
        if (f135441v) {
            C();
            f135441v = false;
        }
        CursorWindow cursorWindowR = r();
        if (cursorWindowR == null) {
            u(new CursorWindow(str, i15));
        } else {
            cursorWindowR.p();
        }
    }

    public SQLiteDatabase H() {
        return this.f135444p.C();
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.f135444p.close();
            this.f135445q.cursorClosed();
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.f135445q.cursorDeactivated();
    }

    @Override // net.zetetic.database.AbstractCursor
    protected void finalize() {
        try {
            if (this.f135353l != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.f135448t == null) {
            String[] strArr = this.f135443n;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i15 = 0; i15 < length; i15++) {
                map.put(strArr[i15], Integer.valueOf(i15));
            }
            this.f135448t = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Logger.c("SQLiteCursor", "requesting column name with table name -- " + str, new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = this.f135448t.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.f135443n;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.f135446r == -1) {
            E(0);
        }
        return this.f135446r;
    }

    @Override // net.zetetic.database.AbstractCursor
    public boolean onMove(int i15, int i16) {
        CursorWindow cursorWindow = this.f135353l;
        if (cursorWindow != null && i16 >= cursorWindow.L() && i16 < this.f135353l.L() + this.f135353l.J()) {
            return true;
        }
        E(i16);
        return true;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f135444p.C().isOpen()) {
                    return false;
                }
                CursorWindow cursorWindow = this.f135353l;
                if (cursorWindow != null) {
                    cursorWindow.p();
                }
                this.f135342a = -1;
                this.f135446r = -1;
                this.f135445q.cursorRequeried(this);
                try {
                    return super.requery();
                } catch (IllegalStateException e15) {
                    Logger.i("SQLiteCursor", "requery() failed " + e15.getMessage(), e15);
                    return false;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // net.zetetic.database.AbstractWindowedCursor
    public void u(CursorWindow cursorWindow) {
        super.u(cursorWindow);
        this.f135446r = -1;
    }

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f135446r = -1;
        if (sQLiteQuery == null) {
            throw new IllegalArgumentException("query object cannot be null");
        }
        this.f135445q = sQLiteCursorDriver;
        this.f135442m = str;
        this.f135448t = null;
        this.f135444p = sQLiteQuery;
        this.f135443n = sQLiteQuery.getColumnNames();
    }
}
