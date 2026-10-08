package ku0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.e0;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.s;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u000fH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020\u000fH\u0007¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lku0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/s;", "httpClientFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lpl/gov/coi/common/network/e0;", "multipartManager", "Llu0/b;", "k", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/s;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/e0;)Llu0/b;", "Llu0/a;", "a", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Llu0/a;", "reportRepository", "Leu0/a;", "d", "(Llu0/b;)Leu0/a;", "Leu0/b;", "e", "(Llu0/b;)Leu0/b;", "Leu0/c;", "f", "(Llu0/b;)Leu0/c;", "Leu0/d;", "g", "(Llu0/b;)Leu0/d;", "Leu0/e;", "h", "(Llu0/b;)Leu0/e;", "Leu0/f;", "i", "(Llu0/b;)Leu0/f;", "Leu0/g;", "j", "(Llu0/b;)Leu0/g;", "articlesRepository", "Lfu0/b;", "c", "(Llu0/a;)Lfu0/b;", "Lfu0/a;", "b", "(Llu0/a;)Lfu0/a;", "securityincidentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final lu0.a a(w httpServiceFactory, g0 networkCallMediator) {
        return new ju0.b(httpServiceFactory, networkCallMediator);
    }

    public final fu0.a b(lu0.a articlesRepository) {
        return new nu0.a(articlesRepository);
    }

    public final fu0.b c(lu0.a articlesRepository) {
        return new nu0.b(articlesRepository);
    }

    public final eu0.a d(lu0.b reportRepository) {
        return new mu0.a(reportRepository);
    }

    public final eu0.b e(lu0.b reportRepository) {
        return new mu0.b(reportRepository);
    }

    public final eu0.c f(lu0.b reportRepository) {
        return new mu0.c(reportRepository);
    }

    public final eu0.d g(lu0.b reportRepository) {
        return new mu0.d(reportRepository);
    }

    public final eu0.e h(lu0.b reportRepository) {
        return new mu0.e(reportRepository);
    }

    public final eu0.f i(lu0.b reportRepository) {
        return new mu0.f(reportRepository);
    }

    public final eu0.g j(lu0.b reportRepository) {
        return new mu0.g(reportRepository);
    }

    public final lu0.b k(w httpServiceFactory, s httpClientFactory, g0 networkCallMediator, e0 multipartManager) {
        return new ju0.f(httpServiceFactory, httpClientFactory, networkCallMediator, multipartManager);
    }
}
