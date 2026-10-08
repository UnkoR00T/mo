package zs0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.serializer.ZonedDateTimeSerializer;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lzs0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lay/h;", "jsonFactory", "Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;", "zonedDateTimeSerializer", "Lat0/a;", "j", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lay/h;Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;)Lat0/a;", "Lat0/b;", "k", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lat0/b;", "Lat0/c;", "l", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lat0/c;", "repository", "Lus0/b;", "b", "(Lat0/a;)Lus0/b;", "Lus0/a;", "a", "(Lat0/a;)Lus0/a;", "Lus0/c;", "c", "(Lat0/a;)Lus0/c;", "Lus0/f;", "f", "(Lat0/a;)Lus0/f;", "Lus0/d;", "d", "(Lat0/b;)Lus0/d;", "Lus0/e;", "e", "(Lat0/b;)Lus0/e;", "Lus0/g;", "g", "(Lat0/b;)Lus0/g;", "Lus0/h;", "h", "(Lat0/b;)Lus0/h;", "Lus0/i;", "i", "(Lat0/c;)Lus0/i;", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final us0.a a(at0.a repository) {
        return new bt0.a(repository);
    }

    public final us0.b b(at0.a repository) {
        return new bt0.b(repository);
    }

    public final us0.c c(at0.a repository) {
        return new bt0.c(repository);
    }

    public final us0.d d(at0.b repository) {
        return new bt0.d(repository);
    }

    public final us0.e e(at0.b repository) {
        return new bt0.e(repository);
    }

    public final us0.f f(at0.a repository) {
        return new bt0.f(repository);
    }

    public final us0.g g(at0.b repository) {
        return new bt0.g(repository);
    }

    public final us0.h h(at0.b repository) {
        return new bt0.h(repository);
    }

    public final us0.i i(at0.c repository) {
        return new bt0.i(repository);
    }

    public final at0.a j(w httpServiceFactory, g0 networkCallMediator, ay.h jsonFactory, ZonedDateTimeSerializer zonedDateTimeSerializer) {
        return new ys0.b(httpServiceFactory, networkCallMediator, jsonFactory.c(OffsetDateTime.class, zonedDateTimeSerializer));
    }

    public final at0.b k(w httpServiceFactory, g0 networkCallMediator) {
        return new ys0.d(httpServiceFactory, networkCallMediator);
    }

    public final at0.c l(w httpServiceFactory, g0 networkCallMediator) {
        return new ys0.f(httpServiceFactory, networkCallMediator);
    }
}
