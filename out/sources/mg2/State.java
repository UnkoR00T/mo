package mg2;

import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import tq0.LandRegisterDocument;
import tq0.LandRegisterDocumentTypesFee;
import tq0.LandRegisterSubDocument;
import tq0.MyRegistry;

/* JADX INFO: renamed from: mg2.m, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lmg2/m;", "", "Ltq0/r;", "documentTypes", "Ltq0/p;", "selectedDocument", "Ltq0/u;", "myRegistry", "", "Ltq0/s;", "extractDocuments", "<init>", "(Ltq0/r;Ltq0/p;Ltq0/u;Ljava/util/Set;)V", "a", "(Ltq0/r;Ltq0/p;Ltq0/u;Ljava/util/Set;)Lmg2/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltq0/r;", "c", "()Ltq0/r;", "b", "Ltq0/p;", "f", "()Ltq0/p;", "Ltq0/u;", "e", "()Ltq0/u;", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LandRegisterDocumentTypesFee documentTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LandRegisterDocument selectedDocument;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MyRegistry myRegistry;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<LandRegisterSubDocument> extractDocuments;

    public State() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, LandRegisterDocumentTypesFee landRegisterDocumentTypesFee, LandRegisterDocument landRegisterDocument, MyRegistry myRegistry, Set set, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            landRegisterDocumentTypesFee = state.documentTypes;
        }
        if ((i15 & 2) != 0) {
            landRegisterDocument = state.selectedDocument;
        }
        if ((i15 & 4) != 0) {
            myRegistry = state.myRegistry;
        }
        if ((i15 & 8) != 0) {
            set = state.extractDocuments;
        }
        return state.a(landRegisterDocumentTypesFee, landRegisterDocument, myRegistry, set);
    }

    public final State a(LandRegisterDocumentTypesFee documentTypes, LandRegisterDocument selectedDocument, MyRegistry myRegistry, Set<LandRegisterSubDocument> extractDocuments) {
        return new State(documentTypes, selectedDocument, myRegistry, extractDocuments);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LandRegisterDocumentTypesFee getDocumentTypes() {
        return this.documentTypes;
    }

    public final Set<LandRegisterSubDocument> d() {
        return this.extractDocuments;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final MyRegistry getMyRegistry() {
        return this.myRegistry;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.documentTypes, state.documentTypes) && fr.t.c(this.selectedDocument, state.selectedDocument) && fr.t.c(this.myRegistry, state.myRegistry) && fr.t.c(this.extractDocuments, state.extractDocuments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LandRegisterDocument getSelectedDocument() {
        return this.selectedDocument;
    }

    public int hashCode() {
        LandRegisterDocumentTypesFee landRegisterDocumentTypesFee = this.documentTypes;
        int iHashCode = (landRegisterDocumentTypesFee == null ? 0 : landRegisterDocumentTypesFee.hashCode()) * 31;
        LandRegisterDocument landRegisterDocument = this.selectedDocument;
        int iHashCode2 = (iHashCode + (landRegisterDocument == null ? 0 : landRegisterDocument.hashCode())) * 31;
        MyRegistry myRegistry = this.myRegistry;
        return ((iHashCode2 + (myRegistry != null ? myRegistry.hashCode() : 0)) * 31) + this.extractDocuments.hashCode();
    }

    public String toString() {
        return "State(documentTypes=" + this.documentTypes + ", selectedDocument=" + this.selectedDocument + ", myRegistry=" + this.myRegistry + ", extractDocuments=" + this.extractDocuments + ')';
    }

    public State(LandRegisterDocumentTypesFee landRegisterDocumentTypesFee, LandRegisterDocument landRegisterDocument, MyRegistry myRegistry, Set<LandRegisterSubDocument> set) {
        this.documentTypes = landRegisterDocumentTypesFee;
        this.selectedDocument = landRegisterDocument;
        this.myRegistry = myRegistry;
        this.extractDocuments = set;
    }

    public /* synthetic */ State(LandRegisterDocumentTypesFee landRegisterDocumentTypesFee, LandRegisterDocument landRegisterDocument, MyRegistry myRegistry, Set set, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : landRegisterDocumentTypesFee, (i15 & 2) != 0 ? null : landRegisterDocument, (i15 & 4) != 0 ? null : myRegistry, (i15 & 8) != 0 ? e1.e() : set);
    }
}
