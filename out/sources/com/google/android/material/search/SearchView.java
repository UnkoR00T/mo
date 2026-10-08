package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e;
import com.google.android.material.internal.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import lj.i;
import ri.d;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f35445z = k.f174079m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ClippableRoundedCornerLayout f35446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final View f35447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f35448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final FrameLayout f35449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final MaterialToolbar f35450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TextView f35451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final EditText f35452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final TouchObserverFrameLayout f35453h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f35454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f35455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final dj.a f35456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<b> f35457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SearchBar f35458n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f35460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f35462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f35463t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f35465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f35466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<View, Integer> f35467y;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.b() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static class a extends r6.a {
        public static final Parcelable.Creator<a> CREATOR = new C0752a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f35468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f35469d;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        class C0752a implements Parcelable.ClassLoaderCreator<a> {
            C0752a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i15) {
                return new a[i15];
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeString(this.f35468c);
            parcel.writeInt(this.f35469d);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35468c = parcel.readString();
            this.f35469d = parcel.readInt();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface b {
        void a(SearchView searchView, c cVar, c cVar2);
    }

    public enum c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    private void c(c cVar, boolean z15) {
        if (this.f35466x.equals(cVar)) {
            return;
        }
        if (z15) {
            f(cVar);
        }
        c cVar2 = this.f35466x;
        this.f35466x = cVar;
        Iterator it = new LinkedHashSet(this.f35457m).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, cVar2, cVar);
        }
        e(cVar);
        SearchBar searchBar = this.f35458n;
        if (searchBar == null || cVar != c.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    @SuppressLint({"InlinedApi"})
    private void d(ViewGroup viewGroup, boolean z15) {
        for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
            View childAt = viewGroup.getChildAt(i15);
            if (childAt != this) {
                if (childAt.findViewById(this.f35446a.getId()) != null) {
                    d((ViewGroup) childAt, z15);
                } else if (z15) {
                    this.f35467y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map<View, Integer> map = this.f35467y;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.f35467y.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void e(c cVar) {
        if (this.f35458n == null || !this.f35455k) {
            return;
        }
        if (cVar.equals(c.SHOWN) || cVar.equals(c.HIDDEN)) {
            throw null;
        }
    }

    private void f(c cVar) {
        if (cVar == c.SHOWN) {
            setModalForAccessibility(true);
        } else if (cVar == c.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    private void g() {
        ImageButton imageButtonD = o.d(this.f35450e);
        if (imageButtonD == null) {
            return;
        }
        int i15 = this.f35446a.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = y5.a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof NUL.b) {
            ((NUL.b) drawableQ).a(i15);
        }
        if (drawableQ instanceof e) {
            ((e) drawableQ).a(i15);
        }
    }

    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.b.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f35458n;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(d.A);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z15) {
        this.f35448c.setVisibility(z15 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f15) {
        dj.a aVar = this.f35456l;
        if (aVar == null || this.f35447b == null) {
            return;
        }
        this.f35447b.setBackgroundColor(aVar.c(this.f35463t, f15));
    }

    private void setUpHeaderLayout(int i15) {
        if (i15 != -1) {
            a(LayoutInflater.from(getContext()).inflate(i15, (ViewGroup) this.f35449d, false));
        }
    }

    private void setUpStatusBarSpacer(int i15) {
        if (this.f35448c.getLayoutParams().height != i15) {
            this.f35448c.getLayoutParams().height = i15;
            this.f35448c.requestLayout();
        }
    }

    public void a(View view) {
        this.f35449d.addView(view);
        this.f35449d.setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        if (this.f35454j) {
            this.f35453h.addView(view, i15, layoutParams);
        } else {
            super.addView(view, i15, layoutParams);
        }
    }

    public boolean b() {
        return this.f35458n != null;
    }

    gj.c getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f35466x;
    }

    protected int getDefaultNavigationIconResource() {
        return ri.e.f173981b;
    }

    public EditText getEditText() {
        return this.f35452g;
    }

    public CharSequence getHint() {
        return this.f35452g.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f35451f;
    }

    public CharSequence getSearchPrefixText() {
        return this.f35451f.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f35459p;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f35452g.getText();
    }

    public Toolbar getToolbar() {
        return this.f35450e;
    }

    public void h() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f35459p = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
        c currentTransitionState = getCurrentTransitionState();
        f(currentTransitionState);
        e(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        throw null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        h();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.f35468c);
        setVisible(aVar.f35469d == 0);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        Editable text = getText();
        aVar.f35468c = text == null ? null : text.toString();
        aVar.f35469d = this.f35446a.getVisibility();
        return aVar;
    }

    public void setAnimatedNavigationIcon(boolean z15) {
        this.f35460q = z15;
    }

    public void setAutoShowKeyboard(boolean z15) {
        this.f35462s = z15;
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        setUpBackgroundViewElevationOverlay(f15);
    }

    public void setHint(CharSequence charSequence) {
        this.f35452g.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z15) {
        this.f35461r = z15;
    }

    public void setModalForAccessibility(boolean z15) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z15) {
            this.f35467y = new HashMap(viewGroup.getChildCount());
        }
        d(viewGroup, z15);
        if (z15) {
            return;
        }
        this.f35467y = null;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f35450e.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f35451f.setText(charSequence);
        this.f35451f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z15) {
        this.f35465w = true;
        setStatusBarSpacerEnabledInternal(z15);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f35452g.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z15) {
        this.f35450e.setTouchscreenBlocksFocus(z15);
    }

    void setTransitionState(c cVar) {
        c(cVar, true);
    }

    public void setUseWindowInsetsController(boolean z15) {
        this.f35464v = z15;
    }

    public void setVisible(boolean z15) {
        boolean z16 = this.f35446a.getVisibility() == 0;
        this.f35446a.setVisibility(z15 ? 0 : 8);
        g();
        c(z15 ? c.SHOWN : c.HIDDEN, z16 != z15);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f35458n = searchBar;
        throw null;
    }

    public void setHint(int i15) {
        this.f35452g.setHint(i15);
    }

    public void setText(int i15) {
        this.f35452g.setText(i15);
    }
}
