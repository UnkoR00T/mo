package io.sentry.android.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.w;
import java.io.IOException;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import za.f;
import za.g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\f\u0010\tJ\u0010\u0010\r\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\tJF\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u001d\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00142\u0010\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c0\u001bH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R(\u00106\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001403\u0018\u0001028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010\u0010R\u0014\u00109\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u0010\u0010R\u0016\u0010<\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lio/sentry/android/sqlite/c;", "Lza/c;", "delegate", "Lio/sentry/android/sqlite/a;", "sqLiteSpanManager", "<init>", "(Lza/c;Lio/sentry/android/sqlite/a;)V", "Loq/i0;", "q0", "()V", "b1", i.f37089p, "close", "B0", "", "W0", "()Z", "r1", "l0", "X0", "", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "Y2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "sql", "Lza/g;", "B2", "(Ljava/lang/String;)Lza/g;", "Lza/f;", "query", "Landroid/database/Cursor;", "X1", "(Lza/f;)Landroid/database/Cursor;", "E0", "(Ljava/lang/String;)V", "bindArgs", "a1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "a", "Lza/c;", "b", "Lio/sentry/android/sqlite/a;", "", "Landroid/util/Pair;", "x0", "()Ljava/util/List;", "attachedDbs", "isOpen", "P3", "isWriteAheadLoggingEnabled", "W", "()Ljava/lang/String;", "path", "sentry-android-sqlite_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements za.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.c delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.sqlite.a sqLiteSpanManager;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends w implements er.a<i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f94644c = str;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            c.this.delegate.E0(this.f94644c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements er.a<i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object[] f94647d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr) {
            super(0);
            this.f94646c = str;
            this.f94647d = objArr;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            c.this.delegate.a1(this.f94646c, this.f94647d);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.sqlite.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/database/Cursor;", "c", "()Landroid/database/Cursor;"}, k = 3, mv = {1, 9, 0})
    static final class C2230c extends w implements er.a<Cursor> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f94649c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2230c(f fVar) {
            super(0);
            this.f94649c = fVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Cursor a() {
            return c.this.delegate.X1(this.f94649c);
        }
    }

    public c(za.c cVar, io.sentry.android.sqlite.a aVar) {
        this.delegate = cVar;
        this.sqLiteSpanManager = aVar;
    }

    @Override // za.c
    public void B0() {
        this.delegate.B0();
    }

    @Override // za.c
    public g B2(String sql) {
        return new e(this.delegate.B2(sql), this.sqLiteSpanManager, sql);
    }

    @Override // za.c
    public void E0(String sql) {
        this.sqLiteSpanManager.a(sql, new a(sql));
    }

    @Override // za.c
    public void H2() {
        this.delegate.H2();
    }

    @Override // za.c
    public boolean P3() {
        return this.delegate.P3();
    }

    @Override // za.c
    public String W() {
        return this.delegate.W();
    }

    @Override // za.c
    public boolean W0() {
        return this.delegate.W0();
    }

    @Override // za.c
    public void X0() {
        this.delegate.X0();
    }

    @Override // za.c
    public Cursor X1(f query) {
        return (Cursor) this.sqLiteSpanManager.a(query.a(), new C2230c(query));
    }

    @Override // za.c
    public int Y2(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs) {
        return this.delegate.Y2(table, conflictAlgorithm, values, whereClause, whereArgs);
    }

    @Override // za.c
    public void a1(String sql, Object[] bindArgs) {
        this.sqLiteSpanManager.a(sql, new b(sql, bindArgs));
    }

    @Override // za.c
    public void b1() {
        this.delegate.b1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // za.c
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // za.c
    public boolean l0() {
        return this.delegate.l0();
    }

    @Override // za.c
    public void q0() {
        this.delegate.q0();
    }

    @Override // za.c
    public void r1() {
        this.delegate.r1();
    }

    @Override // za.c
    public List<Pair<String, String>> x0() {
        return this.delegate.x0();
    }
}
