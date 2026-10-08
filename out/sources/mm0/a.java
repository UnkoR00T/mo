package mm0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import xl0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmm0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lxl0/l;", "pickedFileToFileV4DtoMapper", "Lqm0/a;", "e", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lxl0/l;)Lqm0/a;", "repository", "Lrl0/a;", "a", "(Lqm0/a;)Lrl0/a;", "Lrl0/c;", "c", "(Lqm0/a;)Lrl0/c;", "Lrl0/b;", "b", "(Lqm0/a;)Lrl0/b;", "Lrl0/d;", "d", "(Lqm0/a;)Lrl0/d;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final rl0.a a(qm0.a repository) {
        return new ym0.a(repository);
    }

    public final rl0.b b(qm0.a repository) {
        return new ym0.b(repository);
    }

    public final rl0.c c(qm0.a repository) {
        return new ym0.c(repository);
    }

    public final rl0.d d(qm0.a repository) {
        return new ym0.d(repository);
    }

    public final qm0.a e(w httpServiceFactory, g0 networkCallMediator, l pickedFileToFileV4DtoMapper) {
        return new im0.d(httpServiceFactory, networkCallMediator, pickedFileToFileV4DtoMapper);
    }
}
