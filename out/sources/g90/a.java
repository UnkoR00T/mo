package g90;

import f90.f;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lg90/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Li90/a;", "a", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Li90/a;", "Li90/c;", "c", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Li90/c;", "Li90/b;", "b", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Li90/b;", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f71368a = new a();

    private a() {
    }

    public final i90.a a(w httpServiceFactory, g0 networkCallMediator) {
        return new f90.b(httpServiceFactory, networkCallMediator);
    }

    public final i90.b b(w httpServiceFactory, g0 networkCallMediator) {
        return new f90.d(httpServiceFactory, networkCallMediator);
    }

    public final i90.c c(w httpServiceFactory, g0 networkCallMediator) {
        return new f(httpServiceFactory, networkCallMediator);
    }
}
