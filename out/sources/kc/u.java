package kc;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0003\"\u0018\u0010\u0010\u001a\u00020\u0001*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0005*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\b*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0013\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkc/l$c;", "", "a", "Lkc/l$c;", "bitmapFactoryMaxParallelismKey", "Loc/o;", "b", "bitmapFactoryExifOrientationStrategyKey", "", "c", "imageDecoderEnabledKey", "", "d", "memoryCacheMaxSizePercentWhileInBackgroundKey", "Lkc/w$a;", "(Lkc/w$a;)I", "bitmapFactoryMaxParallelism", "(Lkc/w$a;)Loc/o;", "bitmapFactoryExifOrientationStrategy", "(Lkc/w$a;)Z", "imageDecoderEnabled", "(Lkc/w$a;)D", "memoryCacheMaxSizePercentWhileInBackground", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Extras.c<Integer> f109848a = new Extras.c<>(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<oc.o> f109849b = new Extras.c<>(oc.o.f144543c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Extras.c<Boolean> f109850c = new Extras.c<>(Boolean.TRUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Extras.c<Double> f109851d = new Extras.c<>(Double.valueOf(1.0d));

    public static final oc.o a(w.Options options) {
        return (oc.o) m.c(options.getDefaults().getExtras(), f109849b);
    }

    public static final int b(w.Options options) {
        return ((Number) m.c(options.getDefaults().getExtras(), f109848a)).intValue();
    }

    public static final boolean c(w.Options options) {
        return ((Boolean) m.c(options.getDefaults().getExtras(), f109850c)).booleanValue();
    }

    public static final double d(w.Options options) {
        return ((Number) m.c(options.getDefaults().getExtras(), f109851d)).doubleValue();
    }
}
