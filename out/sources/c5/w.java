package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020\u001b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d\"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\"\u001a\u0004\b \u0010!\"\u001e\u0010%\u001a\u00020\u0004*\u00020\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010!¨\u0006&"}, d2 = {"", "value", "Lc5/x;", "type", "Lc5/v;", "a", "(FJ)J", "", "unitType", "v", "i", "(JF)J", "Loq/i0;", "b", "(J)V", "c", "(JJ)V", "start", "stop", "fraction", "h", "(JJF)J", "f", "(F)J", "getSp$annotations", "(F)V", "sp", "", "e", "(D)J", "(D)V", "", "g", "(I)J", "(I)V", "d", "getEm$annotations", "em", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {
    public static final long a(float f15, long j15) {
        return i(j15, f15);
    }

    public static final void b(long j15) {
        if (v.f(j15) == 0) {
            m.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j15, long j16) {
        if (!((v.f(j15) == 0 || v.f(j16) == 0) ? false : true)) {
            m.a("Cannot perform operation for Unspecified type.");
        }
        if (x.g(v.g(j15), v.g(j16))) {
            return;
        }
        m.a("Cannot perform operation for " + ((Object) x.i(v.g(j15))) + " and " + ((Object) x.i(v.g(j16))));
    }

    public static final long d(int i15) {
        return i(8589934592L, i15);
    }

    public static final long e(double d15) {
        return i(4294967296L, (float) d15);
    }

    public static final long f(float f15) {
        return i(4294967296L, f15);
    }

    public static final long g(int i15) {
        return i(4294967296L, i15);
    }

    public static final long h(long j15, long j16, float f15) {
        c(j15, j16);
        return i(v.f(j15), e5.c.b(v.h(j15), v.h(j16), f15));
    }

    public static final long i(long j15, float f15) {
        return v.c(j15 | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
    }
}
