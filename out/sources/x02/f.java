package x02;

import dx.i;
import dx.j;
import eo0.y0;
import fr.t;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lx02/f;", "Lgz/a;", "Lx02/f$a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<init>", "()V", "Lm22/b;", "Leo0/y0;", "serviceType", "c", "(Lm22/b;Leo0/y0;)V", "params", "b", "(Lx02/f$a;)Ldx/i;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.a<Params, i<? extends dx.b, ? extends i0>> {

    /* JADX INFO: renamed from: x02.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lx02/f$a;", "Lgz/b$a;", "Lz02/a;", "entryPoint", "Lm22/b;", "chooseMessageTypeContract", "<init>", "(Lz02/a;Lm22/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/a;", "b", "()Lz02/a;", "Lm22/b;", "()Lm22/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a entryPoint;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final m22.b chooseMessageTypeContract;

        public Params(z02.a aVar, m22.b bVar) {
            this.entryPoint = aVar;
            this.chooseMessageTypeContract = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final m22.b getChooseMessageTypeContract() {
            return this.chooseMessageTypeContract;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final z02.a getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.entryPoint, params.entryPoint) && t.c(this.chooseMessageTypeContract, params.chooseMessageTypeContract);
        }

        public int hashCode() {
            return (this.entryPoint.hashCode() * 31) + this.chooseMessageTypeContract.hashCode();
        }

        public String toString() {
            return "Params(entryPoint=" + this.entryPoint + ", chooseMessageTypeContract=" + this.chooseMessageTypeContract + ')';
        }
    }

    private final void c(m22.b bVar, y0 y0Var) {
        bVar.b3(new o02.b.ChooseMessageType(null, y0Var));
    }

    public i<dx.b, i0> b(Params params) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    z02.a entryPoint = params.getEntryPoint();
                    if (entryPoint instanceof z02.a.EditDraft) {
                        c(params.getChooseMessageTypeContract(), y0.E_DELIVERY);
                    } else if (entryPoint instanceof z02.a.Reply) {
                        c(params.getChooseMessageTypeContract(), ((z02.a.Reply) entryPoint).getMessageDetails().getDeliveryMessage().getServiceType());
                    } else if (entryPoint instanceof z02.a.ForwardMessage) {
                        c(params.getChooseMessageTypeContract(), ((z02.a.ForwardMessage) entryPoint).getMessageDetails().getDeliveryMessage().getServiceType());
                    } else if (!(entryPoint instanceof z02.a.c)) {
                        throw new p();
                    }
                    return new i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
