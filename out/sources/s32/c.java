package s32;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import bz.DownloadFileData;
import eo0.EmptyState;
import eo0.UrlData;
import er.l;
import er.p;
import er.q;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import w70.Suffix;
import w70.n;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0091\u0001\u0010 \u001a\u00020\u001f2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00122&\u0010\u0015\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\f0\u00122\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Ls32/c;", "Lxw/f;", "Ls32/c$a;", "Lq32/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Leo0/z;", "emptyState", "Lkotlin/Function1;", "", "Loq/i0;", "onLinkClick", "Lq40/g;", "Lh30/a;", "f", "(Leo0/z;Ler/l;)Lq40/g;", "Lkotlin/Function2;", "Landroid/net/Uri;", "onUrlLoading", "onPageLoaded", "Lkotlin/Function3;", "", "Landroid/net/http/SslCertificate;", "onSslError", "scheme", "url", "customUserAgent", "", "sslEnabled", "Lw70/c$d;", "i", "(Ler/p;Ler/p;Ler/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lw70/c$d;", "params", "e", "(Ls32/c$a;)Lq32/f$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, q32.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: s32.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\n\u0012&\u0010\r\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0004\u0012\u00020\u00050\n\u0012\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R7\u0010\r\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b#\u0010)R/\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b&\u0010+¨\u0006,"}, d2 = {"Ls32/c$a;", "", "Lq32/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "", "onLinkClick", "Lkotlin/Function2;", "Landroid/net/Uri;", "onUrlLoading", "onPageLoaded", "Lkotlin/Function3;", "", "Landroid/net/http/SslCertificate;", "onSslError", "<init>", "(Lq32/e;Ler/a;Ler/l;Ler/p;Ler/p;Ler/q;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq32/e;", "f", "()Lq32/e;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "Ler/p;", "e", "()Ler/p;", "Ler/q;", "()Ler/q;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q32.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLinkClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Uri, String, i0> onUrlLoading;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, l<? super String, i0>, i0> onPageLoaded;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<String, Integer, SslCertificate, i0> onSslError;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(q32.e eVar, er.a<i0> aVar, l<? super String, i0> lVar, p<? super Uri, ? super String, i0> pVar, p<? super String, ? super l<? super String, i0>, i0> pVar2, q<? super String, ? super Integer, ? super SslCertificate, i0> qVar) {
            this.state = eVar;
            this.onBack = aVar;
            this.onLinkClick = lVar;
            this.onUrlLoading = pVar;
            this.onPageLoaded = pVar2;
            this.onSslError = qVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<String, i0> b() {
            return this.onLinkClick;
        }

        public final p<String, l<? super String, i0>, i0> c() {
            return this.onPageLoaded;
        }

        public final q<String, Integer, SslCertificate, i0> d() {
            return this.onSslError;
        }

        public final p<Uri, String, i0> e() {
            return this.onUrlLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onLinkClick, params.onLinkClick) && t.c(this.onUrlLoading, params.onUrlLoading) && t.c(this.onPageLoaded, params.onPageLoaded) && t.c(this.onSslError, params.onSslError);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final q32.e getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onLinkClick.hashCode()) * 31) + this.onUrlLoading.hashCode()) * 31) + this.onPageLoaded.hashCode()) * 31) + this.onSslError.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onLinkClick=" + this.onLinkClick + ", onUrlLoading=" + this.onUrlLoading + ", onPageLoaded=" + this.onPageLoaded + ", onSslError=" + this.onSslError + ')';
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"s32/c$b", "Lw70/p;", "", "g", "()Z", "b", "a", "", "d", "()Ljava/lang/String;", "", "", "f", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements w70.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f177789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f177790b;

        b(boolean z15, String str) {
            this.f177789a = z15;
            this.f177790b = str;
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getF177789a() {
            return this.f177789a;
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
        public String getF177790b() {
            return this.f177790b;
        }

        @Override // w70.p
        public /* bridge */ int e() {
            return super.e();
        }

        @Override // w70.o
        public List<Object> f() {
            return v.q(new Suffix("png"), new Suffix("jpg"), new Suffix("gif"), new Suffix("svg"), new Suffix("css"), new Suffix("ico"), new Suffix("webp"), new Suffix("sva"), new Suffix("woff2"));
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

    /* JADX INFO: renamed from: s32.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"s32/c$c", "Lw70/n;", "", "scheme", "Landroid/net/Uri;", "url", "Loq/i0;", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "Lkotlin/Function1;", "execute", "N7", "(Ljava/lang/String;Ler/l;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C4541c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<Uri, String, i0> f177791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<String, l<? super String, i0>, i0> f177792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<String, Integer, SslCertificate, i0> f177793c;

        /* JADX WARN: Multi-variable type inference failed */
        C4541c(p<? super Uri, ? super String, i0> pVar, p<? super String, ? super l<? super String, i0>, i0> pVar2, q<? super String, ? super Integer, ? super SslCertificate, i0> qVar) {
            this.f177791a = pVar;
            this.f177792b = pVar2;
            this.f177793c = qVar;
        }

        @Override // w70.n
        public /* bridge */ void M1(String str, boolean z15, er.a<i0> aVar) {
            super.M1(str, z15, aVar);
        }

        @Override // w70.n
        public void N7(String url, l<? super String, i0> execute) {
            this.f177792b.B(url, execute);
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
            this.f177791a.B(url, scheme);
        }

        @Override // w70.n
        public void f6(String url, int primaryError, SslCertificate certificate) {
            this.f177793c.w(url, Integer.valueOf(primaryError), certificate);
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

    private final IconPageData<ButtonData, i0> f(EmptyState emptyState, final l<? super String, i0> onLinkClick) {
        final UrlData urlData = emptyState.getUrlData();
        if (urlData == null) {
            return new IconPageData<>(new j.a(jz.a.f106754d2), new Label(emptyState.getTitle(), "electronicDeliveryEmptyStateTitle"), new Label(emptyState.getBody(), "electronicDeliveryEmptyStateDescription"), null, null, null, false, 72, null);
        }
        return new IconPageData<>(new j.a(jz.a.f106754d2), new Label(emptyState.getTitle(), "electronicDeliveryEmptyStateTitle"), new Label(emptyState.getBody(), "electronicDeliveryEmptyStateDescription"), null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(new Label(urlData.getTitle(), "electronicDeliveryEmptyStateLinkTitle"), null, 2, null), k30.d.c.f107775a, null, new er.a() { // from class: s32.b
            @Override // er.a
            public final Object a() {
                return c.h(onLinkClick, urlData);
            }
        }, 35, null), null, false, 72, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, UrlData urlData) {
        lVar.b(urlData.getValue());
        return i0.f148189a;
    }

    private final w70.c.Url i(p<? super Uri, ? super String, i0> onUrlLoading, p<? super String, ? super l<? super String, i0>, i0> onPageLoaded, q<? super String, ? super Integer, ? super SslCertificate, i0> onSslError, String scheme, String url, String customUserAgent, boolean sslEnabled) {
        return new w70.c.Url(new b(sslEnabled, customUserAgent), new C4541c(onUrlLoading, onPageLoaded, onSslError), v.e(scheme), url, null, 16, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public q32.f.a b(Params params) {
        q32.e state = params.getState();
        if (t.c(state, q32.e.c.f164165a)) {
            return q32.f.a.c.f164172a;
        }
        if (state instanceof q32.e.EmptyState) {
            return new q32.f.a.Empty(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e02.a.f46651z4), null, null, null, 28, null), null, null, null, null, 61, null), params.a(), f(((q32.e.EmptyState) params.getState()).getEmptyState(), params.b()));
        }
        if (!(state instanceof q32.e.Redirecting)) {
            if (state instanceof q32.e.Error) {
                return new q32.f.a.Error(((q32.e.Error) params.getState()).getErrorVMS());
            }
            throw new oq.p();
        }
        return new q32.f.a.Initialized(i(params.e(), params.c(), params.d(), ((q32.e.Redirecting) params.getState()).getData().getScheme(), ((q32.e.Redirecting) params.getState()).getData().getUrl(), ((q32.e.Redirecting) params.getState()).getData().getCustomUserAgent(), ((q32.e.Redirecting) params.getState()).getData().getSslEnabled()), ((q32.e.Redirecting) params.getState()).getData().getIsProcessVisibleForUser(), this.labelProvider.c(e02.a.f46586p));
    }
}
