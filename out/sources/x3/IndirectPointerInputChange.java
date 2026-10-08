package x3;

import a4.a0;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: x3.f, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b#\u0010\u001eR$\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010\u001e¨\u0006)"}, d2 = {"Lx3/f;", "", "La4/a0;", "id", "", "uptimeMillis", "Lm3/e;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "<init>", "(JJJZFJJZLfr/k;)V", "Loq/i0;", "a", "()V", "", "toString", "()Ljava/lang/String;", "J", "b", "()J", "g", "c", "d", "Z", "()Z", "e", "F", "getPressure", "()F", "f", "getPreviousUptimeMillis", "h", "value", "i", "isConsumed", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndirectPointerInputChange {

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
    private boolean isConsumed;

    public /* synthetic */ IndirectPointerInputChange(long j15, long j16, long j17, boolean z15, float f15, long j18, long j19, boolean z16, k kVar) {
        this(j15, j16, j17, z15, f15, j18, j19, z16);
    }

    public final void a() {
        this.isConsumed = true;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsConsumed() {
        return this.isConsumed;
    }

    public String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) a0.d(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) m3.e.s(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) m3.e.s(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + this.isConsumed + ')';
    }

    private IndirectPointerInputChange(long j15, long j16, long j17, boolean z15, float f15, long j18, long j19, boolean z16) {
        this.id = j15;
        this.uptimeMillis = j16;
        this.position = j17;
        this.pressed = z15;
        this.pressure = f15;
        this.previousUptimeMillis = j18;
        this.previousPosition = j19;
        this.previousPressed = z16;
    }
}
