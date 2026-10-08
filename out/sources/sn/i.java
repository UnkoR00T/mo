package sn;

import java.io.Serializable;
import java.text.ParseException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y f182451a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.c[] f182452b = null;

    protected i() {
    }

    public static io.c[] e(String str) {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(".");
        if (iIndexOf == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
        }
        int i15 = iIndexOf + 1;
        int iIndexOf2 = strTrim.indexOf(".", i15);
        if (iIndexOf2 == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        int i16 = iIndexOf2 + 1;
        int iIndexOf3 = strTrim.indexOf(".", i16);
        if (iIndexOf3 == -1) {
            return new io.c[]{new io.c(strTrim.substring(0, iIndexOf)), new io.c(strTrim.substring(i15, iIndexOf2)), new io.c(strTrim.substring(i16))};
        }
        int i17 = iIndexOf3 + 1;
        int iIndexOf4 = strTrim.indexOf(".", i17);
        if (iIndexOf4 == -1) {
            throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
        }
        if (iIndexOf4 == -1 || strTrim.indexOf(".", iIndexOf4 + 1) == -1) {
            return new io.c[]{new io.c(strTrim.substring(0, iIndexOf)), new io.c(strTrim.substring(i15, iIndexOf2)), new io.c(strTrim.substring(i16, iIndexOf3)), new io.c(strTrim.substring(i17, iIndexOf4)), new io.c(strTrim.substring(iIndexOf4 + 1))};
        }
        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
    }

    public String a() {
        if (this.f182452b == null) {
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        for (io.c cVar : this.f182452b) {
            if (sb5.length() > 0) {
                sb5.append('.');
            }
            if (cVar != null) {
                sb5.append(cVar);
            }
        }
        return sb5.toString();
    }

    public y b() {
        return this.f182451a;
    }

    protected void c(io.c... cVarArr) {
        this.f182452b = cVarArr;
    }

    protected void d(y yVar) {
        this.f182451a = yVar;
    }
}
