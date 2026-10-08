package uc;

import ad.Size;
import ed.f0;
import ed.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kc.BitmapImage;
import kc.s;
import p071kotlin.Metadata;
import pq.v0;
import zc.ImageRequest;
import zc.Options;
import zc.SuccessResult;
import zc.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b \u0010\u0016J'\u0010#\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u00020\u0014*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u0004\u0018\u000100*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00101¨\u00063"}, d2 = {"Luc/e;", "", "Lkc/s;", "imageLoader", "Lzc/p;", "requestService", "Led/t;", "logger", "<init>", "(Lkc/s;Lzc/p;Led/t;)V", "Lzc/f;", "request", "Luc/d$b;", "cacheKey", "Luc/d$c;", "cacheValue", "Lad/g;", "size", "Lad/f;", "scale", "", "d", "(Lzc/f;Luc/d$b;Luc/d$c;Lad/g;Lad/f;)Z", "mappedData", "Lzc/n;", "options", "Lkc/j;", "eventListener", "f", "(Lzc/f;Ljava/lang/Object;Lzc/n;Lkc/j;)Luc/d$b;", "a", "(Lzc/f;Luc/d$b;Lad/g;Lad/f;)Luc/d$c;", "c", "Lrc/a$b;", "result", "h", "(Luc/d$b;Lzc/f;Lrc/a$b;)Z", "Lrc/d$a;", "chain", "Lzc/r;", "g", "(Lrc/d$a;Lzc/f;Luc/d$b;Luc/d$c;)Lzc/r;", "Lkc/s;", "b", "Lzc/p;", "e", "(Luc/d$c;)Z", "isSampled", "", "(Luc/d$c;)Ljava/lang/String;", "diskCacheKey", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p requestService;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f197433b;

        static {
            int[] iArr = new int[ad.f.values().length];
            try {
                iArr[ad.f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ad.f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f197432a = iArr;
            int[] iArr2 = new int[ad.c.values().length];
            try {
                iArr2[ad.c.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ad.c.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f197433b = iArr2;
        }
    }

    public e(s sVar, p pVar, t tVar) {
        this.imageLoader = sVar;
        this.requestService = pVar;
    }

    private final String b(d.Value value) {
        Object obj = value.a().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(ImageRequest request, d.Key cacheKey, d.Value cacheValue, Size size, ad.f scale) {
        int iAbs;
        String str = cacheKey.a().get("coil#size");
        if (str != null) {
            return fr.t.c(str, size.toString());
        }
        if (!e(cacheValue) && (ad.h.b(size) || request.getPrecision() == ad.c.INEXACT)) {
            return true;
        }
        int iL = cacheValue.getImage().l();
        int height = cacheValue.getImage().getHeight();
        Size sizeC = cacheValue.getImage() instanceof BitmapImage ? zc.g.c(request) : Size.f5427d;
        ad.a width = size.getWidth();
        int px4 = width instanceof ad.a.C0109a ? ((ad.a.C0109a) width).getPx() : Integer.MAX_VALUE;
        ad.a width2 = sizeC.getWidth();
        int iMin = Math.min(px4, width2 instanceof ad.a.C0109a ? ((ad.a.C0109a) width2).getPx() : Integer.MAX_VALUE);
        ad.a height2 = size.getHeight();
        int px5 = height2 instanceof ad.a.C0109a ? ((ad.a.C0109a) height2).getPx() : Integer.MAX_VALUE;
        ad.a height3 = sizeC.getHeight();
        int iMin2 = Math.min(px5, height3 instanceof ad.a.C0109a ? ((ad.a.C0109a) height3).getPx() : Integer.MAX_VALUE);
        double d15 = ((double) iMin) / ((double) iL);
        double d16 = ((double) iMin2) / ((double) height);
        int i15 = b.f197432a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? ad.f.FIT : scale).ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                throw new oq.p();
            }
            if (d15 < d16) {
                iAbs = Math.abs(iMin - iL);
            } else {
                iAbs = Math.abs(iMin2 - height);
                d15 = d16;
            }
        } else if (d15 > d16) {
            iAbs = Math.abs(iMin - iL);
        } else {
            iAbs = Math.abs(iMin2 - height);
            d15 = d16;
        }
        if (iAbs <= 1) {
            return true;
        }
        int i16 = b.f197433b[request.getPrecision().ordinal()];
        if (i16 == 1) {
            return d15 == 1.0d;
        }
        if (i16 == 2) {
            return d15 <= 1.0d;
        }
        throw new oq.p();
    }

    private final boolean e(d.Value value) {
        Object obj = value.a().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final d.Value a(ImageRequest request, d.Key cacheKey, Size size, ad.f scale) {
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        d dVarE = this.imageLoader.e();
        d.Value valueA = dVarE != null ? dVarE.a(cacheKey) : null;
        if (valueA == null || !c(request, cacheKey, valueA, size, scale)) {
            return null;
        }
        return valueA;
    }

    public final boolean c(ImageRequest request, d.Key cacheKey, d.Value cacheValue, Size size, ad.f scale) {
        if (this.requestService.e(request, cacheValue)) {
            return d(request, cacheKey, cacheValue, size, scale);
        }
        return false;
    }

    public final d.Key f(ImageRequest request, Object mappedData, Options options, kc.j eventListener) {
        if (request.getMemoryCachePolicy() == zc.c.DISABLED) {
            return null;
        }
        if (request.getMemoryCacheKey() != null) {
            return new d.Key(request.getMemoryCacheKey(), request.r());
        }
        eventListener.j(request, mappedData);
        String strP = f0.p(this.imageLoader.getComponents(), mappedData, options, null, "MemoryCacheService");
        eventListener.i(request, strP);
        if (strP == null) {
            return null;
        }
        if (zc.g.e(request).isEmpty()) {
            return new d.Key(strP, request.r());
        }
        Map mapW = v0.w(request.r());
        mapW.put("coil#size", options.getSize().toString());
        return new d.Key(strP, mapW);
    }

    public final SuccessResult g(rc.d.a chain, ImageRequest request, d.Key cacheKey, d.Value cacheValue) {
        return new SuccessResult(cacheValue.getImage(), request, oc.f.MEMORY_CACHE, cacheKey, b(cacheValue), e(cacheValue), f0.o(chain));
    }

    public final boolean h(d.Key cacheKey, ImageRequest request, rc.a.ExecuteResult result) {
        d dVarE;
        if (cacheKey == null || !request.getMemoryCachePolicy().getWriteEnabled() || !result.getImage().getShareable() || (dVarE = this.imageLoader.e()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(result.getIsSampled()));
        String diskCacheKey = result.getDiskCacheKey();
        if (diskCacheKey != null) {
            linkedHashMap.put("coil#disk_cache_key", diskCacheKey);
        }
        dVarE.f(cacheKey, new d.Value(result.getImage(), linkedHashMap));
        return true;
    }
}
