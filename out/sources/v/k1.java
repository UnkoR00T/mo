package v;

import android.content.Context;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lv/k1;", "", "Lv/h1;", "cameraRepository", "Loq/i0;", "a", "(Lv/h1;)V", "", "Lv/n0;", "currentCameras", "Lo/p;", "removedCameras", "", "c", "(Ljava/util/Set;Ljava/util/Set;)Z", "b", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f202654a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lv/k1$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "availableCameraCount", "", "cause", "<init>", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "a", "I", "()I", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int availableCameraCount;

        public a(String str, int i15, Throwable th4) {
            super(str, th4);
            this.availableCameraCount = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAvailableCameraCount() {
            return this.availableCameraCount;
        }
    }

    /* JADX INFO: renamed from: v.k1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv/k1$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lo/s;", "availableCamerasSelector", "Lv/k1;", "a", "(Landroid/content/Context;Lo/s;)Lv/k1;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f202654a = new Companion();

        private Companion() {
        }

        public final k1 a(Context context, o.s availableCamerasSelector) {
            return new l1(context, availableCamerasSelector);
        }
    }

    static k1 b(Context context, o.s sVar) {
        return INSTANCE.a(context, sVar);
    }

    void a(h1 cameraRepository);

    boolean c(Set<? extends n0> currentCameras, Set<o.p> removedCameras);
}
