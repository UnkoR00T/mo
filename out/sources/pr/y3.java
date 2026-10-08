package pr;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e*\u00020!2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010%\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010'*\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010**\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010/\u001a\u0004\u0018\u00010\u001e2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100\u001a'\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u001012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0080\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u001ai\u0010E\u001a\u00028\u0001\"\b\b\u0000\u00107*\u000206\"\b\b\u0001\u00109*\u0002082\n\u0010:\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010;\u001a\u00028\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010BH\u0000¢\u0006\u0004\bE\u0010F\"\u001a\u0010K\u001a\u00020G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010H\u001a\u0004\bI\u0010J\"\u0018\u0010P\u001a\u00020M*\u00020L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O\"\u0018\u0010R\u001a\u00020M*\u00020L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010O\"\u001a\u0010V\u001a\u0004\u0018\u00010S*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006W"}, d2 = {"Lvr/e;", "Ljava/lang/Class;", "q", "(Lvr/e;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "Lzs/b;", "kotlinClassId", "", "arrayDimensions", "n", "(Ljava/lang/ClassLoader;Lzs/b;I)Ljava/lang/Class;", "classLoader", "", "packageName", "className", "m", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "f", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lwr/a;", "", "", "e", "(Lwr/a;)Ljava/util/List;", "s", "(Ljava/util/List;)Ljava/util/List;", "Lwr/c;", "p", "(Lwr/c;)Ljava/lang/annotation/Annotation;", "Lft/g;", "", "r", "(Lft/g;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lft/b;", "a", "(Lft/b;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lpr/l1;", "c", "(Ljava/lang/Object;)Lpr/l1;", "Lpr/q2;", "d", "(Ljava/lang/Object;)Lpr/q2;", "Lpr/c0;", "b", "(Ljava/lang/Object;)Lpr/c0;", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Ler/a;)Ljava/lang/Object;", "Lbt/q;", "M", "Lvr/a;", ip.a.f96138c, "moduleAnchor", "proto", "Lws/d;", "nameResolver", "Lws/h;", "typeTable", "Lws/a;", "metadataVersion", "Lkotlin/Function2;", "Lot/l0;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Ler/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lzs/c;", "Lzs/c;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lmr/p;", "", "l", "(Lmr/p;)Z", "isInlineClassType", "k", "needsMultiFieldValueClassFlattening", "Lvr/c1;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zs.c f161998a = new zs.c("kotlin.jvm.JvmStatic");

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161999a;

        static {
            int[] iArr = new int[sr.m.values().length];
            try {
                iArr[sr.m.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sr.m.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sr.m.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sr.m.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sr.m.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[sr.m.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[sr.m.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[sr.m.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f161999a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object a(ft.b bVar, ClassLoader classLoader) {
        st.t0 t0VarE;
        Class clsO;
        ft.a0 a0Var = bVar instanceof ft.a0 ? (ft.a0) bVar : null;
        if (a0Var == null || (t0VarE = a0Var.e()) == null) {
            return null;
        }
        List<? extends ft.g<?>> listB = bVar.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(r((ft.g) it.next(), classLoader));
        }
        sr.m mVarO = sr.j.O(t0VarE);
        int i15 = 0;
        switch (mVarO == null ? -1 : a.f161999a[mVarO.ordinal()]) {
            case -1:
                if (!sr.j.d0(t0VarE)) {
                    throw new IllegalStateException(("Not an array type: " + t0VarE).toString());
                }
                st.t0 type = ((st.d2) pq.v.P0(t0VarE.R0())).getType();
                vr.h hVarC = type.T0().c();
                vr.e eVar = hVarC instanceof vr.e ? (vr.e) hVarC : null;
                if (eVar == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (sr.j.w0(type)) {
                    int size = bVar.b().size();
                    String[] strArr = new String[size];
                    while (i15 < size) {
                        strArr[i15] = arrayList.get(i15);
                        i15++;
                    }
                    return strArr;
                }
                if (sr.j.m0(eVar)) {
                    int size2 = bVar.b().size();
                    Class[] clsArr = new Class[size2];
                    while (i15 < size2) {
                        clsArr[i15] = arrayList.get(i15);
                        i15++;
                    }
                    return clsArr;
                }
                zs.b bVarN = ht.e.n(eVar);
                if (bVarN == null || (clsO = o(classLoader, bVarN, 0, 2, null)) == null) {
                    return null;
                }
                Object[] objArr = (Object[]) Array.newInstance((Class<?>) clsO, bVar.b().size());
                int size3 = arrayList.size();
                while (i15 < size3) {
                    objArr[i15] = arrayList.get(i15);
                    i15++;
                }
                return objArr;
            case 0:
            default:
                throw new oq.p();
            case 1:
                int size4 = bVar.b().size();
                boolean[] zArr = new boolean[size4];
                while (i15 < size4) {
                    zArr[i15] = ((Boolean) arrayList.get(i15)).booleanValue();
                    i15++;
                }
                return zArr;
            case 2:
                int size5 = bVar.b().size();
                char[] cArr = new char[size5];
                while (i15 < size5) {
                    cArr[i15] = ((Character) arrayList.get(i15)).charValue();
                    i15++;
                }
                return cArr;
            case 3:
                int size6 = bVar.b().size();
                byte[] bArr = new byte[size6];
                while (i15 < size6) {
                    bArr[i15] = ((Byte) arrayList.get(i15)).byteValue();
                    i15++;
                }
                return bArr;
            case 4:
                int size7 = bVar.b().size();
                short[] sArr = new short[size7];
                while (i15 < size7) {
                    sArr[i15] = ((Short) arrayList.get(i15)).shortValue();
                    i15++;
                }
                return sArr;
            case 5:
                int size8 = bVar.b().size();
                int[] iArr = new int[size8];
                while (i15 < size8) {
                    iArr[i15] = ((Integer) arrayList.get(i15)).intValue();
                    i15++;
                }
                return iArr;
            case 6:
                int size9 = bVar.b().size();
                float[] fArr = new float[size9];
                while (i15 < size9) {
                    fArr[i15] = ((Float) arrayList.get(i15)).floatValue();
                    i15++;
                }
                return fArr;
            case 7:
                int size10 = bVar.b().size();
                long[] jArr = new long[size10];
                while (i15 < size10) {
                    jArr[i15] = ((Long) arrayList.get(i15)).longValue();
                    i15++;
                }
                return jArr;
            case 8:
                int size11 = bVar.b().size();
                double[] dArr = new double[size11];
                while (i15 < size11) {
                    dArr[i15] = ((Double) arrayList.get(i15)).doubleValue();
                    i15++;
                }
                return dArr;
        }
    }

    public static final c0<?> b(Object obj) {
        c0<?> c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var;
        }
        l1 l1VarC = c(obj);
        return l1VarC != null ? l1VarC : d(obj);
    }

    public static final l1 c(Object obj) {
        l1 l1Var = obj instanceof l1 ? (l1) obj : null;
        if (l1Var != null) {
            return l1Var;
        }
        fr.p pVar = obj instanceof fr.p ? (fr.p) obj : null;
        mr.b bVarC = pVar != null ? pVar.c() : null;
        if (bVarC instanceof l1) {
            return (l1) bVarC;
        }
        return null;
    }

    public static final q2<?> d(Object obj) {
        q2<?> q2Var = obj instanceof q2 ? (q2) obj : null;
        if (q2Var != null) {
            return q2Var;
        }
        fr.k0 k0Var = obj instanceof fr.k0 ? (fr.k0) obj : null;
        mr.b bVarC = k0Var != null ? k0Var.c() : null;
        if (bVarC instanceof q2) {
            return (q2) bVarC;
        }
        return null;
    }

    public static final List<Annotation> e(wr.a aVar) {
        Annotation annotationP;
        wr.h annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (wr.c cVar : annotations) {
            vr.h1 h1VarM = cVar.m();
            if (h1VarM instanceof as.b) {
                annotationP = ((as.b) h1VarM).d();
            } else if (h1VarM instanceof as.l.a) {
                bs.u uVarC = ((as.l.a) h1VarM).c();
                bs.g gVar = uVarC instanceof bs.g ? (bs.g) uVarC : null;
                annotationP = gVar != null ? gVar.T() : null;
            } else {
                annotationP = p(cVar);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return s(arrayList);
    }

    public static final Class<?> f(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object g(Type type) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (fr.t.c(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (fr.t.c(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (fr.t.c(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (fr.t.c(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (fr.t.c(cls, Integer.TYPE)) {
            return 0;
        }
        if (fr.t.c(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (fr.t.c(cls, Long.TYPE)) {
            return 0L;
        }
        if (fr.t.c(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (fr.t.c(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final <M extends bt.q, D extends vr.a> D h(Class<?> cls, M m15, ws.d dVar, ws.h hVar, ws.a aVar, er.p<? super ot.l0, ? super M, ? extends D> pVar) {
        List<us.t> listG1;
        as.k kVarA = k3.a(cls);
        if (m15 instanceof us.j) {
            listG1 = ((us.j) m15).L0();
        } else {
            if (!(m15 instanceof us.o)) {
                throw new IllegalStateException(("Unsupported message: " + m15).toString());
            }
            listG1 = ((us.o) m15).g1();
        }
        return pVar.B(new ot.l0(new ot.p(kVarA.a(), dVar, kVarA.b(), hVar, ws.j.f214769b.b(), aVar, null, null, listG1)), m15);
    }

    public static final vr.c1 i(vr.a aVar) {
        if (aVar.N() != null) {
            return ((vr.e) aVar.b()).P0();
        }
        return null;
    }

    public static final zs.c j() {
        return f161998a;
    }

    public static final boolean k(mr.p pVar) {
        mr.e eVarD = pVar.getClassifier();
        f0 f0Var = eVarD instanceof f0 ? (f0) eVarD : null;
        return (f0Var == null || !f0Var.x() || f0Var.a0()) ? false : true;
    }

    public static final boolean l(mr.p pVar) {
        mr.e eVarD = pVar.getClassifier();
        f0 f0Var = eVarD instanceof f0 ? (f0) eVarD : null;
        return f0Var != null && f0Var.a0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class<?> m(ClassLoader classLoader, String str, String str2, int i15) {
        if (fr.t.c(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb5 = new StringBuilder();
        if (i15 > 0) {
            for (int i16 = 0; i16 < i15; i16++) {
                sb5.append("[");
            }
            sb5.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u);
        }
        if (str.length() > 0) {
            sb5.append(str + '.');
        }
        sb5.append(fu.r.O(str2, '.', '$', false, 4, null));
        if (i15 > 0) {
            sb5.append(";");
        }
        return as.e.a(classLoader, sb5.toString());
    }

    public static final Class<?> n(ClassLoader classLoader, zs.b bVar, int i15) {
        zs.b bVarN = ur.c.f200031a.n(bVar.a().i());
        if (bVarN == null) {
            bVarN = bVar;
        }
        if (!fr.t.c(bVarN, bVar)) {
            classLoader = bs.f.j(oq.i0.class);
        }
        return m(classLoader, bVarN.f().a(), bVarN.g().a(), i15);
    }

    public static /* synthetic */ Class o(ClassLoader classLoader, zs.b bVar, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        return n(classLoader, bVar, i15);
    }

    private static final Annotation p(wr.c cVar) {
        vr.e eVarL = ht.e.l(cVar);
        Class<?> clsQ = eVarL != null ? q(eVarL) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry<zs.f, ft.g<?>>> setEntrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zs.f fVar = (zs.f) entry.getKey();
            Object objR = r((ft.g) entry.getValue(), clsQ.getClassLoader());
            oq.r rVarA = objR != null ? oq.y.a(fVar.e(), objR) : null;
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return (Annotation) qr.f.h(clsQ, pq.v0.s(arrayList), null, 4, null);
    }

    public static final Class<?> q(vr.e eVar) {
        vr.h1 h1VarM = eVar.m();
        if (h1VarM instanceof ss.z) {
            return ((as.f) ((ss.z) h1VarM).d()).e();
        }
        if (h1VarM instanceof as.l.a) {
            return ((bs.q) ((as.l.a) h1VarM).c()).b();
        }
        zs.b bVarN = ht.e.n(eVar);
        if (bVarN == null) {
            return null;
        }
        return o(bs.f.j(eVar.getClass()), bVarN, 0, 2, null);
    }

    private static final Object r(ft.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof ft.a) {
            return p(((ft.a) gVar).b());
        }
        if (gVar instanceof ft.b) {
            return a((ft.b) gVar, classLoader);
        }
        if (gVar instanceof ft.k) {
            oq.r<? extends zs.b, ? extends zs.f> rVarB = ((ft.k) gVar).b();
            zs.b bVarA = rVarB.a();
            zs.f fVarB = rVarB.b();
            Class clsO = o(classLoader, bVarA, 0, 2, null);
            if (clsO != null) {
                return x3.a(clsO, fVarB.e());
            }
            return null;
        }
        if (!(gVar instanceof ft.t)) {
            if ((gVar instanceof ft.l) || (gVar instanceof ft.v)) {
                return null;
            }
            return gVar.b();
        }
        ft.t.b bVarB = ((ft.t) gVar).b();
        if (bVarB instanceof ft.t.b.C1499b) {
            ft.t.b.C1499b c1499b = (ft.t.b.C1499b) bVarB;
            return n(classLoader, c1499b.b(), c1499b.a());
        }
        if (!(bVarB instanceof ft.t.b.a)) {
            throw new oq.p();
        }
        vr.h hVarC = ((ft.t.b.a) bVarB).a().T0().c();
        vr.e eVar = hVarC instanceof vr.e ? (vr.e) hVarC : null;
        if (eVar != null) {
            return q(eVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<? extends java.lang.annotation.Annotation>, java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.Collection] */
    public static final List<Annotation> s(List<? extends Annotation> list) {
        Iterable<Annotation> iterable = (Iterable) list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return list;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (fr.t.c(dr.a.b(dr.a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList<>();
                for (Annotation annotation : iterable) {
                    Class clsB = dr.a.b(dr.a.a(annotation));
                    pq.v.D(list, (!fr.t.c(clsB.getSimpleName(), "Container") || clsB.getAnnotation(fr.s0.class) == null) ? pq.v.e(annotation) : pq.n.f((Annotation[]) clsB.getDeclaredMethod("value", null).invoke(annotation, null)));
                }
                break;
            }
        }
        return list;
    }
}
