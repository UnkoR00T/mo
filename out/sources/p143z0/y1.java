package p143z0;

import er.l;
import m3.e;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import r0.l0;
import r0.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lz0/y1;", "", "<init>", "()V", "Lm3/e;", "offset", "d", "(J)J", "Loq/i0;", "c", "", "a", "I", "eventRotatingIndex", "Lr0/l0;", "b", "Lr0/l0;", "eventRotatingArray", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int eventRotatingIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private l0 eventRotatingArray = new l0(0, 1, null);

    private static final float e(v vVar, l<? super Long, Float> lVar) {
        long[] jArr = vVar.content;
        int i15 = vVar._size;
        float fFloatValue = 0.0f;
        for (int i16 = 0; i16 < i15; i16++) {
            fFloatValue += lVar.b(Long.valueOf(jArr[i16])).floatValue();
        }
        return fFloatValue / vVar._size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j15) {
        return Float.intBitsToFloat((int) (e.e(j15) >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j15) {
        return Float.intBitsToFloat((int) (e.e(j15) & BodyPartID.bodyIdMax));
    }

    public final void c() {
        this.eventRotatingIndex = 0;
        this.eventRotatingArray.f();
    }

    public final long d(long offset) {
        l0 l0Var = this.eventRotatingArray;
        if (l0Var._size == 3) {
            int i15 = this.eventRotatingIndex;
            this.eventRotatingIndex = i15 + 1;
            l0Var.j(i15, offset);
        } else {
            l0Var.d(offset);
        }
        if (this.eventRotatingIndex == 3) {
            this.eventRotatingIndex = 0;
        }
        float fE = e(this.eventRotatingArray, new l() { // from class: z0.w1
            @Override // er.l
            public final Object b(Object obj) {
                return Float.valueOf(y1.f(((Long) obj).longValue()));
            }
        });
        return e.e((((long) Float.floatToRawIntBits(e(this.eventRotatingArray, new l() { // from class: z0.x1
            @Override // er.l
            public final Object b(Object obj) {
                return Float.valueOf(y1.g(((Long) obj).longValue()));
            }
        }))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fE) << 32));
    }
}
