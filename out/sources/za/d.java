package za;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import fr.k;
import fr.t;
import fu.r;
import io.sentry.android.core.c2;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lza/d;", "Ljava/io/Closeable;", "", "enabled", "Loq/i0;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lza/c;", "g3", "()Lza/c;", "writableDatabase", "c3", "readableDatabase", "a", "b", "c", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d extends Closeable {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lza/d$a;", "", "", "version", "<init>", "(I)V", "", "fileName", "Loq/i0;", "a", "(Ljava/lang/String;)V", "Lza/c;", "db", "b", "(Lza/c;)V", "d", "oldVersion", "newVersion", "g", "(Lza/c;II)V", "e", "f", "c", "I", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int version;

        public a(int i15) {
            this.version = i15;
        }

        private final void a(String fileName) {
            if (r.G(fileName, ":memory:", true)) {
                return;
            }
            int length = fileName.length() - 1;
            int i15 = 0;
            boolean z15 = false;
            while (i15 <= length) {
                boolean z16 = t.d(fileName.charAt(!z15 ? i15 : length), 32) <= 0;
                if (z15) {
                    if (!z16) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z16) {
                    i15++;
                } else {
                    z15 = true;
                }
            }
            if (fileName.subSequence(i15, length + 1).toString().length() == 0) {
                return;
            }
            c2.g("SupportSQLite", "deleting the database file: " + fileName);
            try {
                SQLiteDatabase.deleteDatabase(new File(fileName));
            } catch (Exception e15) {
                c2.h("SupportSQLite", "delete failed: ", e15);
            }
        }

        public void b(za.c db5) {
        }

        public void c(za.c db5) {
            c2.e("SupportSQLite", "Corruption reported by sqlite on database: " + db5 + ".path");
            if (!db5.isOpen()) {
                String strW = db5.W();
                if (strW != null) {
                    a(strW);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listX0 = null;
            try {
                try {
                    listX0 = db5.x0();
                } finally {
                    if (listX0 != null) {
                        Iterator<T> it = listX0.iterator();
                        while (it.hasNext()) {
                            a((String) ((Pair) it.next()).second);
                        }
                    } else {
                        String strW2 = db5.W();
                        if (strW2 != null) {
                            a(strW2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db5.close();
            } catch (IOException unused2) {
            }
            if (listX0 != null) {
                return;
            }
        }

        public abstract void d(za.c db5);

        public abstract void e(za.c db5, int oldVersion, int newVersion);

        public abstract void f(za.c db5);

        public abstract void g(za.c db5, int oldVersion, int newVersion);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\r\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lza/d$b;", "", "Landroid/content/Context;", "context", "", "name", "Lza/d$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lza/d$a;ZZ)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lza/d$a;", "d", "Z", "e", "f", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final a callback;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean useNoBackupDirectory;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final boolean allowDataLossOnRecovery;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lza/d$b$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lza/d$b;", "b", "()Lza/d$b;", "", "name", "d", "(Ljava/lang/String;)Lza/d$b$a;", "Lza/d$a;", "callback", "c", "(Lza/d$a;)Lza/d$b$a;", "", "useNoBackupDirectory", "e", "(Z)Lza/d$b$a;", "allowDataLossOnRecovery", "a", "Landroid/content/Context;", "Ljava/lang/String;", "Lza/d$a;", "Z", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Context context;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private String name;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private a callback;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private boolean useNoBackupDirectory;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private boolean allowDataLossOnRecovery;

            public a(Context context) {
                this.context = context;
            }

            public a a(boolean allowDataLossOnRecovery) {
                this.allowDataLossOnRecovery = allowDataLossOnRecovery;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.callback;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.context, this.name, aVar, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            public a c(a callback) {
                this.callback = callback;
                return this;
            }

            public a d(String name) {
                this.name = name;
                return this;
            }

            public a e(boolean useNoBackupDirectory) {
                this.useNoBackupDirectory = useNoBackupDirectory;
                return this;
            }
        }

        /* JADX INFO: renamed from: za.d$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lza/d$b$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lza/d$b$a;", "a", "(Landroid/content/Context;)Lza/d$b$a;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final a a(Context context) {
                return new a(context);
            }

            private Companion() {
            }
        }

        public b(Context context, String str, a aVar, boolean z15, boolean z16) {
            this.context = context;
            this.name = str;
            this.callback = aVar;
            this.useNoBackupDirectory = z15;
            this.allowDataLossOnRecovery = z16;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lza/d$c;", "", "Lza/d$b;", "configuration", "Lza/d;", "a", "(Lza/d$b;)Lza/d;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        d a(b configuration);
    }

    za.c c3();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    za.c g3();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean enabled);
}
