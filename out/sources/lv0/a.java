package lv0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Llv0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lmv0/a;", "d", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lmv0/a;", "repository", "Lgv0/b;", "b", "(Lmv0/a;)Lgv0/b;", "Lnv0/c;", "longPollUC", "Lgv0/a;", "a", "(Lmv0/a;Lnv0/c;)Lgv0/a;", "c", "()Lnv0/c;", "universityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final gv0.a a(mv0.a repository, nv0.c longPollUC) {
        return new nv0.a(repository, longPollUC);
    }

    public final gv0.b b(mv0.a repository) {
        return new nv0.b(repository);
    }

    public final nv0.c c() {
        return new nv0.d();
    }

    public final mv0.a d(w httpServiceFactory, g0 networkCallMediator) {
        return new kv0.b(httpServiceFactory, networkCallMediator);
    }
}
