package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bu\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0016\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u001a\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u001e\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001b\u0010\rR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)R\u0017\u0010.\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b-\u0010\rR\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b#\u0010\rR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010>\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b=\u0010\rR\u0017\u0010@\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b?\u0010\f\u001a\u0004\b,\u0010\rR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u0010N\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bM\u0010\rR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u0010[\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bY\u0010(\u001a\u0004\bZ\u0010)R\u0017\u0010]\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b\\\u0010\f\u001a\u0004\b4\u0010\rR\u0017\u0010_\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b^\u0010\f\u001a\u0004\b7\u0010\rR\u0017\u0010a\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b`\u0010\f\u001a\u0004\b:\u0010\rR\u0017\u0010c\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bb\u0010(\u001a\u0004\b<\u0010)R\u0017\u0010e\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bd\u0010\f\u001a\u0004\b?\u0010\rR\u0017\u0010h\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\bg\u0010\bR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u0017\u0010n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\bm\u0010\bR\u0017\u0010p\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010u\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bs\u0010\f\u001a\u0004\bt\u0010\rR\u0017\u0010w\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bv\u0010\f\u001a\u0004\bG\u0010\rR\u0017\u0010z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\by\u0010\bR\u0017\u0010}\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u0018\u0010\u0080\u0001\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b~\u0010\u0006\u001a\u0004\b\u007f\u0010\bR\u001a\u0010\u0083\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR\u0019\u0010\u0085\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001a\u0010\u0088\u0001\u001a\u00020+8\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\f\u001a\u0005\b\u0087\u0001\u0010\rR\u001a\u0010\u008b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR\u001a\u0010\u008e\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0006\u001a\u0005\b\u008d\u0001\u0010\bR\u001a\u0010\u0091\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR\u001a\u0010\u0094\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0006\u001a\u0005\b\u0093\u0001\u0010\bR\u0019\u0010\u0096\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0004\bL\u0010\bR\u001a\u0010\u0099\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR\u001a\u0010\u009c\u0001\u001a\u00020+8\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\f\u001a\u0005\b\u009b\u0001\u0010\rR\u001a\u0010\u009f\u0001\u001a\u00020+8\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\f\u001a\u0005\b\u009e\u0001\u0010\r¨\u0006 \u0001"}, d2 = {"Ll2/e1;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "DisabledSelectedHandleColor", "", "c", "F", "()F", "DisabledSelectedHandleOpacity", "d", "DisabledSelectedIconColor", "e", "DisabledSelectedIconOpacity", "f", "DisabledSelectedTrackColor", "g", "DisabledTrackOpacity", "h", "DisabledUnselectedHandleColor", "i", "DisabledUnselectedHandleOpacity", "j", "DisabledUnselectedIconColor", "k", "DisabledUnselectedIconOpacity", "l", "DisabledUnselectedTrackColor", "m", "DisabledUnselectedTrackOutlineColor", "n", "getFocusIndicatorColor", "FocusIndicatorColor", "Ll2/w0;", "o", "Ll2/w0;", "()Ll2/w0;", "HandleShape", "Lc5/h;", "p", "getPressedHandleHeight-D9Ej5fM", "PressedHandleHeight", "q", "PressedHandleWidth", "r", "getSelectedFocusHandleColor", "SelectedFocusHandleColor", "s", "getSelectedFocusIconColor", "SelectedFocusIconColor", "t", "getSelectedFocusTrackColor", "SelectedFocusTrackColor", "u", "SelectedHandleColor", "v", "getSelectedHandleHeight-D9Ej5fM", "SelectedHandleHeight", "w", "SelectedHandleWidth", "x", "getSelectedHoverHandleColor", "SelectedHoverHandleColor", "y", "getSelectedHoverIconColor", "SelectedHoverIconColor", "z", "getSelectedHoverTrackColor", "SelectedHoverTrackColor", "A", "SelectedIconColor", "B", "getSelectedIconSize-D9Ej5fM", "SelectedIconSize", "C", "getSelectedPressedHandleColor", "SelectedPressedHandleColor", ip.a.f96138c, "getSelectedPressedIconColor", "SelectedPressedIconColor", "E", "getSelectedPressedTrackColor", "SelectedPressedTrackColor", "SelectedTrackColor", "G", "getStateLayerShape", "StateLayerShape", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "StateLayerSize", "I", "TrackHeight", "J", "TrackOutlineWidth", "K", "TrackShape", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "TrackWidth", "M", "getUnselectedFocusHandleColor", "UnselectedFocusHandleColor", "N", "getUnselectedFocusIconColor", "UnselectedFocusIconColor", "O", "getUnselectedFocusTrackColor", "UnselectedFocusTrackColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "UnselectedFocusTrackOutlineColor", "Q", "UnselectedHandleColor", "R", "getUnselectedHandleHeight-D9Ej5fM", "UnselectedHandleHeight", ip.a.f96137b, "UnselectedHandleWidth", "T", "getUnselectedHoverHandleColor", "UnselectedHoverHandleColor", "U", "getUnselectedHoverIconColor", "UnselectedHoverIconColor", "V", "getUnselectedHoverTrackColor", "UnselectedHoverTrackColor", "W", "getUnselectedHoverTrackOutlineColor", "UnselectedHoverTrackOutlineColor", "X", "UnselectedIconColor", "Y", "getUnselectedIconSize-D9Ej5fM", "UnselectedIconSize", "Z", "getUnselectedPressedHandleColor", "UnselectedPressedHandleColor", "a0", "getUnselectedPressedIconColor", "UnselectedPressedIconColor", "b0", "getUnselectedPressedTrackColor", "UnselectedPressedTrackColor", "c0", "getUnselectedPressedTrackOutlineColor", "UnselectedPressedTrackOutlineColor", "d0", "UnselectedTrackColor", "e0", "getUnselectedTrackOutlineColor", "UnselectedTrackOutlineColor", "f0", "getIconHandleHeight-D9Ej5fM", "IconHandleHeight", "g0", "getIconHandleWidth-D9Ej5fM", "IconHandleWidth", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final p SelectedIconColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final float SelectedIconSize;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p SelectedPressedHandleColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final p SelectedPressedIconColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p SelectedPressedTrackColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final p SelectedTrackColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final w0 StateLayerShape;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final float StateLayerSize;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final float TrackHeight;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final float TrackOutlineWidth;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final w0 TrackShape;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final float TrackWidth;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final p UnselectedFocusHandleColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final p UnselectedFocusIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final p UnselectedFocusTrackColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final p UnselectedFocusTrackOutlineColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final p UnselectedHandleColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final float UnselectedHandleHeight;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final float UnselectedHandleWidth;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final p UnselectedHoverHandleColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final p UnselectedHoverIconColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final p UnselectedHoverTrackColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final p UnselectedHoverTrackOutlineColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final p UnselectedIconColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final float UnselectedIconSize;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final p UnselectedPressedHandleColor;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedPressedIconColor;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedPressedTrackColor;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedPressedTrackOutlineColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledSelectedIconColor;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedTrackColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledSelectedIconOpacity;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedTrackOutlineColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledSelectedTrackColor;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private static final float IconHandleHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledTrackOpacity;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private static final float IconHandleWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledUnselectedHandleColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledUnselectedHandleOpacity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledUnselectedIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledUnselectedIconOpacity;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledUnselectedTrackColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledUnselectedTrackOutlineColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final p FocusIndicatorColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final w0 HandleShape;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final float PressedHandleHeight;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float PressedHandleWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedFocusHandleColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedFocusIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedFocusTrackColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedHandleColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final float SelectedHandleHeight;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final float SelectedHandleWidth;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedHoverHandleColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedHoverIconColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedHoverTrackColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f114447a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledSelectedHandleColor = p.Surface;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledSelectedHandleOpacity = 1.0f;

    static {
        p pVar = p.OnSurface;
        DisabledSelectedIconColor = pVar;
        DisabledSelectedIconOpacity = 0.38f;
        DisabledSelectedTrackColor = pVar;
        DisabledTrackOpacity = 0.12f;
        DisabledUnselectedHandleColor = pVar;
        DisabledUnselectedHandleOpacity = 0.38f;
        p pVar2 = p.SurfaceContainerHighest;
        DisabledUnselectedIconColor = pVar2;
        DisabledUnselectedIconOpacity = 0.38f;
        DisabledUnselectedTrackColor = pVar2;
        DisabledUnselectedTrackOutlineColor = pVar;
        FocusIndicatorColor = p.Secondary;
        w0 w0Var = w0.CornerFull;
        HandleShape = w0Var;
        float f15 = (float) 28.0d;
        PressedHandleHeight = c5.h.n(f15);
        PressedHandleWidth = c5.h.n(f15);
        p pVar3 = p.PrimaryContainer;
        SelectedFocusHandleColor = pVar3;
        p pVar4 = p.OnPrimaryContainer;
        SelectedFocusIconColor = pVar4;
        p pVar5 = p.Primary;
        SelectedFocusTrackColor = pVar5;
        SelectedHandleColor = p.OnPrimary;
        float f16 = (float) 24.0d;
        SelectedHandleHeight = c5.h.n(f16);
        SelectedHandleWidth = c5.h.n(f16);
        SelectedHoverHandleColor = pVar3;
        SelectedHoverIconColor = pVar4;
        SelectedHoverTrackColor = pVar5;
        SelectedIconColor = pVar4;
        float f17 = (float) 16.0d;
        SelectedIconSize = c5.h.n(f17);
        SelectedPressedHandleColor = pVar3;
        SelectedPressedIconColor = pVar4;
        SelectedPressedTrackColor = pVar5;
        SelectedTrackColor = pVar5;
        StateLayerShape = w0Var;
        StateLayerSize = c5.h.n((float) 40.0d);
        TrackHeight = c5.h.n((float) 32.0d);
        TrackOutlineWidth = c5.h.n((float) 2.0d);
        TrackShape = w0Var;
        TrackWidth = c5.h.n((float) 52.0d);
        p pVar6 = p.OnSurfaceVariant;
        UnselectedFocusHandleColor = pVar6;
        UnselectedFocusIconColor = pVar2;
        UnselectedFocusTrackColor = pVar2;
        p pVar7 = p.Outline;
        UnselectedFocusTrackOutlineColor = pVar7;
        UnselectedHandleColor = pVar7;
        UnselectedHandleHeight = c5.h.n(f17);
        UnselectedHandleWidth = c5.h.n(f17);
        UnselectedHoverHandleColor = pVar6;
        UnselectedHoverIconColor = pVar2;
        UnselectedHoverTrackColor = pVar2;
        UnselectedHoverTrackOutlineColor = pVar7;
        UnselectedIconColor = pVar2;
        UnselectedIconSize = c5.h.n(f17);
        UnselectedPressedHandleColor = pVar6;
        UnselectedPressedIconColor = pVar2;
        UnselectedPressedTrackColor = pVar2;
        UnselectedPressedTrackOutlineColor = pVar7;
        UnselectedTrackColor = pVar2;
        UnselectedTrackOutlineColor = pVar7;
        IconHandleHeight = c5.h.n(f16);
        IconHandleWidth = c5.h.n(f16);
    }

    private e1() {
    }

    public final p A() {
        return UnselectedIconColor;
    }

    public final p B() {
        return UnselectedTrackColor;
    }

    public final p a() {
        return DisabledSelectedHandleColor;
    }

    public final float b() {
        return DisabledSelectedHandleOpacity;
    }

    public final p c() {
        return DisabledSelectedIconColor;
    }

    public final float d() {
        return DisabledSelectedIconOpacity;
    }

    public final p e() {
        return DisabledSelectedTrackColor;
    }

    public final float f() {
        return DisabledTrackOpacity;
    }

    public final p g() {
        return DisabledUnselectedHandleColor;
    }

    public final float h() {
        return DisabledUnselectedHandleOpacity;
    }

    public final p i() {
        return DisabledUnselectedIconColor;
    }

    public final float j() {
        return DisabledUnselectedIconOpacity;
    }

    public final p k() {
        return DisabledUnselectedTrackColor;
    }

    public final p l() {
        return DisabledUnselectedTrackOutlineColor;
    }

    public final w0 m() {
        return HandleShape;
    }

    public final float n() {
        return PressedHandleWidth;
    }

    public final p o() {
        return SelectedHandleColor;
    }

    public final float p() {
        return SelectedHandleWidth;
    }

    public final p q() {
        return SelectedIconColor;
    }

    public final p r() {
        return SelectedTrackColor;
    }

    public final float s() {
        return StateLayerSize;
    }

    public final float t() {
        return TrackHeight;
    }

    public final float u() {
        return TrackOutlineWidth;
    }

    public final w0 v() {
        return TrackShape;
    }

    public final float w() {
        return TrackWidth;
    }

    public final p x() {
        return UnselectedFocusTrackOutlineColor;
    }

    public final p y() {
        return UnselectedHandleColor;
    }

    public final float z() {
        return UnselectedHandleWidth;
    }
}
