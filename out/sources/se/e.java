package se;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<Z> extends i<ImageView, Z> implements te.b.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Animatable f180987h;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void p(Z z15) {
        if (!(z15 instanceof Animatable)) {
            this.f180987h = null;
            return;
        }
        Animatable animatable = (Animatable) z15;
        this.f180987h = animatable;
        animatable.start();
    }

    private void s(Z z15) {
        r(z15);
        p(z15);
    }

    @Override // se.i, se.a, se.h
    public void c(Drawable drawable) {
        super.c(drawable);
        s(null);
        q(drawable);
    }

    @Override // se.i, se.a, se.h
    public void d(Drawable drawable) {
        super.d(drawable);
        Animatable animatable = this.f180987h;
        if (animatable != null) {
            animatable.stop();
        }
        s(null);
        q(drawable);
    }

    @Override // se.a, oe.l
    public void e() {
        Animatable animatable = this.f180987h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // se.h
    public void h(Z z15, te.b<? super Z> bVar) {
        if (bVar == null || !bVar.a(z15, this)) {
            s(z15);
        } else {
            p(z15);
        }
    }

    @Override // se.a, se.h
    public void j(Drawable drawable) {
        super.j(drawable);
        s(null);
        q(drawable);
    }

    @Override // se.a, oe.l
    public void n() {
        Animatable animatable = this.f180987h;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void q(Drawable drawable) {
        ((ImageView) this.f180990a).setImageDrawable(drawable);
    }

    protected abstract void r(Z z15);
}
