package h7;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lh7/a;", "", "", "radius", "smoothing", "<init>", "(FF)V", "a", "F", "()F", "b", "c", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f81292d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float smoothing;

    static {
        fr.k kVar = null;
        INSTANCE = new Companion(kVar);
        float f15 = 0.0f;
        f81292d = new a(f15, f15, 3, kVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        float f15 = 0.0f;
        this(f15, f15, 3, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getSmoothing() {
        return this.smoothing;
    }

    public a(float f15, float f16) {
        this.radius = f15;
        this.smoothing = f16;
    }

    public /* synthetic */ a(float f15, float f16, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? 0.0f : f15, (i15 & 2) != 0 ? 0.0f : f16);
    }
}
