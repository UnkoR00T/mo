package bp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends b implements Comparable<i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, i> f20713d = new ConcurrentHashMap(PKIFailureInfo.certRevoked);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, i> f20723e = new HashMap(768);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f20733f = new i("A");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f20743g = new i("AA");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f20753h = new i("AbsoluteColorimetric");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f20773j = new i("AC");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i f20783k = new i("AcroForm");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f20793l = new i("ActualText");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f20803m = new i("adbe.pkcs7.detached");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f20813n = new i("adbe.pkcs7.sha1");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i f20832p = new i("adbe.x509.rsa_sha1");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f20842q = new i("Adobe.PPKLite");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f20853r = new i("AESV2");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i f20864s = new i("AESV3");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f20875t = new i("After");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f20896v = new i("AIMetaData");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f20907w = new i("AIS");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final i f20918x = new i("AllOff");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i f20929y = new i("AllOn");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final i f20940z = new i("Alt");
    public static final i A = new i("Alpha");
    public static final i B = new i("Alternate");
    public static final i C = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.M);
    public static final i D = new i("Annots");
    public static final i E = new i("AntiAlias");
    public static final i F = new i("AnyOff");
    public static final i G = new i("AnyOn");
    public static final i H = new i("AP");
    public static final i I = new i("APRef");
    public static final i K = new i("App");
    public static final i L = new i("ArtBox");
    public static final i O = new i("Artifact");
    public static final i P = new i("AS");
    public static final i R = new i("Ascent");
    public static final i T = new i("ASCIIHexDecode");
    public static final i X = new i("AHx");
    public static final i Y = new i("ASCII85Decode");
    public static final i Z = new i("A85");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final i f20754h0 = new i("Attached");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final i f20843q0 = new i("Author");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final i f20854r0 = new i("AvgWidth");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final i f20865s0 = new i("B");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final i f20876t0 = new i("Background");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final i f20886u0 = new i("BaseEncoding");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final i f20897v0 = new i("BaseFont");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final i f20908w0 = new i("BaseState");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final i f20919x0 = new i("BBox");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final i f20930y0 = new i(BouncyCastleProvider.PROVIDER_NAME);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final i f20941z0 = new i("BE");
    public static final i A0 = new i("Before");
    public static final i B0 = new i("BG");
    public static final i C0 = new i("BitsPerComponent");
    public static final i D0 = new i("BitsPerCoordinate");
    public static final i E0 = new i("BitsPerFlag");
    public static final i F0 = new i("BitsPerSample");
    public static final i G0 = new i("BlackIs1");
    public static final i H0 = new i("BlackPoint");
    public static final i I0 = new i("BleedBox");
    public static final i J0 = new i("BM");
    public static final i K0 = new i("Border");
    public static final i L0 = new i("Bounds");
    public static final i M0 = new i("BPC");
    public static final i N0 = new i("BS");
    public static final i O0 = new i("Btn");
    public static final i P0 = new i("ByteRange");
    public static final i Q0 = new i("C");
    public static final i R0 = new i("C0");
    public static final i S0 = new i("C1");
    public static final i T0 = new i("CA");
    public static final i U0 = new i("ca");
    public static final i V0 = new i("CalGray");
    public static final i W0 = new i("CalRGB");
    public static final i X0 = new i("Cap");
    public static final i Y0 = new i("CapHeight");
    public static final i Z0 = new i("Catalog");

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final i f20686a1 = new i("CCITTFaxDecode");

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final i f20695b1 = new i("CCF");

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final i f20704c1 = new i("CenterWindow");

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final i f20714d1 = new i("Cert");

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final i f20724e1 = new i("CF");

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final i f20734f1 = new i("CFM");

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final i f20744g1 = new i("Ch");

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final i f20755h1 = new i("CharProcs");

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final i f20764i1 = new i("CharSet");

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final i f20774j1 = new i("CI");

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final i f20784k1 = new i("CICI.SignIt");

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final i f20794l1 = new i("CIDFontType0");

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final i f20804m1 = new i("CIDFontType2");

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final i f20814n1 = new i("CIDToGIDMap");

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final i f20823o1 = new i("CIDSet");

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final i f20833p1 = new i("CIDSystemInfo");

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final i f20844q1 = new i("CL");

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final i f20855r1 = new i("ClrF");

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final i f20866s1 = new i("ClrFf");

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final i f20877t1 = new i("CMap");

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final i f20887u1 = new i("CMapName");

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final i f20898v1 = new i("CMYK");

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final i f20909w1 = new i("CO");

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final i f20920x1 = new i("Color");

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final i f20931y1 = new i("Collection");

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final i f20942z1 = new i("CollectionItem");
    public static final i A1 = new i("CollectionField");
    public static final i B1 = new i("CollectionSchema");
    public static final i C1 = new i("CollectionSort");
    public static final i D1 = new i("CollectionSubitem");
    public static final i E1 = new i("ColorBurn");
    public static final i F1 = new i("ColorDodge");
    public static final i G1 = new i("Colorants");
    public static final i H1 = new i("Colors");
    public static final i I1 = new i("ColorSpace");
    public static final i J1 = new i("Columns");
    public static final i K1 = new i("Compatible");
    public static final i L1 = new i("Components");
    public static final i M1 = new i("ContactInfo");
    public static final i N1 = new i("Contents");
    public static final i O1 = new i("Coords");
    public static final i P1 = new i("Count");
    public static final i Q1 = new i("CP");
    public static final i R1 = new i("CreationDate");
    public static final i S1 = new i("Creator");
    public static final i T1 = new i("CropBox");
    public static final i U1 = new i("Crypt");
    public static final i V1 = new i("CS");
    public static final i W1 = new i(ip.a.f96138c);
    public static final i X1 = new i("DA");
    public static final i Y1 = new i("Darken");
    public static final i Z1 = new i("Date");

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final i f20687a2 = new i("DCTDecode");

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final i f20696b2 = new i("DCT");

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final i f20705c2 = new i("Decode");

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final i f20715d2 = new i("DecodeParms");

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final i f20725e2 = new i("default");

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final i f20735f2 = new i("DefaultCMYK");

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final i f20745g2 = new i("DefaultCryptFilter");

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final i f20756h2 = new i("DefaultGray");

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final i f20765i2 = new i("DefaultRGB");

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final i f20775j2 = new i("Desc");

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final i f20785k2 = new i("DescendantFonts");

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final i f20795l2 = new i("Descent");

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final i f20805m2 = new i("Dest");

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final i f20815n2 = new i("DestOutputProfile");

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final i f20824o2 = new i("Dests");

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final i f20834p2 = new i("DeviceCMYK");

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final i f20845q2 = new i("DeviceGray");

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final i f20856r2 = new i("DeviceN");

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final i f20867s2 = new i("DeviceRGB");

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final i f20878t2 = new i("Di");

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final i f20888u2 = new i("Difference");

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final i f20899v2 = new i("Differences");

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final i f20910w2 = new i("DigestMethod");

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final i f20921x2 = new i("RIPEMD160");

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final i f20932y2 = new i("SHA1");

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final i f20943z2 = new i("SHA256");
    public static final i A2 = new i("SHA384");
    public static final i B2 = new i("SHA512");
    public static final i C2 = new i("Direction");
    public static final i D2 = new i("DisplayDocTitle");
    public static final i E2 = new i(ASN1Encoding.DL);
    public static final i F2 = new i("Dm");
    public static final i G2 = new i("Doc");
    public static final i H2 = new i("DocChecksum");
    public static final i I2 = new i("DocTimeStamp");
    public static final i J2 = new i("DocMDP");
    public static final i K2 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37074a);
    public static final i L2 = new i("Domain");
    public static final i M2 = new i("DOS");
    public static final i N2 = new i("DP");
    public static final i O2 = new i("DR");
    public static final i P2 = new i("DS");
    public static final i Q2 = new i("Duplex");
    public static final i R2 = new i("Dur");
    public static final i S2 = new i("DV");
    public static final i T2 = new i("DW");
    public static final i U2 = new i("DW2");
    public static final i V2 = new i("E");
    public static final i W2 = new i("EarlyChange");
    public static final i X2 = new i("EF");
    public static final i Y2 = new i("EmbeddedFDFs");
    public static final i Z2 = new i("EmbeddedFiles");

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final i f20688a3 = new i("");

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final i f20697b3 = new i("Encode");

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final i f20706c3 = new i("EncodedByteAlign");

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final i f20716d3 = new i("Encoding");

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final i f20726e3 = new i("90ms-RKSJ-H");

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final i f20736f3 = new i("90ms-RKSJ-V");

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final i f20746g3 = new i("ETen-B5-H");

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final i f20757h3 = new i("ETen-B5-V");

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final i f20766i3 = new i("Encrypt");

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final i f20776j3 = new i("EncryptMetadata");

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final i f20786k3 = new i("EndOfLine");

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final i f20796l3 = new i("Entrust.PPKEF");

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final i f20806m3 = new i("Exclusion");

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final i f20816n3 = new i("ExtGState");

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final i f20825o3 = new i("Extend");

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final i f20835p3 = new i("Extends");

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final i f20846q3 = new i("F");

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final i f20857r3 = new i("FDecodeParms");

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final i f20868s3 = new i("FFilter");

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final i f20879t3 = new i("FB");

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final i f20889u3 = new i("FDF");

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final i f20900v3 = new i("Ff");

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final i f20911w3 = new i("Fields");

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final i f20922x3 = new i("Filespec");

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final i f20933y3 = new i("Filter");

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final i f20944z3 = new i("First");
    public static final i A3 = new i("FirstChar");
    public static final i B3 = new i("FitWindow");
    public static final i C3 = new i("FL");
    public static final i D3 = new i("Flags");
    public static final i E3 = new i("FlateDecode");
    public static final i F3 = new i("Fl");
    public static final i G3 = new i("Folders");
    public static final i H3 = new i("Font");
    public static final i I3 = new i("FontBBox");
    public static final i J3 = new i("FontDescriptor");
    public static final i K3 = new i("FontFamily");
    public static final i L3 = new i("FontFile");
    public static final i M3 = new i("FontFile2");
    public static final i N3 = new i("FontFile3");
    public static final i O3 = new i("FontMatrix");
    public static final i P3 = new i("FontName");
    public static final i Q3 = new i("FontStretch");
    public static final i R3 = new i("FontWeight");
    public static final i S3 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.W);
    public static final i T3 = new i("FormType");
    public static final i U3 = new i("FRM");
    public static final i V3 = new i("FT");
    public static final i W3 = new i("Function");
    public static final i X3 = new i("FunctionType");
    public static final i Y3 = new i("Functions");
    public static final i Z3 = new i("G");

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final i f20689a4 = new i("Gamma");

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final i f20698b4 = new i("Group");

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final i f20707c4 = new i("GTS_PDFA1");

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final i f20717d4 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n);

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final i f20727e4 = new i("HardLight");

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final i f20737f4 = new i("Height");

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final i f20747g4 = new i("Helv");

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final i f20758h4 = new i("HideMenubar");

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final i f20767i4 = new i("HideToolbar");

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final i f20777j4 = new i("HideWindowUI");

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final i f20787k4 = new i("Hue");

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final i f20797l4 = new i("I");

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final i f20807m4 = new i("IC");

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final i f20817n4 = new i("ICCBased");

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final i f20826o4 = new i("ID");

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final i f20836p4 = new i("IDTree");

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final i f20847q4 = new i("Identity");

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final i f20858r4 = new i("Identity-H");

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final i f20869s4 = new i("Identity-V");

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final i f20880t4 = new i("IF");

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final i f20890u4 = new i("Illustrator");

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final i f20901v4 = new i("IM");

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final i f20912w4 = new i("Image");

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final i f20923x4 = new i("ImageMask");

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final i f20934y4 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37083j);

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final i f20945z4 = new i("Indexed");
    public static final i A4 = new i("Info");
    public static final i B4 = new i("InkList");
    public static final i C4 = new i("Intent");
    public static final i D4 = new i("Interpolate");
    public static final i E4 = new i("IT");
    public static final i F4 = new i("ItalicAngle");
    public static final i G4 = new i("Issuer");
    public static final i H4 = new i("IX");
    public static final i I4 = new i("JavaScript");
    public static final i J4 = new i("JBIG2Decode");
    public static final i K4 = new i("JBIG2Globals");
    public static final i L4 = new i("JPXDecode");
    public static final i M4 = new i("JS");
    public static final i N4 = new i("K");
    public static final i O4 = new i("Keywords");
    public static final i P4 = new i("KeyUsage");
    public static final i Q4 = new i("Kids");
    public static final i R4 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u);
    public static final i S4 = new i("Lab");
    public static final i T4 = new i("Lang");
    public static final i U4 = new i("Last");
    public static final i V4 = new i("LastChar");
    public static final i W4 = new i("LastModified");
    public static final i X4 = new i("LC");
    public static final i Y4 = new i("LE");
    public static final i Z4 = new i("Leading");

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final i f20690a5 = new i("LegalAttestation");

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final i f20699b5 = new i("Length");

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final i f20708c5 = new i("Length1");

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final i f20718d5 = new i("Length2");

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final i f20728e5 = new i("Lighten");

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final i f20738f5 = new i("Limits");

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final i f20748g5 = new i("LJ");

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final i f20759h5 = new i("LL");

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final i f20768i5 = new i("LLE");

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final i f20778j5 = new i("LLO");

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final i f20788k5 = new i("Location");

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final i f20798l5 = new i("Luminosity");

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final i f20808m5 = new i("LW");

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final i f20818n5 = new i("LZWDecode");

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final i f20827o5 = new i("LZW");

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final i f20837p5 = new i("M");

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final i f20848q5 = new i("Mac");

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final i f20859r5 = new i("MacExpertEncoding");

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final i f20870s5 = new i("MacRomanEncoding");

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final i f20881t5 = new i("MarkInfo");

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final i f20891u5 = new i("Mask");

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final i f20902v5 = new i("Matrix");

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final i f20913w5 = new i("Matte");

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final i f20924x5 = new i("MaxLen");

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final i f20935y5 = new i("MaxWidth");

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final i f20946z5 = new i("MCID");
    public static final i A5 = new i("MDP");
    public static final i B5 = new i("MediaBox");
    public static final i C5 = new i("Measure");
    public static final i D5 = new i("Metadata");
    public static final i E5 = new i("MissingWidth");
    public static final i F5 = new i("Mix");
    public static final i G5 = new i("MK");
    public static final i H5 = new i("ML");
    public static final i I5 = new i("MMType1");
    public static final i J5 = new i("ModDate");
    public static final i K5 = new i("Multiply");
    public static final i L5 = new i("N");
    public static final i M5 = new i("Name");
    public static final i N5 = new i("Names");
    public static final i O5 = new i("Navigator");
    public static final i P5 = new i("NeedAppearances");
    public static final i Q5 = new i("NewWindow");
    public static final i R5 = new i("Next");
    public static final i S5 = new i("NM");
    public static final i T5 = new i("NonEFontNoWarn");
    public static final i U5 = new i("NonFullScreenPageMode");
    public static final i V5 = new i("None");
    public static final i W5 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.P0);
    public static final i X5 = new i("Nums");
    public static final i Y5 = new i("O");
    public static final i Z5 = new i("Obj");

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public static final i f20691a6 = new i("ObjStm");

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public static final i f20700b6 = new i("OC");

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public static final i f20709c6 = new i("OCG");

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public static final i f20719d6 = new i("OCGs");

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public static final i f20729e6 = new i("OCMD");

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public static final i f20739f6 = new i("OCProperties");

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public static final i f20749g6 = new i("OE");

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public static final i f20760h6 = new i("OID");

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public static final i f20769i6 = new i("OFF");

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public static final i f20779j6 = new i("Off");

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public static final i f20789k6 = new i("ON");

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public static final i f20799l6 = new i("OP");

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public static final i f20809m6 = new i("op");

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public static final i f20819n6 = new i("OpenAction");

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    public static final i f20828o6 = new i("OpenType");

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    public static final i f20838p6 = new i("OPM");

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    public static final i f20849q6 = new i("Opt");

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public static final i f20860r6 = new i("Order");

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    public static final i f20871s6 = new i("Ordering");

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    public static final i f20882t6 = new i("OS");

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    public static final i f20892u6 = new i("Outlines");

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    public static final i f20903v6 = new i("OutputCondition");

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    public static final i f20914w6 = new i("OutputConditionIdentifier");

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    public static final i f20925x6 = new i("OutputIntent");

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    public static final i f20936y6 = new i("OutputIntents");

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final i f20947z6 = new i("Overlay");
    public static final i A6 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m);
    public static final i B6 = new i("Page");
    public static final i C6 = new i("PageLabels");
    public static final i D6 = new i("PageLayout");
    public static final i E6 = new i("PageMode");
    public static final i F6 = new i("Pages");
    public static final i G6 = new i("PaintType");
    public static final i H6 = new i("Panose");
    public static final i I6 = new i("Params");
    public static final i J6 = new i("Parent");
    public static final i K6 = new i("ParentTree");
    public static final i L6 = new i("ParentTreeNextKey");
    public static final i M6 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37075b);
    public static final i N6 = new i("Path");
    public static final i O6 = new i("Pattern");
    public static final i P6 = new i("PatternType");
    public static final i Q6 = new i("PDFDocEncoding");
    public static final i R6 = new i("Perms");
    public static final i S6 = new i("Perceptual");
    public static final i T6 = new i("PieceInfo");
    public static final i U6 = new i("Pg");
    public static final i V6 = new i("PreRelease");
    public static final i W6 = new i("Predictor");
    public static final i X6 = new i("Prev");
    public static final i Y6 = new i("PrintArea");
    public static final i Z6 = new i("PrintClip");

    /* JADX INFO: renamed from: a7, reason: collision with root package name */
    public static final i f20692a7 = new i("PrintScaling");

    /* JADX INFO: renamed from: b7, reason: collision with root package name */
    public static final i f20701b7 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37085l);

    /* JADX INFO: renamed from: c7, reason: collision with root package name */
    public static final i f20710c7 = new i("ProcSet");

    /* JADX INFO: renamed from: d7, reason: collision with root package name */
    public static final i f20720d7 = new i("Process");

    /* JADX INFO: renamed from: e7, reason: collision with root package name */
    public static final i f20730e7 = new i("Producer");

    /* JADX INFO: renamed from: f7, reason: collision with root package name */
    public static final i f20740f7 = new i("Prop_Build");

    /* JADX INFO: renamed from: g7, reason: collision with root package name */
    public static final i f20750g7 = new i("Properties");

    /* JADX INFO: renamed from: h7, reason: collision with root package name */
    public static final i f20761h7 = new i("PS");

    /* JADX INFO: renamed from: i7, reason: collision with root package name */
    public static final i f20770i7 = new i("PubSec");

    /* JADX INFO: renamed from: j7, reason: collision with root package name */
    public static final i f20780j7 = new i("Q");

    /* JADX INFO: renamed from: k7, reason: collision with root package name */
    public static final i f20790k7 = new i("QuadPoints");

    /* JADX INFO: renamed from: l7, reason: collision with root package name */
    public static final i f20800l7 = new i("R");

    /* JADX INFO: renamed from: m7, reason: collision with root package name */
    public static final i f20810m7 = new i("Range");

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    public static final i f20820n7 = new i("RC");

    /* JADX INFO: renamed from: o7, reason: collision with root package name */
    public static final i f20829o7 = new i("RD");

    /* JADX INFO: renamed from: p7, reason: collision with root package name */
    public static final i f20839p7 = new i("Reason");

    /* JADX INFO: renamed from: q7, reason: collision with root package name */
    public static final i f20850q7 = new i("Reasons");

    /* JADX INFO: renamed from: r7, reason: collision with root package name */
    public static final i f20861r7 = new i("RelativeColorimetric");

    /* JADX INFO: renamed from: s7, reason: collision with root package name */
    public static final i f20872s7 = new i("Repeat");

    /* JADX INFO: renamed from: t7, reason: collision with root package name */
    public static final i f20883t7 = new i("Recipients");

    /* JADX INFO: renamed from: u7, reason: collision with root package name */
    public static final i f20893u7 = new i("Rect");

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    public static final i f20904v7 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.I);

    /* JADX INFO: renamed from: w7, reason: collision with root package name */
    public static final i f20915w7 = new i("Registry");

    /* JADX INFO: renamed from: x7, reason: collision with root package name */
    public static final i f20926x7 = new i("RegistryName");

    /* JADX INFO: renamed from: y7, reason: collision with root package name */
    public static final i f20937y7 = new i("Rename");

    /* JADX INFO: renamed from: z7, reason: collision with root package name */
    public static final i f20948z7 = new i("Resources");
    public static final i A7 = new i("RGB");
    public static final i B7 = new i("RI");
    public static final i C7 = new i("RoleMap");
    public static final i D7 = new i("Root");
    public static final i E7 = new i("Rotate");
    public static final i F7 = new i("Rows");
    public static final i G7 = new i("RunLengthDecode");
    public static final i H7 = new i("RL");
    public static final i I7 = new i("RV");
    public static final i J7 = new i(ip.a.f96137b);
    public static final i K7 = new i("SA");
    public static final i L7 = new i("Saturation");
    public static final i M7 = new i("Schema");
    public static final i N7 = new i("Screen");
    public static final i O7 = new i("SE");
    public static final i P7 = new i("Separation");
    public static final i Q7 = new i("SetF");
    public static final i R7 = new i("SetFf");
    public static final i S7 = new i("Shading");
    public static final i T7 = new i("ShadingType");
    public static final i U7 = new i("Sig");
    public static final i V7 = new i("SigFlags");
    public static final i W7 = new i("SigRef");
    public static final i X7 = new i("Size");
    public static final i Y7 = new i("SM");
    public static final i Z7 = new i("SMask");

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public static final i f20693a8 = new i("SoftLight");

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    public static final i f20702b8 = new i("Sort");

    /* JADX INFO: renamed from: c8, reason: collision with root package name */
    public static final i f20711c8 = new i("Sound");

    /* JADX INFO: renamed from: d8, reason: collision with root package name */
    public static final i f20721d8 = new i("Split");

    /* JADX INFO: renamed from: e8, reason: collision with root package name */
    public static final i f20731e8 = new i("SS");

    /* JADX INFO: renamed from: f8, reason: collision with root package name */
    public static final i f20741f8 = new i("St");

    /* JADX INFO: renamed from: g8, reason: collision with root package name */
    public static final i f20751g8 = new i("StandardEncoding");

    /* JADX INFO: renamed from: h8, reason: collision with root package name */
    public static final i f20762h8 = new i("State");

    /* JADX INFO: renamed from: i8, reason: collision with root package name */
    public static final i f20771i8 = new i("StateModel");

    /* JADX INFO: renamed from: j8, reason: collision with root package name */
    public static final i f20781j8 = new i("Status");

    /* JADX INFO: renamed from: k8, reason: collision with root package name */
    public static final i f20791k8 = new i("StdCF");

    /* JADX INFO: renamed from: l8, reason: collision with root package name */
    public static final i f20801l8 = new i("StemH");

    /* JADX INFO: renamed from: m8, reason: collision with root package name */
    public static final i f20811m8 = new i("StemV");

    /* JADX INFO: renamed from: n8, reason: collision with root package name */
    public static final i f20821n8 = new i("StmF");

    /* JADX INFO: renamed from: o8, reason: collision with root package name */
    public static final i f20830o8 = new i("StrF");

    /* JADX INFO: renamed from: p8, reason: collision with root package name */
    public static final i f20840p8 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.g.f36980b);

    /* JADX INFO: renamed from: q8, reason: collision with root package name */
    public static final i f20851q8 = new i("StructParent");

    /* JADX INFO: renamed from: r8, reason: collision with root package name */
    public static final i f20862r8 = new i("StructParents");

    /* JADX INFO: renamed from: s8, reason: collision with root package name */
    public static final i f20873s8 = new i("StructTreeRoot");

    /* JADX INFO: renamed from: t8, reason: collision with root package name */
    public static final i f20884t8 = new i("Style");

    /* JADX INFO: renamed from: u8, reason: collision with root package name */
    public static final i f20894u8 = new i("SubFilter");

    /* JADX INFO: renamed from: v8, reason: collision with root package name */
    public static final i f20905v8 = new i("Subj");

    /* JADX INFO: renamed from: w8, reason: collision with root package name */
    public static final i f20916w8 = new i("Subject");

    /* JADX INFO: renamed from: x8, reason: collision with root package name */
    public static final i f20927x8 = new i("SubjectDN");

    /* JADX INFO: renamed from: y8, reason: collision with root package name */
    public static final i f20938y8 = new i("Subtype");

    /* JADX INFO: renamed from: z8, reason: collision with root package name */
    public static final i f20949z8 = new i("Supplement");
    public static final i A8 = new i("SV");
    public static final i B8 = new i("SVCert");
    public static final i C8 = new i("SW");
    public static final i D8 = new i("Sy");
    public static final i E8 = new i("Synchronous");
    public static final i F8 = new i("T");
    public static final i G8 = new i("Target");
    public static final i H8 = new i("Templates");
    public static final i I8 = new i("Threads");
    public static final i J8 = new i("Thumb");
    public static final i K8 = new i("TI");
    public static final i L8 = new i("TilingType");
    public static final i M8 = new i("TimeStamp");
    public static final i N8 = new i("Title");
    public static final i O8 = new i("TK");
    public static final i P8 = new i("TM");
    public static final i Q8 = new i("ToUnicode");
    public static final i R8 = new i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37099z);
    public static final i S8 = new i("TR2");
    public static final i T8 = new i("Trapped");
    public static final i U8 = new i("Trans");
    public static final i V8 = new i("TransformMethod");
    public static final i W8 = new i("TransformParams");
    public static final i X8 = new i("Transparency");
    public static final i Y8 = new i("TRef");
    public static final i Z8 = new i("TrimBox");

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final i f20694a9 = new i("TrueType");

    /* JADX INFO: renamed from: b9, reason: collision with root package name */
    public static final i f20703b9 = new i("TrustedMode");

    /* JADX INFO: renamed from: c9, reason: collision with root package name */
    public static final i f20712c9 = new i("TU");

    /* JADX INFO: renamed from: d9, reason: collision with root package name */
    public static final i f20722d9 = new i("Tx");

    /* JADX INFO: renamed from: e9, reason: collision with root package name */
    public static final i f20732e9 = new i("Type");

    /* JADX INFO: renamed from: f9, reason: collision with root package name */
    public static final i f20742f9 = new i("Type0");

    /* JADX INFO: renamed from: g9, reason: collision with root package name */
    public static final i f20752g9 = new i("Type1");

    /* JADX INFO: renamed from: h9, reason: collision with root package name */
    public static final i f20763h9 = new i("Type3");

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final i f20772i9 = new i("U");

    /* JADX INFO: renamed from: j9, reason: collision with root package name */
    public static final i f20782j9 = new i("UE");

    /* JADX INFO: renamed from: k9, reason: collision with root package name */
    public static final i f20792k9 = new i("UF");

    /* JADX INFO: renamed from: l9, reason: collision with root package name */
    public static final i f20802l9 = new i("Unchanged");

    /* JADX INFO: renamed from: m9, reason: collision with root package name */
    public static final i f20812m9 = new i("Unix");

    /* JADX INFO: renamed from: n9, reason: collision with root package name */
    public static final i f20822n9 = new i("URI");

    /* JADX INFO: renamed from: o9, reason: collision with root package name */
    public static final i f20831o9 = new i("URL");

    /* JADX INFO: renamed from: p9, reason: collision with root package name */
    public static final i f20841p9 = new i("URLType");

    /* JADX INFO: renamed from: q9, reason: collision with root package name */
    public static final i f20852q9 = new i("UserUnit");

    /* JADX INFO: renamed from: r9, reason: collision with root package name */
    public static final i f20863r9 = new i("V");

    /* JADX INFO: renamed from: s9, reason: collision with root package name */
    public static final i f20874s9 = new i("VE");

    /* JADX INFO: renamed from: t9, reason: collision with root package name */
    public static final i f20885t9 = new i("VeriSign.PPKVS");

    /* JADX INFO: renamed from: u9, reason: collision with root package name */
    public static final i f20895u9 = new i("Version");

    /* JADX INFO: renamed from: v9, reason: collision with root package name */
    public static final i f20906v9 = new i("Vertices");

    /* JADX INFO: renamed from: w9, reason: collision with root package name */
    public static final i f20917w9 = new i("VerticesPerRow");

    /* JADX INFO: renamed from: x9, reason: collision with root package name */
    public static final i f20928x9 = new i("View");

    /* JADX INFO: renamed from: y9, reason: collision with root package name */
    public static final i f20939y9 = new i("ViewArea");

    /* JADX INFO: renamed from: z9, reason: collision with root package name */
    public static final i f20950z9 = new i("ViewClip");
    public static final i A9 = new i("ViewerPreferences");
    public static final i B9 = new i("Volume");
    public static final i C9 = new i("VP");
    public static final i D9 = new i("W");
    public static final i E9 = new i("W2");
    public static final i F9 = new i("WhitePoint");
    public static final i G9 = new i("Widget");
    public static final i H9 = new i("Width");
    public static final i I9 = new i("Widths");
    public static final i J9 = new i("WinAnsiEncoding");
    public static final i K9 = new i("XFA");
    public static final i L9 = new i("XStep");
    public static final i M9 = new i("XHeight");
    public static final i N9 = new i("XObject");
    public static final i O9 = new i("XRef");
    public static final i P9 = new i("XRefStm");
    public static final i Q9 = new i("YStep");
    public static final i R9 = new i("Yes");
    public static final i S9 = new i("ZaDb");

    private i(String str, boolean z15) {
        this.f20951b = str;
        this.f20952c = str.hashCode();
        if (z15) {
            f20723e.put(str, this);
        } else {
            f20713d.put(str, this);
        }
    }

    public static i J3(String str) {
        if (str == null) {
            return null;
        }
        i iVar = f20723e.get(str);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = f20713d.get(str);
        return iVar2 == null ? new i(str, false) : iVar2;
    }

    public String A3() {
        return this.f20951b;
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.C(this);
    }

    public void N3(OutputStream outputStream) throws IOException {
        outputStream.write(47);
        for (byte b15 : A3().getBytes(xp.a.f220417f)) {
            int i15 = b15 & 255;
            if ((i15 < 65 || i15 > 90) && ((i15 < 97 || i15 > 122) && !((i15 >= 48 && i15 <= 57) || i15 == 43 || i15 == 45 || i15 == 95 || i15 == 64 || i15 == 42 || i15 == 36 || i15 == 59 || i15 == 46))) {
                outputStream.write(35);
                xp.c.e(b15, outputStream);
            } else {
                outputStream.write(i15);
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f20951b.equals(((i) obj).f20951b);
    }

    public int hashCode() {
        return this.f20952c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f20951b.compareTo(iVar.f20951b);
    }

    public String toString() {
        return "COSName{" + this.f20951b + "}";
    }

    private i(String str) {
        this(str, true);
    }
}
