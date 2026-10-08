package jf;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class u0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f102366c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f102367d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f102368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f102369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f102370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f102371h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f102372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f102373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<a> f102374l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f102376b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: jf.o0
            @Override // jf.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.b(sQLiteDatabase);
            }
        };
        f102368e = aVar;
        a aVar2 = new a() { // from class: jf.p0
            @Override // jf.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.r(sQLiteDatabase);
            }
        };
        f102369f = aVar2;
        a aVar3 = new a() { // from class: jf.q0
            @Override // jf.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f102370g = aVar3;
        a aVar4 = new a() { // from class: jf.r0
            @Override // jf.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.u(sQLiteDatabase);
            }
        };
        f102371h = aVar4;
        a aVar5 = new a() { // from class: jf.s0
            @Override // jf.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                u0.m(sQLiteDatabase);
            }
        };
        f102372j = aVar5;
        a aVar6 = new a() { // from class: jf.t0
            @Override // jf.u0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f102373k = aVar6;
        f102374l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    u0(Context context, String str, int i15) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i15);
        this.f102376b = false;
        this.f102375a = i15;
    }

    private void C(SQLiteDatabase sQLiteDatabase, int i15) {
        y(sQLiteDatabase);
        E(sQLiteDatabase, 0, i15);
    }

    private void E(SQLiteDatabase sQLiteDatabase, int i15, int i16) {
        List<a> list = f102374l;
        if (i16 <= list.size()) {
            while (i15 < i16) {
                f102374l.get(i15).a(sQLiteDatabase);
                i15++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i15 + " to " + i16 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f102366c);
    }

    public static /* synthetic */ void r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void u(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void y(SQLiteDatabase sQLiteDatabase) {
        if (this.f102376b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f102376b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C(sQLiteDatabase, this.f102375a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i15, int i16) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        C(sQLiteDatabase, i16);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        y(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i15, int i16) {
        y(sQLiteDatabase);
        E(sQLiteDatabase, i15, i16);
    }
}
