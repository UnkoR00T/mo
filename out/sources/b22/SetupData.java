package b22;

import eo0.SearchRequest;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b22.l, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb22/l;", "", "Lm22/h;", "messageWizardContract", "Leo0/w0;", "searchRequest", "<init>", "(Lm22/h;Leo0/w0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm22/h;", "()Lm22/h;", "b", "Leo0/w0;", "()Leo0/w0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m22.h messageWizardContract;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SearchRequest searchRequest;

    public SetupData(m22.h hVar, SearchRequest searchRequest) {
        this.messageWizardContract = hVar;
        this.searchRequest = searchRequest;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m22.h getMessageWizardContract() {
        return this.messageWizardContract;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SearchRequest getSearchRequest() {
        return this.searchRequest;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.messageWizardContract, setupData.messageWizardContract) && fr.t.c(this.searchRequest, setupData.searchRequest);
    }

    public int hashCode() {
        int iHashCode = this.messageWizardContract.hashCode() * 31;
        SearchRequest searchRequest = this.searchRequest;
        return iHashCode + (searchRequest == null ? 0 : searchRequest.hashCode());
    }

    public String toString() {
        return "SetupData(messageWizardContract=" + this.messageWizardContract + ", searchRequest=" + this.searchRequest + ')';
    }
}
