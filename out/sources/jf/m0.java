package jf;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class m0 implements jf.d, kf.b, jf.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ye.c f102340f = ye.c.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f102341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lf.a f102342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lf.a f102343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f102344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nq.a<String> f102345e;

    interface b<T, U> {
        U apply(T t15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f102346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f102347b;

        private c(String str, String str2) {
            this.f102346a = str;
            this.f102347b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    m0(lf.a aVar, lf.a aVar2, e eVar, u0 u0Var, nq.a<String> aVar3) {
        this.f102341a = u0Var;
        this.f102342b = aVar;
        this.f102343c = aVar2;
        this.f102344d = eVar;
        this.f102345e = aVar3;
    }

    static <T> T A2(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object C(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.b(cursor.getInt(0), df.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ df.a C0(final m0 m0Var, String str, final Map map, final df.a.C0928a c0928a, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        return (df.a) A2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: jf.a0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.N(this.f102315a, map, c0928a, (Cursor) obj);
            }
        });
    }

    private long C1() {
        return o1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private df.f D1() {
        final long jA = this.f102342b.a();
        return (df.f) K1(new b() { // from class: jf.c0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.O0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ SQLiteDatabase E(Throwable th4) {
        throw new kf.a("Timed out while trying to open db.", th4);
    }

    private Long F1(SQLiteDatabase sQLiteDatabase, af.o oVar) {
        StringBuilder sb5 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(mf.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb5.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb5.append(" and extras is null");
        }
        return (Long) A2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb5.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: jf.n
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.a0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object H(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.b(cursor.getInt(0), df.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Long H0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Object I(final m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        A2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: jf.v
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.C(this.f102377a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean J(m0 m0Var, af.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lF1 = m0Var.F1(sQLiteDatabase, oVar);
        return lF1 == null ? Boolean.FALSE : (Boolean) A2(m0Var.o1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF1.toString()}), new b() { // from class: jf.u
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object K(long j15, af.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j15));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(mf.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(mf.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] L(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            byte[] bArr2 = (byte[]) arrayList.get(i15);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List M(SQLiteDatabase sQLiteDatabase) {
        return (List) A2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: jf.k0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.y((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ df.a N(m0 m0Var, Map map, df.a.C0928a c0928a, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            df.c.b bVarT0 = m0Var.T0(cursor.getInt(1));
            long j15 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(df.c.c().c(bVarT0).b(j15).a());
        }
        m0Var.i2(c0928a, map);
        return c0928a.e(m0Var.D1()).d(m0Var.s1()).c(m0Var.f102345e.get()).b();
    }

    public static /* synthetic */ df.f O0(final long j15, SQLiteDatabase sQLiteDatabase) {
        return (df.f) A2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: jf.d0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.r(j15, (Cursor) obj);
            }
        });
    }

    private boolean P1() {
        return x1() * C1() >= this.f102344d.f();
    }

    private List<k> Q1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                af.i.a aVarM = next.b().m();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarM.c(cVar.f102346a, cVar.f102347b);
                }
                listIterator.set(k.a(next.c(), next.d(), aVarM.d()));
            }
        }
        return list;
    }

    private List<k> S1(SQLiteDatabase sQLiteDatabase, final af.o oVar, int i15) {
        final ArrayList arrayList = new ArrayList();
        Long lF1 = F1(sQLiteDatabase, oVar);
        if (lF1 == null) {
            return arrayList;
        }
        A2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id"}, "context_id = ?", new String[]{lF1.toString()}, null, null, null, String.valueOf(i15)), new b() { // from class: jf.x
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.t0(this.f102381a, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private df.c.b T0(int i15) {
        df.c.b bVar = df.c.b.REASON_UNKNOWN;
        if (i15 == bVar.h()) {
            return bVar;
        }
        df.c.b bVar2 = df.c.b.MESSAGE_TOO_OLD;
        if (i15 == bVar2.h()) {
            return bVar2;
        }
        df.c.b bVar3 = df.c.b.CACHE_FULL;
        if (i15 == bVar3.h()) {
            return bVar3;
        }
        df.c.b bVar4 = df.c.b.PAYLOAD_TOO_BIG;
        if (i15 == bVar4.h()) {
            return bVar4;
        }
        df.c.b bVar5 = df.c.b.MAX_RETRIES_REACHED;
        if (i15 == bVar5.h()) {
            return bVar5;
        }
        df.c.b bVar6 = df.c.b.INVALID_PAYLOD;
        if (i15 == bVar6.h()) {
            return bVar6;
        }
        df.c.b bVar7 = df.c.b.SERVER_ERROR;
        if (i15 == bVar7.h()) {
            return bVar7;
        }
        ef.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
        return bVar;
    }

    private Map<Long, Set<c>> T1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb5 = new StringBuilder("event_id IN (");
        for (int i15 = 0; i15 < list.size(); i15++) {
            sb5.append(list.get(i15).c());
            if (i15 < list.size() - 1) {
                sb5.append(',');
            }
        }
        sb5.append(')');
        A2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb5.toString(), null, null, null, null), new b() { // from class: jf.z
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.d0(map, (Cursor) obj);
            }
        });
        return map;
    }

    public static /* synthetic */ Long V(m0 m0Var, af.i iVar, af.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m0Var.P1()) {
            m0Var.b(1L, df.c.b.CACHE_FULL, iVar.k());
            return -1L;
        }
        long jD1 = m0Var.d1(sQLiteDatabase, oVar);
        int iE = m0Var.f102344d.e();
        byte[] bArrA = iVar.e().a();
        boolean z15 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jD1));
        contentValues.put("transport_name", iVar.k());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.l()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z15));
        contentValues.put("payload", z15 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.j());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z15) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i15 = 1; i15 <= iCeil; i15++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i15 - 1) * iE, Math.min(i15 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i15));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    private void Y0(final SQLiteDatabase sQLiteDatabase) {
        t2(new d() { // from class: jf.l
            @Override // jf.m0.d
            public final Object a() {
                return m0.Z(sQLiteDatabase);
            }
        }, new b() { // from class: jf.w
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.b0((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ Object Z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long a0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object b0(Throwable th4) {
        throw new kf.a("Timed out while trying to acquire the lock.", th4);
    }

    public static /* synthetic */ Object c0(String str, df.c.b bVar, long j15, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) A2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.h())}), new b() { // from class: jf.y
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j15 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.h())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.h()));
        contentValues.put("events_dropped_count", Long.valueOf(j15));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object d0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j15 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j15));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j15), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    private long d1(SQLiteDatabase sQLiteDatabase, af.o oVar) {
        Long lF1 = F1(sQLiteDatabase, oVar);
        if (lF1 != null) {
            return lF1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(mf.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private static byte[] d2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void i2(df.a.C0928a c0928a, Map<String, List<df.c>> map) {
        for (Map.Entry<String, List<df.c>> entry : map.entrySet()) {
            c0928a.a(df.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] j2(long j15) {
        return (byte[]) A2(o1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j15)}, null, null, "sequence_num"), new b() { // from class: jf.b0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.L((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Integer n0(final m0 m0Var, long j15, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        String[] strArr = {String.valueOf(j15)};
        A2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: jf.s
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.H(this.f102361a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ df.f r(long j15, Cursor cursor) {
        cursor.moveToNext();
        return df.f.c().c(cursor.getLong(0)).b(j15).a();
    }

    private df.b s1() {
        return df.b.b().b(df.e.c().b(i1()).c(e.f102323a.f()).a()).a();
    }

    public static /* synthetic */ Object t0(m0 m0Var, List list, af.o oVar, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            long j15 = cursor.getLong(0);
            boolean z15 = cursor.getInt(7) != 0;
            af.i.a aVarL = af.i.a().k(cursor.getString(1)).i(cursor.getLong(2)).l(cursor.getLong(3));
            if (z15) {
                aVarL.h(new af.h(v2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarL.h(new af.h(v2(cursor.getString(4)), m0Var.j2(j15)));
            }
            if (!cursor.isNull(6)) {
                aVarL.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarL.j(Integer.valueOf(cursor.getInt(8)));
            }
            list.add(k.a(j15, oVar, aVarL.d()));
        }
        return null;
    }

    private <T> T t2(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f102343c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e15) {
                if (this.f102343c.a() >= ((long) this.f102344d.b()) + jA) {
                    return bVar.apply(e15);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static /* synthetic */ List u(m0 m0Var, af.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> listS1 = m0Var.S1(sQLiteDatabase, oVar, m0Var.f102344d.d());
        for (ye.e eVar : ye.e.values()) {
            if (eVar != oVar.d()) {
                int iD = m0Var.f102344d.d() - listS1.size();
                if (iD <= 0) {
                    break;
                }
                listS1.addAll(m0Var.S1(sQLiteDatabase, oVar.f(eVar), iD));
            }
        }
        return m0Var.Q1(listS1, m0Var.T1(sQLiteDatabase, listS1));
    }

    public static /* synthetic */ Object u0(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m0Var.f102342b.a()).execute();
        return null;
    }

    private static ye.c v2(String str) {
        return str == null ? f102340f : ye.c.b(str);
    }

    private long x1() {
        return o1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static /* synthetic */ List y(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(af.o.a().b(cursor.getString(1)).d(mf.a.b(cursor.getInt(2))).c(d2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private static String y2(Iterable<k> iterable) {
        StringBuilder sb5 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb5.append(it.next().c());
            if (it.hasNext()) {
                sb5.append(',');
            }
        }
        sb5.append(')');
        return sb5.toString();
    }

    <T> T K1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseO1 = o1();
        sQLiteDatabaseO1.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseO1);
            sQLiteDatabaseO1.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseO1.endTransaction();
        }
    }

    @Override // jf.d
    public Iterable<af.o> Q0() {
        return (Iterable) K1(new b() { // from class: jf.g0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.M((SQLiteDatabase) obj);
            }
        });
    }

    @Override // jf.d
    public long V0(af.o oVar) {
        return ((Long) A2(o1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(mf.a.a(oVar.d()))}), new b() { // from class: jf.h0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.H0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // jf.d
    public void Z0(final af.o oVar, final long j15) {
        K1(new b() { // from class: jf.p
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.K(j15, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // jf.c
    public void b(final long j15, final df.c.b bVar, final String str) {
        K1(new b() { // from class: jf.r
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.c0(str, bVar, j15, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // jf.d
    public k c4(final af.o oVar, final af.i iVar) {
        ef.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.k(), oVar.b());
        long jLongValue = ((Long) K1(new b() { // from class: jf.i0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.V(this.f102328a, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, oVar, iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f102341a.close();
    }

    @Override // jf.d
    public void f2(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + y2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            K1(new b() { // from class: jf.l0
                @Override // jf.m0.b
                public final Object apply(Object obj) {
                    return m0.I(this.f102335a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // jf.c
    public void h() {
        K1(new b() { // from class: jf.q
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.u0(this.f102357a, (SQLiteDatabase) obj);
            }
        });
    }

    long i1() {
        return x1() * C1();
    }

    @Override // kf.b
    public <T> T m(kf.b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseO1 = o1();
        Y0(sQLiteDatabaseO1);
        try {
            T tB = aVar.B();
            sQLiteDatabaseO1.setTransactionSuccessful();
            return tB;
        } finally {
            sQLiteDatabaseO1.endTransaction();
        }
    }

    SQLiteDatabase o1() {
        final u0 u0Var = this.f102341a;
        Objects.requireNonNull(u0Var);
        return (SQLiteDatabase) t2(new d() { // from class: jf.e0
            @Override // jf.m0.d
            public final Object a() {
                return u0Var.getWritableDatabase();
            }
        }, new b() { // from class: jf.f0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.E((Throwable) obj);
            }
        });
    }

    @Override // jf.c
    public df.a p() {
        final df.a.C0928a c0928aE = df.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (df.a) K1(new b() { // from class: jf.t
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.C0(this.f102362a, str, map, c0928aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // jf.d
    public int s0() {
        final long jA = this.f102342b.a() - this.f102344d.c();
        return ((Integer) K1(new b() { // from class: jf.j0
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.n0(this.f102332a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // jf.d
    public void w0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            o1().compileStatement("DELETE FROM events WHERE _id in " + y2(iterable)).execute();
        }
    }

    @Override // jf.d
    public Iterable<k> x3(final af.o oVar) {
        return (Iterable) K1(new b() { // from class: jf.m
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.u(this.f102338a, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // jf.d
    public boolean z0(final af.o oVar) {
        return ((Boolean) K1(new b() { // from class: jf.o
            @Override // jf.m0.b
            public final Object apply(Object obj) {
                return m0.J(this.f102353a, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }
}
