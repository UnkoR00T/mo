package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u0011\u0010\rR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b¨\u0006!"}, d2 = {"Ll2/a0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "ContainerColor", "Lc5/h;", "c", "F", "()F", "ContainerElevation", "d", "FocusedContainerElevation", "e", "getFocusedIconColor", "FocusedIconColor", "f", "HoveredContainerElevation", "g", "getHoveredIconColor", "HoveredIconColor", "h", "getIconColor", "IconColor", "i", "PressedContainerElevation", "j", "getPressedIconColor", "PressedIconColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f114265a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor = p.PrimaryContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedContainerElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final p FocusedIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float HoveredContainerElevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p HoveredIconColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p IconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float PressedContainerElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p PressedIconColor;

    static {
        t tVar = t.f115244a;
        ContainerElevation = tVar.d();
        FocusedContainerElevation = tVar.d();
        p pVar = p.OnPrimaryContainer;
        FocusedIconColor = pVar;
        HoveredContainerElevation = tVar.e();
        HoveredIconColor = pVar;
        IconColor = pVar;
        PressedContainerElevation = tVar.d();
        PressedIconColor = pVar;
    }

    private a0() {
    }

    public final p a() {
        return ContainerColor;
    }

    public final float b() {
        return ContainerElevation;
    }

    public final float c() {
        return FocusedContainerElevation;
    }

    public final float d() {
        return HoveredContainerElevation;
    }

    public final float e() {
        return PressedContainerElevation;
    }
}
