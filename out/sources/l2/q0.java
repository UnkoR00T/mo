package l2;

import l1.RoundedCornerShape;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0015\u0010\rR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\rR\u0017\u00103\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\rR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0017\u0010[\u001a\u00020W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b\u0017\u0010Z¨\u0006\\"}, d2 = {"Ll2/q0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "ActiveIndicatorColor", "Lc5/h;", "c", "F", "()F", "ActiveIndicatorHeight", "Ll1/g;", "d", "Ll1/g;", "getActiveIndicatorShape", "()Ll1/g;", "ActiveIndicatorShape", "e", "ContainerColor", "f", "getContainerElevation-D9Ej5fM", "ContainerElevation", "g", "ContainerHeight", "Ll2/w0;", "h", "Ll2/w0;", "getContainerShape", "()Ll2/w0;", "ContainerShape", "i", "getActiveFocusIconColor", "ActiveFocusIconColor", "j", "getActiveHoverIconColor", "ActiveHoverIconColor", "k", "getActiveIconColor", "ActiveIconColor", "l", "getActivePressedIconColor", "ActivePressedIconColor", "m", "getIconAndLabelTextContainerHeight-D9Ej5fM", "IconAndLabelTextContainerHeight", "n", "getIconSize-D9Ej5fM", "IconSize", "o", "getInactiveFocusIconColor", "InactiveFocusIconColor", "p", "getInactiveHoverIconColor", "InactiveHoverIconColor", "q", "getInactiveIconColor", "InactiveIconColor", "r", "getInactivePressedIconColor", "InactivePressedIconColor", "s", "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", "t", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", "u", "ActiveLabelTextColor", "v", "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", "w", "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", "x", "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", "y", "getInactiveLabelTextColor", "InactiveLabelTextColor", "z", "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "Ll2/k1;", "A", "Ll2/k1;", "()Ll2/k1;", "LabelTextFont", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final k1 LabelTextFont;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f115180a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveIndicatorColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveIndicatorHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape ActiveIndicatorShape;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveFocusIconColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveHoverIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p ActivePressedIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float IconAndLabelTextContainerHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p InactiveFocusIconColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final p InactiveHoverIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final p InactiveIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p InactivePressedIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveFocusLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveHoverLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveLabelTextColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final p ActivePressedLabelTextColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final p InactiveFocusLabelTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p InactiveHoverLabelTextColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final p InactiveLabelTextColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final p InactivePressedLabelTextColor;

    static {
        p pVar = p.Primary;
        ActiveIndicatorColor = pVar;
        float f15 = (float) 3.0d;
        ActiveIndicatorHeight = c5.h.n(f15);
        ActiveIndicatorShape = l1.h.f(c5.h.n(f15));
        ContainerColor = p.Surface;
        ContainerElevation = t.f115244a.a();
        ContainerHeight = c5.h.n((float) 48.0d);
        ContainerShape = w0.CornerNone;
        ActiveFocusIconColor = pVar;
        ActiveHoverIconColor = pVar;
        ActiveIconColor = pVar;
        ActivePressedIconColor = pVar;
        IconAndLabelTextContainerHeight = c5.h.n((float) 64.0d);
        IconSize = c5.h.n((float) 24.0d);
        p pVar2 = p.OnSurface;
        InactiveFocusIconColor = pVar2;
        InactiveHoverIconColor = pVar2;
        p pVar3 = p.OnSurfaceVariant;
        InactiveIconColor = pVar3;
        InactivePressedIconColor = pVar2;
        ActiveFocusLabelTextColor = pVar;
        ActiveHoverLabelTextColor = pVar;
        ActiveLabelTextColor = pVar;
        ActivePressedLabelTextColor = pVar;
        InactiveFocusLabelTextColor = pVar2;
        InactiveHoverLabelTextColor = pVar2;
        InactiveLabelTextColor = pVar3;
        InactivePressedLabelTextColor = pVar2;
        LabelTextFont = k1.TitleSmall;
    }

    private q0() {
    }

    public final p a() {
        return ActiveIndicatorColor;
    }

    public final float b() {
        return ActiveIndicatorHeight;
    }

    public final p c() {
        return ActiveLabelTextColor;
    }

    public final p d() {
        return ContainerColor;
    }

    public final float e() {
        return ContainerHeight;
    }

    public final k1 f() {
        return LabelTextFont;
    }
}
