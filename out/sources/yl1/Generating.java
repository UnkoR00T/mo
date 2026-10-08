package yl1;

import nk1.SummaryModel;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yl1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lyl1/f;", "Lyl1/d;", "Lkk1/a;", "type", "Lnk1/a;", "model", "Lyl1/d$c;", "statementData", "<init>", "(Lkk1/a;Lnk1/a;Lyl1/d$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "getType", "()Lkk1/a;", "b", "Lnk1/a;", "c", "()Lnk1/a;", "Lyl1/d$c;", "()Lyl1/d$c;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Generating implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final kk1.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SummaryModel model;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.StatementData statementData;

    public Generating(kk1.a aVar, SummaryModel summaryModel, d.StatementData statementData) {
        this.type = aVar;
        this.model = summaryModel;
        this.statementData = statementData;
    }

    @Override // yl1.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public d.StatementData getStatementData() {
        return this.statementData;
    }

    @Override // yl1.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public SummaryModel getModel() {
        return this.model;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Generating)) {
            return false;
        }
        Generating generating = (Generating) other;
        return this.type == generating.type && fr.t.c(this.model, generating.model) && fr.t.c(this.statementData, generating.statementData);
    }

    @Override // yl1.d
    public kk1.a getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.model.hashCode()) * 31) + this.statementData.hashCode();
    }

    public String toString() {
        return "Generating(type=" + this.type + ", model=" + this.model + ", statementData=" + this.statementData + ')';
    }
}
