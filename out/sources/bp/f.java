package bp;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public class f extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigDecimal f20673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20674e;

    public f(float f15) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f15));
        this.f20673d = bigDecimal;
        this.f20674e = h4(bigDecimal.toPlainString());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    private void g4() {
        float fFloatValue = this.f20673d.floatValue();
        double dDoubleValue = this.f20673d.doubleValue();
        boolean z15 = true;
        if (fFloatValue == Float.NEGATIVE_INFINITY || fFloatValue == Float.POSITIVE_INFINITY) {
            if (Math.abs(dDoubleValue) > 3.4028234663852886E38d) {
                fFloatValue = (fFloatValue == Float.POSITIVE_INFINITY ? 1 : -1) * Float.MAX_VALUE;
            } else {
                z15 = false;
            }
        } else if (fFloatValue != 0.0f || dDoubleValue == 0.0d || Math.abs(dDoubleValue) >= 1.1754943508222875E-38d) {
            z15 = false;
        }
        if (z15) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(fFloatValue);
            this.f20673d = bigDecimalValueOf;
            this.f20674e = h4(bigDecimalValueOf.toPlainString());
        }
    }

    private String h4(String str) {
        if (str.indexOf(46) > -1 && !str.endsWith(".0")) {
            while (str.endsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1) && !str.endsWith(".0")) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.r(this);
    }

    @Override // bp.k
    public int J3() {
        return this.f20673d.intValue();
    }

    @Override // bp.k
    public long X3() {
        return this.f20673d.longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && Float.floatToIntBits(((f) obj).f20673d.floatValue()) == Float.floatToIntBits(this.f20673d.floatValue());
    }

    public int hashCode() {
        return this.f20673d.hashCode();
    }

    @Override // bp.k
    public float i3() {
        return this.f20673d.floatValue();
    }

    public void i4(OutputStream outputStream) throws IOException {
        outputStream.write(this.f20674e.getBytes("ISO-8859-1"));
    }

    public String toString() {
        return "COSFloat{" + this.f20674e + "}";
    }

    public f(String str) throws IOException {
        try {
            this.f20674e = str;
            this.f20673d = new BigDecimal(this.f20674e);
            g4();
        } catch (NumberFormatException e15) {
            if (str.startsWith("--")) {
                this.f20674e = str.substring(1);
            } else if (str.matches("^0\\.0*\\-\\d+")) {
                this.f20674e = "-" + this.f20674e.replaceFirst("\\-", "");
            } else {
                throw new IOException("Error expected floating point number actual='" + str + "'", e15);
            }
            try {
                this.f20673d = new BigDecimal(this.f20674e);
                g4();
            } catch (NumberFormatException e16) {
                throw new IOException("Error expected floating point number actual='" + str + "'", e16);
            }
        }
    }
}
