package o3;

import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lo3/q;", "Lo3/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "n", "(FFFFLo3/c;)J", "b", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float[] f141802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float[] f141803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f141804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float[] f141805i;

    static {
        float[] transform = a.INSTANCE.a().getTransform();
        o oVar = o.f141788a;
        float[] fArrL = d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(transform, oVar.b().c(), oVar.e().c()));
        f141802f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f141803g = fArr;
        f141804h = d.k(fArrL);
        f141805i = d.k(fArr);
    }

    public q(String str, int i15) {
        super(str, b.INSTANCE.a(), i15, null);
    }

    @Override // o3.c
    public float[] b(float[] v15) {
        d.n(f141802f, v15);
        v15[0] = e5.c.a(v15[0]);
        v15[1] = e5.c.a(v15[1]);
        v15[2] = e5.c.a(v15[2]);
        d.n(f141803g, v15);
        return v15;
    }

    @Override // o3.c
    public float e(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // o3.c
    public float f(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // o3.c
    public long j(float v15, float v16, float v17) {
        if (v15 < 0.0f) {
            v15 = 0.0f;
        }
        if (v15 > 1.0f) {
            v15 = 1.0f;
        }
        if (v16 < -0.5f) {
            v16 = -0.5f;
        }
        if (v16 > 0.5f) {
            v16 = 0.5f;
        }
        if (v17 < -0.5f) {
            v17 = -0.5f;
        }
        float f15 = v17 <= 0.5f ? v17 : 0.5f;
        float[] fArr = f141805i;
        float f16 = (fArr[0] * v15) + (fArr[3] * v16) + (fArr[6] * f15);
        float f17 = (fArr[1] * v15) + (fArr[4] * v16) + (fArr[7] * f15);
        float f18 = (fArr[2] * v15) + (fArr[5] * v16) + (fArr[8] * f15);
        float f19 = f16 * f16 * f16;
        float f25 = f17 * f17 * f17;
        float f26 = f18 * f18 * f18;
        float[] fArr2 = f141804h;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f19) + (fArr2[3] * f25)) + (fArr2[6] * f26))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f19) + (fArr2[4] * f25) + (fArr2[7] * f26))) & BodyPartID.bodyIdMax);
    }

    @Override // o3.c
    public float[] l(float[] v15) {
        float f15 = v15[0];
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        v15[0] = f15;
        float f16 = v15[1];
        if (f16 < -0.5f) {
            f16 = -0.5f;
        }
        if (f16 > 0.5f) {
            f16 = 0.5f;
        }
        v15[1] = f16;
        float f17 = v15[2];
        float f18 = f17 >= -0.5f ? f17 : -0.5f;
        v15[2] = f18 <= 0.5f ? f18 : 0.5f;
        d.n(f141805i, v15);
        float f19 = v15[0];
        v15[0] = f19 * f19 * f19;
        float f25 = v15[1];
        v15[1] = f25 * f25 * f25;
        float f26 = v15[2];
        v15[2] = f26 * f26 * f26;
        d.n(f141804h, v15);
        return v15;
    }

    @Override // o3.c
    public float m(float v15, float v16, float v17) {
        if (v15 < 0.0f) {
            v15 = 0.0f;
        }
        if (v15 > 1.0f) {
            v15 = 1.0f;
        }
        if (v16 < -0.5f) {
            v16 = -0.5f;
        }
        if (v16 > 0.5f) {
            v16 = 0.5f;
        }
        if (v17 < -0.5f) {
            v17 = -0.5f;
        }
        float f15 = v17 <= 0.5f ? v17 : 0.5f;
        float[] fArr = f141805i;
        float f16 = (fArr[0] * v15) + (fArr[3] * v16) + (fArr[6] * f15);
        float f17 = (fArr[1] * v15) + (fArr[4] * v16) + (fArr[7] * f15);
        float f18 = (fArr[2] * v15) + (fArr[5] * v16) + (fArr[8] * f15);
        float f19 = f16 * f16 * f16;
        float f25 = f17 * f17 * f17;
        float[] fArr2 = f141804h;
        return (fArr2[2] * f19) + (fArr2[5] * f25) + (fArr2[8] * f18 * f18 * f18);
    }

    @Override // o3.c
    public long n(float x15, float y15, float z15, float a15, c colorSpace) {
        float[] fArr = f141802f;
        float f15 = (fArr[0] * x15) + (fArr[3] * y15) + (fArr[6] * z15);
        float f16 = (fArr[1] * x15) + (fArr[4] * y15) + (fArr[7] * z15);
        float f17 = (fArr[2] * x15) + (fArr[5] * y15) + (fArr[8] * z15);
        float fA = e5.c.a(f15);
        float fA2 = e5.c.a(f16);
        float fA3 = e5.c.a(f17);
        float[] fArr2 = f141803g;
        return o1.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), a15, colorSpace);
    }
}
