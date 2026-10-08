package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p007NuL.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    public interface b {
        void onMenuVisibilityChanged(boolean z15);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z15);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    void n() {
    }

    public abstract boolean o(int i15, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z15);

    public abstract void s(boolean z15);

    public abstract void t(boolean z15);

    public abstract void u(Drawable drawable);

    public abstract void v(boolean z15);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public abstract androidx.appcompat.view.b y(androidx.appcompat.view.b.a aVar);

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0185a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8161a;

        public C0185a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8161a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f532t);
            this.f8161a = typedArrayObtainStyledAttributes.getInt(v.f536u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0185a(int i15, int i16) {
            super(i15, i16);
            this.f8161a = 8388627;
        }

        public C0185a(C0185a c0185a) {
            super((ViewGroup.MarginLayoutParams) c0185a);
            this.f8161a = 0;
            this.f8161a = c0185a.f8161a;
        }

        public C0185a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8161a = 0;
        }
    }
}
