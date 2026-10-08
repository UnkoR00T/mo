package x;

import fr.k;
import p071kotlin.Metadata;
import wq.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lx/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    UNSPECIFIED,
    OFF,
    ON,
    PREVIEW;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f216130g = b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx/a$a;", "", "<init>", "()V", "", "previewStabilizationMode", "videoStabilizationMode", "Lx/a;", "a", "(II)Lx/a;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final a a(int previewStabilizationMode, int videoStabilizationMode) {
            if (previewStabilizationMode == 1 || videoStabilizationMode == 1) {
                return a.OFF;
            }
            if (previewStabilizationMode == 2) {
                return a.PREVIEW;
            }
            return videoStabilizationMode == 2 ? a.ON : a.UNSPECIFIED;
        }

        private Companion() {
        }
    }
}
