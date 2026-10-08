package my3;

import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmy3/f;", "", "a", "b", "Lmy3/f$a;", "Lmy3/f$b;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmy3/f$a;", "Lmy3/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f129519a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1897865636;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lmy3/f$b;", "Lmy3/f;", "Lmx/a;", "d", "()Lmx/a;", "paymentTitle", "c", "paymentAmount", "b", "a", "Lmy3/f$b$a;", "Lmy3/f$b$b;", "Lmy3/f$b$c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends f {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lmy3/f$b$a;", "Lmy3/f$b;", "Lmx/a;", "getTitle", "()Lmx/a;", "title", "a", "message", "b", "Lmy3/f$b$a$a;", "Lmy3/f$b$a$b;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a extends b {

            /* JADX INFO: renamed from: my3.f$b$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u0019\u0010$R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b!\u0010$¨\u0006("}, d2 = {"Lmy3/f$b$a$a;", "Lmy3/f$b$a;", "", "", "paymentsId", "", "paymentPackageId", "Lmx/a;", "title", "message", "paymentId", "paymentTitle", "paymentAmount", "<init>", "(Ljava/util/List;Ljava/lang/Long;Lmx/a;Lmx/a;Ljava/lang/String;Lmx/a;Lmx/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "c", "Lmx/a;", "getTitle", "()Lmx/a;", "d", "Ljava/lang/String;", "g", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Alias implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<String> paymentsId;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Long paymentPackageId;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label message;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final String paymentId;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label paymentTitle;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label paymentAmount;

                public Alias(List<String> list, Long l15, Label label, Label label2, String str, Label label3, Label label4) {
                    this.paymentsId = list;
                    this.paymentPackageId = l15;
                    this.title = label;
                    this.message = label2;
                    this.paymentId = str;
                    this.paymentTitle = label3;
                    this.paymentAmount = label4;
                }

                @Override // my3.f.b.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public Label getMessage() {
                    return this.message;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public String getPaymentId() {
                    return this.paymentId;
                }

                @Override // my3.f.b
                /* JADX INFO: renamed from: c, reason: from getter */
                public Label getPaymentAmount() {
                    return this.paymentAmount;
                }

                @Override // my3.f.b
                /* JADX INFO: renamed from: d, reason: from getter */
                public Label getPaymentTitle() {
                    return this.paymentTitle;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final Long getPaymentPackageId() {
                    return this.paymentPackageId;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Alias)) {
                        return false;
                    }
                    Alias alias = (Alias) other;
                    return fr.t.c(this.paymentsId, alias.paymentsId) && fr.t.c(this.paymentPackageId, alias.paymentPackageId) && fr.t.c(this.title, alias.title) && fr.t.c(this.message, alias.message) && fr.t.c(this.paymentId, alias.paymentId) && fr.t.c(this.paymentTitle, alias.paymentTitle) && fr.t.c(this.paymentAmount, alias.paymentAmount);
                }

                public final List<String> f() {
                    return this.paymentsId;
                }

                @Override // my3.f.b.a
                public Label getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int iHashCode = this.paymentsId.hashCode() * 31;
                    Long l15 = this.paymentPackageId;
                    int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
                    Label label = this.title;
                    int iHashCode3 = (iHashCode2 + (label == null ? 0 : label.hashCode())) * 31;
                    Label label2 = this.message;
                    return ((((((iHashCode3 + (label2 != null ? label2.hashCode() : 0)) * 31) + this.paymentId.hashCode()) * 31) + this.paymentTitle.hashCode()) * 31) + this.paymentAmount.hashCode();
                }

                public String toString() {
                    return "Alias(paymentsId=" + this.paymentsId + ", paymentPackageId=" + this.paymentPackageId + ", title=" + this.title + ", message=" + this.message + ", paymentId=" + this.paymentId + ", paymentTitle=" + this.paymentTitle + ", paymentAmount=" + this.paymentAmount + ')';
                }
            }

            /* JADX INFO: renamed from: my3.f$b$a$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001f"}, d2 = {"Lmy3/f$b$a$b;", "Lmy3/f$b$a;", "Lmx/a;", "title", "message", "", "paymentId", "paymentTitle", "paymentAmount", "<init>", "(Lmx/a;Lmx/a;Ljava/lang/String;Lmx/a;Lmx/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "c", "Ljava/lang/String;", "getPaymentId", "d", "e", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Generic implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label message;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final String paymentId;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label paymentTitle;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label paymentAmount;

                public Generic(Label label, Label label2, String str, Label label3, Label label4) {
                    this.title = label;
                    this.message = label2;
                    this.paymentId = str;
                    this.paymentTitle = label3;
                    this.paymentAmount = label4;
                }

                @Override // my3.f.b.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public Label getMessage() {
                    return this.message;
                }

                @Override // my3.f.b
                /* JADX INFO: renamed from: c, reason: from getter */
                public Label getPaymentAmount() {
                    return this.paymentAmount;
                }

                @Override // my3.f.b
                /* JADX INFO: renamed from: d, reason: from getter */
                public Label getPaymentTitle() {
                    return this.paymentTitle;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Generic)) {
                        return false;
                    }
                    Generic generic = (Generic) other;
                    return fr.t.c(this.title, generic.title) && fr.t.c(this.message, generic.message) && fr.t.c(this.paymentId, generic.paymentId) && fr.t.c(this.paymentTitle, generic.paymentTitle) && fr.t.c(this.paymentAmount, generic.paymentAmount);
                }

                @Override // my3.f.b.a
                public Label getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    Label label = this.title;
                    int iHashCode = (label == null ? 0 : label.hashCode()) * 31;
                    Label label2 = this.message;
                    return ((((((iHashCode + (label2 != null ? label2.hashCode() : 0)) * 31) + this.paymentId.hashCode()) * 31) + this.paymentTitle.hashCode()) * 31) + this.paymentAmount.hashCode();
                }

                public String toString() {
                    return "Generic(title=" + this.title + ", message=" + this.message + ", paymentId=" + this.paymentId + ", paymentTitle=" + this.paymentTitle + ", paymentAmount=" + this.paymentAmount + ')';
                }
            }

            /* JADX INFO: renamed from: a */
            Label getMessage();

            Label getTitle();
        }

        /* JADX INFO: renamed from: my3.f$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lmy3/f$b$b;", "Lmy3/f$b;", "", "paymentId", "Lmx/a;", "paymentTitle", "paymentAmount", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPaymentId", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PaymentInProcessing implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentAmount;

            public PaymentInProcessing(String str, Label label, Label label2) {
                this.paymentId = str;
                this.paymentTitle = label;
                this.paymentAmount = label2;
            }

            @Override // my3.f.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public Label getPaymentAmount() {
                return this.paymentAmount;
            }

            @Override // my3.f.b
            /* JADX INFO: renamed from: d, reason: from getter */
            public Label getPaymentTitle() {
                return this.paymentTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentInProcessing)) {
                    return false;
                }
                PaymentInProcessing paymentInProcessing = (PaymentInProcessing) other;
                return fr.t.c(this.paymentId, paymentInProcessing.paymentId) && fr.t.c(this.paymentTitle, paymentInProcessing.paymentTitle) && fr.t.c(this.paymentAmount, paymentInProcessing.paymentAmount);
            }

            public int hashCode() {
                return (((this.paymentId.hashCode() * 31) + this.paymentTitle.hashCode()) * 31) + this.paymentAmount.hashCode();
            }

            public String toString() {
                return "PaymentInProcessing(paymentId=" + this.paymentId + ", paymentTitle=" + this.paymentTitle + ", paymentAmount=" + this.paymentAmount + ')';
            }
        }

        /* JADX INFO: renamed from: my3.f$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lmy3/f$b$c;", "Lmy3/f$b;", "", "paymentId", "Lmx/a;", "paymentTitle", "paymentAmount", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentAmount;

            public Success(String str, Label label, Label label2) {
                this.paymentId = str;
                this.paymentTitle = label;
                this.paymentAmount = label2;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public String getPaymentId() {
                return this.paymentId;
            }

            @Override // my3.f.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public Label getPaymentAmount() {
                return this.paymentAmount;
            }

            @Override // my3.f.b
            /* JADX INFO: renamed from: d, reason: from getter */
            public Label getPaymentTitle() {
                return this.paymentTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return fr.t.c(this.paymentId, success.paymentId) && fr.t.c(this.paymentTitle, success.paymentTitle) && fr.t.c(this.paymentAmount, success.paymentAmount);
            }

            public int hashCode() {
                return (((this.paymentId.hashCode() * 31) + this.paymentTitle.hashCode()) * 31) + this.paymentAmount.hashCode();
            }

            public String toString() {
                return "Success(paymentId=" + this.paymentId + ", paymentTitle=" + this.paymentTitle + ", paymentAmount=" + this.paymentAmount + ')';
            }
        }

        /* JADX INFO: renamed from: c */
        Label getPaymentAmount();

        /* JADX INFO: renamed from: d */
        Label getPaymentTitle();
    }
}
