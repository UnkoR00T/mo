package hu1;

import fr.t;
import p071kotlin.Metadata;
import v50.c;
import wq.b;

/* JADX INFO: renamed from: hu1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhu1/a;", "", "Lhu1/a$a;", "type", "Lv50/c;", "textInputData", "<init>", "(Lhu1/a$a;Lv50/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhu1/a$a;", "b", "()Lhu1/a$a;", "Lv50/c;", "()Lv50/c;", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormFieldData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86678c = c.f203957t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC2027a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c textInputData;

    /* JADX INFO: renamed from: hu1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lhu1/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC2027a {
        NAME,
        SURNAME,
        SERIES_AND_NUMBER;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f86685e = b.a(b());

        public static wq.a<EnumC2027a> e() {
            return f86685e;
        }
    }

    public FormFieldData(EnumC2027a enumC2027a, c cVar) {
        this.type = enumC2027a;
        this.textInputData = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getTextInputData() {
        return this.textInputData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC2027a getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormFieldData)) {
            return false;
        }
        FormFieldData formFieldData = (FormFieldData) other;
        return this.type == formFieldData.type && t.c(this.textInputData, formFieldData.textInputData);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.textInputData.hashCode();
    }

    public String toString() {
        return "FormFieldData(type=" + this.type + ", textInputData=" + this.textInputData + ')';
    }
}
