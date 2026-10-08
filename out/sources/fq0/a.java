package fq0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.serializer.ZonedDateTimeSerializer;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\"2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b4\u00105¨\u00066"}, d2 = {"Lfq0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lgq0/a;", "h", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Lgq0/a;", "Lez/a;", "currentTimeProvider", "Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;", "zonedDateTimeSerializer", "Lay/h;", "jsonFactory", "Lez/c;", "dateConverter", "Lgq0/b;", "k", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/a;Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;Lay/h;Lez/c;)Lgq0/b;", "repository", "Laq0/d;", "d", "(Lgq0/a;)Laq0/d;", "Laq0/a;", "a", "(Lgq0/a;)Laq0/a;", "Lhq0/h;", "signRegisterForDefenceTrainingUC", "Laq0/e;", "e", "(Lhq0/h;Lgq0/a;)Laq0/e;", "Lhq0/j;", "signUnregisterForDefenceTrainingUC", "Laq0/g;", "g", "(Lhq0/j;Lgq0/a;)Laq0/g;", "Lay/j;", "jsonSerializer", "i", "(Lay/j;)Lhq0/h;", "j", "(Lay/j;)Lhq0/j;", "Laq0/b;", "b", "(Lgq0/b;)Laq0/b;", "Laq0/c;", "c", "(Lgq0/b;)Laq0/c;", "Laq0/f;", "f", "(Lgq0/b;)Laq0/f;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final aq0.a a(gq0.a repository) {
        return new hq0.a(repository);
    }

    public final aq0.b b(gq0.b repository) {
        return new hq0.b(repository);
    }

    public final aq0.c c(gq0.b repository) {
        return new hq0.c(repository);
    }

    public final aq0.d d(gq0.a repository) {
        return new hq0.d(repository);
    }

    public final aq0.e e(hq0.h signRegisterForDefenceTrainingUC, gq0.a repository) {
        return new hq0.e(signRegisterForDefenceTrainingUC, repository);
    }

    public final aq0.f f(gq0.b repository) {
        return new hq0.f(repository);
    }

    public final aq0.g g(hq0.j signUnregisterForDefenceTrainingUC, gq0.a repository) {
        return new hq0.g(signUnregisterForDefenceTrainingUC, repository);
    }

    public final gq0.a h(w httpServiceFactory, g0 networkCallMediator) {
        return new eq0.b(httpServiceFactory, networkCallMediator);
    }

    public final hq0.h i(ay.j jsonSerializer) {
        return new hq0.i(jsonSerializer);
    }

    public final hq0.j j(ay.j jsonSerializer) {
        return new hq0.k(jsonSerializer);
    }

    public final gq0.b k(w httpServiceFactory, g0 networkCallMediator, ez.a currentTimeProvider, ZonedDateTimeSerializer zonedDateTimeSerializer, ay.h jsonFactory, ez.c dateConverter) {
        return new eq0.d(httpServiceFactory, currentTimeProvider, networkCallMediator, dateConverter, zonedDateTimeSerializer, jsonFactory);
    }
}
