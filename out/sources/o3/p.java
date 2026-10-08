package o3;

import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lo3/p;", "Lo3/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "n", "(FFFFLo3/c;)J", "b", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends c {
    public p(String str, int i15) {
        super(str, b.INSTANCE.a(), i15, null);
    }

    @Override // o3.c
    public float[] b(float[] v15) {
        float f15 = v15[0];
        o oVar = o.f141788a;
        float f16 = f15 / oVar.c()[0];
        float f17 = v15[1] / oVar.c()[1];
        float f18 = v15[2] / oVar.c()[2];
        float fCbrt = f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f17 > 0.008856452f ? (float) Math.cbrt(f17) : (f17 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f18 > 0.008856452f ? (float) Math.cbrt(f18) : (f18 * 7.787037f) + 0.13793103f;
        float f19 = (116.0f * fCbrt2) - 16.0f;
        float f25 = (fCbrt - fCbrt2) * 500.0f;
        float f26 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f19 < 0.0f) {
            f19 = 0.0f;
        }
        if (f19 > 100.0f) {
            f19 = 100.0f;
        }
        v15[0] = f19;
        if (f25 < -128.0f) {
            f25 = -128.0f;
        }
        if (f25 > 128.0f) {
            f25 = 128.0f;
        }
        v15[1] = f25;
        if (f26 < -128.0f) {
            f26 = -128.0f;
        }
        v15[2] = f26 <= 128.0f ? f26 : 128.0f;
        return v15;
    }

    @Override // o3.c
    public float e(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // o3.c
    public float f(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // o3.c
    public long j(float v15, float v16, float v17) {
        if (v15 < 0.0f) {
            v15 = 0.0f;
        }
        if (v15 > 100.0f) {
            v15 = 100.0f;
        }
        if (v16 < -128.0f) {
            v16 = -128.0f;
        }
        if (v16 > 128.0f) {
            v16 = 128.0f;
        }
        float f15 = (v15 + 16.0f) / 116.0f;
        float f16 = (v16 * 0.002f) + f15;
        float f17 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f18 = f15 > 0.20689656f ? f15 * f15 * f15 : (f15 - 0.13793103f) * 0.12841855f;
        o oVar = o.f141788a;
        return (((long) Float.floatToRawIntBits(f18 * oVar.c()[1])) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f17 * oVar.c()[0])) << 32);
    }

    @Override // o3.c
    public float[] l(float[] v15) {
        float f15 = v15[0];
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 > 100.0f) {
            f15 = 100.0f;
        }
        v15[0] = f15;
        float f16 = v15[1];
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        if (f16 > 128.0f) {
            f16 = 128.0f;
        }
        v15[1] = f16;
        float f17 = v15[2];
        float f18 = f17 >= -128.0f ? f17 : -128.0f;
        float f19 = f18 <= 128.0f ? f18 : 128.0f;
        v15[2] = f19;
        float f25 = (f15 + 16.0f) / 116.0f;
        float f26 = (f16 * 0.002f) + f25;
        float f27 = f25 - (f19 * 0.005f);
        float f28 = f26 > 0.20689656f ? f26 * f26 * f26 : (f26 - 0.13793103f) * 0.12841855f;
        float f29 = f25 > 0.20689656f ? f25 * f25 * f25 : (f25 - 0.13793103f) * 0.12841855f;
        float f35 = f27 > 0.20689656f ? f27 * f27 * f27 : (f27 - 0.13793103f) * 0.12841855f;
        o oVar = o.f141788a;
        v15[0] = f28 * oVar.c()[0];
        v15[1] = f29 * oVar.c()[1];
        v15[2] = f35 * oVar.c()[2];
        return v15;
    }

    @Override // o3.c
    public float m(float v15, float v16, float v17) {
        if (v15 < 0.0f) {
            v15 = 0.0f;
        }
        if (v15 > 100.0f) {
            v15 = 100.0f;
        }
        if (v17 < -128.0f) {
            v17 = -128.0f;
        }
        if (v17 > 128.0f) {
            v17 = 128.0f;
        }
        float f15 = ((v15 + 16.0f) / 116.0f) - (v17 * 0.005f);
        return (f15 > 0.20689656f ? f15 * f15 * f15 : 0.12841855f * (f15 - 0.13793103f)) * o.f141788a.c()[2];
    }

    @Override // o3.c
    public long n(float x15, float y15, float z15, float a15, c colorSpace) {
        o oVar = o.f141788a;
        float f15 = x15 / oVar.c()[0];
        float f16 = y15 / oVar.c()[1];
        float f17 = z15 / oVar.c()[2];
        float fCbrt = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f;
        float f18 = (116.0f * fCbrt2) - 16.0f;
        float f19 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f17 > 0.008856452f ? (float) Math.cbrt(f17) : (f17 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 100.0f) {
            f18 = 100.0f;
        }
        if (f19 < -128.0f) {
            f19 = -128.0f;
        }
        if (f19 > 128.0f) {
            f19 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return o1.a(f18, f19, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a15, colorSpace);
    }
}
