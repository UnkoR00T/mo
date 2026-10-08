package mb;

import android.graphics.Rect;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u0000  2\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lmb/b;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "Landroid/graphics/Rect;", "rect", "(Landroid/graphics/Rect;)V", "f", "()Landroid/graphics/Rect;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "b", "c", "getRight", "d", "getBottom", "width", "height", "e", "()Z", "isZero", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f125189f = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    public b(int i15, int i16, int i17, int i18) {
        this.left = i15;
        this.top = i16;
        this.right = i17;
        this.bottom = i18;
        if (i15 > i17) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i15 + ", right: " + i17).toString());
        }
        if (i16 <= i18) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i16 + ", bottom: " + i18).toString());
    }

    public final int a() {
        return this.bottom - this.top;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    public final int d() {
        return this.right - this.left;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!t.c(b.class, other != null ? other.getClass() : null)) {
            return false;
        }
        b bVar = (b) other;
        return this.left == bVar.left && this.top == bVar.top && this.right == bVar.right && this.bottom == bVar.bottom;
    }

    public final Rect f() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.left + ',' + this.top + ',' + this.right + ',' + this.bottom + "] }";
    }

    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
