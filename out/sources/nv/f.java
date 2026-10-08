package nv;

import fr.n0;
import fr.p0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000 Â\u00012\u00020\u0001:\u0004V[agB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\b.\u0010,J\u001f\u00100\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001aH\u0000¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00122\u0006\u0010-\u001a\u00020)¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u00108J)\u0010?\u001a\u00020\u00122\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)2\b\u0010>\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b?\u0010@J#\u0010D\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u001a¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0012H\u0000¢\u0006\u0004\bI\u00108J\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bO\u0010PJ/\u0010S\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010R\u001a\u00020Q2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\bU\u0010,R\u001a\u0010Y\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010?\u001a\u0004\bW\u0010XR\u001a\u0010_\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010k\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\"\u0010q\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010l\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR\u0016\u0010w\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010?R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010|R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0087\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0087\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0087\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0087\u0001R\u001d\u0010\u0098\u0001\u001a\u00030\u0093\u00018\u0006¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010\u009d\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u0095\u0001\u001a\u0006\b\u009a\u0001\u0010\u0097\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¢\u0001\u001a\u00020\u001a2\u0007\u0010\u009e\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u0087\u0001\u001a\u0006\b \u0001\u0010¡\u0001R*\u0010¥\u0001\u001a\u00020\u001a2\u0007\u0010\u009e\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0087\u0001\u001a\u0006\b¤\u0001\u0010¡\u0001R*\u0010¨\u0001\u001a\u00020\u001a2\u0007\u0010\u009e\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0087\u0001\u001a\u0006\b§\u0001\u0010¡\u0001R*\u0010«\u0001\u001a\u00020\u001a2\u0007\u0010\u009e\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0087\u0001\u001a\u0006\bª\u0001\u0010¡\u0001R \u0010±\u0001\u001a\u00030¬\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001d\u0010·\u0001\u001a\u00030²\u00018\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R!\u0010½\u0001\u001a\u00070¸\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u001e\u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001¨\u0006Ã\u0001"}, d2 = {"Lnv/f;", "Ljava/io/Closeable;", "Lnv/f$a;", "builder", "<init>", "(Lnv/f$a;)V", "", "associatedStreamId", "", "Lnv/c;", "requestHeaders", "", "out", "Lnv/i;", "i1", "(ILjava/util/List;Z)Lnv/i;", "Ljava/io/IOException;", "e", "Loq/i0;", "a0", "(Ljava/io/IOException;)V", "id", "H0", "(I)Lnv/i;", "streamId", "K1", "", "read", "j2", "(J)V", "o1", "(Ljava/util/List;Z)Lnv/i;", "outFinished", "alternating", "v2", "(IZLjava/util/List;)V", "Lvv/e;", "buffer", "byteCount", "t2", "(IZLvv/e;J)V", "Lnv/b;", "errorCode", "I2", "(ILnv/b;)V", "statusCode", "A2", "unacknowledgedBytesRead", "N2", "(IJ)V", "reply", "payload1", "payload2", "y2", "(ZII)V", "flush", "()V", "T1", "(Lnv/b;)V", "close", "connectionCode", "streamCode", "cause", "Z", "(Lnv/b;Lnv/b;Ljava/io/IOException;)V", "sendConnectionPreface", "Ljv/e;", "taskRunner", "d2", "(ZLjv/e;)V", "nowNs", "d1", "(J)Z", "P1", "F1", "(I)Z", "C1", "(ILjava/util/List;)V", "inFinished", "x1", "(ILjava/util/List;Z)V", "Lvv/g;", "source", "s1", "(ILvv/g;IZ)V", "D1", "a", "b0", "()Z", "client", "Lnv/f$c;", "b", "Lnv/f$c;", "n0", "()Lnv/f$c;", "listener", "", "c", "Ljava/util/Map;", "O0", "()Ljava/util/Map;", "streams", "", "d", "Ljava/lang/String;", "c0", "()Ljava/lang/String;", "connectionName", "I", "d0", "()I", "Q1", "(I)V", "lastGoodStreamId", "f", "t0", "setNextStreamId$okhttp", "nextStreamId", "g", "isShutdown", "h", "Ljv/e;", "Ljv/d;", "j", "Ljv/d;", "writerQueue", "k", "pushQueue", "l", "settingsListenerQueue", "Lnv/l;", "m", "Lnv/l;", "pushObserver", "n", "J", "intervalPingsSent", "p", "intervalPongsReceived", "q", "degradedPingsSent", "r", "degradedPongsReceived", "s", "awaitPongsReceived", "t", "degradedPongDeadlineNs", "Lnv/m;", "v", "Lnv/m;", "u0", "()Lnv/m;", "okHttpSettings", "w", "C0", "S1", "(Lnv/m;)V", "peerSettings", "<set-?>", "x", "getReadBytesTotal", "()J", "readBytesTotal", "y", "getReadBytesAcknowledged", "readBytesAcknowledged", "z", "getWriteBytesTotal", "writeBytesTotal", "A", "T0", "writeBytesMaximum", "Ljava/net/Socket;", "B", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "Lnv/j;", "C", "Lnv/j;", "Y0", "()Lnv/j;", "writer", "Lnv/f$d;", ip.a.f96138c, "Lnv/f$d;", "getReaderRunnable", "()Lnv/f$d;", "readerRunnable", "", "E", "Ljava/util/Set;", "currentPushRequests", "F", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements Closeable {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final m G;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long writeBytesMaximum;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Socket socket;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final nv.j writer;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final d readerRunnable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Set<Integer> currentPushRequests;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, nv.i> streams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String connectionName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastGoodStreamId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int nextStreamId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isShutdown;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final jv.e taskRunner;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final jv.d writerQueue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final jv.d pushQueue;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final jv.d settingsListenerQueue;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final nv.l pushObserver;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long intervalPingsSent;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long intervalPongsReceived;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long degradedPingsSent;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long degradedPongsReceived;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long awaitPongsReceived;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long degradedPongDeadlineNs;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final m okHttpSettings;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private m peerSettings;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00100\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-\"\u0004\b.\u0010/R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010=\u001a\u0004\b+\u0010>\"\u0004\b?\u0010@R\"\u0010F\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010B\u001a\u0004\b7\u0010C\"\u0004\bD\u0010ER\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010G\u001a\u0004\b1\u0010H\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lnv/f$a;", "", "", "client", "Ljv/e;", "taskRunner", "<init>", "(ZLjv/e;)V", "Ljava/net/Socket;", "socket", "", "peerName", "Lvv/g;", "source", "Lvv/f;", "sink", "q", "(Ljava/net/Socket;Ljava/lang/String;Lvv/g;Lvv/f;)Lnv/f$a;", "Lnv/f$c;", "listener", "k", "(Lnv/f$c;)Lnv/f$a;", "", "pingIntervalMillis", "l", "(I)Lnv/f$a;", "Lnv/f;", "a", "()Lnv/f;", "Z", "b", "()Z", "setClient$okhttp", "(Z)V", "Ljv/e;", "j", "()Ljv/e;", "c", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "o", "(Ljava/net/Socket;)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "connectionName", "e", "Lvv/g;", "i", "()Lvv/g;", "p", "(Lvv/g;)V", "f", "Lvv/f;", "g", "()Lvv/f;", "n", "(Lvv/f;)V", "Lnv/f$c;", "()Lnv/f$c;", "setListener$okhttp", "(Lnv/f$c;)V", "Lnv/l;", "Lnv/l;", "()Lnv/l;", "setPushObserver$okhttp", "(Lnv/l;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean client;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final jv.e taskRunner;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Socket socket;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String connectionName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public vv.g source;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public vv.f sink;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private c listener = c.f138981b;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private nv.l pushObserver = nv.l.f139083b;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int pingIntervalMillis;

        public a(boolean z15, jv.e eVar) {
            this.client = z15;
            this.taskRunner = eVar;
        }

        public final f a() {
            return new f(this);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final String c() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            return null;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final nv.l getPushObserver() {
            return this.pushObserver;
        }

        public final vv.f g() {
            vv.f fVar = this.sink;
            if (fVar != null) {
                return fVar;
            }
            return null;
        }

        public final Socket h() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            return null;
        }

        public final vv.g i() {
            vv.g gVar = this.source;
            if (gVar != null) {
                return gVar;
            }
            return null;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final jv.e getTaskRunner() {
            return this.taskRunner;
        }

        public final a k(c listener) {
            this.listener = listener;
            return this;
        }

        public final a l(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final void m(String str) {
            this.connectionName = str;
        }

        public final void n(vv.f fVar) {
            this.sink = fVar;
        }

        public final void o(Socket socket) {
            this.socket = socket;
        }

        public final void p(vv.g gVar) {
            this.source = gVar;
        }

        public final a q(Socket socket, String peerName, vv.g source, vv.f sink) {
            String str;
            o(socket);
            if (this.client) {
                str = gv.d.f77111i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            p(source);
            n(sink);
            return this;
        }
    }

    /* JADX INFO: renamed from: nv.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lnv/f$b;", "", "<init>", "()V", "Lnv/m;", "DEFAULT_SETTINGS", "Lnv/m;", "a", "()Lnv/m;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final m a() {
            return f.G;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lnv/f$c;", "", "<init>", "()V", "Lnv/i;", "stream", "Loq/i0;", "c", "(Lnv/i;)V", "Lnv/f;", "connection", "Lnv/m;", "settings", "b", "(Lnv/f;Lnv/m;)V", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f138981b = new a();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nv/f$c$a", "Lnv/f$c;", "Lnv/i;", "stream", "Loq/i0;", "c", "(Lnv/i;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends c {
            a() {
            }

            @Override // nv.f.c
            public void c(nv.i stream) {
                stream.d(b.REFUSED_STREAM, null);
            }
        }

        public void b(f connection, m settings) {
        }

        public abstract void c(nv.i stream);
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lnv/f$d;", "Lnv/h$c;", "Lkotlin/Function0;", "Loq/i0;", "Lnv/h;", "reader", "<init>", "(Lnv/f;Lnv/h;)V", "v", "()V", "", "inFinished", "", "streamId", "Lvv/g;", "source", "length", "l", "(ZILvv/g;I)V", "associatedStreamId", "", "Lnv/c;", "headerBlock", "c", "(ZIILjava/util/List;)V", "Lnv/b;", "errorCode", "m", "(ILnv/b;)V", "clearPrevious", "Lnv/m;", "settings", "f", "(ZLnv/m;)V", "u", "i", "ack", "payload1", "payload2", "r", "(ZII)V", "lastGoodStreamId", "Lvv/h;", "debugData", "q", "(ILnv/b;Lvv/h;)V", "", "windowSizeIncrement", "e", "(IJ)V", "streamDependency", "weight", "exclusive", "s", "(IIIZ)V", "promisedStreamId", "requestHeaders", "h", "(IILjava/util/List;)V", "a", "Lnv/h;", "getReader$okhttp", "()Lnv/h;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d implements nv.h.c, er.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final nv.h reader;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends jv.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f138984e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f138985f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z15, f fVar, p0 p0Var) {
                super(str, z15);
                this.f138984e = fVar;
                this.f138985f = p0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // jv.a
            public long f() {
                this.f138984e.getListener().b(this.f138984e, (m) this.f138985f.f66410a);
                return -1L;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b extends jv.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f138986e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ nv.i f138987f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z15, f fVar, nv.i iVar) {
                super(str, z15);
                this.f138986e = fVar;
                this.f138987f = iVar;
            }

            @Override // jv.a
            public long f() {
                try {
                    this.f138986e.getListener().c(this.f138987f);
                    return -1L;
                } catch (IOException e15) {
                    ov.h.INSTANCE.g().j("Http2Connection.Listener failure for " + this.f138986e.getConnectionName(), 4, e15);
                    try {
                        this.f138987f.d(nv.b.PROTOCOL_ERROR, e15);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends jv.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f138988e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f138989f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f138990g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z15, f fVar, int i15, int i16) {
                super(str, z15);
                this.f138988e = fVar;
                this.f138989f = i15;
                this.f138990g = i16;
            }

            @Override // jv.a
            public long f() {
                this.f138988e.y2(true, this.f138989f, this.f138990g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: nv.f$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C3433d extends jv.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f138991e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f138992f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m f138993g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3433d(String str, boolean z15, d dVar, boolean z16, m mVar) {
                super(str, z15);
                this.f138991e = dVar;
                this.f138992f = z16;
                this.f138993g = mVar;
            }

            @Override // jv.a
            public long f() {
                this.f138991e.u(this.f138992f, this.f138993g);
                return -1L;
            }
        }

        public d(nv.h hVar) {
            this.reader = hVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() throws Throwable {
            v();
            return i0.f148189a;
        }

        @Override // nv.h.c
        public void c(boolean inFinished, int streamId, int associatedStreamId, List<nv.c> headerBlock) {
            if (f.this.F1(streamId)) {
                f.this.x1(streamId, headerBlock, inFinished);
                return;
            }
            f fVar = f.this;
            synchronized (fVar) {
                nv.i iVarH0 = fVar.H0(streamId);
                if (iVarH0 != null) {
                    i0 i0Var = i0.f148189a;
                    iVarH0.x(gv.d.P(headerBlock), inFinished);
                    return;
                }
                if (fVar.isShutdown) {
                    return;
                }
                if (streamId <= fVar.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == fVar.getNextStreamId() % 2) {
                    return;
                }
                nv.i iVar = new nv.i(streamId, fVar, false, inFinished, gv.d.P(headerBlock));
                fVar.Q1(streamId);
                fVar.O0().put(Integer.valueOf(streamId), iVar);
                fVar.taskRunner.i().i(new b(fVar.getConnectionName() + '[' + streamId + "] onStream", true, fVar, iVar), 0L);
            }
        }

        @Override // nv.h.c
        public void e(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                f fVar = f.this;
                synchronized (fVar) {
                    fVar.writeBytesMaximum = fVar.getWriteBytesMaximum() + windowSizeIncrement;
                    fVar.notifyAll();
                    i0 i0Var = i0.f148189a;
                }
                return;
            }
            nv.i iVarH0 = f.this.H0(streamId);
            if (iVarH0 != null) {
                synchronized (iVarH0) {
                    iVarH0.a(windowSizeIncrement);
                    i0 i0Var2 = i0.f148189a;
                }
            }
        }

        @Override // nv.h.c
        public void f(boolean clearPrevious, m settings) {
            f.this.writerQueue.i(new C3433d(f.this.getConnectionName() + " applyAndAckSettings", true, this, clearPrevious, settings), 0L);
        }

        @Override // nv.h.c
        public void h(int streamId, int promisedStreamId, List<nv.c> requestHeaders) throws Throwable {
            f.this.C1(promisedStreamId, requestHeaders);
        }

        @Override // nv.h.c
        public void i() {
        }

        @Override // nv.h.c
        public void l(boolean inFinished, int streamId, vv.g source, int length) {
            if (f.this.F1(streamId)) {
                f.this.s1(streamId, source, length, inFinished);
                return;
            }
            nv.i iVarH0 = f.this.H0(streamId);
            if (iVarH0 == null) {
                f.this.I2(streamId, nv.b.PROTOCOL_ERROR);
                long j15 = length;
                f.this.j2(j15);
                source.skip(j15);
                return;
            }
            iVarH0.w(source, length);
            if (inFinished) {
                iVarH0.x(gv.d.f77104b, true);
            }
        }

        @Override // nv.h.c
        public void m(int streamId, nv.b errorCode) {
            if (f.this.F1(streamId)) {
                f.this.D1(streamId, errorCode);
                return;
            }
            nv.i iVarK1 = f.this.K1(streamId);
            if (iVarK1 != null) {
                iVarK1.y(errorCode);
            }
        }

        @Override // nv.h.c
        public void q(int lastGoodStreamId, nv.b errorCode, vv.h debugData) {
            int i15;
            Object[] array;
            debugData.Q();
            f fVar = f.this;
            synchronized (fVar) {
                array = fVar.O0().values().toArray(new nv.i[0]);
                fVar.isShutdown = true;
                i0 i0Var = i0.f148189a;
            }
            for (nv.i iVar : (nv.i[]) array) {
                if (iVar.getId() > lastGoodStreamId && iVar.t()) {
                    iVar.y(nv.b.REFUSED_STREAM);
                    f.this.K1(iVar.getId());
                }
            }
        }

        @Override // nv.h.c
        public void r(boolean ack, int payload1, int payload2) {
            if (!ack) {
                f.this.writerQueue.i(new c(f.this.getConnectionName() + " ping", true, f.this, payload1, payload2), 0L);
                return;
            }
            f fVar = f.this;
            synchronized (fVar) {
                try {
                    if (payload1 == 1) {
                        fVar.intervalPongsReceived++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            fVar.awaitPongsReceived++;
                            fVar.notifyAll();
                        }
                        i0 i0Var = i0.f148189a;
                    } else {
                        fVar.degradedPongsReceived++;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // nv.h.c
        public void s(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, nv.m] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void u(boolean clearPrevious, m settings) {
            ?? r15;
            long jC;
            int i15;
            nv.i[] iVarArr;
            p0 p0Var = new p0();
            nv.j writer = f.this.getWriter();
            f fVar = f.this;
            synchronized (writer) {
                synchronized (fVar) {
                    try {
                        m peerSettings = fVar.getPeerSettings();
                        if (clearPrevious) {
                            r15 = settings;
                        } else {
                            m mVar = new m();
                            mVar.g(peerSettings);
                            mVar.g(settings);
                            r15 = mVar;
                        }
                        p0Var.f66410a = r15;
                        jC = ((long) r15.c()) - ((long) peerSettings.c());
                        iVarArr = (jC == 0 || fVar.O0().isEmpty()) ? null : (nv.i[]) fVar.O0().values().toArray(new nv.i[0]);
                        fVar.S1((m) p0Var.f66410a);
                        fVar.settingsListenerQueue.i(new a(fVar.getConnectionName() + " onSettings", true, fVar, p0Var), 0L);
                        i0 i0Var = i0.f148189a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                try {
                    fVar.getWriter().b((m) p0Var.f66410a);
                } catch (IOException e15) {
                    fVar.a0(e15);
                }
                i0 i0Var2 = i0.f148189a;
            }
            if (iVarArr != null) {
                for (nv.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(jC);
                        i0 i0Var3 = i0.f148189a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [nv.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, nv.h] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void v() throws Throwable {
            nv.b bVar;
            nv.b bVar2 = nv.b.INTERNAL_ERROR;
            IOException e15 = null;
            try {
                try {
                    this.reader.m(this);
                    while (this.reader.h(false, this)) {
                    }
                    nv.b bVar3 = nv.b.NO_ERROR;
                    try {
                        f.this.Z(bVar3, nv.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e16) {
                        e15 = e16;
                        nv.b bVar4 = nv.b.PROTOCOL_ERROR;
                        f fVar = f.this;
                        fVar.Z(bVar4, bVar4, e15);
                        bVar = fVar;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    f.this.Z(bVar, bVar2, e15);
                    gv.d.m(this.reader);
                    throw th;
                }
            } catch (IOException e17) {
                e15 = e17;
            } catch (Throwable th5) {
                th = th5;
                bVar = bVar2;
                f.this.Z(bVar, bVar2, e15);
                gv.d.m(this.reader);
                throw th;
            }
            bVar2 = this.reader;
            gv.d.m(bVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends jv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f138994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f138995f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ vv.e f138996g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f138997h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f138998i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z15, f fVar, int i15, vv.e eVar, int i16, boolean z16) {
            super(str, z15);
            this.f138994e = fVar;
            this.f138995f = i15;
            this.f138996g = eVar;
            this.f138997h = i16;
            this.f138998i = z16;
        }

        @Override // jv.a
        public long f() {
            try {
                boolean zA = this.f138994e.pushObserver.a(this.f138995f, this.f138996g, this.f138997h, this.f138998i);
                if (zA) {
                    this.f138994e.getWriter().I(this.f138995f, b.CANCEL);
                }
                if (!zA && !this.f138998i) {
                    return -1L;
                }
                synchronized (this.f138994e) {
                    this.f138994e.currentPushRequests.remove(Integer.valueOf(this.f138995f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: nv.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C3434f extends jv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f138999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f139000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f139001g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f139002h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3434f(String str, boolean z15, f fVar, int i15, List list, boolean z16) {
            super(str, z15);
            this.f138999e = fVar;
            this.f139000f = i15;
            this.f139001g = list;
            this.f139002h = z16;
        }

        @Override // jv.a
        public long f() {
            boolean zD = this.f138999e.pushObserver.d(this.f139000f, this.f139001g, this.f139002h);
            if (zD) {
                try {
                    this.f138999e.getWriter().I(this.f139000f, b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zD && !this.f139002h) {
                return -1L;
            }
            synchronized (this.f138999e) {
                this.f138999e.currentPushRequests.remove(Integer.valueOf(this.f139000f));
            }
            return -1L;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends jv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f139003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f139004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f139005g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z15, f fVar, int i15, List list) {
            super(str, z15);
            this.f139003e = fVar;
            this.f139004f = i15;
            this.f139005g = list;
        }

        @Override // jv.a
        public long f() {
            if (!this.f139003e.pushObserver.c(this.f139004f, this.f139005g)) {
                return -1L;
            }
            try {
                this.f139003e.getWriter().I(this.f139004f, b.CANCEL);
                synchronized (this.f139003e) {
                    this.f139003e.currentPushRequests.remove(Integer.valueOf(this.f139004f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h extends jv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f139006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f139007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f139008g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z15, f fVar, int i15, b bVar) {
            super(str, z15);
            this.f139006e = fVar;
            this.f139007f = i15;
            this.f139008g = bVar;
        }

        @Override // jv.a
        public long f() {
            this.f139006e.pushObserver.b(this.f139007f, this.f139008g);
            synchronized (this.f139006e) {
                this.f139006e.currentPushRequests.remove(Integer.valueOf(this.f139007f));
                i0 i0Var = i0.f148189a;
            }
            return -1L;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i extends jv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f139009e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z15, f fVar) {
            super(str, z15);
            this.f139009e = fVar;
        }

        @Override // jv.a
        public long f() {
            this.f139009e.y2(false, 2, 0);
            return -1L;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nv/f$j", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j extends jv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f139010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f139011f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j15) {
            super(str, false, 2, null);
            this.f139010e = fVar;
            this.f139011f = j15;
        }

        @Override // jv.a
        public long f() {
            boolean z15;
            synchronized (this.f139010e) {
                if (this.f139010e.intervalPongsReceived < this.f139010e.intervalPingsSent) {
                    z15 = true;
                } else {
                    this.f139010e.intervalPingsSent++;
                    z15 = false;
                }
            }
            if (z15) {
                this.f139010e.a0(null);
                return -1L;
            }
            this.f139010e.y2(false, 1, 0);
            return this.f139011f;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k extends jv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f139012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f139013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f139014g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z15, f fVar, int i15, b bVar) {
            super(str, z15);
            this.f139012e = fVar;
            this.f139013f = i15;
            this.f139014g = bVar;
        }

        @Override // jv.a
        public long f() {
            try {
                this.f139012e.A2(this.f139013f, this.f139014g);
                return -1L;
            } catch (IOException e15) {
                this.f139012e.a0(e15);
                return -1L;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"jv/c", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l extends jv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f139015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f139016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f139017g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z15, f fVar, int i15, long j15) {
            super(str, z15);
            this.f139015e = fVar;
            this.f139016f = i15;
            this.f139017g = j15;
        }

        @Override // jv.a
        public long f() {
            try {
                this.f139015e.getWriter().K(this.f139016f, this.f139017g);
                return -1L;
            } catch (IOException e15) {
                this.f139015e.a0(e15);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        G = mVar;
    }

    public f(a aVar) {
        boolean client = aVar.getClient();
        this.client = client;
        this.listener = aVar.getListener();
        this.streams = new LinkedHashMap();
        String strC = aVar.c();
        this.connectionName = strC;
        this.nextStreamId = aVar.getClient() ? 3 : 2;
        jv.e taskRunner = aVar.getTaskRunner();
        this.taskRunner = taskRunner;
        jv.d dVarI = taskRunner.i();
        this.writerQueue = dVarI;
        this.pushQueue = taskRunner.i();
        this.settingsListenerQueue = taskRunner.i();
        this.pushObserver = aVar.getPushObserver();
        m mVar = new m();
        if (aVar.getClient()) {
            mVar.h(7, 16777216);
        }
        this.okHttpSettings = mVar;
        m mVar2 = G;
        this.peerSettings = mVar2;
        this.writeBytesMaximum = mVar2.c();
        this.socket = aVar.h();
        this.writer = new nv.j(aVar.g(), client);
        this.readerRunnable = new d(new nv.h(aVar.i(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (aVar.getPingIntervalMillis() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(aVar.getPingIntervalMillis());
            dVarI.i(new j(strC + " ping", this, nanos), nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(IOException e15) {
        b bVar = b.PROTOCOL_ERROR;
        Z(bVar, bVar, e15);
    }

    private final nv.i i1(int associatedStreamId, List<nv.c> requestHeaders, boolean out) throws Throwable {
        Throwable th4;
        boolean z15 = !out;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    T1(b.REFUSED_STREAM);
                                } catch (Throwable th5) {
                                    th4 = th5;
                                }
                            }
                            try {
                                if (this.isShutdown) {
                                    throw new nv.a();
                                }
                                int i15 = this.nextStreamId;
                                this.nextStreamId = i15 + 2;
                                nv.i iVar = new nv.i(i15, this, z15, false, null);
                                boolean z16 = !out || this.writeBytesTotal >= this.writeBytesMaximum || iVar.getWriteBytesTotal() >= iVar.getWriteBytesMaximum();
                                if (iVar.u()) {
                                    this.streams.put(Integer.valueOf(i15), iVar);
                                }
                                i0 i0Var = i0.f148189a;
                                if (associatedStreamId == 0) {
                                    this.writer.y(z15, i15, requestHeaders);
                                } else {
                                    if (this.client) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.writer.H(associatedStreamId, i15, requestHeaders);
                                }
                                if (z16) {
                                    this.writer.flush();
                                }
                                return iVar;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                        th4 = th;
                        throw th4;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                throw th;
            }
        }
    }

    public static /* synthetic */ void i2(f fVar, boolean z15, jv.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            eVar = jv.e.f106031i;
        }
        fVar.d2(z15, eVar);
    }

    public final void A2(int streamId, b statusCode) {
        this.writer.I(streamId, statusCode);
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final m getPeerSettings() {
        return this.peerSettings;
    }

    public final void C1(int streamId, List<nv.c> requestHeaders) throws Throwable {
        Throwable th4;
        synchronized (this) {
            try {
                if (!this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                    this.currentPushRequests.add(Integer.valueOf(streamId));
                    this.pushQueue.i(new g(this.connectionName + '[' + streamId + "] onRequest", true, this, streamId, requestHeaders), 0L);
                    return;
                }
                try {
                    I2(streamId, b.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th5) {
                    th4 = th5;
                }
            } catch (Throwable th6) {
                th4 = th6;
            }
            throw th4;
        }
    }

    public final void D1(int streamId, b errorCode) {
        this.pushQueue.i(new h(this.connectionName + '[' + streamId + "] onReset", true, this, streamId, errorCode), 0L);
    }

    public final boolean F1(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public final synchronized nv.i H0(int id5) {
        return this.streams.get(Integer.valueOf(id5));
    }

    public final void I2(int streamId, b errorCode) {
        this.writerQueue.i(new k(this.connectionName + '[' + streamId + "] writeSynReset", true, this, streamId, errorCode), 0L);
    }

    public final synchronized nv.i K1(int streamId) {
        nv.i iVarRemove;
        iVarRemove = this.streams.remove(Integer.valueOf(streamId));
        notifyAll();
        return iVarRemove;
    }

    public final void N2(int streamId, long unacknowledgedBytesRead) {
        this.writerQueue.i(new l(this.connectionName + '[' + streamId + "] windowUpdate", true, this, streamId, unacknowledgedBytesRead), 0L);
    }

    public final Map<Integer, nv.i> O0() {
        return this.streams;
    }

    public final void P1() {
        synchronized (this) {
            long j15 = this.degradedPongsReceived;
            long j16 = this.degradedPingsSent;
            if (j15 < j16) {
                return;
            }
            this.degradedPingsSent = j16 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) 1000000000);
            i0 i0Var = i0.f148189a;
            this.writerQueue.i(new i(this.connectionName + " ping", true, this), 0L);
        }
    }

    public final void Q1(int i15) {
        this.lastGoodStreamId = i15;
    }

    public final void S1(m mVar) {
        this.peerSettings = mVar;
    }

    /* JADX INFO: renamed from: T0, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void T1(b statusCode) {
        synchronized (this.writer) {
            n0 n0Var = new n0();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i15 = this.lastGoodStreamId;
                n0Var.f66407a = i15;
                i0 i0Var = i0.f148189a;
                this.writer.u(i15, statusCode, gv.d.f77103a);
            }
        }
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final nv.j getWriter() {
        return this.writer;
    }

    public final void Z(b connectionCode, b streamCode, IOException cause) {
        int i15;
        Object[] array;
        if (gv.d.f77110h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            T1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    array = null;
                } else {
                    array = this.streams.values().toArray(new nv.i[0]);
                    this.streams.clear();
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        nv.i[] iVarArr = (nv.i[]) array;
        if (iVarArr != null) {
            for (nv.i iVar : iVarArr) {
                try {
                    iVar.d(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.n();
        this.pushQueue.n();
        this.settingsListenerQueue.n();
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Z(b.NO_ERROR, b.CANCEL, null);
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    public final synchronized boolean d1(long nowNs) {
        if (this.isShutdown) {
            return false;
        }
        return this.degradedPongsReceived >= this.degradedPingsSent || nowNs < this.degradedPongDeadlineNs;
    }

    public final void d2(boolean sendConnectionPreface, jv.e taskRunner) {
        if (sendConnectionPreface) {
            this.writer.h();
            this.writer.J(this.okHttpSettings);
            int iC = this.okHttpSettings.c();
            if (iC != 65535) {
                this.writer.K(0, iC - 65535);
            }
        }
        taskRunner.i().i(new jv.c(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void flush() {
        this.writer.flush();
    }

    public final synchronized void j2(long read) {
        long j15 = this.readBytesTotal + read;
        this.readBytesTotal = j15;
        long j16 = j15 - this.readBytesAcknowledged;
        if (j16 >= this.okHttpSettings.c() / 2) {
            N2(0, j16);
            this.readBytesAcknowledged += j16;
        }
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final c getListener() {
        return this.listener;
    }

    public final nv.i o1(List<nv.c> requestHeaders, boolean out) {
        return i1(0, requestHeaders, out);
    }

    public final void s1(int streamId, vv.g source, int byteCount, boolean inFinished) {
        vv.e eVar = new vv.e();
        long j15 = byteCount;
        source.g2(j15);
        source.k3(eVar, j15);
        this.pushQueue.i(new e(this.connectionName + '[' + streamId + "] onData", true, this, streamId, eVar, byteCount, inFinished), 0L);
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public final void t2(int streamId, boolean outFinished, vv.e buffer, long byteCount) {
        long j15;
        long j16;
        int iMin;
        long j17;
        if (byteCount == 0) {
            this.writer.m(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j15 = this.writeBytesTotal;
                            j16 = this.writeBytesMaximum;
                            if (j15 >= j16) {
                                if (!this.streams.containsKey(Integer.valueOf(streamId))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    throw th4;
                }
                iMin = Math.min((int) Math.min(byteCount, j16 - j15), this.writer.getMaxFrameSize());
                j17 = iMin;
                this.writeBytesTotal += j17;
                i0 i0Var = i0.f148189a;
            }
            byteCount -= j17;
            this.writer.m(outFinished && byteCount == 0, streamId, buffer, iMin);
        }
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final m getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final void v2(int streamId, boolean outFinished, List<nv.c> alternating) {
        this.writer.y(outFinished, streamId, alternating);
    }

    public final void x1(int streamId, List<nv.c> requestHeaders, boolean inFinished) {
        this.pushQueue.i(new C3434f(this.connectionName + '[' + streamId + "] onHeaders", true, this, streamId, requestHeaders, inFinished), 0L);
    }

    public final void y2(boolean reply, int payload1, int payload2) {
        try {
            this.writer.E(reply, payload1, payload2);
        } catch (IOException e15) {
            a0(e15);
        }
    }
}
