package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.a9;
import io.sentry.b7;
import io.sentry.b9;
import io.sentry.e5;
import io.sentry.q7;
import io.sentry.v6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryPerformanceProvider extends h1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f93716f = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f93717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.v0 f93718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0 f93719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f93720e = new io.sentry.util.a();

    public SentryPerformanceProvider() {
        y yVar = new y();
        this.f93718c = yVar;
        this.f93719d = new t0(yVar);
    }

    private void a(Context context, e5 e5Var, io.sentry.android.core.performance.h hVar) {
        if (!e5Var.f()) {
            this.f93718c.c(b7.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        u uVar = new u(this.f93719d, new io.sentry.android.core.internal.util.a0(context.getApplicationContext(), this.f93718c, this.f93719d), this.f93718c, e5Var.c(), e5Var.d(), new v6());
        hVar.z(null);
        hVar.y(uVar);
        this.f93718c.c(b7.DEBUG, "App start continuous profiling started.", new Object[0]);
        q7 q7VarEmpty = q7.empty();
        q7VarEmpty.setProfileSessionSampleRate(Double.valueOf(e5Var.f() ? 1.0d : 0.0d));
        uVar.o(e5Var.a(), new a9(q7VarEmpty));
    }

    private void b(Context context, e5 e5Var, io.sentry.android.core.performance.h hVar) {
        b9 b9Var = new b9(Boolean.valueOf(e5Var.l()), e5Var.e(), Boolean.valueOf(e5Var.i()), e5Var.b());
        hVar.A(b9Var);
        if (!b9Var.b().booleanValue() || !b9Var.e().booleanValue()) {
            this.f93718c.c(b7.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        i0 i0Var = new i0(context, this.f93719d, new io.sentry.android.core.internal.util.a0(context, this.f93718c, this.f93719d), this.f93718c, e5Var.c(), e5Var.j(), e5Var.d(), new v6());
        hVar.y(null);
        hVar.z(i0Var);
        this.f93718c.c(b7.DEBUG, "App start profiling started.", new Object[0]);
        i0Var.start();
    }

    private void c(io.sentry.android.core.performance.h hVar) {
        Context context = getContext();
        if (context == null) {
            this.f93718c.c(b7.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File(d0.d(context), "app_start_profiling_config");
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    e5 e5Var = (e5) new io.sentry.e2(q7.empty()).c(bufferedReader, e5.class);
                    if (e5Var == null) {
                        this.f93718c.c(b7.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (e5Var.g() && e5Var.k()) {
                        a(context, e5Var, hVar);
                    } else if (!e5Var.j()) {
                        this.f93718c.c(b7.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (e5Var.h()) {
                        b(context, e5Var, hVar);
                    }
                    bufferedReader.close();
                } catch (Throwable th4) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (FileNotFoundException e15) {
                this.f93718c.b(b7.ERROR, "App start profiling config file not found. ", e15);
            } catch (Throwable th6) {
                this.f93718c.b(b7.ERROR, "Error reading app start profiling config file. ", th6);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void d(Context context, io.sentry.android.core.performance.h hVar) {
        hVar.q().y(f93716f);
        if (this.f93719d.d() >= 24) {
            hVar.k().y(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.f93717b = (Application) context;
        }
        Application application = this.f93717b;
        if (application == null) {
            return;
        }
        hVar.x(application);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        io.sentry.android.core.performance.h.u(this);
        io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
        d(getContext(), hVarP);
        c(hVarP);
        io.sentry.android.core.performance.h.v(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        io.sentry.g1 g1VarA = io.sentry.android.core.performance.h.f94103s.a();
        try {
            io.sentry.m1 m1VarI = io.sentry.android.core.performance.h.p().i();
            if (m1VarI != null) {
                m1VarI.close();
            }
            io.sentry.q0 q0VarH = io.sentry.android.core.performance.h.p().h();
            if (q0VarH != null) {
                q0VarH.n(true);
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }
}
