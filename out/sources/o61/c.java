package o61;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lo61/c;", "", "Lo61/c$a;", "getData", "()Lo61/c$a;", "data", "c", "b", "a", "Lo61/c$b;", "Lo61/c$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: o61.c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo61/c$b;", "Lo61/c;", "Lo61/c$a;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Lo61/c$a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo61/c$a;", "getData", "()Lo61/c$a;", "b", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Data data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(Data data, hb4.c cVar) {
            this.data = data;
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.data, error.data) && fr.t.c(this.errorVMS, error.errorVMS);
        }

        @Override // o61.c
        public Data getData() {
            return this.data;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(data=" + this.data + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: o61.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lo61/c$c;", "Lo61/c;", "Lo61/c$a;", "data", "<init>", "(Lo61/c$a;)V", "a", "(Lo61/c$a;)Lo61/c$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lo61/c$a;", "getData", "()Lo61/c$a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Presenting implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Data data;

        public Presenting(Data data) {
            this.data = data;
        }

        public final Presenting a(Data data) {
            return new Presenting(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Presenting) && fr.t.c(this.data, ((Presenting) other).data);
        }

        @Override // o61.c
        public Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Presenting(data=" + this.data + ')';
        }
    }

    Data getData();

    /* JADX INFO: renamed from: o61.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lo61/c$a;", "", "", "showImagePickerError", "Lzz/h$a;", "pickedFile", "scrollToImageSection", "isFaceCoveringPhotoOptionChecked", "isPhotoWithGlassesOptionChecked", "<init>", "(ZLzz/h$a;ZZZ)V", "a", "(ZLzz/h$a;ZZZ)Lo61/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "Lzz/h$a;", "c", "()Lzz/h$a;", "d", "f", "g", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

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

        public Data(boolean z15, zz.h.Image image, boolean z16, boolean z17, boolean z18) {
            this.showImagePickerError = z15;
            this.pickedFile = image;
            this.scrollToImageSection = z16;
            this.isFaceCoveringPhotoOptionChecked = z17;
            this.isPhotoWithGlassesOptionChecked = z18;
        }

        public static /* synthetic */ Data b(Data data, boolean z15, zz.h.Image image, boolean z16, boolean z17, boolean z18, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = data.showImagePickerError;
            }
            if ((i15 & 2) != 0) {
                image = data.pickedFile;
            }
            if ((i15 & 4) != 0) {
                z16 = data.scrollToImageSection;
            }
            if ((i15 & 8) != 0) {
                z17 = data.isFaceCoveringPhotoOptionChecked;
            }
            if ((i15 & 16) != 0) {
                z18 = data.isPhotoWithGlassesOptionChecked;
            }
            boolean z19 = z18;
            boolean z25 = z16;
            return data.a(z15, image, z25, z17, z19);
        }

        public final Data a(boolean showImagePickerError, zz.h.Image pickedFile, boolean scrollToImageSection, boolean isFaceCoveringPhotoOptionChecked, boolean isPhotoWithGlassesOptionChecked) {
            return new Data(showImagePickerError, pickedFile, scrollToImageSection, isFaceCoveringPhotoOptionChecked, isPhotoWithGlassesOptionChecked);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final zz.h.Image getPickedFile() {
            return this.pickedFile;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getScrollToImageSection() {
            return this.scrollToImageSection;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShowImagePickerError() {
            return this.showImagePickerError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return this.showImagePickerError == data.showImagePickerError && fr.t.c(this.pickedFile, data.pickedFile) && this.scrollToImageSection == data.scrollToImageSection && this.isFaceCoveringPhotoOptionChecked == data.isFaceCoveringPhotoOptionChecked && this.isPhotoWithGlassesOptionChecked == data.isPhotoWithGlassesOptionChecked;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsFaceCoveringPhotoOptionChecked() {
            return this.isFaceCoveringPhotoOptionChecked;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsPhotoWithGlassesOptionChecked() {
            return this.isPhotoWithGlassesOptionChecked;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.showImagePickerError) * 31;
            zz.h.Image image = this.pickedFile;
            return ((((((iHashCode + (image == null ? 0 : image.hashCode())) * 31) + Boolean.hashCode(this.scrollToImageSection)) * 31) + Boolean.hashCode(this.isFaceCoveringPhotoOptionChecked)) * 31) + Boolean.hashCode(this.isPhotoWithGlassesOptionChecked);
        }

        public String toString() {
            return "Data(showImagePickerError=" + this.showImagePickerError + ", pickedFile=" + this.pickedFile + ", scrollToImageSection=" + this.scrollToImageSection + ", isFaceCoveringPhotoOptionChecked=" + this.isFaceCoveringPhotoOptionChecked + ", isPhotoWithGlassesOptionChecked=" + this.isPhotoWithGlassesOptionChecked + ')';
        }

        public /* synthetic */ Data(boolean z15, zz.h.Image image, boolean z16, boolean z17, boolean z18, int i15, fr.k kVar) {
            this(z15, image, (i15 & 4) != 0 ? false : z16, z17, z18);
        }
    }
}
