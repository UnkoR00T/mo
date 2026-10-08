package k2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lk2/a;", "", "", "rotation", "startAngle", "endAngle", "scale", "<init>", "(FFFF)V", "a", "F", "b", "()F", "d", "c", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float rotation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float startAngle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float endAngle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float scale;

    public a(float f15, float f16, float f17, float f18) {
        this.rotation = f15;
        this.startAngle = f16;
        this.endAngle = f17;
        this.scale = f18;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getEndAngle() {
        return this.endAngle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }
}
