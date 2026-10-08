package p02;

import eo0.Recipient;
import fo0.DeliveryMessageAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lp02/b0;", "Lgz/a;", "Lp02/b0$a;", "Ldx/i;", "Ldx/b;", "", "Leo0/k0;", "<init>", "()V", "params", "b", "(Lp02/b0$a;)Ldx/i;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements gz.a<Params, dx.i<? extends dx.b, ? extends List<? extends Recipient>>> {

    /* JADX INFO: renamed from: p02.b0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/b0$a;", "Lgz/b$a;", "Lz02/a;", "entryPoint", "<init>", "(Lz02/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/a;", "()Lz02/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a entryPoint;

        public Params(z02.a aVar) {
            this.entryPoint = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final z02.a getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.entryPoint, ((Params) other).entryPoint);
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return "Params(entryPoint=" + this.entryPoint + ')';
        }
    }

    public dx.i<dx.b, List<Recipient>> b(Params params) {
        Object objB;
        Collection collectionN;
        String name;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    z02.a entryPoint = params.getEntryPoint();
                    if (entryPoint instanceof z02.a.EditDraft) {
                        List<DeliveryMessageAddress> listP = ((z02.a.EditDraft) entryPoint).getMessageDetails().getDeliveryMessage().p();
                        if (listP != null) {
                            List<DeliveryMessageAddress> list = listP;
                            collectionN = new ArrayList(pq.v.y(list, 10));
                            for (DeliveryMessageAddress deliveryMessageAddress : list) {
                                collectionN.add(new Recipient(deliveryMessageAddress.getName(), eo0.q0.a(((z02.a.EditDraft) entryPoint).getMessageDetails().getDeliveryMessage().getServiceType()), null, deliveryMessageAddress.getAddress(), null, null, null, null, null));
                            }
                        } else {
                            collectionN = pq.v.n();
                        }
                    } else if (entryPoint instanceof z02.a.Reply) {
                        DeliveryMessageAddress from = ((z02.a.Reply) entryPoint).getMessageDetails().getDeliveryMessage().getFrom();
                        String str = (from == null || (name = from.getName()) == null) ? "" : name;
                        eo0.p0 p0VarA = eo0.q0.a(((z02.a.Reply) entryPoint).getMessageDetails().getDeliveryMessage().getServiceType());
                        DeliveryMessageAddress from2 = ((z02.a.Reply) entryPoint).getMessageDetails().getDeliveryMessage().getFrom();
                        collectionN = pq.v.e(new Recipient(str, p0VarA, null, from2 != null ? from2.getAddress() : null, null, null, null, null, null));
                    } else {
                        if (!(entryPoint instanceof z02.a.ForwardMessage) && !fr.t.c(entryPoint, z02.a.c.f231893a)) {
                            throw new oq.p();
                        }
                        collectionN = pq.v.n();
                    }
                    return new dx.i.Right(collectionN);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            fVar.d(message != null ? message : "", e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
