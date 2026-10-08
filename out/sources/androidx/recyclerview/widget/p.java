package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f13407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f13409c;

    class a extends p {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.p
        public int d(View view) {
            return this.f13407a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f13407a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f13407a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int g(View view) {
            return this.f13407a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int h() {
            return this.f13407a.s0();
        }

        @Override // androidx.recyclerview.widget.p
        public int i() {
            return this.f13407a.s0() - this.f13407a.j0();
        }

        @Override // androidx.recyclerview.widget.p
        public int j() {
            return this.f13407a.j0();
        }

        @Override // androidx.recyclerview.widget.p
        public int k() {
            return this.f13407a.t0();
        }

        @Override // androidx.recyclerview.widget.p
        public int l() {
            return this.f13407a.c0();
        }

        @Override // androidx.recyclerview.widget.p
        public int m() {
            return this.f13407a.i0();
        }

        @Override // androidx.recyclerview.widget.p
        public int n() {
            return (this.f13407a.s0() - this.f13407a.i0()) - this.f13407a.j0();
        }

        @Override // androidx.recyclerview.widget.p
        public int p(View view) {
            this.f13407a.r0(view, true, this.f13409c);
            return this.f13409c.right;
        }

        @Override // androidx.recyclerview.widget.p
        public int q(View view) {
            this.f13407a.r0(view, true, this.f13409c);
            return this.f13409c.left;
        }

        @Override // androidx.recyclerview.widget.p
        public void r(int i15) {
            this.f13407a.G0(i15);
        }
    }

    class b extends p {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.p
        public int d(View view) {
            return this.f13407a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f13407a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f13407a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int g(View view) {
            return this.f13407a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.p
        public int h() {
            return this.f13407a.b0();
        }

        @Override // androidx.recyclerview.widget.p
        public int i() {
            return this.f13407a.b0() - this.f13407a.h0();
        }

        @Override // androidx.recyclerview.widget.p
        public int j() {
            return this.f13407a.h0();
        }

        @Override // androidx.recyclerview.widget.p
        public int k() {
            return this.f13407a.c0();
        }

        @Override // androidx.recyclerview.widget.p
        public int l() {
            return this.f13407a.t0();
        }

        @Override // androidx.recyclerview.widget.p
        public int m() {
            return this.f13407a.k0();
        }

        @Override // androidx.recyclerview.widget.p
        public int n() {
            return (this.f13407a.b0() - this.f13407a.k0()) - this.f13407a.h0();
        }

        @Override // androidx.recyclerview.widget.p
        public int p(View view) {
            this.f13407a.r0(view, true, this.f13409c);
            return this.f13409c.bottom;
        }

        @Override // androidx.recyclerview.widget.p
        public int q(View view) {
            this.f13407a.r0(view, true, this.f13409c);
            return this.f13409c.top;
        }

        @Override // androidx.recyclerview.widget.p
        public void r(int i15) {
            this.f13407a.H0(i15);
        }
    }

    /* synthetic */ p(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static p a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static p b(RecyclerView.p pVar, int i15) {
        if (i15 == 0) {
            return a(pVar);
        }
        if (i15 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static p c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f13408b) {
            return 0;
        }
        return n() - this.f13408b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i15);

    public void s() {
        this.f13408b = n();
    }

    private p(RecyclerView.p pVar) {
        this.f13408b = PKIFailureInfo.systemUnavail;
        this.f13409c = new Rect();
        this.f13407a = pVar;
    }
}
