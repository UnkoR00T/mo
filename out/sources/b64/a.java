package b64;

import android.content.Context;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.localnotifications.data.db.LocalNotificationsDatabase;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u00020+2\b\b\u0001\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020+H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020%2\u0006\u0010.\u001a\u00020+H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b=\u0010>J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020AH\u0007¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020H2\u0006\u0010D\u001a\u00020AH\u0007¢\u0006\u0004\bI\u0010JJG\u0010V\u001a\u00020U2\u0006\u0010L\u001a\u00020K2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020SH\u0007¢\u0006\u0004\bV\u0010WJG\u0010Y\u001a\u00020X2\u0006\u0010L\u001a\u00020K2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020SH\u0007¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020[2\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020M2\u0006\u0010^\u001a\u00020[H\u0007¢\u0006\u0004\b_\u0010`J\u001f\u0010c\u001a\u00020\f2\u0006\u0010b\u001a\u00020a2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020e2\u0006\u0010^\u001a\u00020[H\u0007¢\u0006\u0004\bf\u0010g¨\u0006h"}, d2 = {"Lb64/a;", "", "<init>", "()V", "Ls54/m;", "setNotificationsForDocumentUseCase", "Ls54/n;", "setNotificationsForVehiclesUseCase", "Ls54/g;", "removeNotificationsForDocumentUseCase", "Ls54/h;", "removeNotificationsForSubDocumentUseCase", "Ls54/d;", "provideVehiclesToLocalNotificationUseCase", "Lpx/d;", "remoteLogger", "Lc64/a;", "localNotificationsContainersInteractor", "Ls54/k;", "q", "(Ls54/m;Ls54/n;Ls54/g;Ls54/h;Ls54/d;Lpx/d;Lc64/a;)Ls54/k;", "Le64/b;", "localNotificationsRepository", "t", "(Le64/b;)Ls54/n;", "s", "(Le64/b;)Ls54/m;", "Lf64/g;", "removeAllNotificationsForVehicleUseCase", "m", "(Le64/b;Lf64/g;Lpx/d;Lc64/a;)Ls54/g;", "n", "(Le64/b;)Ls54/h;", "l", "(Le64/b;)Lf64/g;", "Lw54/a;", "documentsDao", "Lw54/k;", "vehiclesDao", "i", "(Lw54/a;Lw54/k;)Le64/b;", "Landroid/content/Context;", "context", "Lpl/gov/coi/mobywatel/technical/localnotifications/data/db/LocalNotificationsDatabase;", "g", "(Landroid/content/Context;)Lpl/gov/coi/mobywatel/technical/localnotifications/data/db/LocalNotificationsDatabase;", "database", "f", "(Lpl/gov/coi/mobywatel/technical/localnotifications/data/db/LocalNotificationsDatabase;)Lw54/a;", "j", "(Lpl/gov/coi/mobywatel/technical/localnotifications/data/db/LocalNotificationsDatabase;)Lw54/k;", "Ls54/f;", "k", "(Le64/b;)Ls54/f;", "Ls54/b;", "b", "(Le64/b;)Ls54/b;", "Ls54/c;", "c", "(Le64/b;)Ls54/c;", "Ls54/i;", "o", "(Le64/b;)Ls54/i;", "Lt10/k;", "sharedPreferencesFactory", "Le64/a;", "h", "(Lt10/k;)Le64/a;", "localNotificationsMigrationDataSource", "Ls54/e;", "e", "(Le64/a;)Ls54/e;", "Ls54/l;", "r", "(Le64/a;)Ls54/l;", "Lq54/a;", "localNotificationManager", "Ls54/a;", "areDocumentNotificationSettingsEnabledUseCase", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "Lmx/c;", "labelProvider", "Ls54/o;", "v", "(Lq54/a;Le64/b;Ls54/a;Lez/e;Lez/a;Lpx/d;Lmx/c;)Ls54/o;", "Ls54/p;", "w", "(Lq54/a;Le64/b;Ls54/a;Lez/e;Lez/a;Lpx/d;Lmx/c;)Ls54/p;", "Le64/c;", "u", "(Lt10/k;)Le64/c;", "notificationsSettingsDataSource", "a", "(Le64/c;)Ls54/a;", "Lez/c;", "dateConverter", "d", "(Lez/c;Lc64/a;)Ls54/d;", "Ls54/j;", "p", "(Le64/c;)Ls54/j;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16956a = new a();

    private a() {
    }

    public final s54.a a(e64.c notificationsSettingsDataSource) {
        return new f64.a(notificationsSettingsDataSource);
    }

    public final s54.b b(e64.b localNotificationsRepository) {
        return new f64.b(localNotificationsRepository);
    }

    public final s54.c c(e64.b localNotificationsRepository) {
        return new f64.c(localNotificationsRepository);
    }

    public final s54.d d(ez.c dateConverter, c64.a localNotificationsContainersInteractor) {
        return new f64.d(localNotificationsContainersInteractor, dateConverter);
    }

    public final s54.e e(e64.a localNotificationsMigrationDataSource) {
        return new f64.e(localNotificationsMigrationDataSource);
    }

    public final w54.a f(LocalNotificationsDatabase database) {
        return database.Z();
    }

    public final LocalNotificationsDatabase g(Context context) {
        return (LocalNotificationsDatabase) oa.n.a(context, LocalNotificationsDatabase.class, "local_notifications_db").b(u54.c.f195521c).e();
    }

    public final e64.a h(t10.k sharedPreferencesFactory) {
        return new a64.a(sharedPreferencesFactory);
    }

    public final e64.b i(w54.a documentsDao, w54.k vehiclesDao) {
        return new z54.a(documentsDao, vehiclesDao);
    }

    public final w54.k j(LocalNotificationsDatabase database) {
        return database.a0();
    }

    public final s54.f k(e64.b localNotificationsRepository) {
        return new f64.f(localNotificationsRepository);
    }

    public final f64.g l(e64.b localNotificationsRepository) {
        return new f64.h(localNotificationsRepository);
    }

    public final s54.g m(e64.b localNotificationsRepository, f64.g removeAllNotificationsForVehicleUseCase, px.d remoteLogger, c64.a localNotificationsContainersInteractor) {
        return new f64.i(localNotificationsRepository, removeAllNotificationsForVehicleUseCase, remoteLogger, localNotificationsContainersInteractor);
    }

    public final s54.h n(e64.b localNotificationsRepository) {
        return new f64.j(localNotificationsRepository);
    }

    public final s54.i o(e64.b localNotificationsRepository) {
        return new f64.k(localNotificationsRepository);
    }

    public final s54.j p(e64.c notificationsSettingsDataSource) {
        return new f64.l(notificationsSettingsDataSource);
    }

    public final s54.k q(s54.m setNotificationsForDocumentUseCase, s54.n setNotificationsForVehiclesUseCase, s54.g removeNotificationsForDocumentUseCase, s54.h removeNotificationsForSubDocumentUseCase, s54.d provideVehiclesToLocalNotificationUseCase, px.d remoteLogger, c64.a localNotificationsContainersInteractor) {
        return new f64.m(setNotificationsForDocumentUseCase, setNotificationsForVehiclesUseCase, removeNotificationsForDocumentUseCase, removeNotificationsForSubDocumentUseCase, provideVehiclesToLocalNotificationUseCase, remoteLogger, localNotificationsContainersInteractor);
    }

    public final s54.l r(e64.a localNotificationsMigrationDataSource) {
        return new f64.n(localNotificationsMigrationDataSource);
    }

    public final s54.m s(e64.b localNotificationsRepository) {
        return new f64.o(localNotificationsRepository);
    }

    public final s54.n t(e64.b localNotificationsRepository) {
        return new f64.p(localNotificationsRepository);
    }

    public final e64.c u(t10.k sharedPreferencesFactory) {
        return new a64.b(sharedPreferencesFactory);
    }

    public final s54.o v(q54.a localNotificationManager, e64.b localNotificationsRepository, s54.a areDocumentNotificationSettingsEnabledUseCase, ez.e dateFormatter, ez.a currentTimeProvider, px.d remoteLogger, mx.c labelProvider) {
        return new f64.q(localNotificationManager, localNotificationsRepository, areDocumentNotificationSettingsEnabledUseCase, dateFormatter, currentTimeProvider, remoteLogger, labelProvider);
    }

    public final s54.p w(q54.a localNotificationManager, e64.b localNotificationsRepository, s54.a areDocumentNotificationSettingsEnabledUseCase, ez.e dateFormatter, ez.a currentTimeProvider, px.d remoteLogger, mx.c labelProvider) {
        return new f64.r(localNotificationManager, localNotificationsRepository, areDocumentNotificationSettingsEnabledUseCase, dateFormatter, currentTimeProvider, remoteLogger, labelProvider);
    }
}
