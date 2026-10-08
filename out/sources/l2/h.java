package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010!\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010$\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u0013\u0010\b¨\u0006'"}, d2 = {"Ll2/h;", "", "<init>", "()V", "Lc5/h;", "b", "F", "a", "()F", "ContainerHeight", "Ll2/w0;", "c", "Ll2/w0;", "getContainerShapeRound", "()Ll2/w0;", "ContainerShapeRound", "d", "getContainerShapeSquare", "ContainerShapeSquare", "e", "IconLabelSpace", "f", "IconSize", "g", "LeadingSpace", "h", "getOutlinedOutlineWidth-D9Ej5fM", "OutlinedOutlineWidth", "i", "getPressedContainerShape", "PressedContainerShape", "j", "getSelectedContainerShapeRound", "SelectedContainerShapeRound", "k", "getSelectedContainerShapeSquare", "SelectedContainerShapeSquare", "l", "TrailingSpace", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f114642a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight = c5.h.n((float) 96.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShapeRound;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShapeSquare;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float IconLabelSpace;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float LeadingSpace;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float OutlinedOutlineWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final w0 PressedContainerShape;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final w0 SelectedContainerShapeRound;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final w0 SelectedContainerShapeSquare;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final float TrailingSpace;

    static {
        w0 w0Var = w0.CornerFull;
        ContainerShapeRound = w0Var;
        w0 w0Var2 = w0.CornerExtraLarge;
        ContainerShapeSquare = w0Var2;
        IconLabelSpace = c5.h.n((float) 12.0d);
        IconSize = c5.h.n((float) 32.0d);
        float f15 = (float) 48.0d;
        LeadingSpace = c5.h.n(f15);
        OutlinedOutlineWidth = c5.h.n((float) 2.0d);
        PressedContainerShape = w0.CornerLarge;
        SelectedContainerShapeRound = w0Var;
        SelectedContainerShapeSquare = w0Var2;
        TrailingSpace = c5.h.n(f15);
    }

    private h() {
    }

    public final float a() {
        return ContainerHeight;
    }

    public final float b() {
        return IconLabelSpace;
    }

    public final float c() {
        return IconSize;
    }

    public final float d() {
        return LeadingSpace;
    }

    public final float e() {
        return TrailingSpace;
    }
}
