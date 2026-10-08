package m;

import android.os.Trace;
import h.v;
import h.x;
import io.sentry.android.core.c2;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0018\u00010\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001a"}, d2 = {"Lm/c;", "Lh/p;", "Lh/h;", "cameraBackends", "<init>", "(Lh/h;)V", "Lh/g;", "cameraBackendId", "Lh/e;", "j", "(Ljava/lang/String;)Lh/e;", "Lmu/g;", "", "Lh/v;", "f", "(Ljava/lang/String;)Lmu/g;", "a", "(Ljava/lang/String;)Ljava/util/List;", "", "b", "(Ljava/lang/String;)Ljava/util/Set;", "cameraId", "Lh/x;", "g", "(Ljava/lang/String;Ljava/lang/String;)Lh/x;", "Lh/h;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements h.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.h cameraBackends;

    public c(h.h hVar) {
        this.cameraBackends = hVar;
    }

    private final h.e j(String cameraBackendId) {
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection("getCameraBackend");
            if (cameraBackendId == null) {
                cameraBackendId = this.cameraBackends.getDefault().f();
            }
            h.e eVarA = this.cameraBackends.a(cameraBackendId);
            if (eVarA != null) {
                Trace.endSection();
                return eVarA;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) h.g.f(cameraBackendId))).toString());
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    @Override // h.p
    public List<v> a(String cameraBackendId) {
        h.e eVarJ = j(cameraBackendId);
        List<v> listH = eVarJ.h();
        if (listH == null && k.k.f107055a.d()) {
            c2.g("CXCP", "Failed to load cameraIds from " + ((Object) h.g.f(eVarJ.f())));
        }
        return listH;
    }

    @Override // h.p
    public Set<Set<v>> b(String cameraBackendId) {
        return j(cameraBackendId).d();
    }

    @Override // h.p
    public mu.g<List<v>> f(String cameraBackendId) {
        return j(cameraBackendId).g();
    }

    @Override // h.p
    public x g(String cameraId, String cameraBackendId) {
        h.e eVarJ = j(cameraBackendId);
        x xVarA = eVarJ.a(cameraId);
        if (xVarA == null && k.k.f107055a.d()) {
            c2.g("CXCP", "Failed to load metadata for " + ((Object) v.f(cameraId)) + " from " + ((Object) h.g.f(eVarJ.f())));
        }
        return xVarA;
    }
}
