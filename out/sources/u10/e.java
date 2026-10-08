package u10;

import android.text.Spanned;
import fu.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu10/e;", "Lu10/d;", "Lu10/b;", "htmlParser", "<init>", "(Lu10/b;)V", "", "text", "Landroid/text/Spanned;", "parse", "(Ljava/lang/String;)Landroid/text/Spanned;", "a", "Lu10/b;", "textformatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b htmlParser;

    public e(b bVar) {
        this.htmlParser = bVar;
    }

    @Override // u10.a
    public Spanned parse(String text) {
        dw.a aVar = new dw.a(false, false, 3, null);
        return this.htmlParser.parse(r.P(r.P(p053fw.g.f(new p053fw.g(text, new iw.e(aVar).a(text), aVar, false, 8, null), null, 1, null), "<li>", "<li>- ", false, 4, null), "\n", "<br>", false, 4, null));
    }
}
