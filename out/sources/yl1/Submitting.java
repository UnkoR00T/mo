package yl1;

import al0.BEGenerateXmlResponse;
import nk1.SummaryModel;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yl1.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lyl1/h;", "Lyl1/d;", "Lkk1/a;", "type", "Lnk1/a;", "model", "Lyl1/d$c;", "statementData", "Lal0/m;", "response", "<init>", "(Lkk1/a;Lnk1/a;Lyl1/d$c;Lal0/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "getType", "()Lkk1/a;", "b", "Lnk1/a;", "c", "()Lnk1/a;", "Lyl1/d$c;", "()Lyl1/d$c;", "d", "Lal0/m;", "()Lal0/m;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Submitting implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final kk1.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SummaryModel model;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.StatementData statementData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEGenerateXmlResponse response;

    public Submitting(kk1.a aVar, SummaryModel summaryModel, d.StatementData statementData, BEGenerateXmlResponse bEGenerateXmlResponse) {
        this.type = aVar;
        this.model = summaryModel;
        this.statementData = statementData;
        this.response = bEGenerateXmlResponse;
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

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEGenerateXmlResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Submitting)) {
            return false;
        }
        Submitting submitting = (Submitting) other;
        return this.type == submitting.type && fr.t.c(this.model, submitting.model) && fr.t.c(this.statementData, submitting.statementData) && fr.t.c(this.response, submitting.response);
    }

    @Override // yl1.d
    public kk1.a getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.model.hashCode()) * 31) + this.statementData.hashCode()) * 31) + this.response.hashCode();
    }

    public String toString() {
        return "Submitting(type=" + this.type + ", model=" + this.model + ", statementData=" + this.statementData + ", response=" + this.response + ')';
    }
}
