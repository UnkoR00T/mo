package ut;

import fr.v0;
import java.util.Arrays;
import java.util.List;
import pq.v;
import st.d2;
import st.e1;
import st.t1;
import st.x1;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f201278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lt.k f201279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f201280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<d2> f201281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f201282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f201283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f201284h;

    /* JADX WARN: Multi-variable type inference failed */
    public i(x1 x1Var, lt.k kVar, k kVar2, List<? extends d2> list, boolean z15, String... strArr) {
        this.f201278b = x1Var;
        this.f201279c = kVar;
        this.f201280d = kVar2;
        this.f201281e = list;
        this.f201282f = z15;
        this.f201283g = strArr;
        v0 v0Var = v0.f66418a;
        String strE = kVar2.e();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f201284h = String.format(strE, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // st.t0
    public List<d2> R0() {
        return this.f201281e;
    }

    @Override // st.t0
    public t1 S0() {
        return t1.f184126b.k();
    }

    @Override // st.t0
    public x1 T0() {
        return this.f201278b;
    }

    @Override // st.t0
    public boolean U0() {
        return this.f201282f;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: a1 */
    public e1 X0(boolean z15) {
        x1 x1VarT0 = T0();
        lt.k kVarR = r();
        k kVar = this.f201280d;
        List<d2> listR0 = R0();
        String[] strArr = this.f201283g;
        return new i(x1VarT0, kVarR, kVar, listR0, z15, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1 */
    public e1 Z0(t1 t1Var) {
        return this;
    }

    public final String c1() {
        return this.f201284h;
    }

    public final k d1() {
        return this.f201280d;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public i d1(tt.g gVar) {
        return this;
    }

    public final i f1(List<? extends d2> list) {
        x1 x1VarT0 = T0();
        lt.k kVarR = r();
        k kVar = this.f201280d;
        boolean zU0 = U0();
        String[] strArr = this.f201283g;
        return new i(x1VarT0, kVarR, kVar, list, zU0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // st.t0
    public lt.k r() {
        return this.f201279c;
    }

    public /* synthetic */ i(x1 x1Var, lt.k kVar, k kVar2, List list, boolean z15, String[] strArr, int i15, fr.k kVar3) {
        this(x1Var, kVar, kVar2, (i15 & 8) != 0 ? v.n() : list, (i15 & 16) != 0 ? false : z15, strArr);
    }
}
