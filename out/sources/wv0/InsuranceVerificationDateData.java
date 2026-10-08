package wv0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wv0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lwv0/b;", "", "Lwv0/b$a;", "type", "", "name", "value", "additionalValue", "<init>", "(Lwv0/b$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwv0/b$a;", "getType", "()Lwv0/b$a;", "b", "Ljava/lang/String;", "getName", "c", "d", "getAdditionalValue", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceVerificationDateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String additionalValue;

    /* JADX INFO: renamed from: wv0.b$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lwv0/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        GIVEN_INSURANCE_DATE;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ wq.a f215302c = wq.b.a(b());
    }

    public InsuranceVerificationDateData(a aVar, String str, String str2, String str3) {
        this.type = aVar;
        this.name = str;
        this.value = str2;
        this.additionalValue = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceVerificationDateData)) {
            return false;
        }
        InsuranceVerificationDateData insuranceVerificationDateData = (InsuranceVerificationDateData) other;
        return this.type == insuranceVerificationDateData.type && t.c(this.name, insuranceVerificationDateData.name) && t.c(this.value, insuranceVerificationDateData.value) && t.c(this.additionalValue, insuranceVerificationDateData.additionalValue);
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + this.value.hashCode()) * 31;
        String str = this.additionalValue;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InsuranceVerificationDateData(type=" + this.type + ", name=" + this.name + ", value=" + this.value + ", additionalValue=" + this.additionalValue + ")";
    }
}
