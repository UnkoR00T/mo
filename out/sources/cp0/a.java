package cp0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.e0;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcp0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lpl/gov/coi/common/network/e0;", "multipartManager", "Lp00/c;", "interceptorDefaultHeaders", "Ldp0/a;", "c", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/e0;Lp00/c;)Ldp0/a;", "repository", "Lyo0/b;", "b", "(Ldp0/a;)Lyo0/b;", "Lyo0/a;", "a", "(Ldp0/a;)Lyo0/a;", "fileservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final yo0.a a(dp0.a repository) {
        return new ep0.a(repository);
    }

    public final yo0.b b(dp0.a repository) {
        return new ep0.b(repository);
    }

    public final dp0.a c(w httpServiceFactory, g0 networkCallMediator, e0 multipartManager, p00.c interceptorDefaultHeaders) {
        return new bp0.a(httpServiceFactory, networkCallMediator, multipartManager, interceptorDefaultHeaders);
    }
}
