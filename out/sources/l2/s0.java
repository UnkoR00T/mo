package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\b¨\u0006)"}, d2 = {"Ll2/s0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "DisabledSelectedIconColor", "c", "DisabledUnselectedIconColor", "Lc5/h;", "d", "F", "()F", "IconSize", "e", "getSelectedFocusIconColor", "SelectedFocusIconColor", "f", "getSelectedHoverIconColor", "SelectedHoverIconColor", "g", "SelectedIconColor", "h", "getSelectedPressedIconColor", "SelectedPressedIconColor", "i", "StateLayerSize", "j", "getUnselectedFocusIconColor", "UnselectedFocusIconColor", "k", "getUnselectedHoverIconColor", "UnselectedHoverIconColor", "l", "UnselectedIconColor", "m", "getUnselectedPressedIconColor", "UnselectedPressedIconColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f115231a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledSelectedIconColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledUnselectedIconColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedFocusIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedHoverIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedIconColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p SelectedPressedIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float StateLayerSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedFocusIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedHoverIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final p UnselectedPressedIconColor;

    static {
        p pVar = p.OnSurface;
        DisabledSelectedIconColor = pVar;
        DisabledUnselectedIconColor = pVar;
        IconSize = c5.h.n((float) 20.0d);
        p pVar2 = p.Primary;
        SelectedFocusIconColor = pVar2;
        SelectedHoverIconColor = pVar2;
        SelectedIconColor = pVar2;
        SelectedPressedIconColor = pVar2;
        StateLayerSize = c5.h.n((float) 40.0d);
        UnselectedFocusIconColor = pVar;
        UnselectedHoverIconColor = pVar;
        UnselectedIconColor = p.OnSurfaceVariant;
        UnselectedPressedIconColor = pVar;
    }

    private s0() {
    }

    public final p a() {
        return DisabledSelectedIconColor;
    }

    public final p b() {
        return DisabledUnselectedIconColor;
    }

    public final float c() {
        return IconSize;
    }

    public final p d() {
        return SelectedIconColor;
    }

    public final float e() {
        return StateLayerSize;
    }

    public final p f() {
        return UnselectedIconColor;
    }
}
