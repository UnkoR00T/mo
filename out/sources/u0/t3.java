package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lu0/t3;", "Lu0/t;", "V", "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "g", "(JLu0/t;Lu0/t;Lu0/t;)Lu0/t;", "f", "c", "(Lu0/t;Lu0/t;Lu0/t;)J", "e", "(Lu0/t;Lu0/t;Lu0/t;)Lu0/t;", "", "a", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface t3<V extends t> {
    boolean a();

    long c(V initialValue, V targetValue, V initialVelocity);

    default V e(V initialValue, V targetValue, V initialVelocity) {
        return (V) f(c(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity);

    V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity);
}
