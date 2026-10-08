package l;

import android.hardware.camera2.CaptureResult;
import h.Result3A;
import h.j1;
import h.q0;
import h.r0;
import java.util.List;
import java.util.Map;
import ju.w0;
import ju.z;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u001c\u0010\u0010\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0018\u0010,\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020#0-8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010.¨\u00060"}, d2 = {"Ll/t;", "Ll/s;", "Lkotlin/Function1;", "Lh/q0;", "", "exitCondition", "", "frameLimit", "", "timeLimitNs", "<init>", "(Ler/l;Ljava/lang/Integer;Ljava/lang/Long;)V", "", "Landroid/hardware/camera2/CaptureResult$Key;", "", "", "exitConditionForKeys", "(Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Long;)V", "Lh/j1;", "requestNumber", "Loq/i0;", "f", "(J)V", "frameMetadata", "e", "(JLh/q0;)Z", "a", "()V", "c", "d", "Ler/l;", "b", "Ljava/lang/Integer;", "Ljava/lang/Long;", "Lju/x;", "Lh/m1;", "Lju/x;", "_result", "Lh/r0;", "Lh/r0;", "frameNumberOfFirstUpdate", "timestampOfFirstUpdateNs", "g", "Lh/j1;", "initialRequestNumber", "Lju/w0;", "()Lju/w0;", "result", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<q0, Boolean> exitCondition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer frameLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Long timeLimitNs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ju.x<Result3A> _result;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile r0 frameNumberOfFirstUpdate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile Long timestampOfFirstUpdateNs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private j1 initialRequestNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public t(er.l<? super q0, Boolean> lVar, Integer num, Long l15) {
        this.exitCondition = lVar;
        this.frameLimit = num;
        this.timeLimitNs = l15;
        this._result = z.c(null, 1, null);
    }

    @Override // l.GraphLoop.b
    public void a() {
        this._result.d0(new Result3A(Result3A.a.INSTANCE.c(), null, 2, null));
    }

    public final w0<Result3A> b() {
        return this._result;
    }

    @Override // l.GraphLoop.b
    public void c() {
        this._result.d0(new Result3A(Result3A.a.INSTANCE.c(), null, 2, null));
    }

    @Override // l.GraphLoop.b
    public void d() {
        this._result.d0(new Result3A(Result3A.a.INSTANCE.c(), null, 2, null));
    }

    @Override // l.s
    public boolean e(long requestNumber, q0 frameMetadata) {
        if (this._result.r() || this._result.isCancelled()) {
            return true;
        }
        synchronized (this) {
            j1 j1Var = this.initialRequestNumber;
            if (j1Var != null && requestNumber >= j1Var.getValue()) {
                i0 i0Var = i0.f148189a;
                Long l15 = (Long) frameMetadata.I(CaptureResult.SENSOR_TIMESTAMP);
                long jY0 = frameMetadata.Y0();
                if (l15 != null && this.timestampOfFirstUpdateNs == null) {
                    this.timestampOfFirstUpdateNs = l15;
                }
                Long l16 = this.timestampOfFirstUpdateNs;
                if (this.timeLimitNs != null && l16 != null && l15 != null && l15.longValue() - l16.longValue() > this.timeLimitNs.longValue()) {
                    this._result.d0(new Result3A(Result3A.a.INSTANCE.e(), frameMetadata, null));
                    return true;
                }
                if (this.frameNumberOfFirstUpdate == null) {
                    this.frameNumberOfFirstUpdate = r0.a(jY0);
                }
                r0 r0Var = this.frameNumberOfFirstUpdate;
                if (r0Var != null && this.frameLimit != null && jY0 - r0Var.getValue() > this.frameLimit.intValue()) {
                    this._result.d0(new Result3A(Result3A.a.INSTANCE.a(), frameMetadata, null));
                    return true;
                }
                if (!this.exitCondition.b(frameMetadata).booleanValue()) {
                    return false;
                }
                this._result.d0(new Result3A(Result3A.a.INSTANCE.b(), frameMetadata, null));
                return true;
            }
            return false;
        }
    }

    @Override // l.s
    public void f(long requestNumber) {
        synchronized (this) {
            try {
                if (this.initialRequestNumber == null) {
                    this.initialRequestNumber = j1.a(requestNumber);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public /* synthetic */ t(er.l lVar, Integer num, Long l15, int i15, fr.k kVar) {
        this((er.l<? super q0, Boolean>) lVar, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? null : l15);
    }

    public /* synthetic */ t(Map map, Integer num, Long l15, int i15, fr.k kVar) {
        this((Map<CaptureResult.Key<?>, ? extends List<? extends Object>>) map, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? null : l15);
    }

    public t(Map<CaptureResult.Key<?>, ? extends List<? extends Object>> map, Integer num, Long l15) {
        this(v.b(map), num, l15);
    }
}
