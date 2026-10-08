package mo2;

import gz.b;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lmo2/a;", "Lho2/a;", "Ldy/a;", "notificationSettingsManager", "<init>", "(Ldy/a;)V", "Lgz/b$a$a;", "params", "Lho2/a$a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ldy/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ho2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dy.a notificationSettingsManager;

    public a(dy.a aVar) {
        this.notificationSettingsManager = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(b.a.C1792a c1792a, e<? super ho2.a.InterfaceC2001a> eVar) {
        if (this.notificationSettingsManager.e()) {
            return !this.notificationSettingsManager.c(s74.b.MAIN_GENERAL_CHANNEL.getId()) ? ho2.a.InterfaceC2001a.C2002a.f85986a : ho2.a.InterfaceC2001a.b.f85987a;
        }
        return ho2.a.InterfaceC2001a.c.f85988a;
    }
}
