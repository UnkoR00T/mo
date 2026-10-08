package xq;

import fr.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p071kotlin.Metadata;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lxq/a;", "", "<init>", "()V", "", "cause", "exception", "Loq/i0;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "c", "(Ljava/lang/Throwable;)Ljava/util/List;", "Ljr/c;", "b", "()Ljr/c;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: xq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lxq/a$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class C5891a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5891a f220497a = new C5891a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Method addSuppressed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            int length = methods.length;
            int i15 = 0;
            while (true) {
                method = null;
                if (i15 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i15];
                if (t.c(method2.getName(), "addSuppressed") && t.c(n.Y0(method2.getParameterTypes()), Throwable.class)) {
                    break;
                } else {
                    i15++;
                }
            }
            addSuppressed = method2;
            for (Method method3 : methods) {
                if (t.c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            getSuppressed = method;
        }

        private C5891a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Method method = C5891a.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public jr.c b() {
        return new jr.b();
    }

    public List<Throwable> c(Throwable exception) {
        Object objInvoke;
        List<Throwable> listF;
        Method method = C5891a.getSuppressed;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listF = n.f((Throwable[]) objInvoke)) == null) ? v.n() : listF;
    }
}
