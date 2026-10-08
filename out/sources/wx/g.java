package wx;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lwx/g;", "", "", "d", "()F", "", "getName", "()Ljava/lang/String;", "name", "f", "extension", "e", "sizeInBytes", "c", "fullName", "a", "Lwx/e;", "Lwx/l;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f215732a;

    /* JADX INFO: renamed from: wx.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwx/g$a;", "", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f215732a = new Companion();

        private Companion() {
        }
    }

    default String c() {
        if (f().length() == 0) {
            return getName();
        }
        return getName() + "." + f();
    }

    default float d() {
        return e() / 1000000.0f;
    }

    float e();

    String f();

    String getName();
}
