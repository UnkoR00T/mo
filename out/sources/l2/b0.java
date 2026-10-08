package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b_\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u0016\u0010\rR\u0017\u0010!\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u0019\u0010\rR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010)\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b\u001c\u0010\rR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010<\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b \u0010\rR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0017\u0010\\\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b[\u0010\bR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\ba\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010h\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\bg\u0010\bR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u0017\u0010n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\bm\u0010\bR\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\b¨\u0006r"}, d2 = {"Ll2/b0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "ContainerColor", "Lc5/h;", "c", "F", "()F", "ContainerElevation", "d", "DisabledContainerColor", "e", "DisabledContainerElevation", "", "f", "DisabledContainerOpacity", "g", "getDisabledIconColor", "DisabledIconColor", "h", "getDisabledIconOpacity", "DisabledIconOpacity", "i", "DisabledLabelTextColor", "j", "DisabledLabelTextOpacity", "k", "FocusedContainerElevation", "l", "getFocusedIconColor", "FocusedIconColor", "m", "getFocusedLabelTextColor", "FocusedLabelTextColor", "n", "HoveredContainerElevation", "o", "getHoveredIconColor", "HoveredIconColor", "p", "getHoveredLabelTextColor", "HoveredLabelTextColor", "q", "getIconColor", "IconColor", "r", "LabelTextColor", "s", "getLabelTextSelectedColor", "LabelTextSelectedColor", "t", "getLabelTextUnselectedColor", "LabelTextUnselectedColor", "u", "PressedContainerElevation", "v", "getPressedIconColor", "PressedIconColor", "w", "getPressedLabelTextColor", "PressedLabelTextColor", "x", "getSelectedContainerColor", "SelectedContainerColor", "y", "getSelectedFocusedIconColor", "SelectedFocusedIconColor", "z", "getSelectedFocusedLabelTextColor", "SelectedFocusedLabelTextColor", "A", "getSelectedHoveredIconColor", "SelectedHoveredIconColor", "B", "getSelectedHoveredLabelTextColor", "SelectedHoveredLabelTextColor", "C", "getSelectedIconColor", "SelectedIconColor", ip.a.f96138c, "getSelectedPressedIconColor", "SelectedPressedIconColor", "E", "getSelectedPressedLabelTextColor", "SelectedPressedLabelTextColor", "getUnselectedContainerColor", "UnselectedContainerColor", "G", "getUnselectedFocusedIconColor", "UnselectedFocusedIconColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getUnselectedFocusedLabelTextColor", "UnselectedFocusedLabelTextColor", "I", "getUnselectedHoveredIconColor", "UnselectedHoveredIconColor", "J", "getUnselectedHoveredLabelTextColor", "UnselectedHoveredLabelTextColor", "K", "getUnselectedIconColor", "UnselectedIconColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "getUnselectedPressedIconColor", "UnselectedPressedIconColor", "M", "getUnselectedPressedLabelTextColor", "UnselectedPressedLabelTextColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final p SelectedHoveredIconColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final p SelectedHoveredLabelTextColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p SelectedIconColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final p SelectedPressedIconColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p SelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final p UnselectedContainerColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final p UnselectedFocusedIconColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final p UnselectedFocusedLabelTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final p UnselectedHoveredIconColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final p UnselectedHoveredLabelTextColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final p UnselectedIconColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final p UnselectedPressedIconColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final p UnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f114293a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledContainerColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerElevation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerOpacity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledIconColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledIconOpacity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledLabelTextColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledLabelTextOpacity;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedContainerElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p FocusedIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final p FocusedLabelTextColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float HoveredContainerElevation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p HoveredIconColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final p HoveredLabelTextColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final p IconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final p LabelTextColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p LabelTextSelectedColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final p LabelTextUnselectedColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final float PressedContainerElevation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final p PressedIconColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final p PressedLabelTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedContainerColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedFocusedIconColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedFocusedLabelTextColor;

    static {
        p pVar = p.Primary;
        ContainerColor = pVar;
        t tVar = t.f115244a;
        ContainerElevation = tVar.a();
        DisabledContainerColor = p.OnSurface;
        DisabledContainerElevation = tVar.a();
        DisabledContainerOpacity = 0.1f;
        p pVar2 = p.OnSurfaceVariant;
        DisabledIconColor = pVar2;
        DisabledIconOpacity = 0.38f;
        DisabledLabelTextColor = pVar2;
        DisabledLabelTextOpacity = 0.38f;
        FocusedContainerElevation = tVar.a();
        p pVar3 = p.OnPrimary;
        FocusedIconColor = pVar3;
        FocusedLabelTextColor = pVar3;
        HoveredContainerElevation = tVar.b();
        HoveredIconColor = pVar3;
        HoveredLabelTextColor = pVar3;
        IconColor = pVar3;
        LabelTextColor = pVar3;
        LabelTextSelectedColor = pVar3;
        LabelTextUnselectedColor = pVar2;
        PressedContainerElevation = tVar.a();
        PressedIconColor = pVar3;
        PressedLabelTextColor = pVar3;
        SelectedContainerColor = pVar;
        SelectedFocusedIconColor = pVar3;
        SelectedFocusedLabelTextColor = pVar3;
        SelectedHoveredIconColor = pVar3;
        SelectedHoveredLabelTextColor = pVar3;
        SelectedIconColor = pVar3;
        SelectedPressedIconColor = pVar3;
        SelectedPressedLabelTextColor = pVar3;
        UnselectedContainerColor = p.SurfaceContainer;
        UnselectedFocusedIconColor = pVar2;
        UnselectedFocusedLabelTextColor = pVar2;
        UnselectedHoveredIconColor = pVar2;
        UnselectedHoveredLabelTextColor = pVar2;
        UnselectedIconColor = pVar2;
        UnselectedPressedIconColor = pVar2;
        UnselectedPressedLabelTextColor = pVar2;
    }

    private b0() {
    }

    public final p a() {
        return ContainerColor;
    }

    public final float b() {
        return ContainerElevation;
    }

    public final p c() {
        return DisabledContainerColor;
    }

    public final float d() {
        return DisabledContainerElevation;
    }

    public final float e() {
        return DisabledContainerOpacity;
    }

    public final p f() {
        return DisabledLabelTextColor;
    }

    public final float g() {
        return DisabledLabelTextOpacity;
    }

    public final float h() {
        return FocusedContainerElevation;
    }

    public final float i() {
        return HoveredContainerElevation;
    }

    public final p j() {
        return LabelTextColor;
    }

    public final float k() {
        return PressedContainerElevation;
    }
}
