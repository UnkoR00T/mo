package eb;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J#\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010$R\u001a\u0010+\u001a\u00020\u00048BX\u0082\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010\u0006¨\u0006,"}, d2 = {"Leb/a;", "", "<init>", "()V", "", "h", "()Z", "", AnnotatedPrivateKey.LABEL, "Loq/i0;", "c", "(Ljava/lang/String;)V", "f", "methodName", "", "cookie", "a", "(Ljava/lang/String;I)V", "d", "counterName", "counterValue", "j", "b", "e", "k", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "g", "(Ljava/lang/String;Ljava/lang/Exception;)V", "l", "(Ljava/lang/String;)Ljava/lang/String;", "", "J", "traceTagApp", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "isTagEnabledMethod", "asyncTraceBeginMethod", "asyncTraceEndMethod", "traceCounterMethod", "i", "isEnabledFallback$annotations", "isEnabledFallback", "tracing"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49085a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static long traceTagApp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Method isTagEnabledMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static Method asyncTraceBeginMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static Method asyncTraceEndMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static Method traceCounterMethod;

    private a() {
    }

    public static final void a(String methodName, int cookie) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            b.f49091a.a(f49085a.l(methodName), cookie);
        } else {
            a aVar = f49085a;
            aVar.b(aVar.l(methodName), cookie);
        }
    }

    private final void b(String methodName, int cookie) throws Throwable {
        try {
            if (asyncTraceBeginMethod == null) {
                asyncTraceBeginMethod = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = asyncTraceBeginMethod;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(traceTagApp), methodName, Integer.valueOf(cookie));
        } catch (Exception e15) {
            g("asyncTraceBegin", e15);
        }
    }

    public static final void c(String label) {
        Trace.beginSection(f49085a.l(label));
    }

    public static final void d(String methodName, int cookie) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            b.f49091a.b(f49085a.l(methodName), cookie);
        } else {
            a aVar = f49085a;
            aVar.e(aVar.l(methodName), cookie);
        }
    }

    private final void e(String methodName, int cookie) throws Throwable {
        try {
            if (asyncTraceEndMethod == null) {
                asyncTraceEndMethod = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = asyncTraceEndMethod;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(traceTagApp), methodName, Integer.valueOf(cookie));
        } catch (Exception e15) {
            g("asyncTraceEnd", e15);
        }
    }

    public static final void f() {
        Trace.endSection();
    }

    private final void g(String methodName, Exception exception) throws Throwable {
        if (exception instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exception).getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw cause;
        }
    }

    public static final boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? b.f49091a.c() : f49085a.i();
    }

    private final boolean i() throws Throwable {
        try {
            if (isTagEnabledMethod == null) {
                traceTagApp = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                isTagEnabledMethod = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = isTagEnabledMethod;
            if (method != null) {
                return ((Boolean) method.invoke(null, Long.valueOf(traceTagApp))).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e15) {
            g("isTagEnabled", e15);
            return false;
        }
    }

    public static final void j(String counterName, int counterValue) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            b.f49091a.d(f49085a.l(counterName), counterValue);
        } else {
            a aVar = f49085a;
            aVar.k(aVar.l(counterName), counterValue);
        }
    }

    private final void k(String counterName, int counterValue) throws Throwable {
        try {
            if (traceCounterMethod == null) {
                traceCounterMethod = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = traceCounterMethod;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(traceTagApp), counterName, Integer.valueOf(counterValue));
        } catch (Exception e15) {
            g("traceCounter", e15);
        }
    }

    private final String l(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, CertificateBody.profileType) : str2;
    }
}
