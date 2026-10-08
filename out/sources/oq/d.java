package oq;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"", "", "c", "(Ljava/lang/Throwable;)Ljava/lang/String;", "exception", "Loq/i0;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "b", "(Ljava/lang/Throwable;)Ljava/util/List;", "getSuppressedExceptions$annotations", "(Ljava/lang/Throwable;)V", "suppressedExceptions", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
public class d {
    public static void a(Throwable th4, Throwable th5) throws IllegalAccessException, InvocationTargetException {
        if (th4 != th5) {
            xq.b.f220500a.a(th4, th5);
        }
    }

    public static List<Throwable> b(Throwable th4) {
        return xq.b.f220500a.c(th4);
    }

    public static String c(Throwable th4) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th4.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
