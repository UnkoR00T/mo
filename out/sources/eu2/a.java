package eu2;

import bu2.CompanyDetails;
import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import cb4.DialogData;
import iu2.WizardResultData;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bf\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Leu2/a;", "", "j", "g", "h", "i", "f", "b", "c", "a", "k", "d", "e", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: eu2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$a;", "Leu2/a;", "Ljb4/b;", "errorData", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final jb4.b errorData;

        public Error(jb4.b bVar) {
            this.errorData = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jb4.b getErrorData() {
            return this.errorData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fr.t.c(this.errorData, ((Error) other).errorData);
        }

        public int hashCode() {
            return this.errorData.hashCode();
        }

        public String toString() {
            return "Error(errorData=" + this.errorData + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Leu2/a$b;", "Leu2/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f53583a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1163579603;
        }

        public String toString() {
            return "Exit";
        }
    }

    /* JADX INFO: renamed from: eu2.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$c;", "Leu2/a;", "Liu2/a;", "wizardResultData", "<init>", "(Liu2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liu2/a;", "()Liu2/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GoToResult implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final WizardResultData wizardResultData;

        public GoToResult(WizardResultData wizardResultData) {
            this.wizardResultData = wizardResultData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WizardResultData getWizardResultData() {
            return this.wizardResultData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoToResult) && fr.t.c(this.wizardResultData, ((GoToResult) other).wizardResultData);
        }

        public int hashCode() {
            return this.wizardResultData.hashCode();
        }

        public String toString() {
            return "GoToResult(wizardResultData=" + this.wizardResultData + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Leu2/a$d;", "Leu2/a;", "<init>", "()V", "a", "c", "e", "d", "b", "f", "Leu2/a$d$a;", "Leu2/a$d$b;", "Leu2/a$d$c;", "Leu2/a$d$d;", "Leu2/a$d$e;", "Leu2/a$d$f;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d implements a {

        /* JADX INFO: renamed from: eu2.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Leu2/a$d$a;", "Leu2/a$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1263a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1263a f53585a = new C1263a();

            private C1263a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1263a);
            }

            public int hashCode() {
                return 2017676984;
            }

            public String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: eu2.a$d$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$d$b;", "Leu2/a$d;", "Ljb4/b;", "errorData", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final jb4.b errorData;

            public Error(jb4.b bVar) {
                super(null);
                this.errorData = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jb4.b getErrorData() {
                return this.errorData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorData, ((Error) other).errorData);
            }

            public int hashCode() {
                return this.errorData.hashCode();
            }

            public String toString() {
                return "Error(errorData=" + this.errorData + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Leu2/a$d$c;", "Leu2/a$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f53587a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 2143367262;
            }

            public String toString() {
                return "Exit";
            }
        }

        /* JADX INFO: renamed from: eu2.a$d$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$d$d;", "Leu2/a$d;", "Liu2/a;", "wizardResultData", "<init>", "(Liu2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liu2/a;", "()Liu2/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GoToResult extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WizardResultData wizardResultData;

            public GoToResult(WizardResultData wizardResultData) {
                super(null);
                this.wizardResultData = wizardResultData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final WizardResultData getWizardResultData() {
                return this.wizardResultData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToResult) && fr.t.c(this.wizardResultData, ((GoToResult) other).wizardResultData);
            }

            public int hashCode() {
                return this.wizardResultData.hashCode();
            }

            public String toString() {
                return "GoToResult(wizardResultData=" + this.wizardResultData + ')';
            }
        }

        /* JADX INFO: renamed from: eu2.a$d$e, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$d$e;", "Leu2/a$d;", "Lcb4/d;", "dialogData", "<init>", "(Lcb4/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/d;", "()Lcb4/d;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenExitDialog extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogData dialogData;

            public OpenExitDialog(DialogData dialogData) {
                super(null);
                this.dialogData = dialogData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DialogData getDialogData() {
                return this.dialogData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenExitDialog) && fr.t.c(this.dialogData, ((OpenExitDialog) other).dialogData);
            }

            public int hashCode() {
                return this.dialogData.hashCode();
            }

            public String toString() {
                return "OpenExitDialog(dialogData=" + this.dialogData + ')';
            }
        }

        /* JADX INFO: renamed from: eu2.a$d$f, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001e"}, d2 = {"Leu2/a$d$f;", "Leu2/a$d;", "Ljava/time/LocalDate;", "initialDate", "Lkotlin/Function1;", "Loq/i0;", "onDateChange", "minimumDate", "maximumDate", "<init>", "(Ljava/time/LocalDate;Ler/l;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Ler/l;", "d", "()Ler/l;", "c", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ToDatePicker extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate initialDate;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<LocalDate, oq.i0> onDateChange;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate minimumDate;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate maximumDate;

            /* JADX WARN: Multi-variable type inference failed */
            public ToDatePicker(LocalDate localDate, er.l<? super LocalDate, oq.i0> lVar, LocalDate localDate2, LocalDate localDate3) {
                super(null);
                this.initialDate = localDate;
                this.onDateChange = lVar;
                this.minimumDate = localDate2;
                this.maximumDate = localDate3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocalDate getInitialDate() {
                return this.initialDate;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final LocalDate getMaximumDate() {
                return this.maximumDate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final LocalDate getMinimumDate() {
                return this.minimumDate;
            }

            public final er.l<LocalDate, oq.i0> d() {
                return this.onDateChange;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToDatePicker)) {
                    return false;
                }
                ToDatePicker toDatePicker = (ToDatePicker) other;
                return fr.t.c(this.initialDate, toDatePicker.initialDate) && fr.t.c(this.onDateChange, toDatePicker.onDateChange) && fr.t.c(this.minimumDate, toDatePicker.minimumDate) && fr.t.c(this.maximumDate, toDatePicker.maximumDate);
            }

            public int hashCode() {
                LocalDate localDate = this.initialDate;
                int iHashCode = (((localDate == null ? 0 : localDate.hashCode()) * 31) + this.onDateChange.hashCode()) * 31;
                LocalDate localDate2 = this.minimumDate;
                int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
                LocalDate localDate3 = this.maximumDate;
                return iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0);
            }

            public String toString() {
                return "ToDatePicker(initialDate=" + this.initialDate + ", onDateChange=" + this.onDateChange + ", minimumDate=" + this.minimumDate + ", maximumDate=" + this.maximumDate + ')';
            }
        }

        public /* synthetic */ d(fr.k kVar) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Leu2/a$e;", "Leu2/a;", "<init>", "()V", "a", "Leu2/a$e$a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class e implements a {

        /* JADX INFO: renamed from: eu2.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Leu2/a$e$a;", "Leu2/a$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1265a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1265a f53594a = new C1265a();

            private C1265a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1265a);
            }

            public int hashCode() {
                return -1171661186;
            }

            public String toString() {
                return "Back";
            }
        }

        public /* synthetic */ e(fr.k kVar) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Leu2/a$f;", "Leu2/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f53595a = new f();

        private f() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -1903051931;
        }

        public String toString() {
            return "OpenExitDialog";
        }
    }

    /* JADX INFO: renamed from: eu2.a$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$g;", "Leu2/a;", "Lbu2/b;", "companyDetails", "<init>", "(Lbu2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu2/b;", "()Lbu2/b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaveCompanyContractData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanyDetails companyDetails;

        public SaveCompanyContractData(CompanyDetails companyDetails) {
            this.companyDetails = companyDetails;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CompanyDetails getCompanyDetails() {
            return this.companyDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SaveCompanyContractData) && fr.t.c(this.companyDetails, ((SaveCompanyContractData) other).companyDetails);
        }

        public int hashCode() {
            return this.companyDetails.hashCode();
        }

        public String toString() {
            return "SaveCompanyContractData(companyDetails=" + this.companyDetails + ')';
        }
    }

    /* JADX INFO: renamed from: eu2.a$h, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$h;", "Leu2/a;", "Lbu2/d;", "verificationCheckData", "<init>", "(Lbu2/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu2/d;", "()Lbu2/d;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaveVerificationCheckData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerificationCheckData verificationCheckData;

        public SaveVerificationCheckData(VerificationCheckData verificationCheckData) {
            this.verificationCheckData = verificationCheckData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VerificationCheckData getVerificationCheckData() {
            return this.verificationCheckData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SaveVerificationCheckData) && fr.t.c(this.verificationCheckData, ((SaveVerificationCheckData) other).verificationCheckData);
        }

        public int hashCode() {
            return this.verificationCheckData.hashCode();
        }

        public String toString() {
            return "SaveVerificationCheckData(verificationCheckData=" + this.verificationCheckData + ')';
        }
    }

    /* JADX INFO: renamed from: eu2.a$i, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$i;", "Leu2/a;", "Lbu2/e;", "verifiedStatus", "<init>", "(Lbu2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu2/e;", "()Lbu2/e;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaveVerifiedStatus implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerifiedStatus verifiedStatus;

        public SaveVerifiedStatus(VerifiedStatus verifiedStatus) {
            this.verifiedStatus = verifiedStatus;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VerifiedStatus getVerifiedStatus() {
            return this.verifiedStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SaveVerifiedStatus) && fr.t.c(this.verifiedStatus, ((SaveVerifiedStatus) other).verifiedStatus);
        }

        public int hashCode() {
            return this.verifiedStatus.hashCode();
        }

        public String toString() {
            return "SaveVerifiedStatus(verifiedStatus=" + this.verifiedStatus + ')';
        }
    }

    /* JADX INFO: renamed from: eu2.a$j, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leu2/a$j;", "Leu2/a;", "Lcu2/i$d;", "destination", "<init>", "(Lcu2/i$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcu2/i$d;", "()Lcu2/i$d;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StepChanged implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cu2.i.d destination;

        public StepChanged(cu2.i.d dVar) {
            this.destination = dVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final cu2.i.d getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StepChanged) && fr.t.c(this.destination, ((StepChanged) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return "StepChanged(destination=" + this.destination + ')';
        }
    }

    /* JADX INFO: renamed from: eu2.a$k, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001e"}, d2 = {"Leu2/a$k;", "Leu2/a;", "Ljava/time/LocalDate;", "initialDate", "Lkotlin/Function1;", "Loq/i0;", "onDateChange", "minimumDate", "maximumDate", "<init>", "(Ljava/time/LocalDate;Ler/l;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Ler/l;", "d", "()Ler/l;", "c", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToDatePicker implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate initialDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<LocalDate, oq.i0> onDateChange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate minimumDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate maximumDate;

        /* JADX WARN: Multi-variable type inference failed */
        public ToDatePicker(LocalDate localDate, er.l<? super LocalDate, oq.i0> lVar, LocalDate localDate2, LocalDate localDate3) {
            this.initialDate = localDate;
            this.onDateChange = lVar;
            this.minimumDate = localDate2;
            this.maximumDate = localDate3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getInitialDate() {
            return this.initialDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getMaximumDate() {
            return this.maximumDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getMinimumDate() {
            return this.minimumDate;
        }

        public final er.l<LocalDate, oq.i0> d() {
            return this.onDateChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToDatePicker)) {
                return false;
            }
            ToDatePicker toDatePicker = (ToDatePicker) other;
            return fr.t.c(this.initialDate, toDatePicker.initialDate) && fr.t.c(this.onDateChange, toDatePicker.onDateChange) && fr.t.c(this.minimumDate, toDatePicker.minimumDate) && fr.t.c(this.maximumDate, toDatePicker.maximumDate);
        }

        public int hashCode() {
            LocalDate localDate = this.initialDate;
            int iHashCode = (((localDate == null ? 0 : localDate.hashCode()) * 31) + this.onDateChange.hashCode()) * 31;
            LocalDate localDate2 = this.minimumDate;
            int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
            LocalDate localDate3 = this.maximumDate;
            return iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0);
        }

        public String toString() {
            return "ToDatePicker(initialDate=" + this.initialDate + ", onDateChange=" + this.onDateChange + ", minimumDate=" + this.minimumDate + ", maximumDate=" + this.maximumDate + ')';
        }
    }
}
