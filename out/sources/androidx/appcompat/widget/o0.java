package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends m0 implements n0 {
    private static Method P;
    private n0 O;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z15) {
            popupWindow.setTouchModal(z15);
        }
    }

    public static class c extends i0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final int f8989p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final int f8990q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private n0 f8991r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private MenuItem f8992s;

        public c(Context context, boolean z15) {
            super(context, z15);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f8989p = 21;
                this.f8990q = 22;
            } else {
                this.f8989p = 22;
                this.f8990q = 21;
            }
        }

        @Override // androidx.appcompat.widget.i0
        public /* bridge */ /* synthetic */ int d(int i15, int i16, int i17, int i18, int i19) {
            return super.d(i15, i16, i17, i18, i19);
        }

        @Override // androidx.appcompat.widget.i0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i15) {
            return super.e(motionEvent, i15);
        }

        @Override // androidx.appcompat.widget.i0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i15;
            if (this.f8991r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i15 = iPointToPosition - headersCount) < 0 || i15 >= dVar.getCount()) ? null : dVar.getItem(i15);
                MenuItem menuItem = this.f8992s;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f8991r.o(eVarB, menuItem);
                    }
                    this.f8992s = item;
                    if (item != null) {
                        this.f8991r.e(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i15, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i15 == this.f8989p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i15 != this.f8990q) {
                return super.onKeyDown(i15, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.i0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(n0 n0Var) {
            this.f8991r = n0Var;
        }

        @Override // androidx.appcompat.widget.i0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                P = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public o0(Context context, AttributeSet attributeSet, int i15, int i16) {
        super(context, attributeSet, i15, i16);
    }

    public void S(Object obj) {
        a.a(this.I, (Transition) obj);
    }

    public void T(Object obj) {
        a.b(this.I, (Transition) obj);
    }

    public void U(n0 n0Var) {
        this.O = n0Var;
    }

    public void V(boolean z15) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.I, z15);
            return;
        }
        Method method = P;
        if (method != null) {
            try {
                method.invoke(this.I, Boolean.valueOf(z15));
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.appcompat.widget.n0
    public void e(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        n0 n0Var = this.O;
        if (n0Var != null) {
            n0Var.e(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.n0
    public void o(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        n0 n0Var = this.O;
        if (n0Var != null) {
            n0Var.o(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.m0
    i0 s(Context context, boolean z15) {
        c cVar = new c(context, z15);
        cVar.setHoverListener(this);
        return cVar;
    }
}
