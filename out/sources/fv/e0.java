package fv;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import oq.i0;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000e2\u00020\u0001:\u0002\u001e\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lfv/e0;", "Ljava/io/Closeable;", "<init>", "()V", "Ljava/nio/charset/Charset;", "p", "()Ljava/nio/charset/Charset;", "Lfv/x;", "u", "()Lfv/x;", "", "r", "()J", "Ljava/io/InputStream;", "b", "()Ljava/io/InputStream;", "Lvv/g;", "W3", "()Lvv/g;", "", "h", "()[B", "Ljava/io/Reader;", "m", "()Ljava/io/Reader;", "", "C", "()Ljava/lang/String;", "Loq/i0;", "close", "a", "Ljava/io/Reader;", "reader", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfv/e0$a;", "Ljava/io/Reader;", "Lvv/g;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lvv/g;Ljava/nio/charset/Charset;)V", "", "cbuf", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37062n, "len", "read", "([CII)I", "Loq/i0;", "close", "()V", "a", "Lvv/g;", "b", "Ljava/nio/charset/Charset;", "", "c", "Z", "closed", "d", "Ljava/io/Reader;", "delegate", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final vv.g source;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Reader delegate;

        public a(vv.g gVar, Charset charset) {
            this.source = gVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i0 i0Var;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                i0Var = i0.f148189a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.f4(), gv.d.I(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    /* JADX INFO: renamed from: fv.e0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfv/e0$b;", "", "<init>", "()V", "", "Lfv/x;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lfv/e0;", "c", "([BLfv/x;)Lfv/e0;", "Lvv/g;", "", "contentLength", "b", "(Lvv/g;Lfv/x;J)Lfv/e0;", "content", "a", "(Lfv/x;JLvv/g;)Lfv/e0;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: fv.e0$b$a */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"fv/e0$b$a", "Lfv/e0;", "Lfv/x;", "u", "()Lfv/x;", "", "r", "()J", "Lvv/g;", "W3", "()Lvv/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends e0 {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f67343c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f67344d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ vv.g f67345e;

            a(x xVar, long j15, vv.g gVar) {
                this.f67343c = xVar;
                this.f67344d = j15;
                this.f67345e = gVar;
            }

            @Override // fv.e0
            /* JADX INFO: renamed from: W3, reason: from getter */
            public vv.g getF67345e() {
                return this.f67345e;
            }

            @Override // fv.e0
            /* JADX INFO: renamed from: r, reason: from getter */
            public long getF67344d() {
                return this.f67344d;
            }

            @Override // fv.e0
            /* JADX INFO: renamed from: u, reason: from getter */
            public x getF67343c() {
                return this.f67343c;
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ e0 d(Companion companion, byte[] bArr, x xVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                xVar = null;
            }
            return companion.c(bArr, xVar);
        }

        @oq.a
        public final e0 a(x contentType, long contentLength, vv.g content) {
            return b(content, contentType, contentLength);
        }

        public final e0 b(vv.g gVar, x xVar, long j15) {
            return new a(xVar, j15, gVar);
        }

        public final e0 c(byte[] bArr, x xVar) {
            return b(new vv.e().write(bArr), xVar, bArr.length);
        }

        private Companion() {
        }
    }

    private final Charset p() {
        Charset charsetC;
        x f67343c = getF67343c();
        return (f67343c == null || (charsetC = f67343c.c(fu.d.UTF_8)) == null) ? fu.d.UTF_8 : charsetC;
    }

    @oq.a
    public static final e0 y(x xVar, long j15, vv.g gVar) {
        return INSTANCE.a(xVar, j15, gVar);
    }

    public final String C() {
        vv.g f67345e = getF67345e();
        try {
            String strN3 = f67345e.n3(gv.d.I(f67345e, p()));
            ar.b.a(f67345e, null);
            return strN3;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ar.b.a(f67345e, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public abstract vv.g getF67345e();

    public final InputStream b() {
        return getF67345e().f4();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        gv.d.m(getF67345e());
    }

    public final byte[] h() throws IOException {
        long f67344d = getF67344d();
        if (f67344d > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + f67344d);
        }
        vv.g f67345e = getF67345e();
        try {
            byte[] bArrF2 = f67345e.F2();
            ar.b.a(f67345e, null);
            int length = bArrF2.length;
            if (f67344d == -1 || f67344d == length) {
                return bArrF2;
            }
            throw new IOException("Content-Length (" + f67344d + ") and stream length (" + length + ") disagree");
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ar.b.a(f67345e, th4);
                throw th5;
            }
        }
    }

    public final Reader m() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getF67345e(), p());
        this.reader = aVar;
        return aVar;
    }

    /* JADX INFO: renamed from: r */
    public abstract long getF67344d();

    /* JADX INFO: renamed from: u */
    public abstract x getF67343c();
}
