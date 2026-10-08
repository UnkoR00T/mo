package ru3;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ru3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru3/c;", "", "Lru3/b;", "detailsData", "Lmx/a;", "topMenuTitle", "<init>", "(Lru3/b;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru3/b;", "()Lru3/b;", "b", "Lmx/a;", "()Lmx/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetailsFormData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactDetailsData detailsData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label topMenuTitle;

    public ContactDetailsFormData(ContactDetailsData contactDetailsData, Label label) {
        this.detailsData = contactDetailsData;
        this.topMenuTitle = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ContactDetailsData getDetailsData() {
        return this.detailsData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getTopMenuTitle() {
        return this.topMenuTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDetailsFormData)) {
            return false;
        }
        ContactDetailsFormData contactDetailsFormData = (ContactDetailsFormData) other;
        return t.c(this.detailsData, contactDetailsFormData.detailsData) && t.c(this.topMenuTitle, contactDetailsFormData.topMenuTitle);
    }

    public int hashCode() {
        ContactDetailsData contactDetailsData = this.detailsData;
        return ((contactDetailsData == null ? 0 : contactDetailsData.hashCode()) * 31) + this.topMenuTitle.hashCode();
    }

    public String toString() {
        return "ContactDetailsFormData(detailsData=" + this.detailsData + ", topMenuTitle=" + this.topMenuTitle + ")";
    }
}
