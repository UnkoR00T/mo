package com.google.android.gms.internal.oss_licenses;

import android.os.Build;
import android.os.Trace;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f30792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f30793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final l4 f30794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f30795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final i f30796e;

    static {
        t0.k("androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f30792a = true;
        f30793b = new AtomicReference(t0.j());
        f30794c = new l4("tiktok_systrace");
        f30795d = new WeakHashMap();
        f30796e = new i();
        new ArrayDeque();
        new ArrayDeque();
    }

    static t0 a() {
        return (t0) f30793b.get();
    }

    static String b(String str) {
        return str.length() > 127 ? str.substring(0, CertificateBody.profileType) : str;
    }

    public static v c() {
        return (v) f30796e.get();
    }

    public static boolean d() {
        return f30792a;
    }

    static y f(v vVar, y yVar, int i15) {
        y yVar2;
        y yVar3;
        y yVar4;
        y yVar5 = vVar.f30914b;
        if (yVar5 != yVar || (i15 != 2 && i15 != 4 && yVar5 != null)) {
            if (yVar5 == null) {
                vVar.f30913a = Build.VERSION.SDK_INT >= 29 ? Trace.isEnabled() : n4.a(f30794c);
            }
            c0 c0Var = vVar.f30916d;
            if (vVar.f30913a) {
                if (c0Var != null) {
                    int i16 = i15 - 1;
                    if (i16 == 0) {
                        yVar3 = yVar;
                        yVar4 = null;
                    } else if (i16 != 2) {
                        yVar3 = yVar;
                        yVar4 = yVar5;
                    } else {
                        yVar4 = yVar5;
                        yVar3 = null;
                    }
                    if (yVar4 != null) {
                        Trace.endSection();
                        Trace.endSection();
                    }
                    if (yVar3 != null) {
                        Trace.beginSection(yVar3.a());
                        Trace.beginSection(b(yVar3.c()));
                    }
                } else {
                    if (yVar5 != null) {
                        yVar2 = yVar != null ? yVar : null;
                        w.b(yVar5);
                    } else {
                        yVar2 = yVar;
                    }
                    if (yVar2 != null) {
                        w.a(yVar2);
                    }
                }
            }
            if (yVar5 != yVar) {
                if (yVar == null) {
                    yVar = null;
                }
                vVar.f30914b = yVar;
                if (i15 != 2) {
                    return yVar5;
                }
                if (c0Var == null) {
                    throw new NullPointerException("Coroutine is executing but trace storage is not being set.");
                }
                c0Var.f30760a = yVar;
                return yVar5;
            }
        }
        return yVar;
    }
}
