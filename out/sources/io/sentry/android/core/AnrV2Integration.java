package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.b7;
import io.sentry.protocol.DebugImage;
import io.sentry.q7;
import io.sentry.r6;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements io.sentry.r1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f93657d = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.p f93659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f93660c;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f93661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.sentry.c1 f93662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SentryAndroidOptions f93663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f93664d;

        a(Context context, io.sentry.c1 c1Var, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.p pVar) {
            this.f93661a = context;
            this.f93662b = c1Var;
            this.f93663c = sentryAndroidOptions;
            this.f93664d = pVar.a() - AnrV2Integration.f93657d;
        }

        private byte[] a(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i15 = inputStream.read(bArr, 0, 1024);
                    if (i15 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i15);
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }

        private c b(ApplicationExitInfo applicationExitInfo, boolean z15) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream == null) {
                            return cVar;
                        }
                        traceInputStream.close();
                        return cVar;
                    }
                    byte[] bArrA = a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrA)));
                        try {
                            io.sentry.android.core.internal.threaddump.b bVarC = io.sentry.android.core.internal.threaddump.b.c(bufferedReader);
                            io.sentry.android.core.internal.threaddump.c cVar2 = new io.sentry.android.core.internal.threaddump.c(this.f93663c, z15);
                            cVar2.i(bVarC);
                            List<io.sentry.protocol.b0> listF = cVar2.f();
                            List<DebugImage> listC = cVar2.c();
                            if (listF.isEmpty()) {
                                c cVar3 = new c(c.a.NO_DUMP);
                                bufferedReader.close();
                                return cVar3;
                            }
                            c cVar4 = new c(c.a.DUMP, bArrA, listF, listC);
                            bufferedReader.close();
                            return cVar4;
                        } catch (Throwable th4) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        this.f93663c.getLogger().b(b7.WARNING, "Failed to parse ANR thread dump", th6);
                        return new c(c.a.ERROR, bArrA);
                    }
                } catch (Throwable th7) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                    }
                    throw th7;
                }
            } catch (Throwable th9) {
                this.f93663c.getLogger().b(b7.WARNING, "Failed to read ANR thread dump", th9);
                return new c(c.a.NO_DUMP);
            }
        }

        private void c(ApplicationExitInfo applicationExitInfo, boolean z15) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z16 = applicationExitInfo.getImportance() != 100;
            c cVarB = b(applicationExitInfo, z16);
            if (cVarB.f93668a == c.a.NO_DUMP) {
                this.f93663c.getLogger().c(b7.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            b bVar = new b(this.f93663c.getFlushTimeoutMillis(), this.f93663c.getLogger(), timestamp, z15, z16);
            io.sentry.j0 j0VarE = io.sentry.util.m.e(bVar);
            r6 r6Var = new r6();
            c.a aVar = cVarB.f93668a;
            if (aVar == c.a.ERROR) {
                io.sentry.protocol.k kVar = new io.sentry.protocol.k();
                kVar.f("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                r6Var.D0(kVar);
            } else if (aVar == c.a.DUMP) {
                r6Var.F0(cVarB.f93670c);
                if (cVarB.f93671d != null) {
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    dVar.e(cVarB.f93671d);
                    r6Var.T(dVar);
                }
            }
            r6Var.C0(b7.FATAL);
            r6Var.G0(io.sentry.m.e(timestamp));
            if (this.f93663c.isAttachAnrThreadDump() && (bArr = cVarB.f93669b) != null) {
                j0VarE.n(io.sentry.b.b(bArr));
            }
            if (this.f93662b.R(r6Var, j0VarE).equals(io.sentry.protocol.v.f95495b) || bVar.g()) {
                return;
            }
            this.f93663c.getLogger().c(b7.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", r6Var.G());
        }

        private void d(List<ApplicationExitInfo> list, Long l15) {
            Collections.reverse(list);
            Iterator<ApplicationExitInfo> it = list.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = dc.h.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    if (applicationExitInfoA.getTimestamp() < this.f93664d) {
                        this.f93663c.getLogger().c(b7.DEBUG, "ANR happened too long ago %s.", applicationExitInfoA);
                    } else if (l15 == null || applicationExitInfoA.getTimestamp() > l15.longValue()) {
                        c(applicationExitInfoA, false);
                    } else {
                        this.f93663c.getLogger().c(b7.DEBUG, "ANR has already been reported %s.", applicationExitInfoA);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f93661a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f93663c.getLogger().c(b7.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            io.sentry.cache.g envelopeDiskCache = this.f93663c.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.f) && this.f93663c.isEnableAutoSessionTracking()) {
                io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
                if (!fVar.M()) {
                    this.f93663c.getLogger().c(b7.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    fVar.z();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long lU = io.sentry.android.core.cache.b.U(this.f93663c);
            Iterator<ApplicationExitInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = dc.h.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    arrayList.remove(applicationExitInfoA);
                    applicationExitInfo = applicationExitInfoA;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f93663c.getLogger().c(b7.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.f93664d) {
                this.f93663c.getLogger().c(b7.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (lU != null && applicationExitInfo.getTimestamp() <= lU.longValue()) {
                this.f93663c.getLogger().c(b7.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.f93663c.isReportHistoricalAnrs()) {
                d(arrayList, lU);
            }
            c(applicationExitInfo, true);
        }
    }

    public static final class b extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f93665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f93666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f93667f;

        public b(long j15, io.sentry.v0 v0Var, long j16, boolean z15, boolean z16) {
            super(j15, v0Var);
            this.f93665d = j16;
            this.f93666e = z15;
            this.f93667f = z16;
        }

        @Override // io.sentry.hints.c
        public boolean a() {
            return this.f93666e;
        }

        @Override // io.sentry.hints.f
        public boolean b(io.sentry.protocol.v vVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void c(io.sentry.protocol.v vVar) {
        }

        @Override // io.sentry.hints.a
        public Long e() {
            return Long.valueOf(this.f93665d);
        }

        @Override // io.sentry.hints.a
        public boolean f() {
            return false;
        }

        @Override // io.sentry.hints.a
        public String h() {
            return this.f93667f ? "anr_background" : "anr_foreground";
        }
    }

    public AnrV2Integration(Context context) {
        this(context, io.sentry.transport.n.b());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f93660c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(b7.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.r1
    @SuppressLint({"NewApi"})
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93660c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(b7.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f93660c.isAnrEnabled()));
        if (this.f93660c.getCacheDirPath() == null) {
            this.f93660c.getLogger().c(b7.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f93660c.isAnrEnabled()) {
            try {
                q7Var.getExecutorService().submit(new a(this.f93658a, c1Var, this.f93660c, this.f93659b));
            } catch (Throwable th4) {
                q7Var.getLogger().b(b7.DEBUG, "Failed to start AnrProcessor.", th4);
            }
            q7Var.getLogger().c(b7.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.p.a("AnrV2");
        }
    }

    AnrV2Integration(Context context, io.sentry.transport.p pVar) {
        this.f93658a = a1.g(context);
        this.f93659b = pVar;
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f93668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f93669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<io.sentry.protocol.b0> f93670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<DebugImage> f93671d;

        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        c(a aVar) {
            this.f93668a = aVar;
            this.f93669b = null;
            this.f93670c = null;
            this.f93671d = null;
        }

        c(a aVar, byte[] bArr) {
            this.f93668a = aVar;
            this.f93669b = bArr;
            this.f93670c = null;
            this.f93671d = null;
        }

        c(a aVar, byte[] bArr, List<io.sentry.protocol.b0> list, List<DebugImage> list2) {
            this.f93668a = aVar;
            this.f93669b = bArr;
            this.f93670c = list;
            this.f93671d = list2;
        }
    }
}
