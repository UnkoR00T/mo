package g2;

import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0005\u0010\u001a¨\u0006\u001e"}, d2 = {"Lg2/d;", "", "<init>", "()V", "Lc5/h;", "b", "F", "getCompact-D9Ej5fM", "()F", "Compact", "c", "getMedium-D9Ej5fM", "Medium", "d", "getExpanded-D9Ej5fM", "Expanded", "e", "getLarge-D9Ej5fM", "Large", "f", "getExtraLarge-D9Ej5fM", "ExtraLarge", "", "g", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "Default", "h", "DefaultV2", "adaptive"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f69781a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Compact;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float Medium;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float Expanded;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float Large;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float ExtraLarge;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final Set<c5.h> Default;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final Set<c5.h> DefaultV2;

    static {
        float fN = c5.h.n(0);
        Compact = fN;
        float fN2 = c5.h.n(600);
        Medium = fN2;
        float fN3 = c5.h.n(840);
        Expanded = fN3;
        float fN4 = c5.h.n(1200);
        Large = fN4;
        float fN5 = c5.h.n(1600);
        ExtraLarge = fN5;
        Default = e1.i(c5.h.j(fN), c5.h.j(fN2), c5.h.j(fN3));
        DefaultV2 = e1.i(c5.h.j(fN), c5.h.j(fN2), c5.h.j(fN3), c5.h.j(fN4), c5.h.j(fN5));
    }

    private d() {
    }

    public final Set<c5.h> a() {
        return Default;
    }

    public final Set<c5.h> b() {
        return DefaultV2;
    }
}
