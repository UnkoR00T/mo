package ec1;

import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: renamed from: ec1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lec1/d;", "", "Lec1/d0;", "type", "Lv40/a;", "launchDateInputData", "<init>", "(Lec1/d0;Lv40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lec1/d0;", "getType", "()Lec1/d0;", "b", "Lv40/a;", "()Lv40/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Date {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f49343c = InputDateTimeData.f203769m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d0 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputDateTimeData launchDateInputData;

    public Date(d0 d0Var, InputDateTimeData inputDateTimeData) {
        this.type = d0Var;
        this.launchDateInputData = inputDateTimeData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InputDateTimeData getLaunchDateInputData() {
        return this.launchDateInputData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Date)) {
            return false;
        }
        Date date = (Date) other;
        return this.type == date.type && fr.t.c(this.launchDateInputData, date.launchDateInputData);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.launchDateInputData.hashCode();
    }

    public String toString() {
        return "Date(type=" + this.type + ", launchDateInputData=" + this.launchDateInputData + ')';
    }
}
