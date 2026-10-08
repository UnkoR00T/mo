package jw2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jw2.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJN\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019¨\u0006\""}, d2 = {"Ljw2/c;", "", "", "showImagePickerError", "Lzz/h$a;", "pickedFile", "scrollToImageSection", "isFaceCoveringPhotoOptionChecked", "isPhotoWithGlassesOptionChecked", "identityPhotoEnabled", "<init>", "(ZLzz/h$a;ZZZZ)V", "a", "(ZLzz/h$a;ZZZZ)Ljw2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lzz/h$a;", "d", "()Lzz/h$a;", "c", "e", "g", "h", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showImagePickerError;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final zz.h.Image pickedFile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToImageSection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFaceCoveringPhotoOptionChecked;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPhotoWithGlassesOptionChecked;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean identityPhotoEnabled;

    public State(boolean z15, zz.h.Image image, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.showImagePickerError = z15;
        this.pickedFile = image;
        this.scrollToImageSection = z16;
        this.isFaceCoveringPhotoOptionChecked = z17;
        this.isPhotoWithGlassesOptionChecked = z18;
        this.identityPhotoEnabled = z19;
    }

    public static /* synthetic */ State b(State state, boolean z15, zz.h.Image image, boolean z16, boolean z17, boolean z18, boolean z19, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.showImagePickerError;
        }
        if ((i15 & 2) != 0) {
            image = state.pickedFile;
        }
        if ((i15 & 4) != 0) {
            z16 = state.scrollToImageSection;
        }
        if ((i15 & 8) != 0) {
            z17 = state.isFaceCoveringPhotoOptionChecked;
        }
        if ((i15 & 16) != 0) {
            z18 = state.isPhotoWithGlassesOptionChecked;
        }
        if ((i15 & 32) != 0) {
            z19 = state.identityPhotoEnabled;
        }
        boolean z25 = z18;
        boolean z26 = z19;
        return state.a(z15, image, z16, z17, z25, z26);
    }

    public final State a(boolean showImagePickerError, zz.h.Image pickedFile, boolean scrollToImageSection, boolean isFaceCoveringPhotoOptionChecked, boolean isPhotoWithGlassesOptionChecked, boolean identityPhotoEnabled) {
        return new State(showImagePickerError, pickedFile, scrollToImageSection, isFaceCoveringPhotoOptionChecked, isPhotoWithGlassesOptionChecked, identityPhotoEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIdentityPhotoEnabled() {
        return this.identityPhotoEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final zz.h.Image getPickedFile() {
        return this.pickedFile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getScrollToImageSection() {
        return this.scrollToImageSection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.showImagePickerError == state.showImagePickerError && fr.t.c(this.pickedFile, state.pickedFile) && this.scrollToImageSection == state.scrollToImageSection && this.isFaceCoveringPhotoOptionChecked == state.isFaceCoveringPhotoOptionChecked && this.isPhotoWithGlassesOptionChecked == state.isPhotoWithGlassesOptionChecked && this.identityPhotoEnabled == state.identityPhotoEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowImagePickerError() {
        return this.showImagePickerError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsFaceCoveringPhotoOptionChecked() {
        return this.isFaceCoveringPhotoOptionChecked;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsPhotoWithGlassesOptionChecked() {
        return this.isPhotoWithGlassesOptionChecked;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showImagePickerError) * 31;
        zz.h.Image image = this.pickedFile;
        return ((((((((iHashCode + (image == null ? 0 : image.hashCode())) * 31) + Boolean.hashCode(this.scrollToImageSection)) * 31) + Boolean.hashCode(this.isFaceCoveringPhotoOptionChecked)) * 31) + Boolean.hashCode(this.isPhotoWithGlassesOptionChecked)) * 31) + Boolean.hashCode(this.identityPhotoEnabled);
    }

    public String toString() {
        return "State(showImagePickerError=" + this.showImagePickerError + ", pickedFile=" + this.pickedFile + ", scrollToImageSection=" + this.scrollToImageSection + ", isFaceCoveringPhotoOptionChecked=" + this.isFaceCoveringPhotoOptionChecked + ", isPhotoWithGlassesOptionChecked=" + this.isPhotoWithGlassesOptionChecked + ", identityPhotoEnabled=" + this.identityPhotoEnabled + ')';
    }

    public /* synthetic */ State(boolean z15, zz.h.Image image, boolean z16, boolean z17, boolean z18, boolean z19, int i15, fr.k kVar) {
        this(z15, image, (i15 & 4) != 0 ? false : z16, z17, z18, z19);
    }
}
