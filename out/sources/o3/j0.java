package o3;

import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lo3/j0;", "Lo3/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "n", "(FFFFLo3/c;)J", "b", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 extends c {
    public j0(String str, int i15) {
        super(str, b.INSTANCE.c(), i15, null);
    }

    @Override // o3.c
    public float[] b(float[] v15) {
        float f15 = v15[0];
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        if (f15 > 2.0f) {
            f15 = 2.0f;
        }
        v15[0] = f15;
        float f16 = v15[1];
        if (f16 < -2.0f) {
            f16 = -2.0f;
        }
        if (f16 > 2.0f) {
            f16 = 2.0f;
        }
        v15[1] = f16;
        float f17 = v15[2];
        float f18 = f17 >= -2.0f ? f17 : -2.0f;
        v15[2] = f18 <= 2.0f ? f18 : 2.0f;
        return v15;
    }

    @Override // o3.c
    public float e(int component) {
        return 2.0f;
    }

    @Override // o3.c
    public float f(int component) {
        return -2.0f;
    }

    @Override // o3.c
    public long j(float v15, float v16, float v17) {
        if (v15 < -2.0f) {
            v15 = -2.0f;
        }
        if (v15 > 2.0f) {
            v15 = 2.0f;
        }
        if (v16 < -2.0f) {
            v16 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(v15)) << 32) | (((long) Float.floatToRawIntBits(v16 <= 2.0f ? v16 : 2.0f)) & BodyPartID.bodyIdMax);
    }

    @Override // o3.c
    public float[] l(float[] v15) {
        float f15 = v15[0];
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        if (f15 > 2.0f) {
            f15 = 2.0f;
        }
        v15[0] = f15;
        float f16 = v15[1];
        if (f16 < -2.0f) {
            f16 = -2.0f;
        }
        if (f16 > 2.0f) {
            f16 = 2.0f;
        }
        v15[1] = f16;
        float f17 = v15[2];
        float f18 = f17 >= -2.0f ? f17 : -2.0f;
        v15[2] = f18 <= 2.0f ? f18 : 2.0f;
        return v15;
    }

    @Override // o3.c
    public float m(float v15, float v16, float v17) {
        if (v17 < -2.0f) {
            v17 = -2.0f;
        }
        if (v17 > 2.0f) {
            return 2.0f;
        }
        return v17;
    }

    @Override // o3.c
    public long n(float x15, float y15, float z15, float a15, c colorSpace) {
        if (x15 < -2.0f) {
            x15 = -2.0f;
        }
        if (x15 > 2.0f) {
            x15 = 2.0f;
        }
        if (y15 < -2.0f) {
            y15 = -2.0f;
        }
        if (y15 > 2.0f) {
            y15 = 2.0f;
        }
        if (z15 < -2.0f) {
            z15 = -2.0f;
        }
        return o1.a(x15, y15, z15 <= 2.0f ? z15 : 2.0f, a15, colorSpace);
    }
}
