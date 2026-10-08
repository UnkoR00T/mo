package f61;

import l61.j;
import l61.k;
import l61.l;
import l61.v;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lf61/a;", "", "<init>", "()V", "Lcz/a;", "dataStorePreferencesStorage", "Le61/b;", "b", "(Lcz/a;)Le61/b;", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "Lq10/a;", "databaseRegistry", "Lp10/f;", "dbProvider", "Lay/h;", "jsonFactory", "Lpx/d;", "remoteLogger", "Lk61/b;", "e", "(Liy/a;Lay/j;Lq10/a;Lp10/f;Lay/h;Lpx/d;)Lk61/b;", "repository", "Lh61/a;", "childPassportApplicationContainersInteractor", "Ll61/v;", "g", "(Lk61/b;Lh61/a;)Ll61/v;", "Ll61/l;", "f", "(Lk61/b;Lh61/a;)Ll61/l;", "Lz04/a;", "fileStorageRepository", "getChildPassportApplicationDraftUC", "Ll61/k;", "d", "(Lz04/a;Lk61/b;Ll61/l;Lh61/a;)Ll61/k;", "Ly51/a;", "c", "(Le61/b;)Ly51/a;", "Lk61/a;", "a", "()Lk61/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final k61.a a() {
        return new e61.a();
    }

    public final e61.b b(cz.a dataStorePreferencesStorage) {
        return new e61.b(dataStorePreferencesStorage);
    }

    public final y51.a c(e61.b repository) {
        return new j(repository);
    }

    public final k d(z04.a fileStorageRepository, k61.b repository, l getChildPassportApplicationDraftUC, h61.a childPassportApplicationContainersInteractor) {
        return new k(fileStorageRepository, repository, getChildPassportApplicationDraftUC, childPassportApplicationContainersInteractor);
    }

    public final k61.b e(iy.a base64Coder, ay.j jsonSerializer, q10.a databaseRegistry, p10.f dbProvider, ay.h jsonFactory, px.d remoteLogger) {
        return new e61.c(base64Coder, jsonSerializer, dbProvider, databaseRegistry, remoteLogger, jsonFactory);
    }

    public final l f(k61.b repository, h61.a childPassportApplicationContainersInteractor) {
        return new l(repository, childPassportApplicationContainersInteractor);
    }

    public final v g(k61.b repository, h61.a childPassportApplicationContainersInteractor) {
        return new v(repository, childPassportApplicationContainersInteractor);
    }
}
