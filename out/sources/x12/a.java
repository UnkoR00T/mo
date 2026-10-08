package x12;

import c30.b;
import fr.t;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lx12/a;", "", "Lc30/b;", "a", "()Lc30/b;", "generalInfoAlertData", "b", "Lx12/a$a;", "Lx12/a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: x12.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lx12/a$a;", "Lx12/a;", "Ln30/b;", "addRecipientCardData", "Lc30/b;", "generalInfoAlertData", "<init>", "(Ln30/b;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "b", "()Ln30/b;", "Lc30/b;", "()Lc30/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f216435c = b.f22944i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData addRecipientCardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b generalInfoAlertData;

        public Empty(CardListData cardListData, b bVar) {
            this.addRecipientCardData = cardListData;
            this.generalInfoAlertData = bVar;
        }

        @Override // x12.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public b getGeneralInfoAlertData() {
            return this.generalInfoAlertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardListData getAddRecipientCardData() {
            return this.addRecipientCardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return t.c(this.addRecipientCardData, empty.addRecipientCardData) && t.c(this.generalInfoAlertData, empty.generalInfoAlertData);
        }

        public int hashCode() {
            int iHashCode = this.addRecipientCardData.hashCode() * 31;
            b bVar = this.generalInfoAlertData;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Empty(addRecipientCardData=" + this.addRecipientCardData + ", generalInfoAlertData=" + this.generalInfoAlertData + ')';
        }
    }

    /* JADX INFO: renamed from: x12.a$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lx12/a$b;", "Lx12/a;", "Ln30/b;", "recipients", "addRecipientCardData", "Lc30/b;", "recipientsInfoAlertData", "generalInfoAlertData", "<init>", "(Ln30/b;Ln30/b;Lc30/b;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "c", "()Ln30/b;", "b", "Lc30/b;", "d", "()Lc30/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Recipients implements a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f216438e = b.f22944i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData recipients;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData addRecipientCardData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b recipientsInfoAlertData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b generalInfoAlertData;

        public Recipients(CardListData cardListData, CardListData cardListData2, b bVar, b bVar2) {
            this.recipients = cardListData;
            this.addRecipientCardData = cardListData2;
            this.recipientsInfoAlertData = bVar;
            this.generalInfoAlertData = bVar2;
        }

        @Override // x12.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public b getGeneralInfoAlertData() {
            return this.generalInfoAlertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardListData getAddRecipientCardData() {
            return this.addRecipientCardData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CardListData getRecipients() {
            return this.recipients;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getRecipientsInfoAlertData() {
            return this.recipientsInfoAlertData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recipients)) {
                return false;
            }
            Recipients recipients = (Recipients) other;
            return t.c(this.recipients, recipients.recipients) && t.c(this.addRecipientCardData, recipients.addRecipientCardData) && t.c(this.recipientsInfoAlertData, recipients.recipientsInfoAlertData) && t.c(this.generalInfoAlertData, recipients.generalInfoAlertData);
        }

        public int hashCode() {
            int iHashCode = this.recipients.hashCode() * 31;
            CardListData cardListData = this.addRecipientCardData;
            int iHashCode2 = (iHashCode + (cardListData == null ? 0 : cardListData.hashCode())) * 31;
            b bVar = this.recipientsInfoAlertData;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            b bVar2 = this.generalInfoAlertData;
            return iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
        }

        public String toString() {
            return "Recipients(recipients=" + this.recipients + ", addRecipientCardData=" + this.addRecipientCardData + ", recipientsInfoAlertData=" + this.recipientsInfoAlertData + ", generalInfoAlertData=" + this.generalInfoAlertData + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    b getGeneralInfoAlertData();
}
