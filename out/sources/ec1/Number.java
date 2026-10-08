package ec1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ec1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lec1/e;", "", "Lec1/d0;", "type", "Lv50/c$b;", "inputData", "<init>", "(Lec1/d0;Lv50/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lec1/d0;", "getType", "()Lec1/d0;", "b", "Lv50/c$b;", "()Lv50/c$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Number {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f49352c = v50.c.Number.P;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d0 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final v50.c.Number inputData;

    public Number(d0 d0Var, v50.c.Number number) {
        this.type = d0Var;
        this.inputData = number;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v50.c.Number getInputData() {
        return this.inputData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Number)) {
            return false;
        }
        Number number = (Number) other;
        return this.type == number.type && fr.t.c(this.inputData, number.inputData);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.inputData.hashCode();
    }

    public String toString() {
        return "Number(type=" + this.type + ", inputData=" + this.inputData + ')';
    }
}
