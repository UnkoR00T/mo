package hw3;

import dx.i;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import tq.e;
import wx.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\t\u000bJ,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lhw3/a;", "", "Lhw3/a$a;", "photoData", "Lhw3/a$b;", "requirements", "Ldx/i;", "Ldx/b;", "Lwx/i$a;", "a", "(Lhw3/a$a;Lhw3/a$b;Ltq/e;)Ljava/lang/Object;", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: hw3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0016"}, d2 = {"Lhw3/a$a;", "", "", "fileName", "Lwx/d;", "extension", "absolutePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhotoData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String extension;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String absolutePath;

        public /* synthetic */ PhotoData(String str, String str2, String str3, k kVar) {
            this(str, str2, str3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAbsolutePath() {
            return this.absolutePath;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoData)) {
                return false;
            }
            PhotoData photoData = (PhotoData) other;
            return t.c(this.fileName, photoData.fileName) && d.m0(this.extension, photoData.extension) && t.c(this.absolutePath, photoData.absolutePath);
        }

        public int hashCode() {
            return (((this.fileName.hashCode() * 31) + d.n0(this.extension)) * 31) + this.absolutePath.hashCode();
        }

        public String toString() {
            return "PhotoData(fileName=" + this.fileName + ", extension=" + ((Object) d.o0(this.extension)) + ", absolutePath=" + this.absolutePath + ')';
        }

        private PhotoData(String str, String str2, String str3) {
            this.fileName = str;
            this.extension = str2;
            this.absolutePath = str3;
        }
    }

    /* JADX INFO: renamed from: hw3.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\r¨\u0006\u0018"}, d2 = {"Lhw3/a$b;", "", "Lxw/a;", "maxSize", "", "targetWidth", "targetHeight", "<init>", "(FIILfr/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "I", "c", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Requirements {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxSize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int targetWidth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int targetHeight;

        public /* synthetic */ Requirements(float f15, int i15, int i16, k kVar) {
            this(f15, i15, i16);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getMaxSize() {
            return this.maxSize;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTargetHeight() {
            return this.targetHeight;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTargetWidth() {
            return this.targetWidth;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Requirements)) {
                return false;
            }
            Requirements requirements = (Requirements) other;
            return xw.a.d(this.maxSize, requirements.maxSize) && this.targetWidth == requirements.targetWidth && this.targetHeight == requirements.targetHeight;
        }

        public int hashCode() {
            return (((xw.a.e(this.maxSize) * 31) + Integer.hashCode(this.targetWidth)) * 31) + Integer.hashCode(this.targetHeight);
        }

        public String toString() {
            return "Requirements(maxSize=" + ((Object) xw.a.f(this.maxSize)) + ", targetWidth=" + this.targetWidth + ", targetHeight=" + this.targetHeight + ')';
        }

        private Requirements(float f15, int i15, int i16) {
            this.maxSize = f15;
            this.targetWidth = i15;
            this.targetHeight = i16;
        }
    }

    Object a(PhotoData photoData, Requirements requirements, e<? super i<? extends dx.b, wx.i.Image>> eVar);
}
