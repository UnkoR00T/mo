package u0;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lu0/n0;", "Lu0/k0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "c", "(JFFF)F", "d", "b", "(FFF)F", "e", "(FFF)J", "a", "F", "getDampingRatio", "()F", "getStiffness", "Lu0/p1;", "Lu0/p1;", "spring", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float visibilityThreshold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 spring;

    public n0(float f15, float f16, float f17) {
        this.dampingRatio = f15;
        this.stiffness = f16;
        this.visibilityThreshold = f17;
        p1 p1Var = new p1(1.0f);
        p1Var.c(f15);
        p1Var.e(f16);
        this.spring = p1Var;
    }

    @Override // u0.k0
    public float b(float initialValue, float targetValue, float initialVelocity) {
        return 0.0f;
    }

    @Override // u0.k0
    public float c(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.d(targetValue);
        return Float.intBitsToFloat((int) (this.spring.f(initialValue, initialVelocity, playTimeNanos / 1000000) >> 32));
    }

    @Override // u0.k0
    public float d(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.d(targetValue);
        return Float.intBitsToFloat((int) (this.spring.f(initialValue, initialVelocity, playTimeNanos / 1000000) & BodyPartID.bodyIdMax));
    }

    @Override // u0.k0
    public long e(float initialValue, float targetValue, float initialVelocity) {
        float fB = this.spring.b();
        float dampingRatio = this.spring.getDampingRatio();
        float f15 = initialValue - targetValue;
        float f16 = this.visibilityThreshold;
        return o1.b(fB, dampingRatio, initialVelocity / f16, f15 / f16, 1.0f) * 1000000;
    }

    public /* synthetic */ n0(float f15, float f16, float f17, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? 1.0f : f15, (i15 & 2) != 0 ? 1500.0f : f16, (i15 & 4) != 0 ? 0.01f : f17);
    }
}
