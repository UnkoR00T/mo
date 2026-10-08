package h8;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k1 extends t7.x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f81622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ak.n0<o8.p0> f81623d;

    public k1(String str, Uri uri, List<? extends o8.p0> list) {
        super(str, null, false, 1);
        this.f81622c = uri;
        this.f81623d = ak.n0.v(list);
    }

    @Override // t7.x, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.f81623d.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + this.f81623d;
    }
}
