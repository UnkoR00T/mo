package org.bouncycastle.asn1.x509;

/* JADX INFO: loaded from: classes5.dex */
public class X509NameTokenizer {
    private StringBuffer buf;
    private int index;
    private char separator;
    private String value;

    public X509NameTokenizer(String str) {
        this(str, ',');
    }

    public boolean hasMoreTokens() {
        return this.index < this.value.length();
    }

    public String nextToken() {
        if (this.index >= this.value.length()) {
            return null;
        }
        int i15 = this.index + 1;
        this.buf.setLength(0);
        boolean z15 = false;
        boolean z16 = false;
        while (i15 != this.value.length()) {
            char cCharAt = this.value.charAt(i15);
            if (cCharAt != '\"') {
                if (!z15 && !z16) {
                    if (cCharAt == '\\') {
                        this.buf.append(cCharAt);
                        z15 = true;
                    } else {
                        if (cCharAt == this.separator) {
                            break;
                        }
                        this.buf.append(cCharAt);
                    }
                }
                i15++;
            } else if (!z15) {
                z16 = !z16;
            }
            this.buf.append(cCharAt);
            z15 = false;
            i15++;
        }
        this.index = i15;
        return this.buf.toString();
    }

    public X509NameTokenizer(String str, char c15) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = str.length() < 1 ? 0 : -1;
        this.separator = c15;
    }
}
