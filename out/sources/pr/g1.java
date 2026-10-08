package pr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 K2\u00020\u0001:\u0004LMNKB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00152\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00112\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b,\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020!H&¢\u0006\u0004\b.\u0010/J)\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040'2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0004¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=J'\u0010?\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bC\u0010BR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0'8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006O"}, d2 = {"Lpr/g1;", "Lfr/h;", "<init>", "()V", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "F", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "J", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "I", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", "valueParameters", "isConstructor", "Loq/i0;", "g", "(Ljava/util/List;Ljava/util/List;Z)V", "desc", "parseReturnType", "Lpr/g1$c;", "G", "(Ljava/lang/String;Z)Lpr/g1$c;", "", "begin", "end", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/lang/String;II)Ljava/lang/Class;", "Lzs/f;", "", "Lvr/z0;", "E", "(Lzs/f;)Ljava/util/Collection;", "Lvr/z;", "t", "index", "u", "(I)Lvr/z0;", "Llt/k;", "scope", "Lpr/g1$d;", "belonginess", "Lpr/c0;", "v", "(Llt/k;Lpr/g1$d;)Ljava/util/Collection;", "signature", "n", "(Ljava/lang/String;Ljava/lang/String;)Lvr/z0;", "k", "(Ljava/lang/String;Ljava/lang/String;)Lvr/z;", "m", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "j", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "h", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "i", "w", "()Ljava/lang/Class;", "methodOwner", "Lvr/l;", "s", "()Ljava/util/Collection;", "constructorDescriptors", "a", "b", "d", "c", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g1 implements fr.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f161834b = fr.k.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final fu.o f161835c = new fu.o("<v#(\\d+)>");

    /* JADX INFO: renamed from: pr.g1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpr/g1$a;", "", "<init>", "()V", "Lfu/o;", "LOCAL_PROPERTY_SIGNATURE", "Lfu/o;", "a", "()Lfu/o;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final fu.o a() {
            return g1.f161835c;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpr/g1$b;", "", "<init>", "(Lpr/g1;)V", "Las/k;", "a", "Lpr/l3$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ mr.l<Object>[] f161836c = {fr.q0.j(new fr.h0(b.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l3.a moduleData;

        public b() {
            this.moduleData = l3.b(new h1(g1.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final as.k c(g1 g1Var) {
            return k3.a(g1Var.a());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final as.k b() {
            return (as.k) this.moduleData.e(this, f161836c[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lpr/g1$c;", "", "", "Ljava/lang/Class;", "parameters", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Class;", "()Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<Class<?>> parameters;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<?> returnType;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Class<?>> list, Class<?> cls) {
            this.parameters = list;
            this.returnType = cls;
        }

        public final List<Class<?>> a() {
            return this.parameters;
        }

        public final Class<?> b() {
            return this.returnType;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lpr/g1$d;", "", "<init>", "(Ljava/lang/String;I)V", "Lvr/b;", "member", "", "e", "(Lvr/b;)Z", "a", "b", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    protected enum d {
        DECLARED,
        INHERITED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f161844d = wq.b.a(b());

        public final boolean e(vr.b member) {
            return member.k().b() == (this == DECLARED);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"pr/g1$e", "Lpr/k;", "Lvr/l;", "descriptor", "Loq/i0;", "data", "Lpr/c0;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Loq/i0;)Lpr/c0;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends k {
        e(g1 g1Var) {
            super(g1Var);
        }

        @Override // yr.o, vr.o
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public c0<?> i(vr.l lVar, oq.i0 i0Var) {
            throw new IllegalStateException("No constructors should appear here: " + lVar);
        }
    }

    private final Method F(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z15) {
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z16;
        if (z15) {
            clsArr[0] = cls;
        }
        Method methodJ = J(cls, str, clsArr, cls2);
        if (methodJ != null) {
            return methodJ;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodF = F(superclass, str, clsArr, cls2, z15);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z16 = z15;
            if (methodF != null) {
                return methodF;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z16 = z15;
        }
        for (Class<?> cls4 : cls.getInterfaces()) {
            Method methodF2 = F(cls4, str2, clsArr2, cls3, z16);
            if (methodF2 != null) {
                return methodF2;
            }
            if (z16) {
                Class<?> clsA = as.e.a(bs.f.j(cls4), cls4.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr2[0] = cls4;
                    Method methodJ2 = J(clsA, str2, clsArr2, cls3);
                    if (methodJ2 != null) {
                        return methodJ2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c G(String desc, boolean parseReturnType) {
        String str;
        int iQ0;
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        while (true) {
            if (desc.charAt(i15) == ')') {
                String str2 = desc;
                return new c(arrayList, parseReturnType ? H(str2, i15 + 1, str2.length()) : null);
            }
            int i16 = i15;
            while (desc.charAt(i16) == '[') {
                i16++;
            }
            char cCharAt = desc.charAt(i16);
            if (fu.r.c0("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i17 = i16 + 1;
                str = desc;
                iQ0 = i17;
            } else {
                if (cCharAt != 'L') {
                    throw new i3("Unknown type prefix in the method signature: " + desc);
                }
                str = desc;
                iQ0 = fu.r.q0(str, ';', i15, false, 4, null) + 1;
            }
            arrayList.add(H(str, i15, iQ0));
            i15 = iQ0;
            desc = str;
        }
    }

    private final Class<?> H(String desc, int begin, int end) {
        char cCharAt = desc.charAt(begin);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            return bs.f.j(a()).loadClass(fu.r.O(desc.substring(begin + 1, end - 1), '/', '.', false, 4, null));
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            return Void.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return y3.f(H(desc, begin + 1, end));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return Character.TYPE;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return Double.TYPE;
            default:
                throw new i3("Unknown type prefix in the method signature: " + desc);
        }
    }

    private final Constructor<?> I(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method J(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (fr.t.c(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            for (Method method : cls.getDeclaredMethods()) {
                if (fr.t.c(method.getName(), str) && fr.t.c(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    private final void g(List<Class<?>> result, List<? extends Class<?>> valueParameters, boolean isConstructor) {
        if (fr.t.c(pq.v.z0(valueParameters), f161834b)) {
            valueParameters = valueParameters.subList(0, valueParameters.size() - 1);
        }
        result.addAll(valueParameters);
        int size = (valueParameters.size() + 31) / 32;
        for (int i15 = 0; i15 < size; i15++) {
            result.add(Integer.TYPE);
        }
        result.add(isConstructor ? f161834b : Object.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(vr.z zVar) {
        return ct.n.f37669k.M(zVar) + " | " + u3.f161976a.g(zVar).get_signature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(vr.u uVar, vr.u uVar2) {
        Integer numD = vr.t.d(uVar, uVar2);
        if (numD != null) {
            return numD.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(er.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.B(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r(vr.z0 z0Var) {
        return ct.n.f37669k.M(z0Var) + " | " + u3.f161976a.f(z0Var).getString();
    }

    public abstract Collection<vr.z0> E(zs.f name);

    public final Constructor<?> h(String desc) {
        return I(a(), G(desc, false).a());
    }

    public final Constructor<?> i(String desc) {
        Class<?> clsA = a();
        ArrayList arrayList = new ArrayList();
        g(arrayList, G(desc, false).a(), true);
        oq.i0 i0Var = oq.i0.f148189a;
        return I(clsA, arrayList);
    }

    public final Method j(String name, String desc, boolean isMember) {
        if (fr.t.c(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(a());
        }
        c cVarG = G(desc, true);
        g(arrayList, cVarG.a(), false);
        return F(w(), name + "$default", (Class[]) arrayList.toArray(new Class[0]), cVarG.b(), isMember);
    }

    public final vr.z k(String name, String signature) {
        List listT;
        ArrayList arrayList;
        String strA;
        if (fr.t.c(name, "<init>")) {
            listT = pq.v.f1(s());
            arrayList = new ArrayList();
            for (Object obj : listT) {
                vr.l lVar = (vr.l) obj;
                if (lVar.h0() && dt.k.d(lVar.b())) {
                    String strA2 = u3.f161976a.g(lVar).get_signature();
                    if (!fu.r.V(strA2, "constructor-impl", false, 2, null) || !fu.r.F(strA2, ")V", false, 2, null)) {
                        throw new IllegalArgumentException(("Invalid signature of " + lVar + ": " + strA2).toString());
                    }
                    strA = fu.r.O0(strA2, "V") + qr.o.u(lVar.b());
                } else {
                    strA = u3.f161976a.g(lVar).get_signature();
                }
                if (fr.t.c(strA, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            listT = t(zs.f.l(name));
            arrayList = new ArrayList();
            for (Object obj2 : listT) {
                if (fr.t.c(u3.f161976a.g((vr.z) obj2).get_signature(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (vr.z) pq.v.P0(arrayList);
        }
        String strV0 = pq.v.v0(listT, "\n", null, null, 0, null, f1.f161827a, 30, null);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Function '");
        sb5.append(name);
        sb5.append("' (JVM signature: ");
        sb5.append(signature);
        sb5.append(") not resolved in ");
        sb5.append(this);
        sb5.append(':');
        sb5.append(strV0.length() == 0 ? " no members found" : '\n' + strV0);
        throw new i3(sb5.toString());
    }

    public final Method m(String name, String desc) {
        Method methodF;
        if (fr.t.c(name, "<init>")) {
            return null;
        }
        c cVarG = G(desc, true);
        Class<?>[] clsArr = (Class[]) cVarG.a().toArray(new Class[0]);
        Class<?> clsB = cVarG.b();
        Method methodF2 = F(w(), name, clsArr, clsB, false);
        if (methodF2 != null) {
            return methodF2;
        }
        if (!w().isInterface() || (methodF = F(Object.class, name, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodF;
    }

    public final vr.z0 n(String name, String signature) {
        fu.l lVarE = f161835c.e(signature);
        if (lVarE != null) {
            String str = lVarE.c().getMatch().d().get(1);
            vr.z0 z0VarU = u(Integer.parseInt(str));
            if (z0VarU != null) {
                return z0VarU;
            }
            throw new i3("Local property #" + str + " not found in " + a());
        }
        Collection<vr.z0> collectionE = E(zs.f.l(name));
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionE) {
            if (fr.t.c(u3.f161976a.f((vr.z0) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new i3("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (vr.z0) pq.v.P0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            vr.u uVarH = ((vr.z0) obj2).h();
            Object arrayList2 = linkedHashMap.get(uVarH);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(uVarH, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        List list = (List) pq.v.w0(pq.v0.h(linkedHashMap, new d1(c1.f161772a)).values());
        if (list.size() == 1) {
            return (vr.z0) pq.v.l0(list);
        }
        String strV0 = pq.v.v0(E(zs.f.l(name)), "\n", null, null, 0, null, e1.f161790a, 30, null);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Property '");
        sb5.append(name);
        sb5.append("' (JVM signature: ");
        sb5.append(signature);
        sb5.append(") not resolved in ");
        sb5.append(this);
        sb5.append(':');
        sb5.append(strV0.length() == 0 ? " no members found" : '\n' + strV0);
        throw new i3(sb5.toString());
    }

    public abstract Collection<vr.l> s();

    public abstract Collection<vr.z> t(zs.f name);

    public abstract vr.z0 u(int index);

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    protected final Collection<c0<?>> v(lt.k scope, d belonginess) {
        c0 c0Var;
        e eVar = new e(this);
        Collection<vr.m> collectionA = lt.n.a.a(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (vr.m mVar : collectionA) {
            if (mVar instanceof vr.b) {
                vr.b bVar = (vr.b) mVar;
                if (fr.t.c(bVar.h(), vr.t.f208083h) || !belonginess.e(bVar)) {
                    c0Var = null;
                } else {
                    c0Var = (c0) mVar.z0(eVar, oq.i0.f148189a);
                }
            } else {
                c0Var = null;
            }
            if (c0Var != null) {
                arrayList.add(c0Var);
            }
        }
        return pq.v.f1(arrayList);
    }

    protected Class<?> w() {
        Class<?> clsK = bs.f.k(a());
        return clsK == null ? a() : clsK;
    }
}
