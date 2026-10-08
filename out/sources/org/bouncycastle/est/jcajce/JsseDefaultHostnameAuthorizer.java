package org.bouncycastle.est.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.est.ESTException;
import org.bouncycastle.util.IPAddress;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class JsseDefaultHostnameAuthorizer implements JsseHostnameAuthorizer {
    private static Logger LOG = Logger.getLogger(JsseDefaultHostnameAuthorizer.class.getName());
    private final Set<String> knownSuffixes;

    public JsseDefaultHostnameAuthorizer(Set<String> set) {
        this.knownSuffixes = set;
    }

    public static boolean isValidNameMatch(String str, String str2, Set<String> set) throws IOException {
        if (!str2.contains("*")) {
            return str.equalsIgnoreCase(str2);
        }
        int iIndexOf = str2.indexOf(42);
        if (iIndexOf != str2.lastIndexOf("*") || str2.contains("..") || str2.charAt(str2.length() - 1) == '*') {
            return false;
        }
        int iIndexOf2 = str2.indexOf(46, iIndexOf);
        if (set != null && set.contains(Strings.toLowerCase(str2.substring(iIndexOf2)))) {
            throw new IOException("Wildcard `" + str2 + "` matches known public suffix.");
        }
        String lowerCase = Strings.toLowerCase(str2.substring(iIndexOf + 1));
        String lowerCase2 = Strings.toLowerCase(str);
        if (lowerCase2.equals(lowerCase) || lowerCase.length() > lowerCase2.length()) {
            return false;
        }
        if (iIndexOf > 0) {
            return lowerCase2.startsWith(str2.substring(0, iIndexOf)) && lowerCase2.endsWith(lowerCase) && lowerCase2.substring(iIndexOf, lowerCase2.length() - lowerCase.length()).indexOf(46) < 0;
        }
        if (lowerCase2.substring(0, lowerCase2.length() - lowerCase.length()).indexOf(46) > 0) {
            return false;
        }
        return lowerCase2.endsWith(lowerCase);
    }

    @Override // org.bouncycastle.est.jcajce.JsseHostnameAuthorizer
    public boolean verified(String str, SSLSession sSLSession) throws ESTException {
        try {
            return verify(str, (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(sSLSession.getPeerCertificates()[0].getEncoded())));
        } catch (Exception e15) {
            if (e15 instanceof ESTException) {
                throw ((ESTException) e15);
            }
            throw new ESTException(e15.getMessage(), e15);
        }
    }

    public boolean verify(String str, X509Certificate x509Certificate) throws ESTException {
        boolean z15;
        X500Principal subjectX500Principal;
        if (str == null) {
            throw new NullPointerException("'name' cannot be null");
        }
        boolean zIsValidIPv4 = IPAddress.isValidIPv4(str);
        boolean z16 = !zIsValidIPv4 && IPAddress.isValidIPv6(str);
        boolean z17 = zIsValidIPv4 || z16;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                InetAddress byName = null;
                z15 = false;
                for (List<?> list : subjectAlternativeNames) {
                    int iIntValue = ((Integer) list.get(0)).intValue();
                    if (iIntValue == 2) {
                        if (!z17 && isValidNameMatch(str, (String) list.get(1), this.knownSuffixes)) {
                            return true;
                        }
                        z15 = true;
                    } else if (iIntValue != 7) {
                        Logger logger = LOG;
                        Level level = Level.INFO;
                        if (logger.isLoggable(level)) {
                            String hexString = list.get(1) instanceof byte[] ? Hex.toHexString((byte[]) list.get(1)) : list.get(1).toString();
                            LOG.log(level, "ignoring type " + iIntValue + " value = " + hexString);
                        }
                    } else if (z17) {
                        String str2 = (String) list.get(1);
                        if (str.equalsIgnoreCase(str2)) {
                            return true;
                        }
                        if (z16 && IPAddress.isValidIPv6(str2)) {
                            if (byName == null) {
                                try {
                                    byName = InetAddress.getByName(str);
                                } catch (UnknownHostException unused) {
                                    continue;
                                }
                            }
                            if (byName.equals(InetAddress.getByName(str2))) {
                                return true;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                z15 = false;
            }
            if (z17 || z15 || (subjectX500Principal = x509Certificate.getSubjectX500Principal()) == null) {
                return false;
            }
            RDN[] rDNs = X500Name.getInstance(subjectX500Principal.getEncoded()).getRDNs();
            for (int length = rDNs.length - 1; length >= 0; length--) {
                AttributeTypeAndValue[] typesAndValues = rDNs[length].getTypesAndValues();
                for (int i15 = 0; i15 != typesAndValues.length; i15++) {
                    AttributeTypeAndValue attributeTypeAndValue = typesAndValues[i15];
                    if (BCStyle.CN.equals((ASN1Primitive) attributeTypeAndValue.getType())) {
                        ASN1Encodable aSN1Primitive = attributeTypeAndValue.getValue().toASN1Primitive();
                        return (aSN1Primitive instanceof ASN1String) && isValidNameMatch(str, ((ASN1String) aSN1Primitive).getString(), this.knownSuffixes);
                    }
                }
            }
            return false;
        } catch (Exception e15) {
            throw new ESTException(e15.getMessage(), e15);
        }
    }
}
