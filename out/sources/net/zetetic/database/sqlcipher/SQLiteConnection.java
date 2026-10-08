package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.util.LruCache;
import java.util.ArrayList;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f135377m = new String[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f135378n = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CloseGuard f135379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteConnectionPool f135380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f135381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f135382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f135383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f135384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PreparedStatementCache f135385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PreparedStatement f135386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OperationLog f135387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f135388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f135389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f135390l;

    private static final class Operation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f135391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f135392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f135393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f135394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f135395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<Object> f135396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f135397g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Exception f135398h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f135399i;

        private String b() {
            if (this.f135397g) {
                return this.f135398h != null ? "failed" : "succeeded";
            }
            return "running";
        }

        public void a(StringBuilder sb5, boolean z15) {
            ArrayList<Object> arrayList;
            sb5.append(this.f135394d);
            if (this.f135397g) {
                sb5.append(" took ");
                sb5.append(this.f135393c - this.f135392b);
                sb5.append("ms");
            } else {
                sb5.append(" started ");
                sb5.append(System.currentTimeMillis() - this.f135391a);
                sb5.append("ms ago");
            }
            sb5.append(" - ");
            sb5.append(b());
            if (this.f135395e != null) {
                sb5.append(", sql=\"");
                sb5.append(SQLiteConnection.O(this.f135395e));
                sb5.append("\"");
            }
            if (z15 && (arrayList = this.f135396f) != null && arrayList.size() != 0) {
                sb5.append(", bindArgs=[");
                int size = this.f135396f.size();
                for (int i15 = 0; i15 < size; i15++) {
                    Object obj = this.f135396f.get(i15);
                    if (i15 != 0) {
                        sb5.append(", ");
                    }
                    if (obj == null) {
                        sb5.append("null");
                    } else if (obj instanceof byte[]) {
                        sb5.append("<byte[]>");
                    } else if (obj instanceof String) {
                        sb5.append("\"");
                        sb5.append((String) obj);
                        sb5.append("\"");
                    } else {
                        sb5.append(obj);
                    }
                }
                sb5.append("]");
            }
            if (this.f135398h != null) {
                sb5.append(", exception=\"");
                sb5.append(this.f135398h.getMessage());
                sb5.append("\"");
            }
        }

        private Operation() {
        }
    }

    private static final class OperationLog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Operation[] f135400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f135401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f135402c;

        private boolean e(int i15) {
            Operation operationG = g(i15);
            if (operationG != null) {
                operationG.f135393c = SystemClock.uptimeMillis();
                operationG.f135397g = true;
            }
            return false;
        }

        private Operation g(int i15) {
            Operation operation = this.f135400a[i15 & GF2Field.MASK];
            if (operation.f135399i == i15) {
                return operation;
            }
            return null;
        }

        private void i(int i15, String str) {
            Operation operationG = g(i15);
            StringBuilder sb5 = new StringBuilder();
            operationG.a(sb5, false);
            if (str != null) {
                sb5.append(", ");
                sb5.append(str);
            }
            Logger.a("SQLiteConnection", sb5.toString());
        }

        private int j(int i15) {
            int i16 = this.f135402c;
            this.f135402c = i16 + 1;
            return i15 | (i16 << 8);
        }

        public int a(String str, String str2, Object[] objArr) {
            int iJ;
            synchronized (this.f135400a) {
                try {
                    int i15 = (this.f135401b + 1) % 20;
                    Operation operation = this.f135400a[i15];
                    if (operation == null) {
                        operation = new Operation();
                        this.f135400a[i15] = operation;
                    } else {
                        operation.f135397g = false;
                        operation.f135398h = null;
                        ArrayList<Object> arrayList = operation.f135396f;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                    operation.f135391a = System.currentTimeMillis();
                    operation.f135392b = SystemClock.uptimeMillis();
                    operation.f135394d = str;
                    operation.f135395e = str2;
                    if (objArr != null) {
                        ArrayList<Object> arrayList2 = operation.f135396f;
                        if (arrayList2 == null) {
                            operation.f135396f = new ArrayList<>();
                        } else {
                            arrayList2.clear();
                        }
                        for (Object obj : objArr) {
                            if (obj == null || !(obj instanceof byte[])) {
                                operation.f135396f.add(obj);
                            } else {
                                operation.f135396f.add(SQLiteConnection.f135378n);
                            }
                        }
                    }
                    iJ = j(i15);
                    operation.f135399i = iJ;
                    this.f135401b = i15;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return iJ;
        }

        public String b() {
            synchronized (this.f135400a) {
                try {
                    Operation operation = this.f135400a[this.f135401b];
                    if (operation == null || operation.f135397g) {
                        return null;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    operation.a(sb5, false);
                    return sb5.toString();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public void c(int i15) {
            synchronized (this.f135400a) {
                try {
                    if (e(i15)) {
                        i(i15, null);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public boolean d(int i15) {
            boolean zE;
            synchronized (this.f135400a) {
                zE = e(i15);
            }
            return zE;
        }

        public void f(int i15, Exception exc) {
            synchronized (this.f135400a) {
                try {
                    Operation operationG = g(i15);
                    if (operationG != null) {
                        operationG.f135398h = exc;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public void h(int i15, String str) {
            synchronized (this.f135400a) {
                i(i15, str);
            }
        }

        private OperationLog() {
            this.f135400a = new Operation[20];
        }
    }

    private static final class PreparedStatement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PreparedStatement f135403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f135404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f135405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f135406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f135407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f135408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f135409g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f135410h;

        private PreparedStatement() {
        }
    }

    private final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public PreparedStatementCache(int i15) {
            super(i15);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z15, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            preparedStatement.f135409g = false;
            if (preparedStatement.f135410h) {
                return;
            }
            SQLiteConnection.this.s(preparedStatement);
        }
    }

    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i15, boolean z15) {
        CloseGuard closeGuardB = CloseGuard.b();
        this.f135379a = closeGuardB;
        this.f135387i = new OperationLog();
        this.f135380b = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.f135381c = sQLiteDatabaseConfiguration2;
        this.f135382d = i15;
        this.f135383e = z15;
        this.f135384f = (sQLiteDatabaseConfiguration.f135467c & 1) != 0;
        this.f135385g = new PreparedStatementCache(sQLiteDatabaseConfiguration2.f135468d);
        closeGuardB.c("close");
    }

    private void C(PreparedStatement preparedStatement) {
        preparedStatement.f135404b = null;
        preparedStatement.f135403a = this.f135386h;
        this.f135386h = preparedStatement;
    }

    private void D(PreparedStatement preparedStatement) {
        preparedStatement.f135410h = false;
        if (!preparedStatement.f135409g) {
            s(preparedStatement);
            return;
        }
        try {
            nativeResetStatementAndClearBindings(this.f135388j, preparedStatement.f135405c);
        } catch (SQLiteException unused) {
            this.f135385g.remove(preparedStatement.f135404b);
        }
    }

    private void E() {
        if (this.f135381c.a() || this.f135384f) {
            return;
        }
        long jE = SQLiteGlobal.e();
        if (q("PRAGMA wal_autocheckpoint", null, null) != jE) {
            q("PRAGMA wal_autocheckpoint=" + jE, null, null);
        }
    }

    private void F() {
        if (this.f135384f) {
            return;
        }
        long j15 = this.f135381c.f135470f ? 1L : 0L;
        if (q("PRAGMA foreign_keys", null, null) != j15) {
            n("PRAGMA foreign_keys=" + j15, null, null);
        }
    }

    private void G(String str) {
        String strR = r("PRAGMA journal_mode", null, null);
        if (strR.equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (r("PRAGMA journal_mode=" + str, null, null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteDatabaseLockedException unused) {
        }
        Logger.h("SQLiteConnection", "Could not change the database journal mode of '" + this.f135381c.f135466b + "' from '" + strR + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
    }

    private void H() {
        if (this.f135381c.a() || this.f135384f) {
            return;
        }
        long jD = SQLiteGlobal.d();
        if (q("PRAGMA journal_size_limit", null, null) != jD) {
            q("PRAGMA journal_size_limit=" + jD, null, null);
        }
    }

    private void I() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f135381c;
        if ((sQLiteDatabaseConfiguration.f135467c & 16) != 0) {
            return;
        }
        String string = sQLiteDatabaseConfiguration.f135469e.toString();
        nativeRegisterLocalizedCollators(this.f135388j, string);
        if (this.f135384f) {
            return;
        }
        try {
            n("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String strR = r("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (strR == null || !strR.equals(string)) {
                n("BEGIN", null, null);
                try {
                    n("DELETE FROM android_metadata", null, null);
                    n("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string}, null);
                    n("REINDEX LOCALIZED", null, null);
                    n("COMMIT", null, null);
                } catch (Throwable th4) {
                    n("ROLLBACK", null, null);
                    throw th4;
                }
            }
        } catch (RuntimeException e15) {
            throw new SQLiteException("Failed to change locale for db '" + this.f135381c.f135466b + "' to '" + string + "'.", e15);
        }
    }

    private void K() {
        if (this.f135381c.a() || this.f135384f || SQLiteDatabase.M()) {
            return;
        }
        long jB = SQLiteGlobal.b();
        if (q("PRAGMA page_size", null, null) != jB) {
            n("PRAGMA page_size=" + jB, null, null);
        }
    }

    private void L(String str) {
        if (h(r("PRAGMA synchronous", null, null)).equalsIgnoreCase(h(str))) {
            return;
        }
        n("PRAGMA synchronous=" + str, null, null);
    }

    private void M() {
        if (this.f135381c.a() || this.f135384f) {
            return;
        }
        if ((this.f135381c.f135467c & PKIFailureInfo.duplicateCertReq) != 0) {
            G("WAL");
            L(SQLiteGlobal.g());
        } else {
            G(SQLiteGlobal.a());
            L(SQLiteGlobal.c());
        }
    }

    private void N(PreparedStatement preparedStatement) {
        if (this.f135389k && !preparedStatement.f135408f) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String O(String str) {
        return str.replaceAll("[\\s]*\\n+[\\s]*", " ");
    }

    private PreparedStatement d(String str) {
        boolean z15;
        SQLiteConnection sQLiteConnection;
        PreparedStatement preparedStatementX = this.f135385g.get(str);
        if (preparedStatementX == null) {
            z15 = false;
        } else {
            if (!preparedStatementX.f135410h) {
                return preparedStatementX;
            }
            z15 = true;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.f135388j, str);
        try {
            int iNativeGetParameterCount = nativeGetParameterCount(this.f135388j, jNativePrepareStatement);
            int iB = DatabaseUtils.b(str);
            sQLiteConnection = this;
            try {
                preparedStatementX = sQLiteConnection.x(str, jNativePrepareStatement, iNativeGetParameterCount, iB, nativeIsReadOnly(this.f135388j, jNativePrepareStatement));
                if (!z15 && u(iB)) {
                    sQLiteConnection.f135385g.put(str, preparedStatementX);
                    preparedStatementX.f135409g = true;
                }
                preparedStatementX.f135410h = true;
                return preparedStatementX;
            } catch (RuntimeException e15) {
                e = e15;
                RuntimeException runtimeException = e;
                if (preparedStatementX != null && preparedStatementX.f135409g) {
                    throw runtimeException;
                }
                nativeFinalizeStatement(sQLiteConnection.f135388j, jNativePrepareStatement);
                throw runtimeException;
            }
        } catch (RuntimeException e16) {
            e = e16;
            sQLiteConnection = this;
        }
    }

    private void e(PreparedStatement preparedStatement) {
    }

    private void f(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i15 = this.f135390l + 1;
            this.f135390l = i15;
            if (i15 == 1) {
                nativeResetCancel(this.f135388j, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    private void g(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.f135406d) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.f135406d + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long j15 = preparedStatement.f135405c;
        for (int i15 = 0; i15 < length; i15++) {
            Object obj = objArr[i15];
            int iC = DatabaseUtils.c(obj);
            if (iC == 0) {
                nativeBindNull(this.f135388j, j15, i15 + 1);
            } else if (iC == 1) {
                nativeBindLong(this.f135388j, j15, i15 + 1, ((Number) obj).longValue());
            } else if (iC == 2) {
                nativeBindDouble(this.f135388j, j15, i15 + 1, ((Number) obj).doubleValue());
            } else if (iC == 4) {
                nativeBindBlob(this.f135388j, j15, i15 + 1, (byte[]) obj);
            } else if (obj instanceof Boolean) {
                nativeBindLong(this.f135388j, j15, i15 + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.f135388j, j15, i15 + 1, obj.toString());
            }
        }
    }

    private static String h(String str) {
        if (str.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1)) {
            return "OFF";
        }
        if (str.equals("1")) {
            return "NORMAL";
        }
        return str.equals("2") ? "FULL" : str;
    }

    private void l(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i15 = this.f135390l - 1;
            this.f135390l = i15;
            if (i15 == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.f135388j, false);
            }
        }
    }

    private void m(boolean z15) {
        CloseGuard closeGuard = this.f135379a;
        if (closeGuard != null) {
            if (z15) {
                closeGuard.d();
            }
            this.f135379a.a();
        }
        if (this.f135388j != 0) {
            int iA = this.f135387i.a("close", null, null);
            try {
                this.f135385g.evictAll();
                nativeClose(this.f135388j);
                this.f135388j = 0L;
            } finally {
                this.f135387i.c(iA);
            }
        }
    }

    private static native void nativeBindBlob(long j15, long j16, int i15, byte[] bArr);

    private static native void nativeBindDouble(long j15, long j16, int i15, double d15);

    private static native void nativeBindLong(long j15, long j16, int i15, long j17);

    private static native void nativeBindNull(long j15, long j16, int i15);

    private static native void nativeBindString(long j15, long j16, int i15, String str);

    private static native void nativeCancel(long j15);

    private static native void nativeClose(long j15);

    private static native void nativeExecute(long j15, long j16);

    private static native int nativeExecuteForBlobFileDescriptor(long j15, long j16);

    private static native int nativeExecuteForChangedRowCount(long j15, long j16);

    private static native long nativeExecuteForCursorWindow(long j15, long j16, long j17, int i15, int i16, boolean z15);

    private static native long nativeExecuteForLastInsertedRowId(long j15, long j16);

    private static native long nativeExecuteForLong(long j15, long j16);

    private static native String nativeExecuteForString(long j15, long j16);

    private static native void nativeExecuteRaw(long j15, long j16);

    private static native void nativeFinalizeStatement(long j15, long j16);

    private static native int nativeGetColumnCount(long j15, long j16);

    private static native String nativeGetColumnName(long j15, long j16, int i15);

    private static native int nativeGetDbLookaside(long j15);

    private static native int nativeGetParameterCount(long j15, long j16);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j15, long j16);

    private static native int nativeKey(long j15, byte[] bArr);

    private static native long nativeOpen(String str, int i15, String str2, boolean z15, boolean z16);

    private static native long nativePrepareStatement(long j15, String str);

    private static native int nativeReKey(long j15, byte[] bArr);

    private static native void nativeRegisterCustomFunction(long j15, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j15, String str);

    private static native void nativeResetCancel(long j15, boolean z15);

    private static native void nativeResetStatementAndClearBindings(long j15, long j16);

    /* JADX INFO: Access modifiers changed from: private */
    public void s(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.f135388j, preparedStatement.f135405c);
        C(preparedStatement);
    }

    public static boolean t() {
        return nativeHasCodec();
    }

    private static boolean u(int i15) {
        return i15 == 2 || i15 == 1;
    }

    private PreparedStatement x(String str, long j15, int i15, int i16, boolean z15) {
        PreparedStatement preparedStatement = this.f135386h;
        if (preparedStatement != null) {
            this.f135386h = preparedStatement.f135403a;
            preparedStatement.f135403a = null;
            preparedStatement.f135409g = false;
        } else {
            preparedStatement = new PreparedStatement();
        }
        preparedStatement.f135404b = str;
        preparedStatement.f135405c = j15;
        preparedStatement.f135406d = i15;
        preparedStatement.f135407e = i16;
        preparedStatement.f135408f = z15;
        return preparedStatement;
    }

    static SQLiteConnection y(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i15, boolean z15) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i15, z15);
        try {
            sQLiteConnection.z();
            return sQLiteConnection;
        } catch (SQLiteException e15) {
            sQLiteConnection.m(false);
            throw e15;
        }
    }

    private void z() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f135381c;
        this.f135388j = nativeOpen(sQLiteDatabaseConfiguration.f135465a, sQLiteDatabaseConfiguration.f135467c, sQLiteDatabaseConfiguration.f135466b, SQLiteDebug.f135475b, SQLiteDebug.f135476c);
        SQLiteDatabaseHook sQLiteDatabaseHook = this.f135381c.f135472h;
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.b(this);
        }
        byte[] bArr = this.f135381c.f135471g;
        if (bArr != null && bArr.length > 0) {
            Logger.e("SQLiteConnection", String.format("Database keying operation returned:%s", Integer.valueOf(nativeKey(this.f135388j, bArr))));
        }
        SQLiteDatabaseHook sQLiteDatabaseHook2 = this.f135381c.f135472h;
        if (sQLiteDatabaseHook2 != null) {
            sQLiteDatabaseHook2.a(this);
        }
        byte[] bArr2 = this.f135381c.f135471g;
        if (bArr2 != null && bArr2.length > 0) {
            q("SELECT COUNT(*) FROM sqlite_schema;", null, null);
        }
        K();
        F();
        H();
        E();
        M();
        if (!nativeHasCodec()) {
            I();
        }
        int size = this.f135381c.f135473i.size();
        for (int i15 = 0; i15 < size; i15++) {
            nativeRegisterCustomFunction(this.f135388j, this.f135381c.f135473i.get(i15));
        }
    }

    public void A(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f135387i.a("prepare", str, null);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                if (sQLiteStatementInfo != null) {
                    try {
                        sQLiteStatementInfo.f135527a = preparedStatementD.f135406d;
                        sQLiteStatementInfo.f135529c = preparedStatementD.f135408f;
                        int iNativeGetColumnCount = nativeGetColumnCount(this.f135388j, preparedStatementD.f135405c);
                        if (iNativeGetColumnCount == 0) {
                            sQLiteStatementInfo.f135528b = f135377m;
                        } else {
                            sQLiteStatementInfo.f135528b = new String[iNativeGetColumnCount];
                            for (int i15 = 0; i15 < iNativeGetColumnCount; i15++) {
                                sQLiteStatementInfo.f135528b[i15] = nativeGetColumnName(this.f135388j, preparedStatementD.f135405c, i15);
                            }
                        }
                    } catch (Throwable th4) {
                        D(preparedStatementD);
                        throw th4;
                    }
                }
                D(preparedStatementD);
                this.f135387i.c(iA);
            } catch (RuntimeException e15) {
                this.f135387i.f(iA, e15);
                throw e15;
            }
        } catch (Throwable th5) {
            this.f135387i.c(iA);
            throw th5;
        }
    }

    void B(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f135389k = false;
        int size = sQLiteDatabaseConfiguration.f135473i.size();
        for (int i15 = 0; i15 < size; i15++) {
            SQLiteCustomFunction sQLiteCustomFunction = sQLiteDatabaseConfiguration.f135473i.get(i15);
            if (!this.f135381c.f135473i.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.f135388j, sQLiteCustomFunction);
            }
        }
        boolean z15 = sQLiteDatabaseConfiguration.f135470f;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f135381c;
        boolean z16 = z15 != sQLiteDatabaseConfiguration2.f135470f;
        boolean z17 = ((sQLiteDatabaseConfiguration.f135467c ^ sQLiteDatabaseConfiguration2.f135467c) & PKIFailureInfo.duplicateCertReq) != 0;
        boolean zEquals = sQLiteDatabaseConfiguration.f135469e.equals(sQLiteDatabaseConfiguration2.f135469e);
        this.f135381c.c(sQLiteDatabaseConfiguration);
        if (z16) {
            F();
        }
        if (z17) {
            M();
        }
        if (zEquals) {
            return;
        }
        I();
    }

    void J(boolean z15) {
        this.f135389k = z15;
    }

    protected void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.f135380b;
            if (sQLiteConnectionPool != null && this.f135388j != 0) {
                sQLiteConnectionPool.N();
            }
            m(true);
        } finally {
            super.finalize();
        }
    }

    void i(byte[] bArr) {
        int iNativeReKey = nativeReKey(this.f135388j, bArr);
        Logger.e("SQLiteConnection", String.format("Database rekey operation returned:%s", Integer.valueOf(iNativeReKey)));
        if (iNativeReKey != 0) {
            throw new SQLiteException(String.format("Failed to rekey database, result code:%s", Integer.valueOf(iNativeReKey)));
        }
    }

    void j() {
        m(false);
    }

    String k() {
        return this.f135387i.b();
    }

    public void n(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f135387i.a("execute", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    N(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        nativeExecute(this.f135388j, preparedStatementD.f135405c);
                        l(cancellationSignal);
                        D(preparedStatementD);
                        this.f135387i.c(iA);
                    } catch (Throwable th4) {
                        l(cancellationSignal);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    D(preparedStatementD);
                    throw th5;
                }
            } catch (RuntimeException e15) {
                this.f135387i.f(iA, e15);
                throw e15;
            }
        } catch (Throwable th6) {
            this.f135387i.c(iA);
            throw th6;
        }
    }

    public int o(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f135387i.a("executeForChangedRowCount", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    N(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        int iNativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.f135388j, preparedStatementD.f135405c);
                        l(cancellationSignal);
                        D(preparedStatementD);
                        if (this.f135387i.d(iA)) {
                            this.f135387i.h(iA, "changedRows=" + iNativeExecuteForChangedRowCount);
                        }
                        return iNativeExecuteForChangedRowCount;
                    } catch (Throwable th4) {
                        l(cancellationSignal);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    D(preparedStatementD);
                    throw th5;
                }
            } catch (Throwable th6) {
                if (this.f135387i.d(iA)) {
                    this.f135387i.h(iA, "changedRows=0");
                }
                throw th6;
            }
        } catch (RuntimeException e15) {
            this.f135387i.f(iA, e15);
            throw e15;
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        nativeCancel(this.f135388j);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x015d A[Catch: all -> 0x00aa, TryCatch #4 {all -> 0x00aa, blocks: (B:6:0x001b, B:23:0x006d, B:25:0x0075, B:70:0x0155, B:72:0x015d, B:73:0x0189), top: B:88:0x001b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x015d, please report this as an issue */
    public int p(String str, Object[] objArr, CursorWindow cursorWindow, int i15, int i16, boolean z15, CancellationSignal cancellationSignal) {
        int i17;
        String str2;
        String str3;
        int i18;
        String str4;
        int i19;
        int iJ;
        int i25;
        PreparedStatement preparedStatement;
        String str5 = ", countedRows=";
        String str6 = ", filledRows=";
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        cursorWindow.b();
        try {
            int iA = this.f135387i.a("executeForCursorWindow", str, objArr);
            int i26 = -1;
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    N(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    str2 = ", actualPos=";
                    str3 = "', startPos=";
                    try {
                        i18 = iA;
                        try {
                            try {
                                str5 = ", countedRows=";
                                preparedStatement = preparedStatementD;
                                str2 = str2;
                                i18 = i18;
                                str3 = str3;
                                str6 = ", filledRows=";
                                str4 = "window='";
                                i17 = i15;
                                try {
                                    long jNativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.f135388j, preparedStatementD.f135405c, cursorWindow.f135356c, i17, i16, z15);
                                    i25 = (int) (jNativeExecuteForCursorWindow >> 32);
                                    i19 = (int) jNativeExecuteForCursorWindow;
                                    try {
                                        iJ = cursorWindow.J();
                                        try {
                                            cursorWindow.O(i25);
                                            try {
                                                l(cancellationSignal);
                                                try {
                                                    D(preparedStatement);
                                                    if (this.f135387i.d(i18)) {
                                                        this.f135387i.h(i18, str4 + cursorWindow + str3 + i17 + str2 + i25 + str6 + iJ + str5 + i19);
                                                    }
                                                    cursorWindow.m();
                                                    return i19;
                                                } catch (RuntimeException e15) {
                                                    e = e15;
                                                    str2 = str2;
                                                    str3 = str3;
                                                    str5 = str5;
                                                    str6 = str6;
                                                    i26 = i25;
                                                    this.f135387i.f(i18, e);
                                                    throw e;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    str2 = str2;
                                                    str3 = str3;
                                                    str5 = str5;
                                                    str6 = str6;
                                                    if (this.f135387i.d(i18)) {
                                                        this.f135387i.h(i18, str4 + cursorWindow + str3 + i17 + str2 + i25 + str6 + iJ + str5 + i19);
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                str2 = str2;
                                                str3 = str3;
                                                str5 = str5;
                                                str6 = str6;
                                                i26 = i25;
                                                try {
                                                    try {
                                                        D(preparedStatement);
                                                        throw th;
                                                    } catch (RuntimeException e16) {
                                                        e = e16;
                                                        this.f135387i.f(i18, e);
                                                        throw e;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    i25 = i26;
                                                    if (this.f135387i.d(i18)) {
                                                        this.f135387i.h(i18, str4 + cursorWindow + str3 + i17 + str2 + i25 + str6 + iJ + str5 + i19);
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            i26 = i25;
                                            try {
                                                l(cancellationSignal);
                                                throw th;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                D(preparedStatement);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        iJ = -1;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    str2 = str2;
                                    str3 = str3;
                                    str5 = str5;
                                    str6 = str6;
                                    i19 = -1;
                                    iJ = -1;
                                    l(cancellationSignal);
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                str3 = str3;
                                preparedStatement = preparedStatementD;
                                str4 = "window='";
                                i17 = i15;
                                i19 = -1;
                                iJ = -1;
                                l(cancellationSignal);
                                throw th;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            preparedStatement = preparedStatementD;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        i17 = i15;
                        str5 = ", countedRows=";
                        str6 = ", filledRows=";
                        str4 = "window='";
                        preparedStatement = preparedStatementD;
                        str2 = str2;
                        i18 = iA;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    i17 = i15;
                    str3 = "', startPos=";
                    i18 = iA;
                    str5 = ", countedRows=";
                    str6 = ", filledRows=";
                    str4 = "window='";
                    preparedStatement = preparedStatementD;
                    str2 = ", actualPos=";
                    i19 = -1;
                    iJ = -1;
                }
            } catch (RuntimeException e17) {
                e = e17;
                i17 = i15;
                str2 = ", actualPos=";
                str3 = "', startPos=";
                i18 = iA;
                str5 = ", countedRows=";
                str6 = ", filledRows=";
                str4 = "window='";
                i19 = -1;
                iJ = -1;
            } catch (Throwable th15) {
                th = th15;
                i17 = i15;
                str2 = ", actualPos=";
                str3 = "', startPos=";
                i18 = iA;
                str5 = ", countedRows=";
                str6 = ", filledRows=";
                str4 = "window='";
                i19 = -1;
                iJ = -1;
                i25 = -1;
            }
        } catch (Throwable th16) {
            cursorWindow.m();
            throw th16;
        }
    }

    public long q(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f135387i.a("executeForLong", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    N(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        long jNativeExecuteForLong = nativeExecuteForLong(this.f135388j, preparedStatementD.f135405c);
                        l(cancellationSignal);
                        D(preparedStatementD);
                        this.f135387i.c(iA);
                        return jNativeExecuteForLong;
                    } catch (Throwable th4) {
                        l(cancellationSignal);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    D(preparedStatementD);
                    throw th5;
                }
            } catch (RuntimeException e15) {
                this.f135387i.f(iA, e15);
                throw e15;
            }
        } catch (Throwable th6) {
            this.f135387i.c(iA);
            throw th6;
        }
    }

    public String r(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f135387i.a("executeForString", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    N(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        String strNativeExecuteForString = nativeExecuteForString(this.f135388j, preparedStatementD.f135405c);
                        l(cancellationSignal);
                        D(preparedStatementD);
                        this.f135387i.c(iA);
                        return strNativeExecuteForString;
                    } catch (Throwable th4) {
                        l(cancellationSignal);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    D(preparedStatementD);
                    throw th5;
                }
            } catch (RuntimeException e15) {
                this.f135387i.f(iA, e15);
                throw e15;
            }
        } catch (Throwable th6) {
            this.f135387i.c(iA);
            throw th6;
        }
    }

    public String toString() {
        return "SQLiteConnection: " + this.f135381c.f135465a + " (" + this.f135382d + ")";
    }

    boolean v(String str) {
        return this.f135385g.get(str) != null;
    }

    public boolean w() {
        return this.f135383e;
    }
}
