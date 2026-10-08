package androidx.camera.camera2;

import PRN.g;
import PRN.p;
import PRN.q;
import android.content.Context;
import fr.k;
import h.z;
import java.util.Set;
import o.e0;
import p071kotlin.Metadata;
import v.i1;
import v.k0;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Landroidx/camera/camera2/Camera2Config;", "", "a", "DefaultProvider", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2Config {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/camera/camera2/Camera2Config$DefaultProvider;", "Lo/e0$b;", "<init>", "()V", "Lo/e0;", "getCameraXConfig", "()Lo/e0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultProvider implements e0.b {
        @Override // o.e0.b
        public e0 getCameraXConfig() {
            return Camera2Config.INSTANCE.a();
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.Camera2Config$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/Camera2Config$a;", "", "<init>", "()V", "Lo/e0;", "a", "()Lo/e0;", "Lh/z;", "sharedCameraPipe", "Landroid/content/Context;", "sharedAppContext", "Lv/i1;", "sharedThreadConfig", "b", "(Lh/z;Landroid/content/Context;Lv/i1;)Lo/e0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ e0 c(Companion companion, z zVar, Context context, i1 i1Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                zVar = null;
            }
            if ((i15 & 2) != 0) {
                context = null;
            }
            if ((i15 & 4) != 0) {
                i1Var = null;
            }
            return companion.b(zVar, context, i1Var);
        }

        public final e0 a() {
            return c(this, null, null, null, 7, null);
        }

        public final e0 b(z sharedCameraPipe, Context sharedAppContext, i1 sharedThreadConfig) {
            return new e0.a().c(new g(sharedCameraPipe, sharedAppContext, sharedThreadConfig)).d(new k0.a() { // from class: pRN.h2
                @Override // v.k0.a
                public final k0 a(Context context, Object obj, Set set) {
                    return new p(context, obj, set);
                }
            }).h(new x3.c() { // from class: pRN.i2
                @Override // v.x3.c
                public final x3 a(Context context) {
                    return new q(context);
                }
            }).e(true).a();
        }

        private Companion() {
        }
    }
}
