package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f12964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f12965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    p f12966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f12967v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f12968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f12969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f12970y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f12971z;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        p f12972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f12975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f12976e;

        a() {
            e();
        }

        void a() {
            this.f12974c = this.f12975d ? this.f12972a.i() : this.f12972a.m();
        }

        public void b(View view, int i15) {
            if (this.f12975d) {
                this.f12974c = this.f12972a.d(view) + this.f12972a.o();
            } else {
                this.f12974c = this.f12972a.g(view);
            }
            this.f12973b = i15;
        }

        public void c(View view, int i15) {
            int iO = this.f12972a.o();
            if (iO >= 0) {
                b(view, i15);
                return;
            }
            this.f12973b = i15;
            if (this.f12975d) {
                int i16 = (this.f12972a.i() - iO) - this.f12972a.d(view);
                this.f12974c = this.f12972a.i() - i16;
                if (i16 > 0) {
                    int iE = this.f12974c - this.f12972a.e(view);
                    int iM = this.f12972a.m();
                    int iMin = iE - (iM + Math.min(this.f12972a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f12974c += Math.min(i16, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f12972a.g(view);
            int iM2 = iG - this.f12972a.m();
            this.f12974c = iG;
            if (iM2 > 0) {
                int i17 = (this.f12972a.i() - Math.min(0, (this.f12972a.i() - iO) - this.f12972a.d(view))) - (iG + this.f12972a.e(view));
                if (i17 < 0) {
                    this.f12974c -= Math.min(iM2, -i17);
                }
            }
        }

        boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b0Var.b();
        }

        void e() {
            this.f12973b = -1;
            this.f12974c = PKIFailureInfo.systemUnavail;
            this.f12975d = false;
            this.f12976e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f12973b + ", mCoordinate=" + this.f12974c + ", mLayoutFromEnd=" + this.f12975d + ", mValid=" + this.f12976e + '}';
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12980d;

        protected b() {
        }

        void a() {
            this.f12977a = 0;
            this.f12978b = false;
            this.f12979c = false;
            this.f12980d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f12986f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f12987g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f12991k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f12993m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f12981a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f12988h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f12989i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f12990j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List<RecyclerView.f0> f12992l = null;

        c() {
        }

        private View e() {
            int size = this.f12992l.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = this.f12992l.get(i15).f13091a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f12984d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f12984d = -1;
            } else {
                this.f12984d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.b0 b0Var) {
            int i15 = this.f12984d;
            return i15 >= 0 && i15 < b0Var.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f12992l != null) {
                return e();
            }
            View viewO = wVar.o(this.f12984d);
            this.f12984d += this.f12985e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f12992l.size();
            View view2 = null;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < size; i16++) {
                View view3 = this.f12992l.get(i16).f13091a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f12984d) * this.f12985e) >= 0 && iA < i15) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i15 = iA;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12996c;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i15) {
                return new d[i15];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f12994a >= 0;
        }

        void b() {
            this.f12994a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            parcel.writeInt(this.f12994a);
            parcel.writeInt(this.f12995b);
            parcel.writeInt(this.f12996c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f12994a = parcel.readInt();
            this.f12995b = parcel.readInt();
            this.f12996c = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.f12994a = dVar.f12994a;
            this.f12995b = dVar.f12995b;
            this.f12996c = dVar.f12996c;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private void A2() {
        if (this.f12964s == 1 || !q2()) {
            this.f12969x = this.f12968w;
        } else {
            this.f12969x = !this.f12968w;
        }
    }

    private boolean F2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View viewJ2;
        boolean z15 = false;
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, b0Var)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        boolean z16 = this.f12967v;
        boolean z17 = this.f12970y;
        if (z16 != z17 || (viewJ2 = j2(wVar, b0Var, aVar.f12975d, z17)) == null) {
            return false;
        }
        aVar.b(viewJ2, l0(viewJ2));
        if (!b0Var.e() && P1()) {
            int iG = this.f12966u.g(viewJ2);
            int iD = this.f12966u.d(viewJ2);
            int iM = this.f12966u.m();
            int i15 = this.f12966u.i();
            boolean z18 = iD <= iM && iG < iM;
            if (iG >= i15 && iD > i15) {
                z15 = true;
            }
            if (z18 || z15) {
                if (aVar.f12975d) {
                    iM = i15;
                }
                aVar.f12974c = iM;
            }
        }
        return true;
    }

    private boolean G2(RecyclerView.b0 b0Var, a aVar) {
        int i15;
        if (!b0Var.e() && (i15 = this.A) != -1) {
            if (i15 >= 0 && i15 < b0Var.b()) {
                aVar.f12973b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z15 = this.D.f12996c;
                    aVar.f12975d = z15;
                    if (z15) {
                        aVar.f12974c = this.f12966u.i() - this.D.f12995b;
                    } else {
                        aVar.f12974c = this.f12966u.m() + this.D.f12995b;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z16 = this.f12969x;
                    aVar.f12975d = z16;
                    if (z16) {
                        aVar.f12974c = this.f12966u.i() - this.B;
                    } else {
                        aVar.f12974c = this.f12966u.m() + this.B;
                    }
                    return true;
                }
                View viewH = H(this.A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f12975d = (this.A < l0(N(0))) == this.f12969x;
                    }
                    aVar.a();
                } else {
                    if (this.f12966u.e(viewH) > this.f12966u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f12966u.g(viewH) - this.f12966u.m() < 0) {
                        aVar.f12974c = this.f12966u.m();
                        aVar.f12975d = false;
                        return true;
                    }
                    if (this.f12966u.i() - this.f12966u.d(viewH) < 0) {
                        aVar.f12974c = this.f12966u.i();
                        aVar.f12975d = true;
                        return true;
                    }
                    aVar.f12974c = aVar.f12975d ? this.f12966u.d(viewH) + this.f12966u.o() : this.f12966u.g(viewH);
                }
                return true;
            }
            this.A = -1;
            this.B = PKIFailureInfo.systemUnavail;
        }
        return false;
    }

    private void H2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (G2(b0Var, aVar) || F2(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f12973b = this.f12970y ? b0Var.b() - 1 : 0;
    }

    private void I2(int i15, int i16, boolean z15, RecyclerView.b0 b0Var) {
        int iM;
        this.f12965t.f12993m = z2();
        this.f12965t.f12986f = i15;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z16 = i15 == 1;
        c cVar = this.f12965t;
        int i17 = z16 ? iMax2 : iMax;
        cVar.f12988h = i17;
        if (!z16) {
            iMax = iMax2;
        }
        cVar.f12989i = iMax;
        if (z16) {
            cVar.f12988h = i17 + this.f12966u.j();
            View viewM2 = m2();
            c cVar2 = this.f12965t;
            cVar2.f12985e = this.f12969x ? -1 : 1;
            int iL0 = l0(viewM2);
            c cVar3 = this.f12965t;
            cVar2.f12984d = iL0 + cVar3.f12985e;
            cVar3.f12982b = this.f12966u.d(viewM2);
            iM = this.f12966u.d(viewM2) - this.f12966u.i();
        } else {
            View viewN2 = n2();
            this.f12965t.f12988h += this.f12966u.m();
            c cVar4 = this.f12965t;
            cVar4.f12985e = this.f12969x ? 1 : -1;
            int iL1 = l0(viewN2);
            c cVar5 = this.f12965t;
            cVar4.f12984d = iL1 + cVar5.f12985e;
            cVar5.f12982b = this.f12966u.g(viewN2);
            iM = (-this.f12966u.g(viewN2)) + this.f12966u.m();
        }
        c cVar6 = this.f12965t;
        cVar6.f12983c = i16;
        if (z15) {
            cVar6.f12983c = i16 - iM;
        }
        cVar6.f12987g = iM;
    }

    private void J2(int i15, int i16) {
        this.f12965t.f12983c = this.f12966u.i() - i16;
        c cVar = this.f12965t;
        cVar.f12985e = this.f12969x ? -1 : 1;
        cVar.f12984d = i15;
        cVar.f12986f = 1;
        cVar.f12982b = i16;
        cVar.f12987g = PKIFailureInfo.systemUnavail;
    }

    private void K2(a aVar) {
        J2(aVar.f12973b, aVar.f12974c);
    }

    private void L2(int i15, int i16) {
        this.f12965t.f12983c = i16 - this.f12966u.m();
        c cVar = this.f12965t;
        cVar.f12984d = i15;
        cVar.f12985e = this.f12969x ? 1 : -1;
        cVar.f12986f = -1;
        cVar.f12982b = i16;
        cVar.f12987g = PKIFailureInfo.systemUnavail;
    }

    private void M2(a aVar) {
        L2(aVar.f12973b, aVar.f12974c);
    }

    private int S1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return s.a(b0Var, this.f12966u, b2(!this.f12971z, true), a2(!this.f12971z, true), this, this.f12971z);
    }

    private int T1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return s.b(b0Var, this.f12966u, b2(!this.f12971z, true), a2(!this.f12971z, true), this, this.f12971z, this.f12969x);
    }

    private int U1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return s.c(b0Var, this.f12966u, b2(!this.f12971z, true), a2(!this.f12971z, true), this, this.f12971z);
    }

    private View Z1() {
        return f2(0, O());
    }

    private View d2() {
        return f2(O() - 1, -1);
    }

    private View h2() {
        return this.f12969x ? Z1() : d2();
    }

    private View i2() {
        return this.f12969x ? d2() : Z1();
    }

    private int k2(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z15) {
        int i16;
        int i17 = this.f12966u.i() - i15;
        if (i17 <= 0) {
            return 0;
        }
        int i18 = -B2(-i17, wVar, b0Var);
        int i19 = i15 + i18;
        if (!z15 || (i16 = this.f12966u.i() - i19) <= 0) {
            return i18;
        }
        this.f12966u.r(i16);
        return i16 + i18;
    }

    private int l2(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z15) {
        int iM;
        int iM2 = i15 - this.f12966u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i16 = -B2(iM2, wVar, b0Var);
        int i17 = i15 + i16;
        if (!z15 || (iM = i17 - this.f12966u.m()) <= 0) {
            return i16;
        }
        this.f12966u.r(-iM);
        return i16 - iM;
    }

    private View m2() {
        return N(this.f12969x ? 0 : O() - 1);
    }

    private View n2() {
        return N(this.f12969x ? O() - 1 : 0);
    }

    private void t2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i15, int i16) {
        if (!b0Var.g() || O() == 0 || b0Var.e() || !P1()) {
            return;
        }
        List<RecyclerView.f0> listK = wVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            RecyclerView.f0 f0Var = listK.get(i17);
            if (!f0Var.x()) {
                if ((f0Var.o() < iL0) != this.f12969x) {
                    iE += this.f12966u.e(f0Var.f13091a);
                } else {
                    iE2 += this.f12966u.e(f0Var.f13091a);
                }
            }
        }
        this.f12965t.f12992l = listK;
        if (iE > 0) {
            L2(l0(n2()), i15);
            c cVar = this.f12965t;
            cVar.f12988h = iE;
            cVar.f12983c = 0;
            cVar.a();
            Y1(wVar, this.f12965t, b0Var, false);
        }
        if (iE2 > 0) {
            J2(l0(m2()), i16);
            c cVar2 = this.f12965t;
            cVar2.f12988h = iE2;
            cVar2.f12983c = 0;
            cVar2.a();
            Y1(wVar, this.f12965t, b0Var, false);
        }
        this.f12965t.f12992l = null;
    }

    private void v2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f12981a || cVar.f12993m) {
            return;
        }
        int i15 = cVar.f12987g;
        int i16 = cVar.f12989i;
        if (cVar.f12986f == -1) {
            x2(wVar, i15, i16);
        } else {
            y2(wVar, i15, i16);
        }
    }

    private void w2(RecyclerView.w wVar, int i15, int i16) {
        if (i15 == i16) {
            return;
        }
        if (i16 <= i15) {
            while (i15 > i16) {
                r1(i15, wVar);
                i15--;
            }
        } else {
            for (int i17 = i16 - 1; i17 >= i15; i17--) {
                r1(i17, wVar);
            }
        }
    }

    private void x2(RecyclerView.w wVar, int i15, int i16) {
        int iO = O();
        if (i15 < 0) {
            return;
        }
        int iH = (this.f12966u.h() - i15) + i16;
        if (this.f12969x) {
            for (int i17 = 0; i17 < iO; i17++) {
                View viewN = N(i17);
                if (this.f12966u.g(viewN) < iH || this.f12966u.q(viewN) < iH) {
                    w2(wVar, 0, i17);
                    return;
                }
            }
            return;
        }
        int i18 = iO - 1;
        for (int i19 = i18; i19 >= 0; i19--) {
            View viewN2 = N(i19);
            if (this.f12966u.g(viewN2) < iH || this.f12966u.q(viewN2) < iH) {
                w2(wVar, i18, i19);
                return;
            }
        }
    }

    private void y2(RecyclerView.w wVar, int i15, int i16) {
        if (i15 < 0) {
            return;
        }
        int i17 = i15 - i16;
        int iO = O();
        if (!this.f12969x) {
            for (int i18 = 0; i18 < iO; i18++) {
                View viewN = N(i18);
                if (this.f12966u.d(viewN) > i17 || this.f12966u.p(viewN) > i17) {
                    w2(wVar, 0, i18);
                    return;
                }
            }
            return;
        }
        int i19 = iO - 1;
        for (int i25 = i19; i25 >= 0; i25--) {
            View viewN2 = N(i25);
            if (this.f12966u.d(viewN2) > i17 || this.f12966u.p(viewN2) > i17) {
                w2(wVar, i19, i25);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int A(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int A1(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f12964s == 1) {
            return 0;
        }
        return B2(i15, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i15) {
        this.A = i15;
        this.B = PKIFailureInfo.systemUnavail;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        x1();
    }

    int B2(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i15 == 0) {
            return 0;
        }
        X1();
        this.f12965t.f12981a = true;
        int i16 = i15 > 0 ? 1 : -1;
        int iAbs = Math.abs(i15);
        I2(i16, iAbs, true, b0Var);
        c cVar = this.f12965t;
        int iY1 = cVar.f12987g + Y1(wVar, cVar, b0Var, false);
        if (iY1 < 0) {
            return 0;
        }
        if (iAbs > iY1) {
            i15 = i16 * iY1;
        }
        this.f12966u.r(-i15);
        this.f12965t.f12991k = i15;
        return i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int C1(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f12964s == 0) {
            return 0;
        }
        return B2(i15, wVar, b0Var);
    }

    public void C2(int i15) {
        if (i15 != 0 && i15 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i15);
        }
        l(null);
        if (i15 != this.f12964s || this.f12966u == null) {
            p pVarB = p.b(this, i15);
            this.f12966u = pVarB;
            this.E.f12972a = pVarB;
            this.f12964s = i15;
            x1();
        }
    }

    public void D2(boolean z15) {
        l(null);
        if (z15 == this.f12968w) {
            return;
        }
        this.f12968w = z15;
        x1();
    }

    public void E2(boolean z15) {
        l(null);
        if (this.f12970y == z15) {
            return;
        }
        this.f12970y = z15;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View H(int i15) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i15 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i15) {
                return viewN;
            }
        }
        return super.H(i15);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        if (this.C) {
            o1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i15) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i15);
        N1(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View N0(View view, int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iV1;
        A2();
        if (O() == 0 || (iV1 = V1(i15)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        I2(iV1, (int) (this.f12966u.n() * 0.33333334f), false, b0Var);
        c cVar = this.f12965t;
        cVar.f12987g = PKIFailureInfo.systemUnavail;
        cVar.f12981a = false;
        Y1(wVar, cVar, b0Var, true);
        View viewI2 = iV1 == -1 ? i2() : h2();
        View viewN2 = iV1 == -1 ? n2() : m2();
        if (!viewN2.hasFocusable()) {
            return viewI2;
        }
        if (viewI2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(c2());
            accessibilityEvent.setToIndex(e2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.D == null && this.f12967v == this.f12970y;
    }

    protected void Q1(RecyclerView.b0 b0Var, int[] iArr) {
        int i15;
        int iO2 = o2(b0Var);
        if (this.f12965t.f12986f == -1) {
            i15 = 0;
        } else {
            i15 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i15;
    }

    void R1(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i15 = cVar.f12984d;
        if (i15 < 0 || i15 >= b0Var.b()) {
            return;
        }
        cVar2.a(i15, Math.max(0, cVar.f12987g));
    }

    int V1(int i15) {
        if (i15 == 1) {
            return (this.f12964s != 1 && q2()) ? 1 : -1;
        }
        if (i15 == 2) {
            return (this.f12964s != 1 && q2()) ? -1 : 1;
        }
        if (i15 == 17) {
            if (this.f12964s == 0) {
                return -1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 33) {
            if (this.f12964s == 1) {
                return -1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 66) {
            if (this.f12964s == 0) {
                return 1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 130 && this.f12964s == 1) {
            return 1;
        }
        return PKIFailureInfo.systemUnavail;
    }

    c W1() {
        return new c();
    }

    void X1() {
        if (this.f12965t == null) {
            this.f12965t = W1();
        }
    }

    int Y1(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z15) {
        int i15 = cVar.f12983c;
        int i16 = cVar.f12987g;
        if (i16 != Integer.MIN_VALUE) {
            if (i15 < 0) {
                cVar.f12987g = i16 + i15;
            }
            v2(wVar, cVar);
        }
        int i17 = cVar.f12983c + cVar.f12988h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f12993m && i17 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            s2(wVar, b0Var, cVar, bVar);
            if (!bVar.f12978b) {
                cVar.f12982b += bVar.f12977a * cVar.f12986f;
                if (!bVar.f12979c || cVar.f12992l != null || !b0Var.e()) {
                    int i18 = cVar.f12983c;
                    int i19 = bVar.f12977a;
                    cVar.f12983c = i18 - i19;
                    i17 -= i19;
                }
                int i25 = cVar.f12987g;
                if (i25 != Integer.MIN_VALUE) {
                    int i26 = i25 + bVar.f12977a;
                    cVar.f12987g = i26;
                    int i27 = cVar.f12983c;
                    if (i27 < 0) {
                        cVar.f12987g = i26 + i27;
                    }
                    v2(wVar, cVar);
                }
                if (z15 && bVar.f12980d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i15 - cVar.f12983c;
    }

    View a2(boolean z15, boolean z16) {
        return this.f12969x ? g2(0, O(), z15, z16) : g2(O() - 1, -1, z15, z16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void b1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i15;
        int i16;
        int i17;
        int i18;
        int iK2;
        int i19;
        View viewH;
        int iG;
        int i25;
        int i26 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.b() == 0) {
            o1(wVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f12994a;
        }
        X1();
        this.f12965t.f12981a = false;
        A2();
        View viewA0 = a0();
        a aVar = this.E;
        if (!aVar.f12976e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f12975d = this.f12969x ^ this.f12970y;
            H2(wVar, b0Var, aVar2);
            this.E.f12976e = true;
        } else if (viewA0 != null && (this.f12966u.g(viewA0) >= this.f12966u.i() || this.f12966u.d(viewA0) <= this.f12966u.m())) {
            this.E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f12965t;
        cVar.f12986f = cVar.f12991k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.f12966u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.f12966u.j();
        if (b0Var.e() && (i19 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewH = H(i19)) != null) {
            if (this.f12969x) {
                i25 = this.f12966u.i() - this.f12966u.d(viewH);
                iG = this.B;
            } else {
                iG = this.f12966u.g(viewH) - this.f12966u.m();
                i25 = this.B;
            }
            int i27 = i25 - iG;
            if (i27 > 0) {
                iMax += i27;
            } else {
                iMax2 -= i27;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f12975d ? !this.f12969x : this.f12969x) {
            i26 = 1;
        }
        u2(wVar, b0Var, aVar3, i26);
        B(wVar);
        this.f12965t.f12993m = z2();
        this.f12965t.f12990j = b0Var.e();
        this.f12965t.f12989i = 0;
        a aVar4 = this.E;
        if (aVar4.f12975d) {
            M2(aVar4);
            c cVar2 = this.f12965t;
            cVar2.f12988h = iMax;
            Y1(wVar, cVar2, b0Var, false);
            c cVar3 = this.f12965t;
            i16 = cVar3.f12982b;
            int i28 = cVar3.f12984d;
            int i29 = cVar3.f12983c;
            if (i29 > 0) {
                iMax2 += i29;
            }
            K2(this.E);
            c cVar4 = this.f12965t;
            cVar4.f12988h = iMax2;
            cVar4.f12984d += cVar4.f12985e;
            Y1(wVar, cVar4, b0Var, false);
            c cVar5 = this.f12965t;
            i15 = cVar5.f12982b;
            int i35 = cVar5.f12983c;
            if (i35 > 0) {
                L2(i28, i16);
                c cVar6 = this.f12965t;
                cVar6.f12988h = i35;
                Y1(wVar, cVar6, b0Var, false);
                i16 = this.f12965t.f12982b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f12965t;
            cVar7.f12988h = iMax2;
            Y1(wVar, cVar7, b0Var, false);
            c cVar8 = this.f12965t;
            i15 = cVar8.f12982b;
            int i36 = cVar8.f12984d;
            int i37 = cVar8.f12983c;
            if (i37 > 0) {
                iMax += i37;
            }
            M2(this.E);
            c cVar9 = this.f12965t;
            cVar9.f12988h = iMax;
            cVar9.f12984d += cVar9.f12985e;
            Y1(wVar, cVar9, b0Var, false);
            c cVar10 = this.f12965t;
            i16 = cVar10.f12982b;
            int i38 = cVar10.f12983c;
            if (i38 > 0) {
                J2(i36, i15);
                c cVar11 = this.f12965t;
                cVar11.f12988h = i38;
                Y1(wVar, cVar11, b0Var, false);
                i15 = this.f12965t.f12982b;
            }
        }
        if (O() > 0) {
            if (this.f12969x ^ this.f12970y) {
                int iK3 = k2(i15, wVar, b0Var, true);
                i17 = i16 + iK3;
                i18 = i15 + iK3;
                iK2 = l2(i17, wVar, b0Var, false);
            } else {
                int iL2 = l2(i16, wVar, b0Var, true);
                i17 = i16 + iL2;
                i18 = i15 + iL2;
                iK2 = k2(i18, wVar, b0Var, false);
            }
            i16 = i17 + iK2;
            i15 = i18 + iK2;
        }
        t2(wVar, b0Var, i16, i15);
        if (b0Var.e()) {
            this.E.e();
        } else {
            this.f12966u.s();
        }
        this.f12967v = this.f12970y;
    }

    View b2(boolean z15, boolean z16) {
        return this.f12969x ? g2(O() - 1, -1, z15, z16) : g2(0, O(), z15, z16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void c1(RecyclerView.b0 b0Var) {
        super.c1(b0Var);
        this.D = null;
        this.A = -1;
        this.B = PKIFailureInfo.systemUnavail;
        this.E.e();
    }

    public int c2() {
        View viewG2 = g2(0, O(), false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    @SuppressLint({"UnknownNullness"})
    public PointF d(int i15) {
        if (O() == 0) {
            return null;
        }
        int i16 = (i15 < l0(N(0))) != this.f12969x ? -1 : 1;
        return this.f12964s == 0 ? new PointF(i16, 0.0f) : new PointF(0.0f, i16);
    }

    public int e2() {
        View viewG2 = g2(O() - 1, -1, false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    View f2(int i15, int i16) {
        int i17;
        int i18;
        X1();
        if (i16 <= i15 && i16 >= i15) {
            return N(i15);
        }
        if (this.f12966u.g(N(i15)) < this.f12966u.m()) {
            i17 = 16644;
            i18 = 16388;
        } else {
            i17 = 4161;
            i18 = 4097;
        }
        return this.f12964s == 0 ? this.f13133e.a(i15, i16, i17, i18) : this.f13134f.a(i15, i16, i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.b();
            }
            x1();
        }
    }

    View g2(int i15, int i16, boolean z15, boolean z16) {
        X1();
        int i17 = z15 ? 24579 : 320;
        int i18 = z16 ? 320 : 0;
        return this.f12964s == 0 ? this.f13133e.a(i15, i16, i17, i18) : this.f13134f.a(i15, i16, i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public Parcelable h1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (O() <= 0) {
            dVar.b();
            return dVar;
        }
        X1();
        boolean z15 = this.f12967v ^ this.f12969x;
        dVar.f12996c = z15;
        if (z15) {
            View viewM2 = m2();
            dVar.f12995b = this.f12966u.i() - this.f12966u.d(viewM2);
            dVar.f12994a = l0(viewM2);
            return dVar;
        }
        View viewN2 = n2();
        dVar.f12994a = l0(viewN2);
        dVar.f12995b = this.f12966u.g(viewN2) - this.f12966u.m();
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    View j2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z15, boolean z16) {
        int i15;
        int iO;
        int i16;
        X1();
        int iO2 = O();
        if (z16) {
            iO = O() - 1;
            i15 = -1;
            i16 = -1;
        } else {
            i15 = iO2;
            iO = 0;
            i16 = 1;
        }
        int iB = b0Var.b();
        int iM = this.f12966u.m();
        int i17 = this.f12966u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iO != i15) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            int iG = this.f12966u.g(viewN);
            int iD = this.f12966u.d(viewN);
            if (iL0 >= 0 && iL0 < iB) {
                if (!((RecyclerView.q) viewN.getLayoutParams()).c()) {
                    boolean z17 = iD <= iM && iG < iM;
                    boolean z18 = iG >= i17 && iD > i17;
                    if (!z17 && !z18) {
                        return viewN;
                    }
                    if (z15) {
                        if (z18) {
                            view2 = viewN;
                        } else if (view == null) {
                            view = viewN;
                        }
                    } else if (z17) {
                        view2 = viewN;
                    } else if (view == null) {
                        view = viewN;
                    }
                } else if (view3 == null) {
                    view3 = viewN;
                }
            }
            iO += i16;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void l(String str) {
        if (this.D == null) {
            super.l(str);
        }
    }

    @Deprecated
    protected int o2(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.f12966u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f12964s == 0;
    }

    public int p2() {
        return this.f12964s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f12964s == 1;
    }

    protected boolean q2() {
        return d0() == 1;
    }

    public boolean r2() {
        return this.f12971z;
    }

    void s2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int iF;
        int i15;
        int i16;
        int i17;
        int iI0;
        int iF2;
        int i18;
        int i19;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f12978b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f12992l == null) {
            if (this.f12969x == (cVar.f12986f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.f12969x == (cVar.f12986f == -1)) {
                f(viewD);
            } else {
                h(viewD, 0);
            }
        }
        E0(viewD, 0, 0);
        bVar.f12977a = this.f12966u.e(viewD);
        if (this.f12964s == 1) {
            if (q2()) {
                iF2 = s0() - j0();
                iI0 = iF2 - this.f12966u.f(viewD);
            } else {
                iI0 = i0();
                iF2 = this.f12966u.f(viewD) + iI0;
            }
            if (cVar.f12986f == -1) {
                i19 = cVar.f12982b;
                i18 = i19 - bVar.f12977a;
            } else {
                i18 = cVar.f12982b;
                i19 = bVar.f12977a + i18;
            }
            int i25 = iI0;
            i17 = i18;
            i16 = i25;
            iF = i19;
            i15 = iF2;
        } else {
            int iK0 = k0();
            iF = this.f12966u.f(viewD) + iK0;
            if (cVar.f12986f == -1) {
                int i26 = cVar.f12982b;
                i16 = i26 - bVar.f12977a;
                i15 = i26;
            } else {
                int i27 = cVar.f12982b;
                i15 = bVar.f12977a + i27;
                i16 = i27;
            }
            i17 = iK0;
        }
        D0(viewD, i16, i17, i15, iF);
        if (qVar.c() || qVar.b()) {
            bVar.f12979c = true;
        }
        bVar.f12980d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void t(int i15, int i16, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.f12964s != 0) {
            i15 = i16;
        }
        if (O() == 0 || i15 == 0) {
            return;
        }
        X1();
        I2(i15 > 0 ? 1 : -1, Math.abs(i15), true, b0Var);
        R1(b0Var, this.f12965t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void u(int i15, RecyclerView.p.c cVar) {
        boolean z15;
        int i16;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            A2();
            z15 = this.f12969x;
            i16 = this.A;
            if (i16 == -1) {
                i16 = z15 ? i15 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z15 = dVar2.f12996c;
            i16 = dVar2.f12994a;
        }
        int i17 = z15 ? -1 : 1;
        for (int i18 = 0; i18 < this.G && i16 >= 0 && i16 < i15; i18++) {
            cVar.a(i16, 0);
            i16 += i17;
        }
    }

    void u2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i15) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int v(RecyclerView.b0 b0Var) {
        return S1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int w(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int x(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int y(RecyclerView.b0 b0Var) {
        return S1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int z(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    boolean z2() {
        return this.f12966u.k() == 0 && this.f12966u.h() == 0;
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i15, boolean z15) {
        this.f12964s = 1;
        this.f12968w = false;
        this.f12969x = false;
        this.f12970y = false;
        this.f12971z = true;
        this.A = -1;
        this.B = PKIFailureInfo.systemUnavail;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        C2(i15);
        D2(z15);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i15, int i16) {
        this.f12964s = 1;
        this.f12968w = false;
        this.f12969x = false;
        this.f12970y = false;
        this.f12971z = true;
        this.A = -1;
        this.B = PKIFailureInfo.systemUnavail;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d dVarM0 = RecyclerView.p.m0(context, attributeSet, i15, i16);
        C2(dVarM0.f13149a);
        D2(dVarM0.f13151c);
        E2(dVarM0.f13152d);
    }
}
