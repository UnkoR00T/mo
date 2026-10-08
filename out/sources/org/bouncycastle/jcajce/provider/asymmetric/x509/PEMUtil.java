package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes5.dex */
class PEMUtil {
    private final Boundaries[] _supportedBoundaries;

    private static class Boundaries {
        private final String _footer;
        private final String _header;

        private Boundaries(String str) {
            this._header = "-----BEGIN " + str + "-----";
            this._footer = "-----END " + str + "-----";
        }

        public boolean isTheExpectedFooter(String str) {
            return str.startsWith(this._footer);
        }

        public boolean isTheExpectedHeader(String str) {
            return str.startsWith(this._header);
        }
    }

    PEMUtil(String str) {
        this._supportedBoundaries = new Boundaries[]{new Boundaries(str), new Boundaries("X509 " + str), new Boundaries(PEMParser.TYPE_PKCS7)};
    }

    private Boundaries getBoundaries(String str) {
        int i15 = 0;
        while (true) {
            Boundaries[] boundariesArr = this._supportedBoundaries;
            if (i15 == boundariesArr.length) {
                return null;
            }
            Boundaries boundaries = boundariesArr[i15];
            if (boundaries.isTheExpectedHeader(str) || boundaries.isTheExpectedFooter(str)) {
                return boundaries;
            }
            i15++;
        }
    }

    private String readLine(InputStream inputStream) throws IOException {
        int i15;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i15 = inputStream.read();
            if (i15 != 13 && i15 != 10 && i15 >= 0) {
                stringBuffer.append((char) i15);
            } else if (i15 < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i15 < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (i15 == 13) {
            inputStream.mark(1);
            int i16 = inputStream.read();
            if (i16 == 10) {
                inputStream.mark(1);
            }
            if (i16 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    ASN1Sequence readPEMObject(InputStream inputStream, boolean z15) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        Boundaries boundaries = null;
        while (boundaries == null) {
            String line = readLine(inputStream);
            if (line == null) {
                break;
            }
            boundaries = getBoundaries(line);
            if (boundaries != null && !boundaries.isTheExpectedHeader(line)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (boundaries == null) {
            if (z15) {
                throw new IOException("malformed PEM data: no header found");
            }
            return null;
        }
        Boundaries boundaries2 = null;
        while (boundaries2 == null) {
            String line2 = readLine(inputStream);
            if (line2 == null) {
                break;
            }
            boundaries2 = getBoundaries(line2);
            if (boundaries2 == null) {
                stringBuffer.append(line2);
            } else if (!boundaries.isTheExpectedFooter(line2)) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (boundaries2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return ASN1Sequence.getInstance(Base64.decode(stringBuffer.toString()));
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
