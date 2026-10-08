package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope6DataContainerDto;", "", "n", "", "su", "p", "pIdCN", "s", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getN", "()Ljava/lang/String;", "getSu", "getP", "getPIdCN", "getS", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope6DataContainerDto {

    @c("n")
    private final String n;

    @c("p")
    private final String p;

    @c("pIdCN")
    private final String pIdCN;

    @c("s")
    private final String s;

    @c("su")
    private final String su;

    public PersonalDataScope6DataContainerDto(String str, String str2, String str3, String str4, String str5) {
        this.n = str;
        this.su = str2;
        this.p = str3;
        this.pIdCN = str4;
        this.s = str5;
    }

    public static /* synthetic */ PersonalDataScope6DataContainerDto copy$default(PersonalDataScope6DataContainerDto personalDataScope6DataContainerDto, String str, String str2, String str3, String str4, String str5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = personalDataScope6DataContainerDto.n;
        }
        if ((i15 & 2) != 0) {
            str2 = personalDataScope6DataContainerDto.su;
        }
        if ((i15 & 4) != 0) {
            str3 = personalDataScope6DataContainerDto.p;
        }
        if ((i15 & 8) != 0) {
            str4 = personalDataScope6DataContainerDto.pIdCN;
        }
        if ((i15 & 16) != 0) {
            str5 = personalDataScope6DataContainerDto.s;
        }
        String str6 = str5;
        String str7 = str3;
        return personalDataScope6DataContainerDto.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSu() {
        return this.su;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPIdCN() {
        return this.pIdCN;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getS() {
        return this.s;
    }

    public final PersonalDataScope6DataContainerDto copy(String n15, String su4, String p15, String pIdCN, String s15) {
        return new PersonalDataScope6DataContainerDto(n15, su4, p15, pIdCN, s15);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope6DataContainerDto)) {
            return false;
        }
        PersonalDataScope6DataContainerDto personalDataScope6DataContainerDto = (PersonalDataScope6DataContainerDto) other;
        return t.c(this.n, personalDataScope6DataContainerDto.n) && t.c(this.su, personalDataScope6DataContainerDto.su) && t.c(this.p, personalDataScope6DataContainerDto.p) && t.c(this.pIdCN, personalDataScope6DataContainerDto.pIdCN) && t.c(this.s, personalDataScope6DataContainerDto.s);
    }

    public final String getN() {
        return this.n;
    }

    public final String getP() {
        return this.p;
    }

    public final String getPIdCN() {
        return this.pIdCN;
    }

    public final String getS() {
        return this.s;
    }

    public final String getSu() {
        return this.su;
    }

    public int hashCode() {
        int iHashCode = ((((((this.n.hashCode() * 31) + this.su.hashCode()) * 31) + this.p.hashCode()) * 31) + this.pIdCN.hashCode()) * 31;
        String str = this.s;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PersonalDataScope6DataContainerDto(n=" + this.n + ", su=" + this.su + ", p=" + this.p + ", pIdCN=" + this.pIdCN + ", s=" + this.s + ')';
    }

    public /* synthetic */ PersonalDataScope6DataContainerDto(String str, String str2, String str3, String str4, String str5, int i15, k kVar) {
        this(str, str2, str3, str4, (i15 & 16) != 0 ? null : str5);
    }
}
