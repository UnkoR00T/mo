package u22;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lu22/b;", "", "b", "a", "Lu22/b$a;", "Lu22/b$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lu22/b$a;", "Lu22/b;", "Lo02/a;", "messageWizardResult", "<init>", "(Lo02/a;)V", "a", "Lo02/a;", "()Lo02/a;", "b", "Lu22/b$a$a;", "Lu22/b$a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final o02.a messageWizardResult;

        /* JADX INFO: renamed from: u22.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu22/b$a$a;", "Lu22/b$a;", "Lo02/a$a;", "messageWizardResult", "<init>", "(Lo02/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lo02/a$a;", "()Lo02/a$a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Edor extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o02.a.Edor messageWizardResult;

            public Edor(o02.a.Edor edor) {
                super(edor, null);
                this.messageWizardResult = edor;
            }

            @Override // u22.b.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public o02.a.Edor getMessageWizardResult() {
                return this.messageWizardResult;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Edor) && fr.t.c(this.messageWizardResult, ((Edor) other).messageWizardResult);
            }

            public int hashCode() {
                return this.messageWizardResult.hashCode();
            }

            public String toString() {
                return "Edor(messageWizardResult=" + this.messageWizardResult + ')';
            }
        }

        /* JADX INFO: renamed from: u22.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu22/b$a$b;", "Lu22/b$a;", "Lo02/a$b;", "messageWizardResult", "<init>", "(Lo02/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lo02/a$b;", "()Lo02/a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Epuap extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o02.a.Epuap messageWizardResult;

            public Epuap(o02.a.Epuap epuap) {
                super(epuap, null);
                this.messageWizardResult = epuap;
            }

            @Override // u22.b.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public o02.a.Epuap getMessageWizardResult() {
                return this.messageWizardResult;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Epuap) && fr.t.c(this.messageWizardResult, ((Epuap) other).messageWizardResult);
            }

            public int hashCode() {
                return this.messageWizardResult.hashCode();
            }

            public String toString() {
                return "Epuap(messageWizardResult=" + this.messageWizardResult + ')';
            }
        }

        public /* synthetic */ a(o02.a aVar, fr.k kVar) {
            this(aVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public o02.a getMessageWizardResult() {
            return this.messageWizardResult;
        }

        private a(o02.a aVar) {
            this.messageWizardResult = aVar;
        }
    }

    /* JADX INFO: renamed from: u22.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu22/b$b;", "Lu22/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C5066b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5066b f194542a = new C5066b();

        private C5066b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C5066b);
        }

        public int hashCode() {
            return 580684040;
        }

        public String toString() {
            return "NotInitialized";
        }
    }
}
