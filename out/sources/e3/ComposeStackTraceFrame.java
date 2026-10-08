package e3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: e3.d, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Le3/d;", "", "", "groupKey", "Le3/a0;", "sourceInfo", "groupOffset", "<init>", "(ILe3/a0;Ljava/lang/Integer;)V", "a", "(ILe3/a0;Ljava/lang/Integer;)Le3/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "Le3/a0;", "e", "()Le3/a0;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComposeStackTraceFrame {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int groupKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 sourceInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer groupOffset;

    public ComposeStackTraceFrame(int i15, a0 a0Var, Integer num) {
        this.groupKey = i15;
        this.sourceInfo = a0Var;
        this.groupOffset = num;
    }

    public static /* synthetic */ ComposeStackTraceFrame b(ComposeStackTraceFrame composeStackTraceFrame, int i15, a0 a0Var, Integer num, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = composeStackTraceFrame.groupKey;
        }
        if ((i16 & 2) != 0) {
            a0Var = composeStackTraceFrame.sourceInfo;
        }
        if ((i16 & 4) != 0) {
            num = composeStackTraceFrame.groupOffset;
        }
        return composeStackTraceFrame.a(i15, a0Var, num);
    }

    public final ComposeStackTraceFrame a(int groupKey, a0 sourceInfo, Integer groupOffset) {
        return new ComposeStackTraceFrame(groupKey, sourceInfo, groupOffset);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getGroupKey() {
        return this.groupKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getGroupOffset() {
        return this.groupOffset;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a0 getSourceInfo() {
        return this.sourceInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) other;
        return this.groupKey == composeStackTraceFrame.groupKey && fr.t.c(this.sourceInfo, composeStackTraceFrame.sourceInfo) && fr.t.c(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.groupKey) * 31;
        a0 a0Var = this.sourceInfo;
        int iHashCode2 = (iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        Integer num = this.groupOffset;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.groupKey + ", sourceInfo=" + this.sourceInfo + ", groupOffset=" + this.groupOffset + ')';
    }
}
