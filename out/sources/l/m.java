package l;

import CON.j0;
import android.hardware.camera2.CameraAccessException;
import android.os.Trace;
import h.InputRequest;
import h.g0;
import h.g1;
import h.h0;
import h.i0;
import h.i1;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\b\u0004*\u0001*\u0018\u0000 \n2\u00020\u0001:\u0001\bB#\b\u0002\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u000b\u0010\fJo\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+¨\u0006-"}, d2 = {"Ll/m;", "", "Lh/h0;", "Lh/g0;", "captureSequenceProcessor", "<init>", "(Lh/h0;)V", "Loq/i0;", "a", "()V", "f", "e", "(Ltq/e;)Ljava/lang/Object;", "", "isRepeating", "", "Lh/g1;", "requests", "", "defaultParameters", "graphParameters", "requiredParameters", "Lh/g1$a;", "listeners", "g", "(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z", "", "toString", "()Ljava/lang/String;", "Lh/h0;", "", "b", "I", "debugId", "Liu/a;", "c", "Liu/a;", "closed", "", "d", "Ljava/util/List;", "activeCaptureSequences", "l/m$b", "Ll/m$b;", "activeBurstListener", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0<Object, g0<Object>> captureSequenceProcessor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int debugId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iu.a closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<g0<?>> activeCaptureSequences;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b activeBurstListener;

    /* JADX INFO: renamed from: l.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll/m$a;", "", "<init>", "()V", "Lh/h0;", "captureSequenceProcessor", "Ll/m;", "a", "(Lh/h0;)Ll/m;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final m a(h0<?, ?> captureSequenceProcessor) {
            return new m(captureSequenceProcessor, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/m$b", "Lh/g0$a;", "Lh/g0;", "captureSequence", "Loq/i0;", "a", "(Lh/g0;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements g0.a {
        b() {
        }

        @Override // h.g0.a
        public void a(g0<?> captureSequence) {
            if (captureSequence.r()) {
                return;
            }
            List list = m.this.activeCaptureSequences;
            m mVar = m.this;
            synchronized (list) {
                mVar.activeCaptureSequences.remove(captureSequence);
            }
        }
    }

    public /* synthetic */ m(h0 h0Var, fr.k kVar) {
        this(h0Var);
    }

    public final void a() {
        List<g0> listF1;
        synchronized (this.activeCaptureSequences) {
            listF1 = pq.v.f1(this.activeCaptureSequences);
            this.activeCaptureSequences.clear();
        }
        for (g0 g0Var : listF1) {
            i0 i0Var = i0.f78934a;
            k.h hVar = k.h.f107050a;
            Trace.beginSection("InvokeInternalListeners");
            int size = g0Var.u().size();
            for (int i15 = 0; i15 < size; i15++) {
                i1 i1Var = g0Var.u().get(i15);
                int size2 = g0Var.s().size();
                for (int i16 = 0; i16 < size2; i16++) {
                    g0Var.s().get(i16).H(i1Var.b());
                }
            }
            k.h hVar2 = k.h.f107050a;
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = g0Var.u().size();
            for (int i17 = 0; i17 < size3; i17++) {
                i1 i1Var2 = g0Var.u().get(i17);
                int size4 = i1Var2.b().d().size();
                for (int i18 = 0; i18 < size4; i18++) {
                    i1Var2.b().d().get(i18).H(i1Var2.b());
                }
            }
            k.h hVar3 = k.h.f107050a;
            Trace.endSection();
        }
        this.captureSequenceProcessor.T();
    }

    public final Object e(tq.e<? super oq.i0> eVar) {
        Object objU;
        if (k.k.f107055a.a()) {
            toString();
        }
        return (this.closed.a(false, true) && (objU = this.captureSequenceProcessor.U(eVar)) == uq.b.e()) ? objU : oq.i0.f148189a;
    }

    public final void f() {
        this.captureSequenceProcessor.stopRepeating();
    }

    public final boolean g(boolean isRepeating, List<g1> requests, Map<?, ? extends Object> defaultParameters, Map<?, ? extends Object> graphParameters, Map<?, ? extends Object> requiredParameters, List<? extends g1.a> listeners) throws Exception {
        Throwable th4;
        boolean z15;
        n.o image;
        if (this.closed.b()) {
            if (k.k.f107055a.d()) {
                c2.g("CXCP", "Failed to submit " + requests + ": " + this + " is closed.");
            }
            return false;
        }
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            g0<?> g0VarW = this.captureSequenceProcessor.W(isRepeating, requests, defaultParameters, graphParameters, requiredParameters, this.activeBurstListener, listeners);
            Trace.endSection();
            boolean z16 = true;
            if (g0VarW == null) {
                List<g1> list = requests;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((g1) it.next()).getInputRequest() != null) {
                            for (g1 g1Var : requests) {
                                InputRequest inputRequest = g1Var.getInputRequest();
                                if (inputRequest != null && (image = inputRequest.getImage()) != null) {
                                    j0.a(image);
                                    oq.i0 i0Var = oq.i0.f148189a;
                                }
                                Iterator<g1.a> it4 = g1Var.d().iterator();
                                while (it4.hasNext()) {
                                    it4.next().H(g1Var);
                                }
                            }
                            return true;
                        }
                    }
                }
                if (k.k.f107055a.d()) {
                    c2.g("CXCP", "Failed to submit " + requests + ": " + this + " failed to build CaptureSequence.");
                }
                return false;
            }
            if (this.closed.b()) {
                if (k.k.f107055a.d()) {
                    c2.g("CXCP", "Failed to submit " + requests + ": " + this + " is closed.");
                }
                return false;
            }
            if (!g0VarW.r()) {
                synchronized (this.activeCaptureSequences) {
                    this.activeCaptureSequences.add(g0VarW);
                }
            }
            try {
                if (k.k.f107055a.a()) {
                    toString();
                    g0VarW.toString();
                }
                i0 i0Var2 = i0.f78934a;
                Trace.beginSection("InvokeInternalListeners");
                int size = g0VarW.u().size();
                for (int i15 = 0; i15 < size; i15++) {
                    i1 i1Var = g0VarW.u().get(i15);
                    int size2 = g0VarW.s().size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        g0VarW.s().get(i16).M(i1Var);
                    }
                }
                k.h hVar2 = k.h.f107050a;
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = g0VarW.u().size();
                for (int i17 = 0; i17 < size3; i17++) {
                    i1 i1Var2 = g0VarW.u().get(i17);
                    int size4 = i1Var2.b().d().size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        i1Var2.b().d().get(i18).M(i1Var2);
                    }
                }
                k.h hVar3 = k.h.f107050a;
                Trace.endSection();
                synchronized (g0VarW) {
                    if (this.closed.b()) {
                        if (k.k.f107055a.d()) {
                            c2.g("CXCP", "Failed to submit " + g0VarW + ": " + this + " is closed.");
                        }
                        if (!g0VarW.r()) {
                            synchronized (this.activeCaptureSequences) {
                                this.activeCaptureSequences.remove(g0VarW);
                            }
                            i0 i0Var3 = i0.f78934a;
                            Trace.beginSection("InvokeInternalListeners");
                            int size5 = g0VarW.u().size();
                            for (int i19 = 0; i19 < size5; i19++) {
                                i1 i1Var3 = g0VarW.u().get(i19);
                                int size6 = g0VarW.s().size();
                                for (int i25 = 0; i25 < size6; i25++) {
                                    g0VarW.s().get(i25).H(i1Var3.b());
                                }
                            }
                            k.h hVar4 = k.h.f107050a;
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size7 = g0VarW.u().size();
                            for (int i26 = 0; i26 < size7; i26++) {
                                i1 i1Var4 = g0VarW.u().get(i26);
                                int size8 = i1Var4.b().d().size();
                                for (int i27 = 0; i27 < size8; i27++) {
                                    i1Var4.b().d().get(i27).H(i1Var4.b());
                                }
                            }
                            k.h hVar5 = k.h.f107050a;
                            Trace.endSection();
                        }
                        return false;
                    }
                    try {
                        Trace.beginSection("CXCP#submit(CaptureSequence)");
                        Integer numV = this.captureSequenceProcessor.V(g0VarW);
                        int iIntValue = numV != null ? numV.intValue() : -1;
                        g0VarW.t(iIntValue);
                        Trace.endSection();
                        if (iIntValue != -1) {
                            i0 i0Var4 = i0.f78934a;
                            Trace.beginSection("InvokeInternalListeners");
                            int size9 = g0VarW.u().size();
                            for (int i28 = 0; i28 < size9; i28++) {
                                i1 i1Var5 = g0VarW.u().get(i28);
                                int size10 = g0VarW.s().size();
                                for (int i29 = 0; i29 < size10; i29++) {
                                    g0VarW.s().get(i29).V(i1Var5);
                                }
                            }
                            k.h hVar6 = k.h.f107050a;
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size11 = g0VarW.u().size();
                            for (int i35 = 0; i35 < size11; i35++) {
                                i1 i1Var6 = g0VarW.u().get(i35);
                                int size12 = i1Var6.b().d().size();
                                for (int i36 = 0; i36 < size12; i36++) {
                                    i1Var6.b().d().get(i36).V(i1Var6);
                                }
                            }
                            k.h hVar7 = k.h.f107050a;
                            Trace.endSection();
                            try {
                                if (k.k.f107055a.a()) {
                                    toString();
                                    g0VarW.toString();
                                }
                                z15 = true;
                            } catch (CameraAccessException unused) {
                                if (!z16 && !g0VarW.r()) {
                                    synchronized (this.activeCaptureSequences) {
                                        this.activeCaptureSequences.remove(g0VarW);
                                    }
                                    i0 i0Var5 = i0.f78934a;
                                    k.h hVar8 = k.h.f107050a;
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size13 = g0VarW.u().size();
                                    for (int i37 = 0; i37 < size13; i37++) {
                                        i1 i1Var7 = g0VarW.u().get(i37);
                                        int size14 = g0VarW.s().size();
                                        for (int i38 = 0; i38 < size14; i38++) {
                                            g0VarW.s().get(i38).H(i1Var7.b());
                                        }
                                    }
                                    k.h hVar9 = k.h.f107050a;
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size15 = g0VarW.u().size();
                                    for (int i39 = 0; i39 < size15; i39++) {
                                        i1 i1Var8 = g0VarW.u().get(i39);
                                        int size16 = i1Var8.b().d().size();
                                        for (int i45 = 0; i45 < size16; i45++) {
                                            i1Var8.b().d().get(i45).H(i1Var8.b());
                                        }
                                    }
                                    k.h hVar10 = k.h.f107050a;
                                    Trace.endSection();
                                }
                                return false;
                            } catch (Throwable th5) {
                                th4 = th5;
                                if (z16 || g0VarW.r()) {
                                    throw th4;
                                }
                                synchronized (this.activeCaptureSequences) {
                                    this.activeCaptureSequences.remove(g0VarW);
                                }
                                i0 i0Var6 = i0.f78934a;
                                k.h hVar11 = k.h.f107050a;
                                Trace.beginSection("InvokeInternalListeners");
                                int size17 = g0VarW.u().size();
                                for (int i46 = 0; i46 < size17; i46++) {
                                    i1 i1Var9 = g0VarW.u().get(i46);
                                    int size18 = g0VarW.s().size();
                                    for (int i47 = 0; i47 < size18; i47++) {
                                        g0VarW.s().get(i47).H(i1Var9.b());
                                    }
                                }
                                k.h hVar12 = k.h.f107050a;
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size19 = g0VarW.u().size();
                                for (int i48 = 0; i48 < size19; i48++) {
                                    i1 i1Var10 = g0VarW.u().get(i48);
                                    int size20 = i1Var10.b().d().size();
                                    for (int i49 = 0; i49 < size20; i49++) {
                                        i1Var10.b().d().get(i49).H(i1Var10.b());
                                    }
                                }
                                k.h hVar13 = k.h.f107050a;
                                Trace.endSection();
                                throw th4;
                            }
                        } else {
                            if (k.k.f107055a.d()) {
                                c2.g("CXCP", "Failed to submit " + g0VarW + ": " + this + " received -1 from submit.");
                            }
                            z15 = false;
                            z16 = false;
                        }
                        if (z15 || g0VarW.r()) {
                            return z16;
                        }
                        synchronized (this.activeCaptureSequences) {
                            this.activeCaptureSequences.remove(g0VarW);
                        }
                        i0 i0Var7 = i0.f78934a;
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = g0VarW.u().size();
                        for (int i55 = 0; i55 < size21; i55++) {
                            i1 i1Var11 = g0VarW.u().get(i55);
                            int size22 = g0VarW.s().size();
                            for (int i56 = 0; i56 < size22; i56++) {
                                g0VarW.s().get(i56).H(i1Var11.b());
                            }
                        }
                        k.h hVar14 = k.h.f107050a;
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = g0VarW.u().size();
                        for (int i57 = 0; i57 < size23; i57++) {
                            i1 i1Var12 = g0VarW.u().get(i57);
                            int size24 = i1Var12.b().d().size();
                            for (int i58 = 0; i58 < size24; i58++) {
                                i1Var12.b().d().get(i58).H(i1Var12.b());
                            }
                        }
                        k.h hVar15 = k.h.f107050a;
                        Trace.endSection();
                        return z16;
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
            } catch (CameraAccessException unused2) {
                z16 = false;
            } catch (Throwable th7) {
                th4 = th7;
                z16 = false;
            }
        } catch (Throwable th8) {
            Trace.endSection();
            throw th8;
        }
    }

    public String toString() {
        return "GraphRequestProcessor-" + this.debugId;
    }

    private m(h0<? extends Object, g0<Object>> h0Var) {
        this.captureSequenceProcessor = h0Var;
        this.debugId = n.a().d();
        this.closed = iu.b.a(false);
        this.activeCaptureSequences = new ArrayList();
        this.activeBurstListener = new b();
    }
}
