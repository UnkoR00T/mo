package x02;

import eo0.y0;
import fr.t;
import m22.j;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx02/d;", "Lgz/a;", "Lx02/d$a;", "Leo0/y0;", "<init>", "()V", "params", "b", "(Lx02/d$a;)Leo0/y0;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.a<Params, y0> {

    /* JADX INFO: renamed from: x02.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lx02/d$a;", "Lgz/b$a;", "Lm22/j;", "startContract", "Lm22/b;", "chooseMessageTypeContract", "<init>", "(Lm22/j;Lm22/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm22/j;", "b", "()Lm22/j;", "Lm22/b;", "()Lm22/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j startContract;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final m22.b chooseMessageTypeContract;

        public Params(j jVar, m22.b bVar) {
            this.startContract = jVar;
            this.chooseMessageTypeContract = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final m22.b getChooseMessageTypeContract() {
            return this.chooseMessageTypeContract;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final j getStartContract() {
            return this.startContract;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.startContract, params.startContract) && t.c(this.chooseMessageTypeContract, params.chooseMessageTypeContract);
        }

        public int hashCode() {
            return (this.startContract.hashCode() * 31) + this.chooseMessageTypeContract.hashCode();
        }

        public String toString() {
            return "Params(startContract=" + this.startContract + ", chooseMessageTypeContract=" + this.chooseMessageTypeContract + ')';
        }
    }

    public y0 b(Params params) {
        y0 serviceType;
        z02.a entryPoint = params.getStartContract().v6().getEntryPoint();
        if (entryPoint instanceof z02.a.EditDraft) {
            return ((z02.a.EditDraft) entryPoint).getMessageDetails().getDeliveryMessage().getServiceType();
        }
        if (entryPoint instanceof z02.a.Reply) {
            return ((z02.a.Reply) entryPoint).getMessageDetails().getDeliveryMessage().getServiceType();
        }
        if (entryPoint instanceof z02.a.ForwardMessage) {
            return ((z02.a.ForwardMessage) entryPoint).getMessageDetails().getDeliveryMessage().getServiceType();
        }
        if (!t.c(entryPoint, z02.a.c.f231893a)) {
            throw new p();
        }
        o02.b.ChooseMessageType chooseMessageTypeV5 = params.getChooseMessageTypeContract().v5();
        return (chooseMessageTypeV5 == null || (serviceType = chooseMessageTypeV5.getServiceType()) == null) ? y0.UNKNOWN : serviceType;
    }
}
