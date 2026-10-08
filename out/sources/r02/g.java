package r02;

import android.net.Uri;
import dx.i;
import fr.k;
import fr.t;
import fu.r;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u0018B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lr02/g;", "", "Lr02/g$b;", "Loq/i0;", "Laz/f;", "fileDataManager", "Lmx/c;", "labelProvider", "Lzz/f;", "fileTypeMapper", "<init>", "(Laz/f;Lmx/c;Lzz/f;)V", "", "Lwx/d;", "g", "(Ljava/lang/String;)Ljava/lang/String;", "Ldx/b$c;", "e", "()Ldx/b$c;", "params", "Ldx/i;", "Ldx/b;", "f", "(Lr02/g$b;Ltq/e;)Ljava/lang/Object;", "a", "Laz/f;", "b", "Lmx/c;", "c", "Lzz/f;", "d", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f170225e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<wx.d, wx.f> f170226f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final az.f fileDataManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zz.f fileTypeMapper;

    /* JADX INFO: renamed from: r02.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr02/g$a;", "", "<init>", "()V", "", "Lwx/d;", "Lwx/f;", "EXTENSION_FILE_TYPE_MAP", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Map<wx.d, wx.f> a() {
            return g.f170226f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: r02.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lr02/g$b;", "Lgz/b$a;", "Landroid/net/Uri;", "fileUri", "", "fullName", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "b", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Uri fileUri;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullName;

        public Params(Uri uri, String str) {
            this.fileUri = uri;
            this.fullName = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getFileUri() {
            return this.fileUri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.fileUri, params.fileUri) && t.c(this.fullName, params.fullName);
        }

        public int hashCode() {
            return (this.fileUri.hashCode() * 31) + this.fullName.hashCode();
        }

        public String toString() {
            return "Params(fileUri=" + this.fileUri + ", fullName=" + this.fullName + ')';
        }
    }

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        f170226f = v0.l(y.a(wx.d.j0(companion.W()), wx.f.TXT), y.a(wx.d.j0(companion.L()), wx.f.PPT), y.a(wx.d.j0(companion.P()), wx.f.RTF), y.a(wx.d.j0(companion.i()), wx.f.DOCX), y.a(wx.d.j0(companion.K()), wx.f.PNG), y.a(wx.d.j0(companion.p()), wx.f.GZIP), y.a(wx.d.j0(companion.g0()), wx.f.XSD), y.a(wx.d.j0(companion.t()), wx.f.JP2), y.a(wx.d.j0(companion.g()), wx.f.DGN), y.a(wx.d.j0(companion.l()), wx.f.DXF), y.a(wx.d.j0(companion.k()), wx.f.DWG), y.a(wx.d.j0(companion.d0()), wx.f.XMLENC), y.a(wx.d.j0(companion.b()), wx.f.ASIC), y.a(wx.d.j0(companion.O()), wx.f.RNG), y.a(wx.d.j0(companion.h0()), wx.f.XSL), y.a(wx.d.j0(companion.i0()), wx.f.XSLT), y.a(wx.d.j0(companion.J()), wx.f.PDF), y.a(wx.d.j0(companion.a0()), wx.f.XLS), y.a(wx.d.j0(companion.b0()), wx.f.XLSX), y.a(wx.d.j0(companion.R()), wx.f.SVG), y.a(wx.d.j0(companion.Q()), wx.f.SEVEN_Z), y.a(wx.d.j0(companion.f0()), wx.f.XPS), y.a(wx.d.j0(companion.M()), wx.f.PPTX), y.a(wx.d.j0(companion.X()), wx.f.WAV), y.a(wx.d.j0(companion.w()), wx.f.M4A), y.a(wx.d.j0(companion.o()), wx.f.GZ), y.a(wx.d.j0(companion.s()), wx.f.HTML), y.a(wx.d.j0(companion.Z()), wx.f.XHTML), y.a(wx.d.j0(companion.F()), wx.f.ODT), y.a(wx.d.j0(companion.f()), wx.f.CSV), y.a(wx.d.j0(companion.y()), wx.f.MP3), y.a(wx.d.j0(companion.B()), wx.f.MPEG4), y.a(wx.d.j0(companion.E()), wx.f.ODS), y.a(wx.d.j0(companion.v()), wx.f.JPG), y.a(wx.d.j0(companion.c()), wx.f.AVI), y.a(wx.d.j0(companion.G()), wx.f.OGG), y.a(wx.d.j0(companion.n()), wx.f.GML), y.a(wx.d.j0(companion.m()), wx.f.GEOTIFF), y.a(wx.d.j0(companion.D()), wx.f.ODP), y.a(wx.d.j0(companion.u()), wx.f.JPEG), y.a(wx.d.j0(companion.C()), wx.f.MPG), y.a(wx.d.j0(companion.H()), wx.f.OGV), y.a(wx.d.j0(companion.h()), wx.f.DOC), y.a(wx.d.j0(companion.T()), wx.f.TIF), y.a(wx.d.j0(companion.A()), wx.f.MPEG), y.a(wx.d.j0(companion.j0()), wx.f.ZIP), y.a(wx.d.j0(companion.U()), wx.f.TIFF), y.a(wx.d.j0(companion.z()), wx.f.MP4), y.a(wx.d.j0(companion.S()), wx.f.TAR), y.a(wx.d.j0(companion.Y()), wx.f.XADES), y.a(wx.d.j0(companion.d()), wx.f.CADES), y.a(wx.d.j0(companion.e()), wx.f.CSS), y.a(wx.d.j0(companion.j()), wx.f.DWF), y.a(wx.d.j0(companion.I()), wx.f.PADES), y.a(wx.d.j0(companion.V()), wx.f.TSL), y.a(wx.d.j0(companion.e0()), wx.f.XMLSIG), y.a(wx.d.j0(companion.c0()), wx.f.XML));
    }

    public g(az.f fVar, mx.c cVar, zz.f fVar2) {
        this.fileDataManager = fVar;
        this.labelProvider = cVar;
        this.fileTypeMapper = fVar2;
    }

    private final dx.b.Business e() {
        return new dx.b.Business(null, null, this.labelProvider.c(e02.a.H), this.labelProvider.c(e02.a.f46502b), null, this.labelProvider.c(e02.a.f46550j), null, 83, null);
    }

    private final String g(String str) {
        return wx.d.k0(r.i1(str, ".", "").toLowerCase(Locale.ROOT));
    }

    public Object f(Params params, tq.e<? super i<? extends dx.b, i0>> eVar) {
        wx.f fVar = f170226f.get(wx.d.j0(g(params.getFullName())));
        List<? extends String> listB = fVar != null ? this.fileTypeMapper.b(new zz.f.Params(fVar)) : null;
        return (listB == null || !v.c0(listB, this.fileDataManager.i(params.getFileUri().toString()))) ? new i.Left(e()) : new i.Right(i0.f148189a);
    }
}
