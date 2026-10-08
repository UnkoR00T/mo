package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: renamed from: u0.j, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu0/j;", "T", "Lu0/t;", "V", "", "Lu0/n;", "endState", "Lu0/h;", "endReason", "<init>", "(Lu0/n;Lu0/h;)V", "", "toString", "()Ljava/lang/String;", "a", "Lu0/n;", "b", "()Lu0/n;", "Lu0/h;", "()Lu0/h;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnimationResult<T, V extends t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnimationState<T, V> endState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final h endReason;

    public AnimationResult(AnimationState<T, V> animationState, h hVar) {
        this.endState = animationState;
        this.endReason = hVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getEndReason() {
        return this.endReason;
    }

    public final AnimationState<T, V> b() {
        return this.endState;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
