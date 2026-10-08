package l51;

import o51.ReceiveDocumentSpecifiedAddressFields;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l51.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ll51/b;", "", "Lst3/g;", "addressFormVMS", "Lo51/a;", "fields", "Ld60/j;", "Lo51/a$b$a;", "scrollInstance", "<init>", "(Lst3/g;Lo51/a;Ld60/j;)V", "a", "(Lst3/g;Lo51/a;Ld60/j;)Ll51/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lst3/g;", "c", "()Lst3/g;", "b", "Lo51/a;", "d", "()Lo51/a;", "Ld60/j;", "e", "()Ld60/j;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final st3.g addressFormVMS;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReceiveDocumentSpecifiedAddressFields fields;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<ReceiveDocumentSpecifiedAddressFields.b.EnumC3526a> scrollInstance;

    public State(st3.g gVar, ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields, d60.j<ReceiveDocumentSpecifiedAddressFields.b.EnumC3526a> jVar) {
        this.addressFormVMS = gVar;
        this.fields = receiveDocumentSpecifiedAddressFields;
        this.scrollInstance = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, st3.g gVar, ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            gVar = state.addressFormVMS;
        }
        if ((i15 & 2) != 0) {
            receiveDocumentSpecifiedAddressFields = state.fields;
        }
        if ((i15 & 4) != 0) {
            jVar = state.scrollInstance;
        }
        return state.a(gVar, receiveDocumentSpecifiedAddressFields, jVar);
    }

    public final State a(st3.g addressFormVMS, ReceiveDocumentSpecifiedAddressFields fields, d60.j<ReceiveDocumentSpecifiedAddressFields.b.EnumC3526a> scrollInstance) {
        return new State(addressFormVMS, fields, scrollInstance);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final st3.g getAddressFormVMS() {
        return this.addressFormVMS;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ReceiveDocumentSpecifiedAddressFields getFields() {
        return this.fields;
    }

    public final d60.j<ReceiveDocumentSpecifiedAddressFields.b.EnumC3526a> e() {
        return this.scrollInstance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.addressFormVMS, state.addressFormVMS) && fr.t.c(this.fields, state.fields) && fr.t.c(this.scrollInstance, state.scrollInstance);
    }

    public int hashCode() {
        int iHashCode = ((this.addressFormVMS.hashCode() * 31) + this.fields.hashCode()) * 31;
        d60.j<ReceiveDocumentSpecifiedAddressFields.b.EnumC3526a> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(addressFormVMS=" + this.addressFormVMS + ", fields=" + this.fields + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public /* synthetic */ State(st3.g gVar, ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields, d60.j jVar, int i15, fr.k kVar) {
        this(gVar, receiveDocumentSpecifiedAddressFields, (i15 & 4) != 0 ? null : jVar);
    }
}
