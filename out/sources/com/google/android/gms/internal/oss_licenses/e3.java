package com.google.android.gms.internal.oss_licenses;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e3<V> extends l3<V> {
    protected e3() {
    }

    static Object n(Object obj) throws ExecutionException {
        if (obj instanceof a3) {
            Throwable th4 = ((a3) obj).f30740b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th4);
            throw cancellationException;
        }
        if (obj instanceof c3) {
            throw new ExecutionException(((c3) obj).f30762a);
        }
        if (obj == l3.f30817d) {
            return null;
        }
        return obj;
    }

    static boolean o(Object obj) {
        return !(obj instanceof b3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object p(p3 p3Var) {
        Throwable thA;
        if ((p3Var instanceof s3) && (thA = ((s3) p3Var).a()) != null) {
            return new c3(thA);
        }
        boolean zIsCancelled = p3Var.isCancelled();
        if ((!l3.f30819f) && zIsCancelled) {
            a3 a3Var = a3.f30738d;
            Objects.requireNonNull(a3Var);
            return a3Var;
        }
        try {
            Object objQ = q(p3Var);
            if (!zIsCancelled) {
                return objQ == null ? l3.f30817d : objQ;
            }
            String strValueOf = String.valueOf(p3Var);
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 84);
            sb5.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb5.append(strValueOf);
            return new a3(false, new IllegalArgumentException(sb5.toString()));
        } catch (Error | Exception e15) {
            return new c3(e15);
        } catch (CancellationException e16) {
            return !zIsCancelled ? new c3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(p3Var)), e16)) : new a3(false, e16);
        } catch (ExecutionException e17) {
            return zIsCancelled ? new a3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(p3Var)), e17)) : new c3(e17.getCause());
        }
    }

    private static Object q(Future future) {
        Object obj;
        boolean z15 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z15 = true;
            } catch (Throwable th4) {
                if (z15) {
                    Thread.currentThread().interrupt();
                }
                throw th4;
            }
        }
        if (z15) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private static void r(e3 e3Var, boolean z15) {
        d3 d3Var = null;
        while (true) {
            e3Var.f();
            e3Var.l();
            d3 d3Var2 = d3Var;
            d3 d3VarD = e3Var.d(d3.f30768d);
            d3 d3Var3 = d3Var2;
            while (d3VarD != null) {
                d3 d3Var4 = d3VarD.f30771c;
                d3VarD.f30771c = d3Var3;
                d3Var3 = d3VarD;
                d3VarD = d3Var4;
            }
            while (d3Var3 != null) {
                Runnable runnable = d3Var3.f30769a;
                d3 d3Var5 = d3Var3.f30771c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof b3) {
                    b3 b3Var = (b3) runnable2;
                    e3Var = b3Var.f30753a;
                    if (e3Var.f30821a == b3Var && l3.e(e3Var, b3Var, p(b3Var.f30754b))) {
                        d3Var = d3Var5;
                    }
                } else {
                    Executor executor = d3Var3.f30770b;
                    Objects.requireNonNull(executor);
                    Executor executor2 = executor;
                    try {
                        executor2.execute(runnable2);
                    } catch (Exception e15) {
                        Logger loggerA = l3.f30818e.a();
                        Level level = Level.SEVERE;
                        String strValueOf = String.valueOf(runnable2);
                        String strValueOf2 = String.valueOf(executor2);
                        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
                        sb5.append("RuntimeException while executing runnable ");
                        sb5.append(strValueOf);
                        sb5.append(" with executor ");
                        sb5.append(strValueOf2);
                        loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb5.toString(), (Throwable) e15);
                    }
                }
                d3Var3 = d3Var5;
            }
            return;
        }
    }

    private final void s(StringBuilder sb5) {
        try {
            Object objQ = q(this);
            sb5.append("SUCCESS, result=[");
            if (objQ == null) {
                sb5.append("null");
            } else if (objQ == this) {
                sb5.append("this future");
            } else {
                sb5.append(objQ.getClass().getName());
                sb5.append("@");
                sb5.append(Integer.toHexString(System.identityHashCode(objQ)));
            }
            sb5.append("]");
        } catch (CancellationException unused) {
            sb5.append("CANCELLED");
        } catch (ExecutionException e15) {
            sb5.append("FAILURE, cause=[");
            sb5.append(e15.getCause());
            sb5.append("]");
        } catch (Exception e16) {
            sb5.append("UNKNOWN, cause=[");
            sb5.append(e16.getClass());
            sb5.append(" thrown from get()]");
        }
    }

    @Override // com.google.android.gms.internal.oss_licenses.s3
    protected final Throwable a() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z15) {
        a3 a3Var;
        Object obj = this.f30821a;
        if ((obj instanceof b3) | (obj == null)) {
            if (l3.f30819f) {
                a3Var = new a3(z15, new CancellationException("Future.cancel() was called."));
            } else {
                a3Var = z15 ? a3.f30737c : a3.f30738d;
                Objects.requireNonNull(a3Var);
            }
            while (!l3.e(this, obj, a3Var)) {
                obj = this.f30821a;
                if (o(obj)) {
                }
            }
            r(this, z15);
            if (obj instanceof b3) {
                ((b3) obj).f30754b.cancel(z15);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return h();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f30821a instanceof a3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f30821a;
        return (obj != null) & o(obj);
    }

    protected boolean j(Object obj) {
        if (obj == null) {
            obj = l3.f30817d;
        }
        if (!l3.e(this, null, obj)) {
            return false;
        }
        r(this, false);
        return true;
    }

    protected boolean k(Throwable th4) {
        if (!l3.e(this, null, new c3(th4))) {
            return false;
        }
        r(this, false);
        return true;
    }

    protected void l() {
    }

    protected String m() {
        throw null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb5 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb5.append(getClass().getSimpleName());
        } else {
            sb5.append(getClass().getName());
        }
        sb5.append('@');
        sb5.append(Integer.toHexString(System.identityHashCode(this)));
        sb5.append("[status=");
        if (this.f30821a instanceof a3) {
            sb5.append("CANCELLED");
        } else if (isDone()) {
            s(sb5);
        } else {
            int length = sb5.length();
            sb5.append("PENDING");
            Object obj = this.f30821a;
            if (obj instanceof b3) {
                sb5.append(", setFuture=[");
                p3<? extends V> p3Var = ((b3) obj).f30754b;
                try {
                    if (p3Var == this) {
                        sb5.append("this future");
                    } else {
                        sb5.append(p3Var);
                    }
                } catch (Throwable th4) {
                    r3.a(th4);
                    sb5.append("Exception thrown from implementation: ");
                    sb5.append(th4.getClass());
                }
                sb5.append("]");
            } else {
                try {
                    strConcat = m();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th5) {
                    r3.a(th5);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th5.getClass()));
                }
                if (strConcat != null) {
                    sb5.append(", info=[");
                    sb5.append(strConcat);
                    sb5.append("]");
                }
            }
            if (isDone()) {
                sb5.delete(length, sb5.length());
                s(sb5);
            }
        }
        sb5.append("]");
        return sb5.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j15, TimeUnit timeUnit) {
        return g(j15, timeUnit);
    }
}
