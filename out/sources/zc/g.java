package zc;

import ad.Size;
import java.util.List;
import kc.Extras;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004\"\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u0006*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0012\"\u0015\u0010\u0013\u001a\u00020\u0006*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015\"\u0015\u0010\u0017\u001a\u00020\t*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0016\"\u0015\u0010\u0019\u001a\u00020\t*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkc/l$c;", "", "Lcd/a;", "a", "Lkc/l$c;", "transformationsKey", "Lad/g;", "b", "maxBitmapSizeKey", "", "c", "addLastModifiedToFileCacheKeyKey", "d", "allowConversionToBitmapKey", "Lzc/f;", "e", "(Lzc/f;)Ljava/util/List;", "transformations", "(Lzc/f;)Lad/g;", "maxBitmapSize", "Lzc/n;", "(Lzc/n;)Lad/g;", "(Lzc/n;)Z", "addLastModifiedToFileCacheKey", "(Lzc/f;)Z", "allowConversionToBitmap", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Extras.c<List<cd.a>> f234167a = new Extras.c<>(pq.v.n());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<Size> f234168b = new Extras.c<>(ad.h.a(PKIFailureInfo.certConfirmed, PKIFailureInfo.certConfirmed));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Extras.c<Boolean> f234169c = new Extras.c<>(Boolean.FALSE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Extras.c<Boolean> f234170d = new Extras.c<>(Boolean.TRUE);

    public static final boolean a(Options options) {
        return ((Boolean) kc.m.b(options, f234169c)).booleanValue();
    }

    public static final boolean b(ImageRequest imageRequest) {
        return ((Boolean) kc.m.a(imageRequest, f234170d)).booleanValue();
    }

    public static final Size c(ImageRequest imageRequest) {
        return (Size) kc.m.a(imageRequest, f234168b);
    }

    public static final Size d(Options options) {
        return (Size) kc.m.b(options, f234168b);
    }

    public static final List<cd.a> e(ImageRequest imageRequest) {
        return (List) kc.m.a(imageRequest, f234167a);
    }
}
