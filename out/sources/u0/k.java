package u0;

import p071kotlin.Metadata;
import p076m2.c6;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R+\u0010'\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u001c\"\u0004\b%\u0010&R*\u0010.\u001a\u00028\u00012\u0006\u0010'\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b\u001d\u0010 \"\u0004\b/\u00100R*\u00103\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\b\u0019\u0010 \"\u0004\b2\u00100R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b1\u00104\"\u0004\b5\u00106R\u0011\u00107\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010\u001c¨\u00068"}, d2 = {"Lu0/k;", "T", "Lu0/t;", "V", "", "initialValue", "Lu0/y2;", "typeConverter", "initialVelocityVector", "", "lastFrameTimeNanos", "targetValue", "startTimeNanos", "", "isRunning", "Lkotlin/Function0;", "Loq/i0;", "onCancel", "<init>", "(Ljava/lang/Object;Lu0/y2;Lu0/t;JLjava/lang/Object;JZLer/a;)V", "a", "()V", "Lu0/y2;", "getTypeConverter", "()Lu0/y2;", "b", "Ljava/lang/Object;", "getTargetValue", "()Ljava/lang/Object;", "c", "J", "d", "()J", "Ler/a;", "<set-?>", "e", "Lm2/a3;", "l", "(Ljava/lang/Object;)V", "value", "f", "Lu0/t;", "g", "()Lu0/t;", "m", "(Lu0/t;)V", "velocityVector", "j", "(J)V", "h", "i", "finishedTimeNanos", "()Z", "k", "(Z)V", "velocity", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k<T, V extends t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y2<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long startTimeNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<oq.i0> onCancel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 value;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long finishedTimeNanos = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 isRunning;

    public k(T t15, y2<T, V> y2Var, V v15, long j15, T t16, long j16, boolean z15, er.a<oq.i0> aVar) {
        this.typeConverter = y2Var;
        this.targetValue = t16;
        this.startTimeNanos = j16;
        this.onCancel = aVar;
        this.value = c6.e(t15, null, 2, null);
        this.velocityVector = (V) u.e(v15);
        this.lastFrameTimeNanos = j15;
        this.isRunning = c6.e(Boolean.valueOf(z15), null, 2, null);
    }

    public final void a() {
        k(false);
        this.onCancel.a();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T e() {
        return this.value.getValue();
    }

    public final T f() {
        return this.typeConverter.b().b(this.velocityVector);
    }

    public final V g() {
        return this.velocityVector;
    }

    public final boolean h() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void i(long j15) {
        this.finishedTimeNanos = j15;
    }

    public final void j(long j15) {
        this.lastFrameTimeNanos = j15;
    }

    public final void k(boolean z15) {
        this.isRunning.setValue(Boolean.valueOf(z15));
    }

    public final void l(T t15) {
        this.value.setValue(t15);
    }

    public final void m(V v15) {
        this.velocityVector = v15;
    }
}
