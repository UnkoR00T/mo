package p060i1;

import p071kotlin.Metadata;
import p143z0.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Li1/m;", "Lz0/y;", "Li1/i1;", "pagerState", "defaultBringIntoViewSpec", "<init>", "(Li1/i1;Lz0/y;)V", "", "proposedOffsetMove", "c", "(F)F", "offset", "size", "containerSize", "a", "(FFF)F", "b", "Li1/i1;", "getPagerState", "()Li1/i1;", "Lz0/y;", "getDefaultBringIntoViewSpec", "()Lz0/y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i1 pagerState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y defaultBringIntoViewSpec;

    public m(i1 i1Var, y yVar) {
        this.pagerState = i1Var;
        this.defaultBringIntoViewSpec = yVar;
    }

    private final float c(float proposedOffsetMove) {
        float firstVisiblePageOffset = this.pagerState.getFirstVisiblePageOffset() * (-1);
        while (proposedOffsetMove > 0.0f && firstVisiblePageOffset < proposedOffsetMove) {
            firstVisiblePageOffset += this.pagerState.P();
        }
        while (proposedOffsetMove < 0.0f && firstVisiblePageOffset > proposedOffsetMove) {
            firstVisiblePageOffset -= this.pagerState.P();
        }
        return firstVisiblePageOffset;
    }

    @Override // p143z0.y
    public float a(float offset, float size, float containerSize) {
        float fA = this.defaultBringIntoViewSpec.a(offset, size, containerSize);
        boolean z15 = false;
        if (offset <= 0.0f ? offset + size <= 0.0f : offset + size > containerSize) {
            z15 = true;
        }
        if (Math.abs(fA) != 0.0f && z15) {
            return c(fA);
        }
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset()) < 1.0E-6d) {
            return 0.0f;
        }
        float firstVisiblePageOffset = this.pagerState.getFirstVisiblePageOffset() * (-1.0f);
        if (this.pagerState.G()) {
            firstVisiblePageOffset += this.pagerState.P();
        }
        return lr.m.m(firstVisiblePageOffset, -containerSize, containerSize);
    }
}
