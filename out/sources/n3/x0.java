package n3;

import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a7\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010 \u001a\u00020\u001f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b \u0010!\u001a3\u0010&\u001a\u00060\nj\u0002`\u000b2\n\u0010\"\u001a\u00060\nj\u0002`\u000b2\n\u0010#\u001a\u00060\nj\u0002`\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'*\n\u0010(\"\u00020\n2\u00020\n¨\u0006)"}, d2 = {"Lm3/e;", "from", "to", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/k;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "Ln3/b2;", "image", "tileModeX", "tileModeY", "b", "(Ln3/b2;II)Landroid/graphics/Shader;", "", "d", "(Ljava/util/List;)I", "numTransparentColors", "", "e", "(Ljava/util/List;I)[I", "stops", "", "f", "(Ljava/util/List;Ljava/util/List;I)[F", "Loq/i0;", "g", "(Ljava/util/List;Ljava/util/List;)V", "dst", "src", "Ln3/a1;", "blendMode", "a", "(Landroid/graphics/Shader;Landroid/graphics/Shader;I)Landroid/graphics/Shader;", "Shader", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x0 {
    public static final Shader a(Shader shader, Shader shader2, int i15) {
        if (Build.VERSION.SDK_INT < 29) {
            return new ComposeShader(shader, shader2, d0.b(i15));
        }
        w0.a();
        return v0.a(shader, shader2, d0.a(i15));
    }

    public static final Shader b(b2 b2Var, int i15, int i16) {
        return new BitmapShader(l0.b(b2Var), androidx.compose.ui.graphics.b.a(i15), androidx.compose.ui.graphics.b.a(i16));
    }

    public static final Shader c(long j15, long j16, List<Color> list, List<Float> list2, int i15) {
        g(list, list2);
        int iD = d(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j16 >> 32)), Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)), e(list, iD), f(list2, list, iD), androidx.compose.ui.graphics.b.a(i15));
    }

    public static final int d(List<Color> list) {
        return 0;
    }

    public static final int[] e(List<Color> list, int i15) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i16 = 0; i16 < size; i16++) {
            iArr[i16] = o1.j(list.get(i16).m20unboximpl());
        }
        return iArr;
    }

    public static final float[] f(List<Float> list, List<Color> list2, int i15) {
        if (i15 == 0) {
            if (list != null) {
                return pq.v.c1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i15];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iP = pq.v.p(list2);
        int i16 = 1;
        for (int i17 = 1; i17 < iP; i17++) {
            long jM20unboximpl = list2.get(i17).m20unboximpl();
            float fFloatValue = list != null ? list.get(i17).floatValue() : i17 / pq.v.p(list2);
            int i18 = i16 + 1;
            fArr[i16] = fFloatValue;
            if (Color.m12getAlphaimpl(jM20unboximpl) == 0.0f) {
                i16 += 2;
                fArr[i18] = fFloatValue;
            } else {
                i16 = i18;
            }
        }
        fArr[i16] = list != null ? list.get(pq.v.p(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void g(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
