package v12;

import eo0.BEDictionaryAdditionalInformation;
import eo0.Recipient;
import eo0.g0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lv12/b;", "", "b", "a", "Lv12/b$a;", "Lv12/b$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv12/b$a;", "Lv12/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f203046a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1633448579;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: v12.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b%\u0010*R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b+\u0010(¨\u0006,"}, d2 = {"Lv12/b$b;", "Lv12/b;", "", "Leo0/k0;", "recipients", "Lhz/b;", "validationState", "Leo0/g0;", "draftMessageId", "", "isLoading", "Leo0/h;", "messageRecipientsInfo", "showGeneralAlert", "<init>", "(Ljava/util/List;Lhz/b;Ljava/lang/String;ZLeo0/h;ZLfr/k;)V", "a", "(Ljava/util/List;Lhz/b;Ljava/lang/String;ZLeo0/h;Z)Lv12/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lhz/b;", "g", "()Lhz/b;", "c", "Ljava/lang/String;", "d", "Z", "h", "()Z", "Leo0/h;", "()Leo0/h;", "f", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C5281b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<Recipient> recipients;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final hz.b validationState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String draftMessageId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean isLoading;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final BEDictionaryAdditionalInformation messageRecipientsInfo;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean showGeneralAlert;

        public /* synthetic */ C5281b(List list, hz.b bVar, String str, boolean z15, BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation, boolean z16, fr.k kVar) {
            this(list, bVar, str, z15, bEDictionaryAdditionalInformation, z16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C5281b b(C5281b c5281b, List list, hz.b bVar, String str, boolean z15, BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = c5281b.recipients;
            }
            if ((i15 & 2) != 0) {
                bVar = c5281b.validationState;
            }
            if ((i15 & 4) != 0) {
                str = c5281b.draftMessageId;
            }
            if ((i15 & 8) != 0) {
                z15 = c5281b.isLoading;
            }
            if ((i15 & 16) != 0) {
                bEDictionaryAdditionalInformation = c5281b.messageRecipientsInfo;
            }
            if ((i15 & 32) != 0) {
                z16 = c5281b.showGeneralAlert;
            }
            BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation2 = bEDictionaryAdditionalInformation;
            boolean z17 = z16;
            return c5281b.a(list, bVar, str, z15, bEDictionaryAdditionalInformation2, z17);
        }

        public final C5281b a(List<Recipient> recipients, hz.b validationState, String draftMessageId, boolean isLoading, BEDictionaryAdditionalInformation messageRecipientsInfo, boolean showGeneralAlert) {
            return new C5281b(recipients, validationState, draftMessageId, isLoading, messageRecipientsInfo, showGeneralAlert, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDraftMessageId() {
            return this.draftMessageId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BEDictionaryAdditionalInformation getMessageRecipientsInfo() {
            return this.messageRecipientsInfo;
        }

        public final List<Recipient> e() {
            return this.recipients;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x002c  */
        public boolean equals(Object other) {
            boolean zD;
            if (this == other) {
                return true;
            }
            if (!(other instanceof C5281b)) {
                return false;
            }
            C5281b c5281b = (C5281b) other;
            if (!fr.t.c(this.recipients, c5281b.recipients) || !fr.t.c(this.validationState, c5281b.validationState)) {
                return false;
            }
            String str = this.draftMessageId;
            String str2 = c5281b.draftMessageId;
            if (str == null) {
                if (str2 == null) {
                    zD = true;
                } else {
                    zD = false;
                }
            } else if (str2 == null) {
                zD = false;
            } else {
                zD = g0.d(str, str2);
            }
            return zD && this.isLoading == c5281b.isLoading && fr.t.c(this.messageRecipientsInfo, c5281b.messageRecipientsInfo) && this.showGeneralAlert == c5281b.showGeneralAlert;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShowGeneralAlert() {
            return this.showGeneralAlert;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public int hashCode() {
            int iHashCode = ((this.recipients.hashCode() * 31) + this.validationState.hashCode()) * 31;
            String str = this.draftMessageId;
            int iE = (((iHashCode + (str == null ? 0 : g0.e(str))) * 31) + Boolean.hashCode(this.isLoading)) * 31;
            BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation = this.messageRecipientsInfo;
            return ((iE + (bEDictionaryAdditionalInformation != null ? bEDictionaryAdditionalInformation.hashCode() : 0)) * 31) + Boolean.hashCode(this.showGeneralAlert);
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Initialized(recipients=");
            sb5.append(this.recipients);
            sb5.append(", validationState=");
            sb5.append(this.validationState);
            sb5.append(", draftMessageId=");
            String str = this.draftMessageId;
            sb5.append((Object) (str == null ? "null" : g0.f(str)));
            sb5.append(", isLoading=");
            sb5.append(this.isLoading);
            sb5.append(", messageRecipientsInfo=");
            sb5.append(this.messageRecipientsInfo);
            sb5.append(", showGeneralAlert=");
            sb5.append(this.showGeneralAlert);
            sb5.append(')');
            return sb5.toString();
        }

        private C5281b(List<Recipient> list, hz.b bVar, String str, boolean z15, BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation, boolean z16) {
            this.recipients = list;
            this.validationState = bVar;
            this.draftMessageId = str;
            this.isLoading = z15;
            this.messageRecipientsInfo = bEDictionaryAdditionalInformation;
            this.showGeneralAlert = z16;
        }

        public /* synthetic */ C5281b(List list, hz.b bVar, String str, boolean z15, BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation, boolean z16, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? pq.v.n() : list, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar, str, (i15 & 8) != 0 ? true : z15, bEDictionaryAdditionalInformation, (i15 & 32) != 0 ? true : z16, null);
        }
    }
}
