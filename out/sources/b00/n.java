package b00;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import p071kotlin.Metadata;
import p087nuL.b0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lb00/n;", "Loz/b;", "LNUl/k;", "", "Landroid/net/Uri;", "Lb00/l;", "Lb00/m;", "<init>", "()V", "Lb00/j;", "mediaType", "", "maxItems", "b", "(Lb00/j;ILtq/e;)Ljava/lang/Object;", "", "k", "()Z", "LnuL/b0;", "d", "LnuL/b0;", "r", "()LnuL/b0;", "contract", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends oz.b<p006NUl.k, List<? extends Uri>> implements l, m {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b0<p006NUl.k, List<Uri>> contract = new r(2);

    @Override // b00.l
    public Object b(j jVar, int i15, tq.e<? super List<? extends Uri>> eVar) {
        ((r) r()).g(i15);
        return s(k.a(jVar), eVar);
    }

    @Override // b00.l
    @SuppressLint({"AnnotateVersionCheck"})
    public boolean k() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // oz.b
    public b0<p006NUl.k, List<? extends Uri>> r() {
        return this.contract;
    }
}
