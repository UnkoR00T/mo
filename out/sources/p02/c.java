package p02;

import eo0.DeliveryMessageDetailsAttachment;
import eo0.ForwardDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lp02/c;", "Lgz/a;", "Lp02/c$a;", "Leo0/f0;", "<init>", "()V", "params", "b", "(Lp02/c$a;)Leo0/f0;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.a<Params, ForwardDetails> {

    /* JADX INFO: renamed from: p02.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/c$a;", "Lgz/b$a;", "Lz02/a$b;", "forwardMessage", "<init>", "(Lz02/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/a$b;", "()Lz02/a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a.ForwardMessage forwardMessage;

        public Params(z02.a.ForwardMessage forwardMessage) {
            this.forwardMessage = forwardMessage;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final z02.a.ForwardMessage getForwardMessage() {
            return this.forwardMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.forwardMessage, ((Params) other).forwardMessage);
        }

        public int hashCode() {
            return this.forwardMessage.hashCode();
        }

        public String toString() {
            return "Params(forwardMessage=" + this.forwardMessage + ')';
        }
    }

    public ForwardDetails b(Params params) {
        z02.a.ForwardMessage forwardMessage = params.getForwardMessage();
        List<DeliveryMessageDetailsAttachment> listD = forwardMessage.getMessageDetails().d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(eo0.y.a(((DeliveryMessageDetailsAttachment) it.next()).getAttachmentId()));
        }
        return new ForwardDetails(arrayList, forwardMessage.getDirectoryId(), forwardMessage.getMessageDetails().getDeliveryMessage().getMessageId(), null);
    }
}
