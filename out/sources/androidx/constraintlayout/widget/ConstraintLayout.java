package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n5.l;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static j B;
    private ArrayList<d> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray<View> f11290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.b> f11291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected n5.f f11292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f11297h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.constraintlayout.widget.d f11299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f11300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap<String, Integer> f11302n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f11305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f11306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f11307t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f11308v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private SparseArray<n5.e> f11309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    c f11310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f11311y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f11312z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11313a;

        static {
            int[] iArr = new int[n5.e.b.values().length];
            f11313a = iArr;
            try {
                iArr[n5.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11313a[n5.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11313a[n5.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11313a[n5.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements o5.b.InterfaceC3522b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f11364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f11368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f11369f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11370g;

        c(ConstraintLayout constraintLayout) {
            this.f11364a = constraintLayout;
        }

        private boolean d(int i15, int i16, int i17) {
            if (i15 == i16) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i15);
            int mode2 = View.MeasureSpec.getMode(i16);
            int size = View.MeasureSpec.getSize(i16);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i17 == size;
            }
            return false;
        }

        @Override // o5.b.InterfaceC3522b
        public final void a() {
            int childCount = this.f11364a.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = this.f11364a.getChildAt(i15);
                if (childAt instanceof g) {
                    ((g) childAt).a(this.f11364a);
                }
            }
            int size = this.f11364a.f11291b.size();
            if (size > 0) {
                for (int i16 = 0; i16 < size; i16++) {
                    ((androidx.constraintlayout.widget.b) this.f11364a.f11291b.get(i16)).p(this.f11364a);
                }
            }
        }

        @Override // o5.b.InterfaceC3522b
        @SuppressLint({"WrongCall"})
        public final void b(n5.e eVar, o5.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i15;
            if (eVar == null) {
                return;
            }
            if (eVar.X() == 8 && !eVar.l0()) {
                aVar.f142372e = 0;
                aVar.f142373f = 0;
                aVar.f142374g = 0;
                return;
            }
            if (eVar.L() == null) {
                return;
            }
            ConstraintLayout.b(ConstraintLayout.this);
            n5.e.b bVar = aVar.f142368a;
            n5.e.b bVar2 = aVar.f142369b;
            int i16 = aVar.f142370c;
            int i17 = aVar.f142371d;
            int i18 = this.f11365b + this.f11366c;
            int i19 = this.f11367d;
            View view = (View) eVar.s();
            int[] iArr = a.f11313a;
            int i25 = iArr[bVar.ordinal()];
            if (i25 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            } else if (i25 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f11369f, i19, -2);
            } else if (i25 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f11369f, i19 + eVar.B(), -1);
            } else if (i25 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f11369f, i19, -2);
                boolean z15 = eVar.f131883w == 1;
                int i26 = aVar.f142377j;
                if (i26 == o5.b.a.f142366l || i26 == o5.b.a.f142367m) {
                    boolean z16 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f142377j == o5.b.a.f142367m || !z15 || ((z15 && z16) || (view instanceof g) || eVar.p0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.Y(), 1073741824);
                    }
                }
            }
            int i27 = iArr[bVar2.ordinal()];
            if (i27 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
            } else if (i27 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f11370g, i18, -2);
            } else if (i27 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f11370g, i18 + eVar.W(), -1);
            } else if (i27 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f11370g, i18, -2);
                boolean z17 = eVar.f131885x == 1;
                int i28 = aVar.f142377j;
                if (i28 == o5.b.a.f142366l || i28 == o5.b.a.f142367m) {
                    boolean z18 = view.getMeasuredWidth() == eVar.Y();
                    if (aVar.f142377j == o5.b.a.f142367m || !z17 || ((z17 && z18) || (view instanceof g) || eVar.q0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            n5.f fVar = (n5.f) eVar.L();
            if (fVar != null && n5.k.b(ConstraintLayout.this.f11298j, 256) && view.getMeasuredWidth() == eVar.Y() && view.getMeasuredWidth() < fVar.Y() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.o0() && d(eVar.C(), iMakeMeasureSpec, eVar.Y()) && d(eVar.D(), iMakeMeasureSpec2, eVar.x())) {
                aVar.f142372e = eVar.Y();
                aVar.f142373f = eVar.x();
                aVar.f142374g = eVar.p();
                return;
            }
            n5.e.b bVar3 = n5.e.b.MATCH_CONSTRAINT;
            boolean z19 = bVar == bVar3;
            boolean z25 = bVar2 == bVar3;
            n5.e.b bVar4 = n5.e.b.MATCH_PARENT;
            boolean z26 = bVar2 == bVar4 || bVar2 == n5.e.b.FIXED;
            boolean z27 = bVar == bVar4 || bVar == n5.e.b.FIXED;
            boolean z28 = z19 && eVar.f131846d0 > 0.0f;
            boolean z29 = z25 && eVar.f131846d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i29 = aVar.f142377j;
            if (i29 != o5.b.a.f142366l && i29 != o5.b.a.f142367m && z19 && eVar.f131883w == 0 && z25 && eVar.f131885x == 0) {
                i15 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof k) && (eVar instanceof l)) {
                    ((k) view).t((l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.Y0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i35 = eVar.f131889z;
                iMax = i35 > 0 ? Math.max(i35, measuredWidth) : measuredWidth;
                int i36 = eVar.A;
                if (i36 > 0) {
                    iMax = Math.min(i36, iMax);
                }
                int i37 = eVar.C;
                iMax2 = i37 > 0 ? Math.max(i37, measuredHeight) : measuredHeight;
                boolean z35 = z27;
                int i38 = eVar.D;
                if (i38 > 0) {
                    iMax2 = Math.min(i38, iMax2);
                }
                boolean z36 = z26;
                if (!n5.k.b(ConstraintLayout.this.f11298j, 1)) {
                    if (z28 && z36) {
                        iMax = (int) ((iMax2 * eVar.f131846d0) + 0.5f);
                    } else if (z29 && z35) {
                        iMax2 = (int) ((iMax / eVar.f131846d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    eVar.Y0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i15 = -1;
            }
            boolean z37 = baseline != i15;
            aVar.f142376i = (iMax == aVar.f142370c && iMax2 == aVar.f142371d) ? false : true;
            if (bVar5.f11327g0) {
                z37 = true;
            }
            if (z37 && baseline != -1 && eVar.p() != baseline) {
                aVar.f142376i = true;
            }
            aVar.f142372e = iMax;
            aVar.f142373f = iMax2;
            aVar.f142375h = z37;
            aVar.f142374g = baseline;
            ConstraintLayout.b(ConstraintLayout.this);
        }

        public void c(int i15, int i16, int i17, int i18, int i19, int i25) {
            this.f11365b = i17;
            this.f11366c = i18;
            this.f11367d = i19;
            this.f11368e = i25;
            this.f11369f = i15;
            this.f11370g = i16;
        }
    }

    public interface d {
        boolean a(int i15, int i16, int i17, View view, b bVar);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11290a = new SparseArray<>();
        this.f11291b = new ArrayList<>(4);
        this.f11292c = new n5.f();
        this.f11293d = 0;
        this.f11294e = 0;
        this.f11295f = Integer.MAX_VALUE;
        this.f11296g = Integer.MAX_VALUE;
        this.f11297h = true;
        this.f11298j = 257;
        this.f11299k = null;
        this.f11300l = null;
        this.f11301m = -1;
        this.f11302n = new HashMap<>();
        this.f11303p = -1;
        this.f11304q = -1;
        this.f11305r = -1;
        this.f11306s = -1;
        this.f11307t = 0;
        this.f11308v = 0;
        this.f11309w = new SparseArray<>();
        this.f11310x = new c(this);
        this.f11311y = 0;
        this.f11312z = 0;
        s(attributeSet, 0, 0);
    }

    private void B(n5.e eVar, b bVar, SparseArray<n5.e> sparseArray, int i15, n5.d.a aVar) {
        View view = this.f11290a.get(i15);
        n5.e eVar2 = sparseArray.get(i15);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f11327g0 = true;
        n5.d.a aVar2 = n5.d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f11327g0 = true;
            bVar2.f11357v0.N0(true);
        }
        eVar.o(aVar2).b(eVar2.o(aVar), bVar.D, bVar.C, true);
        eVar.N0(true);
        eVar.o(n5.d.a.TOP).q();
        eVar.o(n5.d.a.BOTTOM).q();
    }

    private boolean C() {
        int childCount = getChildCount();
        boolean z15 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15).isLayoutRequested()) {
                z15 = true;
                break;
            }
        }
        if (z15) {
            y();
        }
        return z15;
    }

    static /* synthetic */ g5.e b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static j getSharedValues() {
        if (B == null) {
            B = new j();
        }
        return B;
    }

    private n5.e o(int i15) {
        if (i15 == 0) {
            return this.f11292c;
        }
        View viewFindViewById = this.f11290a.get(i15);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i15)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f11292c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f11357v0;
    }

    private void s(AttributeSet attributeSet, int i15, int i16) {
        this.f11292c.E0(this);
        this.f11292c.a2(this.f11310x);
        this.f11290a.put(getId(), this);
        this.f11299k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0, i15, i16);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i17);
                if (index == i.f11577f1) {
                    this.f11293d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f11293d);
                } else if (index == i.f11586g1) {
                    this.f11294e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f11294e);
                } else if (index == i.f11559d1) {
                    this.f11295f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f11295f);
                } else if (index == i.f11568e1) {
                    this.f11296g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f11296g);
                } else if (index == i.O2) {
                    this.f11298j = typedArrayObtainStyledAttributes.getInt(index, this.f11298j);
                } else if (index == i.J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f11300l = null;
                        }
                    }
                } else if (index == i.f11649n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f11299k = dVar;
                        dVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f11299k = null;
                    }
                    this.f11301m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f11292c.b2(this.f11298j);
    }

    private void u() {
        this.f11297h = true;
        this.f11303p = -1;
        this.f11304q = -1;
        this.f11305r = -1;
        this.f11306s = -1;
        this.f11307t = 0;
        this.f11308v = 0;
    }

    private void y() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            n5.e eVarR = r(getChildAt(i15));
            if (eVarR != null) {
                eVarR.v0();
            }
        }
        if (zIsInEditMode) {
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    o(childAt.getId()).F0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f11301m != -1) {
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt2 = getChildAt(i17);
                if (childAt2.getId() == this.f11301m && (childAt2 instanceof e)) {
                    this.f11299k = ((e) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.d dVar = this.f11299k;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f11292c.y1();
        int size = this.f11291b.size();
        if (size > 0) {
            for (int i18 = 0; i18 < size; i18++) {
                this.f11291b.get(i18).r(this);
            }
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt3 = getChildAt(i19);
            if (childAt3 instanceof g) {
                ((g) childAt3).b(this);
            }
        }
        this.f11309w.clear();
        this.f11309w.put(0, this.f11292c);
        this.f11309w.put(getId(), this.f11292c);
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            this.f11309w.put(childAt4.getId(), r(childAt4));
        }
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt5 = getChildAt(i26);
            n5.e eVarR2 = r(childAt5);
            if (eVarR2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f11292c.a(eVarR2);
                f(zIsInEditMode, childAt5, eVarR2, bVar, this.f11309w);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 n5.e$b) = (r2v3 n5.e$b), (r2v0 n5.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void A(n5.f fVar, int i15, int i16, int i17, int i18) {
        n5.e.b bVar;
        c cVar = this.f11310x;
        int i19 = cVar.f11368e;
        int i25 = cVar.f11367d;
        n5.e.b bVar2 = n5.e.b.FIXED;
        int childCount = getChildCount();
        if (i15 == Integer.MIN_VALUE) {
            bVar = n5.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i16 = Math.max(0, this.f11293d);
            }
        } else if (i15 == 0) {
            bVar = n5.e.b.WRAP_CONTENT;
            i16 = childCount == 0 ? Math.max(0, this.f11293d) : 0;
        } else if (i15 != 1073741824) {
            bVar = bVar2;
        } else {
            i16 = Math.min(this.f11295f - i25, i16);
            bVar = bVar2;
        }
        if (i17 == Integer.MIN_VALUE) {
            bVar2 = n5.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i18 = Math.max(0, this.f11294e);
            }
        } else if (i17 == 0) {
            bVar2 = n5.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i18 = Math.max(0, this.f11294e);
            } else {
                i18 = 0;
            }
        } else if (i17 != 1073741824) {
            i18 = 0;
        } else {
            i18 = Math.min(this.f11296g - i19, i18);
        }
        if (i16 != fVar.Y() || i18 != fVar.x()) {
            fVar.S1();
        }
        fVar.p1(0);
        fVar.q1(0);
        fVar.a1(this.f11295f - i25);
        fVar.Z0(this.f11296g - i19);
        fVar.d1(0);
        fVar.c1(0);
        fVar.S0(bVar);
        fVar.n1(i16);
        fVar.j1(bVar2);
        fVar.O0(i18);
        fVar.d1(this.f11293d - i25);
        fVar.c1(this.f11294e - i19);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f11291b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f11291b.get(i15).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i17 = Integer.parseInt(strArrSplit[0]);
                        int i18 = Integer.parseInt(strArrSplit[1]);
                        int i19 = Integer.parseInt(strArrSplit[2]);
                        int i25 = (int) ((i17 / 1080.0f) * width);
                        int i26 = (int) ((i18 / 1920.0f) * height);
                        int i27 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f15 = i25;
                        float f16 = i26;
                        float f17 = i25 + ((int) ((i19 / 1080.0f) * width));
                        canvas.drawLine(f15, f16, f17, f16, paint);
                        float f18 = i26 + i27;
                        canvas.drawLine(f17, f16, f17, f18, paint);
                        canvas.drawLine(f17, f18, f15, f18, paint);
                        canvas.drawLine(f15, f18, f15, f16, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f15, f16, f17, f18, paint);
                        canvas.drawLine(f15, f18, f17, f16, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    protected void f(boolean z15, View view, n5.e eVar, b bVar, SparseArray<n5.e> sparseArray) {
        n5.e eVar2;
        n5.e eVar3;
        n5.e eVar4;
        n5.e eVar5;
        b bVar2;
        n5.e eVar6;
        float f15;
        int i15;
        bVar.a();
        bVar.f11359w0 = false;
        eVar.m1(view.getVisibility());
        if (bVar.f11333j0) {
            eVar.W0(true);
            eVar.m1(8);
        }
        eVar.E0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).n(eVar, this.f11292c.U1());
        }
        if (bVar.f11329h0) {
            n5.h hVar = (n5.h) eVar;
            int i16 = bVar.f11351s0;
            int i17 = bVar.f11353t0;
            float f16 = bVar.f11355u0;
            if (f16 != -1.0f) {
                hVar.C1(f16);
                return;
            } else if (i16 != -1) {
                hVar.A1(i16);
                return;
            } else {
                if (i17 != -1) {
                    hVar.B1(i17);
                    return;
                }
                return;
            }
        }
        int i18 = bVar.f11337l0;
        int i19 = bVar.f11339m0;
        int i25 = bVar.f11341n0;
        int i26 = bVar.f11343o0;
        int i27 = bVar.f11345p0;
        int i28 = bVar.f11347q0;
        float f17 = bVar.f11349r0;
        int i29 = bVar.f11344p;
        if (i29 != -1) {
            n5.e eVar7 = sparseArray.get(i29);
            if (eVar7 != null) {
                eVar.l(eVar7, bVar.f11348r, bVar.f11346q);
            }
            eVar6 = eVar;
            bVar2 = bVar;
        } else {
            if (i18 != -1) {
                n5.e eVar8 = sparseArray.get(i18);
                if (eVar8 != null) {
                    n5.d.a aVar = n5.d.a.LEFT;
                    eVar.g0(aVar, eVar8, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i27);
                }
            } else if (i19 != -1 && (eVar2 = sparseArray.get(i19)) != null) {
                eVar.g0(n5.d.a.LEFT, eVar2, n5.d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i27);
            }
            if (i25 != -1) {
                n5.e eVar9 = sparseArray.get(i25);
                if (eVar9 != null) {
                    eVar.g0(n5.d.a.RIGHT, eVar9, n5.d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i28);
                }
            } else if (i26 != -1 && (eVar3 = sparseArray.get(i26)) != null) {
                n5.d.a aVar2 = n5.d.a.RIGHT;
                eVar.g0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i28);
            }
            int i35 = bVar.f11330i;
            if (i35 != -1) {
                n5.e eVar10 = sparseArray.get(i35);
                if (eVar10 != null) {
                    n5.d.a aVar3 = n5.d.a.TOP;
                    eVar.g0(aVar3, eVar10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f11360x);
                }
            } else {
                int i36 = bVar.f11332j;
                if (i36 != -1 && (eVar4 = sparseArray.get(i36)) != null) {
                    eVar.g0(n5.d.a.TOP, eVar4, n5.d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f11360x);
                }
            }
            int i37 = bVar.f11334k;
            if (i37 != -1) {
                n5.e eVar11 = sparseArray.get(i37);
                if (eVar11 != null) {
                    eVar.g0(n5.d.a.BOTTOM, eVar11, n5.d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f11362z);
                }
            } else {
                int i38 = bVar.f11336l;
                if (i38 != -1 && (eVar5 = sparseArray.get(i38)) != null) {
                    n5.d.a aVar4 = n5.d.a.BOTTOM;
                    eVar.g0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f11362z);
                }
            }
            int i39 = bVar.f11338m;
            if (i39 != -1) {
                bVar2 = bVar;
                B(eVar, bVar2, sparseArray, i39, n5.d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i45 = bVar2.f11340n;
                if (i45 != -1) {
                    B(eVar, bVar2, sparseArray, i45, n5.d.a.TOP);
                } else {
                    int i46 = bVar2.f11342o;
                    if (i46 != -1) {
                        B(eVar, bVar2, sparseArray, i46, n5.d.a.BOTTOM);
                        eVar6 = eVar;
                    }
                    if (f17 >= 0.0f) {
                        eVar6.P0(f17);
                    }
                    f15 = bVar2.H;
                    if (f15 >= 0.0f) {
                        eVar6.g1(f15);
                    }
                }
            }
            eVar6 = eVar;
            if (f17 >= 0.0f) {
                eVar6.P0(f17);
            }
            f15 = bVar2.H;
            if (f15 >= 0.0f) {
                eVar6.g1(f15);
            }
        }
        if (z15 && ((i15 = bVar2.X) != -1 || bVar2.Y != -1)) {
            eVar6.e1(i15, bVar2.Y);
        }
        if (bVar2.f11323e0) {
            eVar6.S0(n5.e.b.FIXED);
            eVar6.n1(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.S0(n5.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f11315a0) {
                eVar6.S0(n5.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.S0(n5.e.b.MATCH_PARENT);
            }
            eVar6.o(n5.d.a.LEFT).f131826g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.o(n5.d.a.RIGHT).f131826g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.S0(n5.e.b.MATCH_CONSTRAINT);
            eVar6.n1(0);
        }
        if (bVar2.f11325f0) {
            eVar6.j1(n5.e.b.FIXED);
            eVar6.O0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.j1(n5.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f11317b0) {
                eVar6.j1(n5.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.j1(n5.e.b.MATCH_PARENT);
            }
            eVar6.o(n5.d.a.TOP).f131826g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.o(n5.d.a.BOTTOM).f131826g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.j1(n5.e.b.MATCH_CONSTRAINT);
            eVar6.O0(0);
        }
        eVar6.G0(bVar2.I);
        eVar6.U0(bVar2.L);
        eVar6.l1(bVar2.M);
        eVar6.Q0(bVar2.N);
        eVar6.h1(bVar2.O);
        eVar6.o1(bVar2.f11321d0);
        eVar6.T0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        eVar6.k1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    @Override // android.view.View
    public void forceLayout() {
        u();
        super.forceLayout();
    }

    protected boolean g(int i15, int i16) {
        boolean zA = false;
        if (this.A == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i15);
        int size2 = View.MeasureSpec.getSize(i16);
        for (d dVar : this.A) {
            Iterator<n5.e> it = this.f11292c.v1().iterator();
            while (it.hasNext()) {
                View view = (View) it.next().s();
                zA |= dVar.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return zA;
    }

    public int getMaxHeight() {
        return this.f11296g;
    }

    public int getMaxWidth() {
        return this.f11295f;
    }

    public int getMinHeight() {
        return this.f11294e;
    }

    public int getMinWidth() {
        return this.f11293d;
    }

    public int getOptimizationLevel() {
        return this.f11292c.O1();
    }

    public String getSceneString() {
        int id5;
        StringBuilder sb5 = new StringBuilder();
        if (this.f11292c.f131867o == null) {
            int id6 = getId();
            if (id6 != -1) {
                this.f11292c.f131867o = getContext().getResources().getResourceEntryName(id6);
            } else {
                this.f11292c.f131867o = "parent";
            }
        }
        if (this.f11292c.t() == null) {
            n5.f fVar = this.f11292c;
            fVar.F0(fVar.f131867o);
            this.f11292c.t();
        }
        for (n5.e eVar : this.f11292c.v1()) {
            View view = (View) eVar.s();
            if (view != null) {
                if (eVar.f131867o == null && (id5 = view.getId()) != -1) {
                    eVar.f131867o = getContext().getResources().getResourceEntryName(id5);
                }
                if (eVar.t() == null) {
                    eVar.F0(eVar.f131867o);
                    eVar.t();
                }
            }
        }
        this.f11292c.P(sb5);
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object l(int i15, Object obj) {
        if (i15 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f11302n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f11302n.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            b bVar = (b) childAt.getLayoutParams();
            n5.e eVar = bVar.f11357v0;
            if ((childAt.getVisibility() != 8 || bVar.f11329h0 || bVar.f11331i0 || bVar.f11335k0 || zIsInEditMode) && !bVar.f11333j0) {
                int iZ = eVar.Z();
                int iA0 = eVar.a0();
                int iY = eVar.Y() + iZ;
                int iX = eVar.x() + iA0;
                childAt.layout(iZ, iA0, iY, iX);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iZ, iA0, iY, iX);
                }
            }
        }
        int size = this.f11291b.size();
        if (size > 0) {
            for (int i25 = 0; i25 < size; i25++) {
                this.f11291b.get(i25).o(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        boolean zG = this.f11297h | g(i15, i16);
        this.f11297h = zG;
        if (!zG) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                if (getChildAt(i17).isLayoutRequested()) {
                    this.f11297h = true;
                    break;
                }
            }
        }
        this.f11311y = i15;
        this.f11312z = i16;
        this.f11292c.d2(t());
        if (this.f11297h) {
            this.f11297h = false;
            if (C()) {
                this.f11292c.f2();
            }
        }
        this.f11292c.M1(null);
        x(this.f11292c, this.f11298j, i15, i16);
        w(i15, i16, this.f11292c.Y(), this.f11292c.x(), this.f11292c.V1(), this.f11292c.T1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        n5.e eVarR = r(view);
        if ((view instanceof Guideline) && !(eVarR instanceof n5.h)) {
            b bVar = (b) view.getLayoutParams();
            n5.h hVar = new n5.h();
            bVar.f11357v0 = hVar;
            bVar.f11329h0 = true;
            hVar.D1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.s();
            ((b) view.getLayoutParams()).f11331i0 = true;
            if (!this.f11291b.contains(bVar2)) {
                this.f11291b.add(bVar2);
            }
        }
        this.f11290a.put(view.getId(), view);
        this.f11297h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f11290a.remove(view.getId());
        this.f11292c.x1(r(view));
        this.f11291b.remove(view);
        this.f11297h = true;
    }

    public View q(int i15) {
        return this.f11290a.get(i15);
    }

    public final n5.e r(View view) {
        if (view == this) {
            return this.f11292c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f11357v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f11357v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.d dVar) {
        this.f11299k = dVar;
    }

    @Override // android.view.View
    public void setId(int i15) {
        this.f11290a.remove(getId());
        super.setId(i15);
        this.f11290a.put(getId(), this);
    }

    public void setMaxHeight(int i15) {
        if (i15 == this.f11296g) {
            return;
        }
        this.f11296g = i15;
        requestLayout();
    }

    public void setMaxWidth(int i15) {
        if (i15 == this.f11295f) {
            return;
        }
        this.f11295f = i15;
        requestLayout();
    }

    public void setMinHeight(int i15) {
        if (i15 == this.f11294e) {
            return;
        }
        this.f11294e = i15;
        requestLayout();
    }

    public void setMinWidth(int i15) {
        if (i15 == this.f11293d) {
            return;
        }
        this.f11293d = i15;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.f11300l;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i15) {
        this.f11298j = i15;
        this.f11292c.b2(i15);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void v(int i15) {
        this.f11300l = new androidx.constraintlayout.widget.c(getContext(), this, i15);
    }

    protected void w(int i15, int i16, int i17, int i18, boolean z15, boolean z16) {
        c cVar = this.f11310x;
        int i19 = cVar.f11368e;
        int iResolveSizeAndState = View.resolveSizeAndState(i17 + cVar.f11367d, i15, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i18 + i19, i16, 0) & 16777215;
        int iMin = Math.min(this.f11295f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f11296g, iResolveSizeAndState2);
        if (z15) {
            iMin |= 16777216;
        }
        if (z16) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f11303p = iMin;
        this.f11304q = iMin2;
    }

    protected void x(n5.f fVar, int i15, int i16, int i17) {
        int i18;
        int mode = View.MeasureSpec.getMode(i16);
        int size = View.MeasureSpec.getSize(i16);
        int mode2 = View.MeasureSpec.getMode(i17);
        int size2 = View.MeasureSpec.getSize(i17);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i19 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f11310x.c(i16, i17, iMax, iMax2, paddingWidth, i19);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (t()) {
                i18 = iMax4;
            }
            int i25 = size - paddingWidth;
            int i26 = size2 - i19;
            A(fVar, mode, i25, mode2, i26);
            fVar.W1(i15, mode, i25, mode2, i26, this.f11303p, this.f11304q, i18, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i18 = iMax3;
        int i27 = size - paddingWidth;
        int i28 = size2 - i19;
        A(fVar, mode, i27, mode2, i28);
        fVar.W1(i15, mode, i27, mode2, i28, this.f11303p, this.f11304q, i18, iMax);
    }

    public void z(int i15, Object obj, Object obj2) {
        if (i15 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f11302n == null) {
                this.f11302n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f11302n.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f11290a = new SparseArray<>();
        this.f11291b = new ArrayList<>(4);
        this.f11292c = new n5.f();
        this.f11293d = 0;
        this.f11294e = 0;
        this.f11295f = Integer.MAX_VALUE;
        this.f11296g = Integer.MAX_VALUE;
        this.f11297h = true;
        this.f11298j = 257;
        this.f11299k = null;
        this.f11300l = null;
        this.f11301m = -1;
        this.f11302n = new HashMap<>();
        this.f11303p = -1;
        this.f11304q = -1;
        this.f11305r = -1;
        this.f11306s = -1;
        this.f11307t = 0;
        this.f11308v = 0;
        this.f11309w = new SparseArray<>();
        this.f11310x = new c(this);
        this.f11311y = 0;
        this.f11312z = 0;
        s(attributeSet, i15, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11314a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f11315a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11316b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f11317b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f11318c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f11319c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11320d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f11321d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11322e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f11323e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11324f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f11325f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11326g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f11327g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11328h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f11329h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f11330i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f11331i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f11332j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f11333j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11334k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        boolean f11335k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f11336l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f11337l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f11338m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f11339m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f11340n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f11341n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f11342o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f11343o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f11344p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f11345p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f11346q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        int f11347q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f11348r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        float f11349r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f11350s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f11351s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11352t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        int f11353t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11354u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        float f11355u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f11356v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        n5.e f11357v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f11358w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f11359w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f11360x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f11361y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f11362z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f11363a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f11363a = sparseIntArray;
                sparseIntArray.append(i.f11749z2, 64);
                sparseIntArray.append(i.f11551c2, 65);
                sparseIntArray.append(i.f11632l2, 8);
                sparseIntArray.append(i.f11641m2, 9);
                sparseIntArray.append(i.f11659o2, 10);
                sparseIntArray.append(i.f11668p2, 11);
                sparseIntArray.append(i.f11717v2, 12);
                sparseIntArray.append(i.f11709u2, 13);
                sparseIntArray.append(i.S1, 14);
                sparseIntArray.append(i.R1, 15);
                sparseIntArray.append(i.N1, 16);
                sparseIntArray.append(i.P1, 52);
                sparseIntArray.append(i.O1, 53);
                sparseIntArray.append(i.T1, 2);
                sparseIntArray.append(i.V1, 3);
                sparseIntArray.append(i.U1, 4);
                sparseIntArray.append(i.E2, 49);
                sparseIntArray.append(i.F2, 50);
                sparseIntArray.append(i.Z1, 5);
                sparseIntArray.append(i.f11533a2, 6);
                sparseIntArray.append(i.f11542b2, 7);
                sparseIntArray.append(i.I1, 67);
                sparseIntArray.append(i.W0, 1);
                sparseIntArray.append(i.f11677q2, 17);
                sparseIntArray.append(i.f11685r2, 18);
                sparseIntArray.append(i.Y1, 19);
                sparseIntArray.append(i.X1, 20);
                sparseIntArray.append(i.J2, 21);
                sparseIntArray.append(i.M2, 22);
                sparseIntArray.append(i.K2, 23);
                sparseIntArray.append(i.H2, 24);
                sparseIntArray.append(i.L2, 25);
                sparseIntArray.append(i.I2, 26);
                sparseIntArray.append(i.G2, 55);
                sparseIntArray.append(i.N2, 54);
                sparseIntArray.append(i.f11596h2, 29);
                sparseIntArray.append(i.f11725w2, 30);
                sparseIntArray.append(i.W1, 44);
                sparseIntArray.append(i.f11614j2, 45);
                sparseIntArray.append(i.f11741y2, 46);
                sparseIntArray.append(i.f11605i2, 47);
                sparseIntArray.append(i.f11733x2, 48);
                sparseIntArray.append(i.L1, 27);
                sparseIntArray.append(i.K1, 28);
                sparseIntArray.append(i.A2, 31);
                sparseIntArray.append(i.f11560d2, 32);
                sparseIntArray.append(i.C2, 33);
                sparseIntArray.append(i.B2, 34);
                sparseIntArray.append(i.D2, 35);
                sparseIntArray.append(i.f11578f2, 36);
                sparseIntArray.append(i.f11569e2, 37);
                sparseIntArray.append(i.f11587g2, 38);
                sparseIntArray.append(i.f11623k2, 39);
                sparseIntArray.append(i.f11701t2, 40);
                sparseIntArray.append(i.f11650n2, 41);
                sparseIntArray.append(i.Q1, 42);
                sparseIntArray.append(i.M1, 43);
                sparseIntArray.append(i.f11693s2, 51);
                sparseIntArray.append(i.P2, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11314a = -1;
            this.f11316b = -1;
            this.f11318c = -1.0f;
            this.f11320d = true;
            this.f11322e = -1;
            this.f11324f = -1;
            this.f11326g = -1;
            this.f11328h = -1;
            this.f11330i = -1;
            this.f11332j = -1;
            this.f11334k = -1;
            this.f11336l = -1;
            this.f11338m = -1;
            this.f11340n = -1;
            this.f11342o = -1;
            this.f11344p = -1;
            this.f11346q = 0;
            this.f11348r = 0.0f;
            this.f11350s = -1;
            this.f11352t = -1;
            this.f11354u = -1;
            this.f11356v = -1;
            this.f11358w = PKIFailureInfo.systemUnavail;
            this.f11360x = PKIFailureInfo.systemUnavail;
            this.f11361y = PKIFailureInfo.systemUnavail;
            this.f11362z = PKIFailureInfo.systemUnavail;
            this.A = PKIFailureInfo.systemUnavail;
            this.B = PKIFailureInfo.systemUnavail;
            this.C = PKIFailureInfo.systemUnavail;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f11315a0 = false;
            this.f11317b0 = false;
            this.f11319c0 = null;
            this.f11321d0 = 0;
            this.f11323e0 = true;
            this.f11325f0 = true;
            this.f11327g0 = false;
            this.f11329h0 = false;
            this.f11331i0 = false;
            this.f11333j0 = false;
            this.f11335k0 = false;
            this.f11337l0 = -1;
            this.f11339m0 = -1;
            this.f11341n0 = -1;
            this.f11343o0 = -1;
            this.f11345p0 = PKIFailureInfo.systemUnavail;
            this.f11347q0 = PKIFailureInfo.systemUnavail;
            this.f11349r0 = 0.5f;
            this.f11357v0 = new n5.e();
            this.f11359w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f11314a = bVar.f11314a;
                this.f11316b = bVar.f11316b;
                this.f11318c = bVar.f11318c;
                this.f11320d = bVar.f11320d;
                this.f11322e = bVar.f11322e;
                this.f11324f = bVar.f11324f;
                this.f11326g = bVar.f11326g;
                this.f11328h = bVar.f11328h;
                this.f11330i = bVar.f11330i;
                this.f11332j = bVar.f11332j;
                this.f11334k = bVar.f11334k;
                this.f11336l = bVar.f11336l;
                this.f11338m = bVar.f11338m;
                this.f11340n = bVar.f11340n;
                this.f11342o = bVar.f11342o;
                this.f11344p = bVar.f11344p;
                this.f11346q = bVar.f11346q;
                this.f11348r = bVar.f11348r;
                this.f11350s = bVar.f11350s;
                this.f11352t = bVar.f11352t;
                this.f11354u = bVar.f11354u;
                this.f11356v = bVar.f11356v;
                this.f11358w = bVar.f11358w;
                this.f11360x = bVar.f11360x;
                this.f11361y = bVar.f11361y;
                this.f11362z = bVar.f11362z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.f11315a0 = bVar.f11315a0;
                this.f11317b0 = bVar.f11317b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f11323e0 = bVar.f11323e0;
                this.f11325f0 = bVar.f11325f0;
                this.f11327g0 = bVar.f11327g0;
                this.f11329h0 = bVar.f11329h0;
                this.f11337l0 = bVar.f11337l0;
                this.f11339m0 = bVar.f11339m0;
                this.f11341n0 = bVar.f11341n0;
                this.f11343o0 = bVar.f11343o0;
                this.f11345p0 = bVar.f11345p0;
                this.f11347q0 = bVar.f11347q0;
                this.f11349r0 = bVar.f11349r0;
                this.f11319c0 = bVar.f11319c0;
                this.f11321d0 = bVar.f11321d0;
                this.f11357v0 = bVar.f11357v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public void a() {
            this.f11329h0 = false;
            this.f11323e0 = true;
            this.f11325f0 = true;
            int i15 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i15 == -2 && this.f11315a0) {
                this.f11323e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i16 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i16 == -2 && this.f11317b0) {
                this.f11325f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i15 == 0 || i15 == -1) {
                this.f11323e0 = false;
                if (i15 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f11315a0 = true;
                }
            }
            if (i16 == 0 || i16 == -1) {
                this.f11325f0 = false;
                if (i16 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f11317b0 = true;
                }
            }
            if (this.f11318c == -1.0f && this.f11314a == -1 && this.f11316b == -1) {
                return;
            }
            this.f11329h0 = true;
            this.f11323e0 = true;
            this.f11325f0 = true;
            if (!(this.f11357v0 instanceof n5.h)) {
                this.f11357v0 = new n5.h();
            }
            ((n5.h) this.f11357v0).D1(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i15) {
            int i16;
            int i17;
            int i18;
            int i19;
            int i25 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i26 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i15);
            boolean z15 = false;
            boolean z16 = 1 == getLayoutDirection();
            this.f11341n0 = -1;
            this.f11343o0 = -1;
            this.f11337l0 = -1;
            this.f11339m0 = -1;
            this.f11345p0 = this.f11358w;
            this.f11347q0 = this.f11361y;
            float f15 = this.G;
            this.f11349r0 = f15;
            int i27 = this.f11314a;
            this.f11351s0 = i27;
            int i28 = this.f11316b;
            this.f11353t0 = i28;
            float f16 = this.f11318c;
            this.f11355u0 = f16;
            if (z16) {
                int i29 = this.f11350s;
                if (i29 != -1) {
                    this.f11341n0 = i29;
                } else {
                    int i35 = this.f11352t;
                    if (i35 != -1) {
                        this.f11343o0 = i35;
                    } else {
                        i16 = this.f11354u;
                        if (i16 != -1) {
                            this.f11339m0 = i16;
                            z15 = true;
                        }
                        i17 = this.f11356v;
                        if (i17 != -1) {
                            this.f11337l0 = i17;
                            z15 = true;
                        }
                        i18 = this.A;
                        if (i18 != Integer.MIN_VALUE) {
                            this.f11347q0 = i18;
                        }
                        i19 = this.B;
                        if (i19 != Integer.MIN_VALUE) {
                            this.f11345p0 = i19;
                        }
                        if (z15) {
                            this.f11349r0 = 1.0f - f15;
                        }
                        if (this.f11329h0 && this.Z == 1 && this.f11320d) {
                            if (f16 != -1.0f) {
                                this.f11355u0 = 1.0f - f16;
                                this.f11351s0 = -1;
                                this.f11353t0 = -1;
                            } else if (i27 != -1) {
                                this.f11353t0 = i27;
                                this.f11351s0 = -1;
                                this.f11355u0 = -1.0f;
                            } else if (i28 != -1) {
                                this.f11351s0 = i28;
                                this.f11353t0 = -1;
                                this.f11355u0 = -1.0f;
                            }
                        }
                    }
                }
                z15 = true;
                i16 = this.f11354u;
                if (i16 != -1) {
                    this.f11339m0 = i16;
                    z15 = true;
                }
                i17 = this.f11356v;
                if (i17 != -1) {
                    this.f11337l0 = i17;
                    z15 = true;
                }
                i18 = this.A;
                if (i18 != Integer.MIN_VALUE) {
                    this.f11347q0 = i18;
                }
                i19 = this.B;
                if (i19 != Integer.MIN_VALUE) {
                    this.f11345p0 = i19;
                }
                if (z15) {
                    this.f11349r0 = 1.0f - f15;
                }
                if (this.f11329h0) {
                    if (f16 != -1.0f) {
                        this.f11355u0 = 1.0f - f16;
                        this.f11351s0 = -1;
                        this.f11353t0 = -1;
                    } else if (i27 != -1) {
                        this.f11353t0 = i27;
                        this.f11351s0 = -1;
                        this.f11355u0 = -1.0f;
                    } else if (i28 != -1) {
                        this.f11351s0 = i28;
                        this.f11353t0 = -1;
                        this.f11355u0 = -1.0f;
                    }
                }
            } else {
                int i36 = this.f11350s;
                if (i36 != -1) {
                    this.f11339m0 = i36;
                }
                int i37 = this.f11352t;
                if (i37 != -1) {
                    this.f11337l0 = i37;
                }
                int i38 = this.f11354u;
                if (i38 != -1) {
                    this.f11341n0 = i38;
                }
                int i39 = this.f11356v;
                if (i39 != -1) {
                    this.f11343o0 = i39;
                }
                int i45 = this.A;
                if (i45 != Integer.MIN_VALUE) {
                    this.f11345p0 = i45;
                }
                int i46 = this.B;
                if (i46 != Integer.MIN_VALUE) {
                    this.f11347q0 = i46;
                }
            }
            if (this.f11354u == -1 && this.f11356v == -1 && this.f11352t == -1 && this.f11350s == -1) {
                int i47 = this.f11326g;
                if (i47 != -1) {
                    this.f11341n0 = i47;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i26 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i26;
                    }
                } else {
                    int i48 = this.f11328h;
                    if (i48 != -1) {
                        this.f11343o0 = i48;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i26 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i26;
                        }
                    }
                }
                int i49 = this.f11322e;
                if (i49 != -1) {
                    this.f11337l0 = i49;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i25 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i25;
                    return;
                }
                int i55 = this.f11324f;
                if (i55 != -1) {
                    this.f11339m0 = i55;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i25 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i25;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11314a = -1;
            this.f11316b = -1;
            this.f11318c = -1.0f;
            this.f11320d = true;
            this.f11322e = -1;
            this.f11324f = -1;
            this.f11326g = -1;
            this.f11328h = -1;
            this.f11330i = -1;
            this.f11332j = -1;
            this.f11334k = -1;
            this.f11336l = -1;
            this.f11338m = -1;
            this.f11340n = -1;
            this.f11342o = -1;
            this.f11344p = -1;
            this.f11346q = 0;
            this.f11348r = 0.0f;
            this.f11350s = -1;
            this.f11352t = -1;
            this.f11354u = -1;
            this.f11356v = -1;
            this.f11358w = PKIFailureInfo.systemUnavail;
            this.f11360x = PKIFailureInfo.systemUnavail;
            this.f11361y = PKIFailureInfo.systemUnavail;
            this.f11362z = PKIFailureInfo.systemUnavail;
            this.A = PKIFailureInfo.systemUnavail;
            this.B = PKIFailureInfo.systemUnavail;
            this.C = PKIFailureInfo.systemUnavail;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f11315a0 = false;
            this.f11317b0 = false;
            this.f11319c0 = null;
            this.f11321d0 = 0;
            this.f11323e0 = true;
            this.f11325f0 = true;
            this.f11327g0 = false;
            this.f11329h0 = false;
            this.f11331i0 = false;
            this.f11333j0 = false;
            this.f11335k0 = false;
            this.f11337l0 = -1;
            this.f11339m0 = -1;
            this.f11341n0 = -1;
            this.f11343o0 = -1;
            this.f11345p0 = PKIFailureInfo.systemUnavail;
            this.f11347q0 = PKIFailureInfo.systemUnavail;
            this.f11349r0 = 0.5f;
            this.f11357v0 = new n5.e();
            this.f11359w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                int i16 = a.f11363a.get(index);
                switch (i16) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f11344p);
                        this.f11344p = resourceId;
                        if (resourceId == -1) {
                            this.f11344p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f11346q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11346q);
                        break;
                    case 4:
                        float f15 = typedArrayObtainStyledAttributes.getFloat(index, this.f11348r) % 360.0f;
                        this.f11348r = f15;
                        if (f15 < 0.0f) {
                            this.f11348r = (360.0f - f15) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f11314a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f11314a);
                        break;
                    case 6:
                        this.f11316b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f11316b);
                        break;
                    case 7:
                        this.f11318c = typedArrayObtainStyledAttributes.getFloat(index, this.f11318c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11322e);
                        this.f11322e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f11322e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11324f);
                        this.f11324f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f11324f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11326g);
                        this.f11326g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f11326g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11328h);
                        this.f11328h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f11328h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11330i);
                        this.f11330i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f11330i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11332j);
                        this.f11332j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f11332j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11334k);
                        this.f11334k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f11334k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11336l);
                        this.f11336l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f11336l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11338m);
                        this.f11338m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f11338m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11350s);
                        this.f11350s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f11350s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11352t);
                        this.f11352t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f11352t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11354u);
                        this.f11354u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f11354u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11356v);
                        this.f11356v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f11356v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f11358w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11358w);
                        break;
                    case 22:
                        this.f11360x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11360x);
                        break;
                    case 23:
                        this.f11361y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11361y);
                        break;
                    case 24:
                        this.f11362z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11362z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f11315a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f11315a0);
                        break;
                    case 28:
                        this.f11317b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f11317b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case BERTags.DATE /* 31 */:
                        int i17 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i17;
                        if (i17 == 1) {
                            c2.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i18 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i18;
                        if (i18 == 1) {
                            c2.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i16) {
                            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                                androidx.constraintlayout.widget.d.q(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case EACTags.TRANSACTION_DATE /* 51 */:
                                this.f11319c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11340n);
                                this.f11340n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f11340n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f11342o);
                                this.f11342o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f11342o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case EACTags.CURRENCY_EXPONENT /* 54 */:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i16) {
                                    case 64:
                                        androidx.constraintlayout.widget.d.o(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.d.o(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f11321d0 = typedArrayObtainStyledAttributes.getInt(index, this.f11321d0);
                                        break;
                                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                        this.f11320d = typedArrayObtainStyledAttributes.getBoolean(index, this.f11320d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(int i15, int i16) {
            super(i15, i16);
            this.f11314a = -1;
            this.f11316b = -1;
            this.f11318c = -1.0f;
            this.f11320d = true;
            this.f11322e = -1;
            this.f11324f = -1;
            this.f11326g = -1;
            this.f11328h = -1;
            this.f11330i = -1;
            this.f11332j = -1;
            this.f11334k = -1;
            this.f11336l = -1;
            this.f11338m = -1;
            this.f11340n = -1;
            this.f11342o = -1;
            this.f11344p = -1;
            this.f11346q = 0;
            this.f11348r = 0.0f;
            this.f11350s = -1;
            this.f11352t = -1;
            this.f11354u = -1;
            this.f11356v = -1;
            this.f11358w = PKIFailureInfo.systemUnavail;
            this.f11360x = PKIFailureInfo.systemUnavail;
            this.f11361y = PKIFailureInfo.systemUnavail;
            this.f11362z = PKIFailureInfo.systemUnavail;
            this.A = PKIFailureInfo.systemUnavail;
            this.B = PKIFailureInfo.systemUnavail;
            this.C = PKIFailureInfo.systemUnavail;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f11315a0 = false;
            this.f11317b0 = false;
            this.f11319c0 = null;
            this.f11321d0 = 0;
            this.f11323e0 = true;
            this.f11325f0 = true;
            this.f11327g0 = false;
            this.f11329h0 = false;
            this.f11331i0 = false;
            this.f11333j0 = false;
            this.f11335k0 = false;
            this.f11337l0 = -1;
            this.f11339m0 = -1;
            this.f11341n0 = -1;
            this.f11343o0 = -1;
            this.f11345p0 = PKIFailureInfo.systemUnavail;
            this.f11347q0 = PKIFailureInfo.systemUnavail;
            this.f11349r0 = 0.5f;
            this.f11357v0 = new n5.e();
            this.f11359w0 = false;
        }
    }
}
