package dx0;

import fu.r;
import iy.b0;
import iy.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ldx0/i;", "Lax0/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lax0/b$b;", "params", "Ldx/i;", "Ldx/b;", "Liy/b0;", "d", "(Lax0/b$b;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "a", "Ldx/b$c;", "error", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements ax0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45204b = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business error;

    public i(mx.c cVar) {
        this.error = new dx.b.Business(ax0.b.a.C0337a.f14873a, null, cVar.c(yw0.a.f229996y), null, null, cVar.c(yw0.a.L), null, 90, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(ax0.b.Params params, tq.e<? super dx.i<? extends dx.b, b0>> eVar) {
        String strE = c0.e(params.getSamlArtHtmlContent());
        Matcher matcher = Pattern.compile("value=\\\\\"(\\S+)\\\\\"").matcher(strE);
        if (!r.t0(strE) && matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                strGroup = "";
            }
            return new dx.i.Right(c0.g(strGroup));
        }
        return new dx.i.Left(this.error);
    }
}
