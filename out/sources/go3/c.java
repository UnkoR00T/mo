package go3;

import co3.InstitutionDataModel;
import fp0.DeviceInfo;
import fp0.InstitutionData;
import java.util.concurrent.CancellationException;
import jb4.PayloadErrorData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002!#BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lgo3/c;", "", "Lgo3/c$a;", "Lco3/c;", "Lgo3/v0;", "verifyQrCodeExpirationUseCase", "Lgp0/b;", "getInstitutionDataUC", "Lmx/c;", "labelProvider", "Lpl/gov/coi/common/network/u;", "httpHeaderDeviceInfoProvider", "Lco3/i;", "scopeMapper", "Lac4/d;", "getCurrentServerTimeUseCase", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lgo3/v0;Lgp0/b;Lmx/c;Lpl/gov/coi/common/network/u;Lco3/i;Lac4/d;Lbo3/a;)V", "Lmx/a;", "primaryKeyLabel", "Ldx/b$c;", "d", "(Lmx/a;)Ldx/b$c;", "Ldx/b;", "Ljb4/f;", "e", "(Ldx/b;)Ljb4/f;", "params", "Ldx/i;", "f", "(Lgo3/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/v0;", "b", "Lgp0/b;", "c", "Lmx/c;", "Lpl/gov/coi/common/network/u;", "Lco3/i;", "Lac4/d;", "g", "Lbo3/a;", "h", "Ldx/b$c;", "documentNotFoundError", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 verifyQrCodeExpirationUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gp0.b getInstitutionDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.common.network.u httpHeaderDeviceInfoProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final co3.i scopeMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business documentNotFoundError;

    /* JADX INFO: renamed from: go3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgo3/c$a;", "Lgz/b$a;", "", "cardId", "institutionId", "Lgo3/c$b;", "qrAdditionalData", "<init>", "(IILgo3/c$b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Lgo3/c$b;", "()Lgo3/c$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int cardId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int institutionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b qrAdditionalData;

        public Params(int i15, int i16, b bVar) {
            this.cardId = i15;
            this.institutionId = i16;
            this.qrAdditionalData = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCardId() {
            return this.cardId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getInstitutionId() {
            return this.institutionId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getQrAdditionalData() {
            return this.qrAdditionalData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.cardId == params.cardId && this.institutionId == params.institutionId && fr.t.c(this.qrAdditionalData, params.qrAdditionalData);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.cardId) * 31) + Integer.hashCode(this.institutionId)) * 31) + this.qrAdditionalData.hashCode();
        }

        public String toString() {
            return "Params(cardId=" + this.cardId + ", institutionId=" + this.institutionId + ", qrAdditionalData=" + this.qrAdditionalData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgo3/c$b;", "", "b", "a", "Lgo3/c$b$a;", "Lgo3/c$b$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: go3.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/c$b$a;", "Lgo3/c$b;", "", "validTime", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dynamic implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final long validTime;

            public Dynamic(long j15) {
                this.validTime = j15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getValidTime() {
                return this.validTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Dynamic) && this.validTime == ((Dynamic) other).validTime;
            }

            public int hashCode() {
                return Long.hashCode(this.validTime);
            }

            public String toString() {
                return "Dynamic(validTime=" + this.validTime + ')';
            }
        }

        /* JADX INFO: renamed from: go3.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgo3/c$b$b;", "Lgo3/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1708b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1708b f75237a = new C1708b();

            private C1708b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1708b);
            }

            public int hashCode() {
                return -160365748;
            }

            public String toString() {
                return "Static";
            }
        }
    }

    /* JADX INFO: renamed from: go3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1709c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75242h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75243j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f75244k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f75245l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75246m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75247n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f75248p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f75249q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75250r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f75251s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75252t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f75253v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f75255x;

        C1709c(tq.e<? super C1709c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75253v = obj;
            this.f75255x |= PKIFailureInfo.systemUnavail;
            return c.this.f(null, this);
        }
    }

    public c(v0 v0Var, gp0.b bVar, mx.c cVar, pl.gov.coi.common.network.u uVar, co3.i iVar, ac4.d dVar, bo3.a aVar) {
        this.verifyQrCodeExpirationUseCase = v0Var;
        this.getInstitutionDataUC = bVar;
        this.labelProvider = cVar;
        this.httpHeaderDeviceInfoProvider = uVar;
        this.scopeMapper = iVar;
        this.getCurrentServerTimeUseCase = dVar;
        this.verificationContainersInteractor = aVar;
        this.documentNotFoundError = new dx.b.Business(co3.a.DOCUMENT_NOT_FOUND, null, cVar.c(un3.b.M), cVar.c(un3.b.N), null, cVar.c(un3.b.f199406d), null, 82, null);
    }

    private final dx.b.Business d(Label primaryKeyLabel) {
        return new dx.b.Business(co3.a.UNKNOWN_INSTITUTION, null, this.labelProvider.c(un3.b.f199426h), primaryKeyLabel, null, this.labelProvider.c(un3.b.f199453m1), this.labelProvider.c(un3.b.f199406d), 18, null);
    }

    private final PayloadErrorData e(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x03b7 A[Catch: Exception -> 0x0132, c -> 0x0136, CancellationException -> 0x013a, TRY_ENTER, TryCatch #11 {c -> 0x0136, CancellationException -> 0x013a, Exception -> 0x0132, blocks: (B:71:0x022f, B:77:0x0245, B:79:0x0251, B:82:0x025d, B:74:0x0239, B:76:0x023d, B:125:0x03b7, B:126:0x03bc, B:67:0x01e2, B:44:0x0128, B:57:0x017a, B:59:0x0180, B:61:0x0190, B:63:0x0194, B:127:0x03bd, B:128:0x03c2), top: B:155:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x03bd A[Catch: Exception -> 0x0132, c -> 0x0136, CancellationException -> 0x013a, TryCatch #11 {c -> 0x0136, CancellationException -> 0x013a, Exception -> 0x0132, blocks: (B:71:0x022f, B:77:0x0245, B:79:0x0251, B:82:0x025d, B:74:0x0239, B:76:0x023d, B:125:0x03b7, B:126:0x03bc, B:67:0x01e2, B:44:0x0128, B:57:0x017a, B:59:0x0180, B:61:0x0190, B:63:0x0194, B:127:0x03bd, B:128:0x03c2), top: B:155:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:144:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:145:0x0402  */
    /* JADX WARN: Code duplicated, block: B:147:0x0406  */
    /* JADX WARN: Code duplicated, block: B:150:0x0413  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0180 A[Catch: Exception -> 0x0132, c -> 0x0136, CancellationException -> 0x013a, TryCatch #11 {c -> 0x0136, CancellationException -> 0x013a, Exception -> 0x0132, blocks: (B:71:0x022f, B:77:0x0245, B:79:0x0251, B:82:0x025d, B:74:0x0239, B:76:0x023d, B:125:0x03b7, B:126:0x03bc, B:67:0x01e2, B:44:0x0128, B:57:0x017a, B:59:0x0180, B:61:0x0190, B:63:0x0194, B:127:0x03bd, B:128:0x03c2), top: B:155:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0190 A[Catch: Exception -> 0x0132, c -> 0x0136, CancellationException -> 0x013a, TryCatch #11 {c -> 0x0136, CancellationException -> 0x013a, Exception -> 0x0132, blocks: (B:71:0x022f, B:77:0x0245, B:79:0x0251, B:82:0x025d, B:74:0x0239, B:76:0x023d, B:125:0x03b7, B:126:0x03bc, B:67:0x01e2, B:44:0x0128, B:57:0x017a, B:59:0x0180, B:61:0x0190, B:63:0x0194, B:127:0x03bd, B:128:0x03c2), top: B:155:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0194 A[Catch: Exception -> 0x0132, c -> 0x0136, CancellationException -> 0x013a, TryCatch #11 {c -> 0x0136, CancellationException -> 0x013a, Exception -> 0x0132, blocks: (B:71:0x022f, B:77:0x0245, B:79:0x0251, B:82:0x025d, B:74:0x0239, B:76:0x023d, B:125:0x03b7, B:126:0x03bc, B:67:0x01e2, B:44:0x0128, B:57:0x017a, B:59:0x0180, B:61:0x0190, B:63:0x0194, B:127:0x03bd, B:128:0x03c2), top: B:155:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x0225  */
    /* JADX WARN: Code duplicated, block: B:70:0x0227  */
    /* JADX WARN: Code duplicated, block: B:73:0x0237  */
    /* JADX WARN: Code duplicated, block: B:74:0x0239 A[Catch: Exception -> 0x0132, c -> 0x0136, CancellationException -> 0x013a, TryCatch #11 {c -> 0x0136, CancellationException -> 0x013a, Exception -> 0x0132, blocks: (B:71:0x022f, B:77:0x0245, B:79:0x0251, B:82:0x025d, B:74:0x0239, B:76:0x023d, B:125:0x03b7, B:126:0x03bc, B:67:0x01e2, B:44:0x0128, B:57:0x017a, B:59:0x0180, B:61:0x0190, B:63:0x0194, B:127:0x03bd, B:128:0x03c2), top: B:155:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x023d A[Catch: Exception -> 0x0132, c -> 0x0136, CancellationException -> 0x013a, TryCatch #11 {c -> 0x0136, CancellationException -> 0x013a, Exception -> 0x0132, blocks: (B:71:0x022f, B:77:0x0245, B:79:0x0251, B:82:0x025d, B:74:0x0239, B:76:0x023d, B:125:0x03b7, B:126:0x03bc, B:67:0x01e2, B:44:0x0128, B:57:0x017a, B:59:0x0180, B:61:0x0190, B:63:0x0194, B:127:0x03bd, B:128:0x03c2), top: B:155:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0251 A[Catch: Exception -> 0x0132, c -> 0x0136, CancellationException -> 0x013a, TryCatch #11 {c -> 0x0136, CancellationException -> 0x013a, Exception -> 0x0132, blocks: (B:71:0x022f, B:77:0x0245, B:79:0x0251, B:82:0x025d, B:74:0x0239, B:76:0x023d, B:125:0x03b7, B:126:0x03bc, B:67:0x01e2, B:44:0x0128, B:57:0x017a, B:59:0x0180, B:61:0x0190, B:63:0x0194, B:127:0x03bd, B:128:0x03c2), top: B:155:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x025a  */
    /* JADX WARN: Code duplicated, block: B:86:0x02cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    public Object f(Params params, tq.e<? super dx.i<? extends dx.b, InstitutionDataModel>> eVar) {
        C1709c c1709c;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        dx.j<dx.b> jVar;
        Params params2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        dx.i iVar;
        k34.u uVar;
        Object objB2;
        dx.i iVar2;
        k34.u uVar2;
        int i25;
        int i26;
        int i27;
        int i28;
        ex.b bVar2;
        Params params3;
        int i29;
        ex.b bVar3;
        ex.b bVar4;
        int i35;
        int i36;
        CertKeyPair certKeyPair;
        Params params4;
        k34.u uVar3;
        Object objG;
        CertKeyPair certKeyPair2;
        dx.i iVar3;
        k34.u uVar4;
        Params params5;
        dx.i iVar4;
        iy.b0 b0Var;
        String strE;
        Params params6;
        Label labelC;
        if (eVar instanceof C1709c) {
            c1709c = (C1709c) eVar;
            int i37 = c1709c.f75255x;
            if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                c1709c.f75255x = i37 - PKIFailureInfo.systemUnavail;
            } else {
                c1709c = new C1709c(eVar);
            }
        } else {
            c1709c = new C1709c(eVar);
        }
        Object objA = c1709c.f75253v;
        ?? E = uq.b.e();
        int i38 = c1709c.f75255x;
        try {
            try {
                if (i38 == 0) {
                    oq.u.b(objA);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        bo3.a aVar2 = this.verificationContainersInteractor;
                        c1709c.f75238d = params;
                        c1709c.f75239e = jVarA;
                        c1709c.f75240f = vq.j.a(aVar);
                        c1709c.f75241g = aVar;
                        c1709c.f75246m = 0;
                        c1709c.f75247n = 0;
                        c1709c.f75248p = 0;
                        c1709c.f75249q = 0;
                        c1709c.f75250r = 0;
                        c1709c.f75255x = 1;
                        objA = bo3.a.A(aVar2, false, c1709c, 1, null);
                        if (objA != E) {
                            jVar = jVarA;
                            params2 = params;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar;
                            iVar = (dx.i) objA;
                            if (iVar instanceof dx.i.Left) {
                                return new dx.i.Left(this.documentNotFoundError);
                            }
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            uVar = (k34.u) ((dx.i.Right) iVar).b();
                            bo3.a aVar3 = this.verificationContainersInteractor;
                            c1709c.f75238d = params2;
                            c1709c.f75239e = jVar;
                            c1709c.f75240f = vq.j.a(bVar);
                            c1709c.f75241g = vq.j.a(aVar);
                            c1709c.f75242h = vq.j.a(iVar);
                            c1709c.f75243j = uVar;
                            c1709c.f75244k = aVar;
                            c1709c.f75246m = i19;
                            c1709c.f75247n = i18;
                            c1709c.f75248p = i17;
                            c1709c.f75249q = i16;
                            c1709c.f75250r = i15;
                            c1709c.f75251s = 0;
                            c1709c.f75252t = 0;
                            c1709c.f75255x = 2;
                            objB2 = aVar3.b(uVar, c1709c);
                            if (objB2 == E) {
                                iVar2 = iVar;
                                uVar2 = uVar;
                                objA = objB2;
                                i25 = i17;
                                i26 = 0;
                                i27 = i15;
                                i28 = i16;
                                bVar2 = aVar;
                                params3 = params2;
                                i29 = i18;
                                bVar3 = bVar2;
                                bVar4 = bVar;
                                i35 = i19;
                                i36 = 0;
                                certKeyPair = (CertKeyPair) bVar3.a((dx.i) objA);
                                bo3.a aVar4 = this.verificationContainersInteractor;
                                c1709c.f75238d = params3;
                                c1709c.f75239e = jVar;
                                params4 = params3;
                                c1709c.f75240f = vq.j.a(bVar4);
                                c1709c.f75241g = vq.j.a(bVar2);
                                c1709c.f75242h = vq.j.a(iVar2);
                                c1709c.f75243j = vq.j.a(uVar2);
                                c1709c.f75244k = certKeyPair;
                                c1709c.f75246m = i35;
                                c1709c.f75247n = i29;
                                c1709c.f75248p = i25;
                                c1709c.f75249q = i28;
                                c1709c.f75250r = i27;
                                c1709c.f75251s = i26;
                                c1709c.f75252t = i36;
                                c1709c.f75255x = 3;
                                uVar3 = uVar2;
                                objG = aVar4.g(uVar3, c1709c);
                                if (objG == E) {
                                    certKeyPair2 = certKeyPair;
                                    objA = objG;
                                    iVar3 = iVar2;
                                    uVar4 = uVar3;
                                    params5 = params4;
                                    iVar4 = (dx.i) objA;
                                    ex.b bVar5 = bVar2;
                                    if (iVar4 instanceof dx.i.Left) {
                                        b0Var = null;
                                    } else {
                                        if (iVar4 instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        b0Var = (iy.b0) ((dx.i.Right) iVar4).b();
                                    }
                                    gp0.b bVar6 = this.getInstitutionDataUC;
                                    int cardId = params5.getCardId();
                                    int institutionId = params5.getInstitutionId();
                                    if (b0Var != null) {
                                        strE = iy.c0.e(b0Var);
                                    } else {
                                        strE = null;
                                    }
                                    ex.b bVar7 = bVar4;
                                    gp0.b.Params params7 = new gp0.b.Params(strE, new DeviceInfo(this.httpHeaderDeviceInfoProvider.b().getVersionName(), this.httpHeaderDeviceInfoProvider.b().getVersionCode(), this.httpHeaderDeviceInfoProvider.a()), institutionId, cardId, certKeyPair2);
                                    c1709c.f75238d = params5;
                                    c1709c.f75239e = jVar;
                                    c1709c.f75240f = vq.j.a(bVar7);
                                    c1709c.f75241g = vq.j.a(bVar5);
                                    c1709c.f75242h = vq.j.a(iVar3);
                                    c1709c.f75243j = vq.j.a(uVar4);
                                    c1709c.f75244k = vq.j.a(certKeyPair2);
                                    c1709c.f75245l = vq.j.a(b0Var);
                                    c1709c.f75246m = i35;
                                    c1709c.f75247n = i29;
                                    c1709c.f75248p = i25;
                                    c1709c.f75249q = i28;
                                    c1709c.f75250r = i27;
                                    c1709c.f75251s = i26;
                                    c1709c.f75252t = i36;
                                    c1709c.f75255x = 4;
                                    objA = bVar6.c(params7, c1709c);
                                    if (objA == E) {
                                        return E;
                                    }
                                    params6 = params5;
                                }
                            }
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else if (i38 == 1) {
                    i15 = c1709c.f75250r;
                    i16 = c1709c.f75249q;
                    int i39 = c1709c.f75248p;
                    int i45 = c1709c.f75247n;
                    int i46 = c1709c.f75246m;
                    ex.b bVar8 = (ex.b) c1709c.f75241g;
                    ex.b bVar9 = (ex.b) c1709c.f75240f;
                    jVar = (dx.j) c1709c.f75239e;
                    params2 = (Params) c1709c.f75238d;
                    try {
                        oq.u.b(objA);
                        bVar = bVar9;
                        aVar = bVar8;
                        i19 = i46;
                        i18 = i45;
                        i17 = i39;
                        iVar = (dx.i) objA;
                        if (iVar instanceof dx.i.Left) {
                            return new dx.i.Left(this.documentNotFoundError);
                        }
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        uVar = (k34.u) ((dx.i.Right) iVar).b();
                        bo3.a aVar5 = this.verificationContainersInteractor;
                        c1709c.f75238d = params2;
                        c1709c.f75239e = jVar;
                        c1709c.f75240f = vq.j.a(bVar);
                        c1709c.f75241g = vq.j.a(aVar);
                        c1709c.f75242h = vq.j.a(iVar);
                        c1709c.f75243j = uVar;
                        c1709c.f75244k = aVar;
                        c1709c.f75246m = i19;
                        c1709c.f75247n = i18;
                        c1709c.f75248p = i17;
                        c1709c.f75249q = i16;
                        c1709c.f75250r = i15;
                        c1709c.f75251s = 0;
                        c1709c.f75252t = 0;
                        c1709c.f75255x = 2;
                        objB2 = aVar5.b(uVar, c1709c);
                        if (objB2 == E) {
                            iVar2 = iVar;
                            uVar2 = uVar;
                            objA = objB2;
                            i25 = i17;
                            i26 = 0;
                            i27 = i15;
                            i28 = i16;
                            bVar2 = aVar;
                            params3 = params2;
                            i29 = i18;
                            bVar3 = bVar2;
                            bVar4 = bVar;
                            i35 = i19;
                            i36 = 0;
                            certKeyPair = (CertKeyPair) bVar3.a((dx.i) objA);
                            bo3.a aVar6 = this.verificationContainersInteractor;
                            c1709c.f75238d = params3;
                            c1709c.f75239e = jVar;
                            params4 = params3;
                            c1709c.f75240f = vq.j.a(bVar4);
                            c1709c.f75241g = vq.j.a(bVar2);
                            c1709c.f75242h = vq.j.a(iVar2);
                            c1709c.f75243j = vq.j.a(uVar2);
                            c1709c.f75244k = certKeyPair;
                            c1709c.f75246m = i35;
                            c1709c.f75247n = i29;
                            c1709c.f75248p = i25;
                            c1709c.f75249q = i28;
                            c1709c.f75250r = i27;
                            c1709c.f75251s = i26;
                            c1709c.f75252t = i36;
                            c1709c.f75255x = 3;
                            uVar3 = uVar2;
                            objG = aVar6.g(uVar3, c1709c);
                            if (objG == E) {
                                certKeyPair2 = certKeyPair;
                                objA = objG;
                                iVar3 = iVar2;
                                uVar4 = uVar3;
                                params5 = params4;
                                iVar4 = (dx.i) objA;
                                ex.b bVar10 = bVar2;
                                if (iVar4 instanceof dx.i.Left) {
                                    b0Var = null;
                                } else {
                                    if (iVar4 instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    b0Var = (iy.b0) ((dx.i.Right) iVar4).b();
                                }
                                gp0.b bVar11 = this.getInstitutionDataUC;
                                int cardId2 = params5.getCardId();
                                int institutionId2 = params5.getInstitutionId();
                                if (b0Var != null) {
                                    strE = iy.c0.e(b0Var);
                                } else {
                                    strE = null;
                                }
                                ex.b bVar12 = bVar4;
                                gp0.b.Params params8 = new gp0.b.Params(strE, new DeviceInfo(this.httpHeaderDeviceInfoProvider.b().getVersionName(), this.httpHeaderDeviceInfoProvider.b().getVersionCode(), this.httpHeaderDeviceInfoProvider.a()), institutionId2, cardId2, certKeyPair2);
                                c1709c.f75238d = params5;
                                c1709c.f75239e = jVar;
                                c1709c.f75240f = vq.j.a(bVar12);
                                c1709c.f75241g = vq.j.a(bVar10);
                                c1709c.f75242h = vq.j.a(iVar3);
                                c1709c.f75243j = vq.j.a(uVar4);
                                c1709c.f75244k = vq.j.a(certKeyPair2);
                                c1709c.f75245l = vq.j.a(b0Var);
                                c1709c.f75246m = i35;
                                c1709c.f75247n = i29;
                                c1709c.f75248p = i25;
                                c1709c.f75249q = i28;
                                c1709c.f75250r = i27;
                                c1709c.f75251s = i26;
                                c1709c.f75252t = i36;
                                c1709c.f75255x = 4;
                                objA = bVar11.c(params8, c1709c);
                                if (objA == E) {
                                    return E;
                                }
                                params6 = params5;
                            }
                        }
                        return E;
                    } catch (ex.c e18) {
                        e = e18;
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        E = jVar;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i38 != 2) {
                        if (i38 == 3) {
                            int i47 = c1709c.f75252t;
                            i26 = c1709c.f75251s;
                            i27 = c1709c.f75250r;
                            i28 = c1709c.f75249q;
                            i25 = c1709c.f75248p;
                            int i48 = c1709c.f75247n;
                            int i49 = c1709c.f75246m;
                            CertKeyPair certKeyPair3 = (CertKeyPair) c1709c.f75244k;
                            uVar4 = (k34.u) c1709c.f75243j;
                            dx.i iVar5 = (dx.i) c1709c.f75242h;
                            bVar2 = (ex.b) c1709c.f75241g;
                            bVar4 = (ex.b) c1709c.f75240f;
                            dx.j<dx.b> jVar2 = (dx.j) c1709c.f75239e;
                            params5 = (Params) c1709c.f75238d;
                            try {
                                oq.u.b(objA);
                                certKeyPair2 = certKeyPair3;
                                iVar3 = iVar5;
                                jVar = jVar2;
                                i35 = i49;
                                i29 = i48;
                                i36 = i47;
                                iVar4 = (dx.i) objA;
                                ex.b bVar13 = bVar2;
                                if (iVar4 instanceof dx.i.Left) {
                                    b0Var = null;
                                } else {
                                    if (iVar4 instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    b0Var = (iy.b0) ((dx.i.Right) iVar4).b();
                                }
                                gp0.b bVar14 = this.getInstitutionDataUC;
                                int cardId3 = params5.getCardId();
                                int institutionId3 = params5.getInstitutionId();
                                if (b0Var != null) {
                                    strE = iy.c0.e(b0Var);
                                } else {
                                    strE = null;
                                }
                                ex.b bVar15 = bVar4;
                                gp0.b.Params params9 = new gp0.b.Params(strE, new DeviceInfo(this.httpHeaderDeviceInfoProvider.b().getVersionName(), this.httpHeaderDeviceInfoProvider.b().getVersionCode(), this.httpHeaderDeviceInfoProvider.a()), institutionId3, cardId3, certKeyPair2);
                                c1709c.f75238d = params5;
                                c1709c.f75239e = jVar;
                                c1709c.f75240f = vq.j.a(bVar15);
                                c1709c.f75241g = vq.j.a(bVar13);
                                c1709c.f75242h = vq.j.a(iVar3);
                                c1709c.f75243j = vq.j.a(uVar4);
                                c1709c.f75244k = vq.j.a(certKeyPair2);
                                c1709c.f75245l = vq.j.a(b0Var);
                                c1709c.f75246m = i35;
                                c1709c.f75247n = i29;
                                c1709c.f75248p = i25;
                                c1709c.f75249q = i28;
                                c1709c.f75250r = i27;
                                c1709c.f75251s = i26;
                                c1709c.f75252t = i36;
                                c1709c.f75255x = 4;
                                objA = bVar14.c(params9, c1709c);
                                if (objA == E) {
                                    return E;
                                }
                                params6 = params5;
                            } catch (ex.c e26) {
                                e = e26;
                            } catch (CancellationException e27) {
                                throw e27;
                            } catch (Exception e28) {
                                e = e28;
                                E = jVar2;
                                px.f fVar3 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar3.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else {
                            if (i38 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            params6 = (Params) c1709c.f75238d;
                            try {
                                oq.u.b(objA);
                            } catch (ex.c e29) {
                                e = e29;
                            } catch (CancellationException e35) {
                                throw e35;
                            }
                        }
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    }
                    int i55 = c1709c.f75252t;
                    int i56 = c1709c.f75251s;
                    int i57 = c1709c.f75250r;
                    int i58 = c1709c.f75249q;
                    int i59 = c1709c.f75248p;
                    int i65 = c1709c.f75247n;
                    int i66 = c1709c.f75246m;
                    ex.b bVar16 = (ex.b) c1709c.f75244k;
                    k34.u uVar5 = (k34.u) c1709c.f75243j;
                    dx.i iVar6 = (dx.i) c1709c.f75242h;
                    ex.b bVar17 = (ex.b) c1709c.f75241g;
                    ex.b bVar18 = (ex.b) c1709c.f75240f;
                    dx.j<dx.b> jVar3 = (dx.j) c1709c.f75239e;
                    params3 = (Params) c1709c.f75238d;
                    try {
                        oq.u.b(objA);
                        i26 = i56;
                        uVar2 = uVar5;
                        jVar = jVar3;
                        iVar2 = iVar6;
                        bVar3 = bVar16;
                        i29 = i65;
                        bVar4 = bVar18;
                        i27 = i57;
                        bVar2 = bVar17;
                        i35 = i66;
                        i36 = i55;
                        i25 = i59;
                        i28 = i58;
                        certKeyPair = (CertKeyPair) bVar3.a((dx.i) objA);
                        bo3.a aVar7 = this.verificationContainersInteractor;
                        c1709c.f75238d = params3;
                        c1709c.f75239e = jVar;
                        params4 = params3;
                        c1709c.f75240f = vq.j.a(bVar4);
                        c1709c.f75241g = vq.j.a(bVar2);
                        c1709c.f75242h = vq.j.a(iVar2);
                        c1709c.f75243j = vq.j.a(uVar2);
                        c1709c.f75244k = certKeyPair;
                        c1709c.f75246m = i35;
                        c1709c.f75247n = i29;
                        c1709c.f75248p = i25;
                        c1709c.f75249q = i28;
                        c1709c.f75250r = i27;
                        c1709c.f75251s = i26;
                        c1709c.f75252t = i36;
                        c1709c.f75255x = 3;
                        uVar3 = uVar2;
                        objG = aVar7.g(uVar3, c1709c);
                        if (objG == E) {
                            return E;
                        }
                        certKeyPair2 = certKeyPair;
                        objA = objG;
                        iVar3 = iVar2;
                        uVar4 = uVar3;
                        params5 = params4;
                        iVar4 = (dx.i) objA;
                        ex.b bVar19 = bVar2;
                        if (iVar4 instanceof dx.i.Left) {
                            b0Var = null;
                        } else {
                            if (iVar4 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            b0Var = (iy.b0) ((dx.i.Right) iVar4).b();
                        }
                        gp0.b bVar110 = this.getInstitutionDataUC;
                        int cardId4 = params5.getCardId();
                        int institutionId4 = params5.getInstitutionId();
                        if (b0Var != null) {
                            strE = iy.c0.e(b0Var);
                        } else {
                            strE = null;
                        }
                        ex.b bVar111 = bVar4;
                        gp0.b.Params params10 = new gp0.b.Params(strE, new DeviceInfo(this.httpHeaderDeviceInfoProvider.b().getVersionName(), this.httpHeaderDeviceInfoProvider.b().getVersionCode(), this.httpHeaderDeviceInfoProvider.a()), institutionId4, cardId4, certKeyPair2);
                        c1709c.f75238d = params5;
                        c1709c.f75239e = jVar;
                        c1709c.f75240f = vq.j.a(bVar111);
                        c1709c.f75241g = vq.j.a(bVar19);
                        c1709c.f75242h = vq.j.a(iVar3);
                        c1709c.f75243j = vq.j.a(uVar4);
                        c1709c.f75244k = vq.j.a(certKeyPair2);
                        c1709c.f75245l = vq.j.a(b0Var);
                        c1709c.f75246m = i35;
                        c1709c.f75247n = i29;
                        c1709c.f75248p = i25;
                        c1709c.f75249q = i28;
                        c1709c.f75250r = i27;
                        c1709c.f75251s = i26;
                        c1709c.f75252t = i36;
                        c1709c.f75255x = 4;
                        objA = bVar110.c(params10, c1709c);
                        if (objA == E) {
                            return E;
                        }
                        params6 = params5;
                    } catch (ex.c e36) {
                        e = e36;
                    } catch (CancellationException e37) {
                        throw e37;
                    } catch (Exception e38) {
                        e = e38;
                        E = jVar3;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                dx.i iVar7 = (dx.i) objA;
                if (iVar7 instanceof dx.i.Left) {
                    dx.b bVar20 = (dx.b) ((dx.i.Left) iVar7).b();
                    if (bVar20 instanceof dx.b.g.Http) {
                        PayloadErrorData payloadErrorDataE = e(bVar20);
                        String code = payloadErrorDataE != null ? payloadErrorDataE.getCode() : null;
                        if (fr.t.c(code, "8008") || fr.t.c(code, "2012")) {
                            String message2 = payloadErrorDataE.getMessage();
                            if (message2 == null || (labelC = mx.b.b(message2, "errorDataMessage")) == null) {
                                labelC = this.labelProvider.c(un3.b.f199466p);
                            }
                            return new dx.i.Left(d(labelC));
                        }
                    }
                    return new dx.i.Left(bVar20);
                }
                if (!(iVar7 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                InstitutionData institutionData = (InstitutionData) ((dx.i.Right) iVar7).b();
                long epochSecond = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a).toEpochSecond();
                InstitutionDataModel institutionDataModel = new InstitutionDataModel(institutionData.getCardId(), institutionData.getInstitutionId(), institutionData.getName(), institutionData.getUrl(), this.scopeMapper.a(institutionData.getScope()), Integer.parseInt(institutionData.getPurpose()), institutionData.getPurposeName(), institutionData.getCertificate(), epochSecond);
                if (!(params6.getQrAdditionalData() instanceof b.Dynamic)) {
                    return new dx.i.Right(institutionDataModel);
                }
                dx.i<dx.b, oq.i0> iVarB = this.verifyQrCodeExpirationUseCase.b(new v0.Params(((b.Dynamic) params6.getQrAdditionalData()).getValidTime(), epochSecond, false));
                if (iVarB instanceof dx.i.Left) {
                    return iVarB;
                }
                if (!(iVarB instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                return new dx.i.Right(institutionDataModel);
            } catch (Exception e39) {
                e = e39;
            }
        } catch (CancellationException e45) {
            throw e45;
        }
    }
}
