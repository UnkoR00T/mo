package je2;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: je2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lje2/b;", "", "Lxw/h;", "phoneNumber", "Lhz/b;", "prefixValidationState", "phoneNumberValidationState", "", "rdkLoadedBoolean", "<init>", "(Lxw/h;Lhz/b;Lhz/b;Z)V", "a", "(Lxw/h;Lhz/b;Lhz/b;Z)Lje2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lxw/h;", "c", "()Lxw/h;", "b", "Lhz/b;", "e", "()Lhz/b;", "d", "Z", "f", "()Z", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitializedStateData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102199e = hz.b.f86845b | PhoneNumber.f221634d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b prefixValidationState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b phoneNumberValidationState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rdkLoadedBoolean;

    public InitializedStateData(PhoneNumber phoneNumber, hz.b bVar, hz.b bVar2, boolean z15) {
        this.phoneNumber = phoneNumber;
        this.prefixValidationState = bVar;
        this.phoneNumberValidationState = bVar2;
        this.rdkLoadedBoolean = z15;
    }

    public static /* synthetic */ InitializedStateData b(InitializedStateData initializedStateData, PhoneNumber phoneNumber, hz.b bVar, hz.b bVar2, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            phoneNumber = initializedStateData.phoneNumber;
        }
        if ((i15 & 2) != 0) {
            bVar = initializedStateData.prefixValidationState;
        }
        if ((i15 & 4) != 0) {
            bVar2 = initializedStateData.phoneNumberValidationState;
        }
        if ((i15 & 8) != 0) {
            z15 = initializedStateData.rdkLoadedBoolean;
        }
        return initializedStateData.a(phoneNumber, bVar, bVar2, z15);
    }

    public final InitializedStateData a(PhoneNumber phoneNumber, hz.b prefixValidationState, hz.b phoneNumberValidationState, boolean rdkLoadedBoolean) {
        return new InitializedStateData(phoneNumber, prefixValidationState, phoneNumberValidationState, rdkLoadedBoolean);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getPhoneNumberValidationState() {
        return this.phoneNumberValidationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hz.b getPrefixValidationState() {
        return this.prefixValidationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializedStateData)) {
            return false;
        }
        InitializedStateData initializedStateData = (InitializedStateData) other;
        return fr.t.c(this.phoneNumber, initializedStateData.phoneNumber) && fr.t.c(this.prefixValidationState, initializedStateData.prefixValidationState) && fr.t.c(this.phoneNumberValidationState, initializedStateData.phoneNumberValidationState) && this.rdkLoadedBoolean == initializedStateData.rdkLoadedBoolean;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRdkLoadedBoolean() {
        return this.rdkLoadedBoolean;
    }

    public int hashCode() {
        return (((((this.phoneNumber.hashCode() * 31) + this.prefixValidationState.hashCode()) * 31) + this.phoneNumberValidationState.hashCode()) * 31) + Boolean.hashCode(this.rdkLoadedBoolean);
    }

    public String toString() {
        return "InitializedStateData(phoneNumber=" + this.phoneNumber + ", prefixValidationState=" + this.prefixValidationState + ", phoneNumberValidationState=" + this.phoneNumberValidationState + ", rdkLoadedBoolean=" + this.rdkLoadedBoolean + ')';
    }

    public /* synthetic */ InitializedStateData(PhoneNumber phoneNumber, hz.b bVar, hz.b bVar2, boolean z15, int i15, fr.k kVar) {
        this(phoneNumber, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 8) != 0 ? false : z15);
    }
}
