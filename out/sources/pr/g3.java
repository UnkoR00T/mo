package pr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0004\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lpr/g3;", "Lmr/q;", "Lpr/b1;", "Lpr/h3;", "container", "Lvr/m1;", "descriptor", "<init>", "(Lpr/h3;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "Lvr/e;", "Lpr/f0;", "g", "(Lvr/e;)Lpr/f0;", "Lqt/t;", "Ljava/lang/Class;", "e", "(Lqt/t;)Ljava/lang/Class;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lvr/m1;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "", "Lmr/p;", "b", "Lpr/l3$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "c", "d", "()Lpr/h3;", "getName", "name", "Lmr/s;", "q", "()Lmr/s;", "variance", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g3 implements mr.q, b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f161846d = {fr.q0.j(new fr.h0(g3.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(g3.class, "container", "getContainer()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vr.m1 descriptor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l3.a upperBounds = l3.b(new e3(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l3.a container;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161850a;

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
            f161850a = iArr;
        }
    }

    public g3(h3 h3Var, vr.m1 m1Var) {
        this.descriptor = m1Var;
        this.container = l3.b(new f3(h3Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h3 c(h3 h3Var, g3 g3Var) {
        f0<?> f0VarG;
        Object objZ0;
        if (h3Var != null) {
            return h3Var;
        }
        vr.m mVarB = g3Var.getDescriptor().b();
        if (mVarB instanceof vr.e) {
            objZ0 = g3Var.g((vr.e) mVarB);
        } else {
            if (!(mVarB instanceof vr.b)) {
                throw new i3("Unknown type parameter container: " + mVarB);
            }
            vr.m mVarB2 = ((vr.b) mVarB).b();
            if (mVarB2 instanceof vr.e) {
                f0VarG = g3Var.g((vr.e) mVarB2);
            } else {
                qt.t tVar = mVarB instanceof qt.t ? (qt.t) mVarB : null;
                if (tVar == null) {
                    throw new i3("Non-class callable descriptor must be deserialized: " + mVarB);
                }
                f0VarG = (f0) dr.a.e(g3Var.e(tVar));
            }
            objZ0 = mVarB.z0(new k(f0VarG), oq.i0.f148189a);
        }
        return (h3) objZ0;
    }

    private final h3 d() {
        return (h3) this.container.e(this, f161846d[1]);
    }

    private final Class<?> e(qt.t tVar) {
        Class<?> clsE;
        qt.s sVarM = tVar.M();
        ss.r rVar = sVarM instanceof ss.r ? (ss.r) sVarM : null;
        ss.x xVarG = rVar != null ? rVar.g() : null;
        as.f fVar = xVarG instanceof as.f ? (as.f) xVarG : null;
        if (fVar != null && (clsE = fVar.e()) != null) {
            return clsE;
        }
        throw new i3("Container of deserialized member is not resolved: " + tVar);
    }

    private final f0<?> g(vr.e eVar) {
        Class<?> clsQ = y3.q(eVar);
        f0<?> f0Var = (f0) (clsQ != null ? dr.a.e(clsQ) : null);
        if (f0Var != null) {
            return f0Var;
        }
        throw new i3("Type parameter container is not resolved: " + eVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List h(g3 g3Var) {
        List<st.t0> upperBounds = g3Var.getDescriptor().getUpperBounds();
        ArrayList arrayList = new ArrayList(pq.v.y(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new d3((st.t0) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return arrayList;
    }

    public boolean equals(Object other) {
        if (!(other instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) other;
        return fr.t.c(d(), g3Var.d()) && fr.t.c(getName(), g3Var.getName());
    }

    @Override // pr.b1
    /* JADX INFO: renamed from: f, reason: from getter */
    public vr.m1 getDescriptor() {
        return this.descriptor;
    }

    @Override // mr.q
    public String getName() {
        return getDescriptor().getName().e();
    }

    @Override // mr.q
    public List<mr.p> getUpperBounds() {
        return (List) this.upperBounds.e(this, f161846d[0]);
    }

    public int hashCode() {
        return (d().hashCode() * 31) + getName().hashCode();
    }

    @Override // mr.q
    public mr.s q() {
        int i15 = a.f161850a[getDescriptor().q().ordinal()];
        if (i15 == 1) {
            return mr.s.INVARIANT;
        }
        if (i15 == 2) {
            return mr.s.IN;
        }
        if (i15 == 3) {
            return mr.s.OUT;
        }
        throw new oq.p();
    }

    public String toString() {
        return fr.x0.INSTANCE.a(this);
    }
}
