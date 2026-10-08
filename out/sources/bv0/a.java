package bv0;

import ev0.n;
import ev0.o;
import ev0.p;
import ev0.q;
import ev0.r;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lbv0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Ldv0/b;", "j", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ldv0/b;", "Ldv0/a;", "d", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ldv0/a;", "repository", "Lev0/k;", "b", "(Ldv0/b;)Lev0/k;", "Ldv0/c;", "k", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ldv0/c;", "Lev0/q;", "h", "(Ldv0/b;)Lev0/q;", "Lev0/i;", "a", "(Ldv0/b;)Lev0/i;", "Lev0/o;", "f", "(Ldv0/c;)Lev0/o;", "Lev0/m;", "l", "(Ldv0/b;)Lev0/m;", "Lev0/e;", "g", "(Ldv0/c;)Lev0/e;", "Lev0/a;", "c", "(Ldv0/c;)Lev0/a;", "Lev0/c;", "e", "(Ldv0/b;)Lev0/c;", "Lev0/g;", "i", "(Ldv0/a;)Lev0/g;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final ev0.i a(dv0.b repository) {
        return new ev0.j(repository);
    }

    public final ev0.k b(dv0.b repository) {
        return new ev0.l(repository);
    }

    public final ev0.a c(dv0.c repository) {
        return new ev0.b(repository);
    }

    public final dv0.a d(w httpServiceFactory, g0 networkCallMediator) {
        return new av0.b(httpServiceFactory, networkCallMediator);
    }

    public final ev0.c e(dv0.b repository) {
        return new ev0.d(repository);
    }

    public final o f(dv0.c repository) {
        return new p(repository);
    }

    public final ev0.e g(dv0.c repository) {
        return new ev0.f(repository);
    }

    public final q h(dv0.b repository) {
        return new r(repository);
    }

    public final ev0.g i(dv0.a repository) {
        return new ev0.h(repository);
    }

    public final dv0.b j(w httpServiceFactory, g0 networkCallMediator) {
        return new av0.d(httpServiceFactory, networkCallMediator);
    }

    public final dv0.c k(w httpServiceFactory, g0 networkCallMediator) {
        return new av0.f(httpServiceFactory, networkCallMediator);
    }

    public final ev0.m l(dv0.b repository) {
        return new n(repository);
    }
}
