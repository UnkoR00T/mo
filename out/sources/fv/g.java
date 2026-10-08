package fv;

import fr.w0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0003\u000f\u0014\u0016B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lfv/g;", "", "", "Lfv/g$c;", "pins", "Lsv/c;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Lsv/c;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Loq/i0;", "a", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "b", "(Ljava/lang/String;Ler/a;)V", "c", "(Ljava/lang/String;)Ljava/util/List;", "e", "(Lsv/c;)Lfv/g;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lsv/c;", "d", "()Lsv/c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f67350d = new a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<c> pins;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sv.c certificateChainCleaner;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfv/g$a;", "", "<init>", "()V", "", "pattern", "", "pins", "a", "(Ljava/lang/String;[Ljava/lang/String;)Lfv/g$a;", "Lfv/g;", "b", "()Lfv/g;", "", "Lfv/g$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<c> pins = new ArrayList();

        public final a a(String pattern, String... pins) {
            for (String str : pins) {
                this.pins.add(new c(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final g b() {
            return new g(pq.v.k1(this.pins), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: fv.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfv/g$b;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Lvv/h;", "b", "(Ljava/security/cert/X509Certificate;)Lvv/h;", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lfv/g;", "DEFAULT", "Lfv/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final String a(Certificate certificate) {
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).b();
        }

        public final vv.h b(X509Certificate x509Certificate) {
            return vv.h.Companion.f(vv.h.INSTANCE, x509Certificate.getPublicKey().getEncoded(), 0, 0, 3, null).N();
        }

        public final vv.h c(X509Certificate x509Certificate) {
            return vv.h.Companion.f(vv.h.INSTANCE, x509Certificate.getPublicKey().getEncoded(), 0, 0, 3, null).O();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, d2 = {"Lfv/g$c;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "c", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getPattern", "b", "hashAlgorithm", "Lvv/h;", "Lvv/h;", "()Lvv/h;", "hash", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String pattern;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String hashAlgorithm;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final vv.h hash;

        /* JADX WARN: Code duplicated, block: B:16:0x0044  */
        /* JADX WARN: Code duplicated, block: B:18:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x0061  */
        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:24:0x0079  */
        /* JADX WARN: Code duplicated, block: B:26:0x0081  */
        /* JADX WARN: Code duplicated, block: B:28:0x0092  */
        /* JADX WARN: Code duplicated, block: B:30:0x0095  */
        /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x0064, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:30:0x0095, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x00aa, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x00c1, please report this as an issue */
        public c(String str, String str2) {
            String str3;
            String strE;
            vv.h hVarA;
            vv.h hVarA2;
            if (fu.r.V(str, "*.", false, 2, null)) {
                str3 = str;
                if (fu.r.r0(str3, "*", 1, false, 4, null) != -1) {
                }
                strE = gv.a.e(str3);
                if (strE != null) {
                    throw new IllegalArgumentException("Invalid pattern: " + str3);
                }
                this.pattern = strE;
                if (fu.r.V(str2, "sha1/", false, 2, null)) {
                    this.hashAlgorithm = "sha1";
                    hVarA2 = vv.h.INSTANCE.a(str2.substring(5));
                    if (hVarA2 != null) {
                        this.hash = hVarA2;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid pin hash: " + str2);
                }
                if (fu.r.V(str2, "sha256/", false, 2, null)) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                }
                this.hashAlgorithm = "sha256";
                hVarA = vv.h.INSTANCE.a(str2.substring(7));
                if (hVarA != null) {
                    this.hash = hVarA;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + str2);
            }
            str3 = str;
            if ((!fu.r.V(str3, "**.", false, 2, null) || fu.r.r0(str3, "*", 2, false, 4, null) != -1) && fu.r.r0(str3, "*", 0, false, 6, null) != -1) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str3).toString());
            }
            strE = gv.a.e(str3);
            if (strE != null) {
                throw new IllegalArgumentException("Invalid pattern: " + str3);
            }
            this.pattern = strE;
            if (fu.r.V(str2, "sha1/", false, 2, null)) {
                this.hashAlgorithm = "sha1";
                hVarA2 = vv.h.INSTANCE.a(str2.substring(5));
                if (hVarA2 != null) {
                    this.hash = hVarA2;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + str2);
            }
            if (fu.r.V(str2, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
            this.hashAlgorithm = "sha256";
            hVarA = vv.h.INSTANCE.a(str2.substring(7));
            if (hVarA != null) {
                this.hash = hVarA;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + str2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final vv.h getHash() {
            return this.hash;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final boolean c(String hostname) {
            if (fu.r.V(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                return fu.r.K(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!fu.r.V(this.pattern, "*.", false, 2, null)) {
                return fr.t.c(hostname, this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            return fu.r.K(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) && fu.r.w0(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return fr.t.c(this.pattern, cVar.pattern) && fr.t.c(this.hashAlgorithm, cVar.hashAlgorithm) && fr.t.c(this.hash, cVar.hash);
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.b();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "c", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class d extends fr.w implements er.a<List<? extends X509Certificate>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Certificate> f67358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f67359d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.f67358c = list;
            this.f67359d = str;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> a() {
            List<Certificate> listA;
            sv.c certificateChainCleaner = g.this.getCertificateChainCleaner();
            if (certificateChainCleaner == null || (listA = certificateChainCleaner.a(this.f67358c, this.f67359d)) == null) {
                listA = this.f67358c;
            }
            List<Certificate> list = listA;
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public g(Set<c> set, sv.c cVar) {
        this.pins = set;
        this.certificateChainCleaner = cVar;
    }

    public final void a(String hostname, List<? extends Certificate> peerCertificates) {
        b(hostname, new d(peerCertificates, hostname));
    }

    public final void b(String hostname, er.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        List<c> listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listA = cleanedPeerCertificatesFn.a();
        for (X509Certificate x509Certificate : listA) {
            vv.h hVarC = null;
            vv.h hVarB = null;
            for (c cVar : listC) {
                String hashAlgorithm = cVar.getHashAlgorithm();
                if (fr.t.c(hashAlgorithm, "sha256")) {
                    if (hVarC == null) {
                        hVarC = INSTANCE.c(x509Certificate);
                    }
                    if (fr.t.c(cVar.getHash(), hVarC)) {
                        return;
                    }
                } else {
                    if (!fr.t.c(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.getHashAlgorithm());
                    }
                    if (hVarB == null) {
                        hVarB = INSTANCE.b(x509Certificate);
                    }
                    if (fr.t.c(cVar.getHash(), hVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Certificate pinning failure!");
        sb5.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listA) {
            sb5.append("\n    ");
            sb5.append(INSTANCE.a(x509Certificate2));
            sb5.append(": ");
            sb5.append(x509Certificate2.getSubjectDN().getName());
        }
        sb5.append("\n  Pinned certificates for ");
        sb5.append(hostname);
        sb5.append(":");
        for (c cVar2 : listC) {
            sb5.append("\n    ");
            sb5.append(cVar2);
        }
        throw new SSLPeerUnverifiedException(sb5.toString());
    }

    public final List<c> c(String hostname) {
        Set<c> set = this.pins;
        List<c> listN = pq.v.n();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (listN.isEmpty()) {
                    listN = new ArrayList<>();
                }
                w0.c(listN).add(obj);
            }
        }
        return listN;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final sv.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final g e(sv.c certificateChainCleaner) {
        return fr.t.c(this.certificateChainCleaner, certificateChainCleaner) ? this : new g(this.pins, certificateChainCleaner);
    }

    public boolean equals(Object other) {
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return fr.t.c(gVar.pins, this.pins) && fr.t.c(gVar.certificateChainCleaner, this.certificateChainCleaner);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        sv.c cVar = this.certificateChainCleaner;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ g(Set set, sv.c cVar, int i15, fr.k kVar) {
        this(set, (i15 & 2) != 0 ? null : cVar);
    }
}
