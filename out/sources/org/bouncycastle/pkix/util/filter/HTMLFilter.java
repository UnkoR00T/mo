package org.bouncycastle.pkix.util.filter;

import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes5.dex */
public class HTMLFilter implements Filter {
    @Override // org.bouncycastle.pkix.util.filter.Filter
    public String doFilter(String str) {
        int i15;
        String str2;
        StringBuilder sb5 = new StringBuilder(str);
        int i16 = 0;
        while (i16 < sb5.length()) {
            char cCharAt = sb5.charAt(i16);
            if (cCharAt == '\"') {
                i15 = i16 + 1;
                str2 = "&#34";
            } else if (cCharAt == '#') {
                i15 = i16 + 1;
                str2 = "&#35";
            } else if (cCharAt == '+') {
                i15 = i16 + 1;
                str2 = "&#43";
            } else if (cCharAt == '-') {
                i15 = i16 + 1;
                str2 = "&#45";
            } else if (cCharAt == '>') {
                i15 = i16 + 1;
                str2 = "&#62";
            } else if (cCharAt == ';') {
                i15 = i16 + 1;
                str2 = "&#59";
            } else if (cCharAt != '<') {
                switch (cCharAt) {
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        i15 = i16 + 1;
                        str2 = "&#37";
                        break;
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        i15 = i16 + 1;
                        str2 = "&#38";
                        break;
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        i15 = i16 + 1;
                        str2 = "&#39";
                        break;
                    case '(':
                        i15 = i16 + 1;
                        str2 = "&#40";
                        break;
                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        i15 = i16 + 1;
                        str2 = "&#41";
                        break;
                    default:
                        i16 -= 3;
                        continue;
                        i16 += 4;
                        break;
                }
            } else {
                i15 = i16 + 1;
                str2 = "&#60";
            }
            sb5.replace(i16, i15, str2);
            i16 += 4;
        }
        return sb5.toString();
    }

    @Override // org.bouncycastle.pkix.util.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
