package io;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class n {
    public static List<X509Certificate> a(List<a> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (list.get(i15) != null) {
                try {
                    linkedList.add(o.a(list.get(i15).a()));
                } catch (CertificateException e15) {
                    throw new ParseException("Invalid X.509 certificate at position " + i15 + ": " + e15.getMessage(), 0);
                }
            }
        }
        return linkedList;
    }

    public static List<a> b(List<Object> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i15 = 0; i15 < list.size(); i15++) {
            Object obj = list.get(i15);
            if (obj == null) {
                throw new ParseException("The X.509 certificate at position " + i15 + " must not be null", 0);
            }
            if (!(obj instanceof String)) {
                throw new ParseException("The X.509 certificate at position " + i15 + " must be encoded as a Base64 string", 0);
            }
            linkedList.add(new a((String) obj));
        }
        return linkedList;
    }
}
