package pr;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u0001\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00028\u00002\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0017\"\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR.\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u001d*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00070\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fRD\u0010$\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\n \u001d*\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010!j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\"0!j\b\u0012\u0004\u0012\u00020\n`\"0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fRD\u0010&\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\n \u001d*\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010!j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\"0!j\b\u0012\u0004\u0012\u00020\n`\"0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\"\u0010)\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010'0'0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR.\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020* \u001d*\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00070\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001fR2\u0010.\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0011 \u001d*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00170\u00170\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0006\u0012\u0002\b\u0003048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u0001048&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010G\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010FR\u0014\u0010I\u001a\u0002008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010?R\u0014\u0010L\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lpr/c0;", "R", "Lmr/b;", "Lpr/h3;", "<init>", "()V", "Lvr/b;", "", "Lvr/t1;", "(Lvr/b;)Ljava/util/List;", "Lmr/k;", "parameter", "", "Y", "(Lmr/k;)I", "Lmr/p;", "type", "", ip.a.f96137b, "(Lmr/p;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "T", "()Ljava/lang/reflect/Type;", "", "args", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "Lpr/l3$a;", "", "kotlin.jvm.PlatformType", "a", "Lpr/l3$a;", "_annotations", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "_receiverParameters", "c", "_parameters", "Lpr/d3;", "d", "_returnType", "Lpr/g3;", "e", "_typeParameters", "f", "_absentArguments", "Loq/k;", "", "g", "Loq/k;", "parametersNeedMFVCFlattening", "Lqr/h;", "U", "()Lqr/h;", "caller", "W", "defaultCaller", "Lpr/g1;", "V", "()Lpr/g1;", "container", "b0", "()Z", "isBound", "Z", "()Ljava/util/List;", "receiverParameters", "getParameters", "parameters", "()Lmr/p;", "returnType", "a0", "isAnnotationConstructor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c0<R> implements mr.b<R>, h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l3.a<List<Annotation>> _annotations = l3.b(new q(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l3.a<ArrayList<mr.k>> _receiverParameters = l3.b(new t(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l3.a<ArrayList<mr.k>> _parameters = l3.b(new u(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l3.a<d3> _returnType = l3.b(new v(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l3.a<List<g3>> _typeParameters = l3.b(new w(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l3.a<Object[]> _absentArguments = l3.b(new x(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Boolean> parametersNeedMFVCFlattening = oq.l.b(oq.o.PUBLICATION, new y(this));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((mr.k) t15).getName(), ((mr.k) t16).getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List E(c0 c0Var) {
        List<vr.m1> typeParameters = c0Var.d0().getTypeParameters();
        ArrayList arrayList = new ArrayList(pq.v.y(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(new g3(c0Var, (vr.m1) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    private final List<vr.t1> R(vr.b bVar) {
        oq.r rVarA;
        vr.b bVar2 = bVar;
        if (bVar2 instanceof qt.o0) {
            qt.o0 o0Var = (qt.o0) bVar2;
            rVarA = oq.y.a(o0Var.L(), o0Var.k0().r0());
        } else if (bVar2 instanceof qt.n0) {
            qt.n0 n0Var = (qt.n0) bVar2;
            rVarA = oq.y.a(n0Var.L(), n0Var.k0().B0());
        } else if (bVar2 instanceof vr.y0) {
            vr.z0 z0VarZ = ((vr.y0) bVar2).Z();
            qt.n0 n0Var2 = z0VarZ instanceof qt.n0 ? (qt.n0) z0VarZ : null;
            if (n0Var2 != null) {
                rVarA = oq.y.a(n0Var2.L(), n0Var2.k0().B0());
            } else {
                rVarA = null;
            }
        } else {
            rVarA = null;
        }
        if (rVarA == null) {
            return pq.v.n();
        }
        ws.d dVar = (ws.d) rVarA.a();
        List list = (List) rVarA.b();
        List<vr.c1> listB0 = bVar2.B0();
        ArrayList arrayList = new ArrayList(pq.v.y(listB0, 10));
        int i15 = 0;
        for (Object obj : listB0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            vr.c1 c1Var = (vr.c1) obj;
            arrayList.add(new yr.u0(bVar2, null, i15, c1Var.getAnnotations(), zs.f.k(dVar.getString(((us.v) list.get(i15)).Y())), c1Var.getType(), false, false, false, null, c1Var.m()));
            bVar2 = bVar;
            i15 = i16;
        }
        return arrayList;
    }

    private final Object S(mr.p type) {
        Class clsB = dr.a.b(or.c.b(type));
        if (clsB.isArray()) {
            return Array.newInstance(clsB.getComponentType(), 0);
        }
        throw new i3("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type T() {
        Type[] lowerBounds;
        if (u()) {
            Object objZ0 = pq.v.z0(U().a());
            ParameterizedType parameterizedType = objZ0 instanceof ParameterizedType ? (ParameterizedType) objZ0 : null;
            if (fr.t.c(parameterizedType != null ? parameterizedType.getRawType() : null, tq.e.class)) {
                Object objX0 = pq.n.X0(parameterizedType.getActualTypeArguments());
                WildcardType wildcardType = objX0 instanceof WildcardType ? (WildcardType) objX0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) pq.n.n0(lowerBounds);
                }
            }
        }
        return null;
    }

    private final int Y(mr.k parameter) {
        if (!this.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (y3.k(parameter.getType())) {
            return qr.o.n(st.h2.a(((d3) parameter.getType()).getType())).size();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(c0 c0Var) {
        List<mr.k> parameters = c0Var.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (y3.k(((mr.k) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] e(c0 c0Var) {
        int iY;
        List<mr.k> parameters = c0Var.getParameters();
        int size = parameters.size() + (c0Var.u() ? 1 : 0);
        if (c0Var.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            iY = 0;
            for (mr.k kVar : parameters) {
                iY += kVar.getKind() == mr.k.a.VALUE ? c0Var.Y(kVar) : 0;
            }
        } else {
            List<mr.k> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                iY = 0;
            } else {
                Iterator<T> it = list.iterator();
                iY = 0;
                while (it.hasNext()) {
                    if (((mr.k) it.next()).getKind() == mr.k.a.VALUE && (iY = iY + 1) < 0) {
                        pq.v.w();
                    }
                }
            }
        }
        int i15 = (iY + 31) / 32;
        Object[] objArr = new Object[size + i15 + 1];
        for (mr.k kVar2 : parameters) {
            if (kVar2.b() && !y3.l(kVar2.getType())) {
                objArr[kVar2.getIndex()] = y3.g(or.d.f(kVar2.getType()));
            } else if (kVar2.a()) {
                objArr[kVar2.getIndex()] = c0Var.S(kVar2.getType());
            }
        }
        for (int i16 = 0; i16 < i15; i16++) {
            objArr[size + i16] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(c0 c0Var) {
        return y3.e(c0Var.d0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList i(c0 c0Var) {
        vr.b bVarD0 = c0Var.d0();
        ArrayList arrayList = new ArrayList();
        if (!c0Var.b0()) {
            arrayList.addAll(c0Var.Z());
        }
        int size = bVarD0.l().size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new e2(c0Var, arrayList.size(), mr.k.a.VALUE, new r(bVarD0, i15)));
        }
        if (c0Var.a0() && (bVarD0 instanceof ls.a) && arrayList.size() > 1) {
            pq.v.C(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.w0 l(vr.b bVar, int i15) {
        return bVar.l().get(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList m(c0 c0Var) {
        ArrayList arrayList = new ArrayList();
        vr.c1 c1VarI = y3.i(c0Var.d0());
        if (c1VarI != null) {
            arrayList.add(new e2(c0Var, arrayList.size(), mr.k.a.INSTANCE, new z(c1VarI)));
        }
        List<vr.t1> listR = c0Var.R(c0Var.d0());
        int size = listR.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new e2(c0Var, arrayList.size(), mr.k.a.CONTEXT, new a0(listR, i15)));
        }
        vr.c1 c1VarR = c0Var.d0().R();
        if (c1VarR != null) {
            arrayList.add(new e2(c0Var, arrayList.size(), mr.k.a.EXTENSION_RECEIVER, new b0(c1VarR)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.w0 q(vr.c1 c1Var) {
        return c1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.w0 r(List list, int i15) {
        return (vr.w0) list.get(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.w0 s(vr.c1 c1Var) {
        return c1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d3 x(c0 c0Var) {
        return new d3(c0Var.d0().f(), new s(c0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type z(c0 c0Var) {
        Type typeT = c0Var.T();
        return typeT == null ? c0Var.U().getReturnType() : typeT;
    }

    public abstract qr.h<?> U();

    /* JADX INFO: renamed from: V */
    public abstract g1 getContainer();

    public abstract qr.h<?> W();

    /* JADX INFO: renamed from: X */
    public abstract vr.b d0();

    public final List<mr.k> Z() {
        return this._receiverParameters.a();
    }

    protected final boolean a0() {
        return fr.t.c(getName(), "<init>") && getContainer().a().isAnnotation();
    }

    public abstract boolean b0();

    @Override // mr.b
    public mr.p f() {
        return this._returnType.a();
    }

    @Override // mr.b
    public List<mr.k> getParameters() {
        return this._parameters.a();
    }

    @Override // mr.b
    public R v(Object... args) throws nr.a {
        try {
            return (R) U().v(args);
        } catch (IllegalAccessException e15) {
            throw new nr.a(e15);
        }
    }
}
