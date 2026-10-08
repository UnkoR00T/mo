package ox3;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import bz.DownloadFileData;
import er.l;
import er.p;
import er.q;
import fr.t;
import iy.b0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import w70.Suffix;
import w70.n;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0091\u0001\u0010\u0019\u001a\u00020\u00182\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2&\u0010\u000e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0004\u0012\u00020\u000b0\b2\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lox3/c;", "Lxw/f;", "Lox3/c$a;", "Llx3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lkotlin/Function2;", "Landroid/net/Uri;", "", "Loq/i0;", "onUrlLoading", "Lkotlin/Function1;", "onPageLoaded", "Lkotlin/Function3;", "", "Landroid/net/http/SslCertificate;", "onSslError", "scheme", "url", "customUserAgent", "", "sslEnabled", "Lw70/c$d;", "e", "(Ler/p;Ler/p;Ler/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lw70/c$d;", "params", "c", "(Lox3/c$a;)Llx3/d$a;", "a", "Lmx/c;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, lx3.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ox3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012&\u0010\n\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R7\u0010\n\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0019\u0010 R/\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, d2 = {"Lox3/c$a;", "", "Llx3/c;", "state", "Lkotlin/Function2;", "Landroid/net/Uri;", "", "Loq/i0;", "onUrlLoading", "Lkotlin/Function1;", "onPageLoaded", "Lkotlin/Function3;", "", "Landroid/net/http/SslCertificate;", "onSslError", "<init>", "(Llx3/c;Ler/p;Ler/p;Ler/q;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llx3/c;", "d", "()Llx3/c;", "b", "Ler/p;", "c", "()Ler/p;", "Ler/q;", "()Ler/q;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final lx3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Uri, String, i0> onUrlLoading;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, l<? super String, i0>, i0> onPageLoaded;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<String, Integer, SslCertificate, i0> onSslError;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(lx3.c cVar, p<? super Uri, ? super String, i0> pVar, p<? super String, ? super l<? super String, i0>, i0> pVar2, q<? super String, ? super Integer, ? super SslCertificate, i0> qVar) {
            this.state = cVar;
            this.onUrlLoading = pVar;
            this.onPageLoaded = pVar2;
            this.onSslError = qVar;
        }

        public final p<String, l<? super String, i0>, i0> a() {
            return this.onPageLoaded;
        }

        public final q<String, Integer, SslCertificate, i0> b() {
            return this.onSslError;
        }

        public final p<Uri, String, i0> c() {
            return this.onUrlLoading;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final lx3.c getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onUrlLoading, params.onUrlLoading) && t.c(this.onPageLoaded, params.onPageLoaded) && t.c(this.onSslError, params.onSslError);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onUrlLoading.hashCode()) * 31) + this.onPageLoaded.hashCode()) * 31) + this.onSslError.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onUrlLoading=" + this.onUrlLoading + ", onPageLoaded=" + this.onPageLoaded + ", onSslError=" + this.onSslError + ')';
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"ox3/c$b", "Lw70/p;", "", "g", "()Z", "b", "a", "", "d", "()Ljava/lang/String;", "", "", "f", "()Ljava/util/List;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements w70.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f150619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f150620b;

        b(boolean z15, String str) {
            this.f150619a = z15;
            this.f150620b = str;
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getF150619a() {
            return this.f150619a;
        }

        @Override // w70.p
        public boolean b() {
            return true;
        }

        @Override // w70.p
        public /* bridge */ int c() {
            return super.c();
        }

        @Override // w70.p
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getF150620b() {
            return this.f150620b;
        }

        @Override // w70.p
        public /* bridge */ int e() {
            return super.e();
        }

        @Override // w70.o
        public List<Object> f() {
            return v.q(new Suffix("png"), new Suffix("jpg"), new Suffix("gif"), new Suffix("svg"), new Suffix("css"), new Suffix("ico"), new Suffix("webp"), new Suffix("sva"));
        }

        @Override // w70.p
        public boolean g() {
            return true;
        }

        @Override // w70.p
        public /* bridge */ boolean h() {
            return super.h();
        }

        @Override // w70.p
        public /* bridge */ boolean i() {
            return super.i();
        }

        @Override // w70.p
        public /* bridge */ w70.p.a j() {
            return super.j();
        }
    }

    /* JADX INFO: renamed from: ox3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"ox3/c$c", "Lw70/n;", "", "scheme", "Landroid/net/Uri;", "url", "Loq/i0;", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "Lkotlin/Function1;", "execute", "N7", "(Ljava/lang/String;Ler/l;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3716c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<Uri, String, i0> f150621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<String, l<? super String, i0>, i0> f150622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<String, Integer, SslCertificate, i0> f150623c;

        /* JADX WARN: Multi-variable type inference failed */
        C3716c(p<? super Uri, ? super String, i0> pVar, p<? super String, ? super l<? super String, i0>, i0> pVar2, q<? super String, ? super Integer, ? super SslCertificate, i0> qVar) {
            this.f150621a = pVar;
            this.f150622b = pVar2;
            this.f150623c = qVar;
        }

        @Override // w70.n
        public /* bridge */ void M1(String str, boolean z15, er.a<i0> aVar) {
            super.M1(str, z15, aVar);
        }

        @Override // w70.n
        public void N7(String url, l<? super String, i0> execute) {
            this.f150622b.B(url, execute);
        }

        @Override // w70.n
        public /* bridge */ void O1(DownloadFileData downloadFileData) {
            super.O1(downloadFileData);
        }

        @Override // w70.n
        public /* bridge */ void R2(int i15) {
            super.R2(i15);
        }

        @Override // w70.n
        public /* bridge */ void b8(ValueCallback<Uri[]> valueCallback) {
            super.b8(valueCallback);
        }

        @Override // w70.n
        public void c2(String scheme, Uri url) {
            this.f150621a.B(url, scheme);
        }

        @Override // w70.n
        public void f6(String url, int primaryError, SslCertificate certificate) {
            this.f150623c.w(url, Integer.valueOf(primaryError), certificate);
        }

        @Override // w70.n
        public /* bridge */ void n1(String str, b0 b0Var, String str2) {
            super.n1(str, b0Var, str2);
        }

        @Override // w70.n
        public /* bridge */ void z7(Uri uri) {
            super.z7(uri);
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final w70.c.Url e(p<? super Uri, ? super String, i0> onUrlLoading, p<? super String, ? super l<? super String, i0>, i0> onPageLoaded, q<? super String, ? super Integer, ? super SslCertificate, i0> onSslError, String scheme, String url, String customUserAgent, boolean sslEnabled) {
        return new w70.c.Url(new b(sslEnabled, customUserAgent), new C3716c(onUrlLoading, onPageLoaded, onSslError), v.e(scheme), url, null, 16, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public lx3.d.a b(Params params) {
        lx3.c state = params.getState();
        if (t.c(state, lx3.c.b.f121208a)) {
            return lx3.d.a.b.f121211a;
        }
        if (!(state instanceof lx3.c.Redirecting)) {
            if (state instanceof lx3.c.Error) {
                return new lx3.d.a.Error(((lx3.c.Error) params.getState()).getErrorVMS());
            }
            throw new oq.p();
        }
        return new lx3.d.a.Initialized(e(params.c(), params.a(), params.b(), ((lx3.c.Redirecting) params.getState()).getData().getScheme(), ((lx3.c.Redirecting) params.getState()).getData().getUrl(), ((lx3.c.Redirecting) params.getState()).getData().getCustomUserAgent(), ((lx3.c.Redirecting) params.getState()).getData().getSslEnabled()), ((lx3.c.Redirecting) params.getState()).getData().getIsProcessVisibleForUser(), this.labelProvider.c(gx3.a.f78220b));
    }
}
