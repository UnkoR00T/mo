package k34;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.x, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000e¨\u0006("}, d2 = {"Lk34/x;", "", "Lk34/w;", "pensionerCardDataModel", "Lk34/c;", "dataHeaderStandardModel", "Liy/b0;", "pensionerPhoto", "Ler0/h;", "status", "<init>", "(Lk34/w;Lk34/c;Liy/b0;Ler0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/w;", "b", "()Lk34/w;", "Lk34/c;", "()Lk34/c;", "c", "Liy/b0;", "getPensionerPhoto", "()Liy/b0;", "d", "Ler0/h;", "getStatus", "()Ler0/h;", "e", "Ljava/lang/String;", "getNames", "names", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PensionerCardDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PensionerCardDataModel pensionerCardDataModel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataHeaderStandardModel dataHeaderStandardModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 pensionerPhoto;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er0.h status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String names;

    public PensionerCardDocumentData(PensionerCardDataModel pensionerCardDataModel, DataHeaderStandardModel dataHeaderStandardModel, iy.b0 b0Var, er0.h hVar) {
        this.pensionerCardDataModel = pensionerCardDataModel;
        this.dataHeaderStandardModel = dataHeaderStandardModel;
        this.pensionerPhoto = b0Var;
        this.status = hVar;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(pensionerCardDataModel.getFirstName());
        String secondName = pensionerCardDataModel.getSecondName();
        if (secondName != null) {
            sb5.append(" ");
            sb5.append(secondName);
        }
        this.names = sb5.toString();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DataHeaderStandardModel getDataHeaderStandardModel() {
        return this.dataHeaderStandardModel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PensionerCardDataModel getPensionerCardDataModel() {
        return this.pensionerCardDataModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PensionerCardDocumentData)) {
            return false;
        }
        PensionerCardDocumentData pensionerCardDocumentData = (PensionerCardDocumentData) other;
        return fr.t.c(this.pensionerCardDataModel, pensionerCardDocumentData.pensionerCardDataModel) && fr.t.c(this.dataHeaderStandardModel, pensionerCardDocumentData.dataHeaderStandardModel) && fr.t.c(this.pensionerPhoto, pensionerCardDocumentData.pensionerPhoto) && this.status == pensionerCardDocumentData.status;
    }

    public int hashCode() {
        int iHashCode = ((this.pensionerCardDataModel.hashCode() * 31) + this.dataHeaderStandardModel.hashCode()) * 31;
        iy.b0 b0Var = this.pensionerPhoto;
        return ((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "PensionerCardDocumentData(pensionerCardDataModel=" + this.pensionerCardDataModel + ", dataHeaderStandardModel=" + this.dataHeaderStandardModel + ", pensionerPhoto=" + this.pensionerPhoto + ", status=" + this.status + ")";
    }

    public /* synthetic */ PensionerCardDocumentData(PensionerCardDataModel pensionerCardDataModel, DataHeaderStandardModel dataHeaderStandardModel, iy.b0 b0Var, er0.h hVar, int i15, fr.k kVar) {
        this(pensionerCardDataModel, dataHeaderStandardModel, (i15 & 4) != 0 ? null : b0Var, (i15 & 8) != 0 ? er0.h.INACTIVE : hVar);
    }
}
