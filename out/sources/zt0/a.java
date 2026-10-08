package zt0;

import ay.h;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.serializer.ZonedDateTimeSerializer;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lzt0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/a;", "currentTimeProvider", "Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;", "zonedDateTimeSerializer", "Lay/h;", "jsonFactory", "Lau0/a;", "f", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/a;Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;Lay/h;)Lau0/a;", "repository", "Lut0/b;", "d", "(Lau0/a;)Lut0/b;", "Lut0/c;", "e", "(Lau0/a;)Lut0/c;", "Lut0/e;", "c", "(Lau0/a;)Lut0/e;", "Lut0/a;", "a", "(Lau0/a;)Lut0/a;", "Lut0/d;", "b", "(Lau0/a;)Lut0/d;", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final ut0.a a(au0.a repository) {
        return new bu0.a(repository);
    }

    public final ut0.d b(au0.a repository) {
        return new bu0.d(repository);
    }

    public final ut0.e c(au0.a repository) {
        return new bu0.e(repository);
    }

    public final ut0.b d(au0.a repository) {
        return new bu0.b(repository);
    }

    public final ut0.c e(au0.a repository) {
        return new bu0.c(repository);
    }

    public final au0.a f(w httpServiceFactory, g0 networkCallMediator, ez.a currentTimeProvider, ZonedDateTimeSerializer zonedDateTimeSerializer, h jsonFactory) {
        return new yt0.c(httpServiceFactory, networkCallMediator, currentTimeProvider, zonedDateTimeSerializer, jsonFactory);
    }
}
