package io.sentry.android.sqlite;

import android.database.CrossProcessCursor;
import fr.k;
import io.sentry.c1;
import io.sentry.j1;
import io.sentry.n5;
import io.sentry.n8;
import io.sentry.q1;
import io.sentry.r4;
import io.sentry.u8;
import io.sentry.w7;
import io.sentry.z6;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/sentry/android/sqlite/a;", "", "Lio/sentry/c1;", "scopes", "", "databaseName", "<init>", "(Lio/sentry/c1;Ljava/lang/String;)V", "T", "sql", "Lkotlin/Function0;", "operation", "a", "(Ljava/lang/String;Ler/a;)Ljava/lang/Object;", "Lio/sentry/c1;", "b", "Ljava/lang/String;", "Lio/sentry/w7;", "c", "Lio/sentry/w7;", "stackTraceFactory", "sentry-android-sqlite_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String databaseName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w7 stackTraceFactory;

    public a(c1 c1Var, String str) {
        this.scopes = c1Var;
        this.databaseName = str;
        this.stackTraceFactory = new w7(c1Var.s());
        z6.d().a("SQLite");
    }

    public final <T> T a(String sql, er.a<? extends T> operation) {
        j1 j1VarQ;
        n8 n8VarW;
        n5 n5VarA = this.scopes.s().getDateProvider().a();
        try {
            T tA = operation.a();
            if (tA instanceof CrossProcessCursor) {
                return (T) new b((CrossProcessCursor) tA, this, sql);
            }
            j1 j1VarA = this.scopes.a();
            j1VarQ = j1VarA != null ? j1VarA.q("db.sql.query", sql, n5VarA, q1.SENTRY) : null;
            if (j1VarQ != null) {
                try {
                    n8VarW = j1VarQ.w();
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        j1 j1VarA2 = this.scopes.a();
                        j1VarQ = j1VarA2 != null ? j1VarA2.q("db.sql.query", sql, n5VarA, q1.SENTRY) : null;
                        n8 n8VarW2 = j1VarQ != null ? j1VarQ.w() : null;
                        if (n8VarW2 != null) {
                            n8VarW2.r("auto.db.sqlite");
                        }
                        if (j1VarQ != null) {
                            j1VarQ.a(u8.INTERNAL_ERROR);
                        }
                        if (j1VarQ != null) {
                            j1VarQ.n(th);
                        }
                        throw th;
                    } catch (Throwable th5) {
                        if (j1VarQ != null) {
                            boolean zA = this.scopes.s().getThreadChecker().a();
                            j1VarQ.m("blocked_main_thread", Boolean.valueOf(zA));
                            if (zA) {
                                j1VarQ.m("call_stack", this.stackTraceFactory.c());
                            }
                            if (this.databaseName != null) {
                                j1VarQ.m("db.system", "sqlite");
                                j1VarQ.m("db.name", this.databaseName);
                            } else {
                                j1VarQ.m("db.system", "in-memory");
                            }
                            j1VarQ.g();
                        }
                        throw th5;
                    }
                }
            } else {
                n8VarW = null;
            }
            if (n8VarW != null) {
                n8VarW.r("auto.db.sqlite");
            }
            if (j1VarQ != null) {
                j1VarQ.a(u8.OK);
            }
            if (j1VarQ != null) {
                boolean zA2 = this.scopes.s().getThreadChecker().a();
                j1VarQ.m("blocked_main_thread", Boolean.valueOf(zA2));
                if (zA2) {
                    j1VarQ.m("call_stack", this.stackTraceFactory.c());
                }
                if (this.databaseName != null) {
                    j1VarQ.m("db.system", "sqlite");
                    j1VarQ.m("db.name", this.databaseName);
                } else {
                    j1VarQ.m("db.system", "in-memory");
                }
                j1VarQ.g();
            }
            return tA;
        } catch (Throwable th6) {
            th = th6;
            j1VarQ = null;
        }
    }

    public /* synthetic */ a(c1 c1Var, String str, int i15, k kVar) {
        this((i15 & 1) != 0 ? r4.b() : c1Var, (i15 & 2) != 0 ? null : str);
    }
}
