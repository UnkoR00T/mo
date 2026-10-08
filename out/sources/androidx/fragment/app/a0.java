package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.p016lifecycle.y0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f12389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f12390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f12391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12392d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12393e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f12394a;

        a(View view) {
            this.f12394a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f12394a.removeOnAttachStateChangeListener(this);
            j6.l0.e0(this.f12394a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12396a;

        static {
            int[] iArr = new int[androidx.lifecycle.j.b.values().length];
            f12396a = iArr;
            try {
                iArr[androidx.lifecycle.j.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12396a[androidx.lifecycle.j.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12396a[androidx.lifecycle.j.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12396a[androidx.lifecycle.j.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    a0(v vVar, b0 b0Var, o oVar) {
        this.f12389a = vVar;
        this.f12390b = b0Var;
        this.f12391c = oVar;
    }

    private boolean l(View view) {
        if (view == this.f12391c.R) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f12391c.R) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        Bundle bundle = this.f12391c.f12590b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f12391c.Y0(bundle2);
        this.f12389a.a(this.f12391c, bundle2, false);
    }

    void b() {
        o oVarM0 = FragmentManager.m0(this.f12391c.P);
        o oVarM = this.f12391c.M();
        if (oVarM0 != null && !oVarM0.equals(oVarM)) {
            o oVar = this.f12391c;
            f7.c.j(oVar, oVarM0, oVar.D);
        }
        int iJ = this.f12390b.j(this.f12391c);
        o oVar2 = this.f12391c;
        oVar2.P.addView(oVar2.R, iJ);
    }

    void c() {
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        o oVar = this.f12391c;
        o oVar2 = oVar.f12596h;
        a0 a0VarN = null;
        if (oVar2 != null) {
            a0 a0VarN2 = this.f12390b.n(oVar2.f12594f);
            if (a0VarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f12391c + " declared target fragment " + this.f12391c.f12596h + " that does not belong to this FragmentManager!");
            }
            o oVar3 = this.f12391c;
            oVar3.f12598j = oVar3.f12596h.f12594f;
            oVar3.f12596h = null;
            a0VarN = a0VarN2;
        } else {
            String str = oVar.f12598j;
            if (str != null && (a0VarN = this.f12390b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f12391c + " declared target fragment " + this.f12391c.f12598j + " that does not belong to this FragmentManager!");
            }
        }
        if (a0VarN != null) {
            a0VarN.m();
        }
        o oVar4 = this.f12391c;
        oVar4.f12621z = oVar4.f12619y.y0();
        o oVar5 = this.f12391c;
        oVar5.B = oVar5.f12619y.B0();
        this.f12389a.g(this.f12391c, false);
        this.f12391c.Z0();
        this.f12389a.b(this.f12391c, false);
    }

    int d() {
        o oVar = this.f12391c;
        if (oVar.f12619y == null) {
            return oVar.f12589a;
        }
        int iMin = this.f12393e;
        int i15 = b.f12396a[oVar.f12612u0.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i15 != 3) {
                iMin = i15 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        o oVar2 = this.f12391c;
        if (oVar2.f12606r) {
            if (oVar2.f12608s) {
                iMin = Math.max(this.f12393e, 2);
                View view = this.f12391c.R;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f12393e < 4 ? Math.min(iMin, oVar2.f12589a) : Math.min(iMin, 1);
            }
        }
        o oVar3 = this.f12391c;
        if (oVar3.f12610t && oVar3.P == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f12391c.f12601m) {
            iMin = Math.min(iMin, 1);
        }
        o oVar4 = this.f12391c;
        ViewGroup viewGroup = oVar4.P;
        k0.d.a aVarS = viewGroup != null ? k0.u(viewGroup, oVar4.N()).s(this) : null;
        if (aVarS == k0.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == k0.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            o oVar5 = this.f12391c;
            if (oVar5.f12602n) {
                iMin = oVar5.k0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        o oVar6 = this.f12391c;
        if (oVar6.T && oVar6.f12589a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f12391c.f12603p) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.L0(2)) {
            Objects.toString(this.f12391c);
        }
        return iMin;
    }

    void e() {
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        Bundle bundle = this.f12391c.f12590b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        o oVar = this.f12391c;
        if (oVar.f12609s0) {
            oVar.f12589a = 1;
            oVar.B1();
        } else {
            this.f12389a.h(oVar, bundle2, false);
            this.f12391c.c1(bundle2);
            this.f12389a.c(this.f12391c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f12391c.f12606r) {
            return;
        }
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        Bundle bundle = this.f12391c.f12590b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterI1 = this.f12391c.i1(bundle2);
        o oVar = this.f12391c;
        ViewGroup viewGroup2 = oVar.P;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i15 = oVar.D;
            if (i15 != 0) {
                if (i15 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f12391c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) oVar.f12619y.t0().e(this.f12391c.D);
                if (viewGroup == null) {
                    o oVar2 = this.f12391c;
                    if (!oVar2.f12613v && !oVar2.f12610t) {
                        try {
                            resourceName = oVar2.T().getResourceName(this.f12391c.D);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f12391c.D) + " (" + resourceName + ") for fragment " + this.f12391c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    f7.c.i(this.f12391c, viewGroup);
                }
            }
        }
        o oVar3 = this.f12391c;
        oVar3.P = viewGroup;
        oVar3.e1(layoutInflaterI1, viewGroup, bundle2);
        if (this.f12391c.R != null) {
            if (FragmentManager.L0(3)) {
                Objects.toString(this.f12391c);
            }
            this.f12391c.R.setSaveFromParentEnabled(false);
            o oVar4 = this.f12391c;
            oVar4.R.setTag(d7.b.f40108a, oVar4);
            if (viewGroup != null) {
                b();
            }
            o oVar5 = this.f12391c;
            if (oVar5.F) {
                oVar5.R.setVisibility(8);
            }
            if (this.f12391c.R.isAttachedToWindow()) {
                j6.l0.e0(this.f12391c.R);
            } else {
                View view = this.f12391c.R;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f12391c.v1();
            v vVar = this.f12389a;
            o oVar6 = this.f12391c;
            vVar.m(oVar6, oVar6.R, bundle2, false);
            int visibility = this.f12391c.R.getVisibility();
            this.f12391c.L1(this.f12391c.R.getAlpha());
            o oVar7 = this.f12391c;
            if (oVar7.P != null && visibility == 0) {
                View viewFindFocus = oVar7.R.findFocus();
                if (viewFindFocus != null) {
                    this.f12391c.G1(viewFindFocus);
                    if (FragmentManager.L0(2)) {
                        viewFindFocus.toString();
                        Objects.toString(this.f12391c);
                    }
                }
                this.f12391c.R.setAlpha(0.0f);
            }
        }
        this.f12391c.f12589a = 2;
    }

    void g() {
        o oVarF;
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        o oVar = this.f12391c;
        boolean zIsChangingConfigurations = true;
        boolean z15 = oVar.f12602n && !oVar.k0();
        if (z15) {
            o oVar2 = this.f12391c;
            if (!oVar2.f12604q) {
                this.f12390b.B(oVar2.f12594f, null);
            }
        }
        if (!z15 && !this.f12390b.p().l9(this.f12391c)) {
            String str = this.f12391c.f12598j;
            if (str != null && (oVarF = this.f12390b.f(str)) != null && oVarF.H) {
                this.f12391c.f12596h = oVarF;
            }
            this.f12391c.f12589a = 0;
            return;
        }
        t<?> tVar = this.f12391c.f12621z;
        if (tVar instanceof y0) {
            zIsChangingConfigurations = this.f12390b.p().i9();
        } else if (tVar.getContext() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) tVar.getContext()).isChangingConfigurations();
        }
        if ((z15 && !this.f12391c.f12604q) || zIsChangingConfigurations) {
            this.f12390b.p().a9(this.f12391c, false);
        }
        this.f12391c.f1();
        this.f12389a.d(this.f12391c, false);
        for (a0 a0Var : this.f12390b.k()) {
            if (a0Var != null) {
                o oVarK = a0Var.k();
                if (this.f12391c.f12594f.equals(oVarK.f12598j)) {
                    oVarK.f12596h = this.f12391c;
                    oVarK.f12598j = null;
                }
            }
        }
        o oVar3 = this.f12391c;
        String str2 = oVar3.f12598j;
        if (str2 != null) {
            oVar3.f12596h = this.f12390b.f(str2);
        }
        this.f12390b.s(this);
    }

    void h() {
        View view;
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        o oVar = this.f12391c;
        ViewGroup viewGroup = oVar.P;
        if (viewGroup != null && (view = oVar.R) != null) {
            viewGroup.removeView(view);
        }
        this.f12391c.g1();
        this.f12389a.n(this.f12391c, false);
        o oVar2 = this.f12391c;
        oVar2.P = null;
        oVar2.R = null;
        oVar2.f12616w0 = null;
        oVar2.f12618x0.o(null);
        this.f12391c.f12608s = false;
    }

    void i() {
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        this.f12391c.h1();
        this.f12389a.e(this.f12391c, false);
        o oVar = this.f12391c;
        oVar.f12589a = -1;
        oVar.f12621z = null;
        oVar.B = null;
        oVar.f12619y = null;
        if ((!oVar.f12602n || oVar.k0()) && !this.f12390b.p().l9(this.f12391c)) {
            return;
        }
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        this.f12391c.g0();
    }

    void j() {
        o oVar = this.f12391c;
        if (oVar.f12606r && oVar.f12608s && !oVar.f12615w) {
            if (FragmentManager.L0(3)) {
                Objects.toString(this.f12391c);
            }
            Bundle bundle = this.f12391c.f12590b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            o oVar2 = this.f12391c;
            oVar2.e1(oVar2.i1(bundle2), null, bundle2);
            View view = this.f12391c.R;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                o oVar3 = this.f12391c;
                oVar3.R.setTag(d7.b.f40108a, oVar3);
                o oVar4 = this.f12391c;
                if (oVar4.F) {
                    oVar4.R.setVisibility(8);
                }
                this.f12391c.v1();
                v vVar = this.f12389a;
                o oVar5 = this.f12391c;
                vVar.m(oVar5, oVar5.R, bundle2, false);
                this.f12391c.f12589a = 2;
            }
        }
    }

    o k() {
        return this.f12391c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f12392d) {
            if (FragmentManager.L0(2)) {
                Objects.toString(k());
                return;
            }
            return;
        }
        try {
            this.f12392d = true;
            boolean z15 = false;
            while (true) {
                int iD = d();
                o oVar = this.f12391c;
                int i15 = oVar.f12589a;
                if (iD == i15) {
                    if (!z15 && i15 == -1 && oVar.f12602n && !oVar.k0() && !this.f12391c.f12604q) {
                        if (FragmentManager.L0(3)) {
                            Objects.toString(this.f12391c);
                        }
                        this.f12390b.p().a9(this.f12391c, true);
                        this.f12390b.s(this);
                        if (FragmentManager.L0(3)) {
                            Objects.toString(this.f12391c);
                        }
                        this.f12391c.g0();
                    }
                    o oVar2 = this.f12391c;
                    if (oVar2.f12605q0) {
                        if (oVar2.R != null && (viewGroup = oVar2.P) != null) {
                            k0 k0VarU = k0.u(viewGroup, oVar2.N());
                            if (this.f12391c.F) {
                                k0VarU.k(this);
                            } else {
                                k0VarU.m(this);
                            }
                        }
                        o oVar3 = this.f12391c;
                        FragmentManager fragmentManager = oVar3.f12619y;
                        if (fragmentManager != null) {
                            fragmentManager.J0(oVar3);
                        }
                        o oVar4 = this.f12391c;
                        oVar4.f12605q0 = false;
                        oVar4.H0(oVar4.F);
                        this.f12391c.A.J();
                    }
                    return;
                }
                if (iD <= i15) {
                    switch (i15 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (oVar.f12604q && this.f12390b.q(oVar.f12594f) == null) {
                                this.f12390b.B(this.f12391c.f12594f, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f12391c.f12589a = 1;
                            break;
                        case 2:
                            oVar.f12608s = false;
                            oVar.f12589a = 2;
                            break;
                        case 3:
                            if (FragmentManager.L0(3)) {
                                Objects.toString(this.f12391c);
                            }
                            o oVar5 = this.f12391c;
                            if (oVar5.f12604q) {
                                this.f12390b.B(oVar5.f12594f, r());
                            } else if (oVar5.R != null && oVar5.f12591c == null) {
                                s();
                            }
                            o oVar6 = this.f12391c;
                            if (oVar6.R != null && (viewGroup2 = oVar6.P) != null) {
                                k0.u(viewGroup2, oVar6.N()).l(this);
                            }
                            this.f12391c.f12589a = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            oVar.f12589a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i15 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (oVar.R != null && (viewGroup3 = oVar.P) != null) {
                                k0.u(viewGroup3, oVar.N()).j(k0.d.b.g(this.f12391c.R.getVisibility()), this);
                            }
                            this.f12391c.f12589a = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            oVar.f12589a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z15 = true;
            }
        } finally {
            this.f12392d = false;
        }
    }

    void n() {
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        this.f12391c.n1();
        this.f12389a.f(this.f12391c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f12391c.f12590b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f12391c.f12590b.getBundle("savedInstanceState") == null) {
            this.f12391c.f12590b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            o oVar = this.f12391c;
            oVar.f12591c = oVar.f12590b.getSparseParcelableArray("viewState");
            o oVar2 = this.f12391c;
            oVar2.f12592d = oVar2.f12590b.getBundle("viewRegistryState");
            z zVar = (z) this.f12391c.f12590b.getParcelable("state");
            if (zVar != null) {
                o oVar3 = this.f12391c;
                oVar3.f12598j = zVar.f12703n;
                oVar3.f12599k = zVar.f12704p;
                Boolean bool = oVar3.f12593e;
                if (bool != null) {
                    oVar3.X = bool.booleanValue();
                    this.f12391c.f12593e = null;
                } else {
                    oVar3.X = zVar.f12705q;
                }
            }
            o oVar4 = this.f12391c;
            if (oVar4.X) {
                return;
            }
            oVar4.T = true;
        } catch (BadParcelableException e15) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e15);
        }
    }

    void p() {
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        View viewG = this.f12391c.G();
        if (viewG != null && l(viewG)) {
            viewG.requestFocus();
            if (FragmentManager.L0(2)) {
                viewG.toString();
                Objects.toString(this.f12391c);
                Objects.toString(this.f12391c.R.findFocus());
            }
        }
        this.f12391c.G1(null);
        this.f12391c.r1();
        this.f12389a.i(this.f12391c, false);
        this.f12390b.B(this.f12391c.f12594f, null);
        o oVar = this.f12391c;
        oVar.f12590b = null;
        oVar.f12591c = null;
        oVar.f12592d = null;
    }

    o.j q() {
        if (this.f12391c.f12589a > -1) {
            return new o.j(r());
        }
        return null;
    }

    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        o oVar = this.f12391c;
        if (oVar.f12589a == -1 && (bundle = oVar.f12590b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new z(this.f12391c));
        if (this.f12391c.f12589a > 0) {
            Bundle bundle3 = new Bundle();
            this.f12391c.s1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f12389a.j(this.f12391c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f12391c.f12622z0.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleN1 = this.f12391c.A.n1();
            if (!bundleN1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleN1);
            }
            if (this.f12391c.R != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f12391c.f12591c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f12391c.f12592d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f12391c.f12595g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.f12391c.R == null) {
            return;
        }
        if (FragmentManager.L0(2)) {
            Objects.toString(this.f12391c);
            Objects.toString(this.f12391c.R);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f12391c.R.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f12391c.f12591c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f12391c.f12616w0.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f12391c.f12592d = bundle;
    }

    void t(int i15) {
        this.f12393e = i15;
    }

    void u() {
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        this.f12391c.t1();
        this.f12389a.k(this.f12391c, false);
    }

    void v() {
        if (FragmentManager.L0(3)) {
            Objects.toString(this.f12391c);
        }
        this.f12391c.u1();
        this.f12389a.l(this.f12391c, false);
    }

    a0(v vVar, b0 b0Var, ClassLoader classLoader, s sVar, Bundle bundle) {
        this.f12389a = vVar;
        this.f12390b = b0Var;
        o oVarA = ((z) bundle.getParcelable("state")).a(sVar, classLoader);
        this.f12391c = oVarA;
        oVarA.f12590b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        oVarA.F1(bundle2);
        if (FragmentManager.L0(2)) {
            Objects.toString(oVarA);
        }
    }

    a0(v vVar, b0 b0Var, o oVar, Bundle bundle) {
        this.f12389a = vVar;
        this.f12390b = b0Var;
        this.f12391c = oVar;
        oVar.f12591c = null;
        oVar.f12592d = null;
        oVar.f12617x = 0;
        oVar.f12608s = false;
        oVar.f12601m = false;
        o oVar2 = oVar.f12596h;
        oVar.f12598j = oVar2 != null ? oVar2.f12594f : null;
        oVar.f12596h = null;
        oVar.f12590b = bundle;
        oVar.f12595g = bundle.getBundle("arguments");
    }
}
