package w70;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import bz.DownloadFileData;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&J#\u0010*\u001a\u00020\u00072\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0(0'H\u0016¢\u0006\u0004\b*\u0010+¨\u0006,À\u0006\u0003"}, d2 = {"Lw70/n;", "", "", "url", "Liy/b0;", "content", "title", "Loq/i0;", "n1", "(Ljava/lang/String;Liy/b0;Ljava/lang/String;)V", "Landroid/net/Uri;", "z7", "(Landroid/net/Uri;)V", "scheme", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "Lkotlin/Function1;", "execute", "N7", "(Ljava/lang/String;Ler/l;)V", "Lbz/a;", "data", "O1", "(Lbz/a;)V", "", "canGoBack", "Lkotlin/Function0;", "goBack", "M1", "(Ljava/lang/String;ZLer/a;)V", "statusCode", "R2", "(I)V", "Landroid/webkit/ValueCallback;", "", "filePickerRequested", "b8", "(Landroid/webkit/ValueCallback;)V", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n {
    default void M1(String url, boolean canGoBack, er.a<i0> goBack) {
    }

    default void N7(String url, er.l<? super String, i0> execute) {
    }

    default void O1(DownloadFileData data) {
    }

    default void R2(int statusCode) {
    }

    default void b8(ValueCallback<Uri[]> filePickerRequested) {
    }

    void c2(String scheme, Uri url);

    void f6(String url, int primaryError, SslCertificate certificate);

    default void n1(String url, b0 content, String title) {
    }

    default void z7(Uri url) {
    }
}
