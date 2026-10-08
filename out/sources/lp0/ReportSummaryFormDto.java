package lp0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.e0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b6\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010#\u001a\u0004\b<\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010#\u001a\u0004\b>\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010#\u001a\u0004\b@\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010#\u001a\u0004\bB\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\bD\u0010\u001aR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Llp0/e0;", "", "", "appNum", "appCat", "addInf", "frmN", "email", "cAdr", "cPho", "nEn", "cDes", "prov", "Llp0/c0;", "loc", "cRep", "pAdm", "rodo", "notS", "osType", "", "Llp0/b;", "attachments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llp0/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAppNum", "b", "getAppCat", "c", "getAddInf", "d", "getFrmN", "e", "getEmail", "f", "getCAdr", "g", "getCPho", "h", "getNEn", "i", "getCDes", "j", "getProv", "k", "Llp0/c0;", "getLoc", "()Llp0/c0;", "l", "getCRep", "m", "getPAdm", "n", "getRodo", "o", "getNotS", "p", "getOsType", "q", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportSummaryFormDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("appNum")
    private final String appNum;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("appCat")
    private final String appCat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("addInf")
    private final String addInf;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("frmN")
    private final String frmN;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cAdr")
    private final String cAdr;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cPho")
    private final String cPho;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nEn")
    private final String nEn;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cDes")
    private final String cDes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("prov")
    private final String prov;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("loc")
    private final LocationDto loc;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cRep")
    private final String cRep;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pAdm")
    private final String pAdm;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rodo")
    private final String rodo;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("notS")
    private final String notS;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("osType")
    private final String osType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachments")
    private final List<AttachmentDto> attachments;

    public ReportSummaryFormDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, LocationDto locationDto, String str11, String str12, String str13, String str14, String str15, List<AttachmentDto> list) {
        this.appNum = str;
        this.appCat = str2;
        this.addInf = str3;
        this.frmN = str4;
        this.email = str5;
        this.cAdr = str6;
        this.cPho = str7;
        this.nEn = str8;
        this.cDes = str9;
        this.prov = str10;
        this.loc = locationDto;
        this.cRep = str11;
        this.pAdm = str12;
        this.rodo = str13;
        this.notS = str14;
        this.osType = str15;
        this.attachments = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportSummaryFormDto)) {
            return false;
        }
        ReportSummaryFormDto reportSummaryFormDto = (ReportSummaryFormDto) other;
        return fr.t.c(this.appNum, reportSummaryFormDto.appNum) && fr.t.c(this.appCat, reportSummaryFormDto.appCat) && fr.t.c(this.addInf, reportSummaryFormDto.addInf) && fr.t.c(this.frmN, reportSummaryFormDto.frmN) && fr.t.c(this.email, reportSummaryFormDto.email) && fr.t.c(this.cAdr, reportSummaryFormDto.cAdr) && fr.t.c(this.cPho, reportSummaryFormDto.cPho) && fr.t.c(this.nEn, reportSummaryFormDto.nEn) && fr.t.c(this.cDes, reportSummaryFormDto.cDes) && fr.t.c(this.prov, reportSummaryFormDto.prov) && fr.t.c(this.loc, reportSummaryFormDto.loc) && fr.t.c(this.cRep, reportSummaryFormDto.cRep) && fr.t.c(this.pAdm, reportSummaryFormDto.pAdm) && fr.t.c(this.rodo, reportSummaryFormDto.rodo) && fr.t.c(this.notS, reportSummaryFormDto.notS) && fr.t.c(this.osType, reportSummaryFormDto.osType) && fr.t.c(this.attachments, reportSummaryFormDto.attachments);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.appNum.hashCode() * 31) + this.appCat.hashCode()) * 31) + this.addInf.hashCode()) * 31) + this.frmN.hashCode()) * 31) + this.email.hashCode()) * 31) + this.cAdr.hashCode()) * 31) + this.cPho.hashCode()) * 31) + this.nEn.hashCode()) * 31) + this.cDes.hashCode()) * 31) + this.prov.hashCode()) * 31) + this.loc.hashCode()) * 31) + this.cRep.hashCode()) * 31) + this.pAdm.hashCode()) * 31) + this.rodo.hashCode()) * 31) + this.notS.hashCode()) * 31) + this.osType.hashCode()) * 31) + this.attachments.hashCode();
    }

    public String toString() {
        return "ReportSummaryFormDto(appNum=" + this.appNum + ", appCat=" + this.appCat + ", addInf=" + this.addInf + ", frmN=" + this.frmN + ", email=" + this.email + ", cAdr=" + this.cAdr + ", cPho=" + this.cPho + ", nEn=" + this.nEn + ", cDes=" + this.cDes + ", prov=" + this.prov + ", loc=" + this.loc + ", cRep=" + this.cRep + ", pAdm=" + this.pAdm + ", rodo=" + this.rodo + ", notS=" + this.notS + ", osType=" + this.osType + ", attachments=" + this.attachments + ')';
    }

    public /* synthetic */ ReportSummaryFormDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, LocationDto locationDto, String str11, String str12, String str13, String str14, String str15, List list, int i15, fr.k kVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, locationDto, str11, str12, str13, str14, (i15 & 32768) != 0 ? "android" : str15, list);
    }
}
