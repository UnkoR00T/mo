package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006 "}, d2 = {"Ll2/h0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "getActiveIndicatorColor", "()Ll2/p;", "ActiveIndicatorColor", "Lc5/h;", "c", "F", "a", "()F", "ActiveSize", "d", "getContainedActiveColor", "ContainedActiveColor", "e", "getContainedContainerColor", "ContainedContainerColor", "f", "ContainerHeight", "Ll2/w0;", "g", "Ll2/w0;", "getContainerShape", "()Ll2/w0;", "ContainerShape", "h", "ContainerWidth", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerWidth;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f114654a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveIndicatorColor = p.Primary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveSize = c5.h.n((float) 38.0d);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p ContainedActiveColor = p.OnPrimaryContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p ContainedContainerColor = p.PrimaryContainer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape = w0.CornerFull;

    static {
        float f15 = (float) 48.0d;
        ContainerHeight = c5.h.n(f15);
        ContainerWidth = c5.h.n(f15);
    }

    private h0() {
    }

    public final float a() {
        return ActiveSize;
    }

    public final float b() {
        return ContainerHeight;
    }

    public final float c() {
        return ContainerWidth;
    }
}
