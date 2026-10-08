package h;

import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0018\u00010\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lh/p;", "", "Lh/g;", "cameraBackendId", "Lmu/g;", "", "Lh/v;", "f", "(Ljava/lang/String;)Lmu/g;", "a", "(Ljava/lang/String;)Ljava/util/List;", "", "b", "(Ljava/lang/String;)Ljava/util/Set;", "cameraId", "Lh/x;", "g", "(Ljava/lang/String;Ljava/lang/String;)Lh/x;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface p {
    static /* synthetic */ mu.g c(p pVar, String str, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cameraIdsFlow-SeavPBo");
        }
        if ((i15 & 1) != 0) {
            str = null;
        }
        return pVar.f(str);
    }

    static /* synthetic */ List d(p pVar, String str, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitCameraIds-SeavPBo");
        }
        if ((i15 & 1) != 0) {
            str = null;
        }
        return pVar.a(str);
    }

    static /* synthetic */ Set e(p pVar, String str, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitConcurrentCameraIds-SeavPBo");
        }
        if ((i15 & 1) != 0) {
            str = null;
        }
        return pVar.b(str);
    }

    static /* synthetic */ x h(p pVar, String str, String str2, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitCameraMetadata-FpsL5FU");
        }
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        return pVar.g(str, str2);
    }

    List<v> a(String cameraBackendId);

    Set<Set<v>> b(String cameraBackendId);

    mu.g<List<v>> f(String cameraBackendId);

    x g(String cameraId, String cameraBackendId);
}
