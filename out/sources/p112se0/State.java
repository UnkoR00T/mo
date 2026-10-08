package p112se0;

import fr.t;
import p071kotlin.Metadata;
import pe0.VerificationDocumentData;
import we0.VerificationDataModel;

/* JADX INFO: renamed from: se0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lse0/r;", "", "Lpe0/d;", "documentData", "Lwe0/i0;", "data", "<init>", "(Lpe0/d;Lwe0/i0;)V", "a", "(Lpe0/d;Lwe0/i0;)Lse0/r;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpe0/d;", "d", "()Lpe0/d;", "b", "Lwe0/i0;", "c", "()Lwe0/i0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final VerificationDocumentData documentData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VerificationDataModel data;

    public State(VerificationDocumentData verificationDocumentData, VerificationDataModel verificationDataModel) {
        this.documentData = verificationDocumentData;
        this.data = verificationDataModel;
    }

    public static /* synthetic */ State b(State state, VerificationDocumentData verificationDocumentData, VerificationDataModel verificationDataModel, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            verificationDocumentData = state.documentData;
        }
        if ((i15 & 2) != 0) {
            verificationDataModel = state.data;
        }
        return state.a(verificationDocumentData, verificationDataModel);
    }

    public final State a(VerificationDocumentData documentData, VerificationDataModel data) {
        return new State(documentData, data);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VerificationDataModel getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final VerificationDocumentData getDocumentData() {
        return this.documentData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.documentData, state.documentData) && t.c(this.data, state.data);
    }

    public int hashCode() {
        VerificationDocumentData verificationDocumentData = this.documentData;
        int iHashCode = (verificationDocumentData == null ? 0 : verificationDocumentData.hashCode()) * 31;
        VerificationDataModel verificationDataModel = this.data;
        return iHashCode + (verificationDataModel != null ? verificationDataModel.hashCode() : 0);
    }

    public String toString() {
        return "State(documentData=" + this.documentData + ", data=" + this.data + ')';
    }
}
