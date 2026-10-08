package oa;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 92\u00020\u0001:\u0002*'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\bJ'\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\"\u0010\bJ\u0013\u0010$\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b&\u0010%R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010/\u001a\u00020,8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Loa/a;", "", "<init>", "()V", "Lya/b;", "connection", "Loq/i0;", "i", "(Lya/b;)V", "g", "j", "k", "h", "", "s", "(Lya/b;)Z", "B", "l", "m", "f", "t", "u", "v", "w", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "x", "", "oldVersion", "newVersion", "y", "(Lya/b;II)V", "z", "Loa/u$d;", "p", "(Loa/u$d;)I", "q", "a", "Z", "isConfigured", "b", "isInitializing", "Loa/c;", "o", "()Loa/c;", "configuration", "Loa/a0;", "r", "()Loa/a0;", "openDelegate", "", "Loa/u$b;", "n", "()Ljava/util/List;", "callbacks", "c", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isConfigured;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isInitializing;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Loa/a$b;", "Lya/c;", "actual", "<init>", "(Loa/a;Lya/c;)V", "", "filename", "Lya/b;", "d", "(Ljava/lang/String;)Lya/b;", "fileName", "a", "Lya/c;", "", "b", "()Z", "hasConnectionPool", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected final class b implements ya.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ya.c actual;

        /* JADX INFO: renamed from: oa.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C3568a implements er.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f143601a;

            C3568a(String str) {
                this.f143601a = str;
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Void b(Throwable th4) {
                throw new IllegalStateException("Unable to open database '" + this.f143601a + "'. Was a proper path / name used in Room's database builder?", th4);
            }
        }

        public b(ya.c cVar) {
            this.actual = cVar;
        }

        private final ya.b d(final String filename) {
            pa.b bVar = new pa.b(filename, (a.this.isConfigured || a.this.isInitializing || fr.t.c(filename, ":memory:")) ? false : true);
            final a aVar = a.this;
            return (ya.b) bVar.b(new er.a() { // from class: oa.b
                @Override // er.a
                public final Object a() {
                    return a.b.e(aVar, this, filename);
                }
            }, new C3568a(filename));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ya.b e(a aVar, b bVar, String str) throws Exception {
            if (aVar.isInitializing) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            }
            ya.b bVarA = bVar.actual.a(str);
            if (aVar.isConfigured) {
                aVar.g(bVarA);
                return bVarA;
            }
            try {
                aVar.isInitializing = true;
                aVar.i(bVarA);
                return bVarA;
            } finally {
                aVar.isInitializing = false;
            }
        }

        @Override // ya.c
        public ya.b a(String fileName) {
            return d(a.this.A(fileName));
        }

        @Override // ya.c
        public boolean b() {
            return this.actual.b();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143602a;

        static {
            int[] iArr = new int[u.d.values().length];
            try {
                iArr[u.d.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.d.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f143602a = iArr;
        }
    }

    private final void B(ya.b connection) throws Exception {
        l(connection);
        ya.a.a(connection, z.a(getOpenDelegate().getIdentityHash()));
    }

    private final void f(ya.b connection) throws Exception {
        Object objB;
        if (t(connection)) {
            ya.d dVarE4 = connection.e4("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                String strU3 = dVarE4.Y3() ? dVarE4.u3(0) : null;
                cr.a.a(dVarE4, null);
                if (fr.t.c(getOpenDelegate().getIdentityHash(), strU3) || fr.t.c(getOpenDelegate().getLegacyIdentityHash(), strU3)) {
                    return;
                }
                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + strU3).toString());
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    cr.a.a(dVarE4, th4);
                    throw th5;
                }
            }
        }
        ya.a.a(connection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            oq.t.Companion companion = oq.t.INSTANCE;
            a0.a aVarJ = getOpenDelegate().j(connection);
            if (!aVarJ.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.expectedFoundMsg).toString());
            }
            getOpenDelegate().h(connection);
            B(connection);
            objB = oq.t.b(oq.i0.f148189a);
            if (oq.t.g(objB)) {
                ya.a.a(connection, "END TRANSACTION");
            }
            Throwable thD = oq.t.d(objB);
            if (thD == null) {
                oq.t.a(objB);
            } else {
                ya.a.a(connection, "ROLLBACK TRANSACTION");
                throw thD;
            }
        } catch (Throwable th6) {
            oq.t.Companion companion2 = oq.t.INSTANCE;
            objB = oq.t.b(oq.u.a(th6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(ya.b connection) throws Exception {
        h(connection);
        k(connection);
        getOpenDelegate().g(connection);
    }

    private final void h(ya.b connection) throws Exception {
        ya.d dVarE4 = connection.e4("PRAGMA busy_timeout");
        try {
            dVarE4.Y3();
            long j15 = dVarE4.getLong(0);
            cr.a.a(dVarE4, null);
            if (j15 < 3000) {
                ya.a.a(connection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(ya.b connection) throws Exception {
        Object objB;
        h(connection);
        j(connection);
        k(connection);
        ya.d dVarE4 = connection.e4("PRAGMA user_version");
        try {
            dVarE4.Y3();
            int i15 = (int) dVarE4.getLong(0);
            cr.a.a(dVarE4, null);
            if (i15 != getOpenDelegate().getVersion()) {
                ya.a.a(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    oq.t.Companion companion = oq.t.INSTANCE;
                    if (i15 == 0) {
                        x(connection);
                    } else {
                        y(connection, i15, getOpenDelegate().getVersion());
                    }
                    ya.a.a(connection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    objB = oq.t.b(oq.i0.f148189a);
                } catch (Throwable th4) {
                    oq.t.Companion companion2 = oq.t.INSTANCE;
                    objB = oq.t.b(oq.u.a(th4));
                }
                if (oq.t.g(objB)) {
                    ya.a.a(connection, "END TRANSACTION");
                }
                Throwable thD = oq.t.d(objB);
                if (thD != null) {
                    ya.a.a(connection, "ROLLBACK TRANSACTION");
                    throw thD;
                }
            }
            z(connection);
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                cr.a.a(dVarE4, th5);
                throw th6;
            }
        }
    }

    private final void j(ya.b connection) throws Exception {
        if (getConfiguration().journalMode == u.d.WRITE_AHEAD_LOGGING) {
            ya.a.a(connection, "PRAGMA journal_mode = WAL");
        } else {
            ya.a.a(connection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void k(ya.b connection) throws Exception {
        if (getConfiguration().journalMode == u.d.WRITE_AHEAD_LOGGING) {
            ya.a.a(connection, "PRAGMA synchronous = NORMAL");
        } else {
            ya.a.a(connection, "PRAGMA synchronous = FULL");
        }
    }

    private final void l(ya.b connection) throws Exception {
        ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void m(ya.b connection) throws Exception {
        if (!getConfiguration().allowDestructiveMigrationForAllTables) {
            getOpenDelegate().b(connection);
            return;
        }
        ya.d dVarE4 = connection.e4("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            List listC = pq.v.c();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(0);
                if (!fu.r.V(strU3, "sqlite_", false, 2, null) && !fr.t.c(strU3, "android_metadata")) {
                    listC.add(oq.y.a(strU3, Boolean.valueOf(fr.t.c(dVarE4.u3(1), "view"))));
                }
            }
            List<oq.r> listA = pq.v.a(listC);
            cr.a.a(dVarE4, null);
            for (oq.r rVar : listA) {
                String str = (String) rVar.a();
                if (((Boolean) rVar.b()).booleanValue()) {
                    ya.a.a(connection, "DROP VIEW IF EXISTS `" + str + '`');
                } else {
                    ya.a.a(connection, "DROP TABLE IF EXISTS `" + str + '`');
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    private final boolean s(ya.b connection) throws Exception {
        ya.d dVarE4 = connection.e4("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z15 = false;
            if (dVarE4.Y3() && dVarE4.getLong(0) == 0) {
                z15 = true;
            }
            cr.a.a(dVarE4, null);
            return z15;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    private final boolean t(ya.b connection) throws Exception {
        ya.d dVarE4 = connection.e4("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z15 = false;
            if (dVarE4.Y3() && dVarE4.getLong(0) != 0) {
                z15 = true;
            }
            cr.a.a(dVarE4, null);
            return z15;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    private final void u(ya.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((u.b) it.next()).a(connection);
        }
    }

    private final void v(ya.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((u.b) it.next()).c(connection);
        }
    }

    private final void w(ya.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((u.b) it.next()).e(connection);
        }
    }

    public abstract String A(String fileName);

    protected abstract List<u.b> n();

    /* JADX INFO: renamed from: o */
    protected abstract oa.c getConfiguration();

    protected final int p(u.d dVar) {
        int i15 = c.f143602a[dVar.ordinal()];
        if (i15 == 1) {
            return 1;
        }
        if (i15 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + dVar + '\'').toString());
    }

    protected final int q(u.d dVar) {
        int i15 = c.f143602a[dVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + dVar + '\'').toString());
    }

    /* JADX INFO: renamed from: r */
    protected abstract a0 getOpenDelegate();

    protected final void x(ya.b connection) {
        boolean zS = s(connection);
        getOpenDelegate().a(connection);
        if (!zS) {
            a0.a aVarJ = getOpenDelegate().j(connection);
            if (!aVarJ.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.expectedFoundMsg).toString());
            }
        }
        B(connection);
        getOpenDelegate().f(connection);
        u(connection);
    }

    protected final void y(ya.b connection, int oldVersion, int newVersion) {
        List<ra.b> listB = ta.h.b(getConfiguration().migrationContainer, oldVersion, newVersion);
        if (listB == null) {
            if (!ta.h.d(getConfiguration(), oldVersion, newVersion)) {
                m(connection);
                v(connection);
                getOpenDelegate().a(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        getOpenDelegate().i(connection);
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            ((ra.b) it.next()).a(connection);
        }
        a0.a aVarJ = getOpenDelegate().j(connection);
        if (aVarJ.isValid) {
            getOpenDelegate().h(connection);
            B(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + aVarJ.expectedFoundMsg).toString());
        }
    }

    protected final void z(ya.b connection) {
        f(connection);
        getOpenDelegate().g(connection);
        w(connection);
        this.isConfigured = true;
    }
}
