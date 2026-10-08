package r10;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.URLUtil;
import bz.DownloadFileData;
import dx.i;
import dx.j;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lr10/b;", "Laz/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lbz/a;", "downloadFileData", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lbz/a;)Ldx/i;", "Landroid/content/Context;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements az.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public b(Context context) {
        this.context = context;
    }

    @Override // az.b
    public i<dx.b, i0> a(DownloadFileData downloadFileData) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(downloadFileData.getUrl()));
                    String cookie = downloadFileData.getCookie();
                    if (cookie != null) {
                        request.addRequestHeader("Cookie", cookie);
                    }
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(downloadFileData.getUrl(), downloadFileData.getContentDisposition(), downloadFileData.getMimeType()));
                    ((DownloadManager) this.context.getSystemService("download")).enqueue(request);
                    i0 i0Var = i0.f148189a;
                    new i.Right(i0Var);
                    return new i.Right(i0Var);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }
}
