package v44;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lv44/f;", "Lx44/c;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "Lq44/c;", "y", "()Lq44/c;", "", "r", "()Z", "Loq/i0;", "c0", "()V", "response", "Y", "(Lq44/c;)V", "clear", "a", "Lez/a;", "", "b", "Ljava/lang/Long;", "nextUpdateTimestamp", "c", "Lq44/c;", "localPaymentsWidgetDataResponse", "d", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements x44.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f203953e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Long nextUpdateTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private q44.c localPaymentsWidgetDataResponse;

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f203953e = gu.d.q(1, gu.e.HOURS);
    }

    public f(ez.a aVar) {
        this.currentTimeProvider = aVar;
    }

    @Override // x44.c
    public void Y(q44.c response) {
        this.localPaymentsWidgetDataResponse = response;
        this.nextUpdateTimestamp = Long.valueOf(this.currentTimeProvider.a() + gu.b.A(f203953e));
    }

    @Override // x44.c
    public void c0() {
        this.nextUpdateTimestamp = null;
    }

    @Override // wy.c
    public void clear() {
        this.localPaymentsWidgetDataResponse = null;
        this.nextUpdateTimestamp = null;
    }

    @Override // x44.c
    public boolean r() {
        Long l15 = this.nextUpdateTimestamp;
        if (l15 != null) {
            return this.currentTimeProvider.a() >= l15.longValue();
        }
        return true;
    }

    @Override // x44.c
    /* JADX INFO: renamed from: y, reason: from getter */
    public q44.c getLocalPaymentsWidgetDataResponse() {
        return this.localPaymentsWidgetDataResponse;
    }
}
