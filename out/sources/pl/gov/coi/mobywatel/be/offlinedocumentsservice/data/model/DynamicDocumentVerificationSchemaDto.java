package pl.gov.coi.mobywatel.be.offlinedocumentsservice.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.util.List;
import or0.DocumentSchemaAttributeDtoDto;
import or0.DocumentSchemaLabelDto;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013JZ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b)\u0010\u0013¨\u0006*"}, d2 = {"Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentVerificationSchemaDto;", "", "", "schemaId", "schemaVersion", "documentName", "", "Lor0/b0;", "title", "Lor0/u;", "expirationDate", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lor0/u;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lor0/u;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lor0/u;Ljava/util/List;)Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentVerificationSchemaDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSchemaId", "getSchemaVersion", "getDocumentName", "Ljava/util/List;", "getTitle", "Lor0/u;", "getExpirationDate", "getAttributes", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocumentVerificationSchemaDto {

    @c("attributes")
    private final List<DocumentSchemaAttributeDtoDto> attributes;

    @c("documentName")
    private final String documentName;

    @c("expirationDate")
    private final DocumentSchemaAttributeDtoDto expirationDate;

    @c("schemaId")
    private final String schemaId;

    @c("schemaVersion")
    private final String schemaVersion;

    @c("title")
    private final List<DocumentSchemaLabelDto> title;

    public DynamicDocumentVerificationSchemaDto(String str, String str2, String str3, List<DocumentSchemaLabelDto> list, DocumentSchemaAttributeDtoDto documentSchemaAttributeDtoDto, List<DocumentSchemaAttributeDtoDto> list2) {
        this.schemaId = str;
        this.schemaVersion = str2;
        this.documentName = str3;
        this.title = list;
        this.expirationDate = documentSchemaAttributeDtoDto;
        this.attributes = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicDocumentVerificationSchemaDto copy$default(DynamicDocumentVerificationSchemaDto dynamicDocumentVerificationSchemaDto, String str, String str2, String str3, List list, DocumentSchemaAttributeDtoDto documentSchemaAttributeDtoDto, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = dynamicDocumentVerificationSchemaDto.schemaId;
        }
        if ((i15 & 2) != 0) {
            str2 = dynamicDocumentVerificationSchemaDto.schemaVersion;
        }
        if ((i15 & 4) != 0) {
            str3 = dynamicDocumentVerificationSchemaDto.documentName;
        }
        if ((i15 & 8) != 0) {
            list = dynamicDocumentVerificationSchemaDto.title;
        }
        if ((i15 & 16) != 0) {
            documentSchemaAttributeDtoDto = dynamicDocumentVerificationSchemaDto.expirationDate;
        }
        if ((i15 & 32) != 0) {
            list2 = dynamicDocumentVerificationSchemaDto.attributes;
        }
        DocumentSchemaAttributeDtoDto documentSchemaAttributeDtoDto2 = documentSchemaAttributeDtoDto;
        List list3 = list2;
        return dynamicDocumentVerificationSchemaDto.copy(str, str2, str3, list, documentSchemaAttributeDtoDto2, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSchemaVersion() {
        return this.schemaVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    public final List<DocumentSchemaLabelDto> component4() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DocumentSchemaAttributeDtoDto getExpirationDate() {
        return this.expirationDate;
    }

    public final List<DocumentSchemaAttributeDtoDto> component6() {
        return this.attributes;
    }

    public final DynamicDocumentVerificationSchemaDto copy(String schemaId, String schemaVersion, String documentName, List<DocumentSchemaLabelDto> title, DocumentSchemaAttributeDtoDto expirationDate, List<DocumentSchemaAttributeDtoDto> attributes) {
        return new DynamicDocumentVerificationSchemaDto(schemaId, schemaVersion, documentName, title, expirationDate, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocumentVerificationSchemaDto)) {
            return false;
        }
        DynamicDocumentVerificationSchemaDto dynamicDocumentVerificationSchemaDto = (DynamicDocumentVerificationSchemaDto) other;
        return t.c(this.schemaId, dynamicDocumentVerificationSchemaDto.schemaId) && t.c(this.schemaVersion, dynamicDocumentVerificationSchemaDto.schemaVersion) && t.c(this.documentName, dynamicDocumentVerificationSchemaDto.documentName) && t.c(this.title, dynamicDocumentVerificationSchemaDto.title) && t.c(this.expirationDate, dynamicDocumentVerificationSchemaDto.expirationDate) && t.c(this.attributes, dynamicDocumentVerificationSchemaDto.attributes);
    }

    public final List<DocumentSchemaAttributeDtoDto> getAttributes() {
        return this.attributes;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final DocumentSchemaAttributeDtoDto getExpirationDate() {
        return this.expirationDate;
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public final String getSchemaVersion() {
        return this.schemaVersion;
    }

    public final List<DocumentSchemaLabelDto> getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.schemaId.hashCode() * 31) + this.schemaVersion.hashCode()) * 31) + this.documentName.hashCode()) * 31) + this.title.hashCode()) * 31) + this.expirationDate.hashCode()) * 31;
        List<DocumentSchemaAttributeDtoDto> list = this.attributes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "DynamicDocumentVerificationSchemaDto(schemaId=" + this.schemaId + ", schemaVersion=" + this.schemaVersion + ", documentName=" + this.documentName + ", title=" + this.title + ", expirationDate=" + this.expirationDate + ", attributes=" + this.attributes + ')';
    }

    public /* synthetic */ DynamicDocumentVerificationSchemaDto(String str, String str2, String str3, List list, DocumentSchemaAttributeDtoDto documentSchemaAttributeDtoDto, List list2, int i15, k kVar) {
        this(str, str2, str3, list, documentSchemaAttributeDtoDto, (i15 & 32) != 0 ? null : list2);
    }
}
