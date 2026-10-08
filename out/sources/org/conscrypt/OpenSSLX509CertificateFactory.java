package org.conscrypt;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSSLX509CertificateFactory extends CertificateFactorySpi {
    private static final int DASH = 45;
    private static final int PUSHBACK_SIZE = 64;
    private static final int VALUE_0 = 48;
    private Parser<OpenSSLX509Certificate> certificateParser = new Parser<OpenSSLX509Certificate>() { // from class: org.conscrypt.OpenSSLX509CertificateFactory.1
        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List<? extends OpenSSLX509Certificate> fromPkcs7DerInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromPkcs7DerInputStream(inputStream);
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List<? extends OpenSSLX509Certificate> fromPkcs7PemInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromPkcs7PemInputStream(inputStream);
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public OpenSSLX509Certificate fromX509DerInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromX509DerInputStream(inputStream);
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public OpenSSLX509Certificate fromX509PemInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromX509PemInputStream(inputStream);
        }
    };
    private Parser<OpenSSLX509CRL> crlParser = new Parser<OpenSSLX509CRL>() { // from class: org.conscrypt.OpenSSLX509CertificateFactory.2
        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List<? extends OpenSSLX509CRL> fromPkcs7DerInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromPkcs7DerInputStream(inputStream);
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List<? extends OpenSSLX509CRL> fromPkcs7PemInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromPkcs7PemInputStream(inputStream);
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public OpenSSLX509CRL fromX509DerInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromX509DerInputStream(inputStream);
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public OpenSSLX509CRL fromX509PemInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromX509PemInputStream(inputStream);
        }
    };
    private static final byte[] PKCS7_MARKER = {45, 45, 45, 45, 45, 66, 69, 71, 73, 78, 32, 80, 75, 67, 83, 55};
    private static final byte[] PEM_MARKER = {45, 45, 45, 45, 45, 66, 69, 71, 73, 78, 32};

    private static abstract class Parser<T> {
        private Parser() {
        }

        protected abstract List<? extends T> fromPkcs7DerInputStream(InputStream inputStream);

        protected abstract List<? extends T> fromPkcs7PemInputStream(InputStream inputStream);

        protected abstract T fromX509DerInputStream(InputStream inputStream);

        protected abstract T fromX509PemInputStream(InputStream inputStream);

        T generateItem(InputStream inputStream) throws ParsingException {
            if (inputStream == null) {
                throw new ParsingException("inStream == null");
            }
            boolean zMarkSupported = inputStream.markSupported();
            if (zMarkSupported) {
                inputStream.mark(OpenSSLX509CertificateFactory.PKCS7_MARKER.length);
            }
            PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 64);
            try {
                byte[] bArr = new byte[OpenSSLX509CertificateFactory.PKCS7_MARKER.length];
                int i15 = pushbackInputStream.read(bArr);
                if (i15 < 0) {
                    throw new ParsingException("inStream is empty");
                }
                pushbackInputStream.unread(bArr, 0, i15);
                if (bArr[0] == 45) {
                    return fromX509PemInputStream(pushbackInputStream);
                }
                if (OpenSSLX509CertificateFactory.isMaybePkcs7(bArr)) {
                    List<? extends T> listFromPkcs7DerInputStream = fromPkcs7DerInputStream(pushbackInputStream);
                    if (listFromPkcs7DerInputStream.size() == 0) {
                        return null;
                    }
                    return listFromPkcs7DerInputStream.get(0);
                }
                if (bArr[0] == 48) {
                    return fromX509DerInputStream(pushbackInputStream);
                }
                byte[] bArr2 = new byte[OpenSSLX509CertificateFactory.PEM_MARKER.length];
                int i16 = 0;
                while (i16 != -1) {
                    i16 = pushbackInputStream.read();
                    if (i16 == 45) {
                        pushbackInputStream.unread(i16);
                        int i17 = pushbackInputStream.read(bArr2);
                        if (i17 < OpenSSLX509CertificateFactory.PEM_MARKER.length) {
                            throw new ParsingException("No certificate found");
                        }
                        pushbackInputStream.unread(bArr2, 0, i17);
                        if (Arrays.equals(bArr2, OpenSSLX509CertificateFactory.PEM_MARKER)) {
                            return fromX509PemInputStream(pushbackInputStream);
                        }
                        pushbackInputStream.read();
                    }
                }
                throw new ParsingException("No certificate found");
            } catch (Exception e15) {
                if (zMarkSupported) {
                    try {
                        inputStream.reset();
                    } catch (IOException unused) {
                    }
                }
                throw new ParsingException(e15);
            }
        }

        Collection<? extends T> generateItems(InputStream inputStream) throws ParsingException {
            T tGenerateItem;
            if (inputStream == null) {
                throw new ParsingException("inStream == null");
            }
            boolean zMarkSupported = inputStream.markSupported();
            if (zMarkSupported) {
                inputStream.mark(64);
            }
            PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 64);
            try {
                byte[] bArr = new byte[OpenSSLX509CertificateFactory.PKCS7_MARKER.length];
                int i15 = pushbackInputStream.read(bArr);
                if (i15 < 0) {
                    return new ArrayList();
                }
                pushbackInputStream.unread(bArr, 0, i15);
                if (i15 == OpenSSLX509CertificateFactory.PKCS7_MARKER.length && Arrays.equals(OpenSSLX509CertificateFactory.PKCS7_MARKER, bArr)) {
                    return fromPkcs7PemInputStream(pushbackInputStream);
                }
                if (OpenSSLX509CertificateFactory.isMaybePkcs7(bArr)) {
                    return fromPkcs7DerInputStream(pushbackInputStream);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    if (zMarkSupported) {
                        inputStream.mark(64);
                    }
                    try {
                        tGenerateItem = generateItem(pushbackInputStream);
                        arrayList.add(tGenerateItem);
                    } catch (ParsingException unused) {
                        if (zMarkSupported) {
                            try {
                                inputStream.reset();
                            } catch (IOException unused2) {
                            }
                        }
                        tGenerateItem = null;
                    }
                } while (tGenerateItem != null);
                return arrayList;
            } catch (Exception e15) {
                if (zMarkSupported) {
                    try {
                        inputStream.reset();
                    } catch (IOException unused3) {
                    }
                }
                throw new ParsingException(e15);
            }
        }
    }

    static class ParsingException extends Exception {
        private static final long serialVersionUID = 8390802697728301325L;

        ParsingException(String str) {
            super(str);
        }

        ParsingException(Exception exc) {
            super(exc);
        }

        ParsingException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMaybePkcs7(byte[] bArr) {
        int i15 = 2;
        if (bArr.length >= 2 && bArr[0] == 48) {
            int i16 = bArr[1] & 255;
            if (i16 > 128) {
                if (i16 == 129) {
                    i15 = 3;
                } else if (i16 == 130) {
                    i15 = 4;
                } else if (i16 == 131) {
                    i15 = 5;
                } else if (i16 == 132) {
                    i15 = 6;
                }
                if (i15 >= bArr.length && bArr[i15] == 6) {
                    return true;
                }
            } else if (i15 >= bArr.length) {
            }
        }
        return false;
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        try {
            return this.crlParser.generateItem(inputStream);
        } catch (ParsingException e15) {
            throw new CRLException(e15);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection<? extends CRL> engineGenerateCRLs(InputStream inputStream) throws CRLException {
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            return this.crlParser.generateItems(inputStream);
        } catch (ParsingException e15) {
            throw new CRLException(e15);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return OpenSSLX509CertPath.fromEncoding(inputStream);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        try {
            return this.certificateParser.generateItem(inputStream);
        } catch (ParsingException e15) {
            throw new CertificateException(e15);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection<? extends Certificate> engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        try {
            return this.certificateParser.generateItems(inputStream);
        } catch (ParsingException e15) {
            throw new CertificateException(e15);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator<String> engineGetCertPathEncodings() {
        return OpenSSLX509CertPath.getEncodingsIterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return OpenSSLX509CertPath.fromEncoding(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List<? extends Certificate> list) throws CertificateException {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i15 = 0; i15 < list.size(); i15++) {
            Certificate certificate = list.get(i15);
            if (certificate instanceof X509Certificate) {
                arrayList.add((X509Certificate) certificate);
            } else {
                throw new CertificateException("Certificate not X.509 type at index " + i15);
            }
        }
        return new OpenSSLX509CertPath(arrayList);
    }
}
