package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lu0/x2;", "T", "Lu0/f0;", "", "durationMillis", "delay", "Lu0/g0;", "easing", "<init>", "(IILu0/g0;)V", "Lu0/t;", "V", "Lu0/y2;", "converter", "Lu0/f4;", "h", "(Lu0/y2;)Lu0/f4;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "g", "b", "f", "c", "Lu0/g0;", "getEasing", "()Lu0/g0;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x2<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g0 easing;

    public x2() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(Object other) {
        if (other instanceof x2) {
            x2 x2Var = (x2) other;
            if (x2Var.durationMillis == this.durationMillis && x2Var.delay == this.delay && fr.t.c(x2Var.easing, this.easing)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // u0.j0, u0.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public <V extends t> f4<V> a(y2<T, V> converter) {
        return new f4<>(this.durationMillis, this.delay, this.easing);
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public x2(int i15, int i16, g0 g0Var) {
        this.durationMillis = i15;
        this.delay = i16;
        this.easing = g0Var;
    }

    public /* synthetic */ x2(int i15, int i16, g0 g0Var, int i17, fr.k kVar) {
        this((i17 & 1) != 0 ? 300 : i15, (i17 & 2) != 0 ? 0 : i16, (i17 & 4) != 0 ? i0.d() : g0Var);
    }
}
