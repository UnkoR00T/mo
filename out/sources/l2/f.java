package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010 \u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010%\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010*\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010,\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010.\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b\u0019\u0010\u000eR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\b¨\u00062"}, d2 = {"Ll2/f;", "", "<init>", "()V", "Lc5/h;", "b", "F", "getAvatarSize-D9Ej5fM", "()F", "AvatarSize", "Ll2/p;", "c", "Ll2/p;", "a", "()Ll2/p;", "ContainerColor", "d", "getContainerElevation-D9Ej5fM", "ContainerElevation", "Ll2/w0;", "e", "Ll2/w0;", "getContainerShape", "()Ll2/w0;", "ContainerShape", "f", "getIconButtonSpace-D9Ej5fM", "IconButtonSpace", "g", "getIconSize-D9Ej5fM", "IconSize", "h", "LeadingIconColor", "i", "getLeadingSpace-D9Ej5fM", "LeadingSpace", "j", "OnScrollContainerColor", "k", "getOnScrollContainerElevation-D9Ej5fM", "OnScrollContainerElevation", "l", "SubtitleColor", "m", "TitleColor", "n", "TrailingIconColor", "o", "getTrailingSpace-D9Ej5fM", "TrailingSpace", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f114480a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float AvatarSize = c5.h.n((float) 32.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final p ContainerColor = p.Surface;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float IconButtonSpace;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final p LeadingIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float LeadingSpace;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p OnScrollContainerColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float OnScrollContainerElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final p SubtitleColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final p TitleColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final p TrailingIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final float TrailingSpace;

    static {
        t tVar = t.f115244a;
        ContainerElevation = tVar.a();
        ContainerShape = w0.CornerNone;
        IconButtonSpace = c5.h.n((float) 0.0d);
        IconSize = c5.h.n((float) 24.0d);
        p pVar = p.OnSurface;
        LeadingIconColor = pVar;
        float f15 = (float) 4.0d;
        LeadingSpace = c5.h.n(f15);
        OnScrollContainerColor = p.SurfaceContainer;
        OnScrollContainerElevation = tVar.c();
        p pVar2 = p.OnSurfaceVariant;
        SubtitleColor = pVar2;
        TitleColor = pVar;
        TrailingIconColor = pVar2;
        TrailingSpace = c5.h.n(f15);
    }

    private f() {
    }

    public final p a() {
        return ContainerColor;
    }

    public final p b() {
        return LeadingIconColor;
    }

    public final p c() {
        return OnScrollContainerColor;
    }

    public final p d() {
        return SubtitleColor;
    }

    public final p e() {
        return TitleColor;
    }

    public final p f() {
        return TrailingIconColor;
    }
}
