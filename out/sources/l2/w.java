package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001a\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010$\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u0005\u00107R\u0017\u0010;\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b:\u0010\u000eR\u0017\u0010>\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b=\u0010\u000eR\u0017\u0010A\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b?\u0010\f\u001a\u0004\b@\u0010\u000eR\u0017\u0010D\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bB\u0010\f\u001a\u0004\bC\u0010\u000eR\u0017\u0010G\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bE\u0010\f\u001a\u0004\bF\u0010\u000eR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\b¨\u0006N"}, d2 = {"Ll2/w;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "getContainerColor", "()Ll2/p;", "ContainerColor", "Lc5/h;", "c", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "d", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Ll2/w0;", "e", "Ll2/w0;", "a", "()Ll2/w0;", "ContainerShape", "f", "getFocusContainerElevation-D9Ej5fM", "FocusContainerElevation", "g", "getFocusIconColor", "FocusIconColor", "h", "getFocusLabelTextColor", "FocusLabelTextColor", "i", "getHoverContainerElevation-D9Ej5fM", "HoverContainerElevation", "j", "getHoverIconColor", "HoverIconColor", "k", "getHoverLabelTextColor", "HoverLabelTextColor", "l", "getIconColor", "IconColor", "m", "getIconSize-D9Ej5fM", "IconSize", "n", "getLabelTextColor", "LabelTextColor", "Ll2/k1;", "o", "Ll2/k1;", "()Ll2/k1;", "LabelTextFont", "p", "getLoweredContainerElevation-D9Ej5fM", "LoweredContainerElevation", "q", "getLoweredFocusContainerElevation-D9Ej5fM", "LoweredFocusContainerElevation", "r", "getLoweredHoverContainerElevation-D9Ej5fM", "LoweredHoverContainerElevation", "s", "getLoweredPressedContainerElevation-D9Ej5fM", "LoweredPressedContainerElevation", "t", "getPressedContainerElevation-D9Ej5fM", "PressedContainerElevation", "u", "getPressedIconColor", "PressedIconColor", "v", "getPressedLabelTextColor", "PressedLabelTextColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f115308a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor = p.PrimaryContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float FocusContainerElevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p FocusIconColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p FocusLabelTextColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float HoverContainerElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p HoverIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final p HoverLabelTextColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p IconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final p LabelTextColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final k1 LabelTextFont;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final float LoweredContainerElevation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float LoweredFocusContainerElevation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final float LoweredHoverContainerElevation;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final float LoweredPressedContainerElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float PressedContainerElevation;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final p PressedIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final p PressedLabelTextColor;

    static {
        t tVar = t.f115244a;
        ContainerElevation = tVar.d();
        ContainerHeight = c5.h.n((float) 56.0d);
        ContainerShape = w0.CornerLarge;
        FocusContainerElevation = tVar.d();
        p pVar = p.OnPrimaryContainer;
        FocusIconColor = pVar;
        FocusLabelTextColor = pVar;
        HoverContainerElevation = tVar.e();
        HoverIconColor = pVar;
        HoverLabelTextColor = pVar;
        IconColor = pVar;
        IconSize = c5.h.n((float) 24.0d);
        LabelTextColor = pVar;
        LabelTextFont = k1.LabelLarge;
        LoweredContainerElevation = tVar.b();
        LoweredFocusContainerElevation = tVar.b();
        LoweredHoverContainerElevation = tVar.c();
        LoweredPressedContainerElevation = tVar.b();
        PressedContainerElevation = tVar.d();
        PressedIconColor = pVar;
        PressedLabelTextColor = pVar;
    }

    private w() {
    }

    public final w0 a() {
        return ContainerShape;
    }

    public final k1 b() {
        return LabelTextFont;
    }
}
