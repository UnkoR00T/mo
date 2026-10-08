package ai3;

import android.graphics.Bitmap;
import java.util.List;
import p071kotlin.Metadata;
import sv0.FileImageConfiguration;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lai3/b;", "", "a", "b", "Lai3/b$a;", "Lai3/b$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lai3/b$a;", "Lai3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6447a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1239728442;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: ai3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB)\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lai3/b$b;", "Lai3/b;", "", "Lai3/b$b$a;", "thumbnails", "Lsv0/q;", "fileImageConfiguration", "Lg30/v;", "bottomSheetValue", "<init>", "(Ljava/util/List;Lsv0/q;Lg30/v;)V", "a", "(Ljava/util/List;Lsv0/q;Lg30/v;)Lai3/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lsv0/q;", "d", "()Lsv0/q;", "c", "Lg30/v;", "()Lg30/v;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a> thumbnails;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileImageConfiguration fileImageConfiguration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v bottomSheetValue;

        /* JADX INFO: renamed from: ai3.b$b$a */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lai3/b$b$a;", "", "Lo04/c;", "file", "Landroid/graphics/Bitmap;", "bitmap", "", "name", "<init>", "(Lo04/c;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "a", "Lo04/c;", "b", "()Lo04/c;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final o04.c file;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Bitmap bitmap;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String name;

            public a(o04.c cVar, Bitmap bitmap, String str) {
                this.file = cVar;
                this.bitmap = bitmap;
                this.name = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Bitmap getBitmap() {
                return this.bitmap;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final o04.c getFile() {
                return this.file;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getName() {
                return this.name;
            }
        }

        public Initialized(List<a> list, FileImageConfiguration fileImageConfiguration, g30.v vVar) {
            this.thumbnails = list;
            this.fileImageConfiguration = fileImageConfiguration;
            this.bottomSheetValue = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, FileImageConfiguration fileImageConfiguration, g30.v vVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.thumbnails;
            }
            if ((i15 & 2) != 0) {
                fileImageConfiguration = initialized.fileImageConfiguration;
            }
            if ((i15 & 4) != 0) {
                vVar = initialized.bottomSheetValue;
            }
            return initialized.a(list, fileImageConfiguration, vVar);
        }

        public final Initialized a(List<a> thumbnails, FileImageConfiguration fileImageConfiguration, g30.v bottomSheetValue) {
            return new Initialized(thumbnails, fileImageConfiguration, bottomSheetValue);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final FileImageConfiguration getFileImageConfiguration() {
            return this.fileImageConfiguration;
        }

        public final List<a> e() {
            return this.thumbnails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.thumbnails, initialized.thumbnails) && fr.t.c(this.fileImageConfiguration, initialized.fileImageConfiguration) && this.bottomSheetValue == initialized.bottomSheetValue;
        }

        public int hashCode() {
            return (((this.thumbnails.hashCode() * 31) + this.fileImageConfiguration.hashCode()) * 31) + this.bottomSheetValue.hashCode();
        }

        public String toString() {
            return "Initialized(thumbnails=" + this.thumbnails + ", fileImageConfiguration=" + this.fileImageConfiguration + ", bottomSheetValue=" + this.bottomSheetValue + ')';
        }

        public /* synthetic */ Initialized(List list, FileImageConfiguration fileImageConfiguration, g30.v vVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? pq.v.n() : list, fileImageConfiguration, (i15 & 4) != 0 ? g30.v.HIDDEN : vVar);
        }
    }
}
