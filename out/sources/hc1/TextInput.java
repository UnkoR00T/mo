package hc1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: hc1.o, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhc1/o;", "", "Lhc1/t0;", "type", "Lv50/c;", "data", "<init>", "(Lhc1/t0;Lv50/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhc1/t0;", "getType", "()Lhc1/t0;", "b", "Lv50/c;", "()Lv50/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextInput {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83228c = v50.c.f203957t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final t0 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final v50.c data;

    public TextInput(t0 t0Var, v50.c cVar) {
        this.type = t0Var;
        this.data = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v50.c getData() {
        return this.data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInput)) {
            return false;
        }
        TextInput textInput = (TextInput) other;
        return this.type == textInput.type && fr.t.c(this.data, textInput.data);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "TextInput(type=" + this.type + ", data=" + this.data + ')';
    }
}
