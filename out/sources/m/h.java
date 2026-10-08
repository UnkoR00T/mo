package m;

import h.v;
import mu.f0;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lm/h;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lmu/p0;", "Lm/h$a;", "I1", "()Lmu/p0;", "cameraAvailability", "Lmu/f0;", "Loq/i0;", "m1", "()Lmu/f0;", "cameraPriorities", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h extends AutoCloseable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lm/h$a;", "", "<init>", "()V", "d", "b", "a", "c", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: m.h$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lm/h$a$a;", "Lm/h$a;", "Lh/v;", "cameraId", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CameraAvailable extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String camera;

            public /* synthetic */ CameraAvailable(String str, fr.k kVar) {
                this(str);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCamera() {
                return this.camera;
            }

            public String toString() {
                return "CameraAvailable(camera=" + ((Object) v.f(this.camera)) + ')';
            }

            private CameraAvailable(String str) {
                this.camera = str;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm/h$a$b;", "Lm/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f121828a = new b();

            private b() {
            }

            public String toString() {
                return "CameraPrioritiesChanged";
            }
        }

        /* JADX INFO: renamed from: m.h$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lm/h$a$c;", "Lm/h$a;", "Lh/v;", "cameraId", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CameraUnavailable extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String camera;

            public /* synthetic */ CameraUnavailable(String str, fr.k kVar) {
                this(str);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCamera() {
                return this.camera;
            }

            public String toString() {
                return "CameraUnavailable(camera=" + ((Object) v.f(this.camera)) + ')';
            }

            private CameraUnavailable(String str) {
                this.camera = str;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm/h$a$d;", "Lm/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f121830a = new d();

            private d() {
            }

            public String toString() {
                return "UnknownCameraStatus";
            }
        }
    }

    p0<a> I1();

    f0<i0> m1();
}
