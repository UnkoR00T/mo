package bj2;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class c extends cj2.c {

    @vl.c("activeTemporaryDrivingLicence")
    private byte[] A;

    @vl.c("passportDocuments")
    private byte[] C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @vl.c("fDat")
    private byte[] f19840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @vl.c("bDat")
    private byte[] f19841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @vl.c("mwDat")
    private byte[] f19842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @vl.c("scopeFourDat")
    private byte[] f19843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @vl.c("scopeFiveDat")
    private byte[] f19844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @vl.c("scopeSixDat")
    private byte[] f19845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @vl.c("scopeSevenDat")
    private byte[] f19846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @vl.c("scopeEightDat")
    private byte[] f19847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @vl.c("scopeNinthDat")
    private byte[] f19848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @vl.c("certRe")
    private Boolean f19849l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @vl.c("pkcsId")
    private String f19851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @vl.c("midMTSecServt")
    private byte[] f19852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @vl.c("mtSign")
    private byte[] f19853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @vl.c("caRoot")
    private byte[] f19854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @vl.c("pathCert")
    private byte[] f19855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @vl.c("tic")
    private String f19856s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @vl.c("drivingLicence")
    private byte[] f19863z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @vl.c("pkcs")
    private HashMap<String, byte[]> f19850m = new HashMap<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @vl.c("veh")
    private HashMap<String, byte[]> f19857t = new HashMap<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @vl.c("oCer")
    private HashMap<String, byte[]> f19858u = new HashMap<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @vl.c("famCards")
    private HashMap<String, byte[]> f19859v = new HashMap<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @vl.c("docList")
    private HashMap<String, byte[]> f19860w = new HashMap<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @vl.c("dynamicDocumentsSchemaList")
    private HashMap<String, byte[]> f19861x = new HashMap<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @vl.c("dynamicMultiDocumentsSchemaList")
    private HashMap<String, byte[]> f19862y = new HashMap<>();

    @vl.c("invalidatedTemporaryDrivingLicences")
    private HashMap<String, byte[]> B = new HashMap<>();

    @vl.c("collisionDrafts")
    private HashMap<String, byte[]> D = new HashMap<>();

    @vl.c("childPassportApplicationDraft")
    private byte[] E = null;

    public byte[] A() {
        return this.f19845h;
    }

    public String B() {
        return this.f19856s;
    }

    public HashMap<String, byte[]> C() {
        return this.f19857t;
    }

    public void D(byte[] bArr) {
        this.A = bArr;
    }

    public void E(byte[] bArr) {
        this.f19841d = bArr;
    }

    public void F(Boolean bool) {
        this.f19849l = bool;
    }

    public void G(byte[] bArr) {
        this.E = bArr;
    }

    public void H(HashMap<String, byte[]> map) {
        this.f19860w = map;
    }

    public void I(byte[] bArr) {
        this.f19863z = bArr;
    }

    public void J(HashMap<String, byte[]> map) {
        this.f19861x = map;
    }

    public void K(HashMap<String, byte[]> map) {
        this.f19862y = map;
    }

    public void L(byte[] bArr) {
        this.f19840c = bArr;
    }

    public void M(HashMap<String, byte[]> map) {
        this.B = map;
    }

    public void N(byte[] bArr) {
        this.f19842e = bArr;
    }

    public void O(byte[] bArr) {
        this.C = bArr;
    }

    public void P(HashMap<String, byte[]> map) {
        this.f19850m = map;
    }

    public void Q(String str) {
        this.f19851n = str;
    }

    public void R(byte[] bArr) {
        this.f19847j = bArr;
    }

    public void S(byte[] bArr) {
        this.f19844g = bArr;
    }

    public void T(byte[] bArr) {
        this.f19843f = bArr;
    }

    public void U(byte[] bArr) {
        this.f19848k = bArr;
    }

    public void V(byte[] bArr) {
        this.f19846i = bArr;
    }

    public void W(byte[] bArr) {
        this.f19845h = bArr;
    }

    public void X(String str) {
        this.f19856s = str;
    }

    public void f() {
        this.f19840c = null;
        this.f19841d = null;
        this.f19842e = null;
        this.f19843f = null;
        this.f19844g = null;
        this.f19845h = null;
        this.f19846i = null;
        this.f19847j = null;
        this.f19849l = Boolean.FALSE;
        this.f19850m = new HashMap<>();
        this.f19851n = null;
        this.f19852o = null;
        this.f19853p = null;
        this.f19854q = null;
        this.f19856s = null;
        this.f19857t = new HashMap<>();
        this.f19859v = new HashMap<>();
        this.f19863z = null;
        this.A = null;
        this.B = new HashMap<>();
        this.f19861x = new HashMap<>();
        this.C = null;
        this.D = new HashMap<>();
        this.E = null;
    }

    public byte[] g() {
        return this.A;
    }

    public byte[] h() {
        return this.f19841d;
    }

    public byte[] i() {
        return this.E;
    }

    public HashMap<String, byte[]> j() {
        return this.D;
    }

    public HashMap<String, byte[]> k() {
        return this.f19860w;
    }

    public byte[] l() {
        return this.f19863z;
    }

    public HashMap<String, byte[]> m() {
        return this.f19861x;
    }

    public HashMap<String, byte[]> n() {
        return this.f19862y;
    }

    public HashMap<String, byte[]> o() {
        return this.f19859v;
    }

    public byte[] p() {
        return this.f19840c;
    }

    public HashMap<String, byte[]> q() {
        return this.B;
    }

    public byte[] r() {
        return this.f19842e;
    }

    public byte[] s() {
        return this.C;
    }

    public HashMap<String, byte[]> t() {
        return this.f19850m;
    }

    public String u() {
        return this.f19851n;
    }

    public byte[] v() {
        return this.f19847j;
    }

    public byte[] w() {
        return this.f19844g;
    }

    public byte[] x() {
        return this.f19843f;
    }

    public byte[] y() {
        return this.f19848k;
    }

    public byte[] z() {
        return this.f19846i;
    }
}
