package h7;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001a\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\u0006\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00012\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\r\u001a\u00020\f*\u00060\u0000j\u0002`\u00012\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a'\u0010\u0015\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0014\u001a\u00020\u0002H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0014\u001a\u00020\u0002H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a6\u0010\u001b\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0019\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u001a\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u001e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u001c\u0010!\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004\"\u001c\u0010#\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004*\f\b\u0000\u0010$\"\u00020\u00002\u00020\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lr0/g;", "Landroidx/graphics/shapes/Point;", "", "f", "(J)F", "other", "d", "(JJ)F", "otherX", "otherY", "c", "(JFF)F", "", "a", "(JJ)Z", "e", "(J)J", "j", "(JJ)J", "k", "operand", "l", "(JF)J", "b", "start", "stop", "fraction", "i", "(JJF)J", "Lh7/g;", "m", "(JLh7/g;)J", "g", "x", "h", "y", "Point", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final boolean a(long j15, long j16) {
        return (g(j15) * h(j16)) - (h(j15) * g(j16)) > 0.0f;
    }

    public static final long b(long j15, float f15) {
        return r0.g.b(g(j15) / f15, h(j15) / f15);
    }

    public static final float c(long j15, float f15, float f16) {
        return (g(j15) * f15) + (h(j15) * f16);
    }

    public static final float d(long j15, long j16) {
        return (g(j15) * g(j16)) + (h(j15) * h(j16));
    }

    public static final long e(long j15) {
        float f15 = f(j15);
        if (f15 > 0.0f) {
            return b(j15, f15);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final float f(long j15) {
        return (float) Math.sqrt((g(j15) * g(j15)) + (h(j15) * h(j15)));
    }

    public static final float g(long j15) {
        return Float.intBitsToFloat((int) (j15 >> 32));
    }

    public static final float h(long j15) {
        return Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
    }

    public static final long i(long j15, long j16, float f15) {
        return r0.g.b(l.e(g(j15), g(j16), f15), l.e(h(j15), h(j16), f15));
    }

    public static final long j(long j15, long j16) {
        return r0.g.b(g(j15) - g(j16), h(j15) - h(j16));
    }

    public static final long k(long j15, long j16) {
        return r0.g.b(g(j15) + g(j16), h(j15) + h(j16));
    }

    public static final long l(long j15, float f15) {
        return r0.g.b(g(j15) * f15, h(j15) * f15);
    }

    public static final long m(long j15, g gVar) {
        long jA = gVar.a(g(j15), h(j15));
        return r0.g.b(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax)));
    }
}
