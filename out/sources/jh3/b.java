package jh3;

import android.graphics.Bitmap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ljh3/b;", "", "b", "a", "d", "c", "Ljh3/b$a;", "Ljh3/b$b;", "Ljh3/b$c;", "Ljh3/b$d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: jh3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Ljh3/b$a;", "Ljh3/b;", "Lgu/b;", "startTime", "leftTime", "", "code", "Landroid/graphics/Bitmap;", "qrCodeBitmap", "", "progress", "<init>", "(JJLjava/lang/String;Landroid/graphics/Bitmap;FLfr/k;)V", "a", "(JJLjava/lang/String;Landroid/graphics/Bitmap;F)Ljh3/b$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "g", "()J", "b", "d", "c", "Ljava/lang/String;", "Landroid/graphics/Bitmap;", "f", "()Landroid/graphics/Bitmap;", "e", "F", "()F", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long leftTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap qrCodeBitmap;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float progress;

        public /* synthetic */ Content(long j15, long j16, String str, Bitmap bitmap, float f15, fr.k kVar) {
            this(j15, j16, str, bitmap, f15);
        }

        public static /* synthetic */ Content b(Content content, long j15, long j16, String str, Bitmap bitmap, float f15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                j15 = content.startTime;
            }
            long j17 = j15;
            if ((i15 & 2) != 0) {
                j16 = content.leftTime;
            }
            long j18 = j16;
            if ((i15 & 4) != 0) {
                str = content.code;
            }
            String str2 = str;
            if ((i15 & 8) != 0) {
                bitmap = content.qrCodeBitmap;
            }
            Bitmap bitmap2 = bitmap;
            if ((i15 & 16) != 0) {
                f15 = content.progress;
            }
            return content.a(j17, j18, str2, bitmap2, f15);
        }

        public final Content a(long startTime, long leftTime, String code, Bitmap qrCodeBitmap, float progress) {
            return new Content(startTime, leftTime, code, qrCodeBitmap, progress, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getLeftTime() {
            return this.leftTime;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return gu.b.v(this.startTime, content.startTime) && gu.b.v(this.leftTime, content.leftTime) && fr.t.c(this.code, content.code) && fr.t.c(this.qrCodeBitmap, content.qrCodeBitmap) && Float.compare(this.progress, content.progress) == 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Bitmap getQrCodeBitmap() {
            return this.qrCodeBitmap;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            return (((((((gu.b.N(this.startTime) * 31) + gu.b.N(this.leftTime)) * 31) + this.code.hashCode()) * 31) + this.qrCodeBitmap.hashCode()) * 31) + Float.hashCode(this.progress);
        }

        public String toString() {
            return "Content(startTime=" + ((Object) gu.b.d0(this.startTime)) + ", leftTime=" + ((Object) gu.b.d0(this.leftTime)) + ", code=" + this.code + ", qrCodeBitmap=" + this.qrCodeBitmap + ", progress=" + this.progress + ')';
        }

        private Content(long j15, long j16, String str, Bitmap bitmap, float f15) {
            this.startTime = j15;
            this.leftTime = j16;
            this.code = str;
            this.qrCodeBitmap = bitmap;
            this.progress = f15;
        }
    }

    /* JADX INFO: renamed from: jh3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljh3/b$b;", "Ljh3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C2433b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2433b f103035a = new C2433b();

        private C2433b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C2433b);
        }

        public int hashCode() {
            return -2137746572;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* JADX INFO: renamed from: jh3.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljh3/b$c;", "Ljh3/b;", "Lhb4/c;", "adapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c adapter;

        public Error(hb4.c cVar) {
            this.adapter = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getAdapter() {
            return this.adapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fr.t.c(this.adapter, ((Error) other).adapter);
        }

        public int hashCode() {
            return this.adapter.hashCode();
        }

        public String toString() {
            return "Error(adapter=" + this.adapter + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljh3/b$d;", "Ljh3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f103037a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -1009432348;
        }

        public String toString() {
            return "Inactive";
        }
    }
}
