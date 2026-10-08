package ub1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ub1.l, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lub1/l;", "T", "", "Lhz/b;", "validationState", "", "value", "<init>", "(Lhz/b;Ljava/lang/String;)V", "a", "(Lhz/b;Ljava/lang/String;)Lub1/l;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Ljava/lang/String;", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Field<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f197240c = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    public Field(hz.b bVar, String str) {
        this.validationState = bVar;
        this.value = str;
    }

    public static /* synthetic */ Field b(Field field, hz.b bVar, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = field.validationState;
        }
        if ((i15 & 2) != 0) {
            str = field.value;
        }
        return field.a(bVar, str);
    }

    public final Field<T> a(hz.b validationState, String value) {
        return new Field<>(validationState, value);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Field)) {
            return false;
        }
        Field field = (Field) other;
        return fr.t.c(this.validationState, field.validationState) && fr.t.c(this.value, field.value);
    }

    public int hashCode() {
        return (this.validationState.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "Field(validationState=" + this.validationState + ", value=" + this.value + ')';
    }

    public /* synthetic */ Field(hz.b bVar, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? "" : str);
    }
}
