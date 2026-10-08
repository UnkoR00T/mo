package zz0;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import bz.DownloadFileData;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import w70.n;
import w70.p;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yz0.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lzz0/c;", "Lxw/f;", "Lzz0/c$a;", "Lyz0/g$a;", "<init>", "()V", "params", "c", "(Lzz0/c$a;)Lyz0/g$a;", "a", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, g.a> {

    /* JADX INFO: renamed from: zz0.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lzz0/c$a;", "", "Lyz0/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "onSslError", "<init>", "(Lyz0/f;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyz0/f;", "d", "()Lyz0/f;", "b", "Ler/a;", "()Ler/a;", "c", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final yz0.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSslError;

        public Params(yz0.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = fVar;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.onSslError = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onSslError;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final yz0.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onSslError, params.onSslError);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onSslError.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onSslError=" + this.onSslError + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f238564a;

        static {
            int[] iArr = new int[a01.a.values().length];
            try {
                iArr[a01.a.GLOBAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a01.a.LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f238564a = iArr;
        }
    }

    /* JADX INFO: renamed from: zz0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"zz0/c$c", "Lw70/p;", "", "g", "()Z", "b", "a", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C6449c implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yz0.f f238565a;

        C6449c(yz0.f fVar) {
            this.f238565a = fVar;
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a */
        public boolean getF163107a() {
            return ((yz0.f.Ready) this.f238565a).getIsSslEnabled();
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

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"zz0/c$d", "Lw70/n;", "", "scheme", "Landroid/net/Uri;", "url", "Loq/i0;", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "Lkotlin/Function1;", "execute", "N7", "(Ljava/lang/String;Ler/l;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Params f238566a;

        d(Params params) {
            this.f238566a = params;
        }

        @Override // w70.n
        public /* bridge */ void M1(String str, boolean z15, er.a<i0> aVar) {
            super.M1(str, z15, aVar);
        }

        @Override // w70.n
        public void N7(String url, l<? super String, i0> execute) {
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
            this.f238566a.c().a();
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

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        er.a<i0> aVarB;
        yz0.f state = params.getState();
        if (t.c(state, yz0.f.b.f230868a)) {
            return g.a.b.f230873a;
        }
        if (t.c(state, yz0.f.a.f230867a)) {
            return g.a.C6206a.f230872a;
        }
        if (!(state instanceof yz0.f.Ready)) {
            throw new oq.p();
        }
        NavigationButtonData.a.Icon iconA = NavigationButtonData.a.Icon.INSTANCE.a();
        yz0.f.Ready ready = (yz0.f.Ready) state;
        int i15 = b.f238564a[ready.getRedirection().ordinal()];
        if (i15 == 1) {
            aVarB = params.b();
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            aVarB = params.a();
        }
        return new g.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(iconA, aVarB), mx.b.b(ready.getApplicationData().getTitle(), "ScreenTitle"), null, null, null, 28, null), null, null, null, null, 61, null), new w70.c.Url(new C6449c(state), new d(params), null, ready.getApplicationData().getUrl(), null, 20, null));
    }
}
