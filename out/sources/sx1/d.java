package sx1;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\t\u0006\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\r\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lsx1/d;", "", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "a", "Lsx1/d$e;", "()Lsx1/d$e;", "g", "i", "b", "n", "h", "m", "d", "k", "f", "j", "l", "c", "e", "Lsx1/d$a;", "Lsx1/d$b;", "Lsx1/d$c;", "Lsx1/d$d;", "Lsx1/d$f;", "Lsx1/d$g;", "Lsx1/d$h;", "Lsx1/d$i;", "Lsx1/d$j;", "Lsx1/d$k;", "Lsx1/d$l;", "Lsx1/d$m;", "Lsx1/d$n;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FormData formData;

    /* JADX INFO: renamed from: sx1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$a;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckNfc extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public CheckNfc(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckNfc) && fr.t.c(this.formData, ((CheckNfc) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "CheckNfc(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$b;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CompareCertData extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public CompareCertData(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CompareCertData) && fr.t.c(this.formData, ((CompareCertData) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "CompareCertData(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lsx1/d$c;", "Lsx1/d;", "Lsx1/d$e;", "formData", "Lhb4/c;", "errorVMS", "<init>", "(Lsx1/d$e;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "c", "Lhb4/c;", "()Lhb4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(FormData formData, hb4.c cVar) {
            super(formData, null);
            this.formData = formData;
            this.errorVMS = cVar;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.formData, error.formData) && fr.t.c(this.errorVMS, error.errorVMS);
        }

        public int hashCode() {
            return (this.formData.hashCode() * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(formData=" + this.formData + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$d, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$d;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinishSigning extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public FinishSigning(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinishSigning) && fr.t.c(this.formData, ((FinishSigning) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "FinishSigning(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$g;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreSetup extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public PreSetup(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreSetup) && fr.t.c(this.formData, ((PreSetup) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "PreSetup(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$h, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$h;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrepareSign extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public PrepareSign(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrepareSign) && fr.t.c(this.formData, ((PrepareSign) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "PrepareSign(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$j, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$j;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaveUserActivity extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public SaveUserActivity(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SaveUserActivity) && fr.t.c(this.formData, ((SaveUserActivity) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "SaveUserActivity(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$k, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$k;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingFile extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public SavingFile(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SavingFile) && fr.t.c(this.formData, ((SavingFile) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "SavingFile(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$l, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$l;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignSuccess extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public SignSuccess(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SignSuccess) && fr.t.c(this.formData, ((SignSuccess) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "SignSuccess(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: sx1.d$n, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsx1/d$n;", "Lsx1/d;", "Lsx1/d$e;", "formData", "<init>", "(Lsx1/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerifyCert extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public VerifyCert(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerifyCert) && fr.t.c(this.formData, ((VerifyCert) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "VerifyCert(formData=" + this.formData + ')';
        }
    }

    public /* synthetic */ d(FormData formData, fr.k kVar) {
        this(formData);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public FormData getFormData() {
        return this.formData;
    }

    private d(FormData formData) {
        this.formData = formData;
    }

    /* JADX INFO: renamed from: sx1.d$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsx1/d$f;", "Lsx1/d;", "", "redirectedToSettings", "Lsx1/d$e;", "formData", "<init>", "(ZLsx1/d$e;)V", "b", "(ZLsx1/d$e;)Lsx1/d$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "c", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MissingStoragePermission extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean redirectedToSettings;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public MissingStoragePermission(boolean z15, FormData formData) {
            super(formData, null);
            this.redirectedToSettings = z15;
            this.formData = formData;
        }

        public static /* synthetic */ MissingStoragePermission c(MissingStoragePermission missingStoragePermission, boolean z15, FormData formData, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = missingStoragePermission.redirectedToSettings;
            }
            if ((i15 & 2) != 0) {
                formData = missingStoragePermission.formData;
            }
            return missingStoragePermission.b(z15, formData);
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public final MissingStoragePermission b(boolean redirectedToSettings, FormData formData) {
            return new MissingStoragePermission(redirectedToSettings, formData);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getRedirectedToSettings() {
            return this.redirectedToSettings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MissingStoragePermission)) {
                return false;
            }
            MissingStoragePermission missingStoragePermission = (MissingStoragePermission) other;
            return this.redirectedToSettings == missingStoragePermission.redirectedToSettings && fr.t.c(this.formData, missingStoragePermission.formData);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.redirectedToSettings) * 31) + this.formData.hashCode();
        }

        public String toString() {
            return "MissingStoragePermission(redirectedToSettings=" + this.redirectedToSettings + ", formData=" + this.formData + ')';
        }

        public /* synthetic */ MissingStoragePermission(boolean z15, FormData formData, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15, formData);
        }
    }

    /* JADX INFO: renamed from: sx1.d$i, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lsx1/d$i;", "Lsx1/d;", "Lsx1/d$e;", "formData", "Lcy/c;", "lastReadingData", "<init>", "(Lsx1/d$e;Lcy/c;)V", "b", "(Lsx1/d$e;Lcy/c;)Lsx1/d$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "c", "Lcy/c;", "d", "()Lcy/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadCert extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final cy.c lastReadingData;

        public ReadCert(FormData formData, cy.c cVar) {
            super(formData, null);
            this.formData = formData;
            this.lastReadingData = cVar;
        }

        public static /* synthetic */ ReadCert c(ReadCert readCert, FormData formData, cy.c cVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                formData = readCert.formData;
            }
            if ((i15 & 2) != 0) {
                cVar = readCert.lastReadingData;
            }
            return readCert.b(formData, cVar);
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public final ReadCert b(FormData formData, cy.c lastReadingData) {
            return new ReadCert(formData, lastReadingData);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final cy.c getLastReadingData() {
            return this.lastReadingData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadCert)) {
                return false;
            }
            ReadCert readCert = (ReadCert) other;
            return fr.t.c(this.formData, readCert.formData) && fr.t.c(this.lastReadingData, readCert.lastReadingData);
        }

        public int hashCode() {
            int iHashCode = this.formData.hashCode() * 31;
            cy.c cVar = this.lastReadingData;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "ReadCert(formData=" + this.formData + ", lastReadingData=" + this.lastReadingData + ')';
        }

        public /* synthetic */ ReadCert(FormData formData, cy.c cVar, int i15, fr.k kVar) {
            this(formData, (i15 & 2) != 0 ? null : cVar);
        }
    }

    /* JADX INFO: renamed from: sx1.d$m, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lsx1/d$m;", "Lsx1/d;", "Lsx1/d$e;", "formData", "Lcy/c;", "lastReadingData", "<init>", "(Lsx1/d$e;Lcy/c;)V", "b", "(Lsx1/d$e;Lcy/c;)Lsx1/d$m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsx1/d$e;", "a", "()Lsx1/d$e;", "c", "Lcy/c;", "d", "()Lcy/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignWithIdCard extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final cy.c lastReadingData;

        public SignWithIdCard(FormData formData, cy.c cVar) {
            super(formData, null);
            this.formData = formData;
            this.lastReadingData = cVar;
        }

        public static /* synthetic */ SignWithIdCard c(SignWithIdCard signWithIdCard, FormData formData, cy.c cVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                formData = signWithIdCard.formData;
            }
            if ((i15 & 2) != 0) {
                cVar = signWithIdCard.lastReadingData;
            }
            return signWithIdCard.b(formData, cVar);
        }

        @Override // sx1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public final SignWithIdCard b(FormData formData, cy.c lastReadingData) {
            return new SignWithIdCard(formData, lastReadingData);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final cy.c getLastReadingData() {
            return this.lastReadingData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignWithIdCard)) {
                return false;
            }
            SignWithIdCard signWithIdCard = (SignWithIdCard) other;
            return fr.t.c(this.formData, signWithIdCard.formData) && fr.t.c(this.lastReadingData, signWithIdCard.lastReadingData);
        }

        public int hashCode() {
            int iHashCode = this.formData.hashCode() * 31;
            cy.c cVar = this.lastReadingData;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "SignWithIdCard(formData=" + this.formData + ", lastReadingData=" + this.lastReadingData + ')';
        }

        public /* synthetic */ SignWithIdCard(FormData formData, cy.c cVar, int i15, fr.k kVar) {
            this(formData, (i15 & 2) != 0 ? null : cVar);
        }
    }

    /* JADX INFO: renamed from: sx1.d$e, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jp\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b+\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b!\u0010.¨\u0006/"}, d2 = {"Lsx1/d$e;", "", "Liy/b0;", "pin", "can", "authorizationCert", "", "fileBytes", "", "fileName", "Lkx1/a;", "signingParams", "signedData", "signedFileUri", "", "areAnimationsEnabled", "<init>", "(Liy/b0;Liy/b0;Liy/b0;[BLjava/lang/String;Lkx1/a;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "(Liy/b0;Liy/b0;Liy/b0;[BLjava/lang/String;Lkx1/a;Ljava/lang/String;Ljava/lang/String;Z)Lsx1/d$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "h", "()Liy/b0;", "b", "e", "c", "d", "[B", "f", "()[B", "Ljava/lang/String;", "g", "Lkx1/a;", "k", "()Lkx1/a;", "i", "j", "Z", "()Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 pin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 can;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 authorizationCert;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] fileBytes;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final kx1.a signingParams;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String signedData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String signedFileUri;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean areAnimationsEnabled;

        public FormData(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, byte[] bArr, String str, kx1.a aVar, String str2, String str3, boolean z15) {
            this.pin = b0Var;
            this.can = b0Var2;
            this.authorizationCert = b0Var3;
            this.fileBytes = bArr;
            this.fileName = str;
            this.signingParams = aVar;
            this.signedData = str2;
            this.signedFileUri = str3;
            this.areAnimationsEnabled = z15;
        }

        public static /* synthetic */ FormData b(FormData formData, iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, byte[] bArr, String str, kx1.a aVar, String str2, String str3, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = formData.pin;
            }
            if ((i15 & 2) != 0) {
                b0Var2 = formData.can;
            }
            if ((i15 & 4) != 0) {
                b0Var3 = formData.authorizationCert;
            }
            if ((i15 & 8) != 0) {
                bArr = formData.fileBytes;
            }
            if ((i15 & 16) != 0) {
                str = formData.fileName;
            }
            if ((i15 & 32) != 0) {
                aVar = formData.signingParams;
            }
            if ((i15 & 64) != 0) {
                str2 = formData.signedData;
            }
            if ((i15 & 128) != 0) {
                str3 = formData.signedFileUri;
            }
            if ((i15 & 256) != 0) {
                z15 = formData.areAnimationsEnabled;
            }
            String str4 = str3;
            boolean z16 = z15;
            kx1.a aVar2 = aVar;
            String str5 = str2;
            String str6 = str;
            iy.b0 b0Var4 = b0Var3;
            return formData.a(b0Var, b0Var2, b0Var4, bArr, str6, aVar2, str5, str4, z16);
        }

        public final FormData a(iy.b0 pin, iy.b0 can, iy.b0 authorizationCert, byte[] fileBytes, String fileName, kx1.a signingParams, String signedData, String signedFileUri, boolean areAnimationsEnabled) {
            return new FormData(pin, can, authorizationCert, fileBytes, fileName, signingParams, signedData, signedFileUri, areAnimationsEnabled);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getAreAnimationsEnabled() {
            return this.areAnimationsEnabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getAuthorizationCert() {
            return this.authorizationCert;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final iy.b0 getCan() {
            return this.can;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormData)) {
                return false;
            }
            FormData formData = (FormData) other;
            return fr.t.c(this.pin, formData.pin) && fr.t.c(this.can, formData.can) && fr.t.c(this.authorizationCert, formData.authorizationCert) && fr.t.c(this.fileBytes, formData.fileBytes) && fr.t.c(this.fileName, formData.fileName) && fr.t.c(this.signingParams, formData.signingParams) && fr.t.c(this.signedData, formData.signedData) && fr.t.c(this.signedFileUri, formData.signedFileUri) && this.areAnimationsEnabled == formData.areAnimationsEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final byte[] getFileBytes() {
            return this.fileBytes;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final iy.b0 getPin() {
            return this.pin;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.pin.hashCode() * 31) + this.can.hashCode()) * 31) + this.authorizationCert.hashCode()) * 31) + Arrays.hashCode(this.fileBytes)) * 31) + this.fileName.hashCode()) * 31;
            kx1.a aVar = this.signingParams;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.signedData;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.signedFileUri;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.areAnimationsEnabled);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSignedData() {
            return this.signedData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getSignedFileUri() {
            return this.signedFileUri;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final kx1.a getSigningParams() {
            return this.signingParams;
        }

        public String toString() {
            return "FormData(pin=" + this.pin + ", can=" + this.can + ", authorizationCert=" + this.authorizationCert + ", fileBytes=" + Arrays.toString(this.fileBytes) + ", fileName=" + this.fileName + ", signingParams=" + this.signingParams + ", signedData=" + this.signedData + ", signedFileUri=" + this.signedFileUri + ", areAnimationsEnabled=" + this.areAnimationsEnabled + ')';
        }

        public /* synthetic */ FormData(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, byte[] bArr, String str, kx1.a aVar, String str2, String str3, boolean z15, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? iy.b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? iy.b0.INSTANCE.a() : b0Var2, (i15 & 4) != 0 ? iy.b0.INSTANCE.a() : b0Var3, (i15 & 8) != 0 ? new byte[]{0} : bArr, (i15 & 16) != 0 ? "" : str, (i15 & 32) != 0 ? null : aVar, (i15 & 64) != 0 ? null : str2, (i15 & 128) != 0 ? null : str3, z15);
        }
    }
}
