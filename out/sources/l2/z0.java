package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bt\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0005\u0010#R\u0017\u0010'\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u0017\u0010-\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u0017\u0010/\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b\u000b\u0010#R\u001a\u00101\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u00103\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b\u0011\u0010#R\u001a\u00105\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u00108\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010:\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b\u001a\u0010#R\u001a\u0010<\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010?\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b=\u0010\"\u001a\u0004\b>\u0010#R\u0017\u0010B\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010#R\u0017\u0010E\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bF\u0010\"\u001a\u0004\bG\u0010#R\u0017\u0010K\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bI\u0010\"\u001a\u0004\bJ\u0010#R\u0017\u0010M\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bL\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010O\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\b%\u0010\bR\u0017\u0010Q\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bP\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u0017\u0010S\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u0010V\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bT\u0010\"\u001a\u0004\bU\u0010#R\u0017\u0010Y\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010\\\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bZ\u0010\"\u001a\u0004\b[\u0010#R\u001a\u0010^\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\u0006\u001a\u0004\b]\u0010\bR\u0017\u0010`\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b_\u0010\"\u001a\u0004\b.\u0010#R\u0017\u0010b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u0010e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bc\u0010\u0016\u001a\u0004\bd\u0010\u0018R\u0017\u0010h\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bf\u0010\"\u001a\u0004\bg\u0010#R\u0017\u0010k\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bi\u0010\"\u001a\u0004\bj\u0010#R\u0017\u0010n\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bl\u0010\"\u001a\u0004\bm\u0010#R\u0017\u0010q\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bo\u0010\"\u001a\u0004\bp\u0010#R\u0017\u0010t\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bs\u0010\bR\u0017\u0010w\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bu\u0010\"\u001a\u0004\bv\u0010#R\u0017\u0010z\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bx\u0010\"\u001a\u0004\by\u0010#R\u0017\u0010}\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b{\u0010\"\u001a\u0004\b|\u0010#R\u0018\u0010\u0080\u0001\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b~\u0010\"\u001a\u0004\b\u007f\u0010#R\u001a\u0010\u0083\u0001\u001a\u00020 8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\"\u001a\u0005\b\u0082\u0001\u0010#R\u001a\u0010\u0086\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0016\u001a\u0005\b\u0085\u0001\u0010\u0018R\u0019\u0010\u0088\u0001\u001a\u00020\n8\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u0010\u008b\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR\u001a\u0010\u008e\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0006\u001a\u0005\b\u008d\u0001\u0010\bR\u001a\u0010\u0091\u0001\u001a\u00020 8\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\"\u001a\u0005\b\u0090\u0001\u0010#R\u001a\u0010\u0094\u0001\u001a\u00020 8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\"\u001a\u0005\b\u0093\u0001\u0010#R\u001d\u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009b\u0001"}, d2 = {"Ll2/z0;", "", "<init>", "()V", "", "b", "F", "getActiveContainerOpacity", "()F", "ActiveContainerOpacity", "Lc5/h;", "c", "getActiveHandleHeight-D9Ej5fM", "ActiveHandleHeight", "d", "a", "ActiveHandleLeadingSpace", "e", "getActiveHandlePadding-D9Ej5fM", "ActiveHandlePadding", "Ll2/w0;", "f", "Ll2/w0;", "getActiveHandleShape", "()Ll2/w0;", "ActiveHandleShape", "g", "getActiveHandleTrailingSpace-D9Ej5fM", "ActiveHandleTrailingSpace", "h", "getActiveHandleWidth-D9Ej5fM", "ActiveHandleWidth", "Ll2/p;", "i", "Ll2/p;", "()Ll2/p;", "ActiveTrackColor", "j", "getActiveTrackHeight-D9Ej5fM", "ActiveTrackHeight", "k", "getActiveTrackShape", "ActiveTrackShape", "l", "getActiveTrackShapeLeading", "ActiveTrackShapeLeading", "m", "DisabledActiveTrackColor", "n", "DisabledActiveTrackOpacity", "o", "DisabledHandleColor", "p", "DisabledHandleOpacity", "q", "getDisabledHandleWidth-D9Ej5fM", "DisabledHandleWidth", "r", "DisabledInactiveTrackColor", "s", "DisabledInactiveTrackOpacity", "t", "getDisabledStopColor", "DisabledStopColor", "u", "getFocusActiveTrackColor", "FocusActiveTrackColor", "v", "getFocusHandleWidth-D9Ej5fM", "FocusHandleWidth", "w", "getFocusInactiveTrackColor", "FocusInactiveTrackColor", "x", "getFocusStopColor", "FocusStopColor", "y", "HandleColor", "z", "HandleHeight", "A", "HandleShape", "B", "HandleWidth", "C", "getHoverHandleColor", "HoverHandleColor", ip.a.f96138c, "getHoverHandleWidth-D9Ej5fM", "HoverHandleWidth", "E", "getHoverStopColor", "HoverStopColor", "getInactiveContainerOpacity", "InactiveContainerOpacity", "G", "InactiveTrackColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "InactiveTrackHeight", "I", "getInactiveTrackShape", "InactiveTrackShape", "J", "getLabelContainerColor", "LabelContainerColor", "K", "getLabelTextColor", "LabelTextColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "getPressedActiveTrackColor", "PressedActiveTrackColor", "M", "getPressedHandleColor", "PressedHandleColor", "N", "getPressedHandleWidth-D9Ej5fM", "PressedHandleWidth", "O", "getPressedInactiveTrackColor", "PressedInactiveTrackColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "getPressedStopColor", "PressedStopColor", "Q", "getSliderActiveHandleColor", "SliderActiveHandleColor", "R", "getStopIndicatorColor", "StopIndicatorColor", ip.a.f96137b, "getStopIndicatorColorSelected", "StopIndicatorColorSelected", "T", "getStopIndicatorShape", "StopIndicatorShape", "U", "StopIndicatorSize", "V", "getStopIndicatorTrailingSpace-D9Ej5fM", "StopIndicatorTrailingSpace", "W", "getValueIndicatorActiveBottomSpace-D9Ej5fM", "ValueIndicatorActiveBottomSpace", "X", "getValueIndicatorContainerColor", "ValueIndicatorContainerColor", "Y", "getValueIndicatorLabelTextColor", "ValueIndicatorLabelTextColor", "Ll2/k1;", "Z", "Ll2/k1;", "getValueIndicatorLabelTextFont", "()Ll2/k1;", "ValueIndicatorLabelTextFont", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final w0 HandleShape;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final float HandleWidth;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p HoverHandleColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final float HoverHandleWidth;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p HoverStopColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final float InactiveContainerOpacity;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final p InactiveTrackColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final float InactiveTrackHeight;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final w0 InactiveTrackShape;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final p LabelContainerColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final p LabelTextColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final p PressedActiveTrackColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final p PressedHandleColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final float PressedHandleWidth;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final p PressedInactiveTrackColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final p PressedStopColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final p SliderActiveHandleColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final p StopIndicatorColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final p StopIndicatorColorSelected;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final w0 StopIndicatorShape;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final float StopIndicatorSize;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final float StopIndicatorTrailingSpace;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final float ValueIndicatorActiveBottomSpace;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final p ValueIndicatorContainerColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final p ValueIndicatorLabelTextColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final k1 ValueIndicatorLabelTextFont;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f115398a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveContainerOpacity = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveHandleHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveHandleLeadingSpace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveHandlePadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final w0 ActiveHandleShape;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveHandleTrailingSpace;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveHandleWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveTrackColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveTrackHeight;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final w0 ActiveTrackShape;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final w0 ActiveTrackShapeLeading;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledActiveTrackColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledActiveTrackOpacity;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledHandleColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledHandleOpacity;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledHandleWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledInactiveTrackColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledInactiveTrackOpacity;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledStopColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final p FocusActiveTrackColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final float FocusHandleWidth;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final p FocusInactiveTrackColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p FocusStopColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final p HandleColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final float HandleHeight;

    static {
        float f15 = (float) 44.0d;
        ActiveHandleHeight = c5.h.n(f15);
        float f16 = (float) 6.0d;
        ActiveHandleLeadingSpace = c5.h.n(f16);
        ActiveHandlePadding = c5.h.n(f16);
        w0 w0Var = w0.CornerFull;
        ActiveHandleShape = w0Var;
        ActiveHandleTrailingSpace = c5.h.n(f16);
        float f17 = (float) 4.0d;
        ActiveHandleWidth = c5.h.n(f17);
        p pVar = p.Primary;
        ActiveTrackColor = pVar;
        float f18 = (float) 16.0d;
        ActiveTrackHeight = c5.h.n(f18);
        ActiveTrackShape = w0Var;
        ActiveTrackShapeLeading = w0Var;
        p pVar2 = p.OnSurface;
        DisabledActiveTrackColor = pVar2;
        DisabledActiveTrackOpacity = 0.38f;
        DisabledHandleColor = pVar2;
        DisabledHandleOpacity = 0.38f;
        DisabledHandleWidth = c5.h.n(f17);
        DisabledInactiveTrackColor = pVar2;
        DisabledInactiveTrackOpacity = 0.12f;
        DisabledStopColor = pVar2;
        FocusActiveTrackColor = pVar;
        float f19 = (float) 2.0d;
        FocusHandleWidth = c5.h.n(f19);
        p pVar3 = p.SecondaryContainer;
        FocusInactiveTrackColor = pVar3;
        FocusStopColor = pVar;
        HandleColor = pVar;
        HandleHeight = c5.h.n(f15);
        HandleShape = w0Var;
        HandleWidth = c5.h.n(f17);
        HoverHandleColor = pVar;
        HoverHandleWidth = c5.h.n(f17);
        HoverStopColor = pVar;
        InactiveContainerOpacity = 1.0f;
        InactiveTrackColor = pVar3;
        InactiveTrackHeight = c5.h.n(f18);
        InactiveTrackShape = w0Var;
        LabelContainerColor = pVar;
        p pVar4 = p.InverseOnSurface;
        LabelTextColor = pVar4;
        PressedActiveTrackColor = pVar;
        PressedHandleColor = pVar;
        PressedHandleWidth = c5.h.n(f19);
        PressedInactiveTrackColor = pVar3;
        PressedStopColor = pVar;
        SliderActiveHandleColor = pVar;
        StopIndicatorColor = pVar3;
        StopIndicatorColorSelected = pVar3;
        StopIndicatorShape = w0Var;
        StopIndicatorSize = c5.h.n(f17);
        StopIndicatorTrailingSpace = c5.h.n(f16);
        ValueIndicatorActiveBottomSpace = c5.h.n((float) 12.0d);
        ValueIndicatorContainerColor = p.InverseSurface;
        ValueIndicatorLabelTextColor = pVar4;
        ValueIndicatorLabelTextFont = k1.LabelLarge;
    }

    private z0() {
    }

    public final float a() {
        return ActiveHandleLeadingSpace;
    }

    public final p b() {
        return ActiveTrackColor;
    }

    public final p c() {
        return DisabledActiveTrackColor;
    }

    public final float d() {
        return DisabledActiveTrackOpacity;
    }

    public final p e() {
        return DisabledHandleColor;
    }

    public final float f() {
        return DisabledHandleOpacity;
    }

    public final p g() {
        return DisabledInactiveTrackColor;
    }

    public final float h() {
        return DisabledInactiveTrackOpacity;
    }

    public final p i() {
        return HandleColor;
    }

    public final float j() {
        return HandleHeight;
    }

    public final w0 k() {
        return HandleShape;
    }

    public final float l() {
        return HandleWidth;
    }

    public final p m() {
        return InactiveTrackColor;
    }

    public final float n() {
        return InactiveTrackHeight;
    }

    public final float o() {
        return StopIndicatorSize;
    }
}
