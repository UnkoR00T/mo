package hl0;

import al0.BECommunityOffice;
import al0.BEContactDetailsData;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\u0003\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lhl0/a;", "", "Lhl0/b;", "a", "()Lhl0/b;", "initData", "c", "b", "d", "Lhl0/a$c;", "Lhl0/a$d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: hl0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhl0/a$a;", "Lhl0/a$c;", "Lhl0/b;", "initData", "<init>", "(Lhl0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/b;", "()Lhl0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Damage implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdCardInvalidationInitData initData;

        public Damage(IdCardInvalidationInitData idCardInvalidationInitData) {
            this.initData = idCardInvalidationInitData;
        }

        @Override // hl0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public IdCardInvalidationInitData getInitData() {
            return this.initData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Damage) && t.c(this.initData, ((Damage) other).initData);
        }

        public int hashCode() {
            return this.initData.hashCode();
        }

        public String toString() {
            return "Damage(initData=" + this.initData + ")";
        }
    }

    /* JADX INFO: renamed from: hl0.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhl0/a$b;", "Lhl0/a$c;", "Lhl0/b;", "initData", "<init>", "(Lhl0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/b;", "()Lhl0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loss implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdCardInvalidationInitData initData;

        public Loss(IdCardInvalidationInitData idCardInvalidationInitData) {
            this.initData = idCardInvalidationInitData;
        }

        @Override // hl0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public IdCardInvalidationInitData getInitData() {
            return this.initData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loss) && t.c(this.initData, ((Loss) other).initData);
        }

        public int hashCode() {
            return this.initData.hashCode();
        }

        public String toString() {
            return "Loss(initData=" + this.initData + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhl0/a$c;", "Lhl0/a;", "Lhl0/a$a;", "Lhl0/a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends a {
    }

    /* JADX INFO: renamed from: hl0.a$d, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, d2 = {"Lhl0/a$d;", "Lhl0/a;", "Lhl0/b;", "initData", "Lal0/j;", "contactDetails", "Lhl0/d;", "descriptionData", "Lal0/i;", "communityOffice", "<init>", "(Lhl0/b;Lal0/j;Lhl0/d;Lal0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/b;", "()Lhl0/b;", "b", "Lal0/j;", "c", "()Lal0/j;", "Lhl0/d;", "d", "()Lhl0/d;", "Lal0/i;", "()Lal0/i;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Theft implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdCardInvalidationInitData initData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEContactDetailsData contactDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdCardInvalidationTheftDescription descriptionData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final BECommunityOffice communityOffice;

        public Theft(IdCardInvalidationInitData idCardInvalidationInitData, BEContactDetailsData jVar, IdCardInvalidationTheftDescription dVar, BECommunityOffice bECommunityOffice) {
            this.initData = idCardInvalidationInitData;
            this.contactDetails = jVar;
            this.descriptionData = dVar;
            this.communityOffice = bECommunityOffice;
        }

        @Override // hl0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public IdCardInvalidationInitData getInitData() {
            return this.initData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BECommunityOffice getCommunityOffice() {
            return this.communityOffice;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BEContactDetailsData getContactDetails() {
            return this.contactDetails;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final IdCardInvalidationTheftDescription getDescriptionData() {
            return this.descriptionData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Theft)) {
                return false;
            }
            Theft theft = (Theft) other;
            return t.c(this.initData, theft.initData) && t.c(this.contactDetails, theft.contactDetails) && t.c(this.descriptionData, theft.descriptionData) && t.c(this.communityOffice, theft.communityOffice);
        }

        public int hashCode() {
            return (((((this.initData.hashCode() * 31) + this.contactDetails.hashCode()) * 31) + this.descriptionData.hashCode()) * 31) + this.communityOffice.hashCode();
        }

        public String toString() {
            return "Theft(initData=" + this.initData + ", contactDetails=" + this.contactDetails + ", descriptionData=" + this.descriptionData + ", communityOffice=" + this.communityOffice + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    IdCardInvalidationInitData getInitData();
}
