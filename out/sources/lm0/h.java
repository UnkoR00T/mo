package lm0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Llm0/h;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/a;", "currentTimeProvider", "Lpm0/j;", "l", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/a;)Lpm0/j;", "repository", "Lol0/h;", "h", "(Lpm0/j;)Lol0/h;", "Lol0/g;", "a", "(Lpm0/j;)Lol0/g;", "Lol0/f;", "g", "(Lpm0/j;)Lol0/f;", "Lol0/k;", "k", "(Lpm0/j;)Lol0/k;", "Lol0/j;", "j", "(Lpm0/j;)Lol0/j;", "Lol0/l;", "m", "(Lpm0/j;)Lol0/l;", "Lol0/e;", "f", "(Lpm0/j;)Lol0/e;", "Lol0/b;", "c", "(Lpm0/j;)Lol0/b;", "Lol0/c;", "d", "(Lpm0/j;)Lol0/c;", "Lol0/d;", "e", "(Lpm0/j;)Lol0/d;", "Lol0/a;", "b", "(Lpm0/j;)Lol0/a;", "Lol0/i;", "i", "(Lpm0/j;)Lol0/i;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {
    public final ol0.g a(pm0.j repository) {
        return new vm0.g(repository);
    }

    public final ol0.a b(pm0.j repository) {
        return new vm0.a(repository);
    }

    public final ol0.b c(pm0.j repository) {
        return new vm0.b(repository);
    }

    public final ol0.c d(pm0.j repository) {
        return new vm0.c(repository);
    }

    public final ol0.d e(pm0.j repository) {
        return new vm0.d(repository);
    }

    public final ol0.e f(pm0.j repository) {
        return new vm0.e(repository);
    }

    public final ol0.f g(pm0.j repository) {
        return new vm0.f(repository);
    }

    public final ol0.h h(pm0.j repository) {
        return new vm0.h(repository);
    }

    public final ol0.i i(pm0.j repository) {
        return new vm0.i(repository);
    }

    public final ol0.j j(pm0.j repository) {
        return new vm0.j(repository);
    }

    public final ol0.k k(pm0.j repository) {
        return new vm0.l(repository);
    }

    public final pm0.j l(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator, ez.a currentTimeProvider) {
        return new hm0.v(httpServiceFactory, networkCallMediator, currentTimeProvider);
    }

    public final ol0.l m(pm0.j repository) {
        return new vm0.k(repository);
    }
}
