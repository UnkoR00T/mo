package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.sentry.android.core.c2;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f11390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f11391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f11392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected n5.i f11393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f11394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f11395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f11396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View[] f11397h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected HashMap<Integer, String> f11398j;

    public b(Context context) {
        super(context);
        this.f11390a = new int[32];
        this.f11394e = false;
        this.f11397h = null;
        this.f11398j = new HashMap<>();
        this.f11392c = context;
        m(null);
    }

    private void d(String str) {
        if (str == null || str.length() == 0 || this.f11392c == null) {
            return;
        }
        String strTrim = str.trim();
        int iK = k(strTrim);
        if (iK != 0) {
            this.f11398j.put(Integer.valueOf(iK), strTrim);
            e(iK);
            return;
        }
        c2.g("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void e(int i15) {
        if (i15 == getId()) {
            return;
        }
        int i16 = this.f11391b + 1;
        int[] iArr = this.f11390a;
        if (i16 > iArr.length) {
            this.f11390a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f11390a;
        int i17 = this.f11391b;
        iArr2[i17] = i15;
        this.f11391b = i17 + 1;
    }

    private void f(String str) {
        if (str == null || str.length() == 0 || this.f11392c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            c2.g("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = constraintLayout.getChildAt(i15);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f11319c0)) {
                if (childAt.getId() == -1) {
                    c2.g("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f11392c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = constraintLayout.getChildAt(i15);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iJ = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objL = constraintLayout.l(0, str);
            if (objL instanceof Integer) {
                iJ = ((Integer) objL).intValue();
            }
        }
        if (iJ == 0 && constraintLayout != null) {
            iJ = j(constraintLayout, str);
        }
        if (iJ == 0) {
            try {
                iJ = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iJ == 0 ? this.f11392c.getResources().getIdentifier(str, "id", this.f11392c.getPackageName()) : iJ;
    }

    protected void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f11390a, this.f11391b);
    }

    protected void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i15 = 0; i15 < this.f11391b; i15++) {
            View viewQ = constraintLayout.q(this.f11390a[i15]);
            if (viewQ != null) {
                viewQ.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewQ.setTranslationZ(viewQ.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void i(ConstraintLayout constraintLayout) {
    }

    protected View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f11397h;
        if (viewArr == null || viewArr.length != this.f11391b) {
            this.f11397h = new View[this.f11391b];
        }
        for (int i15 = 0; i15 < this.f11391b; i15++) {
            this.f11397h[i15] = constraintLayout.q(this.f11390a[i15]);
        }
        return this.f11397h;
    }

    protected void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == i.f11658o1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f11395f = string;
                    setIds(string);
                } else if (index == i.f11667p1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f11396g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void n(n5.e eVar, boolean z15) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f11395f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f11396g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        if (this.f11394e) {
            super.onMeasure(i15, i16);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int iJ;
        if (isInEditMode()) {
            setIds(this.f11395f);
        }
        n5.i iVar = this.f11393d;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i15 = 0; i15 < this.f11391b; i15++) {
            int i16 = this.f11390a[i15];
            View viewQ = constraintLayout.q(i16);
            if (viewQ == null && (iJ = j(constraintLayout, (str = this.f11398j.get(Integer.valueOf(i16))))) != 0) {
                this.f11390a[i15] = iJ;
                this.f11398j.put(Integer.valueOf(iJ), str);
                viewQ = constraintLayout.q(iJ);
            }
            if (viewQ != null) {
                this.f11393d.a(constraintLayout.r(viewQ));
            }
        }
        this.f11393d.c(constraintLayout.f11292c);
    }

    public void s() {
        if (this.f11393d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f11357v0 = (n5.e) this.f11393d;
        }
    }

    protected void setIds(String str) {
        this.f11395f = str;
        if (str == null) {
            return;
        }
        int i15 = 0;
        this.f11391b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i15);
            if (iIndexOf == -1) {
                d(str.substring(i15));
                return;
            } else {
                d(str.substring(i15, iIndexOf));
                i15 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f11396g = str;
        if (str == null) {
            return;
        }
        int i15 = 0;
        this.f11391b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i15);
            if (iIndexOf == -1) {
                f(str.substring(i15));
                return;
            } else {
                f(str.substring(i15, iIndexOf));
                i15 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f11395f = null;
        this.f11391b = 0;
        for (int i15 : iArr) {
            e(i15);
        }
    }

    @Override // android.view.View
    public void setTag(int i15, Object obj) {
        super.setTag(i15, obj);
        if (obj == null && this.f11395f == null) {
            e(i15);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11390a = new int[32];
        this.f11394e = false;
        this.f11397h = null;
        this.f11398j = new HashMap<>();
        this.f11392c = context;
        m(attributeSet);
    }
}
