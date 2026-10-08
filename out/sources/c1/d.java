package c1;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import b5.k;
import c5.v;
import c5.x;
import n3.Shadow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import q4.SpanStyle;
import u4.FontWeight;
import u4.y;
import u4.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u0010\u001bJ\u0015\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u0010\"J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010\u0010J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0006¢\u0006\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@¨\u0006B"}, d2 = {"Lc1/d;", "", "<init>", "()V", "Loq/i0;", "q", "", "p", "()Ljava/lang/String;", "Lq4/h3;", "spanStyle", "h", "(Lq4/h3;)V", "Landroidx/compose/ui/graphics/Color;", "color", "m", "(J)V", "Lc5/v;", "textUnit", "j", "Lu4/d0;", "fontWeight", "i", "(Lu4/d0;)V", "Lu4/y;", "fontStyle", "o", "(I)V", "Lu4/z;", "fontSynthesis", "l", "Lb5/a;", "baselineShift", "k", "(F)V", "Lb5/q;", "textGeometricTransform", "e", "(Lb5/q;)V", "Lb5/k;", "textDecoration", "d", "(Lb5/k;)V", "Ln3/w2;", "shadow", "g", "(Ln3/w2;)V", "", "byte", "a", "(B)V", "", "int", "c", "", "float", "b", "Loq/d0;", "uLong", "n", "string", "f", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Parcel parcel = Parcel.obtain();

    public final void a(byte b15) {
        this.parcel.writeByte(b15);
    }

    public final void b(float f15) {
        this.parcel.writeFloat(f15);
    }

    public final void c(int i15) {
        this.parcel.writeInt(i15);
    }

    public final void d(k textDecoration) {
        c(textDecoration.getMask());
    }

    public final void e(TextGeometricTransform textGeometricTransform) {
        b(textGeometricTransform.getScaleX());
        b(textGeometricTransform.getSkewX());
    }

    public final void f(String string) {
        this.parcel.writeString(string);
    }

    public final void g(Shadow shadow) {
        m(shadow.getColor());
        b(Float.intBitsToFloat((int) (shadow.getOffset() >> 32)));
        b(Float.intBitsToFloat((int) (shadow.getOffset() & BodyPartID.bodyIdMax)));
        b(shadow.getBlurRadius());
    }

    public final void h(SpanStyle spanStyle) {
        long jG = spanStyle.g();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m11equalsimpl0(jG, companion.h())) {
            a((byte) 1);
            m(spanStyle.g());
        }
        long fontSize = spanStyle.getFontSize();
        v.Companion companion2 = v.INSTANCE;
        if (!v.e(fontSize, companion2.a())) {
            a((byte) 2);
            j(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            a((byte) 3);
            i(fontWeight);
        }
        y fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int value = fontStyle.getValue();
            a((byte) 4);
            o(value);
        }
        z fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value2 = fontSynthesis.getValue();
            a((byte) 5);
            l(value2);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            a((byte) 6);
            f(fontFeatureSettings);
        }
        if (!v.e(spanStyle.getLetterSpacing(), companion2.a())) {
            a((byte) 7);
            j(spanStyle.getLetterSpacing());
        }
        b5.a baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float multiplier = baselineShift.getMultiplier();
            a((byte) 8);
            k(multiplier);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            a((byte) 9);
            e(textGeometricTransform);
        }
        if (!Color.m11equalsimpl0(spanStyle.getBackground(), companion.h())) {
            a((byte) 10);
            m(spanStyle.getBackground());
        }
        k textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            a((byte) 11);
            d(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            a((byte) 12);
            g(shadow);
        }
    }

    public final void i(FontWeight fontWeight) {
        c(fontWeight.p());
    }

    public final void j(long textUnit) {
        long jG = v.g(textUnit);
        x.Companion companion = x.INSTANCE;
        byte b15 = 0;
        if (!x.g(jG, companion.c())) {
            if (x.g(jG, companion.b())) {
                b15 = 1;
            } else if (x.g(jG, companion.a())) {
                b15 = 2;
            }
        }
        a(b15);
        if (x.g(v.g(textUnit), companion.c())) {
            return;
        }
        b(v.h(textUnit));
    }

    public final void k(float baselineShift) {
        b(baselineShift);
    }

    public final void l(int fontSynthesis) {
        z.Companion companion = z.INSTANCE;
        byte b15 = 0;
        if (!z.h(fontSynthesis, companion.b())) {
            if (z.h(fontSynthesis, companion.a())) {
                b15 = 1;
            } else if (z.h(fontSynthesis, companion.d())) {
                b15 = 2;
            } else if (z.h(fontSynthesis, companion.c())) {
                b15 = 3;
            }
        }
        a(b15);
    }

    public final void m(long color) {
        n(color);
    }

    public final void n(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void o(int fontStyle) {
        y.Companion companion = y.INSTANCE;
        byte b15 = 0;
        if (!y.f(fontStyle, companion.b()) && y.f(fontStyle, companion.a())) {
            b15 = 1;
        }
        a(b15);
    }

    public final String p() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void q() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }
}
