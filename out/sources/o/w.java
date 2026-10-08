package o;

import p071kotlin.Metadata;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010\u001c\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lo/w;", "Lo/v;", "Lv/h1;", "cameraRepository", "Lp/a;", "cameraCoordinator", "Lv/x3;", "useCaseConfigFactory", "Lb0/m;", "streamSpecsCalculator", "<init>", "(Lv/h1;Lp/a;Lv/x3;Lb0/m;)V", "Lv/n0;", "camera", "secondaryCamera", "Lv/e;", "adapterCameraInfo", "secondaryAdapterCameraInfo", "Lo/h0;", "compositionSettings", "secondaryCompositionSettings", "Lb0/f;", "c", "(Lv/n0;Lv/n0;Lv/e;Lv/e;Lo/h0;Lo/h0;)Lb0/f;", "", "cameraId", "a", "(Ljava/lang/String;)Lb0/f;", "b", "Lv/h1;", "Lp/a;", "Lv/x3;", "d", "Lb0/m;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v.h1 cameraRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p.a cameraCoordinator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x3 useCaseConfigFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b0.m streamSpecsCalculator;

    public w(v.h1 h1Var, p.a aVar, x3 x3Var, b0.m mVar) {
        this.cameraRepository = h1Var;
        this.cameraCoordinator = aVar;
        this.useCaseConfigFactory = x3Var;
        this.streamSpecsCalculator = mVar;
    }

    private final b0.f c(v.n0 camera, v.n0 secondaryCamera, v.e adapterCameraInfo, v.e secondaryAdapterCameraInfo, h0 compositionSettings, h0 secondaryCompositionSettings) {
        return new b0.f(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings, this.cameraCoordinator, this.streamSpecsCalculator, this.useCaseConfigFactory);
    }

    static /* synthetic */ b0.f d(w wVar, v.n0 n0Var, v.n0 n0Var2, v.e eVar, v.e eVar2, h0 h0Var, h0 h0Var2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            n0Var2 = null;
        }
        if ((i15 & 8) != 0) {
            eVar2 = null;
        }
        if ((i15 & 16) != 0) {
            h0Var = h0.f139972d;
        }
        if ((i15 & 32) != 0) {
            h0Var2 = h0.f139972d;
        }
        return wVar.c(n0Var, n0Var2, eVar, eVar2, h0Var, h0Var2);
    }

    @Override // o.v
    public b0.f a(String cameraId) {
        v.n0 n0VarL = this.cameraRepository.l(cameraId);
        return d(this, n0VarL, null, new v.e(n0VarL.o(), v.i0.a()), null, null, null, 58, null);
    }

    @Override // o.v
    public b0.f b(v.n0 camera, v.n0 secondaryCamera, v.e adapterCameraInfo, v.e secondaryAdapterCameraInfo, h0 compositionSettings, h0 secondaryCompositionSettings) {
        return c(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings);
    }
}
