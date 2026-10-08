package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import j6.l0;

/* JADX INFO: loaded from: classes4.dex */
public class CheckableImageButton extends androidx.appcompat.widget.p implements Checkable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f35330g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35333f;

    class a extends j6.a {
        a() {
        }

        @Override // j6.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // j6.a
        public void g(View view, k6.p pVar) {
            super.g(view, pVar);
            pVar.m0(CheckableImageButton.this.a());
            pVar.n0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends r6.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f35335c;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i15) {
                return new b[i15];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f35335c = parcel.readInt() == 1;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f35335c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.E);
    }

    public boolean a() {
        return this.f35332e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f35331d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i15) {
        if (!this.f35331d) {
            return super.onCreateDrawableState(i15);
        }
        int[] iArr = f35330g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i15 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f35335c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f35335c = this.f35331d;
        return bVar;
    }

    public void setCheckable(boolean z15) {
        if (this.f35332e != z15) {
            this.f35332e = z15;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z15) {
        if (!this.f35332e || this.f35331d == z15) {
            return;
        }
        this.f35331d = z15;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z15) {
        this.f35333f = z15;
    }

    @Override // android.view.View
    public void setPressed(boolean z15) {
        if (this.f35333f) {
            super.setPressed(z15);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f35331d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f35332e = true;
        this.f35333f = true;
        l0.h0(this, new a());
    }
}
