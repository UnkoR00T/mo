package io.sentry.android.sqlite;

import fr.w;
import java.io.IOException;
import oq.i0;
import p071kotlin.Metadata;
import za.g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lio/sentry/android/sqlite/e;", "Lza/g;", "delegate", "Lio/sentry/android/sqlite/a;", "sqLiteSpanManager", "", "sql", "<init>", "(Lza/g;Lio/sentry/android/sqlite/a;Ljava/lang/String;)V", "", "index", "", "value", "Loq/i0;", "g0", "(I[B)V", "", "Q", "(ID)V", "", "f0", "(IJ)V", "i0", "(I)V", "s2", "(ILjava/lang/String;)V", "o0", "()V", "close", "B", "I0", "()I", "a", "Lza/g;", "b", "Lio/sentry/android/sqlite/a;", "c", "Ljava/lang/String;", "sentry-android-sqlite_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.sqlite.a sqLiteSpanManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sql;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends w implements er.a<i0> {
        a() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            e.this.delegate.B();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements er.a<Integer> {
        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer a() {
            return Integer.valueOf(e.this.delegate.I0());
        }
    }

    public e(g gVar, io.sentry.android.sqlite.a aVar, String str) {
        this.delegate = gVar;
        this.sqLiteSpanManager = aVar;
        this.sql = str;
    }

    @Override // za.g
    public void B() {
        this.sqLiteSpanManager.a(this.sql, new a());
    }

    @Override // za.g
    public int I0() {
        return ((Number) this.sqLiteSpanManager.a(this.sql, new b())).intValue();
    }

    @Override // za.e
    public void Q(int index, double value) {
        this.delegate.Q(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // za.e
    public void f0(int index, long value) {
        this.delegate.f0(index, value);
    }

    @Override // za.e
    public void g0(int index, byte[] value) {
        this.delegate.g0(index, value);
    }

    @Override // za.e
    public void i0(int index) {
        this.delegate.i0(index);
    }

    @Override // za.e
    public void o0() {
        this.delegate.o0();
    }

    @Override // za.e
    public void s2(int index, String value) {
        this.delegate.s2(index, value);
    }
}
