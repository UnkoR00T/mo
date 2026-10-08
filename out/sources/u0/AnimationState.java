package u0;

import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.f6;
import u0.t;

/* JADX INFO: renamed from: u0.n, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b'\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00106\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b5\u0010\u001b¨\u00067"}, d2 = {"Lu0/n;", "T", "Lu0/t;", "V", "Lm2/f6;", "Lu0/y2;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Lu0/y2;Ljava/lang/Object;Lu0/t;JJZ)V", "", "toString", "()Ljava/lang/String;", "a", "Lu0/y2;", "t", "()Lu0/y2;", "<set-?>", "b", "Lm2/a3;", "getValue", "()Ljava/lang/Object;", "E", "(Ljava/lang/Object;)V", "value", "c", "Lu0/t;", "z", "()Lu0/t;", "F", "(Lu0/t;)V", "velocityVector", "d", "J", "l", "()J", "C", "(J)V", "e", "k", "B", "f", "Z", "A", "()Z", ip.a.f96138c, "(Z)V", "y", "velocity", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnimationState<T, V extends t> implements f6<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y2<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private long finishedTimeNanos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isRunning;

    public AnimationState(y2<T, V> y2Var, T t15, V v15, long j15, long j16, boolean z15) {
        V v16;
        this.typeConverter = y2Var;
        this.value = c6.e(t15, null, 2, null);
        this.velocityVector = (v15 == null || (v16 = (V) u.e(v15)) == null) ? (V) o.i(y2Var, t15) : v16;
        this.lastFrameTimeNanos = j15;
        this.finishedTimeNanos = j16;
        this.isRunning = z15;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void B(long j15) {
        this.finishedTimeNanos = j15;
    }

    public final void C(long j15) {
        this.lastFrameTimeNanos = j15;
    }

    public final void D(boolean z15) {
        this.isRunning = z15;
    }

    public void E(T t15) {
        this.value.setValue(t15);
    }

    public final void F(V v15) {
        this.velocityVector = v15;
    }

    @Override // p076m2.f6
    public T getValue() {
        return this.value.getValue();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final y2<T, V> t() {
        return this.typeConverter;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + y() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    public final T y() {
        return this.typeConverter.b().b(this.velocityVector);
    }

    public final V z() {
        return this.velocityVector;
    }

    public /* synthetic */ AnimationState(y2 y2Var, Object obj, t tVar, long j15, long j16, boolean z15, int i15, fr.k kVar) {
        this(y2Var, obj, (i15 & 4) != 0 ? null : tVar, (i15 & 8) != 0 ? Long.MIN_VALUE : j15, (i15 & 16) != 0 ? Long.MIN_VALUE : j16, (i15 & 32) != 0 ? false : z15);
    }
}
