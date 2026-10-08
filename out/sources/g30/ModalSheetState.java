package g30;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g30.u, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lg30/u;", "", "Lg30/v;", "value", "", "skipHalfExpanded", "Lkotlin/Function1;", "Loq/i0;", "onValueChange", "<init>", "(Lg30/v;ZLer/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lg30/v;", "c", "()Lg30/v;", "b", "Z", "()Z", "Ler/l;", "()Ler/l;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ModalSheetState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final v value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean skipHalfExpanded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<v, i0> onValueChange;

    /* JADX WARN: Multi-variable type inference failed */
    public ModalSheetState(v vVar, boolean z15, er.l<? super v, i0> lVar) {
        this.value = vVar;
        this.skipHalfExpanded = z15;
        this.onValueChange = lVar;
    }

    public final er.l<v, i0> a() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSkipHalfExpanded() {
        return this.skipHalfExpanded;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalSheetState)) {
            return false;
        }
        ModalSheetState modalSheetState = (ModalSheetState) other;
        return this.value == modalSheetState.value && this.skipHalfExpanded == modalSheetState.skipHalfExpanded && fr.t.c(this.onValueChange, modalSheetState.onValueChange);
    }

    public int hashCode() {
        return (((this.value.hashCode() * 31) + Boolean.hashCode(this.skipHalfExpanded)) * 31) + this.onValueChange.hashCode();
    }

    public String toString() {
        return "ModalSheetState(value=" + this.value + ", skipHalfExpanded=" + this.skipHalfExpanded + ", onValueChange=" + this.onValueChange + ')';
    }

    public /* synthetic */ ModalSheetState(v vVar, boolean z15, er.l lVar, int i15, fr.k kVar) {
        this(vVar, (i15 & 2) != 0 ? true : z15, lVar);
    }
}
