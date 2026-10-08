# Paczka 230 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `xi2/VerificationHistory.java`, `yh/a.java`, `yh/a0.java`

## xi2/VerificationHistory.java

```java
package xi2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xi2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001CBI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010(\u001a\u0004\b\"\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u00105R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u00105R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u00102\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u00105R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010-\u001a\u0004\bC\u0010.\"\u0004\bD\u00100¨\u0006F"}, d2 = {"Lxi2/b;", "Landroid/os/Parcelable;", "Lvh2/c;", "", "timestamp", "Lth2/a;", "serviceType", "", "isAccepted", "", "workCertId", "verifierId", "purpose", "Lxi2/c;", "type", "connectionError", "<init>", "(JLth2/a;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxi2/c;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "()J", "setTimestamp", "(J)V", "Lth2/a;", "()Lth2/a;", "setServiceType", "(Lth2/a;)V", "d", "Z", "()Z", "setAccepted", "(Z)V", "e", "Ljava/lang/String;", "getWorkCertId", "setWorkCertId", "(Ljava/lang/String;)V", "f", "getVerifierId", "setVerifierId", "g", "getPurpose", "setPurpose", "h", "Lxi2/c;", "getType", "()Lxi2/c;", "setType", "(Lxi2/c;)V", "j", "a", "setConnectionError", "k", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationHistory extends vh2.c implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("timestamp")
    private long timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("serviceType")
    private th2.a serviceType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isAccepted")
    private boolean isAccepted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("workCertId")
    private String workCertId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verifierId")
    private String verifierId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("purpose")
    private String purpose;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private c type;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("connectionError")
    private boolean connectionError;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f219076l = 8;
    public static final Parcelable.Creator<VerificationHistory> CREATOR = new C5852b();

    /* JADX INFO: renamed from: xi2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C5852b implements Parcelable.Creator<VerificationHistory> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VerificationHistory createFromParcel(Parcel parcel) {
            boolean z15;
            boolean z16;
            long j15 = parcel.readLong();
            th2.a aVarValueOf = th2.a.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z16 = false;
                z15 = true;
            } else {
                z15 = false;
                z16 = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z17 = z16;
            String string3 = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z17 = true;
            }
            return new VerificationHistory(j15, aVarValueOf, z15, string, string2, string3, cVarValueOf, z17);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VerificationHistory[] newArray(int i15) {
            return new VerificationHistory[i15];
        }
    }

    public VerificationHistory(long j15, th2.a aVar, boolean z15, String str, String str2, String str3, c cVar, boolean z16) {
        super(j15);
        this.timestamp = j15;
        this.serviceType = aVar;
        this.isAccepted = z15;
        this.workCertId = str;
        this.verifierId = str2;
        this.purpose = str3;
        this.type = cVar;
        this.connectionError = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getConnectionError() {
        return this.connectionError;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final th2.a getServiceType() {
        return this.serviceType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    @Override // vh2.c, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationHistory)) {
            return false;
        }
        VerificationHistory verificationHistory = (VerificationHistory) other;
        return this.timestamp == verificationHistory.timestamp && this.serviceType == verificationHistory.serviceType && this.isAccepted == verificationHistory.isAccepted && t.c(this.workCertId, verificationHistory.workCertId) && t.c(this.verifierId, verificationHistory.verifierId) && t.c(this.purpose, verificationHistory.purpose) && this.type == verificationHistory.type && this.connectionError == verificationHistory.connectionError;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.timestamp) * 31) + this.serviceType.hashCode()) * 31) + Boolean.hashCode(this.isAccepted)) * 31) + this.workCertId.hashCode()) * 31) + this.verifierId.hashCode()) * 31) + this.purpose.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.connectionError);
    }

    public String toString() {
        return "VerificationHistory(timestamp=" + this.timestamp + ", serviceType=" + this.serviceType + ", isAccepted=" + this.isAccepted + ", workCertId=" + this.workCertId + ", verifierId=" + this.verifierId + ", purpose=" + this.purpose + ", type=" + this.type + ", connectionError=" + this.connectionError + ')';
    }

    @Override // vh2.c, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.timestamp);
        dest.writeString(this.serviceType.name());
        dest.writeInt(this.isAccepted ? 1 : 0);
        dest.writeString(this.workCertId);
        dest.writeString(this.verifierId);
        dest.writeString(this.purpose);
        dest.writeString(this.type.name());
        dest.writeInt(this.connectionError ? 1 : 0);
    }
}

```

## yh/a.java

```java
package yh;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class a {
    static {
        TimeUnit.MINUTES.toMillis(10L);
        SystemClock.elapsedRealtime();
    }

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(Status status, Object obj, vh.m mVar) {
        if (status.C()) {
            mVar.c(obj);
        } else {
            mVar.b(jg.b.a(status));
        }
    }
}

```

## yh/a0.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        String strH = null;
        String strH2 = null;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN == 4) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                iV2 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new o(strH, strH2, iV, iV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new o[i15];
    }
}

```
