package qt0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pt0.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lqt0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lrt0/b;", "c", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lrt0/b;", "Lrt0/c;", "a", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lrt0/c;", "Lrt0/a;", "b", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lrt0/a;", "pushservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f168434a = new a();

    private a() {
    }

    public final rt0.c a(w httpServiceFactory, g0 networkCallMediator) {
        return new f(httpServiceFactory, networkCallMediator);
    }

    public final rt0.a b(w httpServiceFactory, g0 networkCallMediator) {
        return new pt0.b(httpServiceFactory, networkCallMediator);
    }

    public final rt0.b c(w httpServiceFactory, g0 networkCallMediator) {
        return new pt0.d(httpServiceFactory, networkCallMediator);
    }
}
