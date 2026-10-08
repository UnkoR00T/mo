package lm0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Llm0/n0;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/a;", "currentTimeProvider", "Lay/j;", "jsonSerializer", "Lpm0/i;", "f", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/a;Lay/j;)Lpm0/i;", "repository", "Ltl0/e;", "d", "(Lpm0/i;)Ltl0/e;", "Ltl0/h;", "h", "(Lpm0/i;)Ltl0/h;", "Ltl0/c;", "a", "(Lpm0/i;)Ltl0/c;", "Ltl0/g;", "g", "(Lpm0/i;)Ltl0/g;", "passportAgreementRepository", "Ltl0/d;", "b", "(Lpm0/i;)Ltl0/d;", "Ltl0/f;", "e", "(Lpm0/i;)Ltl0/f;", "Ltl0/a;", "c", "(Lpm0/i;)Ltl0/a;", "Ltl0/b;", "i", "(Lpm0/i;)Ltl0/b;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 {
    public final tl0.c a(pm0.i repository) {
        return new an0.c(repository);
    }

    public final tl0.d b(pm0.i passportAgreementRepository) {
        return new an0.d(passportAgreementRepository);
    }

    public final tl0.a c(pm0.i passportAgreementRepository) {
        return new an0.a(passportAgreementRepository);
    }

    public final tl0.e d(pm0.i repository) {
        return new an0.e(repository);
    }

    public final tl0.f e(pm0.i passportAgreementRepository) {
        return new an0.f(passportAgreementRepository);
    }

    public final pm0.i f(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator, ez.a currentTimeProvider, ay.j jsonSerializer) {
        return new hm0.t(httpServiceFactory, networkCallMediator, currentTimeProvider, jsonSerializer);
    }

    public final tl0.g g(pm0.i repository) {
        return new an0.g(repository);
    }

    public final tl0.h h(pm0.i repository) {
        return new an0.h(repository);
    }

    public final tl0.b i(pm0.i passportAgreementRepository) {
        return new an0.b(passportAgreementRepository);
    }
}
