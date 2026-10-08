package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\b\b\u0001\u0010\f*\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lu0/q0;", "T", "Lu0/l;", "Lu0/f0;", "animation", "Lu0/i1;", "repeatMode", "Lu0/t1;", "initialStartOffset", "<init>", "(Lu0/f0;Lu0/i1;JLfr/k;)V", "Lu0/t;", "V", "Lu0/y2;", "converter", "Lu0/t3;", "a", "(Lu0/y2;)Lu0/t3;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lu0/f0;", "getAnimation", "()Lu0/f0;", "b", "Lu0/i1;", "getRepeatMode", "()Lu0/i1;", "c", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0<T> implements l<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f193832d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f0<T> animation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i1 repeatMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long initialStartOffset;

    public /* synthetic */ q0(f0 f0Var, i1 i1Var, long j15, fr.k kVar) {
        this(f0Var, i1Var, j15);
    }

    @Override // u0.l
    public <V extends t> t3<V> a(y2<T, V> converter) {
        return new a4(this.animation.a((y2) converter), this.repeatMode, this.initialStartOffset, null);
    }

    public boolean equals(Object other) {
        if (other instanceof q0) {
            q0 q0Var = (q0) other;
            if (fr.t.c(q0Var.animation, this.animation) && q0Var.repeatMode == this.repeatMode && t1.d(q0Var.initialStartOffset, this.initialStartOffset)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + t1.e(this.initialStartOffset);
    }

    private q0(f0<T> f0Var, i1 i1Var, long j15) {
        this.animation = f0Var;
        this.repeatMode = i1Var;
        this.initialStartOffset = j15;
        if (f0Var instanceof x2) {
            if (((x2) f0Var).getDurationMillis() != 0 || ((x2) f0Var).getDelay() != 0) {
                return;
            }
        } else if (f0Var instanceof n1) {
            if (((n1) f0Var).getDelay() != 0) {
                return;
            }
        } else if (f0Var instanceof z0) {
            if (((z0) f0Var).f().getDurationMillis() != 0 || ((z0) f0Var).f().getDelayMillis() != 0) {
                return;
            }
        } else {
            if (f0Var instanceof b1) {
                ((b1) f0Var).f();
                throw null;
            }
            if (!(f0Var instanceof w) || ((w) f0Var).getDurationMillis() != 0 || ((w) f0Var).getDelayMillis() != 0) {
                return;
            }
        }
        throw new IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }
}
