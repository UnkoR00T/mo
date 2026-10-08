package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b)\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0015\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u001a\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\b¨\u00063"}, d2 = {"Ll2/f1;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "getDisabledContainerColor", "()Ll2/p;", "DisabledContainerColor", "", "c", "F", "getDisabledContainerOpacity", "()F", "DisabledContainerOpacity", "d", "getDisabledIconColor", "DisabledIconColor", "e", "getDisabledIconOpacity", "DisabledIconOpacity", "f", "a", "DisabledLabelColor", "g", "DisabledLabelOpacity", "h", "getFocusedIconColor", "FocusedIconColor", "i", "getFocusedLabelColor", "FocusedLabelColor", "j", "getHoveredIconColor", "HoveredIconColor", "k", "getHoveredLabelColor", "HoveredLabelColor", "l", "getIconColor", "IconColor", "m", "getLabelColor", "LabelColor", "n", "getPressedIconColor", "PressedIconColor", "o", "getPressedLabelColor", "PressedLabelColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f114506a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledContainerColor = p.OnSurface;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerOpacity = 0.1f;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledIconOpacity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p DisabledLabelColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledLabelOpacity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p FocusedIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final p FocusedLabelColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p HoveredIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final p HoveredLabelColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p IconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final p LabelColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final p PressedIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p PressedLabelColor;

    static {
        p pVar = p.OnSurfaceVariant;
        DisabledIconColor = pVar;
        DisabledIconOpacity = 0.38f;
        DisabledLabelColor = pVar;
        DisabledLabelOpacity = 0.38f;
        FocusedIconColor = pVar;
        FocusedLabelColor = pVar;
        HoveredIconColor = pVar;
        HoveredLabelColor = pVar;
        IconColor = pVar;
        LabelColor = pVar;
        PressedIconColor = pVar;
        PressedLabelColor = pVar;
    }

    private f1() {
    }

    public final p a() {
        return DisabledLabelColor;
    }

    public final float b() {
        return DisabledLabelOpacity;
    }
}
