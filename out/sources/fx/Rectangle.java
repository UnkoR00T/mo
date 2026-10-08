package fx;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fx.e, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006\""}, d2 = {"Lfx/e;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "width", "height", "(FF)V", "Lfx/b;", "point", "", "a", "(Lfx/b;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "d", "()F", "b", "f", "c", "e", "g", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Rectangle {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f68456g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float bottom;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float height;

    public Rectangle(float f15, float f16, float f17, float f18) {
        this.left = f15;
        this.top = f16;
        this.right = f17;
        this.bottom = f18;
        this.width = f17 - f15;
        this.height = f18 - f16;
    }

    public final boolean a(Point point) {
        float f15 = this.left;
        float f16 = this.right;
        float x15 = point.getX();
        if (f15 > x15 || x15 > f16) {
            return false;
        }
        float f17 = this.top;
        float f18 = this.bottom;
        float y15 = point.getY();
        return f17 <= y15 && y15 <= f18;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) other;
        return Float.compare(this.left, rectangle.left) == 0 && Float.compare(this.top, rectangle.top) == 0 && Float.compare(this.right, rectangle.right) == 0 && Float.compare(this.bottom, rectangle.bottom) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    public String toString() {
        return "Rectangle(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
    }

    public Rectangle(float f15, float f16) {
        this(0.0f, 0.0f, f15, f16);
    }
}
