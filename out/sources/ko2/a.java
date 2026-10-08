package ko2;

import a14.s;
import ez.e;
import p071kotlin.Metadata;
import px.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lko2/a;", "", "<init>", "()V", "Ldy/a;", "notificationSettingsManager", "Lho2/a;", "a", "(Ldy/a;)Lho2/a;", "La14/s;", "launchAppUseCase", "Lpx/d;", "remoteLogger", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "Lno2/a;", "b", "(La14/s;Lpx/d;Lez/e;Lez/a;)Lno2/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f112135a = new a();

    private a() {
    }

    public final ho2.a a(dy.a notificationSettingsManager) {
        return new mo2.a(notificationSettingsManager);
    }

    public final no2.a b(s launchAppUseCase, d remoteLogger, e dateFormatter, ez.a currentTimeProvider) {
        return new no2.b(launchAppUseCase, remoteLogger, dateFormatter, currentTimeProvider);
    }
}
