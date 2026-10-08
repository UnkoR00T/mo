package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\bs\n\u0002\u0018\u0002\n\u0002\b \bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010 \u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010&\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u000eR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001a\u0010*\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u001a\u0010.\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b!\u0010\u000eR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u00102\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b'\u0010\u000eR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b)\u0010\bR\u001a\u00106\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\f\u001a\u0004\b+\u0010\u000eR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b-\u0010\bR\u001a\u0010:\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b/\u0010\u000eR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bW\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010^\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\bR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\b=\u0010\bR\u0017\u0010m\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010p\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bn\u0010\f\u001a\u0004\bo\u0010\u000eR\u0017\u0010r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010v\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010x\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bw\u0010\u0006\u001a\u0004\bK\u0010\bR\u0017\u0010z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010}\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u0018\u0010\u0080\u0001\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b~\u0010\f\u001a\u0004\b\u007f\u0010\u000eR\u001a\u0010\u0083\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR\u001a\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR\u001a\u0010\u0089\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001a\u0010\u008c\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR\u001a\u0010\u008f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u0019\u0010\u0091\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0004\bQ\u0010\bR\u001d\u0010\u0097\u0001\u001a\u00030\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0098\u0001\u0010\u0006\u001a\u0004\bT\u0010\bR\u0019\u0010\u009b\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u009a\u0001\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0019\u0010\u009d\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u009c\u0001\u0010\u0006\u001a\u0004\bY\u0010\bR\u0019\u0010\u009f\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u009e\u0001\u0010\u0006\u001a\u0004\b\\\u0010\bR\u001d\u0010¢\u0001\u001a\u00030\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b \u0001\u0010\u0094\u0001\u001a\u0006\b¡\u0001\u0010\u0096\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b£\u0001\u0010\u0006\u001a\u0004\b_\u0010\bR\u001a\u0010§\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010\f\u001a\u0005\b¦\u0001\u0010\u000eR\u0019\u0010©\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b¨\u0001\u0010\u0006\u001a\u0004\bb\u0010\bR\u001d\u0010¬\u0001\u001a\u00030\u0092\u00018\u0006¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0094\u0001\u001a\u0006\b«\u0001\u0010\u0096\u0001R\u0019\u0010®\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u00ad\u0001\u0010\u0006\u001a\u0004\bd\u0010\bR\u001a\u0010±\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010\f\u001a\u0005\b°\u0001\u0010\u000e¨\u0006²\u0001"}, d2 = {"Ll2/d0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "ActiveIndicatorColor", "Lc5/h;", "c", "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "d", "CaretColor", "e", "ContainerColor", "Ll2/w0;", "f", "Ll2/w0;", "()Ll2/w0;", "ContainerShape", "g", "DisabledActiveIndicatorColor", "h", "getDisabledActiveIndicatorHeight-D9Ej5fM", "DisabledActiveIndicatorHeight", "", "i", "DisabledActiveIndicatorOpacity", "j", "getDisabledContainerColor", "DisabledContainerColor", "k", "getDisabledContainerOpacity", "DisabledContainerOpacity", "l", "DisabledInputColor", "m", "DisabledInputOpacity", "n", "DisabledLabelColor", "o", "DisabledLabelOpacity", "p", "DisabledLeadingIconColor", "q", "DisabledLeadingIconOpacity", "r", "DisabledSupportingColor", "s", "DisabledSupportingOpacity", "t", "DisabledTrailingIconColor", "u", "DisabledTrailingIconOpacity", "v", "ErrorActiveIndicatorColor", "w", "getErrorFocusActiveIndicatorColor", "ErrorFocusActiveIndicatorColor", "x", "ErrorFocusCaretColor", "y", "getErrorFocusInputColor", "ErrorFocusInputColor", "z", "getErrorFocusLabelColor", "ErrorFocusLabelColor", "A", "getErrorFocusLeadingIconColor", "ErrorFocusLeadingIconColor", "B", "getErrorFocusSupportingColor", "ErrorFocusSupportingColor", "C", "getErrorFocusTrailingIconColor", "ErrorFocusTrailingIconColor", ip.a.f96138c, "getErrorHoverActiveIndicatorColor", "ErrorHoverActiveIndicatorColor", "E", "getErrorHoverInputColor", "ErrorHoverInputColor", "getErrorHoverLabelColor", "ErrorHoverLabelColor", "G", "getErrorHoverLeadingIconColor", "ErrorHoverLeadingIconColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getErrorHoverSupportingColor", "ErrorHoverSupportingColor", "I", "getErrorHoverTrailingIconColor", "ErrorHoverTrailingIconColor", "J", "ErrorInputColor", "K", "ErrorLabelColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "ErrorLeadingIconColor", "M", "ErrorSupportingColor", "N", "ErrorTrailingIconColor", "O", "FocusActiveIndicatorColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "getFocusActiveIndicatorHeight-D9Ej5fM", "FocusActiveIndicatorHeight", "Q", "FocusInputColor", "R", "FocusLabelColor", ip.a.f96137b, "FocusLeadingIconColor", "T", "FocusSupportingColor", "U", "FocusTrailingIconColor", "V", "getHoverActiveIndicatorColor", "HoverActiveIndicatorColor", "W", "getHoverActiveIndicatorHeight-D9Ej5fM", "HoverActiveIndicatorHeight", "X", "getHoverInputColor", "HoverInputColor", "Y", "getHoverLabelColor", "HoverLabelColor", "Z", "getHoverLeadingIconColor", "HoverLeadingIconColor", "a0", "getHoverSupportingColor", "HoverSupportingColor", "b0", "getHoverTrailingIconColor", "HoverTrailingIconColor", "c0", "InputColor", "Ll2/k1;", "d0", "Ll2/k1;", "getInputFont", "()Ll2/k1;", "InputFont", "e0", "InputPlaceholderColor", "f0", "InputPrefixColor", "g0", "InputSuffixColor", "h0", "LabelColor", "i0", "getLabelFont", "LabelFont", "j0", "LeadingIconColor", "k0", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "l0", "SupportingColor", "m0", "getSupportingFont", "SupportingFont", "n0", "TrailingIconColor", "o0", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final p ErrorFocusLeadingIconColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final p ErrorFocusSupportingColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p ErrorFocusTrailingIconColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final p ErrorHoverActiveIndicatorColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p ErrorHoverInputColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final p ErrorHoverLabelColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final p ErrorHoverLeadingIconColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final p ErrorHoverSupportingColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final p ErrorHoverTrailingIconColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final p ErrorInputColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final p ErrorLabelColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final p ErrorLeadingIconColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final p ErrorSupportingColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final p ErrorTrailingIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final p FocusActiveIndicatorColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final float FocusActiveIndicatorHeight;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final p FocusInputColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final p FocusLabelColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final p FocusLeadingIconColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final p FocusSupportingColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final p FocusTrailingIconColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final p HoverActiveIndicatorColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final float HoverActiveIndicatorHeight;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final p HoverInputColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final p HoverLabelColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final p HoverLeadingIconColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f114374a = new d0();

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final p HoverSupportingColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveIndicatorColor;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final p HoverTrailingIconColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveIndicatorHeight;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private static final p InputColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p CaretColor;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private static final k1 InputFont;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private static final p InputPlaceholderColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private static final p InputPrefixColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledActiveIndicatorColor;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private static final p InputSuffixColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledActiveIndicatorHeight;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private static final p LabelColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledActiveIndicatorOpacity;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private static final k1 LabelFont;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledContainerColor;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private static final p LeadingIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerOpacity;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private static final float LeadingIconSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledInputColor;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private static final p SupportingColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledInputOpacity;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private static final k1 SupportingFont;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledLabelColor;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private static final p TrailingIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledLabelOpacity;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private static final float TrailingIconSize;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledLeadingIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledLeadingIconOpacity;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledSupportingColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledSupportingOpacity;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledTrailingIconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledTrailingIconOpacity;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorActiveIndicatorColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusActiveIndicatorColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusCaretColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusInputColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusLabelColor;

    static {
        p pVar = p.OnSurfaceVariant;
        ActiveIndicatorColor = pVar;
        float f15 = (float) 1.0d;
        ActiveIndicatorHeight = c5.h.n(f15);
        p pVar2 = p.Primary;
        CaretColor = pVar2;
        ContainerColor = p.SurfaceContainerHighest;
        ContainerShape = w0.CornerExtraSmallTop;
        p pVar3 = p.OnSurface;
        DisabledActiveIndicatorColor = pVar3;
        DisabledActiveIndicatorHeight = c5.h.n(f15);
        DisabledActiveIndicatorOpacity = 0.38f;
        DisabledContainerColor = pVar3;
        DisabledContainerOpacity = 0.04f;
        DisabledInputColor = pVar3;
        DisabledInputOpacity = 0.38f;
        DisabledLabelColor = pVar3;
        DisabledLabelOpacity = 0.38f;
        DisabledLeadingIconColor = pVar3;
        DisabledLeadingIconOpacity = 0.38f;
        DisabledSupportingColor = pVar3;
        DisabledSupportingOpacity = 0.38f;
        DisabledTrailingIconColor = pVar3;
        DisabledTrailingIconOpacity = 0.38f;
        p pVar4 = p.Error;
        ErrorActiveIndicatorColor = pVar4;
        ErrorFocusActiveIndicatorColor = pVar4;
        ErrorFocusCaretColor = pVar4;
        ErrorFocusInputColor = pVar3;
        ErrorFocusLabelColor = pVar4;
        ErrorFocusLeadingIconColor = pVar;
        ErrorFocusSupportingColor = pVar4;
        ErrorFocusTrailingIconColor = pVar4;
        p pVar5 = p.OnErrorContainer;
        ErrorHoverActiveIndicatorColor = pVar5;
        ErrorHoverInputColor = pVar3;
        ErrorHoverLabelColor = pVar5;
        ErrorHoverLeadingIconColor = pVar;
        ErrorHoverSupportingColor = pVar4;
        ErrorHoverTrailingIconColor = pVar5;
        ErrorInputColor = pVar3;
        ErrorLabelColor = pVar4;
        ErrorLeadingIconColor = pVar;
        ErrorSupportingColor = pVar4;
        ErrorTrailingIconColor = pVar4;
        FocusActiveIndicatorColor = pVar2;
        FocusActiveIndicatorHeight = c5.h.n((float) 2.0d);
        FocusInputColor = pVar3;
        FocusLabelColor = pVar2;
        FocusLeadingIconColor = pVar;
        FocusSupportingColor = pVar;
        FocusTrailingIconColor = pVar;
        HoverActiveIndicatorColor = pVar3;
        HoverActiveIndicatorHeight = c5.h.n(f15);
        HoverInputColor = pVar3;
        HoverLabelColor = pVar;
        HoverLeadingIconColor = pVar;
        HoverSupportingColor = pVar;
        HoverTrailingIconColor = pVar;
        InputColor = pVar3;
        k1 k1Var = k1.BodyLarge;
        InputFont = k1Var;
        InputPlaceholderColor = pVar;
        InputPrefixColor = pVar;
        InputSuffixColor = pVar;
        LabelColor = pVar;
        LabelFont = k1Var;
        LeadingIconColor = pVar;
        float f16 = (float) 24.0d;
        LeadingIconSize = c5.h.n(f16);
        SupportingColor = pVar;
        SupportingFont = k1.BodySmall;
        TrailingIconColor = pVar;
        TrailingIconSize = c5.h.n(f16);
    }

    private d0() {
    }

    public final p A() {
        return FocusLeadingIconColor;
    }

    public final p B() {
        return FocusSupportingColor;
    }

    public final p C() {
        return FocusTrailingIconColor;
    }

    public final p D() {
        return InputColor;
    }

    public final p E() {
        return InputPlaceholderColor;
    }

    public final p F() {
        return InputPrefixColor;
    }

    public final p G() {
        return InputSuffixColor;
    }

    public final p H() {
        return LabelColor;
    }

    public final p I() {
        return LeadingIconColor;
    }

    public final p J() {
        return SupportingColor;
    }

    public final p K() {
        return TrailingIconColor;
    }

    public final p a() {
        return ActiveIndicatorColor;
    }

    public final p b() {
        return CaretColor;
    }

    public final p c() {
        return ContainerColor;
    }

    public final w0 d() {
        return ContainerShape;
    }

    public final p e() {
        return DisabledActiveIndicatorColor;
    }

    public final float f() {
        return DisabledActiveIndicatorOpacity;
    }

    public final p g() {
        return DisabledInputColor;
    }

    public final float h() {
        return DisabledInputOpacity;
    }

    public final p i() {
        return DisabledLabelColor;
    }

    public final float j() {
        return DisabledLabelOpacity;
    }

    public final p k() {
        return DisabledLeadingIconColor;
    }

    public final float l() {
        return DisabledLeadingIconOpacity;
    }

    public final p m() {
        return DisabledSupportingColor;
    }

    public final float n() {
        return DisabledSupportingOpacity;
    }

    public final p o() {
        return DisabledTrailingIconColor;
    }

    public final float p() {
        return DisabledTrailingIconOpacity;
    }

    public final p q() {
        return ErrorActiveIndicatorColor;
    }

    public final p r() {
        return ErrorFocusCaretColor;
    }

    public final p s() {
        return ErrorInputColor;
    }

    public final p t() {
        return ErrorLabelColor;
    }

    public final p u() {
        return ErrorLeadingIconColor;
    }

    public final p v() {
        return ErrorSupportingColor;
    }

    public final p w() {
        return ErrorTrailingIconColor;
    }

    public final p x() {
        return FocusActiveIndicatorColor;
    }

    public final p y() {
        return FocusInputColor;
    }

    public final p z() {
        return FocusLabelColor;
    }
}
