package g;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import e.b0;
import fr.k;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\nB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR,\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lg/b;", "", "Le/b0;", "cameraProperties", "", "Landroid/util/Pair;", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "extensionsSpecificChars", "<init>", "(Le/b0;Ljava/util/List;)V", "a", "Le/b0;", "b", "Ljava/util/List;", "", "c", "Ljava/lang/String;", "cameraId", "d", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<CameraCharacteristics.Key<?>, Object>> extensionsSpecificChars;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final /* synthetic */ String cameraId;

    /* JADX INFO: renamed from: g.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg/b$a;", "", "<init>", "()V", "Le/b0;", "cameraProperties", "Lg/b;", "a", "(Le/b0;)Lg/b;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final b a(b0 cameraProperties) {
            return new b(cameraProperties, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(b0 b0Var, List<? extends Pair<CameraCharacteristics.Key<?>, Object>> list) {
        this.cameraProperties = b0Var;
        this.extensionsSpecificChars = list;
        this.cameraId = b0Var.m();
    }

    /* synthetic */ b(b0 b0Var, List list, int i15, k kVar) {
        this(b0Var, (i15 & 2) != 0 ? null : list);
    }
}
