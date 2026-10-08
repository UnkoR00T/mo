package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bW\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u0017\u0010'\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014R\u0017\u0010)\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010,\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010 R\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u00102\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u000eR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010R\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bQ\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010T\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bS\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010V\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bU\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010\\\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b[\u0010\bR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b`\u0010\f\u001a\u0004\ba\u0010\u000eR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bf\u0010\bR\u0017\u0010i\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bh\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010n\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bl\u0010\u001e\u001a\u0004\bm\u0010 R\u0017\u0010p\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010r\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bq\u0010\u001e\u001a\u0004\b%\u0010 ¨\u0006s"}, d2 = {"Ll2/g1;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "getContainerColor", "()Ll2/p;", "ContainerColor", "Lc5/h;", "c", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Ll2/w0;", "d", "Ll2/w0;", "getContainerShape", "()Ll2/w0;", "ContainerShape", "e", "getFocusIndicatorColor", "FocusIndicatorColor", "f", "getHeadlineColor", "HeadlineColor", "Ll2/k1;", "g", "Ll2/k1;", "getHeadlineFont", "()Ll2/k1;", "HeadlineFont", "h", "a", "PeriodSelectorContainerHeight", "i", "getPeriodSelectorContainerShape", "PeriodSelectorContainerShape", "j", "PeriodSelectorContainerWidth", "k", "getPeriodSelectorLabelTextFont", "PeriodSelectorLabelTextFont", "l", "getPeriodSelectorOutlineColor", "PeriodSelectorOutlineColor", "m", "getPeriodSelectorOutlineWidth-D9Ej5fM", "PeriodSelectorOutlineWidth", "n", "getPeriodSelectorSelectedContainerColor", "PeriodSelectorSelectedContainerColor", "o", "getPeriodSelectorSelectedFocusLabelTextColor", "PeriodSelectorSelectedFocusLabelTextColor", "p", "getPeriodSelectorSelectedHoverLabelTextColor", "PeriodSelectorSelectedHoverLabelTextColor", "q", "getPeriodSelectorSelectedLabelTextColor", "PeriodSelectorSelectedLabelTextColor", "r", "getPeriodSelectorSelectedPressedLabelTextColor", "PeriodSelectorSelectedPressedLabelTextColor", "s", "getPeriodSelectorUnselectedFocusLabelTextColor", "PeriodSelectorUnselectedFocusLabelTextColor", "t", "getPeriodSelectorUnselectedHoverLabelTextColor", "PeriodSelectorUnselectedHoverLabelTextColor", "u", "getPeriodSelectorUnselectedLabelTextColor", "PeriodSelectorUnselectedLabelTextColor", "v", "getPeriodSelectorUnselectedPressedLabelTextColor", "PeriodSelectorUnselectedPressedLabelTextColor", "w", "getTimeFieldContainerColor", "TimeFieldContainerColor", "x", "TimeFieldContainerHeight", "y", "TimeFieldContainerShape", "z", "TimeFieldContainerWidth", "A", "getTimeFieldFocusContainerColor", "TimeFieldFocusContainerColor", "B", "getTimeFieldFocusLabelTextColor", "TimeFieldFocusLabelTextColor", "C", "getTimeFieldFocusOutlineColor", "TimeFieldFocusOutlineColor", ip.a.f96138c, "getTimeFieldFocusOutlineWidth-D9Ej5fM", "TimeFieldFocusOutlineWidth", "E", "getTimeFieldHoverLabelTextColor", "TimeFieldHoverLabelTextColor", "getTimeFieldLabelTextColor", "TimeFieldLabelTextColor", "G", "TimeFieldLabelTextFont", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "TimeFieldSeparatorColor", "I", "getTimeFieldSeparatorFont", "TimeFieldSeparatorFont", "J", "TimeFieldSupportingTextColor", "K", "TimeFieldSupportingTextFont", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final p TimeFieldFocusContainerColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final p TimeFieldFocusLabelTextColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p TimeFieldFocusOutlineColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final float TimeFieldFocusOutlineWidth;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p TimeFieldHoverLabelTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final p TimeFieldLabelTextColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final k1 TimeFieldLabelTextFont;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final p TimeFieldSeparatorColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final k1 TimeFieldSeparatorFont;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final p TimeFieldSupportingTextColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final k1 TimeFieldSupportingTextFont;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f114616a = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor = p.SurfaceContainerHigh;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation = t.f115244a.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape = w0.CornerExtraLarge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p FocusIndicatorColor = p.Secondary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p HeadlineColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final k1 HeadlineFont;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float PeriodSelectorContainerHeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final w0 PeriodSelectorContainerShape;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float PeriodSelectorContainerWidth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final k1 PeriodSelectorLabelTextFont;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorOutlineColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float PeriodSelectorOutlineWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorSelectedFocusLabelTextColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorSelectedHoverLabelTextColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorSelectedLabelTextColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorSelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorUnselectedFocusLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorUnselectedHoverLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorUnselectedLabelTextColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final p PeriodSelectorUnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final p TimeFieldContainerColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final float TimeFieldContainerHeight;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final w0 TimeFieldContainerShape;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final float TimeFieldContainerWidth;

    static {
        p pVar = p.OnSurfaceVariant;
        HeadlineColor = pVar;
        HeadlineFont = k1.LabelMedium;
        float f15 = (float) 72.0d;
        PeriodSelectorContainerHeight = c5.h.n(f15);
        w0 w0Var = w0.CornerSmall;
        PeriodSelectorContainerShape = w0Var;
        PeriodSelectorContainerWidth = c5.h.n((float) 52.0d);
        PeriodSelectorLabelTextFont = k1.TitleMedium;
        PeriodSelectorOutlineColor = p.Outline;
        PeriodSelectorOutlineWidth = c5.h.n((float) 1.0d);
        PeriodSelectorSelectedContainerColor = p.TertiaryContainer;
        p pVar2 = p.OnTertiaryContainer;
        PeriodSelectorSelectedFocusLabelTextColor = pVar2;
        PeriodSelectorSelectedHoverLabelTextColor = pVar2;
        PeriodSelectorSelectedLabelTextColor = pVar2;
        PeriodSelectorSelectedPressedLabelTextColor = pVar2;
        PeriodSelectorUnselectedFocusLabelTextColor = pVar;
        PeriodSelectorUnselectedHoverLabelTextColor = pVar;
        PeriodSelectorUnselectedLabelTextColor = pVar;
        PeriodSelectorUnselectedPressedLabelTextColor = pVar;
        TimeFieldContainerColor = p.SurfaceContainerHighest;
        TimeFieldContainerHeight = c5.h.n(f15);
        TimeFieldContainerShape = w0Var;
        TimeFieldContainerWidth = c5.h.n((float) 96.0d);
        TimeFieldFocusContainerColor = p.PrimaryContainer;
        TimeFieldFocusLabelTextColor = p.OnPrimaryContainer;
        TimeFieldFocusOutlineColor = p.Primary;
        TimeFieldFocusOutlineWidth = c5.h.n((float) 2.0d);
        p pVar3 = p.OnSurface;
        TimeFieldHoverLabelTextColor = pVar3;
        TimeFieldLabelTextColor = pVar3;
        TimeFieldLabelTextFont = k1.DisplayMedium;
        TimeFieldSeparatorColor = pVar3;
        TimeFieldSeparatorFont = k1.DisplayLarge;
        TimeFieldSupportingTextColor = pVar;
        TimeFieldSupportingTextFont = k1.BodySmall;
    }

    private g1() {
    }

    public final float a() {
        return PeriodSelectorContainerHeight;
    }

    public final float b() {
        return PeriodSelectorContainerWidth;
    }

    public final float c() {
        return TimeFieldContainerHeight;
    }

    public final w0 d() {
        return TimeFieldContainerShape;
    }

    public final float e() {
        return TimeFieldContainerWidth;
    }

    public final k1 f() {
        return TimeFieldLabelTextFont;
    }

    public final p g() {
        return TimeFieldSeparatorColor;
    }

    public final p h() {
        return TimeFieldSupportingTextColor;
    }

    public final k1 i() {
        return TimeFieldSupportingTextFont;
    }
}
