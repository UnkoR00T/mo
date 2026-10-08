package si;

import android.animation.TypeEvaluator;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public class c implements TypeEvaluator<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f181921a = new c();

    public static c b() {
        return f181921a;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f15, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f16 = ((iIntValue >> 24) & GF2Field.MASK) / 255.0f;
        float f17 = ((iIntValue >> 16) & GF2Field.MASK) / 255.0f;
        float f18 = ((iIntValue >> 8) & GF2Field.MASK) / 255.0f;
        float f19 = (iIntValue & GF2Field.MASK) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f25 = ((iIntValue2 >> 24) & GF2Field.MASK) / 255.0f;
        float f26 = ((iIntValue2 >> 16) & GF2Field.MASK) / 255.0f;
        float f27 = ((iIntValue2 >> 8) & GF2Field.MASK) / 255.0f;
        float f28 = (iIntValue2 & GF2Field.MASK) / 255.0f;
        float fPow = (float) Math.pow(f17, 2.2d);
        float fPow2 = (float) Math.pow(f18, 2.2d);
        float fPow3 = (float) Math.pow(f19, 2.2d);
        float fPow4 = (float) Math.pow(f26, 2.2d);
        float f29 = f16 + ((f25 - f16) * f15);
        float fPow5 = fPow2 + ((((float) Math.pow(f27, 2.2d)) - fPow2) * f15);
        float fPow6 = fPow3 + (f15 * (((float) Math.pow(f28, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f15), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f29 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
