package x02;

import dx.i;
import eo0.Recipient;
import fr.t;
import java.util.List;
import m22.h;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lx02/c;", "", "Lx02/c$a;", "Loq/i0;", "<init>", "()V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lx02/c$a;Ltq/e;)Ljava/lang/Object;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: x02.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lx02/c$a;", "Lgz/b$a;", "Leo0/k0;", "recipientToRemove", "Lm22/h;", "messageWizardContract", "<init>", "(Leo0/k0;Lm22/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k0;", "()Leo0/k0;", "b", "Lm22/h;", "p", "()Lm22/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Recipient recipientToRemove;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final h messageWizardContract;

        public Params(Recipient recipient, h hVar) {
            this.recipientToRemove = recipient;
            this.messageWizardContract = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Recipient getRecipientToRemove() {
            return this.recipientToRemove;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.recipientToRemove, params.recipientToRemove) && t.c(this.messageWizardContract, params.messageWizardContract);
        }

        public int hashCode() {
            return (this.recipientToRemove.hashCode() * 31) + this.messageWizardContract.hashCode();
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final h getMessageWizardContract() {
            return this.messageWizardContract;
        }

        public String toString() {
            return "Params(recipientToRemove=" + this.recipientToRemove + ", messageWizardContract=" + this.messageWizardContract + ')';
        }
    }

    public Object d(Params params, tq.e<? super i<? extends dx.b, i0>> eVar) {
        o02.b.AddRecipients addRecipientsH6 = params.getMessageWizardContract().H6();
        if (addRecipientsH6 == null) {
            return new i.Left(new dx.b.Generic(new IllegalArgumentException("The list of users is already empty")));
        }
        List listI0 = v.I0(addRecipientsH6.a(), params.getRecipientToRemove());
        params.getMessageWizardContract().k6(new o02.b.AddRecipients(listI0));
        if (listI0.isEmpty()) {
            params.getMessageWizardContract().reset();
        }
        return new i.Right(i0.f148189a);
    }
}
