package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Ll2/v;", "", "<init>", "()V", "Lc5/h;", "b", "F", "a", "()F", "ContainerHeight", "c", "getIconLabelSpace-D9Ej5fM", "IconLabelSpace", "d", "getIconSize-D9Ej5fM", "IconSize", "e", "LeadingSpace", "f", "TrailingSpace", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f115276a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight = c5.h.n((float) 80.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconLabelSpace = c5.h.n((float) 16.0d);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize = c5.h.n((float) 28.0d);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float LeadingSpace;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float TrailingSpace;

    static {
        float f15 = (float) 26.0d;
        LeadingSpace = c5.h.n(f15);
        TrailingSpace = c5.h.n(f15);
    }

    private v() {
    }

    public final float a() {
        return ContainerHeight;
    }

    public final float b() {
        return LeadingSpace;
    }

    public final float c() {
        return TrailingSpace;
    }
}
