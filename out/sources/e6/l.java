package e6;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f47637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f47638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f47639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f47640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f47641e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f47637a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f47638b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f47639c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f47640d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f47641e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
