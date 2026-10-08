package com.google.common.util.concurrent;

import com.google.android.gms.internal.oss_licenses.i3;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<V> extends com.google.common.util.concurrent.internal.a implements q<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f35914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final p f35915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f35916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f35917g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f35918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f35919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile l f35920c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, l lVar, l lVar2);

        abstract e d(a<?> aVar, e eVar);

        abstract l e(a<?> aVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f35921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f35922d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f35923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f35924b;

        static {
            if (a.f35914d) {
                f35922d = null;
                f35921c = null;
            } else {
                f35922d = new c(false, null);
                f35921c = new c(true, null);
            }
        }

        c(boolean z15, Throwable th4) {
            this.f35923a = z15;
            this.f35924b = th4;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f35925b = new d(new C0755a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f35926a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$d$a, reason: collision with other inner class name */
        class C0755a extends Throwable {
            C0755a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th4) {
            this.f35926a = (Throwable) zj.p.q(th4);
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f35931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f35932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, l> f35933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, e> f35934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, Object> f35935e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super a<?>, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super a<?>, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super a<?>, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f35931a = atomicReferenceFieldUpdater;
            this.f35932b = atomicReferenceFieldUpdater2;
            this.f35933c = atomicReferenceFieldUpdater3;
            this.f35934d = atomicReferenceFieldUpdater4;
            this.f35935e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f35934d, aVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f35935e, aVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f35933c, aVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            return this.f35934d.getAndSet(aVar, eVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            return this.f35933c.getAndSet(aVar, lVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            this.f35932b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            this.f35931a.lazySet(lVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f35936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final q<? extends V> f35937b;

        g(a<V> aVar, q<? extends V> qVar) {
            this.f35936a = aVar;
            this.f35937b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((a) this.f35936a).f35918a != this) {
                return;
            }
            if (a.f35916f.b(this.f35936a, this, a.v(this.f35937b))) {
                a.s(this.f35936a, false);
            }
        }
    }

    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f35919b != eVar) {
                        return false;
                    }
                    ((a) aVar).f35919b = eVar2;
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f35918a != obj) {
                        return false;
                    }
                    ((a) aVar).f35918a = obj2;
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f35920c != lVar) {
                        return false;
                    }
                    ((a) aVar).f35920c = lVar2;
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                try {
                    eVar2 = ((a) aVar).f35919b;
                    if (eVar2 != eVar) {
                        ((a) aVar).f35919b = eVar;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            l lVar2;
            synchronized (aVar) {
                try {
                    lVar2 = ((a) aVar).f35920c;
                    if (lVar2 != lVar) {
                        ((a) aVar).f35920c = lVar;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            lVar.f35946b = lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            lVar.f35945a = thread;
        }
    }

    interface i<V> extends q<V> {
    }

    static abstract class j<V> extends a<V> implements i<V> {
        j() {
        }

        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.q
        public final void b(Runnable runnable, Executor executor) {
            super.b(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z15) {
            return super.cancel(z15);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get(long j15, TimeUnit timeUnit) {
            return (V) super.get(j15, timeUnit);
        }
    }

    private static final class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f35938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f35939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f35940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f35941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f35942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f35943f;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$k$a, reason: collision with other inner class name */
        class C0756a implements PrivilegedExceptionAction<Unsafe> {
            C0756a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e15) {
                    throw new RuntimeException("Could not initialize intrinsics", e15.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0756a());
            }
            try {
                f35940c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                f35939b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                f35941d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                f35942e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f35943f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f35938a = unsafe;
            } catch (NoSuchFieldException e16) {
                throw new RuntimeException(e16);
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return i3.a(f35938a, aVar, f35939b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return i3.a(f35938a, aVar, f35941d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return i3.a(f35938a, aVar, f35940c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ((a) aVar).f35919b;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            l lVar2;
            do {
                lVar2 = ((a) aVar).f35920c;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(aVar, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            f35938a.putObject(lVar, f35943f, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            f35938a.putObject(lVar, f35942e, thread);
        }
    }

    private static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final l f35944c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f35945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile l f35946b;

        l(boolean z15) {
        }

        void a(l lVar) {
            a.f35916f.f(this, lVar);
        }

        void b() {
            Thread thread = this.f35945a;
            if (thread != null) {
                this.f35945a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            a.f35916f.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Error] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.common.util.concurrent.a$a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        boolean z15;
        Throwable th4;
        b fVar;
        try {
            z15 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z15 = false;
        }
        f35914d = z15;
        f35915e = new p(a.class);
        ?? r15 = 0;
        r15 = 0;
        try {
            fVar = new k();
            th4 = null;
        } catch (Error | Exception e15) {
            th4 = e15;
            try {
                fVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | Exception e16) {
                h hVar = new h();
                r15 = e16;
                fVar = hVar;
            }
        }
        f35916f = fVar;
        if (r15 != 0) {
            p pVar = f35915e;
            Logger loggerA = pVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th4);
            pVar.a().log(level, "SafeAtomicHelper is broken!", r15);
        }
        f35917g = new Object();
    }

    protected a() {
    }

    private void A() {
        for (l lVarE = f35916f.e(this, l.f35944c); lVarE != null; lVarE = lVarE.f35946b) {
            lVarE.b();
        }
    }

    private void B(l lVar) {
        lVar.f35945a = null;
        while (true) {
            l lVar2 = this.f35920c;
            if (lVar2 == l.f35944c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f35946b;
                if (lVar2.f35945a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f35946b = lVar4;
                    if (lVar3.f35945a == null) {
                    }
                } else if (!f35916f.c(this, lVar2, lVar4)) {
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void l(StringBuilder sb5) {
        try {
            Object objW = w(this);
            sb5.append("SUCCESS, result=[");
            o(sb5, objW);
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

    private void m(StringBuilder sb5) {
        String strA;
        int length = sb5.length();
        sb5.append("PENDING");
        Object obj = this.f35918a;
        if (obj instanceof g) {
            sb5.append(", setFuture=[");
            p(sb5, ((g) obj).f35937b);
            sb5.append("]");
        } else {
            try {
                strA = zj.v.a(z());
            } catch (Exception | StackOverflowError e15) {
                strA = "Exception thrown from implementation: " + e15.getClass();
            }
            if (strA != null) {
                sb5.append(", info=[");
                sb5.append(strA);
                sb5.append("]");
            }
        }
        if (isDone()) {
            sb5.delete(length, sb5.length());
            l(sb5);
        }
    }

    private void o(StringBuilder sb5, Object obj) {
        if (obj == null) {
            sb5.append("null");
        } else {
            if (obj == this) {
                sb5.append("this future");
                return;
            }
            sb5.append(obj.getClass().getName());
            sb5.append("@");
            sb5.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void p(StringBuilder sb5, Object obj) {
        try {
            if (obj == this) {
                sb5.append("this future");
            } else {
                sb5.append(obj);
            }
        } catch (Exception e15) {
            e = e15;
            sb5.append("Exception thrown from implementation: ");
            sb5.append(e.getClass());
        } catch (StackOverflowError e16) {
            e = e16;
            sb5.append("Exception thrown from implementation: ");
            sb5.append(e.getClass());
        }
    }

    private static CancellationException q(String str, Throwable th4) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th4);
        return cancellationException;
    }

    private e r(e eVar) {
        e eVar2 = eVar;
        e eVarD = f35916f.d(this, e.f35927d);
        while (eVarD != null) {
            e eVar3 = eVarD.f35930c;
            eVarD.f35930c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void s(a<?> aVar, boolean z15) {
        e eVar = null;
        while (true) {
            aVar.A();
            if (z15) {
                aVar.x();
                z15 = false;
            }
            aVar.n();
            e eVarR = aVar.r(eVar);
            while (eVarR != null) {
                eVar = eVarR.f35930c;
                Runnable runnable = eVarR.f35928a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f35936a;
                    if (((a) aVar).f35918a == gVar) {
                        if (f35916f.b(aVar, gVar, v(gVar.f35937b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarR.f35929b;
                    Objects.requireNonNull(executor);
                    t(runnable2, executor);
                }
                eVarR = eVar;
            }
            return;
        }
    }

    private static void t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e15) {
            f35915e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V u(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw q("Task was cancelled.", ((c) obj).f35924b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f35926a);
        }
        return obj == f35917g ? (V) v.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object v(q<?> qVar) {
        Throwable thA;
        if (qVar instanceof i) {
            Object cVar = ((a) qVar).f35918a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f35923a) {
                    cVar = cVar2.f35924b != null ? new c(false, cVar2.f35924b) : c.f35922d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((qVar instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) qVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = qVar.isCancelled();
        if ((!f35914d) && zIsCancelled) {
            c cVar3 = c.f35922d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objW = w(qVar);
            if (!zIsCancelled) {
                return objW == null ? f35917g : objW;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + qVar));
        } catch (Error | Exception e15) {
            return new d(e15);
        } catch (CancellationException e16) {
            if (zIsCancelled) {
                return new c(false, e16);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + qVar, e16));
        } catch (ExecutionException e17) {
            if (!zIsCancelled) {
                return new d(e17.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + qVar, e17));
        }
    }

    private static <V> V w(Future<V> future) {
        V v15;
        boolean z15 = false;
        while (true) {
            try {
                v15 = future.get();
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
        return v15;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected boolean C(V v15) {
        if (v15 == null) {
            v15 = (V) f35917g;
        }
        if (!f35916f.b(this, null, v15)) {
            return false;
        }
        s(this, false);
        return true;
    }

    protected boolean D(Throwable th4) {
        if (!f35916f.b(this, null, new d((Throwable) zj.p.q(th4)))) {
            return false;
        }
        s(this, false);
        return true;
    }

    protected boolean E(q<? extends V> qVar) {
        d dVar;
        zj.p.q(qVar);
        Object obj = this.f35918a;
        if (obj == null) {
            if (qVar.isDone()) {
                if (!f35916f.b(this, null, v(qVar))) {
                    return false;
                }
                s(this, false);
                return true;
            }
            g gVar = new g(this, qVar);
            if (f35916f.b(this, null, gVar)) {
                try {
                    qVar.b(gVar, com.google.common.util.concurrent.e.INSTANCE);
                } catch (Throwable th4) {
                    try {
                        dVar = new d(th4);
                    } catch (Error | Exception unused) {
                        dVar = d.f35925b;
                    }
                    f35916f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f35918a;
        }
        if (obj instanceof c) {
            qVar.cancel(((c) obj).f35923a);
        }
        return false;
    }

    protected final boolean F() {
        Object obj = this.f35918a;
        return (obj instanceof c) && ((c) obj).f35923a;
    }

    @Override // com.google.common.util.concurrent.internal.a
    protected final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f35918a;
        if (obj instanceof d) {
            return ((d) obj).f35926a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.q
    public void b(Runnable runnable, Executor executor) {
        e eVar;
        zj.p.r(runnable, "Runnable was null.");
        zj.p.r(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f35919b) != e.f35927d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f35930c = eVar;
                if (f35916f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f35919b;
                }
            } while (eVar != e.f35927d);
        }
        t(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z15) {
        c cVar;
        Object obj = this.f35918a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f35914d) {
            cVar = new c(z15, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z15 ? c.f35921c : c.f35922d;
            Objects.requireNonNull(cVar);
        }
        a<V> aVar = this;
        boolean z16 = false;
        while (true) {
            if (f35916f.b(aVar, obj, cVar)) {
                s(aVar, z15);
                if (obj instanceof g) {
                    q<? extends V> qVar = ((g) obj).f35937b;
                    if (qVar instanceof i) {
                        aVar = (a) qVar;
                        obj = aVar.f35918a;
                        if ((obj == null) | (obj instanceof g)) {
                            z16 = true;
                        }
                    } else {
                        qVar.cancel(z15);
                    }
                }
                return true;
            }
            obj = aVar.f35918a;
            if (!(obj instanceof g)) {
                return z16;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j15, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j15);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f35918a;
        if ((obj != null) && (!(obj instanceof g))) {
            return u(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f35920c;
            if (lVar != l.f35944c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (f35916f.c(this, lVar, lVar2)) {
                        do {
                            w.a(this, nanos);
                            if (Thread.interrupted()) {
                                B(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f35918a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return u(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        B(lVar2);
                        break;
                    }
                    lVar = this.f35920c;
                    if (lVar == l.f35944c) {
                    }
                }
            }
            Object obj3 = this.f35918a;
            Objects.requireNonNull(obj3);
            return u(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f35918a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return u(obj4);
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
        String str = "Waited " + j15 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j16 = -nanos;
            long jConvert = timeUnit.convert(j16, TimeUnit.NANOSECONDS);
            long nanos2 = j16 - timeUnit.toNanos(jConvert);
            boolean z15 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z15) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z15) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f35918a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f35918a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void n() {
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb5.append(getClass().getSimpleName());
        } else {
            sb5.append(getClass().getName());
        }
        sb5.append('@');
        sb5.append(Integer.toHexString(System.identityHashCode(this)));
        sb5.append("[status=");
        if (isCancelled()) {
            sb5.append("CANCELLED");
        } else if (isDone()) {
            l(sb5);
        } else {
            m(sb5);
        }
        sb5.append("]");
        return sb5.toString();
    }

    protected void x() {
    }

    final void y(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(F());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String z() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f35927d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f35928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f35929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f35930c;

        e(Runnable runnable, Executor executor) {
            this.f35928a = runnable;
            this.f35929b = executor;
        }

        e() {
            this.f35928a = null;
            this.f35929b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f35918a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return u(obj2);
            }
            l lVar = this.f35920c;
            if (lVar != l.f35944c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f35916f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f35918a;
                            } else {
                                B(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return u(obj);
                    }
                    lVar = this.f35920c;
                } while (lVar != l.f35944c);
            }
            Object obj3 = this.f35918a;
            Objects.requireNonNull(obj3);
            return u(obj3);
        }
        throw new InterruptedException();
    }
}
