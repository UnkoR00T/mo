package gw2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gw2.n, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lgw2/n;", "", "Lzz/h;", "pickedFile", "", "isEnabled", "isValid", "bringIntoViewRequest", "<init>", "(Lzz/h;ZZZ)V", "a", "(Lzz/h;ZZZ)Lgw2/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzz/h;", "d", "()Lzz/h;", "b", "Z", "e", "()Z", "c", "f", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UploaderState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final zz.h pickedFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean bringIntoViewRequest;

    public UploaderState(zz.h hVar, boolean z15, boolean z16, boolean z17) {
        this.pickedFile = hVar;
        this.isEnabled = z15;
        this.isValid = z16;
        this.bringIntoViewRequest = z17;
    }

    public static /* synthetic */ UploaderState b(UploaderState uploaderState, zz.h hVar, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            hVar = uploaderState.pickedFile;
        }
        if ((i15 & 2) != 0) {
            z15 = uploaderState.isEnabled;
        }
        if ((i15 & 4) != 0) {
            z16 = uploaderState.isValid;
        }
        if ((i15 & 8) != 0) {
            z17 = uploaderState.bringIntoViewRequest;
        }
        return uploaderState.a(hVar, z15, z16, z17);
    }

    public final UploaderState a(zz.h pickedFile, boolean isEnabled, boolean isValid, boolean bringIntoViewRequest) {
        return new UploaderState(pickedFile, isEnabled, isValid, bringIntoViewRequest);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getBringIntoViewRequest() {
        return this.bringIntoViewRequest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final zz.h getPickedFile() {
        return this.pickedFile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploaderState)) {
            return false;
        }
        UploaderState uploaderState = (UploaderState) other;
        return fr.t.c(this.pickedFile, uploaderState.pickedFile) && this.isEnabled == uploaderState.isEnabled && this.isValid == uploaderState.isValid && this.bringIntoViewRequest == uploaderState.bringIntoViewRequest;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public int hashCode() {
        zz.h hVar = this.pickedFile;
        return ((((((hVar == null ? 0 : hVar.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isValid)) * 31) + Boolean.hashCode(this.bringIntoViewRequest);
    }

    public String toString() {
        return "UploaderState(pickedFile=" + this.pickedFile + ", isEnabled=" + this.isEnabled + ", isValid=" + this.isValid + ", bringIntoViewRequest=" + this.bringIntoViewRequest + ')';
    }

    public /* synthetic */ UploaderState(zz.h hVar, boolean z15, boolean z16, boolean z17, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : hVar, z15, (i15 & 4) != 0 ? true : z16, (i15 & 8) != 0 ? false : z17);
    }
}
