package org.bouncycastle.asn1.x500.style;

/* JADX INFO: loaded from: classes3.dex */
public class X500NameTokenizer {
    private int index;
    private final char separator;
    private final String value;

    public X500NameTokenizer(String str) {
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
        boolean z15 = false;
        boolean z16 = false;
        while (true) {
            int i16 = this.index + 1;
            this.index = i16;
            if (i16 >= this.value.length()) {
                if (!z15 && !z16) {
                    break;
                }
                throw new IllegalArgumentException("badly formatted directory string");
            }
            char cCharAt = this.value.charAt(this.index);
            if (z15) {
                z15 = false;
            } else if (cCharAt == '\"') {
                z16 = !z16;
            } else if (z16) {
                continue;
            } else if (cCharAt == '\\') {
                z15 = true;
            } else if (cCharAt == this.separator) {
                break;
            }
        }
        return this.value.substring(i15, this.index);
    }

    public X500NameTokenizer(String str, char c15) {
        str.getClass();
        if (c15 == '\"' || c15 == '\\') {
            throw new IllegalArgumentException("reserved separator character");
        }
        this.value = str;
        this.separator = c15;
        this.index = str.length() < 1 ? 0 : -1;
    }
}
