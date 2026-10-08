package w0;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw0/b1;", "Ln3/y2;", "<init>", "()V", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ln3/i2;", "a", "(JLc5/t;Lc5/d;)Ln3/i2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b1 implements n3.y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f208823b = new b1();

    private b1() {
    }

    @Override // n3.y2
    public n3.i2 a(long size, c5.t layoutDirection, c5.d density) {
        float fX0 = density.X0(f0.b());
        return new n3.i2.b(new m3.g(0.0f, -fX0, Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)) + fX0));
    }
}
