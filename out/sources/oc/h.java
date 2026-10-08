package oc;

import ad.Size;
import ed.f0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u0004*\u00020\u00182\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Loc/h;", "", "<init>", "()V", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "Lad/f;", "scale", "a", "(IIIILad/f;)I", "Lad/g;", "maxSize", "", "d", "(IIIILad/f;Lad/g;)D", "c", "(DDDDLad/f;Lad/g;)D", "targetSize", "Led/q;", "b", "(IILad/g;Lad/f;Lad/g;)J", "Lad/a;", "e", "(Lad/a;Lad/f;)I", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f144533a = new h();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144534a;

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
            f144534a = iArr;
        }
    }

    private h() {
    }

    public static final int a(int srcWidth, int srcHeight, int dstWidth, int dstHeight, ad.f scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(srcWidth / dstWidth);
        int iHighestOneBit2 = Integer.highestOneBit(srcHeight / dstHeight);
        int i15 = a.f144534a[scale.ordinal()];
        if (i15 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return lr.m.e(iMin, 1);
    }

    public static final long b(int srcWidth, int srcHeight, Size targetSize, ad.f scale, Size maxSize) {
        if (!ad.h.b(targetSize)) {
            h hVar = f144533a;
            int iE = hVar.e(targetSize.getWidth(), scale);
            srcHeight = hVar.e(targetSize.getHeight(), scale);
            srcWidth = iE;
        }
        if ((maxSize.getWidth() instanceof ad.a.C0109a) && !f0.n(srcWidth)) {
            srcWidth = lr.m.j(srcWidth, ((ad.a.C0109a) maxSize.getWidth()).getPx());
        }
        if ((maxSize.getHeight() instanceof ad.a.C0109a) && !f0.n(srcHeight)) {
            srcHeight = lr.m.j(srcHeight, ((ad.a.C0109a) maxSize.getHeight()).getPx());
        }
        return ed.q.a(srcWidth, srcHeight);
    }

    public static final double c(double srcWidth, double srcHeight, double dstWidth, double dstHeight, ad.f scale, Size maxSize) {
        double dMax;
        double d15 = dstWidth / srcWidth;
        double d16 = dstHeight / srcHeight;
        int i15 = a.f144534a[scale.ordinal()];
        if (i15 == 1) {
            dMax = Math.max(d15, d16);
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            dMax = Math.min(d15, d16);
        }
        if (maxSize.getWidth() instanceof ad.a.C0109a) {
            dMax = lr.m.h(dMax, ((double) ((ad.a.C0109a) maxSize.getWidth()).getPx()) / srcWidth);
        }
        return maxSize.getHeight() instanceof ad.a.C0109a ? lr.m.h(dMax, ((double) ((ad.a.C0109a) maxSize.getHeight()).getPx()) / srcHeight) : dMax;
    }

    public static final double d(int srcWidth, int srcHeight, int dstWidth, int dstHeight, ad.f scale, Size maxSize) {
        double dMax;
        double d15 = srcWidth;
        double d16 = ((double) dstWidth) / d15;
        double d17 = srcHeight;
        double d18 = ((double) dstHeight) / d17;
        int i15 = a.f144534a[scale.ordinal()];
        if (i15 == 1) {
            dMax = Math.max(d16, d18);
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            dMax = Math.min(d16, d18);
        }
        if (maxSize.getWidth() instanceof ad.a.C0109a) {
            dMax = lr.m.h(dMax, ((double) ((ad.a.C0109a) maxSize.getWidth()).getPx()) / d15);
        }
        return maxSize.getHeight() instanceof ad.a.C0109a ? lr.m.h(dMax, ((double) ((ad.a.C0109a) maxSize.getHeight()).getPx()) / d17) : dMax;
    }

    private final int e(ad.a aVar, ad.f fVar) {
        if (aVar instanceof ad.a.C0109a) {
            return ((ad.a.C0109a) aVar).getPx();
        }
        int i15 = a.f144534a[fVar.ordinal()];
        if (i15 == 1) {
            return PKIFailureInfo.systemUnavail;
        }
        if (i15 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new oq.p();
    }
}
