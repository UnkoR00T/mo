package lm0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\fH\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\fH\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010#\u001a\u00020\u0017H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010#\u001a\u00020\u001dH\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010#\u001a\u00020\u0017H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010#\u001a\u00020\fH\u0007¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010#\u001a\u00020\fH\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010#\u001a\u00020\u001aH\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010#\u001a\u00020 H\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010#\u001a\u00020\u001dH\u0007¢\u0006\u0004\bF\u0010G¨\u0006H"}, d2 = {"Llm0/d1;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lxl0/a;", "adultToRequestMapper", "Lxl0/g;", "idCardApplicationDataToRequestMapper", "Lpm0/d;", "e", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lxl0/a;Lxl0/g;)Lpm0/d;", "Lxl0/n;", "underLegalGuardianshipToRequestMapper", "Lpm0/m;", "b", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lxl0/n;)Lpm0/m;", "Lpm0/f;", "f", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lpm0/f;", "Lpm0/b;", "c", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lpm0/b;", "Lpm0/n;", "r", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lpm0/n;", "Lpm0/c;", "d", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lpm0/c;", "Lpm0/g;", "p", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lpm0/g;", "repository", "Lml0/f;", "i", "(Lpm0/d;)Lml0/f;", "Lml0/g;", "j", "(Lpm0/d;)Lml0/g;", "Lml0/i;", "k", "(Lpm0/m;)Lml0/i;", "Lml0/j;", "l", "(Lpm0/b;)Lml0/j;", "Lml0/k;", "m", "(Lpm0/c;)Lml0/k;", "Lml0/o;", "o", "(Lpm0/b;)Lml0/o;", "Lml0/d;", "g", "(Lpm0/d;)Lml0/d;", "Lml0/y;", "q", "(Lpm0/d;)Lml0/y;", "Lml0/e;", "h", "(Lpm0/m;)Lml0/e;", "Lvl0/a;", "s", "(Lpm0/n;)Lvl0/a;", "Lml0/l;", "n", "(Lpm0/g;)Lml0/l;", "Lml0/b;", "a", "(Lpm0/c;)Lml0/b;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d1 {
    public final ml0.b a(pm0.c repository) {
        return new tm0.b(repository);
    }

    public final pm0.m b(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator, xl0.n underLegalGuardianshipToRequestMapper) {
        return new hm0.d0(httpServiceFactory, networkCallMediator, underLegalGuardianshipToRequestMapper);
    }

    public final pm0.b c(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new hm0.d(httpServiceFactory, networkCallMediator);
    }

    public final pm0.c d(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new hm0.f(httpServiceFactory, networkCallMediator);
    }

    public final pm0.d e(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator, xl0.a adultToRequestMapper, xl0.g idCardApplicationDataToRequestMapper) {
        return new hm0.i(httpServiceFactory, networkCallMediator, adultToRequestMapper, idCardApplicationDataToRequestMapper);
    }

    public final pm0.f f(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new hm0.m(httpServiceFactory, networkCallMediator);
    }

    public final ml0.d g(pm0.d repository) {
        return new tm0.d(repository);
    }

    public final ml0.e h(pm0.m repository) {
        return new tm0.e(repository);
    }

    public final ml0.f i(pm0.d repository) {
        return new tm0.f(repository);
    }

    public final ml0.g j(pm0.d repository) {
        return new tm0.g(repository);
    }

    public final ml0.i k(pm0.m repository) {
        return new tm0.i(repository);
    }

    public final ml0.j l(pm0.b repository) {
        return new tm0.j(repository);
    }

    public final ml0.k m(pm0.c repository) {
        return new tm0.k(repository);
    }

    public final ml0.l n(pm0.g repository) {
        return new tm0.l(repository);
    }

    public final ml0.o o(pm0.b repository) {
        return new tm0.o(repository);
    }

    public final pm0.g p(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new hm0.o(httpServiceFactory, networkCallMediator);
    }

    public final ml0.y q(pm0.d repository) {
        return new tm0.w(repository);
    }

    public final pm0.n r(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new hm0.f0(httpServiceFactory, networkCallMediator);
    }

    public final vl0.a s(pm0.n repository) {
        return new cn0.a(repository);
    }
}
