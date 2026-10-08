package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bj\n\u0002\u0018\u0002\n\u0002\b%\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u0010\\\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010_\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b]\u0010\f\u001a\u0004\b^\u0010\u000eR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u0017\u0010r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bp\u0010\f\u001a\u0004\bq\u0010\u000eR\u0017\u0010u\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR\u0017\u0010x\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010\u0006\u001a\u0004\bw\u0010\bR\u0017\u0010z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bA\u0010\bR\u0018\u0010\u0080\u0001\u001a\u00020{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u0019\u0010\u0082\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0004\bD\u0010\bR\u0019\u0010\u0084\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0004\bG\u0010\bR\u0019\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0019\u0010\u0088\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0004\bL\u0010\bR\u001a\u0010\u008b\u0001\u001a\u00020{8\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010}\u001a\u0005\b\u008a\u0001\u0010\u007fR\u0019\u0010\u008d\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u008c\u0001\u0010\u0006\u001a\u0004\bN\u0010\bR\u001a\u0010\u0090\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\f\u001a\u0005\b\u008f\u0001\u0010\u000eR\u0019\u0010\u0092\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0004\bP\u0010\bR\u001a\u0010\u0095\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\f\u001a\u0005\b\u0094\u0001\u0010\u000eR\u0019\u0010\u0097\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0004\bR\u0010\bR\u001a\u0010\u009a\u0001\u001a\u00020{8\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010}\u001a\u0005\b\u0099\u0001\u0010\u007fR\u0019\u0010\u009c\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0004\bT\u0010\bR\u001a\u0010\u009f\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\f\u001a\u0005\b\u009e\u0001\u0010\u000e¨\u0006 \u0001"}, d2 = {"Ll2/n0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "CaretColor", "Lc5/h;", "c", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Ll2/w0;", "d", "Ll2/w0;", "()Ll2/w0;", "ContainerShape", "e", "DisabledInputColor", "f", "DisabledLabelColor", "g", "DisabledLeadingIconColor", "h", "DisabledOutlineColor", "i", "getDisabledOutlineWidth-D9Ej5fM", "DisabledOutlineWidth", "j", "DisabledSupportingColor", "k", "DisabledTrailingIconColor", "l", "ErrorFocusCaretColor", "m", "getErrorFocusInputColor", "ErrorFocusInputColor", "n", "getErrorFocusLabelColor", "ErrorFocusLabelColor", "o", "getErrorFocusLeadingIconColor", "ErrorFocusLeadingIconColor", "p", "getErrorFocusOutlineColor", "ErrorFocusOutlineColor", "q", "getErrorFocusSupportingColor", "ErrorFocusSupportingColor", "r", "getErrorFocusTrailingIconColor", "ErrorFocusTrailingIconColor", "s", "getErrorHoverInputColor", "ErrorHoverInputColor", "t", "getErrorHoverLabelColor", "ErrorHoverLabelColor", "u", "getErrorHoverLeadingIconColor", "ErrorHoverLeadingIconColor", "v", "getErrorHoverOutlineColor", "ErrorHoverOutlineColor", "w", "getErrorHoverSupportingColor", "ErrorHoverSupportingColor", "x", "getErrorHoverTrailingIconColor", "ErrorHoverTrailingIconColor", "y", "ErrorInputColor", "z", "ErrorLabelColor", "A", "ErrorLeadingIconColor", "B", "ErrorOutlineColor", "C", "ErrorSupportingColor", ip.a.f96138c, "ErrorTrailingIconColor", "E", "FocusInputColor", "FocusLabelColor", "G", "FocusLeadingIconColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "FocusOutlineColor", "I", "getFocusOutlineWidth-D9Ej5fM", "FocusOutlineWidth", "J", "FocusSupportingColor", "K", "FocusTrailingIconColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "getHoverInputColor", "HoverInputColor", "M", "getHoverLabelColor", "HoverLabelColor", "N", "getHoverLeadingIconColor", "HoverLeadingIconColor", "O", "getHoverOutlineColor", "HoverOutlineColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "getHoverOutlineWidth-D9Ej5fM", "HoverOutlineWidth", "Q", "getHoverSupportingColor", "HoverSupportingColor", "R", "getHoverTrailingIconColor", "HoverTrailingIconColor", ip.a.f96137b, "InputColor", "Ll2/k1;", "T", "Ll2/k1;", "getInputFont", "()Ll2/k1;", "InputFont", "U", "InputPlaceholderColor", "V", "InputPrefixColor", "W", "InputSuffixColor", "X", "LabelColor", "Y", "getLabelFont", "LabelFont", "Z", "LeadingIconColor", "a0", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "b0", "OutlineColor", "c0", "getOutlineWidth-D9Ej5fM", "OutlineWidth", "d0", "SupportingColor", "e0", "getSupportingFont", "SupportingFont", "f0", "TrailingIconColor", "g0", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final p ErrorLeadingIconColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final p ErrorOutlineColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p ErrorSupportingColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final p ErrorTrailingIconColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p FocusInputColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final p FocusLabelColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final p FocusLeadingIconColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final p FocusOutlineColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final float FocusOutlineWidth;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final p FocusSupportingColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final p FocusTrailingIconColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final p HoverInputColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final p HoverLabelColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final p HoverLeadingIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final p HoverOutlineColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final float HoverOutlineWidth;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final p HoverSupportingColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final p HoverTrailingIconColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final p InputColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final k1 InputFont;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final p InputPlaceholderColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final p InputPrefixColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final p InputSuffixColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final p LabelColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final k1 LabelFont;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final p LeadingIconColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f114976a = new n0();

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final float LeadingIconSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p CaretColor;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final p OutlineColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private static final float OutlineWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private static final p SupportingColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledInputColor;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private static final k1 SupportingFont;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledLabelColor;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private static final p TrailingIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledLeadingIconColor;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private static final float TrailingIconSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledOutlineColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledOutlineWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledSupportingColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledTrailingIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusCaretColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusInputColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusLabelColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusLeadingIconColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusOutlineColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusSupportingColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorFocusTrailingIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorHoverInputColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorHoverLabelColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorHoverLeadingIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorHoverOutlineColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorHoverSupportingColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorHoverTrailingIconColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorInputColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final p ErrorLabelColor;

    static {
        p pVar = p.Primary;
        CaretColor = pVar;
        ContainerHeight = c5.h.n((float) 56.0d);
        ContainerShape = w0.CornerExtraSmall;
        p pVar2 = p.OnSurface;
        DisabledInputColor = pVar2;
        DisabledLabelColor = pVar2;
        DisabledLeadingIconColor = pVar2;
        DisabledOutlineColor = pVar2;
        float f15 = (float) 1.0d;
        DisabledOutlineWidth = c5.h.n(f15);
        DisabledSupportingColor = pVar2;
        DisabledTrailingIconColor = pVar2;
        p pVar3 = p.Error;
        ErrorFocusCaretColor = pVar3;
        ErrorFocusInputColor = pVar2;
        ErrorFocusLabelColor = pVar3;
        p pVar4 = p.OnSurfaceVariant;
        ErrorFocusLeadingIconColor = pVar4;
        ErrorFocusOutlineColor = pVar3;
        ErrorFocusSupportingColor = pVar3;
        ErrorFocusTrailingIconColor = pVar3;
        ErrorHoverInputColor = pVar2;
        p pVar5 = p.OnErrorContainer;
        ErrorHoverLabelColor = pVar5;
        ErrorHoverLeadingIconColor = pVar4;
        ErrorHoverOutlineColor = pVar5;
        ErrorHoverSupportingColor = pVar3;
        ErrorHoverTrailingIconColor = pVar5;
        ErrorInputColor = pVar2;
        ErrorLabelColor = pVar3;
        ErrorLeadingIconColor = pVar4;
        ErrorOutlineColor = pVar3;
        ErrorSupportingColor = pVar3;
        ErrorTrailingIconColor = pVar3;
        FocusInputColor = pVar2;
        FocusLabelColor = pVar;
        FocusLeadingIconColor = pVar4;
        FocusOutlineColor = pVar;
        FocusOutlineWidth = c5.h.n((float) 2.0d);
        FocusSupportingColor = pVar4;
        FocusTrailingIconColor = pVar4;
        HoverInputColor = pVar2;
        HoverLabelColor = pVar2;
        HoverLeadingIconColor = pVar4;
        HoverOutlineColor = pVar2;
        HoverOutlineWidth = c5.h.n(f15);
        HoverSupportingColor = pVar4;
        HoverTrailingIconColor = pVar4;
        InputColor = pVar2;
        k1 k1Var = k1.BodyLarge;
        InputFont = k1Var;
        InputPlaceholderColor = pVar4;
        InputPrefixColor = pVar4;
        InputSuffixColor = pVar4;
        LabelColor = pVar4;
        LabelFont = k1Var;
        LeadingIconColor = pVar4;
        float f16 = (float) 24.0d;
        LeadingIconSize = c5.h.n(f16);
        OutlineColor = p.Outline;
        OutlineWidth = c5.h.n(f15);
        SupportingColor = pVar4;
        SupportingFont = k1.BodySmall;
        TrailingIconColor = pVar4;
        TrailingIconSize = c5.h.n(f16);
    }

    private n0() {
    }

    public final p A() {
        return LeadingIconColor;
    }

    public final p B() {
        return OutlineColor;
    }

    public final p C() {
        return SupportingColor;
    }

    public final p D() {
        return TrailingIconColor;
    }

    public final p a() {
        return CaretColor;
    }

    public final w0 b() {
        return ContainerShape;
    }

    public final p c() {
        return DisabledInputColor;
    }

    public final p d() {
        return DisabledLabelColor;
    }

    public final p e() {
        return DisabledLeadingIconColor;
    }

    public final p f() {
        return DisabledOutlineColor;
    }

    public final p g() {
        return DisabledSupportingColor;
    }

    public final p h() {
        return DisabledTrailingIconColor;
    }

    public final p i() {
        return ErrorFocusCaretColor;
    }

    public final p j() {
        return ErrorInputColor;
    }

    public final p k() {
        return ErrorLabelColor;
    }

    public final p l() {
        return ErrorLeadingIconColor;
    }

    public final p m() {
        return ErrorOutlineColor;
    }

    public final p n() {
        return ErrorSupportingColor;
    }

    public final p o() {
        return ErrorTrailingIconColor;
    }

    public final p p() {
        return FocusInputColor;
    }

    public final p q() {
        return FocusLabelColor;
    }

    public final p r() {
        return FocusLeadingIconColor;
    }

    public final p s() {
        return FocusOutlineColor;
    }

    public final p t() {
        return FocusSupportingColor;
    }

    public final p u() {
        return FocusTrailingIconColor;
    }

    public final p v() {
        return InputColor;
    }

    public final p w() {
        return InputPlaceholderColor;
    }

    public final p x() {
        return InputPrefixColor;
    }

    public final p y() {
        return InputSuffixColor;
    }

    public final p z() {
        return LabelColor;
    }
}
