package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.rrweb.d;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.transport.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eRP\u0010\u0017\u001a>\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00130\u000fj\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/gestures/b;", "", "Lio/sentry/transport/p;", "dateProvider", "<init>", "(Lio/sentry/transport/p;)V", "Landroid/view/MotionEvent;", "event", "Lio/sentry/android/replay/u;", "recorderConfig", "", "Lio/sentry/rrweb/d;", "a", "(Landroid/view/MotionEvent;Lio/sentry/android/replay/u;)Ljava/util/List;", "Lio/sentry/transport/p;", "Ljava/util/LinkedHashMap;", "", "Ljava/util/ArrayList;", "Lio/sentry/rrweb/f$b;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "b", "Ljava/util/LinkedHashMap;", "currentPositions", "", "c", "J", "touchMoveBaseline", "d", "lastCapturedMoveEvent", "e", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94439f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p dateProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<Integer, ArrayList<f.b>> currentPositions = new LinkedHashMap<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long touchMoveBaseline;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long lastCapturedMoveEvent;

    public b(p pVar) {
        this.dateProvider = pVar;
    }

    public final List<d> a(MotionEvent event, ScreenshotRecorderConfig recorderConfig) {
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long jA = this.dateProvider.a();
                    long j15 = this.lastCapturedMoveEvent;
                    long j16 = 0;
                    if (j15 != 0 && j15 + ((long) 50) > jA) {
                        return null;
                    }
                    this.lastCapturedMoveEvent = jA;
                    for (Integer num : this.currentPositions.keySet()) {
                        int iFindPointerIndex = event.findPointerIndex(num.intValue());
                        if (iFindPointerIndex != -1) {
                            if (this.touchMoveBaseline == 0) {
                                this.touchMoveBaseline = jA;
                            }
                            ArrayList<f.b> arrayList = this.currentPositions.get(num);
                            f.b bVar = new f.b();
                            bVar.i(event.getX(iFindPointerIndex) * recorderConfig.getScaleFactorX());
                            bVar.j(event.getY(iFindPointerIndex) * recorderConfig.getScaleFactorY());
                            bVar.f(0);
                            bVar.g(jA - this.touchMoveBaseline);
                            arrayList.add(bVar);
                        }
                    }
                    long j17 = jA - this.touchMoveBaseline;
                    if (j17 <= 500) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList(this.currentPositions.size());
                    for (Map.Entry<Integer, ArrayList<f.b>> entry : this.currentPositions.entrySet()) {
                        int iIntValue = entry.getKey().intValue();
                        ArrayList<f.b> value = entry.getValue();
                        if (!value.isEmpty()) {
                            f fVar = new f();
                            fVar.f(jA);
                            ArrayList arrayList3 = new ArrayList(v.y(value, 10));
                            for (f.b bVar2 : value) {
                                bVar2.g(bVar2.e() - j17);
                                arrayList3.add(bVar2);
                            }
                            fVar.n(arrayList3);
                            fVar.m(iIntValue);
                            arrayList2.add(fVar);
                            this.currentPositions.get(Integer.valueOf(iIntValue)).clear();
                            j16 = 0;
                        }
                    }
                    this.touchMoveBaseline = j16;
                    return arrayList2;
                }
                if (actionMasked == 3) {
                    this.currentPositions.clear();
                    e eVar = new e();
                    eVar.f(this.dateProvider.a());
                    eVar.u(event.getX() * recorderConfig.getScaleFactorX());
                    eVar.v(event.getY() * recorderConfig.getScaleFactorY());
                    eVar.q(0);
                    eVar.s(0);
                    eVar.r(e.b.TouchCancel);
                    return v.e(eVar);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.currentPositions.remove(Integer.valueOf(pointerId));
            e eVar2 = new e();
            eVar2.f(this.dateProvider.a());
            eVar2.u(event.getX(iFindPointerIndex2) * recorderConfig.getScaleFactorX());
            eVar2.v(event.getY(iFindPointerIndex2) * recorderConfig.getScaleFactorY());
            eVar2.q(0);
            eVar2.s(pointerId);
            eVar2.r(e.b.TouchEnd);
            return v.e(eVar2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.currentPositions.put(Integer.valueOf(pointerId2), new ArrayList<>(10));
        e eVar3 = new e();
        eVar3.f(this.dateProvider.a());
        eVar3.u(event.getX(iFindPointerIndex3) * recorderConfig.getScaleFactorX());
        eVar3.v(event.getY(iFindPointerIndex3) * recorderConfig.getScaleFactorY());
        eVar3.q(0);
        eVar3.s(pointerId2);
        eVar3.r(e.b.TouchStart);
        return v.e(eVar3);
    }
}
