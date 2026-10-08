package tq0;

import iy.b0;
import iy.c0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0014\u0015\u0016\n\u0006\u0003\u0012\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Ltq0/k;", "", "", "h", "()Ljava/lang/String;", "Ltq0/l;", "b", "verificationCode", "", "Liy/b0;", "f", "()Ljava/util/List;", "shortAddressParts", "Ltq0/g;", "getType", "()Ltq0/g;", "type", "Ltq0/f;", "a", "subtypes", "d", "g", "e", "c", "Ltq0/k$b;", "Ltq0/k$d;", "Ltq0/k$e;", "Ltq0/k$f;", "Ltq0/k$g;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    /* JADX INFO: renamed from: tq0.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b!\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b$\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b.\u0010\u0018¨\u00067"}, d2 = {"Ltq0/k$a;", "Ltq0/k$b;", "Ltq0/j;", "id", "Ltq0/b$b;", "documentId", "Ltq0/b$a;", "confirmationId", "", "Liy/b0;", "shortAddressParts", "Ltq0/f;", "subtypes", "Lfz/b$f;", "documentDownloadValidUntil", "Ltq0/l;", "verificationCode", "Ltq0/g;", "type", "", "documentNumber", "<init>", "(Ljava/lang/String;Ltq0/b$b;Ltq0/b$a;Ljava/util/List;Ljava/util/List;Lfz/b$f;Ljava/lang/String;Ltq0/g;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId-M4CpGAQ", "b", "Ltq0/b$b;", "c", "()Ltq0/b$b;", "Ltq0/b$a;", "d", "()Ltq0/b$a;", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lfz/b$f;", "g", "()Lfz/b$f;", "h", "Ltq0/g;", "getType", "()Ltq0/g;", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AboutToExpire implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.b.Main documentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.b.Confirmation confirmationId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<b0> shortAddressParts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<f> subtypes;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime documentDownloadValidUntil;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final g type;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentNumber;

        public /* synthetic */ AboutToExpire(String str, tq0.b.Main main, tq0.b.Confirmation confirmation, List list, List list2, fz.b.OffsetDateTime offsetDateTime, String str2, g gVar, String str3, fr.k kVar) {
            this(str, main, confirmation, list, list2, offsetDateTime, str2, gVar, str3);
        }

        @Override // tq0.k.b, tq0.k
        public List<f> a() {
            return this.subtypes;
        }

        @Override // tq0.k.b, tq0.k
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: c, reason: from getter */
        public tq0.b.Main getDocumentId() {
            return this.documentId;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public tq0.b.Confirmation getConfirmationId() {
            return this.confirmationId;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getDocumentNumber() {
            return this.documentNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AboutToExpire)) {
                return false;
            }
            AboutToExpire aboutToExpire = (AboutToExpire) other;
            return j.d(this.id, aboutToExpire.id) && fr.t.c(this.documentId, aboutToExpire.documentId) && fr.t.c(this.confirmationId, aboutToExpire.confirmationId) && fr.t.c(this.shortAddressParts, aboutToExpire.shortAddressParts) && fr.t.c(this.subtypes, aboutToExpire.subtypes) && fr.t.c(this.documentDownloadValidUntil, aboutToExpire.documentDownloadValidUntil) && l.d(this.verificationCode, aboutToExpire.verificationCode) && this.type == aboutToExpire.type && fr.t.c(this.documentNumber, aboutToExpire.documentNumber);
        }

        @Override // tq0.k
        public List<b0> f() {
            return this.shortAddressParts;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: g, reason: from getter */
        public fz.b.OffsetDateTime getDocumentDownloadValidUntil() {
            return this.documentDownloadValidUntil;
        }

        @Override // tq0.k.b, tq0.k
        public g getType() {
            return this.type;
        }

        @Override // tq0.k
        public /* bridge */ String h() {
            return super.h();
        }

        public int hashCode() {
            int iE = j.e(this.id) * 31;
            tq0.b.Main main = this.documentId;
            int iHashCode = (iE + (main == null ? 0 : main.hashCode())) * 31;
            tq0.b.Confirmation confirmation = this.confirmationId;
            int iHashCode2 = (((((iHashCode + (confirmation == null ? 0 : confirmation.hashCode())) * 31) + this.shortAddressParts.hashCode()) * 31) + this.subtypes.hashCode()) * 31;
            fz.b.OffsetDateTime offsetDateTime = this.documentDownloadValidUntil;
            return ((((((iHashCode2 + (offsetDateTime != null ? offsetDateTime.hashCode() : 0)) * 31) + l.e(this.verificationCode)) * 31) + this.type.hashCode()) * 31) + this.documentNumber.hashCode();
        }

        public String toString() {
            return "AboutToExpire(id=" + j.f(this.id) + ", documentId=" + this.documentId + ", confirmationId=" + this.confirmationId + ", shortAddressParts=" + this.shortAddressParts + ", subtypes=" + this.subtypes + ", documentDownloadValidUntil=" + this.documentDownloadValidUntil + ", verificationCode=" + l.f(this.verificationCode) + ", type=" + this.type + ", documentNumber=" + this.documentNumber + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private AboutToExpire(String str, tq0.b.Main main, tq0.b.Confirmation confirmation, List<b0> list, List<? extends f> list2, fz.b.OffsetDateTime offsetDateTime, String str2, g gVar, String str3) {
            this.id = str;
            this.documentId = main;
            this.confirmationId = confirmation;
            this.shortAddressParts = list;
            this.subtypes = list2;
            this.documentDownloadValidUntil = offsetDateTime;
            this.verificationCode = str2;
            this.type = gVar;
            this.documentNumber = str3;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015\u0082\u0001\u0003\u001e\u001f ¨\u0006!À\u0006\u0003"}, d2 = {"Ltq0/k$b;", "Ltq0/k;", "Ltq0/b$b;", "c", "()Ltq0/b$b;", "documentId", "Ltq0/b$a;", "d", "()Ltq0/b$a;", "confirmationId", "", "Ltq0/f;", "a", "()Ljava/util/List;", "subtypes", "Lfz/b$f;", "g", "()Lfz/b$f;", "documentDownloadValidUntil", "Ltq0/l;", "b", "()Ljava/lang/String;", "verificationCode", "Ltq0/g;", "getType", "()Ltq0/g;", "type", "", "e", "documentNumber", "Ltq0/k$a;", "Ltq0/k$c;", "Ltq0/k$h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends k {
        @Override // tq0.k
        List<f> a();

        @Override // tq0.k
        /* JADX INFO: renamed from: b */
        String getVerificationCode();

        /* JADX INFO: renamed from: c */
        tq0.b.Main getDocumentId();

        /* JADX INFO: renamed from: d */
        tq0.b.Confirmation getConfirmationId();

        /* JADX INFO: renamed from: e */
        String getDocumentNumber();

        /* JADX INFO: renamed from: g */
        fz.b.OffsetDateTime getDocumentDownloadValidUntil();

        @Override // tq0.k
        g getType();
    }

    /* JADX INFO: renamed from: tq0.k$c, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b!\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b$\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b.\u0010\u0018¨\u00067"}, d2 = {"Ltq0/k$c;", "Ltq0/k$b;", "Ltq0/j;", "id", "Ltq0/b$b;", "documentId", "Ltq0/b$a;", "confirmationId", "", "Liy/b0;", "shortAddressParts", "Ltq0/f;", "subtypes", "Lfz/b$f;", "documentDownloadValidUntil", "Ltq0/l;", "verificationCode", "Ltq0/g;", "type", "", "documentNumber", "<init>", "(Ljava/lang/String;Ltq0/b$b;Ltq0/b$a;Ljava/util/List;Ljava/util/List;Lfz/b$f;Ljava/lang/String;Ltq0/g;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId-M4CpGAQ", "b", "Ltq0/b$b;", "c", "()Ltq0/b$b;", "Ltq0/b$a;", "d", "()Ltq0/b$a;", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lfz/b$f;", "g", "()Lfz/b$f;", "h", "Ltq0/g;", "getType", "()Ltq0/g;", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Expired implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.b.Main documentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.b.Confirmation confirmationId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<b0> shortAddressParts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<f> subtypes;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime documentDownloadValidUntil;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final g type;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentNumber;

        public /* synthetic */ Expired(String str, tq0.b.Main main, tq0.b.Confirmation confirmation, List list, List list2, fz.b.OffsetDateTime offsetDateTime, String str2, g gVar, String str3, fr.k kVar) {
            this(str, main, confirmation, list, list2, offsetDateTime, str2, gVar, str3);
        }

        @Override // tq0.k.b, tq0.k
        public List<f> a() {
            return this.subtypes;
        }

        @Override // tq0.k.b, tq0.k
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: c, reason: from getter */
        public tq0.b.Main getDocumentId() {
            return this.documentId;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public tq0.b.Confirmation getConfirmationId() {
            return this.confirmationId;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getDocumentNumber() {
            return this.documentNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Expired)) {
                return false;
            }
            Expired expired = (Expired) other;
            return j.d(this.id, expired.id) && fr.t.c(this.documentId, expired.documentId) && fr.t.c(this.confirmationId, expired.confirmationId) && fr.t.c(this.shortAddressParts, expired.shortAddressParts) && fr.t.c(this.subtypes, expired.subtypes) && fr.t.c(this.documentDownloadValidUntil, expired.documentDownloadValidUntil) && l.d(this.verificationCode, expired.verificationCode) && this.type == expired.type && fr.t.c(this.documentNumber, expired.documentNumber);
        }

        @Override // tq0.k
        public List<b0> f() {
            return this.shortAddressParts;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: g, reason: from getter */
        public fz.b.OffsetDateTime getDocumentDownloadValidUntil() {
            return this.documentDownloadValidUntil;
        }

        @Override // tq0.k.b, tq0.k
        public g getType() {
            return this.type;
        }

        @Override // tq0.k
        public /* bridge */ String h() {
            return super.h();
        }

        public int hashCode() {
            int iE = j.e(this.id) * 31;
            tq0.b.Main main = this.documentId;
            int iHashCode = (iE + (main == null ? 0 : main.hashCode())) * 31;
            tq0.b.Confirmation confirmation = this.confirmationId;
            int iHashCode2 = (((((iHashCode + (confirmation == null ? 0 : confirmation.hashCode())) * 31) + this.shortAddressParts.hashCode()) * 31) + this.subtypes.hashCode()) * 31;
            fz.b.OffsetDateTime offsetDateTime = this.documentDownloadValidUntil;
            return ((((((iHashCode2 + (offsetDateTime != null ? offsetDateTime.hashCode() : 0)) * 31) + l.e(this.verificationCode)) * 31) + this.type.hashCode()) * 31) + this.documentNumber.hashCode();
        }

        public String toString() {
            return "Expired(id=" + j.f(this.id) + ", documentId=" + this.documentId + ", confirmationId=" + this.confirmationId + ", shortAddressParts=" + this.shortAddressParts + ", subtypes=" + this.subtypes + ", documentDownloadValidUntil=" + this.documentDownloadValidUntil + ", verificationCode=" + l.f(this.verificationCode) + ", type=" + this.type + ", documentNumber=" + this.documentNumber + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Expired(String str, tq0.b.Main main, tq0.b.Confirmation confirmation, List<b0> list, List<? extends f> list2, fz.b.OffsetDateTime offsetDateTime, String str2, g gVar, String str3) {
            this.id = str;
            this.documentId = main;
            this.confirmationId = confirmation;
            this.shortAddressParts = list;
            this.subtypes = list2;
            this.documentDownloadValidUntil = offsetDateTime;
            this.verificationCode = str2;
            this.type = gVar;
            this.documentNumber = str3;
        }
    }

    /* JADX INFO: renamed from: tq0.k$d, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u0012R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001b\u0010\"¨\u0006)"}, d2 = {"Ltq0/k$d;", "Ltq0/k;", "Ltq0/j;", "id", "Ltq0/l;", "verificationCode", "", "Liy/b0;", "shortAddressParts", "Ltq0/g;", "type", "", "documentNumber", "Ltq0/f;", "subtypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ltq0/g;Ljava/lang/String;Ljava/util/List;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "Ltq0/g;", "getType", "()Ltq0/g;", "e", "getDocumentNumber", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Generating implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<b0> shortAddressParts;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final g type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<f> subtypes;

        public /* synthetic */ Generating(String str, String str2, List list, g gVar, String str3, List list2, fr.k kVar) {
            this(str, str2, list, gVar, str3, list2);
        }

        @Override // tq0.k
        public List<f> a() {
            return this.subtypes;
        }

        @Override // tq0.k
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Generating)) {
                return false;
            }
            Generating generating = (Generating) other;
            return j.d(this.id, generating.id) && l.d(this.verificationCode, generating.verificationCode) && fr.t.c(this.shortAddressParts, generating.shortAddressParts) && this.type == generating.type && fr.t.c(this.documentNumber, generating.documentNumber) && fr.t.c(this.subtypes, generating.subtypes);
        }

        @Override // tq0.k
        public List<b0> f() {
            return this.shortAddressParts;
        }

        @Override // tq0.k
        public g getType() {
            return this.type;
        }

        @Override // tq0.k
        public /* bridge */ String h() {
            return super.h();
        }

        public int hashCode() {
            return (((((((((j.e(this.id) * 31) + l.e(this.verificationCode)) * 31) + this.shortAddressParts.hashCode()) * 31) + this.type.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + this.subtypes.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public String getId() {
            return this.id;
        }

        public String toString() {
            return "Generating(id=" + j.f(this.id) + ", verificationCode=" + l.f(this.verificationCode) + ", shortAddressParts=" + this.shortAddressParts + ", type=" + this.type + ", documentNumber=" + this.documentNumber + ", subtypes=" + this.subtypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Generating(String str, String str2, List<b0> list, g gVar, String str3, List<? extends f> list2) {
            this.id = str;
            this.verificationCode = str2;
            this.shortAddressParts = list;
            this.type = gVar;
            this.documentNumber = str3;
            this.subtypes = list2;
        }
    }

    /* JADX INFO: renamed from: tq0.k$e, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u0012R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001b\u0010\"¨\u0006)"}, d2 = {"Ltq0/k$e;", "Ltq0/k;", "Ltq0/j;", "id", "Ltq0/l;", "verificationCode", "", "Liy/b0;", "shortAddressParts", "Ltq0/g;", "type", "", "documentNumber", "Ltq0/f;", "subtypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ltq0/g;Ljava/lang/String;Ljava/util/List;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId-M4CpGAQ", "b", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "Ltq0/g;", "getType", "()Ltq0/g;", "e", "getDocumentNumber", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GenericError implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<b0> shortAddressParts;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final g type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<f> subtypes;

        public /* synthetic */ GenericError(String str, String str2, List list, g gVar, String str3, List list2, fr.k kVar) {
            this(str, str2, list, gVar, str3, list2);
        }

        @Override // tq0.k
        public List<f> a() {
            return this.subtypes;
        }

        @Override // tq0.k
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GenericError)) {
                return false;
            }
            GenericError genericError = (GenericError) other;
            return j.d(this.id, genericError.id) && l.d(this.verificationCode, genericError.verificationCode) && fr.t.c(this.shortAddressParts, genericError.shortAddressParts) && this.type == genericError.type && fr.t.c(this.documentNumber, genericError.documentNumber) && fr.t.c(this.subtypes, genericError.subtypes);
        }

        @Override // tq0.k
        public List<b0> f() {
            return this.shortAddressParts;
        }

        @Override // tq0.k
        public g getType() {
            return this.type;
        }

        @Override // tq0.k
        public /* bridge */ String h() {
            return super.h();
        }

        public int hashCode() {
            return (((((((((j.e(this.id) * 31) + l.e(this.verificationCode)) * 31) + this.shortAddressParts.hashCode()) * 31) + this.type.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + this.subtypes.hashCode();
        }

        public String toString() {
            return "GenericError(id=" + j.f(this.id) + ", verificationCode=" + l.f(this.verificationCode) + ", shortAddressParts=" + this.shortAddressParts + ", type=" + this.type + ", documentNumber=" + this.documentNumber + ", subtypes=" + this.subtypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private GenericError(String str, String str2, List<b0> list, g gVar, String str3, List<? extends f> list2) {
            this.id = str;
            this.verificationCode = str2;
            this.shortAddressParts = list;
            this.type = gVar;
            this.documentNumber = str3;
            this.subtypes = list2;
        }
    }

    /* JADX INFO: renamed from: tq0.k$f, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u0012R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001b\u0010\"¨\u0006)"}, d2 = {"Ltq0/k$f;", "Ltq0/k;", "Ltq0/j;", "id", "Ltq0/l;", "verificationCode", "", "Liy/b0;", "shortAddressParts", "Ltq0/g;", "type", "", "documentNumber", "Ltq0/f;", "subtypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ltq0/g;Ljava/lang/String;Ljava/util/List;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId-M4CpGAQ", "b", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "Ltq0/g;", "getType", "()Ltq0/g;", "e", "getDocumentNumber", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentError implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<b0> shortAddressParts;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final g type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<f> subtypes;

        public /* synthetic */ PaymentError(String str, String str2, List list, g gVar, String str3, List list2, fr.k kVar) {
            this(str, str2, list, gVar, str3, list2);
        }

        @Override // tq0.k
        public List<f> a() {
            return this.subtypes;
        }

        @Override // tq0.k
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentError)) {
                return false;
            }
            PaymentError paymentError = (PaymentError) other;
            return j.d(this.id, paymentError.id) && l.d(this.verificationCode, paymentError.verificationCode) && fr.t.c(this.shortAddressParts, paymentError.shortAddressParts) && this.type == paymentError.type && fr.t.c(this.documentNumber, paymentError.documentNumber) && fr.t.c(this.subtypes, paymentError.subtypes);
        }

        @Override // tq0.k
        public List<b0> f() {
            return this.shortAddressParts;
        }

        @Override // tq0.k
        public g getType() {
            return this.type;
        }

        @Override // tq0.k
        public /* bridge */ String h() {
            return super.h();
        }

        public int hashCode() {
            return (((((((((j.e(this.id) * 31) + l.e(this.verificationCode)) * 31) + this.shortAddressParts.hashCode()) * 31) + this.type.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + this.subtypes.hashCode();
        }

        public String toString() {
            return "PaymentError(id=" + j.f(this.id) + ", verificationCode=" + l.f(this.verificationCode) + ", shortAddressParts=" + this.shortAddressParts + ", type=" + this.type + ", documentNumber=" + this.documentNumber + ", subtypes=" + this.subtypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PaymentError(String str, String str2, List<b0> list, g gVar, String str3, List<? extends f> list2) {
            this.id = str;
            this.verificationCode = str2;
            this.shortAddressParts = list;
            this.type = gVar;
            this.documentNumber = str3;
            this.subtypes = list2;
        }
    }

    /* JADX INFO: renamed from: tq0.k$g, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u0012R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001b\u0010\"¨\u0006)"}, d2 = {"Ltq0/k$g;", "Ltq0/k;", "Ltq0/j;", "id", "Ltq0/l;", "verificationCode", "", "Liy/b0;", "shortAddressParts", "Ltq0/g;", "type", "", "documentNumber", "Ltq0/f;", "subtypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ltq0/g;Ljava/lang/String;Ljava/util/List;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId-M4CpGAQ", "b", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "Ltq0/g;", "getType", "()Ltq0/g;", "e", "getDocumentNumber", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rejected implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<b0> shortAddressParts;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final g type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<f> subtypes;

        public /* synthetic */ Rejected(String str, String str2, List list, g gVar, String str3, List list2, fr.k kVar) {
            this(str, str2, list, gVar, str3, list2);
        }

        @Override // tq0.k
        public List<f> a() {
            return this.subtypes;
        }

        @Override // tq0.k
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rejected)) {
                return false;
            }
            Rejected rejected = (Rejected) other;
            return j.d(this.id, rejected.id) && l.d(this.verificationCode, rejected.verificationCode) && fr.t.c(this.shortAddressParts, rejected.shortAddressParts) && this.type == rejected.type && fr.t.c(this.documentNumber, rejected.documentNumber) && fr.t.c(this.subtypes, rejected.subtypes);
        }

        @Override // tq0.k
        public List<b0> f() {
            return this.shortAddressParts;
        }

        @Override // tq0.k
        public g getType() {
            return this.type;
        }

        @Override // tq0.k
        public /* bridge */ String h() {
            return super.h();
        }

        public int hashCode() {
            return (((((((((j.e(this.id) * 31) + l.e(this.verificationCode)) * 31) + this.shortAddressParts.hashCode()) * 31) + this.type.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + this.subtypes.hashCode();
        }

        public String toString() {
            return "Rejected(id=" + j.f(this.id) + ", verificationCode=" + l.f(this.verificationCode) + ", shortAddressParts=" + this.shortAddressParts + ", type=" + this.type + ", documentNumber=" + this.documentNumber + ", subtypes=" + this.subtypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Rejected(String str, String str2, List<b0> list, g gVar, String str3, List<? extends f> list2) {
            this.id = str;
            this.verificationCode = str2;
            this.shortAddressParts = list;
            this.type = gVar;
            this.documentNumber = str3;
            this.subtypes = list2;
        }
    }

    /* JADX INFO: renamed from: tq0.k$h, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b!\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b$\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b.\u0010\u0018¨\u00067"}, d2 = {"Ltq0/k$h;", "Ltq0/k$b;", "Ltq0/j;", "id", "Ltq0/b$b;", "documentId", "Ltq0/b$a;", "confirmationId", "", "Liy/b0;", "shortAddressParts", "Ltq0/f;", "subtypes", "Lfz/b$f;", "documentDownloadValidUntil", "Ltq0/l;", "verificationCode", "Ltq0/g;", "type", "", "documentNumber", "<init>", "(Ljava/lang/String;Ltq0/b$b;Ltq0/b$a;Ljava/util/List;Ljava/util/List;Lfz/b$f;Ljava/lang/String;Ltq0/g;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId-M4CpGAQ", "b", "Ltq0/b$b;", "c", "()Ltq0/b$b;", "Ltq0/b$a;", "d", "()Ltq0/b$a;", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lfz/b$f;", "g", "()Lfz/b$f;", "h", "Ltq0/g;", "getType", "()Ltq0/g;", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToDownload implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.b.Main documentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.b.Confirmation confirmationId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<b0> shortAddressParts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<f> subtypes;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime documentDownloadValidUntil;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final g type;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentNumber;

        public /* synthetic */ ToDownload(String str, tq0.b.Main main, tq0.b.Confirmation confirmation, List list, List list2, fz.b.OffsetDateTime offsetDateTime, String str2, g gVar, String str3, fr.k kVar) {
            this(str, main, confirmation, list, list2, offsetDateTime, str2, gVar, str3);
        }

        @Override // tq0.k.b, tq0.k
        public List<f> a() {
            return this.subtypes;
        }

        @Override // tq0.k.b, tq0.k
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: c, reason: from getter */
        public tq0.b.Main getDocumentId() {
            return this.documentId;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public tq0.b.Confirmation getConfirmationId() {
            return this.confirmationId;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getDocumentNumber() {
            return this.documentNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToDownload)) {
                return false;
            }
            ToDownload toDownload = (ToDownload) other;
            return j.d(this.id, toDownload.id) && fr.t.c(this.documentId, toDownload.documentId) && fr.t.c(this.confirmationId, toDownload.confirmationId) && fr.t.c(this.shortAddressParts, toDownload.shortAddressParts) && fr.t.c(this.subtypes, toDownload.subtypes) && fr.t.c(this.documentDownloadValidUntil, toDownload.documentDownloadValidUntil) && l.d(this.verificationCode, toDownload.verificationCode) && this.type == toDownload.type && fr.t.c(this.documentNumber, toDownload.documentNumber);
        }

        @Override // tq0.k
        public List<b0> f() {
            return this.shortAddressParts;
        }

        @Override // tq0.k.b
        /* JADX INFO: renamed from: g, reason: from getter */
        public fz.b.OffsetDateTime getDocumentDownloadValidUntil() {
            return this.documentDownloadValidUntil;
        }

        @Override // tq0.k.b, tq0.k
        public g getType() {
            return this.type;
        }

        @Override // tq0.k
        public /* bridge */ String h() {
            return super.h();
        }

        public int hashCode() {
            int iE = j.e(this.id) * 31;
            tq0.b.Main main = this.documentId;
            int iHashCode = (iE + (main == null ? 0 : main.hashCode())) * 31;
            tq0.b.Confirmation confirmation = this.confirmationId;
            int iHashCode2 = (((((iHashCode + (confirmation == null ? 0 : confirmation.hashCode())) * 31) + this.shortAddressParts.hashCode()) * 31) + this.subtypes.hashCode()) * 31;
            fz.b.OffsetDateTime offsetDateTime = this.documentDownloadValidUntil;
            return ((((((iHashCode2 + (offsetDateTime != null ? offsetDateTime.hashCode() : 0)) * 31) + l.e(this.verificationCode)) * 31) + this.type.hashCode()) * 31) + this.documentNumber.hashCode();
        }

        public String toString() {
            return "ToDownload(id=" + j.f(this.id) + ", documentId=" + this.documentId + ", confirmationId=" + this.confirmationId + ", shortAddressParts=" + this.shortAddressParts + ", subtypes=" + this.subtypes + ", documentDownloadValidUntil=" + this.documentDownloadValidUntil + ", verificationCode=" + l.f(this.verificationCode) + ", type=" + this.type + ", documentNumber=" + this.documentNumber + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ToDownload(String str, tq0.b.Main main, tq0.b.Confirmation confirmation, List<b0> list, List<? extends f> list2, fz.b.OffsetDateTime offsetDateTime, String str2, g gVar, String str3) {
            this.id = str;
            this.documentId = main;
            this.confirmationId = confirmation;
            this.shortAddressParts = list;
            this.subtypes = list2;
            this.documentDownloadValidUntil = offsetDateTime;
            this.verificationCode = str2;
            this.type = gVar;
            this.documentNumber = str3;
        }
    }

    List<f> a();

    /* JADX INFO: renamed from: b */
    String getVerificationCode();

    List<b0> f();

    g getType();

    default String h() {
        return pq.v.v0(c0.a(f()), ", ", null, null, 0, null, null, 62, null);
    }
}
