package pr;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000 N*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004OPQRB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0001\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\t0\t038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010?\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000@8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0018\u0010G\u001a\u0006\u0012\u0002\b\u00030D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0002\b\u0003\u0018\u00010D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010K\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010;R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006S"}, d2 = {"Lpr/q2;", "V", "Lpr/c0;", "Lmr/l;", "Lpr/g1;", "container", "", "name", "signature", "Lvr/z0;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(Lpr/g1;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lpr/g1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "boundReceiver", "(Lpr/g1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "h0", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "j0", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "h", "Lpr/g1;", "()Lpr/g1;", "j", "Ljava/lang/String;", "getName", "k", "n0", "l", "Ljava/lang/Object;", "Loq/k;", "Ljava/lang/reflect/Field;", "m", "Loq/k;", "_javaField", "Lpr/l3$a;", "kotlin.jvm.PlatformType", "n", "Lpr/l3$a;", "_descriptor", "i0", "()Ljava/lang/Object;", "b0", "()Z", "isBound", "m0", "()Ljava/lang/reflect/Field;", "javaField", "Lpr/q2$c;", "l0", "()Lpr/q2$c;", "getter", "Lqr/h;", "U", "()Lqr/h;", "caller", "W", "defaultCaller", "u", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "p", "a", "c", "d", "b", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class q2<V> extends c0<V> implements mr.l<V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f161938q = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g1 container;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Object rawBoundReceiver;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Field> _javaField;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l3.a<vr.z0> _descriptor;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lpr/q2$a;", "PropertyType", "ReturnType", "Lpr/c0;", "Lmr/l$a;", "Lmr/g;", "<init>", "()V", "Lpr/q2;", "e0", "()Lpr/q2;", "property", "Lpr/g1;", "V", "()Lpr/g1;", "container", "Lqr/h;", "W", "()Lqr/h;", "defaultCaller", "", "b0", "()Z", "isBound", "u", "isSuspend", "Lvr/y0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a<PropertyType, ReturnType> extends c0<ReturnType> implements mr.g<ReturnType>, mr.l.a<PropertyType> {
        @Override // pr.c0
        /* JADX INFO: renamed from: V */
        public g1 getContainer() {
            return e0().getContainer();
        }

        @Override // pr.c0
        public qr.h<?> W() {
            return null;
        }

        @Override // pr.c0
        public boolean b0() {
            return e0().b0();
        }

        public abstract vr.y0 d0();

        public abstract q2<PropertyType> e0();

        @Override // mr.b
        public boolean u() {
            return d0().u();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lpr/q2$c;", "V", "Lpr/q2$a;", "Lmr/l$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lvr/a1;", "h", "Lpr/l3$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lqr/h;", "j", "Loq/k;", "U", "()Lqr/h;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c<V> extends a<V, V> implements mr.l.b<V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final /* synthetic */ mr.l<Object>[] f161945k = {fr.q0.j(new fr.h0(c.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final l3.a descriptor = l3.b(new r2(this));

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final oq.k caller = oq.l.b(oq.o.PUBLICATION, new s2(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final qr.h h0(c cVar) {
            return v2.b(cVar, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vr.a1 i0(c cVar) {
            vr.a1 a1VarD = cVar.e0().d0().d();
            return a1VarD == null ? dt.h.d(cVar.e0().d0(), wr.h.f214542p0.b()) : a1VarD;
        }

        @Override // pr.c0
        public qr.h<?> U() {
            return (qr.h) this.caller.getValue();
        }

        public boolean equals(Object other) {
            return (other instanceof c) && fr.t.c(e0(), ((c) other).e0());
        }

        @Override // mr.b
        public String getName() {
            return "<get-" + e0().getName() + '>';
        }

        public int hashCode() {
            return e0().hashCode();
        }

        @Override // pr.q2.a
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public vr.a1 d0() {
            return (vr.a1) this.descriptor.e(this, f161945k[0]);
        }

        public String toString() {
            return "getter of " + e0();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"Lpr/q2$d;", "V", "Lpr/q2$a;", "Loq/i0;", "Lmr/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lvr/b1;", "h", "Lpr/l3$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lqr/h;", "j", "Loq/k;", "U", "()Lqr/h;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d<V> extends a<V, oq.i0> implements mr.h.a<V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final /* synthetic */ mr.l<Object>[] f161948k = {fr.q0.j(new fr.h0(d.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final l3.a descriptor = l3.b(new t2(this));

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final oq.k caller = oq.l.b(oq.o.PUBLICATION, new u2(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final qr.h h0(d dVar) {
            return v2.b(dVar, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vr.b1 i0(d dVar) {
            vr.b1 b1VarJ = dVar.e0().d0().j();
            if (b1VarJ != null) {
                return b1VarJ;
            }
            vr.z0 z0VarD0 = dVar.e0().d0();
            wr.h.a aVar = wr.h.f214542p0;
            return dt.h.e(z0VarD0, aVar.b(), aVar.b());
        }

        @Override // pr.c0
        public qr.h<?> U() {
            return (qr.h) this.caller.getValue();
        }

        public boolean equals(Object other) {
            return (other instanceof d) && fr.t.c(e0(), ((d) other).e0());
        }

        @Override // mr.b
        public String getName() {
            return "<set-" + e0().getName() + '>';
        }

        public int hashCode() {
            return e0().hashCode();
        }

        @Override // pr.q2.a
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public vr.b1 d0() {
            return (vr.b1) this.descriptor.e(this, f161948k[0]);
        }

        public String toString() {
            return "setter of " + e0();
        }
    }

    private q2(g1 g1Var, String str, String str2, vr.z0 z0Var, Object obj) {
        this.container = g1Var;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this._javaField = oq.l.b(oq.o.PUBLICATION, new o2(this));
        this._descriptor = l3.c(z0Var, new p2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.z0 d0(q2 q2Var) {
        return q2Var.getContainer().n(q2Var.getName(), q2Var.signature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field e0(q2 q2Var) {
        Class<?> enclosingClass;
        p pVarF = u3.f161976a.f(q2Var.d0());
        if (!(pVarF instanceof p.c)) {
            if (pVarF instanceof p.a) {
                return ((p.a) pVarF).getField();
            }
            if ((pVarF instanceof p.b) || (pVarF instanceof p.d)) {
                return null;
            }
            throw new oq.p();
        }
        p.c cVar = (p.c) pVarF;
        vr.z0 z0VarB = cVar.getDescriptor();
        ys.d.a aVarD = ys.h.d(ys.h.f229107a, cVar.getProto(), cVar.getNameResolver(), cVar.getTypeTable(), false, 8, null);
        if (aVarD == null) {
            return null;
        }
        if (js.o.e(z0VarB) || ys.h.f(cVar.getProto())) {
            enclosingClass = q2Var.getContainer().a().getEnclosingClass();
        } else {
            vr.m mVarB = z0VarB.b();
            enclosingClass = mVarB instanceof vr.e ? y3.q((vr.e) mVarB) : q2Var.getContainer().a();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(aVarD.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // pr.c0
    public qr.h<?> U() {
        return l0().U();
    }

    @Override // pr.c0
    /* JADX INFO: renamed from: V, reason: from getter */
    public g1 getContainer() {
        return this.container;
    }

    @Override // pr.c0
    public qr.h<?> W() {
        return l0().W();
    }

    @Override // pr.c0
    public boolean b0() {
        return this.rawBoundReceiver != fr.f.f66389g;
    }

    public boolean equals(Object other) {
        q2<?> q2VarD = y3.d(other);
        return q2VarD != null && fr.t.c(getContainer(), q2VarD.getContainer()) && fr.t.c(getName(), q2VarD.getName()) && fr.t.c(this.signature, q2VarD.signature) && fr.t.c(this.rawBoundReceiver, q2VarD.rawBoundReceiver);
    }

    @Override // mr.b
    public String getName() {
        return this.name;
    }

    protected final Member h0() {
        if (!d0().F()) {
            return null;
        }
        p pVarF = u3.f161976a.f(d0());
        if (pVarF instanceof p.c) {
            p.c cVar = (p.c) pVarF;
            if (cVar.getSignature().I()) {
                xs.a.c cVarD = cVar.getSignature().D();
                if (!cVarD.D() || !cVarD.C()) {
                    return null;
                }
                return getContainer().m(cVar.getNameResolver().getString(cVarD.B()), cVar.getNameResolver().getString(cVarD.A()));
            }
        }
        return m0();
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    public final Object i0() {
        return qr.o.h(this.rawBoundReceiver, d0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object j0(Member fieldOrMethod, Object receiver1, Object receiver2) throws nr.b {
        try {
            Object obj = f161938q;
            if ((receiver1 == obj || receiver2 == obj) && d0().R() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objI0 = b0() ? i0() : receiver1;
            if (objI0 == obj) {
                objI0 = null;
            }
            if (!b0()) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(or.a.a(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(objI0);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError("delegate field/method " + fieldOrMethod + " neither field nor method");
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                if (objI0 == null) {
                    objI0 = y3.g(((Method) fieldOrMethod).getParameterTypes()[0]);
                }
                return method.invoke(null, objI0);
            }
            if (length == 2) {
                Method method2 = (Method) fieldOrMethod;
                if (receiver1 == null) {
                    receiver1 = y3.g(((Method) fieldOrMethod).getParameterTypes()[1]);
                }
                return method2.invoke(null, objI0, receiver1);
            }
            throw new AssertionError("delegate method " + fieldOrMethod + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e15) {
            throw new nr.b(e15);
        }
    }

    @Override // pr.c0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public vr.z0 d0() {
        return this._descriptor.a();
    }

    public abstract c<V> l0();

    public final Field m0() {
        return this._javaField.getValue();
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public String toString() {
        return t3.f161969a.w(this);
    }

    @Override // mr.b
    public boolean u() {
        return false;
    }

    public q2(g1 g1Var, String str, String str2, Object obj) {
        this(g1Var, str, str2, null, obj);
    }

    public q2(g1 g1Var, vr.z0 z0Var) {
        this(g1Var, z0Var.getName().e(), u3.f161976a.f(z0Var).getString(), z0Var, fr.f.f66389g);
    }
}
