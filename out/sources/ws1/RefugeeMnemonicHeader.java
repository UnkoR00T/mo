package ws1;

import fr.t;
import iy.b0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ws1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010\u0014R\u0011\u00109\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b\u001b\u00108¨\u0006:"}, d2 = {"Lws1/f;", "", "", "tp", "", "stp", "ver", "dn", "sn", "isr", "ts", "rId", "iid", "Liy/b0;", "pe", "in", "id", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Liy/b0;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTp", "b", "Ljava/lang/String;", "getStp", "c", "getVer", "d", "getDn", "e", "getSn", "f", "getIsr", "g", "getTs", "h", "getRId", "i", "getIid", "j", "Liy/b0;", "getPe", "()Liy/b0;", "k", "getIn", "l", "getId", "", "()J", "lastUpdateTimestamp", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefugeeMnemonicHeader {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f214812m = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int tp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dn;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sn;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isr;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pe;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String in;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public RefugeeMnemonicHeader(int i15, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, b0 b0Var, String str9, String str10) {
        this.tp = i15;
        this.stp = str;
        this.ver = str2;
        this.dn = str3;
        this.sn = str4;
        this.isr = str5;
        this.ts = str6;
        this.rId = str7;
        this.iid = str8;
        this.pe = b0Var;
        this.in = str9;
        this.id = str10;
    }

    public final long a() {
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefugeeMnemonicHeader)) {
            return false;
        }
        RefugeeMnemonicHeader refugeeMnemonicHeader = (RefugeeMnemonicHeader) other;
        return this.tp == refugeeMnemonicHeader.tp && t.c(this.stp, refugeeMnemonicHeader.stp) && t.c(this.ver, refugeeMnemonicHeader.ver) && t.c(this.dn, refugeeMnemonicHeader.dn) && t.c(this.sn, refugeeMnemonicHeader.sn) && t.c(this.isr, refugeeMnemonicHeader.isr) && t.c(this.ts, refugeeMnemonicHeader.ts) && t.c(this.rId, refugeeMnemonicHeader.rId) && t.c(this.iid, refugeeMnemonicHeader.iid) && t.c(this.pe, refugeeMnemonicHeader.pe) && t.c(this.in, refugeeMnemonicHeader.in) && t.c(this.id, refugeeMnemonicHeader.id);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((Integer.hashCode(this.tp) * 31) + this.stp.hashCode()) * 31) + this.ver.hashCode()) * 31) + this.dn.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.isr.hashCode()) * 31) + this.ts.hashCode()) * 31) + this.rId.hashCode()) * 31) + this.iid.hashCode()) * 31) + this.pe.hashCode()) * 31;
        String str = this.in;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.id.hashCode();
    }

    public String toString() {
        return "RefugeeMnemonicHeader(tp=" + this.tp + ", stp=" + this.stp + ", ver=" + this.ver + ", dn=" + this.dn + ", sn=" + this.sn + ", isr=" + this.isr + ", ts=" + this.ts + ", rId=" + this.rId + ", iid=" + this.iid + ", pe=" + this.pe + ", in=" + this.in + ", id=" + this.id + ')';
    }
}
