package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Ll2/z;", "", "<init>", "()V", "Lc5/h;", "b", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "c", "getContainerWidth-D9Ej5fM", "ContainerWidth", "d", "a", "IconSize", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerWidth;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f115394a = new z();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize = c5.h.n((float) 28.0d);

    static {
        float f15 = (float) 80.0d;
        ContainerHeight = c5.h.n(f15);
        ContainerWidth = c5.h.n(f15);
    }

    private z() {
    }

    public final float a() {
        return IconSize;
    }
}
