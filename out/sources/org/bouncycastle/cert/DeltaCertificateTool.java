package org.bouncycastle.cert;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.DeltaCertificateDescriptor;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Validity;

/* JADX INFO: loaded from: classes5.dex */
public class DeltaCertificateTool {
    public static Certificate extractDeltaCertificate(TBSCertificate tBSCertificate) {
        Extensions extensions = tBSCertificate.getExtensions();
        Extension extension = extensions.getExtension(Extension.deltaCertificateDescriptor);
        if (extension == null) {
            throw new IllegalStateException("no deltaCertificateDescriptor present");
        }
        DeltaCertificateDescriptor deltaCertificateDescriptor = DeltaCertificateDescriptor.getInstance(extension.getParsedValue());
        ASN1Integer version = tBSCertificate.getVersion();
        ASN1Integer serialNumber = deltaCertificateDescriptor.getSerialNumber();
        AlgorithmIdentifier signature = deltaCertificateDescriptor.getSignature();
        if (signature == null) {
            signature = tBSCertificate.getSignature();
        }
        AlgorithmIdentifier algorithmIdentifier = signature;
        X500Name issuer = deltaCertificateDescriptor.getIssuer();
        if (issuer == null) {
            issuer = tBSCertificate.getIssuer();
        }
        X500Name x500Name = issuer;
        Validity validityObject = deltaCertificateDescriptor.getValidityObject();
        if (validityObject == null) {
            validityObject = tBSCertificate.getValidity();
        }
        Validity validity = validityObject;
        X500Name subject = deltaCertificateDescriptor.getSubject();
        if (subject == null) {
            subject = tBSCertificate.getSubject();
        }
        return new Certificate(new TBSCertificate(version, serialNumber, algorithmIdentifier, x500Name, validity, subject, deltaCertificateDescriptor.getSubjectPublicKeyInfo(), null, null, extractDeltaExtensions(deltaCertificateDescriptor.getExtensions(), extensions)), algorithmIdentifier, deltaCertificateDescriptor.getSignatureValue());
    }

    private static Extensions extractDeltaExtensions(Extensions extensions, Extensions extensions2) {
        ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
        Enumeration enumerationOids = extensions2.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (!Extension.deltaCertificateDescriptor.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                extensionsGenerator.addExtension(extensions2.getExtension(aSN1ObjectIdentifier));
            }
        }
        if (extensions != null) {
            Enumeration enumerationOids2 = extensions.oids();
            while (enumerationOids2.hasMoreElements()) {
                extensionsGenerator.replaceExtension(extensions.getExtension((ASN1ObjectIdentifier) enumerationOids2.nextElement()));
            }
        }
        if (extensionsGenerator.isEmpty()) {
            return null;
        }
        return extensionsGenerator.generate();
    }

    public static Extension makeDeltaCertificateExtension(boolean z15, Certificate certificate) {
        return new Extension(Extension.deltaCertificateDescriptor, z15, new DEROctetString(new DeltaCertificateDescriptor(certificate.getSerialNumber(), certificate.getSignatureAlgorithm(), certificate.getIssuer(), certificate.getValidity(), certificate.getSubject(), certificate.getSubjectPublicKeyInfo(), certificate.getExtensions(), certificate.getSignature()).getEncoded(ASN1Encoding.DER)));
    }

    public static DeltaCertificateDescriptor trimDeltaCertificateDescriptor(DeltaCertificateDescriptor deltaCertificateDescriptor, TBSCertificate tBSCertificate, Extensions extensions) {
        return deltaCertificateDescriptor.trimTo(tBSCertificate, extensions);
    }

    public static X509CertificateHolder extractDeltaCertificate(X509CertificateHolder x509CertificateHolder) {
        return new X509CertificateHolder(extractDeltaCertificate(x509CertificateHolder.getTBSCertificate()));
    }

    public static Extension makeDeltaCertificateExtension(boolean z15, X509CertificateHolder x509CertificateHolder) {
        return makeDeltaCertificateExtension(z15, x509CertificateHolder.toASN1Structure());
    }
}
