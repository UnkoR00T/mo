package x02;

import dx.i;
import eo0.Recipient;
import eo0.p0;
import eo0.q0;
import eo0.y0;
import fr.t;
import java.util.List;
import m22.h;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.g0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001bB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lx02/b;", "", "Lx02/b$a;", "Lx02/b$b;", "Lx02/a;", "addRecipientUC", "Lx02/d;", "getMessageServiceTypeUC", "Lp02/g0;", "hasActiveEdorInboxUC", "Lx02/e;", "saveChooseMessageTypeResultUC", "<init>", "(Lx02/a;Lx02/d;Lp02/g0;Lx02/e;)V", "Leo0/y0;", "messageServiceType", "params", "Leo0/k0;", "recipientToVerify", "Ldx/i;", "Ldx/b;", "e", "(Leo0/y0;Lx02/b$a;Leo0/k0;Ltq/e;)Ljava/lang/Object;", "f", "(Lx02/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lx02/a;", "b", "Lx02/d;", "c", "Lp02/g0;", "d", "Lx02/e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f216173e = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x02.a addRecipientUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d getMessageServiceTypeUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g0 hasActiveEdorInboxUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e saveChooseMessageTypeResultUC;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lx02/b$a;", "Lgz/b$a;", "Leo0/k0;", "o", "()Leo0/k0;", "recipientToAdd", "Lm22/h;", "p", "()Lm22/h;", "messageWizardContract", "b", "a", "c", "Lx02/b$a$a;", "Lx02/b$a$b;", "Lx02/b$a$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends gz.b.a {

        /* JADX INFO: renamed from: x02.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lx02/b$a$a;", "Lx02/b$a;", "Leo0/k0;", "recipientToAdd", "Lm22/h;", "messageWizardContract", "<init>", "(Leo0/k0;Lm22/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k0;", "o", "()Leo0/k0;", "b", "Lm22/h;", "p", "()Lm22/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AdvancedSearch implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Recipient recipientToAdd;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final h messageWizardContract;

            public AdvancedSearch(Recipient recipient, h hVar) {
                this.recipientToAdd = recipient;
                this.messageWizardContract = hVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AdvancedSearch)) {
                    return false;
                }
                AdvancedSearch advancedSearch = (AdvancedSearch) other;
                return t.c(this.recipientToAdd, advancedSearch.recipientToAdd) && t.c(this.messageWizardContract, advancedSearch.messageWizardContract);
            }

            public int hashCode() {
                return (this.recipientToAdd.hashCode() * 31) + this.messageWizardContract.hashCode();
            }

            @Override // x02.b.a
            /* JADX INFO: renamed from: o, reason: from getter */
            public Recipient getRecipientToAdd() {
                return this.recipientToAdd;
            }

            @Override // x02.b.a
            /* JADX INFO: renamed from: p, reason: from getter */
            public h getMessageWizardContract() {
                return this.messageWizardContract;
            }

            public String toString() {
                return "AdvancedSearch(recipientToAdd=" + this.recipientToAdd + ", messageWizardContract=" + this.messageWizardContract + ')';
            }
        }

        /* JADX INFO: renamed from: x02.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lx02/b$a$b;", "Lx02/b$a;", "Leo0/k0;", "recipientToAdd", "Lm22/h;", "messageWizardContract", "<init>", "(Leo0/k0;Lm22/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k0;", "o", "()Leo0/k0;", "b", "Lm22/h;", "p", "()Lm22/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BasicSearch implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Recipient recipientToAdd;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final h messageWizardContract;

            public BasicSearch(Recipient recipient, h hVar) {
                this.recipientToAdd = recipient;
                this.messageWizardContract = hVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BasicSearch)) {
                    return false;
                }
                BasicSearch basicSearch = (BasicSearch) other;
                return t.c(this.recipientToAdd, basicSearch.recipientToAdd) && t.c(this.messageWizardContract, basicSearch.messageWizardContract);
            }

            public int hashCode() {
                return (this.recipientToAdd.hashCode() * 31) + this.messageWizardContract.hashCode();
            }

            @Override // x02.b.a
            /* JADX INFO: renamed from: o, reason: from getter */
            public Recipient getRecipientToAdd() {
                return this.recipientToAdd;
            }

            @Override // x02.b.a
            /* JADX INFO: renamed from: p, reason: from getter */
            public h getMessageWizardContract() {
                return this.messageWizardContract;
            }

            public String toString() {
                return "BasicSearch(recipientToAdd=" + this.recipientToAdd + ", messageWizardContract=" + this.messageWizardContract + ')';
            }
        }

        /* JADX INFO: renamed from: x02.b$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lx02/b$a$c;", "Lx02/b$a;", "Leo0/k0;", "recipientToAdd", "Lm22/h;", "messageWizardContract", "Leo0/y0;", "chosenMessageType", "<init>", "(Leo0/k0;Lm22/h;Leo0/y0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k0;", "o", "()Leo0/k0;", "b", "Lm22/h;", "p", "()Lm22/h;", "c", "Leo0/y0;", "()Leo0/y0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ChooseMessageType implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Recipient recipientToAdd;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final h messageWizardContract;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final y0 chosenMessageType;

            public ChooseMessageType(Recipient recipient, h hVar, y0 y0Var) {
                this.recipientToAdd = recipient;
                this.messageWizardContract = hVar;
                this.chosenMessageType = y0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final y0 getChosenMessageType() {
                return this.chosenMessageType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChooseMessageType)) {
                    return false;
                }
                ChooseMessageType chooseMessageType = (ChooseMessageType) other;
                return t.c(this.recipientToAdd, chooseMessageType.recipientToAdd) && t.c(this.messageWizardContract, chooseMessageType.messageWizardContract) && this.chosenMessageType == chooseMessageType.chosenMessageType;
            }

            public int hashCode() {
                return (((this.recipientToAdd.hashCode() * 31) + this.messageWizardContract.hashCode()) * 31) + this.chosenMessageType.hashCode();
            }

            @Override // x02.b.a
            /* JADX INFO: renamed from: o, reason: from getter */
            public Recipient getRecipientToAdd() {
                return this.recipientToAdd;
            }

            @Override // x02.b.a
            /* JADX INFO: renamed from: p, reason: from getter */
            public h getMessageWizardContract() {
                return this.messageWizardContract;
            }

            public String toString() {
                return "ChooseMessageType(recipientToAdd=" + this.recipientToAdd + ", messageWizardContract=" + this.messageWizardContract + ", chosenMessageType=" + this.chosenMessageType + ')';
            }
        }

        /* JADX INFO: renamed from: o */
        Recipient getRecipientToAdd();

        /* JADX INFO: renamed from: p */
        h getMessageWizardContract();
    }

    /* JADX INFO: renamed from: x02.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lx02/b$b;", "", "a", "b", "Lx02/b$b$a;", "Lx02/b$b$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC5752b {

        /* JADX INFO: renamed from: x02.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lx02/b$b$a;", "Lx02/b$b;", "", "Leo0/k0;", "recipients", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getRecipients", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RecipientAdded implements InterfaceC5752b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Recipient> recipients;

            public RecipientAdded(List<Recipient> list) {
                this.recipients = list;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RecipientAdded) && t.c(this.recipients, ((RecipientAdded) other).recipients);
            }

            public int hashCode() {
                return this.recipients.hashCode();
            }

            public String toString() {
                return "RecipientAdded(recipients=" + this.recipients + ')';
            }
        }

        /* JADX INFO: renamed from: x02.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx02/b$b$b;", "Lx02/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5753b implements InterfaceC5752b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5753b f216186a = new C5753b();

            private C5753b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5753b);
            }

            public int hashCode() {
                return 3902579;
            }

            public String toString() {
                return "RecipientToVerify";
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f216187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f216188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f216189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f216190g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f216192j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f216190g = obj;
            this.f216192j |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, null, null, this);
        }
    }

    public b(x02.a aVar, d dVar, g0 g0Var, e eVar) {
        this.addRecipientUC = aVar;
        this.getMessageServiceTypeUC = dVar;
        this.hasActiveEdorInboxUC = g0Var;
        this.saveChooseMessageTypeResultUC = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(y0 y0Var, a aVar, Recipient recipient, tq.e<? super i<? extends dx.b, ? extends InterfaceC5752b>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f216192j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f216192j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f216190g;
        Object objE = uq.b.e();
        int i16 = cVar.f216192j;
        if (i16 == 0) {
            u.b(objD);
            x02.a aVar2 = this.addRecipientUC;
            x02.a.Params params = new x02.a.Params(aVar.getRecipientToAdd(), aVar.getMessageWizardContract(), y0Var);
            cVar.f216187d = y0Var;
            cVar.f216188e = aVar;
            cVar.f216189f = recipient;
            cVar.f216192j = 1;
            objD = aVar2.d(params, cVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recipient = (Recipient) cVar.f216189f;
            aVar = (a) cVar.f216188e;
            y0Var = (y0) cVar.f216187d;
            u.b(objD);
        }
        i iVar = (i) objD;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List list = (List) ((i.Right) iVar).b();
        this.saveChooseMessageTypeResultUC.b(new e.Params(recipient, y0Var, aVar.getMessageWizardContract()));
        return new i.Right(new InterfaceC5752b.RecipientAdded(list));
    }

    public Object f(a aVar, tq.e<? super i<? extends dx.b, ? extends InterfaceC5752b>> eVar) throws Throwable {
        y0 y0VarB = this.getMessageServiceTypeUC.b(new d.Params(aVar.getMessageWizardContract(), aVar.getMessageWizardContract()));
        if (!(aVar instanceof a.BasicSearch)) {
            if (aVar instanceof a.ChooseMessageType) {
                a.ChooseMessageType chooseMessageType = (a.ChooseMessageType) aVar;
                Object objE = e(chooseMessageType.getChosenMessageType(), chooseMessageType, null, eVar);
                return objE == uq.b.e() ? objE : (i) objE;
            }
            if (!(aVar instanceof a.AdvancedSearch)) {
                throw new p();
            }
            if (y0VarB == y0.UNKNOWN) {
                y0VarB = q0.b(((a.AdvancedSearch) aVar).getRecipientToAdd().getServiceType());
            }
            Object objE2 = e(y0VarB, (a.AdvancedSearch) aVar, null, eVar);
            return objE2 == uq.b.e() ? objE2 : (i) objE2;
        }
        y0 y0Var = y0.UNKNOWN;
        if (y0VarB == y0Var) {
            a.BasicSearch basicSearch = (a.BasicSearch) aVar;
            if (basicSearch.getRecipientToAdd().getServiceType() == p0.E_PUAP_AND_E_DELIVERY) {
                if (this.hasActiveEdorInboxUC.b(gz.b.a.C1792a.f78542a).booleanValue()) {
                    this.saveChooseMessageTypeResultUC.b(new e.Params(basicSearch.getRecipientToAdd(), y0Var, basicSearch.getMessageWizardContract()));
                    return new i.Right(InterfaceC5752b.C5753b.f216186a);
                }
                Object objE3 = e(y0.E_PUAP, aVar, null, eVar);
                return objE3 == uq.b.e() ? objE3 : (i) objE3;
            }
        }
        if (y0VarB == y0Var) {
            y0VarB = q0.b(((a.BasicSearch) aVar).getRecipientToAdd().getServiceType());
        }
        Object objE4 = e(y0VarB, (a.BasicSearch) aVar, null, eVar);
        return objE4 == uq.b.e() ? objE4 : (i) objE4;
    }
}
