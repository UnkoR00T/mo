package p114t0;

import c5.r;
import er.p;
import p071kotlin.Metadata;
import u0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt0/z0;", "Lt0/y0;", "", "clip", "Lkotlin/Function2;", "Lc5/r;", "Lu0/j0;", "sizeAnimationSpec", "<init>", "(ZLer/p;)V", "initialSize", "targetSize", "a", "(JJ)Lu0/j0;", "Z", "o", "()Z", "b", "Ler/p;", "getSizeAnimationSpec", "()Ler/p;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean clip;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<r, r, j0<r>> sizeAnimationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(boolean z15, p<? super r, ? super r, ? extends j0<r>> pVar) {
        this.clip = z15;
        this.sizeAnimationSpec = pVar;
    }

    @Override // p114t0.y0
    public j0<r> a(long initialSize, long targetSize) {
        return this.sizeAnimationSpec.B(r.b(initialSize), r.b(targetSize));
    }

    @Override // p114t0.y0
    /* JADX INFO: renamed from: o, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }
}
