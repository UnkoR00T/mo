package ab;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import er.r;
import fr.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import oq.l;
import oq.o;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 B2\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010(\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010&\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0011J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0011J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0019R\u0016\u0010:\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R(\u0010A\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0>\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lab/e;", "Lza/c;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "", "sql", "Lza/g;", "B2", "(Ljava/lang/String;)Lza/g;", "q0", "()V", "b1", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37089p, "C", "r1", "X0", "", "l0", "()Z", "Lza/f;", "query", "Landroid/database/Cursor;", "X1", "(Lza/f;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "Y2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "E0", "(Ljava/lang/String;)V", "bindArgs", "a1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "W0", "B0", "close", "sqLiteDatabase", "I", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "a", "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "W", "()Ljava/lang/String;", "path", "P3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "x0", "()Ljava/util/List;", "attachedDbs", "b", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements za.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f5190b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f5191c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f5192d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final oq.k<Method> f5193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final oq.k<Method> f5194f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDatabase delegate;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lab/e$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "getThreadSessionMethod$delegate", "Loq/k;", "d", "()Ljava/lang/reflect/Method;", "getThreadSessionMethod", "beginTransactionMethod$delegate", "c", "beginTransactionMethod", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method c() {
            return (Method) e.f5194f.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method d() {
            return (Method) e.f5193e.getValue();
        }

        private a() {
        }
    }

    static {
        o oVar = o.PUBLICATION;
        f5193e = l.b(oVar, new er.a() { // from class: ab.a
            @Override // er.a
            public final Object a() {
                return e.E();
            }
        });
        f5194f = l.b(oVar, new er.a() { // from class: ab.b
            @Override // er.a
            public final Object a() {
                return e.y();
            }
        });
    }

    public e(SQLiteDatabase sQLiteDatabase) {
        this.delegate = sQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method E() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final void H(SQLiteTransactionListener transactionListener) throws IllegalAccessException, InvocationTargetException {
        a aVar = f5190b;
        if (aVar.c() == null || aVar.d() == null) {
            if (transactionListener != null) {
                C(transactionListener);
                return;
            } else {
                q0();
                return;
            }
        }
        Method methodC = aVar.c();
        Object objInvoke = aVar.d().invoke(this.delegate, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodC.invoke(objInvoke, 0, transactionListener, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteCursor J(za.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        fVar.b(new j(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor K(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) rVar.g(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method y() {
        Class<?> returnType;
        try {
            Method methodD = f5190b.d();
            if (methodD == null || (returnType = methodD.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // za.c
    public void B0() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // za.c
    public za.g B2(String sql) {
        return new k(this.delegate.compileStatement(sql));
    }

    public void C(SQLiteTransactionListener transactionListener) {
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // za.c
    public void E0(String sql) {
        this.delegate.execSQL(sql);
    }

    @Override // za.c
    public void H2() throws IllegalAccessException, InvocationTargetException {
        H(null);
    }

    public final boolean I(SQLiteDatabase sqLiteDatabase) {
        return t.c(this.delegate, sqLiteDatabase);
    }

    @Override // za.c
    public boolean P3() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // za.c
    public String W() {
        return this.delegate.getPath();
    }

    @Override // za.c
    public boolean W0() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // za.c
    public void X0() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // za.c
    public Cursor X1(final za.f query) {
        final r rVar = new r() { // from class: ab.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return e.J(query, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        return this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ab.d
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return e.K(rVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.a(), f5192d, null);
    }

    @Override // za.c
    public int Y2(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs) {
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb5 = new StringBuilder();
        sb5.append("UPDATE ");
        sb5.append(f5191c[conflictAlgorithm]);
        sb5.append(table);
        sb5.append(" SET ");
        int i15 = 0;
        for (String str : values.keySet()) {
            sb5.append(i15 > 0 ? "," : "");
            sb5.append(str);
            objArr[i15] = values.get(str);
            sb5.append("=?");
            i15++;
        }
        if (whereArgs != null) {
            for (int i16 = size; i16 < length; i16++) {
                objArr[i16] = whereArgs[i16 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb5.append(" WHERE ");
            sb5.append(whereClause);
        }
        za.g gVarB2 = B2(sb5.toString());
        za.a.INSTANCE.b(gVarB2, objArr);
        return gVarB2.I0();
    }

    @Override // za.c
    public void a1(String sql, Object[] bindArgs) {
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // za.c
    public void b1() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // za.c
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // za.c
    public boolean l0() {
        return this.delegate.inTransaction();
    }

    @Override // za.c
    public void q0() {
        this.delegate.beginTransaction();
    }

    @Override // za.c
    public void r1() {
        this.delegate.endTransaction();
    }

    @Override // za.c
    public List<Pair<String, String>> x0() {
        return this.delegate.getAttachedDbs();
    }
}
