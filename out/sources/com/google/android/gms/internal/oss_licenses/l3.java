package com.google.android.gms.internal.oss_licenses;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
abstract class l3<V> extends s3 implements p3<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f30817d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final o3 f30818e = new o3(e3.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final boolean f30819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f3 f30820g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f30821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile d3 f30822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile k3 f30823c;

    static {
        boolean z15;
        Throwable th4;
        Throwable th5;
        f3 h3Var;
        try {
            z15 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z15 = false;
        }
        f30819f = z15;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                h3Var = new j3(bArr);
            } catch (Error | Exception e15) {
                try {
                    h3Var = new g3(bArr);
                    th4 = null;
                    th5 = e15;
                } catch (Error | Exception e16) {
                    th4 = e16;
                    th5 = e15;
                    h3Var = new h3(bArr);
                }
            }
        } else {
            try {
                h3Var = new g3(bArr);
            } catch (NoClassDefFoundError unused2) {
                h3Var = new h3(bArr);
            }
        }
        th4 = null;
        th5 = null;
        f30820g = h3Var;
        if (th4 != null) {
            o3 o3Var = f30818e;
            Logger loggerA = o3Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th5);
            o3Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th4);
        }
    }

    l3() {
    }

    private final void c(k3 k3Var) {
        k3Var.f30814a = null;
        while (true) {
            k3 k3Var2 = this.f30823c;
            if (k3Var2 != k3.f30813c) {
                k3 k3Var3 = null;
                while (k3Var2 != null) {
                    k3 k3Var4 = k3Var2.f30815b;
                    if (k3Var2.f30814a != null) {
                        k3Var3 = k3Var2;
                    } else if (k3Var3 != null) {
                        k3Var3.f30815b = k3Var4;
                        if (k3Var3.f30814a == null) {
                        }
                    } else if (!f30820g.c(this, k3Var2, k3Var4)) {
                    }
                    k3Var2 = k3Var4;
                }
                return;
            }
            return;
        }
    }

    static boolean e(l3 l3Var, Object obj, Object obj2) {
        return f30820g.f(l3Var, obj, obj2);
    }

    static /* synthetic */ void i(k3 k3Var, Thread thread) {
        f30820g.a(k3Var, thread);
    }

    final d3 d(d3 d3Var) {
        return f30820g.e(this, d3Var);
    }

    final void f() {
        for (k3 k3VarD = f30820g.d(this, k3.f30813c); k3VarD != null; k3VarD = k3VarD.f30815b) {
            Thread thread = k3VarD.f30814a;
            if (thread != null) {
                k3VarD.f30814a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object g(long j15, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j15);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f30821a;
        if ((obj != null) && e3.o(obj)) {
            return e3.n(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k3 k3Var = this.f30823c;
            if (k3Var != k3.f30813c) {
                k3 k3Var2 = new k3();
                while (true) {
                    f3 f3Var = f30820g;
                    f3Var.b(k3Var2, k3Var);
                    if (f3Var.c(this, k3Var, k3Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                c(k3Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f30821a;
                            if ((obj2 != null) && e3.o(obj2)) {
                                return e3.n(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        c(k3Var2);
                        break;
                    }
                    k3Var = this.f30823c;
                    if (k3Var == k3.f30813c) {
                    }
                }
            }
            Object obj3 = this.f30821a;
            Objects.requireNonNull(obj3);
            return e3.n(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f30821a;
            if ((obj4 != null) && e3.o(obj4)) {
                return e3.n(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 8 + String.valueOf(lowerCase2).length());
        sb5.append("Waited ");
        sb5.append(j15);
        sb5.append(" ");
        sb5.append(lowerCase2);
        String string3 = sb5.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j16 = -nanos;
            long jConvert = timeUnit.convert(j16, TimeUnit.NANOSECONDS);
            long nanos2 = j16 - timeUnit.toNanos(jConvert);
            boolean z15 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb6 = new StringBuilder(strConcat.length() + String.valueOf(jConvert).length() + 1 + String.valueOf(lowerCase).length());
                sb6.append(strConcat);
                sb6.append(jConvert);
                sb6.append(" ");
                sb6.append(lowerCase);
                String string4 = sb6.toString();
                if (z15) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z15) {
                StringBuilder sb7 = new StringBuilder(strConcat.length() + String.valueOf(nanos2).length() + 13);
                sb7.append(strConcat);
                sb7.append(nanos2);
                sb7.append(" nanoseconds ");
                strConcat = sb7.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb8 = new StringBuilder(string3.length() + 5 + String.valueOf(string).length());
        sb8.append(string3);
        sb8.append(" for ");
        sb8.append(string);
        throw new TimeoutException(sb8.toString());
    }

    final Object h() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f30821a;
        if ((obj2 != null) && e3.o(obj2)) {
            return e3.n(obj2);
        }
        k3 k3Var = this.f30823c;
        if (k3Var != k3.f30813c) {
            k3 k3Var2 = new k3();
            do {
                f3 f3Var = f30820g;
                f3Var.b(k3Var2, k3Var);
                if (f3Var.c(this, k3Var, k3Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            c(k3Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f30821a;
                    } while (!((obj != null) & e3.o(obj)));
                    return e3.n(obj);
                }
                k3Var = this.f30823c;
            } while (k3Var != k3.f30813c);
        }
        Object obj3 = this.f30821a;
        Objects.requireNonNull(obj3);
        return e3.n(obj3);
    }
}
