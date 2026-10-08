package q;

import o.i0;
import o.u1;
import oq.k;
import oq.l;
import oq.p;
import p071kotlin.Metadata;
import s.DynamicRangeFeature;
import s.FpsRangeFeature;
import s.ImageFormatFeature;
import s.VideoStabilizationFeature;
import v.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lq/b;", "", "<init>", "()V", "Ls/b;", "", "e", "(Ls/b;)I", "Lv/m0;", "cameraInfoInternal", "Lo/u1;", "sessionConfig", "", "d", "(Lv/m0;Lo/u1;)Z", "a", "Loq/k;", "getFeatureType", "()I", "featureType", "c", "()Ls/b;", "featureTypeInternal", "b", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f163353c = new DynamicRangeFeature(i0.f140013f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f163354d = new FpsRangeFeature(60, 60);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f163355e = new VideoStabilizationFeature(x.a.PREVIEW);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f163356f = new ImageFormatFeature(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k featureType = l.a(new er.a() { // from class: q.a
        @Override // er.a
        public final Object a() {
            return Integer.valueOf(b.b(this.f163351a));
        }
    });

    /* JADX INFO: renamed from: q.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class C4051b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163358a;

        static {
            int[] iArr = new int[s.b.values().length];
            try {
                iArr[s.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.b.RECORDING_QUALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f163358a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(b bVar) {
        return bVar.e(bVar.getFeatureTypeInternal());
    }

    private final int e(s.b bVar) {
        int i15 = C4051b.f163358a[bVar.ordinal()];
        if (i15 == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        if (i15 == 3) {
            return 2;
        }
        if (i15 == 4) {
            return 3;
        }
        if (i15 == 5) {
            return 4;
        }
        throw new p();
    }

    /* JADX INFO: renamed from: c */
    public abstract s.b getFeatureTypeInternal();

    public boolean d(m0 cameraInfoInternal, u1 sessionConfig) {
        return true;
    }
}
