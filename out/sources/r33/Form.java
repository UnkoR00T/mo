package r33;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: r33.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lr33/c;", "", "", "productName", "Lhz/b;", "productNameValidation", "batchNumber", "batchNumberValidation", "productExpiryDate", "productExpiryDateValidation", "<init>", "(Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;)V", "a", "(Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;)Lr33/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "Lhz/b;", "h", "()Lhz/b;", "c", "d", "e", "f", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Form {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f171367g = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b productNameValidation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String batchNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b batchNumberValidation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productExpiryDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b productExpiryDateValidation;

    public Form() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Form b(Form form, String str, hz.b bVar, String str2, hz.b bVar2, String str3, hz.b bVar3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = form.productName;
        }
        if ((i15 & 2) != 0) {
            bVar = form.productNameValidation;
        }
        if ((i15 & 4) != 0) {
            str2 = form.batchNumber;
        }
        if ((i15 & 8) != 0) {
            bVar2 = form.batchNumberValidation;
        }
        if ((i15 & 16) != 0) {
            str3 = form.productExpiryDate;
        }
        if ((i15 & 32) != 0) {
            bVar3 = form.productExpiryDateValidation;
        }
        String str4 = str3;
        hz.b bVar4 = bVar3;
        return form.a(str, bVar, str2, bVar2, str4, bVar4);
    }

    public final Form a(String productName, hz.b productNameValidation, String batchNumber, hz.b batchNumberValidation, String productExpiryDate, hz.b productExpiryDateValidation) {
        return new Form(productName, productNameValidation, batchNumber, batchNumberValidation, productExpiryDate, productExpiryDateValidation);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBatchNumber() {
        return this.batchNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getBatchNumberValidation() {
        return this.batchNumberValidation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductExpiryDate() {
        return this.productExpiryDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Form)) {
            return false;
        }
        Form form = (Form) other;
        return fr.t.c(this.productName, form.productName) && fr.t.c(this.productNameValidation, form.productNameValidation) && fr.t.c(this.batchNumber, form.batchNumber) && fr.t.c(this.batchNumberValidation, form.batchNumberValidation) && fr.t.c(this.productExpiryDate, form.productExpiryDate) && fr.t.c(this.productExpiryDateValidation, form.productExpiryDateValidation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.b getProductExpiryDateValidation() {
        return this.productExpiryDateValidation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final hz.b getProductNameValidation() {
        return this.productNameValidation;
    }

    public int hashCode() {
        return (((((((((this.productName.hashCode() * 31) + this.productNameValidation.hashCode()) * 31) + this.batchNumber.hashCode()) * 31) + this.batchNumberValidation.hashCode()) * 31) + this.productExpiryDate.hashCode()) * 31) + this.productExpiryDateValidation.hashCode();
    }

    public String toString() {
        return "Form(productName=" + this.productName + ", productNameValidation=" + this.productNameValidation + ", batchNumber=" + this.batchNumber + ", batchNumberValidation=" + this.batchNumberValidation + ", productExpiryDate=" + this.productExpiryDate + ", productExpiryDateValidation=" + this.productExpiryDateValidation + ')';
    }

    public Form(String str, hz.b bVar, String str2, hz.b bVar2, String str3, hz.b bVar3) {
        this.productName = str;
        this.productNameValidation = bVar;
        this.batchNumber = str2;
        this.batchNumberValidation = bVar2;
        this.productExpiryDate = str3;
        this.productExpiryDateValidation = bVar3;
    }

    public /* synthetic */ Form(String str, hz.b bVar, String str2, hz.b bVar2, String str3, hz.b bVar3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? hz.b.C2039b.f86846c : bVar3);
    }
}
