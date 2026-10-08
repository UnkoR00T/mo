package androidx.camera.camera2.compat.quirk;

import a.u;
import android.annotation.SuppressLint;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import e.c;
import h.x;
import java.util.List;
import java.util.Objects;
import o.e1;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pq.n;
import pq.v;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;", "Lv/c3;", "La/u;", "streamConfigurationMapCompat", "<init>", "(La/u;)V", "", "Landroid/util/Size;", "e", "()Ljava/util/List;", "b", "La/u;", "c", "Loq/k;", "d", "supportedResolution", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class CamcorderProfileResolutionQuirk implements c3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u streamConfigurationMapCompat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k supportedResolution = l.a(new er.a() { // from class: b.b
        @Override // er.a
        public final Object a() {
            return CamcorderProfileResolutionQuirk.f(this.f15543a);
        }
    });

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk$a;", "", "<init>", "()V", "Lh/x;", "cameraMetadata", "", "a", "(Lh/x;)Z", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final boolean a(x cameraMetadata) {
            return x.INSTANCE.l(cameraMetadata);
        }

        private Companion() {
        }
    }

    public CamcorderProfileResolutionQuirk(u uVar) {
        this.streamConfigurationMapCompat = uVar;
    }

    private final List<Size> d() {
        return (List) this.supportedResolution.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk) {
        List listN;
        Size[] sizeArrF = camcorderProfileResolutionQuirk.streamConfigurationMapCompat.f(34);
        if (sizeArrF == null || (listN = n.f(sizeArrF)) == null) {
            listN = v.n();
        }
        c cVar = c.f45719a;
        if (e1.f("CXCP")) {
            String unused = c.TRUNCATED_TAG;
            Objects.toString(listN);
        }
        return listN;
    }

    public final List<Size> e() {
        return v.f1(d());
    }
}
