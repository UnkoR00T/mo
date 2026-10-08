package zt3;

import bh0.BETerytDetail;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zt3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lzt3/c;", "", "Lhz/b;", "validationState", "", "Lbh0/a;", "allItems", "Lzt3/d;", "state", "Lzt3/m1;", "fieldType", "<init>", "(Lhz/b;Ljava/util/List;Lzt3/d;Lzt3/m1;)V", "a", "(Lhz/b;Ljava/util/List;Lzt3/d;Lzt3/m1;)Lzt3/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "f", "()Lhz/b;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lzt3/d;", "e", "()Lzt3/d;", "d", "Lzt3/m1;", "()Lzt3/m1;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropDown {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BETerytDetail> allItems;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final m1 fieldType;

    public DropDown(hz.b bVar, List<BETerytDetail> list, d dVar, m1 m1Var) {
        this.validationState = bVar;
        this.allItems = list;
        this.state = dVar;
        this.fieldType = m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropDown b(DropDown dropDown, hz.b bVar, List list, d dVar, m1 m1Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = dropDown.validationState;
        }
        if ((i15 & 2) != 0) {
            list = dropDown.allItems;
        }
        if ((i15 & 4) != 0) {
            dVar = dropDown.state;
        }
        if ((i15 & 8) != 0) {
            m1Var = dropDown.fieldType;
        }
        return dropDown.a(bVar, list, dVar, m1Var);
    }

    public final DropDown a(hz.b validationState, List<BETerytDetail> allItems, d state, m1 fieldType) {
        return new DropDown(validationState, allItems, state, fieldType);
    }

    public final List<BETerytDetail> c() {
        return this.allItems;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m1 getFieldType() {
        return this.fieldType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropDown)) {
            return false;
        }
        DropDown dropDown = (DropDown) other;
        return fr.t.c(this.validationState, dropDown.validationState) && fr.t.c(this.allItems, dropDown.allItems) && fr.t.c(this.state, dropDown.state) && this.fieldType == dropDown.fieldType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public hz.b getValidationState() {
        return this.validationState;
    }

    public int hashCode() {
        return (((((this.validationState.hashCode() * 31) + this.allItems.hashCode()) * 31) + this.state.hashCode()) * 31) + this.fieldType.hashCode();
    }

    public String toString() {
        return "DropDown(validationState=" + this.validationState + ", allItems=" + this.allItems + ", state=" + this.state + ", fieldType=" + this.fieldType + ')';
    }

    public /* synthetic */ DropDown(hz.b bVar, List list, d dVar, m1 m1Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? pq.v.n() : list, (i15 & 4) != 0 ? d.a.f237437a : dVar, m1Var);
    }
}
