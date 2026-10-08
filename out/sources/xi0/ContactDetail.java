package xi0;

import fr.t;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xi0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, d2 = {"Lxi0/a;", "", "Liy/b0;", "value", "Lxi0/d;", "type", "Lxi0/c;", "status", "", "Lxi0/b;", "additionalValues", "<init>", "(Liy/b0;Lxi0/d;Lxi0/c;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "d", "()Liy/b0;", "b", "Lxi0/d;", "c", "()Lxi0/d;", "Lxi0/c;", "()Lxi0/c;", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ContactDetailAdditionalValue> additionalValues;

    public ContactDetail(b0 b0Var, d dVar, c cVar, List<ContactDetailAdditionalValue> list) {
        this.value = b0Var;
        this.type = dVar;
        this.status = cVar;
        this.additionalValues = list;
    }

    public final List<ContactDetailAdditionalValue> a() {
        return this.additionalValues;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDetail)) {
            return false;
        }
        ContactDetail contactDetail = (ContactDetail) other;
        return t.c(this.value, contactDetail.value) && this.type == contactDetail.type && this.status == contactDetail.status && t.c(this.additionalValues, contactDetail.additionalValues);
    }

    public int hashCode() {
        b0 b0Var = this.value;
        return ((((((b0Var == null ? 0 : b0Var.hashCode()) * 31) + this.type.hashCode()) * 31) + this.status.hashCode()) * 31) + this.additionalValues.hashCode();
    }

    public String toString() {
        return "ContactDetail(value=" + this.value + ", type=" + this.type + ", status=" + this.status + ", additionalValues=" + this.additionalValues + ")";
    }
}
