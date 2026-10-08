package ab;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import io.sentry.android.core.c2;
import java.io.File;
import java.util.UUID;
import oq.l;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\u00020\u0001:\u0003\u0017\u0013\u0015B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001b\u0010'\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b#\u0010$*\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u00061"}, d2 = {"Lab/g;", "Lza/d;", "Landroid/content/Context;", "context", "", "name", "Lza/d$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lza/d$a;ZZ)V", "enabled", "Loq/i0;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lza/d$a;", "d", "Z", "e", "Loq/k;", "Lab/g$c;", "f", "Loq/k;", "lazyDelegate", "g", "writeAheadLoggingEnabled", "h", "()Lab/g$c;", "getDelegate$delegate", "(Lab/g;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lza/c;", "g3", "()Lza/c;", "writableDatabase", "c3", "readableDatabase", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements za.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final za.d.a callback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean useNoBackupDirectory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDataLossOnRecovery;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k<c> lazyDelegate = l.a(new er.a() { // from class: ab.f
        @Override // er.a
        public final Object a() {
            return g.m(this.f5196a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writeAheadLoggingEnabled;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lab/g$b;", "", "Lab/e;", "db", "<init>", "(Lab/e;)V", "a", "Lab/e;", "()Lab/e;", "b", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private e db;

        public b(e eVar) {
            this.db = eVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getDb() {
            return this.db;
        }

        public final void b(e eVar) {
            this.db = eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 @2\u00020\u0001:\u0003(,0B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001cJ'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105¨\u0006A"}, d2 = {"Lab/g$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "Lab/g$b;", "dbRef", "Lza/d$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lab/g$b;Lza/d$a;Z)V", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "u", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "r", "Lza/c;", "m", "(Z)Lza/c;", "sqLiteDatabase", "Lab/e;", "p", "(Landroid/database/sqlite/SQLiteDatabase;)Lab/e;", "Loq/i0;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lab/g$b;", "getDbRef", "()Lab/g$b;", "c", "Lza/d$a;", "getCallback", "()Lza/d$a;", "d", "Z", "getAllowDataLossOnRecovery", "()Z", "e", "migrated", "Lcb/a;", "f", "Lcb/a;", "lock", "g", "opened", "h", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b dbRef;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final za.d.a callback;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean allowDataLossOnRecovery;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean migrated;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final cb.a lock;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean opened;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lab/g$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lab/g$c$b;", "callbackName", "", "cause", "<init>", "(Lab/g$c$b;Ljava/lang/Throwable;)V", "a", "Lab/g$c$b;", "()Lab/g$c$b;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final b callbackName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public a(b bVar, Throwable th4) {
                super(th4);
                this.callbackName = bVar;
                this.cause = th4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lab/g$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN;


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ wq.a f5222g = wq.b.a(b());
        }

        /* JADX INFO: renamed from: ab.g$c$c, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lab/g$c$c;", "", "<init>", "()V", "Lab/g$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Lab/e;", "a", "(Lab/g$b;Landroid/database/sqlite/SQLiteDatabase;)Lab/e;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final e a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                e db5 = refHolder.getDb();
                if (db5 != null && db5.I(sqLiteDatabase)) {
                    return db5;
                }
                e eVar = new e(sqLiteDatabase);
                refHolder.b(eVar);
                return eVar;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5223a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f5223a = iArr;
            }
        }

        public c(Context context, String str, final b bVar, final za.d.a aVar, boolean z15) {
            super(context, str, null, aVar.version, new DatabaseErrorHandler() { // from class: ab.h
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    g.c.h(aVar, bVar, sQLiteDatabase);
                }
            });
            this.context = context;
            this.dbRef = bVar;
            this.callback = aVar;
            this.allowDataLossOnRecovery = z15;
            this.lock = new cb.a(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(za.d.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            aVar.c(INSTANCE.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase r(boolean writable) {
            return writable ? super.getWritableDatabase() : super.getReadableDatabase();
        }

        private final SQLiteDatabase u(boolean writable) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z15 = this.opened;
            if (databaseName != null && !z15 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    c2.g("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return r(writable);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return r(writable);
                } catch (Throwable th4) {
                    th = th4;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        Throwable cause = aVar.getCause();
                        int i15 = d.f5223a[aVar.getCallbackName().ordinal()];
                        if (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) {
                            throw cause;
                        }
                        if (i15 != 5) {
                            throw new p();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return r(writable);
                    } catch (a e15) {
                        throw e15.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                cb.a.c(this.lock, false, 1, null);
                super.close();
                this.dbRef.b(null);
                this.opened = false;
            } finally {
                this.lock.d();
            }
        }

        public final za.c m(boolean writable) {
            za.c cVarP;
            try {
                this.lock.b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseU = u(writable);
                if (this.migrated) {
                    close();
                    cVarP = m(writable);
                } else {
                    cVarP = p(sQLiteDatabaseU);
                }
                return cVarP;
            } finally {
                this.lock.d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db5) {
            if (!this.migrated && this.callback.version != db5.getVersion()) {
                db5.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.b(p(db5));
            } catch (Throwable th4) {
                throw new a(b.ON_CONFIGURE, th4);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            try {
                this.callback.d(p(sqLiteDatabase));
            } catch (Throwable th4) {
                throw new a(b.ON_CREATE, th4);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db5, int oldVersion, int newVersion) {
            this.migrated = true;
            try {
                this.callback.e(p(db5), oldVersion, newVersion);
            } catch (Throwable th4) {
                throw new a(b.ON_DOWNGRADE, th4);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db5) {
            if (!this.migrated) {
                try {
                    this.callback.f(p(db5));
                } catch (Throwable th4) {
                    throw new a(b.ON_OPEN, th4);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            this.migrated = true;
            try {
                this.callback.g(p(sqLiteDatabase), oldVersion, newVersion);
            } catch (Throwable th4) {
                throw new a(b.ON_UPGRADE, th4);
            }
        }

        public final e p(SQLiteDatabase sqLiteDatabase) {
            return INSTANCE.a(this.dbRef, sqLiteDatabase);
        }
    }

    public g(Context context, String str, za.d.a aVar, boolean z15, boolean z16) {
        this.context = context;
        this.name = str;
        this.callback = aVar;
        this.useNoBackupDirectory = z15;
        this.allowDataLossOnRecovery = z16;
    }

    private final c h() {
        return this.lazyDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c m(g gVar) {
        c cVar;
        if (gVar.name == null || !gVar.useNoBackupDirectory) {
            cVar = new c(gVar.context, gVar.name, new b(null), gVar.callback, gVar.allowDataLossOnRecovery);
        } else {
            cVar = new c(gVar.context, new File(za.b.a(gVar.context), gVar.name).getAbsolutePath(), new b(null), gVar.callback, gVar.allowDataLossOnRecovery);
        }
        cVar.setWriteAheadLoggingEnabled(gVar.writeAheadLoggingEnabled);
        return cVar;
    }

    @Override // za.d
    public za.c c3() {
        return h().m(false);
    }

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.c()) {
            h().close();
        }
    }

    @Override // za.d
    public za.c g3() {
        return h().m(true);
    }

    @Override // za.d
    /* JADX INFO: renamed from: getDatabaseName, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.c()) {
            h().setWriteAheadLoggingEnabled(enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }
}
