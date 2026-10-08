package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    f[] f13175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    p f13176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    p f13177v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f13179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final k f13180y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f13174s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f13181z = false;
    boolean A = false;
    int C = -1;
    int D = PKIFailureInfo.systemUnavail;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.W1();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f13186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f13187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f13188f;

        b() {
            c();
        }

        void a() {
            this.f13184b = this.f13185c ? StaggeredGridLayoutManager.this.f13176u.i() : StaggeredGridLayoutManager.this.f13176u.m();
        }

        void b(int i15) {
            if (this.f13185c) {
                this.f13184b = StaggeredGridLayoutManager.this.f13176u.i() - i15;
            } else {
                this.f13184b = StaggeredGridLayoutManager.this.f13176u.m() + i15;
            }
        }

        void c() {
            this.f13183a = -1;
            this.f13184b = PKIFailureInfo.systemUnavail;
            this.f13185c = false;
            this.f13186d = false;
            this.f13187e = false;
            int[] iArr = this.f13188f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f13188f;
            if (iArr == null || iArr.length < length) {
                this.f13188f = new int[StaggeredGridLayoutManager.this.f13175t.length];
            }
            for (int i15 = 0; i15 < length; i15++) {
                this.f13188f[i15] = fVarArr[i15].p(PKIFailureInfo.systemUnavail);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f f13190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f13191f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f13191f;
        }

        public c(int i15, int i16) {
            super(i15, i16);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f13201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f13203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<d.a> f13204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f13205h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13206j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f13207k;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i15) {
                return new e[i15];
            }
        }

        public e() {
        }

        void a() {
            this.f13201d = null;
            this.f13200c = 0;
            this.f13198a = -1;
            this.f13199b = -1;
        }

        void b() {
            this.f13201d = null;
            this.f13200c = 0;
            this.f13202e = 0;
            this.f13203f = null;
            this.f13204g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            parcel.writeInt(this.f13198a);
            parcel.writeInt(this.f13199b);
            parcel.writeInt(this.f13200c);
            if (this.f13200c > 0) {
                parcel.writeIntArray(this.f13201d);
            }
            parcel.writeInt(this.f13202e);
            if (this.f13202e > 0) {
                parcel.writeIntArray(this.f13203f);
            }
            parcel.writeInt(this.f13205h ? 1 : 0);
            parcel.writeInt(this.f13206j ? 1 : 0);
            parcel.writeInt(this.f13207k ? 1 : 0);
            parcel.writeList(this.f13204g);
        }

        e(Parcel parcel) {
            this.f13198a = parcel.readInt();
            this.f13199b = parcel.readInt();
            int i15 = parcel.readInt();
            this.f13200c = i15;
            if (i15 > 0) {
                int[] iArr = new int[i15];
                this.f13201d = iArr;
                parcel.readIntArray(iArr);
            }
            int i16 = parcel.readInt();
            this.f13202e = i16;
            if (i16 > 0) {
                int[] iArr2 = new int[i16];
                this.f13203f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f13205h = parcel.readInt() == 1;
            this.f13206j = parcel.readInt() == 1;
            this.f13207k = parcel.readInt() == 1;
            this.f13204g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f13200c = eVar.f13200c;
            this.f13198a = eVar.f13198a;
            this.f13199b = eVar.f13199b;
            this.f13201d = eVar.f13201d;
            this.f13202e = eVar.f13202e;
            this.f13203f = eVar.f13203f;
            this.f13205h = eVar.f13205h;
            this.f13206j = eVar.f13206j;
            this.f13207k = eVar.f13207k;
            this.f13204g = eVar.f13204g;
        }
    }

    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<View> f13208a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13209b = PKIFailureInfo.systemUnavail;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13210c = PKIFailureInfo.systemUnavail;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13211d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f13212e;

        f(int i15) {
            this.f13212e = i15;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f13190e = this;
            this.f13208a.add(view);
            this.f13210c = PKIFailureInfo.systemUnavail;
            if (this.f13208a.size() == 1) {
                this.f13209b = PKIFailureInfo.systemUnavail;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f13211d += StaggeredGridLayoutManager.this.f13176u.e(view);
            }
        }

        void b(boolean z15, int i15) {
            int iL = z15 ? l(PKIFailureInfo.systemUnavail) : p(PKIFailureInfo.systemUnavail);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z15 || iL >= StaggeredGridLayoutManager.this.f13176u.i()) {
                if (z15 || iL <= StaggeredGridLayoutManager.this.f13176u.m()) {
                    if (i15 != Integer.MIN_VALUE) {
                        iL += i15;
                    }
                    this.f13210c = iL;
                    this.f13209b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f13208a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f13210c = StaggeredGridLayoutManager.this.f13176u.d(view);
            if (cVarN.f13191f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f13195b == 1) {
                this.f13210c += aVarF.a(this.f13212e);
            }
        }

        void d() {
            d.a aVarF;
            View view = this.f13208a.get(0);
            c cVarN = n(view);
            this.f13209b = StaggeredGridLayoutManager.this.f13176u.g(view);
            if (cVarN.f13191f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f13195b == -1) {
                this.f13209b -= aVarF.a(this.f13212e);
            }
        }

        void e() {
            this.f13208a.clear();
            q();
            this.f13211d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f13181z ? i(this.f13208a.size() - 1, -1, true) : i(0, this.f13208a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f13181z ? i(0, this.f13208a.size(), true) : i(this.f13208a.size() - 1, -1, true);
        }

        int h(int i15, int i16, boolean z15, boolean z16, boolean z17) {
            int iM = StaggeredGridLayoutManager.this.f13176u.m();
            int i17 = StaggeredGridLayoutManager.this.f13176u.i();
            int i18 = i16 > i15 ? 1 : -1;
            while (i15 != i16) {
                View view = this.f13208a.get(i15);
                int iG = StaggeredGridLayoutManager.this.f13176u.g(view);
                int iD = StaggeredGridLayoutManager.this.f13176u.d(view);
                boolean z18 = false;
                boolean z19 = !z17 ? iG >= i17 : iG > i17;
                if (!z17 ? iD > iM : iD >= iM) {
                    z18 = true;
                }
                if (z19 && z18) {
                    if (z15 && z16) {
                        if (iG >= iM && iD <= i17) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z16) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (iG < iM || iD > i17) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i15 += i18;
            }
            return -1;
        }

        int i(int i15, int i16, boolean z15) {
            return h(i15, i16, false, false, z15);
        }

        public int j() {
            return this.f13211d;
        }

        int k() {
            int i15 = this.f13210c;
            if (i15 != Integer.MIN_VALUE) {
                return i15;
            }
            c();
            return this.f13210c;
        }

        int l(int i15) {
            int i16 = this.f13210c;
            if (i16 != Integer.MIN_VALUE) {
                return i16;
            }
            if (this.f13208a.size() == 0) {
                return i15;
            }
            c();
            return this.f13210c;
        }

        public View m(int i15, int i16) {
            View view = null;
            if (i16 != -1) {
                int size = this.f13208a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f13208a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f13181z && staggeredGridLayoutManager.l0(view2) >= i15) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f13181z && staggeredGridLayoutManager2.l0(view2) <= i15) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f13208a.size();
            int i17 = 0;
            while (i17 < size2) {
                View view3 = this.f13208a.get(i17);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f13181z && staggeredGridLayoutManager3.l0(view3) <= i15) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f13181z && staggeredGridLayoutManager4.l0(view3) >= i15) || !view3.hasFocusable()) {
                    break;
                }
                i17++;
                view = view3;
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i15 = this.f13209b;
            if (i15 != Integer.MIN_VALUE) {
                return i15;
            }
            d();
            return this.f13209b;
        }

        int p(int i15) {
            int i16 = this.f13209b;
            if (i16 != Integer.MIN_VALUE) {
                return i16;
            }
            if (this.f13208a.size() == 0) {
                return i15;
            }
            d();
            return this.f13209b;
        }

        void q() {
            this.f13209b = PKIFailureInfo.systemUnavail;
            this.f13210c = PKIFailureInfo.systemUnavail;
        }

        void r(int i15) {
            int i16 = this.f13209b;
            if (i16 != Integer.MIN_VALUE) {
                this.f13209b = i16 + i15;
            }
            int i17 = this.f13210c;
            if (i17 != Integer.MIN_VALUE) {
                this.f13210c = i17 + i15;
            }
        }

        void s() {
            int size = this.f13208a.size();
            View viewRemove = this.f13208a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f13190e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f13211d -= StaggeredGridLayoutManager.this.f13176u.e(viewRemove);
            }
            if (size == 1) {
                this.f13209b = PKIFailureInfo.systemUnavail;
            }
            this.f13210c = PKIFailureInfo.systemUnavail;
        }

        void t() {
            View viewRemove = this.f13208a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f13190e = null;
            if (this.f13208a.size() == 0) {
                this.f13210c = PKIFailureInfo.systemUnavail;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f13211d -= StaggeredGridLayoutManager.this.f13176u.e(viewRemove);
            }
            this.f13209b = PKIFailureInfo.systemUnavail;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f13190e = this;
            this.f13208a.add(0, view);
            this.f13209b = PKIFailureInfo.systemUnavail;
            if (this.f13208a.size() == 1) {
                this.f13210c = PKIFailureInfo.systemUnavail;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f13211d += StaggeredGridLayoutManager.this.f13176u.e(view);
            }
        }

        void v(int i15) {
            this.f13209b = i15;
            this.f13210c = i15;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i15, int i16) {
        RecyclerView.p.d dVarM0 = RecyclerView.p.m0(context, attributeSet, i15, i16);
        L2(dVarM0.f13149a);
        N2(dVarM0.f13150b);
        M2(dVarM0.f13151c);
        this.f13180y = new k();
        e2();
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    private void A2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z15) {
        boolean z16;
        e eVar;
        b bVar = this.L;
        if (!(this.I == null && this.C == -1) && b0Var.b() == 0) {
            o1(wVar);
            bVar.c();
            return;
        }
        boolean z17 = (bVar.f13187e && this.C == -1 && this.I == null) ? false : true;
        if (z17) {
            bVar.c();
            if (this.I != null) {
                R1(bVar);
            } else {
                I2();
                bVar.f13185c = this.A;
            }
            R2(b0Var, bVar);
            bVar.f13187e = true;
        }
        if (this.I == null && this.C == -1 && (bVar.f13185c != this.G || x2() != this.H)) {
            this.E.b();
            bVar.f13186d = true;
        }
        if (O() > 0 && ((eVar = this.I) == null || eVar.f13200c < 1)) {
            if (bVar.f13186d) {
                for (int i15 = 0; i15 < this.f13174s; i15++) {
                    this.f13175t[i15].e();
                    int i16 = bVar.f13184b;
                    if (i16 != Integer.MIN_VALUE) {
                        this.f13175t[i15].v(i16);
                    }
                }
            } else if (z17 || this.L.f13188f == null) {
                for (int i17 = 0; i17 < this.f13174s; i17++) {
                    this.f13175t[i17].b(this.A, bVar.f13184b);
                }
                this.L.d(this.f13175t);
            } else {
                for (int i18 = 0; i18 < this.f13174s; i18++) {
                    f fVar = this.f13175t[i18];
                    fVar.e();
                    fVar.v(this.L.f13188f[i18]);
                }
            }
        }
        B(wVar);
        this.f13180y.f13386a = false;
        this.M = false;
        T2(this.f13177v.n());
        S2(bVar.f13183a, b0Var);
        if (bVar.f13185c) {
            K2(-1);
            f2(wVar, this.f13180y, b0Var);
            K2(1);
            k kVar = this.f13180y;
            kVar.f13388c = bVar.f13183a + kVar.f13389d;
            f2(wVar, kVar, b0Var);
        } else {
            K2(1);
            f2(wVar, this.f13180y, b0Var);
            K2(-1);
            k kVar2 = this.f13180y;
            kVar2.f13388c = bVar.f13183a + kVar2.f13389d;
            f2(wVar, kVar2, b0Var);
        }
        H2();
        if (O() > 0) {
            if (this.A) {
                l2(wVar, b0Var, true);
                m2(wVar, b0Var, false);
            } else {
                m2(wVar, b0Var, true);
                l2(wVar, b0Var, false);
            }
        }
        if (z15 && !b0Var.e() && this.F != 0 && O() > 0 && (this.M || v2() != null)) {
            s1(this.P);
            z16 = W1();
        }
        if (b0Var.e()) {
            this.L.c();
        }
        this.G = bVar.f13185c;
        this.H = x2();
        if (z16) {
            this.L.c();
            A2(wVar, b0Var, false);
        }
    }

    private boolean B2(int i15) {
        if (this.f13178w == 0) {
            return (i15 == -1) != this.A;
        }
        return ((i15 == -1) == this.A) == x2();
    }

    private void D2(View view) {
        for (int i15 = this.f13174s - 1; i15 >= 0; i15--) {
            this.f13175t[i15].u(view);
        }
    }

    private void E2(RecyclerView.w wVar, k kVar) {
        int iMin;
        if (!kVar.f13386a || kVar.f13394i) {
            return;
        }
        if (kVar.f13387b == 0) {
            if (kVar.f13390e == -1) {
                F2(wVar, kVar.f13392g);
                return;
            } else {
                G2(wVar, kVar.f13391f);
                return;
            }
        }
        if (kVar.f13390e == -1) {
            int i15 = kVar.f13391f;
            int iQ2 = i15 - q2(i15);
            F2(wVar, iQ2 < 0 ? kVar.f13392g : kVar.f13392g - Math.min(iQ2, kVar.f13387b));
        } else {
            int iR2 = r2(kVar.f13392g) - kVar.f13392g;
            if (iR2 < 0) {
                iMin = kVar.f13391f;
            } else {
                iMin = Math.min(iR2, kVar.f13387b) + kVar.f13391f;
            }
            G2(wVar, iMin);
        }
    }

    private void F2(RecyclerView.w wVar, int i15) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f13176u.g(viewN) < i15 || this.f13176u.q(viewN) < i15) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f13191f) {
                for (int i16 = 0; i16 < this.f13174s; i16++) {
                    if (this.f13175t[i16].f13208a.size() == 1) {
                        return;
                    }
                }
                for (int i17 = 0; i17 < this.f13174s; i17++) {
                    this.f13175t[i17].s();
                }
            } else if (cVar.f13190e.f13208a.size() == 1) {
                return;
            } else {
                cVar.f13190e.s();
            }
            q1(viewN, wVar);
        }
    }

    private void G2(RecyclerView.w wVar, int i15) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f13176u.d(viewN) > i15 || this.f13176u.p(viewN) > i15) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f13191f) {
                for (int i16 = 0; i16 < this.f13174s; i16++) {
                    if (this.f13175t[i16].f13208a.size() == 1) {
                        return;
                    }
                }
                for (int i17 = 0; i17 < this.f13174s; i17++) {
                    this.f13175t[i17].t();
                }
            } else if (cVar.f13190e.f13208a.size() == 1) {
                return;
            } else {
                cVar.f13190e.t();
            }
            q1(viewN, wVar);
        }
    }

    private void H2() {
        if (this.f13177v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i15 = 0; i15 < iO; i15++) {
            View viewN = N(i15);
            float fE = this.f13177v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.f13174s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i16 = this.f13179x;
        int iRound = Math.round(fMax * this.f13174s);
        if (this.f13177v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f13177v.n());
        }
        T2(iRound);
        if (this.f13179x == i16) {
            return;
        }
        for (int i17 = 0; i17 < iO; i17++) {
            View viewN2 = N(i17);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f13191f) {
                if (x2() && this.f13178w == 1) {
                    int i18 = this.f13174s;
                    int i19 = cVar.f13190e.f13212e;
                    viewN2.offsetLeftAndRight(((-((i18 - 1) - i19)) * this.f13179x) - ((-((i18 - 1) - i19)) * i16));
                } else {
                    int i25 = cVar.f13190e.f13212e;
                    int i26 = this.f13179x * i25;
                    int i27 = i25 * i16;
                    if (this.f13178w == 1) {
                        viewN2.offsetLeftAndRight(i26 - i27);
                    } else {
                        viewN2.offsetTopAndBottom(i26 - i27);
                    }
                }
            }
        }
    }

    private void I2() {
        if (this.f13178w == 1 || !x2()) {
            this.A = this.f13181z;
        } else {
            this.A = !this.f13181z;
        }
    }

    private void K2(int i15) {
        k kVar = this.f13180y;
        kVar.f13390e = i15;
        kVar.f13389d = this.A != (i15 == -1) ? -1 : 1;
    }

    private void O2(int i15, int i16) {
        for (int i17 = 0; i17 < this.f13174s; i17++) {
            if (!this.f13175t[i17].f13208a.isEmpty()) {
                U2(this.f13175t[i17], i15, i16);
            }
        }
    }

    private boolean P2(RecyclerView.b0 b0Var, b bVar) {
        bVar.f13183a = this.G ? k2(b0Var.b()) : g2(b0Var.b());
        bVar.f13184b = PKIFailureInfo.systemUnavail;
        return true;
    }

    private void Q1(View view) {
        for (int i15 = this.f13174s - 1; i15 >= 0; i15--) {
            this.f13175t[i15].a(view);
        }
    }

    private void R1(b bVar) {
        e eVar = this.I;
        int i15 = eVar.f13200c;
        if (i15 > 0) {
            if (i15 == this.f13174s) {
                for (int i16 = 0; i16 < this.f13174s; i16++) {
                    this.f13175t[i16].e();
                    e eVar2 = this.I;
                    int i17 = eVar2.f13201d[i16];
                    if (i17 != Integer.MIN_VALUE) {
                        i17 += eVar2.f13206j ? this.f13176u.i() : this.f13176u.m();
                    }
                    this.f13175t[i16].v(i17);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.f13198a = eVar3.f13199b;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f13207k;
        M2(eVar4.f13205h);
        I2();
        e eVar5 = this.I;
        int i18 = eVar5.f13198a;
        if (i18 != -1) {
            this.C = i18;
            bVar.f13185c = eVar5.f13206j;
        } else {
            bVar.f13185c = this.A;
        }
        if (eVar5.f13202e > 1) {
            d dVar = this.E;
            dVar.f13192a = eVar5.f13203f;
            dVar.f13193b = eVar5.f13204g;
        }
    }

    private void S2(int i15, RecyclerView.b0 b0Var) {
        int iN;
        int iN2;
        int iC;
        k kVar = this.f13180y;
        boolean z15 = false;
        kVar.f13387b = 0;
        kVar.f13388c = i15;
        if (!B0() || (iC = b0Var.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.A == (iC < i15)) {
                iN = this.f13176u.n();
                iN2 = 0;
            } else {
                iN2 = this.f13176u.n();
                iN = 0;
            }
        }
        if (R()) {
            this.f13180y.f13391f = this.f13176u.m() - iN2;
            this.f13180y.f13392g = this.f13176u.i() + iN;
        } else {
            this.f13180y.f13392g = this.f13176u.h() + iN;
            this.f13180y.f13391f = -iN2;
        }
        k kVar2 = this.f13180y;
        kVar2.f13393h = false;
        kVar2.f13386a = true;
        if (this.f13176u.k() == 0 && this.f13176u.h() == 0) {
            z15 = true;
        }
        kVar2.f13394i = z15;
    }

    private void U1(View view, c cVar, k kVar) {
        if (kVar.f13390e == 1) {
            if (cVar.f13191f) {
                Q1(view);
                return;
            } else {
                cVar.f13190e.a(view);
                return;
            }
        }
        if (cVar.f13191f) {
            D2(view);
        } else {
            cVar.f13190e.u(view);
        }
    }

    private void U2(f fVar, int i15, int i16) {
        int iJ = fVar.j();
        if (i15 == -1) {
            if (fVar.o() + iJ <= i16) {
                this.B.set(fVar.f13212e, false);
            }
        } else if (fVar.k() - iJ >= i16) {
            this.B.set(fVar.f13212e, false);
        }
    }

    private int V1(int i15) {
        if (O() == 0) {
            return this.A ? 1 : -1;
        }
        return (i15 < n2()) != this.A ? -1 : 1;
    }

    private int V2(int i15, int i16, int i17) {
        int mode;
        return (!(i16 == 0 && i17 == 0) && ((mode = View.MeasureSpec.getMode(i15)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i15) - i16) - i17), mode) : i15;
    }

    private boolean X1(f fVar) {
        boolean z15;
        if (!this.A) {
            if (fVar.o() > this.f13176u.m()) {
                z15 = fVar.n(fVar.f13208a.get(0)).f13191f;
                return !z15;
            }
            return false;
        }
        if (fVar.k() < this.f13176u.i()) {
            ArrayList<View> arrayList = fVar.f13208a;
            z15 = fVar.n(arrayList.get(arrayList.size() - 1)).f13191f;
            return !z15;
        }
        return false;
    }

    private int Y1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return s.a(b0Var, this.f13176u, i2(!this.N), h2(!this.N), this, this.N);
    }

    private int Z1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return s.b(b0Var, this.f13176u, i2(!this.N), h2(!this.N), this, this.N, this.A);
    }

    private int a2(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return s.c(b0Var, this.f13176u, i2(!this.N), h2(!this.N), this, this.N);
    }

    private int b2(int i15) {
        if (i15 == 1) {
            return (this.f13178w != 1 && x2()) ? 1 : -1;
        }
        if (i15 == 2) {
            return (this.f13178w != 1 && x2()) ? -1 : 1;
        }
        if (i15 == 17) {
            if (this.f13178w == 0) {
                return -1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 33) {
            if (this.f13178w == 1) {
                return -1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 66) {
            if (this.f13178w == 0) {
                return 1;
            }
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 130 && this.f13178w == 1) {
            return 1;
        }
        return PKIFailureInfo.systemUnavail;
    }

    private d.a c2(int i15) {
        d.a aVar = new d.a();
        aVar.f13196c = new int[this.f13174s];
        for (int i16 = 0; i16 < this.f13174s; i16++) {
            aVar.f13196c[i16] = i15 - this.f13175t[i16].l(i15);
        }
        return aVar;
    }

    private d.a d2(int i15) {
        d.a aVar = new d.a();
        aVar.f13196c = new int[this.f13174s];
        for (int i16 = 0; i16 < this.f13174s; i16++) {
            aVar.f13196c[i16] = this.f13175t[i16].p(i15) - i15;
        }
        return aVar;
    }

    private void e2() {
        this.f13176u = p.b(this, this.f13178w);
        this.f13177v = p.b(this, 1 - this.f13178w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int f2(RecyclerView.w wVar, k kVar, RecyclerView.b0 b0Var) {
        int i15;
        int iP2;
        f fVarT2;
        int iS2;
        int iE;
        int iM;
        int iE2;
        ?? r15;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r16 = 0;
        staggeredGridLayoutManager.B.set(0, staggeredGridLayoutManager.f13174s, true);
        if (staggeredGridLayoutManager.f13180y.f13394i) {
            i15 = kVar.f13390e == 1 ? Integer.MAX_VALUE : PKIFailureInfo.systemUnavail;
        } else {
            i15 = kVar.f13390e == 1 ? kVar.f13392g + kVar.f13387b : kVar.f13391f - kVar.f13387b;
        }
        int i16 = i15;
        staggeredGridLayoutManager.O2(kVar.f13390e, i16);
        int i17 = staggeredGridLayoutManager.A ? staggeredGridLayoutManager.f13176u.i() : staggeredGridLayoutManager.f13176u.m();
        boolean z15 = false;
        ?? r17 = staggeredGridLayoutManager;
        while (kVar.a(b0Var) && (r17.f13180y.f13394i || !r17.B.isEmpty())) {
            View viewB = kVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = r17.E.g(iA);
            ?? r18 = iG == -1 ? 1 : r16;
            if (r18 != 0) {
                fVarT2 = cVar.f13191f ? r17.f13175t[r16] : r17.t2(kVar);
                r17.E.n(iA, fVarT2);
            } else {
                fVarT2 = r17.f13175t[iG];
            }
            f fVar = fVarT2;
            cVar.f13190e = fVar;
            if (kVar.f13390e == 1) {
                r17.i(viewB);
            } else {
                r17.j(viewB, r16);
            }
            r17.z2(viewB, cVar, r16);
            if (kVar.f13390e == 1) {
                iE = cVar.f13191f ? r17.p2(i17) : fVar.l(i17);
                iS2 = r17.f13176u.e(viewB) + iE;
                if (r18 != 0 && cVar.f13191f) {
                    d.a aVarC2 = r17.c2(iE);
                    aVarC2.f13195b = -1;
                    aVarC2.f13194a = iA;
                    r17.E.a(aVarC2);
                }
            } else {
                iS2 = cVar.f13191f ? r17.s2(i17) : fVar.p(i17);
                iE = iS2 - r17.f13176u.e(viewB);
                if (r18 != 0 && cVar.f13191f) {
                    d.a aVarD2 = r17.d2(iS2);
                    aVarD2.f13195b = 1;
                    aVarD2.f13194a = iA;
                    r17.E.a(aVarD2);
                }
            }
            if (cVar.f13191f && kVar.f13389d == -1) {
                if (r18 != 0) {
                    r17.M = true;
                } else {
                    if (!(kVar.f13390e == 1 ? r17.S1() : r17.T1())) {
                        d.a aVarF = r17.E.f(iA);
                        if (aVarF != null) {
                            aVarF.f13197d = true;
                        }
                        r17.M = true;
                    }
                }
            }
            r17.U1(viewB, cVar, kVar);
            if (r17.x2() && r17.f13178w == 1) {
                iE2 = cVar.f13191f ? r17.f13177v.i() : r17.f13177v.i() - (((r17.f13174s - 1) - fVar.f13212e) * r17.f13179x);
                iM = iE2 - r17.f13177v.e(viewB);
            } else {
                iM = cVar.f13191f ? r17.f13177v.m() : (fVar.f13212e * r17.f13179x) + r17.f13177v.m();
                iE2 = r17.f13177v.e(viewB) + iM;
            }
            int i18 = iE2;
            int i19 = iM;
            if (r17.f13178w == 1) {
                r17.D0(viewB, i19, iE, i18, iS2);
                r15 = this;
            } else {
                r17.D0(viewB, iE, i19, iS2, i18);
                r15 = r17;
            }
            if (cVar.f13191f) {
                r15.O2(r15.f13180y.f13390e, i16);
            } else {
                r15.U2(fVar, r15.f13180y.f13390e, i16);
            }
            r15.E2(wVar, r15.f13180y);
            if (r15.f13180y.f13393h && viewB.hasFocusable()) {
                if (cVar.f13191f) {
                    r15.B.clear();
                } else {
                    r15.B.set(fVar.f13212e, false);
                }
            }
            z15 = true;
            r16 = 0;
            r17 = r15;
        }
        if (!z15) {
            r17.E2(wVar, r17.f13180y);
        }
        if (r17.f13180y.f13390e == -1) {
            iP2 = r17.f13176u.m() - r17.s2(r17.f13176u.m());
        } else {
            iP2 = r17.p2(r17.f13176u.i()) - r17.f13176u.i();
        }
        if (iP2 > 0) {
            return Math.min(kVar.f13387b, iP2);
        }
        return 0;
    }

    private int g2(int i15) {
        int iO = O();
        for (int i16 = 0; i16 < iO; i16++) {
            int iL0 = l0(N(i16));
            if (iL0 >= 0 && iL0 < i15) {
                return iL0;
            }
        }
        return 0;
    }

    private int k2(int i15) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iL0 = l0(N(iO));
            if (iL0 >= 0 && iL0 < i15) {
                return iL0;
            }
        }
        return 0;
    }

    private void l2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z15) {
        int i15;
        int iP2 = p2(PKIFailureInfo.systemUnavail);
        if (iP2 != Integer.MIN_VALUE && (i15 = this.f13176u.i() - iP2) > 0) {
            int i16 = i15 - (-J2(-i15, wVar, b0Var));
            if (!z15 || i16 <= 0) {
                return;
            }
            this.f13176u.r(i16);
        }
    }

    private void m2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z15) {
        int iM;
        int iS2 = s2(Integer.MAX_VALUE);
        if (iS2 != Integer.MAX_VALUE && (iM = iS2 - this.f13176u.m()) > 0) {
            int iJ2 = iM - J2(iM, wVar, b0Var);
            if (!z15 || iJ2 <= 0) {
                return;
            }
            this.f13176u.r(-iJ2);
        }
    }

    private int p2(int i15) {
        int iL = this.f13175t[0].l(i15);
        for (int i16 = 1; i16 < this.f13174s; i16++) {
            int iL2 = this.f13175t[i16].l(i15);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int q2(int i15) {
        int iP = this.f13175t[0].p(i15);
        for (int i16 = 1; i16 < this.f13174s; i16++) {
            int iP2 = this.f13175t[i16].p(i15);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int r2(int i15) {
        int iL = this.f13175t[0].l(i15);
        for (int i16 = 1; i16 < this.f13174s; i16++) {
            int iL2 = this.f13175t[i16].l(i15);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int s2(int i15) {
        int iP = this.f13175t[0].p(i15);
        for (int i16 = 1; i16 < this.f13174s; i16++) {
            int iP2 = this.f13175t[i16].p(i15);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f t2(k kVar) {
        int i15;
        int i16;
        int i17;
        if (B2(kVar.f13390e)) {
            i16 = this.f13174s - 1;
            i15 = -1;
            i17 = -1;
        } else {
            i15 = this.f13174s;
            i16 = 0;
            i17 = 1;
        }
        f fVar = null;
        if (kVar.f13390e == 1) {
            int iM = this.f13176u.m();
            int i18 = Integer.MAX_VALUE;
            while (i16 != i15) {
                f fVar2 = this.f13175t[i16];
                int iL = fVar2.l(iM);
                if (iL < i18) {
                    fVar = fVar2;
                    i18 = iL;
                }
                i16 += i17;
            }
            return fVar;
        }
        int i19 = this.f13176u.i();
        int i25 = PKIFailureInfo.systemUnavail;
        while (i16 != i15) {
            f fVar3 = this.f13175t[i16];
            int iP = fVar3.p(i19);
            if (iP > i25) {
                fVar = fVar3;
                i25 = iP;
            }
            i16 += i17;
        }
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private void u2(int i15, int i16, int i17) {
        int i18;
        int i19;
        int iO2;
        int iO3 = this.A ? o2() : n2();
        if (i17 == 8) {
            if (i15 < i16) {
                i18 = i16 + 1;
            } else {
                i18 = i15 + 1;
                i19 = i16;
            }
            this.E.h(i19);
            if (i17 != 1) {
                this.E.j(i15, i16);
            } else if (i17 != 2) {
                this.E.k(i15, i16);
            } else if (i17 == 8) {
                this.E.k(i15, 1);
                this.E.j(i16, 1);
            }
            if (i18 <= iO3) {
                return;
            }
            if (this.A) {
                iO2 = n2();
            } else {
                iO2 = o2();
            }
            if (i19 <= iO2) {
                x1();
            }
        }
        i18 = i15 + i16;
        i19 = i15;
        this.E.h(i19);
        if (i17 != 1) {
            this.E.j(i15, i16);
        } else if (i17 != 2) {
            this.E.k(i15, i16);
        } else if (i17 == 8) {
            this.E.k(i15, 1);
            this.E.j(i16, 1);
        }
        if (i18 <= iO3) {
            return;
        }
        if (this.A) {
            iO2 = n2();
        } else {
            iO2 = o2();
        }
        if (i19 <= iO2) {
            x1();
        }
    }

    private void y2(View view, int i15, int i16, boolean z15) {
        o(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i17 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iV2 = V2(i15, i17 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i18 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iV3 = V2(i16, i18 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z15 ? L1(view, iV2, iV3, cVar) : J1(view, iV2, iV3, cVar)) {
            view.measure(iV2, iV3);
        }
    }

    private void z2(View view, c cVar, boolean z15) {
        if (cVar.f13191f) {
            if (this.f13178w == 1) {
                y2(view, this.J, RecyclerView.p.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z15);
                return;
            } else {
                y2(view, RecyclerView.p.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z15);
                return;
            }
        }
        if (this.f13178w == 1) {
            y2(view, RecyclerView.p.P(this.f13179x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z15);
        } else {
            y2(view, RecyclerView.p.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.P(this.f13179x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z15);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return J2(i15, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i15) {
        e eVar = this.I;
        if (eVar != null && eVar.f13198a != i15) {
            eVar.a();
        }
        this.C = i15;
        this.D = PKIFailureInfo.systemUnavail;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return J2(i15, wVar, b0Var);
    }

    void C2(int i15, RecyclerView.b0 b0Var) {
        int iN2;
        int i16;
        if (i15 > 0) {
            iN2 = o2();
            i16 = 1;
        } else {
            iN2 = n2();
            i16 = -1;
        }
        this.f13180y.f13386a = true;
        S2(iN2, b0Var);
        K2(i16);
        k kVar = this.f13180y;
        kVar.f13388c = iN2 + kVar.f13389d;
        kVar.f13387b = Math.abs(i15);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G0(int i15) {
        super.G0(i15);
        for (int i16 = 0; i16 < this.f13174s; i16++) {
            this.f13175t[i16].r(i15);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i15, int i16) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f13178w == 1) {
            iS2 = RecyclerView.p.s(i16, rect.height() + iK0, f0());
            iS = RecyclerView.p.s(i15, (this.f13179x * this.f13174s) + iI0, g0());
        } else {
            iS = RecyclerView.p.s(i15, rect.width() + iI0, g0());
            iS2 = RecyclerView.p.s(i16, (this.f13179x * this.f13174s) + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(int i15) {
        super.H0(i15);
        for (int i16 = 0; i16 < this.f13174s; i16++) {
            this.f13175t[i16].r(i15);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.f13178w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i15 = 0; i15 < this.f13174s; i15++) {
            this.f13175t[i15].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int J2(int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i15 == 0) {
            return 0;
        }
        C2(i15, b0Var);
        int iF2 = f2(wVar, this.f13180y, b0Var);
        if (this.f13180y.f13387b >= iF2) {
            i15 = i15 < 0 ? -iF2 : iF2;
        }
        this.f13176u.r(-i15);
        this.G = this.A;
        k kVar = this.f13180y;
        kVar.f13387b = 0;
        E2(wVar, kVar);
        return i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void L2(int i15) {
        if (i15 != 0 && i15 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i15 == this.f13178w) {
            return;
        }
        this.f13178w = i15;
        p pVar = this.f13176u;
        this.f13176u = this.f13177v;
        this.f13177v = pVar;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        s1(this.P);
        for (int i15 = 0; i15 < this.f13174s; i15++) {
            this.f13175t[i15].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i15) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i15);
        N1(lVar);
    }

    public void M2(boolean z15) {
        l(null);
        e eVar = this.I;
        if (eVar != null && eVar.f13205h != z15) {
            eVar.f13205h = z15;
        }
        this.f13181z = z15;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N0(View view, int i15, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View viewG;
        View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        I2();
        int iB2 = b2(i15);
        if (iB2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewG.getLayoutParams();
        boolean z15 = cVar.f13191f;
        f fVar = cVar.f13190e;
        int iO2 = iB2 == 1 ? o2() : n2();
        S2(iO2, b0Var);
        K2(iB2);
        k kVar = this.f13180y;
        kVar.f13388c = kVar.f13389d + iO2;
        kVar.f13387b = (int) (this.f13176u.n() * 0.33333334f);
        k kVar2 = this.f13180y;
        kVar2.f13393h = true;
        kVar2.f13386a = false;
        f2(wVar, kVar2, b0Var);
        this.G = this.A;
        if (!z15 && (viewM = fVar.m(iO2, iB2)) != null && viewM != viewG) {
            return viewM;
        }
        if (B2(iB2)) {
            for (int i16 = this.f13174s - 1; i16 >= 0; i16--) {
                View viewM2 = this.f13175t[i16].m(iO2, iB2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i17 = 0; i17 < this.f13174s; i17++) {
                View viewM3 = this.f13175t[i17].m(iO2, iB2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z16 = (this.f13181z ^ true) == (iB2 == -1);
        if (!z15) {
            View viewH = H(z16 ? fVar.f() : fVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (B2(iB2)) {
            for (int i18 = this.f13174s - 1; i18 >= 0; i18--) {
                if (i18 != fVar.f13212e) {
                    View viewH2 = H(z16 ? this.f13175t[i18].f() : this.f13175t[i18].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i19 = 0; i19 < this.f13174s; i19++) {
                View viewH3 = H(z16 ? this.f13175t[i19].f() : this.f13175t[i19].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void N2(int i15) {
        l(null);
        if (i15 != this.f13174s) {
            w2();
            this.f13174s = i15;
            this.B = new BitSet(this.f13174s);
            this.f13175t = new f[this.f13174s];
            for (int i16 = 0; i16 < this.f13174s; i16++) {
                this.f13175t[i16] = new f(i16);
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            View viewI2 = i2(false);
            View viewH2 = h2(false);
            if (viewI2 == null || viewH2 == null) {
                return;
            }
            int iL0 = l0(viewI2);
            int iL1 = l0(viewH2);
            if (iL0 < iL1) {
                accessibilityEvent.setFromIndex(iL0);
                accessibilityEvent.setToIndex(iL1);
            } else {
                accessibilityEvent.setFromIndex(iL1);
                accessibilityEvent.setToIndex(iL0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.I == null;
    }

    boolean Q2(RecyclerView.b0 b0Var, b bVar) {
        int i15;
        if (!b0Var.e() && (i15 = this.C) != -1) {
            if (i15 >= 0 && i15 < b0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f13198a == -1 || eVar.f13200c < 1) {
                    View viewH = H(this.C);
                    if (viewH != null) {
                        bVar.f13183a = this.A ? o2() : n2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f13185c) {
                                bVar.f13184b = (this.f13176u.i() - this.D) - this.f13176u.d(viewH);
                            } else {
                                bVar.f13184b = (this.f13176u.m() + this.D) - this.f13176u.g(viewH);
                            }
                            return true;
                        }
                        if (this.f13176u.e(viewH) > this.f13176u.n()) {
                            bVar.f13184b = bVar.f13185c ? this.f13176u.i() : this.f13176u.m();
                            return true;
                        }
                        int iG = this.f13176u.g(viewH) - this.f13176u.m();
                        if (iG < 0) {
                            bVar.f13184b = -iG;
                            return true;
                        }
                        int i16 = this.f13176u.i() - this.f13176u.d(viewH);
                        if (i16 < 0) {
                            bVar.f13184b = i16;
                            return true;
                        }
                        bVar.f13184b = PKIFailureInfo.systemUnavail;
                    } else {
                        int i17 = this.C;
                        bVar.f13183a = i17;
                        int i18 = this.D;
                        if (i18 == Integer.MIN_VALUE) {
                            bVar.f13185c = V1(i17) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i18);
                        }
                        bVar.f13186d = true;
                    }
                } else {
                    bVar.f13184b = PKIFailureInfo.systemUnavail;
                    bVar.f13183a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = PKIFailureInfo.systemUnavail;
        }
        return false;
    }

    void R2(RecyclerView.b0 b0Var, b bVar) {
        if (Q2(b0Var, bVar) || P2(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f13183a = 0;
    }

    boolean S1() {
        int iL = this.f13175t[0].l(PKIFailureInfo.systemUnavail);
        for (int i15 = 1; i15 < this.f13174s; i15++) {
            if (this.f13175t[i15].l(PKIFailureInfo.systemUnavail) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean T1() {
        int iP = this.f13175t[0].p(PKIFailureInfo.systemUnavail);
        for (int i15 = 1; i15 < this.f13174s; i15++) {
            if (this.f13175t[i15].p(PKIFailureInfo.systemUnavail) != iP) {
                return false;
            }
        }
        return true;
    }

    void T2(int i15) {
        this.f13179x = i15 / this.f13174s;
        this.J = View.MeasureSpec.makeMeasureSpec(i15, this.f13177v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i15, int i16) {
        u2(i15, i16, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        this.E.b();
        x1();
    }

    boolean W1() {
        int iN2;
        int iO2;
        if (O() == 0 || this.F == 0 || !v0()) {
            return false;
        }
        if (this.A) {
            iN2 = o2();
            iO2 = n2();
        } else {
            iN2 = n2();
            iO2 = o2();
        }
        if (iN2 == 0 && v2() != null) {
            this.E.b();
            y1();
            x1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i15 = this.A ? -1 : 1;
        int i16 = iO2 + 1;
        d.a aVarE = this.E.e(iN2, i16, i15, true);
        if (aVarE == null) {
            this.M = false;
            this.E.d(i16);
            return false;
        }
        d.a aVarE2 = this.E.e(iN2, aVarE.f13194a, i15 * (-1), true);
        if (aVarE2 == null) {
            this.E.d(aVarE.f13194a);
        } else {
            this.E.d(aVarE2.f13194a + 1);
        }
        y1();
        x1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i15, int i16, int i17) {
        u2(i15, i16, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i15, int i16) {
        u2(i15, i16, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i15, int i16, Object obj) {
        u2(i15, i16, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        A2(wVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.b0 b0Var) {
        super.c1(b0Var);
        this.C = -1;
        this.D = PKIFailureInfo.systemUnavail;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF d(int i15) {
        int iV1 = V1(i15);
        PointF pointF = new PointF();
        if (iV1 == 0) {
            return null;
        }
        if (this.f13178w == 0) {
            pointF.x = iV1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iV1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.a();
                this.I.b();
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable h1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f13205h = this.f13181z;
        eVar.f13206j = this.G;
        eVar.f13207k = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f13192a) == null) {
            eVar.f13202e = 0;
        } else {
            eVar.f13203f = iArr;
            eVar.f13202e = iArr.length;
            eVar.f13204g = dVar.f13193b;
        }
        if (O() <= 0) {
            eVar.f13198a = -1;
            eVar.f13199b = -1;
            eVar.f13200c = 0;
            return eVar;
        }
        eVar.f13198a = this.G ? o2() : n2();
        eVar.f13199b = j2();
        int i15 = this.f13174s;
        eVar.f13200c = i15;
        eVar.f13201d = new int[i15];
        for (int i16 = 0; i16 < this.f13174s; i16++) {
            if (this.G) {
                iP = this.f13175t[i16].l(PKIFailureInfo.systemUnavail);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f13176u.i();
                    iP -= iM;
                }
            } else {
                iP = this.f13175t[i16].p(PKIFailureInfo.systemUnavail);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f13176u.m();
                    iP -= iM;
                }
            }
            eVar.f13201d[i16] = iP;
        }
        return eVar;
    }

    View h2(boolean z15) {
        int iM = this.f13176u.m();
        int i15 = this.f13176u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.f13176u.g(viewN);
            int iD = this.f13176u.d(viewN);
            if (iD > iM && iG < i15) {
                if (iD <= i15 || !z15) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(int i15) {
        if (i15 == 0) {
            W1();
        }
    }

    View i2(boolean z15) {
        int iM = this.f13176u.m();
        int i15 = this.f13176u.i();
        int iO = O();
        View view = null;
        for (int i16 = 0; i16 < iO; i16++) {
            View viewN = N(i16);
            int iG = this.f13176u.g(viewN);
            if (this.f13176u.d(viewN) > iM && iG < i15) {
                if (iG >= iM || !z15) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    int j2() {
        View viewH2 = this.A ? h2(true) : i2(true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(String str) {
        if (this.I == null) {
            super.l(str);
        }
    }

    int n2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    int o2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return l0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f13178w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f13178w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i15, int i16, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.f13178w != 0) {
            i15 = i16;
        }
        if (O() == 0 || i15 == 0) {
            return;
        }
        C2(i15, b0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f13174s) {
            this.O = new int[this.f13174s];
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f13174s; i18++) {
            k kVar = this.f13180y;
            if (kVar.f13389d == -1) {
                iL = kVar.f13391f;
                iP = this.f13175t[i18].p(iL);
            } else {
                iL = this.f13175t[i18].l(kVar.f13392g);
                iP = this.f13180y.f13392g;
            }
            int i19 = iL - iP;
            if (i19 >= 0) {
                this.O[i17] = i19;
                i17++;
            }
        }
        Arrays.sort(this.O, 0, i17);
        for (int i25 = 0; i25 < i17 && this.f13180y.a(b0Var); i25++) {
            cVar.a(this.f13180y.f13388c, this.O[i25]);
            k kVar2 = this.f13180y;
            kVar2.f13388c += kVar2.f13389d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return Y1(b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    View v2() {
        int i15;
        View viewN;
        int iG;
        int iG2;
        boolean z15;
        boolean z16;
        int iD;
        int iD2;
        int iO = O();
        int i16 = iO - 1;
        BitSet bitSet = new BitSet(this.f13174s);
        bitSet.set(0, this.f13174s, true);
        byte b15 = (this.f13178w == 1 && x2()) ? (byte) 1 : (byte) -1;
        if (this.A) {
            iO = -1;
        } else {
            i16 = 0;
        }
        int i17 = i16 < iO ? 1 : -1;
        while (i16 != iO) {
            View viewN2 = N(i16);
            c cVar = (c) viewN2.getLayoutParams();
            if (!bitSet.get(cVar.f13190e.f13212e)) {
                if (!cVar.f13191f && (i15 = i16 + i17) != iO) {
                    viewN = N(i15);
                    if (this.A) {
                        iD = this.f13176u.d(viewN2);
                        iD2 = this.f13176u.d(viewN);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f13190e.f13212e - ((c) viewN.getLayoutParams()).f13190e.f13212e < 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (b15 < 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z15 != z16) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f13176u.g(viewN2);
                        iG2 = this.f13176u.g(viewN);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f13190e.f13212e - ((c) viewN.getLayoutParams()).f13190e.f13212e < 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (b15 < 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z15 != z16) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i16 += i17;
            } else if (!X1(cVar.f13190e)) {
                bitSet.clear(cVar.f13190e.f13212e);
                if (!cVar.f13191f) {
                    viewN = N(i15);
                    if (this.A) {
                        iD = this.f13176u.d(viewN2);
                        iD2 = this.f13176u.d(viewN);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f13190e.f13212e - ((c) viewN.getLayoutParams()).f13190e.f13212e < 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (b15 < 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z15 != z16) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f13176u.g(viewN2);
                        iG2 = this.f13176u.g(viewN);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f13190e.f13212e - ((c) viewN.getLayoutParams()).f13190e.f13212e < 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (b15 < 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z15 != z16) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i16 += i17;
            }
            return viewN2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return this.F != 0;
    }

    public void w2() {
        this.E.b();
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    boolean x2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.b0 b0Var) {
        return Y1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f13192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<a> f13193b;

        d() {
        }

        private int i(int i15) {
            if (this.f13193b == null) {
                return -1;
            }
            a aVarF = f(i15);
            if (aVarF != null) {
                this.f13193b.remove(aVarF);
            }
            int size = this.f13193b.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size) {
                    i16 = -1;
                    break;
                }
                if (this.f13193b.get(i16).f13194a >= i15) {
                    break;
                }
                i16++;
            }
            if (i16 == -1) {
                return -1;
            }
            a aVar = this.f13193b.get(i16);
            this.f13193b.remove(i16);
            return aVar.f13194a;
        }

        private void l(int i15, int i16) {
            List<a> list = this.f13193b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f13193b.get(size);
                int i17 = aVar.f13194a;
                if (i17 >= i15) {
                    aVar.f13194a = i17 + i16;
                }
            }
        }

        private void m(int i15, int i16) {
            List<a> list = this.f13193b;
            if (list == null) {
                return;
            }
            int i17 = i15 + i16;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f13193b.get(size);
                int i18 = aVar.f13194a;
                if (i18 >= i15) {
                    if (i18 < i17) {
                        this.f13193b.remove(size);
                    } else {
                        aVar.f13194a = i18 - i16;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f13193b == null) {
                this.f13193b = new ArrayList();
            }
            int size = this.f13193b.size();
            for (int i15 = 0; i15 < size; i15++) {
                a aVar2 = this.f13193b.get(i15);
                if (aVar2.f13194a == aVar.f13194a) {
                    this.f13193b.remove(i15);
                }
                if (aVar2.f13194a >= aVar.f13194a) {
                    this.f13193b.add(i15, aVar);
                    return;
                }
            }
            this.f13193b.add(aVar);
        }

        void b() {
            int[] iArr = this.f13192a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f13193b = null;
        }

        void c(int i15) {
            int[] iArr = this.f13192a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i15, 10) + 1];
                this.f13192a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i15 >= iArr.length) {
                int[] iArr3 = new int[o(i15)];
                this.f13192a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f13192a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i15) {
            List<a> list = this.f13193b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f13193b.get(size).f13194a >= i15) {
                        this.f13193b.remove(size);
                    }
                }
            }
            return h(i15);
        }

        public a e(int i15, int i16, int i17, boolean z15) {
            List<a> list = this.f13193b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i18 = 0; i18 < size; i18++) {
                a aVar = this.f13193b.get(i18);
                int i19 = aVar.f13194a;
                if (i19 >= i16) {
                    return null;
                }
                if (i19 >= i15 && (i17 == 0 || aVar.f13195b == i17 || (z15 && aVar.f13197d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i15) {
            List<a> list = this.f13193b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f13193b.get(size);
                if (aVar.f13194a == i15) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i15) {
            int[] iArr = this.f13192a;
            if (iArr == null || i15 >= iArr.length) {
                return -1;
            }
            return iArr[i15];
        }

        int h(int i15) {
            int[] iArr = this.f13192a;
            if (iArr == null || i15 >= iArr.length) {
                return -1;
            }
            int i16 = i(i15);
            if (i16 == -1) {
                int[] iArr2 = this.f13192a;
                Arrays.fill(iArr2, i15, iArr2.length, -1);
                return this.f13192a.length;
            }
            int iMin = Math.min(i16 + 1, this.f13192a.length);
            Arrays.fill(this.f13192a, i15, iMin, -1);
            return iMin;
        }

        void j(int i15, int i16) {
            int[] iArr = this.f13192a;
            if (iArr == null || i15 >= iArr.length) {
                return;
            }
            int i17 = i15 + i16;
            c(i17);
            int[] iArr2 = this.f13192a;
            System.arraycopy(iArr2, i15, iArr2, i17, (iArr2.length - i15) - i16);
            Arrays.fill(this.f13192a, i15, i17, -1);
            l(i15, i16);
        }

        void k(int i15, int i16) {
            int[] iArr = this.f13192a;
            if (iArr == null || i15 >= iArr.length) {
                return;
            }
            int i17 = i15 + i16;
            c(i17);
            int[] iArr2 = this.f13192a;
            System.arraycopy(iArr2, i17, iArr2, i15, (iArr2.length - i15) - i16);
            int[] iArr3 = this.f13192a;
            Arrays.fill(iArr3, iArr3.length - i16, iArr3.length, -1);
            m(i15, i16);
        }

        void n(int i15, f fVar) {
            c(i15);
            this.f13192a[i15] = fVar.f13212e;
        }

        int o(int i15) {
            int length = this.f13192a.length;
            while (length <= i15) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0275a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f13194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f13195b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int[] f13196c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f13197d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0275a implements Parcelable.Creator<a> {
                C0275a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i15) {
                    return new a[i15];
                }
            }

            a(Parcel parcel) {
                this.f13194a = parcel.readInt();
                this.f13195b = parcel.readInt();
                this.f13197d = parcel.readInt() == 1;
                int i15 = parcel.readInt();
                if (i15 > 0) {
                    int[] iArr = new int[i15];
                    this.f13196c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i15) {
                int[] iArr = this.f13196c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i15];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f13194a + ", mGapDir=" + this.f13195b + ", mHasUnwantedGapAfter=" + this.f13197d + ", mGapPerSpan=" + Arrays.toString(this.f13196c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i15) {
                parcel.writeInt(this.f13194a);
                parcel.writeInt(this.f13195b);
                parcel.writeInt(this.f13197d ? 1 : 0);
                int[] iArr = this.f13196c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f13196c);
                }
            }

            a() {
            }
        }
    }
}
