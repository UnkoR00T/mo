package net.zetetic.database.sqlcipher;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Pair;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import za.f;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteDatabase extends SQLiteClosable implements za.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakHashMap<SQLiteDatabase, Object> f135450k = new WeakHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f135451l = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CursorFactory f135453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DatabaseErrorHandler f135454d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f135457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SQLiteConnectionPool f135458h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f135459j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadLocal<SQLiteSession> f135452b = new ThreadLocal<SQLiteSession>() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SQLiteSession initialValue() {
            return SQLiteDatabase.this.y();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f135455e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CloseGuard f135456f = CloseGuard.b();

    /* JADX INFO: renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$2, reason: invalid class name */
    class AnonymousClass2 implements SQLiteTransactionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.database.sqlite.SQLiteTransactionListener f135461a;

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onBegin() {
            this.f135461a.onBegin();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onCommit() {
            this.f135461a.onCommit();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onRollback() {
            this.f135461a.onRollback();
        }
    }

    /* JADX INFO: renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$3, reason: invalid class name */
    class AnonymousClass3 implements SQLiteTransactionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.database.sqlite.SQLiteTransactionListener f135462a;

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onBegin() {
            this.f135462a.onBegin();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onCommit() {
            this.f135462a.onCommit();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onRollback() {
            this.f135462a.onRollback();
        }
    }

    public interface CursorFactory {
        Cursor a(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    public interface CustomFunction {
        void a(String[] strArr);
    }

    private SQLiteDatabase(String str, byte[] bArr, int i15, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.f135453c = cursorFactory;
        this.f135454d = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.f135457g = new SQLiteDatabaseConfiguration(str, i15, bArr, sQLiteDatabaseHook);
    }

    public static boolean C(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file must not be null");
        }
        boolean zDelete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.4
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    zDelete |= file2.delete();
                }
            }
        }
        return zDelete;
    }

    private void E(boolean z15) {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.f135455e) {
            try {
                CloseGuard closeGuard = this.f135456f;
                if (closeGuard != null) {
                    if (z15) {
                        closeGuard.d();
                    }
                    this.f135456f.a();
                }
                sQLiteConnectionPool = this.f135458h;
                this.f135458h = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15) {
            return;
        }
        synchronized (f135450k) {
            f135450k.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.close();
        }
    }

    private int H(String str, Object[] objArr) {
        boolean z15;
        b();
        try {
            if (DatabaseUtils.b(str) == 3) {
                synchronized (this.f135455e) {
                    try {
                        if (this.f135459j) {
                            z15 = false;
                        } else {
                            z15 = true;
                            this.f135459j = true;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (z15) {
                    B0();
                }
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str, objArr);
            try {
                int iI0 = sQLiteStatement.I0();
                sQLiteStatement.close();
                m();
                return iI0;
            } catch (Throwable th5) {
                sQLiteStatement.close();
                throw th5;
            }
        } catch (Throwable th6) {
            m();
            throw th6;
        }
    }

    public static boolean M() {
        return SQLiteConnection.t();
    }

    private static boolean N() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null && looperMyLooper == Looper.getMainLooper();
    }

    private void T0() {
        if (this.f135458h != null) {
            return;
        }
        throw new IllegalStateException("The database '" + this.f135457g.f135466b + "' is not open.");
    }

    private boolean V() {
        return (this.f135457g.f135467c & 1) == 1;
    }

    private void a0() {
        try {
            try {
                n0();
            } catch (SQLiteDatabaseCorruptException e15) {
                Z(e15);
                n0();
            }
        } catch (SQLiteException e16) {
            Logger.c("SQLiteDatabase", "Failed to open database '" + I() + "'.", e16);
            close();
            throw e16;
        }
    }

    public static SQLiteDatabase b0(String str, CursorFactory cursorFactory, int i15) {
        return c0(str, cursorFactory, i15, null);
    }

    public static SQLiteDatabase c0(String str, CursorFactory cursorFactory, int i15, DatabaseErrorHandler databaseErrorHandler) {
        return d0(str, new byte[0], cursorFactory, i15, databaseErrorHandler, null);
    }

    public static SQLiteDatabase d0(String str, byte[] bArr, CursorFactory cursorFactory, int i15, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, bArr, i15, cursorFactory, databaseErrorHandler, sQLiteDatabaseHook);
        sQLiteDatabase.a0();
        return sQLiteDatabase;
    }

    private void n0() {
        synchronized (this.f135455e) {
            this.f135458h = SQLiteConnectionPool.O(this.f135457g);
            this.f135456f.c("close");
        }
        synchronized (f135450k) {
            f135450k.put(this, null);
        }
    }

    private void p(SQLiteTransactionListener sQLiteTransactionListener, boolean z15) {
        b();
        try {
            K().b(z15 ? 2 : 1, sQLiteTransactionListener, J(false), null);
        } finally {
            m();
        }
    }

    public static SQLiteDatabase u(CursorFactory cursorFactory) {
        return b0(":memory:", cursorFactory, 268435456);
    }

    @Override // za.c
    public void B0() {
        synchronized (this.f135455e) {
            try {
                T0();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f135457g;
                int i15 = sQLiteDatabaseConfiguration.f135467c;
                if ((i15 & PKIFailureInfo.duplicateCertReq) == 0) {
                    return;
                }
                sQLiteDatabaseConfiguration.f135467c = i15 & (-536870913);
                try {
                    this.f135458h.a0(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e15) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f135457g;
                    sQLiteDatabaseConfiguration2.f135467c = 536870912 | sQLiteDatabaseConfiguration2.f135467c;
                    throw e15;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public Cursor C0(CursorFactory cursorFactory, String str, String[] strArr, String str2, CancellationSignal cancellationSignal) {
        b();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.f135453c;
            }
            return sQLiteDirectCursorDriver.a(cursorFactory, strArr);
        } finally {
            m();
        }
    }

    @Override // za.c
    public void E0(String str) {
        H(str, null);
    }

    public void H0() {
        synchronized (this.f135455e) {
            try {
                T0();
                if (V()) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f135457g;
                    int i15 = sQLiteDatabaseConfiguration.f135467c;
                    sQLiteDatabaseConfiguration.f135467c = i15 & (-2);
                    try {
                        this.f135458h.a0(sQLiteDatabaseConfiguration);
                    } catch (RuntimeException e15) {
                        this.f135457g.f135467c = i15;
                        throw e15;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    String I() {
        String str;
        synchronized (this.f135455e) {
            str = this.f135457g.f135466b;
        }
        return str;
    }

    int J(boolean z15) {
        int i15 = z15 ? 1 : 2;
        return N() ? i15 | 4 : i15;
    }

    SQLiteSession K() {
        return this.f135452b.get();
    }

    public int L() {
        return Long.valueOf(DatabaseUtils.d(this, "PRAGMA user_version;", null)).intValue();
    }

    public boolean O() {
        boolean zV;
        synchronized (this.f135455e) {
            zV = V();
        }
        return zV;
    }

    public void O0(int i15) {
        E0("PRAGMA user_version = " + i15);
    }

    @Override // za.c
    public boolean P3() {
        boolean z15;
        synchronized (this.f135455e) {
            T0();
            z15 = (this.f135457g.f135467c & PKIFailureInfo.duplicateCertReq) != 0;
        }
        return z15;
    }

    @Override // za.c
    public final String W() {
        String str;
        synchronized (this.f135455e) {
            str = this.f135457g.f135465a;
        }
        return str;
    }

    @Override // za.c
    public boolean W0() {
        synchronized (this.f135455e) {
            try {
                T0();
                if ((this.f135457g.f135467c & PKIFailureInfo.duplicateCertReq) != 0) {
                    return true;
                }
                if (V()) {
                    return false;
                }
                if (this.f135457g.a()) {
                    Logger.e("SQLiteDatabase", "can't enable WAL for memory databases.");
                    return false;
                }
                if (this.f135459j) {
                    if (Logger.f("SQLiteDatabase", 3)) {
                        Logger.a("SQLiteDatabase", "this database: " + this.f135457g.f135466b + " has attached databases. can't  enable WAL.");
                    }
                    return false;
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f135457g;
                sQLiteDatabaseConfiguration.f135467c = 536870912 | sQLiteDatabaseConfiguration.f135467c;
                try {
                    this.f135458h.a0(sQLiteDatabaseConfiguration);
                    return true;
                } catch (RuntimeException e15) {
                    this.f135457g.f135467c &= -536870913;
                    throw e15;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // za.c
    public void X0() {
        b();
        try {
            K().p();
        } finally {
            m();
        }
    }

    @Override // za.c
    public Cursor X1(f fVar) {
        return t0(fVar, null);
    }

    public int Y0(String str, ContentValues contentValues, String str2, String[] strArr, int i15) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        b();
        try {
            StringBuilder sb5 = new StringBuilder(120);
            sb5.append("UPDATE ");
            sb5.append(f135451l[i15]);
            sb5.append(str);
            sb5.append(" SET ");
            int size = contentValues.size();
            int length = strArr == null ? size : strArr.length + size;
            Object[] objArr = new Object[length];
            int i16 = 0;
            for (String str3 : contentValues.keySet()) {
                sb5.append(i16 > 0 ? "," : "");
                sb5.append(str3);
                objArr[i16] = contentValues.get(str3);
                sb5.append("=?");
                i16++;
            }
            if (strArr != null) {
                for (int i17 = size; i17 < length; i17++) {
                    objArr[i17] = strArr[i17 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb5.append(" WHERE ");
                sb5.append(str2);
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb5.toString(), objArr);
            try {
                int iI0 = sQLiteStatement.I0();
                sQLiteStatement.close();
                m();
                return iI0;
            } catch (Throwable th4) {
                sQLiteStatement.close();
                throw th4;
            }
        } catch (Throwable th5) {
            m();
            throw th5;
        }
    }

    @Override // za.c
    public int Y2(String str, int i15, ContentValues contentValues, String str2, Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        String[] strArr = new String[length];
        for (int i16 = 0; i16 < length; i16++) {
            strArr[i16] = objArr[i16].toString();
        }
        return Y0(str, contentValues, str2, strArr, i15);
    }

    void Z(SQLiteException sQLiteException) {
        EventLog.writeEvent(75004, I());
        this.f135454d.a(this, sQLiteException);
    }

    @Override // za.c
    public void a1(String str, Object[] objArr) {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        H(str, objArr);
    }

    @Override // za.c
    public void b1() {
        p(null, false);
    }

    protected void finalize() throws Throwable {
        try {
            E(true);
        } finally {
            super.finalize();
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    protected void h() {
        E(false);
    }

    @Override // za.c
    public boolean isOpen() {
        boolean z15;
        synchronized (this.f135455e) {
            z15 = this.f135458h != null;
        }
        return z15;
    }

    @Override // za.c
    public boolean l0() {
        b();
        try {
            return K().k();
        } finally {
            m();
        }
    }

    @Override // za.c
    public void q0() {
        p(null, true);
    }

    @Override // za.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public SQLiteStatement B2(String str) {
        b();
        try {
            return new SQLiteStatement(this, str, null);
        } finally {
            m();
        }
    }

    @Override // za.c
    public void r1() {
        b();
        try {
            K().d(null);
        } finally {
            m();
        }
    }

    public Cursor t0(f fVar, CancellationSignal cancellationSignal) {
        b();
        try {
            String strA = fVar.a();
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, strA, "", cancellationSignal);
            SQLiteQuery sQLiteQuery = new SQLiteQuery(this, strA, cancellationSignal);
            fVar.b(sQLiteQuery);
            return new SQLiteCursor(sQLiteDirectCursorDriver, "", sQLiteQuery);
        } finally {
            m();
        }
    }

    public String toString() {
        return "SQLiteDatabase: " + W();
    }

    public Cursor u0(String str, String[] strArr) {
        return C0(null, str, strArr, null, null);
    }

    @Override // za.c
    public List<Pair<String, String>> x0() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f135455e) {
            try {
                Cursor cursorU0 = null;
                if (this.f135458h == null) {
                    return null;
                }
                if (!this.f135459j) {
                    arrayList.add(new Pair("main", this.f135457g.f135465a));
                    return arrayList;
                }
                b();
                try {
                    try {
                        cursorU0 = u0("pragma database_list;", null);
                        while (cursorU0.moveToNext()) {
                            arrayList.add(new Pair(cursorU0.getString(1), cursorU0.getString(2)));
                        }
                        cursorU0.close();
                        m();
                        return arrayList;
                    } catch (Throwable th4) {
                        if (cursorU0 != null) {
                            cursorU0.close();
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    m();
                    throw th5;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    SQLiteSession y() {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.f135455e) {
            T0();
            sQLiteConnectionPool = this.f135458h;
        }
        return new SQLiteSession(sQLiteConnectionPool);
    }
}
