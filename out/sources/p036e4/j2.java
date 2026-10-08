package p036e4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le4/a2$a;", "", "useGreater", "", "Le4/i2;", "rulers", "", "defaultValue", "b", "(Le4/a2$a;Z[Le4/i2;F)F", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static final float b(a2.a aVar, boolean z15, i2[] i2VarArr, float f15) {
        float f16 = Float.NaN;
        for (i2 i2Var : i2VarArr) {
            float fI = aVar.i(i2Var, Float.NaN);
            if (Float.isNaN(f16)) {
                f16 = fI;
            } else if (z15 == (fI > f16)) {
                f16 = fI;
            }
        }
        return Float.isNaN(f16) ? f15 : f16;
    }
}
