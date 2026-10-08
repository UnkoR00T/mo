package p51;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: p51.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lp51/b;", "", "Lst3/g;", "addressFormVMS", "Lbl0/s;", "typeAddressChild", "", "areMultipleChildren", "Lp51/d;", "fields", "Ld60/j;", "Lp51/d$b$a;", "scrollInstance", "<init>", "(Lst3/g;Lbl0/s;ZLp51/d;Ld60/j;)V", "a", "(Lst3/g;Lbl0/s;ZLp51/d;Ld60/j;)Lp51/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lst3/g;", "c", "()Lst3/g;", "b", "Lbl0/s;", "g", "()Lbl0/s;", "Z", "d", "()Z", "Lp51/d;", "e", "()Lp51/d;", "Ld60/j;", "f", "()Ld60/j;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final st3.g addressFormVMS;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final bl0.s typeAddressChild;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean areMultipleChildren;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final RegisteredAddressFields fields;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<RegisteredAddressFields.b.a> scrollInstance;

    public State(st3.g gVar, bl0.s sVar, boolean z15, RegisteredAddressFields registeredAddressFields, d60.j<RegisteredAddressFields.b.a> jVar) {
        this.addressFormVMS = gVar;
        this.typeAddressChild = sVar;
        this.areMultipleChildren = z15;
        this.fields = registeredAddressFields;
        this.scrollInstance = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, st3.g gVar, bl0.s sVar, boolean z15, RegisteredAddressFields registeredAddressFields, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            gVar = state.addressFormVMS;
        }
        if ((i15 & 2) != 0) {
            sVar = state.typeAddressChild;
        }
        if ((i15 & 4) != 0) {
            z15 = state.areMultipleChildren;
        }
        if ((i15 & 8) != 0) {
            registeredAddressFields = state.fields;
        }
        if ((i15 & 16) != 0) {
            jVar = state.scrollInstance;
        }
        d60.j jVar2 = jVar;
        boolean z16 = z15;
        return state.a(gVar, sVar, z16, registeredAddressFields, jVar2);
    }

    public final State a(st3.g addressFormVMS, bl0.s typeAddressChild, boolean areMultipleChildren, RegisteredAddressFields fields, d60.j<RegisteredAddressFields.b.a> scrollInstance) {
        return new State(addressFormVMS, typeAddressChild, areMultipleChildren, fields, scrollInstance);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final st3.g getAddressFormVMS() {
        return this.addressFormVMS;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAreMultipleChildren() {
        return this.areMultipleChildren;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final RegisteredAddressFields getFields() {
        return this.fields;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.addressFormVMS, state.addressFormVMS) && this.typeAddressChild == state.typeAddressChild && this.areMultipleChildren == state.areMultipleChildren && fr.t.c(this.fields, state.fields) && fr.t.c(this.scrollInstance, state.scrollInstance);
    }

    public final d60.j<RegisteredAddressFields.b.a> f() {
        return this.scrollInstance;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final bl0.s getTypeAddressChild() {
        return this.typeAddressChild;
    }

    public int hashCode() {
        int iHashCode = ((((((this.addressFormVMS.hashCode() * 31) + this.typeAddressChild.hashCode()) * 31) + Boolean.hashCode(this.areMultipleChildren)) * 31) + this.fields.hashCode()) * 31;
        d60.j<RegisteredAddressFields.b.a> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(addressFormVMS=" + this.addressFormVMS + ", typeAddressChild=" + this.typeAddressChild + ", areMultipleChildren=" + this.areMultipleChildren + ", fields=" + this.fields + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public /* synthetic */ State(st3.g gVar, bl0.s sVar, boolean z15, RegisteredAddressFields registeredAddressFields, d60.j jVar, int i15, fr.k kVar) {
        this(gVar, sVar, z15, registeredAddressFields, (i15 & 16) != 0 ? null : jVar);
    }
}
