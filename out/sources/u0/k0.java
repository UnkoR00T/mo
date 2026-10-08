package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J/\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lu0/k0;", "Lu0/l;", "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "c", "(JFFF)F", "d", "b", "(FFF)F", "e", "(FFF)J", "Lu0/t;", "V", "Lu0/y2;", "converter", "Lu0/y3;", "a", "(Lu0/y2;)Lu0/y3;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k0 extends l<Float> {
    default float b(float initialValue, float targetValue, float initialVelocity) {
        return d(e(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    float c(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    float d(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    long e(float initialValue, float targetValue, float initialVelocity);

    @Override // u0.l
    default <V extends t> y3<V> a(y2<Float, V> converter) {
        return new y3<>(this);
    }
}
