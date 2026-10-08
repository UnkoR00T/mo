package go3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0012"}, d2 = {"Lgo3/v0;", "Lgz/a;", "Lgo3/v0$a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "b", "(Lgo3/v0$a;)Ldx/i;", "Ldx/b$c;", "a", "Ldx/b$c;", "readingQrCodeExpiredError", "generatingQrCodeExpiredError", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 implements gz.a<Params, dx.i<? extends dx.b, ? extends oq.i0>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75731c = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business readingQrCodeExpiredError;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business generatingQrCodeExpiredError;

    /* JADX INFO: renamed from: go3.v0$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgo3/v0$a;", "Lgz/b$a;", "", "validTime", "currentTime", "", "isGenerated", "<init>", "(JJZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "c", "Z", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long validTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long currentTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isGenerated;

        public Params(long j15, long j16, boolean z15) {
            this.validTime = j15;
            this.currentTime = j16;
            this.isGenerated = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCurrentTime() {
            return this.currentTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getValidTime() {
            return this.validTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsGenerated() {
            return this.isGenerated;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.validTime == params.validTime && this.currentTime == params.currentTime && this.isGenerated == params.isGenerated;
        }

        public int hashCode() {
            return (((Long.hashCode(this.validTime) * 31) + Long.hashCode(this.currentTime)) * 31) + Boolean.hashCode(this.isGenerated);
        }

        public String toString() {
            return "Params(validTime=" + this.validTime + ", currentTime=" + this.currentTime + ", isGenerated=" + this.isGenerated + ')';
        }
    }

    public v0(mx.c cVar) {
        this.readingQrCodeExpiredError = new dx.b.Business(co3.a.EXPIRED_QR, null, cVar.c(un3.b.f199468p1), cVar.c(un3.b.f199458n1), null, cVar.c(un3.b.f199463o1), cVar.c(un3.b.f199406d), 18, null);
        this.generatingQrCodeExpiredError = new dx.b.Business(co3.a.GENERATED_EXPIRED_QR, null, cVar.c(un3.b.O), null, null, cVar.c(un3.b.P), cVar.c(un3.b.f199406d), 26, null);
    }

    public dx.i<dx.b, oq.i0> b(Params params) {
        if (params.getIsGenerated()) {
            if (params.getValidTime() >= params.getCurrentTime()) {
                return new dx.i.Left(this.generatingQrCodeExpiredError);
            }
        } else if (params.getValidTime() < params.getCurrentTime()) {
            return new dx.i.Left(this.readingQrCodeExpiredError);
        }
        return new dx.i.Right(oq.i0.f148189a);
    }
}
