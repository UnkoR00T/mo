package os;

import fr.t;
import java.util.Set;
import st.e1;
import st.i0;
import st.k2;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f149640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f149641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f149642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f149643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<m1> f149644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e1 f149645i;

    /* JADX WARN: Multi-variable type inference failed */
    public a(k2 k2Var, c cVar, boolean z15, boolean z16, Set<? extends m1> set, e1 e1Var) {
        super(k2Var, set, e1Var);
        this.f149640d = k2Var;
        this.f149641e = cVar;
        this.f149642f = z15;
        this.f149643g = z16;
        this.f149644h = set;
        this.f149645i = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a f(a aVar, k2 k2Var, c cVar, boolean z15, boolean z16, Set set, e1 e1Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            k2Var = aVar.f149640d;
        }
        if ((i15 & 2) != 0) {
            cVar = aVar.f149641e;
        }
        if ((i15 & 4) != 0) {
            z15 = aVar.f149642f;
        }
        if ((i15 & 8) != 0) {
            z16 = aVar.f149643g;
        }
        if ((i15 & 16) != 0) {
            set = aVar.f149644h;
        }
        if ((i15 & 32) != 0) {
            e1Var = aVar.f149645i;
        }
        Set set2 = set;
        e1 e1Var2 = e1Var;
        return aVar.e(k2Var, cVar, z15, z16, set2, e1Var2);
    }

    @Override // st.i0
    public e1 a() {
        return this.f149645i;
    }

    @Override // st.i0
    public k2 b() {
        return this.f149640d;
    }

    @Override // st.i0
    public Set<m1> c() {
        return this.f149644h;
    }

    public final a e(k2 k2Var, c cVar, boolean z15, boolean z16, Set<? extends m1> set, e1 e1Var) {
        return new a(k2Var, cVar, z15, z16, set, e1Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(aVar.a(), a()) && aVar.b() == b() && aVar.f149641e == this.f149641e && aVar.f149642f == this.f149642f && aVar.f149643g == this.f149643g;
    }

    public final c g() {
        return this.f149641e;
    }

    public final boolean h() {
        return this.f149643g;
    }

    @Override // st.i0
    public int hashCode() {
        e1 e1VarA = a();
        int iHashCode = e1VarA != null ? e1VarA.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f149641e.hashCode();
        int i15 = iHashCode3 + (iHashCode3 * 31) + (this.f149642f ? 1 : 0);
        return i15 + (i15 * 31) + (this.f149643g ? 1 : 0);
    }

    public final boolean i() {
        return this.f149642f;
    }

    public final a j(boolean z15) {
        return f(this, null, null, z15, false, null, null, 59, null);
    }

    public a k(e1 e1Var) {
        return f(this, null, null, false, false, null, e1Var, 31, null);
    }

    public final a l(c cVar) {
        return f(this, null, cVar, false, false, null, null, 61, null);
    }

    @Override // st.i0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(m1 m1Var) {
        return f(this, null, null, false, false, c() != null ? pq.e1.m(c(), m1Var) : pq.e1.d(m1Var), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f149640d + ", flexibility=" + this.f149641e + ", isRaw=" + this.f149642f + ", isForAnnotationParameter=" + this.f149643g + ", visitedTypeParameters=" + this.f149644h + ", defaultType=" + this.f149645i + ')';
    }

    public /* synthetic */ a(k2 k2Var, c cVar, boolean z15, boolean z16, Set set, e1 e1Var, int i15, fr.k kVar) {
        this(k2Var, (i15 & 2) != 0 ? c.INFLEXIBLE : cVar, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? false : z16, (i15 & 16) != 0 ? null : set, (i15 & 32) != 0 ? null : e1Var);
    }
}
