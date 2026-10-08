package p143z0;

import er.l;
import m3.e;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import r0.a1;
import r0.q0;
import x3.IndirectPointerInputChange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lz0/l1;", "", "<init>", "()V", "Lx3/f;", "change", "Lm3/e;", "c", "(Lx3/f;)J", "", "a", "I", "eventRotatingIndex", "Lr0/q0;", "b", "Lr0/q0;", "eventRotatingArray", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f231432d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int eventRotatingIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private q0<IndirectPointerInputChange> eventRotatingArray = new q0<>(0, 1, null);

    private static final <T> float d(a1<T> a1Var, l<? super T, Float> lVar) {
        Object[] objArr = a1Var.content;
        int i15 = a1Var._size;
        float fFloatValue = 0.0f;
        for (int i16 = 0; i16 < i15; i16++) {
            fFloatValue += lVar.b(objArr[i16]).floatValue();
        }
        return fFloatValue / a1Var.get_size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(IndirectPointerInputChange indirectPointerInputChange) {
        return Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(IndirectPointerInputChange indirectPointerInputChange) {
        return Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() & BodyPartID.bodyIdMax));
    }

    public final long c(IndirectPointerInputChange change) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (change.getPosition() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (change.getPosition() & BodyPartID.bodyIdMax));
        if (i1.g(change)) {
            this.eventRotatingIndex = 0;
            this.eventRotatingArray.u();
        }
        if (!i1.h(change) && !i1.g(change)) {
            if (this.eventRotatingArray.get_size() == 3) {
                q0<IndirectPointerInputChange> q0Var = this.eventRotatingArray;
                int i15 = this.eventRotatingIndex;
                this.eventRotatingIndex = i15 + 1;
                q0Var.F(i15, change);
            } else {
                this.eventRotatingArray.n(change);
            }
            if (this.eventRotatingIndex == 3) {
                this.eventRotatingIndex = 0;
            }
            fIntBitsToFloat = d(this.eventRotatingArray, new l() { // from class: z0.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return Float.valueOf(l1.e((IndirectPointerInputChange) obj));
                }
            });
            fIntBitsToFloat2 = d(this.eventRotatingArray, new l() { // from class: z0.k1
                @Override // er.l
                public final Object b(Object obj) {
                    return Float.valueOf(l1.f((IndirectPointerInputChange) obj));
                }
            });
        }
        return e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }
}
