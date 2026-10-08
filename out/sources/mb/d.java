package mb;

import android.annotation.SuppressLint;
import android.app.Activity;
import fr.t;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0011\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\bJ[\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001c"}, d2 = {"Lmb/d;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "T", "Lmr/c;", "clazz", "Lkotlin/Function1;", "Loq/i0;", "consumer", "a", "(Lmr/c;Ler/l;)Ljava/lang/Object;", "b", "obj", "", "addMethodName", "removeMethodName", "Landroid/app/Activity;", "activity", "Lmb/d$b;", "c", "(Ljava/lang/Object;Lmr/c;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ler/l;)Lmb/d$b;", "Ljava/lang/ClassLoader;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanUncheckedReflection"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader loader;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0012\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0013\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J2\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000b2\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006\u001e"}, d2 = {"Lmb/d$a;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "Lmr/c;", "clazz", "Lkotlin/Function1;", "Loq/i0;", "consumer", "<init>", "(Lmr/c;Ler/l;)V", "Ljava/lang/reflect/Method;", "", "args", "", "c", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z", "d", "b", "e", "obj", "method", "parameters", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "parameter", "a", "(Ljava/lang/Object;)V", "Lmr/c;", "Ler/l;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a<T> implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final mr.c<T> clazz;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.l<T, i0> consumer;

        /* JADX WARN: Multi-variable type inference failed */
        public a(mr.c<T> cVar, er.l<? super T, i0> lVar) {
            this.clazz = cVar;
            this.consumer = lVar;
        }

        private final boolean b(Method method, Object[] objArr) {
            return t.c(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean c(Method method, Object[] objArr) {
            return t.c(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean d(Method method, Object[] objArr) {
            return t.c(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean e(Method method, Object[] objArr) {
            return t.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        public final void a(T parameter) {
            this.consumer.b(parameter);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] parameters) {
            if (b(method, parameters)) {
                a(mr.d.a(this.clazz, parameters != null ? parameters[0] : null));
                return i0.f148189a;
            }
            if (c(method, parameters)) {
                return Boolean.valueOf(obj == (parameters != null ? parameters[0] : null));
            }
            if (d(method, parameters)) {
                return Integer.valueOf(this.consumer.hashCode());
            }
            if (e(method, parameters)) {
                return this.consumer.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + parameters);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lmb/d$b;", "", "Loq/i0;", "j", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void j();
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"mb/d$c", "Lmb/d$b;", "Loq/i0;", "j", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f125199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f125200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f125201c;

        c(Method method, Object obj, Object obj2) {
            this.f125199a = method;
            this.f125200b = obj;
            this.f125201c = obj2;
        }

        @Override // mb.d.b
        public void j() throws IllegalAccessException, InvocationTargetException {
            this.f125199a.invoke(this.f125200b, this.f125201c);
        }
    }

    public d(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    private final <T> Object a(mr.c<T> clazz, er.l<? super T, i0> consumer) {
        return Proxy.newProxyInstance(this.loader, new Class[]{d()}, new a(clazz, consumer));
    }

    private final Class<?> d() {
        return this.loader.loadClass("java.util.function.Consumer");
    }

    public final Class<?> b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <T> b c(Object obj, mr.c<T> clazz, String addMethodName, String removeMethodName, Activity activity, er.l<? super T, i0> consumer) throws IllegalAccessException, InvocationTargetException {
        Object objA = a(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, d()).invoke(obj, activity, objA);
        return new c(obj.getClass().getMethod(removeMethodName, d()), obj, objA);
    }
}
