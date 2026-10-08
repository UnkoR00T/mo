package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.MnemonicHeaderContainerDto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope6Dto;", "", "dh", "Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;", "dc", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope6DataContainerDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope6DataContainerDto;)V", "getDh", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;", "getDc", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope6DataContainerDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope6Dto {

    @c("dc")
    private final PersonalDataScope6DataContainerDto dc;

    @c("dh")
    private final MnemonicHeaderContainerDto dh;

    public PersonalDataScope6Dto(MnemonicHeaderContainerDto mnemonicHeaderContainerDto, PersonalDataScope6DataContainerDto personalDataScope6DataContainerDto) {
        this.dh = mnemonicHeaderContainerDto;
        this.dc = personalDataScope6DataContainerDto;
    }

    public static /* synthetic */ PersonalDataScope6Dto copy$default(PersonalDataScope6Dto personalDataScope6Dto, MnemonicHeaderContainerDto mnemonicHeaderContainerDto, PersonalDataScope6DataContainerDto personalDataScope6DataContainerDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            mnemonicHeaderContainerDto = personalDataScope6Dto.dh;
        }
        if ((i15 & 2) != 0) {
            personalDataScope6DataContainerDto = personalDataScope6Dto.dc;
        }
        return personalDataScope6Dto.copy(mnemonicHeaderContainerDto, personalDataScope6DataContainerDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MnemonicHeaderContainerDto getDh() {
        return this.dh;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PersonalDataScope6DataContainerDto getDc() {
        return this.dc;
    }

    public final PersonalDataScope6Dto copy(MnemonicHeaderContainerDto dh4, PersonalDataScope6DataContainerDto dc5) {
        return new PersonalDataScope6Dto(dh4, dc5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope6Dto)) {
            return false;
        }
        PersonalDataScope6Dto personalDataScope6Dto = (PersonalDataScope6Dto) other;
        return t.c(this.dh, personalDataScope6Dto.dh) && t.c(this.dc, personalDataScope6Dto.dc);
    }

    public final PersonalDataScope6DataContainerDto getDc() {
        return this.dc;
    }

    public final MnemonicHeaderContainerDto getDh() {
        return this.dh;
    }

    public int hashCode() {
        return (this.dh.hashCode() * 31) + this.dc.hashCode();
    }

    public String toString() {
        return "PersonalDataScope6Dto(dh=" + this.dh + ", dc=" + this.dc + ')';
    }
}
