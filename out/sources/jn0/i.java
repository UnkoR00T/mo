package jn0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljn0/i;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/a;", "base64Coder", "Lkn0/c;", "c", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/a;)Lkn0/c;", "repository", "Len0/a;", "a", "(Lkn0/c;)Len0/a;", "Len0/f;", "b", "(Lkn0/c;)Len0/f;", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f103779a = new i();

    private i() {
    }

    public final en0.a a(kn0.c repository) {
        return new ln0.a(repository);
    }

    public final en0.f b(kn0.c repository) {
        return new ln0.f(repository);
    }

    public final kn0.c c(w httpServiceFactory, g0 networkCallMediator, iy.a base64Coder) {
        return new in0.f(httpServiceFactory, networkCallMediator, base64Coder);
    }
}
