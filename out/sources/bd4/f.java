package bd4;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lbd4/f;", "Lz64/f;", "La84/b;", "clearNotificationsDeviceTokenUseCase", "La84/c;", "clearPushNotificationCountUC", "<init>", "(La84/b;La84/c;)V", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "b", "La84/b;", "La84/c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements z64.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18625c = a84.c.f4902b | a84.b.f4894c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a84.b clearNotificationsDeviceTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a84.c clearPushNotificationCountUC;

    public f(a84.b bVar, a84.c cVar) {
        this.clearNotificationsDeviceTokenUseCase = bVar;
        this.clearPushNotificationCountUC = cVar;
    }

    @Override // z64.f
    public Object a(tq.e<? super i0> eVar) throws Throwable {
        Object objA = this.clearNotificationsDeviceTokenUseCase.a(gz.b.a.C1792a.f78542a, eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // z64.f
    public Object b(tq.e<? super i0> eVar) {
        Object objA = this.clearPushNotificationCountUC.a(gz.b.a.C1792a.f78542a, eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }
}
