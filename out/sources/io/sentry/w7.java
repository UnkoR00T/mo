package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f95944a;

    public w7(q7 q7Var) {
        this.f95944a = q7Var;
    }

    public static /* synthetic */ boolean b(io.sentry.protocol.z zVar) {
        String strV = zVar.v();
        boolean z15 = false;
        if (strV != null && (strV.startsWith("sun.") || strV.startsWith("java.") || strV.startsWith("android.") || strV.startsWith("com.android."))) {
            z15 = true;
        }
        return !z15;
    }

    public List<io.sentry.protocol.z> c() {
        return d(new Exception());
    }

    List<io.sentry.protocol.z> d(Throwable th4) {
        List<io.sentry.protocol.z> listE = e(th4.getStackTrace(), false);
        if (listE == null) {
            return Collections.EMPTY_LIST;
        }
        List<io.sentry.protocol.z> listA = io.sentry.util.c.a(listE, new io.sentry.util.c.a() { // from class: io.sentry.u7
            @Override // io.sentry.util.c.a
            public final boolean test(Object obj) {
                return Boolean.TRUE.equals(((io.sentry.protocol.z) obj).w());
            }
        });
        return !listA.isEmpty() ? listA : io.sentry.util.c.a(listE, new io.sentry.util.c.a() { // from class: io.sentry.v7
            @Override // io.sentry.util.c.a
            public final boolean test(Object obj) {
                return w7.b((io.sentry.protocol.z) obj);
            }
        });
    }

    public List<io.sentry.protocol.z> e(StackTraceElement[] stackTraceElementArr, boolean z15) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z15 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.z zVar = new io.sentry.protocol.z();
                    zVar.A(f(className));
                    zVar.E(className);
                    zVar.z(stackTraceElement.getMethodName());
                    zVar.y(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        zVar.C(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    zVar.F(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(zVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean f(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.f95944a.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it4 = this.f95944a.getInAppExcludes().iterator();
        while (it4.hasNext()) {
            if (str.startsWith(it4.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
