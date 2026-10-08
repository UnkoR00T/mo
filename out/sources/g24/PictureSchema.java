package g24;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g24.t, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b!\u0010\u0010R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u0018\u0010 ¨\u0006\""}, d2 = {"Lg24/t;", "", "", "pictureId", "emblemTextHexColor", "attributesValueTextHexColor", "attributesTitleTextHexColor", "", "Lg24/i;", "attributes", "sourceContainerRef", "Lg24/a;", "additionalLogos", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "e", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PictureSchema {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pictureId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emblemTextHexColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String attributesValueTextHexColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String attributesTitleTextHexColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaAttribute> attributes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourceContainerRef;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AdditionalLogo> additionalLogos;

    public PictureSchema(String str, String str2, String str3, String str4, List<DocumentSchemaAttribute> list, String str5, List<AdditionalLogo> list2) {
        this.pictureId = str;
        this.emblemTextHexColor = str2;
        this.attributesValueTextHexColor = str3;
        this.attributesTitleTextHexColor = str4;
        this.attributes = list;
        this.sourceContainerRef = str5;
        this.additionalLogos = list2;
    }

    public final List<AdditionalLogo> a() {
        return this.additionalLogos;
    }

    public final List<DocumentSchemaAttribute> b() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAttributesTitleTextHexColor() {
        return this.attributesTitleTextHexColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAttributesValueTextHexColor() {
        return this.attributesValueTextHexColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEmblemTextHexColor() {
        return this.emblemTextHexColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PictureSchema)) {
            return false;
        }
        PictureSchema pictureSchema = (PictureSchema) other;
        return fr.t.c(this.pictureId, pictureSchema.pictureId) && fr.t.c(this.emblemTextHexColor, pictureSchema.emblemTextHexColor) && fr.t.c(this.attributesValueTextHexColor, pictureSchema.attributesValueTextHexColor) && fr.t.c(this.attributesTitleTextHexColor, pictureSchema.attributesTitleTextHexColor) && fr.t.c(this.attributes, pictureSchema.attributes) && fr.t.c(this.sourceContainerRef, pictureSchema.sourceContainerRef) && fr.t.c(this.additionalLogos, pictureSchema.additionalLogos);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPictureId() {
        return this.pictureId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSourceContainerRef() {
        return this.sourceContainerRef;
    }

    public int hashCode() {
        int iHashCode = ((this.pictureId.hashCode() * 31) + this.emblemTextHexColor.hashCode()) * 31;
        String str = this.attributesValueTextHexColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.attributesTitleTextHexColor;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.attributes.hashCode()) * 31;
        String str3 = this.sourceContainerRef;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.additionalLogos.hashCode();
    }

    public String toString() {
        return "PictureSchema(pictureId=" + this.pictureId + ", emblemTextHexColor=" + this.emblemTextHexColor + ", attributesValueTextHexColor=" + this.attributesValueTextHexColor + ", attributesTitleTextHexColor=" + this.attributesTitleTextHexColor + ", attributes=" + this.attributes + ", sourceContainerRef=" + this.sourceContainerRef + ", additionalLogos=" + this.additionalLogos + ")";
    }
}
