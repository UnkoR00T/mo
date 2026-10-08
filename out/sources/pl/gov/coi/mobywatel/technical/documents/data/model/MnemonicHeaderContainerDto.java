package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import oq.a;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u008e\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017¨\u00069"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;", "", "tp", "", "ver", "dn", "", "sn", "isr", "ts", "Ljava/time/OffsetDateTime;", "iid", "pe", "stp", "rId", "in", "id", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getTp", "()I", "getVer", "getDn", "()Ljava/lang/String;", "getSn", "getIsr", "getTs", "()Ljava/time/OffsetDateTime;", "getIid", "getPe", "getStp", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRId$annotations", "()V", "getRId", "getIn", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lpl/gov/coi/mobywatel/technical/documents/data/model/MnemonicHeaderContainerDto;", "equals", "", "other", "hashCode", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MnemonicHeaderContainerDto {

    @c("dn")
    private final String dn;

    @c("id")
    private final String id;

    @c("iid")
    private final String iid;

    @c("in")
    private final Integer in;

    @c("isr")
    private final String isr;

    @c("pe")
    private final String pe;

    @c("rId")
    private final String rId;

    @c("sn")
    private final String sn;

    @c("stp")
    private final Integer stp;

    @c("tp")
    private final int tp;

    @c("ts")
    private final OffsetDateTime ts;

    @c("ver")
    private final int ver;

    public MnemonicHeaderContainerDto(int i15, int i16, String str, String str2, String str3, OffsetDateTime offsetDateTime, String str4, String str5, Integer num, String str6, Integer num2, String str7) {
        this.tp = i15;
        this.ver = i16;
        this.dn = str;
        this.sn = str2;
        this.isr = str3;
        this.ts = offsetDateTime;
        this.iid = str4;
        this.pe = str5;
        this.stp = num;
        this.rId = str6;
        this.in = num2;
        this.id = str7;
    }

    public static /* synthetic */ MnemonicHeaderContainerDto copy$default(MnemonicHeaderContainerDto mnemonicHeaderContainerDto, int i15, int i16, String str, String str2, String str3, OffsetDateTime offsetDateTime, String str4, String str5, Integer num, String str6, Integer num2, String str7, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = mnemonicHeaderContainerDto.tp;
        }
        if ((i17 & 2) != 0) {
            i16 = mnemonicHeaderContainerDto.ver;
        }
        if ((i17 & 4) != 0) {
            str = mnemonicHeaderContainerDto.dn;
        }
        if ((i17 & 8) != 0) {
            str2 = mnemonicHeaderContainerDto.sn;
        }
        if ((i17 & 16) != 0) {
            str3 = mnemonicHeaderContainerDto.isr;
        }
        if ((i17 & 32) != 0) {
            offsetDateTime = mnemonicHeaderContainerDto.ts;
        }
        if ((i17 & 64) != 0) {
            str4 = mnemonicHeaderContainerDto.iid;
        }
        if ((i17 & 128) != 0) {
            str5 = mnemonicHeaderContainerDto.pe;
        }
        if ((i17 & 256) != 0) {
            num = mnemonicHeaderContainerDto.stp;
        }
        if ((i17 & 512) != 0) {
            str6 = mnemonicHeaderContainerDto.rId;
        }
        if ((i17 & 1024) != 0) {
            num2 = mnemonicHeaderContainerDto.in;
        }
        if ((i17 & 2048) != 0) {
            str7 = mnemonicHeaderContainerDto.id;
        }
        Integer num3 = num2;
        String str8 = str7;
        Integer num4 = num;
        String str9 = str6;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        return mnemonicHeaderContainerDto.copy(i15, i16, str, str2, str12, offsetDateTime2, str10, str11, num4, str9, num3, str8);
    }

    @a
    public static /* synthetic */ void getRId$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTp() {
        return this.tp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRId() {
        return this.rId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getIn() {
        return this.in;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVer() {
        return this.ver;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDn() {
        return this.dn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsr() {
        return this.isr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OffsetDateTime getTs() {
        return this.ts;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIid() {
        return this.iid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPe() {
        return this.pe;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getStp() {
        return this.stp;
    }

    public final MnemonicHeaderContainerDto copy(int tp4, int ver, String dn4, String sn4, String isr, OffsetDateTime ts4, String iid, String pe4, Integer stp, String rId, Integer in4, String id5) {
        return new MnemonicHeaderContainerDto(tp4, ver, dn4, sn4, isr, ts4, iid, pe4, stp, rId, in4, id5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MnemonicHeaderContainerDto)) {
            return false;
        }
        MnemonicHeaderContainerDto mnemonicHeaderContainerDto = (MnemonicHeaderContainerDto) other;
        return this.tp == mnemonicHeaderContainerDto.tp && this.ver == mnemonicHeaderContainerDto.ver && t.c(this.dn, mnemonicHeaderContainerDto.dn) && t.c(this.sn, mnemonicHeaderContainerDto.sn) && t.c(this.isr, mnemonicHeaderContainerDto.isr) && t.c(this.ts, mnemonicHeaderContainerDto.ts) && t.c(this.iid, mnemonicHeaderContainerDto.iid) && t.c(this.pe, mnemonicHeaderContainerDto.pe) && t.c(this.stp, mnemonicHeaderContainerDto.stp) && t.c(this.rId, mnemonicHeaderContainerDto.rId) && t.c(this.in, mnemonicHeaderContainerDto.in) && t.c(this.id, mnemonicHeaderContainerDto.id);
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

    public final Integer getIn() {
        return this.in;
    }

    public final String getIsr() {
        return this.isr;
    }

    public final String getPe() {
        return this.pe;
    }

    public final String getRId() {
        return this.rId;
    }

    public final String getSn() {
        return this.sn;
    }

    public final Integer getStp() {
        return this.stp;
    }

    public final int getTp() {
        return this.tp;
    }

    public final OffsetDateTime getTs() {
        return this.ts;
    }

    public final int getVer() {
        return this.ver;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Integer.hashCode(this.tp) * 31) + Integer.hashCode(this.ver)) * 31) + this.dn.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.isr.hashCode()) * 31) + this.ts.hashCode()) * 31) + this.iid.hashCode()) * 31) + this.pe.hashCode()) * 31;
        Integer num = this.stp;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.rId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.in;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.id;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "MnemonicHeaderContainerDto(tp=" + this.tp + ", ver=" + this.ver + ", dn=" + this.dn + ", sn=" + this.sn + ", isr=" + this.isr + ", ts=" + this.ts + ", iid=" + this.iid + ", pe=" + this.pe + ", stp=" + this.stp + ", rId=" + this.rId + ", in=" + this.in + ", id=" + this.id + ')';
    }

    public /* synthetic */ MnemonicHeaderContainerDto(int i15, int i16, String str, String str2, String str3, OffsetDateTime offsetDateTime, String str4, String str5, Integer num, String str6, Integer num2, String str7, int i17, k kVar) {
        this(i15, i16, str, str2, str3, offsetDateTime, str4, str5, (i17 & 256) != 0 ? null : num, (i17 & 512) != 0 ? null : str6, (i17 & 1024) != 0 ? null : num2, (i17 & 2048) != 0 ? null : str7);
    }
}
