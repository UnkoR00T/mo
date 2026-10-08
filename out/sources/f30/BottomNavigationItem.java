package f30;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f30.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001c\u0010\u0011R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"Lf30/b;", "", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "", "unselectedIconResId", "selectedIconResId", "Lkotlin/Function0;", "Loq/i0;", "onClickAction", "<init>", "(Ljava/lang/String;Lmx/a;IILer/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lmx/a;", "()Lmx/a;", "c", "I", "e", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BottomNavigationItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int unselectedIconResId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int selectedIconResId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClickAction;

    public BottomNavigationItem(String str, Label label, int i15, int i16, er.a<i0> aVar) {
        this.testTag = str;
        this.label = label;
        this.unselectedIconResId = i15;
        this.selectedIconResId = i16;
        this.onClickAction = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public final er.a<i0> b() {
        return this.onClickAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSelectedIconResId() {
        return this.selectedIconResId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getUnselectedIconResId() {
        return this.unselectedIconResId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomNavigationItem)) {
            return false;
        }
        BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) other;
        return t.c(this.testTag, bottomNavigationItem.testTag) && t.c(this.label, bottomNavigationItem.label) && this.unselectedIconResId == bottomNavigationItem.unselectedIconResId && this.selectedIconResId == bottomNavigationItem.selectedIconResId && t.c(this.onClickAction, bottomNavigationItem.onClickAction);
    }

    public int hashCode() {
        String str = this.testTag;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.unselectedIconResId)) * 31) + Integer.hashCode(this.selectedIconResId)) * 31) + this.onClickAction.hashCode();
    }

    public String toString() {
        return "BottomNavigationItem(testTag=" + this.testTag + ", label=" + this.label + ", unselectedIconResId=" + this.unselectedIconResId + ", selectedIconResId=" + this.selectedIconResId + ", onClickAction=" + this.onClickAction + ')';
    }

    public /* synthetic */ BottomNavigationItem(String str, Label label, int i15, int i16, er.a aVar, int i17, k kVar) {
        this((i17 & 1) != 0 ? null : str, label, i15, i16, aVar);
    }
}
