package o90;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo90/x0;", "", "<init>", "()V", "La84/b;", "clearNotificationsDeviceTokenUseCase", "La84/c;", "clearPushNotificationCountUC", "Lug0/a;", "a", "(La84/b;La84/c;)Lug0/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f143512a = new x0();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"o90/x0$a", "Lug0/a;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "b", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements ug0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a84.b f143513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a84.c f143514b;

        a(a84.b bVar, a84.c cVar) {
            this.f143513a = bVar;
            this.f143514b = cVar;
        }

        @Override // ug0.a
        public Object a(tq.e<? super oq.i0> eVar) throws Throwable {
            Object objA = this.f143513a.a(gz.b.a.C1792a.f78542a, eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }

        @Override // ug0.a
        public Object b(tq.e<? super oq.i0> eVar) {
            Object objA = this.f143514b.a(gz.b.a.C1792a.f78542a, eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    private x0() {
    }

    public final ug0.a a(a84.b clearNotificationsDeviceTokenUseCase, a84.c clearPushNotificationCountUC) {
        return new a(clearNotificationsDeviceTokenUseCase, clearPushNotificationCountUC);
    }
}
