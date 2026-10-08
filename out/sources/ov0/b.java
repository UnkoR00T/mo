package ov0;

import gu.d;
import gu.e;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000e"}, d2 = {"Lov0/b;", "", "<init>", "()V", "Lgu/b;", "b", "J", "c", "()J", "VEHICLE_COLLISION_INITIATOR_QR_TIMEOUT", "a", "VEHICLE_COLLISION_AWAIT_CONFIRMATION_TIMEOUT", "d", "VEHICLE_COLLISION_AWAIT_READY_TO_SIGN_TIMEOUT", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f150213a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long VEHICLE_COLLISION_INITIATOR_QR_TIMEOUT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long VEHICLE_COLLISION_AWAIT_CONFIRMATION_TIMEOUT;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long VEHICLE_COLLISION_AWAIT_READY_TO_SIGN_TIMEOUT;

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        e eVar = e.MINUTES;
        VEHICLE_COLLISION_INITIATOR_QR_TIMEOUT = d.q(3, eVar);
        VEHICLE_COLLISION_AWAIT_CONFIRMATION_TIMEOUT = d.q(6, eVar);
        VEHICLE_COLLISION_AWAIT_READY_TO_SIGN_TIMEOUT = d.q(6, eVar);
    }

    private b() {
    }

    public final long a() {
        return VEHICLE_COLLISION_AWAIT_CONFIRMATION_TIMEOUT;
    }

    public final long b() {
        return VEHICLE_COLLISION_AWAIT_READY_TO_SIGN_TIMEOUT;
    }

    public final long c() {
        return VEHICLE_COLLISION_INITIATOR_QR_TIMEOUT;
    }
}
