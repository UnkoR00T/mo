package o80;

import ay.j;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lo80/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lay/j;", "jsonSerializer", "Liy/j;", "cmsManager", "Lp80/a;", "a", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lay/j;Liy/j;)Lp80/a;", "repository", "Ll80/a;", "b", "(Lp80/a;)Ll80/a;", "Ll80/b;", "c", "(Lp80/a;)Ll80/b;", "Ll80/d;", "e", "(Lp80/a;)Ll80/d;", "Ll80/c;", "d", "(Lp80/a;)Ll80/c;", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f143247a = new a();

    private a() {
    }

    public final p80.a a(w httpServiceFactory, g0 networkCallMediator, j jsonSerializer, iy.j cmsManager) {
        return new n80.d(httpServiceFactory, networkCallMediator, jsonSerializer, cmsManager);
    }

    public final l80.a b(p80.a repository) {
        return new q80.a(repository);
    }

    public final l80.b c(p80.a repository) {
        return new q80.b(repository);
    }

    public final l80.c d(p80.a repository) {
        return new q80.c(repository);
    }

    public final l80.d e(p80.a repository) {
        return new q80.d(repository);
    }
}
