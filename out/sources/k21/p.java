package k21;

import fr.t;
import j21.h1;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lk21/p;", "Lxw/f;", "Lk21/p$a;", "Ldx/i;", "Ldx/b;", "Lj21/h1$a;", "<init>", "()V", "params", "c", "(Lk21/p$a;)Ldx/i;", "a", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements xw.f<Params, dx.i<? extends dx.b, ? extends h1.a>> {

    /* JADX INFO: renamed from: k21.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001b"}, d2 = {"Lk21/p$a;", "", "Lj21/h1$a;", "currentAnswer", "Lg21/i;", "newMessage", "", "lastMessageCount", "<init>", "(Lj21/h1$a;Lg21/i;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj21/h1$a;", "()Lj21/h1$a;", "b", "Lg21/i;", "c", "()Lg21/i;", "I", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h1.a currentAnswer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g21.i newMessage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int lastMessageCount;

        public Params(h1.a aVar, g21.i iVar, int i15) {
            this.currentAnswer = aVar;
            this.newMessage = iVar;
            this.lastMessageCount = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h1.a getCurrentAnswer() {
            return this.currentAnswer;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLastMessageCount() {
            return this.lastMessageCount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final g21.i getNewMessage() {
            return this.newMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.currentAnswer, params.currentAnswer) && t.c(this.newMessage, params.newMessage) && this.lastMessageCount == params.lastMessageCount;
        }

        public int hashCode() {
            return (((this.currentAnswer.hashCode() * 31) + this.newMessage.hashCode()) * 31) + Integer.hashCode(this.lastMessageCount);
        }

        public String toString() {
            return "Params(currentAnswer=" + this.currentAnswer + ", newMessage=" + this.newMessage + ", lastMessageCount=" + this.lastMessageCount + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public dx.i<dx.b, h1.a> b(Params params) {
        Object objB;
        Object full;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if ((params.getCurrentAnswer() instanceof h1.a.Part) && (params.getNewMessage() instanceof g21.i.Content)) {
                        full = ((h1.a.Part) params.getCurrentAnswer()).a(((h1.a.Part) params.getCurrentAnswer()).getContent() + ((g21.i.Content) params.getNewMessage()).getContent());
                    } else {
                        if (!(params.getCurrentAnswer() instanceof h1.a.Part) || !(params.getNewMessage() instanceof g21.i.Metadata)) {
                            aVar.b(new dx.b.Generic(new Exception("Other combinations are not allowed")));
                            throw new oq.g();
                        }
                        g21.i.Metadata metadata = (g21.i.Metadata) params.getNewMessage();
                        full = new h1.a.Full(((h1.a.Part) params.getCurrentAnswer()).getContent(), metadata.getResponseId(), metadata.e(), metadata.a(), metadata.f(), metadata.getShowRating(), metadata.getCurrentMessages(), params.getLastMessageCount() != metadata.getCurrentMessages(), null, 256, null);
                    }
                    return new dx.i.Right(full);
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
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
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
