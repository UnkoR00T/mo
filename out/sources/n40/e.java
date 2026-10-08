package n40;

import er.l;
import fr.k;
import fr.t;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Set;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Ln40/e;", "", "Lmx/a;", "a", "()Lmx/a;", AnnotatedPrivateKey.LABEL, "", "getContentDescription", "()Ljava/lang/String;", "contentDescription", "b", "d", "c", "Ln40/e$a;", "Ln40/e$b;", "Ln40/e$c;", "Ln40/e$d;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: n40.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0012\u0010\u001cR\u001a\u0010 \u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\t¨\u0006\""}, d2 = {"Ln40/e$a;", "Ln40/e;", "", "Lwx/d;", "formats", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "getFormats", "()Ljava/util/Set;", "b", "Ljava/lang/String;", "extensions", "Lmx/a;", "c", "Lmx/a;", "()Lmx/a;", AnnotatedPrivateKey.LABEL, "d", "getContentDescription", "contentDescription", "e", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllowedFormats implements e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final C3253a f131332e = new C3253a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f131333f = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<wx.d> formats;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String extensions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Label label;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String contentDescription;

        /* JADX INFO: renamed from: n40.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln40/e$a$a;", "", "<init>", "()V", "", "SEPARATOR", "Ljava/lang/String;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class C3253a {
            public /* synthetic */ C3253a(k kVar) {
                this();
            }

            private C3253a() {
            }
        }

        /* JADX INFO: renamed from: n40.e$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b implements l<wx.d, CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f131338a = new b();

            b() {
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ CharSequence b(wx.d dVar) {
                return c(dVar.getValue());
            }

            public final CharSequence c(String str) {
                return '.' + str;
            }
        }

        public AllowedFormats(Set<wx.d> set) {
            this.formats = set;
            String strV0 = v.v0(set, ", ", null, null, 0, null, b.f131338a, 30, null);
            this.extensions = strV0;
            c70.a aVar = c70.a.f23835a;
            this.label = aVar.a().r(strV0);
            this.contentDescription = aVar.a().r(strV0.toUpperCase(Locale.ROOT)).getText();
        }

        @Override // n40.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AllowedFormats) && t.c(this.formats, ((AllowedFormats) other).formats);
        }

        @Override // n40.e
        public String getContentDescription() {
            return this.contentDescription;
        }

        public int hashCode() {
            return this.formats.hashCode();
        }

        public String toString() {
            return "AllowedFormats(formats=" + this.formats + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0003\r\u0007\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln40/e$b;", "Ln40/e;", "Lxw/a;", "size", "<init>", "(F)V", "", "c", "(F)F", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "formattedSize", "Ln40/e$b$b;", "Ln40/e$b$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f131339b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String formattedSize;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln40/e$b$a;", "", "<init>", "()V", "", "BYTES_TO_MB_DIVIDER", "F", "", "SIZE_FORMAT", "Ljava/lang/String;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(k kVar) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: n40.e$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Ln40/e$b$b;", "Ln40/e$b;", "Lxw/a;", "size", "<init>", "(FLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getSize-2gi_QKo", "()F", "Lmx/a;", "d", "Lmx/a;", "a", "()Lmx/a;", AnnotatedPrivateKey.LABEL, "e", "Ljava/lang/String;", "getContentDescription", "contentDescription", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class File extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final float size;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final Label label;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final String contentDescription;

            public /* synthetic */ File(float f15, k kVar) {
                this(f15);
            }

            @Override // n40.e
            /* JADX INFO: renamed from: a, reason: from getter */
            public Label getLabel() {
                return this.label;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof File) && xw.a.d(this.size, ((File) other).size);
            }

            @Override // n40.e
            public String getContentDescription() {
                return this.contentDescription;
            }

            public int hashCode() {
                return xw.a.e(this.size);
            }

            public String toString() {
                return "File(size=" + ((Object) xw.a.f(this.size)) + ')';
            }

            private File(float f15) {
                super(f15, null);
                this.size = f15;
                this.label = c70.a.f23835a.a().S(getFormattedSize());
                this.contentDescription = getLabel().getText();
            }
        }

        /* JADX INFO: renamed from: n40.e$b$c, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Ln40/e$b$c;", "Ln40/e$b;", "Lxw/a;", "size", "<init>", "(FLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getSize-2gi_QKo", "()F", "Lmx/a;", "d", "Lmx/a;", "a", "()Lmx/a;", AnnotatedPrivateKey.LABEL, "e", "Ljava/lang/String;", "getContentDescription", "contentDescription", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Total extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final float size;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final Label label;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final String contentDescription;

            public /* synthetic */ Total(float f15, k kVar) {
                this(f15);
            }

            @Override // n40.e
            /* JADX INFO: renamed from: a, reason: from getter */
            public Label getLabel() {
                return this.label;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Total) && xw.a.d(this.size, ((Total) other).size);
            }

            @Override // n40.e
            public String getContentDescription() {
                return this.contentDescription;
            }

            public int hashCode() {
                return xw.a.e(this.size);
            }

            public String toString() {
                return "Total(size=" + ((Object) xw.a.f(this.size)) + ')';
            }

            private Total(float f15) {
                super(f15, null);
                this.size = f15;
                this.label = c70.a.f23835a.a().i(getFormattedSize());
                this.contentDescription = getLabel().getText();
            }
        }

        public /* synthetic */ b(float f15, k kVar) {
            this(f15);
        }

        private final float c(float f15) {
            return f15 / 1000000.0f;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFormattedSize() {
            return this.formattedSize;
        }

        private b(float f15) {
            this.formattedSize = new DecimalFormat("#.##").format(Float.valueOf(c(f15)));
        }
    }

    /* JADX INFO: renamed from: n40.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\t¨\u0006\u001f"}, d2 = {"Ln40/e$c;", "Ln40/e;", "", "width", "height", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getWidth", "b", "getHeight", "Lmx/a;", "c", "Lmx/a;", "()Lmx/a;", AnnotatedPrivateKey.LABEL, "d", "Ljava/lang/String;", "getContentDescription", "contentDescription", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MinResolution implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Label label;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String contentDescription = getLabel().getText();

        public MinResolution(int i15, int i16) {
            this.width = i15;
            this.height = i16;
            this.label = c70.a.f23835a.a().s0(i15, i16);
        }

        @Override // n40.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MinResolution)) {
                return false;
            }
            MinResolution minResolution = (MinResolution) other;
            return this.width == minResolution.width && this.height == minResolution.height;
        }

        @Override // n40.e
        public String getContentDescription() {
            return this.contentDescription;
        }

        public int hashCode() {
            return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "MinResolution(width=" + this.width + ", height=" + this.height + ')';
        }
    }

    /* JADX INFO: renamed from: n40.e$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Ln40/e$d;", "Ln40/e;", "", "limit", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getLimit", "Lmx/a;", "b", "Lmx/a;", "()Lmx/a;", AnnotatedPrivateKey.LABEL, "c", "Ljava/lang/String;", "getContentDescription", "contentDescription", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectionLimit implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int limit;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String contentDescription = getLabel().getText();

        public SelectionLimit(int i15) {
            this.limit = i15;
            this.label = c70.a.f23835a.a().w(i15);
        }

        @Override // n40.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectionLimit) && this.limit == ((SelectionLimit) other).limit;
        }

        @Override // n40.e
        public String getContentDescription() {
            return this.contentDescription;
        }

        public int hashCode() {
            return Integer.hashCode(this.limit);
        }

        public String toString() {
            return "SelectionLimit(limit=" + this.limit + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    Label getLabel();

    String getContentDescription();
}
