package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0085\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\tHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00064"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;", "", "dn", "", "sn", "isr", "ts", "rId", "tp", "", "stp", "ver", "iid", "pesel", "institutionId", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDn", "()Ljava/lang/String;", "getSn", "getIsr", "getTs", "getRId", "getTp", "()I", "getStp", "getVer", "getIid", "getPesel", "getInstitutionId", "getId", "getTimestamp", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DataHeaderDto {

    @c("dn")
    private final String dn;

    @c("id")
    private final String id;

    @c("iid")
    private final String iid;

    @c("in")
    private final String institutionId;

    @c("isr")
    private final String isr;

    @c("pe")
    private final String pesel;

    @c("rId")
    private final String rId;

    @c("sn")
    private final String sn;

    @c("stp")
    private final String stp;

    @c("tp")
    private final int tp;

    @c("ts")
    private final String ts;

    @c("ver")
    private final String ver;

    public DataHeaderDto(String str, String str2, String str3, String str4, String str5, int i15, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.dn = str;
        this.sn = str2;
        this.isr = str3;
        this.ts = str4;
        this.rId = str5;
        this.tp = i15;
        this.stp = str6;
        this.ver = str7;
        this.iid = str8;
        this.pesel = str9;
        this.institutionId = str10;
        this.id = str11;
    }

    public static /* synthetic */ DataHeaderDto copy$default(DataHeaderDto dataHeaderDto, String str, String str2, String str3, String str4, String str5, int i15, String str6, String str7, String str8, String str9, String str10, String str11, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = dataHeaderDto.dn;
        }
        if ((i16 & 2) != 0) {
            str2 = dataHeaderDto.sn;
        }
        if ((i16 & 4) != 0) {
            str3 = dataHeaderDto.isr;
        }
        if ((i16 & 8) != 0) {
            str4 = dataHeaderDto.ts;
        }
        if ((i16 & 16) != 0) {
            str5 = dataHeaderDto.rId;
        }
        if ((i16 & 32) != 0) {
            i15 = dataHeaderDto.tp;
        }
        if ((i16 & 64) != 0) {
            str6 = dataHeaderDto.stp;
        }
        if ((i16 & 128) != 0) {
            str7 = dataHeaderDto.ver;
        }
        if ((i16 & 256) != 0) {
            str8 = dataHeaderDto.iid;
        }
        if ((i16 & 512) != 0) {
            str9 = dataHeaderDto.pesel;
        }
        if ((i16 & 1024) != 0) {
            str10 = dataHeaderDto.institutionId;
        }
        if ((i16 & 2048) != 0) {
            str11 = dataHeaderDto.id;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        int i17 = i15;
        return dataHeaderDto.copy(str, str2, str3, str4, str18, i17, str16, str17, str14, str15, str12, str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDn() {
        return this.dn;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIsr() {
        return this.isr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTs() {
        return this.ts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRId() {
        return this.rId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTp() {
        return this.tp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStp() {
        return this.stp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVer() {
        return this.ver;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIid() {
        return this.iid;
    }

    public final DataHeaderDto copy(String dn4, String sn4, String isr, String ts4, String rId, int tp4, String stp, String ver, String iid, String pesel, String institutionId, String id5) {
        return new DataHeaderDto(dn4, sn4, isr, ts4, rId, tp4, stp, ver, iid, pesel, institutionId, id5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataHeaderDto)) {
            return false;
        }
        DataHeaderDto dataHeaderDto = (DataHeaderDto) other;
        return t.c(this.dn, dataHeaderDto.dn) && t.c(this.sn, dataHeaderDto.sn) && t.c(this.isr, dataHeaderDto.isr) && t.c(this.ts, dataHeaderDto.ts) && t.c(this.rId, dataHeaderDto.rId) && this.tp == dataHeaderDto.tp && t.c(this.stp, dataHeaderDto.stp) && t.c(this.ver, dataHeaderDto.ver) && t.c(this.iid, dataHeaderDto.iid) && t.c(this.pesel, dataHeaderDto.pesel) && t.c(this.institutionId, dataHeaderDto.institutionId) && t.c(this.id, dataHeaderDto.id);
    }

    public final String getDn() {
        return this.dn;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIid() {
        return this.iid;
    }

    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final String getIsr() {
        return this.isr;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getRId() {
        return this.rId;
    }

    public final String getSn() {
        return this.sn;
    }

    public final String getStp() {
        return this.stp;
    }

    public final long getTimestamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(fz.c.FULL_TIME_NO_SPACES.getFormat(), Locale.forLanguageTag("pl"));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date date = simpleDateFormat.parse(this.ts);
            if (date != null) {
                return date.getTime();
            }
        } catch (ParseException unused) {
        }
        return 0L;
    }

    public final int getTp() {
        return this.tp;
    }

    public final String getTs() {
        return this.ts;
    }

    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.dn.hashCode() * 31) + this.sn.hashCode()) * 31) + this.isr.hashCode()) * 31) + this.ts.hashCode()) * 31) + this.rId.hashCode()) * 31) + Integer.hashCode(this.tp)) * 31) + this.stp.hashCode()) * 31) + this.ver.hashCode()) * 31) + this.iid.hashCode()) * 31;
        String str = this.pesel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.institutionId;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.id.hashCode();
    }

    public String toString() {
        return "DataHeaderDto(dn=" + this.dn + ", sn=" + this.sn + ", isr=" + this.isr + ", ts=" + this.ts + ", rId=" + this.rId + ", tp=" + this.tp + ", stp=" + this.stp + ", ver=" + this.ver + ", iid=" + this.iid + ", pesel=" + this.pesel + ", institutionId=" + this.institutionId + ", id=" + this.id + ')';
    }
}
