package bt1;

import fr.t;
import ir0.RefugeeChildPersonalInfo;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bt1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lbt1/a;", "", "Lir0/a;", "child", "Lmx/a;", AnnotatedPrivateKey.LABEL, "", "isSelected", "<init>", "(Lir0/a;Lmx/a;Z)V", "a", "(Lir0/a;Lmx/a;Z)Lbt1/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lir0/a;", "c", "()Lir0/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "Z", "e", "()Z", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefugeeChildStatementState {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21549e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final RefugeeChildPersonalInfo child;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    public RefugeeChildStatementState(RefugeeChildPersonalInfo refugeeChildPersonalInfo, Label label, boolean z15) {
        this.child = refugeeChildPersonalInfo;
        this.label = label;
        this.isSelected = z15;
    }

    public static /* synthetic */ RefugeeChildStatementState b(RefugeeChildStatementState refugeeChildStatementState, RefugeeChildPersonalInfo refugeeChildPersonalInfo, Label label, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            refugeeChildPersonalInfo = refugeeChildStatementState.child;
        }
        if ((i15 & 2) != 0) {
            label = refugeeChildStatementState.label;
        }
        if ((i15 & 4) != 0) {
            z15 = refugeeChildStatementState.isSelected;
        }
        return refugeeChildStatementState.a(refugeeChildPersonalInfo, label, z15);
    }

    public final RefugeeChildStatementState a(RefugeeChildPersonalInfo child, Label label, boolean isSelected) {
        return new RefugeeChildStatementState(child, label, isSelected);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RefugeeChildPersonalInfo getChild() {
        return this.child;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefugeeChildStatementState)) {
            return false;
        }
        RefugeeChildStatementState refugeeChildStatementState = (RefugeeChildStatementState) other;
        return t.c(this.child, refugeeChildStatementState.child) && t.c(this.label, refugeeChildStatementState.label) && this.isSelected == refugeeChildStatementState.isSelected;
    }

    public int hashCode() {
        return (((this.child.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "RefugeeChildStatementState(child=" + this.child + ", label=" + this.label + ", isSelected=" + this.isSelected + ')';
    }
}
