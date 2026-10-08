package org.bouncycastle.est;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class ESTResponse {
    private static final Long ZERO = 0L;
    private String HttpVersion;
    private Long absoluteReadLimit;
    private Long contentLength;
    private final HttpUtil.Headers headers;
    private InputStream inputStream;
    private final byte[] lineBuffer;
    private final ESTRequest originalRequest;
    private long read = 0;
    private final Source source;
    private int statusCode;
    private String statusMessage;

    private static class PrintingInputStream extends InputStream {
        private final InputStream src;

        private PrintingInputStream(InputStream inputStream) {
            this.src = inputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.src.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.src.close();
        }

        @Override // java.io.InputStream
        public int read() {
            return this.src.read();
        }
    }

    public ESTResponse(ESTRequest eSTRequest, Source source) throws IOException {
        this.originalRequest = eSTRequest;
        this.source = source;
        if (source instanceof LimitedSource) {
            this.absoluteReadLimit = ((LimitedSource) source).getAbsoluteReadLimit();
        }
        Set<String> setAsKeySet = Properties.asKeySet("org.bouncycastle.debug.est");
        this.inputStream = (setAsKeySet.contains("input") || setAsKeySet.contains("all")) ? new PrintingInputStream(source.getInputStream()) : source.getInputStream();
        this.headers = new HttpUtil.Headers();
        this.lineBuffer = new byte[1024];
        process();
    }

    static /* synthetic */ long access$108(ESTResponse eSTResponse) {
        long j15 = eSTResponse.read;
        eSTResponse.read = 1 + j15;
        return j15;
    }

    private void process() throws IOException {
        this.HttpVersion = readStringIncluding(' ');
        this.statusCode = Integer.parseInt(readStringIncluding(' '));
        this.statusMessage = readStringIncluding('\n');
        while (true) {
            String stringIncluding = readStringIncluding('\n');
            if (stringIncluding.length() <= 0) {
                break;
            }
            int iIndexOf = stringIncluding.indexOf(58);
            if (iIndexOf > -1) {
                this.headers.add(Strings.toLowerCase(stringIncluding.substring(0, iIndexOf).trim()), stringIncluding.substring(iIndexOf + 1).trim());
            }
        }
        boolean zEqualsIgnoreCase = this.headers.getFirstValueOrEmpty("Transfer-Encoding").equalsIgnoreCase("chunked");
        if (zEqualsIgnoreCase) {
            this.contentLength = 0L;
        } else {
            this.contentLength = getContentLength();
        }
        int i15 = this.statusCode;
        if (i15 == 204 || i15 == 202) {
            Long l15 = this.contentLength;
            if (l15 == null) {
                this.contentLength = 0L;
            } else if (i15 == 204 && l15.longValue() > 0) {
                throw new IOException("Got HTTP status 204 but Content-length > 0.");
            }
        }
        Long l16 = this.contentLength;
        if (l16 == null) {
            throw new IOException("No Content-length header.");
        }
        if (l16.equals(ZERO) && !zEqualsIgnoreCase) {
            this.inputStream = new InputStream() { // from class: org.bouncycastle.est.ESTResponse.1
                @Override // java.io.InputStream
                public int read() {
                    return -1;
                }
            };
        }
        if (this.contentLength.longValue() < 0) {
            throw new IOException("Server returned negative content length: " + this.absoluteReadLimit);
        }
        if (this.absoluteReadLimit != null && this.contentLength.longValue() >= this.absoluteReadLimit.longValue()) {
            throw new IOException("Content length longer than absolute read limit: " + this.absoluteReadLimit + " Content-Length: " + this.contentLength);
        }
        this.inputStream = wrapWithCounter(this.inputStream, this.absoluteReadLimit);
        if (zEqualsIgnoreCase) {
            this.inputStream = new CTEChunkedInputStream(this.inputStream);
        }
        if ("base64".equalsIgnoreCase(getHeader("content-transfer-encoding"))) {
            InputStream inputStream = this.inputStream;
            this.inputStream = zEqualsIgnoreCase ? new CTEBase64InputStream(inputStream) : new CTEBase64InputStream(inputStream, this.contentLength);
        }
    }

    public void close() throws IOException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            inputStream.close();
        }
        this.source.close();
    }

    public long getAbsoluteReadLimit() {
        Long l15 = this.absoluteReadLimit;
        if (l15 == null) {
            return Long.MAX_VALUE;
        }
        return l15.longValue();
    }

    public Long getContentLength() {
        String firstValue = this.headers.getFirstValue("Content-Length");
        if (firstValue == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(firstValue));
        } catch (RuntimeException e15) {
            throw new RuntimeException("Content Length: '" + firstValue + "' invalid. " + e15.getMessage());
        }
    }

    public String getHeader(String str) {
        return this.headers.getFirstValue(str);
    }

    public String getHeaderOrEmpty(String str) {
        return this.headers.getFirstValueOrEmpty(str);
    }

    public HttpUtil.Headers getHeaders() {
        return this.headers;
    }

    public String getHttpVersion() {
        return this.HttpVersion;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public ESTRequest getOriginalRequest() {
        return this.originalRequest;
    }

    public Source getSource() {
        return this.source;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    protected String readStringIncluding(char c15) throws IOException {
        int i15 = 0;
        while (true) {
            int i16 = this.inputStream.read();
            byte[] bArr = this.lineBuffer;
            int i17 = i15 + 1;
            bArr[i15] = (byte) i16;
            if (i17 >= bArr.length) {
                throw new IOException("Server sent line > " + this.lineBuffer.length);
            }
            if (i16 == c15 || i16 <= -1) {
                if (i16 != -1) {
                    return new String(bArr, 0, i17).trim();
                }
                throw new EOFException();
            }
            i15 = i17;
        }
    }

    protected InputStream wrapWithCounter(final InputStream inputStream, final Long l15) {
        return new InputStream() { // from class: org.bouncycastle.est.ESTResponse.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (ESTResponse.this.contentLength == null || ESTResponse.this.contentLength.longValue() - 1 <= ESTResponse.this.read) {
                    if (inputStream.available() > 0) {
                        throw new IOException("Stream closed with extra content in pipe that exceeds content length.");
                    }
                    inputStream.close();
                } else {
                    throw new IOException("Stream closed before limit fully read, Read: " + ESTResponse.this.read + " ContentLength: " + ESTResponse.this.contentLength);
                }
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i15 = inputStream.read();
                if (i15 > -1) {
                    ESTResponse.access$108(ESTResponse.this);
                    if (l15 != null && ESTResponse.this.read >= l15.longValue()) {
                        throw new IOException("Absolute Read Limit exceeded: " + l15);
                    }
                }
                return i15;
            }
        };
    }
}
