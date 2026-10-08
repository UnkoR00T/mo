package l2;

import p071kotlin.Metadata;
import u4.FontWeight;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Ll2/j1;", "", "<init>", "()V", "Lu4/h0;", "b", "Lu4/h0;", "a", "()Lu4/h0;", "Brand", "c", "Plain", "Lu4/d0;", "d", "Lu4/d0;", "()Lu4/d0;", "WeightBold", "e", "WeightMedium", "f", "WeightRegular", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f114816a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final u4.h0 Brand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final u4.h0 Plain;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightBold;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightMedium;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightRegular;

    static {
        u4.l.Companion companion = u4.l.INSTANCE;
        Brand = companion.b();
        Plain = companion.b();
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        WeightBold = companion2.a();
        WeightMedium = companion2.c();
        WeightRegular = companion2.d();
    }

    private j1() {
    }

    public final u4.h0 a() {
        return Brand;
    }

    public final u4.h0 b() {
        return Plain;
    }

    public final FontWeight c() {
        return WeightBold;
    }

    public final FontWeight d() {
        return WeightMedium;
    }

    public final FontWeight e() {
        return WeightRegular;
    }
}
