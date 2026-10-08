package io.sentry.android.sqlite;

import fr.w;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0014\u0010\"\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016¨\u0006$"}, d2 = {"Lio/sentry/android/sqlite/d;", "Lza/d;", "delegate", "<init>", "(Lza/d;)V", "Loq/i0;", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "a", "Lza/d;", "Lio/sentry/android/sqlite/a;", "b", "Lio/sentry/android/sqlite/a;", "sqLiteSpanManager", "Lza/c;", "c", "Loq/k;", "r", "()Lza/c;", "sentryWritableDatabase", "d", "p", "sentryReadableDatabase", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "g3", "writableDatabase", "c3", "readableDatabase", "e", "sentry-android-sqlite_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements za.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.d delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a sqLiteSpanManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k sentryWritableDatabase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k sentryReadableDatabase;

    /* JADX INFO: renamed from: io.sentry.android.sqlite.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/sentry/android/sqlite/d$a;", "", "<init>", "()V", "Lza/d;", "delegate", "a", "(Lza/d;)Lza/d;", "sentry-android-sqlite_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final za.d a(za.d delegate) {
            return delegate instanceof d ? delegate : new d(delegate, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/sentry/android/sqlite/c;", "c", "()Lio/sentry/android/sqlite/c;"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements er.a<io.sentry.android.sqlite.c> {
        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.sqlite.c a() {
            return new io.sentry.android.sqlite.c(d.this.delegate.c3(), d.this.sqLiteSpanManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/sentry/android/sqlite/c;", "c", "()Lio/sentry/android/sqlite/c;"}, k = 3, mv = {1, 9, 0})
    static final class c extends w implements er.a<io.sentry.android.sqlite.c> {
        c() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.sqlite.c a() {
            return new io.sentry.android.sqlite.c(d.this.delegate.g3(), d.this.sqLiteSpanManager);
        }
    }

    public /* synthetic */ d(za.d dVar, fr.k kVar) {
        this(dVar);
    }

    public static final za.d m(za.d dVar) {
        return INSTANCE.a(dVar);
    }

    private final za.c p() {
        return (za.c) this.sentryReadableDatabase.getValue();
    }

    private final za.c r() {
        return (za.c) this.sentryWritableDatabase.getValue();
    }

    @Override // za.d
    public za.c c3() {
        return p();
    }

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // za.d
    public za.c g3() {
        return r();
    }

    @Override // za.d
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(za.d dVar) {
        this.delegate = dVar;
        this.sqLiteSpanManager = new a(null, dVar.getDatabaseName(), 1, 0 == true ? 1 : 0);
        this.sentryWritableDatabase = l.a(new c());
        this.sentryReadableDatabase = l.a(new b());
    }
}
