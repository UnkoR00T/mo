package zi0;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zi0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0017"}, d2 = {"Lzi0/g;", "", "", "unit", "", "value", "<init>", "(Ljava/lang/String;I)V", "Lmx/a;", "b", "()Lmx/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUnit", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternetSpeed {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int value;

    public InternetSpeed(String str, int i15) {
        this.unit = str;
        this.value = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final Label b() {
        return mx.b.b(this.value + " " + this.unit, this.value + this.unit + "TestTag");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetSpeed)) {
            return false;
        }
        InternetSpeed internetSpeed = (InternetSpeed) other;
        return t.c(this.unit, internetSpeed.unit) && this.value == internetSpeed.value;
    }

    public int hashCode() {
        return (this.unit.hashCode() * 31) + Integer.hashCode(this.value);
    }

    public String toString() {
        return "InternetSpeed(unit=" + this.unit + ", value=" + this.value + ")";
    }
}
