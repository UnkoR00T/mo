package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b*\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\b¨\u00064"}, d2 = {"Ll2/c1;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "getDisabledColor", "()Ll2/p;", "DisabledColor", "", "c", "F", "a", "()F", "DisabledOpacity", "d", "getFocusedColor", "FocusedColor", "e", "getHoveredColor", "HoveredColor", "f", "getColor", "Color", "g", "getPressedColor", "PressedColor", "h", "getSelectedFocusedColor", "SelectedFocusedColor", "i", "getSelectedHoveredColor", "SelectedHoveredColor", "j", "getSelectedColor", "SelectedColor", "k", "getSelectedPressedColor", "SelectedPressedColor", "l", "getUnselectedFocusedColor", "UnselectedFocusedColor", "m", "getUnselectedHoveredColor", "UnselectedHoveredColor", "n", "getUnselectedColor", "UnselectedColor", "o", "getUnselectedPressedColor", "UnselectedPressedColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f114356a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledColor = p.OnSurface;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledOpacity = 0.38f;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p FocusedColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p HoveredColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p Color;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p PressedColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedFocusedColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedHoveredColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedPressedColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedFocusedColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedHoveredColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedPressedColor;

    static {
        p pVar = p.OnSurfaceVariant;
        FocusedColor = pVar;
        HoveredColor = pVar;
        Color = pVar;
        PressedColor = pVar;
        p pVar2 = p.Primary;
        SelectedFocusedColor = pVar2;
        SelectedHoveredColor = pVar2;
        SelectedColor = pVar2;
        SelectedPressedColor = pVar2;
        UnselectedFocusedColor = pVar;
        UnselectedHoveredColor = pVar;
        UnselectedColor = pVar;
        UnselectedPressedColor = pVar;
    }

    private c1() {
    }

    public final float a() {
        return DisabledOpacity;
    }
}
