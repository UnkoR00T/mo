# Paczka 219 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `wh2/AdvocateData.java`, `wj/g.java`, `xd4/DynamicDocument.java`

## wh2/AdvocateData.java

```java
package wh2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wh2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lwh2/c;", "Landroid/os/Parcelable;", "Lwh2/a;", "dataContainer", "Lxh2/a;", "dataHeader", "<init>", "(Lwh2/a;Lxh2/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwh2/a;", "()Lwh2/a;", "b", "Lxh2/a;", "()Lxh2/a;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdvocateData implements Parcelable {
    public static final Parcelable.Creator<AdvocateData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dc")
    private final AdvocateCardData dataContainer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dh")
    private final xh2.a dataHeader;

    /* JADX INFO: renamed from: wh2.c$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvocateData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AdvocateData createFromParcel(Parcel parcel) {
            return new AdvocateData(AdvocateCardData.CREATOR.createFromParcel(parcel), (xh2.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AdvocateData[] newArray(int i15) {
            return new AdvocateData[i15];
        }
    }

    public AdvocateData(AdvocateCardData advocateCardData, xh2.a aVar) {
        this.dataContainer = advocateCardData;
        this.dataHeader = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AdvocateCardData getDataContainer() {
        return this.dataContainer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final xh2.a getDataHeader() {
        return this.dataHeader;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvocateData)) {
            return false;
        }
        AdvocateData advocateData = (AdvocateData) other;
        return t.c(this.dataContainer, advocateData.dataContainer) && t.c(this.dataHeader, advocateData.dataHeader);
    }

    public int hashCode() {
        return (this.dataContainer.hashCode() * 31) + this.dataHeader.hashCode();
    }

    public String toString() {
        return "AdvocateData(dataContainer=" + this.dataContainer + ", dataHeader=" + this.dataHeader + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.dataContainer.writeToParcel(dest, flags);
        dest.writeSerializable(this.dataHeader);
    }
}

```

## wj/g.java

```java
package wj;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends b implements h {
    public g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // wj.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i17 = c.f213722a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            x(bundle);
            return true;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }
}

```

## xd4/DynamicDocument.java

```java
package xd4;

import android.os.Parcel;
import android.os.Parcelable;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xd4.f, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lxd4/f;", "", "", "documentIID", "Lrq0/b$b;", "documentType", "<init>", "(Ljava/lang/String;Lrq0/b$b;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lrq0/b$b;", "()Lrq0/b$b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocument implements u {
    public static final Parcelable.Creator<DynamicDocument> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f218069c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentIID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b.EnumC4479b documentType;

    /* JADX INFO: renamed from: xd4.f$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicDocument> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DynamicDocument createFromParcel(Parcel parcel) {
            return new DynamicDocument(parcel.readString(), rq0.b.EnumC4479b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DynamicDocument[] newArray(int i15) {
            return new DynamicDocument[i15];
        }
    }

    public DynamicDocument(String str, rq0.b.EnumC4479b enumC4479b) {
        this.documentIID = str;
        this.documentType = enumC4479b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentIID() {
        return this.documentIID;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rq0.b.EnumC4479b getDocumentType() {
        return this.documentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocument)) {
            return false;
        }
        DynamicDocument dynamicDocument = (DynamicDocument) other;
        return fr.t.c(this.documentIID, dynamicDocument.documentIID) && this.documentType == dynamicDocument.documentType;
    }

    public int hashCode() {
        String str = this.documentIID;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.documentType.hashCode();
    }

    public String toString() {
        return "DynamicDocument(documentIID=" + this.documentIID + ", documentType=" + this.documentType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.documentIID);
        dest.writeString(this.documentType.name());
    }
}

```
