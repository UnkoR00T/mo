package d;

import e.h0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ld/c0;", "", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d.c0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld/c0$a;", "", "<init>", "()V", "Lnq/a;", "Le/h0;", "capturePipelineImplProvider", "Lc/h;", "capturePipelineTorchCorrectionProvider", "Le/c0;", "a", "(Lnq/a;Lnq/a;)Le/c0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final e.c0 a(nq.a<h0> capturePipelineImplProvider, nq.a<c.h> capturePipelineTorchCorrectionProvider) {
            return c.h.INSTANCE.a() ? capturePipelineTorchCorrectionProvider.get() : capturePipelineImplProvider.get();
        }

        private Companion() {
        }
    }
}
