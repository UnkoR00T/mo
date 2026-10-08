package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln3/g2;", "other", "", "a", "([F[F)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x1 {
    public static final boolean a(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[2];
        float f18 = fArr[3];
        float f19 = fArr[4];
        float f25 = fArr[5];
        float f26 = fArr[6];
        float f27 = fArr[7];
        float f28 = fArr[8];
        float f29 = fArr[9];
        float f35 = fArr[10];
        float f36 = fArr[11];
        float f37 = fArr[12];
        float f38 = fArr[13];
        float f39 = fArr[14];
        float f45 = fArr[15];
        float f46 = (f15 * f25) - (f16 * f19);
        float f47 = (f15 * f26) - (f17 * f19);
        float f48 = (f15 * f27) - (f18 * f19);
        float f49 = (f16 * f26) - (f17 * f25);
        float f55 = (f16 * f27) - (f18 * f25);
        float f56 = (f17 * f27) - (f18 * f26);
        float f57 = (f28 * f38) - (f29 * f37);
        float f58 = (f28 * f39) - (f35 * f37);
        float f59 = (f28 * f45) - (f36 * f37);
        float f65 = (f29 * f39) - (f35 * f38);
        float f66 = (f29 * f45) - (f36 * f38);
        float f67 = (f35 * f45) - (f36 * f39);
        float f68 = (((((f46 * f67) - (f47 * f66)) + (f48 * f65)) + (f49 * f59)) - (f55 * f58)) + (f56 * f57);
        if (f68 != 0.0f) {
            float f69 = 1.0f / f68;
            fArr2[0] = (((f25 * f67) - (f26 * f66)) + (f27 * f65)) * f69;
            fArr2[1] = ((((-f16) * f67) + (f17 * f66)) - (f18 * f65)) * f69;
            fArr2[2] = (((f38 * f56) - (f39 * f55)) + (f45 * f49)) * f69;
            fArr2[3] = ((((-f29) * f56) + (f35 * f55)) - (f36 * f49)) * f69;
            float f75 = -f19;
            fArr2[4] = (((f75 * f67) + (f26 * f59)) - (f27 * f58)) * f69;
            fArr2[5] = (((f67 * f15) - (f17 * f59)) + (f18 * f58)) * f69;
            float f76 = -f37;
            fArr2[6] = (((f76 * f56) + (f39 * f48)) - (f45 * f47)) * f69;
            fArr2[7] = (((f56 * f28) - (f35 * f48)) + (f36 * f47)) * f69;
            fArr2[8] = (((f19 * f66) - (f25 * f59)) + (f27 * f57)) * f69;
            fArr2[9] = ((((-f15) * f66) + (f59 * f16)) - (f18 * f57)) * f69;
            fArr2[10] = (((f37 * f55) - (f38 * f48)) + (f45 * f46)) * f69;
            fArr2[11] = ((((-f28) * f55) + (f48 * f29)) - (f36 * f46)) * f69;
            fArr2[12] = (((f75 * f65) + (f25 * f58)) - (f26 * f57)) * f69;
            fArr2[13] = (((f15 * f65) - (f16 * f58)) + (f17 * f57)) * f69;
            fArr2[14] = (((f76 * f49) + (f38 * f47)) - (f39 * f46)) * f69;
            fArr2[15] = (((f28 * f49) - (f29 * f47)) + (f35 * f46)) * f69;
        }
        return !(f68 == 0.0f);
    }
}
