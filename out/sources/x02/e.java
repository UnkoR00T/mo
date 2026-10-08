package x02;

import eo0.Recipient;
import eo0.y0;
import fr.t;
import m22.h;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx02/e;", "Lgz/a;", "Lx02/e$a;", "Loq/i0;", "<init>", "()V", "params", "b", "(Lx02/e$a;)V", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.a<Params, i0> {

    /* JADX INFO: renamed from: x02.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lx02/e$a;", "Lgz/b$a;", "Leo0/k0;", "recipientToVerify", "Leo0/y0;", "chosenServiceType", "Lm22/h;", "messageWizardContract", "<init>", "(Leo0/k0;Leo0/y0;Lm22/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k0;", "b", "()Leo0/k0;", "Leo0/y0;", "()Leo0/y0;", "c", "Lm22/h;", "p", "()Lm22/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Recipient recipientToVerify;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 chosenServiceType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final h messageWizardContract;

        public Params(Recipient recipient, y0 y0Var, h hVar) {
            this.recipientToVerify = recipient;
            this.chosenServiceType = y0Var;
            this.messageWizardContract = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y0 getChosenServiceType() {
            return this.chosenServiceType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Recipient getRecipientToVerify() {
            return this.recipientToVerify;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.recipientToVerify, params.recipientToVerify) && this.chosenServiceType == params.chosenServiceType && t.c(this.messageWizardContract, params.messageWizardContract);
        }

        public int hashCode() {
            Recipient recipient = this.recipientToVerify;
            return ((((recipient == null ? 0 : recipient.hashCode()) * 31) + this.chosenServiceType.hashCode()) * 31) + this.messageWizardContract.hashCode();
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final h getMessageWizardContract() {
            return this.messageWizardContract;
        }

        public String toString() {
            return "Params(recipientToVerify=" + this.recipientToVerify + ", chosenServiceType=" + this.chosenServiceType + ", messageWizardContract=" + this.messageWizardContract + ')';
        }
    }

    public void b(Params params) {
        params.getMessageWizardContract().b3(new o02.b.ChooseMessageType(params.getRecipientToVerify(), params.getChosenServiceType()));
    }
}
