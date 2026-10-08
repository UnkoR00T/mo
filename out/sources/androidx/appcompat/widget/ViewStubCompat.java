package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<View> f8728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LayoutInflater f8729d;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f8726a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f8729d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f8726a, viewGroup, false);
        int i15 = this.f8727b;
        if (i15 != -1) {
            viewInflate.setId(i15);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f8728c = new WeakReference<>(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f8727b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f8729d;
    }

    public int getLayoutResource() {
        return this.f8726a;
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i15) {
        this.f8727b = i15;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f8729d = layoutInflater;
    }

    public void setLayoutResource(int i15) {
        this.f8726a = i15;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i15) {
        WeakReference<View> weakReference = this.f8728c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i15);
            return;
        }
        super.setVisibility(i15);
        if (i15 == 0 || i15 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f8726a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p007NuL.v.f516p3, i15, 0);
        this.f8727b = typedArrayObtainStyledAttributes.getResourceId(p007NuL.v.f531s3, -1);
        this.f8726a = typedArrayObtainStyledAttributes.getResourceId(p007NuL.v.f526r3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(p007NuL.v.f521q3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
