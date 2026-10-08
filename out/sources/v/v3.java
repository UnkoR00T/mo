package v;

import b0.CalculatedUseCaseInfo;
import java.util.List;
import p071kotlin.Metadata;
import r.ResolvedFeatureGroup;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0010\u0010\u0014¨\u0006\u0017"}, d2 = {"Lv/v3;", "", "<init>", "()V", "Lv/m0;", "cameraInfoInternal", "Lo/u1;", "sessionConfig", "", "findMaxSupportedFrameRate", "Lr/b;", "resolvedFeatureGroup", "Lb0/b;", "c", "(Lv/m0;Lo/u1;ZLr/b;)Lb0/b;", "Lo/v;", "b", "Lo/v;", "a", "()Lo/v;", "(Lo/v;)V", "getCameraUseCaseAdapterProvider$annotations", "cameraUseCaseAdapterProvider", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v3 f202886a = new v3();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static o.v cameraUseCaseAdapterProvider;

    private v3() {
    }

    public static final o.v a() {
        o.v vVar = cameraUseCaseAdapterProvider;
        if (vVar != null) {
            return vVar;
        }
        return null;
    }

    public static final void b(o.v vVar) {
        cameraUseCaseAdapterProvider = vVar;
    }

    public static final CalculatedUseCaseInfo c(m0 cameraInfoInternal, o.u1 sessionConfig, boolean findMaxSupportedFrameRate, ResolvedFeatureGroup resolvedFeatureGroup) {
        if (cameraUseCaseAdapterProvider == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        b0.f fVarA = a().a(cameraInfoInternal.i());
        fVarA.l0(sessionConfig.getViewPort());
        fVarA.h0(sessionConfig.d());
        fVarA.k0(sessionConfig.getSessionType());
        fVarA.j0(sessionConfig.g());
        List<o.j2> listM = sessionConfig.m();
        if (resolvedFeatureGroup == null) {
            resolvedFeatureGroup = ResolvedFeatureGroup.Companion.c(ResolvedFeatureGroup.INSTANCE, sessionConfig, cameraInfoInternal, null, 2, null);
        }
        return fVarA.n0(listM, resolvedFeatureGroup, findMaxSupportedFrameRate);
    }
}
