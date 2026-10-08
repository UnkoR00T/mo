package jd;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0080\u0001\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljd/b;", "Ljd/i;", "Lfd/f;", "composition", "", "progress", "", "iteration", "", "resetLastFrameNanos", "Loq/i0;", "s", "(Lfd/f;FIZLtq/e;)Ljava/lang/Object;", "iterations", "reverseOnRepeat", "speed", "Ljd/k;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Ljd/j;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "f", "(Lfd/f;IIZFLjd/k;FZLjd/j;ZZLtq/e;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b extends i {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(b bVar, fd.f fVar, int i15, int i16, boolean z15, float f15, k kVar, float f16, boolean z16, j jVar, boolean z17, boolean z18, tq.e eVar, int i17, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iR = (i17 & 2) != 0 ? bVar.r() : i15;
            int iN = (i17 & 4) != 0 ? bVar.n() : i16;
            boolean zM = (i17 & 8) != 0 ? bVar.m() : z15;
            float fO = (i17 & 16) != 0 ? bVar.o() : f15;
            k kVarV = (i17 & 32) != 0 ? bVar.v() : kVar;
            return bVar.f(fVar, iR, iN, zM, fO, kVarV, (i17 & 64) != 0 ? d.c(fVar, kVarV, fO) : f16, (i17 & 128) != 0 ? false : z16, (i17 & 256) != 0 ? j.Immediately : jVar, (i17 & 512) != 0 ? false : z17, (i17 & 1024) != 0 ? false : z18, eVar);
        }

        public static /* synthetic */ Object b(b bVar, fd.f fVar, float f15, int i15, boolean z15, tq.e eVar, int i16, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i16 & 1) != 0) {
                fVar = bVar.u();
            }
            if ((i16 & 2) != 0) {
                f15 = bVar.q();
            }
            if ((i16 & 4) != 0) {
                i15 = bVar.r();
            }
            if ((i16 & 8) != 0) {
                z15 = !(f15 == bVar.q());
            }
            return bVar.s(fVar, f15, i15, z15, eVar);
        }
    }

    Object f(fd.f fVar, int i15, int i16, boolean z15, float f15, k kVar, float f16, boolean z16, j jVar, boolean z17, boolean z18, tq.e<? super i0> eVar);

    Object s(fd.f fVar, float f15, int i15, boolean z15, tq.e<? super i0> eVar);
}
