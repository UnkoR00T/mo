package yf0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yf0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Lyf0/o;", "", "Lyf0/o$a;", "onMissing", "Lyf0/n;", "dataType", "", "defaultValue", "<init>", "(Lyf0/o$a;Lyf0/n;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyf0/o$a;", "c", "()Lyf0/o$a;", "b", "Lyf0/n;", "()Lyf0/n;", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MissingDocumentAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a onMissing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final n dataType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String defaultValue;

    /* JADX INFO: renamed from: yf0.o$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lyf0/o$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        HIDE,
        DEFAULT_VALUE,
        UNKNOWN;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f226757e = wq.b.a(b());
    }

    public MissingDocumentAttribute(a aVar, n nVar, String str) {
        this.onMissing = aVar;
        this.dataType = nVar;
        this.defaultValue = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getOnMissing() {
        return this.onMissing;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissingDocumentAttribute)) {
            return false;
        }
        MissingDocumentAttribute missingDocumentAttribute = (MissingDocumentAttribute) other;
        return this.onMissing == missingDocumentAttribute.onMissing && this.dataType == missingDocumentAttribute.dataType && t.c(this.defaultValue, missingDocumentAttribute.defaultValue);
    }

    public int hashCode() {
        int iHashCode = this.onMissing.hashCode() * 31;
        n nVar = this.dataType;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str = this.defaultValue;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MissingDocumentAttribute(onMissing=" + this.onMissing + ", dataType=" + this.dataType + ", defaultValue=" + this.defaultValue + ")";
    }
}
