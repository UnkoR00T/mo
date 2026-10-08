package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bU\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u001c\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010)\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b$\u0010\u000eR\u0017\u0010,\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010\u0015R\u0017\u0010/\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u000eR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u00103\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010\f\u001a\u0004\b(\u0010\u000eR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b-\u0010\bR\u0017\u00109\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u0010\f\u001a\u0004\b0\u0010\u000eR\u0017\u0010<\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b;\u0010\u000eR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u0010@\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b?\u0010!\u001a\u0004\b4\u0010\"R\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u0010D\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bC\u0010!\u001a\u0004\b8\u0010\"R\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010I\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010\u000eR\u0017\u0010L\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010\u0014\u001a\u0004\bK\u0010\u0015R\u0017\u0010O\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bM\u0010\f\u001a\u0004\bN\u0010\u000eR\u0017\u0010R\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bP\u0010\u0014\u001a\u0004\bQ\u0010\u0015R\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010U\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\f\u001a\u0004\b=\u0010\u000eR\u0017\u0010W\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bV\u0010!\u001a\u0004\b?\u0010\"R\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010[\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bZ\u0010!\u001a\u0004\bC\u0010\"R\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010_\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b^\u0010!\u001a\u0004\bZ\u0010\"R\u0017\u0010a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b`\u0010\f\u001a\u0004\bG\u0010\u000eR\u0017\u0010c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bb\u0010\f\u001a\u0004\bJ\u0010\u000eR\u0017\u0010e\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bd\u0010!\u001a\u0004\bM\u0010\"R\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010l\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bj\u0010\f\u001a\u0004\bk\u0010\u000eR\u0017\u0010n\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bm\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u0017\u0010q\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bo\u0010\f\u001a\u0004\bp\u0010\u000eR\u0017\u0010s\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bV\u0010\b¨\u0006t"}, d2 = {"Ll2/q;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "ContainerColor", "Lc5/h;", "c", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "d", "ContainerHeight", "Ll2/w0;", "e", "Ll2/w0;", "()Ll2/w0;", "ContainerShape", "f", "ContainerWidth", "g", "DateContainerHeight", "h", "DateContainerShape", "i", "DateContainerWidth", "Ll2/k1;", "j", "Ll2/k1;", "()Ll2/k1;", "DateLabelTextFont", "k", "DateSelectedContainerColor", "l", "DateSelectedLabelTextColor", "m", "DateStateLayerHeight", "n", "getDateStateLayerShape", "DateStateLayerShape", "o", "getDateStateLayerWidth-D9Ej5fM", "DateStateLayerWidth", "p", "DateTodayContainerOutlineColor", "q", "DateTodayContainerOutlineWidth", "r", "DateTodayLabelTextColor", "s", "DateUnselectedLabelTextColor", "t", "HeaderContainerHeight", "u", "getHeaderContainerWidth-D9Ej5fM", "HeaderContainerWidth", "v", "HeaderHeadlineColor", "w", "HeaderHeadlineFont", "x", "HeaderSupportingTextColor", "y", "HeaderSupportingTextFont", "z", "RangeSelectionActiveIndicatorContainerColor", "A", "getRangeSelectionActiveIndicatorContainerHeight-D9Ej5fM", "RangeSelectionActiveIndicatorContainerHeight", "B", "getRangeSelectionActiveIndicatorContainerShape", "RangeSelectionActiveIndicatorContainerShape", "C", "getRangeSelectionContainerElevation-D9Ej5fM", "RangeSelectionContainerElevation", ip.a.f96138c, "getRangeSelectionContainerShape", "RangeSelectionContainerShape", "E", "SelectionDateInRangeLabelTextColor", "RangeSelectionHeaderContainerHeight", "G", "RangeSelectionHeaderHeadlineFont", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "RangeSelectionMonthSubheadColor", "I", "RangeSelectionMonthSubheadFont", "J", "WeekdaysLabelTextColor", "K", "WeekdaysLabelTextFont", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "SelectionYearContainerHeight", "M", "SelectionYearContainerWidth", "N", "SelectionYearLabelTextFont", "O", "SelectionYearSelectedContainerColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "SelectionYearSelectedLabelTextColor", "Q", "getSelectionYearStateLayerHeight-D9Ej5fM", "SelectionYearStateLayerHeight", "R", "SelectionYearStateLayerShape", ip.a.f96137b, "getSelectionYearStateLayerWidth-D9Ej5fM", "SelectionYearStateLayerWidth", "T", "SelectionYearUnselectedLabelTextColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final float RangeSelectionActiveIndicatorContainerHeight;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final w0 RangeSelectionActiveIndicatorContainerShape;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final float RangeSelectionContainerElevation;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final w0 RangeSelectionContainerShape;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p SelectionDateInRangeLabelTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final float RangeSelectionHeaderContainerHeight;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final k1 RangeSelectionHeaderHeadlineFont;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final p RangeSelectionMonthSubheadColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final k1 RangeSelectionMonthSubheadFont;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final p WeekdaysLabelTextColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final k1 WeekdaysLabelTextFont;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final float SelectionYearContainerHeight;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final float SelectionYearContainerWidth;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final k1 SelectionYearLabelTextFont;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final p SelectionYearSelectedContainerColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final p SelectionYearSelectedLabelTextColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final float SelectionYearStateLayerHeight;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final w0 SelectionYearStateLayerShape;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final float SelectionYearStateLayerWidth;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final p SelectionYearUnselectedLabelTextColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f115154a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor = p.SurfaceContainerHigh;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float DateContainerHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final w0 DateContainerShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float DateContainerWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final k1 DateLabelTextFont;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final p DateSelectedContainerColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p DateSelectedLabelTextColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float DateStateLayerHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final w0 DateStateLayerShape;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final float DateStateLayerWidth;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final p DateTodayContainerOutlineColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float DateTodayContainerOutlineWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p DateTodayLabelTextColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p DateUnselectedLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float HeaderContainerHeight;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final float HeaderContainerWidth;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final p HeaderHeadlineColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final k1 HeaderHeadlineFont;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p HeaderSupportingTextColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final k1 HeaderSupportingTextFont;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final p RangeSelectionActiveIndicatorContainerColor;

    static {
        t tVar = t.f115244a;
        ContainerElevation = tVar.d();
        ContainerHeight = c5.h.n((float) 568.0d);
        ContainerShape = w0.CornerExtraLarge;
        float f15 = (float) 360.0d;
        ContainerWidth = c5.h.n(f15);
        float f16 = (float) 40.0d;
        DateContainerHeight = c5.h.n(f16);
        w0 w0Var = w0.CornerFull;
        DateContainerShape = w0Var;
        DateContainerWidth = c5.h.n(f16);
        k1 k1Var = k1.BodyLarge;
        DateLabelTextFont = k1Var;
        p pVar = p.Primary;
        DateSelectedContainerColor = pVar;
        p pVar2 = p.OnPrimary;
        DateSelectedLabelTextColor = pVar2;
        DateStateLayerHeight = c5.h.n(f16);
        DateStateLayerShape = w0Var;
        DateStateLayerWidth = c5.h.n(f16);
        DateTodayContainerOutlineColor = pVar;
        DateTodayContainerOutlineWidth = c5.h.n((float) 1.0d);
        DateTodayLabelTextColor = pVar;
        p pVar3 = p.OnSurface;
        DateUnselectedLabelTextColor = pVar3;
        HeaderContainerHeight = c5.h.n((float) 120.0d);
        HeaderContainerWidth = c5.h.n(f15);
        p pVar4 = p.OnSurfaceVariant;
        HeaderHeadlineColor = pVar4;
        HeaderHeadlineFont = k1.HeadlineLarge;
        HeaderSupportingTextColor = pVar4;
        HeaderSupportingTextFont = k1.LabelLarge;
        RangeSelectionActiveIndicatorContainerColor = p.SecondaryContainer;
        RangeSelectionActiveIndicatorContainerHeight = c5.h.n(f16);
        RangeSelectionActiveIndicatorContainerShape = w0Var;
        RangeSelectionContainerElevation = tVar.a();
        RangeSelectionContainerShape = w0.CornerNone;
        SelectionDateInRangeLabelTextColor = p.OnSecondaryContainer;
        RangeSelectionHeaderContainerHeight = c5.h.n((float) 128.0d);
        RangeSelectionHeaderHeadlineFont = k1.TitleLarge;
        RangeSelectionMonthSubheadColor = pVar4;
        RangeSelectionMonthSubheadFont = k1.TitleSmall;
        WeekdaysLabelTextColor = pVar3;
        WeekdaysLabelTextFont = k1Var;
        float f17 = (float) 36.0d;
        SelectionYearContainerHeight = c5.h.n(f17);
        float f18 = (float) 72.0d;
        SelectionYearContainerWidth = c5.h.n(f18);
        SelectionYearLabelTextFont = k1Var;
        SelectionYearSelectedContainerColor = pVar;
        SelectionYearSelectedLabelTextColor = pVar2;
        SelectionYearStateLayerHeight = c5.h.n(f17);
        SelectionYearStateLayerShape = w0Var;
        SelectionYearStateLayerWidth = c5.h.n(f18);
        SelectionYearUnselectedLabelTextColor = pVar4;
    }

    private q() {
    }

    public final float A() {
        return SelectionYearContainerHeight;
    }

    public final float B() {
        return SelectionYearContainerWidth;
    }

    public final k1 C() {
        return SelectionYearLabelTextFont;
    }

    public final p D() {
        return SelectionYearSelectedContainerColor;
    }

    public final p E() {
        return SelectionYearSelectedLabelTextColor;
    }

    public final w0 F() {
        return SelectionYearStateLayerShape;
    }

    public final p G() {
        return SelectionYearUnselectedLabelTextColor;
    }

    public final p H() {
        return WeekdaysLabelTextColor;
    }

    public final k1 I() {
        return WeekdaysLabelTextFont;
    }

    public final p a() {
        return ContainerColor;
    }

    public final float b() {
        return ContainerHeight;
    }

    public final w0 c() {
        return ContainerShape;
    }

    public final float d() {
        return ContainerWidth;
    }

    public final float e() {
        return DateContainerHeight;
    }

    public final w0 f() {
        return DateContainerShape;
    }

    public final float g() {
        return DateContainerWidth;
    }

    public final k1 h() {
        return DateLabelTextFont;
    }

    public final p i() {
        return DateSelectedContainerColor;
    }

    public final p j() {
        return DateSelectedLabelTextColor;
    }

    public final float k() {
        return DateStateLayerHeight;
    }

    public final p l() {
        return DateTodayContainerOutlineColor;
    }

    public final float m() {
        return DateTodayContainerOutlineWidth;
    }

    public final p n() {
        return DateTodayLabelTextColor;
    }

    public final p o() {
        return DateUnselectedLabelTextColor;
    }

    public final float p() {
        return HeaderContainerHeight;
    }

    public final p q() {
        return HeaderHeadlineColor;
    }

    public final k1 r() {
        return HeaderHeadlineFont;
    }

    public final p s() {
        return HeaderSupportingTextColor;
    }

    public final k1 t() {
        return HeaderSupportingTextFont;
    }

    public final p u() {
        return RangeSelectionActiveIndicatorContainerColor;
    }

    public final float v() {
        return RangeSelectionHeaderContainerHeight;
    }

    public final k1 w() {
        return RangeSelectionHeaderHeadlineFont;
    }

    public final p x() {
        return RangeSelectionMonthSubheadColor;
    }

    public final k1 y() {
        return RangeSelectionMonthSubheadFont;
    }

    public final p z() {
        return SelectionDateInRangeLabelTextColor;
    }
}
