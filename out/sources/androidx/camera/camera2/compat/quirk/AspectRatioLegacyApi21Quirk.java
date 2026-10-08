package androidx.camera.camera2.compat.quirk;

import fr.k;
import h.x;
import p071kotlin.Metadata;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;", "Lv/c3;", "<init>", "()V", "", "c", "()I", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AspectRatioLegacyApi21Quirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk$a;", "", "<init>", "()V", "Lh/x;", "cameraMetadata", "", "a", "(Lh/x;)Z", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a(x cameraMetadata) {
            x.INSTANCE.l(cameraMetadata);
            return false;
        }

        private Companion() {
        }
    }

    public final int c() {
        return 2;
    }
}
