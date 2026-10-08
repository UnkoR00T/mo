package b0;

import android.util.Range;
import java.util.List;
import o.j2;
import p071kotlin.Metadata;
import v.f0;
import v.k0;
import v.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006Ju\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lb0/m;", "", "Lv/k0;", "cameraDeviceSurfaceManager", "Loq/i0;", "a", "(Lv/k0;)V", "", "cameraMode", "Lv/m0;", "cameraInfoInternal", "", "Lo/j2;", "newUseCases", "attachedUseCases", "Lv/f0;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Lb0/l;", "b", "(ILv/m0;Ljava/util/List;Ljava/util/List;Lv/f0;ILandroid/util/Range;ZZ)Lb0/l;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f15600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f15599b = new a();

    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001Ji\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"b0/m$a", "Lb0/m;", "", "cameraMode", "Lv/m0;", "cameraInfoInternal", "", "Lo/j2;", "newUseCases", "attachedUseCases", "Lv/f0;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Lb0/l;", "b", "(ILv/m0;Ljava/util/List;Ljava/util/List;Lv/f0;ILandroid/util/Range;ZZ)Lb0/l;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements m {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b0.m
        public StreamSpecQueryResult b(int cameraMode, m0 cameraInfoInternal, List<? extends j2> newUseCases, List<? extends j2> attachedUseCases, f0 cameraConfig, int sessionType, Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
            return new StreamSpecQueryResult(null, 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: b0.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lb0/m$b;", "", "<init>", "()V", "Lb0/m;", "NO_OP_STREAM_SPECS_CALCULATOR", "Lb0/m;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f15600a = new Companion();

        private Companion() {
        }
    }

    default void a(k0 cameraDeviceSurfaceManager) {
    }

    StreamSpecQueryResult b(int cameraMode, m0 cameraInfoInternal, List<? extends j2> newUseCases, List<? extends j2> attachedUseCases, f0 cameraConfig, int sessionType, Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate);
}
