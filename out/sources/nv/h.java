package nv;

import fr.t;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import vv.k0;
import vv.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u0003'),B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lnv/h;", "Ljava/io/Closeable;", "Lvv/g;", "source", "", "client", "<init>", "(Lvv/g;Z)V", "Lnv/h$c;", "handler", "", "length", "flags", "streamId", "Loq/i0;", "y", "(Lnv/h$c;III)V", "padding", "", "Lnv/c;", "u", "(IIII)Ljava/util/List;", "p", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "E", "(Lnv/h$c;I)V", "J", "K", "I", "C", "r", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "m", "(Lnv/h$c;)V", "requireSettings", "h", "(ZLnv/h$c;)Z", "close", "()V", "a", "Lvv/g;", "b", "Z", "Lnv/h$b;", "c", "Lnv/h$b;", "continuation", "Lnv/d$a;", "d", "Lnv/d$a;", "hpackReader", "e", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f139028f = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vv.g source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b continuation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d.a hpackReader;

    /* JADX INFO: renamed from: nv.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnv/h$a;", "", "<init>", "()V", "", "length", "flags", "padding", "b", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final Logger a() {
            return h.f139028f;
        }

        public final int b(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + length);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010$\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\"\u0010'\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019\"\u0004\b&\u0010\u001bR\"\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001b¨\u0006,"}, d2 = {"Lnv/h$b;", "Lvv/k0;", "Lvv/g;", "source", "<init>", "(Lvv/g;)V", "Loq/i0;", "h", "()V", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "Lvv/l0;", "R", "()Lvv/l0;", "close", "a", "Lvv/g;", "", "b", "I", "getLength", "()I", "r", "(I)V", "length", "c", "getFlags", "m", "flags", "d", "getStreamId", "y", "streamId", "e", "p", "left", "f", "getPadding", "u", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final vv.g source;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int flags;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int streamId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int left;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int padding;

        public b(vv.g gVar) {
            this.source = gVar;
        }

        private final void h() throws IOException {
            int i15 = this.streamId;
            int iJ = gv.d.J(this.source);
            this.left = iJ;
            this.length = iJ;
            int iD = gv.d.d(this.source.readByte(), GF2Field.MASK);
            this.flags = gv.d.d(this.source.readByte(), GF2Field.MASK);
            Companion companion = h.INSTANCE;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(e.f138943a.c(true, this.streamId, this.length, iD, this.flags));
            }
            int i16 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i16;
            if (iD == 9) {
                if (i16 != i15) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        @Override // vv.k0
        /* JADX INFO: renamed from: R */
        public l0 getTimeout() {
            return this.source.getTimeout();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // vv.k0
        public long k3(vv.e sink, long byteCount) throws IOException {
            while (true) {
                int i15 = this.left;
                if (i15 != 0) {
                    long jK3 = this.source.k3(sink, Math.min(byteCount, i15));
                    if (jK3 == -1) {
                        return -1L;
                    }
                    this.left -= (int) jK3;
                    return jK3;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                h();
            }
        }

        public final void m(int i15) {
            this.flags = i15;
        }

        public final void p(int i15) {
            this.left = i15;
        }

        public final void r(int i15) {
            this.length = i15;
        }

        public final void u(int i15) {
            this.padding = i15;
        }

        public final void y(int i15) {
            this.streamId = i15;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lnv/h$c;", "", "", "inFinished", "", "streamId", "Lvv/g;", "source", "length", "Loq/i0;", "l", "(ZILvv/g;I)V", "associatedStreamId", "", "Lnv/c;", "headerBlock", "c", "(ZIILjava/util/List;)V", "Lnv/b;", "errorCode", "m", "(ILnv/b;)V", "clearPrevious", "Lnv/m;", "settings", "f", "(ZLnv/m;)V", "i", "()V", "ack", "payload1", "payload2", "r", "(ZII)V", "lastGoodStreamId", "Lvv/h;", "debugData", "q", "(ILnv/b;Lvv/h;)V", "", "windowSizeIncrement", "e", "(IJ)V", "streamDependency", "weight", "exclusive", "s", "(IIIZ)V", "promisedStreamId", "requestHeaders", "h", "(IILjava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        void c(boolean inFinished, int streamId, int associatedStreamId, List<nv.c> headerBlock);

        void e(int streamId, long windowSizeIncrement);

        void f(boolean clearPrevious, m settings);

        void h(int streamId, int promisedStreamId, List<nv.c> requestHeaders);

        void i();

        void l(boolean inFinished, int streamId, vv.g source, int length);

        void m(int streamId, nv.b errorCode);

        void q(int lastGoodStreamId, nv.b errorCode, vv.h debugData);

        void r(boolean ack, int payload1, int payload2);

        void s(int streamId, int streamDependency, int weight, boolean exclusive);
    }

    public h(vv.g gVar, boolean z15) {
        this.source = gVar;
        this.client = z15;
        b bVar = new b(gVar);
        this.continuation = bVar;
        this.hpackReader = new d.a(bVar, PKIFailureInfo.certConfirmed, 0, 4, null);
    }

    private final void C(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException("TYPE_PING length != 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.r((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void E(c handler, int streamId) {
        int i15 = this.source.readInt();
        handler.s(streamId, i15 & Integer.MAX_VALUE, gv.d.d(this.source.readByte(), GF2Field.MASK) + 1, (Integer.MIN_VALUE & i15) != 0);
    }

    private final void H(c handler, int length, int flags, int streamId) throws IOException {
        if (length == 5) {
            if (streamId == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            E(handler, streamId);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
    }

    private final void I(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (flags & 8) != 0 ? gv.d.d(this.source.readByte(), GF2Field.MASK) : 0;
        handler.h(streamId, this.source.readInt() & Integer.MAX_VALUE, u(INSTANCE.b(length - 4, flags, iD), iD, flags, streamId));
    }

    private final void J(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i15 = this.source.readInt();
        nv.b bVarA = nv.b.INSTANCE.a(i15);
        if (bVarA != null) {
            handler.m(streamId, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i15);
    }

    private final void K(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.i();
            return;
        }
        if (length % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + length);
        }
        m mVar = new m();
        lr.g gVarU = lr.m.u(lr.m.w(0, length), 6);
        int first = gVarU.getFirst();
        int last = gVarU.getLast();
        int step = gVarU.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iE = gv.d.e(this.source.readShort(), 65535);
                int i15 = this.source.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (i15 < 16384 || i15 > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i15);
                        }
                    } else {
                        if (i15 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (i15 != 0 && i15 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iE, i15);
                if (first != last) {
                    first += step;
                }
            }
        }
        handler.f(false, mVar);
    }

    private final void L(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
        }
        long jF = gv.d.f(this.source.readInt(), 2147483647L);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.e(streamId, jF);
    }

    private final void p(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z15 = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (flags & 8) != 0 ? gv.d.d(this.source.readByte(), GF2Field.MASK) : 0;
        handler.l(z15, streamId, this.source, INSTANCE.b(length, flags, iD));
        this.source.skip(iD);
    }

    private final void r(c handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i15 = this.source.readInt();
        int i16 = this.source.readInt();
        int i17 = length - 8;
        nv.b bVarA = nv.b.INSTANCE.a(i16);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i16);
        }
        vv.h hVarR2 = vv.h.f208378e;
        if (i17 > 0) {
            hVarR2 = this.source.r2(i17);
        }
        handler.q(i15, bVarA, hVarR2);
    }

    private final List<nv.c> u(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.p(length);
        b bVar = this.continuation;
        bVar.r(bVar.getLeft());
        this.continuation.u(padding);
        this.continuation.m(flags);
        this.continuation.y(streamId);
        this.hpackReader.k();
        return this.hpackReader.e();
    }

    private final void y(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z15 = (flags & 1) != 0;
        int iD = (flags & 8) != 0 ? gv.d.d(this.source.readByte(), GF2Field.MASK) : 0;
        if ((flags & 32) != 0) {
            E(handler, streamId);
            length -= 5;
        }
        handler.c(z15, streamId, -1, u(INSTANCE.b(length, flags, iD), iD, flags, streamId));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final boolean h(boolean requireSettings, c handler) throws IOException {
        try {
            this.source.g2(9L);
            int iJ = gv.d.J(this.source);
            if (iJ > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iJ);
            }
            int iD = gv.d.d(this.source.readByte(), GF2Field.MASK);
            int iD2 = gv.d.d(this.source.readByte(), GF2Field.MASK);
            int i15 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger = f139028f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f138943a.c(true, i15, iJ, iD, iD2));
            }
            if (requireSettings && iD != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f138943a.b(iD));
            }
            switch (iD) {
                case 0:
                    p(handler, iJ, iD2, i15);
                    return true;
                case 1:
                    y(handler, iJ, iD2, i15);
                    return true;
                case 2:
                    H(handler, iJ, iD2, i15);
                    return true;
                case 3:
                    J(handler, iJ, iD2, i15);
                    return true;
                case 4:
                    K(handler, iJ, iD2, i15);
                    return true;
                case 5:
                    I(handler, iJ, iD2, i15);
                    return true;
                case 6:
                    C(handler, iJ, iD2, i15);
                    return true;
                case 7:
                    r(handler, iJ, iD2, i15);
                    return true;
                case 8:
                    L(handler, iJ, iD2, i15);
                    return true;
                default:
                    this.source.skip(iJ);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void m(c handler) throws IOException {
        if (this.client) {
            if (!h(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        vv.g gVar = this.source;
        vv.h hVar = e.CONNECTION_PREFACE;
        vv.h hVarR2 = gVar.r2(hVar.Q());
        Logger logger = f139028f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(gv.d.t("<< CONNECTION " + hVarR2.t(), new Object[0]));
        }
        if (t.c(hVar, hVarR2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + hVarR2.Y());
    }
}
