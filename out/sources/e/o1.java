package e;

import android.hardware.camera2.CaptureResult;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001e¨\u0006 "}, d2 = {"Le/o1;", "Lh/g1$a;", "", "timeLimitNs", "Lkotlin/Function1;", "Lh/p0;", "", "checker", "<init>", "(JLer/l;)V", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "totalCaptureResult", "Loq/i0;", "a0", "(Lh/i1;JLh/p0;)V", "a", "J", "b", "Ler/l;", "Lju/x;", "c", "Lju/x;", "completeSignal", "d", "Ljava/lang/Long;", "timestampOfFirstUpdateNs", "Lju/w0;", "()Lju/w0;", "result", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 implements h.g1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timeLimitNs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.l<h.p0, Boolean> checker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ju.x<h.p0> completeSignal = ju.z.c(null, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile Long timestampOfFirstUpdateNs;

    /* JADX WARN: Multi-variable type inference failed */
    public o1(long j15, er.l<? super h.p0, Boolean> lVar) {
        this.timeLimitNs = j15;
        this.checker = lVar;
    }

    public final ju.w0<h.p0> a() {
        return this.completeSignal;
    }

    @Override // h.g1.a
    public void a0(h.i1 requestMetadata, long frameNumber, h.p0 totalCaptureResult) {
        if (this.completeSignal.r() || this.completeSignal.isCancelled()) {
            return;
        }
        Long l15 = (Long) totalCaptureResult.e().I(CaptureResult.SENSOR_TIMESTAMP);
        if (l15 != null && this.timestampOfFirstUpdateNs == null) {
            this.timestampOfFirstUpdateNs = l15;
        }
        Long l16 = this.timestampOfFirstUpdateNs;
        if (this.timeLimitNs == 0 || l16 == null || l15 == null || l15.longValue() - l16.longValue() <= this.timeLimitNs) {
            if (this.checker.b(totalCaptureResult).booleanValue()) {
                this.completeSignal.d0(totalCaptureResult);
            }
        } else {
            this.completeSignal.d0(null);
            c cVar = c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = c.TRUNCATED_TAG;
            }
        }
    }
}
