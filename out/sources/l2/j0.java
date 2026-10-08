package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b¨\u0006#"}, d2 = {"Ll2/j0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "ContainerColor", "Lc5/h;", "c", "F", "()F", "ContainerElevation", "Ll2/w0;", "d", "Ll2/w0;", "()Ll2/w0;", "ContainerShape", "e", "getFocusIndicatorColor", "FocusIndicatorColor", "f", "getListItemSelectedContainerColor", "ListItemSelectedContainerColor", "g", "getListItemSelectedLabelTextColor", "ListItemSelectedLabelTextColor", "h", "getListItemSelectedLeadingTrailingIconColor", "ListItemSelectedLeadingTrailingIconColor", "i", "getMenuListItemLeadingIconColor", "MenuListItemLeadingIconColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f114807a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor = p.SurfaceContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation = t.f115244a.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape = w0.CornerExtraSmall;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p FocusIndicatorColor = p.Secondary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p ListItemSelectedContainerColor = p.SecondaryContainer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p ListItemSelectedLabelTextColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p ListItemSelectedLeadingTrailingIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final p MenuListItemLeadingIconColor;

    static {
        p pVar = p.OnSecondaryContainer;
        ListItemSelectedLabelTextColor = pVar;
        ListItemSelectedLeadingTrailingIconColor = pVar;
        MenuListItemLeadingIconColor = pVar;
    }

    private j0() {
    }

    public final p a() {
        return ContainerColor;
    }

    public final float b() {
        return ContainerElevation;
    }

    public final w0 c() {
        return ContainerShape;
    }
}
