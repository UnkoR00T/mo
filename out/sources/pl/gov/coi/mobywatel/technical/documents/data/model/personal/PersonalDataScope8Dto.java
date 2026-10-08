package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.t;
import oq.a;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.HeaderContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.MnemonicHeaderContainerDto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8Dto;", "", "header", "Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto;", "dh", "Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;", "data", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8DataContainerDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto;Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8DataContainerDto;)V", "getHeader$annotations", "()V", "getHeader", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/HeaderContainerDto;", "getDh", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;", "getData", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8DataContainerDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope8Dto {

    @c("data")
    private final PersonalDataScope8DataContainerDto data;

    @c("dh")
    private final MnemonicHeaderContainerDto dh;

    @c("header")
    private final HeaderContainerDto header;

    public PersonalDataScope8Dto(HeaderContainerDto headerContainerDto, MnemonicHeaderContainerDto mnemonicHeaderContainerDto, PersonalDataScope8DataContainerDto personalDataScope8DataContainerDto) {
        this.header = headerContainerDto;
        this.dh = mnemonicHeaderContainerDto;
        this.data = personalDataScope8DataContainerDto;
    }

    public static /* synthetic */ PersonalDataScope8Dto copy$default(PersonalDataScope8Dto personalDataScope8Dto, HeaderContainerDto headerContainerDto, MnemonicHeaderContainerDto mnemonicHeaderContainerDto, PersonalDataScope8DataContainerDto personalDataScope8DataContainerDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            headerContainerDto = personalDataScope8Dto.header;
        }
        if ((i15 & 2) != 0) {
            mnemonicHeaderContainerDto = personalDataScope8Dto.dh;
        }
        if ((i15 & 4) != 0) {
            personalDataScope8DataContainerDto = personalDataScope8Dto.data;
        }
        return personalDataScope8Dto.copy(headerContainerDto, mnemonicHeaderContainerDto, personalDataScope8DataContainerDto);
    }

    @a
    public static /* synthetic */ void getHeader$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeaderContainerDto getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MnemonicHeaderContainerDto getDh() {
        return this.dh;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PersonalDataScope8DataContainerDto getData() {
        return this.data;
    }

    public final PersonalDataScope8Dto copy(HeaderContainerDto header, MnemonicHeaderContainerDto dh4, PersonalDataScope8DataContainerDto data) {
        return new PersonalDataScope8Dto(header, dh4, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope8Dto)) {
            return false;
        }
        PersonalDataScope8Dto personalDataScope8Dto = (PersonalDataScope8Dto) other;
        return t.c(this.header, personalDataScope8Dto.header) && t.c(this.dh, personalDataScope8Dto.dh) && t.c(this.data, personalDataScope8Dto.data);
    }

    public final PersonalDataScope8DataContainerDto getData() {
        return this.data;
    }

    public final MnemonicHeaderContainerDto getDh() {
        return this.dh;
    }

    public final HeaderContainerDto getHeader() {
        return this.header;
    }

    public int hashCode() {
        return (((this.header.hashCode() * 31) + this.dh.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "PersonalDataScope8Dto(header=" + this.header + ", dh=" + this.dh + ", data=" + this.data + ')';
    }
}
