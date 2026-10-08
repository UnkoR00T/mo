package p64;

import android.content.Context;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.mobile.data.storage.GlobalSearchDatabase;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\"H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020A2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020D2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020G2\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020J2\u0006\u00105\u001a\u00020\"H\u0007¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020M2\u0006\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\bN\u0010OJ\u0019\u0010S\u001a\u00020R2\b\b\u0001\u0010Q\u001a\u00020PH\u0007¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020V2\u0006\u0010U\u001a\u00020RH\u0007¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020Y2\u0006\u0010U\u001a\u00020RH\u0007¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\\2\u0006\u0010U\u001a\u00020RH\u0007¢\u0006\u0004\b]\u0010^J7\u0010e\u001a\u00020d2\u0006\u0010_\u001a\u00020Y2\u0006\u0010`\u001a\u00020V2\u0006\u0010a\u001a\u00020\\2\u0006\u0010c\u001a\u00020b2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\be\u0010fJ'\u0010m\u001a\u00020l2\u0006\u0010g\u001a\u00020d2\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020jH\u0007¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020o2\u0006\u0010g\u001a\u00020dH\u0007¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020r2\u0006\u0010g\u001a\u00020dH\u0007¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020u2\u0006\u0010g\u001a\u00020dH\u0007¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020x2\u0006\u0010g\u001a\u00020dH\u0007¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020{2\u0006\u0010g\u001a\u00020dH\u0007¢\u0006\u0004\b|\u0010}J\u0018\u0010\u007f\u001a\u00020~2\u0006\u0010g\u001a\u00020dH\u0007¢\u0006\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0081\u0001"}, d2 = {"Lp64/a;", "", "<init>", "()V", "Lh64/e;", "getFeatureFlagListUseCase", "Ls64/n;", "p", "(Lh64/e;)Ls64/n;", "Ls64/p;", "q", "(Lh64/e;)Ls64/p;", "Lq64/b;", "z", "()Lq64/b;", "Ljq0/e;", "bEGetRemoteSettingUseCase", "settingsHolder", "Lh64/q;", "u", "(Ljq0/e;Lq64/b;)Lh64/q;", "remoteSettingsLocalRepository", "Lh64/r;", "v", "(Lq64/b;)Lh64/r;", "loadRemoteSettingsUseCase", "loadServicesUseCase", "Lwy/b;", "networkSessionManager", "Lh64/u;", "y", "(Lh64/q;Lh64/r;Lwy/b;)Lh64/u;", "Lez/a;", "currentTimeProvider", "Lq64/c;", "E", "(Lez/a;)Lq64/c;", "e", "(Lq64/b;)Lh64/e;", "Lh64/d;", "d", "(Lq64/b;)Lh64/d;", "Lh64/i;", "i", "(Lq64/b;)Lh64/i;", "Lh64/p;", "t", "(Lq64/b;)Lh64/p;", "Lh64/o;", "s", "(Lq64/b;)Lh64/o;", "Ljq0/f;", "beGetTrustedCertificatesUseCase", "trustedCertificatesCache", "Lh64/l;", "l", "(Ljq0/f;Lq64/c;)Lh64/l;", "Ly04/a;", "buildConfigRepository", "cache", "Lh64/m;", "m", "(Ly04/a;Lq64/c;)Lh64/m;", "Lac4/d;", "getCurrentServerTimeUseCase", "Lh64/j;", "j", "(Lq64/b;Lac4/d;)Lh64/j;", "Lh64/f;", "f", "(Lq64/b;Lac4/d;)Lh64/f;", "Lh64/n;", "r", "(Lq64/b;)Lh64/n;", "Lh64/a;", "a", "(Lq64/c;)Lh64/a;", "Lh64/k;", "k", "(Lq64/b;)Lh64/k;", "Landroid/content/Context;", "context", "Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase;", "n", "(Landroid/content/Context;)Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase;", "database", "Lm64/f;", "C", "(Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase;)Lm64/f;", "Lm64/k;", ip.a.f96138c, "(Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase;)Lm64/k;", "Lm64/a;", "B", "(Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase;)Lm64/a;", "searchTagsDao", "searchSectionsDao", "searchEntriesDao", "Ljx/g;", "systemInfo", "Lr64/a;", "o", "(Lm64/k;Lm64/f;Lm64/a;Ljx/g;Lez/a;)Lr64/a;", "globalSearchRepository", "Ljq0/c;", "beGetGlobalSearchConfigUC", "Ljq0/d;", "beGetGlobalSearchTagsUC", "Lh64/g;", "g", "(Lr64/a;Ljq0/c;Ljq0/d;)Lh64/g;", "Lh64/v;", "A", "(Lr64/a;)Lh64/v;", "Lh64/s;", "w", "(Lr64/a;)Lh64/s;", "Lh64/b;", "b", "(Lr64/a;)Lh64/b;", "Lh64/t;", "x", "(Lr64/a;)Lh64/t;", "Lh64/h;", "h", "(Lr64/a;)Lh64/h;", "Lh64/c;", "c", "(Lr64/a;)Lh64/c;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final h64.v A(r64.a globalSearchRepository) {
        return new s64.z(globalSearchRepository);
    }

    public final m64.a B(GlobalSearchDatabase database) {
        return database.a0();
    }

    public final m64.f C(GlobalSearchDatabase database) {
        return database.b0();
    }

    public final m64.k D(GlobalSearchDatabase database) {
        return database.c0();
    }

    public final q64.c E(ez.a currentTimeProvider) {
        return new j64.c(currentTimeProvider);
    }

    public final h64.a a(q64.c trustedCertificatesCache) {
        return new s64.a(trustedCertificatesCache);
    }

    public final h64.b b(r64.a globalSearchRepository) {
        return new s64.b(globalSearchRepository);
    }

    public final h64.c c(r64.a globalSearchRepository) {
        return new s64.c(globalSearchRepository);
    }

    public final h64.d d(q64.b remoteSettingsLocalRepository) {
        return new s64.d(remoteSettingsLocalRepository);
    }

    public final h64.e e(q64.b remoteSettingsLocalRepository) {
        return new s64.e(remoteSettingsLocalRepository);
    }

    public final h64.f f(q64.b remoteSettingsLocalRepository, ac4.d getCurrentServerTimeUseCase) {
        return new s64.f(remoteSettingsLocalRepository, getCurrentServerTimeUseCase);
    }

    public final h64.g g(r64.a globalSearchRepository, jq0.c beGetGlobalSearchConfigUC, jq0.d beGetGlobalSearchTagsUC) {
        return new s64.g(globalSearchRepository, beGetGlobalSearchConfigUC, beGetGlobalSearchTagsUC);
    }

    public final h64.h h(r64.a globalSearchRepository) {
        return new s64.h(globalSearchRepository);
    }

    public final h64.i i(q64.b remoteSettingsLocalRepository) {
        return new s64.i(remoteSettingsLocalRepository);
    }

    public final h64.j j(q64.b remoteSettingsLocalRepository, ac4.d getCurrentServerTimeUseCase) {
        return new s64.j(remoteSettingsLocalRepository, getCurrentServerTimeUseCase);
    }

    public final h64.k k(q64.b remoteSettingsLocalRepository) {
        return new s64.k(remoteSettingsLocalRepository);
    }

    public final h64.l l(jq0.f beGetTrustedCertificatesUseCase, q64.c trustedCertificatesCache) {
        return new s64.l(beGetTrustedCertificatesUseCase, trustedCertificatesCache);
    }

    public final h64.m m(y04.a buildConfigRepository, q64.c cache) {
        return new s64.m(buildConfigRepository, cache);
    }

    public final GlobalSearchDatabase n(Context context) {
        return (GlobalSearchDatabase) oa.n.a(context, GlobalSearchDatabase.class, GlobalSearchDatabase.INSTANCE.a()).e();
    }

    public final r64.a o(m64.k searchTagsDao, m64.f searchSectionsDao, m64.a searchEntriesDao, jx.g systemInfo, ez.a currentTimeProvider) {
        return new k64.f(searchTagsDao, searchSectionsDao, searchEntriesDao, systemInfo, currentTimeProvider);
    }

    public final s64.n p(h64.e getFeatureFlagListUseCase) {
        return new s64.o(getFeatureFlagListUseCase);
    }

    public final s64.p q(h64.e getFeatureFlagListUseCase) {
        return new s64.q(getFeatureFlagListUseCase);
    }

    public final h64.n r(q64.b remoteSettingsLocalRepository) {
        return new s64.r(remoteSettingsLocalRepository);
    }

    public final h64.o s(q64.b remoteSettingsLocalRepository) {
        return new s64.s(remoteSettingsLocalRepository);
    }

    public final h64.p t(q64.b remoteSettingsLocalRepository) {
        return new s64.t(remoteSettingsLocalRepository);
    }

    public final h64.q u(jq0.e bEGetRemoteSettingUseCase, q64.b settingsHolder) {
        return new s64.u(bEGetRemoteSettingUseCase, settingsHolder);
    }

    public final h64.r v(q64.b remoteSettingsLocalRepository) {
        return new s64.v(remoteSettingsLocalRepository);
    }

    public final h64.s w(r64.a globalSearchRepository) {
        return new s64.w(globalSearchRepository);
    }

    public final h64.t x(r64.a globalSearchRepository) {
        return new s64.x(globalSearchRepository);
    }

    public final h64.u y(h64.q loadRemoteSettingsUseCase, h64.r loadServicesUseCase, wy.b networkSessionManager) {
        return new s64.y(loadRemoteSettingsUseCase, loadServicesUseCase, networkSessionManager);
    }

    public final q64.b z() {
        return new j64.a();
    }
}
