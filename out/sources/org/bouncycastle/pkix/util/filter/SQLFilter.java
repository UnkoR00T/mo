package org.bouncycastle.pkix.util.filter;

/* JADX INFO: loaded from: classes5.dex */
public class SQLFilter implements Filter {
    @Override // org.bouncycastle.pkix.util.filter.Filter
    public String doFilter(String str) {
        int i15;
        String str2;
        StringBuilder sb5 = new StringBuilder(str);
        int i16 = 0;
        while (i16 < sb5.length()) {
            char cCharAt = sb5.charAt(i16);
            if (cCharAt == '\n') {
                i15 = i16 + 1;
                str2 = "\\n";
            } else if (cCharAt == '\r') {
                i15 = i16 + 1;
                str2 = "\\r";
            } else if (cCharAt == '\"') {
                i15 = i16 + 1;
                str2 = "\\\"";
            } else if (cCharAt == '\'') {
                i15 = i16 + 1;
                str2 = "\\'";
            } else if (cCharAt == '-') {
                i15 = i16 + 1;
                str2 = "\\-";
            } else if (cCharAt == '/') {
                i15 = i16 + 1;
                str2 = "\\/";
            } else if (cCharAt == ';') {
                i15 = i16 + 1;
                str2 = "\\;";
            } else if (cCharAt != '=') {
                if (cCharAt == '\\') {
                    i15 = i16 + 1;
                    str2 = "\\\\";
                }
                i16++;
            } else {
                i15 = i16 + 1;
                str2 = "\\=";
            }
            sb5.replace(i16, i15, str2);
            i16 = i15;
            i16++;
        }
        return sb5.toString();
    }

    @Override // org.bouncycastle.pkix.util.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
