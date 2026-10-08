package ao0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lao0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lco0/a;", "a", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lco0/a;", "repository", "Lvn0/b;", "c", "(Lco0/a;)Lvn0/b;", "Lvn0/a;", "b", "(Lco0/a;)Lvn0/a;", "Lvn0/c;", "d", "(Lco0/a;)Lvn0/c;", "electoralsupportservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13953a = new a();

    private a() {
    }

    public final co0.a a(w httpServiceFactory, g0 networkCallMediator) {
        return new zn0.b(httpServiceFactory, networkCallMediator);
    }

    public final vn0.a b(co0.a repository) {
        return new do0.a(repository);
    }

    public final vn0.b c(co0.a repository) {
        return new do0.b(repository);
    }

    public final vn0.c d(co0.a repository) {
        return new do0.c(repository);
    }
}
