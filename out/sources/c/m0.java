package c;

import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0007J0\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lc/m0;", "", "Lkotlin/Function1;", "Ltq/e;", "Lh/q0;", "frameMetadata", "", "a", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "b", "()Z", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lc/m0$a;", "", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c.m0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc/m0$a$a;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/quirk/a;", "cameraQuirks", "Lh/p;", "cameraDevices", "Lf/j;", "intrinsicZoomCalculator", "Lc/m0;", "a", "(Landroidx/camera/camera2/compat/quirk/a;Lh/p;Lf/j;)Lc/m0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final m0 a(androidx.camera.camera2.compat.quirk.a cameraQuirks, h.p cameraDevices, f.j intrinsicZoomCalculator) {
                return cameraQuirks.b().a(UseTorchAsFlashQuirk.class) ? new p0(cameraQuirks, cameraDevices, intrinsicZoomCalculator) : z.f22274a;
            }

            private Companion() {
            }
        }
    }

    Object a(er.l<? super tq.e<? super h.q0>, ? extends Object> lVar, tq.e<? super Boolean> eVar);

    boolean b();
}
