package p060i1;

import c5.t;
import lr.m;
import p071kotlin.Metadata;
import p143z0.a2;
import p143z0.y;
import u0.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00020\u001f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010 R\u0015\u0010$\u001a\u00020\"*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010#¨\u0006%"}, d2 = {"Li1/s;", "Lz0/y;", "Li1/i1;", "pagerState", "defaultBringIntoViewSpec", "Lc5/t;", "layoutDirection", "<init>", "(Li1/i1;Lz0/y;Lc5/t;)V", "", "containerSize", "f", "(F)F", "proposedOffsetMove", "e", "offset", "size", "a", "(FFF)F", "b", "Li1/i1;", "getPagerState", "()Li1/i1;", "c", "Lz0/y;", "getDefaultBringIntoViewSpec", "()Lz0/y;", "d", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "", "(Li1/i1;)Z", "shouldChangeScrollDirection", "", "(Li1/i1;)I", "layoutAwareFirstOffset", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i1 pagerState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y defaultBringIntoViewSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    public s(i1 i1Var, y yVar, t tVar) {
        this.pagerState = i1Var;
        this.defaultBringIntoViewSpec = yVar;
        this.layoutDirection = tVar;
    }

    private final boolean d(i1 i1Var) {
        return this.layoutDirection == t.Rtl && i1Var.I().getOrientation() == a2.Horizontal;
    }

    private final float e(float proposedOffsetMove) {
        float fC = c(this.pagerState) * (-1);
        while (proposedOffsetMove > 0.0f && fC < proposedOffsetMove) {
            fC += this.pagerState.P();
        }
        while (proposedOffsetMove < 0.0f && fC > proposedOffsetMove) {
            fC -= this.pagerState.P();
        }
        return fC;
    }

    private final float f(float containerSize) {
        int iP;
        float fC = c(this.pagerState) * (-1.0f);
        if (d(this.pagerState)) {
            if (!this.pagerState.G()) {
                iP = this.pagerState.P();
                fC += iP;
            }
        } else if (this.pagerState.G()) {
            iP = this.pagerState.P();
            fC += iP;
        }
        return m.m(fC, -containerSize, containerSize);
    }

    @Override // p143z0.y
    public float a(float offset, float size, float containerSize) {
        float fA = this.defaultBringIntoViewSpec.a(offset, size, containerSize);
        boolean z15 = false;
        if (offset <= 0.0f ? offset + size <= g4.b(fr.s.f66413a) : offset + size > containerSize) {
            z15 = true;
        }
        if (Math.abs(fA) != 0.0f && z15) {
            return e(fA);
        }
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset()) < 1.0E-6d) {
            return 0.0f;
        }
        return f(containerSize);
    }

    public final int c(i1 i1Var) {
        return d(i1Var) ? (-i1Var.getFirstVisiblePageOffset()) + i1Var.P() : i1Var.getFirstVisiblePageOffset();
    }
}
