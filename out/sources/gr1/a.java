package gr1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lgr1/a;", "", "<init>", "()V", "d", "c", "b", "e", "f", "a", "Lgr1/a$a;", "Lgr1/a$b;", "Lgr1/a$c;", "Lgr1/a$d;", "Lgr1/a$e;", "Lgr1/a$f;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: gr1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgr1/a$a;", "Lgr1/a;", "<init>", "()V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1725a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1725a f76375a = new C1725a();

        private C1725a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gr1.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgr1/a$b;", "Lgr1/a;", "", "visible", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheetVisibilityChanged extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean visible;

        public BottomSheetVisibilityChanged(boolean z15) {
            super(null);
            this.visible = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getVisible() {
            return this.visible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BottomSheetVisibilityChanged) && this.visible == ((BottomSheetVisibilityChanged) other).visible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.visible);
        }

        public String toString() {
            return "BottomSheetVisibilityChanged(visible=" + this.visible + ')';
        }
    }

    /* JADX INFO: renamed from: gr1.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgr1/a$c;", "Lgr1/a;", "Lgr1/b;", "formData", "<init>", "(Lgr1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgr1/b;", "()Lgr1/b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormDataChanged extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public FormDataChanged(FormData formData) {
            super(null);
            this.formData = formData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FormDataChanged) && fr.t.c(this.formData, ((FormDataChanged) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "FormDataChanged(formData=" + this.formData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lgr1/a$d;", "Lgr1/a;", "<init>", "()V", "a", "Lgr1/a$d$a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d extends a {

        /* JADX INFO: renamed from: gr1.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgr1/a$d$a;", "Lgr1/a$d;", "<init>", "()V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C1726a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1726a f76378a = new C1726a();

            private C1726a() {
                super(null);
            }
        }

        public /* synthetic */ d(fr.k kVar) {
            this();
        }

        private d() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgr1/a$e;", "Lgr1/a;", "<init>", "()V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f76379a = new e();

        private e() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgr1/a$f;", "Lgr1/a;", "<init>", "()V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f76380a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ a(fr.k kVar) {
        this();
    }

    private a() {
    }
}
