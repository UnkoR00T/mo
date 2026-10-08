package b90;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lb90/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lc90/a;", "a", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lc90/a;", "Lc90/b;", "b", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lc90/b;", "Lc90/d;", "f", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lc90/d;", "repository", "Ly80/c;", "g", "(Lc90/a;)Ly80/c;", "Ly80/a;", "e", "(Lc90/b;)Ly80/a;", "Ly80/d;", "h", "(Lc90/d;)Ly80/d;", "Lc90/c;", "d", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lc90/c;", "Ly80/b;", "c", "(Lc90/c;)Ly80/b;", "juniorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17598a = new a();

    private a() {
    }

    public final c90.a a(w httpServiceFactory, g0 networkCallMediator) {
        return new a90.b(httpServiceFactory, networkCallMediator);
    }

    public final c90.b b(w httpServiceFactory, g0 networkCallMediator) {
        return new a90.d(httpServiceFactory, networkCallMediator);
    }

    public final y80.b c(c90.c repository) {
        return new d90.b(repository);
    }

    public final c90.c d(w httpServiceFactory, g0 networkCallMediator) {
        return new a90.f(httpServiceFactory, networkCallMediator);
    }

    public final y80.a e(c90.b repository) {
        return new d90.a(repository);
    }

    public final c90.d f(w httpServiceFactory, g0 networkCallMediator) {
        return new a90.h(httpServiceFactory, networkCallMediator);
    }

    public final y80.c g(c90.a repository) {
        return new d90.c(repository);
    }

    public final y80.d h(c90.d repository) {
        return new d90.d(repository);
    }
}
