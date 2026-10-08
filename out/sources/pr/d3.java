package pr;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010'\u001a\u0004\u0018\u00010\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b%\u0010&R!\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010-R\u0014\u00101\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u00103R\u0014\u00105\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u00100R\u0014\u00107\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00100R\u0014\u00109\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00100¨\u0006;²\u0006\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050(8\nX\u008a\u0084\u0002"}, d2 = {"Lpr/d3;", "Lpr/a;", "Lst/t0;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "", "isAbbreviation", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Ler/a;Z)V", "(Lorg/jetbrains/kotlin/types/KotlinType;Ler/a;)V", "Lmr/e;", "t", "(Lst/t0;)Lmr/e;", "i", "()Lpr/a;", "j", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lst/t0;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "b", "Z", "Lpr/l3$a;", "c", "Lpr/l3$a;", "d", "()Lmr/e;", "classifier", "", "Lmr/r;", "e", "()Ljava/util/List;", "arguments", "()Ljava/lang/reflect/Type;", "javaType", "f", "()Z", "isMarkedNullable", "Lmr/p;", "()Lmr/p;", "abbreviation", "isDefinitelyNotNullType", "h", "isNothingType", "g", "isMutableCollectionType", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d3 extends pr.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f161781f = {fr.q0.j(new fr.h0(d3.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), fr.q0.j(new fr.h0(d3.class, "arguments", "getArguments()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final st.t0 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isAbbreviation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l3.a<Type> computeJavaType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l3.a classifier;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l3.a arguments;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161787a;

        static {
            int[] iArr = new int[st.p2.values().length];
            try {
                iArr[st.p2.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[st.p2.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[st.p2.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f161787a = iArr;
        }
    }

    public d3(st.t0 t0Var, er.a<? extends Type> aVar, boolean z15) {
        this.type = t0Var;
        this.isAbbreviation = z15;
        l3.a<Type> aVarB = null;
        l3.a<Type> aVar2 = aVar instanceof l3.a ? (l3.a) aVar : null;
        if (aVar2 != null) {
            aVarB = aVar2;
        } else if (aVar != null) {
            aVarB = l3.b(aVar);
        }
        this.computeJavaType = aVarB;
        this.classifier = l3.b(new z2(this));
        this.arguments = l3.b(new a3(this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(d3 d3Var, er.a aVar) {
        mr.r rVarD;
        List<st.d2> listR0 = d3Var.type.R0();
        if (listR0.isEmpty()) {
            return pq.v.n();
        }
        oq.k kVarB = oq.l.b(oq.o.PUBLICATION, new b3(d3Var));
        List<st.d2> list = listR0;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            st.d2 d2Var = (st.d2) obj;
            if (d2Var.b()) {
                rVarD = mr.r.INSTANCE.c();
            } else {
                d3 d3Var2 = new d3(d2Var.getType(), aVar == null ? null : new c3(d3Var, i15, kVarB));
                int i17 = a.f161787a[d2Var.c().ordinal()];
                if (i17 == 1) {
                    rVarD = mr.r.INSTANCE.d(d3Var2);
                } else if (i17 == 2) {
                    rVarD = mr.r.INSTANCE.a(d3Var2);
                } else {
                    if (i17 != 3) {
                        throw new oq.p();
                    }
                    rVarD = mr.r.INSTANCE.b(d3Var2);
                }
            }
            arrayList.add(rVarD);
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(d3 d3Var) {
        return bs.f.h(d3Var.a());
    }

    private static final List<Type> q(oq.k<? extends List<? extends Type>> kVar) {
        return (List) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type r(d3 d3Var, int i15, oq.k<? extends List<? extends Type>> kVar) {
        Type typeA = d3Var.a();
        if (typeA instanceof Class) {
            Class cls = (Class) typeA;
            return cls.isArray() ? cls.getComponentType() : Object.class;
        }
        if (typeA instanceof GenericArrayType) {
            if (i15 == 0) {
                return ((GenericArrayType) typeA).getGenericComponentType();
            }
            throw new i3("Array type has been queried for a non-0th argument: " + d3Var);
        }
        if (!(typeA instanceof ParameterizedType)) {
            throw new i3("Non-generic type has been queried for arguments: " + d3Var);
        }
        Type type = q(kVar).get(i15);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type type2 = (Type) pq.n.p0(wildcardType.getLowerBounds());
        return type2 == null ? (Type) pq.n.n0(wildcardType.getUpperBounds()) : type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr.e s(d3 d3Var) {
        return d3Var.t(d3Var.type);
    }

    private final mr.e t(st.t0 type) {
        st.t0 type2;
        if (this.isAbbreviation) {
            vr.h hVarC = type.T0().c();
            vr.n0.b bVar = hVarC instanceof vr.n0.b ? (vr.n0.b) hVarC : null;
            if (bVar != null) {
                return new y2(ht.e.o(bVar));
            }
        }
        vr.h hVarC2 = type.T0().c();
        if (!(hVarC2 instanceof vr.e)) {
            if (hVarC2 instanceof vr.m1) {
                return new g3(null, (vr.m1) hVarC2);
            }
            return null;
        }
        Class<?> clsQ = y3.q((vr.e) hVarC2);
        if (clsQ == null) {
            return null;
        }
        if (!sr.j.d0(type)) {
            if (st.l2.l(type)) {
                return new f0(clsQ);
            }
            Class<?> clsI = bs.f.i(clsQ);
            if (clsI != null) {
                clsQ = clsI;
            }
            return new f0(clsQ);
        }
        st.d2 d2Var = (st.d2) pq.v.R0(type.R0());
        if (d2Var == null || (type2 = d2Var.getType()) == null) {
            return new f0(clsQ);
        }
        mr.e eVarT = t(xt.d.B(type2));
        if (eVarT != null) {
            return new f0(y3.f(dr.a.b(or.c.a(eVarT))));
        }
        throw new i3("Cannot determine classifier for array element type: " + this);
    }

    @Override // fr.u
    public Type a() {
        l3.a<Type> aVar = this.computeJavaType;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // pr.a
    public mr.p b() {
        st.e1 e1VarB = st.i1.b(this.type);
        if (e1VarB != null) {
            return new d3(e1VarB, this.computeJavaType, true);
        }
        return null;
    }

    @Override // pr.a
    public boolean c() {
        return st.i1.c(this.type);
    }

    @Override // mr.p
    public mr.e d() {
        return (mr.e) this.classifier.e(this, f161781f[0]);
    }

    @Override // mr.p
    public List<mr.r> e() {
        return (List) this.arguments.e(this, f161781f[1]);
    }

    public boolean equals(Object other) {
        if (!(other instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) other;
        return fr.t.c(this.type, d3Var.type) && fr.t.c(d(), d3Var.d()) && fr.t.c(e(), d3Var.e());
    }

    @Override // mr.p
    public boolean f() {
        return this.type.U0();
    }

    @Override // pr.a
    public boolean g() {
        vr.h hVarC = this.type.T0().c();
        vr.e eVar = hVarC instanceof vr.e ? (vr.e) hVarC : null;
        return eVar != null && ur.d.f200051a.c(eVar);
    }

    @Override // pr.a
    public boolean h() {
        return sr.j.p0(this.type);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        mr.e eVarD = d();
        return ((iHashCode + (eVarD != null ? eVarD.hashCode() : 0)) * 31) + e().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pr.a
    public pr.a i() {
        st.o2 o2VarW0 = this.type.W0();
        er.a aVar = null;
        Object[] objArr = 0;
        if (o2VarW0 instanceof st.k0) {
            return new d3(((st.k0) o2VarW0).b1(), aVar, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pr.a
    public pr.a j() {
        st.o2 o2VarW0 = this.type.W0();
        er.a aVar = null;
        Object[] objArr = 0;
        if (o2VarW0 instanceof st.k0) {
            return new d3(((st.k0) o2VarW0).c1(), aVar, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    public String toString() {
        return t3.f161969a.y(this);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final st.t0 getType() {
        return this.type;
    }

    public d3(st.t0 t0Var, er.a<? extends Type> aVar) {
        this(t0Var, aVar, false);
    }

    public /* synthetic */ d3(st.t0 t0Var, er.a aVar, int i15, fr.k kVar) {
        this(t0Var, (i15 & 2) != 0 ? null : aVar);
    }
}
