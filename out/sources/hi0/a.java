package hi0;

import ay.j;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.u;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhi0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/a;", "base64Coder", "Lpl/gov/coi/common/network/u;", "httpHeaderDeviceInfoProvider", "Lay/j;", "jsonSerializer", "Lii0/a;", "b", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/a;Lpl/gov/coi/common/network/u;Lay/j;)Lii0/a;", "repository", "Ldi0/a;", "a", "(Lii0/a;)Ldi0/a;", "backsystemservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f84791a = new a();

    private a() {
    }

    public final di0.a a(ii0.a repository) {
        return new ji0.a(repository);
    }

    public final ii0.a b(w httpServiceFactory, g0 networkCallMediator, iy.a base64Coder, u httpHeaderDeviceInfoProvider, j jsonSerializer) {
        return new gi0.a(httpServiceFactory, networkCallMediator, base64Coder, httpHeaderDeviceInfoProvider, jsonSerializer);
    }
}
