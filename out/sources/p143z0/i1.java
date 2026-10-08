package p143z0;

import b4.g;
import m3.e;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import x3.IndirectPointerInputChange;
import x3.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a1\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0007\u001a'\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0007\u001a?\u0010\u001a\u001a\u00020\u0019*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lx3/f;", "Lz0/a2;", "orientation", "Lx3/d;", "primaryDirectionalMotionAxis", "Lm3/e;", "i", "(Lx3/f;Lz0/a2;Lx3/d;)J", "j", "", "h", "(Lx3/f;)Z", "g", "ignoreConsumed", "k", "(Lx3/f;Lz0/a2;Lx3/d;Z)J", "l", "m", "(JLz0/a2;Lx3/d;)J", "n", "Lb4/g;", "event", "Lz0/l1;", "smoother", "nodeOffset", "Loq/i0;", "f", "(Lb4/g;Lx3/f;Lz0/a2;Lx3/d;Lz0/l1;J)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g gVar, IndirectPointerInputChange indirectPointerInputChange, a2 a2Var, d dVar, l1 l1Var, long j15) {
        gVar.a(indirectPointerInputChange.getUptimeMillis(), e.q(m(l1Var.c(indirectPointerInputChange), a2Var, dVar), j15));
    }

    public static final boolean g(IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(IndirectPointerInputChange indirectPointerInputChange, a2 a2Var, d dVar) {
        return k(indirectPointerInputChange, a2Var, dVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(IndirectPointerInputChange indirectPointerInputChange, a2 a2Var, d dVar) {
        return k(indirectPointerInputChange, a2Var, dVar, true);
    }

    private static final long k(IndirectPointerInputChange indirectPointerInputChange, a2 a2Var, d dVar, boolean z15) {
        return (z15 || !indirectPointerInputChange.getIsConsumed()) ? e.p(l(indirectPointerInputChange, a2Var, dVar), n(indirectPointerInputChange, a2Var, dVar)) : e.INSTANCE.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(IndirectPointerInputChange indirectPointerInputChange, a2 a2Var, d dVar) {
        float fIntBitsToFloat;
        if (a2Var == null) {
            return indirectPointerInputChange.getPosition();
        }
        d.Companion companion = d.INSTANCE;
        if (dVar == null ? false : d.g(dVar.getValue(), companion.b())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() >> 32));
        } else {
            if (!(dVar != null ? d.g(dVar.getValue(), companion.c()) : false)) {
                return indirectPointerInputChange.getPosition();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() & BodyPartID.bodyIdMax));
        }
        if (a2Var == a2.Horizontal) {
            return e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
        }
        return e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax));
    }

    private static final long m(long j15, a2 a2Var, d dVar) {
        float fIntBitsToFloat;
        if (a2Var == null) {
            return j15;
        }
        d.Companion companion = d.INSTANCE;
        if (dVar == null ? false : d.g(dVar.getValue(), companion.b())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        } else {
            if (!(dVar != null ? d.g(dVar.getValue(), companion.c()) : false)) {
                return j15;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        }
        if (a2Var == a2.Horizontal) {
            return e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
        }
        return e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax));
    }

    private static final long n(IndirectPointerInputChange indirectPointerInputChange, a2 a2Var, d dVar) {
        float fIntBitsToFloat;
        if (a2Var == null) {
            return indirectPointerInputChange.getPreviousPosition();
        }
        d.Companion companion = d.INSTANCE;
        if (dVar == null ? false : d.g(dVar.getValue(), companion.b())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.getPreviousPosition() >> 32));
        } else {
            if (!(dVar != null ? d.g(dVar.getValue(), companion.c()) : false)) {
                return indirectPointerInputChange.getPreviousPosition();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.getPreviousPosition() & BodyPartID.bodyIdMax));
        }
        if (a2Var == a2.Horizontal) {
            return e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
        }
        return e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax));
    }
}
