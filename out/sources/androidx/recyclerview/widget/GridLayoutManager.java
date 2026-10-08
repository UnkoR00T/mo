package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import io.sentry.android.core.c2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i15, int i16) {
            return i15 % i16;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i15) {
            return 1;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f12960a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f12961b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12962c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12963d = false;

        static int a(SparseIntArray sparseIntArray, int i15) {
            int size = sparseIntArray.size() - 1;
            int i16 = 0;
            while (i16 <= size) {
                int i17 = (i16 + size) >>> 1;
                if (sparseIntArray.keyAt(i17) < i15) {
                    i16 = i17 + 1;
                } else {
                    size = i17 - 1;
                }
            }
            int i18 = i16 - 1;
            if (i18 < 0 || i18 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i18);
        }

        int b(int i15, int i16) {
            if (!this.f12963d) {
                return d(i15, i16);
            }
            int i17 = this.f12961b.get(i15, -1);
            if (i17 != -1) {
                return i17;
            }
            int iD = d(i15, i16);
            this.f12961b.put(i15, iD);
            return iD;
        }

        int c(int i15, int i16) {
            if (!this.f12962c) {
                return e(i15, i16);
            }
            int i17 = this.f12960a.get(i15, -1);
            if (i17 != -1) {
                return i17;
            }
            int iE = e(i15, i16);
            this.f12960a.put(i15, iE);
            return iE;
        }

        public int d(int i15, int i16) {
            int i17;
            int i18;
            int iC;
            int iA;
            if (!this.f12963d || (iA = a(this.f12961b, i15)) == -1) {
                i17 = 0;
                i18 = 0;
                iC = 0;
            } else {
                i17 = this.f12961b.get(iA);
                i18 = iA + 1;
                iC = c(iA, i16) + f(iA);
                if (iC == i16) {
                    i17++;
                    iC = 0;
                }
            }
            int iF = f(i15);
            while (i18 < i15) {
                int iF2 = f(i18);
                iC += iF2;
                if (iC == i16) {
                    i17++;
                    iC = 0;
                } else if (iC > i16) {
                    i17++;
                    iC = iF2;
                }
                i18++;
            }
            return iC + iF > i16 ? i17 + 1 : i17;
        }

        public abstract int e(int i15, int i16);

        public abstract int f(int i15);

        public void g() {
            this.f12961b.clear();
        }

        public void h() {
            this.f12960a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i15, int i16) {
        super(context, attributeSet, i15, i16);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        e3(RecyclerView.p.m0(context, attributeSet, i15, i16).f13150b);
    }

    private void N2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i15, boolean z15) {
        int i16;
        int i17;
        int i18;
        int i19 = 0;
        if (z15) {
            i18 = 1;
            i17 = i15;
            i16 = 0;
        } else {
            i16 = i15 - 1;
            i17 = -1;
            i18 = -1;
        }
        while (i16 != i17) {
            View view = this.L[i16];
            b bVar = (b) view.getLayoutParams();
            int iA3 = a3(wVar, b0Var, l0(view));
            bVar.f12959f = iA3;
            bVar.f12958e = i19;
            i19 += iA3;
            i16 += i18;
        }
    }

    private void O2() {
        int iO = O();
        for (int i15 = 0; i15 < iO; i15++) {
            b bVar = (b) N(i15).getLayoutParams();
            int iA = bVar.a();
            this.M.put(iA, bVar.f());
            this.N.put(iA, bVar.e());
        }
    }

    private void P2(int i15) {
        this.K = Q2(this.K, this.J, i15);
    }

    static int[] Q2(int[] iArr, int i15, int i16) {
        int i17;
        if (iArr == null || iArr.length != i15 + 1 || iArr[iArr.length - 1] != i16) {
            iArr = new int[i15 + 1];
        }
        int i18 = 0;
        iArr[0] = 0;
        int i19 = i16 / i15;
        int i25 = i16 % i15;
        int i26 = 0;
        for (int i27 = 1; i27 <= i15; i27++) {
            i18 += i25;
            if (i18 <= 0 || i15 - i18 >= i25) {
                i17 = i19;
            } else {
                i17 = i19 + 1;
                i18 -= i15;
            }
            i26 += i17;
            iArr[i27] = i26;
        }
        return iArr;
    }

    private void R2() {
        this.M.clear();
        this.N.clear();
    }

    private int S2(RecyclerView.b0 b0Var) {
        if (O() != 0 && b0Var.b() != 0) {
            X1();
            boolean zR2 = r2();
            View viewB2 = b2(!zR2, true);
            View viewA2 = a2(!zR2, true);
            if (viewB2 != null && viewA2 != null) {
                int iB = this.O.b(l0(viewB2), this.J);
                int iB2 = this.O.b(l0(viewA2), this.J);
                int iMax = this.f12969x ? Math.max(0, ((this.O.b(b0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zR2) {
                    return Math.round((iMax * (Math.abs(this.f12966u.d(viewA2) - this.f12966u.g(viewB2)) / ((this.O.b(l0(viewA2), this.J) - this.O.b(l0(viewB2), this.J)) + 1))) + (this.f12966u.m() - this.f12966u.g(viewB2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int T2(RecyclerView.b0 b0Var) {
        if (O() != 0 && b0Var.b() != 0) {
            X1();
            View viewB2 = b2(!r2(), true);
            View viewA2 = a2(!r2(), true);
            if (viewB2 != null && viewA2 != null) {
                if (!r2()) {
                    return this.O.b(b0Var.b() - 1, this.J) + 1;
                }
                return (int) (((this.f12966u.d(viewA2) - this.f12966u.g(viewB2)) / ((this.O.b(l0(viewA2), this.J) - this.O.b(l0(viewB2), this.J)) + 1)) * (this.O.b(b0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i15) {
        boolean z15 = i15 == 1;
        int iZ2 = Z2(wVar, b0Var, aVar.f12973b);
        if (z15) {
            while (iZ2 > 0) {
                int i16 = aVar.f12973b;
                if (i16 <= 0) {
                    return;
                }
                int i17 = i16 - 1;
                aVar.f12973b = i17;
                iZ2 = Z2(wVar, b0Var, i17);
            }
            return;
        }
        int iB = b0Var.b() - 1;
        int i18 = aVar.f12973b;
        while (i18 < iB) {
            int i19 = i18 + 1;
            int iZ3 = Z2(wVar, b0Var, i19);
            if (iZ3 <= iZ2) {
                break;
            }
            i18 = i19;
            iZ2 = iZ3;
        }
        aVar.f12973b = i18;
    }

    private void V2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int Y2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i15) {
        if (!b0Var.e()) {
            return this.O.b(i15, this.J);
        }
        int iF = wVar.f(i15);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        c2.g("GridLayoutManager", "Cannot find span size for pre layout position. " + i15);
        return 0;
    }

    private int Z2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i15) {
        if (!b0Var.e()) {
            return this.O.c(i15, this.J);
        }
        int i16 = this.N.get(i15, -1);
        if (i16 != -1) {
            return i16;
        }
        int iF = wVar.f(i15);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        c2.g("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i15);
        return 0;
    }

    private int a3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i15) {
        if (!b0Var.e()) {
            return this.O.f(i15);
        }
        int i16 = this.M.get(i15, -1);
        if (i16 != -1) {
            return i16;
        }
        int iF = wVar.f(i15);
        if (iF != -1) {
            return this.O.f(iF);
        }
        c2.g("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i15);
        return 1;
    }

    private void b3(float f15, int i15) {
        P2(Math.max(Math.round(f15 * this.J), i15));
    }

    private void c3(View view, int i15, boolean z15) {
        int iP;
        int iP2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f13154b;
        int i16 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i17 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW2 = W2(bVar.f12958e, bVar.f12959f);
        if (this.f12964s == 1) {
            iP2 = RecyclerView.p.P(iW2, i15, i17, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iP = RecyclerView.p.P(this.f12966u.n(), c0(), i16, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iP3 = RecyclerView.p.P(iW2, i15, i16, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iP4 = RecyclerView.p.P(this.f12966u.n(), t0(), i17, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        d3(view, iP2, iP, z15);
    }

    private void d3(View view, int i15, int i16, boolean z15) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z15 ? L1(view, i15, i16, qVar) : J1(view, i15, i16, qVar)) {
            view.measure(i15, i16);
        }
    }

    private void f3() {
        int iB0;
        int iK0;
        if (p2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        P2(iB0 - iK0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.b0 b0Var) {
        return this.Q ? T2(b0Var) : super.A(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        f3();
        V2();
        return super.A1(i15, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        f3();
        V2();
        return super.C1(i15, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z15) {
        if (z15) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i15, int i16) {
        int iS;
        int iS2;
        if (this.K == null) {
            super.G1(rect, i15, i16);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f12964s == 1) {
            iS2 = RecyclerView.p.s(i16, rect.height() + iK0, f0());
            int[] iArr = this.K;
            iS = RecyclerView.p.s(i15, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = RecyclerView.p.s(i15, rect.width() + iI0, g0());
            int[] iArr2 = this.K;
            iS2 = RecyclerView.p.s(i16, iArr2[iArr2.length - 1] + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.f12964s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View N0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView.w wVar, RecyclerView.b0 b0Var, k6.p pVar) {
        super.Q0(wVar, b0Var, pVar);
        pVar.o0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void R1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.J;
        for (int i15 = 0; i15 < this.J && cVar.c(b0Var) && iF > 0; i15++) {
            int i16 = cVar.f12984d;
            cVar2.a(i16, Math.max(0, cVar.f12987g));
            iF -= this.O.f(i16);
            cVar.f12984d += cVar.f12985e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int S(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f12964s == 1) {
            return this.J;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return Y2(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, k6.p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.S0(view, pVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iY2 = Y2(wVar, b0Var, bVar.a());
        if (this.f12964s == 0) {
            pVar.r0(k6.p.g.a(bVar.e(), bVar.f(), iY2, 1, false, false));
        } else {
            pVar.r0(k6.p.g.a(iY2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i15, int i16) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    int W2(int i15, int i16) {
        if (this.f12964s != 1 || !q2()) {
            int[] iArr = this.K;
            return iArr[i16 + i15] - iArr[i15];
        }
        int[] iArr2 = this.K;
        int i17 = this.J;
        return iArr2[i17 - i15] - iArr2[(i17 - i15) - i16];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i15, int i16, int i17) {
        this.O.h();
        this.O.g();
    }

    public int X2() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i15, int i16) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i15, int i16, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            O2();
        }
        super.b1(wVar, b0Var);
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.b0 b0Var) {
        super.c1(b0Var);
        this.I = false;
    }

    public void e3(int i15) {
        if (i15 == this.J) {
            return;
        }
        this.I = true;
        if (i15 >= 1) {
            this.J = i15;
            this.O.h();
            x1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i15);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View j2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z15, boolean z16) {
        int i15;
        int iO;
        int iO2 = O();
        int i16 = 1;
        if (z16) {
            iO = O() - 1;
            i15 = -1;
            i16 = -1;
        } else {
            i15 = iO2;
            iO = 0;
        }
        int iB = b0Var.b();
        X1();
        int iM = this.f12966u.m();
        int i17 = this.f12966u.i();
        View view = null;
        View view2 = null;
        while (iO != i15) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < iB && Z2(wVar, b0Var, iL0) == 0) {
                if (((RecyclerView.q) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f12966u.g(viewN) < i17 && this.f12966u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i16;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int o0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f12964s == 0) {
            return this.J;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return Y2(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void s2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i15;
        int i16;
        int iI0;
        int iK0;
        int iF;
        int iF2;
        int i17;
        int iP;
        int iP2;
        View viewD;
        int iL = this.f12966u.l();
        boolean z15 = iL != 1073741824;
        int i18 = O() > 0 ? this.K[this.J] : 0;
        if (z15) {
            f3();
        }
        boolean z16 = cVar.f12985e == 1;
        int iZ2 = this.J;
        if (!z16) {
            iZ2 = Z2(wVar, b0Var, cVar.f12984d) + a3(wVar, b0Var, cVar.f12984d);
        }
        int i19 = 0;
        while (i19 < this.J && cVar.c(b0Var) && iZ2 > 0) {
            int i25 = cVar.f12984d;
            int iA3 = a3(wVar, b0Var, i25);
            if (iA3 > this.J) {
                throw new IllegalArgumentException("Item at position " + i25 + " requires " + iA3 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            iZ2 -= iA3;
            if (iZ2 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.L[i19] = viewD;
            i19++;
        }
        if (i19 == 0) {
            bVar.f12978b = true;
            return;
        }
        N2(wVar, b0Var, i19, z16);
        float f15 = 0.0f;
        int i26 = 0;
        for (int i27 = 0; i27 < i19; i27++) {
            View view = this.L[i27];
            if (cVar.f12992l == null) {
                if (z16) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z16) {
                f(view);
            } else {
                h(view, 0);
            }
            o(view, this.P);
            c3(view, iL, false);
            int iE = this.f12966u.e(view);
            if (iE > i26) {
                i26 = iE;
            }
            float f16 = (this.f12966u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f12959f;
            if (f16 > f15) {
                f15 = f16;
            }
        }
        if (z15) {
            b3(f15, i18);
            i26 = 0;
            for (int i28 = 0; i28 < i19; i28++) {
                View view2 = this.L[i28];
                c3(view2, 1073741824, true);
                int iE2 = this.f12966u.e(view2);
                if (iE2 > i26) {
                    i26 = iE2;
                }
            }
        }
        for (int i29 = 0; i29 < i19; i29++) {
            View view3 = this.L[i29];
            if (this.f12966u.e(view3) != i26) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f13154b;
                int i35 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i36 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iW2 = W2(bVar2.f12958e, bVar2.f12959f);
                if (this.f12964s == 1) {
                    iP2 = RecyclerView.p.P(iW2, 1073741824, i36, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iP = View.MeasureSpec.makeMeasureSpec(i26 - i35, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i36, 1073741824);
                    iP = RecyclerView.p.P(iW2, 1073741824, i35, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                d3(view3, iP2, iP, true);
            }
        }
        bVar.f12977a = i26;
        if (this.f12964s == 1) {
            if (cVar.f12986f == -1) {
                iF2 = cVar.f12982b;
                i17 = iF2 - i26;
            } else {
                i17 = cVar.f12982b;
                iF2 = i17 + i26;
            }
            iK0 = i17;
            iF = 0;
            iI0 = 0;
        } else {
            if (cVar.f12986f == -1) {
                i16 = cVar.f12982b;
                i15 = i16 - i26;
            } else {
                i15 = cVar.f12982b;
                i16 = i15 + i26;
            }
            iI0 = i15;
            iK0 = 0;
            iF = i16;
            iF2 = 0;
        }
        for (int i37 = 0; i37 < i19; i37++) {
            View view4 = this.L[i37];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f12964s != 1) {
                iK0 = this.K[bVar3.f12958e] + k0();
                iF2 = this.f12966u.f(view4) + iK0;
            } else if (q2()) {
                iF = i0() + this.K[this.J - bVar3.f12958e];
                iI0 = iF - this.f12966u.f(view4);
            } else {
                iI0 = this.K[bVar3.f12958e] + i0();
                iF = this.f12966u.f(view4) + iI0;
            }
            int i38 = iF2;
            int i39 = iK0;
            int i45 = iF;
            int i46 = iI0;
            D0(view4, i46, i39, i45, i38);
            iF2 = i38;
            iI0 = i46;
            iF = i45;
            iK0 = i39;
            if (bVar3.c() || bVar3.b()) {
                bVar.f12979c = true;
            }
            bVar.f12980d = view4.hasFocusable() | bVar.f12980d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i15) {
        super.u2(wVar, b0Var, aVar, i15);
        f3();
        if (b0Var.b() > 0 && !b0Var.e()) {
            U2(wVar, b0Var, aVar, i15);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.b0 b0Var) {
        return this.Q ? S2(b0Var) : super.w(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.b0 b0Var) {
        return this.Q ? T2(b0Var) : super.x(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.b0 b0Var) {
        return this.Q ? S2(b0Var) : super.z(b0Var);
    }

    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f12959f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12958e = -1;
            this.f12959f = 0;
        }

        public int e() {
            return this.f12958e;
        }

        public int f() {
            return this.f12959f;
        }

        public b(int i15, int i16) {
            super(i15, i16);
            this.f12958e = -1;
            this.f12959f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12958e = -1;
            this.f12959f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12958e = -1;
            this.f12959f = 0;
        }
    }

    public GridLayoutManager(Context context, int i15, int i16, boolean z15) {
        super(context, i16, z15);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        e3(i15);
    }
}
