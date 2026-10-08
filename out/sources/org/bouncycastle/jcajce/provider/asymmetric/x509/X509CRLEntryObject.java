package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
class X509CRLEntryObject extends X509CRLEntry {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TBSCertList.CRLEntry f149241c;
    private X500Name certificateIssuer;
    private volatile int hashValue;
    private volatile boolean hashValueSet;

    protected X509CRLEntryObject(TBSCertList.CRLEntry cRLEntry) {
        this.f149241c = cRLEntry;
        this.certificateIssuer = null;
    }

    private Set getExtensionOIDs(boolean z15) {
        Extensions extensions = this.f149241c.getExtensions();
        if (extensions == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (z15 == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    private X500Name loadCertificateIssuer(boolean z15, X500Name x500Name) {
        if (!z15) {
            return null;
        }
        ASN1OctetString extensionValue = Extensions.getExtensionValue(this.f149241c.getExtensions(), Extension.certificateIssuer);
        if (extensionValue == null) {
            return x500Name;
        }
        try {
            GeneralName[] names = GeneralNames.getInstance(extensionValue.getOctets()).getNames();
            for (int i15 = 0; i15 < names.length; i15++) {
                if (names[i15].getTagNo() == 4) {
                    return X500Name.getInstance(names[i15].getName());
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CRLEntryObject)) {
            return super.equals(this);
        }
        X509CRLEntryObject x509CRLEntryObject = (X509CRLEntryObject) obj;
        if (this.hashValueSet && x509CRLEntryObject.hashValueSet && this.hashValue != x509CRLEntryObject.hashValue) {
            return false;
        }
        return this.f149241c.equals(x509CRLEntryObject.f149241c);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        if (this.certificateIssuer == null) {
            return null;
        }
        try {
            return new X500Principal(this.certificateIssuer.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f149241c.getEncoded(ASN1Encoding.DER);
        } catch (IOException e15) {
            throw new CRLException(e15.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return X509SignatureUtil.getExtensionValue(this.f149241c.getExtensions(), str);
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return this.f149241c.getRevocationDate().getDate();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.f149241c.getUserCertificate().getValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.f149241c.getExtensions() != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Extensions extensions = this.f149241c.getExtensions();
        return extensions != null && extensions.hasAnyCriticalExtensions();
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = super.hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        Object generalNames;
        StringBuilder sb5 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        sb5.append("      userCertificate: ");
        sb5.append(getSerialNumber());
        sb5.append(strLineSeparator);
        sb5.append("       revocationDate: ");
        sb5.append(getRevocationDate());
        sb5.append(strLineSeparator);
        sb5.append("       certificateIssuer: ");
        sb5.append(getCertificateIssuer());
        sb5.append(strLineSeparator);
        Extensions extensions = this.f149241c.getExtensions();
        if (extensions != null) {
            Enumeration enumerationOids = extensions.oids();
            if (enumerationOids.hasMoreElements()) {
                String str = "   crlEntryExtensions:";
                loop0: while (true) {
                    sb5.append(str);
                    while (true) {
                        sb5.append(strLineSeparator);
                        while (true) {
                            if (!enumerationOids.hasMoreElements()) {
                                break loop0;
                            }
                            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
                            Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                            if (extension.getExtnValue() != null) {
                                ASN1InputStream aSN1InputStream = new ASN1InputStream(extension.getExtnValue().getOctets());
                                sb5.append("                       critical(");
                                sb5.append(extension.isCritical());
                                sb5.append(") ");
                                try {
                                    if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.reasonCode)) {
                                        generalNames = CRLReason.getInstance(ASN1Enumerated.getInstance(aSN1InputStream.readObject()));
                                    } else {
                                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.certificateIssuer)) {
                                            sb5.append("Certificate issuer: ");
                                            generalNames = GeneralNames.getInstance(aSN1InputStream.readObject());
                                        } else {
                                            sb5.append(aSN1ObjectIdentifier.getId());
                                            sb5.append(" value = ");
                                            sb5.append(ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                                        }
                                        sb5.append(strLineSeparator);
                                    }
                                    sb5.append(generalNames);
                                    sb5.append(strLineSeparator);
                                } catch (Exception unused) {
                                    sb5.append(aSN1ObjectIdentifier.getId());
                                    sb5.append(" value = ");
                                    str = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return sb5.toString();
    }

    protected X509CRLEntryObject(TBSCertList.CRLEntry cRLEntry, boolean z15, X500Name x500Name) {
        this.f149241c = cRLEntry;
        this.certificateIssuer = loadCertificateIssuer(z15, x500Name);
    }
}
