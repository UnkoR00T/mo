package k81;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k81.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lk81/b;", "T", "", "Lhz/b;", "validationState", "value", "<init>", "(Lhz/b;Ljava/lang/Object;)V", "a", "(Lhz/b;Ljava/lang/Object;)Lk81/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FieldItem<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f109180c = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final T value;

    public FieldItem(hz.b bVar, T t15) {
        this.validationState = bVar;
        this.value = t15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FieldItem b(FieldItem fieldItem, hz.b bVar, Object obj, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            bVar = fieldItem.validationState;
        }
        if ((i15 & 2) != 0) {
            obj = fieldItem.value;
        }
        return fieldItem.a(bVar, obj);
    }

    public final FieldItem<T> a(hz.b validationState, T value) {
        return new FieldItem<>(validationState, value);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public final T d() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldItem)) {
            return false;
        }
        FieldItem fieldItem = (FieldItem) other;
        return t.c(this.validationState, fieldItem.validationState) && t.c(this.value, fieldItem.value);
    }

    public int hashCode() {
        int iHashCode = this.validationState.hashCode() * 31;
        T t15 = this.value;
        return iHashCode + (t15 == null ? 0 : t15.hashCode());
    }

    public String toString() {
        return "FieldItem(validationState=" + this.validationState + ", value=" + this.value + ')';
    }

    public /* synthetic */ FieldItem(hz.b bVar, Object obj, int i15, k kVar) {
        this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, obj);
    }
}
