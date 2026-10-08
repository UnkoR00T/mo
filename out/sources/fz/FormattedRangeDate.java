package fz;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fz.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lfz/d;", "", "", "start", "end", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "separator", "a", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormattedRangeDate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String end;

    public FormattedRangeDate(String str, String str2) {
        this.start = str;
        this.end = str2;
    }

    public static /* synthetic */ String b(FormattedRangeDate formattedRangeDate, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = "–";
        }
        return formattedRangeDate.a(str);
    }

    public final String a(String separator) {
        return this.start + separator + this.end;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedRangeDate)) {
            return false;
        }
        FormattedRangeDate formattedRangeDate = (FormattedRangeDate) other;
        return t.c(this.start, formattedRangeDate.start) && t.c(this.end, formattedRangeDate.end);
    }

    public int hashCode() {
        return (this.start.hashCode() * 31) + this.end.hashCode();
    }

    public String toString() {
        return "FormattedRangeDate(start=" + this.start + ", end=" + this.end + ")";
    }
}
