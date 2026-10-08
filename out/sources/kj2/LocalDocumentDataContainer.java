package kj2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kj2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b&\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\"\u0010\u0018R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b$\u0010(R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\u001f\u0010(¨\u0006*"}, d2 = {"Lkj2/a;", "Landroid/os/Parcelable;", "", "templateType", "documentType", "documentName", "documentLogo", "additionalDescription", "", "Lkj2/b;", "commonAttributes", "additionalAttributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "getDocumentType", "c", "e", "d", "Ljava/util/List;", "()Ljava/util/List;", "g", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalDocumentDataContainer implements Parcelable {
    public static final Parcelable.Creator<LocalDocumentDataContainer> CREATOR = new C2680a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("templateType")
    private final String templateType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentType")
    private final String documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentName")
    private final String documentName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("logotypeBase64")
    private final String documentLogo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalDescription")
    private final String additionalDescription;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("commonAttributes")
    private final List<LocalDocumentDataContainerItem> commonAttributes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalAttributes")
    private final List<LocalDocumentDataContainerItem> additionalAttributes;

    /* JADX INFO: renamed from: kj2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C2680a implements Parcelable.Creator<LocalDocumentDataContainer> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocalDocumentDataContainer createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList.add(LocalDocumentDataContainerItem.CREATOR.createFromParcel(parcel));
            }
            int i17 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList2.add(LocalDocumentDataContainerItem.CREATOR.createFromParcel(parcel));
            }
            return new LocalDocumentDataContainer(string, string2, string3, string4, string5, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LocalDocumentDataContainer[] newArray(int i15) {
            return new LocalDocumentDataContainer[i15];
        }
    }

    public LocalDocumentDataContainer(String str, String str2, String str3, String str4, String str5, List<LocalDocumentDataContainerItem> list, List<LocalDocumentDataContainerItem> list2) {
        this.templateType = str;
        this.documentType = str2;
        this.documentName = str3;
        this.documentLogo = str4;
        this.additionalDescription = str5;
        this.commonAttributes = list;
        this.additionalAttributes = list2;
    }

    public final List<LocalDocumentDataContainerItem> a() {
        return this.additionalAttributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdditionalDescription() {
        return this.additionalDescription;
    }

    public final List<LocalDocumentDataContainerItem> c() {
        return this.commonAttributes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentLogo() {
        return this.documentLogo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalDocumentDataContainer)) {
            return false;
        }
        LocalDocumentDataContainer localDocumentDataContainer = (LocalDocumentDataContainer) other;
        return t.c(this.templateType, localDocumentDataContainer.templateType) && t.c(this.documentType, localDocumentDataContainer.documentType) && t.c(this.documentName, localDocumentDataContainer.documentName) && t.c(this.documentLogo, localDocumentDataContainer.documentLogo) && t.c(this.additionalDescription, localDocumentDataContainer.additionalDescription) && t.c(this.commonAttributes, localDocumentDataContainer.commonAttributes) && t.c(this.additionalAttributes, localDocumentDataContainer.additionalAttributes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTemplateType() {
        return this.templateType;
    }

    public int hashCode() {
        int iHashCode = ((((this.templateType.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.documentName.hashCode()) * 31;
        String str = this.documentLogo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.additionalDescription;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.commonAttributes.hashCode()) * 31) + this.additionalAttributes.hashCode();
    }

    public String toString() {
        return "LocalDocumentDataContainer(templateType=" + this.templateType + ", documentType=" + this.documentType + ", documentName=" + this.documentName + ", documentLogo=" + this.documentLogo + ", additionalDescription=" + this.additionalDescription + ", commonAttributes=" + this.commonAttributes + ", additionalAttributes=" + this.additionalAttributes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.templateType);
        dest.writeString(this.documentType);
        dest.writeString(this.documentName);
        dest.writeString(this.documentLogo);
        dest.writeString(this.additionalDescription);
        List<LocalDocumentDataContainerItem> list = this.commonAttributes;
        dest.writeInt(list.size());
        Iterator<LocalDocumentDataContainerItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<LocalDocumentDataContainerItem> list2 = this.additionalAttributes;
        dest.writeInt(list2.size());
        Iterator<LocalDocumentDataContainerItem> it4 = list2.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(dest, flags);
        }
    }
}
