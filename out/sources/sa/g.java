package sa;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import fr.h0;
import fr.q;
import java.util.Arrays;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0017\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010#\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lsa/g;", "Lza/d;", "Loa/d;", "delegate", "Lsa/b;", "autoCloser", "<init>", "(Lza/d;Lsa/b;)V", "Loq/i0;", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "a", "Lza/d;", "b", "()Lza/d;", "Lsa/b;", "h", "()Lsa/b;", "Lsa/g$a;", "c", "Lsa/g$a;", "autoClosingDb", "Lza/c;", "g3", "()Lza/c;", "writableDatabase", "c3", "readableDatabase", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements za.d, oa.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.d delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sa.b autoCloser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a autoClosingDb;

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0012\u0010\"\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010'\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0014J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0014R\u0016\u00102\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0014R(\u00109\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t06\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lsa/g$a;", "Lza/c;", "Lsa/b;", "autoCloser", "<init>", "(Lsa/b;)V", "Loq/i0;", "y", "()V", "", "sql", "Lza/g;", "B2", "(Ljava/lang/String;)Lza/g;", "q0", "b1", "r1", "X0", "", "l0", "()Z", "Lza/f;", "query", "Landroid/database/Cursor;", "X1", "(Lza/f;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "Y2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "E0", "(Ljava/lang/String;)V", "bindArgs", "a1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "W0", "B0", "close", "a", "Lsa/b;", "isOpen", "W", "()Ljava/lang/String;", "path", "P3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "x0", "()Ljava/util/List;", "attachedDbs", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements za.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final sa.b autoCloser;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final /* synthetic */ class b extends q implements er.l<za.c, Boolean> {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final b f179537j = new b();

            b() {
                super(1, za.c.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // er.l
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final Boolean b(za.c cVar) {
                return Boolean.valueOf(cVar.l0());
            }
        }

        public a(sa.b bVar) {
            this.autoCloser = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object C(za.c cVar) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int E(String str, int i15, ContentValues contentValues, String str2, Object[] objArr, za.c cVar) {
            return cVar.Y2(str, i15, contentValues, str2, objArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 r(String str, za.c cVar) {
            cVar.E0(str);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 u(String str, Object[] objArr, za.c cVar) {
            cVar.a1(str, objArr);
            return i0.f148189a;
        }

        @Override // za.c
        public void B0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // za.c
        public za.g B2(String sql) {
            return new b(sql, this.autoCloser);
        }

        @Override // za.c
        public void E0(final String sql) {
            this.autoCloser.h(new er.l() { // from class: sa.d
                @Override // er.l
                public final Object b(Object obj) {
                    return g.a.r(sql, (za.c) obj);
                }
            });
        }

        @Override // za.c
        public boolean P3() {
            return ((Boolean) this.autoCloser.h(new h0() { // from class: sa.g.a.c
                @Override // fr.h0, mr.n
                public Object get(Object obj) {
                    return Boolean.valueOf(((za.c) obj).P3());
                }
            })).booleanValue();
        }

        @Override // za.c
        public String W() {
            return (String) this.autoCloser.h(new h0() { // from class: sa.g.a.d
                @Override // fr.h0, mr.n
                public Object get(Object obj) {
                    return ((za.c) obj).W();
                }
            });
        }

        @Override // za.c
        public boolean W0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // za.c
        public void X0() {
            this.autoCloser.getDelegateDatabase().X0();
        }

        @Override // za.c
        public Cursor X1(za.f query) {
            try {
                return new c(this.autoCloser.j().X1(query), this.autoCloser);
            } catch (Throwable th4) {
                this.autoCloser.g();
                throw th4;
            }
        }

        @Override // za.c
        public int Y2(final String table, final int conflictAlgorithm, final ContentValues values, final String whereClause, final Object[] whereArgs) {
            return ((Number) this.autoCloser.h(new er.l() { // from class: sa.c
                @Override // er.l
                public final Object b(Object obj) {
                    return Integer.valueOf(g.a.E(table, conflictAlgorithm, values, whereClause, whereArgs, (za.c) obj));
                }
            })).intValue();
        }

        @Override // za.c
        public void a1(final String sql, final Object[] bindArgs) {
            this.autoCloser.h(new er.l() { // from class: sa.e
                @Override // er.l
                public final Object b(Object obj) {
                    return g.a.u(sql, bindArgs, (za.c) obj);
                }
            });
        }

        @Override // za.c
        public void b1() {
            try {
                this.autoCloser.j().b1();
            } catch (Throwable th4) {
                this.autoCloser.g();
                throw th4;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.autoCloser.f();
        }

        @Override // za.c
        public boolean isOpen() {
            return this.autoCloser.m();
        }

        @Override // za.c
        public boolean l0() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.h(b.f179537j)).booleanValue();
        }

        @Override // za.c
        public void q0() {
            try {
                this.autoCloser.j().q0();
            } catch (Throwable th4) {
                this.autoCloser.g();
                throw th4;
            }
        }

        @Override // za.c
        public void r1() {
            try {
                this.autoCloser.getDelegateDatabase().r1();
            } finally {
                this.autoCloser.g();
            }
        }

        @Override // za.c
        public List<Pair<String, String>> x0() {
            return (List) this.autoCloser.h(new h0() { // from class: sa.g.a.a
                @Override // fr.h0, mr.n
                public Object get(Object obj) {
                    return ((za.c) obj).x0();
                }
            });
        }

        public final void y() {
            this.autoCloser.h(new er.l() { // from class: sa.f
                @Override // er.l
                public final Object b(Object obj) {
                    return g.a.C((za.c) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u0000 B2\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lsa/g$b;", "Lza/g;", "", "sql", "Lsa/b;", "autoCloser", "<init>", "(Ljava/lang/String;Lsa/b;)V", "T", "Lkotlin/Function1;", "block", "C", "(Ler/l;)Ljava/lang/Object;", "", "columnType", "index", "Loq/i0;", "r", "(II)V", "Lza/e;", "query", "p", "(Lza/e;)V", "close", "()V", "B", "I0", "()I", "i0", "(I)V", "", "value", "f0", "(IJ)V", "", "Q", "(ID)V", "s2", "(ILjava/lang/String;)V", "", "g0", "(I[B)V", "o0", "a", "Ljava/lang/String;", "b", "Lsa/b;", "", "c", "[I", "bindingTypes", "", "d", "[J", "longBindings", "", "e", "[D", "doubleBindings", "", "f", "[Ljava/lang/String;", "stringBindings", "g", "[[B", "blobBindings", "h", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class b implements za.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String sql;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final sa.b autoCloser;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int[] bindingTypes = new int[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long[] longBindings = new long[0];

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private double[] doubleBindings = new double[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private String[] stringBindings = new String[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private byte[][] blobBindings = new byte[0][];

        public b(String str, sa.b bVar) {
            this.sql = str;
            this.autoCloser = bVar;
        }

        private final <T> T C(final er.l<? super za.g, ? extends T> block) {
            return (T) this.autoCloser.h(new er.l() { // from class: sa.j
                @Override // er.l
                public final Object b(Object obj) {
                    return g.b.E(this.f179550a, block, (za.c) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object E(b bVar, er.l lVar, za.c cVar) {
            za.g gVarB2 = cVar.B2(bVar.sql);
            bVar.p(gVarB2);
            return lVar.b(gVarB2);
        }

        private final void p(za.e query) {
            int length = this.bindingTypes.length;
            for (int i15 = 1; i15 < length; i15++) {
                int i16 = this.bindingTypes[i15];
                if (i16 == 1) {
                    query.f0(i15, this.longBindings[i15]);
                } else if (i16 == 2) {
                    query.Q(i15, this.doubleBindings[i15]);
                } else if (i16 == 3) {
                    query.s2(i15, this.stringBindings[i15]);
                } else if (i16 == 4) {
                    query.g0(i15, this.blobBindings[i15]);
                } else if (i16 == 5) {
                    query.i0(i15);
                }
            }
        }

        private final void r(int columnType, int index) {
            int i15 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i15) {
                this.bindingTypes = Arrays.copyOf(iArr, i15);
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i15) {
                    this.longBindings = Arrays.copyOf(jArr, i15);
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i15) {
                    this.doubleBindings = Arrays.copyOf(dArr, i15);
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i15) {
                    this.stringBindings = (String[]) Arrays.copyOf(strArr, i15);
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i15) {
                this.blobBindings = (byte[][]) Arrays.copyOf(bArr, i15);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 u(za.g gVar) {
            gVar.B();
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int y(za.g gVar) {
            return gVar.I0();
        }

        @Override // za.g
        public void B() {
            C(new er.l() { // from class: sa.i
                @Override // er.l
                public final Object b(Object obj) {
                    return g.b.u((za.g) obj);
                }
            });
        }

        @Override // za.g
        public int I0() {
            return ((Number) C(new er.l() { // from class: sa.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Integer.valueOf(g.b.y((za.g) obj));
                }
            })).intValue();
        }

        @Override // za.e
        public void Q(int index, double value) {
            r(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            o0();
        }

        @Override // za.e
        public void f0(int index, long value) {
            r(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // za.e
        public void g0(int index, byte[] value) {
            r(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // za.e
        public void i0(int index) {
            r(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // za.e
        public void o0() {
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // za.e
        public void s2(int index, String value) {
            r(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }
    }

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0014J \u0010\u001e\u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b \u0010\u001fJ \u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b!\u0010\"J6\u0010$\u001a(\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0014\u0012\u000e\b\u0001\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b&\u0010\fJ \u0010(\u001a\n \u001d*\u0004\u0018\u00010'0'2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b(\u0010)J \u0010*\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010\"J(\u0010-\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010+0+H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020:2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b=\u00103J\u0018\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b>\u0010\u0011J\u0010\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b?\u0010\tJ\u0010\u0010@\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b@\u0010\u0014J\u0010\u0010A\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bA\u0010\u0014J \u0010C\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bE\u0010DJ \u0010G\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bI\u0010HJ0\u0010L\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010J0J2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bP\u0010\u0014J \u0010R\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bT\u0010UJ(\u0010V\u001a\n \u001d*\u0004\u0018\u00010Q0Q2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lsa/g$c;", "Landroid/database/Cursor;", "delegate", "Lsa/b;", "autoCloser", "<init>", "(Landroid/database/Cursor;Lsa/b;)V", "Loq/i0;", "close", "()V", "", "getCount", "()I", "getPosition", "p0", "", "move", "(I)Z", "moveToPosition", "moveToFirst", "()Z", "moveToLast", "moveToNext", "moveToPrevious", "isFirst", "isLast", "isBeforeFirst", "isAfterLast", "", "kotlin.jvm.PlatformType", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getColumnCount", "", "getBlob", "(I)[B", "getString", "Landroid/database/CharArrayBuffer;", "p1", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "", "getShort", "(I)S", "getInt", "(I)I", "", "getLong", "(I)J", "", "getFloat", "(I)F", "", "getDouble", "(I)D", "getType", "isNull", "deactivate", "requery", "isClosed", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "unregisterContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "unregisterDataSetObserver", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "getNotificationUri", "()Landroid/net/Uri;", "getWantsAllOnMoveCalls", "Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "getExtras", "()Landroid/os/Bundle;", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "a", "Landroid/database/Cursor;", "b", "Lsa/b;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Cursor delegate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final sa.b autoCloser;

        public c(Cursor cursor, sa.b bVar) {
            this.delegate = cursor;
            this.autoCloser = bVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.g();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p15, CharArrayBuffer p16) {
            this.delegate.copyStringToBuffer(p15, p16);
        }

        @Override // android.database.Cursor
        @oq.a
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p15) {
            return this.delegate.getBlob(p15);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p15) {
            return this.delegate.getColumnIndex(p15);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p15) {
            return this.delegate.getColumnIndexOrThrow(p15);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p15) {
            return this.delegate.getColumnName(p15);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p15) {
            return this.delegate.getDouble(p15);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p15) {
            return this.delegate.getFloat(p15);
        }

        @Override // android.database.Cursor
        public int getInt(int p15) {
            return this.delegate.getInt(p15);
        }

        @Override // android.database.Cursor
        public long getLong(int p15) {
            return this.delegate.getLong(p15);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return this.delegate.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p15) {
            return this.delegate.getShort(p15);
        }

        @Override // android.database.Cursor
        public String getString(int p15) {
            return this.delegate.getString(p15);
        }

        @Override // android.database.Cursor
        public int getType(int p15) {
            return this.delegate.getType(p15);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p15) {
            return this.delegate.isNull(p15);
        }

        @Override // android.database.Cursor
        public boolean move(int p15) {
            return this.delegate.move(p15);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p15) {
            return this.delegate.moveToPosition(p15);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p15) {
            this.delegate.registerContentObserver(p15);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p15) {
            this.delegate.registerDataSetObserver(p15);
        }

        @Override // android.database.Cursor
        @oq.a
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p15) {
            return this.delegate.respond(p15);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle p15) {
            this.delegate.setExtras(p15);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p15, Uri p16) {
            this.delegate.setNotificationUri(p15, p16);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p15) {
            this.delegate.unregisterContentObserver(p15);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p15) {
            this.delegate.unregisterDataSetObserver(p15);
        }
    }

    public g(za.d dVar, sa.b bVar) {
        this.delegate = dVar;
        this.autoCloser = bVar;
        this.autoClosingDb = new a(bVar);
        bVar.l(getDelegate());
    }

    @Override // oa.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public za.d getDelegate() {
        return this.delegate;
    }

    @Override // za.d
    public za.c c3() {
        this.autoClosingDb.y();
        return this.autoClosingDb;
    }

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    @Override // za.d
    public za.c g3() {
        this.autoClosingDb.y();
        return this.autoClosingDb;
    }

    @Override // za.d
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final sa.b getAutoCloser() {
        return this.autoCloser;
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }
}
