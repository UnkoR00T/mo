package org.bouncycastle.asn1.eac;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class Flags {
    int value;

    private static class StringJoiner {
        boolean First = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        StringBuilder f148858b = new StringBuilder();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f148858b.append(this.mSeparator);
            }
            this.f148858b.append(str);
        }

        public String toString() {
            return this.f148858b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i15) {
        return (i15 & this.value) != 0;
    }

    public void set(int i15) {
        this.value = i15 | this.value;
    }

    public Flags(int i15) {
        this.value = i15;
    }
}
