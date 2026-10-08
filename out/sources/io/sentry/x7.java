package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7 f95967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f95968b;

    public x7(w7 w7Var, q7 q7Var) {
        this.f95967a = (w7) io.sentry.util.v.c(w7Var, "The SentryStackTraceFactory is required.");
        this.f95968b = (q7) io.sentry.util.v.c(q7Var, "The SentryOptions is required");
    }

    private io.sentry.protocol.b0 d(boolean z15, StackTraceElement[] stackTraceElementArr, Thread thread) {
        io.sentry.protocol.b0 b0Var = new io.sentry.protocol.b0();
        b0Var.w(thread.getName());
        b0Var.x(Integer.valueOf(thread.getPriority()));
        b0Var.u(Long.valueOf(thread.getId()));
        b0Var.s(Boolean.valueOf(thread.isDaemon()));
        b0Var.z(thread.getState().name());
        b0Var.q(Boolean.valueOf(z15));
        List<io.sentry.protocol.z> listE = this.f95967a.e(stackTraceElementArr, false);
        if (this.f95968b.isAttachStacktrace() && listE != null && !listE.isEmpty()) {
            io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0(listE);
            a0Var.e(Boolean.TRUE);
            b0Var.y(a0Var);
        }
        return b0Var;
    }

    List<io.sentry.protocol.b0> a() {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return c(map, null, false);
    }

    List<io.sentry.protocol.b0> b(List<Long> list, boolean z15) {
        return c(Thread.getAllStackTraces(), list, z15);
    }

    List<io.sentry.protocol.b0> c(Map<Thread, StackTraceElement[]> map, List<Long> list, boolean z15) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(d((key == threadCurrentThread && !z15) || !(list == null || !list.contains(Long.valueOf(key.getId())) || z15), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }
}
