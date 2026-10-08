package qr;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0011\u000fB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lqr/k;", "Lqr/h;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "", "instance", "", "args", "d", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/reflect/Type;", "f", "()Ljava/lang/reflect/Type;", "returnType", "i", "()Ljava/lang/reflect/Method;", "member", "Lqr/k$a;", "Lqr/k$b;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k implements h<Method> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Method unboxMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Type> parameterTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Type returnType;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqr/k$a;", "Lqr/k;", "Lqr/g;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends k implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object boundReceiver;

        public a(Method method, Object obj) {
            super(method, v.n(), null);
            this.boundReceiver = obj;
        }

        @Override // qr.h
        public Object v(Object[] args) {
            e(args);
            return d(this.boundReceiver, args);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqr/k$b;", "Lqr/k;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends k {
        public b(Method method) {
            super(method, v.e(method.getDeclaringClass()), null);
        }

        @Override // qr.h
        public Object v(Object[] args) {
            e(args);
            Object obj = args[0];
            i.Companion companion = i.INSTANCE;
            return d(obj, args.length <= 1 ? new Object[0] : pq.n.v(args, 1, args.length));
        }
    }

    public /* synthetic */ k(Method method, List list, fr.k kVar) {
        this(method, list);
    }

    @Override // qr.h
    public final List<Type> a() {
        return this.parameterTypes;
    }

    @Override // qr.h
    public /* bridge */ boolean c() {
        return h();
    }

    protected final Object d(Object instance, Object[] args) {
        return this.unboxMethod.invoke(instance, Arrays.copyOf(args, args.length));
    }

    public /* bridge */ void e(Object[] objArr) {
        g(objArr);
    }

    @Override // qr.h
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Type getReturnType() {
        return this.returnType;
    }

    public void g(Object[] objArr) {
        if (j.a(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + j.a(this) + " arguments, but " + objArr.length + " were provided.");
    }

    public boolean h() {
        return false;
    }

    @Override // qr.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k(Method method, List<? extends Type> list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        this.returnType = method.getReturnType();
    }
}
