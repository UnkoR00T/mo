package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b[\n\u0002\u0018\u0002\n\u0002\b(\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010\u000f\u001a\u0004\b,\u0010\u0011R\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010?\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u0010\u000f\u001a\u0004\b>\u0010\u0011R\u0017\u0010B\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u0010\u000f\u001a\u0004\bA\u0010\u0011R\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bF\u0010\u000f\u001a\u0004\bG\u0010\u0011R\u0017\u0010K\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bI\u0010\u000f\u001a\u0004\bJ\u0010\u0011R\u0017\u0010N\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bL\u0010\u000f\u001a\u0004\bM\u0010\u0011R\u0017\u0010Q\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bO\u0010\u000f\u001a\u0004\bP\u0010\u0011R\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0017\u0010]\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b[\u0010\u000f\u001a\u0004\b\\\u0010\u0011R\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u0017\u0010h\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\bg\u0010\u0011R\u0017\u0010k\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bi\u0010\u000f\u001a\u0004\bj\u0010\u0011R\u0017\u0010n\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bl\u0010\u0015\u001a\u0004\bm\u0010\u0017R\u0017\u0010t\u001a\u00020o8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0017\u0010w\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bu\u0010\u000f\u001a\u0004\bv\u0010\u0011R\u0017\u0010z\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bx\u0010\u000f\u001a\u0004\by\u0010\u0011R\u0017\u0010}\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u0018\u0010\u0080\u0001\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b~\u0010\u0006\u001a\u0004\b\u007f\u0010\bR\u001a\u0010\u0083\u0001\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u000f\u001a\u0005\b\u0082\u0001\u0010\u0011R\u001a\u0010\u0086\u0001\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u000f\u001a\u0005\b\u0085\u0001\u0010\u0011R\u001a\u0010\u0089\u0001\u001a\u00020o8\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010q\u001a\u0005\b\u0088\u0001\u0010sR\u001a\u0010\u008c\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR\u0019\u0010\u008e\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u0091\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR\u001a\u0010\u0094\u0001\u001a\u00020o8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010q\u001a\u0005\b\u0093\u0001\u0010sR\u0019\u0010\u0096\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0097\u0001"}, d2 = {"Ll2/v0;", "", "<init>", "()V", "Lc5/h;", "b", "F", "getActiveContainerShape-D9Ej5fM", "()F", "ActiveContainerShape", "c", "getContainerElevation-D9Ej5fM", "ContainerElevation", "Ll2/w0;", "d", "Ll2/w0;", "getContainerShape", "()Ll2/w0;", "ContainerShape", "Ll2/p;", "e", "Ll2/p;", "getGroupContainerColor", "()Ll2/p;", "GroupContainerColor", "f", "getGroupPadding-D9Ej5fM", "GroupPadding", "g", "getGroupShape", "GroupShape", "h", "getHorizontalContainerBottomSpace-D9Ej5fM", "HorizontalContainerBottomSpace", "i", "getHorizontalContainerTopSpace-D9Ej5fM", "HorizontalContainerTopSpace", "j", "getHorizontalIconOnlyItemBottomSpace-D9Ej5fM", "HorizontalIconOnlyItemBottomSpace", "k", "getHorizontalIconOnlyItemLeadingSpace-D9Ej5fM", "HorizontalIconOnlyItemLeadingSpace", "l", "getHorizontalIconOnlyItemSelectedShape", "HorizontalIconOnlyItemSelectedShape", "m", "getHorizontalIconOnlyItemTopSpace-D9Ej5fM", "HorizontalIconOnlyItemTopSpace", "n", "getHorizontalIconOnlyItemTrailingSpace-D9Ej5fM", "HorizontalIconOnlyItemTrailingSpace", "o", "getHorizontalIconOnlySegmentedGap-D9Ej5fM", "HorizontalIconOnlySegmentedGap", "p", "getHorizontalItemBetweenSpace-D9Ej5fM", "HorizontalItemBetweenSpace", "q", "getHorizontalItemBottomSpace-D9Ej5fM", "HorizontalItemBottomSpace", "r", "getHorizontalItemFocusedShape", "HorizontalItemFocusedShape", "s", "getHorizontalItemHoveredShape", "HorizontalItemHoveredShape", "t", "getHorizontalItemLeadingSpace-D9Ej5fM", "HorizontalItemLeadingSpace", "u", "getHorizontalItemPressedShape", "HorizontalItemPressedShape", "v", "getHorizontalItemSelectedFocusedShape", "HorizontalItemSelectedFocusedShape", "w", "getHorizontalItemSelectedHoveredShape", "HorizontalItemSelectedHoveredShape", "x", "getHorizontalItemSelectedPressedShape", "HorizontalItemSelectedPressedShape", "y", "getHorizontalItemTopSpace-D9Ej5fM", "HorizontalItemTopSpace", "z", "getHorizontalItemTrailingSpace-D9Ej5fM", "HorizontalItemTrailingSpace", "A", "getHorizontalSegmentedGap-D9Ej5fM", "HorizontalSegmentedGap", "B", "getInactiveContainerShape", "InactiveContainerShape", "C", "getItem-D9Ej5fM", "Item", ip.a.f96138c, "getItemBetweenSpace-D9Ej5fM", "ItemBetweenSpace", "E", "getItemBottomSpace-D9Ej5fM", "ItemBottomSpace", "getItemFirstChildInnerCornerCornerSize", "ItemFirstChildInnerCornerCornerSize", "G", "getItemFirstChildShape", "ItemFirstChildShape", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getItemFocusIndicatorColor", "ItemFocusIndicatorColor", "Ll2/k1;", "I", "Ll2/k1;", "getItemLabelTextFont", "()Ll2/k1;", "ItemLabelTextFont", "J", "getItemLastChildInnerCornerCornerSize", "ItemLastChildInnerCornerCornerSize", "K", "getItemLastChildShape", "ItemLastChildShape", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "a", "ItemLeadingIconSize", "M", "getItemLeadingSpace-D9Ej5fM", "ItemLeadingSpace", "N", "getItemSelectedShape", "ItemSelectedShape", "O", "getItemShape", "ItemShape", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "getItemSupportingTextFont", "ItemSupportingTextFont", "Q", "getItemTopSpace-D9Ej5fM", "ItemTopSpace", "R", "ItemTrailingIconSize", ip.a.f96137b, "getItemTrailingSpace-D9Ej5fM", "ItemTrailingSpace", "T", "getItemTrailingSupportingTextFont", "ItemTrailingSupportingTextFont", "U", "SegmentedGap", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final float HorizontalSegmentedGap;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final w0 InactiveContainerShape;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final float Item;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final float ItemBetweenSpace;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final float ItemBottomSpace;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final w0 ItemFirstChildInnerCornerCornerSize;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final w0 ItemFirstChildShape;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final p ItemFocusIndicatorColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final k1 ItemLabelTextFont;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final w0 ItemLastChildInnerCornerCornerSize;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final w0 ItemLastChildShape;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final float ItemLeadingIconSize;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final float ItemLeadingSpace;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final w0 ItemSelectedShape;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final w0 ItemShape;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final k1 ItemSupportingTextFont;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final float ItemTopSpace;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final float ItemTrailingIconSize;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final float ItemTrailingSpace;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final k1 ItemTrailingSupportingTextFont;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final float SegmentedGap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f115282a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveContainerShape = c5.h.n((float) 24.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation = t.f115244a.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape = w0.CornerLarge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p GroupContainerColor = p.SurfaceContainerLow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float GroupPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final w0 GroupShape;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalContainerBottomSpace;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalContainerTopSpace;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalIconOnlyItemBottomSpace;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalIconOnlyItemLeadingSpace;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final w0 HorizontalIconOnlyItemSelectedShape;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalIconOnlyItemTopSpace;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalIconOnlyItemTrailingSpace;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalIconOnlySegmentedGap;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalItemBetweenSpace;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalItemBottomSpace;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final w0 HorizontalItemFocusedShape;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final w0 HorizontalItemHoveredShape;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalItemLeadingSpace;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final w0 HorizontalItemPressedShape;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final w0 HorizontalItemSelectedFocusedShape;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final w0 HorizontalItemSelectedHoveredShape;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final w0 HorizontalItemSelectedPressedShape;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalItemTopSpace;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalItemTrailingSpace;

    static {
        float f15 = (float) 4.0d;
        GroupPadding = c5.h.n(f15);
        w0 w0Var = w0.CornerSmall;
        GroupShape = w0Var;
        float f16 = (float) 8.0d;
        HorizontalContainerBottomSpace = c5.h.n(f16);
        HorizontalContainerTopSpace = c5.h.n(f16);
        float f17 = (float) 16.0d;
        HorizontalIconOnlyItemBottomSpace = c5.h.n(f17);
        HorizontalIconOnlyItemLeadingSpace = c5.h.n(f17);
        w0 w0Var2 = w0.CornerFull;
        HorizontalIconOnlyItemSelectedShape = w0Var2;
        HorizontalIconOnlyItemTopSpace = c5.h.n(f17);
        HorizontalIconOnlyItemTrailingSpace = c5.h.n(f17);
        HorizontalIconOnlySegmentedGap = c5.h.n(f15);
        float f18 = (float) 12.0d;
        HorizontalItemBetweenSpace = c5.h.n(f18);
        float f19 = (float) 6.0d;
        HorizontalItemBottomSpace = c5.h.n(f19);
        w0 w0Var3 = w0.CornerMedium;
        HorizontalItemFocusedShape = w0Var3;
        HorizontalItemHoveredShape = w0Var3;
        HorizontalItemLeadingSpace = c5.h.n(f18);
        HorizontalItemPressedShape = w0Var3;
        HorizontalItemSelectedFocusedShape = w0Var2;
        HorizontalItemSelectedHoveredShape = w0Var2;
        HorizontalItemSelectedPressedShape = w0Var2;
        HorizontalItemTopSpace = c5.h.n(f19);
        HorizontalItemTrailingSpace = c5.h.n(f18);
        float f25 = (float) 2.0d;
        HorizontalSegmentedGap = c5.h.n(f25);
        InactiveContainerShape = w0Var;
        Item = c5.h.n((float) 44.0d);
        ItemBetweenSpace = c5.h.n(f18);
        ItemBottomSpace = c5.h.n(f16);
        w0 w0Var4 = w0.CornerExtraSmall;
        ItemFirstChildInnerCornerCornerSize = w0Var4;
        ItemFirstChildShape = w0Var3;
        ItemFocusIndicatorColor = p.Secondary;
        ItemLabelTextFont = k1.BodyLarge;
        ItemLastChildInnerCornerCornerSize = w0Var4;
        ItemLastChildShape = w0Var3;
        float f26 = (float) 20.0d;
        ItemLeadingIconSize = c5.h.n(f26);
        ItemLeadingSpace = c5.h.n(f17);
        ItemSelectedShape = w0Var3;
        ItemShape = w0Var4;
        ItemSupportingTextFont = k1.BodyMedium;
        ItemTopSpace = c5.h.n(f16);
        ItemTrailingIconSize = c5.h.n(f26);
        ItemTrailingSpace = c5.h.n(f17);
        ItemTrailingSupportingTextFont = k1.LabelSmall;
        SegmentedGap = c5.h.n(f25);
    }

    private v0() {
    }

    public final float a() {
        return ItemLeadingIconSize;
    }

    public final float b() {
        return ItemTrailingIconSize;
    }

    public final float c() {
        return SegmentedGap;
    }
}
