package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.Date;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0018HÆ\u0003JÕ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010F\u001a\u00020\u00182\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006K"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/StudentCardDto;", "", "dh", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderStudentDto;", "n", "", "s", "su", "c", "e", "Ljava/util/Date;", "p", "pW", "pi", "b", "a", "sn", "sa", "d", "g", "di", "sp", "en", "dis", "", "<init>", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderStudentDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDh", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderStudentDto;", "getN", "()Ljava/lang/String;", "getS", "getSu", "getC", "getE", "()Ljava/util/Date;", "getP", "getPW", "getPi", "getB", "getA", "getSn", "getSa", "getD", "getG", "getDi", "getSp", "getEn", "getDis", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StudentCardDto {

    @c("a")
    private final String a;

    @c("b")
    private final Date b;

    @c("c")
    private final String c;

    @c("d")
    private final Date d;

    @c("dh")
    private final DataHeaderStudentDto dh;

    @c("di")
    private final String di;

    @c("dis")
    private final boolean dis;

    @c("e")
    private final Date e;

    @c("en")
    private final String en;

    @c("g")
    private final String g;

    @c("n")
    private final String n;

    @c("p")
    private final String p;

    @c("pW")
    private final String pW;

    @c("pi")
    private final String pi;

    @c("s")
    private final String s;

    @c("sa")
    private final String sa;

    @c("sn")
    private final String sn;

    @c("sp")
    private final String sp;

    @c("su")
    private final String su;

    public StudentCardDto(DataHeaderStudentDto dataHeaderStudentDto, String str, String str2, String str3, String str4, Date date, String str5, String str6, String str7, Date date2, String str8, String str9, String str10, Date date3, String str11, String str12, String str13, String str14, boolean z15) {
        this.dh = dataHeaderStudentDto;
        this.n = str;
        this.s = str2;
        this.su = str3;
        this.c = str4;
        this.e = date;
        this.p = str5;
        this.pW = str6;
        this.pi = str7;
        this.b = date2;
        this.a = str8;
        this.sn = str9;
        this.sa = str10;
        this.d = date3;
        this.g = str11;
        this.di = str12;
        this.sp = str13;
        this.en = str14;
        this.dis = z15;
    }

    public static /* synthetic */ StudentCardDto copy$default(StudentCardDto studentCardDto, DataHeaderStudentDto dataHeaderStudentDto, String str, String str2, String str3, String str4, Date date, String str5, String str6, String str7, Date date2, String str8, String str9, String str10, Date date3, String str11, String str12, String str13, String str14, boolean z15, int i15, Object obj) {
        boolean z16;
        String str15;
        DataHeaderStudentDto dataHeaderStudentDto2 = (i15 & 1) != 0 ? studentCardDto.dh : dataHeaderStudentDto;
        String str16 = (i15 & 2) != 0 ? studentCardDto.n : str;
        String str17 = (i15 & 4) != 0 ? studentCardDto.s : str2;
        String str18 = (i15 & 8) != 0 ? studentCardDto.su : str3;
        String str19 = (i15 & 16) != 0 ? studentCardDto.c : str4;
        Date date4 = (i15 & 32) != 0 ? studentCardDto.e : date;
        String str20 = (i15 & 64) != 0 ? studentCardDto.p : str5;
        String str21 = (i15 & 128) != 0 ? studentCardDto.pW : str6;
        String str22 = (i15 & 256) != 0 ? studentCardDto.pi : str7;
        Date date5 = (i15 & 512) != 0 ? studentCardDto.b : date2;
        String str23 = (i15 & 1024) != 0 ? studentCardDto.a : str8;
        String str24 = (i15 & 2048) != 0 ? studentCardDto.sn : str9;
        String str25 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? studentCardDto.sa : str10;
        Date date6 = (i15 & PKIFailureInfo.certRevoked) != 0 ? studentCardDto.d : date3;
        DataHeaderStudentDto dataHeaderStudentDto3 = dataHeaderStudentDto2;
        String str26 = (i15 & 16384) != 0 ? studentCardDto.g : str11;
        String str27 = (i15 & 32768) != 0 ? studentCardDto.di : str12;
        String str28 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? studentCardDto.sp : str13;
        String str29 = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? studentCardDto.en : str14;
        if ((i15 & PKIFailureInfo.transactionIdInUse) != 0) {
            str15 = str29;
            z16 = studentCardDto.dis;
        } else {
            z16 = z15;
            str15 = str29;
        }
        return studentCardDto.copy(dataHeaderStudentDto3, str16, str17, str18, str19, date4, str20, str21, str22, date5, str23, str24, str25, date6, str26, str27, str28, str15, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataHeaderStudentDto getDh() {
        return this.dh;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSa() {
        return this.sa;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDi() {
        return this.di;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSp() {
        return this.sp;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getEn() {
        return this.en;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getDis() {
        return this.dis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getS() {
        return this.s;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSu() {
        return this.su;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPW() {
        return this.pW;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPi() {
        return this.pi;
    }

    public final StudentCardDto copy(DataHeaderStudentDto dh4, String n15, String s15, String su4, String c15, Date e15, String p15, String pW, String pi4, Date b15, String a15, String sn4, String sa5, Date d15, String g15, String di4, String sp4, String en4, boolean dis) {
        return new StudentCardDto(dh4, n15, s15, su4, c15, e15, p15, pW, pi4, b15, a15, sn4, sa5, d15, g15, di4, sp4, en4, dis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StudentCardDto)) {
            return false;
        }
        StudentCardDto studentCardDto = (StudentCardDto) other;
        return t.c(this.dh, studentCardDto.dh) && t.c(this.n, studentCardDto.n) && t.c(this.s, studentCardDto.s) && t.c(this.su, studentCardDto.su) && t.c(this.c, studentCardDto.c) && t.c(this.e, studentCardDto.e) && t.c(this.p, studentCardDto.p) && t.c(this.pW, studentCardDto.pW) && t.c(this.pi, studentCardDto.pi) && t.c(this.b, studentCardDto.b) && t.c(this.a, studentCardDto.a) && t.c(this.sn, studentCardDto.sn) && t.c(this.sa, studentCardDto.sa) && t.c(this.d, studentCardDto.d) && t.c(this.g, studentCardDto.g) && t.c(this.di, studentCardDto.di) && t.c(this.sp, studentCardDto.sp) && t.c(this.en, studentCardDto.en) && this.dis == studentCardDto.dis;
    }

    public final String getA() {
        return this.a;
    }

    public final Date getB() {
        return this.b;
    }

    public final String getC() {
        return this.c;
    }

    public final Date getD() {
        return this.d;
    }

    public final DataHeaderStudentDto getDh() {
        return this.dh;
    }

    public final String getDi() {
        return this.di;
    }

    public final boolean getDis() {
        return this.dis;
    }

    public final Date getE() {
        return this.e;
    }

    public final String getEn() {
        return this.en;
    }

    public final String getG() {
        return this.g;
    }

    public final String getN() {
        return this.n;
    }

    public final String getP() {
        return this.p;
    }

    public final String getPW() {
        return this.pW;
    }

    public final String getPi() {
        return this.pi;
    }

    public final String getS() {
        return this.s;
    }

    public final String getSa() {
        return this.sa;
    }

    public final String getSn() {
        return this.sn;
    }

    public final String getSp() {
        return this.sp;
    }

    public final String getSu() {
        return this.su;
    }

    public int hashCode() {
        int iHashCode = ((this.dh.hashCode() * 31) + this.n.hashCode()) * 31;
        String str = this.s;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.su.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.p.hashCode()) * 31;
        String str2 = this.pW;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pi;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.b.hashCode()) * 31;
        String str4 = this.a;
        int iHashCode5 = (((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.sn.hashCode()) * 31) + this.sa.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str5 = this.g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.di;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.sp.hashCode()) * 31;
        String str7 = this.en;
        return ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + Boolean.hashCode(this.dis);
    }

    public String toString() {
        return "StudentCardDto(dh=" + this.dh + ", n=" + this.n + ", s=" + this.s + ", su=" + this.su + ", c=" + this.c + ", e=" + this.e + ", p=" + this.p + ", pW=" + this.pW + ", pi=" + this.pi + ", b=" + this.b + ", a=" + this.a + ", sn=" + this.sn + ", sa=" + this.sa + ", d=" + this.d + ", g=" + this.g + ", di=" + this.di + ", sp=" + this.sp + ", en=" + this.en + ", dis=" + this.dis + ')';
    }
}
