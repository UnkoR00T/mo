package m23;

import dx.i;
import fr.t;
import java.util.List;
import k23.AttachmentFile;
import o04.UploadedFile;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt0.BEAttachmentsConfiguration;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u001dB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lm23/b;", "Lgz/b;", "Lm23/b$a;", "Lm23/b$b;", "Lp04/b;", "uploadFileToCloudUC", "Lut0/a;", "fetchAttachmentsConfigurationUC", "Lez/a;", "currentTimeProvider", "<init>", "(Lp04/b;Lut0/a;Lez/a;)V", "Lo04/e;", "fileToUpload", "Ltt0/b;", "configuration", "Ldx/i;", "Ldx/b;", "Lo04/f;", "f", "(Lo04/e;Ltt0/b;Ltq/e;)Ljava/lang/Object;", "Lo04/b$b;", "e", "(Ltt0/b;)Lo04/b$b;", "params", "d", "(Lm23/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp04/b;", "b", "Lut0/a;", "c", "Lez/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p04.b uploadFileToCloudUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ut0.a fetchAttachmentsConfigurationUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: m23.b$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lm23/b$a;", "Lgz/b$a;", "", "Lk23/a;", "attachments", "Ltt0/b;", "configuration", "<init>", "(Ljava/util/List;Ltt0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ltt0/b;", "()Ltt0/b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AttachmentFile> attachments;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEAttachmentsConfiguration configuration;

        public Params(List<AttachmentFile> list, BEAttachmentsConfiguration bEAttachmentsConfiguration) {
            this.attachments = list;
            this.configuration = bEAttachmentsConfiguration;
        }

        public final List<AttachmentFile> a() {
            return this.attachments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BEAttachmentsConfiguration getConfiguration() {
            return this.configuration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.attachments, params.attachments) && t.c(this.configuration, params.configuration);
        }

        public int hashCode() {
            int iHashCode = this.attachments.hashCode() * 31;
            BEAttachmentsConfiguration bEAttachmentsConfiguration = this.configuration;
            return iHashCode + (bEAttachmentsConfiguration == null ? 0 : bEAttachmentsConfiguration.hashCode());
        }

        public String toString() {
            return "Params(attachments=" + this.attachments + ", configuration=" + this.configuration + ')';
        }
    }

    /* JADX INFO: renamed from: m23.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"Lm23/b$b;", "Lgz/b$a;", "", "Lk23/a;", "updatedAttachments", "Ltt0/b;", "updatedConfiguration", "Ldx/i;", "Ldx/b;", "Loq/i0;", "either", "<init>", "(Ljava/util/List;Ltt0/b;Ldx/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ltt0/b;", "c", "()Ltt0/b;", "Ldx/i;", "()Ldx/i;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AttachmentFile> updatedAttachments;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEAttachmentsConfiguration updatedConfiguration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final i<dx.b, i0> either;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(List<AttachmentFile> list, BEAttachmentsConfiguration bEAttachmentsConfiguration, i<? extends dx.b, i0> iVar) {
            this.updatedAttachments = list;
            this.updatedConfiguration = bEAttachmentsConfiguration;
            this.either = iVar;
        }

        public final i<dx.b, i0> a() {
            return this.either;
        }

        public final List<AttachmentFile> b() {
            return this.updatedAttachments;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BEAttachmentsConfiguration getUpdatedConfiguration() {
            return this.updatedConfiguration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.updatedAttachments, result.updatedAttachments) && t.c(this.updatedConfiguration, result.updatedConfiguration) && t.c(this.either, result.either);
        }

        public int hashCode() {
            int iHashCode = this.updatedAttachments.hashCode() * 31;
            BEAttachmentsConfiguration bEAttachmentsConfiguration = this.updatedConfiguration;
            return ((iHashCode + (bEAttachmentsConfiguration == null ? 0 : bEAttachmentsConfiguration.hashCode())) * 31) + this.either.hashCode();
        }

        public String toString() {
            return "Result(updatedAttachments=" + this.updatedAttachments + ", updatedConfiguration=" + this.updatedConfiguration + ", either=" + this.either + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f123352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f123354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f123355g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f123356h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f123357j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f123358k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f123359l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f123360m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f123361n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f123362p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f123363q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f123364r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f123365s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f123366t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f123367v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f123368w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f123369x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f123370y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f123371z;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(p04.b bVar, ut0.a aVar, ez.a aVar2) {
        this.uploadFileToCloudUC = bVar;
        this.fetchAttachmentsConfigurationUC = aVar;
        this.currentTimeProvider = aVar2;
    }

    private final o04.b.Uploader e(BEAttachmentsConfiguration bEAttachmentsConfiguration) {
        return new o04.b.Uploader(bEAttachmentsConfiguration.getUrl(), bEAttachmentsConfiguration.getJwtToken(), bEAttachmentsConfiguration.getExpiredDate(), bEAttachmentsConfiguration.getFileEncryptionKey(), bEAttachmentsConfiguration.getDomainCertificate(), null);
    }

    private final Object f(o04.e eVar, BEAttachmentsConfiguration bEAttachmentsConfiguration, tq.e<? super i<? extends dx.b, UploadedFile>> eVar2) {
        return this.uploadFileToCloudUC.c(new p04.b.Params(e(bEAttachmentsConfiguration), eVar), eVar2);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x018e A[Catch: Exception -> 0x019e, c -> 0x01a6, CancellationException -> 0x01b0, TryCatch #9 {c -> 0x01a6, CancellationException -> 0x01b0, Exception -> 0x019e, blocks: (B:54:0x0188, B:56:0x018e, B:58:0x0198, B:69:0x01ba), top: B:131:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0198 A[Catch: Exception -> 0x019e, c -> 0x01a6, CancellationException -> 0x01b0, TryCatch #9 {c -> 0x01a6, CancellationException -> 0x01b0, Exception -> 0x019e, blocks: (B:54:0x0188, B:56:0x018e, B:58:0x0198, B:69:0x01ba), top: B:131:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x021c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x008a: MOVE (r9 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:17:0x008a */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x021c -> B:127:0x022e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x027d -> B:80:0x0249). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object d(m23.b.Params r23, tq.e<? super m23.b.Result> r24) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m23.b.d(m23.b$a, tq.e):java.lang.Object");
    }
}
