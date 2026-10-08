package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class ya0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Logger f34377c = Logger.getLogger(i40.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34378a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n60 f34379b;

    ya0(n60 n60Var, int i15, long j15, String str) {
        zj.p.r(str, "description");
        this.f34379b = (n60) zj.p.r(n60Var, "logId");
        z50 z50Var = new z50();
        z50Var.a(str.concat(" created"));
        z50Var.c(a60.CT_INFO);
        z50Var.b(j15);
        a(z50Var.e());
    }

    static void c(n60 n60Var, Level level, String str) {
        Logger logger = f34377c;
        if (logger.isLoggable(level)) {
            String strValueOf = String.valueOf(n60Var);
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 3 + String.valueOf(str).length());
            sb5.append("[");
            sb5.append(strValueOf);
            sb5.append("] ");
            sb5.append(str);
            LogRecord logRecord = new LogRecord(level, sb5.toString());
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void a(b60 b60Var) {
        Level level;
        int iOrdinal = b60Var.f31747b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.f34378a) {
        }
        c(this.f34379b, level, b60Var.f31746a);
    }

    final boolean b() {
        synchronized (this.f34378a) {
        }
        return false;
    }

    final n60 d() {
        return this.f34379b;
    }
}
