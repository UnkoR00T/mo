package z1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lm3/e;", "position", "a", "(J)J", "", "isStartHandle", "Lb5/i;", "direction", "handlesCrossed", "f", "(ZLb5/i;Z)Z", "areHandlesCrossed", "e", "(Lb5/i;Z)Z", "Lc5/h;", "F", "c", "()F", "HandleWidth", "b", "HandleHeight", "Ln4/h0;", "Lz1/b1;", "Ln4/h0;", "d", "()Ln4/h0;", "SelectionHandleInfoKey", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f231969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f231970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n4.h0<SelectionHandleInfo> f231971c = new n4.h0<>("SelectionHandleInfo", (er.p) null, 2, (fr.k) null);

    static {
        float f15 = 25;
        f231969a = c5.h.n(f15);
        f231970b = c5.h.n(f15);
    }

    public static final long a(long j15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        return m3.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) - 1.0f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final float b() {
        return f231970b;
    }

    public static final float c() {
        return f231969a;
    }

    public static final n4.h0<SelectionHandleInfo> d() {
        return f231971c;
    }

    public static final boolean e(b5.i iVar, boolean z15) {
        if (iVar != b5.i.Ltr || z15) {
            return iVar == b5.i.Rtl && z15;
        }
        return true;
    }

    public static final boolean f(boolean z15, b5.i iVar, boolean z16) {
        if (z15) {
            return e(iVar, z16);
        }
        return !e(iVar, z16);
    }
}
