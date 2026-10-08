package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.internal.n;
import io.sentry.android.core.c2;
import j6.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k6.p;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f34915t = k.f174090x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final LinkedHashSet<b> f34916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34917n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f34920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Set<Integer> f34921s;

    class a extends j6.a {
        a() {
        }

        @Override // j6.a
        public void g(View view, p pVar) {
            super.g(view, pVar);
            pVar.r0(p.g.a(0, 1, MaterialButtonToggleGroup.this.u(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i15, boolean z15);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ri.b.f173921p);
    }

    private String getChildrenA11yClassName() {
        return (this.f34918p ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            if ((getChildAt(i16) instanceof MaterialButton) && j(i16)) {
                i15++;
            }
        }
        return i15;
    }

    private boolean j(int i15) {
        return getChildAt(i15).getVisibility() != 8;
    }

    private void r(int i15, boolean z15) {
        if (i15 == -1) {
            c2.e("MButtonToggleGroup", "Button ID is not valid: " + i15);
            return;
        }
        HashSet hashSet = new HashSet(this.f34921s);
        if (z15 && !hashSet.contains(Integer.valueOf(i15))) {
            if (this.f34918p && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i15));
        } else {
            if (z15 || !hashSet.contains(Integer.valueOf(i15))) {
                return;
            }
            if (!this.f34919q || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i15));
            }
        }
        y(hashSet);
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    private void t(int i15, boolean z15) {
        Iterator<b> it = this.f34916m.iterator();
        while (it.hasNext()) {
            it.next().a(this, i15, z15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            if (getChildAt(i16) == view) {
                return i15;
            }
            if ((getChildAt(i16) instanceof MaterialButton) && j(i16)) {
                i15++;
            }
        }
        return -1;
    }

    private void x(int i15, boolean z15) {
        View viewFindViewById = findViewById(i15);
        if (viewFindViewById instanceof MaterialButton) {
            this.f34917n = true;
            ((MaterialButton) viewFindViewById).setChecked(z15);
            this.f34917n = false;
        }
    }

    private void y(Set<Integer> set) {
        Set<Integer> set2 = this.f34921s;
        this.f34921s = new HashSet(set);
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            int id5 = f(i15).getId();
            x(id5, set.contains(Integer.valueOf(id5)));
            if (set2.contains(Integer.valueOf(id5)) != set.contains(Integer.valueOf(id5))) {
                t(id5, set.contains(Integer.valueOf(id5)));
            }
        }
        invalidate();
    }

    private void z() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            f(i15).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.d, android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            c2.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i15, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        r(materialButton.getId(), materialButton.isChecked());
        l0.h0(materialButton, new a());
    }

    public int getCheckedButtonId() {
        if (!this.f34918p || this.f34921s.isEmpty()) {
            return -1;
        }
        return this.f34921s.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            int id5 = f(i15).getId();
            if (this.f34921s.contains(Integer.valueOf(id5))) {
                arrayList.add(Integer.valueOf(id5));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i15 = this.f34920r;
        if (i15 != -1) {
            y(Collections.singleton(Integer.valueOf(i15)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.f1(accessibilityNodeInfo).q0(p.f.a(1, getVisibleButtonCount(), false, v() ? 1 : 2));
    }

    public void q(b bVar) {
        this.f34916m.add(bVar);
    }

    public void s() {
        y(new HashSet());
    }

    public void setSelectionRequired(boolean z15) {
        this.f34919q = z15;
    }

    public void setSingleSelection(boolean z15) {
        if (this.f34918p != z15) {
            this.f34918p = z15;
            s();
        }
        z();
    }

    public boolean v() {
        return this.f34918p;
    }

    void w(MaterialButton materialButton, boolean z15) {
        if (this.f34917n) {
            return;
        }
        r(materialButton.getId(), z15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i15) {
        int i16 = f34915t;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        this.f34916m = new LinkedHashSet<>();
        this.f34917n = false;
        this.f34921s = new HashSet();
        TypedArray typedArrayI = n.i(getContext(), attributeSet, l.f174248t2, i15, i16, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(l.f174280x2, false));
        this.f34920r = typedArrayI.getResourceId(l.f174264v2, -1);
        this.f34919q = typedArrayI.getBoolean(l.f174272w2, false);
        if (this.f34932f == null) {
            this.f34932f = lj.p.c(new lj.a(0.0f));
        }
        setEnabled(typedArrayI.getBoolean(l.f174256u2, true));
        typedArrayI.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i15) {
        setSingleSelection(getResources().getBoolean(i15));
    }
}
