package ou;

import p003COn.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/StackTraceElement;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "baseContinuationImplClassName", "c", "stackTraceRecoveryClassName", "Lvq/e;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f150029a = new y0().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f150030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f150031c;

    static {
        Object objB;
        Object objB2;
        try {
            oq.t.Companion companion = oq.t.INSTANCE;
            objB = oq.t.b(vq.a.class.getCanonicalName());
        } catch (Throwable th4) {
            oq.t.Companion companion2 = oq.t.INSTANCE;
            objB = oq.t.b(oq.u.a(th4));
        }
        if (oq.t.d(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f150030b = (String) objB;
        try {
            objB2 = oq.t.b(d0.class.getCanonicalName());
        } catch (Throwable th5) {
            oq.t.Companion companion3 = oq.t.INSTANCE;
            objB2 = oq.t.b(oq.u.a(th5));
        }
        if (oq.t.d(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f150031c = (String) objB2;
    }

    public static final <E extends Throwable> E a(E e15) {
        return e15;
    }
}
