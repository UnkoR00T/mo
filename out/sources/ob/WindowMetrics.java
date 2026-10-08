package ob;

import android.graphics.Rect;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ob.v, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lob/v;", "", "Lmb/b;", "_bounds", "", "density", "<init>", "(Lmb/b;F)V", "Landroid/graphics/Rect;", "bounds", "(Landroid/graphics/Rect;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lmb/b;", "b", "F", "getDensity", "()F", "()Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowMetrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mb.b _bounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float density;

    public WindowMetrics(mb.b bVar, float f15) {
        this._bounds = bVar;
        this.density = f15;
    }

    public final Rect a() {
        return this._bounds.f();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!fr.t.c(WindowMetrics.class, other != null ? other.getClass() : null)) {
            return false;
        }
        WindowMetrics windowMetrics = (WindowMetrics) other;
        return fr.t.c(this._bounds, windowMetrics._bounds) && this.density == windowMetrics.density;
    }

    public int hashCode() {
        return (this._bounds.hashCode() * 31) + Float.hashCode(this.density);
    }

    public String toString() {
        return "WindowMetrics(_bounds=" + this._bounds + ", density=" + this.density + ')';
    }

    public WindowMetrics(Rect rect, float f15) {
        this(new mb.b(rect), f15);
    }
}
