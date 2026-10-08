package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class l5 implements e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f95149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.transport.q f95150c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.logger.b f95152e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f95151d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f95148a = true;

    private static final class b implements Comparator<f> {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.s().compareTo(fVar2.s());
        }
    }

    public l5(q7 q7Var) {
        this.f95149b = (q7) io.sentry.util.v.c(q7Var, "SentryOptions is required.");
        n1 transportFactory = q7Var.getTransportFactory();
        if (transportFactory instanceof i3) {
            transportFactory = new io.sentry.a();
            q7Var.setTransportFactory(transportFactory);
        }
        this.f95150c = transportFactory.a(q7Var, new d4(q7Var).a());
        if (q7Var.getLogs().b()) {
            this.f95152e = new io.sentry.logger.e(q7Var, this);
        } else {
            this.f95152e = io.sentry.logger.g.b();
        }
    }

    private void A(a1 a1Var, j0 j0Var) {
        l1 l1VarU = a1Var.u();
        if (l1VarU == null || !io.sentry.util.m.h(j0Var, io.sentry.hints.q.class)) {
            return;
        }
        Object objG = io.sentry.util.m.g(j0Var);
        if (!(objG instanceof io.sentry.hints.f)) {
            l1VarU.e(u8.ABORTED, false, null);
        } else {
            ((io.sentry.hints.f) objG).c(l1VarU.i());
            l1VarU.e(u8.ABORTED, false, j0Var);
        }
    }

    private List<io.sentry.b> B(j0 j0Var) {
        List<io.sentry.b> listE = j0Var.e();
        io.sentry.b bVarG = j0Var.g();
        if (bVarG != null) {
            listE.add(bVarG);
        }
        io.sentry.b bVarI = j0Var.i();
        if (bVarI != null) {
            listE.add(bVarI);
        }
        io.sentry.b bVarH = j0Var.h();
        if (bVarH != null) {
            listE.add(bVarH);
        }
        return listE;
    }

    private z8 C(a1 a1Var, j0 j0Var, i5 i5Var, String str) {
        if (io.sentry.util.m.h(j0Var, io.sentry.hints.c.class)) {
            if (i5Var != null) {
                return d.e(i5Var, str, this.f95149b).Q();
            }
            return null;
        }
        if (a1Var == null) {
            return null;
        }
        l1 l1VarU = a1Var.u();
        return l1VarU != null ? l1VarU.l() : io.sentry.util.i0.h(a1Var, this.f95149b).h();
    }

    private z8 D(a1 a1Var, j0 j0Var, r6 r6Var) {
        return C(a1Var, j0Var, r6Var, r6Var != null ? r6Var.w0() : null);
    }

    private r6 E(r6 r6Var, j0 j0Var, List<e0> list) {
        for (e0 e0Var : list) {
            try {
                boolean z15 = e0Var instanceof c;
                boolean zH = io.sentry.util.m.h(j0Var, io.sentry.hints.c.class);
                if (zH && z15) {
                    r6Var = e0Var.m(r6Var, j0Var);
                } else if (!zH && !z15) {
                    r6Var = e0Var.m(r6Var, j0Var);
                }
            } catch (Throwable th4) {
                this.f95149b.getLogger().a(b7.ERROR, th4, "An exception occurred while processing event by processor: %s", e0Var.getClass().getName());
            }
            if (r6Var == null) {
                this.f95149b.getLogger().c(b7.DEBUG, "Event was dropped by a processor: %s", e0Var.getClass().getName());
                this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, l.Error);
                break;
            }
        }
        return r6Var;
    }

    private d7 G(d7 d7Var, List<e0> list) {
        for (e0 e0Var : list) {
            try {
                d7Var = e0Var.h(d7Var);
            } catch (Throwable th4) {
                this.f95149b.getLogger().a(b7.ERROR, th4, "An exception occurred while processing log event by processor: %s", e0Var.getClass().getName());
            }
            if (d7Var == null) {
                this.f95149b.getLogger().c(b7.DEBUG, "Log event was dropped by a processor: %s", e0Var.getClass().getName());
                this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, l.LogItem);
                break;
            }
        }
        return d7Var;
    }

    private r7 I(r7 r7Var, j0 j0Var, List<e0> list) {
        for (e0 e0Var : list) {
            try {
                r7Var = e0Var.b(r7Var, j0Var);
            } catch (Throwable th4) {
                this.f95149b.getLogger().a(b7.ERROR, th4, "An exception occurred while processing replay event by processor: %s", e0Var.getClass().getName());
            }
            if (r7Var == null) {
                this.f95149b.getLogger().c(b7.DEBUG, "Replay event was dropped by a processor: %s", e0Var.getClass().getName());
                this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, l.Replay);
                break;
            }
        }
        return r7Var;
    }

    private io.sentry.protocol.c0 J(io.sentry.protocol.c0 c0Var, j0 j0Var, List<e0> list) {
        for (e0 e0Var : list) {
            int size = c0Var.o0().size();
            try {
                c0Var = e0Var.p(c0Var, j0Var);
            } catch (Throwable th4) {
                this.f95149b.getLogger().a(b7.ERROR, th4, "An exception occurred while processing transaction by processor: %s", e0Var.getClass().getName());
            }
            int size2 = c0Var == null ? 0 : c0Var.o0().size();
            if (c0Var == null) {
                this.f95149b.getLogger().c(b7.DEBUG, "Transaction was dropped by a processor: %s", e0Var.getClass().getName());
                io.sentry.clientreport.h clientReportRecorder = this.f95149b.getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
                clientReportRecorder.a(fVar, l.Transaction);
                this.f95149b.getClientReportRecorder().c(fVar, l.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i15 = size - size2;
                this.f95149b.getLogger().c(b7.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i15), e0Var.getClass().getName());
                this.f95149b.getClientReportRecorder().c(io.sentry.clientreport.f.EVENT_PROCESSOR, l.Span, i15);
            }
        }
        return c0Var;
    }

    private boolean K() {
        io.sentry.util.z zVarA = this.f95149b.getSampleRate() == null ? null : io.sentry.util.b0.a();
        return this.f95149b.getSampleRate() == null || zVarA == null || this.f95149b.getSampleRate().doubleValue() >= zVarA.c();
    }

    private io.sentry.protocol.v L(p5 p5Var, j0 j0Var) {
        q7.b beforeEnvelopeCallback = this.f95149b.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.b(p5Var, j0Var);
            } catch (Throwable th4) {
                this.f95149b.getLogger().b(b7.ERROR, "The BeforeEnvelope callback threw an exception.", th4);
            }
        }
        z6.d().c(this.f95149b.getLogger());
        if (j0Var == null) {
            this.f95150c.E3(p5Var);
        } else {
            this.f95150c.R0(p5Var, j0Var);
        }
        io.sentry.protocol.v vVarA = p5Var.b().a();
        return vVarA != null ? vVarA : io.sentry.protocol.v.f95495b;
    }

    private boolean M(i5 i5Var, j0 j0Var) {
        if (io.sentry.util.m.q(j0Var)) {
            return true;
        }
        this.f95149b.getLogger().c(b7.DEBUG, "Event was cached so not applying scope: %s", i5Var.G());
        return false;
    }

    private boolean N(i8 i8Var, i8 i8Var2) {
        if (i8Var2 == null) {
            return false;
        }
        if (i8Var == null) {
            return true;
        }
        i8.b bVarL = i8Var2.l();
        i8.b bVar = i8.b.Crashed;
        if (bVarL != bVar || i8Var.l() == bVar) {
            return i8Var2.e() > 0 && i8Var.e() <= 0;
        }
        return true;
    }

    private void O(i5 i5Var, Collection<f> collection) {
        List<f> listB = i5Var.B();
        if (listB == null || collection.isEmpty()) {
            return;
        }
        listB.addAll(collection);
        Collections.sort(listB, this.f95151d);
    }

    public static /* synthetic */ void j(i8 i8Var) {
    }

    public static /* synthetic */ void k(l5 l5Var, r6 r6Var, j0 j0Var, i8 i8Var) {
        if (i8Var == null) {
            l5Var.f95149b.getLogger().c(b7.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        l5Var.getClass();
        String strH = null;
        i8.b bVar = r6Var.y0() ? i8.b.Crashed : null;
        boolean z15 = i8.b.Crashed == bVar || r6Var.z0();
        String str = (r6Var.K() == null || r6Var.K().l() == null || !r6Var.K().l().containsKey("user-agent")) ? null : r6Var.K().l().get("user-agent");
        Object objG = io.sentry.util.m.g(j0Var);
        if (objG instanceof io.sentry.hints.a) {
            strH = ((io.sentry.hints.a) objG).h();
            bVar = i8.b.Abnormal;
        }
        if (i8Var.q(bVar, str, z15, strH) && i8Var.m()) {
            i8Var.c();
        }
    }

    private void l(a1 a1Var, j0 j0Var) {
        if (a1Var != null) {
            j0Var.a(a1Var.h());
        }
    }

    private <T extends i5> T m(T t15, a1 a1Var) {
        if (a1Var != null) {
            if (t15.K() == null) {
                t15.a0(a1Var.b());
            }
            if (t15.Q() == null) {
                t15.f0(a1Var.H());
            }
            if (t15.N() == null) {
                t15.e0(new HashMap(a1Var.B()));
            } else {
                for (Map.Entry<String, String> entry : a1Var.B().entrySet()) {
                    if (!t15.N().containsKey(entry.getKey())) {
                        t15.N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t15.B() == null) {
                t15.S(new ArrayList(a1Var.z()));
            } else {
                O(t15, a1Var.z());
            }
            if (t15.H() == null) {
                t15.X(new HashMap(a1Var.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : a1Var.getExtras().entrySet()) {
                    if (!t15.H().containsKey(entry2.getKey())) {
                        t15.H().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVarC = t15.C();
            for (Map.Entry<String, Object> entry3 : new io.sentry.protocol.c(a1Var.D()).b()) {
                if (!cVarC.a(entry3.getKey())) {
                    cVarC.k(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t15;
    }

    private r6 o(r6 r6Var, a1 a1Var, j0 j0Var) {
        if (a1Var == null) {
            return r6Var;
        }
        m(r6Var, a1Var);
        if (r6Var.w0() == null) {
            r6Var.H0(a1Var.I());
        }
        if (r6Var.q0() == null) {
            r6Var.B0(a1Var.G());
        }
        if (a1Var.L() != null) {
            r6Var.C0(a1Var.L());
        }
        j1 j1VarA = a1Var.a();
        if (r6Var.C().i() == null) {
            if (j1VarA == null) {
                r6Var.C().x(c9.v(a1Var.N()));
            } else {
                r6Var.C().x(j1VarA.w());
            }
        }
        return E(r6Var, j0Var, a1Var.U());
    }

    private r7 p(r7 r7Var, a1 a1Var) {
        if (a1Var != null) {
            if (r7Var.K() == null) {
                r7Var.a0(a1Var.b());
            }
            if (r7Var.Q() == null) {
                r7Var.f0(a1Var.H());
            }
            if (r7Var.N() == null) {
                r7Var.e0(new HashMap(a1Var.B()));
            } else {
                for (Map.Entry<String, String> entry : a1Var.B().entrySet()) {
                    if (!r7Var.N().containsKey(entry.getKey())) {
                        r7Var.N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVarC = r7Var.C();
            for (Map.Entry<String, Object> entry2 : new io.sentry.protocol.c(a1Var.D()).b()) {
                if (!cVarC.a(entry2.getKey())) {
                    cVarC.k(entry2.getKey(), entry2.getValue());
                }
            }
            j1 j1VarA = a1Var.a();
            if (r7Var.C().i() == null) {
                if (j1VarA == null) {
                    r7Var.C().x(c9.v(a1Var.N()));
                    return r7Var;
                }
                r7Var.C().x(j1VarA.w());
            }
        }
        return r7Var;
    }

    private p5 q(i5 i5Var, List<io.sentry.b> list, i8 i8Var, z8 z8Var, w3 w3Var) {
        io.sentry.protocol.v vVar;
        ArrayList arrayList = new ArrayList();
        if (i5Var != null) {
            arrayList.add(p6.B(this.f95149b.getSerializer(), i5Var));
            vVar = i5Var.G();
        } else {
            vVar = null;
        }
        if (i8Var != null) {
            arrayList.add(p6.G(this.f95149b.getSerializer(), i8Var));
        }
        if (w3Var != null) {
            arrayList.add(p6.E(w3Var, this.f95149b.getMaxTraceFileSize(), this.f95149b.getSerializer()));
            if (vVar == null) {
                vVar = new io.sentry.protocol.v(w3Var.B());
            }
        }
        if (list != null) {
            Iterator<io.sentry.b> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(p6.z(this.f95149b.getSerializer(), this.f95149b.getLogger(), it.next(), this.f95149b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p5(new q5(vVar, this.f95149b.getSdkVersion(), z8Var), arrayList);
    }

    private p5 r(f7 f7Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p6.C(this.f95149b.getSerializer(), f7Var));
        return new p5(new q5(null, this.f95149b.getSdkVersion(), null), arrayList);
    }

    private p5 s(r7 r7Var, b4 b4Var, z8 z8Var, boolean z15) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p6.F(this.f95149b.getSerializer(), this.f95149b.getLogger(), r7Var, b4Var, z15));
        return new p5(new q5(r7Var.G(), this.f95149b.getSessionReplay().i(), z8Var), arrayList);
    }

    private r6 u(r6 r6Var, j0 j0Var) {
        this.f95149b.getBeforeSend();
        return r6Var;
    }

    private d7 v(d7 d7Var) {
        this.f95149b.getLogs().a();
        return d7Var;
    }

    private r7 x(r7 r7Var, j0 j0Var) {
        this.f95149b.getBeforeSendReplay();
        return r7Var;
    }

    private io.sentry.protocol.c0 y(io.sentry.protocol.c0 c0Var, j0 j0Var) {
        this.f95149b.getBeforeSendTransaction();
        return c0Var;
    }

    private List<io.sentry.b> z(List<io.sentry.b> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (io.sentry.b bVar : list) {
            if (bVar.k()) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // io.sentry.e1
    public io.sentry.transport.a0 F() {
        return this.f95150c.F();
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.v H(p5 p5Var, j0 j0Var) {
        io.sentry.util.v.c(p5Var, "SentryEnvelope is required.");
        if (j0Var == null) {
            j0Var = new j0();
        }
        try {
            j0Var.b();
            return L(p5Var, j0Var);
        } catch (IOException e15) {
            this.f95149b.getLogger().b(b7.ERROR, "Failed to capture envelope.", e15);
            return io.sentry.protocol.v.f95495b;
        }
    }

    i8 P(final r6 r6Var, final j0 j0Var, a1 a1Var) {
        if (io.sentry.util.m.q(j0Var)) {
            if (a1Var != null) {
                return a1Var.A(new f4.b() { // from class: io.sentry.k5
                    @Override // io.sentry.f4.b
                    public final void a(i8 i8Var) {
                        l5.k(this.f95140a, r6Var, j0Var, i8Var);
                    }
                });
            }
            this.f95149b.getLogger().c(b7.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.v a(r7 r7Var, a1 a1Var, j0 j0Var) {
        io.sentry.util.v.c(r7Var, "SessionReplay is required.");
        if (j0Var == null) {
            j0Var = new j0();
        }
        if (M(r7Var, j0Var)) {
            p(r7Var, a1Var);
        }
        v0 logger = this.f95149b.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "Capturing session replay: %s", r7Var.G());
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        io.sentry.protocol.v vVarG = r7Var.G() != null ? r7Var.G() : vVar;
        r7 r7VarI = I(r7Var, j0Var, this.f95149b.getEventProcessors());
        if (r7VarI != null && (r7VarI = x(r7VarI, j0Var)) == null) {
            this.f95149b.getLogger().c(b7Var, "Event was dropped by beforeSendReplay", new Object[0]);
            this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, l.Replay);
        }
        if (r7VarI == null) {
            return vVar;
        }
        try {
            p5 p5VarS = s(r7VarI, j0Var.f(), C(a1Var, j0Var, r7VarI, null), io.sentry.util.m.h(j0Var, io.sentry.hints.c.class));
            j0Var.b();
            this.f95150c.R0(p5VarS, j0Var);
            return vVarG;
        } catch (IOException e15) {
            this.f95149b.getLogger().a(b7.WARNING, e15, "Capturing event %s failed.", vVarG);
            return io.sentry.protocol.v.f95495b;
        }
    }

    @Override // io.sentry.e1
    public void b(d7 d7Var, a1 a1Var) {
        if (d7Var == null || a1Var == null || (d7Var = G(d7Var, a1Var.U())) != null) {
            if ((d7Var == null || (d7Var = G(d7Var, this.f95149b.getEventProcessors())) != null) && d7Var != null) {
                d7 d7VarV = v(d7Var);
                if (d7VarV != null) {
                    this.f95152e.a(d7VarV);
                } else {
                    this.f95149b.getLogger().c(b7.DEBUG, "Log Event was dropped by beforeSendLog", new Object[0]);
                    this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, l.LogItem);
                }
            }
        }
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.v c(io.sentry.protocol.c0 c0Var, z8 z8Var, a1 a1Var, j0 j0Var, w3 w3Var) {
        io.sentry.util.v.c(c0Var, "Transaction is required.");
        if (j0Var == null) {
            j0Var = new j0();
        }
        if (M(c0Var, j0Var)) {
            l(a1Var, j0Var);
        }
        v0 logger = this.f95149b.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "Capturing transaction: %s", c0Var.G());
        if (io.sentry.util.i0.g(this.f95149b.getIgnoredTransactions(), c0Var.p0())) {
            this.f95149b.getLogger().c(b7Var, "Transaction was dropped as transaction name %s is ignored", c0Var.p0());
            io.sentry.clientreport.h clientReportRecorder = this.f95149b.getClientReportRecorder();
            io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
            clientReportRecorder.a(fVar, l.Transaction);
            this.f95149b.getClientReportRecorder().c(fVar, l.Span, c0Var.o0().size() + 1);
            return io.sentry.protocol.v.f95495b;
        }
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        io.sentry.protocol.v vVarG = c0Var.G() != null ? c0Var.G() : vVar;
        if (M(c0Var, j0Var)) {
            c0Var = (io.sentry.protocol.c0) m(c0Var, a1Var);
            if (c0Var != null && a1Var != null) {
                c0Var = J(c0Var, j0Var, a1Var.U());
            }
            if (c0Var == null) {
                this.f95149b.getLogger().c(b7Var, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c0Var != null) {
            c0Var = J(c0Var, j0Var, this.f95149b.getEventProcessors());
        }
        if (c0Var == null) {
            this.f95149b.getLogger().c(b7Var, "Transaction was dropped by Event processors.", new Object[0]);
            return vVar;
        }
        int size = c0Var.o0().size();
        io.sentry.protocol.c0 c0VarY = y(c0Var, j0Var);
        int size2 = c0VarY == null ? 0 : c0VarY.o0().size();
        if (c0VarY == null) {
            this.f95149b.getLogger().c(b7Var, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.h clientReportRecorder2 = this.f95149b.getClientReportRecorder();
            io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.BEFORE_SEND;
            clientReportRecorder2.a(fVar2, l.Transaction);
            this.f95149b.getClientReportRecorder().c(fVar2, l.Span, size + 1);
            return vVar;
        }
        if (size2 < size) {
            int i15 = size - size2;
            this.f95149b.getLogger().c(b7Var, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i15));
            this.f95149b.getClientReportRecorder().c(io.sentry.clientreport.f.BEFORE_SEND, l.Span, i15);
        }
        try {
            p5 p5VarQ = q(c0VarY, z(B(j0Var)), null, z8Var, w3Var);
            j0Var.b();
            return p5VarQ != null ? L(p5VarQ, j0Var) : vVarG;
        } catch (io.sentry.exception.b | IOException e15) {
            this.f95149b.getLogger().a(b7.WARNING, e15, "Capturing transaction %s failed.", vVarG);
            return io.sentry.protocol.v.f95495b;
        }
    }

    @Override // io.sentry.e1
    public void e(i8 i8Var, j0 j0Var) {
        io.sentry.util.v.c(i8Var, "Session is required.");
        if (i8Var.h() == null || i8Var.h().isEmpty()) {
            this.f95149b.getLogger().c(b7.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            H(p5.a(this.f95149b.getSerializer(), i8Var, this.f95149b.getSdkVersion()), j0Var);
        } catch (IOException e15) {
            this.f95149b.getLogger().b(b7.ERROR, "Failed to capture session.", e15);
        }
    }

    @Override // io.sentry.e1
    public void f(f7 f7Var) {
        try {
            L(r(f7Var), null);
        } catch (IOException e15) {
            this.f95149b.getLogger().a(b7.WARNING, e15, "Capturing log failed.", new Object[0]);
        }
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.v h(s3 s3Var, a1 a1Var) {
        io.sentry.util.v.c(s3Var, "profileChunk is required.");
        this.f95149b.getLogger().c(b7.DEBUG, "Capturing profile chunk: %s", s3Var.l());
        io.sentry.protocol.v vVarL = s3Var.l();
        io.sentry.protocol.d dVarC = io.sentry.protocol.d.c(s3Var.m(), this.f95149b);
        if (dVarC != null) {
            s3Var.p(dVarC);
        }
        try {
            return L(new p5(new q5(vVarL, this.f95149b.getSdkVersion(), null), Collections.singletonList(p6.D(s3Var, this.f95149b.getSerializer()))), null);
        } catch (io.sentry.exception.b | IOException e15) {
            this.f95149b.getLogger().a(b7.WARNING, e15, "Capturing profile chunk %s failed.", vVarL);
            return io.sentry.protocol.v.f95495b;
        }
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.v i(r6 r6Var, a1 a1Var, j0 j0Var) {
        r6 r6Var2;
        l5 l5Var;
        io.sentry.util.v.c(r6Var, "SentryEvent is required.");
        if (j0Var == null) {
            j0Var = new j0();
        }
        if (M(r6Var, j0Var)) {
            l(a1Var, j0Var);
        }
        v0 logger = this.f95149b.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "Capturing event: %s", r6Var.G());
        Throwable thO = r6Var.O();
        if (thO != null && io.sentry.util.g.b(this.f95149b.getIgnoredExceptionsForType(), thO)) {
            this.f95149b.getLogger().c(b7Var, "Event was dropped as the exception %s is ignored", thO.getClass());
            this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, l.Error);
            return io.sentry.protocol.v.f95495b;
        }
        if (io.sentry.util.e.a(this.f95149b.getIgnoredErrors(), r6Var)) {
            this.f95149b.getLogger().c(b7Var, "Event was dropped as it matched a string/pattern in ignoredErrors", r6Var.s0());
            this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, l.Error);
            return io.sentry.protocol.v.f95495b;
        }
        boolean z15 = false;
        if (M(r6Var, j0Var) && (r6Var = o(r6Var, a1Var, j0Var)) == null) {
            this.f95149b.getLogger().c(b7Var, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.v.f95495b;
        }
        r6 r6VarE = E(r6Var, j0Var, this.f95149b.getEventProcessors());
        if (r6VarE != null && (r6VarE = u(r6VarE, j0Var)) == null) {
            this.f95149b.getLogger().c(b7Var, "Event was dropped by beforeSend", new Object[0]);
            this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, l.Error);
        }
        if (r6VarE == null) {
            return io.sentry.protocol.v.f95495b;
        }
        i8 i8VarA = a1Var != null ? a1Var.A(new f4.b() { // from class: io.sentry.j5
            @Override // io.sentry.f4.b
            public final void a(i8 i8Var) {
                l5.j(i8Var);
            }
        }) : null;
        i8 i8VarP = (i8VarA == null || !i8VarA.m()) ? P(r6VarE, j0Var, a1Var) : null;
        if (K()) {
            r6Var2 = r6VarE;
        } else {
            this.f95149b.getLogger().c(b7Var, "Event %s was dropped due to sampling decision.", r6VarE.G());
            this.f95149b.getClientReportRecorder().a(io.sentry.clientreport.f.SAMPLE_RATE, l.Error);
            r6Var2 = null;
        }
        boolean zN = N(i8VarA, i8VarP);
        if (r6Var2 == null && !zN) {
            this.f95149b.getLogger().c(b7Var, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.v.f95495b;
        }
        io.sentry.protocol.v vVarL = io.sentry.protocol.v.f95495b;
        if (r6Var2 != null && r6Var2.G() != null) {
            vVarL = r6Var2.G();
        }
        boolean zH = io.sentry.util.m.h(j0Var, io.sentry.hints.c.class);
        if (io.sentry.util.m.h(j0Var, io.sentry.hints.e.class) && !io.sentry.util.m.h(j0Var, io.sentry.hints.b.class)) {
            z15 = true;
        }
        if (r6Var2 != null && !zH && !z15 && (r6Var2.z0() || r6Var2.y0())) {
            this.f95149b.getReplayController().u(Boolean.valueOf(r6Var2.y0()));
        }
        try {
            l5Var = this;
            try {
                p5 p5VarQ = l5Var.q(r6Var2, r6Var2 != null ? B(j0Var) : null, i8VarP, D(a1Var, j0Var, r6Var2), null);
                j0Var.b();
                if (p5VarQ != null) {
                    vVarL = L(p5VarQ, j0Var);
                }
            } catch (io.sentry.exception.b e15) {
                e = e15;
                l5Var.f95149b.getLogger().a(b7.WARNING, e, "Capturing event %s failed.", vVarL);
                vVarL = io.sentry.protocol.v.f95495b;
            } catch (IOException e16) {
                e = e16;
                l5Var.f95149b.getLogger().a(b7.WARNING, e, "Capturing event %s failed.", vVarL);
                vVarL = io.sentry.protocol.v.f95495b;
            }
        } catch (io.sentry.exception.b | IOException e17) {
            e = e17;
            l5Var = this;
        }
        if (a1Var != null) {
            A(a1Var, j0Var);
        }
        return vVarL;
    }

    @Override // io.sentry.e1
    public boolean isEnabled() {
        return this.f95148a;
    }

    @Override // io.sentry.e1
    public void n(boolean z15) {
        long shutdownTimeoutMillis;
        this.f95149b.getLogger().c(b7.INFO, "Closing SentryClient.", new Object[0]);
        if (z15) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.f95149b.getShutdownTimeoutMillis();
            } catch (IOException e15) {
                this.f95149b.getLogger().b(b7.WARNING, "Failed to close the connection to the Sentry Server.", e15);
            }
        }
        t(shutdownTimeoutMillis);
        this.f95152e.n(z15);
        this.f95150c.n(z15);
        for (e0 e0Var : this.f95149b.getEventProcessors()) {
            if (e0Var instanceof Closeable) {
                try {
                    ((Closeable) e0Var).close();
                } catch (IOException e16) {
                    this.f95149b.getLogger().c(b7.WARNING, "Failed to close the event processor {}.", e0Var, e16);
                }
            }
        }
        this.f95148a = false;
    }

    @Override // io.sentry.e1
    public void t(long j15) {
        this.f95152e.t(j15);
        this.f95150c.t(j15);
    }

    @Override // io.sentry.e1
    public boolean w() {
        return this.f95150c.w();
    }
}
