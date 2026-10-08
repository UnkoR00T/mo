package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010'\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u0017\u0010*\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u000eR\u0017\u0010-\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000eR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\b¨\u00064"}, d2 = {"Ll2/o1;", "", "<init>", "()V", "Lc5/h;", "b", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Ll2/w0;", "c", "Ll2/w0;", "getContainerShapeRound", "()Ll2/w0;", "ContainerShapeRound", "d", "getContainerShapeSquare", "ContainerShapeSquare", "e", "getDefaultLeadingSpace-D9Ej5fM", "DefaultLeadingSpace", "f", "getDefaultTrailingSpace-D9Ej5fM", "DefaultTrailingSpace", "g", "a", "IconSize", "h", "getNarrowLeadingSpace-D9Ej5fM", "NarrowLeadingSpace", "i", "getNarrowTrailingSpace-D9Ej5fM", "NarrowTrailingSpace", "j", "getOutlinedOutlineWidth-D9Ej5fM", "OutlinedOutlineWidth", "k", "getPressedContainerShape", "PressedContainerShape", "l", "getSelectedContainerShapeRound", "SelectedContainerShapeRound", "m", "getSelectedContainerShapeSquare", "SelectedContainerShapeSquare", "n", "getWideLeadingSpace-D9Ej5fM", "WideLeadingSpace", "o", "getWideTrailingSpace-D9Ej5fM", "WideTrailingSpace", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f115102a = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight = c5.h.n((float) 32.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShapeRound;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShapeSquare;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float DefaultLeadingSpace;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float DefaultTrailingSpace;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float NarrowLeadingSpace;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float NarrowTrailingSpace;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float OutlinedOutlineWidth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final w0 PressedContainerShape;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final w0 SelectedContainerShapeRound;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final w0 SelectedContainerShapeSquare;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float WideLeadingSpace;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final float WideTrailingSpace;

    static {
        w0 w0Var = w0.CornerFull;
        ContainerShapeRound = w0Var;
        w0 w0Var2 = w0.CornerMedium;
        ContainerShapeSquare = w0Var2;
        float f15 = (float) 6.0d;
        DefaultLeadingSpace = c5.h.n(f15);
        DefaultTrailingSpace = c5.h.n(f15);
        IconSize = c5.h.n((float) 20.0d);
        float f16 = (float) 4.0d;
        NarrowLeadingSpace = c5.h.n(f16);
        NarrowTrailingSpace = c5.h.n(f16);
        OutlinedOutlineWidth = c5.h.n((float) 1.0d);
        PressedContainerShape = w0.CornerSmall;
        SelectedContainerShapeRound = w0Var2;
        SelectedContainerShapeSquare = w0Var;
        float f17 = (float) 10.0d;
        WideLeadingSpace = c5.h.n(f17);
        WideTrailingSpace = c5.h.n(f17);
    }

    private o1() {
    }

    public final float a() {
        return IconSize;
    }
}
