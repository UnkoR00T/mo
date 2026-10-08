package y1;

import n3.m2;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0011\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Ly1/n;", "", "Le4/b0;", "layoutCoordinates", "Lq4/t3;", "textLayoutResult", "<init>", "(Le4/b0;Lq4/t3;)V", "", "start", "end", "Ln3/m2;", "e", "(II)Ln3/m2;", "b", "(Le4/b0;Lq4/t3;)Ly1/n;", "a", "Le4/b0;", "d", "()Le4/b0;", "Lq4/t3;", "g", "()Lq4/t3;", "", "f", "()Z", "shouldClip", "c", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f223123d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final n f223124e = new n(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p036e4.b0 layoutCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: y1.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly1/n$a;", "", "<init>", "()V", "Ly1/n;", "Empty", "Ly1/n;", "a", "()Ly1/n;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final n a() {
            return n.f223124e;
        }

        private Companion() {
        }
    }

    public n(p036e4.b0 b0Var, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = b0Var;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ n c(n nVar, p036e4.b0 b0Var, TextLayoutResult textLayoutResult, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i15 & 1) != 0) {
            b0Var = nVar.layoutCoordinates;
        }
        if ((i15 & 2) != 0) {
            textLayoutResult = nVar.textLayoutResult;
        }
        return nVar.b(b0Var, textLayoutResult);
    }

    public final n b(p036e4.b0 layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new n(layoutCoordinates, textLayoutResult);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p036e4.b0 getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public m2 e(int start, int end) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.z(start, end);
        }
        return null;
    }

    public boolean f() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || b5.v.g(textLayoutResult.getLayoutInput().getOverflow(), b5.v.INSTANCE.e()) || !textLayoutResult.i()) ? false : true;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
