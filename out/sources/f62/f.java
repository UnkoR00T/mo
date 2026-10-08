package f62;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import androidx.compose.ui.graphics.Color;
import bz.DownloadFileData;
import h30.ButtonData;
import i30.ButtonIconData;
import iy.b0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf62/f;", "Lxw/f;", "Lf62/f$a;", "Lf62/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lf62/f$a;)Lf62/e$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f62.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lf62/f$a;", "", "Lf62/d;", "state", "Lkotlin/Function1;", "Landroid/net/Uri;", "Loq/i0;", "onResponseReceived", "Lkotlin/Function0;", "backAction", "onSslError", "<init>", "(Lf62/d;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf62/d;", "d", "()Lf62/d;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final f62.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Uri, i0> onResponseReceived;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSslError;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(f62.d dVar, er.l<? super Uri, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = dVar;
            this.onResponseReceived = lVar;
            this.backAction = aVar;
            this.onSslError = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.l<Uri, i0> b() {
            return this.onResponseReceived;
        }

        public final er.a<i0> c() {
            return this.onSslError;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final f62.d getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onResponseReceived, params.onResponseReceived) && fr.t.c(this.backAction, params.backAction) && fr.t.c(this.onSslError, params.onSslError);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onResponseReceived.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.onSslError.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onResponseReceived=" + this.onResponseReceived + ", backAction=" + this.backAction + ", onSslError=" + this.onSslError + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"f62/f$b", "Lw70/p;", "", "b", "()Z", "a", "", "c", "()I", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements w70.p {
        b() {
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a */
        public boolean getF177789a() {
            return true;
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
        public /* bridge */ String getF177790b() {
            return super.getF177790b();
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
        public /* bridge */ boolean g() {
            return super.g();
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

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"f62/f$c", "Lw70/n;", "Landroid/net/Uri;", "url", "Loq/i0;", "z7", "(Landroid/net/Uri;)V", "", "scheme", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "", "canGoBack", "Lkotlin/Function0;", "goBack", "M1", "(Ljava/lang/String;ZLer/a;)V", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements w70.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Params f59452a;

        c(Params params) {
            this.f59452a = params;
        }

        @Override // w70.n
        public void M1(String url, boolean canGoBack, er.a<i0> goBack) {
            if (canGoBack) {
                goBack.a();
            } else {
                this.f59452a.a().a();
            }
        }

        @Override // w70.n
        public /* bridge */ void N7(String str, er.l<? super String, i0> lVar) {
            super.N7(str, lVar);
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
        }

        @Override // w70.n
        public void f6(String url, int primaryError, SslCertificate certificate) {
            this.f59452a.c().a();
        }

        @Override // w70.n
        public /* bridge */ void n1(String str, b0 b0Var, String str2) {
            super.n1(str, b0Var, str2);
        }

        @Override // w70.n
        public void z7(Uri url) {
            this.f59452a.b().b(url);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f59453a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1128589547);
            if (p076m2.t.k()) {
                p076m2.t.o(1128589547, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.addcard.PaymentsAddCardMapper.invoke.<anonymous> (PaymentsAddCardMapper.kt:87)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        f62.d state = params.getState();
        if (fr.t.c(state, f62.d.a.f59431a)) {
            return e.a.b.f59440a;
        }
        if (state instanceof f62.d.WebView) {
            f62.d.WebView webView = (f62.d.WebView) state;
            return new e.a.WebView(new w70.c.Post(new b(), new c(params), null, webView.getBaseUrl(), webView.getBody(), 4, null), params.a());
        }
        if (fr.t.c(state, f62.d.C1336d.f59438a)) {
            return e.a.C1337a.f59439a;
        }
        if (!fr.t.c(state, f62.d.b.f59432a)) {
            throw new oq.p();
        }
        return new e.a.ResultPending(new IconPageData(q40.j.b.C4090b.f164686d, this.labelProvider.c(t32.b.f187484q), this.labelProvider.c(t32.b.Q0), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t32.b.L0), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), true, 8, null), params.a(), new ButtonIconData(null, jz.a.Y, d.f59453a, null, null, params.a(), 25, null));
    }
}
