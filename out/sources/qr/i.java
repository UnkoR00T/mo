package qr;

import fr.t;
import fr.u0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u0010*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0010\u0019\u0014\u0012\"\u0017#\u001eB5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 \u0082\u0001\u0007$%&'()*¨\u0006+"}, d2 = {"Lqr/i;", "Ljava/lang/reflect/Member;", "M", "Lqr/h;", "member", "Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "instanceClass", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "", "obj", "Loq/i0;", "e", "(Ljava/lang/Object;)V", "a", "Ljava/lang/reflect/Member;", "b", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Type;", "f", "()Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "i", "()Ljava/lang/Class;", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "h", "g", "Lqr/i$a;", "Lqr/i$b;", "Lqr/i$c;", "Lqr/i$e;", "Lqr/i$f;", "Lqr/i$g;", "Lqr/i$h;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i<M extends Member> implements qr.h<M> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final M member;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Type returnType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Class<?> instanceClass;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Type> parameterTypes;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqr/i$a;", "Lqr/i;", "Ljava/lang/reflect/Constructor;", "Lqr/g;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends i<Constructor<?>> implements qr.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor<?> constructor, Object obj) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : pq.n.v(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.boundReceiver = obj;
        }

        @Override // qr.h
        public Object v(Object[] args) {
            d(args);
            Constructor<?> constructorB = b();
            u0 u0Var = new u0(3);
            u0Var.a(this.boundReceiver);
            u0Var.b(args);
            u0Var.a(null);
            return constructorB.newInstance(u0Var.d(new Object[u0Var.c()]));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqr/i$b;", "Lqr/i;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends i<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor<?> constructor) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : pq.n.v(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // qr.h
        public Object v(Object[] args) {
            d(args);
            Constructor<?> constructorB = b();
            u0 u0Var = new u0(2);
            u0Var.b(args);
            u0Var.a(null);
            return constructorB.newInstance(u0Var.d(new Object[u0Var.c()]));
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqr/i$c;", "Lqr/g;", "Lqr/i;", "Ljava/lang/reflect/Constructor;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends i<Constructor<?>> implements qr.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Object boundReceiver;

        public c(Constructor<?> constructor, Object obj) {
            super(constructor, constructor.getDeclaringClass(), null, constructor.getGenericParameterTypes(), null);
            this.boundReceiver = obj;
        }

        @Override // qr.h
        public Object v(Object[] args) {
            d(args);
            Constructor<?> constructorB = b();
            u0 u0Var = new u0(2);
            u0Var.a(this.boundReceiver);
            u0Var.b(args);
            return constructorB.newInstance(u0Var.d(new Object[u0Var.c()]));
        }
    }

    /* JADX INFO: renamed from: qr.i$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lqr/i$d;", "", "<init>", "()V", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropLast", "dropFirstAndLast", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqr/i$e;", "Lqr/i;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends i<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor<?> constructor) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            super(constructor, declaringClass, (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3, constructor.getGenericParameterTypes(), null);
        }

        @Override // qr.h
        public Object v(Object[] args) {
            d(args);
            return b().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lqr/i$f;", "Lqr/i;", "Ljava/lang/reflect/Field;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "e", "c", "d", "a", "b", "Lqr/i$f$a;", "Lqr/i$f$b;", "Lqr/i$f$c;", "Lqr/i$f$d;", "Lqr/i$f$e;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class f extends i<Field> {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqr/i$f$a;", "Lqr/g;", "Lqr/i$f;", "Ljava/lang/reflect/Field;", "field", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends f implements qr.g {

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final Object boundReceiver;

            public a(Field field, Object obj) {
                super(field, false, null);
                this.boundReceiver = obj;
            }

            @Override // qr.i.f, qr.h
            public Object v(Object[] args) {
                d(args);
                return b().get(this.boundReceiver);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqr/i$f$b;", "Lqr/g;", "Lqr/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends f implements qr.g {
            public b(Field field) {
                super(field, false, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqr/i$f$c;", "Lqr/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends f {
            public c(Field field) {
                super(field, true, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqr/i$f$d;", "Lqr/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "args", "Loq/i0;", "d", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends f {
            public d(Field field) {
                super(field, true, null);
            }

            @Override // qr.i
            public void d(Object[] args) {
                super.d(args);
                e(pq.n.p0(args));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqr/i$f$e;", "Lqr/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e extends f {
            public e(Field field) {
                super(field, false, null);
            }
        }

        public /* synthetic */ f(Field field, boolean z15, fr.k kVar) {
            this(field, z15);
        }

        @Override // qr.h
        public Object v(Object[] args) {
            d(args);
            return b().get(i() != null ? pq.n.n0(args) : null);
        }

        private f(Field field, boolean z15) {
            super(field, field.getGenericType(), z15 ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\f\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lqr/i$g;", "Lqr/i;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "", "args", "Loq/i0;", "d", "([Ljava/lang/Object;)V", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Z", "e", "c", "a", "b", "Lqr/i$g$a;", "Lqr/i$g$b;", "Lqr/i$g$c;", "Lqr/i$g$d;", "Lqr/i$g$e;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class g extends i<Field> {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean notNull;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lqr/i$g$a;", "Lqr/g;", "Lqr/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends g implements qr.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Object boundReceiver;

            public a(Field field, boolean z15, Object obj) {
                super(field, z15, false, null);
                this.boundReceiver = obj;
            }

            @Override // qr.i.g, qr.h
            public Object v(Object[] args) throws IllegalAccessException {
                d(args);
                b().set(this.boundReceiver, pq.n.n0(args));
                return i0.f148189a;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqr/i$g$b;", "Lqr/g;", "Lqr/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends g implements qr.g {
            public b(Field field, boolean z15) {
                super(field, z15, false, null);
            }

            @Override // qr.i.g, qr.h
            public Object v(Object[] args) throws IllegalAccessException {
                d(args);
                b().set(null, pq.n.M0(args));
                return i0.f148189a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqr/i$g$c;", "Lqr/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends g {
            public c(Field field, boolean z15) {
                super(field, z15, true, null);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqr/i$g$d;", "Lqr/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "Loq/i0;", "d", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends g {
            public d(Field field, boolean z15) {
                super(field, z15, true, null);
            }

            @Override // qr.i.g, qr.i
            public void d(Object[] args) {
                super.d(args);
                e(pq.n.p0(args));
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqr/i$g$e;", "Lqr/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e extends g {
            public e(Field field, boolean z15) {
                super(field, z15, false, null);
            }
        }

        public /* synthetic */ g(Field field, boolean z15, boolean z16, fr.k kVar) {
            this(field, z15, z16);
        }

        @Override // qr.i
        public void d(Object[] args) {
            super.d(args);
            if (this.notNull && pq.n.M0(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // qr.h
        public Object v(Object[] args) throws IllegalAccessException {
            d(args);
            b().set(i() != null ? pq.n.n0(args) : null, pq.n.M0(args));
            return i0.f148189a;
        }

        private g(Field field, boolean z15, boolean z16) {
            super(field, Void.TYPE, z16 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.notNull = z15;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0013\u0014\u0010\u0015\u0016\u0017\u0018B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lqr/i$h;", "Lqr/i;", "Ljava/lang/reflect/Method;", "method", "", "requiresInstance", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "", "instance", "args", "j", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "f", "Z", "isVoidMethod", "g", "e", "c", "d", "a", "b", "Lqr/i$h$a;", "Lqr/i$h$b;", "Lqr/i$h$c;", "Lqr/i$h$d;", "Lqr/i$h$e;", "Lqr/i$h$f;", "Lqr/i$h$g;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class h extends i<Method> {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isVoidMethod;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqr/i$h$a;", "Lqr/g;", "Lqr/i$h;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends h implements qr.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Object boundReceiver;

            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                this.boundReceiver = obj;
            }

            @Override // qr.h
            public Object v(Object[] args) {
                d(args);
                return j(this.boundReceiver, args);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqr/i$h$b;", "Lqr/g;", "Lqr/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends h implements qr.g {
            public b(Method method) {
                super(method, false, null, 4, null);
            }

            @Override // qr.h
            public Object v(Object[] args) {
                d(args);
                return j(null, args);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lqr/i$h$c;", "Lqr/g;", "Lqr/i$h;", "Ljava/lang/reflect/Method;", "method", "", "isCallByToValueClassMangledMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V", "", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Z", "l", "()Z", "h", "Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends h implements qr.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final boolean isCallByToValueClassMangledMethod;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final Object boundReceiver;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, boolean z15, Object obj) {
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : pq.n.v(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.isCallByToValueClassMangledMethod = z15;
                this.boundReceiver = obj;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Object getBoundReceiver() {
                return this.boundReceiver;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getIsCallByToValueClassMangledMethod() {
                return this.isCallByToValueClassMangledMethod;
            }

            @Override // qr.h
            public Object v(Object[] args) {
                d(args);
                u0 u0Var = new u0(2);
                u0Var.a(this.boundReceiver);
                u0Var.b(args);
                return j(null, u0Var.d(new Object[u0Var.c()]));
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lqr/i$h$d;", "Lqr/g;", "Lqr/i$h;", "Ljava/lang/reflect/Method;", "method", "", "", "boundReceiverComponents", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "[Ljava/lang/Object;", "k", "()[Ljava/lang/Object;", "", "l", "()I", "receiverComponentsCount", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends h implements qr.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Object[] boundReceiverComponents;

            public d(Method method, Object[] objArr) {
                super(method, false, (Type[]) pq.n.j0(method.getGenericParameterTypes(), objArr.length).toArray(new Type[0]), null);
                this.boundReceiverComponents = objArr;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Object[] getBoundReceiverComponents() {
                return this.boundReceiverComponents;
            }

            public final int l() {
                return this.boundReceiverComponents.length;
            }

            @Override // qr.h
            public Object v(Object[] args) {
                d(args);
                u0 u0Var = new u0(2);
                u0Var.b(this.boundReceiverComponents);
                u0Var.b(args);
                return j(null, u0Var.d(new Object[u0Var.c()]));
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqr/i$h$e;", "Lqr/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e extends h {
            public e(Method method) {
                super(method, false, null, 6, null);
            }

            @Override // qr.h
            public Object v(Object[] args) {
                d(args);
                return j(args[0], args.length <= 1 ? new Object[0] : pq.n.v(args, 1, args.length));
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqr/i$h$f;", "Lqr/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class f extends h {
            public f(Method method) {
                super(method, true, null, 4, null);
            }

            @Override // qr.h
            public Object v(Object[] args) {
                d(args);
                e(pq.n.p0(args));
                return j(null, args.length <= 1 ? new Object[0] : pq.n.v(args, 1, args.length));
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqr/i$h$g;", "Lqr/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class g extends h {
            public g(Method method) {
                super(method, false, null, 6, null);
            }

            @Override // qr.h
            public Object v(Object[] args) {
                d(args);
                return j(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z15, Type[] typeArr, fr.k kVar) {
            this(method, z15, typeArr);
        }

        protected final Object j(Object instance, Object[] args) {
            return this.isVoidMethod ? i0.f148189a : b().invoke(instance, Arrays.copyOf(args, args.length));
        }

        public /* synthetic */ h(Method method, boolean z15, Type[] typeArr, int i15, fr.k kVar) {
            this(method, (i15 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z15, (i15 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        private h(Method method, boolean z15, Type[] typeArr) {
            super(method, method.getGenericReturnType(), z15 ? method.getDeclaringClass() : null, typeArr, null);
            this.isVoidMethod = t.c(getReturnType(), Void.TYPE);
        }
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, fr.k kVar) {
        this(member, type, cls, typeArr);
    }

    @Override // qr.h
    public List<Type> a() {
        return this.parameterTypes;
    }

    @Override // qr.h
    public final M b() {
        return this.member;
    }

    @Override // qr.h
    public /* bridge */ boolean c() {
        return h();
    }

    public /* bridge */ void d(Object[] objArr) {
        g(objArr);
    }

    protected final void e(Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
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

    public final Class<?> i() {
        return this.instanceClass;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    private i(M m15, Type type, Class<?> cls, Type[] typeArr) {
        List<Type> listN1;
        this.member = m15;
        this.returnType = type;
        this.instanceClass = cls;
        if (cls != null) {
            u0 u0Var = new u0(2);
            u0Var.a(cls);
            u0Var.b(typeArr);
            listN1 = v.q(u0Var.d(new Type[u0Var.c()]));
            listN1 = listN1 == null ? pq.n.n1(typeArr) : listN1;
        }
        this.parameterTypes = listN1;
    }
}
