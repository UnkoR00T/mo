package wx;

import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lwx/d;", "", "", "value", "k0", "(Ljava/lang/String;)Ljava/lang/String;", "o0", "", "n0", "(Ljava/lang/String;)I", "other", "", "l0", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f215658c = k0("jpg");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f215660d = k0("jpeg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f215662e = k0("png");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f215664f = k0("csv");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f215666g = k0("jp2");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f215668h = k0("svg");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f215670i = k0("heic");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f215672j = k0("heif");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f215674k = k0("pdf");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f215676l = k0("txt");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f215677m = k0("ppt");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f215678n = k0("rtf");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f215679o = k0("docx");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f215680p = k0("gzip");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f215681q = k0("xsd");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f215682r = k0("dgn");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f215683s = k0("dxf");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f215684t = k0("dwg");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f215685u = k0("xmlenc");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f215686v = k0("asic");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f215687w = k0("rng");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f215688x = k0("xsl");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f215689y = k0("xslt");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f215690z = k0("xls");
    private static final String A = k0("xlsx");
    private static final String B = k0("7z");
    private static final String C = k0("xps");
    private static final String D = k0("pptx");
    private static final String E = k0("wav");
    private static final String F = k0("m4a");
    private static final String G = k0("gz");
    private static final String H = k0("html");
    private static final String I = k0("xhtml");
    private static final String J = k0("odt");
    private static final String K = k0("mp3");
    private static final String L = k0("mpeg4");
    private static final String M = k0("ods");
    private static final String N = k0("avi");
    private static final String O = k0("ogg");
    private static final String P = k0("gml");
    private static final String Q = k0("geotiff");
    private static final String R = k0("odp");
    private static final String S = k0("mpg");
    private static final String T = k0("ogv");
    private static final String U = k0("doc");
    private static final String V = k0("tif");
    private static final String W = k0("mpeg");
    private static final String X = k0("zip");
    private static final String Y = k0("tiff");
    private static final String Z = k0("mp4");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f215655a0 = k0("tar");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f215657b0 = k0("xades");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f215659c0 = k0("cades");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f215661d0 = k0("css");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f215663e0 = k0("dwf");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f215665f0 = k0("pades");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f215667g0 = k0("tsl");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f215669h0 = k0("xmlsig");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f215671i0 = k0("xml");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f215673j0 = k0("rar");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f215675k0 = k0("mov");

    /* JADX INFO: renamed from: wx.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u007f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010!\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000eR\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000eR\u0017\u0010%\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u0017\u0010'\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\u000eR\u0017\u0010)\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010\u000eR\u0017\u0010+\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000eR\u0017\u0010-\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u000eR\u0017\u0010/\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b0\u0010\u000eR\u0017\u00101\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000eR\u0017\u00103\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u0010\f\u001a\u0004\b4\u0010\u000eR\u0017\u00105\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u0010\f\u001a\u0004\b6\u0010\u000eR\u0017\u00107\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u000eR\u0017\u00109\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b:\u0010\u000eR\u0017\u0010;\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010\u000eR\u0017\u0010=\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010\u000eR\u0017\u0010?\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b?\u0010\f\u001a\u0004\b@\u0010\u000eR\u0017\u0010A\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bB\u0010\u000eR\u0017\u0010C\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bC\u0010\f\u001a\u0004\bD\u0010\u000eR\u0017\u0010E\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bE\u0010\f\u001a\u0004\bF\u0010\u000eR\u0017\u0010G\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010\u000eR\u0017\u0010I\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bI\u0010\f\u001a\u0004\bJ\u0010\u000eR\u0017\u0010K\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bK\u0010\f\u001a\u0004\bL\u0010\u000eR\u0017\u0010M\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u0010\f\u001a\u0004\bN\u0010\u000eR\u0017\u0010O\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bP\u0010\u000eR\u0017\u0010Q\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bQ\u0010\f\u001a\u0004\bR\u0010\u000eR\u0017\u0010S\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bS\u0010\f\u001a\u0004\bT\u0010\u000eR\u0017\u0010U\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bU\u0010\f\u001a\u0004\bV\u0010\u000eR\u0017\u0010W\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bW\u0010\f\u001a\u0004\bX\u0010\u000eR\u0017\u0010Y\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bY\u0010\f\u001a\u0004\bZ\u0010\u000eR\u0017\u0010[\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b[\u0010\f\u001a\u0004\b\\\u0010\u000eR\u0017\u0010]\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b]\u0010\f\u001a\u0004\b^\u0010\u000eR\u0017\u0010_\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b_\u0010\f\u001a\u0004\b`\u0010\u000eR\u0017\u0010a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\ba\u0010\f\u001a\u0004\bb\u0010\u000eR\u0017\u0010c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bc\u0010\f\u001a\u0004\bd\u0010\u000eR\u0017\u0010e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\be\u0010\f\u001a\u0004\bf\u0010\u000eR\u0017\u0010g\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bg\u0010\f\u001a\u0004\bh\u0010\u000eR\u0017\u0010i\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bi\u0010\f\u001a\u0004\bj\u0010\u000eR\u0017\u0010k\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bk\u0010\f\u001a\u0004\bl\u0010\u000eR\u0017\u0010m\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bm\u0010\f\u001a\u0004\bn\u0010\u000eR\u0017\u0010o\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bo\u0010\f\u001a\u0004\bp\u0010\u000eR\u0017\u0010q\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bq\u0010\f\u001a\u0004\br\u0010\u000eR\u0017\u0010s\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bs\u0010\f\u001a\u0004\bt\u0010\u000eR\u0017\u0010u\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bu\u0010\f\u001a\u0004\bv\u0010\u000eR\u0017\u0010w\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bw\u0010\f\u001a\u0004\bx\u0010\u000eR\u0017\u0010y\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\by\u0010\f\u001a\u0004\bz\u0010\u000eR\u0017\u0010{\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b{\u0010\f\u001a\u0004\b|\u0010\u000eR\u0017\u0010}\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b}\u0010\f\u001a\u0004\b~\u0010\u000eR\u0018\u0010\u007f\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\b\u007f\u0010\f\u001a\u0005\b\u0080\u0001\u0010\u000eR\u001a\u0010\u0081\u0001\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\f\u001a\u0005\b\u0082\u0001\u0010\u000eR\u001a\u0010\u0083\u0001\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\f\u001a\u0005\b\u0084\u0001\u0010\u000eR\u001a\u0010\u0085\u0001\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\f\u001a\u0005\b\u0086\u0001\u0010\u000e¨\u0006\u0087\u0001"}, d2 = {"Lwx/d$a;", "", "<init>", "()V", "", "", "list", "", "Lwx/d;", "a", "(Ljava/util/List;)Ljava/util/Set;", "JPG", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "JPEG", "u", "PNG", "K", "CSV", "f", "JP2", "t", "SVG", "R", "HEIC", "q", "HEIF", "r", "PDF", "J", "TXT", "W", "PPT", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "RTF", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "DOCX", "i", "GZIP", "p", "XSD", "g0", "DGN", "g", "DXF", "l", "DWG", "k", "XMLENC", "d0", "ASIC", "b", "RNG", "O", "XSL", "h0", "XSLT", "i0", "XLS", "a0", "XLSX", "b0", "SEVEN_Z", "Q", "XPS", "f0", "PPTX", "M", "WAV", "X", "M4A", "w", "GZ", "o", "HTML", "s", "XHTML", "Z", "ODT", "F", "MP3", "y", "MPEG4", "B", "ODS", "E", "AVI", "c", "OGG", "G", "GML", "n", "GEOTIFF", "m", "ODP", ip.a.f96138c, "MPG", "C", "OGV", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "DOC", "h", "TIF", "T", "MPEG", "A", "ZIP", "j0", "TIFF", "U", "MP4", "z", "TAR", ip.a.f96137b, "XADES", "Y", "CADES", "d", "CSS", "e", "DWF", "j", "PADES", "I", "TSL", "V", "XMLSIG", "e0", "XML", "c0", "RAR", "N", "MOV", "x", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final String A() {
            return d.W;
        }

        public final String B() {
            return d.L;
        }

        public final String C() {
            return d.S;
        }

        public final String D() {
            return d.R;
        }

        public final String E() {
            return d.M;
        }

        public final String F() {
            return d.J;
        }

        public final String G() {
            return d.O;
        }

        public final String H() {
            return d.T;
        }

        public final String I() {
            return d.f215665f0;
        }

        public final String J() {
            return d.f215674k;
        }

        public final String K() {
            return d.f215662e;
        }

        public final String L() {
            return d.f215677m;
        }

        public final String M() {
            return d.D;
        }

        public final String N() {
            return d.f215673j0;
        }

        public final String O() {
            return d.f215687w;
        }

        public final String P() {
            return d.f215678n;
        }

        public final String Q() {
            return d.B;
        }

        public final String R() {
            return d.f215668h;
        }

        public final String S() {
            return d.f215655a0;
        }

        public final String T() {
            return d.V;
        }

        public final String U() {
            return d.Y;
        }

        public final String V() {
            return d.f215667g0;
        }

        public final String W() {
            return d.f215676l;
        }

        public final String X() {
            return d.E;
        }

        public final String Y() {
            return d.f215657b0;
        }

        public final String Z() {
            return d.I;
        }

        public final Set<d> a(List<String> list) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(v.y(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(d.j0(d.k0((String) it.next())));
            }
            return v.k1(arrayList);
        }

        public final String a0() {
            return d.f215690z;
        }

        public final String b() {
            return d.f215686v;
        }

        public final String b0() {
            return d.A;
        }

        public final String c() {
            return d.N;
        }

        public final String c0() {
            return d.f215671i0;
        }

        public final String d() {
            return d.f215659c0;
        }

        public final String d0() {
            return d.f215685u;
        }

        public final String e() {
            return d.f215661d0;
        }

        public final String e0() {
            return d.f215669h0;
        }

        public final String f() {
            return d.f215664f;
        }

        public final String f0() {
            return d.C;
        }

        public final String g() {
            return d.f215682r;
        }

        public final String g0() {
            return d.f215681q;
        }

        public final String h() {
            return d.U;
        }

        public final String h0() {
            return d.f215688x;
        }

        public final String i() {
            return d.f215679o;
        }

        public final String i0() {
            return d.f215689y;
        }

        public final String j() {
            return d.f215663e0;
        }

        public final String j0() {
            return d.X;
        }

        public final String k() {
            return d.f215684t;
        }

        public final String l() {
            return d.f215683s;
        }

        public final String m() {
            return d.Q;
        }

        public final String n() {
            return d.P;
        }

        public final String o() {
            return d.G;
        }

        public final String p() {
            return d.f215680p;
        }

        public final String q() {
            return d.f215670i;
        }

        public final String r() {
            return d.f215672j;
        }

        public final String s() {
            return d.H;
        }

        public final String t() {
            return d.f215666g;
        }

        public final String u() {
            return d.f215660d;
        }

        public final String v() {
            return d.f215658c;
        }

        public final String w() {
            return d.F;
        }

        public final String x() {
            return d.f215675k0;
        }

        public final String y() {
            return d.K;
        }

        public final String z() {
            return d.Z;
        }

        private Companion() {
        }
    }

    private /* synthetic */ d(String str) {
        this.value = str;
    }

    public static final /* synthetic */ d j0(String str) {
        return new d(str);
    }

    public static String k0(String str) {
        return str;
    }

    public static boolean l0(String str, Object obj) {
        return (obj instanceof d) && t.c(str, ((d) obj).getValue());
    }

    public static final boolean m0(String str, String str2) {
        return t.c(str, str2);
    }

    public static int n0(String str) {
        return str.hashCode();
    }

    public static String o0(String str) {
        return "FileExtension(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return l0(this.value, obj);
    }

    public int hashCode() {
        return n0(this.value);
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public String toString() {
        return o0(this.value);
    }
}
