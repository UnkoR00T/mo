package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0003\b\u0083\u0001\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b!\u0010\rR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010'\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0017\u0010*\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\rR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\rR\u0017\u00103\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010:\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u0010\f\u001a\u0004\b9\u0010\rR\u0017\u0010=\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b;\u0010\u001c\u001a\u0004\b<\u0010\u001eR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u0017\u0010C\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010\u0011\u001a\u0004\bB\u0010\u0013R\u0017\u0010E\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bD\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010H\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bF\u0010\f\u001a\u0004\bG\u0010\rR\u0017\u0010K\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bI\u0010\f\u001a\u0004\bJ\u0010\rR\u0017\u0010M\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bL\u0010\u0011\u001a\u0004\b \u0010\u0013R\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010Q\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\b%\u0010\rR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u0010^\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\bR\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010h\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\bg\u0010\bR\u0017\u0010k\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bi\u0010\f\u001a\u0004\bj\u0010\rR\u0017\u0010n\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bl\u0010\f\u001a\u0004\bm\u0010\rR\u0017\u0010q\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bo\u0010\f\u001a\u0004\bp\u0010\rR\u0017\u0010t\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\br\u0010\f\u001a\u0004\bs\u0010\rR\u0017\u0010v\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bu\u0010\u001c\u001a\u0004\b1\u0010\u001eR\u0017\u0010y\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bw\u0010\f\u001a\u0004\bx\u0010\rR\u0017\u0010|\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bz\u0010\u0011\u001a\u0004\b{\u0010\u0013R\u0017\u0010~\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b4\u0010\bR\u0019\u0010\u0081\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u001a\u0010\u0084\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0006\u001a\u0005\b\u0083\u0001\u0010\bR\u0019\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u0010\u0089\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001a\u0010\u008c\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR\u001a\u0010\u008f\u0001\u001a\u00020\u000f8\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0011\u001a\u0005\b\u008e\u0001\u0010\u0013R\u0019\u0010\u0091\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0004\b8\u0010\bR\u001a\u0010\u0094\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0006\u001a\u0005\b\u0093\u0001\u0010\bR\u001a\u0010\u0097\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR\u0019\u0010\u0099\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0098\u0001\u0010\u0006\u001a\u0004\b;\u0010\bR\u001a\u0010\u009c\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0006\u001a\u0005\b\u009b\u0001\u0010\b¨\u0006\u009d\u0001"}, d2 = {"Ll2/h1;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "ClockDialColor", "Lc5/h;", "c", "F", "()F", "ClockDialContainerSize", "Ll2/k1;", "d", "Ll2/k1;", "getClockDialLabelTextFont", "()Ll2/k1;", "ClockDialLabelTextFont", "e", "ClockDialSelectedLabelTextColor", "f", "getClockDialSelectorCenterContainerColor", "ClockDialSelectorCenterContainerColor", "Ll2/w0;", "g", "Ll2/w0;", "getClockDialSelectorCenterContainerShape", "()Ll2/w0;", "ClockDialSelectorCenterContainerShape", "h", "getClockDialSelectorCenterContainerSize-D9Ej5fM", "ClockDialSelectorCenterContainerSize", "i", "ClockDialSelectorHandleContainerColor", "j", "getClockDialSelectorHandleContainerShape", "ClockDialSelectorHandleContainerShape", "k", "getClockDialSelectorHandleContainerSize-D9Ej5fM", "ClockDialSelectorHandleContainerSize", "l", "getClockDialSelectorTrackContainerColor", "ClockDialSelectorTrackContainerColor", "m", "getClockDialSelectorTrackContainerWidth-D9Ej5fM", "ClockDialSelectorTrackContainerWidth", "n", "getClockDialShape", "ClockDialShape", "o", "ClockDialUnselectedLabelTextColor", "p", "ContainerColor", "q", "getContainerElevation-D9Ej5fM", "ContainerElevation", "r", "getContainerShape", "ContainerShape", "s", "getHeadlineColor", "HeadlineColor", "t", "getHeadlineFont", "HeadlineFont", "u", "PeriodSelectorContainerShape", "v", "getPeriodSelectorHorizontalContainerHeight-D9Ej5fM", "PeriodSelectorHorizontalContainerHeight", "w", "getPeriodSelectorHorizontalContainerWidth-D9Ej5fM", "PeriodSelectorHorizontalContainerWidth", "x", "PeriodSelectorLabelTextFont", "y", "PeriodSelectorOutlineColor", "z", "PeriodSelectorOutlineWidth", "A", "PeriodSelectorSelectedContainerColor", "B", "getPeriodSelectorSelectedFocusLabelTextColor", "PeriodSelectorSelectedFocusLabelTextColor", "C", "getPeriodSelectorSelectedHoverLabelTextColor", "PeriodSelectorSelectedHoverLabelTextColor", ip.a.f96138c, "PeriodSelectorSelectedLabelTextColor", "E", "getPeriodSelectorSelectedPressedLabelTextColor", "PeriodSelectorSelectedPressedLabelTextColor", "getPeriodSelectorUnselectedFocusLabelTextColor", "PeriodSelectorUnselectedFocusLabelTextColor", "G", "getPeriodSelectorUnselectedHoverLabelTextColor", "PeriodSelectorUnselectedHoverLabelTextColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "PeriodSelectorUnselectedLabelTextColor", "I", "getPeriodSelectorUnselectedPressedLabelTextColor", "PeriodSelectorUnselectedPressedLabelTextColor", "J", "getPeriodSelectorVerticalContainerHeight-D9Ej5fM", "PeriodSelectorVerticalContainerHeight", "K", "getPeriodSelectorVerticalContainerWidth-D9Ej5fM", "PeriodSelectorVerticalContainerWidth", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "getTimeSelector24HVerticalContainerWidth-D9Ej5fM", "TimeSelector24HVerticalContainerWidth", "M", "getTimeSelectorContainerHeight-D9Ej5fM", "TimeSelectorContainerHeight", "N", "TimeSelectorContainerShape", "O", "getTimeSelectorContainerWidth-D9Ej5fM", "TimeSelectorContainerWidth", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "getTimeSelectorLabelTextFont", "TimeSelectorLabelTextFont", "Q", "TimeSelectorSelectedContainerColor", "R", "getTimeSelectorSelectedFocusLabelTextColor", "TimeSelectorSelectedFocusLabelTextColor", ip.a.f96137b, "getTimeSelectorSelectedHoverLabelTextColor", "TimeSelectorSelectedHoverLabelTextColor", "T", "TimeSelectorSelectedLabelTextColor", "U", "getTimeSelectorSelectedPressedLabelTextColor", "TimeSelectorSelectedPressedLabelTextColor", "V", "getTimeSelectorSeparatorColor", "TimeSelectorSeparatorColor", "W", "getTimeSelectorSeparatorFont", "TimeSelectorSeparatorFont", "X", "TimeSelectorUnselectedContainerColor", "Y", "getTimeSelectorUnselectedFocusLabelTextColor", "TimeSelectorUnselectedFocusLabelTextColor", "Z", "getTimeSelectorUnselectedHoverLabelTextColor", "TimeSelectorUnselectedHoverLabelTextColor", "a0", "TimeSelectorUnselectedLabelTextColor", "b0", "getTimeSelectorUnselectedPressedLabelTextColor", "TimeSelectorUnselectedPressedLabelTextColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final p PeriodSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final p PeriodSelectorSelectedFocusLabelTextColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p PeriodSelectorSelectedHoverLabelTextColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final p PeriodSelectorSelectedLabelTextColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p PeriodSelectorSelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final p PeriodSelectorUnselectedFocusLabelTextColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final p PeriodSelectorUnselectedHoverLabelTextColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final p PeriodSelectorUnselectedLabelTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final p PeriodSelectorUnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final float PeriodSelectorVerticalContainerHeight;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final float PeriodSelectorVerticalContainerWidth;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final float TimeSelector24HVerticalContainerWidth;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final float TimeSelectorContainerHeight;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final w0 TimeSelectorContainerShape;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final float TimeSelectorContainerWidth;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final k1 TimeSelectorLabelTextFont;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final p TimeSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final p TimeSelectorSelectedFocusLabelTextColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final p TimeSelectorSelectedHoverLabelTextColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final p TimeSelectorSelectedLabelTextColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final p TimeSelectorSelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final p TimeSelectorSeparatorColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final k1 TimeSelectorSeparatorFont;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final p TimeSelectorUnselectedContainerColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final p TimeSelectorUnselectedFocusLabelTextColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final p TimeSelectorUnselectedHoverLabelTextColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f114662a = new h1();

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final p TimeSelectorUnselectedLabelTextColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ClockDialColor;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final p TimeSelectorUnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ClockDialContainerSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final k1 ClockDialLabelTextFont;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p ClockDialSelectedLabelTextColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p ClockDialSelectorCenterContainerColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final w0 ClockDialSelectorCenterContainerShape;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float ClockDialSelectorCenterContainerSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final p ClockDialSelectorHandleContainerColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final w0 ClockDialSelectorHandleContainerShape;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float ClockDialSelectorHandleContainerSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p ClockDialSelectorTrackContainerColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float ClockDialSelectorTrackContainerWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final w0 ClockDialShape;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p ClockDialUnselectedLabelTextColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p HeadlineColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final k1 HeadlineFont;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final w0 PeriodSelectorContainerShape;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final float PeriodSelectorHorizontalContainerHeight;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final float PeriodSelectorHorizontalContainerWidth;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final k1 PeriodSelectorLabelTextFont;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorOutlineColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final float PeriodSelectorOutlineWidth;

    static {
        p pVar = p.SurfaceContainerHighest;
        ClockDialColor = pVar;
        ClockDialContainerSize = c5.h.n((float) 256.0d);
        ClockDialLabelTextFont = k1.BodyLarge;
        ClockDialSelectedLabelTextColor = p.OnPrimary;
        p pVar2 = p.Primary;
        ClockDialSelectorCenterContainerColor = pVar2;
        w0 w0Var = w0.CornerFull;
        ClockDialSelectorCenterContainerShape = w0Var;
        ClockDialSelectorCenterContainerSize = c5.h.n((float) 8.0d);
        ClockDialSelectorHandleContainerColor = pVar2;
        ClockDialSelectorHandleContainerShape = w0Var;
        ClockDialSelectorHandleContainerSize = c5.h.n((float) 48.0d);
        ClockDialSelectorTrackContainerColor = pVar2;
        ClockDialSelectorTrackContainerWidth = c5.h.n((float) 2.0d);
        ClockDialShape = w0Var;
        p pVar3 = p.OnSurface;
        ClockDialUnselectedLabelTextColor = pVar3;
        ContainerColor = p.SurfaceContainerHigh;
        ContainerElevation = t.f115244a.d();
        ContainerShape = w0.CornerExtraLarge;
        p pVar4 = p.OnSurfaceVariant;
        HeadlineColor = pVar4;
        HeadlineFont = k1.LabelMedium;
        w0 w0Var2 = w0.CornerSmall;
        PeriodSelectorContainerShape = w0Var2;
        PeriodSelectorHorizontalContainerHeight = c5.h.n((float) 38.0d);
        PeriodSelectorHorizontalContainerWidth = c5.h.n((float) 216.0d);
        PeriodSelectorLabelTextFont = k1.TitleMedium;
        PeriodSelectorOutlineColor = p.Outline;
        PeriodSelectorOutlineWidth = c5.h.n((float) 1.0d);
        PeriodSelectorSelectedContainerColor = p.TertiaryContainer;
        p pVar5 = p.OnTertiaryContainer;
        PeriodSelectorSelectedFocusLabelTextColor = pVar5;
        PeriodSelectorSelectedHoverLabelTextColor = pVar5;
        PeriodSelectorSelectedLabelTextColor = pVar5;
        PeriodSelectorSelectedPressedLabelTextColor = pVar5;
        PeriodSelectorUnselectedFocusLabelTextColor = pVar4;
        PeriodSelectorUnselectedHoverLabelTextColor = pVar4;
        PeriodSelectorUnselectedLabelTextColor = pVar4;
        PeriodSelectorUnselectedPressedLabelTextColor = pVar4;
        float f15 = (float) 80.0d;
        PeriodSelectorVerticalContainerHeight = c5.h.n(f15);
        PeriodSelectorVerticalContainerWidth = c5.h.n((float) 52.0d);
        TimeSelector24HVerticalContainerWidth = c5.h.n((float) 114.0d);
        TimeSelectorContainerHeight = c5.h.n(f15);
        TimeSelectorContainerShape = w0Var2;
        TimeSelectorContainerWidth = c5.h.n((float) 96.0d);
        k1 k1Var = k1.DisplayLarge;
        TimeSelectorLabelTextFont = k1Var;
        TimeSelectorSelectedContainerColor = p.PrimaryContainer;
        p pVar6 = p.OnPrimaryContainer;
        TimeSelectorSelectedFocusLabelTextColor = pVar6;
        TimeSelectorSelectedHoverLabelTextColor = pVar6;
        TimeSelectorSelectedLabelTextColor = pVar6;
        TimeSelectorSelectedPressedLabelTextColor = pVar6;
        TimeSelectorSeparatorColor = pVar3;
        TimeSelectorSeparatorFont = k1Var;
        TimeSelectorUnselectedContainerColor = pVar;
        TimeSelectorUnselectedFocusLabelTextColor = pVar3;
        TimeSelectorUnselectedHoverLabelTextColor = pVar3;
        TimeSelectorUnselectedLabelTextColor = pVar3;
        TimeSelectorUnselectedPressedLabelTextColor = pVar3;
    }

    private h1() {
    }

    public final p a() {
        return ClockDialColor;
    }

    public final float b() {
        return ClockDialContainerSize;
    }

    public final p c() {
        return ClockDialSelectedLabelTextColor;
    }

    public final p d() {
        return ClockDialSelectorHandleContainerColor;
    }

    public final p e() {
        return ClockDialUnselectedLabelTextColor;
    }

    public final p f() {
        return ContainerColor;
    }

    public final w0 g() {
        return PeriodSelectorContainerShape;
    }

    public final k1 h() {
        return PeriodSelectorLabelTextFont;
    }

    public final p i() {
        return PeriodSelectorOutlineColor;
    }

    public final float j() {
        return PeriodSelectorOutlineWidth;
    }

    public final p k() {
        return PeriodSelectorSelectedContainerColor;
    }

    public final p l() {
        return PeriodSelectorSelectedLabelTextColor;
    }

    public final p m() {
        return PeriodSelectorUnselectedLabelTextColor;
    }

    public final w0 n() {
        return TimeSelectorContainerShape;
    }

    public final p o() {
        return TimeSelectorSelectedContainerColor;
    }

    public final p p() {
        return TimeSelectorSelectedLabelTextColor;
    }

    public final p q() {
        return TimeSelectorUnselectedContainerColor;
    }

    public final p r() {
        return TimeSelectorUnselectedLabelTextColor;
    }
}
