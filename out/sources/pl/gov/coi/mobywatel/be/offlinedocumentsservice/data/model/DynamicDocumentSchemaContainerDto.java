package pl.gov.coi.mobywatel.be.offlinedocumentsservice.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.time.LocalDate;
import or0.DocumentSchemaDtoDto;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentSchemaContainerDto;", "", "", "documentId", "Lor0/x;", "schema", "Ljava/time/LocalDate;", "expirationDate", "<init>", "(Ljava/lang/String;Lor0/x;Ljava/time/LocalDate;)V", "component1", "()Ljava/lang/String;", "component2", "()Lor0/x;", "component3", "()Ljava/time/LocalDate;", "copy", "(Ljava/lang/String;Lor0/x;Ljava/time/LocalDate;)Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentSchemaContainerDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "Lor0/x;", "getSchema", "Ljava/time/LocalDate;", "getExpirationDate", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocumentSchemaContainerDto {

    @c("documentId")
    private final String documentId;

    @c("expirationDate")
    private final LocalDate expirationDate;

    @c("schema")
    private final DocumentSchemaDtoDto schema;

    public DynamicDocumentSchemaContainerDto(String str, DocumentSchemaDtoDto documentSchemaDtoDto, LocalDate localDate) {
        this.documentId = str;
        this.schema = documentSchemaDtoDto;
        this.expirationDate = localDate;
    }

    public static /* synthetic */ DynamicDocumentSchemaContainerDto copy$default(DynamicDocumentSchemaContainerDto dynamicDocumentSchemaContainerDto, String str, DocumentSchemaDtoDto documentSchemaDtoDto, LocalDate localDate, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = dynamicDocumentSchemaContainerDto.documentId;
        }
        if ((i15 & 2) != 0) {
            documentSchemaDtoDto = dynamicDocumentSchemaContainerDto.schema;
        }
        if ((i15 & 4) != 0) {
            localDate = dynamicDocumentSchemaContainerDto.expirationDate;
        }
        return dynamicDocumentSchemaContainerDto.copy(str, documentSchemaDtoDto, localDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DocumentSchemaDtoDto getSchema() {
        return this.schema;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public final DynamicDocumentSchemaContainerDto copy(String documentId, DocumentSchemaDtoDto schema, LocalDate expirationDate) {
        return new DynamicDocumentSchemaContainerDto(documentId, schema, expirationDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocumentSchemaContainerDto)) {
            return false;
        }
        DynamicDocumentSchemaContainerDto dynamicDocumentSchemaContainerDto = (DynamicDocumentSchemaContainerDto) other;
        return t.c(this.documentId, dynamicDocumentSchemaContainerDto.documentId) && t.c(this.schema, dynamicDocumentSchemaContainerDto.schema) && t.c(this.expirationDate, dynamicDocumentSchemaContainerDto.expirationDate);
    }

    public final String getDocumentId() {
        return this.documentId;
    }

    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public final DocumentSchemaDtoDto getSchema() {
        return this.schema;
    }

    public int hashCode() {
        int iHashCode = ((this.documentId.hashCode() * 31) + this.schema.hashCode()) * 31;
        LocalDate localDate = this.expirationDate;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "DynamicDocumentSchemaContainerDto(documentId=" + this.documentId + ", schema=" + this.schema + ", expirationDate=" + this.expirationDate + ')';
    }
}
