package pi0;

import ay.j;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.l;
import pl.gov.coi.common.network.s;
import pl.gov.coi.common.network.w;
import ri0.k;
import ti0.h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010!\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lpi0/a;", "", "<init>", "()V", "Lsi0/a;", "chatBotRepository", "Lti0/a;", "b", "(Lsi0/a;)Lti0/a;", "Lti0/g;", "e", "(Lsi0/a;)Lti0/g;", "Lti0/e;", "d", "(Lsi0/a;)Lti0/e;", "Lay/a;", "baseUrlProvider", "Lpl/gov/coi/common/network/s;", "httpClientFactory", "Lpl/gov/coi/common/network/l;", "errorPayloadHandler", "Lqi0/a;", "f", "(Lay/a;Lpl/gov/coi/common/network/s;Lpl/gov/coi/common/network/l;)Lqi0/a;", "Lri0/k;", "chatServiceEndpoints", "Lay/j;", "jsonSerializer", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "sseConnector", "a", "(Lri0/k;Lay/j;Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lqi0/a;)Lsi0/a;", "repository", "Lti0/c;", "c", "(Lsi0/a;)Lti0/c;", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f157905a = new a();

    private a() {
    }

    public final si0.a a(k chatServiceEndpoints, j jsonSerializer, w httpServiceFactory, g0 networkCallMediator, qi0.a sseConnector) {
        return new oi0.b(httpServiceFactory, jsonSerializer, networkCallMediator, sseConnector, chatServiceEndpoints);
    }

    public final ti0.a b(si0.a chatBotRepository) {
        return new ti0.b(chatBotRepository);
    }

    public final ti0.c c(si0.a repository) {
        return new ti0.d(repository);
    }

    public final ti0.e d(si0.a chatBotRepository) {
        return new ti0.f(chatBotRepository);
    }

    public final ti0.g e(si0.a chatBotRepository) {
        return new h(chatBotRepository);
    }

    public final qi0.a f(ay.a baseUrlProvider, s httpClientFactory, l errorPayloadHandler) {
        return new ki0.b(baseUrlProvider, httpClientFactory, errorPayloadHandler);
    }
}
