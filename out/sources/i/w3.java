package i;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J6\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Li/w3;", "", "Lh/v;", "cameraId", "Li/x1;", "camera2DeviceCloser", "Lkotlin/Function1;", "Loq/i0;", "", "isForegroundObserver", "Li/k3;", "b", "(Ljava/lang/String;Li/x1;Ler/l;Ltq/e;)Ljava/lang/Object;", "Li/q0;", "c", "(Ljava/lang/String;Li/x1;)Li/q0;", "a", "()V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface w3 {
    /* JADX INFO: Access modifiers changed from: private */
    static boolean d(oq.i0 i0Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object e(w3 w3Var, String str, x1 x1Var, er.l lVar, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCameraWithRetry-aeCOTgg");
        }
        if ((i15 & 4) != 0) {
            lVar = new er.l() { // from class: i.v3
                @Override // er.l
                public final Object b(Object obj2) {
                    return Boolean.valueOf(w3.d((oq.i0) obj2));
                }
            };
        }
        return w3Var.b(str, x1Var, lVar, eVar);
    }

    void a();

    Object b(String str, x1 x1Var, er.l<? super oq.i0, Boolean> lVar, tq.e<? super OpenCameraResult> eVar);

    AwaitOpenCameraResult c(String cameraId, x1 camera2DeviceCloser);
}
