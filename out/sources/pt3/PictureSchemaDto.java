package pt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pt3.a0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0004¨\u0006\""}, d2 = {"Lpt3/a0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/List;", "getAttributes", "()Ljava/util/List;", "attributes", "b", "Ljava/lang/String;", "getEmblemTextHexColor", "emblemTextHexColor", "c", "getPictureId", "pictureId", "d", "getAttributesTitleTextHexColor", "attributesTitleTextHexColor", "e", "getAttributesValueTextHexColor", "attributesValueTextHexColor", "f", "getSourceContainerRef", "sourceContainerRef", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PictureSchemaDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attributes")
    private final List<Object> attributes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("emblemTextHexColor")
    private final String emblemTextHexColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pictureId")
    private final String pictureId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attributesTitleTextHexColor")
    private final String attributesTitleTextHexColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attributesValueTextHexColor")
    private final String attributesValueTextHexColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sourceContainerRef")
    private final String sourceContainerRef;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PictureSchemaDto)) {
            return false;
        }
        PictureSchemaDto pictureSchemaDto = (PictureSchemaDto) other;
        return fr.t.c(this.attributes, pictureSchemaDto.attributes) && fr.t.c(this.emblemTextHexColor, pictureSchemaDto.emblemTextHexColor) && fr.t.c(this.pictureId, pictureSchemaDto.pictureId) && fr.t.c(this.attributesTitleTextHexColor, pictureSchemaDto.attributesTitleTextHexColor) && fr.t.c(this.attributesValueTextHexColor, pictureSchemaDto.attributesValueTextHexColor) && fr.t.c(this.sourceContainerRef, pictureSchemaDto.sourceContainerRef);
    }

    public int hashCode() {
        int iHashCode = ((((this.attributes.hashCode() * 31) + this.emblemTextHexColor.hashCode()) * 31) + this.pictureId.hashCode()) * 31;
        String str = this.attributesTitleTextHexColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.attributesValueTextHexColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceContainerRef;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "PictureSchemaDto(attributes=" + this.attributes + ", emblemTextHexColor=" + this.emblemTextHexColor + ", pictureId=" + this.pictureId + ", attributesTitleTextHexColor=" + this.attributesTitleTextHexColor + ", attributesValueTextHexColor=" + this.attributesValueTextHexColor + ", sourceContainerRef=" + this.sourceContainerRef + ')';
    }
}
