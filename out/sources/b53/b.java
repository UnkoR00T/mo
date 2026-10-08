package b53;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import bz.DownloadFileData;
import er.l;
import er.p;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import iy.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import w70.n;
import w70.q;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001#\b\u0007\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002-+B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u008d\u0001\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b \u0010!Jy\u0010$\u001a\u00020#2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lb53/b;", "Lxw/f;", "Lb53/b$b;", "La53/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Li50/a;", "e", "(Lb53/b$b;)Li50/a;", "Lw43/a;", "loadWebData", "Lkotlin/Function2;", "", "Liy/b0;", "Loq/i0;", "onPageLoaded", "Lkotlin/Function1;", "Lbz/a;", "onDownloadFile", "Lkotlin/Function0;", "onBackAction", "onSslError", "", "sslEnabled", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "onFileChooser", "Lw70/c;", "i", "(Lw43/a;Ler/p;Ler/l;Ler/a;Ler/a;ZLer/l;)Lw70/c;", "onPageLoadedFinished", "b53/b$c", "l", "(Ler/p;Ler/a;Ler/l;Ler/a;Ler/l;)Lb53/b$c;", "Lw70/p;", "m", "(Z)Lw70/p;", "f", "(Lb53/b$b;)La53/c$a;", "a", "Lmx/c;", "b", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, a53.c.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16752c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b53.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u001e\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b*\u0010+R/\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b\u001e\u0010+¨\u0006,"}, d2 = {"Lb53/b$b;", "", "La53/b;", "state", "Lkotlin/Function2;", "", "Liy/b0;", "Loq/i0;", "onPageLoaded", "Lkotlin/Function1;", "Lbz/a;", "onDownloadFile", "Lkotlin/Function0;", "onSslError", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "onFileChooser", "onBackAction", "<init>", "(La53/b;Ler/p;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La53/b;", "f", "()La53/b;", "b", "Ler/p;", "d", "()Ler/p;", "c", "Ler/l;", "()Ler/l;", "Ler/a;", "e", "()Ler/a;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a53.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, b0, i0> onPageLoaded;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DownloadFileData, i0> onDownloadFile;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSslError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ValueCallback<Uri[]>, i0> onFileChooser;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(a53.b bVar, p<? super String, ? super b0, i0> pVar, l<? super DownloadFileData, i0> lVar, er.a<i0> aVar, l<? super ValueCallback<Uri[]>, i0> lVar2, er.a<i0> aVar2) {
            this.state = bVar;
            this.onPageLoaded = pVar;
            this.onDownloadFile = lVar;
            this.onSslError = aVar;
            this.onFileChooser = lVar2;
            this.onBackAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<DownloadFileData, i0> b() {
            return this.onDownloadFile;
        }

        public final l<ValueCallback<Uri[]>, i0> c() {
            return this.onFileChooser;
        }

        public final p<String, b0, i0> d() {
            return this.onPageLoaded;
        }

        public final er.a<i0> e() {
            return this.onSslError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPageLoaded, params.onPageLoaded) && t.c(this.onDownloadFile, params.onDownloadFile) && t.c(this.onSslError, params.onSslError) && t.c(this.onFileChooser, params.onFileChooser) && t.c(this.onBackAction, params.onBackAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final a53.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onPageLoaded.hashCode()) * 31) + this.onDownloadFile.hashCode()) * 31) + this.onSslError.hashCode()) * 31) + this.onFileChooser.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPageLoaded=" + this.onPageLoaded + ", onDownloadFile=" + this.onDownloadFile + ", onSslError=" + this.onSslError + ", onFileChooser=" + this.onFileChooser + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000W\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"b53/b$c", "Lw70/n;", "", "url", "Liy/b0;", "content", "title", "Loq/i0;", "n1", "(Ljava/lang/String;Liy/b0;Ljava/lang/String;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "Lbz/a;", "data", "O1", "(Lbz/a;)V", "", "canGoBack", "Lkotlin/Function0;", "goBack", "M1", "(Ljava/lang/String;ZLer/a;)V", "scheme", "Landroid/net/Uri;", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "Landroid/webkit/ValueCallback;", "", "filePickerRequested", "b8", "(Landroid/webkit/ValueCallback;)V", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<String, b0, i0> f16760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f16761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<DownloadFileData, i0> f16762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f16763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<ValueCallback<Uri[]>, i0> f16764e;

        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super String, ? super b0, i0> pVar, er.a<i0> aVar, l<? super DownloadFileData, i0> lVar, er.a<i0> aVar2, l<? super ValueCallback<Uri[]>, i0> lVar2) {
            this.f16760a = pVar;
            this.f16761b = aVar;
            this.f16762c = lVar;
            this.f16763d = aVar2;
            this.f16764e = lVar2;
        }

        @Override // w70.n
        public void M1(String url, boolean canGoBack, er.a<i0> goBack) {
            List listQ = v.q(w43.b.INIT.getPath(), w43.b.GET_TOKEN.getPath(), w43.b.GET_CONTENT.getPath(), "zaakceptuj_regulamin");
            boolean z15 = false;
            if (!(listQ instanceof Collection) || !listQ.isEmpty()) {
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    if (r.d0(url, (String) it.next(), false, 2, null)) {
                        z15 = true;
                        break;
                    }
                }
            }
            boolean z16 = (!z15) & canGoBack;
            er.a<i0> aVar = this.f16763d;
            if (z16) {
                goBack.a();
            } else {
                aVar.a();
            }
        }

        @Override // w70.n
        public /* bridge */ void N7(String str, l<? super String, i0> lVar) {
            super.N7(str, lVar);
        }

        @Override // w70.n
        public void O1(DownloadFileData data) {
            this.f16762c.b(data);
        }

        @Override // w70.n
        public /* bridge */ void R2(int i15) {
            super.R2(i15);
        }

        @Override // w70.n
        public void b8(ValueCallback<Uri[]> filePickerRequested) {
            this.f16764e.b(filePickerRequested);
        }

        @Override // w70.n
        public void c2(String scheme, Uri url) {
        }

        @Override // w70.n
        public void f6(String url, int primaryError, SslCertificate certificate) {
            this.f16761b.a();
        }

        @Override // w70.n
        public void n1(String url, b0 content, String title) {
            this.f16760a.B(url, content);
        }

        @Override // w70.n
        public /* bridge */ void z7(Uri uri) {
            super.z7(uri);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"b53/b$d", "Lw70/p;", "", "g", "()Z", "b", "a", "", "c", "()I", "h", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements w70.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16765a;

        d(boolean z15) {
            this.f16765a = z15;
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getF16765a() {
            return this.f16765a;
        }

        @Override // w70.p
        public boolean b() {
            return true;
        }

        @Override // w70.p
        public int c() {
            return 2;
        }

        @Override // w70.p
        /* JADX INFO: renamed from: d */
        public /* bridge */ String getF150620b() {
            return super.getF150620b();
        }

        @Override // w70.p
        public /* bridge */ int e() {
            return super.e();
        }

        @Override // w70.o
        public /* bridge */ List<Object> f() {
            return super.f();
        }

        @Override // w70.p
        public boolean g() {
            return true;
        }

        @Override // w70.p
        public boolean h() {
            return true;
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

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final BaseScaffoldData e(Params params) {
        int i15;
        a53.b state = params.getState();
        Label labelC = null;
        a53.b.WebView webView = state instanceof a53.b.WebView ? (a53.b.WebView) state : null;
        if (webView != null) {
            mx.c cVar = this.labelProvider;
            w43.c onlineServiceType = webView.getOnlineServiceType();
            if (onlineServiceType instanceof w43.c.e) {
                i15 = q43.a.f164725i;
            } else if (onlineServiceType instanceof w43.c.C5527c) {
                i15 = q43.a.f164723g;
            } else if (onlineServiceType instanceof w43.c.a) {
                i15 = q43.a.f164722f;
            } else if (onlineServiceType instanceof w43.c.b) {
                i15 = q43.a.f164726j;
            } else {
                if (!(onlineServiceType instanceof w43.c.d)) {
                    throw new oq.p();
                }
                i15 = q43.a.f164724h;
            }
            labelC = cVar.c(i15);
        }
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), labelC, null, null, null, 28, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(w70.c cVar) {
        q controller;
        if (cVar != null && (controller = cVar.getController()) != null) {
            controller.a();
        }
        return i0.f148189a;
    }

    private final w70.c i(w43.a loadWebData, p<? super String, ? super b0, i0> onPageLoaded, l<? super DownloadFileData, i0> onDownloadFile, er.a<i0> onBackAction, er.a<i0> onSslError, boolean sslEnabled, l<? super ValueCallback<Uri[]>, i0> onFileChooser) {
        if (loadWebData instanceof w43.a.C5526a) {
            return new w70.c.Url(m(sslEnabled), l(onPageLoaded, onSslError, onDownloadFile, onBackAction, onFileChooser), null, ((w43.a.C5526a) loadWebData).getUrl(), null, 20, null);
        }
        if (!(loadWebData instanceof w43.a.b)) {
            return null;
        }
        w43.a.b bVar = (w43.a.b) loadWebData;
        return new w70.c.Post(m(sslEnabled), l(onPageLoaded, onSslError, onDownloadFile, onBackAction, onFileChooser), null, bVar.getUrl(), bVar.getPostData(), 4, null);
    }

    private final c l(p<? super String, ? super b0, i0> onPageLoadedFinished, er.a<i0> onSslError, l<? super DownloadFileData, i0> onDownloadFile, er.a<i0> onBackAction, l<? super ValueCallback<Uri[]>, i0> onFileChooser) {
        return new c(onPageLoadedFinished, onSslError, onDownloadFile, onBackAction, onFileChooser);
    }

    private final w70.p m(boolean sslEnabled) {
        return new d(sslEnabled);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a53.c.a b(Params params) {
        a53.b state = params.getState();
        if (state instanceof a53.b.Initial) {
            return new a53.c.a.WebView(e(params), null, this.labelProvider.c(q43.a.f164718b), params.a());
        }
        if (state instanceof a53.b.WebView) {
            final w70.c cVarI = i(((a53.b.WebView) params.getState()).getLoadWebData(), params.d(), params.b(), params.a(), params.e(), ((a53.b.WebView) params.getState()).getSslEnabled(), params.c());
            return new a53.c.a.WebView(e(params), cVarI, this.labelProvider.c(q43.a.f164718b), new er.a() { // from class: b53.a
                @Override // er.a
                public final Object a() {
                    return b.h(cVarI);
                }
            });
        }
        if (state instanceof a53.b.Error) {
            return new a53.c.a.Error(((a53.b.Error) params.getState()).getErrorVMS());
        }
        throw new oq.p();
    }
}
