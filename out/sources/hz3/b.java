package hz3;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import bz.DownloadFileData;
import er.l;
import gz3.i;
import gz3.j;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import w70.n;
import w70.p;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhz3/b;", "Lhz3/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz3/a$a;", "params", "Lgz3/j$a;", "c", "(Lhz3/a$a;)Lgz3/j$a;", "a", "Lmx/c;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements hz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"hz3/b$a", "Lw70/p;", "", "g", "()Z", "b", "a", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements p {
        a() {
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a */
        public boolean getF163107a() {
            return true;
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
        public /* bridge */ boolean h() {
            return super.h();
        }

        @Override // w70.p
        public /* bridge */ boolean i() {
            return super.i();
        }

        @Override // w70.p
        public /* bridge */ p.a j() {
            return super.j();
        }
    }

    /* JADX INFO: renamed from: hz3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"hz3/b$b", "Lw70/n;", "", "scheme", "Landroid/net/Uri;", "url", "Loq/i0;", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2045b implements n {
        C2045b() {
        }

        @Override // w70.n
        public /* bridge */ void M1(String str, boolean z15, er.a<i0> aVar) {
            super.M1(str, z15, aVar);
        }

        @Override // w70.n
        public /* bridge */ void N7(String str, l<? super String, i0> lVar) {
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"hz3/b$c", "Lw70/p;", "", "g", "()Z", "b", "a", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements p {
        c() {
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a */
        public boolean getF163107a() {
            return true;
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
        public /* bridge */ boolean h() {
            return super.h();
        }

        @Override // w70.p
        public /* bridge */ boolean i() {
            return super.i();
        }

        @Override // w70.p
        public /* bridge */ p.a j() {
            return super.j();
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"hz3/b$d", "Lw70/n;", "", "scheme", "Landroid/net/Uri;", "url", "Loq/i0;", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements n {
        d() {
        }

        @Override // w70.n
        public /* bridge */ void M1(String str, boolean z15, er.a<i0> aVar) {
            super.M1(str, z15, aVar);
        }

        @Override // w70.n
        public /* bridge */ void N7(String str, l<? super String, i0> lVar) {
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"hz3/b$e", "Lw70/p;", "", "g", "()Z", "b", "a", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements p {
        e() {
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a */
        public boolean getF163107a() {
            return true;
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
        public /* bridge */ boolean h() {
            return super.h();
        }

        @Override // w70.p
        public /* bridge */ boolean i() {
            return super.i();
        }

        @Override // w70.p
        public /* bridge */ p.a j() {
            return super.j();
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"hz3/b$f", "Lw70/n;", "", "url", "Liy/b0;", "content", "title", "Loq/i0;", "n1", "(Ljava/lang/String;Liy/b0;Ljava/lang/String;)V", "scheme", "Landroid/net/Uri;", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ hz3.a.Params f86954a;

        f(hz3.a.Params params) {
            this.f86954a = params;
        }

        @Override // w70.n
        public /* bridge */ void M1(String str, boolean z15, er.a<i0> aVar) {
            super.M1(str, z15, aVar);
        }

        @Override // w70.n
        public /* bridge */ void N7(String str, l<? super String, i0> lVar) {
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
        }

        @Override // w70.n
        public void n1(String url, b0 content, String title) {
            super.n1(url, content, title);
            l<Boolean, i0> lVarC = this.f86954a.c();
            boolean z15 = false;
            if (title != null && title.length() > 0) {
                z15 = true;
            }
            lVarC.b(Boolean.valueOf(z15));
        }

        @Override // w70.n
        public /* bridge */ void z7(Uri uri) {
            super.z7(uri);
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j.Data b(hz3.a.Params params) {
        i state = params.getState();
        int i15 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!(state instanceof i.a)) {
            if (state instanceof i.Text) {
                return new j.Data(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(dz3.a.f45695d), null, null, null, 28, null), null, null, null, null, 61, null), new w70.c.HtmlData(new c(), new d(), v.n(), ((i.Text) params.getState()).getText(), null, null, null, null, 240, null), null, null, null);
            }
            if (state instanceof i.PDF) {
                return new j.Data(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(dz3.a.f45695d), null, null, null, 28, null), null, null, null, null, 61, null), new w70.c.Url(new e(), new f(params), null, ((i.PDF) params.getState()).getUrl(), null, 20, null), null, ((i.PDF) params.getState()).getFailedLoading() ? new j.LoadDataError(((i.PDF) params.getState()).getErrorTitle(), ((i.PDF) params.getState()).getErrorDescription(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(dz3.a.f45696e), this.labelProvider.c(dz3.a.f45696e)), k30.d.a.f107773a, null, params.d(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(((i.PDF) params.getState()).getErrorButtonLabel(), ((i.PDF) params.getState()).getErrorButtonLabel()), new k30.d.Secondary(objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0), null, params.a(), 35, null)) : null, null);
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(dz3.a.f45695d), null, null, null, 28, null), null, null, null, null, 61, null);
        w70.c.HtmlData htmlData = new w70.c.HtmlData(new a(), new C2045b(), v.n(), ((i.a) params.getState()).getByteArrayOutputStream().toString(), null, null, null, null, 240, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(dz3.a.f45692a), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null);
        i state2 = params.getState();
        i.a.Dialog dialog = state2 instanceof i.a.Dialog ? (i.a.Dialog) state2 : null;
        return new j.Data(baseScaffoldData, htmlData, buttonData, null, dialog != null ? dialog.getDialogVmsAdapter() : null);
    }
}
