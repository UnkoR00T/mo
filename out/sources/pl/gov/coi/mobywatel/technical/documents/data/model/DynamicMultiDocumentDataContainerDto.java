package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.Map;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/DynamicMultiDocumentDataContainerDto;", "", "dataMap", "", "", "", "<init>", "(Ljava/util/Map;)V", "getDataMap", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicMultiDocumentDataContainerDto {

    @c("dataMap")
    private final Map<String, byte[]> dataMap;

    public DynamicMultiDocumentDataContainerDto(Map<String, byte[]> map) {
        this.dataMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicMultiDocumentDataContainerDto copy$default(DynamicMultiDocumentDataContainerDto dynamicMultiDocumentDataContainerDto, Map map, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            map = dynamicMultiDocumentDataContainerDto.dataMap;
        }
        return dynamicMultiDocumentDataContainerDto.copy(map);
    }

    public final Map<String, byte[]> component1() {
        return this.dataMap;
    }

    public final DynamicMultiDocumentDataContainerDto copy(Map<String, byte[]> dataMap) {
        return new DynamicMultiDocumentDataContainerDto(dataMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DynamicMultiDocumentDataContainerDto) && t.c(this.dataMap, ((DynamicMultiDocumentDataContainerDto) other).dataMap);
    }

    public final Map<String, byte[]> getDataMap() {
        return this.dataMap;
    }

    public int hashCode() {
        return this.dataMap.hashCode();
    }

    public String toString() {
        return "DynamicMultiDocumentDataContainerDto(dataMap=" + this.dataMap + ')';
    }
}
