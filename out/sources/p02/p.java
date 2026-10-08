package p02;

import eo0.DeliveryMessageDetails;
import eo0.Recipient;
import fo0.DeliveryMessageAddress;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011*\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0011*\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u001a\u0010\"\u001a\u0004\u0018\u00010\u000e*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!¨\u0006#"}, d2 = {"Lp02/p;", "Lgz/a;", "Lp02/p$a;", "Leo0/v;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lc12/a;", "edorMessageSubjectMapper", "Lp02/s;", "getMessageDateTimeUC", "<init>", "(Lmx/c;Lez/e;Lc12/a;Lp02/s;)V", "Leo0/m;", "Lz02/a;", "entryMessageType", "", "d", "(Leo0/m;Lz02/a;)Ljava/lang/String;", "e", "(Leo0/m;)Ljava/lang/String;", "f", "params", "c", "(Lp02/p$a;)Leo0/v;", "a", "Lmx/c;", "b", "Lez/e;", "Lc12/a;", "Lp02/s;", "Lo02/b$f;", "(Lo02/b$f;)Leo0/m;", "messageDetails", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements gz.a<Params, eo0.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c12.a edorMessageSubjectMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s getMessageDateTimeUC;

    /* JADX INFO: renamed from: p02.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lp02/p$a;", "Lgz/b$a;", "Lo02/b$f;", "startResult", "", "Leo0/k0;", "recipients", "Lo02/c;", "edorStepResult", "<init>", "(Lo02/b$f;Ljava/util/List;Lo02/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo02/b$f;", "c", "()Lo02/b$f;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lo02/c;", "()Lo02/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o02.b.Start startResult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Recipient> recipients;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final o02.c edorStepResult;

        public Params(o02.b.Start start, List<Recipient> list, o02.c cVar) {
            this.startResult = start;
            this.recipients = list;
            this.edorStepResult = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o02.c getEdorStepResult() {
            return this.edorStepResult;
        }

        public final List<Recipient> b() {
            return this.recipients;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o02.b.Start getStartResult() {
            return this.startResult;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.startResult, params.startResult) && fr.t.c(this.recipients, params.recipients) && fr.t.c(this.edorStepResult, params.edorStepResult);
        }

        public int hashCode() {
            int iHashCode = ((this.startResult.hashCode() * 31) + this.recipients.hashCode()) * 31;
            o02.c cVar = this.edorStepResult;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Params(startResult=" + this.startResult + ", recipients=" + this.recipients + ", edorStepResult=" + this.edorStepResult + ')';
        }
    }

    public p(mx.c cVar, ez.e eVar, c12.a aVar, s sVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.edorMessageSubjectMapper = aVar;
        this.getMessageDateTimeUC = sVar;
    }

    private final DeliveryMessageDetails b(o02.b.Start start) {
        z02.a entryPoint = start.getEntryPoint();
        if (entryPoint instanceof z02.a.ForwardMessage) {
            return ((z02.a.ForwardMessage) start.getEntryPoint()).getMessageDetails();
        }
        if (entryPoint instanceof z02.a.Reply) {
            return ((z02.a.Reply) start.getEntryPoint()).getMessageDetails();
        }
        if (entryPoint instanceof z02.a.EditDraft) {
            return ((z02.a.EditDraft) start.getEntryPoint()).getMessageDetails();
        }
        if (fr.t.c(entryPoint, z02.a.c.f231893a)) {
            return null;
        }
        throw new oq.p();
    }

    private final String d(DeliveryMessageDetails deliveryMessageDetails, z02.a aVar) {
        if (!(aVar instanceof z02.a.EditDraft) && !fr.t.c(aVar, z02.a.c.f231893a)) {
            if (aVar instanceof z02.a.ForwardMessage) {
                return e(deliveryMessageDetails);
            }
            if (aVar instanceof z02.a.Reply) {
                return f(deliveryMessageDetails);
            }
            throw new oq.p();
        }
        return deliveryMessageDetails.getTextBody();
    }

    private final String e(DeliveryMessageDetails deliveryMessageDetails) {
        String name;
        String name2;
        String strD;
        DeliveryMessageAddress deliveryMessageAddress;
        mx.c cVar = this.labelProvider;
        int i15 = e02.a.B2;
        DeliveryMessageAddress from = deliveryMessageDetails.getDeliveryMessage().getFrom();
        if (from == null || (name = from.getName()) == null) {
            name = "";
        }
        List<DeliveryMessageAddress> listP = deliveryMessageDetails.getDeliveryMessage().p();
        if (listP == null || (deliveryMessageAddress = (DeliveryMessageAddress) pq.v.n0(listP)) == null || (name2 = deliveryMessageAddress.getName()) == null) {
            name2 = "";
        }
        OffsetDateTime offsetDateTimeB = this.getMessageDateTimeUC.b(new s.Params(deliveryMessageDetails.getDeliveryMessage()));
        if (offsetDateTimeB == null || (strD = this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTimeB), fz.c.DOTTED)) == null) {
            strD = "";
        }
        String textBody = deliveryMessageDetails.getTextBody();
        return cVar.e(i15, name, name2, strD, textBody != null ? textBody : "").getText();
    }

    private final String f(DeliveryMessageDetails deliveryMessageDetails) {
        String name;
        String name2;
        String strD;
        DeliveryMessageAddress deliveryMessageAddress;
        mx.c cVar = this.labelProvider;
        int i15 = e02.a.f46519d4;
        DeliveryMessageAddress from = deliveryMessageDetails.getDeliveryMessage().getFrom();
        if (from == null || (name = from.getName()) == null) {
            name = "";
        }
        List<DeliveryMessageAddress> listP = deliveryMessageDetails.getDeliveryMessage().p();
        if (listP == null || (deliveryMessageAddress = (DeliveryMessageAddress) pq.v.n0(listP)) == null || (name2 = deliveryMessageAddress.getName()) == null) {
            name2 = "";
        }
        OffsetDateTime offsetDateTimeB = this.getMessageDateTimeUC.b(new s.Params(deliveryMessageDetails.getDeliveryMessage()));
        if (offsetDateTimeB == null || (strD = this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTimeB), fz.c.DOTTED)) == null) {
            strD = "";
        }
        String textBody = deliveryMessageDetails.getTextBody();
        return cVar.e(i15, name, name2, strD, "-", textBody != null ? textBody : "").getText();
    }

    public eo0.v c(Params params) {
        String strB;
        fo0.c deliveryMessage;
        String str;
        fo0.c deliveryMessage2;
        fo0.c deliveryMessage3;
        DeliveryMessageDetails deliveryMessageDetailsB = b(params.getStartResult());
        List<Recipient> listB = params.b();
        o02.c edorStepResult = params.getEdorStepResult();
        String caseId = null;
        if (edorStepResult == null || (strB = edorStepResult.getTitle()) == null) {
            strB = this.edorMessageSubjectMapper.b(new c12.a.Params((deliveryMessageDetailsB == null || (deliveryMessage = deliveryMessageDetailsB.getDeliveryMessage()) == null) ? null : deliveryMessage.getSubject(), params.getStartResult().getEntryPoint()));
        }
        o02.c edorStepResult2 = params.getEdorStepResult();
        if (edorStepResult2 != null && (strD = edorStepResult2.getContent()) != null) {
            str = strD;
        } else if (deliveryMessageDetailsB != null) {
            String strD = d(deliveryMessageDetailsB, params.getStartResult().getEntryPoint());
            str = strD;
        } else {
            str = null;
        }
        String threadId = (deliveryMessageDetailsB == null || (deliveryMessage3 = deliveryMessageDetailsB.getDeliveryMessage()) == null) ? null : deliveryMessage3.getThreadId();
        o02.c edorStepResult3 = params.getEdorStepResult();
        if (edorStepResult3 != null) {
            caseId = edorStepResult3.getCaseSign();
        } else if (deliveryMessageDetailsB != null && (deliveryMessage2 = deliveryMessageDetailsB.getDeliveryMessage()) != null) {
            caseId = deliveryMessage2.getCaseId();
        }
        return new eo0.v(strB, listB, caseId, str, threadId, null, null);
    }
}
