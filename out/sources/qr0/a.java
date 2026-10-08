package qr0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\bH\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\bH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010%\u001a\u00020\u000eH\u0007¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010%\u001a\u00020\u0011H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020;2\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020>2\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020A2\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020D2\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020G2\u0006\u0010%\u001a\u00020\u001fH\u0007¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020J2\u0006\u0010%\u001a\u00020\"H\u0007¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020M2\u0006\u0010%\u001a\u00020\"H\u0007¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010%\u001a\u00020\bH\u0007¢\u0006\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lqr0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lrr0/e;", "q", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lrr0/e;", "Lrr0/b;", "a", "(Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/w;)Lrr0/b;", "Lrr0/d;", "c", "(Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/w;)Lrr0/d;", "Lrr0/f;", "r", "(Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/w;)Lrr0/f;", "Ler0/a;", "asyncEndpoints", "Ljx/d;", "deviceInfo", "Lay/o;", "sseManagerFactory", "Lay/j;", "jsonSerializer", "Lrr0/a;", "s", "(Ler0/a;Ljx/d;Lay/o;Lay/j;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/w;)Lrr0/a;", "Lrr0/c;", "b", "(Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/w;)Lrr0/c;", "Lrr0/g;", "v", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lrr0/g;", "repository", "Lkr0/c;", "t", "(Lrr0/e;)Lkr0/c;", "Lkr0/e;", "u", "(Lrr0/e;)Lkr0/e;", "Lkr0/b;", "h", "(Lrr0/b;)Lkr0/b;", "Lkr0/f;", "p", "(Lrr0/d;)Lkr0/f;", "Lkr0/a;", "g", "(Lrr0/f;)Lkr0/a;", "Llr0/b;", "e", "(Lrr0/a;)Llr0/b;", "Llr0/c;", "f", "(Lrr0/a;)Llr0/c;", "Llr0/f;", "l", "(Lrr0/a;)Llr0/f;", "Llr0/g;", "m", "(Lrr0/a;)Llr0/g;", "Llr0/i;", "o", "(Lrr0/a;)Llr0/i;", "Llr0/h;", "n", "(Lrr0/a;)Llr0/h;", "Llr0/d;", "i", "(Lrr0/c;)Llr0/d;", "Llr0/a;", "d", "(Lrr0/g;)Llr0/a;", "Llr0/e;", "k", "(Lrr0/g;)Llr0/e;", "Lkr0/d;", "j", "(Lrr0/e;)Lkr0/d;", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final rr0.b a(g0 networkCallMediator, pl.gov.coi.common.network.w httpServiceFactory) {
        return new pr0.e(httpServiceFactory, networkCallMediator);
    }

    public final rr0.c b(g0 networkCallMediator, pl.gov.coi.common.network.w httpServiceFactory) {
        return new pr0.g(httpServiceFactory, networkCallMediator);
    }

    public final rr0.d c(g0 networkCallMediator, pl.gov.coi.common.network.w httpServiceFactory) {
        return new pr0.i(httpServiceFactory, networkCallMediator);
    }

    public final lr0.a d(rr0.g repository) {
        return new tr0.a(repository);
    }

    public final lr0.b e(rr0.a repository) {
        return new tr0.b(repository);
    }

    public final lr0.c f(rr0.a repository) {
        return new tr0.c(repository);
    }

    public final kr0.a g(rr0.f repository) {
        return new sr0.a(repository);
    }

    public final kr0.b h(rr0.b repository) {
        return new sr0.b(repository);
    }

    public final lr0.d i(rr0.c repository) {
        return new tr0.d(repository);
    }

    public final kr0.d j(rr0.e repository) {
        return new sr0.d(repository);
    }

    public final lr0.e k(rr0.g repository) {
        return new tr0.e(repository);
    }

    public final lr0.f l(rr0.a repository) {
        return new tr0.f(repository);
    }

    public final lr0.g m(rr0.a repository) {
        return new tr0.g(repository);
    }

    public final lr0.h n(rr0.a repository) {
        return new tr0.h(repository);
    }

    public final lr0.i o(rr0.a repository) {
        return new tr0.i(repository);
    }

    public final kr0.f p(rr0.d repository) {
        return new sr0.f(repository);
    }

    public final rr0.e q(pl.gov.coi.common.network.w httpServiceFactory, g0 networkCallMediator) {
        return new pr0.k(httpServiceFactory, networkCallMediator);
    }

    public final rr0.f r(g0 networkCallMediator, pl.gov.coi.common.network.w httpServiceFactory) {
        return new pr0.m(httpServiceFactory, networkCallMediator);
    }

    public final rr0.a s(er0.a asyncEndpoints, jx.d deviceInfo, ay.o sseManagerFactory, ay.j jsonSerializer, g0 networkCallMediator, pl.gov.coi.common.network.w httpServiceFactory) {
        return new pr0.c(asyncEndpoints, deviceInfo, jsonSerializer, networkCallMediator, sseManagerFactory, httpServiceFactory);
    }

    public final kr0.c t(rr0.e repository) {
        return new sr0.c(repository);
    }

    public final kr0.e u(rr0.e repository) {
        return new sr0.e(repository);
    }

    public final rr0.g v(pl.gov.coi.common.network.w httpServiceFactory, g0 networkCallMediator) {
        return new pr0.o(httpServiceFactory, networkCallMediator);
    }
}
