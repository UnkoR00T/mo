package ff1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lff1/h;", "", "Lff1/g;", "formData", "<init>", "(Lff1/g;)V", "a", "Lff1/g;", "getFormData", "()Lff1/g;", "b", "Lff1/h$a;", "Lff1/h$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f62185b = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FormData formData;

    /* JADX INFO: renamed from: ff1.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lff1/h$a;", "Lff1/h;", "Lff1/g;", "formData", "<init>", "(Lff1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lff1/g;", "a", "()Lff1/g;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoPage extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f62187d = hz.b.f86845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public InfoPage(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InfoPage) && fr.t.c(this.formData, ((InfoPage) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "InfoPage(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: ff1.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lff1/h$b;", "Lff1/h;", "Lff1/g;", "formData", "<init>", "(Lff1/g;)V", "a", "(Lff1/g;)Lff1/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lff1/g;", "b", "()Lff1/g;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f62189d = hz.b.f86845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public Initialized(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        public final Initialized a(FormData formData) {
            return new Initialized(formData);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.formData, ((Initialized) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "Initialized(formData=" + this.formData + ')';
        }
    }

    public /* synthetic */ h(FormData formData, fr.k kVar) {
        this(formData);
    }

    private h(FormData formData) {
        this.formData = formData;
    }
}
