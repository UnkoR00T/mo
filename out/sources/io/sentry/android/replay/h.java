package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fr.p0;
import fr.w0;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.b4;
import io.sentry.b7;
import io.sentry.g1;
import io.sentry.q7;
import io.sentry.r7;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 [2\u00020\u0001:\u00014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJQ\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010+\u001a\u00020\u0014H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/J!\u00102\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u00162\b\u00101\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010C\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001d\u0010L\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010R\u001a\b\u0012\u0004\u0012\u00020\b0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR0\u0010W\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160Sj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001d\u0010Z\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bY\u0010K¨\u0006\\"}, d2 = {"Lio/sentry/android/replay/h;", "Ljava/io/Closeable;", "Lio/sentry/q7;", "options", "Lio/sentry/protocol/v;", "replayId", "<init>", "(Lio/sentry/q7;Lio/sentry/protocol/v;)V", "Lio/sentry/android/replay/i;", "frame", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lio/sentry/android/replay/i;)Z", "Ljava/io/File;", "file", "Loq/i0;", "E", "(Ljava/io/File;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "frameTimestamp", "", "screen", "u", "(Landroid/graphics/Bitmap;JLjava/lang/String;)V", "screenshot", "p", "(Ljava/io/File;JLjava/lang/String;)V", "I", "()Ljava/lang/Long;", "duration", "from", "", "segmentId", "height", "width", "frameRate", "bitRate", "videoFile", "Lio/sentry/android/replay/b;", "y", "(JJIIIIILjava/io/File;)Lio/sentry/android/replay/b;", "until", "N", "(J)Ljava/lang/String;", "close", "()V", "key", "value", "M", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Lio/sentry/q7;", "b", "Lio/sentry/protocol/v;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Lio/sentry/util/a;", "d", "Lio/sentry/util/a;", "encoderLock", "e", "lock", "f", "framesLock", "Lio/sentry/android/replay/video/c;", "g", "Lio/sentry/android/replay/video/c;", "encoder", "h", "Loq/k;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Ljava/io/File;", "replayCacheDir", "", "j", "Ljava/util/List;", "J", "()Ljava/util/List;", "frames", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "k", "Ljava/util/LinkedHashMap;", "ongoingSegment", "l", "K", "ongoingSegmentFile", "m", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f94445n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.protocol.v replayId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.video.c encoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isClosed = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a encoderLock = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a lock = new io.sentry.util.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a framesLock = new io.sentry.util.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k replayCacheDir = oq.l.a(new d());

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<ReplayFrame> frames = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<String, String> ongoingSegment = new LinkedHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k ongoingSegmentFile = oq.l.a(new b());

    /* JADX INFO: renamed from: io.sentry.android.replay.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lio/sentry/android/replay/h$a;", "", "<init>", "()V", "Lio/sentry/q7;", "options", "Lio/sentry/protocol/v;", "replayId", "Ljava/io/File;", "d", "(Lio/sentry/q7;Lio/sentry/protocol/v;)Ljava/io/File;", "Lkotlin/Function1;", "Lio/sentry/android/replay/h;", "replayCacheProvider", "Lio/sentry/android/replay/c;", "c", "(Lio/sentry/q7;Lio/sentry/protocol/v;Ler/l;)Lio/sentry/android/replay/c;", "", "ONGOING_SEGMENT", "Ljava/lang/String;", "SEGMENT_KEY_BIT_RATE", "SEGMENT_KEY_FRAME_RATE", "SEGMENT_KEY_HEIGHT", "SEGMENT_KEY_ID", "SEGMENT_KEY_REPLAY_ID", "SEGMENT_KEY_REPLAY_RECORDING", "SEGMENT_KEY_REPLAY_SCREEN_AT_START", "SEGMENT_KEY_REPLAY_TYPE", "SEGMENT_KEY_TIMESTAMP", "SEGMENT_KEY_WIDTH", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: io.sentry.android.replay.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C2225a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t15, T t16) {
                return sq.a.e(Long.valueOf(((ReplayFrame) t15).getTimestamp()), Long.valueOf(((ReplayFrame) t16).getTimestamp()));
            }
        }

        /* JADX INFO: renamed from: io.sentry.android.replay.h$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t15, T t16) {
                return sq.a.e(Long.valueOf(((io.sentry.rrweb.b) t15).e()), Long.valueOf(((io.sentry.rrweb.b) t16).e()));
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(h hVar, File file, String str) throws Exception {
            if (fu.r.F(str, ".jpg", false, 2, null)) {
                File file2 = new File(file, str);
                Long lW = fu.r.w(ar.d.k(file2));
                if (lW != null) {
                    h.r(hVar, file2, lW.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:91:0x01f7  */
        public final LastSegmentData c(q7 options, io.sentry.protocol.v replayId, er.l<? super io.sentry.protocol.v, h> replayCacheProvider) {
            Date dateE;
            r7.b bVarValueOf;
            final h hVar;
            q7 q7Var;
            List listN;
            String str = "";
            File fileD = d(options, replayId);
            File file = new File(fileD, ".ongoing_segment");
            if (!file.exists()) {
                options.getLogger().c(b7.DEBUG, "No ongoing segment found for replay: %s", replayId);
                io.sentry.util.h.a(fileD);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), fu.d.UTF_8), PKIFailureInfo.certRevoked);
            try {
                Iterator<String> it = ar.j.c(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List listV0 = fu.r.V0(it.next(), new String[]{"="}, false, 2, 2, null);
                    oq.r rVarA = oq.y.a((String) listV0.get(0), (String) listV0.get(1));
                    linkedHashMap.put(rVarA.c(), rVarA.d());
                }
                ar.b.a(bufferedReader, null);
                String str2 = (String) linkedHashMap.get("config.height");
                Integer numU = str2 != null ? fu.r.u(str2) : null;
                String str3 = (String) linkedHashMap.get("config.width");
                Integer numU2 = str3 != null ? fu.r.u(str3) : null;
                String str4 = (String) linkedHashMap.get("config.frame-rate");
                Integer numU3 = str4 != null ? fu.r.u(str4) : null;
                String str5 = (String) linkedHashMap.get("config.bit-rate");
                Integer numU4 = str5 != null ? fu.r.u(str5) : null;
                String str6 = (String) linkedHashMap.get("segment.id");
                Integer numU5 = str6 != null ? fu.r.u(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get("segment.timestamp");
                    if (str7 == null) {
                        str7 = "";
                    }
                    dateE = io.sentry.m.f(str7);
                } catch (Throwable unused) {
                    dateE = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get("replay.type");
                    if (str8 != null) {
                        str = str8;
                    }
                    bVarValueOf = r7.b.valueOf(str);
                } catch (Throwable unused2) {
                    bVarValueOf = null;
                }
                if (numU == null || numU2 == null || numU3 == null || numU4 == null || numU5 == null || numU5.intValue() == -1 || dateE == null || bVarValueOf == null) {
                    options.getLogger().c(b7.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                    io.sentry.util.h.a(fileD);
                    return null;
                }
                ScreenshotRecorderConfig screenshotRecorderConfig = new ScreenshotRecorderConfig(numU2.intValue(), numU.intValue(), 1.0f, 1.0f, numU3.intValue(), numU4.intValue());
                if (replayCacheProvider == null || (hVar = replayCacheProvider.b(replayId)) == null) {
                    q7Var = options;
                    hVar = new h(q7Var, replayId);
                } else {
                    q7Var = options;
                }
                File fileL = hVar.L();
                if (fileL != null) {
                    fileL.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.g
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file2, String str9) {
                            return h.Companion.b(hVar, file2, str9);
                        }
                    });
                }
                if (hVar.J().isEmpty()) {
                    q7Var.getLogger().c(b7.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                    io.sentry.util.h.a(fileD);
                    return null;
                }
                List<ReplayFrame> listJ = hVar.J();
                if (listJ.size() > 1) {
                    pq.v.C(listJ, new C2225a());
                }
                r7.b bVar = r7.b.SESSION;
                int iIntValue = bVarValueOf == bVar ? numU5.intValue() : 0;
                if (bVarValueOf != bVar) {
                    dateE = io.sentry.m.e(((ReplayFrame) pq.v.l0(hVar.J())).getTimestamp());
                }
                Date date = dateE;
                long timestamp = (((ReplayFrame) pq.v.x0(hVar.J())).getTimestamp() - date.getTime()) + ((long) (1000 / numU3.intValue()));
                String str9 = (String) linkedHashMap.get("replay.recording");
                if (str9 != null) {
                    b4 b4Var = (b4) q7Var.getSerializer().c(new StringReader(str9), b4.class);
                    listN = (b4Var != null ? b4Var.a() : null) != null ? new LinkedList(b4Var.a()) : null;
                    if (listN == null) {
                        listN = pq.v.n();
                    }
                } else {
                    listN = pq.v.n();
                }
                return new LastSegmentData(screenshotRecorderConfig, hVar, date, iIntValue, timestamp, bVarValueOf, (String) linkedHashMap.get("replay.screen-at-start"), pq.v.U0(listN, new b()));
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(bufferedReader, th4);
                    throw th5;
                }
            }
        }

        public final File d(q7 options, io.sentry.protocol.v replayId) {
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(b7.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            File file = new File(options.getCacheDirPath(), "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "c", "()Ljava/io/File;"}, k = 3, mv = {1, 9, 0})
    static final class b extends fr.w implements er.a<File> {
        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File a() throws IOException {
            if (h.this.L() == null) {
                return null;
            }
            File file = new File(h.this.L(), ".ongoing_segment");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "<name for destructuring parameter 0>", "", "c", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class c extends fr.w implements er.l<Map.Entry<String, String>, CharSequence> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f94458b = new c();

        c() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence b(Map.Entry<String, String> entry) {
            return entry.getKey() + '=' + entry.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "c", "()Ljava/io/File;"}, k = 3, mv = {1, 9, 0})
    static final class d extends fr.w implements er.a<File> {
        d() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File a() {
            return h.INSTANCE.d(h.this.options, h.this.replayId);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/i;", "it", "", "c", "(Lio/sentry/android/replay/i;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends fr.w implements er.l<ReplayFrame, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f94460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f94461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p0<String> f94462d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j15, h hVar, p0<String> p0Var) {
            super(1);
            this.f94460b = j15;
            this.f94461c = hVar;
            this.f94462d = p0Var;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(ReplayFrame replayFrame) {
            if (replayFrame.getTimestamp() < this.f94460b) {
                this.f94461c.E(replayFrame.getScreenshot());
                return Boolean.TRUE;
            }
            p0<String> p0Var = this.f94462d;
            if (p0Var.f66410a == null) {
                p0Var.f66410a = replayFrame.getScreen();
            }
            return Boolean.FALSE;
        }
    }

    public h(q7 q7Var, io.sentry.protocol.v vVar) {
        this.options = q7Var;
        this.replayId = vVar;
    }

    public static /* synthetic */ GeneratedVideo C(h hVar, long j15, long j16, int i15, int i16, int i17, int i18, int i19, File file, int i25, Object obj) {
        int i26;
        File file2;
        if ((i25 & 128) != 0) {
            File fileL = hVar.L();
            StringBuilder sb5 = new StringBuilder();
            i26 = i15;
            sb5.append(i26);
            sb5.append(".mp4");
            file2 = new File(fileL, sb5.toString());
        } else {
            i26 = i15;
            file2 = file;
        }
        return hVar.y(j15, j16, i26, i16, i17, i18, i19, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().c(b7.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th4) {
            this.options.getLogger().a(b7.ERROR, th4, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean H(ReplayFrame frame) {
        if (frame == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(frame.getScreenshot().getAbsolutePath());
            g1 g1VarA = this.encoderLock.a();
            try {
                io.sentry.android.replay.video.c cVar = this.encoder;
                if (cVar != null) {
                    cVar.b(bitmapDecodeFile);
                    i0 i0Var = i0.f148189a;
                }
                cr.a.a(g1VarA, null);
                bitmapDecodeFile.recycle();
                return true;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    cr.a.a(g1VarA, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            this.options.getLogger().b(b7.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th6);
            return false;
        }
    }

    public static /* synthetic */ void r(h hVar, File file, long j15, String str, int i15, Object obj) throws Exception {
        if ((i15 & 4) != 0) {
            str = null;
        }
        hVar.p(file, j15, str);
    }

    public final Long I() throws Exception {
        g1 g1VarA = this.framesLock.a();
        try {
            ReplayFrame replayFrame = (ReplayFrame) pq.v.n0(this.frames);
            Long lValueOf = replayFrame != null ? Long.valueOf(replayFrame.getTimestamp()) : null;
            cr.a.a(g1VarA, null);
            return lValueOf;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    public final List<ReplayFrame> J() {
        return this.frames;
    }

    public final File K() {
        return (File) this.ongoingSegmentFile.getValue();
    }

    public final File L() {
        return (File) this.replayCacheDir.getValue();
    }

    public final void M(String key, String value) throws Exception {
        File fileK;
        File fileK2;
        g1 g1VarA = this.lock.a();
        try {
            if (this.isClosed.get()) {
                cr.a.a(g1VarA, null);
                return;
            }
            File fileK3 = K();
            if ((fileK3 == null || !fileK3.exists()) && (fileK = K()) != null) {
                fileK.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (fileK2 = K()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileK2), fu.d.UTF_8), PKIFailureInfo.certRevoked);
                try {
                    eu.h<String> hVarC = ar.j.c(bufferedReader);
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator<String> it = hVarC.iterator();
                    while (it.hasNext()) {
                        List listV0 = fu.r.V0(it.next(), new String[]{"="}, false, 2, 2, null);
                        oq.r rVarA = oq.y.a((String) listV0.get(0), (String) listV0.get(1));
                        linkedHashMap.put((String) rVarA.c(), (String) rVarA.d());
                    }
                    ar.b.a(bufferedReader, null);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ar.b.a(bufferedReader, th4);
                        throw th5;
                    }
                }
            }
            if (value == null) {
                this.ongoingSegment.remove(key);
            } else {
                this.ongoingSegment.put(key, value);
            }
            File fileK4 = K();
            if (fileK4 != null) {
                ar.d.h(fileK4, pq.v.v0(this.ongoingSegment.entrySet(), "\n", null, null, 0, null, c.f94458b, 30, null), null, 2, null);
                i0 i0Var = i0.f148189a;
            }
            cr.a.a(g1VarA, null);
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                cr.a.a(g1VarA, th6);
                throw th7;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String N(long until) throws Exception {
        p0 p0Var = new p0();
        g1 g1VarA = this.framesLock.a();
        try {
            pq.v.J(this.frames, new e(until, this, p0Var));
            cr.a.a(g1VarA, null);
            return (String) p0Var.f66410a;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        g1 g1VarA = this.encoderLock.a();
        try {
            io.sentry.android.replay.video.c cVar = this.encoder;
            if (cVar != null) {
                cVar.i();
            }
            this.encoder = null;
            i0 i0Var = i0.f148189a;
            cr.a.a(g1VarA, null);
            this.isClosed.set(true);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    public final void p(File screenshot, long frameTimestamp, String screen) throws Exception {
        ReplayFrame replayFrame = new ReplayFrame(screenshot, frameTimestamp, screen);
        g1 g1VarA = this.framesLock.a();
        try {
            this.frames.add(replayFrame);
            i0 i0Var = i0.f148189a;
            cr.a.a(g1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    public final void u(Bitmap bitmap, long frameTimestamp, String screen) throws Exception {
        if (L() == null || bitmap.isRecycled()) {
            return;
        }
        File fileL = L();
        if (fileL != null) {
            fileL.mkdirs();
        }
        File file = new File(L(), frameTimestamp + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().h().screenshotQuality, fileOutputStream);
            fileOutputStream.flush();
            i0 i0Var = i0.f148189a;
            ar.b.a(fileOutputStream, null);
            p(file, frameTimestamp, screen);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ar.b.a(fileOutputStream, th4);
                throw th5;
            }
        }
    }

    public final GeneratedVideo y(long duration, long from, int segmentId, int height, int width, int frameRate, int bitRate, File videoFile) throws Exception {
        g1 g1Var;
        int i15;
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        g1 g1VarA = this.framesLock.a();
        try {
            List<ReplayFrame> arrayList = this.frames.isEmpty() ? new ArrayList() : pq.v.i1(this.frames);
            cr.a.a(g1VarA, null);
            if (arrayList.isEmpty()) {
                this.options.getLogger().c(b7.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            g1 g1VarA2 = this.encoderLock.a();
            try {
                g1Var = g1VarA2;
                try {
                    io.sentry.android.replay.video.c cVar = new io.sentry.android.replay.video.c(this.options, new MuxerConfig(videoFile, width, height, frameRate, bitRate, null, 32, null), null, 4, null);
                    cVar.j();
                    cr.a.a(g1Var, null);
                    this.encoder = cVar;
                    long j15 = ((long) 1000) / ((long) frameRate);
                    Object objN0 = pq.v.n0(arrayList);
                    long j16 = from + duration;
                    lr.j jVarV = lr.m.v(lr.m.x(from, j16), j15);
                    long first = jVarV.getFirst();
                    long last = jVarV.getLast();
                    long step = jVarV.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        long j17 = first;
                        i15 = 0;
                        while (true) {
                            for (ReplayFrame replayFrame : arrayList) {
                                long j18 = j17 + j15;
                                long timestamp = replayFrame.getTimestamp();
                                if (j17 <= timestamp && timestamp <= j18) {
                                    objN0 = replayFrame;
                                    break;
                                }
                                if (replayFrame.getTimestamp() > j18) {
                                    break;
                                }
                            }
                            if (H((ReplayFrame) objN0)) {
                                i15++;
                            } else if (objN0 != null) {
                                E(((ReplayFrame) objN0).getScreenshot());
                                g1 g1VarA3 = this.framesLock.a();
                                try {
                                    w0.a(this.frames).remove(objN0);
                                    cr.a.a(g1VarA3, null);
                                    arrayList.remove(objN0);
                                    objN0 = null;
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        cr.a.a(g1VarA3, th4);
                                        throw th5;
                                    }
                                }
                            }
                            if (j17 == last) {
                                break;
                            }
                            j17 += step;
                        }
                    } else {
                        i15 = 0;
                    }
                    if (i15 == 0) {
                        this.options.getLogger().c(b7.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        E(videoFile);
                        return null;
                    }
                    g1 g1VarA4 = this.encoderLock.a();
                    try {
                        io.sentry.android.replay.video.c cVar2 = this.encoder;
                        if (cVar2 != null) {
                            cVar2.i();
                        }
                        io.sentry.android.replay.video.c cVar3 = this.encoder;
                        long jC = cVar3 != null ? cVar3.c() : 0L;
                        this.encoder = null;
                        i0 i0Var = i0.f148189a;
                        cr.a.a(g1VarA4, null);
                        N(j16);
                        return new GeneratedVideo(videoFile, i15, jC);
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            cr.a.a(g1VarA4, th6);
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    Throwable th9 = th;
                    try {
                        throw th9;
                    } catch (Throwable th10) {
                        cr.a.a(g1Var, th9);
                        throw th10;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                g1Var = g1VarA2;
            }
        } catch (Throwable th12) {
            try {
                throw th12;
            } catch (Throwable th13) {
                cr.a.a(g1VarA, th12);
                throw th13;
            }
        }
    }
}
