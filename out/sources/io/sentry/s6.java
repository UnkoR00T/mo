package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7 f95697a;

    public s6(w7 w7Var) {
        this.f95697a = (w7) io.sentry.util.v.c(w7Var, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.q c(Throwable th4, io.sentry.protocol.j jVar, Long l15, List<io.sentry.protocol.z> list, boolean z15) {
        Package r15 = th4.getClass().getPackage();
        String name = th4.getClass().getName();
        io.sentry.protocol.q qVar = new io.sentry.protocol.q();
        String message = th4.getMessage();
        if (r15 != null) {
            name = name.replace(r15.getName() + ".", "");
        }
        String name2 = r15 != null ? r15.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0(list);
            if (z15) {
                a0Var.e(Boolean.TRUE);
            }
            qVar.n(a0Var);
        }
        qVar.o(l15);
        qVar.p(name);
        qVar.l(jVar);
        qVar.m(name2);
        qVar.r(message);
        return qVar;
    }

    private List<io.sentry.protocol.q> e(Deque<io.sentry.protocol.q> deque) {
        return new ArrayList(deque);
    }

    Deque<io.sentry.protocol.q> a(Throwable th4) {
        return b(th4, new AtomicInteger(-1), new HashSet<>(), new ArrayDeque(), null);
    }

    Deque<io.sentry.protocol.q> b(Throwable th4, AtomicInteger atomicInteger, HashSet<Throwable> hashSet, Deque<io.sentry.protocol.q> deque, String str) {
        io.sentry.protocol.j jVar;
        Thread threadCurrentThread;
        Throwable th5;
        boolean zD;
        String str2 = str;
        int i15 = atomicInteger.get();
        Throwable cause = th4;
        while (cause != null) {
            HashSet<Throwable> hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i16 = 0;
            if (cause instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) cause;
                jVar = aVar.a();
                Throwable thC = aVar.c();
                threadCurrentThread = aVar.b();
                zD = aVar.d();
                th5 = thC;
            } else {
                jVar = new io.sentry.protocol.j();
                threadCurrentThread = Thread.currentThread();
                th5 = cause;
                zD = false;
            }
            io.sentry.protocol.j jVar2 = jVar;
            deque.addFirst(c(th5, jVar2, Long.valueOf(threadCurrentThread.getId()), this.f95697a.e(th5.getStackTrace(), Boolean.FALSE.equals(jVar2.l())), zD));
            if (jVar2.k() == null) {
                jVar2.p(str2);
            }
            if (atomicInteger.get() >= 0) {
                jVar2.o(Integer.valueOf(i15));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            jVar2.m(Integer.valueOf(iIncrementAndGet));
            Throwable[] suppressed = th5.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i16 < length) {
                    b(suppressed[i16], atomicInteger, hashSet2, deque, "suppressed");
                    i16++;
                    hashSet2 = hashSet;
                    deque = deque;
                }
            }
            cause = th5.getCause();
            str2 = null;
            i15 = iIncrementAndGet;
        }
        return deque;
    }

    public List<io.sentry.protocol.q> d(Throwable th4) {
        return e(a(th4));
    }

    public List<io.sentry.protocol.q> f(io.sentry.protocol.b0 b0Var, io.sentry.protocol.j jVar, Throwable th4) {
        io.sentry.protocol.a0 a0VarN = b0Var.n();
        if (a0VarN == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c(th4, jVar, b0Var.l(), a0VarN.d(), true));
        return arrayList;
    }
}
