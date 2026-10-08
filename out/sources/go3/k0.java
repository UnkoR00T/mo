package go3;

import ci0.BESendIdentityDataRequest;
import co3.InstitutionDataModel;
import co3.QrCodeData;
import java.util.concurrent.CancellationException;
import jb4.PayloadErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002'%BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102¨\u00067"}, d2 = {"Lgo3/k0;", "", "Lgo3/k0$b;", "Loq/i0;", "Lz92/e;", "saveInInstitutionsHistoryUseCase", "Lco3/i;", "scopeMapper", "Lez/a;", "currentTimeProvider", "Lgo3/a;", "checkOldDrivingLicenceExistUseCase", "Lao3/a;", "identityEncryptedDataFactory", "Ldi0/a;", "beSendIdentityToInstitutionUC", "Lbo3/a;", "verificationContainersInteractor", "Lmx/c;", "labelProvider", "<init>", "(Lz92/e;Lco3/i;Lez/a;Lgo3/a;Lao3/a;Ldi0/a;Lbo3/a;Lmx/c;)V", "params", "Lk34/u;", "identityType", "", "data", "Ldx/i;", "Ldx/b;", "g", "(Lgo3/k0$b;Lk34/u;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lco3/c;", "institutionData", "e", "(Lco3/c;Ltq/e;)Ljava/lang/Object;", "f", "(Lgo3/k0$b;Ltq/e;)Ljava/lang/Object;", "a", "Lz92/e;", "b", "Lco3/i;", "c", "Lez/a;", "d", "Lgo3/a;", "Lao3/a;", "Ldi0/a;", "Lbo3/a;", "Ldx/b$c;", "h", "Ldx/b$c;", "oldDrivingLicenceError", "i", "ocspError", "j", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k0 implements gz.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f75518k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z92.e saveInInstitutionsHistoryUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final co3.i scopeMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a checkOldDrivingLicenceExistUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ao3.a identityEncryptedDataFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final di0.a beSendIdentityToInstitutionUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business oldDrivingLicenceError;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business ocspError;

    /* JADX INFO: renamed from: go3.k0$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lgo3/k0$b;", "Lgz/b$a;", "Lco3/c;", "institutionData", "Lco3/e;", "qrCodeData", "Lrq0/b;", "documentType", "<init>", "(Lco3/c;Lco3/e;Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/c;", "()Lco3/c;", "b", "Lco3/e;", "()Lco3/e;", "c", "Lrq0/b;", "g", "()Lrq0/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstitutionDataModel institutionData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public Params(InstitutionDataModel institutionDataModel, QrCodeData qrCodeData, rq0.b bVar) {
            this.institutionData = institutionDataModel;
            this.qrCodeData = qrCodeData;
            this.documentType = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InstitutionDataModel getInstitutionData() {
            return this.institutionData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.institutionData, params.institutionData) && fr.t.c(this.qrCodeData, params.qrCodeData) && fr.t.c(this.documentType, params.documentType);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        public int hashCode() {
            return (((this.institutionData.hashCode() * 31) + this.qrCodeData.hashCode()) * 31) + this.documentType.hashCode();
        }

        public String toString() {
            return "Params(institutionData=" + this.institutionData + ", qrCodeData=" + this.qrCodeData + ", documentType=" + this.documentType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75535h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75536j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f75537k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75539m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75537k = obj;
            this.f75539m |= PKIFailureInfo.systemUnavail;
            return k0.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75544h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75545j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f75546k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f75547l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f75548m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75549n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f75550p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f75551q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75552r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f75553s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75554t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f75555v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f75556w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f75558y;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75556w = obj;
            this.f75558y |= PKIFailureInfo.systemUnavail;
            return k0.this.g(null, null, null, this);
        }
    }

    public k0(z92.e eVar, co3.i iVar, ez.a aVar, a aVar2, ao3.a aVar3, di0.a aVar4, bo3.a aVar5, mx.c cVar) {
        this.saveInInstitutionsHistoryUseCase = eVar;
        this.scopeMapper = iVar;
        this.currentTimeProvider = aVar;
        this.checkOldDrivingLicenceExistUseCase = aVar2;
        this.identityEncryptedDataFactory = aVar3;
        this.beSendIdentityToInstitutionUC = aVar4;
        this.verificationContainersInteractor = aVar5;
        this.oldDrivingLicenceError = new dx.b.Business(co3.a.DRIVING_LICENCE_UPDATE_REQUIRED, null, cVar.c(un3.b.f199403c1), cVar.c(un3.b.f199398b1), null, cVar.c(un3.b.f199416f), cVar.c(un3.b.f199436j), 18, null);
        this.ocspError = new dx.b.Business(null, null, cVar.c(un3.b.M), cVar.c(un3.b.f199448l1), null, cVar.c(un3.b.f199406d), null, 83, null);
    }

    private final Object e(InstitutionDataModel institutionDataModel, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
        return this.verificationContainersInteractor.p(institutionDataModel.getScope(), fr.t.c(institutionDataModel.getScope(), k34.a0.z.f107904a) ? wn3.a.MAIN.getValue() : null, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:106:0x0319 A[Catch: Exception -> 0x0209, c -> 0x020c, CancellationException -> 0x020f, TRY_ENTER, TryCatch #16 {c -> 0x020c, CancellationException -> 0x020f, Exception -> 0x0209, blocks: (B:75:0x0204, B:86:0x021b, B:89:0x022a, B:92:0x022f, B:94:0x0233, B:106:0x0319, B:107:0x031e, B:87:0x0222, B:108:0x031f, B:109:0x0324), top: B:137:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x031f A[Catch: Exception -> 0x0209, c -> 0x020c, CancellationException -> 0x020f, TryCatch #16 {c -> 0x020c, CancellationException -> 0x020f, Exception -> 0x0209, blocks: (B:75:0x0204, B:86:0x021b, B:89:0x022a, B:92:0x022f, B:94:0x0233, B:106:0x0319, B:107:0x031e, B:87:0x0222, B:108:0x031f, B:109:0x0324), top: B:137:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0348  */
    /* JADX WARN: Code duplicated, block: B:125:0x0359  */
    /* JADX WARN: Code duplicated, block: B:126:0x0367  */
    /* JADX WARN: Code duplicated, block: B:128:0x036b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0378  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c3 A[Catch: Exception -> 0x01e1, c -> 0x01e6, CancellationException -> 0x01eb, TryCatch #12 {c -> 0x01e6, CancellationException -> 0x01eb, Exception -> 0x01e1, blocks: (B:56:0x01bd, B:58:0x01c3, B:60:0x01cf, B:62:0x01de, B:71:0x01f4, B:72:0x01f8, B:52:0x0171), top: B:142:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01cf A[Catch: Exception -> 0x01e1, c -> 0x01e6, CancellationException -> 0x01eb, TryCatch #12 {c -> 0x01e6, CancellationException -> 0x01eb, Exception -> 0x01e1, blocks: (B:56:0x01bd, B:58:0x01c3, B:60:0x01cf, B:62:0x01de, B:71:0x01f4, B:72:0x01f8, B:52:0x0171), top: B:142:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01de A[Catch: Exception -> 0x01e1, c -> 0x01e6, CancellationException -> 0x01eb, TryCatch #12 {c -> 0x01e6, CancellationException -> 0x01eb, Exception -> 0x01e1, blocks: (B:56:0x01bd, B:58:0x01c3, B:60:0x01cf, B:62:0x01de, B:71:0x01f4, B:72:0x01f8, B:52:0x0171), top: B:142:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f4 A[Catch: Exception -> 0x01e1, c -> 0x01e6, CancellationException -> 0x01eb, TryCatch #12 {c -> 0x01e6, CancellationException -> 0x01eb, Exception -> 0x01e1, blocks: (B:56:0x01bd, B:58:0x01c3, B:60:0x01cf, B:62:0x01de, B:71:0x01f4, B:72:0x01f8, B:52:0x0171), top: B:142:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0202  */
    /* JADX WARN: Code duplicated, block: B:84:0x0215  */
    /* JADX WARN: Code duplicated, block: B:87:0x0222 A[Catch: Exception -> 0x0209, c -> 0x020c, CancellationException -> 0x020f, TryCatch #16 {c -> 0x020c, CancellationException -> 0x020f, Exception -> 0x0209, blocks: (B:75:0x0204, B:86:0x021b, B:89:0x022a, B:92:0x022f, B:94:0x0233, B:106:0x0319, B:107:0x031e, B:87:0x0222, B:108:0x031f, B:109:0x0324), top: B:137:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x022e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x022f A[Catch: Exception -> 0x0209, c -> 0x020c, CancellationException -> 0x020f, TryCatch #16 {c -> 0x020c, CancellationException -> 0x020f, Exception -> 0x0209, blocks: (B:75:0x0204, B:86:0x021b, B:89:0x022a, B:92:0x022f, B:94:0x0233, B:106:0x0319, B:107:0x031e, B:87:0x0222, B:108:0x031f, B:109:0x0324), top: B:137:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0233 A[Catch: Exception -> 0x0209, c -> 0x020c, CancellationException -> 0x020f, TRY_LEAVE, TryCatch #16 {c -> 0x020c, CancellationException -> 0x020f, Exception -> 0x0209, blocks: (B:75:0x0204, B:86:0x021b, B:89:0x022a, B:92:0x022f, B:94:0x0233, B:106:0x0319, B:107:0x031e, B:87:0x0222, B:108:0x031f, B:109:0x0324), top: B:137:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x030f  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x01cf, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v28, types: [dx.j] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object g(Params params, k34.u uVar, String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        d dVar;
        String message;
        dx.i iVarA;
        Object objB;
        Params params2;
        k34.u uVar2;
        String str2;
        ex.b bVar;
        ex.b bVar2;
        dx.j<dx.b> jVar;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar3;
        int i19;
        String str3;
        ex.b bVar4;
        ex.b bVar5;
        String str4;
        k34.u uVar3;
        Object objC;
        ex.b bVar6;
        String str5;
        Params params3;
        k34.u uVar4;
        String str6;
        ex.b bVar7;
        dx.i left;
        k0 k0Var;
        dx.b bVar8;
        dx.b bVar9;
        Object objB2;
        PayloadErrorData payloadErrorData;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i25 = dVar.f75558y;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f75558y = i25 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object objC2 = dVar2.f75556w;
        ?? E = uq.b.e();
        int i26 = dVar2.f75558y;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objC2);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ao3.a aVar2 = this.identityEncryptedDataFactory;
                        InstitutionDataModel institutionData = params.getInstitutionData();
                        QrCodeData qrCodeData = params.getQrCodeData();
                        params2 = params;
                        dVar2.f75540d = params2;
                        dVar2.f75541e = vq.j.a(uVar);
                        dVar2.f75542f = vq.j.a(str);
                        dVar2.f75543g = jVarA;
                        dVar2.f75544h = vq.j.a(aVar);
                        dVar2.f75545j = vq.j.a(aVar);
                        dVar2.f75546k = aVar;
                        dVar2.f75549n = 0;
                        dVar2.f75550p = 0;
                        dVar2.f75551q = 0;
                        dVar2.f75552r = 0;
                        dVar2.f75553s = 0;
                        dVar2.f75558y = 1;
                        Object objA = aVar2.a(institutionData, uVar, qrCodeData, str, dVar2);
                        if (objA != E) {
                            uVar2 = uVar;
                            str2 = str;
                            bVar = aVar;
                            bVar2 = bVar;
                            jVar = jVarA;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar3 = bVar2;
                            objC2 = objA;
                            i19 = 0;
                            str3 = (String) bVar3.a((dx.i) objC2);
                            di0.a aVar3 = this.beSendIdentityToInstitutionUC;
                            bVar4 = bVar;
                            bVar5 = bVar2;
                            str4 = str2;
                            uVar3 = uVar2;
                            di0.a.Params params4 = new di0.a.Params(new BESendIdentityDataRequest(params2.getInstitutionData().getUrl(), params2.getInstitutionData().getCardId(), params2.getInstitutionData().getInstitutionId(), str3));
                            dVar2.f75540d = params2;
                            dVar2.f75541e = vq.j.a(uVar3);
                            dVar2.f75542f = vq.j.a(str4);
                            dVar2.f75543g = jVar;
                            dVar2.f75544h = vq.j.a(bVar4);
                            dVar2.f75545j = vq.j.a(bVar5);
                            dVar2.f75546k = vq.j.a(str3);
                            dVar2.f75549n = i18;
                            dVar2.f75550p = i17;
                            dVar2.f75551q = i16;
                            dVar2.f75552r = i15;
                            dVar2.f75553s = i19;
                            dVar2.f75558y = 2;
                            objC = aVar3.c(params4, dVar2);
                            if (objC == E) {
                                bVar6 = bVar5;
                                str5 = str4;
                                params3 = params2;
                                uVar4 = uVar3;
                                str6 = str3;
                                objC2 = objC;
                                bVar7 = bVar4;
                                left = (dx.i) objC2;
                                if (left instanceof dx.i.Left) {
                                    bVar8 = (dx.b) ((dx.i.Left) left).b();
                                    if (bVar8 instanceof dx.b.g.Http) {
                                        objB2 = ((dx.b.g.Http) bVar8).b();
                                        if (objB2 instanceof PayloadErrorData) {
                                            payloadErrorData = (PayloadErrorData) objB2;
                                        } else {
                                            payloadErrorData = null;
                                        }
                                        if (fr.t.c(payloadErrorData != null ? payloadErrorData.getCode() : null, "5004")) {
                                            k0Var = this;
                                            bVar9 = k0Var.ocspError;
                                        }
                                        left = new dx.i.Left(bVar9);
                                    }
                                    k0Var = this;
                                    bVar9 = bVar8;
                                    left = new dx.i.Left(bVar9);
                                } else {
                                    k0Var = this;
                                    if (!(left instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                }
                                if (left instanceof dx.i.Left) {
                                    return left;
                                }
                                if (!(left instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                oq.i0 i0Var = (oq.i0) ((dx.i.Right) left).b();
                                dx.i iVar = left;
                                z92.e eVar2 = k0Var.saveInInstitutionsHistoryUseCase;
                                z92.e.Params params5 = new z92.e.Params(new y92.a.Institutions(k0Var.currentTimeProvider.a(), k0Var.scopeMapper.b(params3.getInstitutionData().getScope()), params3.getInstitutionData().getName(), params3.getInstitutionData().getPurposeName(), params3.getInstitutionData().getUrl(), params3.getInstitutionData().getCardId(), params3.getInstitutionData().getInstitutionId(), params3.getInstitutionData().getCertificate().getSubjectDN().getName(), params3.getInstitutionData().getCertificate().getSerialNumber().toString(16), params3.getInstitutionData().getCertificate().getIssuerDN().getName(), params3.getDocumentType()));
                                dVar2.f75540d = vq.j.a(params3);
                                dVar2.f75541e = vq.j.a(uVar4);
                                dVar2.f75542f = vq.j.a(str5);
                                dVar2.f75543g = jVar;
                                dVar2.f75544h = vq.j.a(bVar7);
                                dVar2.f75545j = vq.j.a(bVar6);
                                dVar2.f75546k = vq.j.a(iVar);
                                dVar2.f75547l = vq.j.a(str6);
                                dVar2.f75548m = vq.j.a(i0Var);
                                dVar2.f75549n = i18;
                                dVar2.f75550p = i17;
                                dVar2.f75551q = i16;
                                dVar2.f75552r = i15;
                                dVar2.f75553s = i19;
                                dVar2.f75554t = 0;
                                dVar2.f75555v = 0;
                                dVar2.f75558y = 3;
                                objC2 = eVar2.c(params5, dVar2);
                                if (objC2 != E) {
                                    return (dx.i) objC2;
                                }
                            }
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
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
                }
                if (i26 == 1) {
                    i19 = dVar2.f75553s;
                    i15 = dVar2.f75552r;
                    i16 = dVar2.f75551q;
                    i17 = dVar2.f75550p;
                    i18 = dVar2.f75549n;
                    bVar3 = (ex.b) dVar2.f75546k;
                    ex.b bVar10 = (ex.b) dVar2.f75545j;
                    ex.b bVar11 = (ex.b) dVar2.f75544h;
                    jVar = (dx.j) dVar2.f75543g;
                    str2 = (String) dVar2.f75542f;
                    uVar2 = (k34.u) dVar2.f75541e;
                    params2 = (Params) dVar2.f75540d;
                    try {
                        oq.u.b(objC2);
                        bVar2 = bVar10;
                        bVar = bVar11;
                        str3 = (String) bVar3.a((dx.i) objC2);
                        di0.a aVar4 = this.beSendIdentityToInstitutionUC;
                        bVar4 = bVar;
                        bVar5 = bVar2;
                        str4 = str2;
                        uVar3 = uVar2;
                        try {
                            di0.a.Params params6 = new di0.a.Params(new BESendIdentityDataRequest(params2.getInstitutionData().getUrl(), params2.getInstitutionData().getCardId(), params2.getInstitutionData().getInstitutionId(), str3));
                            dVar2.f75540d = params2;
                            dVar2.f75541e = vq.j.a(uVar3);
                            dVar2.f75542f = vq.j.a(str4);
                            dVar2.f75543g = jVar;
                            dVar2.f75544h = vq.j.a(bVar4);
                            dVar2.f75545j = vq.j.a(bVar5);
                            dVar2.f75546k = vq.j.a(str3);
                            dVar2.f75549n = i18;
                            dVar2.f75550p = i17;
                            dVar2.f75551q = i16;
                            dVar2.f75552r = i15;
                            dVar2.f75553s = i19;
                            dVar2.f75558y = 2;
                            objC = aVar4.c(params6, dVar2);
                            if (objC == E) {
                                bVar6 = bVar5;
                                str5 = str4;
                                params3 = params2;
                                uVar4 = uVar3;
                                str6 = str3;
                                objC2 = objC;
                                bVar7 = bVar4;
                                left = (dx.i) objC2;
                                if (left instanceof dx.i.Left) {
                                    bVar8 = (dx.b) ((dx.i.Left) left).b();
                                    if (bVar8 instanceof dx.b.g.Http) {
                                        objB2 = ((dx.b.g.Http) bVar8).b();
                                        if (objB2 instanceof PayloadErrorData) {
                                            payloadErrorData = (PayloadErrorData) objB2;
                                        } else {
                                            payloadErrorData = null;
                                        }
                                        if (fr.t.c(payloadErrorData != null ? payloadErrorData.getCode() : null, "5004")) {
                                            k0Var = this;
                                            bVar9 = k0Var.ocspError;
                                        }
                                        left = new dx.i.Left(bVar9);
                                    }
                                    k0Var = this;
                                    bVar9 = bVar8;
                                    left = new dx.i.Left(bVar9);
                                } else {
                                    k0Var = this;
                                    if (!(left instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                }
                                if (left instanceof dx.i.Left) {
                                    return left;
                                }
                                if (!(left instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                oq.i0 i0Var2 = (oq.i0) ((dx.i.Right) left).b();
                                dx.i iVar2 = left;
                                z92.e eVar3 = k0Var.saveInInstitutionsHistoryUseCase;
                                z92.e.Params params7 = new z92.e.Params(new y92.a.Institutions(k0Var.currentTimeProvider.a(), k0Var.scopeMapper.b(params3.getInstitutionData().getScope()), params3.getInstitutionData().getName(), params3.getInstitutionData().getPurposeName(), params3.getInstitutionData().getUrl(), params3.getInstitutionData().getCardId(), params3.getInstitutionData().getInstitutionId(), params3.getInstitutionData().getCertificate().getSubjectDN().getName(), params3.getInstitutionData().getCertificate().getSerialNumber().toString(16), params3.getInstitutionData().getCertificate().getIssuerDN().getName(), params3.getDocumentType()));
                                dVar2.f75540d = vq.j.a(params3);
                                dVar2.f75541e = vq.j.a(uVar4);
                                dVar2.f75542f = vq.j.a(str5);
                                dVar2.f75543g = jVar;
                                dVar2.f75544h = vq.j.a(bVar7);
                                dVar2.f75545j = vq.j.a(bVar6);
                                dVar2.f75546k = vq.j.a(iVar2);
                                dVar2.f75547l = vq.j.a(str6);
                                dVar2.f75548m = vq.j.a(i0Var2);
                                dVar2.f75549n = i18;
                                dVar2.f75550p = i17;
                                dVar2.f75551q = i16;
                                dVar2.f75552r = i15;
                                dVar2.f75553s = i19;
                                dVar2.f75554t = 0;
                                dVar2.f75555v = 0;
                                dVar2.f75558y = 3;
                                objC2 = eVar3.c(params7, dVar2);
                                if (objC2 != E) {
                                }
                            }
                            return E;
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            e = e19;
                            throw e;
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
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        e = e27;
                        throw e;
                    } catch (Exception e28) {
                        e = e28;
                        E = jVar;
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
                }
                if (i26 == 2) {
                    i19 = dVar2.f75553s;
                    i15 = dVar2.f75552r;
                    i16 = dVar2.f75551q;
                    i17 = dVar2.f75550p;
                    i18 = dVar2.f75549n;
                    str6 = (String) dVar2.f75546k;
                    bVar6 = (ex.b) dVar2.f75545j;
                    ex.b bVar12 = (ex.b) dVar2.f75544h;
                    dx.j<dx.b> jVar2 = (dx.j) dVar2.f75543g;
                    str5 = (String) dVar2.f75542f;
                    uVar4 = (k34.u) dVar2.f75541e;
                    params3 = (Params) dVar2.f75540d;
                    try {
                        oq.u.b(objC2);
                        bVar7 = bVar12;
                        jVar = jVar2;
                        left = (dx.i) objC2;
                        try {
                            if (left instanceof dx.i.Left) {
                                bVar8 = (dx.b) ((dx.i.Left) left).b();
                                if (bVar8 instanceof dx.b.g.Http) {
                                    objB2 = ((dx.b.g.Http) bVar8).b();
                                    if (objB2 instanceof PayloadErrorData) {
                                        payloadErrorData = (PayloadErrorData) objB2;
                                    } else {
                                        payloadErrorData = null;
                                    }
                                    if (fr.t.c(payloadErrorData != null ? payloadErrorData.getCode() : null, "5004")) {
                                        k0Var = this;
                                        bVar9 = k0Var.ocspError;
                                    }
                                    left = new dx.i.Left(bVar9);
                                }
                                k0Var = this;
                                bVar9 = bVar8;
                                left = new dx.i.Left(bVar9);
                            } else {
                                k0Var = this;
                                if (!(left instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                            }
                            if (left instanceof dx.i.Left) {
                                return left;
                            }
                            if (!(left instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            oq.i0 i0Var3 = (oq.i0) ((dx.i.Right) left).b();
                            dx.i iVar3 = left;
                            z92.e eVar4 = k0Var.saveInInstitutionsHistoryUseCase;
                            z92.e.Params params8 = new z92.e.Params(new y92.a.Institutions(k0Var.currentTimeProvider.a(), k0Var.scopeMapper.b(params3.getInstitutionData().getScope()), params3.getInstitutionData().getName(), params3.getInstitutionData().getPurposeName(), params3.getInstitutionData().getUrl(), params3.getInstitutionData().getCardId(), params3.getInstitutionData().getInstitutionId(), params3.getInstitutionData().getCertificate().getSubjectDN().getName(), params3.getInstitutionData().getCertificate().getSerialNumber().toString(16), params3.getInstitutionData().getCertificate().getIssuerDN().getName(), params3.getDocumentType()));
                            dVar2.f75540d = vq.j.a(params3);
                            dVar2.f75541e = vq.j.a(uVar4);
                            dVar2.f75542f = vq.j.a(str5);
                            dVar2.f75543g = jVar;
                            dVar2.f75544h = vq.j.a(bVar7);
                            dVar2.f75545j = vq.j.a(bVar6);
                            dVar2.f75546k = vq.j.a(iVar3);
                            dVar2.f75547l = vq.j.a(str6);
                            dVar2.f75548m = vq.j.a(i0Var3);
                            dVar2.f75549n = i18;
                            dVar2.f75550p = i17;
                            dVar2.f75551q = i16;
                            dVar2.f75552r = i15;
                            dVar2.f75553s = i19;
                            dVar2.f75554t = 0;
                            dVar2.f75555v = 0;
                            dVar2.f75558y = 3;
                            objC2 = eVar4.c(params8, dVar2);
                            if (objC2 != E) {
                            }
                            return E;
                        } catch (ex.c e29) {
                            e = e29;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e35) {
                            e = e35;
                            throw e;
                        } catch (Exception e36) {
                            e = e36;
                            E = jVar;
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
                    } catch (ex.c e37) {
                        e = e37;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e38) {
                        e = e38;
                        throw e;
                    } catch (Exception e39) {
                        e = e39;
                        E = jVar2;
                        px.f fVar5 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar5.d(message, e, px.c.a(E));
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
                if (i26 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                E = (dx.j) dVar2.f75543g;
                try {
                    oq.u.b(objC2);
                } catch (ex.c e45) {
                    e = e45;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e46) {
                    e = e46;
                    throw e;
                } catch (Exception e47) {
                    e = e47;
                    px.f fVar6 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar6.d(message, e, px.c.a(E));
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
                try {
                    return (dx.i) objC2;
                } catch (ex.c e48) {
                    e = e48;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e49) {
                    throw e49;
                }
            } catch (CancellationException e55) {
                throw e55;
            }
        } catch (Exception e56) {
            e = e56;
        }
    }

    static /* synthetic */ Object h(k0 k0Var, Params params, k34.u uVar, String str, tq.e eVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            str = null;
        }
        return k0Var.g(params, uVar, str, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[PHI: r10 r11
      0x00b9: PHI (r10v4 go3.k0$b) = (r10v1 go3.k0$b), (r10v17 go3.k0$b) binds: [B:34:0x00b6, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r11v11 java.lang.Object) = (r11v6 java.lang.Object), (r11v1 java.lang.Object) binds: [B:34:0x00b6, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0153  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014d, code lost:
    
        if (r11 == r0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(go3.k0.Params r10, tq.e<? super dx.i<? extends dx.b, oq.i0>> r11) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.k0.f(go3.k0$b, tq.e):java.lang.Object");
    }
}
