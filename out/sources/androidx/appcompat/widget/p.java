package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public class p extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f8993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f8994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8995c;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.E);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f8993a;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f8994b;
        if (qVar != null) {
            qVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f8993a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f8993a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        q qVar = this.f8994b;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        q qVar = this.f8994b;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f8994b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f8993a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i15) {
        super.setBackgroundResource(i15);
        e eVar = this.f8993a;
        if (eVar != null) {
            eVar.g(i15);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.f8994b;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q qVar = this.f8994b;
        if (qVar != null && drawable != null && !this.f8995c) {
            qVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        q qVar2 = this.f8994b;
        if (qVar2 != null) {
            qVar2.c();
            if (this.f8995c) {
                return;
            }
            this.f8994b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i15) {
        super.setImageLevel(i15);
        this.f8995c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i15) {
        this.f8994b.i(i15);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q qVar = this.f8994b;
        if (qVar != null) {
            qVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f8993a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f8993a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.f8994b;
        if (qVar != null) {
            qVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q qVar = this.f8994b;
        if (qVar != null) {
            qVar.k(mode);
        }
    }

    public p(Context context, AttributeSet attributeSet, int i15) {
        super(w0.b(context), attributeSet, i15);
        this.f8995c = false;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f8993a = eVar;
        eVar.e(attributeSet, i15);
        q qVar = new q(this);
        this.f8994b = qVar;
        qVar.g(attributeSet, i15);
    }
}
