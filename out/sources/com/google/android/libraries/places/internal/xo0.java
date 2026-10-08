package com.google.android.libraries.places.internal;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes4.dex */
public final class xo0 implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xo0 f34303a = new xo0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f34304b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private xo0() {
    }

    private static List a(X509Certificate x509Certificate, int i15) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i15 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static final boolean b(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String strF = zj.c.f(str2);
            if (!strF.contains("*")) {
                return str.equals(strF);
            }
            if (!strF.startsWith("*.") || strF.indexOf(42, 1) != -1 || str.length() < strF.length() || "*.".equals(strF)) {
                return false;
            }
            String strSubstring = strF.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        String strA;
        if (zj.b0.a(str) == str.length()) {
            try {
                X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
                if (f34304b.matcher(str).matches()) {
                    List listA = a(x509Certificate, 7);
                    int size = listA.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        if (str.equalsIgnoreCase((String) listA.get(i15))) {
                            return true;
                        }
                    }
                    return false;
                }
                String strF = zj.c.f(str);
                List listA2 = a(x509Certificate, 2);
                int size2 = listA2.size();
                int i16 = 0;
                boolean z15 = false;
                while (i16 < size2) {
                    if (b(strF, (String) listA2.get(i16))) {
                        return true;
                    }
                    i16++;
                    z15 = true;
                }
                if (!z15 && (strA = new uo0(x509Certificate.getSubjectX500Principal()).a("cn")) != null) {
                    return b(strF, strA);
                }
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
