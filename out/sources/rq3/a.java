package rq3;

import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0007¢\u0006\u0004\b \u0010!J/\u0010&\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lrq3/a;", "", "<init>", "()V", "Lt10/k;", "sharedPreferencesFactory", "Lsq3/b;", "e", "(Lt10/k;)Lsq3/b;", "Lsq3/c;", "whatsNewDataSource", "Ltq3/c;", "getAnnouncementsToDisplayUseCase", "Lpq3/c;", "f", "(Lsq3/c;Ltq3/c;)Lpq3/c;", "Lpq3/a;", "g", "(Lsq3/c;)Lpq3/a;", "Lh64/e;", "getFeatureFlagListUseCase", "Lpq3/b;", "d", "(Lh64/e;)Lpq3/b;", "displayedIdsDataSource", "Lsq3/a;", "announcementsDataSource", "Ltq3/a;", "b", "(Lsq3/b;Lsq3/a;)Ltq3/a;", "a", "()Lsq3/a;", "h", "()Lsq3/c;", "Ljq0/g;", "BEGetWhatsNewUseCase", "Lpx/d;", "remoteLogger", "c", "(Lsq3/a;Ljq0/g;Lsq3/b;Lpx/d;)Ltq3/c;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final sq3.a a() {
        return new qq3.a();
    }

    public final tq3.a b(sq3.b displayedIdsDataSource, sq3.a announcementsDataSource) {
        return new tq3.a(displayedIdsDataSource, announcementsDataSource);
    }

    public final tq3.c c(sq3.a announcementsDataSource, jq0.g BEGetWhatsNewUseCase, sq3.b displayedIdsDataSource, px.d remoteLogger) {
        return new tq3.c(announcementsDataSource, BEGetWhatsNewUseCase, displayedIdsDataSource, remoteLogger);
    }

    public final pq3.b d(h64.e getFeatureFlagListUseCase) {
        return new tq3.d(getFeatureFlagListUseCase);
    }

    public final sq3.b e(k sharedPreferencesFactory) {
        return new qq3.c(sharedPreferencesFactory);
    }

    public final pq3.c f(sq3.c whatsNewDataSource, tq3.c getAnnouncementsToDisplayUseCase) {
        return new tq3.e(whatsNewDataSource, getAnnouncementsToDisplayUseCase);
    }

    public final pq3.a g(sq3.c whatsNewDataSource) {
        return new tq3.b(whatsNewDataSource);
    }

    public final sq3.c h() {
        return new qq3.b();
    }
}
