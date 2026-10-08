package a4;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"La4/b0;", "", "a", "(La4/b0;)Z", "b", "c", "d", "j", "k", "Lm3/e;", "g", "(La4/b0;)J", "h", "ignoreConsumed", "i", "(La4/b0;Z)J", "Lc5/r;", "size", "e", "(La4/b0;J)Z", "Lm3/k;", "extendedTouchPadding", "f", "(La4/b0;JJ)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {
    public static final boolean a(PointerInputChange pointerInputChange) {
        return (pointerInputChange.q() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean b(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean c(PointerInputChange pointerInputChange) {
        return (pointerInputChange.q() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean d(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @oq.a
    public static final boolean e(PointerInputChange pointerInputChange, long j15) {
        long position = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & BodyPartID.bodyIdMax));
        int i15 = (int) (j15 >> 32);
        int i16 = (int) (j15 & BodyPartID.bodyIdMax);
        return (fIntBitsToFloat > ((float) i15)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i16));
    }

    public static final boolean f(PointerInputChange pointerInputChange, long j15, long j16) {
        boolean zI = p0.i(pointerInputChange.getType(), p0.INSTANCE.d());
        long position = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & BodyPartID.bodyIdMax));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j16 >> 32));
        float f15 = zI ? 1.0f : 0.0f;
        float f16 = fIntBitsToFloat3 * f15;
        float f17 = ((int) (j15 >> 32)) + f16;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)) * f15;
        return (fIntBitsToFloat > f17) | (fIntBitsToFloat < (-f16)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j15 & BodyPartID.bodyIdMax)) + fIntBitsToFloat4);
    }

    public static final long g(PointerInputChange pointerInputChange) {
        return i(pointerInputChange, false);
    }

    public static final long h(PointerInputChange pointerInputChange) {
        return i(pointerInputChange, true);
    }

    private static final long i(PointerInputChange pointerInputChange, boolean z15) {
        return (z15 || !pointerInputChange.q()) ? m3.e.p(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()) : m3.e.INSTANCE.c();
    }

    public static final boolean j(PointerInputChange pointerInputChange) {
        return !m3.e.j(i(pointerInputChange, false), m3.e.INSTANCE.c());
    }

    public static final boolean k(PointerInputChange pointerInputChange) {
        return !m3.e.j(i(pointerInputChange, true), m3.e.INSTANCE.c());
    }
}
