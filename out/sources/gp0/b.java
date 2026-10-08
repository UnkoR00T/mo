package gp0;

import fp0.DeviceInfo;
import fr.t;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgp0/b;", "", "Lgp0/b$a;", "Lfp0/g;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.b {

    /* JADX INFO: renamed from: gp0.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, d2 = {"Lgp0/b$a;", "Lgz/b$a;", "", "ticket", "Lfp0/b;", "deviceInfo", "", "institutionId", "cardId", "Lry/c;", "certKeyPair", "<init>", "(Ljava/lang/String;Lfp0/b;IILry/c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lfp0/b;", "c", "()Lfp0/b;", "I", "d", "e", "Lry/c;", "()Lry/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ticket;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeviceInfo deviceInfo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int institutionId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int cardId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certKeyPair;

        public Params(String str, DeviceInfo deviceInfo, int i15, int i16, CertKeyPair certKeyPair) {
            this.ticket = str;
            this.deviceInfo = deviceInfo;
            this.institutionId = i15;
            this.cardId = i16;
            this.certKeyPair = certKeyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCardId() {
            return this.cardId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CertKeyPair getCertKeyPair() {
            return this.certKeyPair;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DeviceInfo getDeviceInfo() {
            return this.deviceInfo;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getInstitutionId() {
            return this.institutionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.ticket, params.ticket) && t.c(this.deviceInfo, params.deviceInfo) && this.institutionId == params.institutionId && this.cardId == params.cardId && t.c(this.certKeyPair, params.certKeyPair);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTicket() {
            return this.ticket;
        }

        public int hashCode() {
            String str = this.ticket;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + Integer.hashCode(this.institutionId)) * 31) + Integer.hashCode(this.cardId)) * 31) + this.certKeyPair.hashCode();
        }

        public String toString() {
            return "Params(ticket=" + this.ticket + ", deviceInfo=" + this.deviceInfo + ", institutionId=" + this.institutionId + ", cardId=" + this.cardId + ", certKeyPair=" + this.certKeyPair + ")";
        }
    }
}
