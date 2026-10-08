package a4;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a4.b0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJw\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$J\u0081\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b7\u0010,R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b?\u0010,R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b@\u00106R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010,R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010AR\"\u0010\u001a\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010*\u001a\u0004\b8\u0010,\"\u0004\bC\u0010DR\"\u0010H\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00100\u001a\u0004\bE\u00102\"\u0004\bF\u0010GR\"\u0010K\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u00100\u001a\u0004\bI\u00102\"\u0004\bJ\u0010GR$\u0010R\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b3\u0010SR\u0011\u0010T\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bL\u00102¨\u0006U"}, d2 = {"La4/b0;", "", "La4/a0;", "id", "", "uptimeMillis", "Lm3/e;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "La4/p0;", "type", "scrollDelta", "scaleFactor", "panOffset", "<init>", "(JJJZFJJZZIJFJLfr/k;)V", "", "La4/e;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JFJJLfr/k;)V", "Loq/i0;", "a", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "b", "(JJJZJJZILjava/util/List;J)La4/b0;", "d", "(JJJZFJJZILjava/util/List;J)La4/b0;", "", "toString", "()Ljava/lang/String;", "J", "f", "()J", "p", "c", "i", "Z", "j", "()Z", "e", "F", "k", "()F", "getPreviousUptimeMillis", "g", "l", "h", "m", "I", "o", "()I", "n", "getScaleFactor", "Ljava/util/List;", "_historical", "setOriginalEventPosition-k-4lQ0M$ui", "(J)V", "getDownChange$ui", "setDownChange$ui", "(Z)V", "downChange", "getPositionChange$ui", "setPositionChange$ui", "positionChange", "q", "La4/b0;", "getConsumedDelegate$ui", "()La4/b0;", "setConsumedDelegate$ui", "(La4/b0;)V", "consumedDelegate", "()Ljava/util/List;", "isConsumed", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointerInputChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pressed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousUptimeMillis;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousPosition;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean previousPressed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long scrollDelta;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleFactor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long panOffset;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private List<HistoricalChange> _historical;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long originalEventPosition;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean downChange;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean positionChange;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private PointerInputChange consumedDelegate;

    public /* synthetic */ PointerInputChange(long j15, long j16, long j17, boolean z15, float f15, long j18, long j19, boolean z16, boolean z17, int i15, long j25, float f16, long j26, fr.k kVar) {
        this(j15, j16, j17, z15, f15, j18, j19, z16, z17, i15, j25, f16, j26);
    }

    public static /* synthetic */ PointerInputChange c(PointerInputChange pointerInputChange, long j15, long j16, long j17, boolean z15, long j18, long j19, boolean z16, int i15, List list, long j25, int i16, Object obj) {
        long j26;
        long j27 = (i16 & 1) != 0 ? pointerInputChange.id : j15;
        long j28 = (i16 & 2) != 0 ? pointerInputChange.uptimeMillis : j16;
        long j29 = (i16 & 4) != 0 ? pointerInputChange.position : j17;
        boolean z17 = (i16 & 8) != 0 ? pointerInputChange.pressed : z15;
        long j35 = (i16 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j18;
        long j36 = (i16 & 32) != 0 ? pointerInputChange.previousPosition : j19;
        boolean z18 = (i16 & 64) != 0 ? pointerInputChange.previousPressed : z16;
        int i17 = (i16 & 128) != 0 ? pointerInputChange.type : i15;
        if ((i16 & 512) != 0) {
            j26 = pointerInputChange.scrollDelta;
            j27 = j27;
        } else {
            j26 = j25;
        }
        return pointerInputChange.b(j27, j28, j29, z17, j35, j36, z18, i17, list, j26);
    }

    public final void a() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.a();
        }
    }

    public final PointerInputChange b(long id5, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChangeD = d(id5, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeD.consumedDelegate = pointerInputChange;
        return pointerInputChangeD;
    }

    public final PointerInputChange d(long id5, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id5, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    public final List<HistoricalChange> e() {
        List<HistoricalChange> list = this._historical;
        return list == null ? pq.v.n() : list;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getPanOffset() {
        return this.panOffset;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean q() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange != null) {
            return pointerInputChange.q();
        }
        return this.downChange || this.positionChange;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) a0.d(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) m3.e.s(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) m3.e.s(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + q() + ", type=" + ((Object) p0.k(this.type)) + ", historical=" + e() + ", scrollDelta=" + ((Object) m3.e.s(this.scrollDelta)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) m3.e.s(this.panOffset)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j15, long j16, long j17, boolean z15, float f15, long j18, long j19, boolean z16, boolean z17, int i15, List list, long j25, float f16, long j26, long j27, fr.k kVar) {
        this(j15, j16, j17, z15, f15, j18, j19, z16, z17, i15, (List<HistoricalChange>) list, j25, f16, j26, j27);
    }

    private PointerInputChange(long j15, long j16, long j17, boolean z15, float f15, long j18, long j19, boolean z16, boolean z17, int i15, long j25, float f16, long j26) {
        this.id = j15;
        this.uptimeMillis = j16;
        this.position = j17;
        this.pressed = z15;
        this.pressure = f15;
        this.previousUptimeMillis = j18;
        this.previousPosition = j19;
        this.previousPressed = z16;
        this.type = i15;
        this.scrollDelta = j25;
        this.scaleFactor = f16;
        this.panOffset = j26;
        this.originalEventPosition = m3.e.INSTANCE.c();
        this.downChange = z17;
        this.positionChange = z17;
    }

    public /* synthetic */ PointerInputChange(long j15, long j16, long j17, boolean z15, float f15, long j18, long j19, boolean z16, boolean z17, int i15, long j25, float f16, long j26, int i16, fr.k kVar) {
        this(j15, j16, j17, z15, f15, j18, j19, z16, z17, (i16 & 512) != 0 ? p0.INSTANCE.d() : i15, (i16 & 1024) != 0 ? m3.e.INSTANCE.c() : j25, (i16 & 2048) != 0 ? 1.0f : f16, (i16 & PKIFailureInfo.certConfirmed) != 0 ? m3.e.INSTANCE.c() : j26, null);
    }

    private PointerInputChange(long j15, long j16, long j17, boolean z15, float f15, long j18, long j19, boolean z16, boolean z17, int i15, List<HistoricalChange> list, long j25, float f16, long j26, long j27) {
        this(j15, j16, j17, z15, f15, j18, j19, z16, z17, i15, j25, f16, j26, null);
        this._historical = list;
        this.originalEventPosition = j27;
    }
}
