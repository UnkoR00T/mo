package p3;

import c5.t;
import n3.h1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lp3/d;", "", "Lm3/k;", "a", "()J", "g", "(J)V", "size", "Ln3/h1;", "_", "f", "()Ln3/h1;", "e", "(Ln3/h1;)V", "canvas", "Lp3/h;", "c", "()Lp3/h;", "transform", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "d", "(Lc5/t;)V", "layoutDirection", "Lc5/d;", "getDensity", "()Lc5/d;", "b", "(Lc5/d;)V", "density", "Lq3/c;", "h", "()Lq3/c;", "i", "(Lq3/c;)V", "graphicsLayer", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {
    long a();

    default void b(c5.d dVar) {
    }

    /* JADX INFO: renamed from: c */
    h getTransform();

    default void d(t tVar) {
    }

    default void e(h1 h1Var) {
    }

    default h1 f() {
        return i.f152591a;
    }

    void g(long j15);

    default c5.d getDensity() {
        return e.a();
    }

    default t getLayoutDirection() {
        return t.Ltr;
    }

    /* JADX INFO: renamed from: h */
    default q3.c getGraphicsLayer() {
        return null;
    }

    default void i(q3.c cVar) {
    }
}
