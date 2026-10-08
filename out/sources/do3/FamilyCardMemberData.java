package do3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: do3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0019"}, d2 = {"Ldo3/b;", "", "", "number", "holderType", "firstName", "lastName", "cardRelation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FamilyCardMemberData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String holderType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardRelation;

    public FamilyCardMemberData(String str, String str2, String str3, String str4, String str5) {
        this.number = str;
        this.holderType = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.cardRelation = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardRelation() {
        return this.cardRelation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHolderType() {
        return this.holderType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyCardMemberData)) {
            return false;
        }
        FamilyCardMemberData familyCardMemberData = (FamilyCardMemberData) other;
        return t.c(this.number, familyCardMemberData.number) && t.c(this.holderType, familyCardMemberData.holderType) && t.c(this.firstName, familyCardMemberData.firstName) && t.c(this.lastName, familyCardMemberData.lastName) && t.c(this.cardRelation, familyCardMemberData.cardRelation);
    }

    public int hashCode() {
        return (((((((this.number.hashCode() * 31) + this.holderType.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.cardRelation.hashCode();
    }

    public String toString() {
        return "FamilyCardMemberData(number=" + this.number + ", holderType=" + this.holderType + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", cardRelation=" + this.cardRelation + ')';
    }
}
