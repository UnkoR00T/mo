package o90;

import android.content.Context;
import p071kotlin.Metadata;
import p135y70.c4;
import p135y70.d4;
import p135y70.g4;
import p135y70.h4;
import p135y70.i4;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\b\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190 2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020*2\b\b\u0001\u0010'\u001a\u00020$2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b+\u0010,JI\u00109\u001a\u0002082\u0006\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020-2\b\b\u0001\u0010/\u001a\u00020*2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b9\u0010:JQ\u0010K\u001a\u00020J2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\b\b\u0001\u0010?\u001a\u0002082\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0007¢\u0006\u0004\bK\u0010LJ)\u0010S\u001a\u00020R2\b\b\u0001\u0010M\u001a\u00020J2\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0007¢\u0006\u0004\bS\u0010TJ\u000f\u0010V\u001a\u00020UH\u0007¢\u0006\u0004\bV\u0010WJ!\u0010]\u001a\u00020\\2\u0006\u0010Y\u001a\u00020X2\b\b\u0001\u0010[\u001a\u00020ZH\u0007¢\u0006\u0004\b]\u0010^J!\u0010`\u001a\u00020Z2\u0006\u0010Q\u001a\u00020P2\b\b\u0001\u0010_\u001a\u00020UH\u0007¢\u0006\u0004\b`\u0010aJ9\u0010g\u001a\u00020f2\b\b\u0001\u0010M\u001a\u00020J2\u0006\u0010O\u001a\u00020N2\u0006\u0010c\u001a\u00020b2\u0006\u0010I\u001a\u00020H2\u0006\u0010e\u001a\u00020dH\u0007¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00020\u0004H\u0007¢\u0006\u0004\bk\u0010lJ\u000f\u0010n\u001a\u00020mH\u0007¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020q2\u0006\u0010p\u001a\u00020mH\u0007¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020t2\u0006\u0010p\u001a\u00020mH\u0007¢\u0006\u0004\bu\u0010v¨\u0006w"}, d2 = {"Lo90/k;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lp10/b;", "databaseKeyProvider", "Lo10/c;", "o", "(Landroid/content/Context;Lp10/b;)Lo10/c;", "databaseFactory", "Lq10/a;", "databaseRegistry", "Lp10/f;", "p", "(Landroid/content/Context;Lo10/c;Lq10/a;)Lp10/f;", "c", "(Landroid/content/Context;)Lq10/a;", "Lwy/a;", "masterKeyProvider", "b", "(Lwy/a;)Lp10/b;", "Lqf0/a;", "loadAccessTokenUC", "Lwy/d;", "q", "(Lqf0/a;)Lwy/d;", "Leg0/p;", "isUserCertActiveUC", "Lqg0/b;", "checkActivationStateUC", "Laq/a;", "sessionTokenLoader", "Lez/a;", "currentTimeProvider", "Lwy/b;", "l", "(Leg0/p;Lqg0/b;Laq/a;Lez/a;)Lwy/b;", "networkSessionManager", "Lp00/f;", "interceptorsConfig", "Lp00/b;", "i", "(Lwy/b;Lp00/f;)Lp00/b;", "Lp00/a;", "blockHttpCleartextInterceptor", "interceptorAuth", "Lp00/e;", "interceptorNetworkConnection", "Lp00/c;", "interceptorDefaultHeaders", "Lp00/i;", "remoteHttpLoggingInterceptor", "Lp00/d;", "interceptorDynamicBaseUrlMock", "Lp00/g;", "j", "(Lp00/f;Lp00/a;Lp00/b;Lp00/e;Lp00/c;Lp00/i;Lp00/d;)Lp00/g;", "Lpl/gov/coi/common/network/r;", "httpClientConfig", "Ly00/h0;", "securityProviderFactory", "interceptorsFactory", "Lpl/gov/coi/common/network/a0;", "insecureHostnameVerifierFactory", "Lpl/gov/coi/common/network/c0;", "insecureTrustManagerFactory", "Ly00/x;", "nonCTTrustManagerProvider", "Lpl/gov/coi/common/network/n0;", "mTLSKeyManagerFactoryOverride", "Lpx/d;", "remoteLogger", "Lpl/gov/coi/common/network/s;", "f", "(Lpl/gov/coi/common/network/r;Ly00/h0;Lp00/g;Lpl/gov/coi/common/network/a0;Lpl/gov/coi/common/network/c0;Ly00/x;Lpl/gov/coi/common/network/n0;Lpx/d;)Lpl/gov/coi/common/network/s;", "httpClientFactory", "Lay/a;", "baseUrlProvider", "Lay/j;", "jsonSerializer", "Lpl/gov/coi/common/network/w;", "g", "(Lpl/gov/coi/common/network/s;Lay/a;Lay/j;)Lpl/gov/coi/common/network/w;", "Ldx/a;", "d", "()Ldx/a;", "Lpl/gov/coi/common/network/i0;", "networkExceptionParser", "Lpl/gov/coi/common/network/l;", "errorPayloadHandler", "Lpl/gov/coi/common/network/g0;", "k", "(Lpl/gov/coi/common/network/i0;Lpl/gov/coi/common/network/l;)Lpl/gov/coi/common/network/g0;", "deactivateDomainErrorFactory", "e", "(Lay/j;Ldx/a;)Lpl/gov/coi/common/network/l;", "Lay/k;", "networkConnectionManager", "Lxw/d;", "dispatcherProvider", "Lay/o;", "n", "(Lpl/gov/coi/common/network/s;Lay/a;Lay/k;Lpx/d;Lxw/d;)Lay/o;", "context", "Lec0/b;", "h", "(Landroid/content/Context;)Lec0/b;", "Ly70/g4;", "m", "()Ly70/g4;", "store", "Ly70/h4;", "r", "(Ly70/g4;)Ly70/h4;", "Ly70/c4;", "a", "(Ly70/g4;)Ly70/c4;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f143437a = new k();

    private k() {
    }

    public final c4 a(g4 store) {
        return new d4(store);
    }

    public final p10.b b(wy.a masterKeyProvider) {
        return new p10.d(masterKeyProvider);
    }

    public final q10.a c(Context applicationContext) {
        return new q10.c(applicationContext, null, 2, null);
    }

    public final dx.a d() {
        return new sf0.a();
    }

    public final pl.gov.coi.common.network.l e(ay.j jsonSerializer, dx.a deactivateDomainErrorFactory) {
        return new kb4.a(jsonSerializer, deactivateDomainErrorFactory);
    }

    public final pl.gov.coi.common.network.s f(pl.gov.coi.common.network.r httpClientConfig, y00.h0 securityProviderFactory, p00.g interceptorsFactory, pl.gov.coi.common.network.a0 insecureHostnameVerifierFactory, pl.gov.coi.common.network.c0 insecureTrustManagerFactory, y00.x nonCTTrustManagerProvider, pl.gov.coi.common.network.n0 mTLSKeyManagerFactoryOverride, px.d remoteLogger) {
        return new pl.gov.coi.common.network.s(httpClientConfig, securityProviderFactory, interceptorsFactory, insecureTrustManagerFactory, insecureHostnameVerifierFactory, nonCTTrustManagerProvider, mTLSKeyManagerFactoryOverride, remoteLogger);
    }

    public final pl.gov.coi.common.network.w g(pl.gov.coi.common.network.s httpClientFactory, ay.a baseUrlProvider, ay.j jsonSerializer) {
        return new pl.gov.coi.common.network.t0(httpClientFactory, baseUrlProvider, jsonSerializer);
    }

    public final ec0.b h(Context context) {
        return new ec0.c(context);
    }

    public final p00.b i(wy.b networkSessionManager, p00.f interceptorsConfig) {
        return new p00.b(networkSessionManager, interceptorsConfig);
    }

    public final p00.g j(p00.f interceptorsConfig, p00.a blockHttpCleartextInterceptor, p00.b interceptorAuth, p00.e interceptorNetworkConnection, p00.c interceptorDefaultHeaders, p00.i remoteHttpLoggingInterceptor, p00.d interceptorDynamicBaseUrlMock) {
        return new p00.g(interceptorsConfig, blockHttpCleartextInterceptor, interceptorAuth, interceptorNetworkConnection, interceptorDefaultHeaders, remoteHttpLoggingInterceptor, interceptorDynamicBaseUrlMock);
    }

    public final pl.gov.coi.common.network.g0 k(pl.gov.coi.common.network.i0 networkExceptionParser, pl.gov.coi.common.network.l errorPayloadHandler) {
        return new pl.gov.coi.common.network.q(networkExceptionParser, errorPayloadHandler);
    }

    public final wy.b l(eg0.p isUserCertActiveUC, qg0.b checkActivationStateUC, aq.a<wy.d> sessionTokenLoader, ez.a currentTimeProvider) {
        return new rg0.d(isUserCertActiveUC, checkActivationStateUC, sessionTokenLoader, currentTimeProvider);
    }

    public final g4 m() {
        return new g4();
    }

    public final ay.o n(pl.gov.coi.common.network.s httpClientFactory, ay.a baseUrlProvider, ay.k networkConnectionManager, px.d remoteLogger, xw.d dispatcherProvider) {
        return new r00.b(httpClientFactory, baseUrlProvider, remoteLogger, networkConnectionManager, dispatcherProvider);
    }

    public final o10.c o(Context applicationContext, p10.b databaseKeyProvider) {
        return new o10.c(applicationContext, databaseKeyProvider);
    }

    public final p10.f p(Context applicationContext, o10.c databaseFactory, q10.a databaseRegistry) {
        return new p10.f(applicationContext, databaseFactory, databaseRegistry);
    }

    public final wy.d q(qf0.a loadAccessTokenUC) {
        return new rg0.e(loadAccessTokenUC);
    }

    public final h4 r(g4 store) {
        return new i4(store);
    }
}
