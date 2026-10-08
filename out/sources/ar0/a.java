package ar0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0018H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"Lar0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lbr0/a;", "n", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lbr0/a;", "Lbr0/b;", "p", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lbr0/b;", "repository", "Lvq0/f;", "j", "(Lbr0/a;)Lvq0/f;", "Lvq0/e;", "h", "(Lbr0/a;)Lvq0/e;", "Lvq0/d;", "e", "(Lbr0/a;)Lvq0/d;", "Ldr0/j;", "longPollUC", "Lvq0/c;", "f", "(Lbr0/a;Ldr0/j;)Lvq0/c;", "Lvq0/g;", "l", "(Lbr0/a;)Lvq0/g;", "Lvq0/a;", "b", "(Lbr0/a;)Lvq0/a;", "Lvq0/i;", "m", "(Lbr0/a;)Lvq0/i;", "Luq0/d;", "k", "(Lbr0/b;)Luq0/d;", "Luq0/b;", "d", "(Lbr0/b;)Luq0/b;", "Luq0/a;", "a", "(Lbr0/b;)Luq0/a;", "Luq0/c;", "g", "(Lbr0/b;)Luq0/c;", "o", "()Ldr0/j;", "Lvq0/b;", "c", "(Lbr0/a;)Lvq0/b;", "Lvq0/h;", "i", "(Lbr0/a;Ldr0/j;)Lvq0/h;", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final uq0.a a(br0.b repository) {
        return new cr0.a(repository);
    }

    public final vq0.a b(br0.a repository) {
        return new dr0.a(repository);
    }

    public final vq0.b c(br0.a repository) {
        return new dr0.b(repository);
    }

    public final uq0.b d(br0.b repository) {
        return new cr0.b(repository);
    }

    public final vq0.d e(br0.a repository) {
        return new dr0.d(repository);
    }

    public final vq0.c f(br0.a repository, dr0.j longPollUC) {
        return new dr0.c(repository, longPollUC);
    }

    public final uq0.c g(br0.b repository) {
        return new cr0.c(repository);
    }

    public final vq0.e h(br0.a repository) {
        return new dr0.e(repository);
    }

    public final vq0.h i(br0.a repository, dr0.j longPollUC) {
        return new dr0.h(repository, longPollUC);
    }

    public final vq0.f j(br0.a repository) {
        return new dr0.f(repository);
    }

    public final uq0.d k(br0.b repository) {
        return new cr0.d(repository);
    }

    public final vq0.g l(br0.a repository) {
        return new dr0.g(repository);
    }

    public final vq0.i m(br0.a repository) {
        return new dr0.i(repository);
    }

    public final br0.a n(w httpServiceFactory, g0 networkCallMediator) {
        return new zq0.d(httpServiceFactory, networkCallMediator);
    }

    public final dr0.j o() {
        return new dr0.k();
    }

    public final br0.b p(w httpServiceFactory, g0 networkCallMediator) {
        return new zq0.g(httpServiceFactory, networkCallMediator);
    }
}
