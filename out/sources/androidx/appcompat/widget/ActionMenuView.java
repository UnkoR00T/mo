package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends l0 implements androidx.appcompat.view.menu.e.b, androidx.appcompat.view.menu.k {
    private int A;
    private int B;
    private int C;
    e D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f8613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Context f8614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8615t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.appcompat.widget.c f8617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f8618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f8619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8620z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements androidx.appcompat.view.menu.j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z15) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends l0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f8621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f8622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f8623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f8624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f8625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f8626f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f8621a = cVar.f8621a;
        }

        public c(int i15, int i16) {
            super(i15, i16);
            this.f8621a = false;
        }
    }

    private class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.D;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.e.a aVar = ActionMenuView.this.f8619y;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    static int J(View view, int i15, int i16, int i17, int i18) {
        int i19;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i17) - i18, View.MeasureSpec.getMode(i17));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z15 = false;
        boolean z16 = actionMenuItemView != null && actionMenuItemView.s();
        if (i16 > 0) {
            i19 = 2;
            if (!z16 || i16 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i16 * i15, PKIFailureInfo.systemUnavail), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i25 = measuredWidth / i15;
                if (measuredWidth % i15 != 0) {
                    i25++;
                }
                if (!z16 || i25 >= 2) {
                    i19 = i25;
                }
            } else {
                i19 = 0;
            }
        } else {
            i19 = 0;
        }
        if (!cVar.f8621a && z16) {
            z15 = true;
        }
        cVar.f8624d = z15;
        cVar.f8622b = i19;
        view.measure(View.MeasureSpec.makeMeasureSpec(i15 * i19, 1073741824), iMakeMeasureSpec);
        return i19;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void K(int i15, int i16) {
        long j15;
        int i17;
        boolean z15;
        ?? r15;
        int i18;
        int mode = View.MeasureSpec.getMode(i16);
        int size = View.MeasureSpec.getSize(i15);
        int size2 = View.MeasureSpec.getSize(i16);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i16, paddingTop, -2);
        int i19 = size - paddingLeft;
        int i25 = this.B;
        int i26 = i19 / i25;
        int i27 = i19 % i25;
        if (i26 == 0) {
            setMeasuredDimension(i19, 0);
            return;
        }
        int i28 = i25 + (i27 / i26);
        int childCount = getChildCount();
        int iMax = 0;
        int i29 = 0;
        boolean z16 = false;
        int i35 = 0;
        int iMax2 = 0;
        int i36 = 0;
        long j16 = 0;
        while (i29 < childCount) {
            View childAt = getChildAt(i29);
            int i37 = size2;
            if (childAt.getVisibility() == 8) {
                i18 = i28;
            } else {
                boolean z17 = childAt instanceof ActionMenuItemView;
                i35++;
                if (z17) {
                    int i38 = this.C;
                    r15 = 0;
                    childAt.setPadding(i38, 0, i38, 0);
                } else {
                    r15 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f8626f = r15;
                cVar.f8623c = r15;
                cVar.f8622b = r15;
                cVar.f8624d = r15;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r15;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r15;
                cVar.f8625e = z17 && ((ActionMenuItemView) childAt).s();
                int iJ = J(childAt, i28, cVar.f8621a ? 1 : i26, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iJ);
                i18 = i28;
                if (cVar.f8624d) {
                    i36++;
                }
                if (cVar.f8621a) {
                    z16 = true;
                }
                i26 -= iJ;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iJ == 1) {
                    j16 |= (long) (1 << i29);
                }
            }
            i29++;
            size2 = i37;
            i28 = i18;
        }
        int i39 = size2;
        int i45 = i28;
        char c15 = 2;
        boolean z18 = z16 && i35 == 2;
        boolean z19 = false;
        while (true) {
            if (i36 <= 0 || i26 <= 0) {
                j15 = 1;
                break;
            }
            int i46 = Integer.MAX_VALUE;
            long j17 = 0;
            char c16 = c15;
            int i47 = 0;
            int i48 = 0;
            j15 = 1;
            while (i48 < childCount) {
                c cVar2 = (c) getChildAt(i48).getLayoutParams();
                boolean z25 = z18;
                if (cVar2.f8624d) {
                    int i49 = cVar2.f8622b;
                    if (i49 < i46) {
                        j17 = 1 << i48;
                        i46 = i49;
                        i47 = 1;
                    } else if (i49 == i46) {
                        j17 |= 1 << i48;
                        i47++;
                    }
                }
                i48++;
                z18 = z25;
            }
            boolean z26 = z18;
            j16 |= j17;
            if (i47 > i26) {
                break;
            }
            int i55 = i46 + 1;
            int i56 = 0;
            while (i56 < childCount) {
                View childAt2 = getChildAt(i56);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j18 = 1 << i56;
                if ((j17 & j18) == 0) {
                    if (cVar3.f8622b == i55) {
                        j16 |= j18;
                    }
                    i56 = i56;
                } else {
                    if (!z26 || !cVar3.f8625e) {
                        z15 = true;
                    } else if (i26 == 1) {
                        int i57 = this.C;
                        z15 = true;
                        childAt2.setPadding(i57 + i45, 0, i57, 0);
                    } else {
                        z15 = true;
                    }
                    cVar3.f8622b++;
                    cVar3.f8626f = z15;
                    i26--;
                }
                i56++;
            }
            c15 = c16;
            z18 = z26;
            z19 = true;
        }
        boolean z27 = !z16 && i35 == 1;
        if (i26 <= 0 || j16 == 0 || (i26 >= i35 - 1 && !z27 && iMax2 <= 1)) {
            i17 = 0;
        } else {
            float fBitCount = Long.bitCount(j16);
            if (z27) {
                i17 = 0;
            } else {
                if ((j16 & j15) != 0) {
                    i17 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f8625e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i17 = 0;
                }
                int i58 = childCount - 1;
                if ((j16 & ((long) (1 << i58))) != 0 && !((c) getChildAt(i58).getLayoutParams()).f8625e) {
                    fBitCount -= 0.5f;
                }
            }
            int i59 = fBitCount > 0.0f ? (int) ((i26 * i45) / fBitCount) : i17;
            boolean z28 = z19;
            for (int i65 = i17; i65 < childCount; i65++) {
                if ((j16 & ((long) (1 << i65))) != 0) {
                    View childAt3 = getChildAt(i65);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f8623c = i59;
                        cVar4.f8626f = true;
                        if (i65 == 0 && !cVar4.f8625e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i59) / 2;
                        }
                        z28 = true;
                    } else if (cVar4.f8621a) {
                        cVar4.f8623c = i59;
                        cVar4.f8626f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i59) / 2;
                        z28 = true;
                    } else {
                        if (i65 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i59 / 2;
                        }
                        if (i65 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i59 / 2;
                        }
                    }
                }
            }
            z19 = z28;
        }
        if (z19) {
            for (int i66 = i17; i66 < childCount; i66++) {
                View childAt4 = getChildAt(i66);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f8626f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f8622b * i45) + cVar5.f8623c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i19, mode != 1073741824 ? iMax : i39);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.l0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c D() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f8621a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean E(int i15) {
        boolean zA = false;
        if (i15 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i15 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i15);
        if (i15 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i15 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    public boolean F() {
        androidx.appcompat.widget.c cVar = this.f8617w;
        return cVar != null && cVar.B();
    }

    public boolean G() {
        androidx.appcompat.widget.c cVar = this.f8617w;
        return cVar != null && cVar.D();
    }

    public boolean H() {
        androidx.appcompat.widget.c cVar = this.f8617w;
        return cVar != null && cVar.E();
    }

    public boolean I() {
        return this.f8616v;
    }

    public androidx.appcompat.view.menu.e L() {
        return this.f8613r;
    }

    public void M(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f8618x = aVar;
        this.f8619y = aVar2;
    }

    public boolean N() {
        androidx.appcompat.widget.c cVar = this.f8617w;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f8613r = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(androidx.appcompat.view.menu.g gVar) {
        return this.f8613r.M(gVar, 0);
    }

    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f8613r == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f8613r = eVar;
            eVar.S(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f8617w = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.f8617w;
            androidx.appcompat.view.menu.j.a bVar = this.f8618x;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.e(bVar);
            this.f8613r.c(this.f8617w, this.f8614s);
            this.f8617w.H(this);
        }
        return this.f8613r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f8617w.A();
    }

    public int getPopupTheme() {
        return this.f8615t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f8617w;
        if (cVar != null) {
            cVar.g(false);
            if (this.f8617w.E()) {
                this.f8617w.B();
                this.f8617w.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        int width;
        int paddingLeft;
        if (!this.f8620z) {
            super.onLayout(z15, i15, i16, i17, i18);
            return;
        }
        int childCount = getChildCount();
        int i19 = (i18 - i16) / 2;
        int dividerWidth = getDividerWidth();
        int i25 = i17 - i15;
        int paddingRight = (i25 - getPaddingRight()) - getPaddingLeft();
        boolean zB = g1.b(this);
        int i26 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt = getChildAt(i28);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f8621a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i28)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i29 = i19 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i29, width, measuredHeight + i29);
                    paddingRight -= measuredWidth;
                    i26 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    E(i28);
                    i27++;
                }
            }
        }
        if (childCount == 1 && i26 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i35 = (i25 / 2) - (measuredWidth2 / 2);
            int i36 = i19 - (measuredHeight2 / 2);
            childAt2.layout(i35, i36, measuredWidth2 + i35, measuredHeight2 + i36);
            return;
        }
        int i37 = i27 - (i26 ^ 1);
        int iMax = Math.max(0, i37 > 0 ? paddingRight / i37 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i38 = 0; i38 < childCount; i38++) {
                View childAt3 = getChildAt(i38);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f8621a) {
                    int i39 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i45 = i19 - (measuredHeight3 / 2);
                    childAt3.layout(i39 - measuredWidth3, i45, i39, measuredHeight3 + i45);
                    width2 = i39 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i46 = 0; i46 < childCount; i46++) {
            View childAt4 = getChildAt(i46);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f8621a) {
                int i47 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i48 = i19 - (measuredHeight4 / 2);
                childAt4.layout(i47, i48, i47 + measuredWidth4, measuredHeight4 + i48);
                paddingLeft2 = i47 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.l0, android.view.View
    protected void onMeasure(int i15, int i16) {
        androidx.appcompat.view.menu.e eVar;
        boolean z15 = this.f8620z;
        boolean z16 = View.MeasureSpec.getMode(i15) == 1073741824;
        this.f8620z = z16;
        if (z15 != z16) {
            this.A = 0;
        }
        int size = View.MeasureSpec.getSize(i15);
        if (this.f8620z && (eVar = this.f8613r) != null && size != this.A) {
            this.A = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f8620z && childCount > 0) {
            K(i15, i16);
            return;
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            c cVar = (c) getChildAt(i17).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i15, i16);
    }

    public void setExpandedActionViewsExclusive(boolean z15) {
        this.f8617w.G(z15);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.D = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f8617w.I(drawable);
    }

    public void setOverflowReserved(boolean z15) {
        this.f8616v = z15;
    }

    public void setPopupTheme(int i15) {
        if (this.f8615t != i15) {
            this.f8615t = i15;
            if (i15 == 0) {
                this.f8614s = getContext();
            } else {
                this.f8614s = new ContextThemeWrapper(getContext(), i15);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f8617w = cVar;
        cVar.H(this);
    }

    public void z() {
        androidx.appcompat.widget.c cVar = this.f8617w;
        if (cVar != null) {
            cVar.y();
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f15 = context.getResources().getDisplayMetrics().density;
        this.B = (int) (56.0f * f15);
        this.C = (int) (f15 * 4.0f);
        this.f8614s = context;
        this.f8615t = 0;
    }
}
