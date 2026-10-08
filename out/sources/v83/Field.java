package v83;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: v83.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv83/b;", "T", "", "value", "Lv83/c;", "type", "<init>", "(Ljava/lang/Object;Lv83/c;)V", "a", "(Ljava/lang/Object;Lv83/c;)Lv83/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "b", "Lv83/c;", "getType", "()Lv83/c;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Field<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c type;

    public Field(T t15, c cVar) {
        this.value = t15;
        this.type = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Field b(Field field, Object obj, c cVar, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            obj = field.value;
        }
        if ((i15 & 2) != 0) {
            cVar = field.type;
        }
        return field.a(obj, cVar);
    }

    public final Field<T> a(T value, c type) {
        return new Field<>(value, type);
    }

    public final T c() {
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
        return fr.t.c(this.value, field.value) && this.type == field.type;
    }

    public int hashCode() {
        T t15 = this.value;
        return ((t15 == null ? 0 : t15.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Field(value=" + this.value + ", type=" + this.type + ')';
    }
}
