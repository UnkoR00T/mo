package y42;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ly42/f;", "", "a", "b", "Ly42/f$a;", "Ly42/f$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly42/f$a;", "Ly42/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f224055a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1058375122;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\n\u0011\u0014R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Ly42/f$b;", "Ly42/f;", "", "e", "()Ljava/lang/String;", "paymentId", "Lmx/a;", "d", "()Lmx/a;", "paymentTitle", "c", "paymentAmount", "", "f", "()Z", "shouldBackToDetails", "Lcb4/i;", "b", "()Lcb4/i;", "dialog", "a", "Ly42/f$b$a;", "Ly42/f$b$b;", "Ly42/f$b$c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends f {
        /* JADX INFO: renamed from: b */
        cb4.i getDialog();

        /* JADX INFO: renamed from: c */
        Label getPaymentAmount();

        /* JADX INFO: renamed from: d */
        Label getPaymentTitle();

        /* JADX INFO: renamed from: e */
        String getPaymentId();

        /* JADX INFO: renamed from: f */
        boolean getShouldBackToDetails();

        /* JADX INFO: renamed from: y42.f$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006#"}, d2 = {"Ly42/f$b$b;", "Ly42/f$b;", "", "paymentId", "Lmx/a;", "paymentTitle", "paymentAmount", "", "shouldBackToDetails", "Lcb4/i;", "dialog", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;ZLcb4/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Z", "f", "()Z", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Info implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentAmount;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldBackToDetails;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Info(String str, Label label, Label label2, boolean z15, cb4.i iVar) {
                this.paymentId = str;
                this.paymentTitle = label;
                this.paymentAmount = label2;
                this.shouldBackToDetails = z15;
                this.dialog = iVar;
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public cb4.i getDialog() {
                return this.dialog;
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public Label getPaymentAmount() {
                return this.paymentAmount;
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: d, reason: from getter */
            public Label getPaymentTitle() {
                return this.paymentTitle;
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getPaymentId() {
                return this.paymentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Info)) {
                    return false;
                }
                Info info = (Info) other;
                return fr.t.c(this.paymentId, info.paymentId) && fr.t.c(this.paymentTitle, info.paymentTitle) && fr.t.c(this.paymentAmount, info.paymentAmount) && this.shouldBackToDetails == info.shouldBackToDetails && fr.t.c(this.dialog, info.dialog);
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: f, reason: from getter */
            public boolean getShouldBackToDetails() {
                return this.shouldBackToDetails;
            }

            public int hashCode() {
                int iHashCode = ((((((this.paymentId.hashCode() * 31) + this.paymentTitle.hashCode()) * 31) + this.paymentAmount.hashCode()) * 31) + Boolean.hashCode(this.shouldBackToDetails)) * 31;
                cb4.i iVar = this.dialog;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Info(paymentId=" + this.paymentId + ", paymentTitle=" + this.paymentTitle + ", paymentAmount=" + this.paymentAmount + ", shouldBackToDetails=" + this.shouldBackToDetails + ", dialog=" + this.dialog + ')';
            }

            public /* synthetic */ Info(String str, Label label, Label label2, boolean z15, cb4.i iVar, int i15, fr.k kVar) {
                this(str, label, label2, z15, (i15 & 16) != 0 ? null : iVar);
            }
        }

        /* JADX INFO: renamed from: y42.f$b$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"Ly42/f$b$c;", "Ly42/f$b;", "", "paymentId", "Lmx/a;", "paymentTitle", "paymentAmount", "", "shouldBackToDetails", "Lcb4/i;", "dialog", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;ZLcb4/i;)V", "g", "(Ljava/lang/String;Lmx/a;Lmx/a;ZLcb4/i;)Ly42/f$b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Z", "f", "()Z", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentAmount;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldBackToDetails;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Success(String str, Label label, Label label2, boolean z15, cb4.i iVar) {
                this.paymentId = str;
                this.paymentTitle = label;
                this.paymentAmount = label2;
                this.shouldBackToDetails = z15;
                this.dialog = iVar;
            }

            public static /* synthetic */ Success h(Success success, String str, Label label, Label label2, boolean z15, cb4.i iVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    str = success.paymentId;
                }
                if ((i15 & 2) != 0) {
                    label = success.paymentTitle;
                }
                if ((i15 & 4) != 0) {
                    label2 = success.paymentAmount;
                }
                if ((i15 & 8) != 0) {
                    z15 = success.shouldBackToDetails;
                }
                if ((i15 & 16) != 0) {
                    iVar = success.dialog;
                }
                cb4.i iVar2 = iVar;
                Label label3 = label2;
                return success.g(str, label, label3, z15, iVar2);
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public cb4.i getDialog() {
                return this.dialog;
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public Label getPaymentAmount() {
                return this.paymentAmount;
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: d, reason: from getter */
            public Label getPaymentTitle() {
                return this.paymentTitle;
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getPaymentId() {
                return this.paymentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return fr.t.c(this.paymentId, success.paymentId) && fr.t.c(this.paymentTitle, success.paymentTitle) && fr.t.c(this.paymentAmount, success.paymentAmount) && this.shouldBackToDetails == success.shouldBackToDetails && fr.t.c(this.dialog, success.dialog);
            }

            @Override // y42.f.b
            /* JADX INFO: renamed from: f, reason: from getter */
            public boolean getShouldBackToDetails() {
                return this.shouldBackToDetails;
            }

            public final Success g(String paymentId, Label paymentTitle, Label paymentAmount, boolean shouldBackToDetails, cb4.i dialog) {
                return new Success(paymentId, paymentTitle, paymentAmount, shouldBackToDetails, dialog);
            }

            public int hashCode() {
                int iHashCode = ((((((this.paymentId.hashCode() * 31) + this.paymentTitle.hashCode()) * 31) + this.paymentAmount.hashCode()) * 31) + Boolean.hashCode(this.shouldBackToDetails)) * 31;
                cb4.i iVar = this.dialog;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Success(paymentId=" + this.paymentId + ", paymentTitle=" + this.paymentTitle + ", paymentAmount=" + this.paymentAmount + ", shouldBackToDetails=" + this.shouldBackToDetails + ", dialog=" + this.dialog + ')';
            }

            public /* synthetic */ Success(String str, Label label, Label label2, boolean z15, cb4.i iVar, int i15, fr.k kVar) {
                this(str, label, label2, z15, (i15 & 16) != 0 ? null : iVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0001\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ly42/f$b$a;", "Ly42/f$b;", "Lmx/a;", "getTitle", "()Lmx/a;", "title", "a", "message", "Ly42/f$b$a$a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a extends b {
            /* JADX INFO: renamed from: a */
            Label getMessage();

            Label getTitle();

            /* JADX INFO: renamed from: y42.f$b$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b \u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, d2 = {"Ly42/f$b$a$a;", "Ly42/f$b$a;", "Lmx/a;", "title", "message", "", "paymentId", "paymentTitle", "paymentAmount", "", "shouldBackToDetails", "Lcb4/i;", "dialog", "<init>", "(Lmx/a;Lmx/a;Ljava/lang/String;Lmx/a;Lmx/a;ZLcb4/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "c", "Ljava/lang/String;", "e", "d", "f", "Z", "()Z", "g", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean shouldBackToDetails;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialog;

                public Generic(Label label, Label label2, String str, Label label3, Label label4, boolean z15, cb4.i iVar) {
                    this.title = label;
                    this.message = label2;
                    this.paymentId = str;
                    this.paymentTitle = label3;
                    this.paymentAmount = label4;
                    this.shouldBackToDetails = z15;
                    this.dialog = iVar;
                }

                @Override // y42.f.b.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public Label getMessage() {
                    return this.message;
                }

                @Override // y42.f.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public cb4.i getDialog() {
                    return this.dialog;
                }

                @Override // y42.f.b
                /* JADX INFO: renamed from: c, reason: from getter */
                public Label getPaymentAmount() {
                    return this.paymentAmount;
                }

                @Override // y42.f.b
                /* JADX INFO: renamed from: d, reason: from getter */
                public Label getPaymentTitle() {
                    return this.paymentTitle;
                }

                @Override // y42.f.b
                /* JADX INFO: renamed from: e, reason: from getter */
                public String getPaymentId() {
                    return this.paymentId;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Generic)) {
                        return false;
                    }
                    Generic generic = (Generic) other;
                    return fr.t.c(this.title, generic.title) && fr.t.c(this.message, generic.message) && fr.t.c(this.paymentId, generic.paymentId) && fr.t.c(this.paymentTitle, generic.paymentTitle) && fr.t.c(this.paymentAmount, generic.paymentAmount) && this.shouldBackToDetails == generic.shouldBackToDetails && fr.t.c(this.dialog, generic.dialog);
                }

                @Override // y42.f.b
                /* JADX INFO: renamed from: f, reason: from getter */
                public boolean getShouldBackToDetails() {
                    return this.shouldBackToDetails;
                }

                @Override // y42.f.b.a
                public Label getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    Label label = this.title;
                    int iHashCode = (label == null ? 0 : label.hashCode()) * 31;
                    Label label2 = this.message;
                    int iHashCode2 = (((((((((iHashCode + (label2 == null ? 0 : label2.hashCode())) * 31) + this.paymentId.hashCode()) * 31) + this.paymentTitle.hashCode()) * 31) + this.paymentAmount.hashCode()) * 31) + Boolean.hashCode(this.shouldBackToDetails)) * 31;
                    cb4.i iVar = this.dialog;
                    return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
                }

                public String toString() {
                    return "Generic(title=" + this.title + ", message=" + this.message + ", paymentId=" + this.paymentId + ", paymentTitle=" + this.paymentTitle + ", paymentAmount=" + this.paymentAmount + ", shouldBackToDetails=" + this.shouldBackToDetails + ", dialog=" + this.dialog + ')';
                }

                public /* synthetic */ Generic(Label label, Label label2, String str, Label label3, Label label4, boolean z15, cb4.i iVar, int i15, fr.k kVar) {
                    this(label, label2, str, label3, label4, z15, (i15 & 64) != 0 ? null : iVar);
                }
            }
        }
    }
}
