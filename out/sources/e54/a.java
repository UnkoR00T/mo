package e54;

import iy.y;
import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Le54/a;", "", "<init>", "()V", "Ly04/a;", "buildConfigRepository", "Lf54/a;", "featureFlagLocalDataSource", "Lf54/b;", "b", "(Ly04/a;Lf54/a;)Lf54/b;", "Lt10/k;", "sharedPreferencesFactory", "a", "(Lt10/k;)Lf54/a;", "featureFlagRepository", "Lc54/a;", "c", "(Lf54/b;)Lc54/a;", "Lh64/e;", "getFeatureFlagListUseCase", "Lc54/b;", "d", "(Ly04/a;Lf54/b;Lh64/e;)Lc54/b;", "Liy/y;", "secureWindow", "Lc54/c;", "e", "(Lf54/b;Liy/y;)Lc54/c;", "flags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final f54.a a(k sharedPreferencesFactory) {
        return new d54.b(sharedPreferencesFactory, b54.c.w());
    }

    public final f54.b b(y04.a buildConfigRepository, f54.a featureFlagLocalDataSource) {
        return new f54.b(buildConfigRepository, b54.c.w(), featureFlagLocalDataSource);
    }

    public final c54.a c(f54.b featureFlagRepository) {
        return new g54.a(featureFlagRepository);
    }

    public final c54.b d(y04.a buildConfigRepository, f54.b featureFlagRepository, h64.e getFeatureFlagListUseCase) {
        return new g54.e(buildConfigRepository, featureFlagRepository, getFeatureFlagListUseCase);
    }

    public final c54.c e(f54.b featureFlagRepository, y secureWindow) {
        return new g54.f(featureFlagRepository, secureWindow);
    }
}
