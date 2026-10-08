package s;

import o.u1;
import oq.p;
import p071kotlin.Metadata;
import v.m0;

/* JADX INFO: renamed from: s.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Ls/e;", "Lq/b;", "Lx/a;", "videoStabilization", "<init>", "(Lx/a;)V", "Lv/m0;", "cameraInfoInternal", "Lo/u1;", "sessionConfig", "", "d", "(Lv/m0;Lo/u1;)Z", "", "toString", "()Ljava/lang/String;", "g", "Lx/a;", "f", "()Lx/a;", "Ls/b;", "h", "Ls/b;", "c", "()Ls/b;", "featureTypeInternal", "i", "a", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoStabilizationFeature extends q.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x.a f176992j = x.a.OFF;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x.a videoStabilization;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s.b featureTypeInternal = s.b.VIDEO_STABILIZATION;

    /* JADX INFO: renamed from: s.e$b */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176995a;

        static {
            int[] iArr = new int[x.a.values().length];
            try {
                iArr[x.a.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.a.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.a.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.a.UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f176995a = iArr;
        }
    }

    public VideoStabilizationFeature(x.a aVar) {
        this.videoStabilization = aVar;
    }

    @Override // q.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public s.b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @Override // q.b
    public boolean d(m0 cameraInfoInternal, u1 sessionConfig) {
        int i15 = b.f176995a[this.videoStabilization.ordinal()];
        if (i15 == 1) {
            return cameraInfoInternal.w();
        }
        if (i15 == 2) {
            return cameraInfoInternal.P();
        }
        if (i15 == 3 || i15 == 4) {
            return true;
        }
        throw new p();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final x.a getVideoStabilization() {
        return this.videoStabilization;
    }

    public String toString() {
        return "VideoStabilizationFeature(mode=" + this.videoStabilization.name() + ')';
    }
}
