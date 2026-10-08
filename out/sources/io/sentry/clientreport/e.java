package io.sentry.clientreport;

import io.sentry.a7;
import io.sentry.b7;
import io.sentry.l;
import io.sentry.m;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.protocol.c0;
import io.sentry.protocol.y;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f94783a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f94784b;

    public e(q7 q7Var) {
        this.f94784b = q7Var;
    }

    private l f(a7 a7Var) {
        if (a7.Event.equals(a7Var)) {
            return l.Error;
        }
        if (a7.Session.equals(a7Var)) {
            return l.Session;
        }
        if (a7.Transaction.equals(a7Var)) {
            return l.Transaction;
        }
        if (a7.UserFeedback.equals(a7Var)) {
            return l.UserReport;
        }
        if (a7.Feedback.equals(a7Var)) {
            return l.Feedback;
        }
        if (a7.Profile.equals(a7Var)) {
            return l.Profile;
        }
        if (a7.ProfileChunk.equals(a7Var)) {
            return l.ProfileChunkUi;
        }
        if (a7.Attachment.equals(a7Var)) {
            return l.Attachment;
        }
        if (a7.CheckIn.equals(a7Var)) {
            return l.Monitor;
        }
        if (a7.ReplayVideo.equals(a7Var)) {
            return l.Replay;
        }
        return a7.Log.equals(a7Var) ? l.LogItem : l.Default;
    }

    private void g(f fVar, l lVar, Long l15) {
        this.f94784b.getOnDiscard();
    }

    private void h(String str, String str2, Long l15) {
        this.f94783a.a(new d(str, str2), l15);
    }

    private void j(c cVar) {
        if (cVar == null) {
            return;
        }
        for (g gVar : cVar.a()) {
            h(gVar.c(), gVar.a(), gVar.b());
        }
    }

    @Override // io.sentry.clientreport.h
    public void a(f fVar, l lVar) {
        c(fVar, lVar, 1L);
    }

    @Override // io.sentry.clientreport.h
    public void b(f fVar, p5 p5Var) {
        if (p5Var == null) {
            return;
        }
        try {
            Iterator<p6> it = p5Var.c().iterator();
            while (it.hasNext()) {
                d(fVar, it.next());
            }
        } catch (Throwable th4) {
            this.f94784b.getLogger().a(b7.ERROR, th4, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void c(f fVar, l lVar, long j15) {
        try {
            h(fVar.getReason(), lVar.getCategory(), Long.valueOf(j15));
            g(fVar, lVar, Long.valueOf(j15));
        } catch (Throwable th4) {
            this.f94784b.getLogger().a(b7.ERROR, th4, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void d(f fVar, p6 p6Var) {
        c0 c0VarK;
        if (p6Var == null) {
            return;
        }
        try {
            a7 a7VarB = p6Var.J().b();
            if (a7.ClientReport.equals(a7VarB)) {
                try {
                    j(p6Var.H(this.f94784b.getSerializer()));
                    return;
                } catch (Exception unused) {
                    this.f94784b.getLogger().c(b7.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            l lVarF = f(a7VarB);
            if (lVarF.equals(l.Transaction) && (c0VarK = p6Var.K(this.f94784b.getSerializer())) != null) {
                List<y> listO0 = c0VarK.o0();
                String reason = fVar.getReason();
                l lVar = l.Span;
                h(reason, lVar.getCategory(), Long.valueOf(((long) listO0.size()) + 1));
                g(fVar, lVar, Long.valueOf(((long) listO0.size()) + 1));
            }
            h(fVar.getReason(), lVarF.getCategory(), 1L);
            g(fVar, lVarF, 1L);
        } catch (Throwable th4) {
            this.f94784b.getLogger().a(b7.ERROR, th4, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public p5 e(p5 p5Var) {
        c cVarI = i();
        if (cVarI == null) {
            return p5Var;
        }
        try {
            this.f94784b.getLogger().c(b7.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<p6> it = p5Var.c().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(p6.A(this.f94784b.getSerializer(), cVarI));
            return new p5(p5Var.b(), arrayList);
        } catch (Throwable th4) {
            this.f94784b.getLogger().a(b7.ERROR, th4, "Unable to attach client report to envelope.", new Object[0]);
            return p5Var;
        }
    }

    c i() {
        Date dateD = m.d();
        List<g> listB = this.f94783a.b();
        if (listB.isEmpty()) {
            return null;
        }
        return new c(dateD, listB);
    }
}
