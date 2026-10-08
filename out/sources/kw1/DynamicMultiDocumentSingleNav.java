package kw1;

import fr.t;
import iy.b0;
import mv1.DynamicDocumentData;
import p071kotlin.Metadata;
import rq0.b;

/* JADX INFO: renamed from: kw1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkw1/a;", "", "Lmv1/c;", "multiDocumentData", "Lrq0/b$c;", "dynamicDocumentType", "Liy/b0;", "mainDocumentPhoto", "mainDocumentPesel", "<init>", "(Lmv1/c;Lrq0/b$c;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmv1/c;", "d", "()Lmv1/c;", "b", "Lrq0/b$c;", "()Lrq0/b$c;", "c", "Liy/b0;", "()Liy/b0;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicMultiDocumentSingleNav {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DynamicDocumentData multiDocumentData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b.c dynamicDocumentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 mainDocumentPhoto;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 mainDocumentPesel;

    public DynamicMultiDocumentSingleNav(DynamicDocumentData dynamicDocumentData, b.c cVar, b0 b0Var, b0 b0Var2) {
        this.multiDocumentData = dynamicDocumentData;
        this.dynamicDocumentType = cVar;
        this.mainDocumentPhoto = b0Var;
        this.mainDocumentPesel = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b.c getDynamicDocumentType() {
        return this.dynamicDocumentType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getMainDocumentPesel() {
        return this.mainDocumentPesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getMainDocumentPhoto() {
        return this.mainDocumentPhoto;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DynamicDocumentData getMultiDocumentData() {
        return this.multiDocumentData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicMultiDocumentSingleNav)) {
            return false;
        }
        DynamicMultiDocumentSingleNav dynamicMultiDocumentSingleNav = (DynamicMultiDocumentSingleNav) other;
        return t.c(this.multiDocumentData, dynamicMultiDocumentSingleNav.multiDocumentData) && this.dynamicDocumentType == dynamicMultiDocumentSingleNav.dynamicDocumentType && t.c(this.mainDocumentPhoto, dynamicMultiDocumentSingleNav.mainDocumentPhoto) && t.c(this.mainDocumentPesel, dynamicMultiDocumentSingleNav.mainDocumentPesel);
    }

    public int hashCode() {
        int iHashCode = ((this.multiDocumentData.hashCode() * 31) + this.dynamicDocumentType.hashCode()) * 31;
        b0 b0Var = this.mainDocumentPhoto;
        return ((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.mainDocumentPesel.hashCode();
    }

    public String toString() {
        return "DynamicMultiDocumentSingleNav(multiDocumentData=" + this.multiDocumentData + ", dynamicDocumentType=" + this.dynamicDocumentType + ", mainDocumentPhoto=" + this.mainDocumentPhoto + ", mainDocumentPesel=" + this.mainDocumentPesel + ')';
    }
}
