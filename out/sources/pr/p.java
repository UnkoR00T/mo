package pr;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0007\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lpr/p;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "c", "b", "d", "Lpr/p$a;", "Lpr/p$b;", "Lpr/p$c;", "Lpr/p$d;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class p {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpr/p$a;", "Lpr/p;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Field field;

        public a(Field field) {
            super(null);
            this.field = field;
        }

        @Override // pr.p
        /* JADX INFO: renamed from: a */
        public String getString() {
            return js.i0.b(this.field.getName()) + "()" + bs.f.f(this.field.getType());
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Field getField() {
            return this.field;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lpr/p$b;", "Lpr/p;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "c", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method getterMethod;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method setterMethod;

        public b(Method method, Method method2) {
            super(null);
            this.getterMethod = method;
            this.setterMethod = method2;
        }

        @Override // pr.p
        /* JADX INFO: renamed from: a */
        public String getString() {
            return w3.d(this.getterMethod);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lpr/p$c;", "Lpr/p;", "Lvr/z0;", "descriptor", "Lus/o;", "proto", "Lxs/a$d;", "signature", "Lws/d;", "nameResolver", "Lws/h;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "c", "()Ljava/lang/String;", "a", "Lvr/z0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "b", "Lus/o;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "Lxs/a$d;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "d", "Lws/d;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "e", "Lws/h;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "f", "Ljava/lang/String;", "string", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final vr.z0 descriptor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final us.o proto;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final xs.a.d signature;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ws.d nameResolver;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final ws.h typeTable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String string;

        public c(vr.z0 z0Var, us.o oVar, xs.a.d dVar, ws.d dVar2, ws.h hVar) {
            String str;
            super(null);
            this.descriptor = z0Var;
            this.proto = oVar;
            this.signature = dVar;
            this.nameResolver = dVar2;
            this.typeTable = hVar;
            if (dVar.K()) {
                str = dVar2.getString(dVar.F().B()) + dVar2.getString(dVar.F().A());
            } else {
                ys.d.a aVarD = ys.h.d(ys.h.f229107a, oVar, dVar2, hVar, false, 8, null);
                if (aVarD == null) {
                    throw new i3("No field signature for property: " + z0Var);
                }
                String strB = aVarD.b();
                str = js.i0.b(strB) + c() + "()" + aVarD.c();
            }
            this.string = str;
        }

        private final String c() {
            String string;
            vr.m mVarB = this.descriptor.b();
            if (fr.t.c(this.descriptor.h(), vr.t.f208079d) && (mVarB instanceof qt.m)) {
                Integer num = (Integer) ws.f.a(((qt.m) mVarB).k1(), xs.a.f220671i);
                if (num == null || (string = this.nameResolver.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + zs.g.b(string);
            }
            if (!fr.t.c(this.descriptor.h(), vr.t.f208076a) || !(mVarB instanceof vr.o0)) {
                return "";
            }
            qt.s sVarM = ((qt.n0) this.descriptor).M();
            if (!(sVarM instanceof ss.r)) {
                return "";
            }
            ss.r rVar = (ss.r) sVarM;
            if (rVar.f() == null) {
                return "";
            }
            return '$' + rVar.h().e();
        }

        @Override // pr.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getString() {
            return this.string;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final vr.z0 getDescriptor() {
            return this.descriptor;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ws.d getNameResolver() {
            return this.nameResolver;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final us.o getProto() {
            return this.proto;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final xs.a.d getSignature() {
            return this.signature;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ws.h getTypeTable() {
            return this.typeTable;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lpr/p$d;", "Lpr/p;", "Lpr/n$e;", "getterSignature", "setterSignature", "<init>", "(Lpr/n$e;Lpr/n$e;)V", "", "a", "()Ljava/lang/String;", "Lpr/n$e;", "b", "()Lpr/n$e;", "c", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n.e getterSignature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final n.e setterSignature;

        public d(n.e eVar, n.e eVar2) {
            super(null);
            this.getterSignature = eVar;
            this.setterSignature = eVar2;
        }

        @Override // pr.p
        /* JADX INFO: renamed from: a */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n.e getGetterSignature() {
            return this.getterSignature;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final n.e getSetterSignature() {
            return this.setterSignature;
        }
    }

    public /* synthetic */ p(fr.k kVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getString();

    private p() {
    }
}
