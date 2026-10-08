package b4;

import a4.HistoricalChange;
import a4.PointerInputChange;
import a4.p;
import c5.y;
import c5.z;
import fr.k;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\"\u0010#\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006'"}, d2 = {"Lb4/b;", "Lb4/c;", "<init>", "()V", "La4/b0;", "event", "Lm3/e;", "offset", "Loq/i0;", "e", "(La4/b0;J)V", "f", "", "timeMillis", "position", "b", "(JJ)V", "Lc5/y;", "maximumVelocity", "a", "(J)J", "d", "c", "Lb4/f$a;", "Lb4/f$a;", "strategy", "Lb4/f;", "Lb4/f;", "xVelocityTracker", "yVelocityTracker", "J", "getCurrentPointerPositionAccumulator-F1C5BW0$ui", "()J", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui", "(J)V", "currentPointerPositionAccumulator", "getLastMoveEventTimeStamp$ui", "setLastMoveEventTimeStamp$ui", "lastMoveEventTimeStamp", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f.a strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f xVelocityTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f yVelocityTracker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long currentPointerPositionAccumulator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastMoveEventTimeStamp;

    public b() {
        f.a aVar = f.a.Lsq2;
        this.strategy = aVar;
        boolean z15 = false;
        int i15 = 1;
        k kVar = null;
        this.xVelocityTracker = new f(z15, aVar, i15, kVar);
        this.yVelocityTracker = new f(z15, aVar, i15, kVar);
        this.currentPointerPositionAccumulator = m3.e.INSTANCE.c();
    }

    private final void e(PointerInputChange event, long offset) {
        if (p.b(event)) {
            this.currentPointerPositionAccumulator = event.getPosition();
            c();
        }
        long previousPosition = event.getPreviousPosition();
        List<HistoricalChange> listE = event.e();
        int size = listE.size();
        int i15 = 0;
        while (i15 < size) {
            HistoricalChange historicalChange = listE.get(i15);
            long jP = m3.e.p(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            this.currentPointerPositionAccumulator = m3.e.q(this.currentPointerPositionAccumulator, jP);
            b(historicalChange.getUptimeMillis(), m3.e.q(this.currentPointerPositionAccumulator, offset));
            i15++;
            previousPosition = position;
        }
        this.currentPointerPositionAccumulator = m3.e.q(this.currentPointerPositionAccumulator, m3.e.p(event.getPosition(), previousPosition));
        b(event.getUptimeMillis(), m3.e.q(this.currentPointerPositionAccumulator, offset));
    }

    private final void f(PointerInputChange event, long offset) {
        if (p.b(event)) {
            c();
        }
        if (!p.d(event)) {
            List<HistoricalChange> listE = event.e();
            int size = listE.size();
            for (int i15 = 0; i15 < size; i15++) {
                HistoricalChange historicalChange = listE.get(i15);
                b(historicalChange.getUptimeMillis(), m3.e.q(historicalChange.getOriginalEventPosition(), offset));
            }
            b(event.getUptimeMillis(), m3.e.q(event.getOriginalEventPosition(), offset));
        }
        if (p.d(event) && event.getUptimeMillis() - this.lastMoveEventTimeStamp > 40) {
            c();
        }
        this.lastMoveEventTimeStamp = event.getUptimeMillis();
    }

    @Override // b4.c
    public long a(long maximumVelocity) {
        if (!(y.h(maximumVelocity) > 0.0f && y.i(maximumVelocity) > 0.0f)) {
            d4.a.c("maximumVelocity should be a positive value. You specified=" + ((Object) y.n(maximumVelocity)));
        }
        return z.a(this.xVelocityTracker.d(y.h(maximumVelocity)), this.yVelocityTracker.d(y.i(maximumVelocity)));
    }

    @Override // b4.c
    public void b(long timeMillis, long position) {
        this.xVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (position >> 32)));
        this.yVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (position & BodyPartID.bodyIdMax)));
    }

    @Override // b4.c
    public void c() {
        this.xVelocityTracker.e();
        this.yVelocityTracker.e();
        this.lastMoveEventTimeStamp = 0L;
    }

    @Override // b4.c
    public void d(PointerInputChange event, long offset) {
        if (h.g()) {
            f(event, offset);
        } else {
            e(event, offset);
        }
    }
}
