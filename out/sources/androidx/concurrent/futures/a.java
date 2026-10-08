package androidx.concurrent.futures;

import com.google.common.util.concurrent.q;
import java.util.Locale;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class a<V> implements q<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f11163d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f11164e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f11165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f11166g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f11167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f11168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f11169c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f11170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f11171d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f11172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f11173b;

        static {
            if (a.f11163d) {
                f11171d = null;
                f11170c = null;
            } else {
                f11171d = new c(false, null);
                f11170c = new c(true, null);
            }
        }

        c(boolean z15, Throwable th4) {
            this.f11172a = z15;
            this.f11173b = th4;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f11174b = new d(new C0249a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f11175a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0249a extends Throwable {
            C0249a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th4) {
            this.f11175a = (Throwable) a.k(th4);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f11176d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f11177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f11178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f11179c;

        e(Runnable runnable, Executor executor) {
            this.f11177a = runnable;
            this.f11178b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f11180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f11181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f11182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f11183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f11184e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f11180a = atomicReferenceFieldUpdater;
            this.f11181b = atomicReferenceFieldUpdater2;
            this.f11182c = atomicReferenceFieldUpdater3;
            this.f11183d = atomicReferenceFieldUpdater4;
            this.f11184e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f11183d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f11184e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f11182c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f11181b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f11180a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f11185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final q<? extends V> f11186b;
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11168b != eVar) {
                        return false;
                    }
                    aVar.f11168b = eVar2;
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11167a != obj) {
                        return false;
                    }
                    aVar.f11167a = obj2;
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f11169c != iVar) {
                        return false;
                    }
                    aVar.f11169c = iVar2;
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f11189b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f11188a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f11187c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f11188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f11189b;

        i(boolean z15) {
        }

        void a(i iVar) {
            a.f11165f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f11188a;
            if (thread != null) {
                this.f11188a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f11165f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th4) {
            th = th4;
            hVar = new h();
        }
        f11165f = hVar;
        if (th != null) {
            f11164e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f11166g = new Object();
    }

    protected a() {
    }

    private void e(StringBuilder sb5) {
        try {
            Object objR = r(this);
            sb5.append("SUCCESS, result=[");
            sb5.append(z(objR));
            sb5.append("]");
        } catch (CancellationException unused) {
            sb5.append("CANCELLED");
        } catch (RuntimeException e15) {
            sb5.append("UNKNOWN, cause=[");
            sb5.append(e15.getClass());
            sb5.append(" thrown from get()]");
        } catch (ExecutionException e16) {
            sb5.append("FAILURE, cause=[");
            sb5.append(e16.getCause());
            sb5.append("]");
        }
    }

    private static CancellationException j(String str, Throwable th4) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th4);
        return cancellationException;
    }

    static <T> T k(T t15) {
        t15.getClass();
        return t15;
    }

    private e l(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f11168b;
        } while (!f11165f.a(this, eVar2, e.f11176d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f11179c;
            eVar4.f11179c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
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
    static void n(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.v();
            aVar.g();
            e eVarL = aVar.l(eVar);
            while (eVarL != null) {
                eVar = eVarL.f11179c;
                Runnable runnable = eVarL.f11177a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f11185a;
                    if (aVar.f11167a == gVar) {
                        if (f11165f.b(aVar, gVar, q(gVar.f11186b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    o(runnable, eVarL.f11178b);
                }
                eVarL = eVar;
            }
            return;
        }
    }

    private static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e15) {
            f11164e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V p(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw j("Task was cancelled.", ((c) obj).f11173b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f11175a);
        }
        if (obj == f11166g) {
            return null;
        }
        return obj;
    }

    static Object q(q<?> qVar) {
        if (qVar instanceof a) {
            Object obj = ((a) qVar).f11167a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f11172a) {
                return cVar.f11173b != null ? new c(false, cVar.f11173b) : c.f11171d;
            }
            return obj;
        }
        boolean zIsCancelled = qVar.isCancelled();
        if ((!f11163d) && zIsCancelled) {
            return c.f11171d;
        }
        try {
            Object objR = r(qVar);
            return objR == null ? f11166g : objR;
        } catch (CancellationException e15) {
            if (zIsCancelled) {
                return new c(false, e15);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + qVar, e15));
        } catch (ExecutionException e16) {
            return new d(e16.getCause());
        } catch (Throwable th4) {
            return new d(th4);
        }
    }

    static <V> V r(Future<V> future) {
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

    private void v() {
        i iVar;
        do {
            iVar = this.f11169c;
        } while (!f11165f.c(this, iVar, i.f11187c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f11189b;
        }
    }

    private void w(i iVar) {
        iVar.f11188a = null;
        while (true) {
            i iVar2 = this.f11169c;
            if (iVar2 == i.f11187c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f11189b;
                if (iVar2.f11188a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f11189b = iVar4;
                    if (iVar3.f11188a == null) {
                    }
                } else if (!f11165f.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String z(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected final boolean A() {
        Object obj = this.f11167a;
        return (obj instanceof c) && ((c) obj).f11172a;
    }

    @Override // com.google.common.util.concurrent.q
    public final void b(Runnable runnable, Executor executor) {
        k(runnable);
        k(executor);
        e eVar = this.f11168b;
        if (eVar != e.f11176d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f11179c = eVar;
                if (f11165f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f11168b;
                }
            } while (eVar != e.f11176d);
        }
        o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z15) {
        c cVar;
        Object obj = this.f11167a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f11163d) {
            cVar = new c(z15, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z15 ? c.f11170c : c.f11171d;
        }
        a<V> aVar = this;
        boolean z16 = false;
        while (true) {
            if (f11165f.b(aVar, obj, cVar)) {
                if (z15) {
                    aVar.s();
                }
                n(aVar);
                if (obj instanceof g) {
                    q<? extends V> qVar = ((g) obj).f11186b;
                    if (qVar instanceof a) {
                        aVar = (a) qVar;
                        obj = aVar.f11167a;
                        if ((obj == null) | (obj instanceof g)) {
                            z16 = true;
                        }
                    } else {
                        qVar.cancel(z15);
                    }
                }
                return true;
            }
            obj = aVar.f11167a;
            if (!(obj instanceof g)) {
                return z16;
            }
        }
    }

    protected void g() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long j15, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j15);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11167a;
        if ((obj != null) && (!(obj instanceof g))) {
            return p(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f11169c;
            if (iVar != i.f11187c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f11165f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                w(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11167a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return p(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(iVar2);
                        break;
                    }
                    iVar = this.f11169c;
                    if (iVar == i.f11187c) {
                    }
                }
            }
            return p(this.f11167a);
        }
        while (nanos > 0) {
            Object obj3 = this.f11167a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return p(obj3);
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
    public final boolean isCancelled() {
        return this.f11167a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f11167a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String t() {
        Object obj = this.f11167a;
        if (obj instanceof g) {
            return "setFuture=[" + z(((g) obj).f11186b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strT;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        sb5.append("[status=");
        if (isCancelled()) {
            sb5.append("CANCELLED");
        } else if (isDone()) {
            e(sb5);
        } else {
            try {
                strT = t();
            } catch (RuntimeException e15) {
                strT = "Exception thrown from implementation: " + e15.getClass();
            }
            if (strT != null && !strT.isEmpty()) {
                sb5.append("PENDING, info=[");
                sb5.append(strT);
                sb5.append("]");
            } else if (isDone()) {
                e(sb5);
            } else {
                sb5.append("PENDING");
            }
        }
        sb5.append("]");
        return sb5.toString();
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
    protected boolean x(V v15) {
        if (v15 == null) {
            v15 = (V) f11166g;
        }
        if (!f11165f.b(this, null, v15)) {
            return false;
        }
        n(this);
        return true;
    }

    protected boolean y(Throwable th4) {
        if (!f11165f.b(this, null, new d((Throwable) k(th4)))) {
            return false;
        }
        n(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11167a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return p(obj2);
            }
            i iVar = this.f11169c;
            if (iVar != i.f11187c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f11165f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11167a;
                            } else {
                                w(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return p(obj);
                    }
                    iVar = this.f11169c;
                } while (iVar != i.f11187c);
            }
            return p(this.f11167a);
        }
        throw new InterruptedException();
    }
}
