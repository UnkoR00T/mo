package org.bouncycastle.tsp;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.tsp.Accuracy;

/* JADX INFO: loaded from: classes5.dex */
public class GenTimeAccuracy {
    private Accuracy accuracy;

    public GenTimeAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    private String format(int i15) {
        StringBuilder sb5;
        String str;
        if (i15 < 10) {
            sb5 = new StringBuilder();
            str = "00";
        } else {
            if (i15 >= 100) {
                return Integer.toString(i15);
            }
            sb5 = new StringBuilder();
            str = d.f37012h1;
        }
        sb5.append(str);
        sb5.append(i15);
        return sb5.toString();
    }

    private int getTimeComponent(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            return aSN1Integer.intValueExact();
        }
        return 0;
    }

    public int getMicros() {
        return getTimeComponent(this.accuracy.getMicros());
    }

    public int getMillis() {
        return getTimeComponent(this.accuracy.getMillis());
    }

    public int getSeconds() {
        return getTimeComponent(this.accuracy.getSeconds());
    }

    public String toString() {
        return getSeconds() + "." + format(getMillis()) + format(getMicros());
    }
}
