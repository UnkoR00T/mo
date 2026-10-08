package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\bz\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u001a\u0010%\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000eR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u001a\u0010+\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010\u000eR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR\u001a\u00101\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b0\u0010\u000eR\u0017\u00104\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010\f\u001a\u0004\b3\u0010\u000eR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010=\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010\u000eR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010I\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010\u000eR\u0017\u0010L\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010\u000eR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010R\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010X\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bV\u0010\f\u001a\u0004\bW\u0010\u000eR\u0017\u0010[\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bY\u0010\f\u001a\u0004\bZ\u0010\u000eR\u0017\u0010^\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\\\u0010\u0015\u001a\u0004\b]\u0010\u0017R\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\bc\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u0017\u0010i\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\bh\u0010\u0017R\u0017\u0010l\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bj\u0010\u0015\u001a\u0004\bk\u0010\u0017R\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u0017\u0010r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bp\u0010\u0006\u001a\u0004\bq\u0010\bR\u0017\u0010u\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR\u0017\u0010x\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010\u0006\u001a\u0004\bw\u0010\bR\u0017\u0010{\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\bR\u0017\u0010~\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b|\u0010\u0006\u001a\u0004\b}\u0010\bR\u0019\u0010\u0081\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u0019\u0010\u0083\u0001\u001a\u00020\n8\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR\u001a\u0010\u0089\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001a\u0010\u008c\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR\u001a\u0010\u008f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001a\u0010\u0092\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\bR\u001a\u0010\u0095\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR\u001a\u0010\u0098\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\bR\u001a\u0010\u009b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\b¨\u0006\u009c\u0001"}, d2 = {"Ll2/g;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "getContainerColor", "()Ll2/p;", "ContainerColor", "Lc5/h;", "c", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "d", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Ll2/w0;", "e", "Ll2/w0;", "getContainerShapeRound", "()Ll2/w0;", "ContainerShapeRound", "f", "getContainerShapeSquare", "ContainerShapeSquare", "g", "getDisabledContainerColor", "DisabledContainerColor", "h", "getDisabledContainerElevation-D9Ej5fM", "DisabledContainerElevation", "", "i", "getDisabledContainerOpacity", "DisabledContainerOpacity", "j", "getDisabledIconColor", "DisabledIconColor", "k", "getDisabledIconOpacity", "DisabledIconOpacity", "l", "getDisabledLabelTextColor", "DisabledLabelTextColor", "m", "getDisabledLabelTextOpacity", "DisabledLabelTextOpacity", "n", "getFocusedContainerElevation-D9Ej5fM", "FocusedContainerElevation", "o", "getFocusedIconColor", "FocusedIconColor", "p", "getFocusedLabelTextColor", "FocusedLabelTextColor", "q", "getHoveredContainerElevation-D9Ej5fM", "HoveredContainerElevation", "r", "getHoveredIconColor", "HoveredIconColor", "s", "getHoveredLabelTextColor", "HoveredLabelTextColor", "t", "getIconColor", "IconColor", "u", "getIconLabelSpace-D9Ej5fM", "IconLabelSpace", "v", "getIconSize-D9Ej5fM", "IconSize", "w", "getLabelTextColor", "LabelTextColor", "x", "getLabelTextSelectedColor", "LabelTextSelectedColor", "y", "getLabelTextUnselectedColor", "LabelTextUnselectedColor", "z", "a", "LeadingSpace", "A", "getPressedContainerElevation-D9Ej5fM", "PressedContainerElevation", "B", "getPressedContainerShape", "PressedContainerShape", "C", "getPressedIconColor", "PressedIconColor", ip.a.f96138c, "getPressedLabelTextColor", "PressedLabelTextColor", "E", "getSelectedContainerColor", "SelectedContainerColor", "getSelectedContainerShapeRound", "SelectedContainerShapeRound", "G", "getSelectedContainerShapeSquare", "SelectedContainerShapeSquare", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getSelectedFocusedIconColor", "SelectedFocusedIconColor", "I", "getSelectedFocusedLabelTextColor", "SelectedFocusedLabelTextColor", "J", "getSelectedHoveredIconColor", "SelectedHoveredIconColor", "K", "getSelectedHoveredLabelTextColor", "SelectedHoveredLabelTextColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "getSelectedIconColor", "SelectedIconColor", "M", "getSelectedPressedIconColor", "SelectedPressedIconColor", "N", "getSelectedPressedLabelTextColor", "SelectedPressedLabelTextColor", "O", "TrailingSpace", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "getUnselectedContainerColor", "UnselectedContainerColor", "Q", "getUnselectedFocusedIconColor", "UnselectedFocusedIconColor", "R", "getUnselectedFocusedLabelTextColor", "UnselectedFocusedLabelTextColor", ip.a.f96137b, "getUnselectedHoveredIconColor", "UnselectedHoveredIconColor", "T", "getUnselectedHoveredLabelTextColor", "UnselectedHoveredLabelTextColor", "U", "getUnselectedIconColor", "UnselectedIconColor", "V", "getUnselectedPressedIconColor", "UnselectedPressedIconColor", "W", "getUnselectedPressedLabelTextColor", "UnselectedPressedLabelTextColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final float PressedContainerElevation;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final w0 PressedContainerShape;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p PressedIconColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final p PressedLabelTextColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p SelectedContainerColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final w0 SelectedContainerShapeRound;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final w0 SelectedContainerShapeSquare;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final p SelectedFocusedIconColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final p SelectedFocusedLabelTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final p SelectedHoveredIconColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final p SelectedHoveredLabelTextColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final p SelectedIconColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final p SelectedPressedIconColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final p SelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final float TrailingSpace;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final p UnselectedContainerColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final p UnselectedFocusedIconColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final p UnselectedFocusedLabelTextColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final p UnselectedHoveredIconColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final p UnselectedHoveredLabelTextColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final p UnselectedIconColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final p UnselectedPressedIconColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final p UnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f114521a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShapeRound;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShapeSquare;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledContainerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerElevation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerOpacity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledIconOpacity;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledLabelTextColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledLabelTextOpacity;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedContainerElevation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p FocusedIconColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final p FocusedLabelTextColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float HoveredContainerElevation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p HoveredIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p HoveredLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final p IconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final float IconLabelSpace;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final p LabelTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p LabelTextSelectedColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final p LabelTextUnselectedColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final float LeadingSpace;

    static {
        p pVar = p.Primary;
        ContainerColor = pVar;
        t tVar = t.f115244a;
        ContainerElevation = tVar.a();
        ContainerHeight = c5.h.n((float) 40.0d);
        w0 w0Var = w0.CornerFull;
        ContainerShapeRound = w0Var;
        w0 w0Var2 = w0.CornerMedium;
        ContainerShapeSquare = w0Var2;
        DisabledContainerColor = p.OnSurface;
        DisabledContainerElevation = tVar.a();
        DisabledContainerOpacity = 0.1f;
        p pVar2 = p.OnSurfaceVariant;
        DisabledIconColor = pVar2;
        DisabledIconOpacity = 0.38f;
        DisabledLabelTextColor = pVar2;
        DisabledLabelTextOpacity = 0.38f;
        FocusedContainerElevation = tVar.a();
        p pVar3 = p.OnPrimary;
        FocusedIconColor = pVar3;
        FocusedLabelTextColor = pVar3;
        HoveredContainerElevation = tVar.b();
        HoveredIconColor = pVar3;
        HoveredLabelTextColor = pVar3;
        IconColor = pVar3;
        IconLabelSpace = c5.h.n((float) 8.0d);
        IconSize = c5.h.n((float) 20.0d);
        LabelTextColor = pVar3;
        LabelTextSelectedColor = pVar3;
        LabelTextUnselectedColor = pVar2;
        float f15 = (float) 24.0d;
        LeadingSpace = c5.h.n(f15);
        PressedContainerElevation = tVar.a();
        PressedContainerShape = w0.CornerSmall;
        PressedIconColor = pVar3;
        PressedLabelTextColor = pVar3;
        SelectedContainerColor = pVar;
        SelectedContainerShapeRound = w0Var;
        SelectedContainerShapeSquare = w0Var2;
        SelectedFocusedIconColor = pVar3;
        SelectedFocusedLabelTextColor = pVar3;
        SelectedHoveredIconColor = pVar3;
        SelectedHoveredLabelTextColor = pVar3;
        SelectedIconColor = pVar3;
        SelectedPressedIconColor = pVar3;
        SelectedPressedLabelTextColor = pVar3;
        TrailingSpace = c5.h.n(f15);
        UnselectedContainerColor = p.SurfaceContainer;
        UnselectedFocusedIconColor = pVar2;
        UnselectedFocusedLabelTextColor = pVar2;
        UnselectedHoveredIconColor = pVar2;
        UnselectedHoveredLabelTextColor = pVar2;
        UnselectedIconColor = pVar2;
        UnselectedPressedIconColor = pVar2;
        UnselectedPressedLabelTextColor = pVar2;
    }

    private g() {
    }

    public final float a() {
        return LeadingSpace;
    }

    public final float b() {
        return TrailingSpace;
    }
}
