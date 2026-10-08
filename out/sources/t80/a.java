package t80;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import w80.m;
import w80.n;
import w80.o;
import w80.p;
import w80.q;
import w80.r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lt80/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lv80/a;", "a", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lv80/a;", "repository", "Lw80/c;", "c", "(Lv80/a;)Lw80/c;", "Lw80/a;", "b", "(Lv80/a;)Lw80/a;", "Lv80/b;", "k", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lv80/b;", "Lw80/m;", "h", "(Lv80/b;)Lw80/m;", "Lw80/k;", "g", "(Lv80/b;)Lw80/k;", "Lw80/o;", "i", "(Lv80/b;)Lw80/o;", "Lw80/q;", "j", "(Lv80/b;)Lw80/q;", "Lw80/g;", "e", "(Lv80/b;)Lw80/g;", "Lw80/i;", "f", "(Lv80/b;)Lw80/i;", "Lw80/e;", "d", "(Lv80/b;)Lw80/e;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f188848a = new a();

    private a() {
    }

    public final v80.a a(w httpServiceFactory, g0 networkCallMediator) {
        return new s80.b(httpServiceFactory, networkCallMediator);
    }

    public final w80.a b(v80.a repository) {
        return new w80.b(repository);
    }

    public final w80.c c(v80.a repository) {
        return new w80.d(repository);
    }

    public final w80.e d(v80.b repository) {
        return new w80.f(repository);
    }

    public final w80.g e(v80.b repository) {
        return new w80.h(repository);
    }

    public final w80.i f(v80.b repository) {
        return new w80.j(repository);
    }

    public final w80.k g(v80.b repository) {
        return new w80.l(repository);
    }

    public final m h(v80.b repository) {
        return new n(repository);
    }

    public final o i(v80.b repository) {
        return new p(repository);
    }

    public final q j(v80.b repository) {
        return new r(repository);
    }

    public final v80.b k(w httpServiceFactory, g0 networkCallMediator) {
        return new s80.f(httpServiceFactory, networkCallMediator);
    }
}
