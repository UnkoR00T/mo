package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import er.p;
import fr.p0;
import fr.t;
import fr.w;
import io.sentry.a1;
import io.sentry.android.replay.GeneratedVideo;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.b4;
import io.sentry.c1;
import io.sentry.h4;
import io.sentry.j0;
import io.sentry.protocol.v;
import io.sentry.q7;
import io.sentry.r7;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b`\u0018\u0000 72\u00020\u0001:\u00027-J/\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\fJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0018H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0000H&¢\u0006\u0004\b&\u0010'R\u001c\u0010,\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u00101\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00106\u001a\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00068"}, d2 = {"Lio/sentry/android/replay/capture/h;", "", "", "segmentId", "Lio/sentry/protocol/v;", "replayId", "Lio/sentry/r7$b;", "replayType", "Loq/i0;", "j", "(ILio/sentry/protocol/v;Lio/sentry/r7$b;)V", "stop", "()V", "g", "s", "", "isTerminating", "Lkotlin/Function1;", "Ljava/util/Date;", "onSegmentSent", "h", "(ZLer/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Lio/sentry/android/replay/h;", "", "store", "f", "(Landroid/graphics/Bitmap;Ler/p;)V", "Lio/sentry/android/replay/u;", "recorderConfig", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lio/sentry/android/replay/u;)V", "Landroid/view/MotionEvent;", "event", "b", "(Landroid/view/MotionEvent;)V", "i", "()Lio/sentry/android/replay/capture/h;", "e", "()I", "d", "(I)V", "currentSegment", "c", "()Lio/sentry/protocol/v;", "setCurrentReplayId", "(Lio/sentry/protocol/v;)V", "currentReplayId", "getSegmentTimestamp", "()Ljava/util/Date;", "k", "(Ljava/util/Date;)V", "segmentTimestamp", "a", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f94403a;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u008d\u0001\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0099\u0001\u0010-\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b-\u0010.J=\u00103\u001a\u0002012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010/\u001a\u00020\u00172\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000201\u0018\u000100H\u0000¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"Lio/sentry/android/replay/capture/h$a;", "", "<init>", "()V", "Lio/sentry/f;", "", "e", "(Lio/sentry/f;)Z", "f", "Lio/sentry/q7;", "options", "Ljava/io/File;", "video", "Lio/sentry/protocol/v;", "currentReplayId", "Ljava/util/Date;", "segmentTimestamp", "", "segmentId", "height", "width", "frameCount", "frameRate", "", "videoDuration", "Lio/sentry/r7$b;", "replayType", "", "screenAtStart", "", "breadcrumbs", "Ljava/util/Deque;", "Lio/sentry/rrweb/b;", "events", "Lio/sentry/android/replay/capture/h$c;", "b", "(Lio/sentry/q7;Ljava/io/File;Lio/sentry/protocol/v;Ljava/util/Date;IIIIIJLio/sentry/r7$b;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;", "Lio/sentry/c1;", "scopes", "duration", "currentSegmentTimestamp", "replayId", "Lio/sentry/android/replay/h;", "cache", "bitRate", "c", "(Lio/sentry/c1;Lio/sentry/q7;JLjava/util/Date;Lio/sentry/protocol/v;IIILio/sentry/r7$b;Lio/sentry/android/replay/h;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;", "until", "Lkotlin/Function1;", "Loq/i0;", "callback", "g", "(Ljava/util/Deque;JLer/l;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f94403a = new Companion();

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/rrweb/b;", "event", "Loq/i0;", "c", "(Lio/sentry/rrweb/b;)V"}, k = 3, mv = {1, 9, 0})
        static final class C2223a extends w implements er.l<io.sentry.rrweb.b, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Date f94404b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<io.sentry.rrweb.b> f94405c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2223a(Date date, List<io.sentry.rrweb.b> list) {
                super(1);
                this.f94404b = date;
                this.f94405c = list;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(io.sentry.rrweb.b bVar) {
                c(bVar);
                return i0.f148189a;
            }

            public final void c(io.sentry.rrweb.b bVar) {
                if (bVar.e() >= this.f94404b.getTime()) {
                    this.f94405c.add(bVar);
                }
            }
        }

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t15, T t16) {
                return sq.a.e(Long.valueOf(((io.sentry.rrweb.b) t15).e()), Long.valueOf(((io.sentry.rrweb.b) t16).e()));
            }
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00c3  */
        private final c b(q7 options, File video, v currentReplayId, Date segmentTimestamp, int segmentId, int height, int width, int frameCount, int frameRate, long videoDuration, r7.b replayType, String screenAtStart, List<io.sentry.f> breadcrumbs, Deque<io.sentry.rrweb.b> events) {
            boolean z15;
            io.sentry.rrweb.b bVarA;
            Object obj;
            Date dateE = io.sentry.m.e(segmentTimestamp.getTime() + videoDuration);
            r7 r7Var = new r7();
            r7Var.W(currentReplayId);
            r7Var.j0(currentReplayId);
            r7Var.m0(segmentId);
            r7Var.n0(dateE);
            r7Var.k0(segmentTimestamp);
            r7Var.l0(replayType);
            r7Var.s0(video);
            ArrayList arrayList = new ArrayList();
            io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
            gVar.f(segmentTimestamp.getTime());
            gVar.l(height);
            gVar.n(width);
            arrayList.add(gVar);
            io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
            jVar.f(segmentTimestamp.getTime());
            jVar.C(segmentId);
            jVar.w(videoDuration);
            jVar.x(frameCount);
            jVar.D(video.length());
            jVar.y(frameRate);
            jVar.z(height);
            jVar.G(width);
            jVar.A(0);
            jVar.E(0);
            arrayList.add(jVar);
            LinkedList linkedList = new LinkedList();
            io.sentry.f fVar = null;
            for (io.sentry.f fVar2 : breadcrumbs) {
                if (fVar != null) {
                    Companion companion = f94403a;
                    z15 = companion.e(fVar) && companion.f(fVar2) && fVar2.s().getTime() + 5000 >= segmentTimestamp.getTime();
                }
                if ((fVar2.s().getTime() >= segmentTimestamp.getTime() || z15) && fVar2.s().getTime() < dateE.getTime() && (bVarA = options.getReplayController().E().a(fVar2)) != null) {
                    arrayList.add(bVarA);
                    io.sentry.rrweb.a aVar = bVarA instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarA : null;
                    if (t.c(aVar != null ? aVar.n() : null, "navigation")) {
                        io.sentry.rrweb.a aVar2 = (io.sentry.rrweb.a) bVarA;
                        Map<String, Object> mapO = aVar2.o();
                        if (mapO == null || (obj = mapO.get("to")) == null) {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            linkedList.add((String) aVar2.o().get("to"));
                        }
                    }
                }
                fVar = fVar2;
            }
            if (screenAtStart != null && !t.c(pq.v.n0(linkedList), screenAtStart)) {
                linkedList.addFirst(screenAtStart);
            }
            g(events, dateE.getTime(), new C2223a(segmentTimestamp, arrayList));
            if (segmentId == 0) {
                arrayList.add(new io.sentry.rrweb.h(options));
            }
            b4 b4Var = new b4();
            b4Var.c(Integer.valueOf(segmentId));
            b4Var.b(pq.v.U0(arrayList, new b()));
            r7Var.r0(linkedList);
            return new c.Created(r7Var, b4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        public static final void d(p0 p0Var, a1 a1Var) {
            p0Var.f66410a = new ArrayList(a1Var.z());
        }

        private final boolean e(io.sentry.f fVar) {
            if (fVar == null || !t.c(fVar.o(), "network.event")) {
                return false;
            }
            Object obj = fVar.p().get("action");
            if (obj == null) {
                obj = null;
            }
            return t.c(obj, "NETWORK_AVAILABLE");
        }

        private final boolean f(io.sentry.f fVar) {
            return t.c(fVar.o(), "network.event") && fVar.p().containsKey("network_type");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void h(Companion companion, Deque deque, long j15, er.l lVar, int i15, Object obj) {
            if ((i15 & 4) != 0) {
                lVar = null;
            }
            companion.g(deque, j15, lVar);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.List] */
        public final c c(c1 scopes, q7 options, long duration, Date currentSegmentTimestamp, v replayId, int segmentId, int height, int width, r7.b replayType, io.sentry.android.replay.h cache, int frameRate, int bitRate, String screenAtStart, List<io.sentry.f> breadcrumbs, Deque<io.sentry.rrweb.b> events) {
            GeneratedVideo generatedVideoC;
            List<io.sentry.f> list;
            if (cache == null || (generatedVideoC = io.sentry.android.replay.h.C(cache, Math.min(duration, 300000L), currentSegmentTimestamp.getTime(), segmentId, height, width, frameRate, bitRate, null, 128, null)) == null) {
                return c.b.f94408a;
            }
            File video = generatedVideoC.getVideo();
            int frameCount = generatedVideoC.getFrameCount();
            long duration2 = generatedVideoC.getDuration();
            if (breadcrumbs == null) {
                final p0 p0Var = new p0();
                p0Var.f66410a = pq.v.n();
                if (scopes != null) {
                    scopes.J(new h4() { // from class: io.sentry.android.replay.capture.g
                        @Override // io.sentry.h4
                        public final void a(a1 a1Var) {
                            h.Companion.d(p0Var, a1Var);
                        }
                    });
                }
                list = (List) p0Var.f66410a;
            } else {
                list = breadcrumbs;
            }
            return b(options, video, replayId, currentSegmentTimestamp, segmentId, height, width, frameCount, frameRate, duration2, replayType, screenAtStart, list, events);
        }

        public final void g(Deque<io.sentry.rrweb.b> events, long until, er.l<? super io.sentry.rrweb.b, i0> callback) {
            Iterator<io.sentry.rrweb.b> it = events.iterator();
            while (it.hasNext()) {
                io.sentry.rrweb.b next = it.next();
                if (next.e() < until) {
                    if (callback != null) {
                        callback.b(next);
                    }
                    it.remove();
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(h hVar, int i15, v vVar, r7.b bVar, int i16, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i16 & 1) != 0) {
                i15 = 0;
            }
            if ((i16 & 2) != 0) {
                vVar = new v();
            }
            if ((i16 & 4) != 0) {
                bVar = null;
            }
            hVar.j(i15, vVar, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "", "<init>", "()V", "a", "b", "Lio/sentry/android/replay/capture/h$c$a;", "Lio/sentry/android/replay/capture/h$c$b;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/sentry/android/replay/capture/h$c$a;", "Lio/sentry/android/replay/capture/h$c;", "Lio/sentry/r7;", "replay", "Lio/sentry/b4;", "recording", "<init>", "(Lio/sentry/r7;Lio/sentry/b4;)V", "Lio/sentry/c1;", "scopes", "Lio/sentry/j0;", "hint", "Loq/i0;", "a", "(Lio/sentry/c1;Lio/sentry/j0;)V", "", "segmentId", "d", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/sentry/r7;", "c", "()Lio/sentry/r7;", "b", "Lio/sentry/b4;", "getRecording", "()Lio/sentry/b4;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Created extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final r7 replay;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b4 recording;

            public Created(r7 r7Var, b4 b4Var) {
                super(null);
                this.replay = r7Var;
                this.recording = b4Var;
            }

            public static /* synthetic */ void b(Created created, c1 c1Var, j0 j0Var, int i15, Object obj) {
                if ((i15 & 2) != 0) {
                    j0Var = new j0();
                }
                created.a(c1Var, j0Var);
            }

            public final void a(c1 scopes, j0 hint) {
                if (scopes != null) {
                    r7 r7Var = this.replay;
                    hint.l(this.recording);
                    i0 i0Var = i0.f148189a;
                    scopes.M(r7Var, hint);
                }
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final r7 getReplay() {
                return this.replay;
            }

            public final void d(int segmentId) {
                this.replay.m0(segmentId);
                List<? extends io.sentry.rrweb.b> listA = this.recording.a();
                if (listA != null) {
                    for (io.sentry.rrweb.b bVar : listA) {
                        if (bVar instanceof io.sentry.rrweb.j) {
                            ((io.sentry.rrweb.j) bVar).C(segmentId);
                        }
                    }
                }
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Created)) {
                    return false;
                }
                Created created = (Created) other;
                return t.c(this.replay, created.replay) && t.c(this.recording, created.recording);
            }

            public int hashCode() {
                return (this.replay.hashCode() * 31) + this.recording.hashCode();
            }

            public String toString() {
                return "Created(replay=" + this.replay + ", recording=" + this.recording + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c$b;", "Lio/sentry/android/replay/capture/h$c;", "<init>", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f94408a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(fr.k kVar) {
            this();
        }

        private c() {
        }
    }

    void P(ScreenshotRecorderConfig recorderConfig);

    void b(MotionEvent event);

    v c();

    void d(int i15);

    int e();

    void f(Bitmap bitmap, p<? super io.sentry.android.replay.h, ? super Long, i0> store);

    void g();

    void h(boolean isTerminating, er.l<? super Date, i0> onSegmentSent);

    h i();

    void j(int segmentId, v replayId, r7.b replayType);

    void k(Date date);

    void s();

    void stop();
}
