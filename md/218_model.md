# Paczka 218 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `wh2/AdvocateCardData.java`

## wh2/AdvocateCardData.java

```java
package wh2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wh2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001c\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"Lwh2/a;", "Landroid/os/Parcelable;", "", "number", "memberInstitution", "Ljava/util/Date;", "releaseDate", "expiredData", "permissionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Date;", "e", "()Ljava/util/Date;", "d", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdvocateCardData implements Parcelable {
    public static final Parcelable.Creator<AdvocateCardData> CREATOR = new C5637a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("eNo")
    private final String number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mi")
    private final String memberInstitution;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rd")
    private final Date releaseDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("eD")
    private final Date expiredData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pk")
    private final String permissionType;

    /* JADX INFO: renamed from: wh2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C5637a implements Parcelable.Creator<AdvocateCardData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AdvocateCardData createFromParcel(Parcel parcel) {
            return new AdvocateCardData(parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AdvocateCardData[] newArray(int i15) {
            return new AdvocateCardData[i15];
        }
    }

    public AdvocateCardData(String str, String str2, Date date, Date date2, String str3) {
        this.number = str;
        this.memberInstitution = str2;
        this.releaseDate = date;
        this.expiredData = date2;
        this.permissionType = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Date getExpiredData() {
        return this.expiredData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMemberInstitution() {
        return this.memberInstitution;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPermissionType() {
        return this.permissionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Date getReleaseDate() {
        return this.releaseDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvocateCardData)) {
            return false;
        }
        AdvocateCardData advocateCardData = (AdvocateCardData) other;
        return t.c(this.number, advocateCardData.number) && t.c(this.memberInstitution, advocateCardData.memberInstitution) && t.c(this.releaseDate, advocateCardData.releaseDate) && t.c(this.expiredData, advocateCardData.expiredData) && t.c(this.permissionType, advocateCardData.permissionType);
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberInstitution;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.releaseDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expiredData;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str3 = this.permissionType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AdvocateCardData(number=" + this.number + ", memberInstitution=" + this.memberInstitution + ", releaseDate=" + this.releaseDate + ", expiredData=" + this.expiredData + ", permissionType=" + this.permissionType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.number);
        dest.writeString(this.memberInstitution);
        dest.writeSerializable(this.releaseDate);
        dest.writeSerializable(this.expiredData);
        dest.writeString(this.permissionType);
    }
}

```
