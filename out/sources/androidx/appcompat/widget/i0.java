package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class i0 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f8887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f8893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8894h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j6.v0 f8897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.core.widget.f f8898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    f f8899n;

    static class a {
        static void a(View view, float f15, float f16) {
            view.drawableHotspotChanged(f15, f16);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f8900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f8901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f8902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f8903d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f8900a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f8901b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f8902c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f8903d = true;
            } catch (NoSuchMethodException e15) {
                e15.printStackTrace();
            }
        }

        static boolean a() {
            return f8903d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        static void b(i0 i0Var, int i15, View view) {
            try {
                f8900a.invoke(i0Var, Integer.valueOf(i15), view, Boolean.FALSE, -1, -1);
                f8901b.invoke(i0Var, Integer.valueOf(i15));
                f8902c.invoke(i0Var, Integer.valueOf(i15));
            } catch (IllegalAccessException e15) {
                e15.printStackTrace();
            } catch (InvocationTargetException e16) {
                e16.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z15) {
            absListView.setSelectedChildViewEnabled(z15);
        }
    }

    private static class d extends NUL.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8904b;

        d(Drawable drawable) {
            super(drawable);
            this.f8904b = true;
        }

        void b(boolean z15) {
            this.f8904b = z15;
        }

        @Override // NUL.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f8904b) {
                super.draw(canvas);
            }
        }

        @Override // NUL.a, android.graphics.drawable.Drawable
        public void setHotspot(float f15, float f16) {
            if (this.f8904b) {
                super.setHotspot(f15, f16);
            }
        }

        @Override // NUL.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i15, int i16, int i17, int i18) {
            if (this.f8904b) {
                super.setHotspotBounds(i15, i16, i17, i18);
            }
        }

        @Override // NUL.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f8904b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // NUL.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z15, boolean z16) {
            if (this.f8904b) {
                return super.setVisible(z15, z16);
            }
            return false;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Field f8905a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e15) {
                e15.printStackTrace();
            }
            f8905a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f8905a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e15) {
                e15.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z15) {
            Field field = f8905a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z15));
                } catch (IllegalAccessException e15) {
                    e15.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            i0 i0Var = i0.this;
            i0Var.f8899n = null;
            i0Var.removeCallbacks(this);
        }

        public void b() {
            i0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            i0 i0Var = i0.this;
            i0Var.f8899n = null;
            i0Var.drawableStateChanged();
        }
    }

    i0(Context context, boolean z15) {
        super(context, null, p007NuL.m.C);
        this.f8887a = new Rect();
        this.f8888b = 0;
        this.f8889c = 0;
        this.f8890d = 0;
        this.f8891e = 0;
        this.f8895j = z15;
        setCacheColorHint(0);
    }

    private void a() {
        this.f8896k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f8892f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        j6.v0 v0Var = this.f8897l;
        if (v0Var != null) {
            v0Var.c();
            this.f8897l = null;
        }
    }

    private void b(View view, int i15) {
        performItemClick(view, i15, getItemIdAtPosition(i15));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f8887a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f8887a);
        selector.draw(canvas);
    }

    private void f(int i15, View view) {
        Rect rect = this.f8887a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f8888b;
        rect.top -= this.f8889c;
        rect.right += this.f8890d;
        rect.bottom += this.f8891e;
        boolean zJ = j();
        if (view.isEnabled() != zJ) {
            k(!zJ);
            if (i15 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i15, View view) {
        Drawable selector = getSelector();
        boolean z15 = (selector == null || i15 == -1) ? false : true;
        if (z15) {
            selector.setVisible(false, false);
        }
        f(i15, view);
        if (z15) {
            Rect rect = this.f8887a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            y5.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i15, View view, float f15, float f16) {
        g(i15, view);
        Drawable selector = getSelector();
        if (selector == null || i15 == -1) {
            return;
        }
        y5.a.k(selector, f15, f16);
    }

    private void i(View view, int i15, float f15, float f16) {
        View childAt;
        this.f8896k = true;
        a.a(this, f15, f16);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i16 = this.f8892f;
        if (i16 != -1 && (childAt = getChildAt(i16 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f8892f = i15;
        a.a(view, f15 - view.getLeft(), f16 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i15, view, f15, f16);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void k(boolean z15) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z15);
        } else {
            e.b(this, z15);
        }
    }

    private boolean l() {
        return this.f8896k;
    }

    private void m() {
        Drawable selector = getSelector();
        if (selector != null && l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z15) {
        d dVar = this.f8893g;
        if (dVar != null) {
            dVar.b(z15);
        }
    }

    public int d(int i15, int i16, int i17, int i18, int i19) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        View view = null;
        while (i25 < count) {
            int itemViewType = adapter.getItemViewType(i25);
            if (itemViewType != i26) {
                view = null;
                i26 = itemViewType;
            }
            view = adapter.getView(i25, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i28 = layoutParams.height;
            view.measure(i15, i28 > 0 ? View.MeasureSpec.makeMeasureSpec(i28, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i25 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i18) {
                return (i19 < 0 || i25 <= i19 || i27 <= 0 || measuredHeight == i18) ? i18 : i27;
            }
            if (i19 >= 0 && i25 >= i19) {
                i27 = measuredHeight;
            }
            i25++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f8899n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i15) {
        boolean z15;
        boolean z16;
        androidx.core.widget.f fVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z15 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z15 = true;
                    z16 = false;
                } else {
                    z16 = false;
                    z15 = false;
                }
                if (z15 || z16) {
                    a();
                }
                if (z15) {
                    fVar = this.f8898m;
                    if (fVar != null) {
                        fVar.m(false);
                    }
                    return z15;
                }
                if (this.f8898m == null) {
                    this.f8898m = new androidx.core.widget.f(this);
                }
                this.f8898m.m(true);
                this.f8898m.onTouch(this, motionEvent);
                return z15;
            }
            z15 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i15);
        if (iFindPointerIndex < 0) {
            z16 = false;
            z15 = false;
        } else {
            int x15 = (int) motionEvent.getX(iFindPointerIndex);
            int y15 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x15, y15);
            if (iPointToPosition == -1) {
                z16 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x15, y15);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z15 = true;
                z16 = false;
            }
        }
        if (z15) {
            a();
        } else {
            a();
        }
        if (z15) {
            fVar = this.f8898m;
            if (fVar != null) {
                fVar.m(false);
            }
            return z15;
        }
        if (this.f8898m == null) {
            this.f8898m = new androidx.core.widget.f(this);
        }
        this.f8898m.m(true);
        this.f8898m.onTouch(this, motionEvent);
        return z15;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f8895j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f8895j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f8895j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f8895j && this.f8894h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f8899n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i15 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f8899n == null) {
            f fVar = new f();
            this.f8899n = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i15 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            m();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8892f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f8899n;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z15) {
        this.f8894h = z15;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f8893g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f8888b = rect.left;
        this.f8889c = rect.top;
        this.f8890d = rect.right;
        this.f8891e = rect.bottom;
    }
}
