package fv;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 \u00192\u00020\u0001:\u0001\u0017B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010 R\u0018\u0010%\u001a\u00020\u0014*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010$¨\u0006&"}, d2 = {"Lfv/t;", "", "Lfv/g0;", "tlsVersion", "Lfv/i;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lfv/g0;Lfv/i;Ljava/util/List;Ler/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lfv/g0;", "e", "()Lfv/g0;", "b", "Lfv/i;", "()Lfv/i;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Loq/k;", "peerCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 tlsVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i cipherSuite;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Certificate> localCertificates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k peerCertificates;

    /* JADX INFO: renamed from: fv.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006*\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfv/t$a;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "", "b", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lfv/t;", "a", "(Ljavax/net/ssl/SSLSession;)Lfv/t;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: fv.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "c", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        static final class C1514a extends fr.w implements er.a<List<? extends Certificate>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f67499b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1514a(List<? extends Certificate> list) {
                super(0);
                this.f67499b = list;
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> a() {
                return this.f67499b;
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final List<Certificate> b(Certificate[] certificateArr) {
            return certificateArr != null ? gv.d.w(Arrays.copyOf(certificateArr, certificateArr.length)) : pq.v.n();
        }

        public final t a(SSLSession sSLSession) throws IOException {
            List<Certificate> listN;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (fr.t.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : fr.t.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            i iVarB = i.INSTANCE.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (fr.t.c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            g0 g0VarA = g0.INSTANCE.a(protocol);
            try {
                listN = b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listN = pq.v.n();
            }
            return new t(g0VarA, iVarB, b(sSLSession.getLocalCertificates()), new C1514a(listN));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "c", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class b extends fr.w implements er.a<List<? extends Certificate>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.a<List<Certificate>> f67500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f67500b = aVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> a() {
            try {
                return this.f67500b.a();
            } catch (SSLPeerUnverifiedException unused) {
                return pq.v.n();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(g0 g0Var, i iVar, List<? extends Certificate> list, er.a<? extends List<? extends Certificate>> aVar) {
        this.tlsVersion = g0Var;
        this.cipherSuite = iVar;
        this.localCertificates = list;
        this.peerCertificates = oq.l.a(new b(aVar));
    }

    private final String b(Certificate certificate) {
        return certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getCipherSuite() {
        return this.cipherSuite;
    }

    public final List<Certificate> c() {
        return this.localCertificates;
    }

    public final List<Certificate> d() {
        return (List) this.peerCertificates.getValue();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g0 getTlsVersion() {
        return this.tlsVersion;
    }

    public boolean equals(Object other) {
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return tVar.tlsVersion == this.tlsVersion && fr.t.c(tVar.cipherSuite, this.cipherSuite) && fr.t.c(tVar.d(), d()) && fr.t.c(tVar.localCertificates, this.localCertificates);
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + d().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public String toString() {
        List<Certificate> listD = d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Handshake{tlsVersion=");
        sb5.append(this.tlsVersion);
        sb5.append(" cipherSuite=");
        sb5.append(this.cipherSuite);
        sb5.append(" peerCertificates=");
        sb5.append(string);
        sb5.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList2.add(b((Certificate) it4.next()));
        }
        sb5.append(arrayList2);
        sb5.append('}');
        return sb5.toString();
    }
}
