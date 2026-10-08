package ps2;

import ns2.PensionerCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lps2/k;", "", "b", "a", "Lps2/k$a;", "Lps2/k$b;", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    /* JADX INFO: renamed from: ps2.k$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lps2/k$a;", "Lps2/k;", "Lns2/e;", "pensionerCardDocumentData", "", "zusServiceAvailable", "", "documentShortName", "Lbv3/a;", "documentCardVMSAdapter", "<init>", "(Lns2/e;ZLjava/lang/String;Lbv3/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lns2/e;", "c", "()Lns2/e;", "b", "Z", "d", "()Z", "Ljava/lang/String;", "Lbv3/a;", "()Lbv3/a;", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataSet implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PensionerCardData pensionerCardDocumentData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean zusServiceAvailable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final bv3.a documentCardVMSAdapter;

        public DataSet(PensionerCardData pensionerCardData, boolean z15, String str, bv3.a aVar) {
            this.pensionerCardDocumentData = pensionerCardData;
            this.zusServiceAvailable = z15;
            this.documentShortName = str;
            this.documentCardVMSAdapter = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final bv3.a getDocumentCardVMSAdapter() {
            return this.documentCardVMSAdapter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PensionerCardData getPensionerCardDocumentData() {
            return this.pensionerCardDocumentData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getZusServiceAvailable() {
            return this.zusServiceAvailable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataSet)) {
                return false;
            }
            DataSet dataSet = (DataSet) other;
            return fr.t.c(this.pensionerCardDocumentData, dataSet.pensionerCardDocumentData) && this.zusServiceAvailable == dataSet.zusServiceAvailable && fr.t.c(this.documentShortName, dataSet.documentShortName) && fr.t.c(this.documentCardVMSAdapter, dataSet.documentCardVMSAdapter);
        }

        public int hashCode() {
            int iHashCode = ((this.pensionerCardDocumentData.hashCode() * 31) + Boolean.hashCode(this.zusServiceAvailable)) * 31;
            String str = this.documentShortName;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.documentCardVMSAdapter.hashCode();
        }

        public String toString() {
            return "DataSet(pensionerCardDocumentData=" + this.pensionerCardDocumentData + ", zusServiceAvailable=" + this.zusServiceAvailable + ", documentShortName=" + this.documentShortName + ", documentCardVMSAdapter=" + this.documentCardVMSAdapter + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lps2/k$b;", "Lps2/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f162292a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1847347101;
        }

        public String toString() {
            return "Initial";
        }
    }
}
