package org.bouncycastle.mime.smime;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.mime.CanonicalOutputStream;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeContext;
import org.bouncycastle.mime.MimeMultipartContext;
import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.io.TeeInputStream;
import org.bouncycastle.util.io.TeeOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class SMimeMultipartContext implements MimeMultipartContext {
    private DigestCalculator[] calculators;
    private final SMimeParserContext parserContext;

    public SMimeMultipartContext(MimeParserContext mimeParserContext, Headers headers) {
        this.parserContext = (SMimeParserContext) mimeParserContext;
        this.calculators = createDigestCalculators(headers);
    }

    private DigestCalculator[] createDigestCalculators(Headers headers) {
        try {
            String str = headers.getContentTypeAttributes().get("micalg");
            if (str == null) {
                throw new IllegalStateException("No micalg field on content-type header");
            }
            String[] strArrSplit = str.substring(str.indexOf(61) + 1).split(",");
            DigestCalculator[] digestCalculatorArr = new DigestCalculator[strArrSplit.length];
            for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                digestCalculatorArr[i15] = this.parserContext.getDigestCalculatorProvider().get(new AlgorithmIdentifier(SMimeUtils.getDigestOID(SMimeUtils.lessQuotes(strArrSplit[i15]).trim())));
            }
            return digestCalculatorArr;
        } catch (OperatorCreationException unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.mime.MimeContext
    public InputStream applyContext(Headers headers, InputStream inputStream) {
        return inputStream;
    }

    @Override // org.bouncycastle.mime.MimeMultipartContext
    public MimeContext createContext(final int i15) {
        return new MimeContext() { // from class: org.bouncycastle.mime.smime.SMimeMultipartContext.1
            @Override // org.bouncycastle.mime.MimeContext
            public InputStream applyContext(Headers headers, InputStream inputStream) throws IOException {
                if (i15 != 0) {
                    return inputStream;
                }
                OutputStream digestOutputStream = SMimeMultipartContext.this.getDigestOutputStream();
                headers.dumpHeaders(digestOutputStream);
                digestOutputStream.write(13);
                digestOutputStream.write(10);
                return new TeeInputStream(inputStream, new CanonicalOutputStream(SMimeMultipartContext.this.parserContext, headers, digestOutputStream));
            }
        };
    }

    DigestCalculator[] getDigestCalculators() {
        return this.calculators;
    }

    OutputStream getDigestOutputStream() {
        DigestCalculator[] digestCalculatorArr = this.calculators;
        int i15 = 1;
        if (digestCalculatorArr.length == 1) {
            return digestCalculatorArr[0].getOutputStream();
        }
        OutputStream outputStream = digestCalculatorArr[0].getOutputStream();
        while (i15 < this.calculators.length) {
            TeeOutputStream teeOutputStream = new TeeOutputStream(this.calculators[i15].getOutputStream(), outputStream);
            i15++;
            outputStream = teeOutputStream;
        }
        return outputStream;
    }
}
