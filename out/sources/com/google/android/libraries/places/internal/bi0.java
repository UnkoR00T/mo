package com.google.android.libraries.places.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
final class bi0 extends WeakReference {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f31798f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final RuntimeException f31799g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f31800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f31801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Reference f31803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f31804e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f31799g = runtimeException;
    }

    bi0(ci0 ci0Var, r70 r70Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(ci0Var, referenceQueue);
        this.f31804e = new AtomicBoolean();
        this.f31803d = new SoftReference(f31798f ? new RuntimeException("ManagedChannel allocation site") : f31799g);
        this.f31802c = r70Var.toString();
        this.f31800a = referenceQueue;
        this.f31801b = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static int a(ReferenceQueue referenceQueue) {
        int i15 = 0;
        while (true) {
            bi0 bi0Var = (bi0) referenceQueue.poll();
            if (bi0Var == null) {
                return i15;
            }
            RuntimeException runtimeException = (RuntimeException) bi0Var.f31803d.get();
            bi0Var.c();
            if (!bi0Var.f31804e.get()) {
                i15++;
                Level level = Level.SEVERE;
                if (ci0.f31904e.isLoggable(level)) {
                    String property = System.getProperty("line.separator");
                    StringBuilder sb5 = new StringBuilder(String.valueOf(property).length() + CertificateBody.profileType);
                    sb5.append("*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*");
                    sb5.append(property);
                    sb5.append("    Make sure to call shutdown()/shutdownNow()");
                    LogRecord logRecord = new LogRecord(level, sb5.toString());
                    logRecord.setLoggerName(ci0.f31904e.getName());
                    logRecord.setParameters(new Object[]{bi0Var.f31802c});
                    logRecord.setThrown(runtimeException);
                    ci0.f31904e.log(logRecord);
                }
            }
        }
    }

    private final void c() {
        super.clear();
        this.f31801b.remove(this);
        this.f31803d.clear();
    }

    final /* synthetic */ void b() {
        if (this.f31804e.getAndSet(true)) {
            return;
        }
        clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        c();
        a(this.f31800a);
    }
}
